import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field21;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "J")
    private long field19;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "J")
    private long field20;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Ljava/io/File;")
    private File field22;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([BIII)I", line = 5)
    public final int method6(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field21.read(arg0, arg1, arg2);
        if (~var5 < arg3) {
            this.field20 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)Ljava/io/File;", line = 19)
    public final File method7(byte arg0) {
        int var2 = -97 / ((arg0 + 49) / 34);
        return this.field22;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)J", line = 27)
    public final long method8(int arg0) throws IOException {
        return arg0 == -1 ? this.field21.length() : 120L;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)V", line = 40)
    public final void method9(int arg0) throws IOException {
        if (this.field21 != null) {
            this.field21.close();
            this.field21 = null;
        }
        if (arg0 != 1) {
            this.method7((byte) 85);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(II[BI)V", line = 56)
    public final void method10(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg1 + this.field20 > this.field19) {
            this.field21.seek(this.field19 + 1L);
            this.field21.write(1);
            throw new EOFException();
        }
        if (arg0 != 1) {
            this.method7((byte) 96);
        }
        this.field21.write(arg2, arg3, arg1);
        this.field20 += arg1;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IJ)V", line = 75)
    public final void method11(int arg0, long arg1) throws IOException {
        if (arg0 >= 1) {
            this.field21.seek(arg1);
            this.field20 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "finalize", descriptor = "()V", line = 86)
    protected final void finalize() throws Throwable {
        if (this.field21 != null) {
            System.out.println("Warning! fileondisk " + this.field22 + " not closed correctly using close(). Auto-closing instead. ");
            this.method9(1);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 97)
    public class4(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field21 = new RandomAccessFile(arg0, arg1);
        this.field19 = arg2;
        this.field20 = 0L;
        this.field22 = arg0;
        int var5 = this.field21.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field21.seek(0L);
            this.field21.write(var5);
        }
        this.field21.seek(0L);
    }
}
