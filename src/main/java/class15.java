import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 {

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field168;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Ljava/io/File;")
    private File field166;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "J")
    private long field167;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "J")
    private long field169;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZI[BI)V", line = 4)
    public final void method105(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field169 > this.field167) {
            this.field168.seek(this.field167 + 1L);
            this.field168.write(1);
            throw new EOFException();
        }
        if (!arg0) {
            this.field166 = null;
        }
        this.field168.write(arg2, arg1, arg3);
        this.field169 += arg3;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)Ljava/io/File;", line = 24)
    public final File method106(int arg0) {
        if (arg0 != -985) {
            this.method106(76);
        }
        return this.field166;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)J", line = 34)
    public final long method107(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method106(60);
        }
        return this.field168.length();
    }

    @OriginalMember(owner = "mapview!h", name = "finalize", descriptor = "()V", line = 45)
    protected final void finalize() throws Throwable {
        if (this.field168 != null) {
            System.out.println("Warning! fileondisk " + this.field166 + " not closed correctly using close(). Auto-closing instead. ");
            this.method108((byte) 32);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 59)
    public final void method108(byte arg0) throws IOException {
        if (arg0 < 24) {
            this.method106(-115);
        }
        if (this.field168 != null) {
            this.field168.close();
            this.field168 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IJ)V", line = 76)
    public final void method109(int arg0, long arg1) throws IOException {
        this.field168.seek(arg1);
        if (arg0 > -75) {
            this.field168 = null;
        }
        this.field169 = arg1;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(III[B)I", line = 88)
    public final int method110(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 11309) {
            this.method106(-61);
        }
        int var5 = this.field168.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field169 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 101)
    public class15(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field168 = new RandomAccessFile(arg0, arg1);
        this.field166 = arg0;
        this.field167 = arg2;
        this.field169 = 0L;
        int var5 = this.field168.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field168.seek(0L);
            this.field168.write(var5);
        }
        this.field168.seek(0L);
    }
}
