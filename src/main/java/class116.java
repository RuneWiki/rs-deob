import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class116 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2784;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "J")
    private long field2786;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/io/File;")
    private File field2783;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "J")
    private long field2785;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BII)V", line = 4)
    public final void method892(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg2 + this.field2785 > this.field2786) {
            this.field2784.seek(this.field2786 + 1L);
            this.field2784.write(1);
            throw new EOFException();
        }
        this.field2784.write(arg1, arg0, arg2);
        this.field2785 += arg2;
        if (arg3 != 1) {
            this.field2785 = 66L;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I[BII)I", line = 23)
    public final int method893(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2784.read(arg1, arg3, arg2);
        if (arg0 != -1) {
            this.field2784 = null;
        }
        if (var5 > 0) {
            this.field2785 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(JI)V", line = 40)
    public final void method894(long arg0, int arg1) throws IOException {
        this.field2784.seek(arg0);
        if (arg1 <= 83) {
            this.field2783 = null;
        }
        this.field2785 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)J", line = 51)
    public final long method895(int arg0) throws IOException {
        int var2 = 122 % ((arg0 + 28) / 48);
        return this.field2784.length();
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Ljava/io/File;", line = 63)
    public final File method896(int arg0) {
        return arg0 == 1 ? this.field2783 : null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 72)
    public class116(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2784 = new RandomAccessFile(arg0, arg1);
        this.field2786 = arg2;
        this.field2783 = arg0;
        this.field2785 = 0L;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 95)
    public final void method897(int arg0) throws IOException {
        if (arg0 == 1) {
            this.field2784.close();
            this.field2784 = null;
        }
    }
}
