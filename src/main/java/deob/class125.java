package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dw")
public final class class125 {

    @ObfuscatedName("dw.w")
    public RandomAccessFile field1768;

    @ObfuscatedName("dw.o")
    public long field1772;

    @ObfuscatedName("dw.x")
    public long field1770;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1768 = new RandomAccessFile(arg0, arg1);
        this.field1772 = arg2;
        this.field1770 = 0L;
        int var5 = this.field1768.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1768.seek(0L);
            this.field1768.write(var5);
        }
        this.field1768.seek(0L);
    }

    @ObfuscatedName("dw.w(J)V")
    public final void method2118(long arg0) throws IOException {
        this.field1768.seek(arg0);
        this.field1770 = arg0;
    }

    @ObfuscatedName("dw.o([BIII)V")
    public final void method2112(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1770 + (long) arg2 > this.field1772) {
            this.field1768.seek(this.field1772 + 1L);
            this.field1768.write(1);
            throw new EOFException();
        } else {
            this.field1768.write(arg0, arg1, arg2);
            this.field1770 += (long) arg2;
        }
    }

    @ObfuscatedName("dw.x(I)V")
    public final void method2113() throws IOException {
        if (this.field1768 != null) {
            this.field1768.close();
            this.field1768 = null;
        }
    }

    @ObfuscatedName("dw.k(I)J")
    public final long method2114() throws IOException {
        return this.field1768.length();
    }

    @ObfuscatedName("dw.f([BIII)I")
    public final int method2115(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1768.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1770 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1768 != null) {
            System.out.println("");
            this.method2113();
        }
    }
}
