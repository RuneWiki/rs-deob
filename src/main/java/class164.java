import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class164 extends class172 {

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "Ljava/lang/Object;")
    private Object field2929;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "Leb;")
    public static class230 field2922 = class68.method589(0, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
    public static int[] field2927 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "Li;")
    public static class55 field2923;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIBII)V")
    public static final void method1225(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -35) {
            field2922 = null;
        }
        field2926++;
        class212 var5 = (class212) class75.field1366.method394((long) arg0, -21083);
        if (var5 == null) {
            var5 = new class212();
            class75.field1366.method388(-1, (long) arg0, var5);
        }
        if (arg4 >= var5.field3685.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field3685.length; var8++) {
                var6[var8] = var5.field3685[var8];
                var7[var8] = var5.field3679[var8];
            }
            for (int var9 = var5.field3685.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3679 = var7;
            var5.field3685 = var6;
        }
        var5.field3685[arg4] = arg3;
        var5.field3679[arg4] = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2919++;
        if (arg2 != 29999) {
            field2922 = null;
        }
        if (arg1 == arg7 && arg0 == arg9 && arg6 == arg8 && arg3 == arg5) {
            class117.method941(arg5, arg9, arg6, arg7, arg4, -10);
            return;
        }
        int var10 = arg7;
        int var11 = arg9;
        int var12 = arg1 * 3;
        int var13 = arg9 * 3;
        int var14 = arg0 * 3;
        int var15 = arg8 * 3;
        int var16 = arg3 * 3;
        int var17 = arg7 * 3;
        int var18 = var12 + arg6 - var15 - arg7;
        int var19 = arg5 + var14 - var16 - arg9;
        int var20 = var15 + var17 - var12 - var12;
        int var21 = var13 + var16 - var14 - var14;
        int var22 = var12 - var17;
        int var23 = var14 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var21 * var25;
            int var30 = var20 * var25;
            int var31 = var22 * var24;
            int var32 = arg7 + (var27 + var31 + var30 >> 12);
            int var33 = var23 * var24;
            int var34 = (var28 + var33 + var29 >> 12) + arg9;
            class117.method941(var34, var11, var32, var10, arg4, -10);
            var10 = var32;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z")
    public final boolean method1227(boolean arg0) {
        field2925++;
        if (arg0) {
            field2927 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)Lkd;")
    public static final class197 method1228(int arg0, int arg1, int arg2) {
        field2921++;
        class197 var3 = (class197) class103.field1874.method394((long) arg1 | (long) arg0 << 32, -21083);
        if (arg2 != -1665874464) {
            method1226(109, 59, -20, -116, -40, 36, -22, 102, 96, 50);
        }
        if (var3 == null) {
            var3 = new class197(arg0, arg1);
            class103.field1874.method388(-1, var3.field1166, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1229(int arg0) {
        field2928++;
        if (arg0 < 48) {
            this.method1227(true);
        }
        return this.field2929;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class164(Object arg0) {
        this.field2929 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
    public static void method1230(int arg0) {
        if (arg0 != 11923) {
            method1230(-56);
        }
        field2923 = null;
        field2922 = null;
        field2927 = null;
    }
}
