import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class287 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "J")
    private long field4021;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "J")
    private long field4022;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Ljava/io/File;")
    private File field4023;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4020;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BJ)V")
    public final void method1872(byte arg0, long arg1) throws IOException {
        this.field4020.seek(arg1);
        this.field4022 = arg1;
        int var4 = 4 % ((23 - arg0) / 52);
    }

    @OriginalMember(owner = "client!mi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4020 != null) {
            System.out.println("Warning! fileondisk " + this.field4023 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1877(0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([BIII)V")
    public final void method1873(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if ((long) arg1 + this.field4022 > this.field4021) {
            this.field4020.seek(this.field4021);
            this.field4020.write(1);
            throw new EOFException();
        }
        this.field4020.write(arg0, arg3, arg1);
        this.field4022 += (long) arg1;
        if (arg2 != -16644) {
            this.field4023 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1874(byte arg0) {
        return arg0 >= -89 ? null : this.field4023;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[BI)I")
    public final int method1875(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field4020.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field4022 += (long) var5;
        }
        if (arg1 != -10022) {
            this.method1874((byte) -106);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)J")
    public final long method1876(int arg0) throws IOException {
        if (arg0 != 13136) {
            this.field4020 = null;
        }
        return this.field4020.length();
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public final void method1877(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field4020 = null;
        }
        if (this.field4020 != null) {
            this.field4020.close();
            this.field4020 = null;
        }
    }
}
