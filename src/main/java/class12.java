import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 {

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field355;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "J")
    private long field353;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Ljava/io/File;")
    private File field354;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "J")
    private long field352;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II[BI)I", line = 3)
    public final int method116(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field355.read(arg2, arg1, arg0);
        if (~var5 < arg3) {
            this.field353 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Ljava/io/File;", line = 18)
    public final File method117(byte arg0) {
        return arg0 > -19 ? null : this.field354;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)J", line = 30)
    public final long method118(boolean arg0) throws IOException {
        if (!arg0) {
            this.method117((byte) 84);
        }
        return this.field355.length();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IJ)V", line = 41)
    public final void method119(int arg0, long arg1) throws IOException {
        this.field355.seek(arg1);
        if (arg0 != 11255) {
            this.field352 = 23L;
        }
        this.field353 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 52)
    public final void method120(byte arg0) throws IOException {
        this.field355.close();
        this.field355 = null;
        if (arg0 >= -113) {
            this.field353 = -34L;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ[B)V", line = 63)
    public final void method121(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (this.field352 < (long) arg1 + this.field353) {
            this.field355.seek(this.field352 + 1L);
            this.field355.write(1);
            throw new EOFException();
        } else if (arg2) {
            this.field355.write(arg3, arg0, arg1);
            this.field353 += arg1;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 81)
    public class12(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field355 = new RandomAccessFile(arg0, arg1);
        this.field353 = 0L;
        this.field354 = arg0;
        this.field352 = arg2;
    }
}
