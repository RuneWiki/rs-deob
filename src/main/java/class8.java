import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class8 {

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field58;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "J")
    private long field59;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "J")
    private long field60;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Ljava/io/File;")
    private File field61;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(III[B)V", line = 7)
    public final void method16(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field60 <= this.field59) {
            int var5 = 55 % ((2 - arg2) / 63);
            this.field58.write(arg3, arg1, arg0);
            this.field60 += arg0;
        } else {
            this.field58.seek(this.field59 + 1L);
            this.field58.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)Ljava/io/File;", line = 25)
    public final File method17(int arg0) {
        return arg0 == 1 ? this.field61 : (File) null;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)V", line = 35)
    public final void method18(int arg0) throws IOException {
        this.field58.close();
        this.field58 = null;
        if (arg0 != -20897) {
            this.method17(-22);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)J", line = 47)
    public final long method19(byte arg0) throws IOException {
        int var2 = -63 / ((2 - arg0) / 52);
        return this.field58.length();
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(III[B)I", line = 57)
    public final int method20(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field58.read(arg3, arg1, arg2);
        if (var5 > arg0) {
            this.field60 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IJ)V", line = 70)
    public final void method21(int arg0, long arg1) throws IOException {
        this.field58.seek(arg1);
        this.field60 = arg1;
        if (arg0 != 1) {
            this.field60 = -66L;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 80)
    public class8(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field58 = new RandomAccessFile(arg0, arg1);
        this.field59 = arg2;
        this.field60 = 0L;
        this.field61 = arg0;
    }
}
