import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class51 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "J")
    private long field637;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "J")
    private long field640;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Ljava/io/File;")
    private File field639;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field638;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BIB)I", line = 6)
    public final int method312(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 < 22) {
            this.method315((byte) -48);
        }
        int var5 = this.field638.read(arg1, arg2, arg0);
        if (var5 > 0) {
            this.field637 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B[BII)V", line = 21)
    public final void method313(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (((long) arg3 + this.field637) > this.field640) {
            this.field638.seek(this.field640);
            this.field638.write(1);
            throw new EOFException();
        }
        this.field638.write(arg1, arg2, arg3);
        if (arg0 != -74) {
            this.method315((byte) -2);
        }
        this.field637 += (long) arg3;
    }

    @OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        if (this.field638 != null) {
            System.out.println("Warning! fileondisk " + this.field639 + " not closed correctly using close(). Auto-closing instead. ");
            this.method316(1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)J", line = 54)
    public final long method314(int arg0) throws IOException {
        if (arg0 != -10662) {
            this.field637 = 37L;
        }
        return this.field638.length();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Ljava/io/File;", line = 65)
    public final File method315(byte arg0) {
        int var2 = -44 / ((36 - arg0) / 35);
        return this.field639;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 73)
    public final void method316(int arg0) throws IOException {
        if (this.field638 != null) {
            this.field638.close();
            this.field638 = null;
        }
        if (arg0 != 1) {
            this.field640 = -125L;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(JB)V", line = 89)
    public final void method317(long arg0, byte arg1) throws IOException {
        int var4 = 98 / ((arg1 + 47) / 46);
        this.field638.seek(arg0);
        this.field637 = arg0;
    }
}
