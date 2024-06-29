import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class153 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3165;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Ljava/io/File;")
    private File field3168;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "J")
    private long field3166;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "J")
    private long field3167;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IJ)V")
    public final void method1029(int arg0, long arg1) throws IOException {
        if (arg0 != 21598) {
            this.field3167 = -22L;
        }
        this.field3165.seek(arg1);
        this.field3167 = arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[BII)V")
    public final void method1030(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field3166 < (long) arg2 + this.field3167) {
            this.field3165.seek(this.field3166 + 1L);
            this.field3165.write(1);
            throw new EOFException();
        } else {
            int var5 = 8 % ((8 - arg0) / 47);
            this.field3165.write(arg1, arg3, arg2);
            this.field3167 += arg2;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1031(byte arg0) {
        int var2 = 71 % ((-arg0 - 27) / 33);
        return this.field3168;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3165 != null) {
            System.out.println("Warning! fileondisk " + this.field3168 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1033(-1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB[BI)I")
    public final int method1032(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 100) {
            this.field3168 = null;
        }
        int var5 = this.field3165.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field3167 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public final void method1033(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field3165 = null;
        }
        if (this.field3165 != null) {
            this.field3165.close();
            this.field3165 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)J")
    public final long method1034(byte arg0) throws IOException {
        if (arg0 >= -65) {
            this.method1031((byte) 18);
        }
        return this.field3165.length();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class153(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field3165 = new RandomAccessFile(arg0, arg1);
        this.field3168 = arg0;
        this.field3166 = arg2;
        this.field3167 = 0L;
        int var5 = this.field3165.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3165.seek(0L);
            this.field3165.write(var5);
        }
        this.field3165.seek(0L);
    }
}
