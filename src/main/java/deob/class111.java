package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dw")
public final class class111 {

    @ObfuscatedName("dw.w")
    public RandomAccessFile field1462;

    @ObfuscatedName("dw.m")
    public long field1455;

    @ObfuscatedName("dw.q")
    public long field1457;

    public class111(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1462 = new RandomAccessFile(arg0, arg1);
        this.field1455 = arg2;
        this.field1457 = 0L;
        int var5 = this.field1462.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1462.seek(0L);
            this.field1462.write(var5);
        }
        this.field1462.seek(0L);
    }

    @ObfuscatedName("dw.w(J)V")
    public final void method2342(long arg0) throws IOException {
        this.field1462.seek(arg0);
        this.field1457 = arg0;
    }

    @ObfuscatedName("dw.m([BIII)V")
    public final void method2343(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1457 + (long) arg2 > this.field1455) {
            this.field1462.seek(this.field1455 + 1L);
            this.field1462.write(1);
            throw new EOFException();
        } else {
            this.field1462.write(arg0, arg1, arg2);
            this.field1457 += (long) arg2;
        }
    }

    @ObfuscatedName("dw.q(I)V")
    public final void method2351() throws IOException {
        this.method2341(false);
    }

    @ObfuscatedName("dw.x(ZI)V")
    public final void method2341(boolean arg0) throws IOException {
        if (this.field1462 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1462.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1462.close();
        this.field1462 = null;
    }

    @ObfuscatedName("dw.j(I)J")
    public final long method2361() throws IOException {
        return this.field1462.length();
    }

    @ObfuscatedName("dw.a([BIII)I")
    public final int method2347(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1462.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1457 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1462 != null) {
            System.out.println("");
            this.method2351();
        }
    }
}
