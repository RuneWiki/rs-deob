import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class20 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field243;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "J")
    private long field241;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Ljava/io/File;")
    private File field244;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "J")
    private long field242;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BII[B)V")
    public final void method103(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 1) {
            return;
        }
        if (this.field241 < (long) arg2 + this.field242) {
            this.field243.seek(this.field241 + 1L);
            this.field243.write(1);
            throw new EOFException();
        } else {
            this.field243.write(arg3, arg1, arg2);
            this.field242 += arg2;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public final void method104(int arg0) throws IOException {
        if (this.field243 != null) {
            this.field243.close();
            this.field243 = null;
        }
        if (arg0 >= -107) {
            this.field241 = -106L;
        }
    }

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field243 != null) {
            System.out.println("Warning! fileondisk " + this.field244 + " not closed correctly using close(). Auto-closing instead. ");
            this.method104(-112);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIII)I")
    public final int method105(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field243.read(arg0, arg3, arg2);
        if (arg1 < var5) {
            this.field242 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)J")
    public final long method106(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method108(63);
        }
        return this.field243.length();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JZ)V")
    public final void method107(long arg0, boolean arg1) throws IOException {
        this.field243.seek(arg0);
        this.field242 = arg0;
        if (!arg1) {
            this.field242 = 26L;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method108(int arg0) {
        if (arg0 != 0) {
            this.method108(-111);
        }
        return this.field244;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class20(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field243 = new RandomAccessFile(arg0, arg1);
        this.field241 = arg2;
        this.field244 = arg0;
        this.field242 = 0L;
        int var5 = this.field243.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field243.seek(0L);
            this.field243.write(var5);
        }
        this.field243.seek(0L);
    }
}
