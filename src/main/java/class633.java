import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class633 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "J")
    private long field9280;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "J")
    private long field9282;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljava/io/File;")
    private File field9283;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field9281;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JI)V", line = 3)
    public final void method3681(long arg0, int arg1) throws IOException {
        this.field9281.seek(arg0);
        this.field9282 = arg0;
        if (arg1 >= -76) {
            this.field9283 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        if (this.field9281 != null) {
            System.out.println("Warning! fileondisk " + this.field9283 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3685(-5948);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[BII)V", line = 26)
    public final void method3682(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (((long) arg2 + this.field9282) > this.field9280) {
            this.field9281.seek(this.field9280);
            this.field9281.write(1);
            throw new EOFException();
        }
        this.field9281.write(arg1, arg3, arg2);
        if (arg0 != -13) {
            this.field9283 = null;
        }
        this.field9282 += arg2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[B)I", line = 47)
    public final int method3683(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field9281.read(arg3, arg2, arg1);
        if (arg0 < 57) {
            this.field9280 = -49L;
        }
        if (var5 > 0) {
            this.field9282 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Ljava/io/File;", line = 62)
    public final File method3684(int arg0) {
        if (arg0 < 63) {
            this.method3684(-95);
        }
        return this.field9283;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 75)
    public final void method3685(int arg0) throws IOException {
        if (arg0 != -5948) {
            this.field9282 = 106L;
        }
        if (this.field9281 != null) {
            this.field9281.close();
            this.field9281 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)J", line = 93)
    public final long method3686(int arg0) throws IOException {
        int var2 = 103 / ((-arg0 - 68) / 32);
        return this.field9281.length();
    }
}
