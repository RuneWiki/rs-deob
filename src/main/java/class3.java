import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 {

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field102;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "J")
    private long field99;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "J")
    private long field101;

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Ljava/io/File;")
    private File field100;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)Ljava/io/File;", line = 5)
    public final File method50(byte arg0) {
        int var2 = 61 % ((46 - arg0) / 57);
        return this.field100;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(III[B)V", line = 13)
    public final void method51(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field101 > this.field99) {
            this.field102.seek(this.field99 + 1L);
            this.field102.write(1);
            throw new EOFException();
        }
        this.field102.write(arg3, arg0, arg1);
        this.field101 += arg1;
        if (arg2 != 24148) {
            this.field100 = null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 32)
    public final void method52(int arg0) throws IOException {
        this.field102.close();
        if (arg0 <= 96) {
            this.method50((byte) -45);
        }
        this.field102 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)J", line = 49)
    public final long method53(int arg0) throws IOException {
        int var2 = -48 % ((arg0 + 53) / 40);
        return this.field102.length();
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(BJ)V", line = 57)
    public final void method54(byte arg0, long arg1) throws IOException {
        if (arg0 <= -80) {
            this.field102.seek(arg1);
            this.field101 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(II[BI)I", line = 69)
    public final int method55(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != -16805) {
            this.field99 = -101L;
        }
        int var5 = this.field102.read(arg2, arg3, arg1);
        if (var5 > 0) {
            this.field101 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 82)
    public class3(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field102 = new RandomAccessFile(arg0, arg1);
        this.field99 = arg2;
        this.field101 = 0L;
        this.field100 = arg0;
    }
}
