import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class6 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field114;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Ljava/io/File;")
    private File field116;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "J")
    private long field115;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "J")
    private long field113;

    @OriginalMember(owner = "client!fi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field114 != null) {
            System.out.println("Warning! fileondisk " + this.field116 + " not closed correctly using close(). Auto-closing instead. ");
            this.method49(false);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ[BI)I")
    public final int method47(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field114.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field115 += (long) var5;
        }
        if (!arg1) {
            this.method50(74);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)V")
    public final void method48(int arg0, long arg1) throws IOException {
        this.field114.seek(arg1);
        if (arg0 > 25) {
            this.field115 = arg1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final void method49(boolean arg0) throws IOException {
        if (arg0) {
            this.method50(9);
        }
        if (this.field114 != null) {
            this.field114.close();
            this.field114 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method50(int arg0) {
        if (arg0 <= 56) {
            this.field114 = null;
        }
        return this.field116;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)J")
    public final long method51(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method50(-80);
        }
        return this.field114.length();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BII)V")
    public final void method52(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field113 < ((long) arg2 + this.field115)) {
            this.field114.seek(this.field113 + 1L);
            this.field114.write(1);
            throw new EOFException();
        } else {
            this.field114.write(arg1, arg0, arg2);
            this.field115 += (long) arg2;
            int var5 = 29 / ((-arg3 - 55) / 50);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class6(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field114 = new RandomAccessFile(arg0, arg1);
        this.field116 = arg0;
        this.field115 = 0L;
        this.field113 = arg2;
        int var5 = this.field114.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field114.seek(0L);
            this.field114.write(var5);
        }
        this.field114.seek(0L);
    }
}
