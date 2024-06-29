import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class145 {

    @OriginalMember(owner = "client!um", name = "c", descriptor = "J")
    private long field2526;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "J")
    private long field2527;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Ljava/io/File;")
    private File field2524;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2525;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III[B)V", line = 7)
    public final void method1005(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field2527 < ((long) arg2 + this.field2526)) {
            this.field2525.seek(this.field2527 + 1L);
            this.field2525.write(1);
            throw new EOFException();
        }
        this.field2525.write(arg3, arg0, arg2);
        this.field2526 += (long) arg2;
        if (arg1 >= -21) {
            this.field2527 = -101L;
        }
    }

    @OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() throws Throwable {
        if (this.field2525 != null) {
            System.out.println("Warning! fileondisk " + this.field2524 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1009(0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IJ)V", line = 39)
    public final void method1006(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            this.field2524 = (File) null;
        }
        this.field2525.seek(arg1);
        this.field2526 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II[BI)I", line = 51)
    public final int method1007(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2525.read(arg2, arg3, arg1);
        if (arg0 < var5) {
            this.field2526 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Ljava/io/File;", line = 63)
    public final File method1008(int arg0) {
        if (arg0 != 22173) {
            this.method1008(38);
        }
        return this.field2524;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 73)
    public final void method1009(int arg0) throws IOException {
        if (this.field2525 != null) {
            this.field2525.close();
            this.field2525 = null;
        }
        if (arg0 != 0) {
            this.method1008(-58);
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)J", line = 90)
    public final long method1010(int arg0) throws IOException {
        return arg0 == 0 ? this.field2525.length() : 119L;
    }
}
