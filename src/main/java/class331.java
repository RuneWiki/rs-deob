import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class331 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "J")
    private long field4474;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "J")
    private long field4475;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/io/File;")
    private File field4476;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4477;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)J", line = 3)
    public final long method2004(int arg0) throws IOException {
        int var2 = 117 / ((23 - arg0) / 62);
        return this.field4477.length();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Ljava/io/File;", line = 13)
    public final File method2005(byte arg0) {
        if (arg0 >= -45) {
            this.method2005((byte) -127);
        }
        return this.field4476;
    }

    @OriginalMember(owner = "client!ih", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() throws Throwable {
        if (this.field4477 != null) {
            System.out.println("Warning! fileondisk " + this.field4476 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2009(-117);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([BBII)I", line = 38)
    public final int method2006(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 >= -20) {
            this.field4474 = 119L;
        }
        int var5 = this.field4477.read(arg0, arg2, arg3);
        if (var5 > 0) {
            this.field4475 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)V", line = 54)
    public final void method2007(int arg0, long arg1) throws IOException {
        if (arg0 == 10795) {
            this.field4477.seek(arg1);
            this.field4475 = arg1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZI[B)V", line = 65)
    public final void method2008(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg2 + this.field4475 > this.field4474) {
            this.field4477.seek(this.field4474);
            this.field4477.write(1);
            throw new EOFException();
        }
        this.field4477.write(arg3, arg0, arg2);
        if (!arg1) {
            this.field4474 = 41L;
        }
        this.field4475 += (long) arg2;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 84)
    public final void method2009(int arg0) throws IOException {
        if (arg0 >= -24) {
            this.field4477 = null;
        }
        if (this.field4477 != null) {
            this.field4477.close();
            this.field4477 = null;
        }
    }
}
