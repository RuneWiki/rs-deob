import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lhe;")
    private static class54 field144 = class6.method58("Your ignore list is full)3 Max of 100 hit", false);

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field152 = 0;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lhe;")
    public static class54 field150 = class6.method58("mapback", false);

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lhe;")
    public static class54 field146 = class6.method58("sl_flags", false);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lhe;")
    public static class54 field142 = field144;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lhe;")
    public static class54 field151 = class6.method58("Hier wechseln", false);

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lhe;")
    public static class54 field155 = class6.method58("mapmarker", false);

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field165 = 0;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[I")
    public static int[] field164 = new int[2000];

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Z")
    public static boolean field156 = false;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lhe;")
    private static class54 field163 = class6.method58("Login limit exceeded)3", false);

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lhe;")
    public static class54 field157 = field163;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lse;")
    public static class130 field148 = new class130();

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Lhe;")
    public static class54 field171 = class6.method58("und Ihr Passwort ein)3", false);

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lhe;")
    private static class54 field169 = class6.method58("level)2", false);

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lhe;")
    public static class54 field168 = field169;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lhe;")
    private static class54 field172 = class6.method58("Your profile will be transferred in:", false);

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lhe;")
    private static class54 field174 = class6.method58("RuneScape is loading )2 please wait)3)3)3", false);

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Lhe;")
    public static class54 field170 = field174;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lhe;")
    public static class54 field167 = field172;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "J")
    public long field154;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lef;")
    public static class35 field162;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Lef;")
    public static class35 field173;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lad;")
    public class5 field153;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lad;")
    public class5 field158;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lie;")
    public static class61 field143;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method47(byte arg0) {
        field168 = null;
        field163 = null;
        field169 = null;
        field157 = null;
        field171 = null;
        field172 = null;
        field173 = null;
        field162 = null;
        field164 = null;
        field167 = null;
        field148 = null;
        field155 = null;
        field142 = null;
        field174 = null;
        field170 = null;
        field143 = null;
        if (arg0 <= 83) {
            field166 = -60;
        }
        field144 = null;
        field151 = null;
        field146 = null;
        field150 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        if (arg0 != -315) {
            field151 = null;
        }
        field159++;
        if (this.field158 != null) {
            this.field158.field153 = this.field153;
            this.field153.field158 = this.field158;
            this.field158 = null;
            this.field153 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILnc;)Z")
    public static final boolean method49(int arg0, class93 arg1) {
        field147++;
        int var2 = arg1.field2328;
        if (var2 == 205) {
            class151.field3404 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class143.field3267.method534(var4 == 1, 7872, var3);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class143.field3267.method541(var6 == 1, var5, 80);
        }
        if (arg0 >= -113) {
            field167 = null;
        }
        if (var2 == 324) {
            class143.field3267.method540(false, (byte) 97);
        }
        if (var2 == 325) {
            class143.field3267.method540(true, (byte) 77);
        }
        if (var2 == 326) {
            class131.field2969.method454(49, -105);
            class27.field714++;
            class143.field3267.method543(class131.field2969, -113);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
    public final boolean method50(boolean arg0) {
        field149++;
        if (!arg0) {
            method52(48, 112, 60, -125, 34, null, -7, 115);
        }
        return this.field158 != null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIII)I")
    public static final int method51(byte arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 179) {
            arg2 /= 2;
        }
        if (arg0 != -1) {
            method52(110, 80, 49, 2, -125, null, 113, -9);
        }
        if (arg1 > 192) {
            arg2 /= 2;
        }
        field161++;
        if (arg1 > 217) {
            arg2 /= 2;
        }
        if (arg1 > 243) {
            arg2 /= 2;
        }
        return arg1 / 2 + (arg2 / 32 << 7) + (arg3 / 4 << 10);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIILnc;II)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, class93 arg5, int arg6, int arg7) {
        field160++;
        if (class64.field1556) {
            class13.field350 = 32;
        } else {
            class13.field350 = 0;
        }
        class64.field1556 = false;
        if (arg2 < 73) {
            field148 = null;
        }
        if (class22.field620 != 0) {
            if (arg1 <= arg0 && arg0 < arg1 + 16 && arg7 >= arg6 && arg6 + 16 > arg7) {
                arg5.field2339 -= 4;
                class134.method1005(arg5, 0);
            } else if (arg1 <= arg0 && arg0 < arg1 + 16 && arg6 + arg4 - 16 <= arg7 && arg7 < arg6 + arg4) {
                arg5.field2339 += 4;
                class134.method1005(arg5, 0);
            } else if (arg0 >= arg1 - class13.field350 && arg1 + class13.field350 + 16 > arg0 && arg6 + 16 <= arg7 && arg6 + arg4 - 16 > arg7) {
                int var8 = (arg4 - 32) * arg4 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - arg6 - var8 / 2 - 16;
                int var10 = arg4 - var8 - 32;
                arg5.field2339 = (arg3 - arg4) * var9 / var10;
                class134.method1005(arg5, 0);
                class64.field1556 = true;
            }
        }
        if (class6.field184 == 0) {
            return;
        }
        int var11 = arg5.field2257;
        if (arg1 - var11 <= arg0 && arg6 <= arg7 && arg0 < arg1 + 16 && arg6 + arg4 >= arg7) {
            arg5.field2339 += class6.field184 * 45;
            class134.method1005(arg5, 0);
            return;
        }
    }
}
