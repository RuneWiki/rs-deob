import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class32 {

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field452;

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "J")
    private long field454;

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "J")
    private long field455;

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "Ljava/io/File;")
    private File field453;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(BII[B)I", line = 4)
    public final int method220(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != -69) {
            this.field455 = -87L;
        }
        int var5 = this.field452.read(arg3, arg2, arg1);
        if (var5 > 0) {
            this.field454 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(JI)V", line = 19)
    public final void method221(long arg0, int arg1) throws IOException {
        if (arg1 >= -107) {
            this.method223(false);
        }
        this.field452.seek(arg0);
        this.field454 = arg0;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(I)J", line = 32)
    public final long method222(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method223(false);
        }
        return this.field452.length();
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(Z)Ljava/io/File;", line = 42)
    public final File method223(boolean arg0) {
        if (arg0) {
            this.method223(true);
        }
        return this.field453;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(III[B)V", line = 54)
    public final void method224(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field455 < (long) arg1 + this.field454) {
            this.field452.seek(this.field455 + 1L);
            this.field452.write(1);
            throw new EOFException();
        } else {
            this.field452.write(arg3, arg2, arg1);
            if (arg0 >= 38) {
                this.field454 += arg1;
            }
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(B)V", line = 73)
    public final void method225(byte arg0) throws IOException {
        this.field452.close();
        this.field452 = null;
        if (arg0 != 71) {
            this.method223(true);
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 83)
    public class32(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field452 = new RandomAccessFile(arg0, arg1);
        this.field454 = 0L;
        this.field455 = arg2;
        this.field453 = arg0;
        int var5 = this.field452.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field452.seek(0L);
            this.field452.write(var5);
        }
        this.field452.seek(0L);
    }
}
