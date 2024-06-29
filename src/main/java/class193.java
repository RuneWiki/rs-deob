import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class193 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3596;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "J")
    private long field3598;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "J")
    private long field3597;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Ljava/io/File;")
    private File field3595;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([BIIZ)I")
    public final int method1229(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if (!arg3) {
            return 38;
        }
        int var5 = this.field3596.read(arg0, arg2, arg1);
        if (var5 > 0) {
            this.field3598 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public final void method1230(byte arg0) throws IOException {
        if (arg0 >= -47) {
            this.field3596 = null;
        }
        if (this.field3596 != null) {
            this.field3596.close();
            this.field3596 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3596 != null) {
            System.out.println("Warning! fileondisk " + this.field3595 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1230((byte) -62);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method1231(boolean arg0) {
        return arg0 ? this.field3595 : null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)J")
    public final long method1232(int arg0) throws IOException {
        return arg0 == 1 ? this.field3596.length() : -10L;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[BB)V")
    public final void method1233(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if ((long) arg0 + this.field3598 > this.field3597) {
            this.field3596.seek(this.field3597 + 1L);
            this.field3596.write(1);
            throw new EOFException();
        } else if (arg3 == -95) {
            this.field3596.write(arg2, arg1, arg0);
            this.field3598 += arg0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class193(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field3596 = new RandomAccessFile(arg0, arg1);
        this.field3598 = 0L;
        this.field3597 = arg2;
        this.field3595 = arg0;
        int var5 = this.field3596.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3596.seek(0L);
            this.field3596.write(var5);
        }
        this.field3596.seek(0L);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(JI)V")
    public final void method1234(long arg0, int arg1) throws IOException {
        if (arg1 != -1) {
            this.field3598 = -105L;
        }
        this.field3596.seek(arg0);
        this.field3598 = arg0;
    }
}
