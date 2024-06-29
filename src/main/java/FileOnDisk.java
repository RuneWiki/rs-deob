import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class FileOnDisk {

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field394;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "J")
    private long field391;

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "Ljava/io/File;")
    private File field393;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "J")
    private long maxLength;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(III[B)I", line = 5)
    public final int method182(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field394.read(arg3, arg0, arg1);
        if (arg2 > ~var5) {
            this.field391 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B[BII)V", line = 19)
    public final void method183(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg2 + this.field391 > this.maxLength) {
            this.field394.seek(this.maxLength + 1L);
            this.field394.write(1);
            throw new EOFException();
        }
        this.field394.write(arg1, arg3, arg2);
        if (arg0 != 109) {
            this.method185(-112);
        }
        this.field391 += arg2;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)J", line = 39)
    public final long method184(byte arg0) throws IOException {
        int var2 = 60 % ((arg0 + 15) / 48);
        return this.field394.length();
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)Ljava/io/File;", line = 47)
    public final File method185(int arg0) {
        if (arg0 < 79) {
            this.field393 = null;
        }
        return this.field393;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Z)V", line = 59)
    public final void close(boolean arg0) throws IOException {
        this.field394.close();
        if (!arg0) {
            this.method185(-94);
        }
        this.field394 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(BJ)V", line = 71)
    public final void method187(byte arg0, long arg1) throws IOException {
        this.field394.seek(arg1);
        this.field391 = arg1;
        if (arg0 != 30) {
            this.method185(105);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "finalize", descriptor = "()V", line = 82)
    protected final void finalize() throws Throwable {
        if (this.field394 != null) {
            System.out.println("Warning! fileondisk " + this.field393 + " not closed correctly using close(). Auto-closing instead. ");
            this.close(true);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 93)
    public FileOnDisk(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field394 = new RandomAccessFile(arg0, arg1);
        this.field391 = 0L;
        this.field393 = arg0;
        this.maxLength = arg2;
        int var5 = this.field394.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field394.seek(0L);
            this.field394.write(var5);
        }
        this.field394.seek(0L);
    }
}
