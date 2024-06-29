import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class453 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "J")
    private long field6631;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "J")
    private long field6633;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Ljava/io/File;")
    private File field6632;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6630;

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field6630 != null) {
            System.out.println("Warning! fileondisk " + this.field6632 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2659(-1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III[B)I")
    public final int method2657(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field6630.read(arg3, arg0, arg1);
        int var6 = 81 / ((63 - arg2) / 33);
        if (var5 > 0) {
            this.field6633 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(JB)V")
    public final void method2658(long arg0, byte arg1) throws IOException {
        this.field6630.seek(arg0);
        this.field6633 = arg0;
        if (arg1 != 36) {
            this.method2661(92);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public final void method2659(int arg0) throws IOException {
        if (this.field6630 != null) {
            this.field6630.close();
            this.field6630 = null;
        }
        if (arg0 != -1) {
            this.method2661(117);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)J")
    public final long method2660(byte arg0) throws IOException {
        if (arg0 != -51) {
            this.method2661(-125);
        }
        return this.field6630.length();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method2661(int arg0) {
        if (arg0 != -27008) {
            this.method2661(121);
        }
        return this.field6632;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB[BI)V")
    public final void method2662(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (((long) arg0 + this.field6633) > this.field6631) {
            this.field6630.seek(this.field6631);
            this.field6630.write(1);
            throw new EOFException();
        } else {
            this.field6630.write(arg2, arg3, arg0);
            this.field6633 += arg0;
            int var5 = 83 / ((-arg1 - 15) / 43);
        }
    }
}
