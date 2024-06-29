import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class443 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "J")
    private long field6339;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "J")
    private long field6340;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Ljava/io/File;")
    private File field6337;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6338;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 3)
    public final void method2762(int arg0) throws IOException {
        if (this.field6338 != null) {
            this.field6338.close();
            this.field6338 = null;
        }
        if (arg0 != -1) {
            this.method2764(-24);
        }
    }

    @OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() throws Throwable {
        if (this.field6338 != null) {
            System.out.println("Warning! fileondisk " + this.field6337 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2762(-1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V", line = 32)
    public final void method2763(int arg0, long arg1) throws IOException {
        this.field6338.seek(arg1);
        if (arg0 != -15472) {
            this.method2764(-37);
        }
        this.field6340 = arg1;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Ljava/io/File;", line = 46)
    public final File method2764(int arg0) {
        return arg0 == 0 ? this.field6337 : null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)J", line = 56)
    public final long method2765(int arg0) throws IOException {
        return arg0 == 0 ? this.field6338.length() : -49L;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BIII)V", line = 66)
    public final void method2766(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field6339 < ((long) arg3 + this.field6340)) {
            this.field6338.seek(this.field6339);
            this.field6338.write(1);
            throw new EOFException();
        }
        this.field6338.write(arg0, arg2, arg3);
        if (arg1 != -7120) {
            this.method2764(-47);
        }
        this.field6340 += (long) arg3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z[BII)I", line = 89)
    public final int method2767(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (!arg0) {
            this.field6339 = -2L;
        }
        int var5 = this.field6338.read(arg1, arg2, arg3);
        if (var5 > 0) {
            this.field6340 += (long) var5;
        }
        return var5;
    }
}
