import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class300 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "J")
    private long field4304;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "J")
    private long field4305;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Ljava/io/File;")
    private File field4302;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4303;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public final void method1884(int arg0) throws IOException {
        if (this.field4303 != null) {
            this.field4303.close();
            this.field4303 = null;
        }
        if (arg0 != -1) {
            this.field4302 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4303 != null) {
            System.out.println("Warning! fileondisk " + this.field4302 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1884(-1);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II[BI)V")
    public final void method1885(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field4305 < ((long) arg1 + this.field4304)) {
            this.field4303.seek(this.field4305);
            this.field4303.write(1);
            throw new EOFException();
        } else {
            this.field4303.write(arg2, arg0, arg1);
            if (arg3 == 1) {
                this.field4304 += arg1;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II[BB)I")
    public final int method1886(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = this.field4303.read(arg2, arg0, arg1);
        if (var5 > 0) {
            this.field4304 += var5;
        }
        if (arg3 >= -88) {
            this.method1887(106);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method1887(int arg0) {
        if (arg0 > -9) {
            this.field4302 = null;
        }
        return this.field4302;
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)J")
    public final long method1888(int arg0) throws IOException {
        if (arg0 != 74) {
            this.field4303 = null;
        }
        return this.field4303.length();
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(JI)V")
    public final void method1889(long arg0, int arg1) throws IOException {
        this.field4303.seek(arg0);
        this.field4304 = arg0;
        if (arg1 != 0) {
            this.method1887(-74);
        }
    }
}
