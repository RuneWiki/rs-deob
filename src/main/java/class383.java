import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class383 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
    private long field5461;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "J")
    private long field5463;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/io/File;")
    private File field5464;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5462;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII[B)I")
    public final int method2309(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 46) {
            return -29;
        }
        int var5 = this.field5462.read(arg3, arg2, arg1);
        if (var5 > 0) {
            this.field5461 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[B)V")
    public final void method2310(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 401) {
            this.method2312(67);
        }
        if (((long) arg0 + this.field5461) > this.field5463) {
            this.field5462.seek(this.field5463);
            this.field5462.write(1);
            throw new EOFException();
        } else {
            this.field5462.write(arg3, arg2, arg0);
            this.field5461 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method2311(byte arg0) throws IOException {
        if (arg0 != -127) {
            this.field5461 = 76L;
        }
        if (this.field5462 != null) {
            this.field5462.close();
            this.field5462 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field5462 != null) {
            System.out.println("Warning! fileondisk " + this.field5464 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2311((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method2312(int arg0) {
        if (arg0 <= 38) {
            this.field5461 = 65L;
        }
        return this.field5464;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)J")
    public final long method2313(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field5463 = -27L;
        }
        return this.field5462.length();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(JI)V")
    public final void method2314(long arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            this.method2312(8);
        }
        this.field5462.seek(arg0);
        this.field5461 = arg0;
    }
}
