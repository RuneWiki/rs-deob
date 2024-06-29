import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class55 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "J")
    private long field723;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "J")
    private long field725;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljava/io/File;")
    private File field724;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field722;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J", line = 4)
    public final long method393(int arg0) throws IOException {
        if (arg0 != 29853) {
            this.field722 = (RandomAccessFile) null;
        }
        return this.field722.length();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Ljava/io/File;", line = 17)
    public final File method394(int arg0) {
        if (arg0 != 0) {
            this.field725 = 22L;
        }
        return this.field724;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 27)
    public final void method395(int arg0) throws IOException {
        if (this.field722 != null) {
            this.field722.close();
            this.field722 = null;
        }
        if (arg0 != 1) {
            this.method394(117);
        }
    }

    @OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V", line = 42)
    protected final void finalize() throws Throwable {
        if (this.field722 != null) {
            System.out.println("Warning! fileondisk " + this.field724 + " not closed correctly using close(). Auto-closing instead. ");
            this.method395(1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIIB)I", line = 55)
    public final int method396(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != -29) {
            this.field724 = (File) null;
        }
        int var5 = this.field722.read(arg0, arg1, arg2);
        if (var5 > 0) {
            this.field723 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB[BI)V", line = 71)
    public final void method397(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field723 <= this.field725) {
            int var5 = 121 % ((arg1 + 78) / 37);
            this.field722.write(arg2, arg3, arg0);
            this.field723 += (long) arg0;
        } else {
            this.field722.seek(this.field725);
            this.field722.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JB)V", line = 89)
    public final void method398(long arg0, byte arg1) throws IOException {
        this.field722.seek(arg0);
        if (arg1 == 22) {
            this.field723 = arg0;
        }
    }
}
