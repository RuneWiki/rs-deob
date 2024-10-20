package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("di")
public final class class125 {

    @ObfuscatedName("di.e")
    public RandomAccessFile field1767;

    @ObfuscatedName("di.o")
    public long field1769;

    @ObfuscatedName("di.m")
    public long field1768;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1767 = new RandomAccessFile(arg0, arg1);
        this.field1769 = arg2;
        this.field1768 = 0L;
        int var5 = this.field1767.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1767.seek(0L);
            this.field1767.write(var5);
        }
        this.field1767.seek(0L);
    }

    @ObfuscatedName("di.e(J)V")
    public final void method2137(long arg0) throws IOException {
        this.field1767.seek(arg0);
        this.field1768 = arg0;
    }

    @ObfuscatedName("di.o([BIII)V")
    public final void method2135(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1768 + (long) arg2 > this.field1769) {
            this.field1767.seek(this.field1769 + 1L);
            this.field1767.write(1);
            throw new EOFException();
        } else {
            this.field1767.write(arg0, arg1, arg2);
            this.field1768 += (long) arg2;
        }
    }

    @ObfuscatedName("di.m(B)V")
    public final void method2145() throws IOException {
        if (this.field1767 != null) {
            this.field1767.close();
            this.field1767 = null;
        }
    }

    @ObfuscatedName("di.g(I)J")
    public final long method2139() throws IOException {
        return this.field1767.length();
    }

    @ObfuscatedName("di.d([BIII)I")
    public final int method2140(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1767.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1768 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1767 != null) {
            System.out.println("");
            this.method2145();
        }
    }
}
