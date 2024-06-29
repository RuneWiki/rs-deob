import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class228 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lro;")
    public static class1 field3110 = new class1();

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field3117 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[Lse;")
    public static class139[] field3118;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[[[B")
    public static byte[][][] field3115;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static void method1464(boolean arg0) {
        if (!arg0) {
            method1467((String) null, 15);
        }
        field3115 = null;
        field3110 = null;
        field3118 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V")
    public static final void method1465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 12685) {
            return;
        }
        field3113++;
        if (arg1 >= class143.field2029 && arg1 <= class128.field1785) {
            int var5 = class115.method640((byte) -69, class407.field5914, arg0, class20.field209);
            int var6 = class115.method640((byte) -100, class407.field5914, arg2, class20.field209);
            class351.method2240(arg3, arg4 ^ 0xFFFFCE0C, var6, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V")
    public static final void method1466(long arg0, int arg1) {
        field3109++;
        try {
            Thread.sleep(arg0);
            if (arg1 <= 23) {
                method1466(109L, -26);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1467(String arg0, int arg1) {
        field3111++;
        return arg1 == -6 ? class256.method1597(arg0, true, 0, 10) : true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILen;III)V")
    public static final void method1468(int arg0, int arg1, class174 arg2, int arg3, int arg4, int arg5) {
        field3116++;
        arg2.method968(arg5, arg1, arg5 + arg3, arg0 + arg1);
        arg2.method1150((byte) 123, arg1, arg5, arg0, arg3, -16777216);
        if (class173.field2404 < 100) {
            return;
        }
        float var6 = (float) class106.field1227 / (float) class106.field1223;
        int var7 = arg3;
        int var8 = arg0;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg3 - var7) / 2 + arg5;
        if (arg4 != -32073) {
            field3118 = null;
        }
        int var10 = (arg0 - var8) / 2 + arg1;
        if (class382.field5613 == null || arg3 != class382.field5613.method51() || arg0 != class382.field5613.method49()) {
            class106.method574(class106.field1222, class106.field1228 + class106.field1227, class106.field1223 + class106.field1222, class106.field1228, var9, var10, var9 + var7, var8 + var10);
            class106.method588(arg2);
            class382.field5613 = arg2.method983(var9, var10, var7, var8, false);
        }
        class382.field5613.method90(var9, var10);
        int var11 = class225.field3077 * var7 / class106.field1223;
        int var12 = class189.field2561 * var8 / class106.field1227;
        int var13 = class225.field3073 * var7 / class106.field1223 + var9;
        int var14 = var10 - (class438.field6423 * var8 / class106.field1227 - var8) - var12;
        int var15 = -1996554240;
        if (class136.field1912 == 1) {
            var15 = -1996488705;
        }
        arg2.method995(var13, var14, var11, var12, var15, 1);
        arg2.method958(var13, var14, var11, var12, var15, 0);
        if (class239.field3249 <= 0) {
            return;
        }
        int var16;
        if (class100.field1118 <= 50) {
            var16 = class100.field1118 * 5;
        } else {
            var16 = 500 - (class100.field1118 * 5);
        }
        for (class278 var17 = (class278) class106.field1208.method1124(arg4 ^ 0x7D48); var17 != null; var17 = (class278) class106.field1208.method1119(false)) {
            class290 var18 = class117.method661((byte) 101, var17.field3920);
            if (class207.method1311((byte) 117, var18)) {
                if (class48.field561 == var17.field3920) {
                    int var19 = var9 + (var17.field3916 * var7 / class106.field1223);
                    int var20 = (class106.field1227 - var17.field3921) * var8 / class106.field1227 + var10;
                    arg2.method1150((byte) 125, var20 - 2, var19 + -2, 4, 4, var16 << 24 | 0xFFFF00);
                } else if (class162.field2284 != -1 && class162.field2284 == var18.field4144) {
                    int var21 = var17.field3916 * var7 / class106.field1223 + var9;
                    int var22 = var10 + ((class106.field1227 - var17.field3921) * var8 / class106.field1227);
                    arg2.method1150((byte) 120, var22 - 2, var21 + -2, 4, 4, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILen;BILjf;)V")
    public static final void method1469(int arg0, class174 arg1, byte arg2, int arg3, class119 arg4) {
        if (arg2 > -120) {
            field3114 = 59;
        }
        if (arg4.field1535 == 2) {
            for (int var6 = arg0; var6 <= arg3; var6++) {
                int var7 = arg4.field1580[var6] - 1;
                if (var7 != -1) {
                    if (class423.field6070 == 1 && class373.field5443 == var6 && class3.field49 == arg4.field1424) {
                        boolean var8 = class219.method1435(2, 0, arg1, (byte) -78, arg4.field1452, var7, (class116) null, arg4.field1592[var6]) == null;
                        if (var8) {
                            class32.field298.method1125(-1, new class268(var7, arg4.field1592[var6], 2, 0, arg4.field1452, false));
                        }
                    } else {
                        boolean var9 = class219.method1435(1, -13623264, arg1, (byte) 87, arg4.field1452, var7, (class116) null, arg4.field1592[var6]) == null;
                        if (var9) {
                            class32.field298.method1125(-1, new class268(var7, arg4.field1592[var6], 1, -13623264, arg4.field1452, false));
                        }
                    }
                }
            }
        } else if (arg4.field1535 == 5) {
            boolean var5 = class219.method1435(arg4.field1542, arg4.field1557 | 0xFF000000, arg1, (byte) 74, arg4.field1452, arg4.field1597, arg4.field1581 ? class390.field5715.field1843 : null, arg4.field1429) == null;
            if (var5) {
                class32.field298.method1125(-1, new class268(arg4.field1597, arg4.field1429, arg4.field1542, -16777216 | arg4.field1557, arg4.field1452, arg4.field1581));
            }
        }
        field3112++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)I")
    public static final int method1470(int arg0, boolean arg1) {
        field3119++;
        return arg1 ? -63 : arg0 & 0xFF;
    }
}
