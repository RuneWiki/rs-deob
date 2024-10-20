package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("da")
public final class class118 {

    @ObfuscatedName("da.a")
    public RandomAccessFile field1520;

    @ObfuscatedName("da.s")
    public long field1518;

    @ObfuscatedName("da.g")
    public long field1517;

    public class118(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1520 = new RandomAccessFile(arg0, arg1);
        this.field1518 = arg2;
        this.field1517 = 0L;
        int var5 = this.field1520.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1520.seek(0L);
            this.field1520.write(var5);
        }
        this.field1520.seek(0L);
    }

    @ObfuscatedName("da.a(J)V")
    public final void method2539(long arg0) throws IOException {
        this.field1520.seek(arg0);
        this.field1517 = arg0;
    }

    @ObfuscatedName("da.s([BIIB)V")
    public final void method2540(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1517 + (long) arg2 > this.field1518) {
            this.field1520.seek(this.field1518 + 1L);
            this.field1520.write(1);
            throw new EOFException();
        } else {
            this.field1520.write(arg0, arg1, arg2);
            this.field1517 += (long) arg2;
        }
    }

    @ObfuscatedName("da.g(S)V")
    public final void method2541() throws IOException {
        this.method2542(false);
    }

    @ObfuscatedName("da.x(ZI)V")
    public final void method2542(boolean arg0) throws IOException {
        if (this.field1520 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1520.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1520.close();
        this.field1520 = null;
    }

    @ObfuscatedName("da.h(I)J")
    public final long method2543() throws IOException {
        return this.field1520.length();
    }

    @ObfuscatedName("da.f([BIII)I")
    public final int method2544(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1520.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1517 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1520 != null) {
            System.out.println("");
            this.method2541();
        }
    }
}
