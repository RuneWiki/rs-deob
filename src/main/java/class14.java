import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class14 {

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field216;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Ljava/io/File;")
    private File field214;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "J")
    private long field215;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "J")
    private long field213;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)J", line = 4)
    public final long method76(int arg0) throws IOException {
        if (arg0 >= -10) {
            this.method78(-3);
        }
        return this.field216.length();
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(JB)V", line = 15)
    public final void method77(long arg0, byte arg1) throws IOException {
        this.field216.seek(arg0);
        this.field213 = arg0;
        int var4 = -97 % ((arg1 - 87) / 35);
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)Ljava/io/File;", line = 27)
    public final File method78(int arg0) {
        int var2 = 35 % ((arg0 - 64) / 59);
        return this.field214;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I[BII)V", line = 38)
    public final void method79(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 25662) {
            this.field213 = 106L;
        }
        if (this.field215 >= (long) arg3 + this.field213) {
            this.field216.write(arg1, arg0, arg3);
            this.field213 += arg3;
        } else {
            this.field216.seek(this.field215 + 1L);
            this.field216.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)V", line = 57)
    public final void method80(boolean arg0) throws IOException {
        if (arg0) {
            this.field216 = null;
        }
        this.field216.close();
        this.field216 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 67)
    public class14(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field216 = new RandomAccessFile(arg0, arg1);
        this.field214 = arg0;
        this.field215 = arg2;
        this.field213 = 0L;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([BIII)I", line = 91)
    public final int method81(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 > -60) {
            this.field214 = null;
        }
        int var5 = this.field216.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field213 += var5;
        }
        return var5;
    }
}
