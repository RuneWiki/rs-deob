import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field300;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "J")
    private long field302;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "J")
    private long field301;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Ljava/io/File;")
    private File field299;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)V", line = 3)
    public final void method143(int arg0, long arg1) throws IOException {
        this.field300.seek(arg1);
        if (arg0 != -4437) {
            this.field301 = -2L;
        }
        this.field302 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[B)I", line = 17)
    public final int method144(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field300.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field302 += var5;
        }
        if (arg2 != -24325) {
            this.method146((byte) 18);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 35)
    public class11(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field300 = new RandomAccessFile(arg0, arg1);
        this.field302 = 0L;
        this.field301 = arg2;
        this.field299 = arg0;
        int var5 = this.field300.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field300.seek(0L);
            this.field300.write(var5);
        }
        this.field300.seek(0L);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 66)
    public final void method145(int arg0) throws IOException {
        this.field300.close();
        this.field300 = null;
        if (arg0 != -1) {
            this.field301 = -106L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Ljava/io/File;", line = 77)
    public final File method146(byte arg0) {
        return arg0 == -7 ? this.field299 : null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)J", line = 87)
    public final long method147(boolean arg0) throws IOException {
        return arg0 ? -29L : this.field300.length();
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III[B)V", line = 97)
    public final void method148(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field302 > this.field301) {
            this.field300.seek(this.field301 + 1L);
            this.field300.write(1);
            throw new EOFException();
        }
        this.field300.write(arg3, arg1, arg0);
        this.field302 += arg0;
        if (arg2 != -26455) {
            this.method146((byte) -4);
        }
    }
}
