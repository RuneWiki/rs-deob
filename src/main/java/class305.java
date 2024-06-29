import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class305 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "J")
    private long field4947;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "J")
    private long field4949;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljava/io/File;")
    private File field4948;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4946;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method2065(byte arg0) {
        return arg0 <= 40 ? null : this.field4948;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)J")
    public final long method2066(boolean arg0) throws IOException {
        return arg0 ? -117L : this.field4946.length();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[BI)I")
    public final int method2067(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field4946.read(arg2, arg0, arg1);
        if (var5 > 0) {
            this.field4947 += (long) var5;
        }
        return arg3 == 0 ? var5 : 84;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JI)V")
    public final void method2068(long arg0, int arg1) throws IOException {
        if (arg1 != 16767) {
            this.method2065((byte) 60);
        }
        this.field4946.seek(arg0);
        this.field4947 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BIB)V")
    public final void method2069(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if ((long) arg0 + this.field4947 > this.field4949) {
            this.field4946.seek(this.field4949);
            this.field4946.write(1);
            throw new EOFException();
        }
        this.field4946.write(arg1, arg2, arg0);
        if (arg3 != 41) {
            this.field4947 = -41L;
        }
        this.field4947 += (long) arg0;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public final void method2070(byte arg0) throws IOException {
        int var2 = 1 % ((-arg0 - 7) / 47);
        if (this.field4946 != null) {
            this.field4946.close();
            this.field4946 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4946 != null) {
            System.out.println("Warning! fileondisk " + this.field4948 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2070((byte) 85);
        }
    }
}
