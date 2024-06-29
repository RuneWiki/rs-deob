import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class14 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
    private long field197;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "J")
    private long field199;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/io/File;")
    private File field200;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field198;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Ljava/io/File;", line = 4)
    public final File method101(boolean arg0) {
        if (arg0) {
            this.field200 = (File) null;
        }
        return this.field200;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 14)
    public final void method102(byte arg0) throws IOException {
        if (arg0 != 18) {
            this.method101(false);
        }
        if (this.field198 != null) {
            this.field198.close();
            this.field198 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)J", line = 31)
    public final long method103(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method101(false);
        }
        return this.field198.length();
    }

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        if (this.field198 != null) {
            System.out.println("Warning! fileondisk " + this.field200 + " not closed correctly using close(). Auto-closing instead. ");
            this.method102((byte) 18);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(JZ)V", line = 56)
    public final void method104(long arg0, boolean arg1) throws IOException {
        if (!arg1) {
            this.method101(false);
        }
        this.field198.seek(arg0);
        this.field197 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB[B)V", line = 68)
    public final void method105(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (this.field199 < ((long) arg0 + this.field197)) {
            this.field198.seek(this.field199);
            this.field198.write(1);
            throw new EOFException();
        }
        this.field198.write(arg3, arg1, arg0);
        if (arg2 > -67) {
            this.field198 = (RandomAccessFile) null;
        }
        this.field197 += (long) arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BZI)I", line = 87)
    public final int method106(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        if (arg2) {
            this.field198 = (RandomAccessFile) null;
        }
        int var5 = this.field198.read(arg1, arg0, arg3);
        if (var5 > 0) {
            this.field197 += (long) var5;
        }
        return var5;
    }
}
