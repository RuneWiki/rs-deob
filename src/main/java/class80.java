import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class80 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1929;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "J")
    private long field1928;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Ljava/io/File;")
    private File field1930;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "J")
    private long field1927;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI[B)I", line = 3)
    public final int method610(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field1929.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field1928 += var5;
        }
        if (arg1 >= -53) {
            this.method611(90);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Ljava/io/File;", line = 19)
    public final File method611(int arg0) {
        return arg0 <= 117 ? null : this.field1930;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)J", line = 34)
    public final long method612(byte arg0) throws IOException {
        if (arg0 != -128) {
            this.field1928 = -29L;
        }
        return this.field1929.length();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BI)V", line = 44)
    public final void method613(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1927 < (long) arg3 + this.field1928) {
            this.field1929.seek(this.field1927 + 1L);
            this.field1929.write(1);
            throw new EOFException();
        }
        this.field1929.write(arg2, arg0, arg3);
        this.field1928 += arg3;
        if (arg1 != 1) {
            this.method611(-127);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 62)
    public final void method614(int arg0) throws IOException {
        if (arg0 > -1) {
            this.field1927 = 14L;
        }
        this.field1929.close();
        this.field1929 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)V", line = 73)
    public final void method615(long arg0, int arg1) throws IOException {
        this.field1929.seek(arg0);
        if (arg1 != 0) {
            this.method611(95);
        }
        this.field1928 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 84)
    public class80(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1929 = new RandomAccessFile(arg0, arg1);
        this.field1928 = 0L;
        this.field1930 = arg0;
        this.field1927 = arg2;
    }
}
