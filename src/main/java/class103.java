import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class103 {

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lcd;")
    private static class23 field2195 = class54.method414(" has logged out)3", -1);

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lcd;")
    private static class23 field2198 = class54.method414("wave2:", -1);

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lcd;")
    public static class23 field2193 = field2195;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    public static int[] field2188 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lcd;")
    public static class23 field2194 = field2198;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
    public static int[] field2201 = new int[500];

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lcd;")
    private static class23 field2200 = class54.method414("Take", -1);

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Lcd;")
    public static class23 field2199 = field2198;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lcd;")
    public static class23 field2192 = field2200;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
    public static boolean field2202;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
    public static int[] field2190;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method677(int arg0) {
        int var1 = 19 / ((-arg0 - 83) / 41);
        field2199 = null;
        field2200 = null;
        field2192 = null;
        field2194 = null;
        field2195 = null;
        field2193 = null;
        field2198 = null;
        field2188 = null;
        field2201 = null;
        field2190 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILva;IIIII)V")
    public static final void method678(int arg0, int arg1, class189 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= 0 && arg1 < 104 && arg5 >= 0 && arg5 < 104) {
            class53.field1253[arg0][arg1][arg5] = 0;
            while (true) {
                int var8 = arg2.method1202(-62);
                if (var8 == 0) {
                    if (arg0 == 0) {
                        class182.field3596[0][arg1][arg5] = -class101.method673(arg1 + arg4 + 932731, (byte) -20, arg5 + arg7 + 556238) * 8;
                    } else {
                        class182.field3596[arg0][arg1][arg5] = class182.field3596[arg0 - 1][arg1][arg5] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg2.method1202(-11);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg0 == 0) {
                        class182.field3596[0][arg1][arg5] = -var9 * 8;
                    } else {
                        class182.field3596[arg0][arg1][arg5] = class182.field3596[arg0 - 1][arg1][arg5] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class163.field3270[arg0][arg1][arg5] = arg2.method1204(true);
                    class60.field1402[arg0][arg1][arg5] = (byte) ((var8 - 2) / 4);
                    class12.field233[arg0][arg1][arg5] = (byte) class27.method198(3, var8 + arg6 - 2);
                } else if (var8 <= 81) {
                    class53.field1253[arg0][arg1][arg5] = (byte) (var8 - 49);
                } else {
                    class9.field185[arg0][arg1][arg5] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg2.method1202(-48);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg2.method1202(-70);
                    break;
                }
                if (var10 <= 49) {
                    arg2.method1202(-41);
                }
            }
        }
        if (arg3 >= -87) {
            field2188 = null;
        }
        field2191++;
    }
}
