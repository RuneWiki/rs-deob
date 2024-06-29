import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class161 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "J")
    private long field2334;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "J")
    private long field2335;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/io/File;")
    private File field2336;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2337;

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2337 != null) {
            System.out.println("Warning! fileondisk " + this.field2336 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1087(-102);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1084(int arg0) {
        if (arg0 != 0) {
            this.method1084(-112);
        }
        return this.field2336;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)V")
    public final void method1085(long arg0, int arg1) throws IOException {
        this.field2337.seek(arg0);
        if (arg1 <= 116) {
            this.field2336 = null;
        }
        this.field2335 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[BI)I")
    public final int method1086(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2337.read(arg2, arg1, arg3);
        if (~var5 < arg0) {
            this.field2335 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public final void method1087(int arg0) throws IOException {
        if (this.field2337 != null) {
            this.field2337.close();
            this.field2337 = null;
        }
        int var2 = -34 / ((-arg0 - 19) / 46);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[BII)V")
    public final void method1088(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (((long) arg2 + this.field2335) > this.field2334) {
            this.field2337.seek(this.field2334);
            this.field2337.write(1);
            throw new EOFException();
        }
        this.field2337.write(arg1, arg3, arg2);
        this.field2335 += (long) arg2;
        if (arg0 != -1) {
            this.method1084(13);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)J")
    public final long method1089(byte arg0) throws IOException {
        if (arg0 != -119) {
            this.method1084(77);
        }
        return this.field2337.length();
    }
}
