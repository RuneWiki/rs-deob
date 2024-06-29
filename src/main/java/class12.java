import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class12 {

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field123;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "J")
    private long field120;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Ljava/io/File;")
    private File field121;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "J")
    private long field122;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(JI)V", line = 6)
    public final void method94(long arg0, int arg1) throws IOException {
        this.field123.seek(arg0);
        if (arg1 >= 116) {
            this.field122 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 17)
    public final void method95(int arg0) throws IOException {
        if (arg0 == 11782) {
            this.field123.close();
            this.field123 = null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(I)J", line = 30)
    public final long method96(int arg0) throws IOException {
        return arg0 <= 77 ? -41L : this.field123.length();
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(III[B)V", line = 41)
    public final void method97(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field120 < (long) arg0 + this.field122) {
            this.field123.seek(this.field120 + 1L);
            this.field123.write(1);
            throw new EOFException();
        }
        if (arg2 != 1) {
            this.method99((byte) -65);
        }
        this.field123.write(arg3, arg1, arg0);
        this.field122 += arg0;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([BIBI)I", line = 60)
    public final int method98(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        int var5 = this.field123.read(arg0, arg1, arg3);
        if (arg2 != -11) {
            this.field120 = -37L;
        }
        if (var5 > 0) {
            this.field122 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)Ljava/io/File;", line = 76)
    public final File method99(byte arg0) {
        return arg0 <= 95 ? (File) null : this.field121;
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 84)
    public class12(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field123 = new RandomAccessFile(arg0, arg1);
        this.field120 = arg2;
        this.field121 = arg0;
        this.field122 = 0L;
    }
}
