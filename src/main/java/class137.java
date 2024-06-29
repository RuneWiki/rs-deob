import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class137 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2354;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "J")
    private long field2353;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Ljava/io/File;")
    private File field2355;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "J")
    private long field2356;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method853(int arg0) {
        if (arg0 != 1) {
            this.field2354 = null;
        }
        return this.field2355;
    }

    @OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2354 != null) {
            System.out.println("Warning! fileondisk " + this.field2355 + " not closed correctly using close(). Auto-closing instead. ");
            this.method856((byte) -124);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)V")
    public final void method854(int arg0, long arg1) throws IOException {
        this.field2354.seek(arg1);
        this.field2356 = arg1;
        if (arg0 >= -17) {
            this.field2356 = -128L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[BII)V")
    public final void method855(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field2356 > this.field2353) {
            this.field2354.seek(this.field2353 + 1L);
            this.field2354.write(1);
            throw new EOFException();
        } else if (arg3 <= -35) {
            this.field2354.write(arg1, arg2, arg0);
            this.field2356 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method856(byte arg0) throws IOException {
        if (this.field2354 != null) {
            this.field2354.close();
            this.field2354 = null;
        }
        if (arg0 >= -109) {
            this.field2353 = -108L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)J")
    public final long method857(int arg0) throws IOException {
        return arg0 <= 102 ? -78L : this.field2354.length();
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class137(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2354 = new RandomAccessFile(arg0, arg1);
        this.field2353 = arg2;
        this.field2355 = arg0;
        this.field2356 = 0L;
        int var5 = this.field2354.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2354.seek(0L);
            this.field2354.write(var5);
        }
        this.field2354.seek(0L);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[BI)I")
    public final int method858(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2354.read(arg2, arg1, arg0);
        if (~var5 < arg3) {
            this.field2356 += (long) var5;
        }
        return var5;
    }
}
