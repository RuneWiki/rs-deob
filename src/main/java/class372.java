import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class372 {

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    private int field5274 = 0;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    private int field5272 = 4;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    private int field5280 = 4;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field5275 = 4;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    private int field5270 = 4;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "[S")
    private short[] field5281 = new short[512];

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field5278 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5276 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
    public static int[] field5286 = new int[2];

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field5287 = 0;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[S")
    private short[] field5273;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 7)
    private final void method2363(int arg0) {
        if (arg0 != -256) {
            method2370((byte) -85);
        }
        field5284++;
        Random var2 = new Random((long) this.field5274);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5281[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class11.method74(var5, 16384, var2);
            short var7 = this.field5281[var6];
            this.field5281[var6] = this.field5281[var5];
            this.field5281[var5] = this.field5281[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Z", line = 52)
    public static final boolean method2364(int arg0) {
        field5268++;
        try {
            if (class439.field6387 == arg0) {
                if (class452.field6566 == null) {
                    class452.field6566 = class448.method2800(class242.field3527, class44.field659, class122.field1920);
                    if (class452.field6566 == null) {
                        return false;
                    }
                }
                if (class44.field660 == null) {
                    class44.field660 = new class367(class7.field98, class310.field4524);
                }
                if (class416.field6028.method1599(class44.field660, class452.field6566, class102.field1582, (byte) -39, 22050)) {
                    class416.field6028.method1592(0);
                    class416.field6028.method1591(arg0 ^ 0x48, class267.field4004);
                    class416.field6028.method1589(class198.field2895, (byte) 106, class452.field6566);
                    class242.field3527 = null;
                    class44.field660 = null;
                    class452.field6566 = null;
                    class439.field6387 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class416.field6028.method1614((byte) -111);
            class44.field660 = null;
            class439.field6387 = 0;
            class452.field6566 = null;
            class242.field3527 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lpf;)V", line = 102)
    public static final void method2365(class447 arg0) {
        for (int var1 = arg0.field6526; var1 <= arg0.field6504; var1++) {
            for (int var2 = arg0.field6513; var2 <= arg0.field6508; var2++) {
                class168 var3 = class443.field6447[arg0.field6509][var1][var2];
                if (var3 != null) {
                    class36 var4 = var3.field2488;
                    class36 var5 = null;
                    while (var4 != null) {
                        if (var4.field511 == arg0) {
                            if (var5 == null) {
                                var3.field2488 = var4.field505;
                            } else {
                                var5.field505 = var4.field505;
                            }
                            var4.method258((byte) -103);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field505;
                    }
                    var3.field2494 = 0;
                    for (class36 var6 = var3.field2488; var6 != null; var6 = var6.field505) {
                        var3.field2494 = (byte) (var3.field2494 | var6.field510);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IIIII)V", line = 716)
    public class372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5272 = arg4;
        this.field5280 = arg3;
        this.field5275 = arg1;
        this.field5274 = arg0;
        this.field5270 = arg2;
        this.method2369((byte) -88);
        this.method2363(-256);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)I", line = 161)
    public static final int method2366(int arg0, int arg1, int arg2, int arg3) {
        field5266++;
        int var4 = 255 - arg0;
        if (arg3 != 0) {
            field5287 = 101;
        }
        int var5 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBII)V", line = 181)
    public final void method2367(int arg0, byte arg1, int arg2, int arg3) {
        field5279++;
        if (arg1 < 36) {
            field5286 = null;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method2105((byte) -117);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field5275; var14++) {
                        int var15 = this.field5273[var14] << 12;
                        int var16 = var8[var11] * var15 >> 12;
                        int var17 = this.field5272 * var15 >> 12;
                        int var18 = this.field5270 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field5280 * var15 >> 12;
                        int var22 = this.field5272 * var16;
                        int var23 = this.field5280 * var20;
                        int var24 = this.field5270 * var19;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var32 < var17) {
                            var34 = var32 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var24 & 0xFFF;
                        int var36;
                        if (var29 < var21) {
                            var36 = var29 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38;
                        if (var26 >= var18) {
                            var38 = 0;
                        } else {
                            var38 = var26 & 0xFF;
                        }
                        int var39 = var31 & 0xFF;
                        short var40 = this.field5281[var34];
                        int var41 = class144.field2244[var35];
                        int var42 = var37 - 4096;
                        int var43 = var35 - 4096;
                        int var44 = class144.field2244[var37];
                        int var45 = var33 - 4096;
                        int var46 = class144.field2244[var33];
                        short var47 = this.field5281[var39];
                        short var48 = this.field5281[var30 + var47];
                        short var49 = this.field5281[var36 + var47];
                        short var50 = this.field5281[var30 + var40];
                        short var51 = this.field5281[var36 + var40];
                        int var52 = class331.method2173(var33, this.field5281[var28 + var48], var37, 128, var35);
                        int var53 = class331.method2173(var33, this.field5281[var38 + var48], var37, 128, var43);
                        int var54 = ((var53 - var52) * var41 >> 12) + var52;
                        int var55 = class331.method2173(var45, this.field5281[var28 + var49], var37, 128, var35);
                        int var56 = class331.method2173(var45, this.field5281[var38 + var49], var37, 128, var43);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var46 >> 12);
                        int var59 = class331.method2173(var33, this.field5281[var28 + var50], var42, 128, var35);
                        int var60 = class331.method2173(var33, this.field5281[var38 + var50], var42, 128, var43);
                        int var61 = ((var60 - var59) * var41 >> 12) + var59;
                        int var62 = class331.method2173(var45, this.field5281[var28 + var51], var42, 128, var35);
                        int var63 = class331.method2173(var45, this.field5281[var38 + var51], var42, 128, var43);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method2104((byte) 109, ((var65 - var58) * var44 >> 12) + var58, var14);
                    }
                    this.method2109(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIB)I", line = 347)
    public static final int method2368(int arg0, int arg1, int arg2, byte arg3) {
        field5283++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else if (arg3 == -78) {
            return 7 - arg2;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 373)
    private final void method2369(byte arg0) {
        this.field5273 = new short[this.field5275];
        field5271++;
        for (int var2 = 0; var2 < this.field5275; var2++) {
            this.field5273[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        int var3 = -74 % ((arg0 + 24) / 45);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 392)
    public static void method2370(byte arg0) {
        field5286 = null;
        if (arg0 == -2) {
            field5276 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIBIILc;)Z", line = 404)
    public static final boolean method2371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, class158 arg10) {
        int var11 = -99 / ((arg7 - 67) / 58);
        field5269++;
        int var12 = arg8;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        class323.field4657[var14][var15] = 99;
        int var17 = arg4 - var15;
        class415.field6012[var14][var15] = 0;
        byte var18 = 0;
        class26.field390[var18] = arg8;
        int var19 = 0;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class253.field3656[var10001] = arg4;
        int[][] var20 = arg10.field2405;
        while (var27 != var19) {
            var13 = class253.field3656[var19];
            var12 = class26.field390[var19];
            var19 = var19 + 1 & 0xFFF;
            int var21 = var13 - arg10.field2411;
            int var22 = var13 - var17;
            int var23 = var12 - var16;
            int var24 = var12 - arg10.field2424;
            if (arg6 == -4) {
                if (arg9 == var12 && arg2 == var13) {
                    class223.field3312 = var13;
                    class218.field3224 = var12;
                    return true;
                }
            } else if (arg6 == -3) {
                if (method2372(arg9, arg2, arg3, 1, -7247, var13, arg1, 1, var12)) {
                    class223.field3312 = var13;
                    class218.field3224 = var12;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg10.method1244(92, var12, arg1, var13, 1, arg3, arg0, 1, arg2, arg9)) {
                    class223.field3312 = var13;
                    class218.field3224 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg10.method1238(var12, (byte) -19, arg9, arg0, arg1, 1, arg3, var13, arg2)) {
                    class223.field3312 = var13;
                    class218.field3224 = var12;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg10.method1242(var12, arg2, var13, 1, (byte) -45, arg5, arg9, arg6)) {
                    class218.field3224 = var12;
                    class223.field3312 = var13;
                    return true;
                }
            } else if (arg10.method1251(arg2, var13, 2, arg9, 1, arg6, var12, arg5)) {
                class223.field3312 = var13;
                class218.field3224 = var12;
                return true;
            }
            int var26 = class415.field6012[var23][var22] + 1;
            if (var23 > 0 && class323.field4657[var23 - 1][var22] == 0 && (var20[var24 - 1][var21] & 0x42240000) == 0) {
                class26.field390[var27] = var12 - 1;
                class253.field3656[var27] = var13;
                var27 = var27 + 1 & 0xFFF;
                class323.field4657[var23 - 1][var22] = 2;
                class415.field6012[var23 - 1][var22] = var26;
            }
            if (var23 < 127 && class323.field4657[var23 + 1][var22] == 0 && (var20[var24 + 1][var21] & 0x60240000) == 0) {
                class26.field390[var27] = var12 + 1;
                class253.field3656[var27] = var13;
                var27 = var27 + 1 & 0xFFF;
                class323.field4657[var23 + 1][var22] = 8;
                class415.field6012[var23 + 1][var22] = var26;
            }
            if (var22 > 0 && class323.field4657[var23][var22 - 1] == 0 && (var20[var24][var21 - 1] & 0x40A40000) == 0) {
                class26.field390[var27] = var12;
                class253.field3656[var27] = var13 - 1;
                class323.field4657[var23][var22 - 1] = 1;
                var27 = var27 + 1 & 0xFFF;
                class415.field6012[var23][var22 - 1] = var26;
            }
            if (var22 < 127 && class323.field4657[var23][var22 + 1] == 0 && (var20[var24][var21 + 1] & 0x48240000) == 0) {
                class26.field390[var27] = var12;
                class253.field3656[var27] = var13 + 1;
                var27 = var27 + 1 & 0xFFF;
                class323.field4657[var23][var22 + 1] = 4;
                class415.field6012[var23][var22 + 1] = var26;
            }
            if (var23 > 0 && var22 > 0 && class323.field4657[var23 - 1][var22 - 1] == 0 && (var20[var24 - 1][var21 - 1] & 0x43A40000) == 0 && (var20[var24 - 1][var21] & 0x42240000) == 0 && (var20[var24][var21 - 1] & 0x40A40000) == 0) {
                class26.field390[var27] = var12 - 1;
                class253.field3656[var27] = var13 - 1;
                var27 = var27 + 1 & 0xFFF;
                class323.field4657[var23 - 1][var22 - 1] = 3;
                class415.field6012[var23 - 1][var22 - 1] = var26;
            }
            if (var23 < 127 && var22 > 0 && class323.field4657[var23 + 1][var22 - 1] == 0 && (var20[var24 + 1][var21 - 1] & 0x60E40000) == 0 && (var20[var24 + 1][var21] & 0x60240000) == 0 && (var20[var24][var21 - 1] & 0x40A40000) == 0) {
                class26.field390[var27] = var12 + 1;
                class253.field3656[var27] = var13 - 1;
                class323.field4657[var23 + 1][var22 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class415.field6012[var23 + 1][var22 - 1] = var26;
            }
            if (var23 > 0 && var22 < 127 && class323.field4657[var23 - 1][var22 + 1] == 0 && (var20[var24 - 1][var21 + 1] & 0x4E240000) == 0 && (var20[var24 - 1][var21] & 0x42240000) == 0 && (var20[var24][var21 + 1] & 0x48240000) == 0) {
                class26.field390[var27] = var12 - 1;
                class253.field3656[var27] = var13 + 1;
                var27 = var27 + 1 & 0xFFF;
                class323.field4657[var23 - 1][var22 + 1] = 6;
                class415.field6012[var23 - 1][var22 + 1] = var26;
            }
            if (var23 < 127 && var22 < 127 && class323.field4657[var23 + 1][var22 + 1] == 0 && (var20[var24 + 1][var21 + 1] & 0x78240000) == 0 && (var20[var24 + 1][var21] & 0x60240000) == 0 && (var20[var24][var21 + 1] & 0x48240000) == 0) {
                class26.field390[var27] = var12 + 1;
                class253.field3656[var27] = var13 + 1;
                var27 = var27 + 1 & 0xFFF;
                class323.field4657[var23 + 1][var22 + 1] = 12;
                class415.field6012[var23 + 1][var22 + 1] = var26;
            }
        }
        class223.field3312 = var13;
        class218.field3224 = var12;
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIII)Z", line = 650)
    public static final boolean method2372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5267++;
        if (arg0 + arg2 <= arg8 || arg0 >= (arg8 + arg7)) {
            return false;
        } else if (arg5 < arg1 + arg6 && arg1 < (arg5 + arg3)) {
            if (arg4 != -7247) {
                field5278 = 21;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V", line = 668)
    public static final void method2373(int arg0, boolean arg1) {
        if (arg0 != 7) {
            method2370((byte) 6);
        }
        field5282++;
        if (class223.field3316 != arg1) {
            class223.field3316 = arg1;
            class123.method1040(-117);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)V")
    public abstract void method2104(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V")
    public abstract void method2105(byte arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public abstract void method2109(boolean arg0);
}
