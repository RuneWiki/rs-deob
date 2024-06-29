import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class76 {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field1132 = 0;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
    public static int[] field1133 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Laq;")
    public static class234 field1136;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
    public static final int method651(int arg0) {
        field1129++;
        if (arg0 > -27) {
            field1133 = null;
        }
        if (class416.field5820 == null) {
            return class164.field2417 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILbi;IILpe;)V")
    public static final void method652(int arg0, class139 arg1, int arg2, int arg3, class391 arg4) {
        field1130++;
        class179 var5 = arg1.method1091((byte) 51, arg4);
        if (var5 == null || arg3 != -19687) {
            return;
        }
        arg4.method111(arg2, arg0, arg1.field2027 + arg2, arg0 - -arg1.field2011);
        if (class24.field433 == 2 || class24.field433 == 5 || class32.field526 == null) {
            arg4.method154(-16777216, var5, arg2, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class184.field2675 == 4) {
            var7 = class267.field3598;
            var9 = 4096;
            var6 = (int) (-class313.field4229) & 0x3FFF;
            var8 = class325.field4411;
        } else {
            var6 = (int) (-class313.field4229) + class161.field2395 & 0x3FFF;
            var7 = class95.field1379.field3176;
            var8 = class95.field1379.field3167;
            var9 = 4096 - (class398.field5576 * 16);
        }
        int var10 = var7 / 32 + 48 + 208 - (class116.field1621 * 2);
        int var11 = class385.field5425 * 4 + 48 - ((class385.field5425 - 104) * 2) - (var8 / 32);
        class32.field526.method725((float) arg1.field2027 / 2.0F + (float) arg2, (float) arg1.field2011 / 2.0F + (float) arg0, (float) var10, (float) var11, var9, var6 << 2, var5, arg2, arg0);
        for (class193 var12 = (class193) class392.field5496.method1240((byte) -125); var12 != null; var12 = (class193) class392.field5496.method1245(1)) {
            int var50 = var12.field2776;
            int var51 = (class264.field3549.field1121[var50] >> 14 & 0x3FFF) - class283.field3794;
            int var52 = (class264.field3549.field1121[var50] & 0x3FFF) - class296.field3988;
            int var53 = var51 * 4 + 2 - var7 / 32;
            int var54 = var52 * 4 + 2 - (var8 / 32);
            class283.method1786((byte) 95, arg0, var53, arg2, var5, class264.field3549.field1117[var50], arg1, arg4, var54);
        }
        for (int var13 = 0; var13 < class243.field3350; var13++) {
            int var47 = class323.field4387[var13] * 4 + 2 - var7 / 32;
            int var48 = class96.field1388[var13] * 4 + 2 - (var8 / 32);
            class372 var49 = class10.method53(class335.field4546[var13], true);
            if (var49.field5192 != null) {
                var49 = var49.method2323((byte) -107);
                if (var49 == null || var49.field5214 == -1) {
                    continue;
                }
            }
            class283.method1786((byte) 95, arg0, var47, arg2, var5, var49.field5214, arg1, arg4, var48);
        }
        for (class396 var14 = (class396) class451.field6514.method608(-126); var14 != null; var14 = (class396) class451.field6514.method606((byte) 117)) {
            int var44 = (int) (var14.field5349 >> 28 & 0x3L);
            if (class151.field2323 == var44) {
                int var45 = (int) (var14.field5349 & 0x3FFFL) * 4 + 2 - (var7 / 32);
                int var46 = (int) (var14.field5349 >> 14 & 0x3FFFL) * 4 - ((var8 / 32) - 2);
                class398.method2443(var46, var45, var5, arg2, arg0, 4217, arg1, class173.field2539[0]);
            }
        }
        for (int var15 = 0; var15 < class221.field3055; var15++) {
            class127 var40 = class298.field4012[class209.field2891[var15]];
            if (var40 != null && var40.method990(-124)) {
                class15 var41 = var40.field1784;
                if (var41 != null && var41.field177 != null) {
                    var41 = var41.method78(arg3 + 19687);
                }
                if (var41 != null && var41.field169 && var41.field151) {
                    int var42 = var40.field3176 / 32 - (var7 / 32);
                    int var43 = var40.field3167 / 32 - (var8 / 32);
                    if (var41.field154 == -1) {
                        class398.method2443(var43, var42, var5, arg2, arg0, 4217, arg1, class173.field2539[1]);
                    } else {
                        class283.method1786((byte) 95, arg0, var42, arg2, var5, var41.field154, arg1, arg4, var43);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class174.field2579; var16++) {
            class338 var32 = class220.field3044[class134.field1921[var16]];
            if (var32 != null && var32.method2145(48)) {
                int var33 = var32.field3176 / 32 - (var7 / 32);
                int var34 = var32.field3167 / 32 - var8 / 32;
                boolean var35 = false;
                for (int var36 = 0; var36 < class123.field1724; var36++) {
                    if (var32.field4577.equals(class87.field1294[var36]) && class127.field1795[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class229.field3190; var38++) {
                    if (var32.field4577.equals(class264.field3555[var38].field3037)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class95.field1379.field4606 != 0 && var32.field4606 != 0 && class95.field1379.field4606 == var32.field4606) {
                    var39 = true;
                }
                if (var35) {
                    class398.method2443(var34, var33, var5, arg2, arg0, 4217, arg1, class173.field2539[3]);
                } else if (var37) {
                    class398.method2443(var34, var33, var5, arg2, arg0, 4217, arg1, class173.field2539[5]);
                } else if (var39) {
                    class398.method2443(var34, var33, var5, arg2, arg0, arg3 ^ 0xFFFFA360, arg1, class173.field2539[4]);
                } else {
                    class398.method2443(var34, var33, var5, arg2, arg0, 4217, arg1, class173.field2539[2]);
                }
            }
        }
        class192[] var17 = class16.field186;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class192 var21 = var17[var18];
            if (var21 != null && var21.field2763 != 0 && (class414.field5793 % 20) < 10) {
                if (var21.field2763 == 1 && var21.field2755 >= 0 && var21.field2755 < class298.field4012.length) {
                    class127 var22 = class298.field4012[var21.field2755];
                    if (var22 != null) {
                        int var23 = var22.field3176 / 32 - (var7 / 32);
                        int var24 = var22.field3167 / 32 - (var8 / 32);
                        class443.method2746(arg1, var23, 360000, arg0, arg2, var21.field2769, var5, var24, -27566);
                    }
                }
                if (var21.field2763 == 2) {
                    int var25 = (var21.field2765 - class283.field3794) * 4 + 2 - var7 / 32;
                    int var26 = (var21.field2758 - class296.field3988) * 4 + 2 - (var8 / 32);
                    int var27 = var21.field2768 * 4;
                    int var28 = var27 * var27;
                    class443.method2746(arg1, var25, var28, arg0, arg2, var21.field2769, var5, var26, -27566);
                }
                if (var21.field2763 == 10 && var21.field2755 >= 0 && class220.field3044.length > var21.field2755) {
                    class338 var29 = class220.field3044[var21.field2755];
                    if (var29 != null) {
                        int var30 = var29.field3176 / 32 - (var7 / 32);
                        int var31 = var29.field3167 / 32 - (var8 / 32);
                        class443.method2746(arg1, var30, 360000, arg0, arg2, var21.field2769, var5, var31, arg3 - 7879);
                    }
                }
            }
        }
        if (class184.field2675 == 4) {
            return;
        }
        if (class338.field4605 != 0) {
            int var19 = class338.field4605 * 4 + class95.field1379.method2146(-128) * 2 + 2 - (var7 / 32 - -2);
            int var20 = class335.field4543 * 4 + 2 - (var8 / 32 - (class95.field1379.method2146(-120) - 1) * 2);
            class398.method2443(var20, var19, var5, arg2, arg0, 4217, arg1, class283.field3796[class338.field4615 ? 1 : 0]);
        }
        arg4.method2414(arg1.field2011 / 2 + arg0 - 1, arg1.field2027 / 2 + arg2 + -1, 3, true, 3, -1);
        return;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static final void method653(byte arg0) {
        class415.field5808 = 0;
        if (arg0 != 2) {
            field1136 = null;
        }
        field1137++;
        class268.field3613.method1250(10346);
        class94.field1369 = false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(JB)V")
    public static final void method654(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 <= 28) {
            method653((byte) -32);
        }
        field1131++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Z")
    public static final boolean method655(int arg0, int arg1, int arg2) {
        field1139++;
        class372 var3 = class10.method53(arg1, true);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0 <= arg2 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method2315((byte) -123, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Lgl;")
    public static final class339 method656(int arg0, int arg1, int arg2) {
        class224 var3 = class118.field1653[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3125;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method657(byte arg0) {
        field1133 = null;
        field1136 = null;
        int var1 = -42 / ((arg0 - 37) / 46);
    }
}
