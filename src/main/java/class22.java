import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field394;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "J")
    private long field393;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljava/io/File;")
    private File field392;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "J")
    private long field395;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 3)
    public final void method173(int arg0) throws IOException {
        this.field394.close();
        this.field394 = null;
        if (arg0 != -1) {
            this.field393 = 58L;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII[B)V", line = 17)
    public final void method174(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg2 + this.field395 > this.field393) {
            this.field394.seek(this.field393 + 1L);
            this.field394.write(1);
            throw new EOFException();
        } else {
            this.field394.write(arg3, arg1, arg2);
            this.field395 += arg2;
            int var5 = 34 / ((arg0 + 54) / 42);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIII)I", line = 34)
    public final int method175(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field394.read(arg0, arg2, arg1);
        if (arg3 <= 25) {
            this.method177(-11);
        }
        if (var5 > 0) {
            this.field395 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)J", line = 50)
    public final long method176(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method177(114);
        }
        return this.field394.length();
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Ljava/io/File;", line = 60)
    public final File method177(int arg0) {
        if (arg0 <= 90) {
            this.field394 = null;
        }
        return this.field392;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IJ)V", line = 70)
    public final void method178(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            this.method177(-106);
        }
        this.field394.seek(arg1);
        this.field395 = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 82)
    public class22(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field394 = new RandomAccessFile(arg0, arg1);
        this.field393 = arg2;
        this.field392 = arg0;
        this.field395 = 0L;
    }
}
