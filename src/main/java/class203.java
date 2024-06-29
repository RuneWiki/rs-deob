import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class203 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "J")
    private long field3391;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "J")
    private long field3392;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Ljava/io/File;")
    private File field3394;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3393;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)V", line = 5)
    public final void method1385(int arg0, long arg1) throws IOException {
        this.field3393.seek(arg1);
        this.field3392 = arg1;
        if (arg0 != 0) {
            this.method1387((byte) -71);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BII)V", line = 18)
    public final void method1386(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field3392 > this.field3391) {
            this.field3393.seek(this.field3391);
            this.field3393.write(1);
            throw new EOFException();
        }
        if (arg2 != -1) {
            this.field3392 = 18L;
        }
        this.field3393.write(arg1, arg0, arg3);
        this.field3392 += (long) arg3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Ljava/io/File;", line = 36)
    public final File method1387(byte arg0) {
        if (arg0 < 49) {
            this.method1387((byte) 73);
        }
        return this.field3394;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J", line = 46)
    public final long method1388(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field3393 = (RandomAccessFile) null;
        }
        return this.field3393.length();
    }

    @OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V", line = 56)
    protected final void finalize() throws Throwable {
        if (this.field3393 != null) {
            System.out.println("Warning! fileondisk " + this.field3394 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1390(0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[BI)I", line = 69)
    public final int method1389(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field3393.read(arg2, arg0, arg3);
        if (arg1 != -21270) {
            this.field3391 = -88L;
        }
        if (var5 > 0) {
            this.field3392 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 88)
    public final void method1390(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method1387((byte) -78);
        }
        if (this.field3393 != null) {
            this.field3393.close();
            this.field3393 = null;
        }
    }
}
