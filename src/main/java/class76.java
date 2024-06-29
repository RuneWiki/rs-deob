import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1868;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "J")
    private long field1867;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "J")
    private long field1869;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Ljava/io/File;")
    private File field1870;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)J")
    public final long method582(int arg0) throws IOException {
        if (arg0 != -29248) {
            this.field1868 = null;
        }
        return this.field1868.length();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method583(byte arg0) {
        if (arg0 != 79) {
            this.field1868 = null;
        }
        return this.field1870;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public final void method584(int arg0) throws IOException {
        this.field1868.close();
        if (arg0 != 0) {
            this.field1869 = 53L;
        }
        this.field1868 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI[BI)I")
    public final int method585(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field1868.read(arg2, arg1, arg3);
        if (var5 > 0) {
            this.field1869 += var5;
        }
        if (arg0 != -100) {
            this.field1869 = 7L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)V")
    public final void method586(int arg0, long arg1) throws IOException {
        this.field1868.seek(arg1);
        if (arg0 < 85) {
            this.field1869 = -32L;
        }
        this.field1869 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[BIZ)V")
    public final void method587(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if (!arg3) {
            return;
        }
        if ((long) arg2 + this.field1869 > this.field1867) {
            this.field1868.seek(this.field1867 + 1L);
            this.field1868.write(1);
            throw new EOFException();
        } else {
            this.field1868.write(arg1, arg0, arg2);
            this.field1869 += arg2;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class76(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1868 = new RandomAccessFile(arg0, arg1);
        this.field1867 = arg2;
        this.field1869 = 0L;
        this.field1870 = arg0;
        int var5 = this.field1868.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1868.seek(0L);
            this.field1868.write(var5);
        }
        this.field1868.seek(0L);
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1868 != null) {
            System.out.println("Warning! fileondisk " + this.field1870 + " not closed correctly using close(). Auto-closing instead. ");
            this.method584(0);
        }
    }
}
