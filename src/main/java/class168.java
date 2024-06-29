import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class168 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2985;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "J")
    private long field2984;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "J")
    private long field2986;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljava/io/File;")
    private File field2987;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[BI)I")
    public final int method1197(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2985.read(arg2, arg0, arg3);
        if (var5 > 0) {
            this.field2986 += (long) var5;
        }
        if (arg1 != 0) {
            this.method1202(-18);
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IJ)V")
    public final void method1198(int arg0, long arg1) throws IOException {
        this.field2985.seek(arg1);
        if (arg0 == -2389) {
            this.field2986 = arg1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public final void method1199(byte arg0) throws IOException {
        if (this.field2985 != null) {
            this.field2985.close();
            this.field2985 = null;
        }
        if (arg0 < 7) {
            this.field2986 = -4L;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)J")
    public final long method1200(byte arg0) throws IOException {
        if (arg0 < 82) {
            this.field2987 = null;
        }
        return this.field2985.length();
    }

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2985 != null) {
            System.out.println("Warning! fileondisk " + this.field2987 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1199((byte) 124);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II[BI)V")
    public final void method1201(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field2984 < (long) arg0 + this.field2986) {
            this.field2985.seek(this.field2984 + 1L);
            this.field2985.write(1);
            throw new EOFException();
        }
        this.field2985.write(arg2, arg3, arg0);
        this.field2986 += (long) arg0;
        if (arg1 != 1) {
            this.method1202(-75);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class168(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2985 = new RandomAccessFile(arg0, arg1);
        this.field2984 = arg2;
        this.field2986 = 0L;
        this.field2987 = arg0;
        int var5 = this.field2985.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2985.seek(0L);
            this.field2985.write(var5);
        }
        this.field2985.seek(0L);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1202(int arg0) {
        if (arg0 < 121) {
            this.method1202(44);
        }
        return this.field2987;
    }
}
