import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class335 {

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[I")
    private int[] field4833;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[I")
    private int[] field4827;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lsd;")
    public static class74 field4829 = new class74(31, 3);

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lec;")
    public static class40 field4835 = new class40("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    private int field4830;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    private int field4831;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lg;")
    public static class470 field4842;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 6)
    private final void method2031(int arg0) {
        field4832++;
        this.field4834 += ++this.field4836;
        if (arg0 != 9323) {
            method2032(-60, -91, 65, 26, 17, -32);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4827[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4831 ^= this.field4831 << 13;
                } else {
                    this.field4831 ^= this.field4831 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4831 ^= this.field4831 << 2;
            } else {
                this.field4831 ^= this.field4831 >>> 16;
            }
            this.field4831 += this.field4827[var2 + 128 & 0xFF];
            int var4;
            this.field4827[var2] = var4 = this.field4834 + this.field4827[class444.method2618(var3 >> 2, 255)] + this.field4831;
            this.field4833[var2] = this.field4834 = this.field4827[class444.method2618(var4 >> 8, 1020) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)V", line = 49)
    public static final void method2032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4837++;
        int var6 = arg2 - arg5;
        int var7 = arg1 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class205.method1122(27412, arg5, arg4, arg2, arg3);
            }
        } else if (var6 == 0) {
            class227.method1250(arg1, arg4, arg3, -4855, arg5);
        } else {
            if (arg0 < ~var6) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                arg4 = arg5;
                int var10 = arg1;
                arg1 = arg2;
                arg5 = var9;
                arg2 = var10;
            }
            if (arg1 < arg4) {
                int var11 = arg4;
                int var12 = arg5;
                arg4 = arg1;
                arg5 = arg2;
                arg1 = var11;
                arg2 = var12;
            }
            int var13 = arg5;
            int var14 = arg1 - arg4;
            int var15 = arg2 - arg5;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg2 > arg5 ? 1 : -1;
            if (var8) {
                for (int var18 = arg4; var18 <= arg1; var18++) {
                    class240.field3303[var18][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg1; var19++) {
                    class240.field3303[var13][var19] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 163)
    public static void method2033(byte arg0) {
        field4835 = null;
        field4842 = null;
        if (arg0 >= 17) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)I", line = 181)
    public final int method2034(byte arg0) {
        field4828++;
        if (this.field4830 == 0) {
            this.method2031(9323);
            this.field4830 = 256;
        }
        if (arg0 >= -2) {
            this.method2035(-61);
        }
        return this.field4833[--this.field4830];
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 202)
    public final int method2035(int arg0) {
        if (this.field4830 == 0) {
            this.method2031(9323);
            this.field4830 = 256;
        }
        if (arg0 != -32435) {
            this.method2036(true);
        }
        field4826++;
        return this.field4833[this.field4830 - 1];
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 225)
    private final void method2036(boolean arg0) {
        field4838++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        int var11 = 0;
        if (!arg0) {
            this.field4830 = 14;
        }
        while (var11 < 256) {
            int var37 = this.field4833[var11 + 5] + var4;
            int var38 = this.field4833[var11 + 3] + var6;
            int var39 = this.field4833[var11 + 7] + var2;
            int var40 = this.field4833[var11 + 2] + var7;
            int var41 = this.field4833[var11 + 4] + var5;
            int var42 = this.field4833[var11 + 6] + var3;
            int var43 = this.field4833[var11] + var9;
            int var44 = this.field4833[var11 + 1] + var8;
            int var45 = var43 ^ var44 << 11;
            int var46 = var40 + var44;
            int var47 = var38 + var45;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var40 + var47;
            int var50 = var41 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var37 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var42;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var39;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field4827[var11] = var9;
            this.field4827[var11 + 1] = var8;
            this.field4827[var11 + 2] = var7;
            this.field4827[var11 + 3] = var6;
            this.field4827[var11 + 4] = var5;
            this.field4827[var11 + 5] = var4;
            this.field4827[var11 + 6] = var3;
            this.field4827[var11 + 7] = var2;
            var11 += 8;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4827[var12] + var9;
            int var14 = this.field4827[var12 + 2] + var7;
            int var15 = this.field4827[var12 + 3] + var6;
            int var16 = this.field4827[var12 + 4] + var5;
            int var17 = this.field4827[var12 + 7] + var2;
            int var18 = this.field4827[var12 + 5] + var4;
            int var19 = this.field4827[var12 + 1] + var8;
            int var20 = this.field4827[var12 + 6] + var3;
            int var21 = var13 ^ var19 << 11;
            int var22 = var15 + var21;
            int var23 = var14 + var19;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var14 + var22;
            int var26 = var16 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var18 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var20;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var17;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field4827[var12] = var9;
            this.field4827[var12 + 1] = var8;
            this.field4827[var12 + 2] = var7;
            this.field4827[var12 + 3] = var6;
            this.field4827[var12 + 4] = var5;
            this.field4827[var12 + 5] = var4;
            this.field4827[var12 + 6] = var3;
            this.field4827[var12 + 7] = var2;
        }
        this.method2031(9323);
        this.field4830 = 256;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBIII)V", line = 376)
    public static final void method2037(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class230.field3185.field2206 = 0;
        field4839++;
        class230.field3185.method909(class214.field2952.field4563, -1);
        class230.field3185.method909(arg4, -1);
        class230.field3185.method909(arg3, -1);
        class230.field3185.method884(arg0, true);
        class230.field3185.method884(arg2, true);
        class56.field714 = 1;
        if (arg1 != 39) {
            method2037(-35, (byte) -24, 22, 11, 43);
        }
        class468.field6575 = -3;
        class233.field3243 = 0;
        class75.field902 = 0;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 395)
    private class335() {
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([I)V", line = 398)
    public class335(int[] arg0) {
        this.field4833 = new int[256];
        this.field4827 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4833[var2] = arg0[var2];
        }
        this.method2036(true);
    }
}
