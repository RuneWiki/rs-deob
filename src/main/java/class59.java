import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1561;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "J")
    private long field1563;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljava/io/File;")
    private File field1560;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "J")
    private long field1562;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method497(int arg0) throws IOException {
        if (arg0 > -12) {
            this.field1561 = null;
        }
        this.field1561.close();
        this.field1561 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method498(int arg0) {
        if (arg0 != 1) {
            this.field1563 = -70L;
        }
        return this.field1560;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JB)V")
    public final void method499(long arg0, byte arg1) throws IOException {
        this.field1561.seek(arg0);
        if (arg1 != -113) {
            this.method498(-29);
        }
        this.field1562 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class59(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field1561 = new RandomAccessFile(arg0, arg1);
        this.field1563 = arg2;
        this.field1560 = arg0;
        this.field1562 = 0L;
        int var5 = this.field1561.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1561.seek(0L);
            this.field1561.write(var5);
        }
        this.field1561.seek(0L);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BI)I")
    public final int method500(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field1561.read(arg2, arg0, arg1);
        int var6 = 77 % ((arg3 + 58) / 39);
        if (var5 > 0) {
            this.field1562 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIII)V")
    public final void method501(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 15924) {
            this.method498(-90);
        }
        if (this.field1563 < (long) arg3 + this.field1562) {
            this.field1561.seek(this.field1563 + 1L);
            this.field1561.write(1);
            throw new EOFException();
        } else {
            this.field1561.write(arg0, arg1, arg3);
            this.field1562 += arg3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)J")
    public final long method502(int arg0) throws IOException {
        if (arg0 != 91) {
            this.field1562 = 81L;
        }
        return this.field1561.length();
    }
}
