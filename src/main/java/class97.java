import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class97 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2137;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Ljava/io/File;")
    private File field2138;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "J")
    private long field2139;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "J")
    private long field2140;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method733(int arg0) {
        if (arg0 <= 77) {
            this.field2139 = -118L;
        }
        return this.field2138;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[BI)I")
    public final int method734(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != 1) {
            this.method733(97);
        }
        int var5 = this.field2137.read(arg2, arg1, arg3);
        if (var5 > 0) {
            this.field2140 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public final void method735(int arg0) throws IOException {
        this.field2137.close();
        if (arg0 != 0) {
            this.method733(-119);
        }
        this.field2137 = null;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)J")
    public final long method736(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field2139 = 17L;
        }
        return this.field2137.length();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([BIIB)V")
    public final void method737(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (this.field2139 < (long) arg1 + this.field2140) {
            this.field2137.seek(this.field2139 + 1L);
            this.field2137.write(1);
            throw new EOFException();
        }
        if (arg3 != -11) {
            this.method733(38);
        }
        this.field2137.write(arg0, arg2, arg1);
        this.field2140 += arg1;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class97(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2137 = new RandomAccessFile(arg0, arg1);
        this.field2138 = arg0;
        this.field2139 = arg2;
        this.field2140 = 0L;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZJ)V")
    public final void method738(boolean arg0, long arg1) throws IOException {
        if (!arg0) {
            this.method733(-62);
        }
        this.field2137.seek(arg1);
        this.field2140 = arg1;
    }
}
