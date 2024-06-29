import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class119 extends class189 {

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field2260 = 50;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[I")
    public static int[] field2259 = new int[field2260];

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[I")
    public static int[] field2254 = new int[field2260];

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "J")
    public static long field2263 = 0L;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "[I")
    public static int[] field2262 = new int[field2260];

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[I")
    public static int[] field2251 = new int[field2260];

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[I")
    public static int[] field2252 = new int[field2260];

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "[Lr;")
    public static class66[] field2258 = new class66[field2260];

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "[I")
    public static int[] field2264 = new int[field2260];

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[I")
    public static int[] field2256 = new int[field2260];

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lqc;")
    public static class245 field2253 = new class245(64);

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "[Llj;")
    public static class44[] field2265 = new class44[100];

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[Lr;)[Lr;")
    public static final class66[] method811(byte arg0, class66[] arg1) {
        field2255++;
        class66[] var2 = new class66[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class212.method1372(2, new class66[] { class144.method989(var3, 0), class125.field2366 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class212.method1372(2, new class66[] { var2[var3], arg1[var3] });
            }
        }
        if (arg0 >= -65) {
            method811((byte) -122, (class66[]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class149.method1015(-1, arg6);
        int var7 = 0;
        field2250++;
        int var8 = arg6;
        int var9 = -arg6;
        int var10 = arg6 - arg3;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = var10;
        if (arg5 != -135) {
            return;
        }
        int var12 = -var10;
        int var13 = -1;
        if (class241.field4186 <= arg1 && arg1 <= class222.field3788) {
            int[] var14 = class15.field183[arg1];
            int var15 = class54.method368(arg4 - arg6, class215.field3706, (byte) 114, class165.field2972);
            int var16 = class54.method368(arg4 + arg6, class215.field3706, (byte) 114, class165.field2972);
            int var17 = class54.method368(arg4 - var10, class215.field3706, (byte) 114, class165.field2972);
            int var18 = class54.method368(arg4 + var10, class215.field3706, (byte) 114, class165.field2972);
            class194.method1266(var15, (byte) -17, arg2, var14, var17);
            class194.method1266(var17, (byte) -17, arg0, var14, var18);
            class194.method1266(var18, (byte) -17, arg2, var14, var16);
        }
        int var19 = -1;
        while (var8 > var7) {
            var13 += 2;
            var19 += 2;
            var9 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class25.field323[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var8--;
                var9 -= var8 << 1;
                int var20 = arg1 - var8;
                int var21 = arg1 + var8;
                if (class241.field4186 <= var21 && var20 <= class222.field3788) {
                    if (var10 > var8) {
                        int var22 = class25.field323[var8];
                        int var23 = class54.method368(arg4 + var7, class215.field3706, (byte) 114, class165.field2972);
                        int var24 = class54.method368(arg4 - var7, class215.field3706, (byte) 114, class165.field2972);
                        int var25 = class54.method368(arg4 + var22, class215.field3706, (byte) 114, class165.field2972);
                        int var26 = class54.method368(arg4 - var22, class215.field3706, (byte) 114, class165.field2972);
                        if (class222.field3788 >= var21) {
                            int[] var27 = class15.field183[var21];
                            class194.method1266(var24, (byte) -17, arg2, var27, var26);
                            class194.method1266(var26, (byte) -17, arg0, var27, var25);
                            class194.method1266(var25, (byte) -17, arg2, var27, var23);
                        }
                        if (var20 >= class241.field4186) {
                            int[] var28 = class15.field183[var20];
                            class194.method1266(var24, (byte) -17, arg2, var28, var26);
                            class194.method1266(var26, (byte) -17, arg0, var28, var25);
                            class194.method1266(var25, (byte) -17, arg2, var28, var23);
                        }
                    } else {
                        int var29 = class54.method368(arg4 + var7, class215.field3706, (byte) 114, class165.field2972);
                        int var30 = class54.method368(arg4 - var7, class215.field3706, (byte) 114, class165.field2972);
                        if (class222.field3788 >= var21) {
                            class194.method1266(var30, (byte) -17, arg2, class15.field183[var21], var29);
                        }
                        if (var20 >= class241.field4186) {
                            class194.method1266(var30, (byte) -17, arg2, class15.field183[var20], var29);
                        }
                    }
                }
            }
            int var31 = arg1 + var7;
            int var32 = arg1 - var7;
            if (var31 >= class241.field4186 && var32 <= class222.field3788) {
                int var33 = arg4 + var8;
                int var34 = arg4 - var8;
                if (class165.field2972 <= var33 && var34 <= class215.field3706) {
                    int var35 = class54.method368(var33, class215.field3706, (byte) 114, class165.field2972);
                    int var36 = class54.method368(var34, class215.field3706, (byte) 114, class165.field2972);
                    if (var10 > var7) {
                        int var37 = var11 < var7 ? class25.field323[var7] : var11;
                        int var38 = class54.method368(arg4 + var37, class215.field3706, (byte) 114, class165.field2972);
                        int var39 = class54.method368(arg4 - var37, class215.field3706, (byte) 114, class165.field2972);
                        if (class222.field3788 >= var31) {
                            int[] var40 = class15.field183[var31];
                            class194.method1266(var36, (byte) -17, arg2, var40, var39);
                            class194.method1266(var39, (byte) -17, arg0, var40, var38);
                            class194.method1266(var38, (byte) -17, arg2, var40, var35);
                        }
                        if (var32 >= class241.field4186) {
                            int[] var41 = class15.field183[var32];
                            class194.method1266(var36, (byte) -17, arg2, var41, var39);
                            class194.method1266(var39, (byte) -17, arg0, var41, var38);
                            class194.method1266(var38, (byte) -17, arg2, var41, var35);
                        }
                    } else {
                        if (var31 <= class222.field3788) {
                            class194.method1266(var36, (byte) -17, arg2, class15.field183[var31], var35);
                        }
                        if (var32 >= class241.field4186) {
                            class194.method1266(var36, (byte) -17, arg2, class15.field183[var32], var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILta;)V")
    public static final void method813(int arg0, class107 arg1) {
        field2261++;
        if (class75.field1501 == arg1.field2037 || arg1.field2084 == -1 || arg1.field2061 != 0 || arg1.field2072 + 1 > class47.method335((byte) -36, arg1.field2084).field3834[arg1.field2038]) {
            int var2 = class75.field1501 - arg1.field2066;
            int var3 = arg1.field2037 - arg1.field2066;
            int var4 = arg1.field2060 * 64 + arg1.field2034 * 128;
            int var5 = arg1.field2060 * 64 + arg1.field2058 * 128;
            int var6 = arg1.field2060 * 64 + arg1.field2035 * 128;
            arg1.field2053 = ((var3 - var2) * var4 + (var2 * var6)) / var3;
            int var7 = arg1.field2075 * 128 + arg1.field2060 * 64;
            arg1.field2077 = ((var3 - var2) * var7 + var2 * var5) / var3;
        }
        if (arg0 != 128) {
            return;
        }
        if (arg1.field2104 == 0) {
            arg1.field2049 = 1024;
        }
        if (arg1.field2104 == 1) {
            arg1.field2049 = 1536;
        }
        if (arg1.field2104 == 2) {
            arg1.field2049 = 0;
        }
        if (arg1.field2104 == 3) {
            arg1.field2049 = 512;
        }
        arg1.field2064 = arg1.field2049;
        arg1.field2036 = 0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method814(int arg0) {
        field2254 = null;
        field2264 = null;
        field2253 = null;
        field2251 = null;
        field2256 = null;
        field2259 = null;
        if (arg0 != 32655) {
            field2259 = null;
        }
        field2265 = null;
        field2262 = null;
        field2258 = null;
        field2252 = null;
    }
}
