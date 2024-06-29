import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 {

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field134;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "J")
    private long field135;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "J")
    private long field133;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Ljava/io/File;")
    private File field132;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 4)
    public final void method64(byte arg0) throws IOException {
        if (this.field134 != null) {
            this.field134.close();
            this.field134 = null;
        }
        if (arg0 != -107) {
            this.method69(87);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        if (this.field134 != null) {
            System.out.println("Warning! fileondisk " + this.field132 + " not closed correctly using close(). Auto-closing instead. ");
            this.method64((byte) -107);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([BIIB)V", line = 35)
    public final void method65(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        int var5 = -117 % ((arg3 - 89) / 37);
        if (this.field133 >= (long) arg2 + this.field135) {
            this.field134.write(arg0, arg1, arg2);
            this.field135 += arg2;
        } else {
            this.field134.seek(this.field133 + 1L);
            this.field134.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 53)
    public class15(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field134 = new RandomAccessFile(arg0, arg1);
        this.field135 = 0L;
        this.field133 = arg2;
        this.field132 = arg0;
        int var5 = this.field134.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field134.seek(0L);
            this.field134.write(var5);
        }
        this.field134.seek(0L);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(JI)V", line = 84)
    public final void method66(long arg0, int arg1) throws IOException {
        if (arg1 < -62) {
            this.field134.seek(arg0);
            this.field135 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I[BII)I", line = 97)
    public final int method67(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field134.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field135 += var5;
        }
        if (arg0 != 27596) {
            this.method69(23);
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)J", line = 111)
    public final long method68(int arg0) throws IOException {
        return arg0 == 1999 ? this.field134.length() : -98L;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)Ljava/io/File;", line = 121)
    public final File method69(int arg0) {
        if (arg0 != -1) {
            this.field134 = null;
        }
        return this.field132;
    }
}
