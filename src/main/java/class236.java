import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class236 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Z")
    public static boolean field3557 = false;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3564 = null;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lpf;")
    public static class294 field3559;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1494(int arg0, boolean arg1, String arg2) {
        field3551++;
        boolean var3 = arg1;
        String var4 = class239.method1514(-8970, class134.method822(arg2, (byte) -65));
        for (int var5 = 0; var5 < class141.field2069; var5++) {
            class107 var6 = class96.field1521[class58.field918[var5]];
            if (var6 != null && var6.field1663 != null && var6.field1663.equalsIgnoreCase(var4)) {
                if (arg0 == 1) {
                    class187.field2834++;
                    class196.field2979.method1106(85, arg1);
                    class196.field2979.method1586(0, (byte) -115);
                    class196.field2979.method1569(class58.field918[var5], -7355);
                } else if (arg0 == 4) {
                    class196.field2979.method1106(79, arg1);
                    class196.field2979.method1569(class58.field918[var5], -7355);
                    class7.field110++;
                    class196.field2979.method1612(0, 128);
                } else if (arg0 == 5) {
                    class196.field2979.method1106(103, arg1);
                    class218.field3274++;
                    class196.field2979.method1599(9611, class58.field918[var5]);
                    class196.field2979.method1586(0, (byte) -115);
                } else if (arg0 == 6) {
                    class196.field2979.method1106(172, arg1);
                    class196.field2979.method1569(class58.field918[var5], -7355);
                    class196.field2979.method1612(0, 128);
                    class137.field2017++;
                } else if (arg0 == 7) {
                    class81.field1301++;
                    class196.field2979.method1106(173, arg1);
                    class196.field2979.method1568(0, (byte) 49);
                    class196.field2979.method1569(class58.field918[var5], -7355);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class48.method321(0, "", class176.field2692 + var4, 100);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3555++;
        if (arg6 < 128 || arg2 < 128 || arg6 > 13056 || arg2 > 13056) {
            class3.field65 = -1;
            class262.field3971 = -1;
        } else if (arg5 == 2521) {
            int var8 = class183.method1139(class99.field1557, arg2, arg6, (byte) 117) - arg1;
            int var9 = class249.field3767[class259.field3949];
            int var10 = arg6 - class128.field1922;
            int var11 = arg2 - class47.field763;
            int var12 = class249.field3781[class259.field3949];
            int var13 = var8 - class213.field3184;
            int var14 = class249.field3767[class272.field4088];
            int var15 = class249.field3781[class272.field4088];
            int var16 = var11 * var14 + (var10 * var15) >> 16;
            int var17 = var11 * var15 - var10 * var14 >> 16;
            int var19 = var12 * var13 - (var9 * var17) >> 16;
            int var20 = var9 * var13 + (var12 * var17) >> 16;
            if (var20 >= 50) {
                class262.field3971 = (var19 << 9) / var20 + arg7;
                class3.field65 = (var16 << 9) / var20 + arg3;
            } else {
                class262.field3971 = -1;
                class3.field65 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method1496(int arg0, String arg1) {
        field3556++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        if (arg0 != -1553) {
            method1496(-63, (String) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method1497(int arg0) {
        field3553++;
        if (class188.field2871) {
            return;
        }
        if (arg0 != 17) {
            method1501(28, 34, -4);
        }
        if (class195.field2970) {
            class83.field1327 = (float) ((int) class83.field1327 - 17 & 0xFFFFFFF0);
        } else {
            class278.field4187 += (-12.0F - class278.field4187) / 2.0F;
        }
        class188.field2871 = true;
        class177.field2722 = true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Lbk;")
    public static final class21 method1498(byte arg0, int arg1) {
        field3561++;
        class21 var2 = (class21) class203.field3064.method1777((long) arg1, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2723.method1973(1, class250.method1644(arg1, (byte) -14), class59.method391(arg1, false));
        class21 var4 = new class21();
        var4.field253 = arg1;
        if (var3 != null) {
            var4.method138((byte) -65, new class248(var3));
        }
        class203.field3064.method1784((long) arg1, var4, 0);
        return arg0 > -102 ? null : var4;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static void method1499(int arg0) {
        field3564 = null;
        field3559 = null;
        if (arg0 <= 81) {
            field3559 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)V")
    public static final void method1500(boolean arg0, int arg1) {
        if (arg0) {
            if (class136.field1987 != -1) {
                class80.method529(-95, class136.field1987);
            }
            for (class199 var2 = (class199) class229.field3449.method1665(16); var2 != null; var2 = (class199) class229.field3449.method1659((byte) -118)) {
                class80.method528(var2, true, (byte) 66);
            }
            class136.field1987 = -1;
            class229.field3449 = new class253(8);
            class268.method1792(false);
            class136.field1987 = class27.field333;
            class282.method1859((byte) -91, false);
            class225.method1432((byte) -93);
            class160.method997(class136.field1987, 29283);
        }
        class225.field3379 = -1;
        field3563++;
        class206.method1302(class283.field4231, (byte) 8);
        class165.field2537 = new class107();
        class165.field2537.field2234 = 3000;
        class165.field2537.field2251 = 3000;
        if (class166.field2554 == 0) {
            class287.method1890(false, class295.field4675);
            class203.method1292(10, false);
        } else {
            if (class253.field3837 == 2) {
                class47.field763 = class40.field595 << 7;
                class128.field1922 = class187.field2836 << 7;
            } else {
                class85.method557((byte) 44);
            }
            class253.method1668(113);
            class203.method1292(28, false);
        }
        if (arg1 <= 6) {
            field3557 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
    public static final boolean method1501(int arg0, int arg1, int arg2) {
        int var3 = class143.field2097[arg0][arg1][arg2];
        if (-class166.field2548 == var3) {
            return false;
        } else if (class166.field2548 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class255.method1684(var4 + 1, class67.field1072[arg0][arg1][arg2], var5 + 1) && class255.method1684(var4 + 128 - 1, class67.field1072[arg0][arg1 + 1][arg2], var5 + 1) && class255.method1684(var4 + 128 - 1, class67.field1072[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class255.method1684(var4 + 1, class67.field1072[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class143.field2097[arg0][arg1][arg2] = class166.field2548;
                return true;
            } else {
                class143.field2097[arg0][arg1][arg2] = -class166.field2548;
                return false;
            }
        }
    }
}
