import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class191 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3362;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "J")
    private long field3364;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "J")
    private long field3365;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Ljava/io/File;")
    private File field3363;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1262(int arg0) {
        return arg0 == 31402 ? this.field3363 : null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final void method1263(int arg0) throws IOException {
        if (arg0 < 111) {
            this.field3362 = null;
        }
        if (this.field3362 != null) {
            this.field3362.close();
            this.field3362 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IJ)V")
    public final void method1264(int arg0, long arg1) throws IOException {
        this.field3362.seek(arg1);
        if (arg0 >= -113) {
            this.field3363 = null;
        }
        this.field3364 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[BI)I")
    public final int method1265(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 < 110) {
            return 41;
        }
        int var5 = this.field3362.read(arg2, arg0, arg1);
        if (var5 > 0) {
            this.field3364 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)J")
    public final long method1266(boolean arg0) throws IOException {
        if (!arg0) {
            this.field3362 = null;
        }
        return this.field3362.length();
    }

    @OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3362 != null) {
            System.out.println("Warning! fileondisk " + this.field3363 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1263(126);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class191(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3362 = new RandomAccessFile(arg0, arg1);
        this.field3364 = 0L;
        this.field3365 = arg2;
        this.field3363 = arg0;
        int var5 = this.field3362.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3362.seek(0L);
            this.field3362.write(var5);
        }
        this.field3362.seek(0L);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II[BI)V")
    public final void method1267(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = -103 / ((-arg3 - 56) / 63);
        if (this.field3365 < (long) arg1 + this.field3364) {
            this.field3362.seek(this.field3365 + 1L);
            this.field3362.write(1);
            throw new EOFException();
        } else {
            this.field3362.write(arg2, arg0, arg1);
            this.field3364 += arg1;
        }
    }
}
