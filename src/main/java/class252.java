import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class252 extends class601 {

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "Lkg;")
    public static class275 field3471 = new class275(2, 4, 4, 0);

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!kw", name = "J", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "Ld;")
    public static class152 field3474;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljm;)V")
    public static final void method1539(class690 arg0) {
        if (class295.field4220 < 65535) {
            class87 var1 = arg0.field9602;
            class573.field7526[class295.field4220] = arg0;
            class20.field342[class295.field4220] = false;
            ++class295.field4220;
            int var2 = arg0.field9613;
            if (arg0.field9605) {
                var2 = 0;
            }
            int var3 = arg0.field9613;
            if (arg0.field9597) {
                var3 = class225.field3201 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method670((byte) -118) - var1.method673(-31) + class307.field4416 >> class140.field2224;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method670((byte) -104) + var1.method673(-62) - class307.field4416 >> class140.field2224;
                if (var7 >= class143.field2290) {
                    var7 = class143.field2290 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field9606[var5++];
                    int var10 = (var1.method665(102) - var1.method673(-58) + class307.field4416 >> class140.field2224) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class735.field10163) {
                        var11 = class735.field10163 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class458.field6263[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class458.field6263[var4][var12][var8] = var13 | (long) class295.field4220;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class458.field6263[var4][var12][var8] = var13 | (long) class295.field4220 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class458.field6263[var4][var12][var8] = var13 | (long) class295.field4220 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class458.field6263[var4][var12][var8] = var13 | (long) class295.field4220 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(BII)V")
    private final void method1540(byte arg0, int arg1, int arg2) {
        ++field3473;
        int var4 = class453.field6186[arg2];
        int var5 = class250.field3446[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class250.field3444 = arg1;
            class604.field7943 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class604.field7943 = arg1;
            class250.field3444 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class250.field3444 = arg2;
            class604.field7943 = class171.field2624 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class250.field3444 = -arg1 + class671.field9149;
            class604.field7943 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class250.field3444 = -arg1 + class671.field9149;
            class604.field7943 = -arg2 + class171.field2624;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class604.field7943 = class171.field2624 - arg1;
            class250.field3444 = -arg2 + class671.field9149;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class250.field3444 = -arg2 + class671.field9149;
            class604.field7943 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class604.field7943 = -arg2 + class171.field2624;
            class250.field3444 = arg1;
        }
        if (arg0 != -66) {
            field3474 = null;
        }
        class604.field7943 &= class445.field6116;
        class250.field3444 &= class112.field1855;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field3469;
        int[] var3 = super.field7902.method382(arg1, true);
        if (arg0 != -40) {
            field3471 = null;
        }
        if (super.field7902.field704) {
            for (int var4 = 0; ~class171.field2624 < ~var4; ++var4) {
                this.method1540((byte) -66, arg1, var4);
                int[] var5 = this.method3266((byte) 64, class250.field3444, 0);
                var3[var4] = var5[class604.field7943];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3467;
        int var5 = 0;
        if (arg1 != 1) {
            field3474 = null;
        }
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class10.method99(class209.field3090, arg1 ^ 82, class261.field3632, arg0 + arg4);
        int var10 = class10.method99(class209.field3090, arg1 ^ 108, class261.field3632, -arg0 + arg4);
        class717.method4012(arg3, arg1 + -84, var10, class690.field9616[arg2], var9);
        while (~var5 > ~var6) {
            var8 += 2;
            var7 += var8;
            if (~var7 < -1) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg2;
                int var12 = arg2 + var6;
                if (var12 >= class380.field5289 && class431.field5944 >= var11) {
                    int var13 = class10.method99(class209.field3090, arg1 ^ 113, class261.field3632, arg4 + var5);
                    int var14 = class10.method99(class209.field3090, 35, class261.field3632, -var5 + arg4);
                    if (var12 <= class431.field5944) {
                        class717.method4012(arg3, arg1 ^ -120, var14, class690.field9616[var12], var13);
                    }
                    if (var11 >= class380.field5289) {
                        class717.method4012(arg3, arg1 + -71, var14, class690.field9616[var11], var13);
                    }
                }
            }
            ++var5;
            int var15 = arg2 - var5;
            int var16 = arg2 - -var5;
            if (class380.field5289 <= var16 && class431.field5944 >= var15) {
                int var17 = class10.method99(class209.field3090, 114, class261.field3632, arg4 + var6);
                int var18 = class10.method99(class209.field3090, 70, class261.field3632, arg4 - var6);
                if (var16 <= class431.field5944) {
                    class717.method4012(arg3, arg1 ^ -76, var18, class690.field9616[var16], var17);
                }
                if (~var15 <= ~class380.field5289) {
                    class717.method4012(arg3, -87, var18, class690.field9616[var15], var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field3468;
        if (arg1 != -61) {
            field3471 = null;
        }
        if (~arg2 == -1) {
            super.field7897 = arg0.method3821((byte) 117) == 1;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IZ)[[I")
    public final int[][] method7(int arg0, boolean arg1) {
        ++field3470;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (!arg1) {
            field3472 = 0;
        }
        if (super.field7890.field9769) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class171.field2624 < ~var7; ++var7) {
                this.method1540((byte) -66, arg0, var7);
                int[][] var8 = this.method3268(class250.field3444, 0, 65535);
                var4[var7] = var8[0][class604.field7943];
                var5[var7] = var8[1][class604.field7943];
                var6[var7] = var8[2][class604.field7943];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "()V")
    public class252() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)V")
    public static void method1542(int arg0) {
        field3471 = null;
        field3474 = null;
        if (arg0 != -15789) {
            method1541(119, -73, 76, 90, 110);
        }
    }
}
