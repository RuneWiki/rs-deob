package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dn")
public final class class113 {

    @ObfuscatedName("dn.g")
    public RandomAccessFile field1496;

    @ObfuscatedName("dn.r")
    public long field1495;

    @ObfuscatedName("dn.e")
    public long field1494;

    public class113(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1496 = new RandomAccessFile(arg0, arg1);
        this.field1495 = arg2;
        this.field1494 = 0L;
        int var5 = this.field1496.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1496.seek(0L);
            this.field1496.write(var5);
        }
        this.field1496.seek(0L);
    }

    @ObfuscatedName("dn.g(J)V")
    public final void method2516(long arg0) throws IOException {
        this.field1496.seek(arg0);
        this.field1494 = arg0;
    }

    @ObfuscatedName("dn.r([BIII)V")
    public final void method2514(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1494 + (long) arg2 > this.field1495) {
            this.field1496.seek(this.field1495 + 1L);
            this.field1496.write(1);
            throw new EOFException();
        } else {
            this.field1496.write(arg0, arg1, arg2);
            this.field1494 += (long) arg2;
        }
    }

    @ObfuscatedName("dn.e(I)V")
    public final void method2515() throws IOException {
        this.method2538(false);
    }

    @ObfuscatedName("dn.q(ZI)V")
    public final void method2538(boolean arg0) throws IOException {
        if (this.field1496 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1496.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1496.close();
        this.field1496 = null;
    }

    @ObfuscatedName("dn.c(I)J")
    public final long method2517() throws IOException {
        return this.field1496.length();
    }

    @ObfuscatedName("dn.i([BIII)I")
    public final int method2518(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1496.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1494 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1496 != null) {
            System.out.println("");
            this.method2515();
        }
    }
}
