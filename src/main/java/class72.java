import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class72 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1324;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "J")
    private long field1322;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Ljava/io/File;")
    private File field1321;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "J")
    private long field1323;

    @OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1324 != null) {
            System.out.println("Warning! fileondisk " + this.field1321 + " not closed correctly using close(). Auto-closing instead. ");
            this.method444(-126);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)J")
    public final long method439(int arg0) throws IOException {
        if (arg0 != 22174) {
            this.field1324 = null;
        }
        return this.field1324.length();
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method440(int arg0) {
        return arg0 == 0 ? this.field1321 : null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(JI)V")
    public final void method441(long arg0, int arg1) throws IOException {
        this.field1324.seek(arg0);
        this.field1323 = arg0;
        if (arg1 != 13688) {
            this.method440(-60);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[BII)I")
    public final int method442(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field1324.read(arg1, arg2, arg0);
        if (~var5 < arg3) {
            this.field1323 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I[BII)V")
    public final void method443(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field1323 > this.field1322) {
            this.field1324.seek(this.field1322 + 1L);
            this.field1324.write(1);
            throw new EOFException();
        }
        if (arg0 != -21424) {
            this.method440(14);
        }
        this.field1324.write(arg1, arg2, arg3);
        this.field1323 += arg3;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public final void method444(int arg0) throws IOException {
        if (this.field1324 != null) {
            this.field1324.close();
            this.field1324 = null;
        }
        if (arg0 >= -113) {
            this.field1324 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class72(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1324 = new RandomAccessFile(arg0, arg1);
        this.field1322 = arg2;
        this.field1321 = arg0;
        this.field1323 = 0L;
        int var5 = this.field1324.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1324.seek(0L);
            this.field1324.write(var5);
        }
        this.field1324.seek(0L);
    }
}
