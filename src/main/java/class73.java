import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1852;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "J")
    private long field1853;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Ljava/io/File;")
    private File field1851;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "J")
    private long field1854;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)J")
    public final long method607(int arg0) throws IOException {
        if (arg0 != 2384) {
            this.field1851 = null;
        }
        return this.field1852.length();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
    public final void method608(long arg0, int arg1) throws IOException {
        int var4 = 67 / ((41 - arg1) / 61);
        this.field1852.seek(arg0);
        this.field1853 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BIB)V")
    public final void method609(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if ((long) arg0 + this.field1853 > this.field1854) {
            this.field1852.seek(this.field1854 + 1L);
            this.field1852.write(1);
            throw new EOFException();
        } else {
            this.field1852.write(arg1, arg2, arg0);
            int var5 = 108 % ((arg3 - 24) / 61);
            this.field1853 += arg0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public final void method610(byte arg0) throws IOException {
        this.field1852.close();
        if (arg0 < -58) {
            this.field1852 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method611(boolean arg0) {
        return arg0 ? null : this.field1851;
    }

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1852 != null) {
            System.out.println("Warning! fileondisk " + this.field1851 + " not closed correctly using close(). Auto-closing instead. ");
            this.method610((byte) -100);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BII)I")
    public final int method612(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = 94 % ((arg0 + 48) / 39);
        int var6 = this.field1852.read(arg1, arg2, arg3);
        if (var6 > 0) {
            this.field1853 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class73(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field1852 = new RandomAccessFile(arg0, arg1);
        this.field1853 = 0L;
        this.field1851 = arg0;
        this.field1854 = arg2;
        int var5 = this.field1852.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1852.seek(0L);
            this.field1852.write(var5);
        }
        this.field1852.seek(0L);
    }
}
