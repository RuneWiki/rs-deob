import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class301 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "J")
    private long field4702;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "J")
    private long field4704;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljava/io/File;")
    private File field4701;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4703;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Ljava/io/File;", line = 4)
    public final File method2103(byte arg0) {
        if (arg0 > -90) {
            this.field4702 = -124L;
        }
        return this.field4701;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)I", line = 16)
    public final int method2104(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field4703.read(arg3, arg0, arg1);
        if (var5 > 0) {
            this.field4702 += (long) var5;
        }
        if (arg2 > -26) {
            this.field4703 = (RandomAccessFile) null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZI[B)V", line = 30)
    public final void method2105(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field4704 < ((long) arg0 + this.field4702)) {
            this.field4703.seek(this.field4704);
            this.field4703.write(1);
            throw new EOFException();
        } else if (!arg1) {
            this.field4703.write(arg3, arg2, arg0);
            this.field4702 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V", line = 50)
    public final void method2106(byte arg0) throws IOException {
        int var2 = 7 % ((-arg0 - 37) / 34);
        if (this.field4703 != null) {
            this.field4703.close();
            this.field4703 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() throws Throwable {
        if (this.field4703 != null) {
            System.out.println("Warning! fileondisk " + this.field4701 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2106((byte) -81);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)J", line = 77)
    public final long method2107(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method2103((byte) -92);
        }
        return this.field4703.length();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IJ)V", line = 90)
    public final void method2108(int arg0, long arg1) throws IOException {
        this.field4703.seek(arg1);
        this.field4702 = arg1;
        if (arg0 != -2372) {
            this.method2103((byte) 4);
        }
    }
}
