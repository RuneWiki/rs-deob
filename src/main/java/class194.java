import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class194 extends class83 {

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field3130 = 0;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[I")
    public static int[] field3138 = new int[32];

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Z")
    public static boolean field3134 = true;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lgf;")
    public static class222 field3132 = new class222();

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "Lvh;")
    public static class108 field3139;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lac;")
    public static class126 field3136;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lwc;")
    public static class207 field3131;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "[Lcj;")
    public static class74[] field3133;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)I")
    public static final int method1270(int arg0, int arg1, int arg2, int arg3) {
        field3129++;
        if ((class229.field3862[arg3][arg1][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg0 == 2) {
            return arg3 <= 0 || (class229.field3862[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static void method1271(int arg0) {
        field3133 = null;
        field3138 = null;
        if (arg0 != 0) {
            method1270(-105, -81, 15, -10);
        }
        field3136 = null;
        field3139 = null;
        field3132 = null;
        field3131 = null;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public static final void method1272(int arg0) {
        if (arg0 >= -8) {
            method1270(-52, 127, 127, -69);
        }
        field3135++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class211.method1415(var3, var2, (byte) 124, true, var1, class79.field1367)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(IIII)V")
    public static final void method1273(int arg0, int arg1, int arg2, int arg3) {
        class109 var4 = class79.field1367[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class223 var5 = var4.field1976;
        if (var5 != null) {
            var5.field3767 = var5.field3767 * arg3 / 16;
            var5.field3756 = var5.field3756 * arg3 / 16;
        }
    }
}
