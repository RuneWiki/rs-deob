import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class137 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2582;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "J")
    private long field2583;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljava/io/File;")
    private File field2581;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "J")
    private long field2584;

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2582 != null) {
            System.out.println("Warning! fileondisk " + this.field2581 + " not closed correctly using close(). Auto-closing instead. ");
            this.method858(111);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)J")
    public final long method857(int arg0) throws IOException {
        return arg0 == 0 ? this.field2582.length() : -93L;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method858(int arg0) throws IOException {
        int var2 = -119 / ((44 - arg0) / 46);
        if (this.field2582 != null) {
            this.field2582.close();
            this.field2582 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
    public final void method859(long arg0, int arg1) throws IOException {
        if (arg1 == 0) {
            this.field2582.seek(arg0);
            this.field2583 = arg0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class137(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2582 = new RandomAccessFile(arg0, arg1);
        this.field2583 = 0L;
        this.field2581 = arg0;
        this.field2584 = arg2;
        int var5 = this.field2582.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2582.seek(0L);
            this.field2582.write(var5);
        }
        this.field2582.seek(0L);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method860(int arg0) {
        if (arg0 != 0) {
            this.method860(83);
        }
        return this.field2581;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[B)V")
    public final void method861(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg2 + this.field2583 > this.field2584) {
            this.field2582.seek(this.field2584 + 1L);
            this.field2582.write(1);
            throw new EOFException();
        } else {
            this.field2582.write(arg3, arg1, arg2);
            int var5 = -115 % ((arg0 - 74) / 51);
            this.field2583 += arg2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[BBI)I")
    public final int method862(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        int var5 = this.field2582.read(arg1, arg3, arg0);
        if (arg2 != 56) {
            this.field2581 = null;
        }
        if (var5 > 0) {
            this.field2583 += var5;
        }
        return var5;
    }
}
