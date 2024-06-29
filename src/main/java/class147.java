import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class147 {

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3001;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "J")
    private long field2998;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Ljava/io/File;")
    private File field3000;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "J")
    private long field2999;

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3001 != null) {
            System.out.println("Warning! fileondisk " + this.field3000 + " not closed correctly using close(). Auto-closing instead. ");
            this.method929(false);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z[BII)V")
    public final void method928(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field2999 < (long) arg2 + this.field2998) {
            this.field3001.seek(this.field2999 + 1L);
            this.field3001.write(1);
            throw new EOFException();
        }
        this.field3001.write(arg1, arg3, arg2);
        if (!arg0) {
            this.method931((byte) -95);
        }
        this.field2998 += arg2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public final void method929(boolean arg0) throws IOException {
        if (!arg0 && this.field3001 != null) {
            this.field3001.close();
            this.field3001 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)J")
    public final long method930(byte arg0) throws IOException {
        return arg0 == 98 ? this.field3001.length() : 56L;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method931(byte arg0) {
        int var2 = 121 / ((70 - arg0) / 52);
        return this.field3000;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI[BI)I")
    public final int method932(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != 82) {
            return 14;
        }
        int var5 = this.field3001.read(arg2, arg1, arg3);
        if (var5 > 0) {
            this.field2998 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)V")
    public final void method933(byte arg0, long arg1) throws IOException {
        if (arg0 != -27) {
            this.field2998 = -75L;
        }
        this.field3001.seek(arg1);
        this.field2998 = arg1;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class147(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3001 = new RandomAccessFile(arg0, arg1);
        this.field2998 = 0L;
        this.field3000 = arg0;
        this.field2999 = arg2;
        int var5 = this.field3001.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3001.seek(0L);
            this.field3001.write(var5);
        }
        this.field3001.seek(0L);
    }
}
