import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class164 {

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "J")
    private long field2395;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "J")
    private long field2398;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "Ljava/io/File;")
    private File field2397;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2396;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)Ljava/io/File;", line = 6)
    public final File method1107(boolean arg0) {
        if (arg0) {
            this.method1107(true);
        }
        return this.field2397;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI[BI)V", line = 16)
    public final void method1108(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != -60) {
            this.field2395 = -103L;
        }
        if ((long) arg3 + this.field2398 > this.field2395) {
            this.field2396.seek(this.field2395);
            this.field2396.write(1);
            throw new EOFException();
        } else {
            this.field2396.write(arg2, arg1, arg3);
            this.field2398 += arg3;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 36)
    public final void method1109(byte arg0) throws IOException {
        if (arg0 != -63) {
            this.method1107(false);
        }
        if (this.field2396 != null) {
            this.field2396.close();
            this.field2396 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() throws Throwable {
        if (this.field2396 != null) {
            System.out.println("Warning! fileondisk " + this.field2397 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1109((byte) -63);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([BIII)I", line = 65)
    public final int method1110(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 15596) {
            this.method1107(true);
        }
        int var5 = this.field2396.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field2398 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(JZ)V", line = 81)
    public final void method1111(long arg0, boolean arg1) throws IOException {
        if (arg1) {
            this.field2395 = -96L;
        }
        this.field2396.seek(arg0);
        this.field2398 = arg0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)J", line = 92)
    public final long method1112(int arg0) throws IOException {
        if (arg0 <= 101) {
            this.method1107(false);
        }
        return this.field2396.length();
    }
}
