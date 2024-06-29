import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class93 {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1935;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljava/io/File;")
    private File field1932;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "J")
    private long field1934;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "J")
    private long field1933;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method745(byte arg0) {
        return arg0 <= 18 ? null : this.field1932;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final void method746(int arg0) throws IOException {
        if (arg0 <= -54 && this.field1935 != null) {
            this.field1935.close();
            this.field1935 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[BI)I")
    public final int method747(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field1935.read(arg2, arg1, arg0);
        if (arg3 > ~var5) {
            this.field1933 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BIBI)V")
    public final void method748(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (this.field1934 < (long) arg1 + this.field1933) {
            this.field1935.seek(this.field1934 + 1L);
            this.field1935.write(1);
            throw new EOFException();
        }
        this.field1935.write(arg0, arg3, arg1);
        if (arg2 != 90) {
            this.method745((byte) 44);
        }
        this.field1933 += arg1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(JB)V")
    public final void method749(long arg0, byte arg1) throws IOException {
        int var4 = -16 % ((arg1 + 33) / 44);
        this.field1935.seek(arg0);
        this.field1933 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)J")
    public final long method750(int arg0) throws IOException {
        return arg0 == 1 ? this.field1935.length() : 30L;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class93(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1935 = new RandomAccessFile(arg0, arg1);
        this.field1932 = arg0;
        this.field1934 = arg2;
        this.field1933 = 0L;
        int var5 = this.field1935.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1935.seek(0L);
            this.field1935.write(var5);
        }
        this.field1935.seek(0L);
    }

    @OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1935 != null) {
            System.out.println("Warning! fileondisk " + this.field1932 + " not closed correctly using close(). Auto-closing instead. ");
            this.method746(-111);
        }
    }
}
