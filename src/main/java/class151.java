import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class151 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3727;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "J")
    private long field3726;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "J")
    private long field3724;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/io/File;")
    private File field3725;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public final void method1212(byte arg0) throws IOException {
        this.field3727.close();
        if (arg0 < 102) {
            this.method1215(65);
        }
        this.field3727 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BII)I")
    public final int method1213(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field3727.read(arg1, arg2, arg3);
        if (~var5 < arg0) {
            this.field3724 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BBI)V")
    public final void method1214(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field3724 > this.field3726) {
            this.field3727.seek(this.field3726 + 1L);
            this.field3727.write(1);
            throw new EOFException();
        } else if (arg2 <= -112) {
            this.field3727.write(arg1, arg0, arg3);
            this.field3724 += arg3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1215(int arg0) {
        if (arg0 < 125) {
            this.method1215(-91);
        }
        return this.field3725;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)J")
    public final long method1216(byte arg0) throws IOException {
        if (arg0 != -87) {
            this.method1215(42);
        }
        return this.field3727.length();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(JI)V")
    public final void method1217(long arg0, int arg1) throws IOException {
        this.field3727.seek(arg0);
        this.field3724 = arg0;
        if (arg1 != 0) {
            this.method1215(-36);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class151(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3727 = new RandomAccessFile(arg0, arg1);
        this.field3726 = arg2;
        this.field3724 = 0L;
        this.field3725 = arg0;
        int var5 = this.field3727.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3727.seek(0L);
            this.field3727.write(var5);
        }
        this.field3727.seek(0L);
    }
}
