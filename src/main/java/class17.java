import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class17 {

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field160;

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "J")
    private long field163;

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "Ljava/io/File;")
    private File field161;

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "J")
    private long field162;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)J", line = 6)
    public final long method88(int arg0) throws IOException {
        int var2 = -77 / ((arg0 + 26) / 53);
        return this.field160.length();
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(III[B)V", line = 14)
    public final void method89(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field163 > this.field162) {
            this.field160.seek(this.field162 + 1L);
            this.field160.write(1);
            throw new EOFException();
        }
        this.field160.write(arg3, arg0, arg1);
        this.field163 += arg1;
        if (arg2 != 16564) {
            this.method92(112);
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 34)
    public final void method90(byte arg0) throws IOException {
        if (arg0 <= -64 && this.field160 != null) {
            this.field160.close();
            this.field160 = null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() throws Throwable {
        if (this.field160 != null) {
            System.out.println("Warning! fileondisk " + this.field161 + " not closed correctly using close(). Auto-closing instead. ");
            this.method90((byte) -97);
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IBI[B)I", line = 65)
    public final int method91(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field160.read(arg3, arg2, arg0);
        if (var5 > 0) {
            this.field163 += var5;
        }
        if (arg1 < 94) {
            this.field161 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)Ljava/io/File;", line = 81)
    public final File method92(int arg0) {
        int var2 = 90 / ((arg0 + 24) / 55);
        return this.field161;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IJ)V", line = 91)
    public final void method93(int arg0, long arg1) throws IOException {
        this.field160.seek(arg1);
        this.field163 = arg1;
        if (arg0 != 0) {
            this.field163 = 20L;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
    public class17(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field160 = new RandomAccessFile(arg0, arg1);
        this.field163 = 0L;
        this.field161 = arg0;
        this.field162 = arg2;
        int var5 = this.field160.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field160.seek(0L);
            this.field160.write(var5);
        }
        this.field160.seek(0L);
    }
}
