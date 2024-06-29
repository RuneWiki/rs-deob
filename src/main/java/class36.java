import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class36 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field669;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "J")
    private long field670;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "J")
    private long field668;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Ljava/io/File;")
    private File field671;

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field669 != null) {
            System.out.println("Warning! fileondisk " + this.field671 + " not closed correctly using close(). Auto-closing instead. ");
            this.method257(-122);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)J")
    public final long method252(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field669 = null;
        }
        return this.field669.length();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BJ)V")
    public final void method253(byte arg0, long arg1) throws IOException {
        this.field669.seek(arg1);
        this.field668 = arg1;
        if (arg0 > -71) {
            this.field668 = -29L;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[BB)I")
    public final int method254(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = this.field669.read(arg2, arg1, arg0);
        if (var5 > 0) {
            this.field668 += var5;
        }
        if (arg3 > -2) {
            this.method256(82);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[B)V")
    public final void method255(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field670 < (long) arg2 + this.field668) {
            this.field669.seek(this.field670 + 1L);
            this.field669.write(1);
            throw new EOFException();
        }
        if (arg0 <= 112) {
            this.method256(-80);
        }
        this.field669.write(arg3, arg1, arg2);
        this.field668 += arg2;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method256(int arg0) {
        return arg0 <= 125 ? null : this.field671;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class36(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field669 = new RandomAccessFile(arg0, arg1);
        this.field670 = arg2;
        this.field668 = 0L;
        this.field671 = arg0;
        int var5 = this.field669.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field669.seek(0L);
            this.field669.write(var5);
        }
        this.field669.seek(0L);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) throws IOException {
        if (this.field669 != null) {
            this.field669.close();
            this.field669 = null;
        }
        if (arg0 >= -102) {
            this.method256(97);
        }
    }
}
