import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class178 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3589;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "J")
    private long field3588;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "J")
    private long field3590;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/io/File;")
    private File field3587;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public final void method1204(byte arg0) throws IOException {
        if (this.field3589 != null) {
            this.field3589.close();
            this.field3589 = null;
        }
        if (arg0 != 116) {
            this.field3590 = -68L;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BBI)V")
    public final void method1205(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field3590 > this.field3588) {
            this.field3589.seek(this.field3588 + 1L);
            this.field3589.write(1);
            throw new EOFException();
        } else {
            this.field3589.write(arg1, arg0, arg3);
            int var5 = -22 % ((22 - arg2) / 62);
            this.field3590 += arg3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1206(int arg0) {
        return arg0 >= -41 ? null : this.field3587;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)J")
    public final long method1207(int arg0) throws IOException {
        if (arg0 != -31783) {
            this.method1206(-101);
        }
        return this.field3589.length();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZII[B)I")
    public final int method1208(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0) {
            this.field3589 = null;
        }
        int var5 = this.field3589.read(arg3, arg1, arg2);
        if (var5 > 0) {
            this.field3590 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3589 != null) {
            System.out.println("Warning! fileondisk " + this.field3587 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1204((byte) 116);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class178(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3589 = new RandomAccessFile(arg0, arg1);
        this.field3588 = arg2;
        this.field3590 = 0L;
        this.field3587 = arg0;
        int var5 = this.field3589.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3589.seek(0L);
            this.field3589.write(var5);
        }
        this.field3589.seek(0L);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(JZ)V")
    public final void method1209(long arg0, boolean arg1) throws IOException {
        this.field3589.seek(arg0);
        this.field3590 = arg0;
        if (arg1) {
            this.method1206(-24);
        }
    }
}
