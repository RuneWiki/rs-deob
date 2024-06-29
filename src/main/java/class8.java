import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class8 {

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field174;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "J")
    private long field171;

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "Ljava/io/File;")
    private File field173;

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "J")
    private long field172;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(ZJ)V", line = 4)
    public final void method70(boolean arg0, long arg1) throws IOException {
        this.field174.seek(arg1);
        if (arg0) {
            this.field173 = null;
        }
        this.field172 = arg1;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIZ[B)V", line = 18)
    public final void method71(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (this.field171 < (long) arg1 + this.field172) {
            this.field174.seek(this.field171 + 1L);
            this.field174.write(1);
            throw new EOFException();
        }
        if (arg2) {
            this.field173 = null;
        }
        this.field174.write(arg3, arg0, arg1);
        this.field172 += arg1;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(B)J", line = 37)
    public final long method72(byte arg0) throws IOException {
        if (arg0 != 13) {
            this.method74((byte) 14);
        }
        return this.field174.length();
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)V", line = 48)
    public final void method73(int arg0) throws IOException {
        if (this.field174 != null) {
            this.field174.close();
            this.field174 = null;
        }
        if (arg0 > -62) {
            this.method74((byte) 118);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "finalize", descriptor = "()V", line = 63)
    protected final void finalize() throws Throwable {
        if (this.field174 != null) {
            System.out.println("Warning! fileondisk " + this.field173 + " not closed correctly using close(). Auto-closing instead. ");
            this.method73(-126);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(B)Ljava/io/File;", line = 75)
    public final File method74(byte arg0) {
        if (arg0 != 49) {
            this.field172 = 49L;
        }
        return this.field173;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IB[BI)I", line = 86)
    public final int method75(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != -127) {
            return -109;
        }
        int var5 = this.field174.read(arg2, arg0, arg3);
        if (var5 > 0) {
            this.field172 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
    public class8(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field174 = new RandomAccessFile(arg0, arg1);
        this.field171 = arg2;
        this.field173 = arg0;
        this.field172 = 0L;
        int var5 = this.field174.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field174.seek(0L);
            this.field174.write(var5);
        }
        this.field174.seek(0L);
    }
}
