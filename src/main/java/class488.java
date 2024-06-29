import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class488 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "J")
    private long field7389;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "J")
    private long field7390;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Ljava/io/File;")
    private File field7392;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field7391;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([BBII)I")
    public final int method2993(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 != -108) {
            return -60;
        }
        int var5 = this.field7391.read(arg0, arg2, arg3);
        if (var5 > 0) {
            this.field7389 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method2994(int arg0) throws IOException {
        if (arg0 == -30563 && this.field7391 != null) {
            this.field7391.close();
            this.field7391 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI[BI)V")
    public final void method2995(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg1 + this.field7389 > this.field7390) {
            this.field7391.seek(this.field7390);
            this.field7391.write(1);
            throw new EOFException();
        } else if (arg0) {
            this.field7391.write(arg2, arg3, arg1);
            this.field7389 += arg1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method2996(int arg0) {
        return arg0 < 99 ? null : this.field7392;
    }

    @OriginalMember(owner = "client!rh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field7391 != null) {
            System.out.println("Warning! fileondisk " + this.field7392 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2994(-30563);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)J")
    public final long method2997(byte arg0) throws IOException {
        int var2 = -112 % ((arg0 - 17) / 56);
        return this.field7391.length();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BJ)V")
    public final void method2998(byte arg0, long arg1) throws IOException {
        if (arg0 < 120) {
            this.method2996(12);
        }
        this.field7391.seek(arg1);
        this.field7389 = arg1;
    }
}
