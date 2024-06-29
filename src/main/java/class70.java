import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1440;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "J")
    private long field1442;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "J")
    private long field1441;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Ljava/io/File;")
    private File field1443;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJ)V")
    public final void method556(byte arg0, long arg1) throws IOException {
        this.field1440.seek(arg1);
        if (arg0 != 64) {
            this.method559(-52);
        }
        this.field1442 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIIB)I")
    public final int method557(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        int var5 = this.field1440.read(arg0, arg2, arg1);
        if (arg3 <= 67) {
            this.method559(56);
        }
        if (var5 > 0) {
            this.field1442 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[BB)V")
    public final void method558(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if ((long) arg1 + this.field1442 > this.field1441) {
            this.field1440.seek(this.field1441 + 1L);
            this.field1440.write(1);
            throw new EOFException();
        }
        if (arg3 >= -126) {
            this.field1440 = null;
        }
        this.field1440.write(arg2, arg0, arg1);
        this.field1442 += arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method559(int arg0) {
        if (arg0 != -1) {
            this.field1440 = null;
        }
        return this.field1443;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public final void method560(int arg0) throws IOException {
        this.field1440.close();
        if (arg0 >= 13) {
            this.field1440 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)J")
    public final long method561(byte arg0) throws IOException {
        return arg0 == 107 ? this.field1440.length() : -74L;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class70(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1440 = new RandomAccessFile(arg0, arg1);
        this.field1442 = 0L;
        this.field1441 = arg2;
        this.field1443 = arg0;
        int var5 = this.field1440.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1440.seek(0L);
            this.field1440.write(var5);
        }
        this.field1440.seek(0L);
    }
}
