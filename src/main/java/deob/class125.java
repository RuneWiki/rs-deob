package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dv")
public final class class125 {

    @ObfuscatedName("dv.s")
    public RandomAccessFile field1764;

    @ObfuscatedName("dv.c")
    public long field1762;

    @ObfuscatedName("dv.f")
    public long field1763;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1764 = new RandomAccessFile(arg0, arg1);
        this.field1762 = arg2;
        this.field1763 = 0L;
        int var5 = this.field1764.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1764.seek(0L);
            this.field1764.write(var5);
        }
        this.field1764.seek(0L);
    }

    @ObfuscatedName("dv.s(J)V")
    public final void method2185(long arg0) throws IOException {
        this.field1764.seek(arg0);
        this.field1763 = arg0;
    }

    @ObfuscatedName("dv.c([BIII)V")
    public final void method2208(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1763 + (long) arg2 > this.field1762) {
            this.field1764.seek(this.field1762 + 1L);
            this.field1764.write(1);
            throw new EOFException();
        } else {
            this.field1764.write(arg0, arg1, arg2);
            this.field1763 += (long) arg2;
        }
    }

    @ObfuscatedName("dv.f(B)V")
    public final void method2184() throws IOException {
        if (this.field1764 != null) {
            this.field1764.close();
            this.field1764 = null;
        }
    }

    @ObfuscatedName("dv.m(I)J")
    public final long method2188() throws IOException {
        return this.field1764.length();
    }

    @ObfuscatedName("dv.h([BIII)I")
    public final int method2198(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1764.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1763 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1764 != null) {
            System.out.println("");
            this.method2184();
        }
    }
}
