import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class19 {

    @OriginalMember(owner = "client!na", name = "l", descriptor = "[B")
    private byte[] field264 = new byte[4];

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Lfa;")
    private class80 field269;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "J")
    private long field253;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[I")
    public static int[] field256 = new int[4096];

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field268 = -1;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Le;")
    public static class191 field270 = class54.method368("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 2047);

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field271 = 0;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lre;")
    public static class221 field266;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field257;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[B")
    private byte[] field262;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
    public static int[] field261;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method144(int arg0) {
        field254++;
        if (class18.field235 == 61) {
            int var1 = class107.field1776.method1580(-44);
            int var2 = ((var1 & 0xF8) >> 4) + class147.field2484 * 2;
            int var3 = class172.field2900 * 2 + (var1 & 0xF);
            int var4 = class107.field1776.method1575(false) + var2;
            int var5 = var3 + class107.field1776.method1575(false);
            int var6 = class107.field1776.method1568(110);
            int var7 = class107.field1776.method1593(true);
            int var8 = class107.field1776.method1580(-33) * 4;
            int var9 = class107.field1776.method1580(-39) * 4;
            int var10 = class107.field1776.method1593(true);
            int var11 = class107.field1776.method1593(true);
            int var12 = class107.field1776.method1580(arg0 - 109);
            int var13 = class107.field1776.method1580(arg0 - 60);
            if (var2 >= 0 && var3 >= 0 && var2 < 208 && var3 < 208 && var4 >= 0 && var5 >= 0 && var4 < 208 && var5 < 208 && var7 != 65535) {
                int var14 = var2 * 64;
                int var15 = var4 * 64;
                int var16 = var5 * 64;
                int var17 = var3 * 64;
                class54 var18 = new class54(var7, class261.field4598, var14, var17, class222.method1546(class261.field4598, var14, var17, 247425607) - var8, var10 - -class135.field2267, class135.field2267 + var11, var12, var13, var6, var9);
                var18.method363(class135.field2267 + var10, var15, arg0 ^ 0x2523, var16, class222.method1546(class261.field4598, var15, var16, 247425607) - var9);
                class91.field1494.method1176(new class234(var18), (byte) 38);
            }
        } else if (arg0 == 0) {
            if (class18.field235 == 62) {
                int var19 = class107.field1776.method1580(-3);
                int var20 = (var19 & 0x7) + class172.field2900;
                int var21 = class147.field2484 + (var19 >> 4 & 0x7);
                int var22 = class107.field1776.method1593(true);
                int var23 = class107.field1776.method1580(-35);
                int var24 = (var23 & 0xF8) >> 4;
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var25 = class107.field1776.method1580(arg0 ^ 0xFFFFFF9F);
                int var26 = var23 & 0x7;
                if (var21 >= 0 && var20 >= 0 && var21 < 104 && var20 < 104) {
                    int var27 = var24 + 1;
                    if (class175.field2946.field2953[0] >= (var21 - var27) && var21 + var27 >= class175.field2946.field2953[0] && var20 - var27 <= class175.field2946.field3014[0] && var20 + var27 >= class175.field2946.field3014[0] && class173.field2904 != 0 && var26 > 0 && class249.field4422 < 50 && var22 != -1) {
                        class253.field4480[class249.field4422] = var22;
                        class245.field4355[class249.field4422] = var26;
                        class90.field1453[class249.field4422] = var25;
                        class129.field2149[class249.field4422] = null;
                        class21.field287[class249.field4422] = (var21 << 16) + (var20 << 8) + var24;
                        class249.field4422++;
                    }
                }
            } else {
                if (class18.field235 == 92) {
                    int var28 = class107.field1776.method1599((byte) -114);
                    int var29 = var28 >> 2;
                    int var30 = var28 & 0x3;
                    int var31 = class149.field2562[var29];
                    int var32 = class107.field1776.method1563(true);
                    int var33 = class107.field1776.method1563(true);
                    byte var34 = class107.field1776.method1575(false);
                    byte var35 = class107.field1776.method1574(false);
                    int var36 = class107.field1776.method1607(255);
                    int var37 = (var36 >> 4 & 0x7) + class147.field2484;
                    int var38 = class172.field2900 + (var36 & 0x7);
                    int var39 = class107.field1776.method1563(true);
                    byte var40 = class107.field1776.method1571(-20994);
                    byte var41 = class107.field1776.method1571(arg0 ^ 0xFFFFADFE);
                    int var42 = class107.field1776.method1611((byte) -112);
                    class76 var43;
                    if (class35.field641 == var33) {
                        var43 = class175.field2946;
                    } else {
                        var43 = class245.field4357[var33];
                    }
                    if (var43 != null) {
                        class102 var44 = class31.method216(var39, (byte) 117);
                        int var45;
                        int var46;
                        if (var30 == 1 || var30 == 3) {
                            var45 = var44.field1652;
                            var46 = var44.field1686;
                        } else {
                            var45 = var44.field1686;
                            var46 = var44.field1652;
                        }
                        int var47 = (var45 >> 1) + var38;
                        int var48 = var37 + (var46 + 1 >> 1);
                        int var49 = var38 + (var45 + 1 >> 1);
                        int[][] var50 = class12.field143[class261.field4598];
                        int var51 = (var46 >> 1) + var37;
                        int[][] var52 = null;
                        int var53 = (var37 << 7) + (var46 << 6);
                        int var54 = var50[var48][var47] + var50[var51][var49] + var50[var48][var49] + var50[var51][var47] >> 2;
                        int var55 = (var38 << 7) + (var45 << 6);
                        if (class261.field4598 < 3) {
                            var52 = class12.field143[class261.field4598 + 1];
                        }
                        class270 var56 = var44.method635(var54, var55, var53, var50, var52, (byte) -94, (class60) null, var44.field1637, var29, false, var30);
                        if (var56 != null) {
                            if (var41 > var34) {
                                byte var57 = var41;
                                var41 = var34;
                                var34 = var57;
                            }
                            class28.method202(var42 + 1, var37, -1, arg0 ^ 0xFF, class261.field4598, var38, var32 + 1, 0, 0, var31);
                            var43.field1302 = var37 * 128 + (var46 * 64);
                            var43.field1293 = class135.field2267 + var42;
                            var43.field1313 = var54;
                            var43.field1320 = var37 + var34;
                            var43.field1292 = (class251) var56.field4760;
                            var43.field1311 = var38 * 128 + (var45 * 64);
                            var43.field1325 = var37 + var41;
                            var43.field1329 = class135.field2267 + var32;
                            if (var40 < var35) {
                                byte var58 = var35;
                                var35 = var40;
                                var40 = var58;
                            }
                            var43.field1316 = var38 + var40;
                            var43.field1321 = var35 + var38;
                        }
                    }
                }
                if (class18.field235 == 98) {
                    int var59 = class107.field1776.method1580(arg0 - 17);
                    int var60 = (var59 >> 4 & 0x7) + class147.field2484;
                    int var61 = (var59 & 0x7) + class172.field2900;
                    int var62 = class107.field1776.method1593(true);
                    if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                        class175 var63 = class75.field1281[class261.field4598][var60][var61];
                        if (var63 != null) {
                            for (class222 var64 = (class222) var63.method1173(62); var64 != null; var64 = (class222) var63.method1175(-1)) {
                                if ((var62 & 0x7FFF) == var64.field3966.field2587) {
                                    var64.method655(63);
                                    break;
                                }
                            }
                            if (var63.method1173(17) == null) {
                                class75.field1281[class261.field4598][var60][var61] = null;
                            }
                            class89.method541(123, var60, var61);
                        }
                    }
                } else if (class18.field235 == 80) {
                    int var65 = class107.field1776.method1599((byte) -103);
                    int var66 = var65 >> 2;
                    int var67 = class149.field2562[var66];
                    int var68 = var65 & 0x3;
                    int var69 = class107.field1776.method1599((byte) -106);
                    int var70 = (var69 & 0x7) + class172.field2900;
                    int var71 = ((var69 & 0x77) >> 4) + class147.field2484;
                    if (var71 >= 0 && var70 >= 0 && var71 < 104 && var70 < 104) {
                        class28.method202(0, var71, -1, 255, class261.field4598, var70, -1, var66, var68, var67);
                    }
                } else if (class18.field235 == 72) {
                    int var72 = class107.field1776.method1599((byte) -116);
                    int var73 = ((var72 & 0x7C) >> 4) + class147.field2484;
                    int var74 = (var72 & 0x7) + class172.field2900;
                    int var75 = class107.field1776.method1593(true);
                    int var76 = class107.field1776.method1598((byte) -87);
                    if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                        class150 var77 = new class150();
                        var77.field2587 = var76;
                        var77.field2583 = var75;
                        if (class75.field1281[class261.field4598][var73][var74] == null) {
                            class75.field1281[class261.field4598][var73][var74] = new class175();
                        }
                        class75.field1281[class261.field4598][var73][var74].method1176(new class222(var77), (byte) 38);
                        class89.method541(101, var73, var74);
                    }
                } else if (class18.field235 == 42) {
                    int var78 = class107.field1776.method1580(-107);
                    int var79 = (var78 & 0x7) + class172.field2900;
                    int var80 = ((var78 & 0x70) >> 4) + class147.field2484;
                    int var81 = class107.field1776.method1593(true);
                    int var82 = class107.field1776.method1580(arg0 - 125);
                    int var83 = class107.field1776.method1593(true);
                    if (var80 >= 0 && var79 >= 0 && var80 < 104 && var79 < 104) {
                        int var84 = var80 * 128 + 64;
                        int var85 = var79 * 128 + 64;
                        class101 var86 = new class101(var81, class261.field4598, var84, var85, class222.method1546(class261.field4598, var84, var85, 247425607) - var82, var83, class135.field2267);
                        class149.field2578.method1176(new class13(var86), (byte) 38);
                    }
                } else if (class18.field235 == 120) {
                    int var87 = class107.field1776.method1593(true);
                    int var88 = class107.field1776.method1573(-11685392);
                    int var89 = var88 & 0x3;
                    if (var87 == 65535) {
                        var87 = -1;
                    }
                    int var90 = var88 >> 2;
                    int var91 = class149.field2562[var90];
                    int var92 = class107.field1776.method1607(255);
                    int var93 = ((var92 & 0x76) >> 4) + class147.field2484;
                    int var94 = (var92 & 0x7) + class172.field2900;
                    class93.method566(var91, var93, var87, var89, var94, class261.field4598, 23382, var90);
                } else if (class18.field235 == 17) {
                    int var95 = class107.field1776.method1573(-11685392);
                    int var96 = var95 & 0x3;
                    int var97 = var95 >> 2;
                    int var98 = class149.field2562[var97];
                    int var99 = class107.field1776.method1580(-31);
                    int var100 = (var99 & 0x7) + class172.field2900;
                    int var101 = (var99 >> 4 & 0x7) + class147.field2484;
                    int var102 = class107.field1776.method1563(true);
                    if (var101 >= 0 && var100 >= 0 && var101 < 104 && var100 < 104) {
                        class28.method202(0, var101, var102, 255, class261.field4598, var100, -1, var97, var96, var98);
                    }
                } else if (class18.field235 == 194) {
                    int var103 = class107.field1776.method1580(arg0 ^ 0xFFFFFFC1);
                    int var104 = (var103 >> 4 & 0x7) + class147.field2484;
                    int var105 = (var103 & 0x7) + class172.field2900;
                    int var106 = class107.field1776.method1593(true);
                    int var107 = class107.field1776.method1593(true);
                    int var108 = class107.field1776.method1593(true);
                    if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                        class175 var109 = class75.field1281[class261.field4598][var104][var105];
                        if (var109 != null) {
                            for (class222 var110 = (class222) var109.method1173(64); var110 != null; var110 = (class222) var109.method1175(-1)) {
                                class150 var111 = var110.field3966;
                                if ((var106 & 0x7FFF) == var111.field2587 && var111.field2583 == var107) {
                                    var111.field2583 = var108;
                                    break;
                                }
                            }
                            class89.method541(-119, var104, var105);
                        }
                    }
                } else if (class18.field235 == 58) {
                    int var112 = class107.field1776.method1607(255);
                    int var113 = (var112 & 0x7) + class172.field2900;
                    int var114 = class147.field2484 + (var112 >> 4 & 0x7);
                    int var115 = class107.field1776.method1611((byte) -84);
                    int var116 = class107.field1776.method1611((byte) -94);
                    int var117 = class107.field1776.method1598((byte) -87);
                    if (var114 >= 0 && var113 >= 0 && var114 < 104 && var113 < 104 && class35.field641 != var115) {
                        class150 var118 = new class150();
                        var118.field2583 = var117;
                        var118.field2587 = var116;
                        if (class75.field1281[class261.field4598][var114][var113] == null) {
                            class75.field1281[class261.field4598][var114][var113] = new class175();
                        }
                        class75.field1281[class261.field4598][var114][var113].method1176(new class222(var118), (byte) 38);
                        class89.method541(-83, var114, var113);
                    }
                } else if (class18.field235 == 95) {
                    int var119 = class107.field1776.method1580(-36);
                    int var120 = (var119 & 0x7) + class172.field2900;
                    int var121 = (var119 >> 4 & 0x7) + class147.field2484;
                    int var122 = var121 + class107.field1776.method1575(false);
                    int var123 = class107.field1776.method1575(false) + var120;
                    int var124 = class107.field1776.method1568(124);
                    int var125 = class107.field1776.method1593(true);
                    int var126 = class107.field1776.method1580(arg0 ^ 0xFFFFFFEB) * 4;
                    int var127 = class107.field1776.method1580(-65) * 4;
                    int var128 = class107.field1776.method1593(true);
                    int var129 = class107.field1776.method1593(true);
                    int var130 = class107.field1776.method1580(-46);
                    int var131 = class107.field1776.method1580(-111);
                    if (var121 >= 0 && var120 >= 0 && var121 < 104 && var120 < 104 && var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104 && var125 != 65535) {
                        int var132 = var120 * 128 + 64;
                        int var133 = var122 * 128 + 64;
                        int var134 = var123 * 128 + 64;
                        int var135 = var121 * 128 + 64;
                        class54 var136 = new class54(var125, class261.field4598, var135, var132, class222.method1546(class261.field4598, var135, var132, 247425607) - var126, class135.field2267 + var128, class135.field2267 + var129, var130, var131, var124, var127);
                        var136.method363(class135.field2267 + var128, var133, 9507, var134, class222.method1546(class261.field4598, var133, var134, 247425607) - var127);
                        class91.field1494.method1176(new class234(var136), (byte) 38);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)[B")
    public final byte[] method145(byte arg0) throws IOException {
        field255++;
        if (class27.method198((byte) -115) > this.field253) {
            throw new IOException("fdt");
        }
        if (this.field267 == 0) {
            if (this.field269.field1356 == 2) {
                throw new IOException("fds");
            }
            if (this.field269.field1356 == 1) {
                this.field257 = (DataInputStream) this.field269.field1360;
                this.field267 = 1;
            }
        }
        if (this.field267 == 1) {
            int var2 = this.field257.available();
            if (var2 > 0) {
                if (var2 + this.field260 > 4) {
                    var2 = 4 - this.field260;
                }
                this.field260 += this.field257.read(this.field264, this.field260, var2);
                if (this.field260 == 4) {
                    int var3 = (new class225(this.field264)).method1562(21705);
                    this.field267 = 2;
                    this.field262 = new byte[var3];
                }
            }
        }
        if (arg0 <= 78) {
            this.field253 = -22L;
        }
        if (this.field267 == 2) {
            int var4 = this.field257.available();
            if (var4 > 0) {
                if (var4 + this.field263 > this.field262.length) {
                    var4 = this.field262.length - this.field263;
                }
                this.field263 += this.field257.read(this.field262, this.field263, var4);
                if (this.field262.length == this.field263) {
                    return this.field262;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lai;Z)V")
    public static final void method146(int arg0, class220[] arg1, boolean arg2) {
        if (arg0 != 128) {
            field271 = 101;
        }
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class270.field4755[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class270.field4755[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg1[var6].method1502((byte) 102, var5, var4);
                            }
                        }
                    }
                }
            }
            class207.field3682 += (int) (Math.random() * 5.0D) - 2;
            if (class207.field3682 < -16) {
                class207.field3682 = -16;
            }
            if (class207.field3682 > 16) {
                class207.field3682 = 16;
            }
            class168.field2853 += (int) (Math.random() * 5.0D) - 2;
            if (class168.field2853 < -8) {
                class168.field2853 = -8;
            }
            if (class168.field2853 > 8) {
                class168.field2853 = 8;
            }
        }
        byte var7;
        if (arg2) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        field258++;
        int var8 = class168.field2853 >> 2 << 10;
        int var9 = class207.field3682 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class59.field1075[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class12.field143[var12][var100][var54 + 1] - class12.field143[var12][var100][var54 - 1];
                    int var103 = class12.field143[var12][var100 + 1][var54] - class12.field143[var12][var100 - 1][var54];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = -65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var51[var100][var54 - 1] >> 2) + (var51[var100 - 1][var54] >> 2) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54] >> 1) + (var51[var100 + 1][var54] >> 3);
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var106 * -50 + var105 * -10 + var108 * -50) / var53 + var101;
                    var11[var100][var54] = var109 - var107;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class132.field2225[var55] = 0;
                class149.field2567[var55] = 0;
                class176.field2991[var55] = 0;
                class33.field481[var55] = 0;
                class138.field2331[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class79.field1342[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class90 var96 = class75.method484(-117, var95 - 1);
                            class132.field2225[var85] += var96.field1468;
                            class149.field2567[var85] += var96.field1464;
                            class176.field2991[var85] += var96.field1474;
                            class33.field481[var85] += var96.field1459;
                            var10002 = class138.field2331[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class79.field1342[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class90 var99 = class75.method484(-115, var98 - 1);
                            class132.field2225[var85] -= var99.field1468;
                            class149.field2567[var85] -= var99.field1464;
                            class176.field2991[var85] -= var99.field1474;
                            class33.field481[var85] -= var99.field1459;
                            var10002 = class138.field2331[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var89 += class33.field481[var92];
                            var88 += class176.field2991[var92];
                            var86 += class149.field2567[var92];
                            var87 += class132.field2225[var92];
                            var90 += class138.field2331[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var89 -= class33.field481[var93];
                            var86 -= class149.field2567[var93];
                            var87 -= class132.field2225[var93];
                            var90 -= class138.field2331[var93];
                            var88 -= class176.field2991[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var10[var56][var91] = class9.method67(var88 / var90, 1, var87 * 256 / var89, var86 / var90);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg2 || class188.method1298(10) || (class270.field4755[0][var57][var58] & 0x2) != 0 || (class270.field4755[var12][var57][var58] & 0x10) == 0 && class163.method1105(true, var58, var57, var12) == class252.field4461) {
                        if (class65.field1141 > var12) {
                            class65.field1141 = var12;
                        }
                        int var59 = class14.field175[var12][var57][var58] & 0xFF;
                        int var60 = class79.field1342[var12][var57][var58] & 0xFF;
                        if (var60 > 0 || var59 > 0) {
                            int var61 = class12.field143[var12][var57][var58];
                            int var62 = class12.field143[var12][var57 + 1][var58 + 1];
                            int var63 = class12.field143[var12][var57 + 1][var58];
                            int var64 = class12.field143[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var60 == 0 && class226.field4066[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var59 > 0 && !class191.method1311(-2488, var59 - 1).field283) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var63 && var61 == var62 && var61 == var64) {
                                    class129.field2140[var12][var57][var58] = class217.method1476(class129.field2140[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var60 <= 0) {
                                var66 = 0;
                                var67 = -1;
                            } else {
                                var67 = var10[var57][var58];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var67 + var8 & 0xFC00) + var68 + (var67 & 0x380);
                                var66 = class15.field196[class265.method1820((byte) 89, var69, 96)];
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58];
                            int var72 = var11[var57 + 1][var58 + 1];
                            int var73 = var11[var57][var58 + 1];
                            if (var59 == 0) {
                                class226.method1621(var12, var57, var58, 0, 0, -1, var61, var63, var62, var64, class265.method1820((byte) 38, var67, var70), class265.method1820((byte) 88, var67, var71), class265.method1820((byte) 63, var67, var72), class265.method1820((byte) 21, var67, var73), 0, 0, 0, 0, var66, 0);
                            } else {
                                int var74 = class226.field4066[var12][var57][var58] + 1;
                                byte var75 = class40.field722[var12][var57][var58];
                                class20 var76 = class191.method1311(-2488, var59 - 1);
                                int var77 = var76.field277;
                                if (var77 >= 0 && !class15.field199.method1361(0, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var79 = class15.field196[class194.method1378(class15.field199.method1371(arg0 ^ 0x4215, var77), 96, 2)];
                                    var78 = -1;
                                } else if (var76.field284 == -1) {
                                    var78 = -2;
                                    var79 = 0;
                                } else {
                                    var78 = var76.field284;
                                    int var80 = (var78 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var78 + var8 & 0xFC00) + (var78 & 0x380) + var80;
                                    var79 = class15.field196[class194.method1378(var81, 96, 2)];
                                }
                                if (var76.field278 >= 0) {
                                    int var82 = var76.field278;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var8 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var79 = class15.field196[class194.method1378(var84, 96, arg0 - 126)];
                                }
                                class226.method1621(var12, var57, var58, var74, var75, var77, var61, var63, var62, var64, class265.method1820((byte) 90, var67, var70), class265.method1820((byte) 61, var67, var71), class265.method1820((byte) 110, var67, var72), class265.method1820((byte) 89, var67, var73), class194.method1378(var78, var70, arg0 ^ 0x82), class194.method1378(var78, var71, arg0 - 126), class194.method1378(var78, var72, arg0 - 126), class194.method1378(var78, var73, arg0 - 126), var66, var79);
                            }
                        }
                    }
                }
            }
            class79.field1342[var12] = null;
            class14.field175[var12] = null;
            class226.field4066[var12] = null;
            class40.field722[var12] = null;
            class59.field1075[var12] = null;
        }
        class33.method233(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class270.field4755[1][var13][var50] & 0x2) == 2) {
                    class223.method1553(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class129.field2140[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var14;
                        int var19 = var15;
                        int var20 = var14;
                        while (var17 > 0 && (class129.field2140[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        while (var19 < 104 && (class129.field2140[var14][var16][var19 + 1] & 0x1) != 0) {
                            var19++;
                        }
                        label351: while (var18 > 0) {
                            for (int var21 = var17; var21 <= var19; var21++) {
                                if ((class129.field2140[var18 - 1][var16][var21] & 0x1) == 0) {
                                    break label351;
                                }
                            }
                            var18--;
                        }
                        label340: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var19; var22++) {
                                if ((class129.field2140[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var19 + 1 - var17) * (var20 + 1 - var18);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class12.field143[var18][var16][var17];
                            int var26 = class12.field143[var20][var16][var17] - var24;
                            class47.method324(1, var16 * 128, var16 * 128, var17 * 128, var19 * 128 + 128, var26, var25);
                            for (int var27 = var18; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var19; var28++) {
                                    class129.field2140[var27][var16][var28] = class167.method1128(class129.field2140[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class129.field2140[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (class129.field2140[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30 = var16;
                        int var31 = var14;
                        while (var30 < 104 && (class129.field2140[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        int var32 = var14;
                        label404: while (var31 > 0) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class129.field2140[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label404;
                                }
                            }
                            var31--;
                        }
                        label393: while (var32 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class129.field2140[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label393;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var32 + 1 - var31) * (var30 + 1 - var29);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class12.field143[var31][var29][var15];
                            int var38 = class12.field143[var32][var29][var15] - var36;
                            class47.method324(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var31; var39 <= var32; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class129.field2140[var39][var40][var15] = class167.method1128(class129.field2140[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class129.field2140[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var15;
                        int var43;
                        for (var43 = var15; var43 > 0 && (class129.field2140[var14][var16][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44 = var16;
                        while (var42 < 104 && (class129.field2140[var14][var16][var42 + 1] & 0x4) != 0) {
                            var42++;
                        }
                        label459: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var42; var45++) {
                                if ((class129.field2140[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label459;
                                }
                            }
                            var41--;
                        }
                        label448: while (var44 < 104) {
                            for (int var46 = var43; var46 <= var42; var46++) {
                                if ((class129.field2140[var14][var44 + 1][var46] & 0x4) == 0) {
                                    break label448;
                                }
                            }
                            var44++;
                        }
                        if (((var44 + 1 - var41) * (var42 + 1 - var43)) >= 4) {
                            int var47 = class12.field143[var14][var41][var43];
                            class47.method324(4, var41 * 128, var44 * 128 + 128, var43 * 128, var42 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var44; var48++) {
                                for (int var49 = var43; var49 <= var42; var49++) {
                                    class129.field2140[var14][var48][var49] = class167.method1128(class129.field2140[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method147(int arg0) {
        field256 = null;
        int var1 = 13 / ((arg0 + 41) / 45);
        field270 = null;
        field261 = null;
        field266 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lt;Ljava/net/URL;)V")
    public class19(class247 arg0, URL arg1) {
        this.field269 = arg0.method1714(arg1, 105);
        this.field267 = 0;
        this.field253 = class27.method198((byte) -113) + 30000L;
    }
}
