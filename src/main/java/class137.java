import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class137 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2526;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Ljava/io/File;")
    private File field2527;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "J")
    private long field2525;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "J")
    private long field2524;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)J")
    public final long method940(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field2527 = null;
        }
        return this.field2526.length();
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method941(int arg0) {
        if (arg0 != 0) {
            this.field2524 = 11L;
        }
        return this.field2527;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZJ)V")
    public final void method942(boolean arg0, long arg1) throws IOException {
        if (arg0) {
            this.method941(46);
        }
        this.field2526.seek(arg1);
        this.field2524 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method943(int arg0) throws IOException {
        if (arg0 != -8143) {
            this.field2526 = null;
        }
        if (this.field2526 != null) {
            this.field2526.close();
            this.field2526 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BII)V")
    public final void method944(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 18405) {
            return;
        }
        if ((long) arg3 + this.field2524 > this.field2525) {
            this.field2526.seek(this.field2525 + 1L);
            this.field2526.write(1);
            throw new EOFException();
        } else {
            this.field2526.write(arg1, arg0, arg3);
            this.field2524 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[B)I")
    public final int method945(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field2526.read(arg3, arg2, arg0);
        if (var5 > arg1) {
            this.field2524 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class137(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2526 = new RandomAccessFile(arg0, arg1);
        this.field2527 = arg0;
        this.field2525 = arg2;
        this.field2524 = 0L;
        int var5 = this.field2526.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2526.seek(0L);
            this.field2526.write(var5);
        }
        this.field2526.seek(0L);
    }

    @OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2526 != null) {
            System.out.println("Warning! fileondisk " + this.field2527 + " not closed correctly using close(). Auto-closing instead. ");
            this.method943(-8143);
        }
    }
}
