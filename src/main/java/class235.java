import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class235 {

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "J")
    private long field3529;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "J")
    private long field3531;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Ljava/io/File;")
    private File field3530;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3532;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[BIZ)V")
    public final void method1417(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if ((long) arg0 + this.field3529 > this.field3531) {
            this.field3532.seek(this.field3531);
            this.field3532.write(1);
            throw new EOFException();
        } else {
            this.field3532.write(arg1, arg2, arg0);
            if (!arg3) {
                this.field3529 += (long) arg0;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1418(int arg0) {
        if (arg0 != 0) {
            this.method1418(127);
        }
        return this.field3530;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[BII)I")
    public final int method1419(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field3532.read(arg1, arg2, arg3);
        if (var5 > arg0) {
            this.field3529 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3532 != null) {
            System.out.println("Warning! fileondisk " + this.field3530 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1420((byte) 73);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public final void method1420(byte arg0) throws IOException {
        if (arg0 == 73 && this.field3532 != null) {
            this.field3532.close();
            this.field3532 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)J")
    public final long method1421(byte arg0) throws IOException {
        if (arg0 != 71) {
            this.method1418(-97);
        }
        return this.field3532.length();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(JZ)V")
    public final void method1422(long arg0, boolean arg1) throws IOException {
        this.field3532.seek(arg0);
        if (!arg1) {
            this.field3532 = null;
        }
        this.field3529 = arg0;
    }
}
