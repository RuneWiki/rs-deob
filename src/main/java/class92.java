import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class92 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2244;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Ljava/io/File;")
    private File field2247;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "J")
    private long field2245;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "J")
    private long field2246;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)J")
    public final long method758(int arg0) throws IOException {
        if (arg0 <= 96) {
            this.method762((byte) 97);
        }
        return this.field2244.length();
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method759(int arg0) throws IOException {
        if (arg0 == 1) {
            this.field2244.close();
            this.field2244 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[BII)I")
    public final int method760(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2244.read(arg1, arg3, arg0);
        if (arg2 == 25624) {
            if (var5 > 0) {
                this.field2245 += var5;
            }
            return var5;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(JB)V")
    public final void method761(long arg0, byte arg1) throws IOException {
        this.field2244.seek(arg0);
        this.field2245 = arg0;
        if (arg1 < 89) {
            this.method762((byte) -19);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method762(byte arg0) {
        return arg0 <= 22 ? null : this.field2247;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([BBII)V")
    public final void method763(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if ((long) arg2 + this.field2245 > this.field2246) {
            this.field2244.seek(this.field2246 + 1L);
            this.field2244.write(1);
            throw new EOFException();
        }
        this.field2244.write(arg0, arg3, arg2);
        this.field2245 += arg2;
        if (arg1 < 97) {
            this.method762((byte) 71);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class92(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2244 = new RandomAccessFile(arg0, arg1);
        this.field2247 = arg0;
        this.field2245 = 0L;
        this.field2246 = arg2;
        int var5 = this.field2244.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2244.seek(0L);
            this.field2244.write(var5);
        }
        this.field2244.seek(0L);
    }
}
