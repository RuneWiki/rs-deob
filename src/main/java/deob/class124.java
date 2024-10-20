package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dj")
public final class class124 {

    @ObfuscatedName("dj.m")
    public RandomAccessFile field1687;

    @ObfuscatedName("dj.p")
    public long field1685;

    @ObfuscatedName("dj.i")
    public long field1686;

    public class124(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1687 = new RandomAccessFile(arg0, arg1);
        this.field1685 = arg2;
        this.field1686 = 0L;
        int var5 = this.field1687.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1687.seek(0L);
            this.field1687.write(var5);
        }
        this.field1687.seek(0L);
    }

    @ObfuscatedName("dj.m(J)V")
    public final void method2240(long arg0) throws IOException {
        this.field1687.seek(arg0);
        this.field1686 = arg0;
    }

    @ObfuscatedName("dj.p([BIII)V")
    public final void method2254(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1686 + (long) arg2 > this.field1685) {
            this.field1687.seek(this.field1685 + 1L);
            this.field1687.write(1);
            throw new EOFException();
        } else {
            this.field1687.write(arg0, arg1, arg2);
            this.field1686 += (long) arg2;
        }
    }

    @ObfuscatedName("dj.i(B)V")
    public final void method2243() throws IOException {
        this.method2244(false);
    }

    @ObfuscatedName("dj.j(ZI)V")
    public final void method2244(boolean arg0) throws IOException {
        if (this.field1687 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1687.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1687.close();
        this.field1687 = null;
    }

    @ObfuscatedName("dj.v(S)J")
    public final long method2260() throws IOException {
        return this.field1687.length();
    }

    @ObfuscatedName("dj.x([BIIB)I")
    public final int method2246(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1687.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1686 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1687 != null) {
            System.out.println("");
            this.method2243();
        }
    }
}
