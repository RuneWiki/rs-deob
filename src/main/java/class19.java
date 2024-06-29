import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class19 {

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field223;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "Ljava/io/File;")
    private File field222;

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "J")
    private long field221;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "J")
    private long field220;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IB[BI)V", line = 4)
    public final void method128(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field221 > this.field220) {
            this.field223.seek(this.field220 + 1L);
            this.field223.write(1);
            throw new EOFException();
        } else if (arg1 == 46) {
            this.field223.write(arg2, arg0, arg3);
            this.field221 += arg3;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B)Ljava/io/File;", line = 22)
    public final File method129(byte arg0) {
        return arg0 == -86 ? this.field222 : (File) null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)V", line = 34)
    public final void method130(int arg0) throws IOException {
        this.field223.close();
        this.field223 = null;
        if (arg0 != 28964) {
            this.field223 = null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([BIBI)I", line = 46)
    public final int method131(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != 71) {
            this.field223 = null;
        }
        int var5 = this.field223.read(arg0, arg3, arg1);
        if (var5 > 0) {
            this.field221 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)J", line = 63)
    public final long method132(int arg0) throws IOException {
        int var2 = -31 % ((arg0 - 14) / 49);
        return this.field223.length();
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(JI)V", line = 72)
    public final void method133(long arg0, int arg1) throws IOException {
        this.field223.seek(arg0);
        this.field221 = arg0;
        if (arg1 > -125) {
            this.field220 = -48L;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 83)
    public class19(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field223 = new RandomAccessFile(arg0, arg1);
        this.field222 = arg0;
        this.field221 = 0L;
        this.field220 = arg2;
    }
}
