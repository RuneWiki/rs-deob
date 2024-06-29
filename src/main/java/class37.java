import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ta")
public class class37 {

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field506;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "J")
    private long field504;

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "J")
    private long field505;

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "Ljava/io/File;")
    private File field507;

    @OriginalMember(owner = "mapview!ta", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field506 != null) {
            System.out.println("Warning! fileondisk " + this.field507 + " not closed correctly using close(). Auto-closing instead. ");
            this.method249((byte) 117);
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B)Ljava/io/File;", line = 17)
    public final File method245(byte arg0) {
        return arg0 < 112 ? (File) null : this.field507;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(BJ)V", line = 30)
    public final void method246(byte arg0, long arg1) throws IOException {
        this.field506.seek(arg1);
        this.field504 = arg1;
        if (arg0 != -122) {
            this.method245((byte) 52);
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)J", line = 41)
    public final long method247(int arg0) throws IOException {
        return arg0 == 1 ? this.field506.length() : 81L;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(BII[B)V", line = 52)
    public final void method248(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field504 > this.field505) {
            this.field506.seek(this.field505 + 1L);
            this.field506.write(1);
            throw new EOFException();
        }
        this.field506.write(arg3, arg2, arg1);
        this.field504 += arg1;
        if (arg0 < 107) {
            this.method245((byte) 57);
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(B)V", line = 71)
    public final void method249(byte arg0) throws IOException {
        if (arg0 < 114) {
            this.method245((byte) -5);
        }
        if (this.field506 != null) {
            this.field506.close();
            this.field506 = null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(II[BZ)I", line = 87)
    public final int method250(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        int var5 = this.field506.read(arg2, arg0, arg1);
        if (arg3) {
            this.field507 = null;
        }
        if (var5 > 0) {
            this.field504 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ta", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
    public class37(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field506 = new RandomAccessFile(arg0, arg1);
        this.field504 = 0L;
        this.field505 = arg2;
        this.field507 = arg0;
        int var5 = this.field506.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field506.seek(0L);
            this.field506.write(var5);
        }
        this.field506.seek(0L);
    }
}
