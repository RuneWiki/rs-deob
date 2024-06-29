import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class96 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2390;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "J")
    private long field2389;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Ljava/io/File;")
    private File field2391;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "J")
    private long field2388;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)Ljava/io/File;", line = 4)
    public final File method832(boolean arg0) {
        return arg0 ? null : this.field2391;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZJ)V", line = 14)
    public final void method833(boolean arg0, long arg1) throws IOException {
        this.field2390.seek(arg1);
        if (!arg0) {
            this.field2388 = 112L;
        }
        this.field2388 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 28)
    public final void method834(int arg0) throws IOException {
        this.field2390.close();
        this.field2390 = null;
        if (arg0 != 1) {
            this.field2391 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 40)
    public class96(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2390 = new RandomAccessFile(arg0, arg1);
        this.field2389 = arg2;
        this.field2391 = arg0;
        this.field2388 = 0L;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BIIZ)V", line = 62)
    public final void method835(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if ((long) arg2 + this.field2388 > this.field2389) {
            this.field2390.seek(this.field2389 + 1L);
            this.field2390.write(1);
            throw new EOFException();
        } else if (!arg3) {
            this.field2390.write(arg0, arg1, arg2);
            this.field2388 += arg2;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)J", line = 81)
    public final long method836(int arg0) throws IOException {
        if (arg0 <= 12) {
            this.field2388 = -17L;
        }
        return this.field2390.length();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II[BI)I", line = 91)
    public final int method837(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2390.read(arg2, arg0, arg1);
        if (arg3 > -99) {
            this.field2390 = null;
        }
        if (var5 > 0) {
            this.field2388 += var5;
        }
        return var5;
    }
}
