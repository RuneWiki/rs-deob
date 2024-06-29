import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class254 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "J")
    private long field4486;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "J")
    private long field4488;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/io/File;")
    private File field4487;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4485;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public final void method1665(boolean arg0) throws IOException {
        if (this.field4485 != null) {
            this.field4485.close();
            this.field4485 = null;
        }
        if (!arg0) {
            this.field4488 = 105L;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BZ)I")
    public final int method1666(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        int var5 = this.field4485.read(arg2, arg0, arg1);
        if (arg3) {
            if (var5 > 0) {
                this.field4486 += (long) var5;
            }
            return var5;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
    public final long method1667(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method1670(22);
        }
        return this.field4485.length();
    }

    @OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4485 != null) {
            System.out.println("Warning! fileondisk " + this.field4487 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1665(true);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZI[B)V")
    public final void method1668(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg2 + this.field4486 > this.field4488) {
            this.field4485.seek(this.field4488 + 1L);
            this.field4485.write(1);
            throw new EOFException();
        }
        this.field4485.write(arg3, arg0, arg2);
        this.field4486 += (long) arg2;
        if (arg1) {
            this.method1670(-2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)V")
    public final void method1669(long arg0, boolean arg1) throws IOException {
        this.field4485.seek(arg0);
        this.field4486 = arg0;
        if (arg1) {
            this.field4485 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method1670(int arg0) {
        if (arg0 != 1) {
            this.field4487 = null;
        }
        return this.field4487;
    }
}
