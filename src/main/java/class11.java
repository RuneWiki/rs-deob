import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class11 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "J")
    private long field156;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "J")
    private long field157;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Ljava/io/File;")
    private File field158;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field159;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Ljava/io/File;", line = 4)
    public final File method84(int arg0) {
        return arg0 == -1 ? this.field158 : null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IJ)V", line = 15)
    public final void method85(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            this.field158 = null;
        }
        this.field159.seek(arg1);
        this.field157 = arg1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 27)
    public final void method86(byte arg0) throws IOException {
        int var2 = -110 / ((-arg0 - 55) / 48);
        if (this.field159 != null) {
            this.field159.close();
            this.field159 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V", line = 42)
    protected final void finalize() throws Throwable {
        if (this.field159 != null) {
            System.out.println("Warning! fileondisk " + this.field158 + " not closed correctly using close(). Auto-closing instead. ");
            this.method86((byte) -106);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BIII)V", line = 55)
    public final void method87(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (((long) arg1 + this.field157) > this.field156) {
            this.field159.seek(this.field156);
            this.field159.write(1);
            throw new EOFException();
        }
        if (arg3 < 28) {
            this.field158 = null;
        }
        this.field159.write(arg0, arg2, arg1);
        this.field157 += (long) arg1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I[BBI)I", line = 74)
    public final int method88(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 < 8) {
            this.field156 = -67L;
        }
        int var5 = this.field159.read(arg1, arg0, arg3);
        if (var5 > 0) {
            this.field157 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)J", line = 89)
    public final long method89(byte arg0) throws IOException {
        if (arg0 != -45) {
            this.field156 = 92L;
        }
        return this.field159.length();
    }
}
