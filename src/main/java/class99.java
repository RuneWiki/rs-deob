import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class99 extends class419 {

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "F")
    private float field1435 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "F")
    private float field1442 = -3.4028235E38F;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "Low;")
    private class665 field1444 = new class665();

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "Lmj;")
    public class114 field1440;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "[[[I")
    public int[][][] field1458;

    @OriginalMember(owner = "client!sl", name = "hb", descriptor = "[[B")
    private byte[][] field1473;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "[[[I")
    private int[][][] field1432;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "[[[I")
    public int[][][] field1443;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "[[B")
    private byte[][] field1451;

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "[[F")
    private float[][] field1469;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "[[F")
    private float[][] field1465;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "[[[Lbk;")
    private class124[][][] field1439;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "[[S")
    public short[][] field1460;

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "[[F")
    private float[][] field1468;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "[[[I")
    public int[][][] field1455;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "[[[I")
    private int[][][] field1428;

    @OriginalMember(owner = "client!sl", name = "jb", descriptor = "Lsi;")
    private class769 field1475;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "Lkda;")
    private class492 field1454;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1449 = Calendar.getInstance();

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1438 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!sl", name = "gb", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "Lija;")
    public class161 field1466;

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "Lwba;")
    private class601 field1470;

    @OriginalMember(owner = "client!sl", name = "fb", descriptor = "Lwba;")
    private class601 field1471;

    @OriginalMember(owner = "client!sl", name = "ib", descriptor = "[Lbk;")
    private class124[] field1474;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "[[[I")
    private int[][][] field1456;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public static void method814(int arg0) {
        field1449 = null;
        field1438 = null;
        if (arg0 >= -93) {
            method820(-31, 83);
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)Lvi;")
    public static final class302 method815(int arg0) {
        ++field1436;
        class302 var1 = class552.method3185((byte) 86);
        var1.field4338 = 0;
        if (arg0 != -18016) {
            method814(123);
        }
        var1.field4332 = null;
        var1.field4341 = new class373(5000);
        return var1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III[[ZZI)V")
    public final void method816(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method822(arg2, arg3, arg4, -1, -1885224318, arg5, arg1, arg0);
        ++field1450;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III[[ZZII)V")
    public final void method817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method822(arg2, arg3, arg4, arg5, -1885224318, arg6, arg1, arg0);
        ++field1463;
    }

    @OriginalMember(owner = "client!sl", name = "YA", descriptor = "()V")
    public final void method818() {
        ++field1445;
        if (this.field1467 > 0) {
            byte[][] var1 = new byte[super.field5808 - -1][super.field5809 + 1];
            for (int var2 = 1; ~var2 > ~super.field5808; ++var2) {
                for (int var107 = 1; super.field5809 > var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field1473[var2][var107 + 1] >> 3) + (this.field1473[var2 + -1][var107] >> 2) + (this.field1473[var2 + 1][var107] >> 3) + (this.field1473[var2][var107 + -1] >> 2) + (this.field1473[var2][var107] >> 1));
                }
            }
            class124[] var3 = new class124[this.field1475.method4257(125)];
            this.field1475.method4256(5669, var3);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method1073(this.field1467, 65535);
            }
            int var5 = 20;
            if (this.field1456 != null) {
                var5 += 4;
            }
            if ((this.field1433 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field1440.field1670.method2247(this.field1467 * 4, false);
            NativeHeapBuffer var7 = this.field1440.field1670.method2247(this.field1467 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class124[] var10 = new class124[this.field1467];
            int var11 = class515.method3025(this.field1467 / 4, 592877665);
            if (var11 < 1) {
                var11 = 1;
            }
            class769 var12 = new class769(var11);
            class124[] var13 = new class124[this.field1472];
            for (int var14 = 0; var14 < super.field5808; ++var14) {
                for (int var34 = 0; var34 < super.field5809; ++var34) {
                    if (this.field1458[var14][var34] != null) {
                        class124[] var35 = this.field1439[var14][var34];
                        int[] var36 = this.field1455[var14][var34];
                        int[] var37 = this.field1443[var14][var34];
                        int[] var38 = this.field1432[var14][var34];
                        int[] var39 = this.field1458[var14][var34];
                        int[] var40 = this.field1428 == null ? null : this.field1428[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field1456 == null ? null : this.field1456[var14][var34];
                        float var42 = this.field1469[var14][var34];
                        float var43 = this.field1465[var14][var34];
                        float var44 = this.field1468[var14][var34];
                        float var45 = this.field1469[var14][var34 - -1];
                        float var46 = this.field1465[var14][var34 + 1];
                        float var47 = this.field1468[var14][var34 + 1];
                        float var48 = this.field1469[var14 - -1][var34 + 1];
                        float var49 = this.field1465[var14 - -1][var34 + 1];
                        float var50 = this.field1468[var14 - -1][var34 - -1];
                        float var51 = this.field1469[var14 - -1][var34];
                        float var52 = this.field1465[var14 + 1][var34];
                        float var53 = this.field1468[var14 - -1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = var1[var14 - -1][var34] & 255;
                        int var58 = 0;
                        label358: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class124 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label358;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field1460[super.field5808 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field5807) - -var36[var61];
                            int var63 = (var34 << super.field5807) - -var37[var61];
                            int var64 = var62 >> this.field1464;
                            int var65 = var63 >> this.field1464;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            int var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var43;
                                var76 = var42;
                                var77 = var73 - var54;
                                var78 = var44;
                            } else if (~var71 == -1 && super.field5805 == var72) {
                                var76 = var45;
                                var77 = var73 - var55;
                                var78 = var47;
                                var75 = var46;
                            } else if (~super.field5805 == ~var71 && ~super.field5805 == ~var72) {
                                var76 = var48;
                                var78 = var50;
                                var77 = var73 - var56;
                                var75 = var49;
                            } else if (~super.field5805 == ~var71 && var72 == 0) {
                                var75 = var52;
                                var77 = var73 - var57;
                                var78 = var53;
                                var76 = var51;
                            } else {
                                float var79 = (float) var71 / (float) super.field5805;
                                float var80 = (float) var72 / (float) super.field5805;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (-var44 + var53) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                float var86 = (var50 - var47) * var79 + var47;
                                var76 = (-var81 + var84) * var80 + var81;
                                var75 = (-var82 + var85) * var80 + var82;
                                var78 = (var86 - var83) * var80 + var83;
                                int var87 = ((var57 - var54) * var71 >> super.field5807) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field5807) + var55;
                                var77 = var73 - (((-var87 + var88) * var72 >> super.field5807) + var87);
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (~var90 > -3) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if ((7 & this.field1433) == 0) {
                                    float var91 = this.field1440.field1940[2] * var78 + this.field1440.field1940[1] * var75 + this.field1440.field1940[0] * var76;
                                    var89 = this.field1440.field1867 + (!(var91 > 0.0F) ? this.field1440.field1907 : this.field1440.field1877) * var91;
                                }
                                var74 = class789.field10788[var90 | var66 & 65408];
                            }
                            class766 var92 = null;
                            if (~(this.field1426 + -1 & var62) == -1 && ~(var63 & this.field1426 + -1) == -1) {
                                var92 = var12.method4253(var69, -1);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class654) var92).field9255;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && ~var10[var93].field10592 < ~var35[var61].field10592) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var77 >> 7;
                                    if (var95 < 2) {
                                        var95 = 2;
                                    } else if (~var95 < -127) {
                                        var95 = 126;
                                    }
                                    var94 = class789.field10788[var95 | var67 & 65408];
                                    if ((7 & this.field1433) == 0) {
                                        float var96 = this.field1440.field1940[2] * var78 + this.field1440.field1940[0] * var76 + this.field1440.field1940[1] * var75;
                                        float var97 = (var89 > 0.0F ? this.field1440.field1877 : this.field1440.field1907) * var89 + this.field1440.field1867;
                                        int var98 = 255 & var94 >> 16;
                                        int var99 = var94 >> 8 & 255;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = var94 & 255;
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var100 <= -1) {
                                            if (~var100 < -256) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        if (~var102 > -1) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (var103 >= 0) {
                                            if (~var103 < -256) {
                                                var103 = 255;
                                            }
                                        } else {
                                            var103 = 0;
                                        }
                                        var94 = var103 | var100 << 16 | var102 << 8;
                                    }
                                }
                                if (!Stream.method2263()) {
                                    var8.method2258((float) var62);
                                    var8.method2258((float) (var68 + this.method2478(true, var63, var62)));
                                    var8.method2258((float) var63);
                                    var8.method2258((float) var62);
                                    var8.method2258((float) var63);
                                    if (this.field1456 != null) {
                                        var8.method2258((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field1433) != 0) {
                                        var8.method2258(var76);
                                        var8.method2258(var75);
                                        var8.method2258(var78);
                                    }
                                } else {
                                    var8.method2251((float) var62);
                                    var8.method2251((float) (var68 + this.method2478(true, var63, var62)));
                                    var8.method2251((float) var63);
                                    var8.method2251((float) var62);
                                    var8.method2251((float) var63);
                                    if (this.field1456 != null) {
                                        var8.method2251((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if (~(this.field1433 & 7) != -1) {
                                        var8.method2251(var76);
                                        var8.method2251(var75);
                                        var8.method2251(var78);
                                    }
                                }
                                if (this.field1440.field1920 != 0) {
                                    var9.method2264(var94 | -16777216);
                                } else {
                                    var9.method2261(-16777216 | var94);
                                }
                                var93 = this.field1461++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method4252(false, new class654(var60[var61]), var69);
                            }
                            for (int var104 = 0; ~var104 > ~var58; ++var104) {
                                var13[var104].method1075(var93, var74, var77, -11923, var89);
                            }
                            ++this.field1427;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field1461; ++var15) {
                class124 var33 = var10[var15];
                if (var33 != null) {
                    var33.method1070((byte) 56, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field5808; ++var16) {
                for (int var22 = 0; ~super.field5809 < ~var22; ++var22) {
                    short[] var23 = this.field1460[super.field5808 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class124 var29 = var10[var26];
                            class124 var30 = var10[var27];
                            class124 var31 = var10[var28];
                            class124 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method1077(var22, var24, -105, var16);
                            }
                            if (var30 != null) {
                                var30.method1077(var22, var24, -38, var16);
                                if (var32 == null || ~var32.field10592 < ~var30.field10592) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method1077(var22, var24, -78, var16);
                                if (var32 == null || ~var32.field10592 < ~var31.field10592) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method1070((byte) 31, var26);
                                }
                                if (var30 != null) {
                                    var32.method1070((byte) 119, var27);
                                }
                                if (var31 != null) {
                                    var32.method1070((byte) 93, var28);
                                }
                                var32.method1077(var22, var24, -128, var16);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2255();
            var9.method2255();
            this.field1470 = this.field1440.method135(false, 0);
            this.field1470.method38((byte) 101, 4, var6, this.field1461 * 4);
            this.field1471 = this.field1440.method135(false, 0);
            this.field1471.method38((byte) 105, var5, var7, this.field1461 * var5);
            if ((this.field1433 & 7) != 0) {
                if (this.field1456 == null) {
                    this.field1466 = this.field1440.method126(10, new class249[] { new class249(new class664[] { class664.field9349, class664.field9353, class664.field9350 }), new class249(class664.field9351) });
                } else {
                    this.field1466 = this.field1440.method126(10, new class249[] { new class249(new class664[] { class664.field9349, class664.field9353, class664.field9352, class664.field9350 }), new class249(class664.field9351) });
                }
            } else if (this.field1456 != null) {
                this.field1466 = this.field1440.method126(10, new class249[] { new class249(new class664[] { class664.field9349, class664.field9353, class664.field9352 }), new class249(class664.field9351) });
            } else {
                this.field1466 = this.field1440.method126(10, new class249[] { new class249(new class664[] { class664.field9349, class664.field9353 }), new class249(class664.field9351) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (var3[var18].field2119 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field1474 = new class124[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class124 var21 = var3[var20];
                var19[var20] = var21.field10592;
                this.field1474[var20] = var21;
                var21.method1078(-81, this.field1461);
            }
            class185.method1337(this.field1474, -1, var19);
            if (this.field1454 != null) {
                this.field1454.method2870(120);
            }
        } else {
            this.field1454 = null;
        }
        this.field1428 = null;
        this.field1456 = null;
        this.field1475 = null;
        this.field1455 = this.field1443 = null;
        this.field1469 = this.field1465 = this.field1468 = null;
        this.field1458 = null;
        this.field1473 = null;
        this.field1432 = null;
        this.field1439 = null;
    }

    @OriginalMember(owner = "client!sl", name = "ka", descriptor = "(III)V")
    public final void method819(int arg0, int arg1, int arg2) {
        ++field1459;
        if ((255 & this.field1473[arg0][arg1]) < arg2) {
            this.field1473[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)Z")
    public static final boolean method820(int arg0, int arg1) {
        ++field1425;
        if (arg1 >= -19) {
            method820(-56, -24);
        }
        return ~arg0 <= -5 && ~arg0 >= -9;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
    public final void method821(int arg0, int arg1) {
        ++field1453;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[[ZZIIIII)V")
    private final void method822(int arg0, boolean[][] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -1885224318) {
            field1449 = null;
        }
        ++field1431;
        if (this.field1474 != null) {
            int var9 = arg0 + 1 + arg0;
            int var10 = var9 * var9;
            if (~var10 < ~class48.field677.length) {
                class48.field677 = new int[var10];
            }
            int var11 = -arg0 + arg7;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = arg6 - arg0;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg0 + arg7;
            if (super.field5808 + -1 < var15) {
                var15 = super.field5808 + -1;
            }
            int var16 = arg6 - -arg0;
            if (~var16 < ~(super.field5809 + -1)) {
                var16 = super.field5809 + -1;
            }
            class529.field7376 = 0;
            for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                boolean[] var24 = arg1[-var12 + var17];
                for (int var25 = var13; ~var16 <= ~var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class48.field677[class529.field7376++] = super.field5808 * var25 + var17;
                    }
                }
            }
            if (arg3 != -1) {
                this.field1440.method966((float) arg3, (byte) 104);
                this.field1440.method954(0);
            } else {
                this.field1440.method989(-113);
            }
            this.field1440.method977((byte) -68);
            this.field1440.method946(-1, (this.field1433 & 7) != 0);
            this.field1440.method963(-1, false, (byte) -124, false);
            this.field1440.method71((byte) -43, 0, this.field1471);
            for (int var18 = 0; this.field1474.length > var18; ++var18) {
                this.field1474[var18].method1071(class529.field7376, arg4 ^ -1885224317, class48.field677);
            }
            class742 var19 = this.field1440.method941(arg4 + 1885192062);
            var19.method1568(0, -1, 0);
            this.field1440.method1008(-121);
            if (!this.field1444.method3723((byte) 118)) {
                int var20 = this.field1440.field1936;
                int var21 = this.field1440.field1942;
                this.field1440.method511(0, var21, this.field1440.field1914);
                this.field1440.method946(-1, false);
                this.field1440.method960(false, 0);
                this.field1440.method1022(126, 128);
                this.field1440.method963(-2, false, (byte) -124, false);
                this.field1440.method988(1, this.field1440.field1900);
                this.field1440.method974(class317.field4523, class552.field7657, (byte) -59);
                this.field1440.method1014(0, 69, class504.field6917);
                this.field1440.method973(0, class368.field5193, (byte) 95);
                for (class766 var22 = this.field1444.method3731((byte) -122); var22 != null; var22 = this.field1444.method3729((byte) 3)) {
                    class691 var23 = (class691) var22;
                    var23.method3886(false, arg7, arg6, arg0, arg1);
                }
                this.field1440.method1014(0, 105, class264.field3730);
                this.field1440.method973(0, class264.field3730, (byte) 122);
                this.field1440.method988(1, (class408) null);
                this.field1440.method511(var20, var21, this.field1440.field1914);
            }
            if (this.field1454 != null) {
                this.field1440.method71((byte) -43, 0, this.field1471);
                this.field1440.method71((byte) -43, 1, this.field1470);
                this.field1440.method89(this.field1466, arg4 + 1885224445);
                this.field1454.method2873(arg0, arg1, arg2, arg7, -110, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method823(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1429;
        if (this.field1454 != null && arg0 != null) {
            int var7 = arg1 - (this.field1440.field1856 * arg2 >> 8) >> this.field1440.field1892;
            int var8 = -(this.field1440.field1879 * arg2 >> 8) + arg3 >> this.field1440.field1892;
            this.field1454.method2874(arg0, -79, var7, var8);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method824(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1462;
        if (this.field1454 != null && arg0 != null) {
            int var7 = -(this.field1440.field1856 * arg2 >> 8) + arg1 >> this.field1440.field1892;
            int var8 = arg3 - (this.field1440.field1879 * arg2 >> 8) >> this.field1440.field1892;
            return this.field1454.method2876((byte) -126, var7, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method825(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1448;
        if (this.field1454 != null && arg0 != null) {
            int var7 = -(this.field1440.field1856 * arg2 >> 8) + arg1 >> this.field1440.field1892;
            int var8 = -(this.field1440.field1879 * arg2 >> 8) + arg3 >> this.field1440.field1892;
            this.field1454.method2875(var8, var7, arg0, 122);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lmj;IIII[[I[[II)V")
    public class99(class114 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field1440 = arg0;
        this.field1464 = super.field5807 + -2;
        this.field1433 = arg2;
        this.field1426 = 1 << this.field1464;
        this.field1458 = new int[arg3][arg4][];
        this.field1473 = new byte[arg3 + 1][arg4 + 1];
        this.field1432 = new int[arg3][arg4][];
        this.field1443 = new int[arg3][arg4][];
        this.field1451 = new byte[arg3][arg4];
        this.field1469 = new float[super.field5808 + 1][super.field5809 + 1];
        this.field1465 = new float[super.field5808 + 1][super.field5809 + 1];
        this.field1439 = new class124[arg3][arg4][];
        this.field1460 = new short[arg3 * arg4][];
        this.field1468 = new float[super.field5808 + 1][super.field5809 + 1];
        this.field1455 = new int[arg3][arg4][];
        this.field1428 = new int[arg3][arg4][];
        for (int var9 = 0; super.field5809 >= var9; ++var9) {
            for (int var10 = 0; super.field5808 >= var10; ++var10) {
                int var11 = super.field5801[var10][var9];
                if (this.field1435 > (float) var11) {
                    this.field1435 = (float) var11;
                }
                if (this.field1442 < (float) var11) {
                    this.field1442 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && ~super.field5808 < ~var10 && ~var9 > ~super.field5809) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * arg7 * 4 + var13 * var13)));
                    this.field1469[var10][var9] = (float) var12 * var14;
                    this.field1465[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field1468[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field1435;
        ++this.field1442;
        this.field1475 = new class769(128);
        if (~(this.field1433 & 16) != -1) {
            this.field1454 = new class492(this.field1440, this);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method826(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field1430;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; var18 > var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method828(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Llja;)V")
    public static final void method827(class724 arg0) {
        class316.field4495 = arg0;
    }

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method828(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field1434;
        class103 var15 = this.field1440.field6447;
        if (arg5 != null && this.field1456 == null) {
            this.field1456 = new int[super.field5808][super.field5809][];
        }
        if (arg3 != null && this.field1428 == null) {
            this.field1428 = new int[super.field5808][super.field5809][];
        }
        this.field1455[arg0][arg1] = arg2;
        this.field1443[arg0][arg1] = arg4;
        this.field1458[arg0][arg1] = arg6;
        this.field1432[arg0][arg1] = arg7;
        if (this.field1456 != null) {
            this.field1456[arg0][arg1] = arg5;
        }
        if (this.field1428 != null) {
            this.field1428[arg0][arg1] = arg3;
        }
        class124[] var16 = this.field1439[arg0][arg1] = new class124[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field1433 & 32) != -1 && var18 != -1 && var15.method847(var18, -100).field10029) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (var19 << 14) | (long) var18;
            class766 var22;
            for (var22 = this.field1475.method4253(var20, -1); var22 != null; var22 = this.field1475.method4248(-124)) {
                class124 var23 = (class124) var22;
                if (var23.field2114 == var18 && (float) var19 == var23.field2117 && var23.field2118 == arg10 && var23.field2122 == arg11 && ~var23.field2124 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class124(this, var18, var19, arg10, arg11, arg12);
                this.field1475.method4252(false, var16[var17], var20);
            } else {
                var16[var17] = (class124) var22;
            }
        }
        if (arg13) {
            this.field1451[arg0][arg1] = (byte) class694.method3895(this.field1451[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field1472) {
            this.field1472 = arg6.length;
        }
        this.field1467 += arg6.length;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIILsb;)V")
    private final void method829(int arg0, int arg1, int arg2, class401 arg3) {
        ++field1452;
        if (arg0 == -14179) {
            int[] var5 = this.field1455[arg2][arg1];
            int[] var6 = this.field1443[arg2][arg1];
            int var7 = var5.length;
            if (var7 > class467.field6374.length) {
                class79.field1179 = new int[var7];
                class467.field6374 = new int[var7];
            }
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                class467.field6374[var8] = var5[var8] >> this.field1440.field1892;
                class79.field1179[var8] = var6[var8] >> this.field1440.field1892;
            }
            int var9 = 0;
            while (~var9 > ~var7) {
                int var10 = class467.field6374[var9];
                int var11 = class79.field1179[var9++];
                int var12 = class467.field6374[var9];
                int var13 = class79.field1179[var9++];
                int var14 = class467.field6374[var9];
                int var15 = class79.field1179[var9++];
                if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                    arg3.method2381(var11, var14, var12, var15, var10, var13, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "fa", descriptor = "(IILr;)Lr;")
    public final class115 method830(int arg0, int arg1, class115 arg2) {
        ++field1446;
        if (~(this.field1451[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field5805 >> this.field1440.field1892;
            class401 var5 = (class401) arg2;
            class401 var6;
            if (var5 != null && var5.method2384((byte) -113, var4, var4)) {
                var6 = var5;
                var5.method2380(-4683);
            } else {
                var6 = new class401(this.field1440, var4, var4);
            }
            var6.method2382(var4, (byte) -123, var4, 0, 0);
            this.method829(-14179, arg1, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lmfa;[I)V")
    public final void method831(class217 arg0, int[] arg1) {
        ++field1441;
        this.field1444.method3728((byte) 119, new class691(this.field1440, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field1457;
        if (this.field1467 > 0) {
            class463 var9 = this.field1440.method942(this.field1427, (byte) 115);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1440(true, -15169);
                if (var14 != null) {
                    Stream var15 = this.field1440.method1007(1, var14);
                    if (!Stream.method2263()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field5808 * var16 - -arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field1460[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            var15.method2252(var21);
                                            if (var21 < var11) {
                                                var11 = var21;
                                            }
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field5808 * var22 + arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field1460[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            var15.method2259(var29);
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2255();
                    if (var9.method1441(32416)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field1440.method950(89);
                this.field1440.method994((byte) -38, false);
                this.field1440.method946(-1, false);
                this.field1440.method947((byte) -119, false);
                this.field1440.method960(false, 0);
                this.field1440.method1022(-100, 0);
                this.field1440.method963(-2, false, (byte) -124, false);
                this.field1440.method988(1, (class408) null);
                class742 var23 = this.field1440.method941(-32256);
                float[] var24 = this.field1440.method972(0);
                var24[5] = (float) arg2 / ((float) super.field5805 * 128.0F * (float) this.field1440.field1824);
                var24[14] = -this.field1435 / (this.field1442 - this.field1435);
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1440.field1824) + 1.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field1440.field1834) + -1.0F;
                var24[11] = 0.0F;
                var24[15] = 1.0F;
                var24[2] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field5805 * 128.0F * (float) this.field1440.field1834);
                var24[9] = 0.0F;
                var24[1] = 0.0F;
                var24[6] = 0.0F;
                var24[3] = 0.0F;
                var24[7] = 0.0F;
                var24[10] = 1.0F / (this.field1442 - this.field1435);
                var24[8] = 0.0F;
                var24[4] = 0.0F;
                var23.method4098(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, (byte) -75, 0.0F, 1.0F, 0.0F);
                this.field1440.method978(-22232);
                this.field1440.method1008(-128);
                if (~(7 & this.field1433) != -1) {
                    this.field1440.method946(-1, true);
                    this.field1440.method105(-14620);
                } else {
                    this.field1440.method946(-1, false);
                }
                this.field1440.method62(-106, false);
                this.field1440.method71((byte) -43, 0, this.field1471);
                this.field1440.method71((byte) -43, 1, this.field1470);
                this.field1440.method89(this.field1466, 125);
                this.field1440.method140(var11, -var11 - -1 + var12, var9, class710.field9929, 0, 0, var10 / 3);
                this.field1440.method62(102, true);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([BBIIII)V")
    public static final void method833(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1447;
        if (arg1 > -82) {
            method833((byte[]) null, (byte) -15, -46, -123, 21, -20);
        }
        if (arg2 > arg4) {
            int var6 = arg3 + arg4;
            int var7 = -arg4 + arg2 >> 2;
            while (true) {
                --var7;
                if (~var7 > -1) {
                    int var8 = arg2 - arg4 & 3;
                    while (true) {
                        --var8;
                        if (~var8 > -1) {
                            return;
                        }
                        arg0[var6++] = 1;
                    }
                }
                arg0[var6++] = 1;
                arg0[var6++] = 1;
                arg0[var6++] = 1;
                arg0[var6++] = 1;
            }
        }
    }
}
