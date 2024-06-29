import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 extends class125 {

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lod;")
    public static class101 field3088 = class46.method335(-97, "event_opbase");

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lod;")
    public static class101 field3092 = class46.method335(94, "Passwort: ");

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lod;")
    public static class101 field3090 = class46.method335(116, "Fallen lassen");

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "Lod;")
    private static class101 field3117 = class46.method335(91, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "Lod;")
    public static class101 field3115 = field3117;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field3096 = 0;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "Lod;")
    public static class101 field3120 = class46.method335(-123, "swe");

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Lre;")
    public class123 field3106;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "Lsb;")
    public class127 field3119;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Lvd;")
    public class150 field3097;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Ljf;")
    public class68 field3108;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public final void method1039(int arg0) {
        this.field3119 = null;
        int var2 = -82 % ((-arg0 - 60) / 46);
        field3110++;
        this.field3106 = null;
        this.field3097 = null;
        this.field3108 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZII)V")
    public static final void method1040(byte arg0, boolean arg1, int arg2, int arg3) {
        field3101++;
        if (arg0 != 122) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class7.field105 = arg1;
        class140.field3224 = arg2;
        class43.field1029 = arg3;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field3115 = null;
        field3092 = null;
        if (arg0 <= 122) {
            field3102 = -18;
        }
        field3088 = null;
        field3120 = null;
        field3117 = null;
        field3090 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZIIII)Lrd;")
    public static final class122 method1042(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = ((long) arg3 << 40) + ((long) arg4 << 16) + (long) arg0 + ((long) arg2 << 38);
        field3116++;
        if (!arg1) {
            class122 var8 = (class122) class42.field1013.method140(true, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class155 var9 = class137.method1045((byte) -99, arg0);
        if (arg4 > 1 && var9.field3542 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field3528[var11] <= arg4 && var9.field3528[var11] != 0) {
                    var10 = var9.field3542[var11];
                }
            }
            if (var10 != -1) {
                var9 = class137.method1045((byte) -64, var10);
            }
        }
        if (arg5 != -5750) {
            field3095 = -120;
        }
        class113 var12 = var9.method1201(1, (byte) 43);
        if (var12 == null) {
            return null;
        }
        class122 var13 = null;
        if (var9.field3517 != -1) {
            var13 = method1042(var9.field3572, true, 1, 0, 10, -5750);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class38.field924;
        int[] var15 = new int[4];
        int[] var16 = class38.field923;
        int var17 = class38.field927;
        class38.method290(var15);
        class122 var18 = new class122(36, 32);
        class38.method281(var18.field2692, 36, 32);
        class38.method285();
        class124.method943();
        class124.method952(16, 16);
        class124.field2707 = false;
        int var19 = var9.field3533;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class124.field2709[var9.field3577] * var19 >> 16;
        int var21 = class124.field2717[var9.field3577] * var19 >> 16;
        var12.method828();
        var12.method827(0, var9.field3546, var9.field3538, var9.field3577, var9.field3552, var12.field1157 / 2 + var20 + var9.field3556, var9.field3556 + var21);
        if (arg2 >= 1) {
            var18.method917(1);
        }
        if (arg2 >= 2) {
            var18.method917(16777215);
        }
        if (arg3 != 0) {
            var18.method913(arg3);
        }
        class38.method281(var18.field2692, 36, 32);
        if (var9.field3517 != -1) {
            var13.method937(0, 0);
        }
        if (!arg1 && (var9.field3521 == 1 || arg4 != 1) && arg4 != -1) {
            class93.field2003.method852(class97.method678(arg4, 0), 0, 9, 16776960, 1);
        }
        if (!arg1) {
            class42.field1013.method141(var18, var6, (byte) -127);
        }
        class38.method281(var16, var14, var17);
        class38.method274(var15);
        class124.method943();
        class124.field2707 = true;
        return var18;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -42 / ((44 - arg3) / 62);
        field3100++;
        if (class52.field1197 == 0 || arg1 == 0 || class143.field3290 >= 50) {
            return;
        }
        class120.field2648[class143.field3290] = arg2;
        class13.field284[class143.field3290] = arg1;
        class148.field3375[class143.field3290] = arg0;
        class44.field1043[class143.field3290] = null;
        class84.field1840[class143.field3290] = 0;
        class143.field3290++;
    }
}
