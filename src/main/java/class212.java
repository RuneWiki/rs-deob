import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class212 {

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3186 = "green:";

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Z")
    public static boolean field3187 = true;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field3193 = -1;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[I")
    public static int[] field3184;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILql;)Lo;")
    public static final class254 method1381(int arg0, int arg1, class224 arg2) {
        if (arg1 != 20788) {
            method1387(80, -46, false, true, 5, (class144) null, -69, true, 48);
        }
        field3192++;
        class254 var3 = new class254(arg0, arg2.method1455(arg1 - 20913), arg2.method1455(121), arg2.method1483((byte) 46), arg2.method1483((byte) 46), arg2.method1453((byte) -128) == 1, arg2.method1453((byte) -128));
        int var4 = arg2.method1453((byte) -128);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field3891.method988(new class83(arg2.method1453((byte) -128), arg2.method1453((byte) -128), arg2.method1445(false), arg2.method1445(false), arg2.method1445(false), arg2.method1445(false), arg2.method1445(false), arg2.method1445(false), arg2.method1445(false), arg2.method1445(false)), (byte) -77);
        }
        var3.method1700((byte) -118);
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lql;I)Lka;")
    public static final class264 method1382(class224 arg0, int arg1) {
        if (arg1 != -1) {
            field3193 = -110;
        }
        field3188++;
        class264 var2 = new class264();
        var2.field3965 = arg0.method1445(false);
        var2.field3971 = class79.method508((byte) 75, var2.field3965);
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    public static void method1383(boolean arg0) {
        field3186 = null;
        if (arg0) {
            field3187 = false;
        }
        field3184 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lhc;B)Z")
    public static final boolean method1384(class235 arg0, byte arg1) {
        field3199++;
        if (arg0.method1570((byte) -39, class163.field2271)) {
            return true;
        } else {
            if (arg1 != -12) {
                method1385(true, -98, 20, (class235) null, -22, 101, 46);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZIILhc;III)V")
    public static final void method1385(boolean arg0, int arg1, int arg2, class235 arg3, int arg4, int arg5, int arg6) {
        if (arg1 > -20) {
            field3187 = false;
        }
        field3198++;
        class247.field3782 = arg6;
        client.field2186 = arg3;
        class131.field1849 = arg5;
        class82.field1117 = arg0;
        class122.field1705 = arg4;
        class202.field2806 = 1;
        class76.field1068 = arg2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lbg;")
    public static final class241 method1386(int arg0, int arg1) {
        field3185++;
        class241 var2 = (class241) class101.field1406.method540((byte) -116, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class129.field1823.method1576(-87, 3, arg0);
        class241 var4 = new class241();
        if (var3 != null) {
            var4.method1621(-74, new class224(var3));
        }
        class101.field1406.method543(var4, (long) arg0, 858993459);
        if (arg1 != 0) {
            field3186 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZZILnj;IZI)Lke;")
    public static final class110 method1387(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, class144 arg5, int arg6, boolean arg7, int arg8) {
        class32 var9 = class73.method463(arg6, arg1 ^ 0xFFFFAFB8);
        if (arg8 > 1 && var9.field463 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg8 >= var9.field455[var11] && var9.field455[var11] != 0) {
                    var10 = var9.field463[var11];
                }
            }
            if (var10 != -1) {
                var9 = class73.method463(var10, -31104);
            }
        }
        field3194++;
        class18 var12 = var9.method206((byte) -112, arg5);
        if (var12 == null) {
            return null;
        }
        class128 var13 = null;
        if (var9.field494 != -1) {
            var13 = (class128) method1387(1, 10552, true, true, 0, arg5, var9.field424, false, 10);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field430 != -1) {
            var13 = (class128) method1387(arg0, arg1, true, false, arg4, arg5, var9.field456, false, arg8);
            if (var13 == null) {
                return null;
            }
        }
        if (arg1 != 10552) {
            return null;
        }
        int[] var14 = class64.field881;
        int var15 = class64.field879;
        int[] var16 = new int[4];
        int var17 = class64.field874;
        class64.method403(var16);
        class128 var18 = new class128(36, 32);
        class64.method407(var18.field1820, 36, 32);
        class90.method580();
        class90.method578(16, 16);
        int var19 = var9.field484;
        if (arg3) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class90.field1269 = false;
        int var20 = class90.field1259[var9.field477] * var19 >> 16;
        int var21 = class90.field1255[var9.field477] * var19 >> 16;
        var12.method122(0, var9.field443, var9.field497, var9.field477, var9.field476, var20 - (var12.method106() / 2 - var9.field432), var21 - -var9.field432, -1L);
        if (arg0 >= 1) {
            var18.method864(1);
            if (arg0 >= 2) {
                var18.method864(16777215);
            }
            class64.method407(var18.field1820, 36, 32);
        }
        if (arg4 != 0) {
            var18.method869(arg4);
        }
        if (var9.field494 != -1) {
            var13.method710(0, 0);
        } else if (var9.field430 != -1) {
            class64.method407(var13.field1820, 36, 32);
            var18.method710(0, 0);
            var18 = var13;
        }
        if (arg7 && (var9.field458 == 1 || arg8 != 1) && arg8 != -1) {
            class156.field2163.method842(class239.method1599(arg8, 4096), 0, 9, 16776960, 1);
        }
        class64.method407(var14, var15, var17);
        class64.method399(var16);
        class90.method580();
        class90.field1269 = true;
        return var18;
    }
}
