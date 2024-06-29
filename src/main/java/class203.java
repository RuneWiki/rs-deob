import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class203 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2860;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Ljava/io/File;")
    private File field2864;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "J")
    private long field2869;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "J")
    private long field2859;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Lno;")
    public static class652 field2870 = new class652();

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Ltf;")
    public static class264 field2872 = new class264(1, 7);

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Lnea;")
    public static class664 field2873 = new class664(1, -1);

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Leca;")
    public static class704 field2875 = new class704();

    @OriginalMember(owner = "client!em", name = "s", descriptor = "F")
    public static float field2876;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 4)
    public final void method1344(byte arg0) throws IOException {
        if (arg0 < 123) {
            return;
        }
        if (this.field2860 != null) {
            this.field2860.close();
            this.field2860 = null;
        }
        field2861++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II[BI)V", line = 23)
    public final void method1345(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2858++;
        if (this.field2869 < (long) arg0 + this.field2859) {
            this.field2860.seek(this.field2869);
            this.field2860.write(1);
            throw new EOFException();
        }
        this.field2860.write(arg2, arg1, arg0);
        if (arg3 != -4290) {
            field2874 = 109;
        }
        this.field2859 += arg0;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V", line = 44)
    public static void method1346(byte arg0) {
        field2873 = null;
        field2872 = null;
        if (arg0 != 102) {
            method1347(true, 64);
        }
        field2875 = null;
        field2870 = null;
    }

    @OriginalMember(owner = "client!em", name = "finalize", descriptor = "()V", line = 59)
    protected final void finalize() throws Throwable {
        field2862++;
        if (this.field2860 != null) {
            System.out.println("Warning! fileondisk " + this.field2864 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1344((byte) 125);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V", line = 73)
    public static final void method1347(boolean arg0, int arg1) {
        field2863++;
        if (!arg0) {
            method1352(-88, -54, 7);
        }
        class191 var2 = class6.method38(5, -96, arg1);
        var2.method1284((byte) -87);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Ljava/io/File;", line = 86)
    public final File method1348(int arg0) {
        field2871++;
        if (arg0 != 13427) {
            field2872 = null;
        }
        return this.field2864;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(JB)V", line = 97)
    public final void method1349(long arg0, byte arg1) throws IOException {
        if (arg1 < 92) {
            this.method1348(-102);
        }
        field2866++;
        this.field2860.seek(arg0);
        this.field2859 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIB[B)I", line = 110)
    public final int method1350(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field2865++;
        int var5 = this.field2860.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field2859 += var5;
        }
        if (arg2 > -113) {
            field2875 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)J", line = 130)
    public final long method1351(int arg0) throws IOException {
        if (arg0 > -48) {
            field2876 = -0.6121885F;
        }
        field2867++;
        return this.field2860.length();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z", line = 144)
    public static final boolean method1352(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field2874 = 111;
        }
        field2868++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 155)
    public class203(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field2860 = new RandomAccessFile(arg0, arg1);
        this.field2864 = arg0;
        this.field2869 = arg2;
        this.field2859 = 0L;
        int var5 = this.field2860.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2860.seek(0L);
            this.field2860.write(var5);
        }
        this.field2860.seek(0L);
    }
}
