import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class377 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "J")
    private long field5685;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "J")
    private long field5686;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Ljava/io/File;")
    private File field5687;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5684;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I[BII)I", line = 4)
    public final int method2497(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field5684.read(arg1, arg2, arg0);
        if (var5 > arg3) {
            this.field5685 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)J", line = 16)
    public final long method2498(int arg0) throws IOException {
        if (arg0 > -91) {
            this.field5685 = 71L;
        }
        return this.field5684.length();
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 26)
    public final void method2499(int arg0) throws IOException {
        if (this.field5684 != null) {
            this.field5684.close();
            this.field5684 = null;
        }
        if (arg0 != 1) {
            this.field5686 = 50L;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(JI)V", line = 41)
    public final void method2500(long arg0, int arg1) throws IOException {
        this.field5684.seek(arg0);
        if (arg1 != -16156) {
            this.field5687 = null;
        }
        this.field5685 = arg0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([BIII)V", line = 52)
    public final void method2501(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != 1) {
            this.method2502((byte) 32);
        }
        if (((long) arg3 + this.field5685) > this.field5686) {
            this.field5684.seek(this.field5686);
            this.field5684.write(1);
            throw new EOFException();
        } else {
            this.field5684.write(arg0, arg2, arg3);
            this.field5685 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!an", name = "finalize", descriptor = "()V", line = 74)
    protected final void finalize() throws Throwable {
        if (this.field5684 != null) {
            System.out.println("Warning! fileondisk " + this.field5687 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2499(1);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Ljava/io/File;", line = 89)
    public final File method2502(byte arg0) {
        if (arg0 != -114) {
            this.method2502((byte) -12);
        }
        return this.field5687;
    }
}
