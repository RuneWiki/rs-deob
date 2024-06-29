import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class198 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3530;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Ljava/io/File;")
    private File field3528;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "J")
    private long field3529;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "J")
    private long field3527;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)J")
    public final long method1240(byte arg0) throws IOException {
        return arg0 == -74 ? this.field3530.length() : -79L;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IJ)V")
    public final void method1241(int arg0, long arg1) throws IOException {
        if (arg0 < -29) {
            this.field3530.seek(arg1);
            this.field3529 = arg1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)I")
    public final int method1242(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 6541) {
            this.field3527 = -19L;
        }
        int var5 = this.field3530.read(arg3, arg2, arg0);
        if (var5 > 0) {
            this.field3529 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3530 != null) {
            System.out.println("Warning! fileondisk " + this.field3528 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1243((byte) 63);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public final void method1243(byte arg0) throws IOException {
        int var2 = 103 % ((arg0 - 1) / 59);
        if (this.field3530 != null) {
            this.field3530.close();
            this.field3530 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B[BII)V")
    public final void method1244(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != -64) {
            this.method1245((byte) -47);
        }
        if (this.field3527 < (long) arg3 + this.field3529) {
            this.field3530.seek(this.field3527 + 1L);
            this.field3530.write(1);
            throw new EOFException();
        } else {
            this.field3530.write(arg1, arg2, arg3);
            this.field3529 += arg3;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)Ljava/io/File;")
    public final File method1245(byte arg0) {
        if (arg0 > -19) {
            this.field3527 = 93L;
        }
        return this.field3528;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class198(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3530 = new RandomAccessFile(arg0, arg1);
        this.field3528 = arg0;
        this.field3529 = 0L;
        this.field3527 = arg2;
        int var5 = this.field3530.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3530.seek(0L);
            this.field3530.write(var5);
        }
        this.field3530.seek(0L);
    }
}
