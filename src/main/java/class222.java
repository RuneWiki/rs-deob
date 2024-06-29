import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class222 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "J")
    private long field3337;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "J")
    private long field3338;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljava/io/File;")
    private File field3336;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3335;

    @OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3335 != null) {
            System.out.println("Warning! fileondisk " + this.field3336 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1422(-1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1420(int arg0) {
        if (arg0 > -85) {
            this.field3336 = null;
        }
        return this.field3336;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)J")
    public final long method1421(byte arg0) throws IOException {
        if (arg0 != -106) {
            this.field3336 = null;
        }
        return this.field3335.length();
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public final void method1422(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method1420(24);
        }
        if (this.field3335 != null) {
            this.field3335.close();
            this.field3335 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[BB)I")
    public final int method1423(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if (arg3 != -94) {
            this.method1420(-107);
        }
        int var5 = this.field3335.read(arg2, arg0, arg1);
        if (var5 > 0) {
            this.field3338 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(JI)V")
    public final void method1424(long arg0, int arg1) throws IOException {
        this.field3335.seek(arg0);
        if (arg1 == 0) {
            this.field3338 = arg0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[BI)V")
    public final void method1425(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field3337 < (long) arg3 + this.field3338) {
            this.field3335.seek(this.field3337);
            this.field3335.write(1);
            throw new EOFException();
        }
        this.field3335.write(arg2, arg0, arg3);
        if (arg1 >= -19) {
            this.method1420(112);
        }
        this.field3338 += (long) arg3;
    }
}
