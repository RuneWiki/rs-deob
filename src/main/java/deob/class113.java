package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dv")
public final class class113 {

    @ObfuscatedName("dv.v")
    public RandomAccessFile field1483;

    @ObfuscatedName("dv.s")
    public long field1488;

    @ObfuscatedName("dv.o")
    public long field1484;

    public class113(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1483 = new RandomAccessFile(arg0, arg1);
        this.field1488 = arg2;
        this.field1484 = 0L;
        int var5 = this.field1483.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1483.seek(0L);
            this.field1483.write(var5);
        }
        this.field1483.seek(0L);
    }

    @ObfuscatedName("dv.v(J)V")
    public final void method2328(long arg0) throws IOException {
        this.field1483.seek(arg0);
        this.field1484 = arg0;
    }

    @ObfuscatedName("dv.s([BIIB)V")
    public final void method2333(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1484 + (long) arg2 > this.field1488) {
            this.field1483.seek(this.field1488 + 1L);
            this.field1483.write(1);
            throw new EOFException();
        } else {
            this.field1483.write(arg0, arg1, arg2);
            this.field1484 += (long) arg2;
        }
    }

    @ObfuscatedName("dv.o(I)V")
    public final void method2326() throws IOException {
        this.method2327(false);
    }

    @ObfuscatedName("dv.k(ZI)V")
    public final void method2327(boolean arg0) throws IOException {
        if (this.field1483 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1483.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1483.close();
        this.field1483 = null;
    }

    @ObfuscatedName("dv.u(I)J")
    public final long method2324() throws IOException {
        return this.field1483.length();
    }

    @ObfuscatedName("dv.i([BIII)I")
    public final int method2329(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1483.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1484 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1483 != null) {
            System.out.println("");
            this.method2326();
        }
    }
}
