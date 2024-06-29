import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class124 extends class27 {

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    private int field2304 = 4096;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field2308 = 0;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "Ljava/util/Random;")
    public static Random field2311 = new Random();

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public static int field2315 = (int) (Math.random() * 17.0D) + -8;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "Lkb;")
    public static class93 field2314 = class76.method390("Bitte wenden Sie sich an den Kundendienst)3", 0);

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field2313 = 0;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "Z")
    public static boolean field2317 = false;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "Lkb;")
    private static class93 field2318 = class76.method390("Password: ", 0);

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lkb;")
    private static class93 field2319 = class76.method390("Try again in 60 secs)3)3)3", 0);

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "Lkb;")
    public static class93 field2312 = field2319;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "Lkb;")
    public static class93 field2316 = field2318;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        if (arg1) {
            this.field2304 = -23;
        }
        ++field2309;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int[] var4 = this.method145(0, (byte) 119, arg0 + -1 & class190.field3715);
            int[] var5 = this.method145(0, (byte) 122, arg0);
            int[] var6 = this.method145(0, (byte) 126, arg0 + 1 & class190.field3715);
            for (int var7 = 0; var7 < class159.field3209; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field2304;
                int var9 = var8 >> 12;
                int var10 = (var5[var7 - -1 & class78.field1402] + -var5[var7 - 1 & class78.field1402]) * this.field2304;
                int var11 = var9 * var9 >> 12;
                int var12 = var10 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((var11 + var13 + 4096) / 4096)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILrd;)V")
    public static final void method705(int arg0, class158 arg1) {
        ++field2310;
        if (arg0 != 9209) {
            method707(73);
        }
        if (class153.field3012 != null) {
            try {
                class153.field3012.method76(0L, (byte) 58);
                class153.field3012.method68(24, false, arg1.field3153, arg1.field3162);
            } catch (Exception var2) {
            }
        }
        arg1.field3153 += 24;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg1 == 0) {
            this.field2304 = arg2.method1071(28101);
        }
        ++field2307;
        if (arg0 <= 106) {
            this.field2304 = -85;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(ZI)V")
    public static final void method706(boolean arg0, int arg1) {
        ++field2305;
        class195.field3826 = arg0;
        if (arg1 != 1) {
            method708(101, 43, -125, true);
        }
        if (!class195.field3826) {
            int var2 = class59.field942.method1037(arg1 ^ 16711681);
            int var3 = class59.field942.method1047(255);
            int var4 = class59.field942.method1086(86);
            int var5 = (class157.field3109 - class59.field942.field3153) / 16;
            class170.field3379 = new int[var5][4];
            for (int var6 = 0; var6 < var5; ++var6) {
                for (int var14 = 0; var14 < 4; ++var14) {
                    class170.field3379[var6][var14] = class59.field942.method1076(24277);
                }
            }
            int var7 = class59.field942.method1034(112);
            int var8 = class59.field942.method1047(255);
            class62.field983 = new int[var5];
            class77.field1382 = new int[var5];
            class158.field3145 = new byte[var5][];
            boolean var9 = false;
            class133.field2547 = new byte[var5][];
            if ((~(var3 / 8) == -49 || ~(var3 / 8) == -50) && ~(var2 / 8) == -49) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            class206.field4034 = new int[var5];
            int var10 = 0;
            for (int var11 = (var3 + -6) / 8; ~var11 >= ~((var3 + 6) / 8); ++var11) {
                for (int var12 = (var2 + -6) / 8; var12 <= (var2 + 6) / 8; ++var12) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || ~var12 != -50 && var12 != 149 && ~var12 != -148 && ~var11 != -51 && (~var11 != -50 || var12 != 47)) {
                        class206.field4034[var10] = var13;
                        class62.field983[var10] = class61.field974.method454(236, class203.method1321(new class93[] { class36.field590, class67.method357((byte) -102, var11), class111.field2007, class67.method357((byte) -103, var12) }, class29.method159(arg1, 93)));
                        class77.field1382[var10] = class61.field974.method454(236, class203.method1321(new class93[] { class2.field40, class67.method357((byte) -119, var11), class111.field2007, class67.method357((byte) -87, var12) }, 124));
                        ++var10;
                    }
                }
            }
            class104.method576(var7, var3, var8, var2, var4, 0);
        } else {
            int var15 = class59.field942.method1034(111);
            int var16 = class59.field942.method1068((byte) -115);
            class59.field942.method41(false);
            for (int var17 = 0; ~var17 > -5; ++var17) {
                for (int var35 = 0; var35 < 13; ++var35) {
                    for (int var36 = 0; var36 < 13; ++var36) {
                        int var37 = class59.field942.method42(1, arg1 + -44);
                        if (~var37 == -2) {
                            class59.field950[var17][var35][var36] = class59.field942.method42(26, -77);
                        } else {
                            class59.field950[var17][var35][var36] = -1;
                        }
                    }
                }
            }
            class59.field942.method45((byte) 118);
            int var18 = (-class59.field942.field3153 + class157.field3109) / 16;
            class170.field3379 = new int[var18][4];
            for (int var19 = 0; ~var19 > ~var18; ++var19) {
                for (int var34 = 0; ~var34 > -5; ++var34) {
                    class170.field3379[var19][var34] = class59.field942.method1075(arg1 + -2);
                }
            }
            int var20 = class59.field942.method1037(16711680);
            int var21 = class59.field942.method1071(arg1 ^ 28100);
            int var22 = class59.field942.method1037(16711680);
            class77.field1382 = new int[var18];
            class206.field4034 = new int[var18];
            class133.field2547 = new byte[var18][];
            class62.field983 = new int[var18];
            class158.field3145 = new byte[var18][];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; ++var24) {
                for (int var25 = 0; ~var25 > -14; ++var25) {
                    for (int var26 = 0; var26 < 13; ++var26) {
                        int var27 = class59.field950[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 1023;
                            int var29 = 2047 & var27 >> 3;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; ~var23 < ~var31; ++var31) {
                                if (~class206.field4034[var31] == ~var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class206.field4034[var23] = var30;
                                int var32 = 255 & var30 >> 8;
                                int var33 = 255 & var30;
                                class62.field983[var23] = class61.field974.method454(236, class203.method1321(new class93[] { class36.field590, class67.method357((byte) -106, var32), class111.field2007, class67.method357((byte) -118, var33) }, -57));
                                class77.field1382[var23] = class61.field974.method454(236, class203.method1321(new class93[] { class2.field40, class67.method357((byte) -110, var32), class111.field2007, class67.method357((byte) -126, var33) }, -96));
                                ++var23;
                            }
                        }
                    }
                }
            }
            class104.method576(var15, var22, var21, var20, var16, 0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
    public static void method707(int arg0) {
        field2311 = null;
        field2318 = null;
        field2312 = null;
        field2316 = null;
        field2319 = null;
        field2314 = null;
        int var1 = -122 % ((arg0 - -60) / 51);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIZ)Z")
    public static final boolean method708(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2306;
        int var4 = class175.field3458.method803(class114.field2145, arg2, arg0, arg1);
        int var5 = (arg1 & 536860799) >> 14;
        if (~var4 == 0) {
            return false;
        } else {
            int var6 = 31 & var4;
            int var7 = 3 & var4 >> 6;
            if (~var6 != -11 && ~var6 != -12 && var6 != 22) {
                class6.method36(var6 - -1, true, class106.field1940.field2038[0], 0, (byte) -2, 2, class106.field1940.field2064[0], arg0, 0, 0, var7, arg2);
            } else {
                class81 var8 = class154.method990(var5, arg3);
                int var9;
                int var10;
                if (~var7 != -1 && ~var7 != -3) {
                    var9 = var8.field1487;
                    var10 = var8.field1439;
                } else {
                    var9 = var8.field1439;
                    var10 = var8.field1487;
                }
                int var11 = var8.field1469;
                if (var7 != 0) {
                    var11 = (15 & var11 << var7) - -(var11 >> -var7 + 4);
                }
                class6.method36(0, true, class106.field1940.field2038[0], var9, (byte) -2, 2, class106.field1940.field2064[0], arg0, var11, var10, 0, arg2);
            }
            class25.field387 = 0;
            if (!arg3) {
                return false;
            } else {
                class4.field71 = class57.field928;
                class13.field216 = class88.field1592;
                class207.field4063 = 2;
                return true;
            }
        }
    }
}
