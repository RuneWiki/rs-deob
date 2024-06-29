import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class350 {

    @OriginalMember(owner = "client!im", name = "b", descriptor = "J")
    private long field5080;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "J")
    private long field5082;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Ljava/io/File;")
    private File field5081;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5079;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public final void method2304(int arg0) throws IOException {
        if (arg0 != -17644) {
            this.method2305(-1);
        }
        if (this.field5079 != null) {
            this.field5079.close();
            this.field5079 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field5079 != null) {
            System.out.println("Warning! fileondisk " + this.field5081 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2304(-17644);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method2305(int arg0) {
        return arg0 == -1 ? this.field5081 : null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z[BII)V")
    public final void method2306(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0) {
            return;
        }
        if (this.field5082 < (long) arg2 + this.field5080) {
            this.field5079.seek(this.field5082);
            this.field5079.write(1);
            throw new EOFException();
        } else {
            this.field5079.write(arg1, arg3, arg2);
            this.field5080 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)J")
    public final long method2307(byte arg0) throws IOException {
        int var2 = 106 % ((arg0 - 39) / 47);
        return this.field5079.length();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([BIII)I")
    public final int method2308(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -5921) {
            this.method2305(-38);
        }
        int var5 = this.field5079.read(arg0, arg3, arg1);
        if (var5 > 0) {
            this.field5080 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IJ)V")
    public final void method2309(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            this.field5081 = null;
        }
        this.field5079.seek(arg1);
        this.field5080 = arg1;
    }
}
