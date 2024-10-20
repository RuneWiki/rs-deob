package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("de")
public final class class123 {

    @ObfuscatedName("de.t")
    public RandomAccessFile field1673;

    @ObfuscatedName("de.q")
    public long field1674;

    @ObfuscatedName("de.i")
    public long field1675;

    public class123(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1673 = new RandomAccessFile(arg0, arg1);
        this.field1674 = arg2;
        this.field1675 = 0L;
        int var5 = this.field1673.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1673.seek(0L);
            this.field1673.write(var5);
        }
        this.field1673.seek(0L);
    }

    @ObfuscatedName("de.t(J)V")
    public final void method2340(long arg0) throws IOException {
        this.field1673.seek(arg0);
        this.field1675 = arg0;
    }

    @ObfuscatedName("de.q([BIII)V")
    public final void method2314(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1675 + (long) arg2 > this.field1674) {
            this.field1673.seek(this.field1674 + 1L);
            this.field1673.write(1);
            throw new EOFException();
        } else {
            this.field1673.write(arg0, arg1, arg2);
            this.field1675 += (long) arg2;
        }
    }

    @ObfuscatedName("de.i(I)V")
    public final void method2315() throws IOException {
        this.method2316(false);
    }

    @ObfuscatedName("de.a(ZS)V")
    public final void method2316(boolean arg0) throws IOException {
        if (this.field1673 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1673.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1673.close();
        this.field1673 = null;
    }

    @ObfuscatedName("de.l(B)J")
    public final long method2332() throws IOException {
        return this.field1673.length();
    }

    @ObfuscatedName("de.b([BIIB)I")
    public final int method2318(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1673.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1675 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1673 != null) {
            System.out.println("");
            this.method2315();
        }
    }
}
