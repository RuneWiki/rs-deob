import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class335 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "J")
    private long field5219;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "J")
    private long field5220;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Ljava/io/File;")
    private File field5221;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5218;

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        if (this.field5218 != null) {
            System.out.println("Warning! fileondisk " + this.field5221 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2210((byte) 96);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 16)
    public final void method2210(byte arg0) throws IOException {
        if (this.field5218 != null) {
            this.field5218.close();
            this.field5218 = null;
        }
        if (arg0 != 96) {
            this.field5220 = 88L;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZI[B)V", line = 32)
    public final void method2211(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        if (!arg1) {
            return;
        }
        if (this.field5219 < ((long) arg0 + this.field5220)) {
            this.field5218.seek(this.field5219);
            this.field5218.write(1);
            throw new EOFException();
        } else {
            this.field5218.write(arg3, arg2, arg0);
            this.field5220 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)J", line = 51)
    public final long method2212(byte arg0) throws IOException {
        if (arg0 != -56) {
            this.field5220 = -118L;
        }
        return this.field5218.length();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI[BI)I", line = 64)
    public final int method2213(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != 66) {
            this.method2214(-52);
        }
        int var5 = this.field5218.read(arg2, arg1, arg3);
        if (var5 > 0) {
            this.field5220 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Ljava/io/File;", line = 80)
    public final File method2214(int arg0) {
        if (arg0 != 6348) {
            this.method2214(-119);
        }
        return this.field5221;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(JB)V", line = 92)
    public final void method2215(long arg0, byte arg1) throws IOException {
        if (arg1 >= 0) {
            this.method2214(-80);
        }
        this.field5218.seek(arg0);
        this.field5220 = arg0;
    }
}
