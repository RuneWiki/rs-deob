import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class119 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
    public static int[] field2133 = new int[256];

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Z")
    public static boolean field2139 = false;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[I")
    public static int[] field2132 = new int[100];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lq;")
    public static class148 field2138;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lej;")
    public static class35 field2136;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lkh;")
    public static class5 field2145;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public static int[] field2134;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lsc;IIIZ)V")
    public void method880(class119 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2141++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()Z")
    public boolean method881() {
        field2144++;
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
    public static final boolean method882(int arg0, int arg1) {
        if (arg1 != 4305) {
            field2145 = null;
        }
        field2131++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lnd;B)V")
    public static final void method883(class192 arg0, byte arg1) {
        field2146++;
        int var2 = -87 / ((-arg1 - 49) / 50);
        class60 var3 = (class60) class34.field594.method1511((byte) -127, arg0.field3323.method727((byte) 36));
        if (var3 == null) {
            return;
        }
        if (var3.field997 != null) {
            class36.field606.method1213(var3.field997);
            var3.field997 = null;
        }
        var3.method1611((byte) -125);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)I")
    public static final int method884(int arg0, byte arg1) {
        if (arg1 != -74) {
            method884(83, (byte) 61);
        }
        field2135++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Lsc;")
    public class119 method885(int arg0, int arg1, int arg2) {
        field2137++;
        return this;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2147++;
        int var11 = arg3 - arg6;
        boolean var12;
        if (class62.field1036 > 0 && (class62.field1036 % 10) < 5) {
            var12 = true;
        } else {
            var12 = false;
        }
        int var13 = 983040 / arg2;
        int var14 = arg0 - arg4;
        int var15 = 983040 / arg1;
        for (int var16 = -var13; var16 < var11 + var13; var16++) {
            int var18 = arg8 + (arg2 * var16) >> 16;
            int var19 = arg8 + ((var16 + 1) * arg2) >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg7 + var19;
                int var22 = arg7 + var18;
                int var23 = arg6 + var16 >> 6;
                if (var23 >= 0 && (class25.field489.length - 1) >= var23) {
                    int[][] var24 = class25.field489[var23];
                    for (int var25 = -var15; var25 < var14 + var15; var25++) {
                        int var26 = (var25 + 1) * arg1 + arg9 >> 16;
                        int var27 = arg1 * var25 + arg9 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            int var29 = arg10 + var27;
                            var10000 = arg10 + var26;
                            int var31 = var25 + arg4 >> 6;
                            if (var31 >= 0 && var31 <= (var24.length - 1) && var24[var31] != null) {
                                int var32 = ((arg4 + var25 & 0x3F) << 6) + (var16 + arg6 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class21 var34 = class125.method929(var33 - 1, (byte) -85);
                                    if (var12 && class106.field1905 == var34.field427) {
                                        class253 var35 = new class253();
                                        var35.field4428 = var22;
                                        var35.field4435 = var29;
                                        var35.field4429 = var34.field427;
                                        class110.field1952.method376((byte) 13, var35);
                                    }
                                    class192.field3357[var34.field427].method618(var22 - 7, var29 - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg5 != -6) {
            method883((class192) null, (byte) 127);
        }
        for (class253 var17 = (class253) class110.field1952.method371((byte) 61); var17 != null; var17 = (class253) class110.field1952.method370(true)) {
            class192.field3357[var17.field4429].method618(var17.field4428 - 7, var17.field4435 - 7);
            class128.method962(var17.field4428, var17.field4435, 15, 16776960, 128);
            class128.method962(var17.field4428, var17.field4435, 7, 16777215, 256);
        }
        class110.field1952.method382(false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method887(byte arg0) {
        field2138 = null;
        field2132 = null;
        field2133 = null;
        field2134 = null;
        field2145 = null;
        if (arg0 == 49) {
            field2136 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()I")
    public abstract int method90();

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public void method888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -1) {
            method886(-112, -107, 53, -83, -68, -126, -74, -41, 111, -19, -53);
        }
        field2142++;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
    public static final void method889(int arg0, int arg1, int arg2) {
        field2143++;
        if (arg0 != -5367) {
            return;
        }
        if (class44.field741 > 0) {
            class25.method264(class44.field741, (byte) 110);
            class44.field741 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        int var6 = class128.field2294 * arg1;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class71.field1147[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class87.field1549[var4++];
                int var12 = class128.field2286[arg2 + (var6++)];
                if (var11 == 0) {
                    class1.field3.field4338[var5++] = var12;
                } else {
                    int var13 = 256 - var11 - 18;
                    int var14 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class205.field3512[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class1.field3.field4338[var5++] = class214.method1427(class214.method1427(var12, 16711935) * var13 + var14 * class214.method1427(var15, 16711935), -16711936) + class214.method1427(var13 * class214.method1427(65280, var12) + class214.method1427(var15, 65280) * var14, 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class1.field3.field4338[var5++] = class128.field2286[arg2 + (var6++)];
            }
            var6 += class128.field2294 - 128;
        }
        class1.field3.method617(arg2, arg1);
    }
}
