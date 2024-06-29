import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class302 {

    @OriginalMember(owner = "client!st", name = "b", descriptor = "J")
    private long field4415;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "J")
    private long field4416;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Ljava/io/File;")
    private File field4414;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4417;

    @OriginalMember(owner = "client!st", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4417 != null) {
            System.out.println("Warning! fileondisk " + this.field4414 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1844((byte) 109);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(JB)V")
    public final void method1841(long arg0, byte arg1) throws IOException {
        this.field4417.seek(arg0);
        if (arg1 != -99) {
            this.field4416 = -65L;
        }
        this.field4416 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IB[BI)I")
    public final int method1842(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 39) {
            this.method1846((byte) 75);
        }
        int var5 = this.field4417.read(arg2, arg0, arg3);
        if (var5 > 0) {
            this.field4416 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)J")
    public final long method1843(int arg0) throws IOException {
        return arg0 <= 15 ? 55L : this.field4417.length();
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public final void method1844(byte arg0) throws IOException {
        int var2 = 116 % ((arg0 - 24) / 55);
        if (this.field4417 != null) {
            this.field4417.close();
            this.field4417 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BII[B)V")
    public final void method1845(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field4415 < ((long) arg2 + this.field4416)) {
            this.field4417.seek(this.field4415);
            this.field4417.write(1);
            throw new EOFException();
        }
        if (arg0 > -86) {
            this.field4414 = null;
        }
        this.field4417.write(arg3, arg1, arg2);
        this.field4416 += arg2;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method1846(byte arg0) {
        if (arg0 < 4) {
            this.method1846((byte) -102);
        }
        return this.field4414;
    }
}
