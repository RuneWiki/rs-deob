import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class104 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2609;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "J")
    private long field2608;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Ljava/io/File;")
    private File field2610;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "J")
    private long field2607;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[B)V", line = 3)
    public final void method768(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field2608 > this.field2607) {
            this.field2609.seek(this.field2607 + 1L);
            this.field2609.write(1);
            throw new EOFException();
        }
        this.field2609.write(arg3, arg2, arg0);
        if (arg1 <= 7) {
            this.method773(-79);
        }
        this.field2608 += arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)J", line = 23)
    public final long method769(int arg0) throws IOException {
        if (arg0 != 32014) {
            this.method773(54);
        }
        return this.field2609.length();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[BI)I", line = 33)
    public final int method770(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2609.read(arg2, arg3, arg0);
        if (arg1 != 1) {
            this.method773(93);
        }
        if (var5 > 0) {
            this.field2608 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 48)
    public final void method771(int arg0) throws IOException {
        this.field2609.close();
        if (arg0 > 60) {
            this.field2609 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)V", line = 59)
    public final void method772(long arg0, int arg1) throws IOException {
        if (arg1 == 0) {
            this.field2609.seek(arg0);
            this.field2608 = arg0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Ljava/io/File;", line = 73)
    public final File method773(int arg0) {
        return arg0 == 1 ? this.field2610 : null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 84)
    public class104(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2609 = new RandomAccessFile(arg0, arg1);
        this.field2608 = 0L;
        this.field2610 = arg0;
        this.field2607 = arg2;
    }
}
