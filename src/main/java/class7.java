import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class7 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "J")
    private long field62;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "J")
    private long field64;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Ljava/io/File;")
    private File field63;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field61;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JZ)V")
    public final void method29(long arg0, boolean arg1) throws IOException {
        if (!arg1) {
            this.method30(false);
        }
        this.field61.seek(arg0);
        this.field62 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method30(boolean arg0) {
        if (!arg0) {
            this.method30(false);
        }
        return this.field63;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI[B)V")
    public final void method31(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1) {
            this.field61 = null;
        }
        if (this.field64 < (long) arg0 + this.field62) {
            this.field61.seek(this.field64);
            this.field61.write(1);
            throw new EOFException();
        } else {
            this.field61.write(arg3, arg2, arg0);
            this.field62 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field61 != null) {
            System.out.println("Warning! fileondisk " + this.field63 + " not closed correctly using close(). Auto-closing instead. ");
            this.method32((byte) -71);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public final void method32(byte arg0) throws IOException {
        if (this.field61 != null) {
            this.field61.close();
            this.field61 = null;
        }
        if (arg0 > -43) {
            this.field61 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[B)I")
    public final int method33(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 11150) {
            this.field64 = 6L;
        }
        int var5 = this.field61.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field62 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)J")
    public final long method34(int arg0) throws IOException {
        return arg0 == 0 ? this.field61.length() : -2L;
    }
}
