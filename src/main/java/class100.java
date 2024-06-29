import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class100 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2178;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Ljava/io/File;")
    private File field2176;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "J")
    private long field2177;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "J")
    private long field2179;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)V")
    public final void method710(int arg0, long arg1) throws IOException {
        this.field2178.seek(arg1);
        this.field2177 = arg1;
        if (arg0 != 26512) {
            this.method715((byte) -7);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III[B)V")
    public final void method711(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field2177 > this.field2179) {
            this.field2178.seek(this.field2179 + 1L);
            this.field2178.write(1);
            throw new EOFException();
        } else {
            this.field2178.write(arg3, arg2, arg0);
            int var5 = 99 / ((-arg1 - 75) / 41);
            this.field2177 += arg0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)J")
    public final long method712(byte arg0) throws IOException {
        if (arg0 <= 51) {
            this.method715((byte) -68);
        }
        return this.field2178.length();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII[B)I")
    public final int method713(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 <= 66) {
            return 87;
        }
        int var5 = this.field2178.read(arg3, arg1, arg2);
        if (var5 > 0) {
            this.field2177 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public final void method714(int arg0) throws IOException {
        this.field2178.close();
        if (arg0 == -1) {
            this.field2178 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method715(byte arg0) {
        int var2 = -45 / ((-arg0 - 15) / 35);
        return this.field2176;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class100(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2178 = new RandomAccessFile(arg0, arg1);
        this.field2176 = arg0;
        this.field2177 = 0L;
        this.field2179 = arg2;
    }
}
