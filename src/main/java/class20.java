import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class20 {

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field199;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "J")
    private long field200;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "J")
    private long field198;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "Ljava/io/File;")
    private File field201;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)V", line = 5)
    public final void method120(int arg0) throws IOException {
        this.field199.close();
        if (arg0 != 10179) {
            this.method121(-80);
        }
        this.field199 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)Ljava/io/File;", line = 16)
    public final File method121(int arg0) {
        if (arg0 > -38) {
            this.field201 = null;
        }
        return this.field201;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(III[B)I", line = 29)
    public final int method122(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field199.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field198 += var5;
        }
        if (arg2 != 14010) {
            this.field199 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(JB)V", line = 43)
    public final void method123(long arg0, byte arg1) throws IOException {
        this.field199.seek(arg0);
        this.field198 = arg0;
        if (arg1 < 23) {
            this.method121(21);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(II[BI)V", line = 54)
    public final void method124(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field198 > this.field200) {
            this.field199.seek(this.field200 + 1L);
            this.field199.write(1);
            throw new EOFException();
        }
        if (arg1 != -12328) {
            this.field198 = -87L;
        }
        this.field199.write(arg2, arg3, arg0);
        this.field198 += arg0;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Z)J", line = 75)
    public final long method125(boolean arg0) throws IOException {
        if (!arg0) {
            this.field200 = -94L;
        }
        return this.field199.length();
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 83)
    public class20(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field199 = new RandomAccessFile(arg0, arg1);
        this.field200 = arg2;
        this.field198 = 0L;
        this.field201 = arg0;
        int var5 = this.field199.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field199.seek(0L);
            this.field199.write(var5);
        }
        this.field199.seek(0L);
    }
}
