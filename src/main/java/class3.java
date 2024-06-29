import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field55;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/io/File;")
    private File field56;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "J")
    private long field57;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "J")
    private long field58;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public final void method9(byte arg0) throws IOException {
        if (arg0 == -50) {
            this.field55.close();
            this.field55 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[BI)V")
    public final void method10(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 27179) {
            this.field56 = null;
        }
        if (this.field57 < (long) arg0 + this.field58) {
            this.field55.seek(this.field57 + 1L);
            this.field55.write(1);
            throw new EOFException();
        } else {
            this.field55.write(arg2, arg3, arg0);
            this.field58 += arg0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field55 != null) {
            System.out.println("Warning! fileondisk " + this.field56 + " not closed correctly using close(). Auto-closing instead. ");
            this.method9((byte) -50);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(JI)V")
    public final void method11(long arg0, int arg1) throws IOException {
        if (arg1 == 4096) {
            this.field55.seek(arg0);
            this.field58 = arg0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method12(int arg0) {
        if (arg0 != 1) {
            this.field57 = 73L;
        }
        return this.field56;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)J")
    public final long method13(int arg0) throws IOException {
        if (arg0 > -90) {
            this.method12(-41);
        }
        return this.field55.length();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([BIZI)I")
    public final int method14(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        int var5 = this.field55.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field58 += var5;
        }
        if (!arg2) {
            this.field57 = 123L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class3(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field55 = new RandomAccessFile(arg0, arg1);
        this.field56 = arg0;
        this.field57 = arg2;
        this.field58 = 0L;
        int var5 = this.field55.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field55.seek(0L);
            this.field55.write(var5);
        }
        this.field55.seek(0L);
    }
}
