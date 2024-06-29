import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class171 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "J")
    private long field3206;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "J")
    private long field3208;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Ljava/io/File;")
    private File field3207;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3209;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)J")
    public final long method1257(boolean arg0) throws IOException {
        if (!arg0) {
            this.method1261((byte) -40);
        }
        return this.field3209.length();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public final void method1258(int arg0) throws IOException {
        if (arg0 != 4222) {
            this.method1261((byte) 0);
        }
        if (this.field3209 != null) {
            this.field3209.close();
            this.field3209 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JB)V")
    public final void method1259(long arg0, byte arg1) throws IOException {
        this.field3209.seek(arg0);
        if (arg1 == -65) {
            this.field3206 = arg0;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[BI)I")
    public final int method1260(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != -1) {
            return -100;
        }
        int var5 = this.field3209.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field3206 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!o", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3209 != null) {
            System.out.println("Warning! fileondisk " + this.field3207 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1258(4222);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1261(byte arg0) {
        return arg0 >= -11 ? null : this.field3207;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BBII)V")
    public final void method1262(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 <= 18) {
            this.method1261((byte) -71);
        }
        if (this.field3208 < ((long) arg3 + this.field3206)) {
            this.field3209.seek(this.field3208 + 1L);
            this.field3209.write(1);
            throw new EOFException();
        } else {
            this.field3209.write(arg0, arg2, arg3);
            this.field3206 += (long) arg3;
        }
    }
}
