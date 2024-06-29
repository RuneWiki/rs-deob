import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class91 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "J")
    private long field1272;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "J")
    private long field1274;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Ljava/io/File;")
    private File field1273;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1275;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[B)I")
    public final int method591(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = -103 / ((-arg2 - 9) / 57);
        int var6 = this.field1275.read(arg3, arg1, arg0);
        if (var6 > 0) {
            this.field1272 += (long) var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ub", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1275 != null) {
            System.out.println("Warning! fileondisk " + this.field1273 + " not closed correctly using close(). Auto-closing instead. ");
            this.method593(0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI[B)V")
    public final void method592(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field1272 > this.field1274) {
            this.field1275.seek(this.field1274);
            this.field1275.write(1);
            throw new EOFException();
        }
        this.field1275.write(arg3, arg2, arg0);
        this.field1272 += (long) arg0;
        if (arg1 > -4) {
            this.field1273 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final void method593(int arg0) throws IOException {
        if (this.field1275 != null) {
            this.field1275.close();
            this.field1275 = null;
        }
        if (arg0 != 0) {
            this.field1274 = 103L;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)J")
    public final long method594(int arg0) throws IOException {
        int var2 = 37 / ((-arg0 - 64) / 36);
        return this.field1275.length();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JI)V")
    public final void method595(long arg0, int arg1) throws IOException {
        if (arg1 != -1) {
            this.field1274 = -22L;
        }
        this.field1275.seek(arg0);
        this.field1272 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method596(byte arg0) {
        if (arg0 != 58) {
            this.method596((byte) 65);
        }
        return this.field1273;
    }
}
