import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class103 extends class205 {

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[I")
    public static int[] field1785 = new int[14];

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1780 = "Cancel";

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lbm;")
    public static class307 field1782;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lbm;")
    public static class307 field1786;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Lbm;")
    public static class307 field1789;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Ljava/lang/String;")
    public String field1783;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Ljava/lang/String;")
    public String field1792;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[[[B")
    public static byte[][][] field1781;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lnh;", line = 5)
    public final class241 method669(int arg0) {
        field1787++;
        if (arg0 < 122) {
            field1781 = (byte[][][]) ((byte[][][]) null);
        }
        return class180.field2897[this.field3351];
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method670(boolean arg0) {
        while (class95.field1709 >= 2048.0F) {
            class95.field1709 -= 2048.0F;
        }
        field1790++;
        int var1 = class221.field3503 >> 7;
        while (class95.field1709 < 0.0F) {
            class95.field1709 += 2048.0F;
        }
        if (class120.field2090 < 128.0F) {
            class120.field2090 = 128.0F;
        }
        int var2 = 0;
        int var3 = class230.field3630 >> 7;
        if (!arg0) {
            field1786 = (class307) null;
        }
        if (class120.field2090 > 383.0F) {
            class120.field2090 = 383.0F;
        }
        int var4 = class325.method2250(class230.field3630, 22771, class289.field4438, class221.field3503);
        if (var1 > 3 && var3 > 3 && var1 < 100 && var3 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var3 - 4; var6 <= (var3 + 4); var6++) {
                    int var7 = class289.field4438;
                    if (var7 < 3 && (class99.field1749[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = ((class44.field855[var7][var5][var6] & 0xFF) * 8) + var4 - class45.field923[var7][var5][var6];
                    if (var8 > var2) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class168.field2692 < var9) {
            class168.field2692 += (var9 - class168.field2692) / 24;
        } else if (class168.field2692 > var9) {
            class168.field2692 += (var9 - class168.field2692) / 80;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V", line = 97)
    public static void method671(byte arg0) {
        field1786 = null;
        field1785 = null;
        field1780 = null;
        field1781 = (byte[][][]) null;
        field1782 = null;
        field1789 = null;
        if (arg0 > -95) {
            method673(-26, (byte) 63, -54, 85, -3, 116);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)Lhc;", line = 123)
    public static final class145 method672(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1788++;
        if (arg4 != -1858901856) {
            field1786 = (class307) null;
        }
        long var5 = (long) arg1 & 0xFFFFL | (long) arg2 & 0xFFFFL << 48 | (long) arg0 & 0xFFFFL << 32 | ((long) arg3 & 0xFFFFL) << 16;
        class145 var7 = (class145) class186.field3022.method1881(true, var5);
        if (var7 != null) {
            return var7;
        }
        class340[] var8 = null;
        class97 var9 = class322.method2239(-6, arg1);
        if (var9.field1717 != null) {
            var8 = new class340[var9.field1717.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class185 var11 = class127.method842(arg4 ^ 0x6ECCD265, var9.field1717[var10]);
                var8[var10] = new class340(var11.field3008, var11.field3003, var11.field3002, var11.field3007, var11.field3014, var11.field3006, var11.field3000, var11.field3012);
            }
        }
        class145 var12 = new class145(var9.field1712, var8, var9.field1719, arg2, arg0, arg3);
        class186.field3022.method1880(var12, var5, 80);
        return var12;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBIIII)V", line = 165)
    public static final void method673(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1793++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg3 * arg3;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var9 + var11;
        int var14 = var9 << 2;
        int var15 = var8 - ((var12 - 1) * var10);
        int var16 = 86 / ((arg1 - 32) / 36);
        int var17 = var8 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg3 << 1) - 3) * var10;
        int var20 = (var6 + 1) * var17;
        if (class59.field1162 <= arg5 && arg5 <= class186.field3028) {
            int var21 = class8.method73(8, class259.field4024, class147.field2416, arg0 + arg2);
            int var22 = class8.method73(8, class259.field4024, class147.field2416, arg0 - arg2);
            class241.method1598(arg4, -7, class155.field2522[arg5], var21, var22);
        }
        int var23 = (arg3 - 1) * var14;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var18;
                    var18 += var17;
                    var15 += var20;
                    var20 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var20 += var17;
                var6++;
                var13 += var18;
                var18 += var17;
            }
            var13 += -var23;
            var23 -= var14;
            var15 += -var19;
            var19 -= var14;
            var7--;
            int var24 = arg5 - var7;
            int var25 = arg5 + var7;
            if (var25 >= class59.field1162 && var24 <= class186.field3028) {
                int var26 = class8.method73(8, class259.field4024, class147.field2416, arg0 + var6);
                int var27 = class8.method73(8, class259.field4024, class147.field2416, arg0 - var6);
                if (class59.field1162 <= var24) {
                    class241.method1598(arg4, -7, class155.field2522[var24], var26, var27);
                }
                if (var25 <= class186.field3028) {
                    class241.method1598(arg4, -7, class155.field2522[var25], var26, var27);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V", line = 273)
    public static final void method674(int arg0, int arg1) {
        field1784++;
        class2 var2 = class212.method1433(arg1, arg0, -13802);
        var2.method16((byte) -83);
    }
}
