import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 {

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field41;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "J")
    private long field40;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Ljava/io/File;")
    private File field38;

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "J")
    private long field39;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([BIII)V", line = 4)
    public final void method18(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if ((long) arg1 + this.field39 > this.field40) {
            this.field41.seek(this.field40 + 1L);
            this.field41.write(1);
            throw new EOFException();
        } else {
            int var5 = -120 % ((arg3 + 85) / 40);
            this.field41.write(arg0, arg2, arg1);
            this.field39 += arg1;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)Ljava/io/File;", line = 22)
    public final File method19(int arg0) {
        if (arg0 != 0) {
            this.method19(122);
        }
        return this.field38;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IJ)V", line = 32)
    public final void method20(int arg0, long arg1) throws IOException {
        this.field41.seek(arg1);
        int var4 = 84 % ((-arg0 - 52) / 53);
        this.field39 = arg1;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)V", line = 42)
    public final void method21(byte arg0) throws IOException {
        this.field41.close();
        if (arg0 >= -28) {
            this.method19(-77);
        }
        this.field41 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "([BIII)I", line = 56)
    public final int method22(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field41.read(arg0, arg3, arg2);
        if (arg1 < var5) {
            this.field39 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(B)J", line = 69)
    public final long method23(byte arg0) throws IOException {
        return arg0 == 55 ? this.field41.length() : -53L;
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 79)
    public class3(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field41 = new RandomAccessFile(arg0, arg1);
        this.field40 = arg2;
        this.field38 = arg0;
        this.field39 = 0L;
        int var5 = this.field41.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field41.seek(0L);
            this.field41.write(var5);
        }
        this.field41.seek(0L);
    }
}
