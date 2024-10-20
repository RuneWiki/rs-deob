package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dc")
public final class class122 {

    @ObfuscatedName("dc.p")
    public RandomAccessFile field1648;

    @ObfuscatedName("dc.i")
    public long field1649;

    @ObfuscatedName("dc.w")
    public long field1650;

    public class122(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1648 = new RandomAccessFile(arg0, arg1);
        this.field1649 = arg2;
        this.field1650 = 0L;
        int var5 = this.field1648.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1648.seek(0L);
            this.field1648.write(var5);
        }
        this.field1648.seek(0L);
    }

    @ObfuscatedName("dc.p(J)V")
    public final void method2310(long arg0) throws IOException {
        this.field1648.seek(arg0);
        this.field1650 = arg0;
    }

    @ObfuscatedName("dc.i([BIII)V")
    public final void method2311(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1650 + (long) arg2 > this.field1649) {
            this.field1648.seek(this.field1649 + 1L);
            this.field1648.write(1);
            throw new EOFException();
        } else {
            this.field1648.write(arg0, arg1, arg2);
            this.field1650 += (long) arg2;
        }
    }

    @ObfuscatedName("dc.w(I)V")
    public final void method2312() throws IOException {
        this.method2324(false);
    }

    @ObfuscatedName("dc.s(ZB)V")
    public final void method2324(boolean arg0) throws IOException {
        if (this.field1648 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1648.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1648.close();
        this.field1648 = null;
    }

    @ObfuscatedName("dc.j(I)J")
    public final long method2309() throws IOException {
        return this.field1648.length();
    }

    @ObfuscatedName("dc.a([BIII)I")
    public final int method2315(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1648.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1650 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1648 != null) {
            System.out.println("");
            this.method2312();
        }
    }
}
