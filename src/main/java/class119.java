import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class119 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "J")
    private long field2122;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "J")
    private long field2124;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Ljava/io/File;")
    private File field2123;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2125;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[B)I")
    public final int method847(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field2125.read(arg3, arg0, arg1);
        if (var5 > arg2) {
            this.field2122 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZ[B)V")
    public final void method848(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (this.field2124 < (long) arg0 + this.field2122) {
            this.field2125.seek(this.field2124 + 1L);
            this.field2125.write(1);
            throw new EOFException();
        }
        this.field2125.write(arg3, arg1, arg0);
        this.field2122 += (long) arg0;
        if (!arg2) {
            this.field2122 = 33L;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public final void method849(int arg0) throws IOException {
        if (this.field2125 != null) {
            this.field2125.close();
            this.field2125 = null;
        }
        int var2 = -104 % ((arg0 - 18) / 34);
    }

    @OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2125 != null) {
            System.out.println("Warning! fileondisk " + this.field2123 + " not closed correctly using close(). Auto-closing instead. ");
            this.method849(-115);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)J")
    public final long method850(int arg0) throws IOException {
        return arg0 == -19387 ? this.field2125.length() : -41L;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)V")
    public final void method851(long arg0, int arg1) throws IOException {
        if (arg1 <= 20) {
            this.field2122 = 68L;
        }
        this.field2125.seek(arg0);
        this.field2122 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method852(int arg0) {
        if (arg0 != 0) {
            this.field2125 = null;
        }
        return this.field2123;
    }
}
