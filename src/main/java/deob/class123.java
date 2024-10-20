package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dp")
public final class class123 {

    @ObfuscatedName("dp.c")
    public RandomAccessFile field1689;

    @ObfuscatedName("dp.i")
    public long field1690;

    @ObfuscatedName("dp.o")
    public long field1688;

    public class123(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1689 = new RandomAccessFile(arg0, arg1);
        this.field1690 = arg2;
        this.field1688 = 0L;
        int var5 = this.field1689.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1689.seek(0L);
            this.field1689.write(var5);
        }
        this.field1689.seek(0L);
    }

    @ObfuscatedName("dp.c(J)V")
    public final void method2321(long arg0) throws IOException {
        this.field1689.seek(arg0);
        this.field1688 = arg0;
    }

    @ObfuscatedName("dp.i([BIII)V")
    public final void method2322(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1688 + (long) arg2 > this.field1690) {
            this.field1689.seek(this.field1690 + 1L);
            this.field1689.write(1);
            throw new EOFException();
        } else {
            this.field1689.write(arg0, arg1, arg2);
            this.field1688 += (long) arg2;
        }
    }

    @ObfuscatedName("dp.o(B)V")
    public final void method2323() throws IOException {
        this.method2327(false);
    }

    @ObfuscatedName("dp.j(ZI)V")
    public final void method2327(boolean arg0) throws IOException {
        if (this.field1689 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1689.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1689.close();
        this.field1689 = null;
    }

    @ObfuscatedName("dp.k(I)J")
    public final long method2325() throws IOException {
        return this.field1689.length();
    }

    @ObfuscatedName("dp.x([BIIB)I")
    public final int method2326(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1689.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1688 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1689 != null) {
            System.out.println("");
            this.method2323();
        }
    }
}
