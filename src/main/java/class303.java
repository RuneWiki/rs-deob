import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class303 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "J")
    private long field5375;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "J")
    private long field5376;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/io/File;")
    private File field5377;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5378;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BIB)I", line = 5)
    public final int method2144(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        int var5 = -94 % ((-arg3 - 49) / 56);
        int var6 = this.field5378.read(arg1, arg2, arg0);
        if (var6 > 0) {
            this.field5375 += (long) var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Ljava/io/File;", line = 18)
    public final File method2145(int arg0) {
        if (arg0 != 1) {
            this.method2145(126);
        }
        return this.field5377;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JI)V", line = 28)
    public final void method2146(long arg0, int arg1) throws IOException {
        this.field5378.seek(arg0);
        if (arg1 == 0) {
            this.field5375 = arg0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)J", line = 42)
    public final long method2147(byte arg0) throws IOException {
        return arg0 == 109 ? this.field5378.length() : 20L;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI[BI)V", line = 54)
    public final void method2148(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field5376 < ((long) arg3 + this.field5375)) {
            this.field5378.seek(this.field5376 + 1L);
            this.field5378.write(1);
            throw new EOFException();
        }
        if (arg0 != -116) {
            this.field5377 = (File) null;
        }
        this.field5378.write(arg2, arg1, arg3);
        this.field5375 += (long) arg3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 73)
    public final void method2149(boolean arg0) throws IOException {
        if (!arg0) {
            this.field5376 = -109L;
        }
        if (this.field5378 != null) {
            this.field5378.close();
            this.field5378 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 88)
    protected final void finalize() throws Throwable {
        if (this.field5378 != null) {
            System.out.println("Warning! fileondisk " + this.field5377 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2149(true);
        }
    }
}
