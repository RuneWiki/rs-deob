import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field141;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Ljava/io/File;")
    private File field142;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "J")
    private long field139;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "J")
    private long field140;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)J")
    public final long method32(byte arg0) throws IOException {
        if (arg0 != 43) {
            this.field139 = -96L;
        }
        return this.field141.length();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method33(boolean arg0) {
        if (arg0) {
            this.field141 = null;
        }
        return this.field142;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BIII)V")
    public final void method34(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field140 < (long) arg1 + this.field139) {
            this.field141.seek(this.field140 + 1L);
            this.field141.write(1);
            throw new EOFException();
        } else if (arg3 == -16047) {
            this.field141.write(arg0, arg2, arg1);
            this.field139 += arg1;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)V")
    public final void method35(long arg0, int arg1) throws IOException {
        if (arg1 != 1) {
            this.method33(true);
        }
        this.field141.seek(arg0);
        this.field139 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BIB)I")
    public final int method36(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 >= -53) {
            this.field140 = 41L;
        }
        int var5 = this.field141.read(arg1, arg0, arg2);
        if (var5 > 0) {
            this.field139 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public final void method37(byte arg0) throws IOException {
        this.field141.close();
        if (arg0 <= 13) {
            this.field141 = null;
        }
        this.field141 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class7(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field141 = new RandomAccessFile(arg0, arg1);
        this.field142 = arg0;
        this.field139 = 0L;
        this.field140 = arg2;
        int var5 = this.field141.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field141.seek(0L);
            this.field141.write(var5);
        }
        this.field141.seek(0L);
    }
}
