import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class315 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "J")
    private long field5327;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "J")
    private long field5328;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Ljava/io/File;")
    private File field5326;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5325;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Ljava/io/File;", line = 4)
    public final File method2167(byte arg0) {
        if (arg0 != 103) {
            this.field5325 = (RandomAccessFile) null;
        }
        return this.field5326;
    }

    @OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        if (this.field5325 != null) {
            System.out.println("Warning! fileondisk " + this.field5326 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2169((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JB)V", line = 27)
    public final void method2168(long arg0, byte arg1) throws IOException {
        this.field5325.seek(arg0);
        this.field5327 = arg0;
        if (arg1 < 49) {
            this.field5327 = 92L;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 39)
    public final void method2169(byte arg0) throws IOException {
        if (this.field5325 != null) {
            this.field5325.close();
            this.field5325 = null;
        }
        int var2 = -81 % ((arg0 - 8) / 50);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII[B)V", line = 54)
    public final void method2170(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field5328 < (long) arg2 + this.field5327) {
            this.field5325.seek(this.field5328 + 1L);
            this.field5325.write(1);
            throw new EOFException();
        }
        this.field5325.write(arg3, arg1, arg2);
        this.field5327 += (long) arg2;
        if (arg0 <= 102) {
            this.method2167((byte) 88);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)J", line = 73)
    public final long method2171(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method2167((byte) -103);
        }
        return this.field5325.length();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ[B)I", line = 90)
    public final int method2172(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (arg2) {
            this.field5327 = -9L;
        }
        int var5 = this.field5325.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field5327 += (long) var5;
        }
        return var5;
    }
}
