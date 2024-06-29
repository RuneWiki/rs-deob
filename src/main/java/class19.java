import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class19 {

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field200;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "J")
    private long field199;

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Ljava/io/File;")
    private File field202;

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "J")
    private long field201;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIZ[B)I", line = 5)
    public final int method118(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (!arg2) {
            this.method121(117);
        }
        int var5 = this.field200.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field201 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I[BII)V", line = 19)
    public final void method119(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field201 > this.field199) {
            this.field200.seek(this.field199 + 1L);
            this.field200.write(1);
            throw new EOFException();
        }
        this.field200.write(arg1, arg0, arg3);
        this.field201 += arg3;
        if (arg2 != 0) {
            this.method121(3);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 38)
    public final void method120(int arg0) throws IOException {
        this.field200.close();
        this.field200 = null;
        if (arg0 != -11317) {
            this.field202 = null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)Ljava/io/File;", line = 51)
    public final File method121(int arg0) {
        return arg0 == -1 ? this.field202 : (File) null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(JI)V", line = 61)
    public final void method122(long arg0, int arg1) throws IOException {
        this.field200.seek(arg0);
        this.field201 = arg0;
        if (arg1 != 1) {
            this.field202 = null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(I)J", line = 74)
    public final long method123(int arg0) throws IOException {
        if (arg0 != 13749) {
            this.method121(-79);
        }
        return this.field200.length();
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 83)
    public class19(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field200 = new RandomAccessFile(arg0, arg1);
        this.field199 = arg2;
        this.field202 = arg0;
        this.field201 = 0L;
        int var5 = this.field200.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field200.seek(0L);
            this.field200.write(var5);
        }
        this.field200.seek(0L);
    }
}
