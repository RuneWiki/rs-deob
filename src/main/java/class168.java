import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class168 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "J")
    private long field2557;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "J")
    private long field2558;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Ljava/io/File;")
    private File field2556;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2555;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)J")
    public final long method1197(int arg0) throws IOException {
        int var2 = 101 / ((-arg0 - 53) / 63);
        return this.field2555.length();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(JI)V")
    public final void method1198(long arg0, int arg1) throws IOException {
        this.field2555.seek(arg0);
        this.field2557 = arg0;
        if (arg1 != 0) {
            this.field2556 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1199(byte arg0) {
        if (arg0 != 98) {
            this.field2558 = 61L;
        }
        return this.field2556;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[BI)V")
    public final void method1200(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field2558 < (long) arg0 + this.field2557) {
            this.field2555.seek(this.field2558);
            this.field2555.write(1);
            throw new EOFException();
        }
        if (arg1 < 54) {
            this.method1199((byte) 55);
        }
        this.field2555.write(arg2, arg3, arg0);
        this.field2557 += (long) arg0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ[BI)I")
    public final int method1201(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2555.read(arg2, arg0, arg3);
        if (var5 > 0) {
            this.field2557 += (long) var5;
        }
        if (arg1) {
            this.method1199((byte) 70);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2555 != null) {
            System.out.println("Warning! fileondisk " + this.field2556 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1202(0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method1202(int arg0) throws IOException {
        if (this.field2555 != null) {
            this.field2555.close();
            this.field2555 = null;
        }
        if (arg0 != 0) {
            this.method1199((byte) 70);
        }
    }
}
