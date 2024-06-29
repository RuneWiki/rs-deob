import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class135 {

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "J")
    private long field2165;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "J")
    private long field2166;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "Ljava/io/File;")
    private File field2167;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2164;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(JB)V")
    public final void method1033(long arg0, byte arg1) throws IOException {
        if (arg1 != 17) {
            this.method1035(98);
        }
        this.field2164.seek(arg0);
        this.field2166 = arg0;
    }

    @OriginalMember(owner = "client!fca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2164 != null) {
            System.out.println("Warning! fileondisk " + this.field2167 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1036(-110);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "([BIII)V")
    public final void method1034(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 <= 113) {
            this.method1035(8);
        }
        if (this.field2165 < (long) arg3 + this.field2166) {
            this.field2164.seek(this.field2165);
            this.field2164.write(1);
            throw new EOFException();
        } else {
            this.field2164.write(arg0, arg1, arg3);
            this.field2166 += arg3;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1035(int arg0) {
        return arg0 == -7763 ? this.field2167 : null;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
    public final void method1036(int arg0) throws IOException {
        if (this.field2164 != null) {
            this.field2164.close();
            this.field2164 = null;
        }
        int var2 = -22 / ((arg0 + 9) / 63);
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)J")
    public final long method1037(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method1035(53);
        }
        return this.field2164.length();
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "([BIII)I")
    public final int method1038(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 > -48) {
            return -97;
        }
        int var5 = this.field2164.read(arg0, arg3, arg1);
        if (var5 > 0) {
            this.field2166 += var5;
        }
        return var5;
    }
}
