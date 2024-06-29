import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class171 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2884;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "J")
    private long field2885;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Ljava/io/File;")
    private File field2882;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "J")
    private long field2883;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public final void method1149(int arg0) throws IOException {
        if (arg0 == -9424 && this.field2884 != null) {
            this.field2884.close();
            this.field2884 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIII)V")
    public final void method1150(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field2885 < (long) arg3 + this.field2883) {
            this.field2884.seek(this.field2885 + 1L);
            this.field2884.write(1);
            throw new EOFException();
        }
        this.field2884.write(arg0, arg2, arg3);
        this.field2883 += (long) arg3;
        if (arg1 != 14389) {
            this.field2882 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V")
    public final void method1151(long arg0, byte arg1) throws IOException {
        this.field2884.seek(arg0);
        this.field2883 = arg0;
        if (arg1 != 122) {
            this.field2883 = 56L;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BBI)I")
    public final int method1152(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != -6) {
            return -110;
        }
        int var5 = this.field2884.read(arg1, arg3, arg0);
        if (var5 > 0) {
            this.field2883 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)J")
    public final long method1153(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field2884 = null;
        }
        return this.field2884.length();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method1154(boolean arg0) {
        if (!arg0) {
            this.field2885 = 23L;
        }
        return this.field2882;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class171(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2884 = new RandomAccessFile(arg0, arg1);
        this.field2885 = arg2;
        this.field2882 = arg0;
        this.field2883 = 0L;
        int var5 = this.field2884.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2884.seek(0L);
            this.field2884.write(var5);
        }
        this.field2884.seek(0L);
    }

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2884 != null) {
            System.out.println("Warning! fileondisk " + this.field2882 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1149(-9424);
        }
    }
}
