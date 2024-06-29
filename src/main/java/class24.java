import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class24 {

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field328;

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "J")
    private long field329;

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Ljava/io/File;")
    private File field331;

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "J")
    private long field330;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(B[BII)I", line = 7)
    public final int method178(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field328.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field329 += var5;
        }
        if (arg0 != -25) {
            this.field329 = -38L;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IJ)V", line = 22)
    public final void method179(int arg0, long arg1) throws IOException {
        this.field328.seek(arg1);
        this.field329 = arg1;
        if (arg0 != 0) {
            this.method182(92);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(B)J", line = 36)
    public final long method180(byte arg0) throws IOException {
        int var2 = -72 % ((30 - arg0) / 35);
        return this.field328.length();
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Z[BII)V", line = 44)
    public final void method181(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field329 <= this.field330) {
            this.field328.write(arg1, arg2, arg3);
            if (arg0) {
                this.field329 += arg3;
            }
        } else {
            this.field328.seek(this.field330 + 1L);
            this.field328.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)Ljava/io/File;", line = 63)
    public final File method182(int arg0) {
        if (arg0 != 1) {
            this.field328 = null;
        }
        return this.field331;
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(B)V", line = 73)
    public final void method183(byte arg0) throws IOException {
        this.field328.close();
        this.field328 = null;
        if (arg0 >= -99) {
            this.field330 = 101L;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 84)
    public class24(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field328 = new RandomAccessFile(arg0, arg1);
        this.field329 = 0L;
        this.field331 = arg0;
        this.field330 = arg2;
    }
}
