import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class30 {

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field393;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Ljava/io/File;")
    private File field394;

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "J")
    private long field392;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "J")
    private long field391;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 6)
    public final void method186(int arg0) throws IOException {
        this.field393.close();
        if (arg0 != 0) {
            this.method188(-60);
        }
        this.field393 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([BBII)I", line = 17)
    public final int method187(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 > -80) {
            return 50;
        }
        int var5 = this.field393.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field391 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(I)Ljava/io/File;", line = 33)
    public final File method188(int arg0) {
        if (arg0 >= -29) {
            this.method188(80);
        }
        return this.field394;
    }

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "(I)J", line = 44)
    public final long method189(int arg0) throws IOException {
        if (arg0 > -32) {
            this.method188(124);
        }
        return this.field393.length();
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IJ)V", line = 56)
    public final void method190(int arg0, long arg1) throws IOException {
        if (arg0 != 21078) {
            this.method188(46);
        }
        this.field393.seek(arg1);
        this.field391 = arg1;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([BIZI)V", line = 68)
    public final void method191(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        if (this.field392 < (long) arg3 + this.field391) {
            this.field393.seek(this.field392 + 1L);
            this.field393.write(1);
            throw new EOFException();
        }
        if (arg2) {
            this.method188(-88);
        }
        this.field393.write(arg0, arg1, arg3);
        this.field391 += arg3;
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 84)
    public class30(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field393 = new RandomAccessFile(arg0, arg1);
        this.field394 = arg0;
        this.field392 = arg2;
        this.field391 = 0L;
        int var5 = this.field393.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field393.seek(0L);
            this.field393.write(var5);
        }
        this.field393.seek(0L);
    }
}
