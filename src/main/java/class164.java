import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class164 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3400;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/io/File;")
    private File field3403;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "J")
    private long field3402;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "J")
    private long field3401;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ)V")
    public final void method1170(byte arg0, long arg1) throws IOException {
        if (arg0 != 17) {
            this.field3401 = 127L;
        }
        this.field3400.seek(arg1);
        this.field3401 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3400 != null) {
            System.out.println("Warning! fileondisk " + this.field3403 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1173(48);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB[B)I")
    public final int method1171(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        int var5 = this.field3400.read(arg3, arg0, arg1);
        int var6 = -27 % ((arg2 - 75) / 34);
        if (var5 > 0) {
            this.field3401 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)J")
    public final long method1172(int arg0) throws IOException {
        return arg0 == 1 ? this.field3400.length() : -98L;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method1173(int arg0) throws IOException {
        if (this.field3400 != null) {
            this.field3400.close();
            this.field3400 = null;
        }
        int var2 = -123 / ((arg0 + 59) / 59);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method1174(int arg0) {
        if (arg0 != 0) {
            this.method1174(-7);
        }
        return this.field3403;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class164(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field3400 = new RandomAccessFile(arg0, arg1);
        this.field3403 = arg0;
        this.field3402 = arg2;
        this.field3401 = 0L;
        int var5 = this.field3400.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3400.seek(0L);
            this.field3400.write(var5);
        }
        this.field3400.seek(0L);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BBII)V")
    public final void method1175(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (this.field3402 < (long) arg3 + this.field3401) {
            this.field3400.seek(this.field3402 + 1L);
            this.field3400.write(1);
            throw new EOFException();
        }
        this.field3400.write(arg0, arg2, arg3);
        this.field3401 += arg3;
        if (arg1 != -91) {
            this.method1174(-79);
        }
    }
}
