import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 extends class72 {

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Z")
    public boolean field456 = false;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "[I")
    private int[] field463 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "[I")
    private int[] field469 = new int[6];

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    public int field473 = -1;

    @OriginalMember(owner = "client!db", name = "xb", descriptor = "[I")
    private int[] field486 = new int[6];

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lec;")
    public static class28 field453 = class28.method210(-46, "");

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Lec;")
    public static class28 field454 = class28.method210(-46, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "[I")
    public static int[] field464 = new int[256];

    @OriginalMember(owner = "client!db", name = "W", descriptor = "Lec;")
    public static class28 field459 = field453;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "Lec;")
    public static class28 field475 = field453;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Lec;")
    public static class28 field457 = class28.method210(-46, "This computers address has been blocked");

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "Lec;")
    public static class28 field465 = field453;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "Lec;")
    public static class28 field477 = field453;

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "Z")
    public static boolean field481;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "Lvb;")
    public static class122 field480;

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "Z")
    public static boolean field485;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "[I")
    private int[] field471;

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "[I")
    public static int[] field483;

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "[Lwc;")
    public static class128[] field484;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lfb;")
    public final class33 method141(int arg0) {
        field466++;
        if (this.field471 == null) {
            return null;
        }
        class33[] var2 = new class33[this.field471.length];
        if (arg0 < 121) {
            field485 = false;
        }
        for (int var3 = 0; var3 < this.field471.length; var3++) {
            var2[var3] = class33.method285(class51.field1183, this.field471[var3], 0);
        }
        class33 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class33(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field486[var5] != 0; var5++) {
            var4.method270(this.field486[var5], this.field469[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Lec;")
    public static final class28 method142(int arg0, int arg1) {
        if (arg0 != 338) {
            field455 = -71;
        }
        field462++;
        return arg1 < 999999999 ? class5.method25(arg0 ^ 0x198C, arg1) : class7.field116;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILud;I)V")
    private final void method143(int arg0, class119 arg1, int arg2) {
        if (arg2 == 1) {
            this.field473 = arg1.method879((byte) 45);
        } else if (arg2 == 2) {
            int var4 = arg1.method879((byte) 45);
            this.field471 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field471[var5] = arg1.method903(2);
            }
        } else if (arg2 == 3) {
            this.field456 = true;
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field486[arg2 - 40] = arg1.method903(2);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field469[arg2 - 50] = arg1.method903(2);
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field463[arg2 - 60] = arg1.method903(2);
        }
        if (arg0 < 57) {
            this.field473 = 20;
        }
        field458++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILud;)V")
    public final void method144(int arg0, class119 arg1) {
        while (true) {
            int var3 = arg1.method879((byte) 45);
            if (var3 == 0) {
                if (arg0 != -28969) {
                    return;
                }
                field474++;
                return;
            }
            this.method143(100, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BILkc;Lkc;)V")
    public static final void method145(byte arg0, int arg1, class63 arg2, class63 arg3) throws IOException {
        field468++;
        byte[] var4 = arg2.method502((byte) 15, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.length - 2;
        int var6 = 0;
        GZIPInputStream var7 = new GZIPInputStream(new ByteArrayInputStream(var4));
        byte[] var8 = new byte[1000];
        while (true) {
            int var9 = var7.read(var8, 0, var8.length);
            if (var9 == -1) {
                byte[] var10 = new byte[var4.length + 9];
                if (arg0 != -101) {
                    return;
                }
                class84.method637(var4, 0, var10, 9, var4.length);
                class119 var12 = new class119(var10);
                var12.method888(2, -113);
                var12.method898(var5, -1202576);
                var12.method898(var6, -1202576);
                var12.field2554 = var10.length - 2;
                int var13 = var12.method903(arg0 + 103);
                var12.field2554 = var10.length - 2;
                Object var14 = null;
                var12.method876((byte) -48, var13 - 1);
                arg3.method504(var10, arg1, var10.length, -6);
                return;
            }
            var6 += var9;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lta;I[Lub;)V")
    public static final void method146(class111 arg0, int arg1, class117[] arg2) {
        field460++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class47.field1080[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class47.field1080[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method845(var110, 2097152, var111);
                        }
                    }
                }
            }
        }
        class96.field2151 += (int) (Math.random() * 5.0D) - 2;
        if (arg1 != -7261) {
            field484 = null;
        }
        class122.field2662 += (int) (Math.random() * 5.0D) - 2;
        if (class96.field2151 < -16) {
            class96.field2151 = -16;
        }
        if (class96.field2151 > 16) {
            class96.field2151 = 16;
        }
        if (class122.field2662 < -8) {
            class122.field2662 = -8;
        }
        if (class122.field2662 > 8) {
            class122.field2662 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class76.field1720[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class118.field2523[var4][var101 + 1][var50] - class118.field2523[var4][var101 - 1][var50];
                    int var103 = class118.field2523[var4][var101][var50 + 1] - class118.field2523[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var106 * -50 + var105 * -10 + var107 * -50) / var49 + 96;
                    int var109 = (var47[var101][var50 - 1] >> 2) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50] >> 1) + (var47[var101][var50 + 1] >> 3) + (var47[var101 + -1][var50] >> 2);
                    class86.field1909[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class15.field294[var51] = 0;
                class109.field2280[var51] = 0;
                class78.field1818[var51] = 0;
                class127.field2747[var51] = 0;
                class2.field26[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class8.field127[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class7 var97 = class25.method172(var96 - 1, arg1 ^ 0x1C5C);
                            class15.field294[var55] += var97.field113;
                            class109.field2280[var55] += var97.field104;
                            class78.field1818[var55] += var97.field119;
                            class127.field2747[var55] += var97.field100;
                            var10002 = class2.field26[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class8.field127[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class7 var100 = class25.method172(var99 - 1, arg1 ^ 0x1C5C);
                            class15.field294[var55] -= var100.field113;
                            class109.field2280[var55] -= var100.field104;
                            class78.field1818[var55] -= var100.field119;
                            class127.field2747[var55] -= var100.field100;
                            var10002 = class2.field26[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 >= 0 && var63 < 104) {
                            var56 += class15.field294[var63];
                            var58 += class78.field1818[var63];
                            var59 += class127.field2747[var63];
                            var60 += class2.field26[var63];
                            var57 += class109.field2280[var63];
                        }
                        if (var62 >= 0 && var62 < 104) {
                            var59 -= class127.field2747[var62];
                            var57 -= class109.field2280[var62];
                            var58 -= class78.field1818[var62];
                            var60 -= class2.field26[var62];
                            var56 -= class15.field294[var62];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class72.field1591 || (class47.field1080[0][var52][var61] & 0x2) != 0 || (class47.field1080[var4][var52][var61] & 0x10) == 0 && class16.method88(var52, var61, (byte) 117, var4) == class42.field905)) {
                            if (var4 < class32.field681) {
                                class32.field681 = var4;
                            }
                            int var64 = class55.field1272[var4][var52][var61] & 0xFF;
                            int var65 = class8.field127[var4][var52][var61] & 0xFF;
                            if (var65 > 0 || var64 > 0) {
                                int var66 = class118.field2523[var4][var52 + 1][var61 + 1];
                                int var67 = class118.field2523[var4][var52 + 1][var61];
                                int var68 = class86.field1909[var52][var61];
                                int var69 = class86.field1909[var52 + 1][var61 + 1];
                                int var70 = -1;
                                int var71 = class86.field1909[var52 + 1][var61];
                                int var72 = class118.field2523[var4][var52][var61];
                                int var73 = class86.field1909[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = class118.field2523[var4][var52][var61 + 1];
                                if (var65 > 0) {
                                    int var76 = var56 * 256 / var59;
                                    int var77 = var57 / var60;
                                    int var78 = var58 / var60;
                                    var70 = class126.method967(var77, var78, (byte) -38, var76);
                                    int var79 = class122.field2662 + var76 & 0xFF;
                                    int var80 = class96.field2151 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var74 = class126.method967(var77, var80, (byte) -85, var79);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var65 == 0 && class117.field2496[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var64 > 0 && !class77.method590(var64 - 1, 8).field1232) {
                                        var81 = false;
                                    }
                                    if (var81 && var67 == var72 && var66 == var72 && var72 == var75) {
                                        class117.field2472[var4][var52][var61] = class117.method840(class117.field2472[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class60.field1332[class17.method94(96, 0, var74)];
                                }
                                if (var64 == 0) {
                                    arg0.method794(var4, var52, var61, 0, 0, -1, var72, var67, var66, var75, class17.method94(var68, 0, var70), class17.method94(var71, 0, var70), class17.method94(var69, 0, var70), class17.method94(var73, arg1 + 7261, var70), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class117.field2496[var4][var52][var61] + 1;
                                    byte var84 = class49.field1150[var4][var52][var61];
                                    class53 var85 = class77.method590(var64 - 1, arg1 + 7269);
                                    int var86 = var85.field1231;
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var90 = class60.field1331.method17(78, var86);
                                        var87 = -1;
                                    } else if (var85.field1221 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var90 = -2;
                                    } else {
                                        var87 = class126.method967(var85.field1227, var85.field1220, (byte) -104, var85.field1215);
                                        int var88 = class96.field2151 + var85.field1220;
                                        int var89 = var85.field1215 + class122.field2662 & 0xFF;
                                        if (var88 < 0) {
                                            var88 = 0;
                                        } else if (var88 > 255) {
                                            var88 = 255;
                                        }
                                        var90 = class126.method967(var85.field1227, var88, (byte) -116, var89);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class60.field1332[class98.method700((byte) -19, var90, 96)];
                                    }
                                    if (var85.field1216 != -1) {
                                        int var92 = var85.field1223 + class122.field2662 & 0xFF;
                                        int var93 = class96.field2151 + var85.field1225;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class126.method967(var85.field1228, var93, (byte) -54, var92);
                                        var91 = class60.field1332[class98.method700((byte) -93, var94, 96)];
                                    }
                                    arg0.method794(var4, var52, var61, var83, var84, var86, var72, var67, var66, var75, class17.method94(var68, arg1 ^ 0xFFFFE3A3, var70), class17.method94(var71, 0, var70), class17.method94(var69, arg1 ^ 0xFFFFE3A3, var70), class17.method94(var73, arg1 + 7261, var70), class98.method700((byte) -61, var87, var68), class98.method700((byte) -85, var87, var71), class98.method700((byte) -100, var87, var69), class98.method700((byte) -64, var87, var73), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method804(var4, var54, var53, class16.method88(var54, var53, (byte) 111, var4));
                }
            }
            class8.field127[var4] = null;
            class55.field1272[var4] = null;
            class117.field2496[var4] = null;
            class49.field1150[var4] = null;
            class76.field1720[var4] = null;
        }
        arg0.method786(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class47.field1080[1][var5][var46] & 0x2) == 2) {
                    arg0.method766(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var6 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class117.field2472[var10][var12][var11]) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (class117.field2472[var10][var12][var13 - 1] & var6) != 0; var13--) {
                            }
                            int var14 = var10;
                            int var15;
                            for (var15 = var11; var15 < 104 && (class117.field2472[var10][var12][var15 + 1] & var6) != 0; var15++) {
                            }
                            label358: while (var14 > 0) {
                                for (int var16 = var13; var16 <= var15; var16++) {
                                    if ((class117.field2472[var14 - 1][var12][var16] & var6) == 0) {
                                        break label358;
                                    }
                                }
                                var14--;
                            }
                            int var17;
                            label346: for (var17 = var10; var17 < var9; var17++) {
                                for (int var18 = var13; var18 <= var15; var18++) {
                                    if ((var6 & class117.field2472[var17 + 1][var12][var18]) == 0) {
                                        break label346;
                                    }
                                }
                            }
                            int var19 = (var17 + 1 - var14) * (var15 + 1 - var13);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class118.field2523[var17][var12][var13] - var20;
                                int var22 = class118.field2523[var14][var12][var13];
                                class111.method770(var9, 1, var12 * 128, var12 * 128, var13 * 128, var15 * 128 + 128, var21, var22);
                                for (int var23 = var14; var23 <= var17; var23++) {
                                    for (int var24 = var13; var24 <= var15; var24++) {
                                        class117.field2472[var23][var12][var24] = class106.method732(class117.field2472[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class117.field2472[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26;
                            for (var26 = var12; var26 < 104 && (class117.field2472[var10][var26 + 1][var11] & var7) != 0; var26++) {
                            }
                            int var27 = var10;
                            while (var25 > 0 && (var7 & class117.field2472[var10][var25 - 1][var11]) != 0) {
                                var25--;
                            }
                            label413: while (var27 > 0) {
                                for (int var28 = var25; var28 <= var26; var28++) {
                                    if ((var7 & class117.field2472[var27 - 1][var28][var11]) == 0) {
                                        break label413;
                                    }
                                }
                                var27--;
                            }
                            int var29;
                            label401: for (var29 = var10; var29 < var9; var29++) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class117.field2472[var29 + 1][var30][var11] & var7) == 0) {
                                        break label401;
                                    }
                                }
                            }
                            int var31 = (var26 + 1 - var25) * (var29 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class118.field2523[var29][var25][var11] - var32;
                                int var34 = class118.field2523[var27][var25][var11];
                                class111.method770(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var29; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class117.field2472[var35][var36][var11] = class106.method732(class117.field2472[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class117.field2472[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38;
                            for (var38 = var11; var38 > 0 && (class117.field2472[var10][var12][var38 - 1] & var8) != 0; var38--) {
                            }
                            int var39 = var12;
                            int var40;
                            for (var40 = var11; var40 < 104 && (var8 & class117.field2472[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            label467: while (var37 > 0) {
                                for (int var41 = var38; var41 <= var40; var41++) {
                                    if ((var8 & class117.field2472[var10][var37 - 1][var41]) == 0) {
                                        break label467;
                                    }
                                }
                                var37--;
                            }
                            label456: while (var39 < 104) {
                                for (int var42 = var38; var42 <= var40; var42++) {
                                    if ((class117.field2472[var10][var39 + 1][var42] & var8) == 0) {
                                        break label456;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var37) * (var40 + 1 + -var38) >= 4) {
                                int var43 = class118.field2523[var10][var37][var38];
                                class111.method770(var9, 4, var37 * 128, var39 * 128 + 128, var38 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var39; var44++) {
                                    for (int var45 = var38; var45 <= var40; var45++) {
                                        class117.field2472[var10][var44][var45] = class106.method732(class117.field2472[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lfb;")
    public final class33 method147(int arg0) {
        field461++;
        int var2 = 0;
        class33[] var3 = new class33[5];
        if (arg0 <= 108) {
            field475 = null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field463[var4] != -1) {
                var3[var2++] = class33.method285(class51.field1183, this.field463[var4], 0);
            }
        }
        class33 var5 = new class33(var3, var2);
        for (int var6 = 0; var6 < 6 && this.field486[var6] != 0; var6++) {
            var5.method270(this.field486[var6], this.field469[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)Z")
    public final boolean method148(int arg0) {
        field479++;
        if (this.field471 == null) {
            return true;
        }
        if (arg0 != 24752) {
            field482 = 98;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field471.length; var3++) {
            if (!class51.field1183.method941(0, (byte) -110, this.field471[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static final void method149(int arg0) {
        field467++;
        if (class79.field1839 != 0) {
            return;
        }
        class78.field1813[0] = class15.field288;
        class74.field1636[0] = 1001;
        class114.field2435 = 1;
        if (class37.field854 != -1) {
            class20.field446 = -1;
            class98.field2168 = -1;
            class118.method851(0, 0, class88.field1960, 503, 765, class23.field530, -1, 0, 0, class37.field854, (byte) 110);
            class17.field331 = class20.field446;
            class127.field2748 = class98.field2168;
            return;
        }
        class36.method298(-23325);
        class20.field446 = -1;
        class98.field2168 = -1;
        if (class23.field530 > 4 && class88.field1960 > 4 && class23.field530 < 516 && class88.field1960 < 338) {
            if (class40.field860 == -1) {
                class94.method679((byte) -112);
            } else {
                class118.method851(0, 0, class88.field1960, 338, 516, class23.field530, -1, 4, 4, class40.field860, (byte) 114);
            }
        }
        boolean var1 = false;
        class127.field2748 = class98.field2168;
        class17.field331 = class20.field446;
        class98.field2168 = -1;
        class20.field446 = -1;
        if (class23.field530 > 553 && class88.field1960 > 205 && class23.field530 < 743 && class88.field1960 < 466) {
            if (class57.field1307 != -1) {
                class118.method851(1, 0, class88.field1960, 466, 743, class23.field530, -1, 205, 553, class57.field1307, (byte) 109);
            } else if (class127.field2743[class7.field120] != -1) {
                class118.method851(1, 0, class88.field1960, 466, 743, class23.field530, -1, 205, 553, class127.field2743[class7.field120], (byte) 111);
            }
        }
        if (class98.field2168 != class72.field1599) {
            class72.field1599 = class98.field2168;
            class30.field646 = true;
        }
        class98.field2168 = arg0;
        if (class20.field446 != class106.field2247) {
            class106.field2247 = class20.field446;
            class30.field646 = true;
        }
        class20.field446 = -1;
        if (class23.field530 > 17 && class88.field1960 > 357 && class23.field530 < 496 && class88.field1960 < 453) {
            if (class110.field2325 != -1) {
                class118.method851(2, 0, class88.field1960, 453, 496, class23.field530, -1, 357, 17, class110.field2325, (byte) 98);
            } else if (class1.field13 != -1) {
                class118.method851(3, 0, class88.field1960, 453, 496, class23.field530, -1, 357, 17, class1.field13, (byte) 122);
            } else if (class88.field1960 < 434 && class23.field530 < 426) {
                class42.method333(class88.field1960 - 357, class23.field530 + -17, true);
            }
        }
        if ((class110.field2325 != -1 || class1.field13 != -1) && class98.field2168 != class18.field368) {
            class95.field2092 = true;
            class18.field368 = class98.field2168;
        }
        if ((class110.field2325 != -1 || class1.field13 != -1) && class69.field1550 != class20.field446) {
            class69.field1550 = class20.field446;
            class95.field2092 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class114.field2435 - 1; var2++) {
                if (class74.field1636[var2] < 1000 && class74.field1636[var2 + 1] > 1000) {
                    var1 = false;
                    class28 var3 = class78.field1813[var2];
                    class78.field1813[var2] = class78.field1813[var2 + 1];
                    class78.field1813[var2 + 1] = var3;
                    int var4 = class74.field1636[var2];
                    class74.field1636[var2] = class74.field1636[var2 + 1];
                    class74.field1636[var2 + 1] = var4;
                    int var5 = class49.field1148[var2];
                    class49.field1148[var2] = class49.field1148[var2 + 1];
                    class49.field1148[var2 + 1] = var5;
                    int var6 = class46.field1017[var2];
                    class46.field1017[var2] = class46.field1017[var2 + 1];
                    class46.field1017[var2 + 1] = var6;
                    int var7 = class76.field1713[var2];
                    class76.field1713[var2] = class76.field1713[var2 + 1];
                    class76.field1713[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public static void method150(int arg0) {
        field465 = null;
        field484 = null;
        field459 = null;
        field457 = null;
        field454 = null;
        if (arg0 > -82) {
            field477 = null;
        }
        field464 = null;
        field483 = null;
        field477 = null;
        field453 = null;
        field480 = null;
        field475 = null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)Z")
    public final boolean method151(byte arg0) {
        field478++;
        if (arg0 != 90) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field463[var3] != -1 && !class51.field1183.method941(0, (byte) -110, this.field463[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/awt/Component;II)Lcc;")
    public static final class16 method152(int arg0, Component arg1, int arg2, int arg3) {
        field470++;
        try {
            if (arg2 != 8065) {
                method150(-128);
            }
            Class var4 = Class.forName("de");
            class16 var5 = (class16) var4.getDeclaredConstructor().newInstance();
            var5.method87(arg3, arg1, arg0, arg2 - 8081);
            return var5;
        } catch (Throwable var7) {
            class76 var6 = new class76();
            var6.method87(arg3, arg1, arg0, arg2 ^ 0xFFFFE071);
            return var6;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILvb;)V")
    public static final void method153(int arg0, class122 arg1) {
        field472++;
        field480 = arg1;
        if (arg0 >= -123) {
            method149(-16);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field464[var0] = var1;
        }
        field482 = 0;
        field481 = false;
    }
}
