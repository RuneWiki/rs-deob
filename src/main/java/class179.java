import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class179 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Llc;")
    public static class143 field3201 = class66.method374("scrollbar", -1);

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3206 = -1;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Llc;")
    private static class143 field3209 = class66.method374("Walk here", -1);

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Llc;")
    public static class143 field3210 = class66.method374(" GMT", -1);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Llc;")
    public static class143 field3200 = field3209;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Llc;")
    public static class143 field3204 = class66.method374(" )2>", -1);

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lbg;")
    public static class177 field3207 = new class177(64);

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field3212 = -1;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Z")
    public static boolean field3203;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "[Lbc;")
    public static class100[] field3205;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field3201 = null;
        field3209 = null;
        field3200 = null;
        if (arg0 <= 0) {
            field3210 = null;
            field3205 = null;
            field3207 = null;
            field3204 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLh;)Llc;")
    public static final class143 method1176(byte arg0, class190 arg1) {
        if (arg0 <= 126) {
            method1178(false, -40);
        }
        field3211++;
        return class192.method1303(arg1, 32767, (byte) -67);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lvh;IIIIIII)V")
    public static final void method1177(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class208.field3816) {
            class176.field3153 = 32;
        } else {
            class176.field3153 = 0;
        }
        field3199++;
        class208.field3816 = false;
        if (arg6 != 45) {
            field3210 = null;
        }
        if (class147.field2660 != 0) {
            if (arg5 >= arg4 && arg5 < (arg4 + 16) && arg2 >= arg1 && arg2 < (arg1 + 16)) {
                arg0.field882 -= 4;
                class141.method844((byte) -23, arg0);
            } else if (arg5 >= arg4 && arg4 + 16 > arg5 && (arg1 + arg3 - 16) <= arg2 && arg2 < (arg1 + arg3)) {
                arg0.field882 += 4;
                class141.method844((byte) -119, arg0);
            } else if ((arg4 - class176.field3153) <= arg5 && arg5 < (class176.field3153 + arg4 + 16) && arg1 + 16 <= arg2 && arg1 + arg3 - 16 > arg2) {
                int var8 = (arg3 - 32) * arg3 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - (var8 / 2) - (arg1 - -16);
                int var10 = arg3 - var8 - 32;
                arg0.field882 = (arg7 - arg3) * var9 / var10;
                class141.method844((byte) -128, arg0);
                class208.field3816 = true;
            }
        }
        if (class228.field4111 == 0) {
            return;
        }
        int var11 = arg0.field735;
        if (arg5 >= (arg4 - var11) && arg1 <= arg2 && (arg4 + 16) > arg5 && arg2 <= (arg1 + arg3)) {
            arg0.field882 += class228.field4111 * 45;
            class141.method844((byte) 48, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1178(boolean arg0, int arg1) {
        field3208++;
        if (!arg0) {
            field3201 = null;
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II[II[I)V")
    public static final void method1179(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var7 + (var9 & 0x1) < arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method1179(var6 - 1, arg1, arg2, -102, arg4);
            method1179(arg0, var6 + 1, arg2, -99, arg4);
        }
        field3202++;
        if (arg3 >= -51) {
            field3210 = null;
        }
    }
}
