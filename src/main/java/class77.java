import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class77 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "J")
    private long field1000;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "J")
    private long field1001;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Ljava/io/File;")
    private File field1002;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field999;

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field999 != null) {
            System.out.println("Warning! fileondisk " + this.field1002 + " not closed correctly using close(). Auto-closing instead. ");
            this.method554(-1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JB)V", line = 16)
    public final void method549(long arg0, byte arg1) throws IOException {
        this.field999.seek(arg0);
        this.field1001 = arg0;
        if (arg1 != 2) {
            this.method553((byte) 53);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BIII)I", line = 30)
    public final int method550(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != -24047) {
            return -118;
        }
        int var5 = this.field999.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field1001 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)J", line = 45)
    public final long method551(byte arg0) throws IOException {
        if (arg0 != -12) {
            this.method553((byte) -88);
        }
        return this.field999.length();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZ[B)V", line = 56)
    public final void method552(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (this.field1000 < ((long) arg0 + this.field1001)) {
            this.field999.seek(this.field1000);
            this.field999.write(1);
            throw new EOFException();
        }
        this.field999.write(arg3, arg1, arg0);
        if (!arg2) {
            this.method553((byte) -66);
        }
        this.field1001 += (long) arg0;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Ljava/io/File;", line = 75)
    public final File method553(byte arg0) {
        return arg0 == 126 ? this.field1002 : (File) null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 87)
    public final void method554(int arg0) throws IOException {
        if (this.field999 != null) {
            this.field999.close();
            this.field999 = null;
        }
        if (arg0 != -1) {
            this.field1002 = (File) null;
        }
    }
}
