import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class197 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3950;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "J")
    private long field3951;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "J")
    private long field3949;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ljava/io/File;")
    private File field3952;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[B)V")
    public final void method1285(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field3951 < (long) arg0 + this.field3949) {
            this.field3950.seek(this.field3951 + 1L);
            this.field3950.write(1);
            throw new EOFException();
        }
        this.field3950.write(arg3, arg2, arg0);
        if (arg1 > -31) {
            this.field3952 = null;
        }
        this.field3949 += arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI[BI)I")
    public final int method1286(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != -111) {
            this.method1288(-15);
        }
        int var5 = this.field3950.read(arg2, arg3, arg1);
        if (var5 > 0) {
            this.field3949 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3950 != null) {
            System.out.println("Warning! fileondisk " + this.field3952 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1289(1);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JI)V")
    public final void method1287(long arg0, int arg1) throws IOException {
        if (arg1 != 26074) {
            this.method1288(75);
        }
        this.field3950.seek(arg0);
        this.field3949 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1288(int arg0) {
        int var2 = -45 / ((49 - arg0) / 47);
        return this.field3952;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public final void method1289(int arg0) throws IOException {
        if (arg0 == 1 && this.field3950 != null) {
            this.field3950.close();
            this.field3950 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)J")
    public final long method1290(byte arg0) throws IOException {
        return arg0 == -84 ? this.field3950.length() : -7L;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class197(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field3950 = new RandomAccessFile(arg0, arg1);
        this.field3951 = arg2;
        this.field3949 = 0L;
        this.field3952 = arg0;
        int var5 = this.field3950.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3950.seek(0L);
            this.field3950.write(var5);
        }
        this.field3950.seek(0L);
    }
}
