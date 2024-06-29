import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class140 extends class276 {

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    private int field2405 = 32768;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "J")
    public static long field2412 = 0L;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Lbl;")
    public static class137 field2409;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "[Lhk;")
    public static class158[] field2415;

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class140() {
        super(3, false);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        ++field2410;
        int[][] var3 = super.field4418.method835((byte) 118, arg0);
        if (arg1 != -1) {
            return null;
        } else {
            if (super.field4418.field2164) {
                int[] var4 = this.method1805(false, 1, arg0);
                int[] var5 = this.method1805(false, 2, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class53.field929; ++var9) {
                    int var10 = var4[var9] * 255 >> 12 & 255;
                    int var11 = var5[var9] * this.field2405 >> 12;
                    int var12 = class42.field620[var10] * var11 >> 12;
                    int var13 = class35.field504 & (var12 >> 12) + var9;
                    int var14 = class156.field2613[var10] * var11 >> 12;
                    int var15 = class125.field2189 & arg0 - -(var14 >> 12);
                    int[][] var16 = this.method1810((byte) -127, var15, 0);
                    var6[var9] = var16[0][var13];
                    var7[var9] = var16[1][var13];
                    var8[var9] = var16[2][var13];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lbd;I)V")
    public static final void method982(class81 arg0, int arg1) {
        ++field2413;
        class37 var2 = arg0.method533(-1);
        arg0.field1421 = var2.field531;
        if (~arg0.field1422 == arg1) {
            arg0.field1419 = 0;
        } else {
            if (~arg0.field1384 != 0 && ~arg0.field1393 == -1) {
                class167 var3 = class105.method714(arg0.field1384, (byte) 97);
                if (arg0.field1448 > 0 && ~var3.field2739 == -1) {
                    ++arg0.field1419;
                    return;
                }
                if (arg0.field1448 <= 0 && var3.field2747 == 0) {
                    ++arg0.field1419;
                    return;
                }
            }
            if (arg0.field1396 != -1 && class266.field4301 >= arg0.field1385) {
                class121 var4 = class189.method1243(arg1 + 65537, arg0.field1396);
                if (var4.field2139 && ~var4.field2138 != 0) {
                    class167 var5 = class105.method714(var4.field2138, (byte) 111);
                    if (~arg0.field1448 < -1 && var5.field2739 == 0) {
                        ++arg0.field1419;
                        return;
                    }
                    if (arg0.field1448 <= 0 && var5.field2747 == 0) {
                        ++arg0.field1419;
                        return;
                    }
                }
            }
            int var6 = arg0.field1397;
            int var7 = arg0.field1458;
            int var8 = arg0.field1464[arg0.field1422 - 1] * 128 - -(64 * arg0.method528(-25));
            int var9 = arg0.field1486[arg0.field1422 + -1] * 128 - -(64 * arg0.method528(-53));
            if (~(-var6 + var8) >= -257 && ~(-var6 + var8) <= 255 && -var7 + var9 <= 256 && -var7 + var9 >= -256) {
                if (~var8 < ~var6) {
                    if (var9 > var7) {
                        arg0.field1389 = 1280;
                    } else if (~var9 <= ~var7) {
                        arg0.field1389 = 1536;
                    } else {
                        arg0.field1389 = 1792;
                    }
                } else if (~var8 > ~var6) {
                    if (~var7 > ~var9) {
                        arg0.field1389 = 768;
                    } else if (var7 <= var9) {
                        arg0.field1389 = 512;
                    } else {
                        arg0.field1389 = 256;
                    }
                } else if (~var9 < ~var7) {
                    arg0.field1389 = 1024;
                } else if (var7 > var9) {
                    arg0.field1389 = 0;
                }
                int var10 = -arg0.field1413 + arg0.field1389 & 2047;
                if (var10 > 1024) {
                    var10 -= 2048;
                }
                int var11 = var2.field557;
                int var12 = 4;
                byte var13 = 1;
                boolean var14 = true;
                if (~var10 <= 255 && var10 <= 256) {
                    var11 = var2.field565;
                } else if (var10 >= 256 && var10 < 768) {
                    var11 = var2.field569;
                } else if (~var10 <= 767 && ~var10 >= 255) {
                    var11 = var2.field555;
                }
                if (var11 == -1) {
                    var11 = var2.field565;
                }
                arg0.field1421 = var11;
                if (arg0 instanceof class141) {
                    var14 = ((class141) arg0).field2421.field3477;
                }
                if (!var14) {
                    if (arg0.field1422 > 1) {
                        var12 = 6;
                    }
                    if (~arg0.field1422 < -3) {
                        var12 = 8;
                    }
                    if (arg0.field1419 > 0 && ~arg0.field1422 < -2) {
                        var12 = 8;
                        --arg0.field1419;
                    }
                } else {
                    if (arg0.field1413 != arg0.field1389 && ~arg0.field1426 == 0 && arg0.field1443 != 0) {
                        var12 = 2;
                    }
                    if (arg0.field1422 > 2) {
                        var12 = 6;
                    }
                    if (~arg0.field1422 < -4) {
                        var12 = 8;
                    }
                    if (~arg0.field1419 < -1 && ~arg0.field1422 < -2) {
                        var12 = 8;
                        --arg0.field1419;
                    }
                }
                if (arg0.field1418[arg0.field1422 + -1] != 2) {
                    if (arg0.field1418[arg0.field1422 + -1] == 0) {
                        var12 >>= 1;
                        var13 = 0;
                    }
                } else {
                    var12 <<= 1;
                    var13 = 2;
                }
                if (~var12 <= -9 && var2.field540 != -1) {
                    if (arg0.field1421 == var2.field557 && var2.field534 != -1) {
                        arg0.field1421 = var2.field534;
                    } else if (~arg0.field1421 == ~var2.field555 && ~var2.field519 != 0) {
                        arg0.field1421 = var2.field519;
                    } else if (arg0.field1421 == var2.field569 && ~var2.field549 != 0) {
                        arg0.field1421 = var2.field549;
                    } else {
                        arg0.field1421 = var2.field540;
                    }
                } else if (~var2.field551 != 0 && var13 == 0) {
                    if (~arg0.field1421 == ~var2.field557 && var2.field525 != -1) {
                        arg0.field1421 = var2.field525;
                    } else if (~arg0.field1421 == ~var2.field555 && var2.field541 != -1) {
                        arg0.field1421 = var2.field541;
                    } else if (arg0.field1421 == var2.field569 && var2.field542 != -1) {
                        arg0.field1421 = var2.field542;
                    } else {
                        arg0.field1421 = var2.field551;
                    }
                }
                if (var2.field554 != -1) {
                    int var15 = var12 << 7;
                    if (arg0.field1422 == 1) {
                        int var16 = arg0.field1401 * arg0.field1401;
                        int var17 = (~arg0.field1397 >= ~var8 ? -arg0.field1397 + var8 : -var8 + arg0.field1397) << 7;
                        int var18 = (~arg0.field1458 >= ~var9 ? var9 - arg0.field1458 : -var9 + arg0.field1458) << 7;
                        int var19 = ~var17 >= ~var18 ? var18 : var17;
                        int var20 = var19 * 2 * var2.field554;
                        if (~var16 >= ~var20) {
                            if (var19 < var16 / 2) {
                                arg0.field1401 -= var2.field554;
                                if (~arg0.field1401 > -1) {
                                    arg0.field1401 = 0;
                                }
                            } else if (~var15 < ~arg0.field1401) {
                                arg0.field1401 += var2.field554;
                                if (~arg0.field1401 < ~var15) {
                                    arg0.field1401 = var15;
                                }
                            }
                        } else {
                            arg0.field1401 /= 2;
                        }
                    } else if (arg0.field1401 >= var15) {
                        if (~arg0.field1401 < -1) {
                            arg0.field1401 -= var2.field554;
                            if (arg0.field1401 < 0) {
                                arg0.field1401 = 0;
                            }
                        }
                    } else {
                        arg0.field1401 += var2.field554;
                        if (~var15 > ~arg0.field1401) {
                            arg0.field1401 = var15;
                        }
                    }
                    var12 = arg0.field1401 >> 7;
                    if (var12 < 1) {
                        var12 = 1;
                    }
                }
                if (~var6 > ~var8) {
                    arg0.field1397 += var12;
                    if (~arg0.field1397 < ~var8) {
                        arg0.field1397 = var8;
                    }
                } else if (var8 < var6) {
                    arg0.field1397 -= var12;
                    if (arg0.field1397 < var8) {
                        arg0.field1397 = var8;
                    }
                }
                if (~var9 >= ~var7) {
                    if (var9 < var7) {
                        arg0.field1458 -= var12;
                        if (arg0.field1458 < var9) {
                            arg0.field1458 = var9;
                        }
                    }
                } else {
                    arg0.field1458 += var12;
                    if (arg0.field1458 > var9) {
                        arg0.field1458 = var9;
                    }
                }
                if (~arg0.field1397 == ~var8 && arg0.field1458 == var9) {
                    --arg0.field1422;
                    if (arg0.field1448 > 0) {
                        --arg0.field1448;
                        return;
                    }
                }
            } else {
                arg0.field1458 = var9;
                arg0.field1397 = var8;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field4408 = arg1.method669((byte) 36) == 1;
            }
        } else {
            this.field2405 = arg1.method677(false) << 4;
        }
        if (arg2 != -1) {
            this.field2405 = 15;
        }
        ++field2414;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLuk;I)V")
    public static final void method983(boolean arg0, class198 arg1, int arg2) {
        ++field2408;
        if (!arg0) {
            Object[] var3 = arg1.field3204;
            int var4 = (Integer) var3[0];
            class170 var5 = class205.method1352(-9056, var4);
            if (var5 != null) {
                class80.field1373 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = -1;
                int[] var9 = var5.field2806;
                int[] var10 = var5.field2800;
                byte var11 = -1;
                try {
                    int var12 = 0;
                    class245.field4021 = new int[var5.field2798];
                    int var13 = 0;
                    class19.field312 = new String[var5.field2799];
                    for (int var14 = 1; ~var3.length < ~var14; ++var14) {
                        if (var3[var14] instanceof Integer) {
                            int var15 = (Integer) var3[var14];
                            if (var15 == -2147483647) {
                                var15 = arg1.field3195;
                            }
                            if (var15 == -2147483646) {
                                var15 = arg1.field3190;
                            }
                            if (~var15 == 2147483644) {
                                var15 = arg1.field3205 != null ? arg1.field3205.field786 : -1;
                            }
                            if (var15 == -2147483644) {
                                var15 = arg1.field3193;
                            }
                            if (var15 == -2147483643) {
                                var15 = arg1.field3205 == null ? -1 : arg1.field3205.field704;
                            }
                            if (var15 == -2147483642) {
                                var15 = arg1.field3191 != null ? arg1.field3191.field786 : -1;
                            }
                            if (~var15 == 2147483640) {
                                var15 = arg1.field3191 != null ? arg1.field3191.field704 : -1;
                            }
                            if (~var15 == 2147483639) {
                                var15 = arg1.field3201;
                            }
                            if (var15 == -2147483639) {
                                var15 = arg1.field3194;
                            }
                            class245.field4021[var12++] = var15;
                        } else if (var3[var14] instanceof String) {
                            String var16 = (String) var3[var14];
                            if (var16.equals("event_opbase")) {
                                var16 = arg1.field3192;
                            }
                            class19.field312[var13++] = var16;
                        }
                    }
                    int var17 = 0;
                    label4062: while (true) {
                        ++var17;
                        if (~var17 < ~arg2) {
                            throw new RuntimeException("slow");
                        }
                        ++var8;
                        int var517 = var9[var8];
                        if (~var517 > -101) {
                            if (~var517 == -1) {
                                class3.field33[var7++] = var10[var8];
                                continue;
                            }
                            if (var517 == 1) {
                                int var18 = var10[var8];
                                class3.field33[var7++] = class125.field2191[var18];
                                continue;
                            }
                            if (var517 == 2) {
                                int var19 = var10[var8];
                                --var7;
                                class10.method67(class3.field33[var7], var19, 60);
                                continue;
                            }
                            if (~var517 == -4) {
                                class134.field2330[var6++] = var5.field2803[var8];
                                continue;
                            }
                            if (var517 == 6) {
                                var8 += var10[var8];
                                continue;
                            }
                            if (var517 == 7) {
                                var7 -= 2;
                                if (~class3.field33[var7 - -1] != ~class3.field33[var7]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (~var517 == -9) {
                                var7 -= 2;
                                if (class3.field33[var7 + 1] == class3.field33[var7]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (var517 == 9) {
                                var7 -= 2;
                                if (~class3.field33[var7] > ~class3.field33[var7 + 1]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (var517 == 10) {
                                var7 -= 2;
                                if (~class3.field33[var7 - -1] > ~class3.field33[var7]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (var517 == 21) {
                                if (~class80.field1373 == -1) {
                                    return;
                                }
                                class152 var20 = class112.field2014[--class80.field1373];
                                class245.field4021 = var20.field2540;
                                var5 = var20.field2548;
                                var9 = var5.field2806;
                                var8 = var20.field2538;
                                var10 = var5.field2800;
                                class19.field312 = var20.field2547;
                                continue;
                            }
                            if (~var517 == -26) {
                                int var21 = var10[var8];
                                class3.field33[var7++] = class142.method994(var21, 123);
                                continue;
                            }
                            if (~var517 == -28) {
                                int var22 = var10[var8];
                                --var7;
                                class57.method353(arg0, class3.field33[var7], var22);
                                continue;
                            }
                            if (~var517 == -32) {
                                var7 -= 2;
                                if (~class3.field33[var7] >= ~class3.field33[var7 - -1]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (var517 == 32) {
                                var7 -= 2;
                                if (class3.field33[var7] >= class3.field33[var7 + 1]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (~var517 == -34) {
                                class3.field33[var7++] = class245.field4021[var10[var8]];
                                continue;
                            }
                            int var10001;
                            if (~var517 == -35) {
                                var10001 = var10[var8];
                                --var7;
                                class245.field4021[var10001] = class3.field33[var7];
                                continue;
                            }
                            if (var517 == 35) {
                                class134.field2330[var6++] = class19.field312[var10[var8]];
                                continue;
                            }
                            if (var517 == 36) {
                                var10001 = var10[var8];
                                --var6;
                                class19.field312[var10001] = class134.field2330[var6];
                                continue;
                            }
                            if (~var517 == -38) {
                                int var23 = var10[var8];
                                var6 -= var23;
                                String var24 = class84.method550(1, var23, var6, class134.field2330);
                                class134.field2330[var6++] = var24;
                                continue;
                            }
                            if (var517 == 38) {
                                --var7;
                                continue;
                            }
                            if (~var517 == -40) {
                                --var6;
                                continue;
                            }
                            if (~var517 == -41) {
                                int var25 = var10[var8];
                                class170 var26 = class205.method1352(-9056, var25);
                                int[] var27 = new int[var26.field2798];
                                String[] var28 = new String[var26.field2799];
                                for (int var29 = 0; ~var26.field2809 < ~var29; ++var29) {
                                    var27[var29] = class3.field33[-var26.field2809 + var29 + var7];
                                }
                                for (int var30 = 0; ~var30 > ~var26.field2801; ++var30) {
                                    var28[var30] = class134.field2330[-var26.field2801 + var6 + var30];
                                }
                                var6 -= var26.field2801;
                                var7 -= var26.field2809;
                                class152 var31 = new class152();
                                var31.field2540 = class245.field4021;
                                var31.field2538 = var8;
                                var31.field2548 = var5;
                                var31.field2547 = class19.field312;
                                if (~class80.field1373 <= ~class112.field2014.length) {
                                    throw new RuntimeException();
                                }
                                var5 = var26;
                                class112.field2014[class80.field1373++] = var31;
                                var10 = var26.field2800;
                                var8 = -1;
                                class19.field312 = var28;
                                class245.field4021 = var27;
                                var9 = var26.field2806;
                                continue;
                            }
                            if (~var517 == -43) {
                                class3.field33[var7++] = class291.field4643[var10[var8]];
                                continue;
                            }
                            if (~var517 == -44) {
                                int var32 = var10[var8];
                                --var7;
                                class291.field4643[var32] = class3.field33[var7];
                                class61.method389(var32, -128);
                                continue;
                            }
                            if (var517 == 44) {
                                int var33 = var10[var8] >> 16;
                                int var34 = var10[var8] & 65535;
                                --var7;
                                int var35 = class3.field33[var7];
                                if (~var35 <= -1 && ~var35 >= -5001) {
                                    class288.field4604[var33] = var35;
                                    byte var36 = -1;
                                    if (var34 == 105) {
                                        var36 = 0;
                                    }
                                    int var37 = 0;
                                    while (true) {
                                        if (~var35 >= ~var37) {
                                            continue label4062;
                                        }
                                        class109.field1974[var33][var37] = var36;
                                        ++var37;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            if (~var517 == -46) {
                                int var38 = var10[var8];
                                --var7;
                                int var39 = class3.field33[var7];
                                if (~var39 <= -1 && ~class288.field4604[var38] < ~var39) {
                                    class3.field33[var7++] = class109.field1974[var38][var39];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (var517 == 46) {
                                var7 -= 2;
                                int var40 = var10[var8];
                                int var41 = class3.field33[var7];
                                if (var41 >= 0 && ~class288.field4604[var40] < ~var41) {
                                    class109.field1974[var40][var41] = class3.field33[var7 - -1];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (var517 == 47) {
                                String var42 = class100.field1720[var10[var8]];
                                if (var42 == null) {
                                    var42 = "null";
                                }
                                class134.field2330[var6++] = var42;
                                continue;
                            }
                            if (var517 == 48) {
                                int var43 = var10[var8];
                                --var6;
                                class100.field1720[var43] = class134.field2330[var6];
                                class84.method549(2, var43);
                                continue;
                            }
                            if (var517 == 51) {
                                class112 var44 = var5.field2804[var10[var8]];
                                --var7;
                                class69 var45 = (class69) var44.method779(66, (long) class3.field33[var7]);
                                if (var45 != null) {
                                    var8 += var45.field1127;
                                }
                                continue;
                            }
                        }
                        boolean var46;
                        if (var10[var8] != 1) {
                            var46 = false;
                        } else {
                            var46 = true;
                        }
                        if (~var517 > -301) {
                            if (~var517 == -101) {
                                var7 -= 3;
                                int var47 = class3.field33[var7];
                                int var48 = class3.field33[var7 + 1];
                                int var49 = class3.field33[var7 + 2];
                                if (var48 == 0) {
                                    throw new RuntimeException();
                                }
                                class46 var50 = class108.method760(-29533, var47);
                                if (var50.field785 == null) {
                                    var50.field785 = new class46[var49 + 1];
                                }
                                if (var49 >= var50.field785.length) {
                                    class46[] var51 = new class46[var49 + 1];
                                    for (int var52 = 0; var50.field785.length > var52; ++var52) {
                                        var51[var52] = var50.field785[var52];
                                    }
                                    var50.field785 = var51;
                                }
                                if (var49 > 0 && var50.field785[var49 + -1] == null) {
                                    throw new RuntimeException("Gap at:" + (var49 + -1));
                                }
                                class46 var53 = new class46();
                                var53.field704 = var49;
                                var53.field812 = var48;
                                var53.field734 = true;
                                var53.field660 = var53.field786 = var50.field786;
                                var50.field785[var49] = var53;
                                if (!var46) {
                                    class192.field3107 = var53;
                                } else {
                                    class67.field1120 = var53;
                                }
                                class79.method516(-373, var50);
                                continue;
                            }
                            if (~var517 == -102) {
                                class46 var54 = !var46 ? class192.field3107 : class67.field1120;
                                if (var54.field704 == -1) {
                                    if (var46) {
                                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                    }
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                class46 var55 = class108.method760(-29533, var54.field786);
                                var55.field785[var54.field704] = null;
                                class79.method516(-373, var55);
                                continue;
                            }
                            if (~var517 == -103) {
                                --var7;
                                class46 var56 = class108.method760(-29533, class3.field33[var7]);
                                var56.field785 = null;
                                class79.method516(-373, var56);
                                continue;
                            }
                            if (~var517 == -201) {
                                var7 -= 2;
                                int var57 = class3.field33[var7 + 1];
                                int var58 = class3.field33[var7];
                                class46 var59 = class285.method1902(var58, var57, 5);
                                if (var59 != null && var57 != -1) {
                                    class3.field33[var7++] = 1;
                                    if (!var46) {
                                        class192.field3107 = var59;
                                    } else {
                                        class67.field1120 = var59;
                                    }
                                    continue;
                                }
                                class3.field33[var7++] = 0;
                                continue;
                            }
                            if (~var517 == -202) {
                                --var7;
                                int var60 = class3.field33[var7];
                                class46 var61 = class108.method760(-29533, var60);
                                if (var61 == null) {
                                    class3.field33[var7++] = 0;
                                } else {
                                    class3.field33[var7++] = 1;
                                    if (var46) {
                                        class67.field1120 = var61;
                                    } else {
                                        class192.field3107 = var61;
                                    }
                                }
                                continue;
                            }
                        } else if (~var517 > -501) {
                            if (var517 == 403) {
                                var7 -= 2;
                                int var505 = class3.field33[var7];
                                int var506 = class3.field33[var7 + 1];
                                for (int var507 = 0; var507 < class272.field4373.length; ++var507) {
                                    if (class272.field4373[var507] == var505) {
                                        class273.field4378.field4592.method155(31791, var507, var506);
                                        continue label4062;
                                    }
                                }
                                int var508 = 0;
                                while (true) {
                                    if (class173.field2853.length <= var508) {
                                        continue label4062;
                                    }
                                    if (~class173.field2853[var508] == ~var505) {
                                        class273.field4378.field4592.method155(31791, var508, var506);
                                        continue label4062;
                                    }
                                    ++var508;
                                }
                            }
                            if (var517 == 404) {
                                var7 -= 2;
                                int var509 = class3.field33[var7];
                                int var510 = class3.field33[var7 + 1];
                                class273.field4378.field4592.method156(var509, var510, 104);
                                continue;
                            }
                            if (var517 == 410) {
                                --var7;
                                boolean var511 = ~class3.field33[var7] != -1;
                                class273.field4378.field4592.method160(-71, var511);
                                continue;
                            }
                        } else if ((var517 < 1000 || ~var517 <= -1101) && (~var517 > -2001 || var517 >= 2100)) {
                            if ((var517 < 1100 || var517 >= 1200) && (~var517 > -2101 || ~var517 <= -2201)) {
                                if (~var517 <= -1201 && var517 < 1300 || var517 >= 2200 && ~var517 > -2301) {
                                    class46 var497;
                                    if (var517 < 2000) {
                                        var497 = !var46 ? class192.field3107 : class67.field1120;
                                    } else {
                                        var517 -= 1000;
                                        --var7;
                                        var497 = class108.method760(-29533, class3.field33[var7]);
                                    }
                                    class79.method516(-373, var497);
                                    if (var517 == 1200 || var517 == 1205 || ~var517 == -1209 || var517 == 1209) {
                                        var7 -= 2;
                                        int var498 = class3.field33[var7 + 1];
                                        int var499 = class3.field33[var7];
                                        if (~var497.field704 == 0) {
                                            class35.method231(11, var497.field786);
                                            class58.method358(var497.field786, 0);
                                            class205.method1359(arg0, var497.field786);
                                        }
                                        if (var499 == -1) {
                                            var497.field767 = -1;
                                            var497.field748 = 1;
                                            var497.field653 = -1;
                                            continue;
                                        }
                                        var497.field767 = var499;
                                        var497.field685 = var498;
                                        if (~var517 != -1209 && ~var517 != -1210) {
                                            var497.field749 = false;
                                        } else {
                                            var497.field749 = true;
                                        }
                                        class199 var500 = class203.method1346(-1, var499);
                                        if (~var517 == -1206) {
                                            var497.field776 = false;
                                        } else {
                                            var497.field776 = true;
                                        }
                                        var497.field788 = var500.field3210;
                                        var497.field803 = var500.field3235;
                                        var497.field816 = var500.field3262;
                                        var497.field741 = var500.field3241;
                                        var497.field746 = var500.field3267;
                                        if (~var497.field677 >= -1) {
                                            if (var497.field688 > 0) {
                                                var497.field746 = var497.field746 * 32 / var497.field688;
                                            }
                                        } else {
                                            var497.field746 = var497.field746 * 32 / var497.field677;
                                        }
                                        var497.field819 = var500.field3253;
                                        continue;
                                    }
                                    if (~var517 == -1202) {
                                        var497.field748 = 2;
                                        --var7;
                                        var497.field653 = class3.field33[var7];
                                        if (var497.field704 == -1) {
                                            class14.method86(var497.field786, 14130);
                                        }
                                        continue;
                                    }
                                    if (~var517 == -1203) {
                                        var497.field748 = 3;
                                        var497.field653 = class273.field4378.field4592.method153(89);
                                        if (var497.field704 == -1) {
                                            class14.method86(var497.field786, 14130);
                                        }
                                        continue;
                                    }
                                    if (var517 == 1203) {
                                        var497.field748 = 6;
                                        --var7;
                                        var497.field653 = class3.field33[var7];
                                        if (~var497.field704 == 0) {
                                            class14.method86(var497.field786, 14130);
                                        }
                                        continue;
                                    }
                                    if (~var517 == -1205) {
                                        var497.field748 = 5;
                                        --var7;
                                        var497.field653 = class3.field33[var7];
                                        if (var497.field704 == -1) {
                                            class14.method86(var497.field786, 14130);
                                        }
                                        continue;
                                    }
                                    if (var517 == 1206) {
                                        var7 -= 4;
                                        var497.field730 = class3.field33[var7];
                                        var497.field720 = class3.field33[var7 + 1];
                                        var497.field804 = class3.field33[var7 + 2];
                                        var497.field721 = class3.field33[var7 - -3];
                                        class79.method516(-373, var497);
                                        continue;
                                    }
                                    if (~var517 == -1208) {
                                        var7 -= 2;
                                        var497.field641 = class3.field33[var7];
                                        var497.field756 = class3.field33[var7 + 1];
                                        class79.method516(-373, var497);
                                        continue;
                                    }
                                } else if ((var517 < 1300 || var517 >= 1400) && (var517 < 2300 || var517 >= 2400)) {
                                    if (~var517 <= -1401 && ~var517 > -1501 || var517 >= 2400 && var517 < 2500) {
                                        class46 var484;
                                        if (var517 >= 2000) {
                                            --var7;
                                            var484 = class108.method760(-29533, class3.field33[var7]);
                                            var517 -= 1000;
                                        } else {
                                            var484 = var46 ? class67.field1120 : class192.field3107;
                                        }
                                        --var6;
                                        String var485 = class134.field2330[var6];
                                        int[] var486 = null;
                                        if (var485.length() > 0 && var485.charAt(-1 + var485.length()) == 'Y') {
                                            --var7;
                                            int var487 = class3.field33[var7];
                                            if (var487 > 0) {
                                                var486 = new int[var487];
                                                while (var487-- > 0) {
                                                    --var7;
                                                    var486[var487] = class3.field33[var7];
                                                }
                                            }
                                            var485 = var485.substring(0, -1 + var485.length());
                                        }
                                        Object[] var488 = new Object[var485.length() - -1];
                                        for (int var489 = var488.length + -1; var489 >= 1; --var489) {
                                            if (var485.charAt(var489 + -1) == 's') {
                                                --var6;
                                                var488[var489] = class134.field2330[var6];
                                            } else {
                                                --var7;
                                                var488[var489] = new Integer(class3.field33[var7]);
                                            }
                                        }
                                        --var7;
                                        int var490 = class3.field33[var7];
                                        if (~var490 != 0) {
                                            var488[0] = new Integer(var490);
                                        } else {
                                            var488 = null;
                                        }
                                        var484.field697 = true;
                                        if (var517 == 1400) {
                                            var484.field684 = var488;
                                        } else if (var517 != 1401) {
                                            if (var517 != 1402) {
                                                if (var517 == 1403) {
                                                    var484.field716 = var488;
                                                } else if (~var517 == -1405) {
                                                    var484.field792 = var488;
                                                } else if (~var517 == -1406) {
                                                    var484.field724 = var488;
                                                } else if (~var517 != -1407) {
                                                    if (var517 != 1407) {
                                                        if (var517 == 1408) {
                                                            var484.field735 = var488;
                                                        } else if (~var517 == -1410) {
                                                            var484.field771 = var488;
                                                        } else if (~var517 == -1411) {
                                                            var484.field655 = var488;
                                                        } else if (~var517 != -1412) {
                                                            if (var517 != 1412) {
                                                                if (~var517 == -1415) {
                                                                    var484.field738 = var486;
                                                                    var484.field800 = var488;
                                                                } else if (var517 == 1415) {
                                                                    var484.field686 = var488;
                                                                    var484.field772 = var486;
                                                                } else if (~var517 != -1417) {
                                                                    if (~var517 == -1418) {
                                                                        var484.field710 = var488;
                                                                    } else if (~var517 == -1419) {
                                                                        var484.field664 = var488;
                                                                    } else if (var517 != 1419) {
                                                                        if (var517 != 1420) {
                                                                            if (var517 != 1421) {
                                                                                if (var517 == 1422) {
                                                                                    var484.field646 = var488;
                                                                                } else if (~var517 != -1424) {
                                                                                    if (~var517 != -1425) {
                                                                                        if (var517 == 1425) {
                                                                                            var484.field798 = var488;
                                                                                        } else if (var517 != 1426) {
                                                                                            if (var517 != 1427) {
                                                                                                if (var517 == 1428) {
                                                                                                    var484.field754 = var488;
                                                                                                    var484.field751 = var486;
                                                                                                } else if (~var517 == -1430) {
                                                                                                    var484.field784 = var488;
                                                                                                    var484.field764 = var486;
                                                                                                }
                                                                                            } else {
                                                                                                var484.field747 = var488;
                                                                                            }
                                                                                        } else {
                                                                                            var484.field814 = var488;
                                                                                        }
                                                                                    } else {
                                                                                        var484.field705 = var488;
                                                                                    }
                                                                                } else {
                                                                                    var484.field766 = var488;
                                                                                }
                                                                            } else {
                                                                                var484.field700 = var488;
                                                                            }
                                                                        } else {
                                                                            var484.field657 = var488;
                                                                        }
                                                                    } else {
                                                                        var484.field658 = var488;
                                                                    }
                                                                } else {
                                                                    var484.field691 = var488;
                                                                }
                                                            } else {
                                                                var484.field669 = var488;
                                                            }
                                                        } else {
                                                            var484.field773 = var488;
                                                        }
                                                    } else {
                                                        var484.field682 = var488;
                                                        var484.field801 = var486;
                                                    }
                                                } else {
                                                    var484.field731 = var488;
                                                }
                                            } else {
                                                var484.field676 = var488;
                                            }
                                        } else {
                                            var484.field757 = var488;
                                        }
                                        continue;
                                    }
                                    if (~var517 <= -1601) {
                                        if (~var517 > -1701) {
                                            class46 var68 = var46 ? class67.field1120 : class192.field3107;
                                            if (~var517 == -1601) {
                                                class3.field33[var7++] = var68.field733;
                                                continue;
                                            }
                                            if (var517 == 1601) {
                                                class3.field33[var7++] = var68.field644;
                                                continue;
                                            }
                                            if (var517 == 1602) {
                                                class134.field2330[var6++] = var68.field759;
                                                continue;
                                            }
                                            if (~var517 == -1604) {
                                                class3.field33[var7++] = var68.field665;
                                                continue;
                                            }
                                            if (var517 == 1604) {
                                                class3.field33[var7++] = var68.field666;
                                                continue;
                                            }
                                            if (var517 == 1605) {
                                                class3.field33[var7++] = var68.field746;
                                                continue;
                                            }
                                            if (~var517 == -1607) {
                                                class3.field33[var7++] = var68.field741;
                                                continue;
                                            }
                                            if (~var517 == -1608) {
                                                class3.field33[var7++] = var68.field803;
                                                continue;
                                            }
                                            if (var517 == 1608) {
                                                class3.field33[var7++] = var68.field816;
                                                continue;
                                            }
                                            if (var517 == 1609) {
                                                class3.field33[var7++] = var68.field678;
                                                continue;
                                            }
                                            if (var517 == 1610) {
                                                class3.field33[var7++] = var68.field819;
                                                continue;
                                            }
                                            if (~var517 == -1612) {
                                                class3.field33[var7++] = var68.field788;
                                                continue;
                                            }
                                            if (var517 == 1612) {
                                                class3.field33[var7++] = var68.field672;
                                                continue;
                                            }
                                        } else if (var517 < 1800) {
                                            class46 var69 = var46 ? class67.field1120 : class192.field3107;
                                            if (var517 == 1700) {
                                                class3.field33[var7++] = var69.field767;
                                                continue;
                                            }
                                            if (var517 == 1701) {
                                                if (~var69.field767 == 0) {
                                                    class3.field33[var7++] = 0;
                                                } else {
                                                    class3.field33[var7++] = var69.field685;
                                                }
                                                continue;
                                            }
                                            if (~var517 == -1703) {
                                                class3.field33[var7++] = var69.field704;
                                                continue;
                                            }
                                        } else if (var517 < 1900) {
                                            class46 var70 = !var46 ? class192.field3107 : class67.field1120;
                                            if (~var517 == -1801) {
                                                class3.field33[var7++] = client.method1922(var70).method1257(-110);
                                                continue;
                                            }
                                            if (~var517 == -1802) {
                                                --var7;
                                                int var71 = class3.field33[var7];
                                                int var518 = var71 - 1;
                                                if (var70.field725 != null && ~var518 > ~var70.field725.length && var70.field725[var518] != null) {
                                                    class134.field2330[var6++] = var70.field725[var518];
                                                    continue;
                                                }
                                                class134.field2330[var6++] = "";
                                                continue;
                                            }
                                            if (~var517 == -1803) {
                                                if (var70.field699 != null) {
                                                    class134.field2330[var6++] = var70.field699;
                                                } else {
                                                    class134.field2330[var6++] = "";
                                                }
                                                continue;
                                            }
                                        } else if (var517 >= 2600) {
                                            if (~var517 > -2701) {
                                                --var7;
                                                class46 var72 = class108.method760(-29533, class3.field33[var7]);
                                                if (~var517 == -2601) {
                                                    class3.field33[var7++] = var72.field733;
                                                    continue;
                                                }
                                                if (var517 == 2601) {
                                                    class3.field33[var7++] = var72.field644;
                                                    continue;
                                                }
                                                if (~var517 == -2603) {
                                                    class134.field2330[var6++] = var72.field759;
                                                    continue;
                                                }
                                                if (~var517 == -2604) {
                                                    class3.field33[var7++] = var72.field665;
                                                    continue;
                                                }
                                                if (~var517 == -2605) {
                                                    class3.field33[var7++] = var72.field666;
                                                    continue;
                                                }
                                                if (~var517 == -2606) {
                                                    class3.field33[var7++] = var72.field746;
                                                    continue;
                                                }
                                                if (~var517 == -2607) {
                                                    class3.field33[var7++] = var72.field741;
                                                    continue;
                                                }
                                                if (~var517 == -2608) {
                                                    class3.field33[var7++] = var72.field803;
                                                    continue;
                                                }
                                                if (var517 == 2608) {
                                                    class3.field33[var7++] = var72.field816;
                                                    continue;
                                                }
                                                if (var517 == 2609) {
                                                    class3.field33[var7++] = var72.field678;
                                                    continue;
                                                }
                                                if (var517 == 2610) {
                                                    class3.field33[var7++] = var72.field819;
                                                    continue;
                                                }
                                                if (var517 == 2611) {
                                                    class3.field33[var7++] = var72.field788;
                                                    continue;
                                                }
                                                if (~var517 == -2613) {
                                                    class3.field33[var7++] = var72.field672;
                                                    continue;
                                                }
                                            } else if (var517 < 2800) {
                                                if (var517 == 2700) {
                                                    --var7;
                                                    class46 var73 = class108.method760(-29533, class3.field33[var7]);
                                                    class3.field33[var7++] = var73.field767;
                                                    continue;
                                                }
                                                if (~var517 == -2702) {
                                                    --var7;
                                                    class46 var74 = class108.method760(-29533, class3.field33[var7]);
                                                    if (~var74.field767 != 0) {
                                                        class3.field33[var7++] = var74.field685;
                                                    } else {
                                                        class3.field33[var7++] = 0;
                                                    }
                                                    continue;
                                                }
                                                if (var517 == 2702) {
                                                    --var7;
                                                    int var75 = class3.field33[var7];
                                                    class194 var76 = (class194) class41.field607.method779(100, (long) var75);
                                                    if (var76 == null) {
                                                        class3.field33[var7++] = 0;
                                                    } else {
                                                        class3.field33[var7++] = 1;
                                                    }
                                                    continue;
                                                }
                                                if (var517 == 2703) {
                                                    --var7;
                                                    class46 var77 = class108.method760(-29533, class3.field33[var7]);
                                                    if (var77.field785 == null) {
                                                        class3.field33[var7++] = 0;
                                                        continue;
                                                    }
                                                    int var78 = var77.field785.length;
                                                    for (int var79 = 0; var79 < var77.field785.length; ++var79) {
                                                        if (var77.field785[var79] == null) {
                                                            var78 = var79;
                                                            break;
                                                        }
                                                    }
                                                    class3.field33[var7++] = var78;
                                                    continue;
                                                }
                                                if (~var517 == -2705 || var517 == 2705) {
                                                    var7 -= 2;
                                                    int var80 = class3.field33[var7];
                                                    int var81 = class3.field33[var7 + 1];
                                                    class194 var82 = (class194) class41.field607.method779(-100, (long) var80);
                                                    if (var82 != null && var82.field3128 == var81) {
                                                        class3.field33[var7++] = 1;
                                                        continue;
                                                    }
                                                    class3.field33[var7++] = 0;
                                                    continue;
                                                }
                                            } else if (var517 < 2900) {
                                                --var7;
                                                class46 var83 = class108.method760(-29533, class3.field33[var7]);
                                                if (var517 == 2800) {
                                                    class3.field33[var7++] = client.method1922(var83).method1257(68);
                                                    continue;
                                                }
                                                if (var517 == 2801) {
                                                    --var7;
                                                    int var84 = class3.field33[var7];
                                                    int var519 = var84 - 1;
                                                    if (var83.field725 != null && var519 < var83.field725.length && var83.field725[var519] != null) {
                                                        class134.field2330[var6++] = var83.field725[var519];
                                                        continue;
                                                    }
                                                    class134.field2330[var6++] = "";
                                                    continue;
                                                }
                                                if (var517 == 2802) {
                                                    if (var83.field699 == null) {
                                                        class134.field2330[var6++] = "";
                                                    } else {
                                                        class134.field2330[var6++] = var83.field699;
                                                    }
                                                    continue;
                                                }
                                            } else if (var517 < 3200) {
                                                if (~var517 == -3101) {
                                                    --var6;
                                                    String var85 = class134.field2330[var6];
                                                    class97.method612(var85, -1, 0, "");
                                                    continue;
                                                }
                                                if (var517 == 3101) {
                                                    var7 -= 2;
                                                    class26.method176(0, class273.field4378, class3.field33[var7], class3.field33[var7 + 1]);
                                                    continue;
                                                }
                                                if (~var517 == -3104) {
                                                    class291.method1969(0);
                                                    continue;
                                                }
                                                if (~var517 == -3105) {
                                                    ++class87.field1551;
                                                    --var6;
                                                    String var86 = class134.field2330[var6];
                                                    int var87 = 0;
                                                    if (class88.method574(var86, 10)) {
                                                        var87 = class173.method1155(var86, -3634);
                                                    }
                                                    class168.field2778.method199(42, 119);
                                                    class168.field2778.method698(-94, var87);
                                                    continue;
                                                }
                                                if (~var517 == -3106) {
                                                    ++class78.field1334;
                                                    --var6;
                                                    String var88 = class134.field2330[var6];
                                                    class168.field2778.method199(151, 119);
                                                    class168.field2778.method640(21691, class103.method702(!arg0, var88));
                                                    continue;
                                                }
                                                if (var517 == 3106) {
                                                    ++class9.field104;
                                                    --var6;
                                                    String var89 = class134.field2330[var6];
                                                    class168.field2778.method199(109, -109);
                                                    class168.field2778.method682(1 + var89.length(), 22555);
                                                    class168.field2778.method645(var89, (byte) 93);
                                                    continue;
                                                }
                                                if (var517 == 3107) {
                                                    --var7;
                                                    int var90 = class3.field33[var7];
                                                    --var6;
                                                    String var91 = class134.field2330[var6];
                                                    class78.method485(var91, var90, 6952);
                                                    continue;
                                                }
                                                if (~var517 == -3109) {
                                                    var7 -= 3;
                                                    int var92 = class3.field33[var7 + 1];
                                                    int var93 = class3.field33[var7 + 2];
                                                    int var94 = class3.field33[var7];
                                                    class46 var95 = class108.method760(-29533, var93);
                                                    class42.method274(var95, var94, 0, var92);
                                                    continue;
                                                }
                                                if (var517 == 3109) {
                                                    var7 -= 2;
                                                    int var96 = class3.field33[var7];
                                                    class46 var97 = var46 ? class67.field1120 : class192.field3107;
                                                    int var98 = class3.field33[var7 - -1];
                                                    class42.method274(var97, var96, 0, var98);
                                                    continue;
                                                }
                                                if (~var517 == -3111) {
                                                    ++class266.field4303;
                                                    --var7;
                                                    int var99 = class3.field33[var7];
                                                    class168.field2778.method199(12, 14);
                                                    class168.field2778.method639(var99, 15267);
                                                    continue;
                                                }
                                            } else if (~var517 > -3301) {
                                                if (~var517 == -3201) {
                                                    var7 -= 3;
                                                    class31.method208(class3.field33[var7], class3.field33[var7 + 1], class3.field33[var7 + 2], 255, -122);
                                                    continue;
                                                }
                                                if (~var517 == -3202) {
                                                    --var7;
                                                    class111.method769(255, (byte) 1, class3.field33[var7]);
                                                    continue;
                                                }
                                                if (var517 == 3202) {
                                                    var7 -= 2;
                                                    class195.method1284(255, (byte) 119, class3.field33[var7], class3.field33[var7 - -1]);
                                                    continue;
                                                }
                                            } else if (~var517 > -3401) {
                                                if (var517 == 3300) {
                                                    class3.field33[var7++] = class266.field4301;
                                                    continue;
                                                }
                                                if (~var517 == -3302) {
                                                    var7 -= 2;
                                                    int var100 = class3.field33[var7];
                                                    int var101 = class3.field33[var7 + 1];
                                                    class3.field33[var7++] = class81.method522(var100, 0, var101);
                                                    continue;
                                                }
                                                if (var517 == 3302) {
                                                    var7 -= 2;
                                                    int var102 = class3.field33[var7 + 1];
                                                    int var103 = class3.field33[var7];
                                                    class3.field33[var7++] = class23.method152(-90, var102, var103);
                                                    continue;
                                                }
                                                if (~var517 == -3304) {
                                                    var7 -= 2;
                                                    int var104 = class3.field33[var7];
                                                    int var105 = class3.field33[var7 + 1];
                                                    class3.field33[var7++] = class103.method705(var104, -109, var105);
                                                    continue;
                                                }
                                                if (var517 == 3304) {
                                                    --var7;
                                                    int var106 = class3.field33[var7];
                                                    class3.field33[var7++] = class17.method93(var106, 122).field2628;
                                                    continue;
                                                }
                                                if (var517 == 3305) {
                                                    --var7;
                                                    int var107 = class3.field33[var7];
                                                    class3.field33[var7++] = class104.field1831[var107];
                                                    continue;
                                                }
                                                if (var517 == 3306) {
                                                    --var7;
                                                    int var108 = class3.field33[var7];
                                                    class3.field33[var7++] = class95.field1645[var108];
                                                    continue;
                                                }
                                                if (var517 == 3307) {
                                                    --var7;
                                                    int var109 = class3.field33[var7];
                                                    class3.field33[var7++] = class129.field2263[var109];
                                                    continue;
                                                }
                                                if (var517 == 3308) {
                                                    int var110 = class176.field2886;
                                                    int var111 = (class273.field4378.field1397 >> 7) + class126.field2206;
                                                    int var112 = (class273.field4378.field1458 >> 7) + class255.field4162;
                                                    class3.field33[var7++] = (var110 << 28) + (var111 << 14) + var112;
                                                    continue;
                                                }
                                                if (var517 == 3309) {
                                                    --var7;
                                                    int var113 = class3.field33[var7];
                                                    class3.field33[var7++] = class113.method791(var113 >> 14, 16383);
                                                    continue;
                                                }
                                                if (~var517 == -3311) {
                                                    --var7;
                                                    int var114 = class3.field33[var7];
                                                    class3.field33[var7++] = var114 >> 28;
                                                    continue;
                                                }
                                                if (~var517 == -3312) {
                                                    --var7;
                                                    int var115 = class3.field33[var7];
                                                    class3.field33[var7++] = class113.method791(var115, 16383);
                                                    continue;
                                                }
                                                if (var517 == 3312) {
                                                    class3.field33[var7++] = !class158.field2637 ? 0 : 1;
                                                    continue;
                                                }
                                                if (var517 == 3313) {
                                                    var7 -= 2;
                                                    int var116 = class3.field33[var7] + 32768;
                                                    int var117 = class3.field33[var7 + 1];
                                                    class3.field33[var7++] = class81.method522(var116, 0, var117);
                                                    continue;
                                                }
                                                if (var517 == 3314) {
                                                    var7 -= 2;
                                                    int var118 = class3.field33[var7 + 1];
                                                    int var119 = class3.field33[var7] - -32768;
                                                    class3.field33[var7++] = class23.method152(-127, var118, var119);
                                                    continue;
                                                }
                                                if (~var517 == -3316) {
                                                    var7 -= 2;
                                                    int var120 = class3.field33[var7 + 1];
                                                    int var121 = class3.field33[var7] + 32768;
                                                    class3.field33[var7++] = class103.method705(var121, -112, var120);
                                                    continue;
                                                }
                                                if (var517 == 3316) {
                                                    if (~class204.field3343 > -3) {
                                                        class3.field33[var7++] = 0;
                                                    } else {
                                                        class3.field33[var7++] = class204.field3343;
                                                    }
                                                    continue;
                                                }
                                                if (var517 == 3317) {
                                                    class3.field33[var7++] = class104.field1822;
                                                    continue;
                                                }
                                                if (~var517 == -3319) {
                                                    class3.field33[var7++] = class146.field2489;
                                                    continue;
                                                }
                                                if (~var517 == -3322) {
                                                    class3.field33[var7++] = class129.field2262;
                                                    continue;
                                                }
                                                if (var517 == 3322) {
                                                    class3.field33[var7++] = class210.field3548;
                                                    continue;
                                                }
                                                if (~var517 == -3324) {
                                                    if (class269.field4338 >= 5 && ~class269.field4338 >= -10) {
                                                        class3.field33[var7++] = 1;
                                                        continue;
                                                    }
                                                    class3.field33[var7++] = 0;
                                                    continue;
                                                }
                                                if (~var517 == -3325) {
                                                    if (class269.field4338 >= 5 && class269.field4338 <= 9) {
                                                        class3.field33[var7++] = class269.field4338;
                                                        continue;
                                                    }
                                                    class3.field33[var7++] = 0;
                                                    continue;
                                                }
                                                if (~var517 == -3326) {
                                                    class3.field33[var7++] = class193.field3123 ? 1 : 0;
                                                    continue;
                                                }
                                                if (~var517 == -3327) {
                                                    class3.field33[var7++] = class273.field4378.field4598;
                                                    continue;
                                                }
                                                if (var517 == 3327) {
                                                    class3.field33[var7++] = !class273.field4378.field4592.field352 ? 0 : 1;
                                                    continue;
                                                }
                                                if (~var517 == -3329) {
                                                    class3.field33[var7++] = class66.field1108 && !class125.field2196 ? 1 : 0;
                                                    continue;
                                                }
                                                if (~var517 == -3330) {
                                                    class3.field33[var7++] = class124.field2186 ? 1 : 0;
                                                    continue;
                                                }
                                                if (var517 == 3330) {
                                                    --var7;
                                                    int var122 = class3.field33[var7];
                                                    class3.field33[var7++] = class192.method1255(var122, true);
                                                    continue;
                                                }
                                                if (~var517 == -3332) {
                                                    var7 -= 2;
                                                    int var123 = class3.field33[var7];
                                                    int var124 = class3.field33[var7 + 1];
                                                    class3.field33[var7++] = class9.method60(var124, 82, false, var123);
                                                    continue;
                                                }
                                                if (~var517 == -3333) {
                                                    var7 -= 2;
                                                    int var125 = class3.field33[var7];
                                                    int var126 = class3.field33[var7 + 1];
                                                    class3.field33[var7++] = class9.method60(var126, -119, true, var125);
                                                    continue;
                                                }
                                                if (var517 == 3333) {
                                                    class3.field33[var7++] = class102.field1792;
                                                    continue;
                                                }
                                                if (var517 == 3335) {
                                                    class3.field33[var7++] = class212.field3568;
                                                    continue;
                                                }
                                                if (var517 == 3336) {
                                                    var7 -= 4;
                                                    int var127 = class3.field33[var7 + 1];
                                                    int var128 = class3.field33[var7 + 2];
                                                    int var129 = class3.field33[var7];
                                                    int var130 = (var127 << 14) + var129;
                                                    int var131 = (var128 << 28) + var130;
                                                    int var132 = class3.field33[var7 + 3];
                                                    int var133 = var131 + var132;
                                                    class3.field33[var7++] = var133;
                                                    continue;
                                                }
                                                if (var517 == 3337) {
                                                    class3.field33[var7++] = class191.field3090;
                                                    continue;
                                                }
                                            } else if (var517 >= 3500) {
                                                if (var517 >= 3700) {
                                                    if (~var517 > -4001) {
                                                        if (var517 == 3903) {
                                                            --var7;
                                                            int var134 = class3.field33[var7];
                                                            class3.field33[var7++] = class90.field1593[var134].method721(32766);
                                                            continue;
                                                        }
                                                        if (~var517 == -3905) {
                                                            --var7;
                                                            int var135 = class3.field33[var7];
                                                            class3.field33[var7++] = class90.field1593[var135].field1894;
                                                            continue;
                                                        }
                                                        if (~var517 == -3906) {
                                                            --var7;
                                                            int var136 = class3.field33[var7];
                                                            class3.field33[var7++] = class90.field1593[var136].field1898;
                                                            continue;
                                                        }
                                                        if (~var517 == -3907) {
                                                            --var7;
                                                            int var137 = class3.field33[var7];
                                                            class3.field33[var7++] = class90.field1593[var137].field1896;
                                                            continue;
                                                        }
                                                        if (~var517 == -3908) {
                                                            --var7;
                                                            int var138 = class3.field33[var7];
                                                            class3.field33[var7++] = class90.field1593[var138].field1892;
                                                            continue;
                                                        }
                                                        if (~var517 == -3909) {
                                                            --var7;
                                                            int var139 = class3.field33[var7];
                                                            class3.field33[var7++] = class90.field1593[var139].field1889;
                                                            continue;
                                                        }
                                                        if (var517 == 3910) {
                                                            --var7;
                                                            int var140 = class3.field33[var7];
                                                            int var141 = class90.field1593[var140].method722((byte) -81);
                                                            class3.field33[var7++] = var141 != 0 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (var517 == 3911) {
                                                            --var7;
                                                            int var142 = class3.field33[var7];
                                                            int var143 = class90.field1593[var142].method722((byte) -81);
                                                            class3.field33[var7++] = ~var143 != -3 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (~var517 == -3913) {
                                                            --var7;
                                                            int var144 = class3.field33[var7];
                                                            int var145 = class90.field1593[var144].method722((byte) -81);
                                                            class3.field33[var7++] = var145 == 5 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var517 == -3914) {
                                                            --var7;
                                                            int var146 = class3.field33[var7];
                                                            int var147 = class90.field1593[var146].method722((byte) -81);
                                                            class3.field33[var7++] = ~var147 != -2 ? 0 : 1;
                                                            continue;
                                                        }
                                                    } else if (var517 >= 4100) {
                                                        if (~var517 > -4201) {
                                                            if (~var517 == -4101) {
                                                                --var6;
                                                                String var148 = class134.field2330[var6];
                                                                --var7;
                                                                int var149 = class3.field33[var7];
                                                                class134.field2330[var6++] = var148 + var149;
                                                                continue;
                                                            }
                                                            if (~var517 == -4102) {
                                                                var6 -= 2;
                                                                String var150 = class134.field2330[var6 + 1];
                                                                String var151 = class134.field2330[var6];
                                                                class134.field2330[var6++] = var151 + var150;
                                                                continue;
                                                            }
                                                            if (var517 == 4102) {
                                                                --var6;
                                                                String var152 = class134.field2330[var6];
                                                                --var7;
                                                                int var153 = class3.field33[var7];
                                                                class134.field2330[var6++] = var152 + class91.method588(-2048, true, var153);
                                                                continue;
                                                            }
                                                            if (~var517 == -4104) {
                                                                --var6;
                                                                String var154 = class134.field2330[var6];
                                                                class134.field2330[var6++] = var154.toLowerCase();
                                                                continue;
                                                            }
                                                            if (var517 == 4104) {
                                                                --var7;
                                                                int var155 = class3.field33[var7];
                                                                long var156 = (long) var155 * 86400000L + 1014768000000L;
                                                                class113.field2038.setTime(new Date(var156));
                                                                int var158 = class113.field2038.get(5);
                                                                int var159 = class113.field2038.get(2);
                                                                int var160 = class113.field2038.get(1);
                                                                class134.field2330[var6++] = var158 + "-" + class228.field3836[var159] + "-" + var160;
                                                                continue;
                                                            }
                                                            if (~var517 == -4106) {
                                                                var6 -= 2;
                                                                String var161 = class134.field2330[var6 + 1];
                                                                String var162 = class134.field2330[var6];
                                                                if (class273.field4378.field4592 != null && class273.field4378.field4592.field352) {
                                                                    class134.field2330[var6++] = var161;
                                                                    continue;
                                                                }
                                                                class134.field2330[var6++] = var162;
                                                                continue;
                                                            }
                                                            if (var517 == 4106) {
                                                                --var7;
                                                                int var163 = class3.field33[var7];
                                                                class134.field2330[var6++] = Integer.toString(var163);
                                                                continue;
                                                            }
                                                            if (~var517 == -4108) {
                                                                var6 -= 2;
                                                                class3.field33[var7++] = class195.method1274(class227.method1530(true, class134.field2330[var6], class134.field2330[var6 + 1], class212.field3568), 0);
                                                                continue;
                                                            }
                                                            if (var517 == 4108) {
                                                                var7 -= 2;
                                                                --var6;
                                                                String var164 = class134.field2330[var6];
                                                                int var165 = class3.field33[var7];
                                                                int var166 = class3.field33[var7 + 1];
                                                                class3.field33[var7++] = class97.method611(var166, (byte) 102).method1634(var164, var165);
                                                                continue;
                                                            }
                                                            if (~var517 == -4110) {
                                                                --var6;
                                                                String var167 = class134.field2330[var6];
                                                                var7 -= 2;
                                                                int var168 = class3.field33[var7];
                                                                int var169 = class3.field33[var7 + 1];
                                                                class3.field33[var7++] = class97.method611(var169, (byte) 102).method1614(var167, var168);
                                                                continue;
                                                            }
                                                            if (var517 == 4110) {
                                                                var6 -= 2;
                                                                String var170 = class134.field2330[var6];
                                                                String var171 = class134.field2330[var6 + 1];
                                                                --var7;
                                                                if (~class3.field33[var7] != -2) {
                                                                    class134.field2330[var6++] = var171;
                                                                } else {
                                                                    class134.field2330[var6++] = var170;
                                                                }
                                                                continue;
                                                            }
                                                            if (var517 == 4111) {
                                                                --var6;
                                                                String var172 = class134.field2330[var6];
                                                                class134.field2330[var6++] = class244.method1625(var172);
                                                                continue;
                                                            }
                                                            if (~var517 == -4113) {
                                                                --var6;
                                                                String var173 = class134.field2330[var6];
                                                                --var7;
                                                                int var174 = class3.field33[var7];
                                                                if (var174 == -1) {
                                                                    throw new RuntimeException("null char");
                                                                }
                                                                class134.field2330[var6++] = var173 + (char) var174;
                                                                continue;
                                                            }
                                                            if (~var517 == -4114) {
                                                                --var7;
                                                                int var175 = class3.field33[var7];
                                                                class3.field33[var7++] = class121.method828((char) var175, false) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var517 == 4114) {
                                                                --var7;
                                                                int var176 = class3.field33[var7];
                                                                class3.field33[var7++] = !class22.method149((char) var176, arg0) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var517 == -4116) {
                                                                --var7;
                                                                int var177 = class3.field33[var7];
                                                                class3.field33[var7++] = !class255.method1689(!arg0, (char) var177) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var517 == -4117) {
                                                                --var7;
                                                                int var178 = class3.field33[var7];
                                                                class3.field33[var7++] = class27.method181((char) var178, (byte) 96) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var517 == -4118) {
                                                                --var6;
                                                                String var179 = class134.field2330[var6];
                                                                if (var179 == null) {
                                                                    class3.field33[var7++] = 0;
                                                                } else {
                                                                    class3.field33[var7++] = var179.length();
                                                                }
                                                                continue;
                                                            }
                                                            if (~var517 == -4119) {
                                                                --var6;
                                                                String var180 = class134.field2330[var6];
                                                                var7 -= 2;
                                                                int var181 = class3.field33[var7 + 1];
                                                                int var182 = class3.field33[var7];
                                                                class134.field2330[var6++] = var180.substring(var182, var181);
                                                                continue;
                                                            }
                                                            if (var517 == 4119) {
                                                                --var6;
                                                                String var183 = class134.field2330[var6];
                                                                StringBuffer var184 = new StringBuffer(var183.length());
                                                                boolean var185 = false;
                                                                for (int var186 = 0; var183.length() > var186; ++var186) {
                                                                    char var187 = var183.charAt(var186);
                                                                    if (var187 == '<') {
                                                                        var185 = true;
                                                                    } else if (var187 != '>') {
                                                                        if (!var185) {
                                                                            var184.append(var187);
                                                                        }
                                                                    } else {
                                                                        var185 = false;
                                                                    }
                                                                }
                                                                class134.field2330[var6++] = var184.toString();
                                                                continue;
                                                            }
                                                            if (~var517 == -4121) {
                                                                var7 -= 2;
                                                                int var188 = class3.field33[var7];
                                                                --var6;
                                                                String var189 = class134.field2330[var6];
                                                                int var190 = class3.field33[var7 + 1];
                                                                class3.field33[var7++] = var189.indexOf(var188, var190);
                                                                continue;
                                                            }
                                                            if (var517 == 4121) {
                                                                var6 -= 2;
                                                                String var191 = class134.field2330[var6];
                                                                String var192 = class134.field2330[var6 + 1];
                                                                --var7;
                                                                int var193 = class3.field33[var7];
                                                                class3.field33[var7++] = var191.indexOf(var192, var193);
                                                                continue;
                                                            }
                                                            if (~var517 == -4123) {
                                                                --var7;
                                                                int var194 = class3.field33[var7];
                                                                class3.field33[var7++] = Character.toLowerCase((char) var194);
                                                                continue;
                                                            }
                                                            if (var517 == 4123) {
                                                                --var7;
                                                                int var195 = class3.field33[var7];
                                                                class3.field33[var7++] = Character.toUpperCase((char) var195);
                                                                continue;
                                                            }
                                                            if (var517 == 4124) {
                                                                --var7;
                                                                boolean var196 = ~class3.field33[var7] != -1;
                                                                --var7;
                                                                int var197 = class3.field33[var7];
                                                                class134.field2330[var6++] = class23.method157(var196, class212.field3568, (byte) -102, (long) var197, 0);
                                                                continue;
                                                            }
                                                        } else if (~var517 > -4301) {
                                                            if (~var517 == -4201) {
                                                                --var7;
                                                                int var198 = class3.field33[var7];
                                                                class134.field2330[var6++] = class203.method1346(-1, var198).field3216;
                                                                continue;
                                                            }
                                                            if (var517 == 4201) {
                                                                var7 -= 2;
                                                                int var199 = class3.field33[var7];
                                                                int var200 = class3.field33[var7 + 1];
                                                                class199 var201 = class203.method1346(-1, var199);
                                                                if (~var200 <= -2 && ~var200 >= -6 && var201.field3286[var200 + -1] != null) {
                                                                    class134.field2330[var6++] = var201.field3286[var200 + -1];
                                                                    continue;
                                                                }
                                                                class134.field2330[var6++] = "";
                                                                continue;
                                                            }
                                                            if (var517 == 4202) {
                                                                var7 -= 2;
                                                                int var202 = class3.field33[var7];
                                                                int var203 = class3.field33[var7 + 1];
                                                                class199 var204 = class203.method1346(-1, var202);
                                                                if (~var203 <= -2 && ~var203 >= -6 && var204.field3221[var203 + -1] != null) {
                                                                    class134.field2330[var6++] = var204.field3221[var203 + -1];
                                                                    continue;
                                                                }
                                                                class134.field2330[var6++] = "";
                                                                continue;
                                                            }
                                                            if (var517 == 4203) {
                                                                --var7;
                                                                int var205 = class3.field33[var7];
                                                                class3.field33[var7++] = class203.method1346(-1, var205).field3244;
                                                                continue;
                                                            }
                                                            if (~var517 == -4205) {
                                                                --var7;
                                                                int var206 = class3.field33[var7];
                                                                class3.field33[var7++] = class203.method1346(-1, var206).field3218 == 1 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var517 == 4205) {
                                                                --var7;
                                                                int var207 = class3.field33[var7];
                                                                class199 var208 = class203.method1346(-1, var207);
                                                                if (var208.field3284 == -1 && var208.field3257 >= 0) {
                                                                    class3.field33[var7++] = var208.field3257;
                                                                    continue;
                                                                }
                                                                class3.field33[var7++] = var207;
                                                                continue;
                                                            }
                                                            if (~var517 == -4207) {
                                                                --var7;
                                                                int var209 = class3.field33[var7];
                                                                class199 var210 = class203.method1346(-1, var209);
                                                                if (~var210.field3284 <= -1 && var210.field3257 >= 0) {
                                                                    class3.field33[var7++] = var210.field3257;
                                                                    continue;
                                                                }
                                                                class3.field33[var7++] = var209;
                                                                continue;
                                                            }
                                                            if (var517 == 4207) {
                                                                --var7;
                                                                int var211 = class3.field33[var7];
                                                                class3.field33[var7++] = !class203.method1346(-1, var211).field3242 ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (var517 == 4208) {
                                                                var7 -= 2;
                                                                int var212 = class3.field33[var7];
                                                                int var213 = class3.field33[var7 + 1];
                                                                class2 var214 = class119.method816(var213, (byte) 124);
                                                                if (var214.method14(false)) {
                                                                    class134.field2330[var6++] = class203.method1346(-1, var212).method1327((byte) -102, var214.field18, var213);
                                                                } else {
                                                                    class3.field33[var7++] = class203.method1346(-1, var212).method1321((byte) -68, var214.field25, var213);
                                                                }
                                                                continue;
                                                            }
                                                            if (~var517 == -4211) {
                                                                --var6;
                                                                String var215 = class134.field2330[var6];
                                                                --var7;
                                                                int var216 = class3.field33[var7];
                                                                class293.method1975(4, var215, ~var216 == -2);
                                                                class3.field33[var7++] = class190.field3079;
                                                                continue;
                                                            }
                                                            if (~var517 == -4212) {
                                                                if (class27.field413 != null && class190.field3079 > class178.field2930) {
                                                                    class3.field33[var7++] = class113.method791(class27.field413[class178.field2930++], 65535);
                                                                    continue;
                                                                }
                                                                class3.field33[var7++] = -1;
                                                                continue;
                                                            }
                                                            if (~var517 == -4213) {
                                                                class178.field2930 = 0;
                                                                continue;
                                                            }
                                                        } else if (~var517 > -4401) {
                                                            if (var517 == 4300) {
                                                                var7 -= 2;
                                                                int var217 = class3.field33[var7];
                                                                int var218 = class3.field33[var7 + 1];
                                                                class2 var219 = class119.method816(var218, (byte) 90);
                                                                if (var219.method14(false)) {
                                                                    class134.field2330[var6++] = class12.method73((byte) 57, var217).method1396(var219.field18, -90, var218);
                                                                } else {
                                                                    class3.field33[var7++] = class12.method73((byte) 57, var217).method1395(var218, var219.field25, 255);
                                                                }
                                                                continue;
                                                            }
                                                        } else if (~var517 > -4501) {
                                                            if (var517 == 4400) {
                                                                var7 -= 2;
                                                                int var220 = class3.field33[var7 + 1];
                                                                int var221 = class3.field33[var7];
                                                                class2 var222 = class119.method816(var220, (byte) 89);
                                                                if (!var222.method14(false)) {
                                                                    class3.field33[var7++] = class10.method64(64, var221).method1360(var220, true, var222.field25);
                                                                } else {
                                                                    class134.field2330[var6++] = class10.method64(64, var221).method1364(var222.field18, !arg0, var220);
                                                                }
                                                                continue;
                                                            }
                                                        } else if (~var517 <= -4601) {
                                                            if (var517 >= 5100) {
                                                                if (~var517 > -5201) {
                                                                    if (var517 == 5100) {
                                                                        if (!class12.field169[86]) {
                                                                            class3.field33[var7++] = 0;
                                                                        } else {
                                                                            class3.field33[var7++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5102) {
                                                                        if (class12.field169[82]) {
                                                                            class3.field33[var7++] = 1;
                                                                        } else {
                                                                            class3.field33[var7++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5103) {
                                                                        if (class12.field169[81]) {
                                                                            class3.field33[var7++] = 1;
                                                                        } else {
                                                                            class3.field33[var7++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (var517 < 5300) {
                                                                    if (~var517 == -5201) {
                                                                        --var7;
                                                                        class225.method1516(class3.field33[var7], (byte) 113);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5202) {
                                                                        class3.field33[var7++] = class237.method1567((byte) 97);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5203) {
                                                                        --var7;
                                                                        class269.method1767(class3.field33[var7], 302);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5204) {
                                                                        --var6;
                                                                        class205.method1356(class134.field2330[var6], 2);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5204) {
                                                                        class134.field2330[var6 + -1] = class63.method400(class134.field2330[var6 + -1], 64);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5206) {
                                                                        --var7;
                                                                        class63.method401(-1, class3.field33[var7], -1, 0);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5207) {
                                                                        --var7;
                                                                        int var223 = class3.field33[var7];
                                                                        class39 var224 = class248.method1658(128, (268426360 & var223) >> 14, var223 & 16383);
                                                                        if (var224 != null) {
                                                                            class3.field33[var7++] = var224.field581;
                                                                        } else {
                                                                            class3.field33[var7++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5207) {
                                                                        --var7;
                                                                        class39 var225 = class209.method1405(class3.field33[var7], 26915);
                                                                        if (var225 != null && var225.field578 != null) {
                                                                            class134.field2330[var6++] = var225.field578;
                                                                            continue;
                                                                        }
                                                                        class134.field2330[var6++] = "";
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5208) {
                                                                        class3.field33[var7++] = class187.field3031;
                                                                        class3.field33[var7++] = class227.field3821;
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5209) {
                                                                        class3.field33[var7++] = class294.field4681 + class124.field2184;
                                                                        class3.field33[var7++] = class83.field1514 - 1 + -class213.field3583 + class193.field3114;
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5210) {
                                                                        --var7;
                                                                        int var226 = class3.field33[var7];
                                                                        class39 var227 = class209.method1405(var226, 26915);
                                                                        if (var227 != null) {
                                                                            class3.field33[var7++] = class113.method791(var227.field579 >> 14, 16383);
                                                                            class3.field33[var7++] = class113.method791(16383, var227.field579);
                                                                        } else {
                                                                            class3.field33[var7++] = 0;
                                                                            class3.field33[var7++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5211) {
                                                                        --var7;
                                                                        int var228 = class3.field33[var7];
                                                                        class39 var229 = class209.method1405(var228, 26915);
                                                                        if (var229 == null) {
                                                                            class3.field33[var7++] = 0;
                                                                            class3.field33[var7++] = 0;
                                                                        } else {
                                                                            class3.field33[var7++] = -var229.field580 + var229.field594;
                                                                            class3.field33[var7++] = -var229.field591 + var229.field589;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5212) {
                                                                        int var230 = 0;
                                                                        int var231 = class90.method584((byte) -95);
                                                                        String var232;
                                                                        if (~var231 != 0) {
                                                                            var232 = class252.field4135.field3152[var231];
                                                                            var230 = class252.field4135.method1275(var231, (byte) -24);
                                                                        } else {
                                                                            var232 = "";
                                                                        }
                                                                        String var233 = class267.method1757("<br>", var232, " ", -126);
                                                                        class134.field2330[var6++] = var233;
                                                                        class3.field33[var7++] = var230;
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5213) {
                                                                        int var234 = class175.method1163(124);
                                                                        int var235 = 0;
                                                                        String var236;
                                                                        if (var234 == -1) {
                                                                            var236 = "";
                                                                        } else {
                                                                            var236 = class252.field4135.field3152[var234];
                                                                            var235 = class252.field4135.method1275(var234, (byte) -24);
                                                                        }
                                                                        String var237 = class267.method1757("<br>", var236, " ", -123);
                                                                        class134.field2330[var6++] = var237;
                                                                        class3.field33[var7++] = var235;
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5214) {
                                                                        --var7;
                                                                        int var238 = class3.field33[var7];
                                                                        class39 var239 = class220.method1458((byte) 124);
                                                                        if (var239 != null) {
                                                                            int[] var240 = var239.method265(var238 & 16383, var238 >> 14 & 16383, (var238 & 1015466453) >> 28, 5);
                                                                            if (var240 != null) {
                                                                                class62.method390((byte) 16, var240[1], var240[2]);
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5216) {
                                                                        var7 -= 2;
                                                                        int var241 = class3.field33[var7 + 1];
                                                                        int var242 = class3.field33[var7];
                                                                        class222 var243 = class241.method1589(var242 & 16383, var242 >> 14 & 16383, (byte) 86);
                                                                        boolean var244 = false;
                                                                        for (class39 var245 = (class39) var243.method1499(-16216); var245 != null; var245 = (class39) var243.method1495(101)) {
                                                                            if (var245.field581 == var241) {
                                                                                var244 = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!var244) {
                                                                            class3.field33[var7++] = 0;
                                                                        } else {
                                                                            class3.field33[var7++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5217) {
                                                                        --var7;
                                                                        int var246 = class3.field33[var7];
                                                                        class139.method979((byte) 9, var246);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5218) {
                                                                        --var7;
                                                                        int var247 = class3.field33[var7];
                                                                        if (class248.method1662(var247, 71)) {
                                                                            class3.field33[var7++] = 1;
                                                                        } else {
                                                                            class3.field33[var7++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5219) {
                                                                        --var7;
                                                                        int var248 = class3.field33[var7];
                                                                        class39 var249 = class209.method1405(var248, 26915);
                                                                        if (var249 != null) {
                                                                            class3.field33[var7++] = var249.field576;
                                                                        } else {
                                                                            class3.field33[var7++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5219) {
                                                                        --var6;
                                                                        class115.method807((byte) 120, class134.field2330[var6]);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5220) {
                                                                        class3.field33[var7++] = ~class101.field1785 != -101 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5221) {
                                                                        --var7;
                                                                        int var250 = class3.field33[var7];
                                                                        class62.method390((byte) 16, (var250 & 268431316) >> 14, var250 & 16383);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5223) {
                                                                        class39 var251 = class220.method1458((byte) 122);
                                                                        if (var251 == null) {
                                                                            class3.field33[var7++] = -1;
                                                                            class3.field33[var7++] = -1;
                                                                        } else {
                                                                            int[] var252 = var251.method261((byte) 106, -class213.field3583 + class193.field3114 + -1 + class83.field1514, class294.field4681 + class124.field2184);
                                                                            if (var252 != null) {
                                                                                class3.field33[var7++] = var252[1];
                                                                                class3.field33[var7++] = var252[2];
                                                                            } else {
                                                                                class3.field33[var7++] = -1;
                                                                                class3.field33[var7++] = -1;
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5223) {
                                                                        var7 -= 2;
                                                                        int var253 = class3.field33[var7 + 1];
                                                                        int var254 = class3.field33[var7];
                                                                        class63.method401(var253 & 16383, var254, 16383 & var253 >> 14, 0);
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5225) {
                                                                        --var7;
                                                                        int var255 = class3.field33[var7];
                                                                        class39 var256 = class220.method1458((byte) 113);
                                                                        if (var256 != null) {
                                                                            int[] var257 = var256.method265(var255 & 16383, (268425812 & var255) >> 14, 3 & var255 >> 28, 5);
                                                                            if (var257 != null) {
                                                                                class3.field33[var7++] = var257[1];
                                                                                class3.field33[var7++] = var257[2];
                                                                            } else {
                                                                                class3.field33[var7++] = -1;
                                                                                class3.field33[var7++] = -1;
                                                                            }
                                                                        } else {
                                                                            class3.field33[var7++] = -1;
                                                                            class3.field33[var7++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5225) {
                                                                        --var7;
                                                                        int var258 = class3.field33[var7];
                                                                        class39 var259 = class220.method1458((byte) 126);
                                                                        if (var259 == null) {
                                                                            class3.field33[var7++] = -1;
                                                                            class3.field33[var7++] = -1;
                                                                        } else {
                                                                            int[] var260 = var259.method261((byte) 106, 16383 & var258, (var258 & 268434154) >> 14);
                                                                            if (var260 != null) {
                                                                                class3.field33[var7++] = var260[1];
                                                                                class3.field33[var7++] = var260[2];
                                                                            } else {
                                                                                class3.field33[var7++] = -1;
                                                                                class3.field33[var7++] = -1;
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (~var517 <= -5401) {
                                                                    if (var517 < 5500) {
                                                                        if (~var517 == -5401) {
                                                                            var6 -= 2;
                                                                            ++class206.field3443;
                                                                            String var261 = class134.field2330[var6];
                                                                            String var262 = class134.field2330[var6 + 1];
                                                                            --var7;
                                                                            int var263 = class3.field33[var7];
                                                                            class168.field2778.method199(242, 22);
                                                                            class168.field2778.method682(1 + class285.method1904(var261, (byte) 88) - -class285.method1904(var262, (byte) 109), 22555);
                                                                            class168.field2778.method645(var261, (byte) 110);
                                                                            class168.field2778.method645(var262, (byte) 123);
                                                                            class168.field2778.method682(var263, 22555);
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5402) {
                                                                            var7 -= 2;
                                                                            class248.field4059[class3.field33[var7]] = (short) class169.method1146(class3.field33[var7 + 1], true);
                                                                            class168.method1134(-2);
                                                                            class267.method1753((byte) -85);
                                                                            class173.method1160(-124);
                                                                            class58.method359(1);
                                                                            class122.method836(true);
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5405) {
                                                                            var7 -= 2;
                                                                            int var264 = class3.field33[var7 + 1];
                                                                            int var265 = class3.field33[var7];
                                                                            if (~var265 <= -1 && var265 < 2) {
                                                                                class105.field1879[var265] = new int[var264 << 1][4];
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5406) {
                                                                            var7 -= 7;
                                                                            int var266 = class3.field33[var7 + 1] << 1;
                                                                            int var267 = class3.field33[var7 + 2];
                                                                            int var268 = class3.field33[var7];
                                                                            int var269 = class3.field33[var7 + 3];
                                                                            int var270 = class3.field33[var7 - -4];
                                                                            int var271 = class3.field33[var7 + 6];
                                                                            int var272 = class3.field33[var7 + 5];
                                                                            if (var268 >= 0 && ~var268 > -3 && class105.field1879[var268] != null && var266 >= 0 && ~class105.field1879[var268].length < ~var266) {
                                                                                class105.field1879[var268][var266] = new int[] { (class113.method791(var267, 268426483) >> 14) * 128, var269, 128 * class113.method791(var267, 16383), var271 };
                                                                                class105.field1879[var268][var266 + 1] = new int[] { class113.method791(var270 >> 14, 16383) * 128, var272, 128 * class113.method791(16383, var270) };
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5407) {
                                                                            --var7;
                                                                            int var273 = class105.field1879[class3.field33[var7]].length >> 1;
                                                                            class3.field33[var7++] = var273;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5412) {
                                                                            if (class270.field4349 != null) {
                                                                                System.exit(0);
                                                                            } else {
                                                                                class291.method1967(false, class46.method280(false), 113);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5419) {
                                                                            String var274 = "";
                                                                            if (class231.field3866 != null) {
                                                                                if (class231.field3866.field2859 == null) {
                                                                                    var274 = class136.method952(103, class231.field3866.field2860);
                                                                                } else {
                                                                                    var274 = (String) class231.field3866.field2859;
                                                                                }
                                                                            }
                                                                            class134.field2330[var6++] = var274;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5421) {
                                                                            class3.field33[var7++] = ~class131.field2288 != -4 ? 0 : 1;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5422) {
                                                                            --var6;
                                                                            String var275 = class134.field2330[var6];
                                                                            --var7;
                                                                            boolean var276 = ~class3.field33[var7] == -2;
                                                                            String var277 = class46.method280(false) + var275;
                                                                            if (class270.field4349 != null || var276 && class131.field2288 != 3 && class131.field2291.startsWith("win") && !class66.field1105) {
                                                                                class253.field4142 = var276;
                                                                                class246.field4048 = var277;
                                                                                class60.field1048 = class127.field2238.method914(var277, 0);
                                                                                continue;
                                                                            }
                                                                            class291.method1967(var276, var277, 88);
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5423) {
                                                                            var6 -= 2;
                                                                            String var278 = class134.field2330[var6];
                                                                            String var279 = class134.field2330[var6 + 1];
                                                                            --var7;
                                                                            int var280 = class3.field33[var7];
                                                                            if (var278.length() > 0) {
                                                                                if (class210.field3555 == null) {
                                                                                    class210.field3555 = new String[class61.field1060[class185.field3002]];
                                                                                }
                                                                                class210.field3555[var280] = var278;
                                                                            }
                                                                            if (var279.length() > 0) {
                                                                                if (class234.field3885 == null) {
                                                                                    class234.field3885 = new String[class61.field1060[class185.field3002]];
                                                                                }
                                                                                class234.field3885[var280] = var279;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5423) {
                                                                            --var6;
                                                                            System.out.println(class134.field2330[var6]);
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5424) {
                                                                            var7 -= 11;
                                                                            class186.field3014 = class3.field33[var7];
                                                                            class37.field550 = class3.field33[var7 + 1];
                                                                            class205.field3353 = class3.field33[var7 + 2];
                                                                            class182.field2971 = class3.field33[var7 + 3];
                                                                            class78.field1301 = class3.field33[var7 + 4];
                                                                            class227.field3833 = class3.field33[var7 + 5];
                                                                            class205.field3347 = class3.field33[var7 + 6];
                                                                            class90.field1597 = class3.field33[var7 + 7];
                                                                            class110.field1986 = class3.field33[var7 - -8];
                                                                            class102.field1797 = class3.field33[var7 + 9];
                                                                            class196.field3162 = class3.field33[var7 + 10];
                                                                            class33.field471.method727(class78.field1301, (byte) -128);
                                                                            class33.field471.method727(class227.field3833, (byte) -101);
                                                                            class33.field471.method727(class205.field3347, (byte) -85);
                                                                            class33.field471.method727(class90.field1597, (byte) -118);
                                                                            class33.field471.method727(class110.field1986, (byte) -96);
                                                                            class60.field1050 = true;
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5425) {
                                                                            class53.method332((byte) 97);
                                                                            class60.field1050 = false;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5427) {
                                                                            --var7;
                                                                            class97.field1661 = class3.field33[var7];
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5428) {
                                                                            var7 -= 2;
                                                                            class256.field4179 = class3.field33[var7];
                                                                            class293.field4678 = class3.field33[var7 + 1];
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5429) {
                                                                            var7 -= 2;
                                                                            int var281 = class3.field33[var7 + 1];
                                                                            int var282 = class3.field33[var7];
                                                                            class3.field33[var7++] = !class189.method1241(var281, true, var282) ? 0 : 1;
                                                                            continue;
                                                                        }
                                                                    } else if (var517 < 5600) {
                                                                        if (~var517 == -5501) {
                                                                            var7 -= 4;
                                                                            int var283 = class3.field33[var7];
                                                                            int var284 = class3.field33[var7 + 1];
                                                                            int var285 = class3.field33[var7 + 2];
                                                                            int var286 = class3.field33[var7 + 3];
                                                                            class162.method1098(var285, (16383 & var283) + -class255.field4162, ((var283 & 268427830) >> 14) - class126.field2206, false, var286, var284, 100);
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5501) {
                                                                            var7 -= 4;
                                                                            int var287 = class3.field33[var7];
                                                                            int var288 = class3.field33[var7 + 2];
                                                                            int var289 = class3.field33[var7 - -1];
                                                                            int var290 = class3.field33[var7 - -3];
                                                                            class239.method1579((16383 & var287 >> 14) + -class126.field2206, var288, (16383 & var287) - class255.field4162, var290, -750, var289);
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5503) {
                                                                            var7 -= 6;
                                                                            int var291 = class3.field33[var7];
                                                                            if (var291 >= 2) {
                                                                                throw new RuntimeException();
                                                                            }
                                                                            class154.field2572 = var291;
                                                                            int var292 = class3.field33[var7 + 1];
                                                                            if (var292 + 1 >= class105.field1879[class154.field2572].length >> 1) {
                                                                                throw new RuntimeException();
                                                                            }
                                                                            class112.field2027 = 0;
                                                                            class210.field3556 = var292;
                                                                            class72.field1187 = class3.field33[var7 + 2];
                                                                            class66.field1107 = class3.field33[var7 + 3];
                                                                            int var293 = class3.field33[var7 + 4];
                                                                            if (~var293 <= -3) {
                                                                                throw new RuntimeException();
                                                                            }
                                                                            class162.field2688 = var293;
                                                                            int var294 = class3.field33[var7 + 5];
                                                                            if (var294 + 1 >= class105.field1879[class162.field2688].length >> 1) {
                                                                                throw new RuntimeException();
                                                                            }
                                                                            class27.field414 = var294;
                                                                            class241.field3970 = 3;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5504) {
                                                                            class99.method629(15089);
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5505) {
                                                                            var7 -= 2;
                                                                            class196.method1286(class3.field33[var7], class3.field33[var7 - -1], 0);
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5505) {
                                                                            class3.field33[var7++] = (int) class195.field3151;
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5506) {
                                                                            class3.field33[var7++] = (int) class106.field1900;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5508) {
                                                                            class224.method1505(-124);
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5509) {
                                                                            class191.method1248(-101);
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5510) {
                                                                            class269.method1766(arg0);
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5511) {
                                                                            class199.method1320(false);
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5512) {
                                                                            class291.method1968((byte) 110);
                                                                            continue;
                                                                        }
                                                                    } else if (~var517 <= -5701) {
                                                                        if (~var517 <= -6101) {
                                                                            if (var517 < 6200) {
                                                                                if (~var517 == -6102) {
                                                                                    class3.field33[var7++] = class286.field4518;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6103) {
                                                                                    class3.field33[var7++] = !class96.method610(0) ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6104) {
                                                                                    class3.field33[var7++] = class280.field4459 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6106) {
                                                                                    class3.field33[var7++] = !class172.field2828 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6106) {
                                                                                    class3.field33[var7++] = class239.field3932 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6108) {
                                                                                    class3.field33[var7++] = class11.field156 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6108) {
                                                                                    class3.field33[var7++] = class22.field338 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6109) {
                                                                                    class3.field33[var7++] = class255.field4168 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6111) {
                                                                                    class3.field33[var7++] = class188.field3051 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6111) {
                                                                                    class3.field33[var7++] = class24.field379;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6112) {
                                                                                    class3.field33[var7++] = class49.field848 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6114) {
                                                                                    class3.field33[var7++] = !class11.field164 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6115) {
                                                                                    class3.field33[var7++] = class103.field1816 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6117) {
                                                                                    class3.field33[var7++] = class172.field2820;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6118) {
                                                                                    class3.field33[var7++] = class61.field1069 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6119) {
                                                                                    class3.field33[var7++] = class10.field121;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6119) {
                                                                                    class3.field33[var7++] = class50.field872;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6120) {
                                                                                    class3.field33[var7++] = class196.field3167;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6122) {
                                                                                    class3.field33[var7++] = 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6124) {
                                                                                    class3.field33[var7++] = class32.method216();
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6124) {
                                                                                    class3.field33[var7++] = class139.field2403;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6126) {
                                                                                    class3.field33[var7++] = 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6128) {
                                                                                    class3.field33[var7++] = !class159.field2660 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6128) {
                                                                                    class3.field33[var7++] = !class261.field4256 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                            } else if (~var517 <= -6301) {
                                                                                if (~var517 > -6401) {
                                                                                    if (~var517 == -6301) {
                                                                                        class3.field33[var7++] = (int) (class232.method1544((byte) -107) / 60000L);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 6301) {
                                                                                        class3.field33[var7++] = (int) (class232.method1544((byte) -118) / 86400000L) + -11745;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 6302) {
                                                                                        var7 -= 3;
                                                                                        int var295 = class3.field33[var7];
                                                                                        int var296 = class3.field33[var7 - -2];
                                                                                        int var297 = class3.field33[var7 + 1];
                                                                                        class113.field2038.clear();
                                                                                        class113.field2038.set(11, 12);
                                                                                        class113.field2038.set(var296, var297, var295);
                                                                                        class3.field33[var7++] = (int) (class113.field2038.getTime().getTime() / 86400000L) + -11745;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -6304) {
                                                                                        class113.field2038.clear();
                                                                                        class113.field2038.setTime(new Date(class232.method1544((byte) -70)));
                                                                                        class3.field33[var7++] = class113.field2038.get(1);
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 6304) {
                                                                                        boolean var298 = true;
                                                                                        --var7;
                                                                                        int var299 = class3.field33[var7];
                                                                                        if (var299 >= 0) {
                                                                                            if (var299 >= 1582) {
                                                                                                if (var299 % 4 != 0) {
                                                                                                    var298 = false;
                                                                                                } else if (~(var299 % 100) != -1) {
                                                                                                    var298 = true;
                                                                                                } else if (~(var299 % 400) != -1) {
                                                                                                    var298 = false;
                                                                                                }
                                                                                            } else {
                                                                                                var298 = ~(var299 % 4) == -1;
                                                                                            }
                                                                                        } else {
                                                                                            var298 = (var299 + 1) % 4 == 0;
                                                                                        }
                                                                                        class3.field33[var7++] = var298 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                } else if (~var517 > -6501) {
                                                                                    if (var517 == 6405) {
                                                                                        class3.field33[var7++] = class141.method988((byte) 124) ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 6406) {
                                                                                        class3.field33[var7++] = !class105.method715(123) ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                } else if (var517 >= 6600) {
                                                                                    if (~var517 > -6701) {
                                                                                        if (~var517 == -6601) {
                                                                                            --var7;
                                                                                            class173.field2852 = ~class3.field33[var7] == -2;
                                                                                            class28.method185(class127.field2238, 0);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var517 == -6602) {
                                                                                            class3.field33[var7++] = !class173.field2852 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (var517 == 6500) {
                                                                                        if (class59.field1026 == 10 && class52.field917 == 0 && ~class295.field4691 == -1 && ~class166.field2715 == -1) {
                                                                                            class3.field33[var7++] = class136.method960(true) == -1 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                        class3.field33[var7++] = 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 6501) {
                                                                                        class236 var300 = class105.method711((byte) -28);
                                                                                        if (var300 != null) {
                                                                                            class3.field33[var7++] = var300.field3895;
                                                                                            class3.field33[var7++] = var300.field3980;
                                                                                            class134.field2330[var6++] = var300.field3894;
                                                                                            class42 var301 = var300.method1563((byte) -84);
                                                                                            class3.field33[var7++] = var301.field621;
                                                                                            class134.field2330[var6++] = var301.field624;
                                                                                            class3.field33[var7++] = var300.field3981;
                                                                                        } else {
                                                                                            class3.field33[var7++] = -1;
                                                                                            class3.field33[var7++] = 0;
                                                                                            class134.field2330[var6++] = "";
                                                                                            class3.field33[var7++] = 0;
                                                                                            class134.field2330[var6++] = "";
                                                                                            class3.field33[var7++] = 0;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -6503) {
                                                                                        class236 var302 = class171.method1152(-2);
                                                                                        if (var302 != null) {
                                                                                            class3.field33[var7++] = var302.field3895;
                                                                                            class3.field33[var7++] = var302.field3980;
                                                                                            class134.field2330[var6++] = var302.field3894;
                                                                                            class42 var303 = var302.method1563((byte) -85);
                                                                                            class3.field33[var7++] = var303.field621;
                                                                                            class134.field2330[var6++] = var303.field624;
                                                                                            class3.field33[var7++] = var302.field3981;
                                                                                        } else {
                                                                                            class3.field33[var7++] = -1;
                                                                                            class3.field33[var7++] = 0;
                                                                                            class134.field2330[var6++] = "";
                                                                                            class3.field33[var7++] = 0;
                                                                                            class134.field2330[var6++] = "";
                                                                                            class3.field33[var7++] = 0;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -6504) {
                                                                                        --var7;
                                                                                        int var304 = class3.field33[var7];
                                                                                        if (class59.field1026 == 10 && ~class52.field917 == -1 && class295.field4691 == 0 && ~class166.field2715 == -1) {
                                                                                            class3.field33[var7++] = class275.method1802(var304, (byte) 116) ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        class3.field33[var7++] = 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -6505) {
                                                                                        --var7;
                                                                                        class157.field2627 = class3.field33[var7];
                                                                                        class28.method185(class127.field2238, 0);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var517 == -6506) {
                                                                                        class3.field33[var7++] = class157.field2627;
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 6506) {
                                                                                        --var7;
                                                                                        int var305 = class3.field33[var7];
                                                                                        class236 var306 = class54.method338((byte) 12, var305);
                                                                                        if (var306 != null) {
                                                                                            class3.field33[var7++] = var306.field3980;
                                                                                            class134.field2330[var6++] = var306.field3894;
                                                                                            class42 var307 = var306.method1563((byte) -112);
                                                                                            class3.field33[var7++] = var307.field621;
                                                                                            class134.field2330[var6++] = var307.field624;
                                                                                            class3.field33[var7++] = var306.field3981;
                                                                                        } else {
                                                                                            class3.field33[var7++] = -1;
                                                                                            class134.field2330[var6++] = "";
                                                                                            class3.field33[var7++] = 0;
                                                                                            class134.field2330[var6++] = "";
                                                                                            class3.field33[var7++] = 0;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (var517 == 6507) {
                                                                                        var7 -= 4;
                                                                                        int var308 = class3.field33[var7];
                                                                                        int var309 = class3.field33[var7 - -2];
                                                                                        boolean var310 = ~class3.field33[var7 + 1] == -2;
                                                                                        boolean var311 = ~class3.field33[var7 + 3] == -2;
                                                                                        class29.method195(var311, var308, var309, var310, -19476);
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (var517 == 6200) {
                                                                                    var7 -= 2;
                                                                                    class125.field2200 = (short) class3.field33[var7];
                                                                                    if (~class125.field2200 >= -1) {
                                                                                        class125.field2200 = 256;
                                                                                    }
                                                                                    class116.field2074 = (short) class3.field33[var7 + 1];
                                                                                    if (class116.field2074 <= 0) {
                                                                                        class116.field2074 = 205;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6202) {
                                                                                    var7 -= 2;
                                                                                    class107.field1905 = (short) class3.field33[var7];
                                                                                    if (class107.field1905 <= 0) {
                                                                                        class107.field1905 = 256;
                                                                                    }
                                                                                    class105.field1866 = (short) class3.field33[var7 - -1];
                                                                                    if (class105.field1866 <= 0) {
                                                                                        class105.field1866 = 320;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6203) {
                                                                                    var7 -= 4;
                                                                                    class107.field1913 = (short) class3.field33[var7];
                                                                                    if (class107.field1913 <= 0) {
                                                                                        class107.field1913 = 1;
                                                                                    }
                                                                                    class239.field3927 = (short) class3.field33[var7 + 1];
                                                                                    if (class239.field3927 > 0) {
                                                                                        if (~class107.field1913 < ~class239.field3927) {
                                                                                            class239.field3927 = class107.field1913;
                                                                                        }
                                                                                    } else {
                                                                                        class239.field3927 = 32767;
                                                                                    }
                                                                                    class92.field1622 = (short) class3.field33[var7 - -2];
                                                                                    if (class92.field1622 <= 0) {
                                                                                        class92.field1622 = 1;
                                                                                    }
                                                                                    class156.field2615 = (short) class3.field33[var7 + 3];
                                                                                    if (class156.field2615 > 0) {
                                                                                        if (~class156.field2615 > ~class92.field1622) {
                                                                                            class156.field2615 = class92.field1622;
                                                                                        }
                                                                                    } else {
                                                                                        class156.field2615 = 32767;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6204) {
                                                                                    class205.method1358(0, class215.field3624.field701, class215.field3624.field715, 0, false, (byte) 109);
                                                                                    class3.field33[var7++] = class248.field4061;
                                                                                    class3.field33[var7++] = class295.field4693;
                                                                                    continue;
                                                                                }
                                                                                if (~var517 == -6205) {
                                                                                    class3.field33[var7++] = class107.field1905;
                                                                                    class3.field33[var7++] = class105.field1866;
                                                                                    continue;
                                                                                }
                                                                                if (var517 == 6205) {
                                                                                    class3.field33[var7++] = class125.field2200;
                                                                                    class3.field33[var7++] = class116.field2074;
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (var517 == 6001) {
                                                                                --var7;
                                                                                int var312 = class3.field33[var7];
                                                                                if (var312 < 1) {
                                                                                    var312 = 1;
                                                                                }
                                                                                if (var312 > 4) {
                                                                                    var312 = 4;
                                                                                }
                                                                                class286.field4518 = var312;
                                                                                if (~class286.field4518 == -2) {
                                                                                    class287.method1943(0.9F);
                                                                                }
                                                                                if (class286.field4518 == 2) {
                                                                                    class287.method1943(0.8F);
                                                                                }
                                                                                if (~class286.field4518 == -4) {
                                                                                    class287.method1943(0.7F);
                                                                                }
                                                                                if (class286.field4518 == 4) {
                                                                                    class287.method1943(0.6F);
                                                                                }
                                                                                class267.method1753((byte) -85);
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6003) {
                                                                                --var7;
                                                                                class151.method1038((byte) 5, class3.field33[var7] == 1);
                                                                                class227.method1525((byte) -110);
                                                                                class4.method26(2);
                                                                                class184.method1211(-23839);
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6004) {
                                                                                --var7;
                                                                                class280.field4459 = class3.field33[var7] == 1;
                                                                                class184.method1211(-23839);
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6006) {
                                                                                --var7;
                                                                                class172.field2828 = ~class3.field33[var7] == -2;
                                                                                class4.method26(2);
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 6006) {
                                                                                --var7;
                                                                                class239.field3932 = class3.field33[var7] == 1;
                                                                                ((class240) class287.field4555).method1583(0, !class239.field3932);
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 6007) {
                                                                                --var7;
                                                                                class11.field156 = ~class3.field33[var7] == -2;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6009) {
                                                                                --var7;
                                                                                class22.field338 = class3.field33[var7] == 1;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6010) {
                                                                                --var7;
                                                                                class255.field4168 = class3.field33[var7] == 1;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 6010) {
                                                                                --var7;
                                                                                class188.field3051 = ~class3.field33[var7] == -2;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 6011) {
                                                                                --var7;
                                                                                int var313 = class3.field33[var7];
                                                                                if (~var313 > -1 || var313 > 2) {
                                                                                    var313 = 0;
                                                                                }
                                                                                class24.field379 = var313;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6013) {
                                                                                --var7;
                                                                                class49.field848 = class3.field33[var7] == 1;
                                                                                if (~class286.field4518 == -2) {
                                                                                    class287.method1943(0.9F);
                                                                                }
                                                                                if (~class286.field4518 == -3) {
                                                                                    class287.method1943(0.8F);
                                                                                }
                                                                                if (~class286.field4518 == -4) {
                                                                                    class287.method1943(0.7F);
                                                                                }
                                                                                if (class286.field4518 == 4) {
                                                                                    class287.method1943(0.6F);
                                                                                }
                                                                                class4.method26(2);
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6015) {
                                                                                --var7;
                                                                                class11.field164 = ~class3.field33[var7] == -2;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 6015) {
                                                                                --var7;
                                                                                class103.field1816 = ~class3.field33[var7] == -2;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 6016) {
                                                                                --var7;
                                                                                int var314 = class3.field33[var7];
                                                                                if (~var314 > -1 || var314 > 2) {
                                                                                    var314 = 0;
                                                                                }
                                                                                class172.field2820 = var314;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 6017) {
                                                                                --var7;
                                                                                class61.field1069 = ~class3.field33[var7] == -2;
                                                                                class184.method1207((byte) -74);
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6019) {
                                                                                --var7;
                                                                                int var315 = class3.field33[var7];
                                                                                if (var315 < 0) {
                                                                                    var315 = 0;
                                                                                }
                                                                                if (var315 > 127) {
                                                                                    var315 = 127;
                                                                                }
                                                                                class10.field121 = var315;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (var517 == 6019) {
                                                                                --var7;
                                                                                int var316 = class3.field33[var7];
                                                                                if (var316 < 0) {
                                                                                    var316 = 0;
                                                                                }
                                                                                if (~var316 < -256) {
                                                                                    var316 = 255;
                                                                                }
                                                                                if (~class50.field872 != ~var316) {
                                                                                    if (~class50.field872 == -1 && class155.field2590 != -1) {
                                                                                        class246.method1647(false, class155.field2590, class56.field972, 0, var316, -11577);
                                                                                        class175.field2874 = false;
                                                                                    } else if (~var316 == -1) {
                                                                                        class17.method95(false);
                                                                                        class175.field2874 = false;
                                                                                    } else {
                                                                                        class262.method1739(var316, 7687);
                                                                                    }
                                                                                    class50.field872 = var316;
                                                                                }
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6021) {
                                                                                --var7;
                                                                                int var317 = class3.field33[var7];
                                                                                if (var317 < 0) {
                                                                                    var317 = 0;
                                                                                }
                                                                                if (~var317 < -128) {
                                                                                    var317 = 127;
                                                                                }
                                                                                class196.field3167 = var317;
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6022) {
                                                                                --var7;
                                                                                class277.field4433 = class3.field33[var7] == 1;
                                                                                class184.method1211(-23839);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6024) {
                                                                                boolean var318 = false;
                                                                                --var7;
                                                                                int var319 = class3.field33[var7];
                                                                                if (var319 < 0) {
                                                                                    var319 = 0;
                                                                                }
                                                                                if (~var319 < -3) {
                                                                                    var319 = 2;
                                                                                }
                                                                                if (~class56.field982 > -97) {
                                                                                    var318 = true;
                                                                                    var319 = 0;
                                                                                }
                                                                                class32.method214(var319);
                                                                                class28.method185(class127.field2238, 0);
                                                                                class196.field3172 = false;
                                                                                class3.field33[var7++] = !var318 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6025) {
                                                                                --var7;
                                                                                int var320 = class3.field33[var7];
                                                                                if (var320 < 0 || ~var320 < -3) {
                                                                                    var320 = 0;
                                                                                }
                                                                                class139.field2403 = var320;
                                                                                class28.method185(class127.field2238, 0);
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6028) {
                                                                                --var7;
                                                                                continue;
                                                                            }
                                                                            if (~var517 == -6029) {
                                                                                --var7;
                                                                                class261.field4256 = ~class3.field33[var7] != -1;
                                                                                class28.method185(class127.field2238, 0);
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (~var517 == -5601) {
                                                                            var6 -= 2;
                                                                            String var321 = class134.field2330[var6];
                                                                            String var322 = class134.field2330[var6 - -1];
                                                                            --var7;
                                                                            int var323 = class3.field33[var7];
                                                                            if (~class59.field1026 == -11 && class52.field917 == 0 && ~class295.field4691 == -1 && class166.field2715 == 0 && ~class280.field4463 == -1) {
                                                                                class165.method1109(var321, var322, 0, var323);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5601) {
                                                                            class225.method1515((byte) -68);
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5602) {
                                                                            if (~class295.field4691 == -1) {
                                                                                class6.field73 = -2;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5603) {
                                                                            var7 -= 4;
                                                                            if (class59.field1026 == 10 && ~class52.field917 == -1 && class295.field4691 == 0 && ~class166.field2715 == -1 && ~class280.field4463 == -1) {
                                                                                class204.method1350(class3.field33[var7 + 3], class3.field33[var7 + 2], class3.field33[var7], !arg0, class3.field33[var7 + 1]);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5604) {
                                                                            --var6;
                                                                            if (class59.field1026 == 10 && class52.field917 == 0 && class295.field4691 == 0 && class166.field2715 == 0 && ~class280.field4463 == -1) {
                                                                                class68.method418(0, class103.method702(true, class134.field2330[var6]));
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5605) {
                                                                            var6 -= 3;
                                                                            var7 -= 7;
                                                                            if (~class59.field1026 == -11 && ~class52.field917 == -1 && ~class295.field4691 == -1 && class166.field2715 == 0 && class280.field4463 == 0) {
                                                                                class273.method1791(class3.field33[var7 + 6] == 1, class3.field33[var7], class3.field33[var7 + 3], class3.field33[var7 + 5] == 1, class134.field2330[var6 + 1], class103.method702(!arg0, class134.field2330[var6]), -118, class3.field33[var7 - -2], class3.field33[var7 + 1], class134.field2330[var6 + 2], ~class3.field33[var7 + 4] == -2);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5606) {
                                                                            if (~class166.field2715 == -1) {
                                                                                class139.field2396 = -2;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5608) {
                                                                            class3.field33[var7++] = class6.field73;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5609) {
                                                                            class3.field33[var7++] = class59.field1030;
                                                                            continue;
                                                                        }
                                                                        if (var517 == 5609) {
                                                                            class3.field33[var7++] = class139.field2396;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5611) {
                                                                            for (int var324 = 0; var324 < 5; ++var324) {
                                                                                class134.field2330[var6++] = class114.field2052.length > var324 ? class9.method55((byte) 77, class114.field2052[var324]) : "";
                                                                            }
                                                                            class114.field2052 = null;
                                                                            continue;
                                                                        }
                                                                        if (~var517 == -5612) {
                                                                            class3.field33[var7++] = class74.field1222;
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (~var517 == -5301) {
                                                                        var7 -= 2;
                                                                        class3.field33[var7++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5301) {
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5303) {
                                                                        class3.field33[var7++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5304) {
                                                                        --var7;
                                                                        class3.field33[var7++] = 0;
                                                                        class3.field33[var7++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5305) {
                                                                        byte var325 = -1;
                                                                        class3.field33[var7++] = var325;
                                                                        continue;
                                                                    }
                                                                    if (~var517 == -5307) {
                                                                        class3.field33[var7++] = class85.method557(false);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5307) {
                                                                        --var7;
                                                                        int var326 = class3.field33[var7];
                                                                        if (~var326 > -1 || ~var326 < -3) {
                                                                            var326 = 0;
                                                                        }
                                                                        class39.method262((byte) -20, false, -1, -1, var326);
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5308) {
                                                                        class3.field33[var7++] = class52.field912;
                                                                        continue;
                                                                    }
                                                                    if (var517 == 5309) {
                                                                        --var7;
                                                                        int var327 = class3.field33[var7];
                                                                        if (var327 < 0 || var327 > 2) {
                                                                            var327 = 0;
                                                                        }
                                                                        class52.field912 = var327;
                                                                        class28.method185(class127.field2238, 0);
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (var517 == 5000) {
                                                                    class3.field33[var7++] = class243.field3979;
                                                                    continue;
                                                                }
                                                                if (var517 == 5001) {
                                                                    var7 -= 3;
                                                                    class243.field3979 = class3.field33[var7];
                                                                    ++class208.field3478;
                                                                    class175.field2876 = class3.field33[var7 - -1];
                                                                    class68.field1122 = class3.field33[var7 + 2];
                                                                    class168.field2778.method199(150, 127);
                                                                    class168.field2778.method682(class243.field3979, 22555);
                                                                    class168.field2778.method682(class175.field2876, 22555);
                                                                    class168.field2778.method682(class68.field1122, 22555);
                                                                    continue;
                                                                }
                                                                if (~var517 == -5003) {
                                                                    var7 -= 2;
                                                                    ++class29.field432;
                                                                    --var6;
                                                                    String var328 = class134.field2330[var6];
                                                                    int var329 = class3.field33[var7];
                                                                    int var330 = class3.field33[var7 + 1];
                                                                    class168.field2778.method199(82, 122);
                                                                    class168.field2778.method640(21691, class103.method702(!arg0, var328));
                                                                    class168.field2778.method682(var329 + -1, 22555);
                                                                    class168.field2778.method682(var330, 22555);
                                                                    continue;
                                                                }
                                                                if (~var517 == -5004) {
                                                                    String var331 = null;
                                                                    --var7;
                                                                    int var332 = class3.field33[var7];
                                                                    if (~var332 > -101) {
                                                                        var331 = class241.field3969[var332];
                                                                    }
                                                                    if (var331 == null) {
                                                                        var331 = "";
                                                                    }
                                                                    class134.field2330[var6++] = var331;
                                                                    continue;
                                                                }
                                                                if (var517 == 5004) {
                                                                    --var7;
                                                                    int var333 = class3.field33[var7];
                                                                    int var334 = -1;
                                                                    if (var333 < 100 && class241.field3969[var333] != null) {
                                                                        var334 = class111.field2005[var333];
                                                                    }
                                                                    class3.field33[var7++] = var334;
                                                                    continue;
                                                                }
                                                                if (~var517 == -5006) {
                                                                    class3.field33[var7++] = class175.field2876;
                                                                    continue;
                                                                }
                                                                if (~var517 == -5009) {
                                                                    --var6;
                                                                    String var335 = class134.field2330[var6];
                                                                    if (var335.startsWith("::")) {
                                                                        class188.method1227((byte) 13, var335);
                                                                        continue;
                                                                    }
                                                                    if (class204.field3343 == 0 && (class66.field1108 && !class125.field2196 || class124.field2186)) {
                                                                        continue;
                                                                    }
                                                                    ++class97.field1666;
                                                                    String var336 = var335.toLowerCase();
                                                                    byte var337 = 0;
                                                                    if (!var336.startsWith(class243.field3994)) {
                                                                        if (!var336.startsWith(class162.field2687)) {
                                                                            if (var336.startsWith(class12.field173)) {
                                                                                var335 = var335.substring(class12.field173.length());
                                                                                var337 = 2;
                                                                            } else if (!var336.startsWith(class262.field4276)) {
                                                                                if (var336.startsWith(class190.field3082)) {
                                                                                    var337 = 4;
                                                                                    var335 = var335.substring(class190.field3082.length());
                                                                                } else if (var336.startsWith(class101.field1779)) {
                                                                                    var337 = 5;
                                                                                    var335 = var335.substring(class101.field1779.length());
                                                                                } else if (!var336.startsWith(class258.field4214)) {
                                                                                    if (!var336.startsWith(class41.field615)) {
                                                                                        if (var336.startsWith(class48.field835)) {
                                                                                            var335 = var335.substring(class48.field835.length());
                                                                                            var337 = 8;
                                                                                        } else if (var336.startsWith(class217.field3654)) {
                                                                                            var335 = var335.substring(class217.field3654.length());
                                                                                            var337 = 9;
                                                                                        } else if (var336.startsWith(class261.field4264)) {
                                                                                            var337 = 10;
                                                                                            var335 = var335.substring(class261.field4264.length());
                                                                                        } else if (var336.startsWith(class88.field1568)) {
                                                                                            var335 = var335.substring(class88.field1568.length());
                                                                                            var337 = 11;
                                                                                        } else if (class212.field3568 != 0) {
                                                                                            if (!var336.startsWith(class201.field3308)) {
                                                                                                if (var336.startsWith(class98.field1695)) {
                                                                                                    var335 = var335.substring(class98.field1695.length());
                                                                                                    var337 = 1;
                                                                                                } else if (var336.startsWith(class31.field459)) {
                                                                                                    var335 = var335.substring(class31.field459.length());
                                                                                                    var337 = 2;
                                                                                                } else if (var336.startsWith(class273.field4382)) {
                                                                                                    var335 = var335.substring(class273.field4382.length());
                                                                                                    var337 = 3;
                                                                                                } else if (var336.startsWith(class58.field1012)) {
                                                                                                    var335 = var335.substring(class58.field1012.length());
                                                                                                    var337 = 4;
                                                                                                } else if (var336.startsWith(class215.field3627)) {
                                                                                                    var335 = var335.substring(class215.field3627.length());
                                                                                                    var337 = 5;
                                                                                                } else if (!var336.startsWith(class189.field3057)) {
                                                                                                    if (!var336.startsWith(class293.field4672)) {
                                                                                                        if (var336.startsWith(class125.field2190)) {
                                                                                                            var335 = var335.substring(class125.field2190.length());
                                                                                                            var337 = 8;
                                                                                                        } else if (var336.startsWith(class67.field1121)) {
                                                                                                            var335 = var335.substring(class67.field1121.length());
                                                                                                            var337 = 9;
                                                                                                        } else if (!var336.startsWith(class229.field3864)) {
                                                                                                            if (var336.startsWith(class29.field429)) {
                                                                                                                var337 = 11;
                                                                                                                var335 = var335.substring(class29.field429.length());
                                                                                                            }
                                                                                                        } else {
                                                                                                            var335 = var335.substring(class229.field3864.length());
                                                                                                            var337 = 10;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var337 = 7;
                                                                                                        var335 = var335.substring(class293.field4672.length());
                                                                                                    }
                                                                                                } else {
                                                                                                    var335 = var335.substring(class189.field3057.length());
                                                                                                    var337 = 6;
                                                                                                }
                                                                                            } else {
                                                                                                var337 = 0;
                                                                                                var335 = var335.substring(class201.field3308.length());
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var335 = var335.substring(class41.field615.length());
                                                                                        var337 = 7;
                                                                                    }
                                                                                } else {
                                                                                    var337 = 6;
                                                                                    var335 = var335.substring(class258.field4214.length());
                                                                                }
                                                                            } else {
                                                                                var337 = 3;
                                                                                var335 = var335.substring(class262.field4276.length());
                                                                            }
                                                                        } else {
                                                                            var337 = 1;
                                                                            var335 = var335.substring(class162.field2687.length());
                                                                        }
                                                                    } else {
                                                                        var337 = 0;
                                                                        var335 = var335.substring(class243.field3994.length());
                                                                    }
                                                                    byte var338 = 0;
                                                                    String var339 = var335.toLowerCase();
                                                                    if (var339.startsWith(class193.field3118)) {
                                                                        var338 = 1;
                                                                        var335 = var335.substring(class193.field3118.length());
                                                                    } else if (var339.startsWith(class161.field2672)) {
                                                                        var338 = 2;
                                                                        var335 = var335.substring(class161.field2672.length());
                                                                    } else if (!var339.startsWith(class24.field383)) {
                                                                        if (var339.startsWith(class273.field4384)) {
                                                                            var338 = 4;
                                                                            var335 = var335.substring(class273.field4384.length());
                                                                        } else if (!var339.startsWith(class220.field3682)) {
                                                                            if (class212.field3568 != 0) {
                                                                                if (var339.startsWith(class220.field3687)) {
                                                                                    var338 = 1;
                                                                                    var335 = var335.substring(class220.field3687.length());
                                                                                } else if (var339.startsWith(class1.field4)) {
                                                                                    var335 = var335.substring(class1.field4.length());
                                                                                    var338 = 2;
                                                                                } else if (!var339.startsWith(class25.field388)) {
                                                                                    if (!var339.startsWith(class92.field1617)) {
                                                                                        if (var339.startsWith(class21.field332)) {
                                                                                            var335 = var335.substring(class21.field332.length());
                                                                                            var338 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        var338 = 4;
                                                                                        var335 = var335.substring(class92.field1617.length());
                                                                                    }
                                                                                } else {
                                                                                    var338 = 3;
                                                                                    var335 = var335.substring(class25.field388.length());
                                                                                }
                                                                            }
                                                                        } else {
                                                                            var335 = var335.substring(class220.field3682.length());
                                                                            var338 = 5;
                                                                        }
                                                                    } else {
                                                                        var335 = var335.substring(class24.field383.length());
                                                                        var338 = 3;
                                                                    }
                                                                    class168.field2778.method199(34, 115);
                                                                    class168.field2778.method682(0, 22555);
                                                                    int var340 = class168.field2778.field1762;
                                                                    class168.field2778.method682(var337, 22555);
                                                                    class168.field2778.method682(var338, 22555);
                                                                    class184.method1205((byte) 96, var335, class168.field2778);
                                                                    class168.field2778.method661(-var340 + class168.field2778.field1762, (byte) 54);
                                                                    continue;
                                                                }
                                                                if (~var517 == -5010) {
                                                                    var6 -= 2;
                                                                    String var341 = class134.field2330[var6 + 1];
                                                                    String var342 = class134.field2330[var6];
                                                                    if (~class204.field3343 != -1 || (!class66.field1108 || class125.field2196) && !class124.field2186) {
                                                                        class168.field2778.method199(46, 24);
                                                                        ++class171.field2813;
                                                                        class168.field2778.method682(0, 22555);
                                                                        int var343 = class168.field2778.field1762;
                                                                        class168.field2778.method640(21691, class103.method702(!arg0, var342));
                                                                        class184.method1205((byte) 71, var341, class168.field2778);
                                                                        class168.field2778.method661(-var343 + class168.field2778.field1762, (byte) 70);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var517 == -5011) {
                                                                    String var344 = null;
                                                                    --var7;
                                                                    int var345 = class3.field33[var7];
                                                                    if (var345 < 100) {
                                                                        var344 = class192.field3110[var345];
                                                                    }
                                                                    if (var344 == null) {
                                                                        var344 = "";
                                                                    }
                                                                    class134.field2330[var6++] = var344;
                                                                    continue;
                                                                }
                                                                if (var517 == 5011) {
                                                                    String var346 = null;
                                                                    --var7;
                                                                    int var347 = class3.field33[var7];
                                                                    if (~var347 > -101) {
                                                                        var346 = class150.field2515[var347];
                                                                    }
                                                                    if (var346 == null) {
                                                                        var346 = "";
                                                                    }
                                                                    class134.field2330[var6++] = var346;
                                                                    continue;
                                                                }
                                                                if (var517 == 5012) {
                                                                    --var7;
                                                                    int var348 = class3.field33[var7];
                                                                    int var349 = -1;
                                                                    if (var348 < 100) {
                                                                        var349 = class136.field2378[var348];
                                                                    }
                                                                    class3.field33[var7++] = var349;
                                                                    continue;
                                                                }
                                                                if (var517 == 5015) {
                                                                    String var350;
                                                                    if (class273.field4378 != null && class273.field4378.field4601 != null) {
                                                                        var350 = class273.field4378.method1951((byte) -81);
                                                                    } else {
                                                                        var350 = class54.field940;
                                                                    }
                                                                    class134.field2330[var6++] = var350;
                                                                    continue;
                                                                }
                                                                if (var517 == 5016) {
                                                                    class3.field33[var7++] = class68.field1122;
                                                                    continue;
                                                                }
                                                                if (var517 == 5017) {
                                                                    class3.field33[var7++] = class68.field1123;
                                                                    continue;
                                                                }
                                                                if (~var517 == -5051) {
                                                                    --var7;
                                                                    int var351 = class3.field33[var7];
                                                                    class134.field2330[var6++] = class118.method810(107, var351).field4317;
                                                                    continue;
                                                                }
                                                                if (var517 == 5051) {
                                                                    --var7;
                                                                    int var352 = class3.field33[var7];
                                                                    class267 var353 = class118.method810(-117, var352);
                                                                    if (var353.field4311 == null) {
                                                                        class3.field33[var7++] = 0;
                                                                    } else {
                                                                        class3.field33[var7++] = var353.field4311.length;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var517 == 5052) {
                                                                    var7 -= 2;
                                                                    int var354 = class3.field33[var7];
                                                                    int var355 = class3.field33[var7 + 1];
                                                                    class267 var356 = class118.method810(-127, var354);
                                                                    int var357 = var356.field4311[var355];
                                                                    class3.field33[var7++] = var357;
                                                                    continue;
                                                                }
                                                                if (var517 == 5053) {
                                                                    --var7;
                                                                    int var358 = class3.field33[var7];
                                                                    class267 var359 = class118.method810(-117, var358);
                                                                    if (var359.field4313 != null) {
                                                                        class3.field33[var7++] = var359.field4313.length;
                                                                    } else {
                                                                        class3.field33[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var517 == -5055) {
                                                                    var7 -= 2;
                                                                    int var360 = class3.field33[var7 - -1];
                                                                    int var361 = class3.field33[var7];
                                                                    class3.field33[var7++] = class118.method810(-126, var361).field4313[var360];
                                                                    continue;
                                                                }
                                                                if (var517 == 5055) {
                                                                    --var7;
                                                                    int var362 = class3.field33[var7];
                                                                    class134.field2330[var6++] = class113.method795(var362, 237).method843(3044);
                                                                    continue;
                                                                }
                                                                if (var517 == 5056) {
                                                                    --var7;
                                                                    int var363 = class3.field33[var7];
                                                                    class123 var364 = class113.method795(var363, 237);
                                                                    if (var364.field2175 == null) {
                                                                        class3.field33[var7++] = 0;
                                                                    } else {
                                                                        class3.field33[var7++] = var364.field2175.length;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var517 == -5058) {
                                                                    var7 -= 2;
                                                                    int var365 = class3.field33[var7 + 1];
                                                                    int var366 = class3.field33[var7];
                                                                    class3.field33[var7++] = class113.method795(var366, 237).field2175[var365];
                                                                    continue;
                                                                }
                                                                if (var517 == 5058) {
                                                                    class173.field2834 = new class239();
                                                                    --var7;
                                                                    class173.field2834.field3923 = class3.field33[var7];
                                                                    class173.field2834.field3922 = class113.method795(class173.field2834.field3923, 237);
                                                                    class173.field2834.field3926 = new int[class173.field2834.field3922.method840(true)];
                                                                    continue;
                                                                }
                                                                if (var517 == 5059) {
                                                                    class168.field2778.method199(58, 120);
                                                                    class168.field2778.method682(0, 22555);
                                                                    int var367 = class168.field2778.field1762;
                                                                    class168.field2778.method682(0, 22555);
                                                                    ++class281.field4479;
                                                                    class168.field2778.method639(class173.field2834.field3923, 15267);
                                                                    class173.field2834.field3922.method839(class168.field2778, class173.field2834.field3926, (byte) -24);
                                                                    class168.field2778.method661(-var367 + class168.field2778.field1762, (byte) 92);
                                                                    continue;
                                                                }
                                                                if (var517 == 5060) {
                                                                    --var6;
                                                                    String var368 = class134.field2330[var6];
                                                                    ++class142.field2433;
                                                                    class168.field2778.method199(240, 127);
                                                                    class168.field2778.method682(0, 22555);
                                                                    int var369 = class168.field2778.field1762;
                                                                    class168.field2778.method640(21691, class103.method702(true, var368));
                                                                    class168.field2778.method639(class173.field2834.field3923, 15267);
                                                                    class173.field2834.field3922.method839(class168.field2778, class173.field2834.field3926, (byte) -70);
                                                                    class168.field2778.method661(class168.field2778.field1762 - var369, (byte) 45);
                                                                    continue;
                                                                }
                                                                if (var517 == 5061) {
                                                                    class168.field2778.method199(58, 119);
                                                                    ++class281.field4479;
                                                                    class168.field2778.method682(0, 22555);
                                                                    int var370 = class168.field2778.field1762;
                                                                    class168.field2778.method682(1, 22555);
                                                                    class168.field2778.method639(class173.field2834.field3923, 15267);
                                                                    class173.field2834.field3922.method839(class168.field2778, class173.field2834.field3926, (byte) -119);
                                                                    class168.field2778.method661(-var370 + class168.field2778.field1762, (byte) 61);
                                                                    continue;
                                                                }
                                                                if (~var517 == -5063) {
                                                                    var7 -= 2;
                                                                    int var371 = class3.field33[var7 + 1];
                                                                    int var372 = class3.field33[var7];
                                                                    class3.field33[var7++] = class118.method810(-119, var372).field4322[var371];
                                                                    continue;
                                                                }
                                                                if (var517 == 5063) {
                                                                    var7 -= 2;
                                                                    int var373 = class3.field33[var7];
                                                                    int var374 = class3.field33[var7 + 1];
                                                                    class3.field33[var7++] = class118.method810(-125, var373).field4319[var374];
                                                                    continue;
                                                                }
                                                                if (~var517 == -5065) {
                                                                    var7 -= 2;
                                                                    int var375 = class3.field33[var7];
                                                                    int var376 = class3.field33[var7 + 1];
                                                                    if (var376 != -1) {
                                                                        class3.field33[var7++] = class118.method810(-126, var375).method1761((char) var376, 0);
                                                                    } else {
                                                                        class3.field33[var7++] = -1;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var517 == 5065) {
                                                                    var7 -= 2;
                                                                    int var377 = class3.field33[var7];
                                                                    int var378 = class3.field33[var7 + 1];
                                                                    if (var378 != -1) {
                                                                        class3.field33[var7++] = class118.method810(115, var377).method1756((byte) -103, (char) var378);
                                                                    } else {
                                                                        class3.field33[var7++] = -1;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var517 == 5066) {
                                                                    --var7;
                                                                    int var379 = class3.field33[var7];
                                                                    class3.field33[var7++] = class113.method795(var379, 237).method840(true);
                                                                    continue;
                                                                }
                                                                if (~var517 == -5068) {
                                                                    var7 -= 2;
                                                                    int var380 = class3.field33[var7 + 1];
                                                                    int var381 = class3.field33[var7];
                                                                    int var382 = class113.method795(var381, 237).method849(0, var380);
                                                                    class3.field33[var7++] = var382;
                                                                    continue;
                                                                }
                                                                if (var517 == 5068) {
                                                                    var7 -= 2;
                                                                    int var383 = class3.field33[var7];
                                                                    int var384 = class3.field33[var7 + 1];
                                                                    class173.field2834.field3926[var383] = var384;
                                                                    continue;
                                                                }
                                                                if (var517 == 5069) {
                                                                    var7 -= 2;
                                                                    int var385 = class3.field33[var7 + 1];
                                                                    int var386 = class3.field33[var7];
                                                                    class173.field2834.field3926[var386] = var385;
                                                                    continue;
                                                                }
                                                                if (~var517 == -5071) {
                                                                    var7 -= 3;
                                                                    int var387 = class3.field33[var7];
                                                                    int var388 = class3.field33[var7 + 1];
                                                                    int var389 = class3.field33[var7 - -2];
                                                                    class123 var390 = class113.method795(var387, 237);
                                                                    if (var390.method849(0, var388) != 0) {
                                                                        throw new RuntimeException("bad command");
                                                                    }
                                                                    class3.field33[var7++] = var390.method846(var389, (byte) -85, var388);
                                                                    continue;
                                                                }
                                                                if (var517 == 5071) {
                                                                    --var7;
                                                                    boolean var391 = class3.field33[var7] == 1;
                                                                    --var6;
                                                                    String var392 = class134.field2330[var6];
                                                                    class286.method1910(var392, true, var391);
                                                                    class3.field33[var7++] = class190.field3079;
                                                                    continue;
                                                                }
                                                                if (var517 == 5072) {
                                                                    if (class27.field413 != null && ~class178.field2930 > ~class190.field3079) {
                                                                        class3.field33[var7++] = class113.method791(class27.field413[class178.field2930++], 65535);
                                                                        continue;
                                                                    }
                                                                    class3.field33[var7++] = -1;
                                                                    continue;
                                                                }
                                                                if (~var517 == -5074) {
                                                                    class178.field2930 = 0;
                                                                    continue;
                                                                }
                                                            }
                                                        } else if (var517 == 4500) {
                                                            var7 -= 2;
                                                            int var393 = class3.field33[var7];
                                                            int var394 = class3.field33[var7 + 1];
                                                            class2 var395 = class119.method816(var394, (byte) 77);
                                                            if (!var395.method14(false)) {
                                                                class3.field33[var7++] = class245.method1641(var393, -3).method1013(var394, var395.field25, 105);
                                                            } else {
                                                                class134.field2330[var6++] = class245.method1641(var393, -3).method1019(var394, var395.field18, (byte) 124);
                                                            }
                                                            continue;
                                                        }
                                                    } else {
                                                        if (var517 == 4000) {
                                                            var7 -= 2;
                                                            int var396 = class3.field33[var7];
                                                            int var397 = class3.field33[var7 - -1];
                                                            class3.field33[var7++] = var396 + var397;
                                                            continue;
                                                        }
                                                        if (var517 == 4001) {
                                                            var7 -= 2;
                                                            int var398 = class3.field33[var7 + 1];
                                                            int var399 = class3.field33[var7];
                                                            class3.field33[var7++] = -var398 + var399;
                                                            continue;
                                                        }
                                                        if (var517 == 4002) {
                                                            var7 -= 2;
                                                            int var400 = class3.field33[var7 + 1];
                                                            int var401 = class3.field33[var7];
                                                            class3.field33[var7++] = var400 * var401;
                                                            continue;
                                                        }
                                                        if (var517 == 4003) {
                                                            var7 -= 2;
                                                            int var402 = class3.field33[var7];
                                                            int var403 = class3.field33[var7 + 1];
                                                            class3.field33[var7++] = var402 / var403;
                                                            continue;
                                                        }
                                                        if (~var517 == -4005) {
                                                            --var7;
                                                            int var404 = class3.field33[var7];
                                                            class3.field33[var7++] = (int) ((double) var404 * Math.random());
                                                            continue;
                                                        }
                                                        if (~var517 == -4006) {
                                                            --var7;
                                                            int var405 = class3.field33[var7];
                                                            class3.field33[var7++] = (int) (Math.random() * (double) (var405 + 1));
                                                            continue;
                                                        }
                                                        if (~var517 == -4007) {
                                                            var7 -= 5;
                                                            int var406 = class3.field33[var7];
                                                            int var407 = class3.field33[var7 + 1];
                                                            int var408 = class3.field33[var7 + 2];
                                                            int var409 = class3.field33[var7 + 3];
                                                            int var410 = class3.field33[var7 - -4];
                                                            class3.field33[var7++] = (-var406 + var407) * (-var408 + var410) / (-var408 + var409) + var406;
                                                            continue;
                                                        }
                                                        if (var517 == 4007) {
                                                            var7 -= 2;
                                                            long var411 = (long) class3.field33[var7];
                                                            long var413 = (long) class3.field33[var7 + 1];
                                                            class3.field33[var7++] = (int) (var411 - -(var411 * var413 / 100L));
                                                            continue;
                                                        }
                                                        if (~var517 == -4009) {
                                                            var7 -= 2;
                                                            int var415 = class3.field33[var7];
                                                            int var416 = class3.field33[var7 + 1];
                                                            class3.field33[var7++] = class112.method789(1 << var416, var415);
                                                            continue;
                                                        }
                                                        if (~var517 == -4010) {
                                                            var7 -= 2;
                                                            int var417 = class3.field33[var7 - -1];
                                                            int var418 = class3.field33[var7];
                                                            class3.field33[var7++] = class113.method791(-(1 << var417) + -1, var418);
                                                            continue;
                                                        }
                                                        if (~var517 == -4011) {
                                                            var7 -= 2;
                                                            int var419 = class3.field33[var7 + 1];
                                                            int var420 = class3.field33[var7];
                                                            class3.field33[var7++] = class113.method791(var420, 1 << var419) == 0 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (~var517 == -4012) {
                                                            var7 -= 2;
                                                            int var421 = class3.field33[var7];
                                                            int var422 = class3.field33[var7 - -1];
                                                            class3.field33[var7++] = var421 % var422;
                                                            continue;
                                                        }
                                                        if (var517 == 4012) {
                                                            var7 -= 2;
                                                            int var423 = class3.field33[var7];
                                                            int var424 = class3.field33[var7 + 1];
                                                            if (var423 == 0) {
                                                                class3.field33[var7++] = 0;
                                                            } else {
                                                                class3.field33[var7++] = (int) Math.pow((double) var423, (double) var424);
                                                            }
                                                            continue;
                                                        }
                                                        if (~var517 == -4014) {
                                                            var7 -= 2;
                                                            int var425 = class3.field33[var7];
                                                            int var426 = class3.field33[var7 - -1];
                                                            if (~var425 == -1) {
                                                                class3.field33[var7++] = 0;
                                                            } else if (~var426 != -1) {
                                                                class3.field33[var7++] = (int) Math.pow((double) var425, 1.0D / (double) var426);
                                                            } else {
                                                                class3.field33[var7++] = Integer.MAX_VALUE;
                                                            }
                                                            continue;
                                                        }
                                                        if (~var517 == -4015) {
                                                            var7 -= 2;
                                                            int var427 = class3.field33[var7];
                                                            int var428 = class3.field33[var7 + 1];
                                                            class3.field33[var7++] = class113.method791(var427, var428);
                                                            continue;
                                                        }
                                                        if (~var517 == -4016) {
                                                            var7 -= 2;
                                                            int var429 = class3.field33[var7];
                                                            int var430 = class3.field33[var7 + 1];
                                                            class3.field33[var7++] = class112.method789(var430, var429);
                                                            continue;
                                                        }
                                                        if (var517 == 4016) {
                                                            var7 -= 2;
                                                            int var431 = class3.field33[var7];
                                                            int var432 = class3.field33[var7 - -1];
                                                            class3.field33[var7++] = ~var431 <= ~var432 ? var432 : var431;
                                                            continue;
                                                        }
                                                        if (~var517 == -4018) {
                                                            var7 -= 2;
                                                            int var433 = class3.field33[var7];
                                                            int var434 = class3.field33[var7 + 1];
                                                            class3.field33[var7++] = ~var433 >= ~var434 ? var434 : var433;
                                                            continue;
                                                        }
                                                        if (~var517 == -4019) {
                                                            var7 -= 3;
                                                            long var435 = (long) class3.field33[var7 + 1];
                                                            long var437 = (long) class3.field33[var7];
                                                            long var439 = (long) class3.field33[var7 - -2];
                                                            class3.field33[var7++] = (int) (var437 * var439 / var435);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (var517 == 3600) {
                                                        if (~class3.field32 != -1) {
                                                            if (class3.field32 == 1) {
                                                                class3.field33[var7++] = -1;
                                                            } else {
                                                                class3.field33[var7++] = class228.field3837;
                                                            }
                                                        } else {
                                                            class3.field33[var7++] = -2;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var517 == -3602) {
                                                        --var7;
                                                        int var441 = class3.field33[var7];
                                                        if (class3.field32 == 2 && class228.field3837 > var441) {
                                                            class134.field2330[var6++] = class5.field63[var441];
                                                            continue;
                                                        }
                                                        class134.field2330[var6++] = "";
                                                        continue;
                                                    }
                                                    if (var517 == 3602) {
                                                        --var7;
                                                        int var442 = class3.field33[var7];
                                                        if (~class3.field32 == -3 && class228.field3837 > var442) {
                                                            class3.field33[var7++] = class274.field4393[var442];
                                                            continue;
                                                        }
                                                        class3.field33[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (var517 == 3603) {
                                                        --var7;
                                                        int var443 = class3.field33[var7];
                                                        if (~class3.field32 == -3 && var443 < class228.field3837) {
                                                            class3.field33[var7++] = class175.field2872[var443];
                                                            continue;
                                                        }
                                                        class3.field33[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (var517 == 3604) {
                                                        --var6;
                                                        String var444 = class134.field2330[var6];
                                                        --var7;
                                                        int var445 = class3.field33[var7];
                                                        class96.method609(var444, var445, 239);
                                                        continue;
                                                    }
                                                    if (var517 == 3605) {
                                                        --var6;
                                                        String var446 = class134.field2330[var6];
                                                        class295.method1985(class103.method702(!arg0, var446), -21951);
                                                        continue;
                                                    }
                                                    if (~var517 == -3607) {
                                                        --var6;
                                                        String var447 = class134.field2330[var6];
                                                        class205.method1354(class103.method702(true, var447), 63);
                                                        continue;
                                                    }
                                                    if (var517 == 3607) {
                                                        --var6;
                                                        String var448 = class134.field2330[var6];
                                                        class248.method1660((byte) -117, class103.method702(true, var448), false);
                                                        continue;
                                                    }
                                                    if (var517 == 3608) {
                                                        --var6;
                                                        String var449 = class134.field2330[var6];
                                                        class285.method1905(127, class103.method702(true, var449));
                                                        continue;
                                                    }
                                                    if (~var517 == -3610) {
                                                        --var6;
                                                        String var450 = class134.field2330[var6];
                                                        if (var450.startsWith("<img=0>") || var450.startsWith("<img=1>")) {
                                                            var450 = var450.substring(7);
                                                        }
                                                        class3.field33[var7++] = class270.method1773(var450, (byte) -48) ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (~var517 == -3611) {
                                                        --var7;
                                                        int var451 = class3.field33[var7];
                                                        if (~class3.field32 == -3 && ~var451 > ~class228.field3837) {
                                                            class134.field2330[var6++] = class276.field4410[var451];
                                                            continue;
                                                        }
                                                        class134.field2330[var6++] = "";
                                                        continue;
                                                    }
                                                    if (~var517 == -3612) {
                                                        if (class191.field3088 == null) {
                                                            class134.field2330[var6++] = "";
                                                        } else {
                                                            class134.field2330[var6++] = class9.method55((byte) 77, class191.field3088);
                                                        }
                                                        continue;
                                                    }
                                                    if (~var517 == -3613) {
                                                        if (class191.field3088 != null) {
                                                            class3.field33[var7++] = class139.field2402;
                                                        } else {
                                                            class3.field33[var7++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var517 == -3614) {
                                                        --var7;
                                                        int var452 = class3.field33[var7];
                                                        if (class191.field3088 != null && class139.field2402 > var452) {
                                                            class134.field2330[var6++] = class9.method55((byte) 77, class182.field2972[var452].field1574);
                                                            continue;
                                                        }
                                                        class134.field2330[var6++] = "";
                                                        continue;
                                                    }
                                                    if (~var517 == -3615) {
                                                        --var7;
                                                        int var453 = class3.field33[var7];
                                                        if (class191.field3088 != null && ~var453 > ~class139.field2402) {
                                                            class3.field33[var7++] = class182.field2972[var453].field1576;
                                                            continue;
                                                        }
                                                        class3.field33[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (~var517 == -3616) {
                                                        --var7;
                                                        int var454 = class3.field33[var7];
                                                        if (class191.field3088 != null && ~var454 > ~class139.field2402) {
                                                            class3.field33[var7++] = class182.field2972[var454].field1567;
                                                            continue;
                                                        }
                                                        class3.field33[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (~var517 == -3617) {
                                                        class3.field33[var7++] = class195.field3148;
                                                        continue;
                                                    }
                                                    if (var517 == 3617) {
                                                        --var6;
                                                        String var455 = class134.field2330[var6];
                                                        class82.method539(false, var455);
                                                        continue;
                                                    }
                                                    if (var517 == 3618) {
                                                        class3.field33[var7++] = class292.field4662;
                                                        continue;
                                                    }
                                                    if (~var517 == -3620) {
                                                        --var6;
                                                        String var456 = class134.field2330[var6];
                                                        class210.method1410(1605, class103.method702(true, var456));
                                                        continue;
                                                    }
                                                    if (~var517 == -3621) {
                                                        class281.method1834(-20476);
                                                        continue;
                                                    }
                                                    if (~var517 == -3622) {
                                                        if (class3.field32 != 0) {
                                                            class3.field33[var7++] = class90.field1589;
                                                        } else {
                                                            class3.field33[var7++] = -1;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var517 == -3623) {
                                                        --var7;
                                                        int var457 = class3.field33[var7];
                                                        if (~class3.field32 != -1 && ~class90.field1589 < ~var457) {
                                                            class134.field2330[var6++] = class21.method146(class237.field3906[var457], (byte) -115);
                                                            continue;
                                                        }
                                                        class134.field2330[var6++] = "";
                                                        continue;
                                                    }
                                                    if (~var517 == -3624) {
                                                        --var6;
                                                        String var458 = class134.field2330[var6];
                                                        if (var458.startsWith("<img=0>") || var458.startsWith("<img=1>")) {
                                                            var458 = var458.substring(7);
                                                        }
                                                        class3.field33[var7++] = !class144.method1001(0, var458) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var517 == 3624) {
                                                        --var7;
                                                        int var459 = class3.field33[var7];
                                                        if (class182.field2972 != null && class139.field2402 > var459 && class182.field2972[var459].field1574.equalsIgnoreCase(class273.field4378.field4601)) {
                                                            class3.field33[var7++] = 1;
                                                            continue;
                                                        }
                                                        class3.field33[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (~var517 == -3626) {
                                                        if (client.field4536 != null) {
                                                            class134.field2330[var6++] = class9.method55((byte) 77, client.field4536);
                                                        } else {
                                                            class134.field2330[var6++] = "";
                                                        }
                                                        continue;
                                                    }
                                                    if (~var517 == -3627) {
                                                        --var7;
                                                        int var460 = class3.field33[var7];
                                                        if (class191.field3088 != null && ~class139.field2402 < ~var460) {
                                                            class134.field2330[var6++] = class182.field2972[var460].field1570;
                                                            continue;
                                                        }
                                                        class134.field2330[var6++] = "";
                                                        continue;
                                                    }
                                                    if (var517 == 3627) {
                                                        --var7;
                                                        int var461 = class3.field33[var7];
                                                        if (~class3.field32 == -3 && ~var461 <= -1 && class228.field3837 > var461) {
                                                            class3.field33[var7++] = !class143.field2459[var461] ? 0 : 1;
                                                            continue;
                                                        }
                                                        class3.field33[var7++] = 0;
                                                        continue;
                                                    }
                                                    if (~var517 == -3629) {
                                                        --var6;
                                                        String var462 = class134.field2330[var6];
                                                        if (var462.startsWith("<img=0>") || var462.startsWith("<img=1>")) {
                                                            var462 = var462.substring(7);
                                                        }
                                                        class3.field33[var7++] = class286.method1907(var462, (byte) -114);
                                                        continue;
                                                    }
                                                    if (var517 == 3629) {
                                                        class3.field33[var7++] = class107.field1910;
                                                        continue;
                                                    }
                                                    if (~var517 == -3631) {
                                                        --var6;
                                                        String var463 = class134.field2330[var6];
                                                        class248.method1660((byte) -127, class103.method702(true, var463), true);
                                                        continue;
                                                    }
                                                    if (~var517 == -3632) {
                                                        --var7;
                                                        int var464 = class3.field33[var7];
                                                        class3.field33[var7++] = !class188.field3046[var464] ? 0 : 1;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (var517 == 3400) {
                                                    var7 -= 2;
                                                    int var465 = class3.field33[var7];
                                                    int var466 = class3.field33[var7 + 1];
                                                    class127 var467 = class135.method946(8792, var465);
                                                    class134.field2330[var6++] = var467.method868(var466, -4);
                                                    continue;
                                                }
                                                if (var517 == 3408) {
                                                    var7 -= 4;
                                                    int var468 = class3.field33[var7];
                                                    int var469 = class3.field33[var7 - -1];
                                                    int var470 = class3.field33[var7 + 2];
                                                    int var471 = class3.field33[var7 - -3];
                                                    class127 var472 = class135.method946(8792, var470);
                                                    if (var472.field2230 == var468 && ~var472.field2236 == ~var469) {
                                                        if (var469 != 115) {
                                                            class3.field33[var7++] = var472.method873(var471, (byte) -100);
                                                        } else {
                                                            class134.field2330[var6++] = var472.method868(var471, -4);
                                                        }
                                                        continue;
                                                    }
                                                    throw new RuntimeException("C3408-1");
                                                }
                                                if (var517 == 3409) {
                                                    var7 -= 3;
                                                    int var473 = class3.field33[var7];
                                                    int var474 = class3.field33[var7 + 2];
                                                    int var475 = class3.field33[var7 + 1];
                                                    if (~var475 == 0) {
                                                        throw new RuntimeException("C3409-2");
                                                    }
                                                    class127 var476 = class135.method946(8792, var475);
                                                    if (var476.field2236 != var473) {
                                                        throw new RuntimeException("C3409-1");
                                                    }
                                                    class3.field33[var7++] = !var476.method871(var474, 9382) ? 0 : 1;
                                                    continue;
                                                }
                                                if (var517 == 3410) {
                                                    --var7;
                                                    int var477 = class3.field33[var7];
                                                    --var6;
                                                    String var478 = class134.field2330[var6];
                                                    if (~var477 == 0) {
                                                        throw new RuntimeException("C3410-2");
                                                    }
                                                    class127 var479 = class135.method946(8792, var477);
                                                    if (var479.field2236 != 's') {
                                                        throw new RuntimeException("C3410-1");
                                                    }
                                                    class3.field33[var7++] = !var479.method870((byte) -117, var478) ? 0 : 1;
                                                    continue;
                                                }
                                                if (~var517 == -3412) {
                                                    --var7;
                                                    int var480 = class3.field33[var7];
                                                    class127 var481 = class135.method946(8792, var480);
                                                    class3.field33[var7++] = var481.field2232.method778(0);
                                                    continue;
                                                }
                                            }
                                        } else {
                                            --var7;
                                            class46 var482 = class108.method760(-29533, class3.field33[var7]);
                                            if (~var517 == -2501) {
                                                class3.field33[var7++] = var482.field758;
                                                continue;
                                            }
                                            if (~var517 == -2502) {
                                                class3.field33[var7++] = var482.field806;
                                                continue;
                                            }
                                            if (var517 == 2502) {
                                                class3.field33[var7++] = var482.field701;
                                                continue;
                                            }
                                            if (~var517 == -2504) {
                                                class3.field33[var7++] = var482.field715;
                                                continue;
                                            }
                                            if (~var517 == -2505) {
                                                class3.field33[var7++] = !var482.field726 ? 0 : 1;
                                                continue;
                                            }
                                            if (~var517 == -2506) {
                                                class3.field33[var7++] = var482.field660;
                                                continue;
                                            }
                                        }
                                    } else {
                                        class46 var483 = !var46 ? class192.field3107 : class67.field1120;
                                        if (~var517 == -1501) {
                                            class3.field33[var7++] = var483.field758;
                                            continue;
                                        }
                                        if (~var517 == -1502) {
                                            class3.field33[var7++] = var483.field806;
                                            continue;
                                        }
                                        if (var517 == 1502) {
                                            class3.field33[var7++] = var483.field701;
                                            continue;
                                        }
                                        if (var517 == 1503) {
                                            class3.field33[var7++] = var483.field715;
                                            continue;
                                        }
                                        if (var517 == 1504) {
                                            class3.field33[var7++] = !var483.field726 ? 0 : 1;
                                            continue;
                                        }
                                        if (var517 == 1505) {
                                            class3.field33[var7++] = var483.field660;
                                            continue;
                                        }
                                    }
                                } else {
                                    class46 var491;
                                    if (var517 >= 2000) {
                                        var517 -= 1000;
                                        --var7;
                                        var491 = class108.method760(-29533, class3.field33[var7]);
                                    } else {
                                        var491 = var46 ? class67.field1120 : class192.field3107;
                                    }
                                    if (~var517 == -1301) {
                                        --var7;
                                        int var492 = class3.field33[var7] + -1;
                                        if (~var492 <= -1 && var492 <= 9) {
                                            --var6;
                                            var491.method282(var492, 0, class134.field2330[var6]);
                                            continue;
                                        }
                                        --var6;
                                        continue;
                                    }
                                    if (~var517 == -1302) {
                                        var7 -= 2;
                                        int var493 = class3.field33[var7];
                                        int var494 = class3.field33[var7 + 1];
                                        var491.field680 = class285.method1902(var493, var494, 5);
                                        continue;
                                    }
                                    if (var517 == 1302) {
                                        --var7;
                                        var491.field717 = class3.field33[var7] == 1;
                                        continue;
                                    }
                                    if (~var517 == -1304) {
                                        --var7;
                                        var491.field818 = class3.field33[var7];
                                        continue;
                                    }
                                    if (var517 == 1304) {
                                        --var7;
                                        var491.field768 = class3.field33[var7];
                                        continue;
                                    }
                                    if (~var517 == -1306) {
                                        --var6;
                                        var491.field699 = class134.field2330[var6];
                                        continue;
                                    }
                                    if (~var517 == -1307) {
                                        --var6;
                                        var491.field780 = class134.field2330[var6];
                                        continue;
                                    }
                                    if (~var517 == -1308) {
                                        var491.field725 = null;
                                        continue;
                                    }
                                    if (~var517 == -1309) {
                                        --var7;
                                        var491.field673 = class3.field33[var7];
                                        --var7;
                                        var491.field663 = class3.field33[var7];
                                        continue;
                                    }
                                    if (~var517 == -1310) {
                                        --var7;
                                        int var495 = class3.field33[var7];
                                        --var7;
                                        int var496 = class3.field33[var7];
                                        if (var496 >= 1 && var496 <= 10) {
                                            var491.method285((byte) -33, var496 + -1, var495);
                                        }
                                        continue;
                                    }
                                    if (var517 == 1310) {
                                        --var6;
                                        var491.field807 = class134.field2330[var6];
                                        continue;
                                    }
                                }
                            } else {
                                class46 var501;
                                if (var517 >= 2000) {
                                    var517 -= 1000;
                                    --var7;
                                    var501 = class108.method760(-29533, class3.field33[var7]);
                                } else {
                                    var501 = !var46 ? class192.field3107 : class67.field1120;
                                }
                                if (var517 == 1100) {
                                    var7 -= 2;
                                    var501.field733 = class3.field33[var7];
                                    if (-var501.field701 + var501.field665 < var501.field733) {
                                        var501.field733 = -var501.field701 + var501.field665;
                                    }
                                    if (~var501.field733 > -1) {
                                        var501.field733 = 0;
                                    }
                                    var501.field644 = class3.field33[var7 + 1];
                                    if (~(var501.field666 - var501.field715) > ~var501.field644) {
                                        var501.field644 = -var501.field715 + var501.field666;
                                    }
                                    if (~var501.field644 > -1) {
                                        var501.field644 = 0;
                                    }
                                    class79.method516(-373, var501);
                                    if (var501.field704 == -1) {
                                        class134.method928(true, var501.field786);
                                    }
                                    continue;
                                }
                                if (~var517 == -1102) {
                                    --var7;
                                    var501.field679 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    if (var501.field704 == -1) {
                                        class126.method863(6, var501.field786);
                                    }
                                    continue;
                                }
                                if (var517 == 1102) {
                                    --var7;
                                    var501.field713 = ~class3.field33[var7] == -2;
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1104) {
                                    --var7;
                                    var501.field678 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1105) {
                                    --var7;
                                    var501.field683 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (var517 == 1105) {
                                    --var7;
                                    var501.field672 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1107) {
                                    --var7;
                                    var501.field762 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1108) {
                                    --var7;
                                    var501.field650 = ~class3.field33[var7] == -2;
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1109) {
                                    var501.field748 = 1;
                                    --var7;
                                    var501.field653 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    if (~var501.field704 == 0) {
                                        class14.method86(var501.field786, 14130);
                                    }
                                    continue;
                                }
                                if (~var517 == -1110) {
                                    var7 -= 6;
                                    var501.field819 = class3.field33[var7];
                                    var501.field788 = class3.field33[var7 + 1];
                                    var501.field741 = class3.field33[var7 + 2];
                                    var501.field816 = class3.field33[var7 + 3];
                                    var501.field803 = class3.field33[var7 + 4];
                                    var501.field746 = class3.field33[var7 - -5];
                                    class79.method516(-373, var501);
                                    if (var501.field704 == -1) {
                                        class58.method358(var501.field786, 0);
                                        class205.method1359(false, var501.field786);
                                    }
                                    continue;
                                }
                                if (var517 == 1110) {
                                    --var7;
                                    int var502 = class3.field33[var7];
                                    if (~var501.field708 != ~var502) {
                                        var501.field760 = 0;
                                        var501.field708 = var502;
                                        var501.field643 = 1;
                                        var501.field802 = 0;
                                        class79.method516(-373, var501);
                                    }
                                    if (~var501.field704 == 0) {
                                        class193.method1266(118, var501.field786);
                                    }
                                    continue;
                                }
                                if (~var517 == -1112) {
                                    --var7;
                                    var501.field690 = ~class3.field33[var7] == -2;
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1113) {
                                    --var6;
                                    String var503 = class134.field2330[var6];
                                    if (!var503.equals(var501.field759)) {
                                        var501.field759 = var503;
                                        class79.method516(-373, var501);
                                    }
                                    if (~var501.field704 == 0) {
                                        class77.method470(var501.field786, 0);
                                    }
                                    continue;
                                }
                                if (var517 == 1113) {
                                    --var7;
                                    var501.field755 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1115) {
                                    var7 -= 3;
                                    var501.field662 = class3.field33[var7];
                                    var501.field781 = class3.field33[var7 + 1];
                                    var501.field687 = class3.field33[var7 + 2];
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1116) {
                                    --var7;
                                    var501.field820 = class3.field33[var7] == 1;
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (var517 == 1116) {
                                    --var7;
                                    var501.field661 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1118) {
                                    --var7;
                                    var501.field703 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (var517 == 1118) {
                                    --var7;
                                    var501.field808 = ~class3.field33[var7] == -2;
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1120) {
                                    --var7;
                                    var501.field782 = class3.field33[var7] == 1;
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (var517 == 1120) {
                                    var7 -= 2;
                                    var501.field665 = class3.field33[var7];
                                    var501.field666 = class3.field33[var7 - -1];
                                    class79.method516(-373, var501);
                                    if (var501.field812 == 0) {
                                        class89.method580(true, false, var501);
                                    }
                                    continue;
                                }
                                if (~var517 == -1122) {
                                    class79.method516(-373, var501);
                                    var7 -= 2;
                                    continue;
                                }
                                if (~var517 == -1123) {
                                    --var7;
                                    var501.field775 = ~class3.field33[var7] == -2;
                                    class79.method516(-373, var501);
                                    continue;
                                }
                                if (~var517 == -1124) {
                                    --var7;
                                    var501.field746 = class3.field33[var7];
                                    class79.method516(-373, var501);
                                    if (~var501.field704 == 0) {
                                        class58.method358(var501.field786, 0);
                                    }
                                    continue;
                                }
                                if (~var517 == -1125) {
                                    --var7;
                                    int var504 = class3.field33[var7];
                                    var501.field707 = var504 == 1;
                                    class79.method516(-373, var501);
                                    continue;
                                }
                            }
                        } else {
                            class46 var62;
                            if (~var517 <= -2001) {
                                --var7;
                                var62 = class108.method760(-29533, class3.field33[var7]);
                                var517 -= 1000;
                            } else {
                                var62 = var46 ? class67.field1120 : class192.field3107;
                            }
                            if (~var517 == -1001) {
                                var7 -= 4;
                                var62.field740 = class3.field33[var7];
                                var62.field645 = class3.field33[var7 + 1];
                                int var63 = class3.field33[var7 + 2];
                                int var64 = class3.field33[var7 + 3];
                                if (var63 >= 0) {
                                    if (~var63 < -6) {
                                        var63 = 5;
                                    }
                                } else {
                                    var63 = 0;
                                }
                                var62.field692 = (byte) var63;
                                if (var64 < 0) {
                                    var64 = 0;
                                } else if (~var64 < -6) {
                                    var64 = 5;
                                }
                                var62.field770 = (byte) var64;
                                class79.method516(-373, var62);
                                class237.method1568((byte) -60, var62);
                                if (var62.field704 == -1) {
                                    class121.method825(69, var62.field786);
                                }
                                continue;
                            }
                            if (~var517 == -1002) {
                                var7 -= 4;
                                var62.field688 = class3.field33[var7];
                                var62.field696 = class3.field33[var7 + 1];
                                var62.field813 = 0;
                                var62.field677 = 0;
                                int var65 = class3.field33[var7 + 3];
                                if (~var65 > -1) {
                                    var65 = 0;
                                } else if (~var65 < -5) {
                                    var65 = 4;
                                }
                                int var66 = class3.field33[var7 + 2];
                                var62.field718 = (byte) var65;
                                if (var66 >= 0) {
                                    if (~var66 < -5) {
                                        var66 = 4;
                                    }
                                } else {
                                    var66 = 0;
                                }
                                var62.field674 = (byte) var66;
                                class79.method516(-373, var62);
                                class237.method1568((byte) -60, var62);
                                if (~var62.field812 == -1) {
                                    class89.method580(!arg0, false, var62);
                                }
                                continue;
                            }
                            if (var517 == 1003) {
                                --var7;
                                boolean var67 = ~class3.field33[var7] == -2;
                                if (!var62.field726 == var67) {
                                    var62.field726 = var67;
                                    class79.method516(-373, var62);
                                }
                                if (~var62.field704 == 0) {
                                    class203.method1343(0, var62.field786);
                                }
                                continue;
                            }
                            if (~var517 == -1005) {
                                var7 -= 2;
                                var62.field728 = class3.field33[var7];
                                var62.field736 = class3.field33[var7 + 1];
                                class79.method516(-373, var62);
                                class237.method1568((byte) -60, var62);
                                if (var62.field812 == 0) {
                                    class89.method580(true, false, var62);
                                }
                                continue;
                            }
                            if (~var517 == -1006) {
                                --var7;
                                var62.field652 = ~class3.field33[var7] == -2;
                                continue;
                            }
                        }
                        throw new IllegalStateException();
                    }
                } catch (Exception var516) {
                    if (var5.field2802 != null) {
                        StringBuffer var513 = new StringBuffer(30);
                        var513.append("%0a - in: ").append(var5.field2802);
                        for (int var514 = class80.field1373 + -1; ~var514 <= -1; --var514) {
                            var513.append("%0a - via: ").append(class112.field2014[var514].field2548.field2802);
                        }
                        if (var11 == 40) {
                            int var515 = var10[var8];
                            var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                        }
                        if (class225.field3780 != 0) {
                            class97.method612("Clientscript error in: " + var5.field2802, -1, 0, "");
                        }
                        class254.method1684(-119, var516, "CS2 - scr:" + var5.field1515 + " op:" + var11 + var513.toString());
                    } else {
                        if (class225.field3780 != 0) {
                            class97.method612("Clientscript error - check log for details", -1, 0, "");
                        }
                        class254.method1684(121, var516, "CS2 - scr:" + var5.field1515 + " op:" + var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (arg0 >= 66) {
            class76.method465(126);
            ++field2407;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field2411;
        if (arg0 <= 39) {
            this.method22(-31);
        }
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 1, arg1);
            int[] var5 = this.method1805(false, 2, arg1);
            for (int var6 = 0; var6 < class53.field929; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field2405 >> 12;
                int var9 = class42.field620[var7] * var8 >> 12;
                int var10 = class156.field2613[var7] * var8 >> 12;
                int var11 = class35.field504 & var6 - -(var9 >> 12);
                int var12 = class125.field2189 & (var10 >> 12) + arg1;
                int[] var13 = this.method1805(false, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2409 = null;
        if (arg0 != 0) {
            field2412 = 116L;
        }
        field2415 = null;
    }
}
