import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class37 extends class113 implements class265 {

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lth;")
    public class354 field368;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Z")
    private boolean field373;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Ljava/lang/String;")
    public static String field366 = "cyan:";

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "J")
    public static long field376;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "[Lkh;")
    public static class11[] field375;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "[[B")
    public static byte[][] field382;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILen;IBLfs;IZ)V")
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        if (arg3 != -42) {
            field382 = null;
        }
        ++field372;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public final void method207(byte arg0) {
        if (arg0 == 111) {
            ++field378;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZLen;)Z")
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        if (!arg2) {
            return true;
        } else {
            ++field385;
            class393 var5 = this.field368.method2261(super.field1311, false, arg3, false, super.field1304, (byte) -124, 65536);
            if (var5 == null) {
                return false;
            } else {
                class71 var6 = arg3.method1015();
                var6.method123(super.field1304, super.field1310, super.field1311);
                return var5.method724(arg0, arg1, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILen;)Lmj;")
    public final class393 method209(byte arg0, int arg1, class174 arg2) {
        if (arg0 != 58) {
            return null;
        } else {
            ++field364;
            return this.field368.method2261(0, false, arg2, false, 0, (byte) -123, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)I")
    public final int method210(int arg0) {
        ++field383;
        return arg0 != -23890 ? -41 : this.field368.field5178;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Len;I)V")
    public final void method211(class174 arg0, int arg1) {
        ++field365;
        class393 var3 = this.field368.method2261(super.field1311, true, arg0, true, super.field1304, (byte) -115, 131072);
        if (arg1 != 0) {
            this.method206(87, (class174) null, 37, (byte) -90, (class330) null, 91, true);
        }
        if (var3 != null) {
            this.field368.method2258(super.field1298, super.field1316, super.field1299, false, (byte) 126, arg0, super.field1305, var3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLen;)V")
    public final void method212(byte arg0, class174 arg1) {
        ++field377;
        this.field368.method2253(false, arg1);
        if (arg0 >= -29) {
            this.method225(-5);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILen;)Lir;")
    public final class19 method213(int arg0, class174 arg1) {
        ++field379;
        class393 var3 = this.field368.method2261(super.field1311, true, arg1, false, super.field1304, (byte) -120, 1024);
        if (arg0 > -5) {
            this.method213(-93, (class174) null);
        }
        if (var3 == null) {
            return null;
        } else {
            class71 var4 = arg1.method1015();
            var4.method123(super.field1304, super.field1310, super.field1311);
            class19 var5 = null;
            if (this.field373) {
                var5 = class358.method2286(true, 1);
            }
            if (this.field368.field5163 == null) {
                var3.method775(var4, var5 != null ? var5.field197[0] : null, 0);
            } else {
                class271 var6 = this.field368.field5163.method2492();
                arg1.method964(var3, var6, var4, var5 != null ? var5.field197[0] : null, 0);
            }
            this.field368.method2258(super.field1298, super.field1316, super.field1299, true, (byte) 123, arg1, super.field1305, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
    public final int method214(int arg0) {
        ++field380;
        return arg0 >= -95 ? -58 : this.field368.field5174;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        ++field381;
        if (arg0 > -92) {
            this.field373 = false;
        }
        return this.field368.method2259(86);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method216(byte arg0, int arg1, String arg2) {
        ++field361;
        if (arg0 == -66) {
            class348 var3 = class385.method2464(2, 1302, arg1);
            var3.method2216((byte) 23);
            var3.field5087 = arg2;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)Z")
    public final boolean method217(int arg0) {
        ++field369;
        int var2 = -79 % ((-60 - arg0) / 37);
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IJIZLjava/lang/String;ILjava/lang/String;IIZZ)V")
    public static final void method218(int arg0, long arg1, int arg2, boolean arg3, String arg4, int arg5, String arg6, int arg7, int arg8, boolean arg9, boolean arg10) {
        ++field362;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; ++var13) {
            var12[var13] = (int) (9.9999999E7D * Math.random());
        }
        class211 var14 = new class211(128);
        var14.method1396(21375, 10);
        var14.method1380((!arg10 ? 0 : 4) | (!arg3 ? 0 : 1) | (arg9 ? 2 : 0), (byte) -8);
        var14.method1381(1024975824, arg1);
        var14.method1361((byte) -122, var12[0]);
        var14.method1359((byte) 0, arg6);
        var14.method1361((byte) -120, var12[1]);
        var14.method1380(class404.field5884, (byte) -8);
        var14.method1396(21375, arg8);
        var14.method1396(21375, arg5);
        var14.method1361((byte) -120, var12[2]);
        var14.method1380(arg7, (byte) -8);
        var14.method1380(arg2, (byte) -8);
        var14.method1361((byte) -125, var12[3]);
        int var15 = -88 % ((arg0 - -19) / 63);
        var14.method1369(class221.field3027, -49, class301.field4285);
        class211 var16 = new class211(350);
        var16.method1359((byte) 0, arg4);
        int var17 = -(class233.method1488(-19285, arg4) % 8) + 8;
        for (int var18 = 0; var18 < var17; ++var18) {
            var16.method1396(21375, (int) (Math.random() * 255.0D));
        }
        var16.method1375(var12, false);
        class169.field2360.field2888 = 0;
        class169.field2360.method1396(21375, 22);
        class169.field2360.method1380(var14.field2888 + 2 + var16.field2888, (byte) -8);
        class169.field2360.method1380(560, (byte) -8);
        class169.field2360.method1360(0, var14.field2867, var14.field2888, 1);
        class169.field2360.method1360(0, var16.field2867, var16.field2888, 1);
        class392.field5734 = 1;
        class75.field841 = 0;
        class430.field6238 = -3;
        class10.field120 = 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BZIIILen;[Ldl;II)[I")
    public static final int[] method219(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, class174 arg6, class39[] arg7, int arg8, int arg9) {
        ++field371;
        if (!arg2) {
            for (int var10 = 0; var10 < 4; ++var10) {
                class39 var11 = arg7[var10];
                for (int var12 = 0; var12 < 64; ++var12) {
                    for (int var13 = 0; var13 < 64; ++var13) {
                        int var14 = arg9 + var12;
                        int var15 = arg4 + var13;
                        if (var14 >= 0 && ~class279.field3935 < ~var14 && ~var15 <= -1 && var15 < class164.field2287) {
                            var11.method234(var14, -2097153, var15);
                        }
                    }
                }
            }
        }
        class211 var16 = new class211(arg1);
        int var17 = arg5 + arg9;
        int var18 = arg8 - -arg4;
        for (int var19 = 0; arg0 > var19; ++var19) {
            for (int var55 = 0; ~var55 > -65; ++var55) {
                for (int var56 = 0; ~var56 > -65; ++var56) {
                    class256.method1596(2200, arg2, var16, arg9 + var55, var18 + var56, var19, arg4 + var56, 0, 0, var17 + var55, 0, false);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field2888 < var16.field2867.length) {
            int var22 = var16.method1342((byte) -127);
            if (~var22 == -129) {
                class369.field5417[0] = var16.method1355(32136);
                class369.field5417[1] = var16.method1344((byte) -4);
                class369.field5417[2] = var16.method1344((byte) -4);
                class369.field5417[3] = var16.method1344((byte) -4);
                class369.field5417[4] = var16.method1355(arg3 + -2013765499);
                var20 = true;
            } else {
                if (var22 != 129) {
                    --var16.field2888;
                    break;
                }
                if (class228.field3115 == null) {
                    class228.field3115 = new byte[4][][];
                }
                for (int var40 = 0; ~var40 > -5; ++var40) {
                    byte var41 = var16.method1373((byte) 30);
                    if (~var41 == -1 && class228.field3115[var40] != null) {
                        int var42 = arg9;
                        int var43 = arg9 - -64;
                        int var44 = arg4;
                        if (arg9 < 0) {
                            var42 = 0;
                        } else if (class279.field3935 <= arg9) {
                            var42 = class279.field3935;
                        }
                        int var45 = arg4 + 64;
                        if (arg4 >= 0) {
                            if (arg4 >= class164.field2287) {
                                var44 = class164.field2287;
                            }
                        } else {
                            var44 = 0;
                        }
                        if (var43 >= 0) {
                            if (~var43 <= ~class279.field3935) {
                                var43 = class279.field3935;
                            }
                        } else {
                            var43 = 0;
                        }
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (class164.field2287 <= var45) {
                            var45 = class164.field2287;
                        }
                        while (~var43 < ~var42) {
                            while (~var45 < ~var44) {
                                class228.field3115[var40][var42][var44] = 0;
                                ++var44;
                            }
                            ++var42;
                        }
                    } else if (var41 == 1) {
                        if (class228.field3115[var40] == null) {
                            class228.field3115[var40] = new byte[class279.field3935 + 1][class164.field2287 + 1];
                        }
                        for (int var46 = 0; ~var46 > -65; var46 += 4) {
                            for (int var47 = 0; var47 < 64; var47 += 4) {
                                byte var48 = var16.method1373((byte) 30);
                                for (int var49 = arg9 + var46; arg9 + var46 + 4 > var49; ++var49) {
                                    for (int var50 = var47 - -arg4; ~var50 > ~(var47 + 4 + arg4); ++var50) {
                                        if (~var49 <= -1 && ~var49 > ~class279.field3935 && var50 >= 0 && var50 < class164.field2287) {
                                            class228.field3115[var40][var49][var50] = var48;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var41 == -3) {
                        if (class228.field3115[var40] == null) {
                            class228.field3115[var40] = new byte[class279.field3935 + 1][class164.field2287 + 1];
                        }
                        if (~var40 < -1) {
                            int var51 = arg9;
                            int var52 = arg9 + 64;
                            int var53 = arg4;
                            if (~arg9 > -1) {
                                var51 = 0;
                            } else if (arg9 >= class279.field3935) {
                                var51 = class279.field3935;
                            }
                            if (~var52 <= -1) {
                                if (class279.field3935 <= var52) {
                                    var52 = class279.field3935;
                                }
                            } else {
                                var52 = 0;
                            }
                            if (arg4 < 0) {
                                var53 = 0;
                            } else if (~arg4 <= ~class164.field2287) {
                                var53 = class164.field2287;
                            }
                            int var54 = arg4 - -64;
                            if (var54 < 0) {
                                var54 = 0;
                            } else if (class164.field2287 <= var54) {
                                var54 = class164.field2287;
                            }
                            while (~var52 < ~var51) {
                                while (~var53 > ~var54) {
                                    class228.field3115[var40][var51][var53] = class228.field3115[var40 - 1][var51][var53];
                                    ++var53;
                                }
                                ++var51;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (arg3 != 2013797635) {
            field375 = null;
        }
        if (!arg2) {
            class249 var23 = null;
            while (true) {
                while (var16.field2888 < var16.field2867.length) {
                    int var28 = var16.method1342((byte) -126);
                    if (var28 == 0) {
                        var23 = new class249(var16);
                    } else if (~var28 == -2) {
                        int var29 = var16.method1342((byte) -128);
                        if (var29 > 0) {
                            for (int var30 = 0; var29 > var30; ++var30) {
                                class66 var31 = new class66(var16);
                                if (~var31.field738 == -32) {
                                    class373 var32 = class342.method2194(var16.method1355(32136), (byte) -115);
                                    var31.method393(var32.field5452, var32.field5449, var32.field5444, (byte) -124, var32.field5446);
                                }
                                var31.field309 += arg9 << 7;
                                var31.field311 += arg4 << 7;
                                int var33 = var31.field309 >> 7;
                                int var34 = var31.field311 >> 7;
                                if (~var33 <= -1 && var34 >= 0 && ~var33 > ~class279.field3935 && class164.field2287 > var34) {
                                    var31.field304 = class30.field278[var31.field750][var33][var34] - var31.field304;
                                    if (arg6.method994() > 0) {
                                        class299.method1889(var31);
                                    }
                                }
                            }
                        }
                    } else {
                        if (~var28 != -3) {
                            throw new IllegalStateException();
                        }
                        if (var23 == null) {
                            var23 = new class249();
                        }
                        var23.method1566(var16, -123);
                    }
                }
                if (var23 != null) {
                    for (int var24 = 0; var24 < 8; ++var24) {
                        for (int var25 = 0; ~var25 > -9; ++var25) {
                            int var26 = (arg9 >> 3) + var24;
                            int var27 = (arg4 >> 3) + var25;
                            if (var26 >= 0 && ~(class279.field3935 >> 3) < ~var26 && var27 >= 0 && class164.field2287 >> 3 > var27) {
                                class319.method1985(var26, var27, var23, 64);
                            }
                        }
                    }
                }
                break;
            }
        }
        if (!var21 && class228.field3115 != null) {
            for (int var35 = 0; ~var35 > -5; ++var35) {
                if (class228.field3115[var35] != null) {
                    for (int var36 = 0; ~var36 > -17; ++var36) {
                        for (int var37 = 0; ~var37 > -17; ++var37) {
                            int var38 = (arg9 >> 2) + var36;
                            int var39 = (arg4 >> 2) - -var37;
                            if (var38 >= 0 && var38 < 26 && ~var39 <= -1 && ~var39 > -27) {
                                class228.field3115[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class369.field5417;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(I)V")
    public static void method220(int arg0) {
        if (arg0 != -2) {
            field376 = 0L;
        }
        field366 = null;
        field375 = null;
        field382 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method221(boolean arg0, byte arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        if (arg1 != 113) {
            method218(-26, -110L, 76, true, (String) null, -38, (String) null, 127, 54, false, true);
        }
        ++field367;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = !arg0 ? 0 : 32768;
        int var7 = (arg0 ? class308.field4400 : class204.field2795) + var6;
        for (int var8 = var6; ~var8 > ~var7; ++var8) {
            class286 var11 = class419.method2603(var8, true);
            if (var11.field4031 && var11.method1827(arg1 ^ -92).toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -51) {
                    class201.field2773 = -1;
                    class51.field592 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; ~var13 > ~var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class51.field592 = var4;
        class201.field2773 = var5;
        class231.field3127 = 0;
        String[] var9 = new String[class201.field2773];
        for (int var10 = 0; var10 < class201.field2773; ++var10) {
            var9[var10] = class419.method2603(var4[var10], true).method1827(-72);
        }
        class117.method655(class51.field592, var9, -43);
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)I")
    public final int method222(int arg0) {
        ++field370;
        return arg0 != 26841 ? 46 : this.field368.method2260(11);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
    public static final boolean method223(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class134.field1874; ++var3) {
            class306 var4 = class140.field1985[var3];
            if (var4.field4376 == 1) {
                int var5 = var4.field4374 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4377 * var5 >> 8) + var4.field4368;
                    int var7 = (var4.field4372 * var5 >> 8) + var4.field4371;
                    int var8 = (var4.field4365 * var5 >> 8) + var4.field4369;
                    int var9 = (var4.field4382 * var5 >> 8) + var4.field4380;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4376 == 2) {
                int var10 = arg0 - var4.field4374;
                if (var10 > 0) {
                    int var11 = (var4.field4377 * var10 >> 8) + var4.field4368;
                    int var12 = (var4.field4372 * var10 >> 8) + var4.field4371;
                    int var13 = (var4.field4365 * var10 >> 8) + var4.field4369;
                    int var14 = (var4.field4382 * var10 >> 8) + var4.field4380;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4376 == 3) {
                int var15 = var4.field4368 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4379 * var15 >> 8) + var4.field4374;
                    int var17 = (var4.field4388 * var15 >> 8) + var4.field4383;
                    int var18 = (var4.field4365 * var15 >> 8) + var4.field4369;
                    int var19 = (var4.field4382 * var15 >> 8) + var4.field4380;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4376 == 4) {
                int var20 = arg2 - var4.field4368;
                if (var20 > 0) {
                    int var21 = (var4.field4379 * var20 >> 8) + var4.field4374;
                    int var22 = (var4.field4388 * var20 >> 8) + var4.field4383;
                    int var23 = (var4.field4365 * var20 >> 8) + var4.field4369;
                    int var24 = (var4.field4382 * var20 >> 8) + var4.field4380;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4376 == 5) {
                int var25 = arg1 - var4.field4369;
                if (var25 > 0) {
                    int var26 = (var4.field4379 * var25 >> 8) + var4.field4374;
                    int var27 = (var4.field4388 * var25 >> 8) + var4.field4383;
                    int var28 = (var4.field4377 * var25 >> 8) + var4.field4368;
                    int var29 = (var4.field4372 * var25 >> 8) + var4.field4371;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field384;
        int var2 = 58 % ((52 - arg0) / 46);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Len;Lnl;IIIIIIIZIIIII)V")
    public class37(class174 arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field4628 == -2, class56.method325(0, arg2, arg3));
        this.field368 = new class354(arg0, arg1, arg2, arg3, super.field1308, arg5, arg6, arg8, arg9, arg14);
        this.field373 = arg1.field4677 != 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)I")
    public final int method225(int arg0) {
        ++field360;
        if (arg0 < 66) {
            this.method212((byte) -51, (class174) null);
        }
        return this.field368.field5180;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Len;B)V")
    public final void method226(class174 arg0, byte arg1) {
        this.field368.method2257(arg0, -29617);
        ++field374;
        if (arg1 < 88) {
            this.field368 = null;
        }
    }
}
