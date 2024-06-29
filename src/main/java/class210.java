import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class210 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "J")
    private long field2710;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "J")
    private long field2712;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Ljava/io/File;")
    private File field2711;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2713;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BII)V")
    public final void method1301(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (((long) arg2 + this.field2712) > this.field2710) {
            this.field2713.seek(this.field2710);
            this.field2713.write(1);
            throw new EOFException();
        }
        if (arg0 != 1) {
            this.field2710 = 89L;
        }
        this.field2713.write(arg1, arg3, arg2);
        this.field2712 += arg2;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1302(int arg0) {
        return arg0 == 0 ? this.field2711 : null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public final void method1303(byte arg0) throws IOException {
        if (this.field2713 != null) {
            this.field2713.close();
            this.field2713 = null;
        }
        if (arg0 != -66) {
            this.method1302(-100);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(JI)V")
    public final void method1304(long arg0, int arg1) throws IOException {
        this.field2713.seek(arg0);
        if (arg1 != 0) {
            this.field2712 = -3L;
        }
        this.field2712 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2713 != null) {
            System.out.println("Warning! fileondisk " + this.field2711 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1303((byte) -66);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[BI)I")
    public final int method1305(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2713.read(arg2, arg1, arg3);
        if (var5 > arg0) {
            this.field2712 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)J")
    public final long method1306(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field2711 = null;
        }
        return this.field2713.length();
    }
}
