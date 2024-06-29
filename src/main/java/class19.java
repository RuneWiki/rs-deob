import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class19 {

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field283;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "J")
    private long field281;

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "Ljava/io/File;")
    private File field282;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "J")
    private long field284;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IBI[B)V", line = 6)
    public final void method141(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field284 < (long) arg0 + this.field281) {
            this.field283.seek(this.field284 + 1L);
            this.field283.write(1);
            throw new EOFException();
        }
        if (arg1 != -59) {
            this.method143(34);
        }
        this.field283.write(arg3, arg2, arg0);
        this.field281 += arg0;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)J", line = 25)
    public final long method142(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field282 = null;
        }
        return this.field283.length();
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)Ljava/io/File;", line = 36)
    public final File method143(int arg0) {
        int var2 = 55 / ((59 - arg0) / 35);
        return this.field282;
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(I)V", line = 46)
    public final void method144(int arg0) throws IOException {
        this.field283.close();
        int var2 = -15 % ((-arg0 - 37) / 58);
        this.field283 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IJ)V", line = 56)
    public final void method145(int arg0, long arg1) throws IOException {
        this.field283.seek(arg1);
        this.field281 = arg1;
        if (arg0 != 1) {
            this.field282 = null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 67)
    public class19(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field283 = new RandomAccessFile(arg0, arg1);
        this.field281 = 0L;
        this.field282 = arg0;
        this.field284 = arg2;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(II[BB)I", line = 92)
    public final int method146(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = this.field283.read(arg2, arg1, arg0);
        if (arg3 == 80) {
            if (var5 > 0) {
                this.field281 += var5;
            }
            return var5;
        } else {
            return 68;
        }
    }
}
