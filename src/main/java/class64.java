import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class64 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1245;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "J")
    private long field1243;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Ljava/io/File;")
    private File field1246;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "J")
    private long field1244;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method422(byte arg0) {
        int var2 = -60 % ((arg0 - 52) / 42);
        return this.field1246;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)V")
    public final void method423(byte arg0, long arg1) throws IOException {
        this.field1245.seek(arg1);
        this.field1244 = arg1;
        int var4 = -122 % ((66 - arg0) / 50);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public final void method424(byte arg0) throws IOException {
        int var2 = -82 % ((arg0 + 35) / 33);
        if (this.field1245 != null) {
            this.field1245.close();
            this.field1245 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)J")
    public final long method425(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method422((byte) -69);
        }
        return this.field1245.length();
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BI)V")
    public final void method426(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1243 < (long) arg0 + this.field1244) {
            this.field1245.seek(this.field1243 + 1L);
            this.field1245.write(1);
            throw new EOFException();
        }
        this.field1245.write(arg2, arg1, arg0);
        this.field1244 += arg0;
        if (arg3 != 1) {
            this.method422((byte) -38);
        }
    }

    @OriginalMember(owner = "client!gd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1245 != null) {
            System.out.println("Warning! fileondisk " + this.field1246 + " not closed correctly using close(). Auto-closing instead. ");
            this.method424((byte) 102);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIII)I")
    public final int method427(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 != 0) {
            return -11;
        }
        int var5 = this.field1245.read(arg0, arg1, arg2);
        if (var5 > 0) {
            this.field1244 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class64(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field1245 = new RandomAccessFile(arg0, arg1);
        this.field1243 = arg2;
        this.field1246 = arg0;
        this.field1244 = 0L;
        int var5 = this.field1245.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1245.seek(0L);
            this.field1245.write(var5);
        }
        this.field1245.seek(0L);
    }
}
