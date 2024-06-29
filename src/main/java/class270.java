import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class270 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "J")
    private long field4532;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "J")
    private long field4535;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Ljava/io/File;")
    private File field4534;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4533;

    @OriginalMember(owner = "client!ek", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field4533 != null) {
            System.out.println("Warning! fileondisk " + this.field4534 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1879(-9784);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)J", line = 16)
    public final long method1875(byte arg0) throws IOException {
        if (arg0 != -87) {
            this.method1876(-8);
        }
        return this.field4533.length();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Ljava/io/File;", line = 28)
    public final File method1876(int arg0) {
        if (arg0 != 0) {
            this.method1876(89);
        }
        return this.field4534;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IJ)V", line = 40)
    public final void method1877(int arg0, long arg1) throws IOException {
        this.field4533.seek(arg1);
        if (arg0 != 25409) {
            this.method1876(17);
        }
        this.field4535 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ[BI)I", line = 52)
    public final int method1878(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field4533.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field4535 += (long) var5;
        }
        if (arg1) {
            this.method1876(-67);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 67)
    public final void method1879(int arg0) throws IOException {
        if (arg0 != -9784) {
            this.method1876(37);
        }
        if (this.field4533 != null) {
            this.field4533.close();
            this.field4533 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[BBI)V", line = 86)
    public final void method1880(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != 52) {
            this.method1876(-34);
        }
        if ((long) arg3 + this.field4535 > this.field4532) {
            this.field4533.seek(this.field4532 + 1L);
            this.field4533.write(1);
            throw new EOFException();
        } else {
            this.field4533.write(arg1, arg0, arg3);
            this.field4535 += (long) arg3;
        }
    }
}
