import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class368 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "J")
    private long field5622;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
    private long field5624;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Ljava/io/File;")
    private File field5625;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5623;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Ljava/io/File;", line = 3)
    public final File method2339(byte arg0) {
        return arg0 < 42 ? null : this.field5625;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ[B)I", line = 13)
    public final int method2340(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (!arg2) {
            return 98;
        }
        int var5 = this.field5623.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field5624 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[BI)V", line = 29)
    public final void method2341(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field5624 > this.field5622) {
            this.field5623.seek(this.field5622);
            this.field5623.write(1);
            throw new EOFException();
        }
        this.field5623.write(arg2, arg1, arg0);
        if (arg3 <= 122) {
            this.field5625 = null;
        }
        this.field5624 += arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JZ)V", line = 48)
    public final void method2342(long arg0, boolean arg1) throws IOException {
        this.field5623.seek(arg0);
        if (!arg1) {
            this.field5624 = -107L;
        }
        this.field5624 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)J", line = 61)
    public final long method2343(byte arg0) throws IOException {
        if (arg0 != 31) {
            this.method2339((byte) 76);
        }
        return this.field5623.length();
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V", line = 72)
    public final void method2344(byte arg0) throws IOException {
        if (this.field5623 != null) {
            this.field5623.close();
            this.field5623 = null;
        }
        if (arg0 != -93) {
            this.method2339((byte) 28);
        }
    }

    @OriginalMember(owner = "client!sf", name = "finalize", descriptor = "()V", line = 89)
    protected final void finalize() throws Throwable {
        if (this.field5623 != null) {
            System.out.println("Warning! fileondisk " + this.field5625 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2344((byte) -93);
        }
    }
}
