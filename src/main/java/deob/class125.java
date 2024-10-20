package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dx")
public final class class125 {

    @ObfuscatedName("dx.c")
    public RandomAccessFile field1729;

    @ObfuscatedName("dx.o")
    public long field1733;

    @ObfuscatedName("dx.i")
    public long field1730;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1729 = new RandomAccessFile(arg0, arg1);
        this.field1733 = arg2;
        this.field1730 = 0L;
        int var5 = this.field1729.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1729.seek(0L);
            this.field1729.write(var5);
        }
        this.field1729.seek(0L);
    }

    @ObfuscatedName("dx.c(J)V")
    public final void method2091(long arg0) throws IOException {
        this.field1729.seek(arg0);
        this.field1730 = arg0;
    }

    @ObfuscatedName("dx.o([BIII)V")
    public final void method2093(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1730 + (long) arg2 > this.field1733) {
            this.field1729.seek(this.field1733 + 1L);
            this.field1729.write(1);
            throw new EOFException();
        } else {
            this.field1729.write(arg0, arg1, arg2);
            this.field1730 += (long) arg2;
        }
    }

    @ObfuscatedName("dx.i(I)V")
    public final void method2094() throws IOException {
        if (this.field1729 != null) {
            this.field1729.close();
            this.field1729 = null;
        }
    }

    @ObfuscatedName("dx.u(B)J")
    public final long method2105() throws IOException {
        return this.field1729.length();
    }

    @ObfuscatedName("dx.g([BIII)I")
    public final int method2095(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1729.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1730 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1729 != null) {
            System.out.println("");
            this.method2094();
        }
    }
}
