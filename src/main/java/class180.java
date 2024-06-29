import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class180 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2989;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Ljava/io/File;")
    private File field2992;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "J")
    private long field2990;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "J")
    private long field2991;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)J")
    public final long method1223(int arg0) throws IOException {
        int var2 = 76 % ((arg0 + 3) / 63);
        return this.field2989.length();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IJ)V")
    public final void method1224(int arg0, long arg1) throws IOException {
        this.field2989.seek(arg1);
        if (arg0 != 10627) {
            this.field2989 = null;
        }
        this.field2990 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[BIB)I")
    public final int method1225(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != 38) {
            this.method1228(-86);
        }
        int var5 = this.field2989.read(arg1, arg0, arg2);
        if (var5 > 0) {
            this.field2990 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ[BI)V")
    public final void method1226(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field2991 < ((long) arg3 + this.field2990)) {
            this.field2989.seek(this.field2991 + 1L);
            this.field2989.write(1);
            throw new EOFException();
        }
        this.field2989.write(arg2, arg0, arg3);
        this.field2990 += (long) arg3;
        if (!arg1) {
            this.field2989 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2989 != null) {
            System.out.println("Warning! fileondisk " + this.field2992 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1227(62);
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class180(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2989 = new RandomAccessFile(arg0, arg1);
        this.field2992 = arg0;
        this.field2990 = 0L;
        this.field2991 = arg2;
        int var5 = this.field2989.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2989.seek(0L);
            this.field2989.write(var5);
        }
        this.field2989.seek(0L);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public final void method1227(int arg0) throws IOException {
        int var2 = 76 % ((arg0 + 5) / 52);
        if (this.field2989 != null) {
            this.field2989.close();
            this.field2989 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method1228(int arg0) {
        if (arg0 != 0) {
            this.field2990 = 92L;
        }
        return this.field2992;
    }
}
