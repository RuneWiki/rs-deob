package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("v")
public final class class13 {

    @ObfuscatedName("v.t")
    public RandomAccessFile field201;

    @ObfuscatedName("v.n")
    public long field199;

    @ObfuscatedName("v.q")
    public long field200;

    public class13(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field201 = new RandomAccessFile(arg0, arg1);
        this.field199 = arg2;
        this.field200 = 0L;
        int var5 = this.field201.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field201.seek(0L);
            this.field201.write(var5);
        }
        this.field201.seek(0L);
    }

    @ObfuscatedName("v.t(J)V")
    public final void method115(long arg0) throws IOException {
        this.field201.seek(arg0);
        this.field200 = arg0;
    }

    @ObfuscatedName("v.n([BIII)V")
    public final void method125(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field200 + (long) arg2 > this.field199) {
            this.field201.seek(this.field199 + 1L);
            this.field201.write(1);
            throw new EOFException();
        } else {
            this.field201.write(arg0, arg1, arg2);
            this.field200 += (long) arg2;
        }
    }

    @ObfuscatedName("v.q(I)V")
    public final void method117() throws IOException {
        if (this.field201 != null) {
            this.field201.close();
            this.field201 = null;
        }
    }

    @ObfuscatedName("v.h(I)J")
    public final long method121() throws IOException {
        return this.field201.length();
    }

    @ObfuscatedName("v.k([BIII)I")
    public final int method118(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field201.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field200 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field201 != null) {
            System.out.println("");
            this.method117();
        }
    }
}
