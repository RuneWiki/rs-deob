import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class51 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "J")
    private long field934;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "J")
    private long field935;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Ljava/io/File;")
    private File field936;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field937;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BII)I")
    public final int method335(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field937.read(arg1, arg2, arg0);
        if (~var5 < arg3) {
            this.field935 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public final void method336(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field936 = null;
        }
        if (this.field937 != null) {
            this.field937.close();
            this.field937 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BIB)V")
    public final void method337(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (this.field934 < ((long) arg0 + this.field935)) {
            this.field937.seek(this.field934 + 1L);
            this.field937.write(1);
            throw new EOFException();
        }
        this.field937.write(arg1, arg2, arg0);
        if (arg3 < 78) {
            this.method340((byte) 24);
        }
        this.field935 += (long) arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)V")
    public final void method338(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            this.method340((byte) 15);
        }
        this.field937.seek(arg1);
        this.field935 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)J")
    public final long method339(int arg0) throws IOException {
        return arg0 == 0 ? this.field937.length() : -77L;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method340(byte arg0) {
        return arg0 >= -47 ? null : this.field936;
    }

    @OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field937 != null) {
            System.out.println("Warning! fileondisk " + this.field936 + " not closed correctly using close(). Auto-closing instead. ");
            this.method336(-1);
        }
    }
}
