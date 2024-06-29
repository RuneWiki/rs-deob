import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 {

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field187;

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "J")
    private long field185;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "J")
    private long field186;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Ljava/io/File;")
    private File field184;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)J", line = 6)
    public final long method84(byte arg0) throws IOException {
        return arg0 >= -100 ? 26L : this.field187.length();
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II[BI)I", line = 17)
    public final int method85(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 <= 40) {
            this.field185 = -81L;
        }
        int var5 = this.field187.read(arg2, arg1, arg3);
        if (var5 > 0) {
            this.field186 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(JB)V", line = 35)
    public final void method86(long arg0, byte arg1) throws IOException {
        this.field187.seek(arg0);
        this.field186 = arg0;
        if (arg1 != 125) {
            this.method87(-44);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)Ljava/io/File;", line = 47)
    public final File method87(int arg0) {
        if (arg0 != -16434) {
            this.field187 = null;
        }
        return this.field184;
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(I)V", line = 57)
    public final void method88(int arg0) throws IOException {
        if (arg0 != -13514) {
            this.field185 = 108L;
        }
        this.field187.close();
        this.field187 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 66)
    public class13(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field187 = new RandomAccessFile(arg0, arg1);
        this.field185 = arg2;
        this.field186 = 0L;
        this.field184 = arg0;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I[BII)V", line = 90)
    public final void method89(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field185 < (long) arg2 + this.field186) {
            this.field187.seek(this.field185 + 1L);
            this.field187.write(1);
            throw new EOFException();
        }
        this.field187.write(arg1, arg3, arg2);
        this.field186 += arg2;
        if (arg0 != -11667) {
            this.field185 = -39L;
        }
    }
}
