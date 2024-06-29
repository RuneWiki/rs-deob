import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class91 {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2136;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "J")
    private long field2134;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Ljava/io/File;")
    private File field2133;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "J")
    private long field2135;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[BI)V")
    public final void method699(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field2134 < (long) arg1 + this.field2135) {
            this.field2136.seek(this.field2134 + 1L);
            this.field2136.write(1);
            throw new EOFException();
        } else {
            int var5 = 53 % ((-arg0 - 31) / 37);
            this.field2136.write(arg2, arg3, arg1);
            this.field2135 += arg1;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public final void method700(int arg0) throws IOException {
        if (arg0 > 0) {
            this.field2136.close();
            this.field2136 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)J")
    public final long method701(byte arg0) throws IOException {
        if (arg0 < 44) {
            this.field2136 = null;
        }
        return this.field2136.length();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BII)I")
    public final int method702(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2136.read(arg1, arg2, arg3);
        if (arg0 < var5) {
            this.field2135 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method703(int arg0) {
        return arg0 == 1 ? this.field2133 : null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class91(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2136 = new RandomAccessFile(arg0, arg1);
        this.field2134 = arg2;
        this.field2133 = arg0;
        this.field2135 = 0L;
        int var5 = this.field2136.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2136.seek(0L);
            this.field2136.write(var5);
        }
        this.field2136.seek(0L);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(JB)V")
    public final void method704(long arg0, byte arg1) throws IOException {
        this.field2136.seek(arg0);
        this.field2135 = arg0;
        int var4 = 64 % ((arg1 + 22) / 35);
    }
}
