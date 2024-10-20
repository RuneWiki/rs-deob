package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("s")
public final class class13 {

    @ObfuscatedName("s.q")
    public RandomAccessFile field204;

    @ObfuscatedName("s.l")
    public long field202;

    @ObfuscatedName("s.a")
    public long field203;

    public class13(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field204 = new RandomAccessFile(arg0, arg1);
        this.field202 = arg2;
        this.field203 = 0L;
        int var5 = this.field204.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field204.seek(0L);
            this.field204.write(var5);
        }
        this.field204.seek(0L);
    }

    @ObfuscatedName("s.q(J)V")
    public final void method103(long arg0) throws IOException {
        this.field204.seek(arg0);
        this.field203 = arg0;
    }

    @ObfuscatedName("s.l([BIII)V")
    public final void method102(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field203 + (long) arg2 > this.field202) {
            this.field204.seek(this.field202 + 1L);
            this.field204.write(1);
            throw new EOFException();
        } else {
            this.field204.write(arg0, arg1, arg2);
            this.field203 += (long) arg2;
        }
    }

    @ObfuscatedName("s.a(I)V")
    public final void method105() throws IOException {
        if (this.field204 != null) {
            this.field204.close();
            this.field204 = null;
        }
    }

    @ObfuscatedName("s.o(B)J")
    public final long method106() throws IOException {
        return this.field204.length();
    }

    @ObfuscatedName("s.c([BIIB)I")
    public final int method107(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field204.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field203 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field204 != null) {
            System.out.println("");
            this.method105();
        }
    }
}
