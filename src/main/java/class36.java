import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class36 extends class205 {

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    private int field783 = 1;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    private int field781 = 1;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "Lvd;")
    public static class222 field775 = class212.method1357("3D)2Softwarebibliothek gestartet", 10731);

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "[I")
    public static int[] field778 = new int[256];

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "[I")
    public static int[] field784 = new int[200];

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "Lvd;")
    private static class222 field789;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "[I")
    public static int[] field788;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "Lvd;")
    public static class222 field790;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method295(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field779;
        if (~class208.field3870 != ~arg1 || class160.field3052 != arg0 || class112.field2116 != arg5 && class122.field2331) {
            class160.field3052 = arg0;
            class208.field3870 = arg1;
            class112.field2116 = arg5;
            if (!class122.field2331) {
                class112.field2116 = 0;
            }
            class55.method410(25, 0);
            class88.method571(class29.field642, (byte) 108, true);
            int var6 = class110.field2064;
            int var7 = class151.field2931;
            class151.field2931 = (arg0 + -6) * 8;
            class110.field2064 = (arg1 + -6) * 8;
            int var8 = -var7 + class151.field2931;
            int var9 = -var6 + class110.field2064;
            int var10 = class151.field2931;
            int var11 = class110.field2064;
            for (int var12 = 0; ~var12 > -32769; ++var12) {
                class193 var29 = class202.field3696[var12];
                if (var29 != null) {
                    for (int var30 = 0; var30 < 10; ++var30) {
                        var29.field1333[var30] -= var9;
                        var29.field1358[var30] -= var8;
                    }
                    var29.field1360 -= var8 * 128;
                    var29.field1353 -= var9 * 128;
                }
            }
            for (int var13 = 0; ~var13 > -2049; ++var13) {
                class38 var27 = class54.field1024[var13];
                if (var27 != null) {
                    for (int var28 = 0; var28 < 10; ++var28) {
                        var27.field1333[var28] -= var9;
                        var27.field1358[var28] -= var8;
                    }
                    var27.field1360 -= var8 * 128;
                    var27.field1353 -= var9 * 128;
                }
            }
            class217.field4036 = arg5;
            byte var14 = 0;
            class17.field432.method477(arg2, arg3, -125, false);
            byte var15 = 104;
            byte var16 = 1;
            int var17 = -56 % ((-80 - arg4) / 44);
            if (var9 < 0) {
                var15 = -1;
                var14 = 103;
                var16 = -1;
            }
            byte var18 = 0;
            byte var19 = 104;
            byte var20 = 1;
            if (~var8 > -1) {
                var18 = 103;
                var20 = -1;
                var19 = -1;
            }
            for (int var21 = var14; var15 != var21; var21 += var16) {
                for (int var23 = var18; var19 != var23; var23 += var20) {
                    int var24 = var8 + var23;
                    int var25 = var9 + var21;
                    for (int var26 = 0; ~var26 > -5; ++var26) {
                        if (var25 >= 0 && ~var24 <= -1 && var25 < 104 && var24 < 104) {
                            class237.field4408[var26][var21][var23] = class237.field4408[var26][var25][var24];
                        } else {
                            class237.field4408[var26][var21][var23] = null;
                        }
                    }
                }
            }
            for (class56 var22 = (class56) class80.field1533.method236(0); var22 != null; var22 = (class56) class80.field1533.method237(true)) {
                var22.field1058 -= var9;
                var22.field1057 -= var8;
                if (~var22.field1058 > -1 || var22.field1057 < 0 || var22.field1058 >= 104 || ~var22.field1057 <= -105) {
                    var22.method826(-22101);
                }
            }
            class215.field3986 = -1;
            if (class131.field2537 != 0) {
                class131.field2537 -= var9;
                class214.field3973 -= var8;
            }
            class44.field928 = false;
            class52.field993 = 0;
            class98.field1850.method238(1);
            class76.field1479.method238(1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        if (arg1 < 98) {
            return null;
        } else {
            int[][] var3 = super.field3815.method1003(-8357, arg0);
            if (super.field3815.field3015) {
                int var4 = this.field783 + this.field783 + 1;
                int var5 = this.field781 + this.field781 + 1;
                int var6 = 65536 / var4;
                int var7 = 65536 / var5;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field783 + arg0; this.field783 + arg0 >= var9; ++var9) {
                    int[][] var19 = this.method1323(0, class17.field433 & var9, -5920);
                    int[][] var20 = new int[3][class118.field2245];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[2];
                    int[] var26 = var19[1];
                    for (int var27 = -this.field781; ~this.field781 <= ~var27; ++var27) {
                        int var37 = var27 & class159.field3039;
                        var23 += var25[var37];
                        var22 += var26[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[1];
                    int[] var29 = var20[0];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~class118.field2245 < ~var31) {
                        var29[var31] = var7 * var21 >> 16;
                        var28[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = -this.field781 + var31 & class159.field3039;
                        int var33 = var23 - var25[var32];
                        int var34 = var22 - var26[var32];
                        int var35 = var21 - var24[var32];
                        ++var31;
                        int var36 = this.field781 + var31 & class159.field3039;
                        var22 = var26[var36] + var34;
                        var23 = var25[var36] + var33;
                        var21 = var24[var36] + var35;
                    }
                    var8[this.field783 + var9 - arg0] = var20;
                }
                int[] var10 = var3[1];
                int[] var11 = var3[2];
                int[] var12 = var3[0];
                for (int var13 = 0; ~class118.field2245 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var16 += var18[2][var13];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                    }
                    var12[var13] = var6 * var14 >> 16;
                    var10[var13] = var6 * var15 >> 16;
                    var11[var13] = var6 * var16 >> 16;
                }
            }
            ++field791;
            return var3;
        }
    }

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V")
    public static void method296(int arg0) {
        field775 = null;
        field784 = null;
        field778 = null;
        int var1 = 87 % ((-40 - arg0) / 39);
        field789 = null;
        field790 = null;
        field788 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lka;Z)Lvb;")
    public static final class220 method297(class109 arg0, boolean arg1) {
        class220 var2 = new class220();
        ++field785;
        var2.field4064 = arg0.method675(2);
        var2.field4072 = class75.method504(arg1, var2.field4064);
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = 5 % ((-47 - arg1) / 34);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field3812 = arg0.method662((byte) -90) == 1;
                }
            } else {
                this.field783 = arg0.method662((byte) -121);
            }
        } else {
            this.field781 = arg0.method662((byte) -92);
        }
        ++field780;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        int[] var3 = super.field3810.method557(6978, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field3810.field1635) {
                int var4 = this.field783 + 1 + this.field783;
                int var5 = 65536 / var4;
                int var6 = this.field781 + 1 + this.field781;
                int[][] var7 = new int[var4][];
                int var8 = 65536 / var6;
                for (int var9 = -this.field783 + arg1; this.field783 + arg1 >= var9; ++var9) {
                    int[] var13 = this.method1322(class17.field433 & var9, (byte) 56, 0);
                    int[] var14 = new int[class118.field2245];
                    int var15 = 0;
                    for (int var16 = -this.field781; ~var16 >= ~this.field781; ++var16) {
                        var15 += var13[var16 & class159.field3039];
                    }
                    int var17 = 0;
                    while (var17 < class118.field2245) {
                        var14[var17] = var8 * var15 >> 16;
                        int var18 = var15 - var13[-this.field781 + var17 & class159.field3039];
                        ++var17;
                        var15 = var13[this.field781 + var17 & class159.field3039] + var18;
                    }
                    var7[-arg1 + var9 + this.field783] = var14;
                }
                for (int var10 = 0; ~class118.field2245 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var4; ++var12) {
                        var11 += var7[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            ++field776;
            return var3;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(var1 & 1) != -2) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field778[var0] = var1;
        }
        field789 = class212.method1357("Login", 10731);
        field788 = new int[128];
        field790 = field789;
    }
}
