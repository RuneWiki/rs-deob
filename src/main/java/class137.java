import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class137 extends class198 {

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "Z")
    public static boolean field2120 = false;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "[[[B")
    public static byte[][][] field2118;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3139 = arg1.method1420((byte) 0) == 1;
        }
        ++field2128;
        int var4 = 123 % ((60 - arg0) / 61);
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(I)V")
    public static final void method914(int arg0) {
        ++field2122;
        class229 var1 = (class229) class258.field4241.method871(arg0 ^ -36);
        if (arg0 != 0) {
            field2120 = false;
        }
        while (var1 != null) {
            int var2 = var1.field3658;
            if (class235.method1632(115, var2)) {
                boolean var3 = true;
                class254[] var4 = class283.field4741[var2];
                for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4181;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2102;
                    class254 var7 = class80.method534(126, var6);
                    if (var7 != null) {
                        class58.method354(true, var7);
                    }
                }
            }
            var1 = (class229) class258.field4241.method869(-14210);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            field2118 = null;
        }
        ++field2123;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int[] var4 = this.method1367((byte) -79, 0, arg1);
            for (int var5 = 0; ~var5 > ~class42.field590; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILma;)V")
    public static final void method915(int arg0, class202 arg1) {
        ++field2127;
        int var2 = class13.field170 >> 2 << 10;
        int var3 = class13.field168 >> 1;
        byte[][] var4 = new byte[class13.field175][class13.field165];
        while (~arg1.field3272 > ~arg1.field3234.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method1420((byte) 0) == 1) {
                var34 = arg1.method1420((byte) 0);
                var33 = true;
                var35 = arg1.method1420((byte) 0);
            }
            int var36 = arg1.method1420((byte) 0);
            int var37 = arg1.method1420((byte) 0);
            int var38 = var36 * 64 + -class13.field173;
            int var39 = class13.field169 - (var37 * 64 - (class13.field165 - 1));
            if (~var38 <= -1 && ~(var39 + -63) <= -1 && ~(var38 + 63) > ~class13.field175 && class13.field165 > var39) {
                for (int var40 = 0; ~var40 > -65; ++var40) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; ++var42) {
                        if (!var33 || var34 * 8 <= var40 && ~var40 > ~(var34 * 8 + 8) && var42 >= var35 * 8 && var42 < var35 * 8 + 8) {
                            var41[var39 - var42] = arg1.method1457((byte) -39);
                        }
                    }
                }
            } else if (var33) {
                arg1.field3272 += 64;
            } else {
                arg1.field3272 += 4096;
            }
        }
        int var5 = class13.field175;
        int var6 = class13.field165;
        if (arg0 != 0) {
            field2118 = null;
        }
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; ~var12 > ~var5; ++var12) {
            if (~(511 & var12) == -1) {
                class215.method1506((byte) 59, true);
            }
            for (int var13 = 0; ~var6 < ~var13; ++var13) {
                int var27 = var12 + 5;
                int var10002;
                if (~var27 > ~var5) {
                    int var28 = var4[var27][var13] & 255;
                    if (~var28 < -1) {
                        class63 var29 = class183.method1215(var28 + -1, true);
                        var9[var13] += var29.field939;
                        var8[var13] += var29.field943;
                        var7[var13] += var29.field942;
                        var10[var13] += var29.field937;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 + -5;
                if (~var30 <= -1) {
                    int var31 = 255 & var4[var30][var13];
                    if (var31 > 0) {
                        class63 var32 = class183.method1215(var31 + -1, true);
                        var9[var13] -= var32.field939;
                        var8[var13] -= var32.field943;
                        var7[var13] -= var32.field942;
                        var10[var13] -= var32.field937;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (~var12 <= -1) {
                int[][] var14 = class13.field181[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; ~var6 < ~var20; ++var20) {
                    int var21 = var20 + 5;
                    if (~var6 < ~var21) {
                        var16 += var9[var21];
                        var17 += var7[var21];
                        var19 += var11[var21];
                        var15 += var10[var21];
                        var18 += var8[var21];
                    }
                    int var22 = var20 + -5;
                    if (~var22 <= -1) {
                        var17 -= var7[var22];
                        var18 -= var8[var22];
                        var15 -= var10[var22];
                        var19 -= var11[var22];
                        var16 -= var9[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var15 == 0 ? 0 : class47.method296((byte) 127, var16 * 256 / var15, var17 / var19, var18 / var19);
                        if (var4[var12][var20] == 0) {
                            if (var23 != null) {
                                var23[class10.method53(63, var12) + (class10.method53(var20, 63) << 6)] = 0;
                            }
                        } else {
                            int var25 = (var24 & 127) + var3;
                            if (~var25 > -1) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var26 = (var2 + var24 & 64512) + (896 & var24) + var25;
                            var23[class10.method53(63, var12) + class10.method53(4032, var20 << 6)] = class172.field2654[class120.method783(96, class93.method605(arg0, 127), var26)];
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "(I)V")
    public static void method916(int arg0) {
        field2118 = null;
        if (arg0 > -25) {
            field2120 = false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLkk;II)V")
    public static final void method917(byte arg0, class254 arg1, int arg2, int arg3) {
        if (arg1.field4131 != 0) {
            if (arg1.field4131 == 1) {
                arg1.field4200 = (-arg1.field4152 + arg2) / 2 + arg1.field4178;
            } else if (arg1.field4131 == 2) {
                arg1.field4200 = -arg1.field4152 + arg2 + -arg1.field4178;
            } else if (arg1.field4131 != 3) {
                if (~arg1.field4131 == -5) {
                    arg1.field4200 = (arg2 - arg1.field4152) / 2 - -(arg1.field4178 * arg2 >> 14);
                } else {
                    arg1.field4200 = arg2 - arg1.field4152 + -(arg1.field4178 * arg2 >> 14);
                }
            } else {
                arg1.field4200 = arg1.field4178 * arg2 >> 14;
            }
        } else {
            arg1.field4200 = arg1.field4178;
        }
        if (arg0 == -98) {
            ++field2121;
            if (~arg1.field4074 == -1) {
                arg1.field4197 = arg1.field4088;
            } else if (~arg1.field4074 == -2) {
                arg1.field4197 = (-arg1.field4085 + arg3) / 2 + arg1.field4088;
            } else if (arg1.field4074 == 2) {
                arg1.field4197 = arg3 - arg1.field4085 - arg1.field4088;
            } else if (arg1.field4074 == 3) {
                arg1.field4197 = arg1.field4088 * arg3 >> 14;
            } else if (~arg1.field4074 != -5) {
                arg1.field4197 = -arg1.field4085 + arg3 + -(arg1.field4088 * arg3 >> 14);
            } else {
                arg1.field4197 = (-arg1.field4085 + arg3) / 2 - -(arg1.field4088 * arg3 >> 14);
            }
            if (class266.field4381) {
                if (~client.method1085(arg1).field3765 == -1 && ~arg1.field4052 != -1) {
                    return;
                }
                if (arg1.field4200 < 0) {
                    arg1.field4200 = 0;
                } else if (~arg2 > ~(arg1.field4200 + arg1.field4152)) {
                    arg1.field4200 = -arg1.field4152 + arg2;
                }
                if (~arg1.field4197 > -1) {
                    arg1.field4197 = 0;
                    return;
                }
                if (~(arg1.field4197 + arg1.field4085) < ~arg3) {
                    arg1.field4197 = -arg1.field4085 + arg3;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field2125;
        if (arg1 != -2) {
            return null;
        } else {
            int[][] var3 = super.field3150.method642(arg0, 1);
            if (super.field3150.field1498) {
                int[][] var4 = this.method1372(0, arg0, (byte) -61);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class42.field590; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "(I)V")
    public static final void method918(int arg0) {
        ++field2119;
        if (!class284.field4754) {
            class87.field1355 = true;
            class284.field4754 = true;
            if (class74.field1123) {
                class202.field3253 = (float) ((int) class202.field3253 + 191 & -128);
            } else {
                class292.field4822 += (24.0F - class292.field4822) / 2.0F;
            }
            if (arg0 <= 55) {
                field2124 = -25;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class137() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method919(long arg0, int arg1) {
        ++field2126;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                long var3 = arg0;
                int var5 = 0;
                while (~var3 != -1L) {
                    ++var5;
                    var3 /= 37L;
                }
                StringBuffer var6 = new StringBuffer(var5);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    char var9 = class184.field2865[(int) (-(arg0 * 37L) + var7)];
                    if (var9 == '_') {
                        var9 = 160;
                        int var10 = -1 + var6.length();
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(arg1)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }
}
