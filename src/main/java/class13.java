import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "J")
    private long field154;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "J")
    private long field156;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Ljava/io/File;")
    private File field157;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field155;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([BIII)I")
    public final int method99(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != 1) {
            this.field154 = 39L;
        }
        int var5 = this.field155.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field154 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public final void method100(int arg0) throws IOException {
        int var2 = 16 % ((67 - arg0) / 58);
        if (this.field155 != null) {
            this.field155.close();
            this.field155 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB[B)V")
    public final void method101(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (this.field156 < (long) arg0 + this.field154) {
            this.field155.seek(this.field156);
            this.field155.write(1);
            throw new EOFException();
        }
        this.field155.write(arg3, arg1, arg0);
        this.field154 += (long) arg0;
        if (arg2 <= 76) {
            this.field156 = 36L;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)J")
    public final long method102(int arg0) throws IOException {
        return arg0 == 15070 ? this.field155.length() : -13L;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(JB)V")
    public final void method103(long arg0, byte arg1) throws IOException {
        this.field155.seek(arg0);
        if (arg1 == 123) {
            this.field154 = arg0;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method104(byte arg0) {
        if (arg0 > -45) {
            this.field155 = null;
        }
        return this.field157;
    }

    @OriginalMember(owner = "client!lg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field155 != null) {
            System.out.println("Warning! fileondisk " + this.field157 + " not closed correctly using close(). Auto-closing instead. ");
            this.method100(-45);
        }
    }
}
