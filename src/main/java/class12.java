import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class12 extends class297 {

    @OriginalMember(owner = "client!em", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field270 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!em", name = "U", descriptor = "[I")
    public static int[] field275 = new int[1000];

    @OriginalMember(owner = "client!em", name = "X", descriptor = "Ljava/lang/String;")
    public static String field278 = "wave:";

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "Lpk;")
    public static class120 field265;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "[I")
    public static int[] field268;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "[Lab;")
    private class157[] field271;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "[[Ltd;")
    public static class256[][] field267;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILpk;Lpk;Lpk;Lpk;)V", line = 7)
    public static final void method166(int arg0, class120 arg1, class120 arg2, class120 arg3, class120 arg4) {
        class140.field2258 = arg2;
        class251.field3702 = arg3;
        if (arg0 >= -55) {
            return;
        }
        class126.field2024 = arg4;
        field269++;
        class142.field2295 = arg1;
        class110.field1789 = new class266[class251.field3702.method966((byte) 14)][];
        class135.field2158 = new boolean[class251.field3702.method966((byte) 14)];
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([[IZ)V", line = 24)
    private final void method167(int[][] arg0, boolean arg1) {
        int var3 = class31.field491;
        field277++;
        int var4 = class164.field2670;
        class62.method498(arg1, arg0);
        class253.method1754(-25667, 0, class175.field2801, 0, class257.field3813);
        if (this.field271 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field271.length; var5++) {
            class157 var6 = this.field271[var5];
            int var7 = var6.field2570;
            int var8 = var6.field2573;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method141(var3, 124, var4);
                }
            } else if (var8 < 0) {
                var6.method142(var4, -1, var3);
            } else {
                var6.method144(var3, 1, var4);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(B)V", line = 72)
    public static void method168(byte arg0) {
        field270 = null;
        field268 = null;
        field275 = null;
        field267 = (class256[][]) null;
        field278 = null;
        if (arg0 == -82) {
            field265 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILaj;)V", line = 90)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field266++;
        if (arg0 == 0) {
            this.field271 = new class157[arg2.method15((byte) 108)];
            for (int var4 = 0; var4 < this.field271.length; var4++) {
                int var5 = arg2.method15((byte) -108);
                if (var5 == 0) {
                    this.field271[var4] = class198.method1397(arg2, (byte) -91);
                } else if (var5 == 1) {
                    this.field271[var4] = class244.method1720(arg1 - 254, arg2);
                } else if (var5 == 2) {
                    this.field271[var4] = class34.method313((byte) -37, arg2);
                } else if (var5 == 3) {
                    this.field271[var4] = class118.method927(arg2, 3776);
                }
            }
        } else if (arg0 == 1) {
            this.field4762 = arg2.method15((byte) 112) == 1;
        }
        if (arg1 != 255) {
            field267 = (class256[][]) ((class256[][]) null);
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 163)
    public class12() {
        super(0, true);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)Z", line = 168)
    public static final boolean method170(byte arg0, int arg1) {
        if (arg0 != -35) {
            method170((byte) 14, -6);
        }
        field272++;
        return arg1 == 4 || arg1 == 8;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(III)I", line = 181)
    public static final int method171(int arg0, int arg1, int arg2) {
        field273++;
        int var3 = 0;
        if (arg0 != 12848) {
            return 49;
        }
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[[I", line = 209)
    public final int[][] method172(int arg0, byte arg1) {
        int[][] var3 = this.field4767.method1141(arg1 - 1740, arg0);
        if (arg1 != 63) {
            return (int[][]) ((int[][]) null);
        }
        field276++;
        if (this.field4767.field2480) {
            int var4 = class31.field491;
            int var5 = class164.field2670;
            int[][][] var6 = this.field4767.method1138(-20389);
            int[][] var7 = new int[var5][var4];
            this.method167(var7, false);
            for (int var8 = 0; var8 < class164.field2670; var8++) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[0];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class31.field491; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class164.method1234(4080, var15 << 4);
                    var11[var14] = class164.method1234(var15, 65280) >> 4;
                    var12[var14] = class164.method1234(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)[I", line = 274)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            return (int[]) null;
        }
        field264++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            this.method167(this.field4760.method212((byte) 90), !arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lmf;IIIIIB)V", line = 301)
    public static final void method174(class53 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != 90) {
            method168((byte) 69);
        }
        field274++;
        long var7 = 0L;
        if (arg1 == 0) {
            var7 = class55.method470(arg2, arg4, arg5);
        } else if (arg1 == 1) {
            var7 = class91.method721(arg2, arg4, arg5);
        } else if (arg1 == 2) {
            var7 = class122.method973(arg2, arg4, arg5);
        } else if (arg1 == 3) {
            var7 = class110.method865(arg2, arg4, arg5);
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        boolean var12 = false;
        int var13 = (int) var7 >> 14 & 0x1F;
        class101 var14 = class288.method2025(var10, -1);
        if (var14.method826(arg6 ^ 0xC33)) {
            class66.method524(var14, arg2, arg4, arg5, false);
        }
        int var15 = (int) var7 >> 20 & 0x3;
        if (var7 == 0L) {
            return;
        }
        class179 var16 = null;
        class179 var17 = null;
        if (arg1 == 0) {
            class105 var21 = class306.method2173(arg2, arg4, arg5);
            if (var21 != null) {
                var17 = var21.field1724;
                var16 = var21.field1723;
            }
            if (var14.field1624 != 0) {
                arg0.method440(arg5, !var14.field1658, var14.field1660, var13, (byte) 81, arg4, var15);
            }
        } else if (arg1 == 1) {
            class293 var18 = class83.method658(arg2, arg4, arg5);
            if (var18 != null) {
                var17 = var18.field4595;
                var16 = var18.field4593;
            }
        } else if (arg1 == 2) {
            class144 var20 = class237.method1694(arg2, arg4, arg5);
            if (var20 != null) {
                var16 = var20.field2346;
            }
            if (var14.field1624 != 0 && var14.field1626 + arg4 < 104 && var14.field1626 + arg5 < 104 && arg4 + var14.field1623 < 104 && var14.field1623 + arg5 < 104) {
                arg0.method439(var15, 131072, arg5, !var14.field1658, var14.field1626, arg4, var14.field1660, var14.field1623);
            }
        } else if (arg1 == 3) {
            class241 var19 = class13.method178(arg2, arg4, arg5);
            if (var19 != null) {
                var16 = var19.field3609;
            }
            if (var14.field1624 == 1) {
                arg0.method444((byte) -42, arg5, arg4);
            }
        }
        if (var14.field1653 != null) {
            var14 = var14.method813((byte) -29);
        }
        if (!class162.field2623 || var14 == null || !var14.field1637) {
            return;
        }
        if (var13 == 2) {
            if ((var16 instanceof class155)) {
                ((class155) var16).method1161((byte) 97);
            } else {
                class260.method1804(0, arg3, 0, 20375, arg4, var14, arg5, var13, var15 + 4);
            }
            if ((var17 instanceof class155)) {
                ((class155) var17).method1161((byte) 68);
            } else {
                class260.method1804(0, arg3, 0, 20375, arg4, var14, arg5, var13, var15 + 1 & 0x3);
            }
        } else if (var13 == 5) {
            if ((var16 instanceof class155)) {
                ((class155) var16).method1161((byte) -82);
            } else {
                class260.method1804(class339.field5238[var15] * 8, arg3, class89.field1433[var15] * 8, 20375, arg4, var14, arg5, 4, var15);
            }
        } else if (var13 == 6) {
            if ((var16 instanceof class155)) {
                ((class155) var16).method1161((byte) -111);
            } else {
                class260.method1804(class229.field3525[var15] * 8, arg3, class296.field4739[var15] * 8, 20375, arg4, var14, arg5, 4, var15 + 4);
            }
        } else if (var13 == 7) {
            if ((var16 instanceof class155)) {
                ((class155) var16).method1161((byte) 101);
            } else {
                class260.method1804(0, arg3, 0, arg6 + 20285, arg4, var14, arg5, 4, (var15 + 2 & 0x3) + 4);
            }
        } else if (var13 == 8) {
            if (var16 instanceof class155) {
                ((class155) var16).method1161((byte) -114);
            } else {
                class260.method1804(class229.field3525[var15] * 8, arg3, class296.field4739[var15] * 8, arg6 + 20285, arg4, var14, arg5, 4, var15 + 4);
            }
            if (var17 instanceof class155) {
                ((class155) var17).method1161((byte) 71);
            } else {
                class260.method1804(class229.field3525[var15] * 8, arg3, class296.field4739[var15] * 8, 20375, arg4, var14, arg5, 4, (var15 + 2 & 0x3) + 4);
            }
        } else if (var13 == 11) {
            if (var16 instanceof class155) {
                ((class155) var16).method1161((byte) 111);
            } else {
                class260.method1804(0, arg3, 0, 20375, arg4, var14, arg5, 10, var15 + 4);
            }
        } else if ((var16 instanceof class155)) {
            ((class155) var16).method1161((byte) -77);
        } else {
            class260.method1804(0, arg3, 0, 20375, arg4, var14, arg5, var13, var15);
        }
    }
}
