import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class32 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[J")
    public static long[] field493 = new long[256];

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lrg;")
    public static class383 field497 = null;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field501;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "[I")
    public static int[] field499;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "[Llf;")
    public static class130[] field500;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field493[var0] = var1;
        }
        field501 = new String[100];
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIII)Ljj;", line = 7)
    public static final class61 method241(boolean arg0, int arg1, int arg2, int arg3) {
        field495++;
        class142 var4 = class5.field79[arg2][arg3][arg1];
        if (var4 == null) {
            return null;
        }
        class61 var5 = null;
        int var6 = -1;
        if (!arg0) {
            field493 = null;
        }
        for (class218 var7 = var4.field2043; var7 != null; var7 = var7.field2884) {
            class430 var8 = var7.field2882;
            if (var8 instanceof class61) {
                class61 var9 = (class61) var8;
                int var10 = (var9.method410((byte) 115) - 1) * 64 + 60;
                int var11 = var9.field6197 - var10 >> 7;
                int var12 = var9.field6192 - var10 >> 7;
                int var13 = var9.field6197 + var10 >> 7;
                int var14 = var9.field6192 + var10 >> 7;
                if (var11 <= arg3 && arg1 >= var12 && var13 >= arg3 && var14 >= arg1) {
                    int var15 = (var14 + 1 - arg1) * (var13 + 1 - arg3);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 69)
    public static final void method242(boolean arg0) {
        field494++;
        if (!class67.method457(31862) && client.field2349 != class265.field3617) {
            class398.method2577(false, class265.field3617, class307.field4211.field956[0], class430.field6183, (byte) -115, class419.field6055, class307.field4211.field944[0], false);
        } else if (!arg0) {
            class221.method1408(128, class408.field5920);
            if (class265.field3617 != class179.field2508) {
                class15.method89(-125);
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lne;Laa;Lu;I)V", line = 96)
    public static final void method243(class173 arg0, class281 arg1, class46 arg2, int arg3) {
        field496++;
        class130 var4 = arg2.method325(-804606947, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method880();
        if (var4.method876() > var5) {
            var5 = var4.method876();
        }
        byte var6 = 10;
        int var7 = arg0.field2460;
        int var8 = arg0.field2459;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field711 != null) {
            var9 = class439.field6374.method446(-24976, (int[]) null, (class130[]) null, class356.field5011, arg2.field711);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class356.field5011[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class139.field1976.method1210(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class139.field1976.method1207() * var9 + (class139.field1976.method1205() / 2);
        }
        int var15 = arg0.field2460 + (var5 / 2);
        if ((class42.field645 + var5) > var7) {
            var15 = var5 / 2 + (var10 / 2) + var6 + class42.field645 + 5;
            var7 = class42.field645;
        } else if (class42.field632 - var5 < var7) {
            var7 = class42.field632 - var5;
            var15 = class42.field632 - (var5 / 2) - var6 - (var10 / 2 + 5);
        }
        int var16 = arg0.field2459;
        if (class42.field634 + var5 > var8) {
            var16 = class42.field634 - (-var6 - var5 / 2);
            var8 = class42.field634;
        } else if (var8 > class42.field652 - var5) {
            var8 = class42.field652 - var5;
            var16 = class42.field652 - (var5 / 2) - var11 - var6;
        }
        int var17 = (int) ((double) arg3 * (Math.atan2((double) (var7 - arg0.field2460), (double) (var8 - arg0.field2459)) / 3.141592653589793D)) & 0xFFFF;
        var4.method871((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field711 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = var16 + class139.field1976.method1207() * var9 + 3;
            var20 = var10 + var18 + 10;
            if (arg2.field723 != 0) {
                arg1.method1762(var16, var21 - var16, var18, arg2.field723, var20 - var18, -1);
            }
            if (arg2.field704 != 0) {
                arg1.method1754(arg2.field704, var16, (byte) -74, var20 - var18, var18, var21 - var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class356.field5011[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class139.field1976.method1208(arg1, var23, var15, var16, arg2.field716, true);
                var16 += class139.field1976.method1207();
            }
        }
        if (arg2.field690 == -1 && arg2.field711 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class206 var25 = new class206(arg0);
        var25.field2791 = var20;
        var25.field2792 = var8 + var24;
        var25.field2783 = var7 + var24;
        var25.field2784 = var21;
        var25.field2789 = var7 - var24;
        var25.field2782 = var19;
        var25.field2787 = var8 - var24;
        var25.field2785 = var18;
        class448.field6462.method1301(50, var25);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 241)
    public static void method244(int arg0) {
        field501 = null;
        field499 = null;
        field500 = null;
        if (arg0 != -1) {
            method242(false);
        }
        field493 = null;
        field497 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIILjava/lang/Class;)Lcp;", line = 256)
    public static final class430 method245(int arg0, int arg1, int arg2, Class arg3) {
        class142 var4 = class5.field79[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class218 var5 = var4.field2043; var5 != null; var5 = var5.field2884) {
            class430 var6 = var5.field2882;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6182 == arg1 && var6.field6186 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
