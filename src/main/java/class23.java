import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field498;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Ljava/io/File;")
    private File field500;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "J")
    private long field497;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "J")
    private long field499;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 3)
    public final void method179(int arg0) throws IOException {
        if (arg0 != 4220) {
            this.method180((byte) -74);
        }
        this.field498.close();
        this.field498 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Ljava/io/File;", line = 15)
    public final File method180(byte arg0) {
        return arg0 < 87 ? null : this.field500;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB[BI)I", line = 25)
    public final int method181(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 113) {
            this.method180((byte) 112);
        }
        int var5 = this.field498.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field497 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(JI)V", line = 42)
    public final void method182(long arg0, int arg1) throws IOException {
        this.field498.seek(arg0);
        this.field497 = arg0;
        if (arg1 != -23331) {
            this.field498 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[BII)V", line = 53)
    public final void method183(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field499 < (long) arg3 + this.field497) {
            this.field498.seek(this.field499 + 1L);
            this.field498.write(1);
            throw new EOFException();
        }
        this.field498.write(arg1, arg2, arg3);
        this.field497 += arg3;
        if (arg0) {
            this.method180((byte) -4);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)J", line = 75)
    public final long method184(byte arg0) throws IOException {
        if (arg0 >= -15) {
            this.field497 = 79L;
        }
        return this.field498.length();
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 85)
    public class23(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field498 = new RandomAccessFile(arg0, arg1);
        this.field500 = arg0;
        this.field497 = 0L;
        this.field499 = arg2;
    }
}
