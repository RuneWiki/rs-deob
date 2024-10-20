package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dd")
public final class class113 {

    @ObfuscatedName("dd.y")
    public RandomAccessFile field1485;

    @ObfuscatedName("dd.c")
    public long field1483;

    @ObfuscatedName("dd.n")
    public long field1484;

    public class113(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1485 = new RandomAccessFile(arg0, arg1);
        this.field1483 = arg2;
        this.field1484 = 0L;
        int var5 = this.field1485.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1485.seek(0L);
            this.field1485.write(var5);
        }
        this.field1485.seek(0L);
    }

    @ObfuscatedName("dd.y(J)V")
    public final void method2348(long arg0) throws IOException {
        this.field1485.seek(arg0);
        this.field1484 = arg0;
    }

    @ObfuscatedName("dd.c([BIIB)V")
    public final void method2324(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1484 + (long) arg2 > this.field1483) {
            this.field1485.seek(this.field1483 + 1L);
            this.field1485.write(1);
            throw new EOFException();
        } else {
            this.field1485.write(arg0, arg1, arg2);
            this.field1484 += (long) arg2;
        }
    }

    @ObfuscatedName("dd.n(I)V")
    public final void method2331() throws IOException {
        this.method2338(false);
    }

    @ObfuscatedName("dd.u(ZI)V")
    public final void method2338(boolean arg0) throws IOException {
        if (this.field1485 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1485.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1485.close();
        this.field1485 = null;
    }

    @ObfuscatedName("dd.i(I)J")
    public final long method2327() throws IOException {
        return this.field1485.length();
    }

    @ObfuscatedName("dd.p([BIII)I")
    public final int method2328(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1485.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1484 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1485 != null) {
            System.out.println("");
            this.method2331();
        }
    }
}
