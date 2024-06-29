import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class39 {

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field523;

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "J")
    private long field525;

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "Ljava/io/File;")
    private File field522;

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "J")
    private long field524;

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(III[B)V", line = 6)
    public final void method253(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg2 + this.field525 > this.field524) {
            this.field523.seek(this.field524 + 1L);
            this.field523.write(1);
            throw new EOFException();
        } else {
            this.field523.write(arg3, arg0, arg2);
            if (arg1 == 1) {
                this.field525 += arg2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Z)Ljava/io/File;", line = 24)
    public final File method254(boolean arg0) {
        return arg0 ? (File) null : this.field522;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "([BIII)I", line = 35)
    public final int method255(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field523.read(arg0, arg1, arg3);
        if (arg2 < var5) {
            this.field525 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(B)J", line = 47)
    public final long method256(byte arg0) throws IOException {
        if (arg0 != 24) {
            this.method254(false);
        }
        return this.field523.length();
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(I)V", line = 57)
    public final void method257(int arg0) throws IOException {
        if (this.field523 != null) {
            this.field523.close();
            this.field523 = null;
        }
        if (arg0 != 23580) {
            this.field522 = null;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "finalize", descriptor = "()V", line = 73)
    protected final void finalize() throws Throwable {
        if (this.field523 != null) {
            System.out.println("Warning! fileondisk " + this.field522 + " not closed correctly using close(). Auto-closing instead. ");
            this.method257(23580);
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(BJ)V", line = 87)
    public final void method258(byte arg0, long arg1) throws IOException {
        this.field523.seek(arg1);
        if (arg0 >= -73) {
            this.method254(true);
        }
        this.field525 = arg1;
    }

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 97)
    public class39(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field523 = new RandomAccessFile(arg0, arg1);
        this.field525 = 0L;
        this.field522 = arg0;
        this.field524 = arg2;
        int var5 = this.field523.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field523.seek(0L);
            this.field523.write(var5);
        }
        this.field523.seek(0L);
    }
}
