import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class199 {

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Lw;")
    private class235 field2849 = new class235();

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "F")
    public static float field2838;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "Lw;")
    private class235 field2852;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2846;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I")
    public final int method1242(int arg0) {
        field2845++;
        int var2 = arg0;
        for (class235 var3 = this.field2849.field3302; var3 != this.field2849; var3 = var3.field3302) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lw;")
    public final class235 method1243(byte arg0) {
        if (arg0 != 67) {
            field2846 = null;
        }
        field2848++;
        class235 var2 = this.field2849.field3302;
        if (this.field2849 == var2) {
            return null;
        } else {
            var2.method1439(arg0 - 29250);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lw;I)V")
    public final void method1244(class235 arg0, int arg1) {
        field2842++;
        if (arg0.field3311 != null) {
            arg0.method1439(-29183);
        }
        arg0.field3302 = this.field2849;
        arg0.field3311 = this.field2849.field3311;
        arg0.field3311.field3302 = arg0;
        if (arg1 != -26) {
            method1245((byte) 1);
        }
        arg0.field3302.field3311 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
    public static final void method1245(byte arg0) {
        field2847++;
        class276.method1759(false);
        class372.method2453(58);
        class185.method1150(95);
        class363.method2380((byte) 117);
        class363.method2382((byte) 124);
        class171.method1057(3);
        class82.method521(2);
        class132.method892(-3403);
        class222.method1380((byte) 95);
        class26.method234(4900);
        class193.method1212((byte) -105);
        class203.method1284(21712);
        class322.method1995(-27129);
        class319.method1980(-15845);
        class205.method1301((byte) 2);
        class284.method1806(false);
        class449.method2817(25422);
        class198.method1237(0);
        int var1 = 51 / ((arg0 - 19) / 33);
        class103.method693(false);
        class417.method2691(-60);
        class16.method111(120);
        class337.method2234((byte) 118);
        class59.method396(5);
        class169.field2232.method204((byte) 56);
        class26.field475.method204((byte) 56);
        class142.field1869.method204((byte) 56);
        class93.field1274.method204((byte) 56);
        class365.field5353.method204((byte) 56);
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
    public final void method1246(byte arg0) {
        int var2 = -108 % ((arg0 + 18) / 60);
        field2841++;
        while (true) {
            class235 var3 = this.field2849.field3302;
            if (this.field2849 == var3) {
                this.field2852 = null;
                return;
            }
            var3.method1439(-29183);
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
    public static void method1247(byte arg0) {
        if (arg0 != -32) {
            method1251(118, (byte) 117);
        }
        field2846 = null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIZ)I")
    public static final int method1248(int arg0, int arg1, int arg2, boolean arg3) {
        field2844++;
        class363 var4 = (class363) class157.field2069.method954(-76, (long) arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg2; var6 < var4.field5302.length; var6++) {
            if (var4.field5302[var6] >= 0 && class228.field3223 > var4.field5302[var6]) {
                class193 var7 = class166.method1031(var4.field5302[var6], false);
                int var8 = var7.method1208(arg2 - 63, class391.method2555(arg0, true).field1181, arg0);
                if (arg3) {
                    var5 += var4.field5312[var6] * var8;
                } else {
                    var5 += var8;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Lw;")
    public final class235 method1249(int arg0) {
        field2851++;
        class235 var2 = this.field2852;
        if (this.field2849 == var2) {
            this.field2852 = null;
            return null;
        }
        this.field2852 = var2.field3302;
        if (arg0 >= -59) {
            this.field2849 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
    public static final void method1250(int arg0) {
        class75.field1009.method2654(arg0 - 2);
        field2840++;
        for (class259 var1 = (class259) class373.field5574.method2649(arg0 ^ arg0); var1 != null; var1 = (class259) class373.field5574.method2656(arg0 - 2)) {
            if (var1.field3777 < 1000) {
                var1.method2574((byte) 118);
                class75.field1009.method2660((byte) -123, var1);
            }
        }
        class75.field1009.method2651(arg0 - 107, class373.field5574);
        if (class229.field3246 != null || class372.field5533 != null || class19.field329 > 0) {
            return;
        }
        int var2 = class84.field1173;
        if (!class229.field3230) {
            if (var2 == 1 && class10.field97 > 0) {
                int var17 = ((class259) class373.field5574.field6108.field5898).field3777;
                if (var17 == 6 || var17 == 3 || var17 == 48 || var17 == 15 || var17 == 19 || var17 == 30 || var17 == 26 || var17 == 42 || var17 == 31 || var17 == 2 || var17 == 11 || var17 == 1012) {
                    class259 var18 = (class259) class373.field5574.field6108.field5898;
                    class249 var19 = class107.method746(var18.field3776, -41);
                    class185 var20 = client.method1572(var19);
                    if (var20.method1143(-103)) {
                        class280.field4120 = false;
                        class156.field2048 = 0;
                        if (class229.field3246 != null) {
                            class392.method2564(-75, class229.field3246);
                        }
                        class229.field3246 = class107.method746(var18.field3776, -73);
                        class272.field3975 = class420.field6256;
                        class205.field2966 = class242.field3390;
                        class396.field5948 = var18.field3779;
                        class392.method2564(arg0 ^ 0xFFFFFFB5, class229.field3246);
                        return;
                    }
                }
            }
            if (var2 <= 0 && class282.field4140 > 0) {
                var2 = class282.field4140;
            }
            class282.field4140 = 0;
            if (var2 == 1 && (class288.field4183 == 1 && class10.field97 > 2 || class246.method1512(127))) {
                var2 = 2;
            }
            if (var2 == 2 && class10.field97 > 0) {
                class103.method703(class242.field3390, class420.field6256, (byte) -121);
            }
            if (var2 != 1 || class10.field97 <= 0) {
                return;
            }
            class255.method1600((byte) 63);
            return;
        }
        if (var2 != 1) {
            int var3 = class34.field555;
            int var4 = class316.field4522;
            if ((class394.field5912 - 10) > var3 || var3 > class394.field5912 + class272.field3995 + 10 || class200.field2861 - 10 > var4 || (class200.field2861 - (-class263.field3828 - 10)) < var4) {
                class229.field3230 = false;
                class271.method1739(class394.field5912, class263.field3828, class200.field2861, class272.field3995, -108);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var5 = class394.field5912;
        int var6 = class200.field2861;
        int var7 = class272.field3995;
        int var8 = class242.field3390;
        int var9 = class420.field6256;
        int var10 = -1;
        for (int var11 = 0; var11 < class10.field97; var11++) {
            if (class446.field6493) {
                int var15 = (class10.field97 - var11 - 1) * 16 + var6 + 33;
                if (var8 > var5 && (var5 + var7) > var8 && var9 > var15 - 13 && var9 < var15 + 3) {
                    var10 = var11;
                }
            } else {
                int var16 = (class10.field97 - var11 - 1) * 16 + var6 + 31;
                if (var8 > var5 && var5 + var7 > var8 && var9 > var16 - 13 && var9 < (var16 + 3)) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class168 var13 = new class168(class373.field5574);
            for (class259 var14 = (class259) var13.method1043((byte) -111); var14 != null; var14 = (class259) var13.method1044(-25293)) {
                if (var10 == var12) {
                    class237.method1449(var14, 126);
                }
                var12++;
            }
        }
        class229.field3230 = false;
        class271.method1739(class394.field5912, class263.field3828, class200.field2861, class272.field3995, -73);
        return;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)V")
    public static final void method1251(int arg0, byte arg1) {
        field2839++;
        if (class137.field1815 == arg0) {
            return;
        }
        if (class137.field1815 == 0) {
            class66.method431(-172);
        }
        if (arg0 == 40) {
            class86.method536((byte) -90);
        }
        if (arg0 != 40 && class449.field6565 != null) {
            class449.field6565.method243(-1);
            class449.field6565 = null;
        }
        if (class137.field1815 == 25 || class137.field1815 == 28) {
            class180.field2387.field3348 = 2;
            class207.field2986.field3348 = 2;
            class78.field1075.field3348 = 2;
            class235.field3300.field3348 = 2;
            class215.field3080.field3348 = 2;
            class340.field5003.field3348 = 2;
            class324.field4655.field3348 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class130.field1749 = 0;
            class72.field987 = 0;
            class413.field6174 = 0;
            class236.field3319 = 1;
            class417.field6214 = 1;
            class282.method1801(0, true);
            class180.field2387.field3348 = 1;
            class207.field2986.field3348 = 1;
            class78.field1075.field3348 = 1;
            class235.field3300.field3348 = 1;
            class215.field3080.field3348 = 1;
            class340.field5003.field3348 = 1;
            class324.field4655.field3348 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class353.method2326(-116);
        }
        if (arg0 == 5) {
            class236.method1441(-126, class35.field574, class247.field3446);
        } else {
            class444.method2796(16777216);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class137.field1815 == 5 || class137.field1815 == 10 || class137.field1815 == 28;
        if (var2 != var3) {
            if (var2) {
                class280.field4128 = class445.field6485;
                if (class407.field6101 == 0) {
                    class164.method1016((byte) 34, 2);
                } else {
                    class419.method2696(255, class328.field4711, (byte) 86, 0, false, 2, class445.field6485);
                }
                class97.field1331.method2193(false, -119);
            } else {
                class164.method1016((byte) 34, 2);
                class97.field1331.method2193(true, -26);
                if (class344.field5041 != null) {
                    class344.field5041.method683(-11400);
                    class344.field5041 = null;
                }
            }
        }
        int var4 = -71 / ((arg1 + 57) / 62);
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class35.field574.method2170();
        }
        class137.field1815 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)Lw;")
    public final class235 method1252(int arg0) {
        field2843++;
        class235 var2 = this.field2849.field3302;
        if (this.field2849 == var2) {
            this.field2852 = null;
            return null;
        }
        if (arg0 > -14) {
            this.field2852 = null;
        }
        this.field2852 = var2.field3302;
        return var2;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
    public class199() {
        this.field2849.field3311 = this.field2849;
        this.field2849.field3302 = this.field2849;
    }
}
