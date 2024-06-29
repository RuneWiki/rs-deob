import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class163 extends class68 {

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field2263 = 0;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2269 = "Continue";

    @OriginalMember(owner = "client!l", name = "O", descriptor = "Lic;")
    public static class143 field2261 = new class143(16);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "[Z")
    public static boolean[] field2272 = new boolean[8];

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method1080(byte arg0, String arg1) {
        ++field2270;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg0 != 127) {
            field2269 = null;
        }
        while (~var4 > ~var2) {
            char var5 = arg1.charAt(var4);
            if (~var5 < -1 && var5 < 128 || ~var5 <= -161 && ~var5 >= -256) {
                var3[var4] = (byte) var5;
            } else if (var5 != 8364) {
                if (var5 != 8218) {
                    if (~var5 != -403) {
                        if (~var5 != -8223) {
                            if (var5 != 8230) {
                                if (~var5 != -8225) {
                                    if (var5 != 8225) {
                                        if (var5 == 710) {
                                            var3[var4] = -120;
                                        } else if (~var5 == -8241) {
                                            var3[var4] = -119;
                                        } else if (var5 != 352) {
                                            if (~var5 == -8250) {
                                                var3[var4] = -117;
                                            } else if (var5 != 338) {
                                                if (~var5 == -382) {
                                                    var3[var4] = -114;
                                                } else if (var5 == 8216) {
                                                    var3[var4] = -111;
                                                } else if (~var5 != -8218) {
                                                    if (var5 == 8220) {
                                                        var3[var4] = -109;
                                                    } else if (var5 != 8221) {
                                                        if (var5 != 8226) {
                                                            if (~var5 == -8212) {
                                                                var3[var4] = -106;
                                                            } else if (~var5 != -8213) {
                                                                if (var5 == 732) {
                                                                    var3[var4] = -104;
                                                                } else if (var5 == 8482) {
                                                                    var3[var4] = -103;
                                                                } else if (~var5 == -354) {
                                                                    var3[var4] = -102;
                                                                } else if (var5 == 8250) {
                                                                    var3[var4] = -101;
                                                                } else if (var5 != 339) {
                                                                    if (~var5 == -383) {
                                                                        var3[var4] = -98;
                                                                    } else if (var5 != 376) {
                                                                        var3[var4] = 63;
                                                                    } else {
                                                                        var3[var4] = -97;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -100;
                                                                }
                                                            } else {
                                                                var3[var4] = -105;
                                                            }
                                                        } else {
                                                            var3[var4] = -107;
                                                        }
                                                    } else {
                                                        var3[var4] = -108;
                                                    }
                                                } else {
                                                    var3[var4] = -110;
                                                }
                                            } else {
                                                var3[var4] = -116;
                                            }
                                        } else {
                                            var3[var4] = -118;
                                        }
                                    } else {
                                        var3[var4] = -121;
                                    }
                                } else {
                                    var3[var4] = -122;
                                }
                            } else {
                                var3[var4] = -123;
                            }
                        } else {
                            var3[var4] = -124;
                        }
                    } else {
                        var3[var4] = -125;
                    }
                } else {
                    var3[var4] = -126;
                }
            } else {
                var3[var4] = -128;
            }
            ++var4;
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(III)V")
    private final void method1081(int arg0, int arg1, int arg2) {
        ++field2266;
        int var4 = class215.field3231[arg1];
        int var5 = class127.field1794[arg0];
        float var6 = (float) Math.atan2((double) (arg2 + var4), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class109.field1521 = arg0;
            class38.field568 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class109.field1521 = arg1;
            class38.field568 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class38.field568 = -arg0 + class89.field1248;
            class109.field1521 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class109.field1521 = -arg0 + class62.field861;
            class38.field568 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class109.field1521 = -arg0 + class62.field861;
            class38.field568 = -arg1 + class89.field1248;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class109.field1521 = -arg1 + class62.field861;
            class38.field568 = -arg0 + class89.field1248;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class38.field568 = arg0;
            class109.field1521 = -arg1 + class62.field861;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class109.field1521 = arg0;
            class38.field568 = class89.field1248 - arg1;
        }
        class38.field568 &= class173.field2411;
        class109.field1521 &= class17.field184;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(B)V")
    public static final void method1082(byte arg0) {
        class234.method1539(-811);
        ++field2262;
        class284.method1914(-43);
        int var1 = -113 / ((-9 - arg0) / 51);
        class234.method1543((byte) -127);
        class67.method422(5);
        class290.method1952((byte) 41);
        class294.method1971(0);
        class231.method1525(true);
        class145.method976((byte) 110);
        class107.method690(0);
        class269.method1780((byte) -120);
        class205.method1302(false);
        class203.method1286(-110);
        class73.method461((byte) 53);
        class47.method311(63);
        class285.method1919((byte) 94);
        class241.method1616((byte) 66);
        class254.method1695(-7145);
        class136.method922((byte) 23);
        class296.method1981(false);
        class235.method1578(122);
        class239.field3636.method544(false);
        class78.field1090.method544(false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field2268;
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; class89.field1248 > var7; ++var7) {
                this.method1081(arg0, var7, -2048);
                int[][] var8 = this.method429(0, class109.field1521, 2);
                var5[var7] = var8[0][class38.field568];
                var4[var7] = var8[1][class38.field568];
                var6[var7] = var8[2][class38.field568];
            }
        }
        int var9 = 71 % ((arg1 - 63) / 61);
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILql;)V")
    public static final void method1083(int arg0, class224 arg1) {
        ++field2260;
        int var2 = class31.field422 >> 2 << 10;
        int var3 = class154.field2136 >> 1;
        byte[][] var4 = new byte[class138.field1929][class41.field605];
        if (arg0 == -8538) {
            while (~arg1.field3402 > ~arg1.field3336.length) {
                int var33 = 0;
                boolean var34 = false;
                int var35 = 0;
                if (~arg1.method1453((byte) -128) == -2) {
                    var34 = true;
                    var33 = arg1.method1453((byte) -128);
                    var35 = arg1.method1453((byte) -127);
                }
                int var36 = arg1.method1453((byte) -127);
                int var37 = arg1.method1453((byte) -127);
                int var38 = class142.field1972 - var37 * 64 + (class41.field605 - 1);
                int var39 = var36 * 64 - class164.field2273;
                if (var39 >= 0 && ~(var38 - 63) <= -1 && ~(var39 + 63) > ~class138.field1929 && var38 < class41.field605) {
                    for (int var40 = 0; ~var40 > -65; ++var40) {
                        byte[] var41 = var4[var39 + var40];
                        for (int var42 = 0; var42 < 64; ++var42) {
                            if (!var34 || var40 >= var33 * 8 && ~var40 > ~(var33 * 8 + 8) && var42 >= var35 * 8 && ~(var35 * 8 - -8) < ~var42) {
                                var41[-var42 + var38] = arg1.method1437((byte) -104);
                            }
                        }
                    }
                } else if (var34) {
                    arg1.field3402 += 64;
                } else {
                    arg1.field3402 += 4096;
                }
            }
            int var5 = class41.field605;
            int[] var6 = new int[var5];
            int[] var7 = new int[var5];
            int[] var8 = new int[var5];
            int[] var9 = new int[var5];
            int[] var10 = new int[var5];
            int var11 = class138.field1929;
            for (int var12 = -5; ~var11 < ~var12; ++var12) {
                for (int var13 = 0; ~var13 > ~var5; ++var13) {
                    int var27 = var12 + 5;
                    int var10002;
                    if (~var11 < ~var27) {
                        int var28 = var4[var27][var13] & 255;
                        if (~var28 < -1) {
                            class35 var29 = class179.method1171(false, var28 + -1);
                            var6[var13] += var29.field536;
                            var7[var13] += var29.field544;
                            var9[var13] += var29.field534;
                            var10[var13] += var29.field543;
                            var10002 = var8[var13]++;
                        }
                    }
                    int var30 = var12 + -5;
                    if (~var30 <= -1) {
                        int var31 = 255 & var4[var30][var13];
                        if (var31 > 0) {
                            class35 var32 = class179.method1171(false, var31 - 1);
                            var6[var13] -= var32.field536;
                            var7[var13] -= var32.field544;
                            var9[var13] -= var32.field534;
                            var10[var13] -= var32.field543;
                            var10002 = var8[var13]--;
                        }
                    }
                }
                if (~var12 <= -1) {
                    int[][] var14 = class174.field2446[var12 >> 6];
                    int var15 = 0;
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    for (int var20 = -5; ~var5 < ~var20; ++var20) {
                        int var21 = var20 - -5;
                        int var22 = var20 - 5;
                        if (var21 < var5) {
                            var18 += var8[var21];
                            var17 += var7[var21];
                            var19 += var10[var21];
                            var16 += var9[var21];
                            var15 += var6[var21];
                        }
                        if (~var22 <= -1) {
                            var15 -= var6[var22];
                            var19 -= var10[var22];
                            var18 -= var8[var22];
                            var17 -= var7[var22];
                            var16 -= var9[var22];
                        }
                        if (~var20 <= -1 && var18 > 0) {
                            int[] var23 = var14[var20 >> 6];
                            int var24 = ~var19 != -1 ? class1.method1(var15 * 256 / var19, var17 / var18, var16 / var18, (byte) 24) : 0;
                            if (var4[var12][var20] != 0) {
                                if (var23 == null) {
                                    var23 = var14[var20 >> 6] = new int[4096];
                                }
                                int var25 = (127 & var24) + var3;
                                if (~var25 > -1) {
                                    var25 = 0;
                                } else if (~var25 < -128) {
                                    var25 = 127;
                                }
                                int var26 = (64512 & var2 + var24) + (var24 & 896) + var25;
                                var23[class235.method1572(var12, 63) + (class235.method1572(63, var20) << 6)] = class90.field1264[class44.method294(96, -18888, var26)];
                            } else if (var23 != null) {
                                var23[class235.method1572(var12, 63) + (class235.method1572(var20, 63) << 6)] = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class163() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method1084(boolean arg0) {
        field2272 = null;
        field2269 = null;
        field2261 = null;
        if (arg0) {
            method1082((byte) 106);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            for (int var4 = 0; ~class89.field1248 < ~var4; ++var4) {
                this.method1081(arg0, var4, -2048);
                int[] var5 = this.method423(0, (byte) -54, class109.field1521);
                var3[var4] = var5[class38.field568];
            }
        }
        if (arg1 >= -118) {
            this.method91(33, (byte) 92);
        }
        ++field2264;
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1085(int arg0, String arg1) throws ClassNotFoundException {
        ++field2265;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg0 != -8213) {
                field2271 = 113;
            }
            if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            super.field926 = ~arg0.method1453((byte) -127) == -2;
        }
        if (arg2) {
            ++field2267;
        }
    }
}
