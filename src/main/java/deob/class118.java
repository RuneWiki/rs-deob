package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dn")
public final class class118 {

    @ObfuscatedName("dn.n")
    public RandomAccessFile field1503;

    @ObfuscatedName("dn.h")
    public long field1498;

    @ObfuscatedName("dn.l")
    public long field1499;

    public class118(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1503 = new RandomAccessFile(arg0, arg1);
        this.field1498 = arg2;
        this.field1499 = 0L;
        int var5 = this.field1503.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1503.seek(0L);
            this.field1503.write(var5);
        }
        this.field1503.seek(0L);
    }

    @ObfuscatedName("dn.n(J)V")
    public final void method2519(long arg0) throws IOException {
        this.field1503.seek(arg0);
        this.field1499 = arg0;
    }

    @ObfuscatedName("dn.h([BIIS)V")
    public final void method2522(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1499 + (long) arg2 > this.field1498) {
            this.field1503.seek(this.field1498 + 1L);
            this.field1503.write(1);
            throw new EOFException();
        } else {
            this.field1503.write(arg0, arg1, arg2);
            this.field1499 += (long) arg2;
        }
    }

    @ObfuscatedName("dn.l(B)V")
    public final void method2518() throws IOException {
        this.method2536(false);
    }

    @ObfuscatedName("dn.g(ZI)V")
    public final void method2536(boolean arg0) throws IOException {
        if (this.field1503 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1503.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1503.close();
        this.field1503 = null;
    }

    @ObfuscatedName("dn.b(I)J")
    public final long method2523() throws IOException {
        return this.field1503.length();
    }

    @ObfuscatedName("dn.a([BIII)I")
    public final int method2520(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1503.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1499 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1503 != null) {
            System.out.println("");
            this.method2518();
        }
    }
}
