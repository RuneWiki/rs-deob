import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class322 {

    @OriginalMember(owner = "client!an", name = "c", descriptor = "J")
    private long field5005;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "J")
    private long field5006;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Ljava/io/File;")
    private File field5003;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5004;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)Ljava/io/File;", line = 4)
    public final File method2198(boolean arg0) {
        return arg0 ? (File) null : this.field5003;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([BIZI)I", line = 15)
    public final int method2199(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        if (!arg2) {
            return -73;
        }
        int var5 = this.field5004.read(arg0, arg3, arg1);
        if (var5 > 0) {
            this.field5006 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 32)
    public final void method2200(int arg0) throws IOException {
        if (arg0 == 1 && this.field5004 != null) {
            this.field5004.close();
            this.field5004 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)J", line = 48)
    public final long method2201(byte arg0) throws IOException {
        if (arg0 > -54) {
            this.field5003 = (File) null;
        }
        return this.field5004.length();
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III[B)V", line = 59)
    public final void method2202(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 1) {
            this.method2198(false);
        }
        if ((long) arg2 + this.field5006 > this.field5005) {
            this.field5004.seek(this.field5005);
            this.field5004.write(1);
            throw new EOFException();
        } else {
            this.field5004.write(arg3, arg1, arg2);
            this.field5006 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(JB)V", line = 78)
    public final void method2203(long arg0, byte arg1) throws IOException {
        int var4 = 62 % ((arg1 - 51) / 52);
        this.field5004.seek(arg0);
        this.field5006 = arg0;
    }

    @OriginalMember(owner = "client!an", name = "finalize", descriptor = "()V", line = 87)
    protected final void finalize() throws Throwable {
        if (this.field5004 != null) {
            System.out.println("Warning! fileondisk " + this.field5003 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2200(1);
        }
    }
}
