import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class237 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Ljava/lang/String;")
    private String field3116 = "null";

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field3128 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "C")
    public char field3113;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "C")
    public char field3119;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    private int field3112;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lefa;")
    private class322 field3121;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lefa;")
    public class322 field3124;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Z")
    public final boolean method1456(byte arg0, int arg1) {
        field3126++;
        if (this.field3124 == null) {
            return false;
        }
        if (this.field3121 == null) {
            this.method1457(117);
        }
        class258 var3 = (class258) this.field3121.method2002((byte) -121, (long) arg1);
        int var4 = 12 / ((arg0 - 2) / 36);
        return var3 != null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    private final void method1457(int arg0) {
        field3120++;
        if (arg0 <= 49) {
            this.field3116 = null;
        }
        this.field3121 = new class322(this.field3124.method1998(-30138));
        for (class258 var2 = (class258) this.field3124.method1993(-80); var2 != null; var2 = (class258) this.field3124.method1997(9831)) {
            class258 var3 = new class258((int) var2.field5740);
            this.field3121.method2001(-99, var3, (long) var2.field3352);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lgk;I)V")
    public final void method1458(class540 arg0, int arg1) {
        field3118++;
        if (arg1 != 14804) {
            field3128 = null;
        }
        while (true) {
            int var3 = arg0.method3115(29871);
            if (var3 == 0) {
                return;
            }
            this.method1463(arg0, 13672, var3);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZIII[[[Lms;I)Z")
    public static final boolean method1459(boolean arg0, int arg1, int arg2, int arg3, class44[][][] arg4, int arg5) {
        field3117++;
        byte var6 = arg0 ? 1 : (byte) (class229.field3041 & 0xFF);
        if (class603.field8703[class49.field779][arg3][arg2] == var6) {
            return false;
        } else if ((class317.field4622[class49.field779][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class25.field452[var7] = arg3;
            int var8 = 0;
            int var35 = var7 + 1;
            class206.field2806[var7] = arg2;
            class603.field8703[class49.field779][arg3][arg2] = var6;
            while (var35 != var8) {
                int var9 = class25.field452[var8] & 0xFFFF;
                int var10 = (class25.field452[var8] & 0xFF06B9) >> 16;
                int var11 = class25.field452[var8] >> 24 & 0xFF;
                int var12 = class206.field2806[var8] & 0xFFFF;
                int var13 = class206.field2806[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class317.field4622[class49.field779][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class49.field779 + 1; var16 <= 3; var16++) {
                    if ((class317.field4622[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field668 != null) {
                                int var20 = class488.method2788(var10, 0);
                                if (arg4[var16][var9][var12].field668.field4824 == var20 || arg4[var16][var9][var12].field670 != null && arg4[var16][var9][var12].field670.field4824 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class488.method2788(var11, arg5 - 4095);
                                    if (arg4[var16][var9][var12].field668.field4824 == var21 || arg4[var16][var9][var12].field670 != null && arg4[var16][var9][var12].field670.field4824 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class488.method2788(var13, arg5 ^ 0xFFF);
                                    if (arg4[var16][var9][var12].field668.field4824 == var22 || arg4[var16][var9][var12].field670 != null && arg4[var16][var9][var12].field670.field4824 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class44 var23 = arg4[var16][var9][var12];
                            if (var23.field667 != null) {
                                for (class361 var24 = var23.field667; var24 != null; var24 = var24.field5299) {
                                    class293 var25 = var24.field5301;
                                    if (var25 instanceof class83) {
                                        class83 var26 = (class83) var25;
                                        int var27 = var26.method264(-5273);
                                        int var28 = var26.method263((byte) 30);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class44 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field667 != null) {
                            for (class361 var31 = var30.field667; var31 != null; var31 = var31.field5299) {
                                class293 var32 = var31.field5301;
                                if (var32.field4299 != var32.field4294 || var32.field4305 != var32.field4300) {
                                    for (int var33 = var32.field4299; var33 <= var32.field4294; var33++) {
                                        for (int var34 = var32.field4300; var34 <= var32.field4305; var34++) {
                                            class603.field8703[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class603.field8703[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class178.field2480[class49.field779 + 1].method3822(var12, var9, 0);
                    if (class426.field6229[arg1] < var17) {
                        class426.field6229[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    int var19 = var12 << 9;
                    if (var18 < class444.field6452[arg1]) {
                        class444.field6452[arg1] = var18;
                    } else if (var18 > class232.field3068[arg1]) {
                        class232.field3068[arg1] = var18;
                    }
                    if (var19 < class433.field6282[arg1]) {
                        class433.field6282[arg1] = var19;
                    } else if (class657.field9381[arg1] < var19) {
                        class657.field9381[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class603.field8703[class49.field779][var9 - 1][var12] != var6) {
                        class25.field452[var35] = class151.method1076(class151.method1076(1179648, var9 - 1), -754974720);
                        class206.field2806[var35] = class151.method1076(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class603.field8703[class49.field779][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class668.field9444 > var12) {
                        if ((var9 - 1) >= 0 && class603.field8703[class49.field779][var9 - 1][var12] != var6 && (class317.field4622[class49.field779][var9][var12] & 0x4) == 0 && (class317.field4622[class49.field779][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class25.field452[var35] = class151.method1076(class151.method1076(1179648, var9 - 1), 1375731712);
                            class206.field2806[var35] = class151.method1076(var12, 1245184);
                            class603.field8703[class49.field779][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class603.field8703[class49.field779][var9][var12] != var6) {
                            class25.field452[var35] = class151.method1076(318767104, class151.method1076(var9, 5373952));
                            class206.field2806[var35] = class151.method1076(5439488, var12);
                            class603.field8703[class49.field779][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class72.field1144 && class603.field8703[class49.field779][var9 + 1][var12] != var6 && (class317.field4622[class49.field779][var9][var12] & 0x4) == 0 && (class317.field4622[class49.field779][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class25.field452[var35] = class151.method1076(-1845493760, class151.method1076(var9 + 1, 5373952));
                            class206.field2806[var35] = class151.method1076(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class603.field8703[class49.field779][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class72.field1144 > var9 + 1 && class603.field8703[class49.field779][var9 + 1][var12] != var6) {
                        class25.field452[var35] = class151.method1076(1392508928, class151.method1076(9568256, var9 + 1));
                        class206.field2806[var35] = class151.method1076(9633792, var12);
                        class603.field8703[class49.field779][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class603.field8703[class49.field779][var9 - 1][var12] != var6 && (class317.field4622[class49.field779][var9][var12] & 0x4) == 0 && (class317.field4622[class49.field779][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class25.field452[var35] = class151.method1076(301989888, class151.method1076(var9 - 1, 13762560));
                            class206.field2806[var35] = class151.method1076(13828096, var12);
                            class603.field8703[class49.field779][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class603.field8703[class49.field779][var9][var12] != var6) {
                            class25.field452[var35] = class151.method1076(class151.method1076(var9, 13762560), -1828716544);
                            class206.field2806[var35] = class151.method1076(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class603.field8703[class49.field779][var9][var12] = var6;
                        }
                        if (var9 + 1 < class72.field1144 && class603.field8703[class49.field779][var9 + 1][var12] != var6 && (class317.field4622[class49.field779][var9][var12] & 0x4) == 0 && (class317.field4622[class49.field779][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class25.field452[var35] = class151.method1076(-771751936, class151.method1076(var9 + 1, 9568256));
                            class206.field2806[var35] = class151.method1076(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class603.field8703[class49.field779][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (arg5 != 4095) {
                field3128 = null;
            }
            if (class426.field6229[arg1] != -1000000) {
                class426.field6229[arg1] += 40;
                class444.field6452[arg1] -= 512;
                class232.field3068[arg1] += 512;
                class657.field9381[arg1] += 512;
                class433.field6282[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1460(int arg0, String arg1) {
        field3122++;
        if (this.field3124 == null) {
            return false;
        }
        if (this.field3121 == null) {
            this.method1467(512);
        }
        if (arg0 != -1577601832) {
            method1459(true, -25, -10, -123, null, -64);
        }
        for (class95 var3 = (class95) this.field3121.method2002((byte) -115, class341.method2116(arg1, arg0 + 1577601832)); var3 != null; var3 = (class95) this.field3121.method1999(arg0 ^ 0x5E084B7C)) {
            if (var3.field1459.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1461(int arg0, int arg1) {
        field3115++;
        if (this.field3124 == null) {
            return this.field3116;
        } else {
            class180 var3 = (class180) this.field3124.method2002((byte) -113, (long) arg1);
            int var4 = -26 % ((-arg0 - 63) / 53);
            return var3 == null ? this.field3116 : var3.field2490;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static void method1462(int arg0) {
        if (arg0 != 3277) {
            field3128 = null;
        }
        field3128 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lgk;II)V")
    private final void method1463(class540 arg0, int arg1, int arg2) {
        if (arg1 != 13672) {
            return;
        }
        if (arg2 == 1) {
            this.field3113 = class36.method214(arg0.method3128(arg1 + 19095), -129);
        } else if (arg2 == 2) {
            this.field3119 = class36.method214(arg0.method3128(32767), -129);
        } else if (arg2 == 3) {
            this.field3116 = arg0.method3145((byte) -121);
        } else if (arg2 == 4) {
            this.field3112 = arg0.method3160(false);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method3169(26488);
            this.field3124 = new class322(class240.method1478(-28325, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method3160(false);
                class381 var7;
                if (arg2 == 5) {
                    var7 = new class180(arg0.method3145((byte) -121));
                } else {
                    var7 = new class258(arg0.method3160(false));
                }
                this.field3124.method2001(-126, var7, (long) var6);
            }
        }
        field3127++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
    public static final void method1464() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class466.field6718.length; var1++) {
                if (class466.field6718[var1].method3948()) {
                    class102.field1529[var1] = class466.field6718[var1].method3952();
                } else {
                    synchronized (class466.field6718[var1]) {
                        class466.field6718[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class466.field6718[class466.field6718.length - 1].method3951();
                class139.method981(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class466.field6718.length - 1; var4++) {
                        if (!class466.field6718[var4].method3948()) {
                            synchronized (class466.field6718[var4]) {
                                class466.field6718[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class466.field6718.length - 2; var6++) {
                            class466.field6718[var6].method3951();
                        }
                        class139.method981(2);
                        while (!class466.field6718[0].method3948()) {
                            synchronized (class466.field6718[0]) {
                                class466.field6718[0].notify();
                            }
                            try {
                                class687.method3846(1L, -43);
                            } catch (Exception var9) {
                            }
                        }
                        class466.field6718[0].method3951();
                        return;
                    }
                    try {
                        class687.method3846(1L, -114);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class687.method3846(1L, -38);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lgk;I)Lqj;")
    public static final class509 method1465(class540 arg0, int arg1) {
        int var2 = -67 / ((arg1 - 25) / 39);
        field3123++;
        return new class509(arg0.method3129(73), arg0.method3129(68), arg0.method3129(94), arg0.method3129(105), arg0.method3154((byte) -26), arg0.method3154((byte) -11), arg0.method3115(29871));
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
    public final int method1466(int arg0, int arg1) {
        if (arg0 != -29714) {
            this.field3116 = null;
        }
        field3125++;
        if (this.field3124 == null) {
            return this.field3112;
        } else {
            class258 var3 = (class258) this.field3124.method2002((byte) -123, (long) arg1);
            return var3 == null ? this.field3112 : var3.field3352;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    private final void method1467(int arg0) {
        if (arg0 != 512) {
            this.method1461(-62, -58);
        }
        this.field3121 = new class322(this.field3124.method1998(-30138));
        field3114++;
        for (class180 var2 = (class180) this.field3124.method1993(-97); var2 != null; var2 = (class180) this.field3124.method1997(9831)) {
            class95 var3 = new class95(var2.field2490, (int) var2.field5740);
            this.field3121.method2001(26, var3, class341.method2116(var2.field2490, 0));
        }
    }
}
