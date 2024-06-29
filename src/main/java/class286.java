import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class286 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4831;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "J")
    private long field4832;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "J")
    private long field4834;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Ljava/io/File;")
    private File field4833;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V", line = 4)
    public final void method1973(long arg0, int arg1) throws IOException {
        this.field4831.seek(arg0);
        int var4 = -80 / ((arg1 - 11) / 58);
        this.field4832 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)J", line = 14)
    public final long method1974(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field4831 = (RandomAccessFile) null;
        }
        return this.field4831.length();
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Ljava/io/File;", line = 26)
    public final File method1975(int arg0) {
        if (arg0 != -1) {
            this.field4833 = (File) null;
        }
        return this.field4833;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BBI)I", line = 36)
    public final int method1976(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != 109) {
            this.field4834 = -78L;
        }
        int var5 = this.field4831.read(arg1, arg0, arg3);
        if (var5 > 0) {
            this.field4832 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 53)
    public final void method1977(int arg0) throws IOException {
        if (arg0 <= 86) {
            this.field4831 = (RandomAccessFile) null;
        }
        if (this.field4831 != null) {
            this.field4831.close();
            this.field4831 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 68)
    protected final void finalize() throws Throwable {
        if (this.field4831 != null) {
            System.out.println("Warning! fileondisk " + this.field4833 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1977(88);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 81)
    public class286(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field4831 = new RandomAccessFile(arg0, arg1);
        this.field4832 = 0L;
        this.field4834 = arg2;
        this.field4833 = arg0;
        int var5 = this.field4831.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4831.seek(0L);
            this.field4831.write(var5);
        }
        this.field4831.seek(0L);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BIZ)V", line = 114)
    public final void method1978(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if (this.field4834 < (long) arg2 + this.field4832) {
            this.field4831.seek(this.field4834 + 1L);
            this.field4831.write(1);
            throw new EOFException();
        }
        this.field4831.write(arg1, arg0, arg2);
        if (!arg3) {
            this.method1975(13);
        }
        this.field4832 += (long) arg2;
    }
}
