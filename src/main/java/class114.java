import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class114 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2790;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Ljava/io/File;")
    private File field2789;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "J")
    private long field2791;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "J")
    private long field2792;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JB)V", line = 6)
    public final void method866(long arg0, byte arg1) throws IOException {
        if (arg1 == -38) {
            this.field2790.seek(arg0);
            this.field2791 = arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Ljava/io/File;", line = 17)
    public final File method867(int arg0) {
        return arg0 == 1 ? this.field2789 : null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 27)
    public final void method868(int arg0) throws IOException {
        this.field2790.close();
        this.field2790 = null;
        if (arg0 != -21426) {
            this.field2790 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BBI)V", line = 38)
    public final void method869(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (this.field2792 < (long) arg3 + this.field2791) {
            this.field2790.seek(this.field2792 + 1L);
            this.field2790.write(1);
            throw new EOFException();
        }
        this.field2790.write(arg1, arg0, arg3);
        if (arg2 != -90) {
            this.method867(-12);
        }
        this.field2791 += arg3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BII)I", line = 58)
    public final int method870(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != -1) {
            this.method867(-122);
        }
        int var5 = this.field2790.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field2791 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)J", line = 74)
    public final long method871(boolean arg0) throws IOException {
        if (arg0) {
            this.field2791 = 3L;
        }
        return this.field2790.length();
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 83)
    public class114(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2790 = new RandomAccessFile(arg0, arg1);
        this.field2789 = arg0;
        this.field2791 = 0L;
        this.field2792 = arg2;
    }
}
