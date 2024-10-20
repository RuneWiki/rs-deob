package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dt")
public final class class124 {

    @ObfuscatedName("dt.d")
    public RandomAccessFile field1683;

    @ObfuscatedName("dt.x")
    public long field1682;

    @ObfuscatedName("dt.k")
    public long field1684;

    public class124(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1683 = new RandomAccessFile(arg0, arg1);
        this.field1682 = arg2;
        this.field1684 = 0L;
        int var5 = this.field1683.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1683.seek(0L);
            this.field1683.write(var5);
        }
        this.field1683.seek(0L);
    }

    @ObfuscatedName("dt.d(J)V")
    public final void method2238(long arg0) throws IOException {
        this.field1683.seek(arg0);
        this.field1684 = arg0;
    }

    @ObfuscatedName("dt.x([BIII)V")
    public final void method2241(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1684 + (long) arg2 > this.field1682) {
            this.field1683.seek(this.field1682 + 1L);
            this.field1683.write(1);
            throw new EOFException();
        } else {
            this.field1683.write(arg0, arg1, arg2);
            this.field1684 += (long) arg2;
        }
    }

    @ObfuscatedName("dt.k(B)V")
    public final void method2240() throws IOException {
        this.method2251(false);
    }

    @ObfuscatedName("dt.z(ZI)V")
    public final void method2251(boolean arg0) throws IOException {
        if (this.field1683 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1683.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1683.close();
        this.field1683 = null;
    }

    @ObfuscatedName("dt.v(B)J")
    public final long method2242() throws IOException {
        return this.field1683.length();
    }

    @ObfuscatedName("dt.m([BIIB)I")
    public final int method2243(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1683.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1684 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1683 != null) {
            System.out.println("");
            this.method2240();
        }
    }
}
