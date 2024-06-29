import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class59 extends class219 {

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    private int field906 = -32768;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "[B")
    public static byte[] field900 = new byte[32896];

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field897;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method390(byte arg0, String arg1) {
        field898++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 >= -110) {
            method391((byte) -18);
        }
        while (var2 > var4) {
            var3 = class277.method1862((byte) -106, arg1.charAt(var4)) + (var3 << 5) - var3;
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method391(byte arg0) {
        field897 = null;
        if (arg0 <= -6) {
            field900 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field902++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
    public final int method36() {
        field901++;
        return this.field906;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIJILqa;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class112 arg10) {
        field904++;
        class2 var13 = class259.method1735(this.field903, -14667).method1831((byte) -41, -1, 0, (class196) null, 0, this.field899);
        if (var13 != null) {
            var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field906 = var13.method36();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field900[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field905 = 0;
    }
}
