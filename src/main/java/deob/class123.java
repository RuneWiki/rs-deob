package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("db")
public final class class123 {

    @ObfuscatedName("db.g")
    public RandomAccessFile field1672;

    @ObfuscatedName("db.e")
    public long field1671;

    @ObfuscatedName("db.b")
    public long field1674;

    public class123(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1672 = new RandomAccessFile(arg0, arg1);
        this.field1671 = arg2;
        this.field1674 = 0L;
        int var5 = this.field1672.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1672.seek(0L);
            this.field1672.write(var5);
        }
        this.field1672.seek(0L);
    }

    @ObfuscatedName("db.g(J)V")
    public final void method2428(long arg0) throws IOException {
        this.field1672.seek(arg0);
        this.field1674 = arg0;
    }

    @ObfuscatedName("db.e([BIII)V")
    public final void method2429(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1674 + (long) arg2 > this.field1671) {
            this.field1672.seek(this.field1671 + 1L);
            this.field1672.write(1);
            throw new EOFException();
        } else {
            this.field1672.write(arg0, arg1, arg2);
            this.field1674 += (long) arg2;
        }
    }

    @ObfuscatedName("db.b(I)V")
    public final void method2444() throws IOException {
        this.method2430(false);
    }

    @ObfuscatedName("db.z(ZB)V")
    public final void method2430(boolean arg0) throws IOException {
        if (this.field1672 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1672.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1672.close();
        this.field1672 = null;
    }

    @ObfuscatedName("db.n(I)J")
    public final long method2441() throws IOException {
        return this.field1672.length();
    }

    @ObfuscatedName("db.l([BIII)I")
    public final int method2432(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1672.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1674 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1672 != null) {
            System.out.println("");
            this.method2444();
        }
    }
}
