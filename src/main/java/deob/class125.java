package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dz")
public final class class125 {

    @ObfuscatedName("dz.i")
    public RandomAccessFile field1780;

    @ObfuscatedName("dz.c")
    public long field1786;

    @ObfuscatedName("dz.e")
    public long field1782;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1780 = new RandomAccessFile(arg0, arg1);
        this.field1786 = arg2;
        this.field1782 = 0L;
        int var5 = this.field1780.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1780.seek(0L);
            this.field1780.write(var5);
        }
        this.field1780.seek(0L);
    }

    @ObfuscatedName("dz.i(J)V")
    public final void method2141(long arg0) throws IOException {
        this.field1780.seek(arg0);
        this.field1782 = arg0;
    }

    @ObfuscatedName("dz.c([BIII)V")
    public final void method2145(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1782 + (long) arg2 > this.field1786) {
            this.field1780.seek(this.field1786 + 1L);
            this.field1780.write(1);
            throw new EOFException();
        } else {
            this.field1780.write(arg0, arg1, arg2);
            this.field1782 += (long) arg2;
        }
    }

    @ObfuscatedName("dz.e(I)V")
    public final void method2129() throws IOException {
        if (this.field1780 != null) {
            this.field1780.close();
            this.field1780 = null;
        }
    }

    @ObfuscatedName("dz.v(I)J")
    public final long method2125() throws IOException {
        return this.field1780.length();
    }

    @ObfuscatedName("dz.b([BIII)I")
    public final int method2124(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1780.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1782 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1780 != null) {
            System.out.println("");
            this.method2129();
        }
    }
}
