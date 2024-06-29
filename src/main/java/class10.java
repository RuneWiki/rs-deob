import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field205;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "J")
    private long field203;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "J")
    private long field202;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Ljava/io/File;")
    private File field204;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)J")
    public final long method71(int arg0) throws IOException {
        return arg0 == -18378 ? this.field205.length() : -128L;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JI)V")
    public final void method72(long arg0, int arg1) throws IOException {
        this.field205.seek(arg0);
        this.field203 = arg0;
        if (arg1 != 13811) {
            this.field203 = -18L;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[B)V")
    public final void method73(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field202 < (long) arg1 + this.field203) {
            this.field205.seek(this.field202 + 1L);
            this.field205.write(1);
            throw new EOFException();
        } else {
            this.field205.write(arg3, arg2, arg1);
            if (arg0 == 1) {
                this.field203 += arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIII)I")
    public final int method74(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 != -1666) {
            this.field204 = null;
        }
        int var5 = this.field205.read(arg0, arg2, arg1);
        if (var5 > 0) {
            this.field203 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public final void method75(int arg0) throws IOException {
        this.field205.close();
        if (arg0 != -30200) {
            this.field202 = 115L;
        }
        this.field205 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method76(byte arg0) {
        if (arg0 >= -3) {
            this.method76((byte) 124);
        }
        return this.field204;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class10(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field205 = new RandomAccessFile(arg0, arg1);
        this.field203 = 0L;
        this.field202 = arg2;
        this.field204 = arg0;
        int var5 = this.field205.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field205.seek(0L);
            this.field205.write(var5);
        }
        this.field205.seek(0L);
    }
}
