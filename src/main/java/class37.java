import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class37 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "J")
    private long field470;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "J")
    private long field472;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Ljava/io/File;")
    private File field471;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field469;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method194(byte arg0) {
        return arg0 == 73 ? this.field471 : null;
    }

    @OriginalMember(owner = "client!eg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field469 != null) {
            System.out.println("Warning! fileondisk " + this.field471 + " not closed correctly using close(). Auto-closing instead. ");
            this.method197(58);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[BII)V")
    public final void method195(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field472 < (long) arg0 + this.field470) {
            this.field469.seek(this.field472);
            this.field469.write(1);
            throw new EOFException();
        }
        this.field469.write(arg1, arg3, arg0);
        this.field470 += (long) arg0;
        if (arg2 != -14962) {
            this.field470 = 49L;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III[B)I")
    public final int method196(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field469.read(arg3, arg0, arg2);
        if (var5 > arg1) {
            this.field470 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public final void method197(int arg0) throws IOException {
        int var2 = 123 % ((arg0 + 60) / 42);
        if (this.field469 != null) {
            this.field469.close();
            this.field469 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)J")
    public final long method198(byte arg0) throws IOException {
        return arg0 == -53 ? this.field469.length() : 50L;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IJ)V")
    public final void method199(int arg0, long arg1) throws IOException {
        this.field469.seek(arg1);
        if (arg0 == 0) {
            this.field470 = arg1;
        }
    }
}
