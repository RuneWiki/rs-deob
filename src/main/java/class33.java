import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field699;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "J")
    private long field701;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "J")
    private long field698;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Ljava/io/File;")
    private File field700;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI[BI)I")
    public final int method260(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field699.read(arg2, arg1, arg3);
        if (arg0 == -16) {
            if (var5 > 0) {
                this.field701 += var5;
            }
            return var5;
        } else {
            return 44;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IJ)V")
    public final void method261(int arg0, long arg1) throws IOException {
        if (arg0 != -1) {
            this.field698 = 92L;
        }
        this.field699.seek(arg1);
        this.field701 = arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)J")
    public final long method262(int arg0) throws IOException {
        if (arg0 != -8624) {
            this.method265(false);
        }
        return this.field699.length();
    }

    @OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field699 != null) {
            System.out.println("Warning! fileondisk " + this.field700 + " not closed correctly using close(). Auto-closing instead. ");
            this.method263(117);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public final void method263(int arg0) throws IOException {
        this.field699.close();
        int var2 = -107 / ((arg0 - 76) / 39);
        this.field699 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class33(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field699 = new RandomAccessFile(arg0, arg1);
        this.field701 = 0L;
        this.field698 = arg2;
        this.field700 = arg0;
        int var5 = this.field699.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field699.seek(0L);
            this.field699.write(var5);
        }
        this.field699.seek(0L);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[BI)V")
    public final void method264(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != -16321) {
            this.field701 = 84L;
        }
        if ((long) arg3 + this.field701 > this.field698) {
            this.field699.seek(this.field698 + 1L);
            this.field699.write(1);
            throw new EOFException();
        } else {
            this.field699.write(arg2, arg0, arg3);
            this.field701 += arg3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method265(boolean arg0) {
        if (arg0) {
            this.method265(false);
        }
        return this.field700;
    }
}
