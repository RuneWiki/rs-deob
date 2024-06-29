import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class34 {

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field433;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "J")
    private long field434;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "J")
    private long field432;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "Ljava/io/File;")
    private File field435;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([BIII)V", line = 4)
    public final void method227(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field432 > this.field434) {
            this.field433.seek(this.field434 + 1L);
            this.field433.write(1);
            throw new EOFException();
        }
        if (arg1 >= -55) {
            this.field435 = null;
        }
        this.field433.write(arg0, arg2, arg3);
        this.field432 += arg3;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)Ljava/io/File;", line = 23)
    public final File method228(int arg0) {
        return arg0 == 0 ? this.field435 : (File) null;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)J", line = 33)
    public final long method229(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field434 = -17L;
        }
        return this.field433.length();
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)V", line = 48)
    public final void method230(byte arg0) throws IOException {
        if (arg0 == 114) {
            this.field433.close();
            this.field433 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 57)
    public class34(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field433 = new RandomAccessFile(arg0, arg1);
        this.field434 = arg2;
        this.field432 = 0L;
        this.field435 = arg0;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "([BIII)I", line = 80)
    public final int method231(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field433.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field432 += var5;
        }
        int var6 = 2 / ((-arg2 - 39) / 32);
        return var5;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(JB)V", line = 96)
    public final void method232(long arg0, byte arg1) throws IOException {
        int var4 = -86 / ((42 - arg1) / 40);
        this.field433.seek(arg0);
        this.field432 = arg0;
    }
}
