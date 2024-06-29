import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class56 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "J")
    private long field821;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "J")
    private long field824;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Ljava/io/File;")
    private File field822;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field823;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method360(int arg0) throws IOException {
        if (arg0 != -22922) {
            this.method364((byte) -85);
        }
        if (this.field823 != null) {
            this.field823.close();
            this.field823 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[BIB)I")
    public final int method361(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != -38) {
            return -75;
        }
        int var5 = this.field823.read(arg1, arg0, arg2);
        if (var5 > 0) {
            this.field824 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZJ)V")
    public final void method362(boolean arg0, long arg1) throws IOException {
        if (arg0) {
            this.field823.seek(arg1);
            this.field824 = arg1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[B)V")
    public final void method363(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field821 < (long) arg2 + this.field824) {
            this.field823.seek(this.field821);
            this.field823.write(1);
            throw new EOFException();
        }
        this.field823.write(arg3, arg0, arg2);
        this.field824 += (long) arg2;
        if (arg1 != -1) {
            this.method364((byte) -111);
        }
    }

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field823 != null) {
            System.out.println("Warning! fileondisk " + this.field822 + " not closed correctly using close(). Auto-closing instead. ");
            this.method360(-22922);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method364(byte arg0) {
        if (arg0 < 83) {
            this.field822 = null;
        }
        return this.field822;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)J")
    public final long method365(int arg0) throws IOException {
        if (arg0 <= 89) {
            this.method364((byte) -74);
        }
        return this.field823.length();
    }
}
