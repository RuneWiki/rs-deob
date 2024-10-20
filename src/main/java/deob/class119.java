package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dk")
public final class class119 {

    @ObfuscatedName("dk.m")
    public RandomAccessFile field1497;

    @ObfuscatedName("dk.f")
    public long field1501;

    @ObfuscatedName("dk.q")
    public long field1499;

    public class119(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1497 = new RandomAccessFile(arg0, arg1);
        this.field1501 = arg2;
        this.field1499 = 0L;
        int var5 = this.field1497.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1497.seek(0L);
            this.field1497.write(var5);
        }
        this.field1497.seek(0L);
    }

    @ObfuscatedName("dk.m(J)V")
    public final void method2472(long arg0) throws IOException {
        this.field1497.seek(arg0);
        this.field1499 = arg0;
    }

    @ObfuscatedName("dk.f([BIIB)V")
    public final void method2473(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1499 + (long) arg2 > this.field1501) {
            this.field1497.seek(this.field1501 + 1L);
            this.field1497.write(1);
            throw new EOFException();
        } else {
            this.field1497.write(arg0, arg1, arg2);
            this.field1499 += (long) arg2;
        }
    }

    @ObfuscatedName("dk.q(I)V")
    public final void method2474() throws IOException {
        this.method2481(false);
    }

    @ObfuscatedName("dk.w(ZI)V")
    public final void method2481(boolean arg0) throws IOException {
        if (this.field1497 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1497.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1497.close();
        this.field1497 = null;
    }

    @ObfuscatedName("dk.o(I)J")
    public final long method2476() throws IOException {
        return this.field1497.length();
    }

    @ObfuscatedName("dk.u([BIII)I")
    public final int method2477(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1497.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1499 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1497 != null) {
            System.out.println("");
            this.method2474();
        }
    }
}
