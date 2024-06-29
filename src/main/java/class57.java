import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class57 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "J")
    private long field952;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "J")
    private long field955;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Ljava/io/File;")
    private File field954;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field953;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III[B)V", line = 4)
    public final void method436(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 < 117) {
            this.method437(-26);
        }
        if (((long) arg2 + this.field955) <= this.field952) {
            this.field953.write(arg3, arg0, arg2);
            this.field955 += (long) arg2;
        } else {
            this.field953.seek(this.field952 + 1L);
            this.field953.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() throws Throwable {
        if (this.field953 != null) {
            System.out.println("Warning! fileondisk " + this.field954 + " not closed correctly using close(). Auto-closing instead. ");
            this.method441(32);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Ljava/io/File;", line = 38)
    public final File method437(int arg0) {
        if (arg0 != -24053) {
            this.field952 = -66L;
        }
        return this.field954;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IJ)V", line = 48)
    public final void method438(int arg0, long arg1) throws IOException {
        if (arg0 >= -114) {
            this.field955 = 92L;
        }
        this.field953.seek(arg1);
        this.field955 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)J", line = 62)
    public final long method439(int arg0) throws IOException {
        int var2 = 65 % ((51 - arg0) / 42);
        return this.field953.length();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[BZI)I", line = 71)
    public final int method440(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        int var5 = this.field953.read(arg1, arg3, arg0);
        if (!arg2) {
            this.field952 = 4L;
        }
        if (var5 > 0) {
            this.field955 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 87)
    public final void method441(int arg0) throws IOException {
        if (this.field953 != null) {
            this.field953.close();
            this.field953 = null;
        }
        if (arg0 < 31) {
            this.field955 = 9L;
        }
    }
}
