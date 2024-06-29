import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class264 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "J")
    private long field4044;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "J")
    private long field4047;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/io/File;")
    private File field4045;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4046;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IJ)V", line = 4)
    public final void method1850(int arg0, long arg1) throws IOException {
        this.field4046.seek(arg1);
        if (arg0 != -17551) {
            this.method1853(-56);
        }
        this.field4044 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)J", line = 15)
    public final long method1851(int arg0) throws IOException {
        if (arg0 < 90) {
            this.method1853(-28);
        }
        return this.field4046.length();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI[BI)V", line = 26)
    public final void method1852(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 < 21) {
            this.field4046 = (RandomAccessFile) null;
        }
        if (((long) arg3 + this.field4044) > this.field4047) {
            this.field4046.seek(this.field4047);
            this.field4046.write(1);
            throw new EOFException();
        } else {
            this.field4046.write(arg2, arg1, arg3);
            this.field4044 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "finalize", descriptor = "()V", line = 45)
    protected final void finalize() throws Throwable {
        if (this.field4046 != null) {
            System.out.println("Warning! fileondisk " + this.field4045 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1855(0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Ljava/io/File;", line = 58)
    public final File method1853(int arg0) {
        if (arg0 != 7835) {
            this.method1853(58);
        }
        return this.field4045;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[BII)I", line = 71)
    public final int method1854(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field4046.read(arg1, arg3, arg2);
        if (arg0 > ~var5) {
            this.field4044 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 86)
    public final void method1855(int arg0) throws IOException {
        if (this.field4046 != null) {
            this.field4046.close();
            this.field4046 = null;
        }
        if (arg0 != 0) {
            this.field4045 = (File) null;
        }
    }
}
