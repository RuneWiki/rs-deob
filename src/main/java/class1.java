import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[I")
    public static int[] field4 = new int[500];

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lvf;")
    public static class265 field8 = class87.method582(-46, "Regarder dans cette direction");

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[Lvf;")
    public static class265[] field7 = new class265[1000];

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Lhh;")
    public static class177 field13 = new class177();

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Lvf;")
    public static class265 field17 = class87.method582(-46, "ondulation:");

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lvf;")
    public static class265 field19 = class87.method582(-46, "blinken2:");

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[I")
    public static int[] field22 = new int[32];

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Lvf;")
    private static class265 field23 = class87.method582(-46, "Loading textures )2 ");

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Lvf;")
    public static class265 field18 = field23;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Ldg;")
    public static class276 field24 = new class276(64);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lng;I)Lue;")
    public static final class13 method1(class135 arg0, int arg1) {
        field10++;
        class13 var2 = new class13(arg0.method942(false), arg0.method942(false), arg0.method927(125), arg0.method927(125), arg0.method949(3933), arg0.method920((byte) 62) == 1, arg0.method920((byte) 122));
        if (arg1 > -34) {
            field13 = null;
        }
        int var3 = arg0.method920((byte) 59);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field411.method785(new class107(arg0.method927(125), arg0.method927(126), arg0.method927(125), arg0.method927(125)), -29);
        }
        var2.method100((byte) 25);
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V")
    public static final void method2(boolean arg0, int arg1) {
        field2++;
        class8.field267.method1891(-23549, arg1);
        class91.field1612.method1891(-23549, arg1);
        if (!arg0) {
            method4((byte) -118, 64L);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method3(int arg0, int arg1) {
        field6++;
        if (arg1 != 128) {
            return null;
        } else if (arg0 == 100 && class252.field4344 > 0) {
            byte[] var2 = class130.field2362[--class252.field4344];
            class130.field2362[class252.field4344] = null;
            return var2;
        } else if (arg0 == 5000 && class236.field4122 > 0) {
            byte[] var3 = class87.field1590[--class236.field4122];
            class87.field1590[class236.field4122] = null;
            return var3;
        } else if (arg0 == 30000 && class53.field1096 > 0) {
            byte[] var4 = class111.field1937[--class53.field1096];
            class111.field1937[class53.field1096] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BJ)V")
    public static final void method4(byte arg0, long arg1) {
        if (arg0 < 48) {
            field18 = null;
        }
        field11++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class89.field1603; var3++) {
            if (class9.field286[var3] == arg1) {
                class89.field1603--;
                for (int var4 = var3; var4 < class89.field1603; var4++) {
                    class198.field3530[var4] = class198.field3530[var4 + 1];
                    class196.field3508[var4] = class196.field3508[var4 + 1];
                    class58.field1183[var4] = class58.field1183[var4 + 1];
                    class9.field286[var4] = class9.field286[var4 + 1];
                    class58.field1182[var4] = class58.field1182[var4 + 1];
                    class73.field1392[var4] = class73.field1392[var4 + 1];
                }
                class242.field4231 = class135.field2455;
                class55.field1133.method1863(true, 173);
                class55.field1133.method911(0, arg1);
                class182.field3236++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 >= -57) {
            return;
        }
        class244[] var7 = class30.field771;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class244 var9 = var7[var8];
            if (var9 != null && var9.field4253 == 2) {
                class260.method1731(arg5 >> 1, var9.field4266 * 2, arg0, arg2, arg4 >> 1, (byte) 122, (var9.field4265 - class64.field1248 << 7) + var9.field4261, (var9.field4267 - class231.field4073 << 7) + var9.field4264);
                if (class113.field1994 > -1 && (class93.field1655 % 20) < 10) {
                    class162.field2945[var9.field4254].method585(class113.field1994 + arg3 - 12, class214.field3835 + -28 + arg1);
                }
            }
        }
        field12++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZIIII)V")
    public static final void method6(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class181.field3215 = arg5;
        class71.field1367 = arg1;
        class170.field3077 = arg6;
        class146.field2726 = arg0;
        field1++;
        class270.field4821 = arg4;
        if (arg3 != -2180) {
            method6(89, -27, false, -89, 74, 107, -5);
        }
        if (arg2 && class146.field2726 >= 100) {
            class69.field1309 = class181.field3215 * 128 + 64;
            class112.field1976 = class170.field3077 * 128 + 64;
            class17.field475 = class67.method483(class69.field1309, arg3 + 2064, class112.field1976, class216.field3902) - class71.field1367;
        }
        class254.field4361 = 2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method7(boolean arg0) {
        if (!arg0) {
            field18 = null;
        }
        field8 = null;
        field7 = null;
        field13 = null;
        field22 = null;
        field23 = null;
        field24 = null;
        field4 = null;
        field17 = null;
        field18 = null;
        field19 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3) {
        field16++;
        if (class43.field959 == arg2 || arg0 == 0 || class87.field1588 >= 50 || arg3 == -1) {
            return;
        }
        class249.field4316[class87.field1588] = arg3;
        class193.field3473[class87.field1588] = arg0;
        class4.field65[class87.field1588] = arg1;
        class262.field4580[class87.field1588] = null;
        class210.field3775[class87.field1588] = 0;
        class87.field1588++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static final void method9(int arg0) {
        field15++;
        class272.method1864();
        if (arg0 < 103) {
            method10(85, 104, 62, 62, 3, -78, -72);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class130.field2279[var1].method1691((byte) -125);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 + arg1;
        if (arg5 != 1000) {
            field18 = null;
        }
        int var8 = arg1 + arg2;
        field9++;
        int var9 = arg0 - arg1;
        int var10 = arg3 - arg1;
        for (int var11 = arg6; var11 < var7; var11++) {
            class203.method1394(class44.field973[var11], arg2, arg3, -7249, arg4);
        }
        for (int var12 = arg0; var12 > var9; var12--) {
            class203.method1394(class44.field973[var12], arg2, arg3, -7249, arg4);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class44.field973[var13];
            class203.method1394(var14, arg2, var8, -7249, arg4);
            class203.method1394(var14, var10, arg3, -7249, arg4);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BII)V")
    public static final void method11(byte arg0, int arg1, int arg2) {
        class182.field3228[arg1] = arg2;
        field14++;
        int var3 = 26 / ((-arg0 - 42) / 38);
        class170 var4 = (class170) class150.field2779.method1842(-1, (long) arg1);
        if (var4 == null) {
            class170 var5 = new class170(4611686018427387905L);
            class150.field2779.method1838((long) arg1, var5, (byte) 8);
        } else if (var4.field3069 != 4611686018427387905L) {
            var4.field3069 = class136.method950(8954) + 500L | 0x4000000000000000L;
        }
    }
}
