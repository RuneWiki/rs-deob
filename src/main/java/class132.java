import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class132 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3155;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Ljava/io/File;")
    private File field3156;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "J")
    private long field3157;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "J")
    private long field3158;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)J")
    public final long method1062(int arg0) throws IOException {
        if (arg0 < 8) {
            this.method1067(false);
        }
        return this.field3155.length();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IJ)V")
    public final void method1063(int arg0, long arg1) throws IOException {
        this.field3155.seek(arg1);
        this.field3158 = arg1;
        if (arg0 != 0) {
            this.field3158 = -108L;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[B)I")
    public final int method1064(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 16973) {
            this.field3157 = -54L;
        }
        int var5 = this.field3155.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field3158 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BIBI)V")
    public final void method1065(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 < 63) {
            this.method1067(false);
        }
        if ((long) arg3 + this.field3158 > this.field3157) {
            this.field3155.seek(this.field3157 + 1L);
            this.field3155.write(1);
            throw new EOFException();
        } else {
            this.field3155.write(arg0, arg1, arg3);
            this.field3158 += arg3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public final void method1066(byte arg0) throws IOException {
        if (arg0 >= 10) {
            this.field3155.close();
            this.field3155 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method1067(boolean arg0) {
        if (!arg0) {
            this.field3158 = -80L;
        }
        return this.field3156;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class132(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3155 = new RandomAccessFile(arg0, arg1);
        this.field3156 = arg0;
        this.field3157 = arg2;
        this.field3158 = 0L;
        int var5 = this.field3155.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3155.seek(0L);
            this.field3155.write(var5);
        }
        this.field3155.seek(0L);
    }
}
