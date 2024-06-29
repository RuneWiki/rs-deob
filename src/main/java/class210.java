import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class210 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "J")
    private long field3321;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "J")
    private long field3323;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Ljava/io/File;")
    private File field3322;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3320;

    @OriginalMember(owner = "client!ai", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3320 != null) {
            System.out.println("Warning! fileondisk " + this.field3322 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1462((byte) 125);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(JB)V")
    public final void method1459(long arg0, byte arg1) throws IOException {
        this.field3320.seek(arg0);
        this.field3323 = arg0;
        if (arg1 != 114) {
            this.method1461(50);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[B)V")
    public final void method1460(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field3321 < (long) arg0 + this.field3323) {
            this.field3320.seek(this.field3321);
            this.field3320.write(1);
            throw new EOFException();
        } else if (arg2 == 0) {
            this.field3320.write(arg3, arg1, arg0);
            this.field3323 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1461(int arg0) {
        if (arg0 < 92) {
            this.method1461(16);
        }
        return this.field3322;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public final void method1462(byte arg0) throws IOException {
        if (this.field3320 != null) {
            this.field3320.close();
            this.field3320 = null;
        }
        if (arg0 <= 69) {
            this.method1461(108);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)J")
    public final long method1463(int arg0) throws IOException {
        return arg0 == 1 ? this.field3320.length() : -63L;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z[BII)I")
    public final int method1464(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0) {
            this.field3323 = -106L;
        }
        int var5 = this.field3320.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field3323 += (long) var5;
        }
        return var5;
    }
}
