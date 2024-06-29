import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1972;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Ljava/io/File;")
    private File field1970;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "J")
    private long field1973;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "J")
    private long field1971;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)J", line = 3)
    public final long method642(int arg0) throws IOException {
        int var2 = 19 % ((8 - arg0) / 60);
        return this.field1972.length();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Ljava/io/File;", line = 16)
    public final File method643(boolean arg0) {
        if (arg0) {
            this.field1970 = null;
        }
        return this.field1970;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III[B)V", line = 26)
    public final void method644(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field1973 < (long) arg1 + this.field1971) {
            this.field1972.seek(this.field1973 + 1L);
            this.field1972.write(1);
            throw new EOFException();
        }
        if (arg2 <= 113) {
            this.field1972 = null;
        }
        this.field1972.write(arg3, arg0, arg1);
        this.field1971 += arg1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[BII)I", line = 45)
    public final int method645(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field1972.read(arg1, arg0, arg3);
        if (var5 > 0) {
            this.field1971 += var5;
        }
        if (arg2 != 24137) {
            this.method643(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 60)
    public final void method646(byte arg0) throws IOException {
        this.field1972.close();
        if (arg0 == -76) {
            this.field1972 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 70)
    public class84(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field1972 = new RandomAccessFile(arg0, arg1);
        this.field1970 = arg0;
        this.field1973 = arg2;
        this.field1971 = 0L;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IJ)V", line = 91)
    public final void method647(int arg0, long arg1) throws IOException {
        if (arg0 != 1) {
            this.method643(false);
        }
        this.field1972.seek(arg1);
        this.field1971 = arg1;
    }
}
