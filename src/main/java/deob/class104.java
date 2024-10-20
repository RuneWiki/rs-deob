package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cn")
public final class class104 {

    @ObfuscatedName("cn.d")
    public RandomAccessFile field1547;

    @ObfuscatedName("cn.q")
    public long field1546;

    @ObfuscatedName("cn.x")
    public long field1548;

    public class104(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1547 = new RandomAccessFile(arg0, arg1);
        this.field1546 = arg2;
        this.field1548 = 0L;
        int var5 = this.field1547.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1547.seek(0L);
            this.field1547.write(var5);
        }
        this.field1547.seek(0L);
    }

    @ObfuscatedName("cn.d(J)V")
    public final void method1767(long arg0) throws IOException {
        this.field1547.seek(arg0);
        this.field1548 = arg0;
    }

    @ObfuscatedName("cn.q([BIIS)V")
    public final void method1760(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1548 + (long) arg2 > this.field1546) {
            this.field1547.seek(this.field1546 + 1L);
            this.field1547.write(1);
            throw new EOFException();
        } else {
            this.field1547.write(arg0, arg1, arg2);
            this.field1548 += (long) arg2;
        }
    }

    @ObfuscatedName("cn.x(B)V")
    public final void method1762() throws IOException {
        if (this.field1547 != null) {
            this.field1547.close();
            this.field1547 = null;
        }
    }

    @ObfuscatedName("cn.y(I)J")
    public final long method1758() throws IOException {
        return this.field1547.length();
    }

    @ObfuscatedName("cn.e([BIII)I")
    public final int method1759(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1547.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1548 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1547 != null) {
            System.out.println("");
            this.method1762();
        }
    }
}
