import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2299;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Ljava/io/File;")
    private File field2296;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "J")
    private long field2298;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "J")
    private long field2297;

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2299 != null) {
            System.out.println("Warning! fileondisk " + this.field2296 + " not closed correctly using close(). Auto-closing instead. ");
            this.method769((byte) -117);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI[BI)V")
    public final void method766(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field2298 > this.field2297) {
            this.field2299.seek(this.field2297 + 1L);
            this.field2299.write(1);
            throw new EOFException();
        } else {
            this.field2299.write(arg2, arg1, arg3);
            if (arg0 >= 95) {
                this.field2298 += arg3;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
    public final void method767(int arg0, long arg1) throws IOException {
        if (arg0 >= 43) {
            this.field2299.seek(arg1);
            this.field2298 = arg1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BBII)I")
    public final int method768(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2299.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field2298 += var5;
        }
        return arg1 < 0 ? 90 : var5;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public final void method769(byte arg0) throws IOException {
        if (this.field2299 != null) {
            this.field2299.close();
            this.field2299 = null;
        }
        if (arg0 > -4) {
            this.method771(true);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)J")
    public final long method770(byte arg0) throws IOException {
        return arg0 < 17 ? 7L : this.field2299.length();
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class107(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2299 = new RandomAccessFile(arg0, arg1);
        this.field2296 = arg0;
        this.field2298 = 0L;
        this.field2297 = arg2;
        int var5 = this.field2299.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2299.seek(0L);
            this.field2299.write(var5);
        }
        this.field2299.seek(0L);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method771(boolean arg0) {
        if (!arg0) {
            this.field2298 = 71L;
        }
        return this.field2296;
    }
}
