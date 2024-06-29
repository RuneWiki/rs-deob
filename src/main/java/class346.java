import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class346 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "J")
    private long field5184;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "J")
    private long field5185;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljava/io/File;")
    private File field5183;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5182;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZJ)V")
    public final void method2197(boolean arg0, long arg1) throws IOException {
        this.field5182.seek(arg1);
        if (!arg0) {
            this.field5184 = arg1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[BZ)I")
    public final int method2198(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        int var5 = this.field5182.read(arg2, arg0, arg1);
        if (arg3) {
            this.method2201(3);
        }
        if (var5 > 0) {
            this.field5184 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method2199(byte arg0) throws IOException {
        if (arg0 == -122 && this.field5182 != null) {
            this.field5182.close();
            this.field5182 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)J")
    public final long method2200(boolean arg0) throws IOException {
        if (arg0) {
            this.method2201(27);
        }
        return this.field5182.length();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method2201(int arg0) {
        if (arg0 != -21141) {
            this.method2201(-126);
        }
        return this.field5183;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIII)V")
    public final void method2202(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (((long) arg3 + this.field5184) > this.field5185) {
            this.field5182.seek(this.field5185);
            this.field5182.write(1);
            throw new EOFException();
        } else if (arg1 > 124) {
            this.field5182.write(arg0, arg2, arg3);
            this.field5184 += arg3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field5182 != null) {
            System.out.println("Warning! fileondisk " + this.field5183 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2199((byte) -122);
        }
    }
}
