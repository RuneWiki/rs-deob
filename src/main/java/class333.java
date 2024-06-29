import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class333 {

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "J")
    private long field4977;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "J")
    private long field4978;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Ljava/io/File;")
    private File field4979;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4976;

    @OriginalMember(owner = "client!ko", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4976 != null) {
            System.out.println("Warning! fileondisk " + this.field4979 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2066(0);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([BIII)I")
    public final int method2065(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field4976.read(arg0, arg1, arg2);
        if (~var5 < arg3) {
            this.field4977 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public final void method2066(int arg0) throws IOException {
        if (this.field4976 != null) {
            this.field4976.close();
            this.field4976 = null;
        }
        if (arg0 != 0) {
            this.method2068((byte) -105);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II[BI)V")
    public final void method2067(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 25525) {
            this.field4977 = -72L;
        }
        if (this.field4978 < (long) arg0 + this.field4977) {
            this.field4976.seek(this.field4978);
            this.field4976.write(1);
            throw new EOFException();
        } else {
            this.field4976.write(arg2, arg3, arg0);
            this.field4977 += arg0;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method2068(byte arg0) {
        if (arg0 > -99) {
            this.method2068((byte) 48);
        }
        return this.field4979;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)J")
    public final long method2069(byte arg0) throws IOException {
        return arg0 >= -73 ? 13L : this.field4976.length();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(JI)V")
    public final void method2070(long arg0, int arg1) throws IOException {
        this.field4976.seek(arg0);
        this.field4977 = arg0;
        if (arg1 != 0) {
            this.method2068((byte) 121);
        }
    }
}
