import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class39 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "J")
    private long field678;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "J")
    private long field680;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Ljava/io/File;")
    private File field679;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field677;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIII)V")
    public final void method321(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (((long) arg3 + this.field678) > this.field680) {
            this.field677.seek(this.field680);
            this.field677.write(1);
            throw new EOFException();
        }
        if (arg2 != -4938) {
            this.field679 = null;
        }
        this.field677.write(arg0, arg1, arg3);
        this.field678 += (long) arg3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JZ)V")
    public final void method322(long arg0, boolean arg1) throws IOException {
        this.field677.seek(arg0);
        this.field678 = arg0;
        if (arg1) {
            this.method326((byte) -73);
        }
    }

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field677 != null) {
            System.out.println("Warning! fileondisk " + this.field679 + " not closed correctly using close(). Auto-closing instead. ");
            this.method325((byte) -96);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)J")
    public final long method323(byte arg0) throws IOException {
        return arg0 == 48 ? this.field677.length() : 106L;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB[BI)I")
    public final int method324(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field677.read(arg2, arg0, arg3);
        if (var5 > 0) {
            this.field678 += (long) var5;
        }
        if (arg1 >= -68) {
            this.method326((byte) 50);
        }
        return var5;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public final void method325(byte arg0) throws IOException {
        if (arg0 != -96) {
            this.field679 = null;
        }
        if (this.field677 != null) {
            this.field677.close();
            this.field677 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Ljava/io/File;")
    public final File method326(byte arg0) {
        return arg0 < 90 ? null : this.field679;
    }
}
