import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!wa")
public class class44 {

    @OriginalMember(owner = "mapview!wa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field543;

    @OriginalMember(owner = "mapview!wa", name = "c", descriptor = "J")
    private long field545;

    @OriginalMember(owner = "mapview!wa", name = "d", descriptor = "J")
    private long field546;

    @OriginalMember(owner = "mapview!wa", name = "b", descriptor = "Ljava/io/File;")
    private File field544;

    @OriginalMember(owner = "mapview!wa", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field543 != null) {
            System.out.println("Warning! fileondisk " + this.field544 + " not closed correctly using close(). Auto-closing instead. ");
            this.method270(false);
        }
    }

    @OriginalMember(owner = "mapview!wa", name = "a", descriptor = "(JB)V", line = 16)
    public final void method268(long arg0, byte arg1) throws IOException {
        if (arg1 != -46) {
            this.field544 = null;
        }
        this.field543.seek(arg0);
        this.field545 = arg0;
    }

    @OriginalMember(owner = "mapview!wa", name = "a", descriptor = "(IIB[B)V", line = 31)
    public final void method269(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field545 <= this.field546) {
            this.field543.write(arg3, arg0, arg1);
            int var5 = -45 / ((52 - arg2) / 49);
            this.field545 += arg1;
        } else {
            this.field543.seek(this.field546 + 1L);
            this.field543.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "mapview!wa", name = "a", descriptor = "(Z)V", line = 49)
    public final void method270(boolean arg0) throws IOException {
        if (!arg0 && this.field543 != null) {
            this.field543.close();
            this.field543 = null;
        }
    }

    @OriginalMember(owner = "mapview!wa", name = "a", descriptor = "([BIIZ)I", line = 66)
    public final int method271(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        int var5 = this.field543.read(arg0, arg2, arg1);
        if (var5 > 0) {
            this.field545 += var5;
        }
        if (arg3) {
            this.field543 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!wa", name = "b", descriptor = "(Z)Ljava/io/File;", line = 81)
    public final File method272(boolean arg0) {
        if (!arg0) {
            this.field546 = -5L;
        }
        return this.field544;
    }

    @OriginalMember(owner = "mapview!wa", name = "a", descriptor = "(B)J", line = 91)
    public final long method273(byte arg0) throws IOException {
        if (arg0 != -92) {
            this.field545 = 86L;
        }
        return this.field543.length();
    }

    @OriginalMember(owner = "mapview!wa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
    public class44(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field543 = new RandomAccessFile(arg0, arg1);
        this.field545 = 0L;
        this.field546 = arg2;
        this.field544 = arg0;
        int var5 = this.field543.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field543.seek(0L);
            this.field543.write(var5);
        }
        this.field543.seek(0L);
    }
}
