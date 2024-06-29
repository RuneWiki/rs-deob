import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class236 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4402;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Ljava/io/File;")
    private File field4403;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
    private long field4404;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "J")
    private long field4405;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public final void method1536(byte arg0) throws IOException {
        if (arg0 != 70) {
            this.field4403 = null;
        }
        if (this.field4402 != null) {
            this.field4402.close();
            this.field4402 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method1537(byte arg0) {
        if (arg0 >= -105) {
            this.field4403 = null;
        }
        return this.field4403;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JB)V")
    public final void method1538(long arg0, byte arg1) throws IOException {
        this.field4402.seek(arg0);
        this.field4405 = arg0;
        if (arg1 != 112) {
            this.field4404 = -67L;
        }
    }

    @OriginalMember(owner = "client!wh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4402 != null) {
            System.out.println("Warning! fileondisk " + this.field4403 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1536((byte) 70);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI[BI)I")
    public final int method1539(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != -45) {
            this.method1537((byte) 10);
        }
        int var5 = this.field4402.read(arg2, arg1, arg3);
        if (var5 > 0) {
            this.field4405 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)J")
    public final long method1540(int arg0) throws IOException {
        int var2 = -55 % ((arg0 + 54) / 49);
        return this.field4402.length();
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class236(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field4402 = new RandomAccessFile(arg0, arg1);
        this.field4403 = arg0;
        this.field4404 = arg2;
        this.field4405 = 0L;
        int var5 = this.field4402.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4402.seek(0L);
            this.field4402.write(var5);
        }
        this.field4402.seek(0L);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[BI)V")
    public final void method1541(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field4405 > this.field4404) {
            this.field4402.seek(this.field4404 + 1L);
            this.field4402.write(1);
            throw new EOFException();
        }
        if (arg1 != 1) {
            this.field4403 = null;
        }
        this.field4402.write(arg2, arg3, arg0);
        this.field4405 += arg0;
    }
}
