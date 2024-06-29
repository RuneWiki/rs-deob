import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field33;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "Ljava/io/File;")
    private File field35;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "J")
    private long field32;

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "J")
    private long field34;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)J", line = 5)
    public final long method20(byte arg0) throws IOException {
        int var2 = -21 / ((3 - arg0) / 40);
        return this.field33.length();
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(JI)V", line = 18)
    public final void method21(long arg0, int arg1) throws IOException {
        int var4 = 119 / ((arg1 + 43) / 44);
        this.field33.seek(arg0);
        this.field34 = arg0;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(II[BZ)I", line = 29)
    public final int method22(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        int var5 = this.field33.read(arg2, arg0, arg1);
        if (var5 > 0) {
            this.field34 += var5;
        }
        if (arg3) {
            this.method23(-79);
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)Ljava/io/File;", line = 43)
    public final File method23(int arg0) {
        if (arg0 != 0) {
            this.method23(43);
        }
        return this.field35;
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)V", line = 54)
    public final void method24(int arg0) throws IOException {
        this.field33.close();
        if (arg0 > -105) {
            this.method23(8);
        }
        this.field33 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ZII[B)V", line = 65)
    public final void method25(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg2 + this.field34 > this.field32) {
            this.field33.seek(this.field32 + 1L);
            this.field33.write(1);
            throw new EOFException();
        }
        this.field33.write(arg3, arg1, arg2);
        if (!arg0) {
            this.field33 = null;
        }
        this.field34 += arg2;
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 82)
    public class5(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field33 = new RandomAccessFile(arg0, arg1);
        this.field35 = arg0;
        this.field32 = arg2;
        this.field34 = 0L;
    }
}
