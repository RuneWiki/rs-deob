import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field255;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "J")
    private long field252;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Ljava/io/File;")
    private File field254;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "J")
    private long field253;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 6)
    public final void method132(byte arg0) throws IOException {
        int var2 = -81 % ((arg0 + 3) / 50);
        this.field255.close();
        this.field255 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Ljava/io/File;", line = 16)
    public final File method133(boolean arg0) {
        return arg0 ? this.field254 : null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(JB)V", line = 27)
    public final void method134(long arg0, byte arg1) throws IOException {
        if (arg1 == -68) {
            this.field255.seek(arg0);
            this.field252 = arg0;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BIIB)I", line = 38)
    public final int method135(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        int var5 = 68 % ((arg3 - 5) / 55);
        int var6 = this.field255.read(arg0, arg2, arg1);
        if (var6 > 0) {
            this.field252 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 52)
    public class13(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field255 = new RandomAccessFile(arg0, arg1);
        this.field252 = 0L;
        this.field254 = arg0;
        this.field253 = arg2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)J", line = 73)
    public final long method136(int arg0) throws IOException {
        if (arg0 != 1) {
            this.field253 = -93L;
        }
        return this.field255.length();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII[B)V", line = 83)
    public final void method137(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field253 < (long) arg1 + this.field252) {
            this.field255.seek(this.field253 + 1L);
            this.field255.write(1);
            throw new EOFException();
        }
        this.field255.write(arg3, arg2, arg1);
        if (!arg0) {
            this.field252 = -127L;
        }
        this.field252 += arg1;
    }
}
