import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class266 extends class181 {

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "Z")
    public volatile boolean field4709 = true;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "Lli;")
    public static class185 field4707 = class245.method1649("<img=1>", 127);

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Lli;")
    public static class185 field4708 = class245.method1649(")4p=", -126);

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "Z")
    public static boolean field4714 = false;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "Lli;")
    public static class185 field4716 = class245.method1649("Schrifts-=tze geladen)3", 123);

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Lli;")
    public static class185 field4718 = class245.method1649("_labels", 122);

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "Z")
    public boolean field4706;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Z")
    public boolean field4710;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "[Lcg;")
    public static class34[] field4717;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static void method1812(byte arg0) {
        if (arg0 < 55) {
            method1815(-63, 47, -34, 39, -109, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 102, (byte) -53, 94, -123);
        }
        field4716 = null;
        field4708 = null;
        field4718 = null;
        field4707 = null;
        field4717 = null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)[B")
    public abstract byte[] method1059(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILhi;I)Lda;")
    public static final class101 method1813(int arg0, class250 arg1, int arg2) {
        field4712++;
        if (arg2 > -50) {
            return null;
        } else if (class207.method1467(arg1, arg0, 0)) {
            return class18.method129(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)I")
    public abstract int method1060(byte arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
    public static final void method1814(boolean arg0, int arg1) {
        field4713++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class239.field4266 += arg1 * 128;
        if (class239.field4266 > class179.field3292.length) {
            class239.field4266 -= class179.field3292.length;
            int var3 = (int) (Math.random() * 12.0D);
            class224.method1554(3000, class242.field4334[var3]);
        }
        int var4 = (var2 - arg1) * 128;
        int var5 = arg1 * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            int var26 = class60.field1085[var5 + var6] - (class179.field3292[class179.field3292.length - 1 & var6 - -class239.field4266] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class60.field1085[var6++] = var26;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class60.field1085[var23 + var24] = 255;
                } else {
                    class60.field1085[var23 + var24] = 0;
                }
            }
        }
        if (arg0) {
            field4714 = true;
        }
        for (int var9 = 0; var9 < (var2 - arg1); var9++) {
            class194.field3576[var9] = class194.field3576[arg1 + var9];
        }
        for (int var10 = var2 - arg1; var10 < var2; var10++) {
            class194.field3576[var10] = (int) (Math.sin((double) class32.field531 / 14.0D) * 16.0D + Math.sin((double) class32.field531 / 15.0D) * 14.0D + Math.sin((double) class32.field531 / 16.0D) * 12.0D);
            class32.field531++;
        }
        class127.field2281 += arg1;
        int var11 = ((class211.field3851 & 0x1) + arg1) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class127.field2281; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class60.field1085[(var22 << 7) + var21] = 192;
        }
        class127.field2281 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var18 += class60.field1085[var11 + var20 + var19];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var18 -= class60.field1085[var19 + var20 - var11 - 1];
                }
                if (var20 >= 0) {
                    class32.field534[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var16 + var11) {
                    var15 += class32.field534[var11 * 128 + var14 + var17];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class32.field534[var14 + var17 - var11 * 128 - 128];
                }
                if (var16 >= 0) {
                    class60.field1085[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1815(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class264.field4685 * 128) {
            arg0 = class264.field4685 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class122.field2214 * 128) {
            arg2 = class122.field2214 * 128 - 1;
        }
        class68.field1210 = class167.field3110[arg3];
        class242.field4324 = class167.field3112[arg3];
        class144.field2750 = class167.field3110[arg4];
        class257.field4580 = class167.field3112[arg4];
        class6.field144 = arg0;
        class150.field2847 = arg1;
        class185.field3447 = arg2;
        class267.field4732 = arg0 / 128;
        class9.field193 = arg2 / 128;
        class256.field4558 = class267.field4732 - class223.field4096;
        if (class256.field4558 < 0) {
            class256.field4558 = 0;
        }
        class134.field2432 = class9.field193 - class223.field4096;
        if (class134.field2432 < 0) {
            class134.field2432 = 0;
        }
        class79.field1380 = class267.field4732 + class223.field4096;
        if (class79.field1380 > class264.field4685) {
            class79.field1380 = class264.field4685;
        }
        class94.field1791 = class9.field193 + class223.field4096;
        if (class94.field1791 > class122.field2214) {
            class94.field1791 = class122.field2214;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class223.field4096 + class223.field4096 + 2; var16++) {
            for (int var19 = 0; var19 < class223.field4096 + class223.field4096 + 2; var19++) {
                int var20 = (var16 - class223.field4096 << 7) - (class6.field144 & 0x7F);
                int var21 = (var19 - class223.field4096 << 7) - (class185.field3447 & 0x7F);
                int var22 = class267.field4732 + var16 - class223.field4096;
                int var23 = class9.field193 + var19 - class223.field4096;
                if (var22 >= 0 && var23 >= 0 && var22 < class264.field4685 && var23 < class122.field2214) {
                    int var24;
                    if (class268.field4747 == null) {
                        var24 = class60.field1075[0][var22][var23] + 128 - class150.field2847;
                    } else {
                        var24 = class268.field4747[0][var22][var23] + 128 - class150.field2847;
                    }
                    int var25 = class60.field1075[3][var22][var23] - class150.field2847 - 1000;
                    class199.field3660[var16][var19] = class229.method1585(var20, var25, var24, var21, var15);
                } else {
                    class199.field3660[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class223.field4096 + class223.field4096 + 1; var17++) {
            for (int var18 = 0; var18 < class223.field4096 + class223.field4096 + 1; var18++) {
                class93.field1776[var17][var18] = class199.field3660[var17][var18] || class199.field3660[var17 + 1][var18] || class199.field3660[var17][var18 + 1] || class199.field3660[var17 + 1][var18 + 1];
            }
        }
        class282.field4980 = arg6;
        class13.field225 = arg7;
        class263.field4662 = arg8;
        class18.field295 = arg9;
        class274.field4869 = arg10;
        class10.method93();
        if (class171.field3151 != null) {
            class20.method149(true);
            class42.method257(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class20.method149(false);
        }
        class42.method257(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
