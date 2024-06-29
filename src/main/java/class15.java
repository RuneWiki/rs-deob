import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 {

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field144;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "J")
    private long field143;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "J")
    private long field145;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "Ljava/io/File;")
    private File field146;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)Ljava/io/File;", line = 7)
    public final File method81(int arg0) {
        return arg0 == -1 ? this.field146 : (File) null;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)J", line = 17)
    public final long method82(int arg0) throws IOException {
        if (arg0 != -21709) {
            this.field146 = null;
        }
        return this.field144.length();
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(II[BI)V", line = 27)
    public final void method83(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field143 < (long) arg0 + this.field145) {
            this.field144.seek(this.field143 + 1L);
            this.field144.write(1);
            throw new EOFException();
        }
        this.field144.write(arg2, arg1, arg0);
        if (arg3 != 0) {
            this.method81(-6);
        }
        this.field145 += arg0;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BJ)V", line = 46)
    public final void method84(byte arg0, long arg1) throws IOException {
        this.field144.seek(arg1);
        this.field145 = arg1;
        if (arg0 <= 45) {
            this.field144 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "finalize", descriptor = "()V", line = 58)
    protected final void finalize() throws Throwable {
        if (this.field144 != null) {
            System.out.println("Warning! fileondisk " + this.field146 + " not closed correctly using close(). Auto-closing instead. ");
            this.method85(-1);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(I)V", line = 70)
    public final void method85(int arg0) throws IOException {
        if (this.field144 != null) {
            this.field144.close();
            this.field144 = null;
        }
        if (arg0 != -1) {
            this.method81(-41);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(III[B)I", line = 87)
    public final int method86(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 >= -32) {
            this.method81(25);
        }
        int var5 = this.field144.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field145 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
    public class15(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field144 = new RandomAccessFile(arg0, arg1);
        this.field143 = arg2;
        this.field145 = 0L;
        this.field146 = arg0;
        int var5 = this.field144.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field144.seek(0L);
            this.field144.write(var5);
        }
        this.field144.seek(0L);
    }
}
