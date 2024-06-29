import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class23 {

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "J")
    private long field337;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "J")
    private long field338;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Ljava/io/File;")
    private File field336;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field339;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[BI)V", line = 5)
    public final void method224(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field337 < ((long) arg0 + this.field338)) {
            this.field339.seek(this.field337);
            this.field339.write(1);
            throw new EOFException();
        }
        this.field339.write(arg2, arg1, arg0);
        if (arg3 != 0) {
            this.field339 = (RandomAccessFile) null;
        }
        this.field338 += (long) arg0;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II[BI)I", line = 26)
    public final int method225(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field339.read(arg2, arg1, arg3);
        if (~var5 < arg0) {
            this.field338 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)J", line = 38)
    public final long method226(int arg0) throws IOException {
        if (arg0 != 22639) {
            this.field337 = 53L;
        }
        return this.field339.length();
    }

    @OriginalMember(owner = "client!hm", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() throws Throwable {
        if (this.field339 != null) {
            System.out.println("Warning! fileondisk " + this.field336 + " not closed correctly using close(). Auto-closing instead. ");
            this.method229(37);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)Ljava/io/File;", line = 61)
    public final File method227(byte arg0) {
        if (arg0 != -78) {
            this.method227((byte) 41);
        }
        return this.field336;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(JI)V", line = 73)
    public final void method228(long arg0, int arg1) throws IOException {
        this.field339.seek(arg0);
        if (arg1 == 0) {
            this.field338 = arg0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 85)
    public final void method229(int arg0) throws IOException {
        if (arg0 < 29) {
            this.method227((byte) -123);
        }
        if (this.field339 != null) {
            this.field339.close();
            this.field339 = null;
        }
    }
}
