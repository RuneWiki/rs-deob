import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class181 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3462;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Ljava/io/File;")
    private File field3460;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "J")
    private long field3461;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "J")
    private long field3463;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB[B)V")
    public final void method1172(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field3461 > this.field3463) {
            this.field3462.seek(this.field3463 + 1L);
            this.field3462.write(1);
            throw new EOFException();
        }
        this.field3462.write(arg3, arg0, arg1);
        this.field3461 += arg1;
        if (arg2 > -35) {
            this.method1176(6);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)J")
    public final long method1173(int arg0) throws IOException {
        if (arg0 <= 109) {
            this.field3462 = null;
        }
        return this.field3462.length();
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(JI)V")
    public final void method1174(long arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            this.method1176(-20);
        }
        this.field3462.seek(arg0);
        this.field3461 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BII)I")
    public final int method1175(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 0) {
            this.field3462 = null;
        }
        int var5 = this.field3462.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field3461 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!u", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3462 != null) {
            System.out.println("Warning! fileondisk " + this.field3460 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1177(true);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method1176(int arg0) {
        if (arg0 > -105) {
            this.method1176(21);
        }
        return this.field3460;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public final void method1177(boolean arg0) throws IOException {
        if (arg0 && this.field3462 != null) {
            this.field3462.close();
            this.field3462 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class181(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field3462 = new RandomAccessFile(arg0, arg1);
        this.field3460 = arg0;
        this.field3461 = 0L;
        this.field3463 = arg2;
        int var5 = this.field3462.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3462.seek(0L);
            this.field3462.write(var5);
        }
        this.field3462.seek(0L);
    }
}
