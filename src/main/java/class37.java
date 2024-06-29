import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ta")
public class class37 {

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field484;

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "J")
    private long field483;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "J")
    private long field482;

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "Ljava/io/File;")
    private File field485;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B)V", line = 4)
    public final void method234(byte arg0) throws IOException {
        if (arg0 == 121 && this.field484 != null) {
            this.field484.close();
            this.field484 = null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "finalize", descriptor = "()V", line = 24)
    protected final void finalize() throws Throwable {
        if (this.field484 != null) {
            System.out.println("Warning! fileondisk " + this.field485 + " not closed correctly using close(). Auto-closing instead. ");
            this.method234((byte) 121);
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(II[BI)I", line = 38)
    public final int method235(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field484.read(arg2, arg3, arg1);
        if (var5 > 0) {
            this.field483 += var5;
        }
        if (arg0 <= 115) {
            this.method237(true);
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(IJ)V", line = 52)
    public final void method236(int arg0, long arg1) throws IOException {
        this.field484.seek(arg1);
        this.field483 = arg1;
        if (arg0 != 0) {
            this.field482 = -18L;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Z)Ljava/io/File;", line = 65)
    public final File method237(boolean arg0) {
        if (arg0) {
            this.method237(true);
        }
        return this.field485;
    }

    @OriginalMember(owner = "mapview!ta", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 73)
    public class37(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field484 = new RandomAccessFile(arg0, arg1);
        this.field483 = 0L;
        this.field482 = arg2;
        this.field485 = arg0;
        int var5 = this.field484.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field484.seek(0L);
            this.field484.write(var5);
        }
        this.field484.seek(0L);
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(II[BB)V", line = 106)
    public final void method238(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if ((long) arg0 + this.field483 > this.field482) {
            this.field484.seek(this.field482 + 1L);
            this.field484.write(1);
            throw new EOFException();
        }
        if (arg3 != -5) {
            this.method237(true);
        }
        this.field484.write(arg2, arg1, arg0);
        this.field483 += arg0;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)J", line = 125)
    public final long method239(int arg0) throws IOException {
        return arg0 < 21 ? 59L : this.field484.length();
    }
}
