import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field19;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "Ljava/io/File;")
    private File field21;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "J")
    private long field17;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "J")
    private long field15;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field22 = -1;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Ljb;")
    public static class519 field13 = new class519(122, 0);

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lms;")
    public static class791 field14;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 4)
    public final void method6(int arg0) throws IOException {
        field10++;
        if (this.field19 != null) {
            this.field19.close();
            this.field19 = null;
        }
        if (arg0 < 55) {
            method11((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II[BI)I", line = 22)
    public final int method7(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field12++;
        int var5 = this.field19.read(arg2, arg1, arg0);
        if (arg3 < var5) {
            this.field17 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ro", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() throws Throwable {
        field18++;
        if (this.field19 != null) {
            System.out.println("Warning! fileondisk " + this.field21 + " not closed correctly using close(). Auto-closing instead. ");
            this.method6(108);
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II[BI)V", line = 58)
    public final void method8(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field20++;
        if ((long) arg0 + this.field17 > this.field15) {
            this.field19.seek(this.field15);
            this.field19.write(1);
            throw new EOFException();
        }
        this.field19.write(arg2, arg1, arg0);
        this.field17 += arg0;
        if (arg3 != 29620) {
            this.field17 = -42L;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BJ)V", line = 85)
    public final void method9(byte arg0, long arg1) throws IOException {
        if (arg0 <= -87) {
            this.field19.seek(arg1);
            field16++;
            this.field17 = arg1;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 97)
    public class2(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field19 = new RandomAccessFile(arg0, arg1);
        this.field21 = arg0;
        this.field17 = 0L;
        this.field15 = arg2;
        int var5 = this.field19.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field19.seek(0L);
            this.field19.write(var5);
        }
        this.field19.seek(0L);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)Ljava/io/File;", line = 128)
    public final File method10(int arg0) {
        field11++;
        if (arg0 != -1) {
            method11((byte) 31);
        }
        return this.field21;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 139)
    public static void method11(byte arg0) {
        field14 = null;
        if (arg0 != 29) {
            method11((byte) 111);
        }
        field13 = null;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)J", line = 153)
    public final long method12(int arg0) throws IOException {
        field9++;
        if (arg0 != -10565) {
            this.field15 = 73L;
        }
        return this.field19.length();
    }
}
