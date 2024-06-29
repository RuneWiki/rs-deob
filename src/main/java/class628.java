import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class628 extends class569 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lug;")
    public class60 field8902;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[C")
    private static char[] field8903 = new char[64];

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
    public static int[] field8904;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[[B")
    public static byte[][] field8905;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field8906;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field8903[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field8903[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field8903[var2] = (char) (var2 + 48 - 52);
        }
        field8903[62] = '+';
        field8903[63] = '/';
        field8904 = new int[14];
        field8905 = new byte[50][];
        field8906 = 0;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 3)
    public static void method3618(int arg0) {
        field8903 = null;
        if (arg0 >= -5) {
            field8905 = null;
        }
        field8904 = null;
        field8905 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lch;II[B)V", line = 19)
    public class628(class38 arg0, int arg1, int arg2, byte[] arg3) {
        this.field8902 = arg0.method350(arg1, arg3, false, -121, arg2, class315.field4259);
        this.field8902.method560(false, 16609, false);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lch;II[I)V", line = 66)
    public class628(class38 arg0, int arg1, int arg2, int[] arg3) {
        this.field8902 = arg0.method303(false, arg2, arg1, arg3, -5);
        this.field8902.method560(false, 16609, false);
    }
}
