import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class12 {

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field161;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "J")
    private long field163;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Ljava/io/File;")
    private File field164;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "J")
    private long field162;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(JI)V", line = 4)
    public final void method82(long arg0, int arg1) throws IOException {
        this.field161.seek(arg0);
        if (arg1 != 417) {
            this.method83((byte) -38);
        }
        this.field163 = arg0;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)Ljava/io/File;", line = 17)
    public final File method83(byte arg0) {
        int var2 = -72 % ((-arg0 - 79) / 40);
        return this.field164;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I[BII)V", line = 25)
    public final void method84(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field162 < (long) arg2 + this.field163) {
            this.field161.seek(this.field162 + 1L);
            this.field161.write(1);
            throw new EOFException();
        }
        if (arg3 < 77) {
            this.method83((byte) 105);
        }
        this.field161.write(arg1, arg0, arg2);
        this.field163 += arg2;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(BII[B)I", line = 46)
    public final int method85(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 <= 45) {
            this.field162 = -115L;
        }
        int var5 = this.field161.read(arg3, arg2, arg1);
        if (var5 > 0) {
            this.field163 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)J", line = 61)
    public final long method86(int arg0) throws IOException {
        return arg0 == -1 ? this.field161.length() : -100L;
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(B)V", line = 72)
    public final void method87(byte arg0) throws IOException {
        this.field161.close();
        if (arg0 < 59) {
            this.method83((byte) -72);
        }
        this.field161 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 83)
    public class12(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field161 = new RandomAccessFile(arg0, arg1);
        this.field163 = 0L;
        this.field164 = arg0;
        this.field162 = arg2;
    }
}
