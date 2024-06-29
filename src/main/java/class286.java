import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class286 extends class232 {

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "Z")
    private boolean field4810 = true;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "Z")
    private boolean field4812 = true;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "Lhi;")
    public static class82 field4806 = class95.method664((byte) -29, "lila:");

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "[I")
    public static int[] field4809 = new int[4096];

    @OriginalMember(owner = "client!pl", name = "eb", descriptor = "Lhi;")
    public static class82 field4819 = class95.method664((byte) -97, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!pl", name = "ib", descriptor = "Lhi;")
    private static class82 field4823 = class95.method664((byte) -33, "Loaded wordpack");

    @OriginalMember(owner = "client!pl", name = "ab", descriptor = "Lhi;")
    public static class82 field4815 = field4823;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!pl", name = "cb", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!pl", name = "db", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!pl", name = "fb", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!pl", name = "gb", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!pl", name = "jb", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!pl", name = "hb", descriptor = "Lum;")
    public static class222 field4822;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "[Lwh;")
    public static class60[] field4811;

    @OriginalMember(owner = "client!pl", name = "bb", descriptor = "[[[I")
    public static int[][][] field4816;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZLbh;)V", line = 10)
    public static final void method1983(int arg0, boolean arg1, class18 arg2) {
        field4820++;
        if (class147.field2485 || arg1) {
            int var3 = class180.field3078;
            int var4 = var3 * 956 / 503;
            class100.field1798.method604((class260.field4462 - var4) / 2, 0, var4, var3);
            class280.field4709.method1284(class260.field4462 / 2 - (class280.field4709.field3711 / 2), 18);
        }
        arg2.method120(class68.field1058, class260.field4462 / 2, class180.field3078 / 2 - 26, 16777215, -1);
        int var5 = class180.field3078 / 2 - 18;
        if (arg0 <= 26) {
            return;
        }
        if (class147.field2485) {
            class116.method786(class260.field4462 / 2 - 152, var5, 304, 34, 9179409);
            class116.method786(class260.field4462 / 2 - 151, var5 + 1, 302, 32, 0);
            class116.method784(class260.field4462 / 2 - 150, var5 + 2, class327.field5597 * 3, 30, 9179409);
            class116.method784(class327.field5597 * 3 + class260.field4462 / 2 - 150, var5 + 2, 300 - (class327.field5597 * 3), 30, 0);
        } else {
            class320.method2207(class260.field4462 / 2 - 152, var5, 304, 34, 9179409);
            class320.method2207(class260.field4462 / 2 - 151, var5 - -1, 302, 32, 0);
            class320.method2217(class260.field4462 / 2 - 150, var5 + 2, class327.field5597 * 3, 30, 9179409);
            class320.method2217(class260.field4462 / 2 + class327.field5597 * 3 - 150, var5 - -2, 300 - (class327.field5597 * 3), 30, 0);
        }
        arg2.method120(class16.field144, class260.field4462 / 2, class180.field3078 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)Lhg;", line = 50)
    public static final class305 method1984(int arg0, int arg1) {
        class305 var2 = (class305) class90.field1625.method2175((long) arg0, 3008);
        field4807++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == 5269) {
            byte[] var3 = class192.field3220.method1577(4, arg0, -29569);
            class305 var4 = new class305();
            if (var3 != null) {
                var4.method2111(new class153(var3), arg0, 75);
            }
            class90.field1625.method2169(var4, (long) arg0, (byte) 94);
            return var4;
        } else {
            return (class305) null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lum;I)V", line = 82)
    public static final void method1985(class222 arg0, int arg1) {
        if (arg1 != 16767793) {
            field4816 = (int[][][]) ((int[][][]) null);
        }
        class192.field3220 = arg0;
        field4817++;
        class105.field1860 = class192.field3220.method1568(1673, 4);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 93)
    public class286() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(IB)[I", line = 106)
    public final int[] method80(int arg0, byte arg1) {
        int[] var3 = this.field4008.method131((byte) -127, arg0);
        if (this.field4008.field256) {
            int[] var4 = this.method1649(0, (byte) 121, this.field4810 ? class209.field3684 - arg0 : arg0);
            if (this.field4812) {
                for (int var5 = 0; var5 < class54.field858; var5++) {
                    var3[var5] = var4[class65.field1024 - var5];
                }
            } else {
                class190.method1319(var4, 0, var3, 0, class54.field858);
            }
        }
        field4805++;
        int var6 = -62 / ((-arg1 - 31) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBLbc;)V", line = 153)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field4812 = arg2.method1082(-68) == 1;
        } else if (arg0 == 1) {
            this.field4810 = arg2.method1082(-29) == 1;
        } else if (arg0 == 2) {
            this.field3990 = arg2.method1082(arg1 ^ 0x2D) == 1;
        }
        if (arg1 == -19) {
            field4804++;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lhi;Lhi;IILhi;)V", line = 188)
    public static final void method1986(class82 arg0, class82 arg1, int arg2, int arg3, class82 arg4) {
        class62.method403(0, arg4, arg1, arg3, arg0, -1);
        if (arg2 == 1) {
            field4814++;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[[[Lrk;IIIZ)Z", line = 207)
    public static final boolean method1987(int arg0, class16[][][] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        byte var6 = arg5 ? 1 : (byte) (class47.field789 & 0xFF);
        field4808++;
        if (class138.field2376[class297.field5058][arg0][arg3] == var6) {
            return false;
        } else if ((class204.field3567[class297.field5058][arg0][arg3] & 0x4) == 0) {
            return false;
        } else {
            field4809[arg2] = arg0;
            int var7 = arg2 + 1;
            class79.field1342[arg2] = arg3;
            int var8 = 0;
            class138.field2376[class297.field5058][arg0][arg3] = var6;
            while (var7 != var8) {
                int var9 = field4809[var8] & 0xFFFF;
                int var10 = field4809[var8] >> 24 & 0xFF;
                int var11 = (field4809[var8] & 0xFFDB31) >> 16;
                int var12 = class79.field1342[var8] & 0xFFFF;
                int var13 = (class79.field1342[var8] & 0xFF8055) >> 16;
                boolean var14 = false;
                if ((class204.field3567[class297.field5058][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label239: for (int var16 = class297.field5058 + 1; var16 <= 3; var16++) {
                    if ((class204.field3567[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field171 != null) {
                                int var17 = class48.method344((byte) 126, var11);
                                if (arg1[var16][var9][var12].field171.field1629 == var17 || arg1[var16][var9][var12].field171.field1624 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class48.method344((byte) 126, var10);
                                    if (arg1[var16][var9][var12].field171.field1629 == var18 || arg1[var16][var9][var12].field171.field1624 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class48.method344((byte) -80, var13);
                                    if (arg1[var16][var9][var12].field171.field1629 == var19 || arg1[var16][var9][var12].field171.field1624 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var9][var12].field158 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var9][var12].field165; var20++) {
                                    int var21 = (int) (arg1[var16][var9][var12].field158[var20].field1064 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg1[var16][var9][var12].field158[var20].field1064 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var11 == var23 || var10 != 0 && var10 == var23 || var13 != 0 && var13 == var23) {
                                        continue label239;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class16 var24 = arg1[var16][var9][var12];
                        if (var24 != null && var24.field165 > 0) {
                            for (int var25 = 0; var25 < var24.field165; var25++) {
                                class69 var26 = var24.field158[var25];
                                if (var26.field1076 != var26.field1068 || var26.field1083 != var26.field1080) {
                                    for (int var27 = var26.field1076; var27 <= var26.field1068; var27++) {
                                        for (int var28 = var26.field1080; var28 <= var26.field1083; var28++) {
                                            class138.field2376[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class138.field2376[var16][var9][var12] = var6;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (var15) {
                    if (class291.field4883[arg4] < class245.field4255[class297.field5058 + 1][var9][var12]) {
                        class291.field4883[arg4] = class245.field4255[class297.field5058 + 1][var9][var12];
                    }
                    int var29 = var12 << 7;
                    int var30 = var9 << 7;
                    if (class44.field761[arg4] > var30) {
                        class44.field761[arg4] = var30;
                    } else if (class224.field3892[arg4] < var30) {
                        class224.field3892[arg4] = var30;
                    }
                    if (var29 < class98.field1775[arg4]) {
                        class98.field1775[arg4] = var29;
                    } else if (class28.field388[arg4] < var29) {
                        class28.field388[arg4] = var29;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class138.field2376[class297.field5058][var9 - 1][var12] != var6) {
                        field4809[var7] = class98.method674(-754974720, class98.method674(1179648, var9 - 1));
                        class79.field1342[var7] = class98.method674(1245184, var12);
                        var7 = var7 + 1 & 0xFFF;
                        class138.field2376[class297.field5058][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class138.field2376[class297.field5058][var9 - 1][var12] != var6 && (class204.field3567[class297.field5058][var9][var12] & 0x4) == 0 && (class204.field3567[class297.field5058][var9 - 1][var12 - 1] & 0x4) == 0) {
                            field4809[var7] = class98.method674(1375731712, class98.method674(var9 - 1, 1179648));
                            class79.field1342[var7] = class98.method674(1245184, var12);
                            class138.field2376[class297.field5058][var9 - 1][var12] = var6;
                            var7 = var7 + 1 & 0xFFF;
                        }
                        if (class138.field2376[class297.field5058][var9][var12] != var6) {
                            field4809[var7] = class98.method674(class98.method674(5373952, var9), 318767104);
                            class79.field1342[var7] = class98.method674(var12, 5439488);
                            class138.field2376[class297.field5058][var9][var12] = var6;
                            var7 = var7 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class138.field2376[class297.field5058][var9 + 1][var12] != var6 && (class204.field3567[class297.field5058][var9][var12] & 0x4) == 0 && (class204.field3567[class297.field5058][var9 + 1][var12 - 1] & 0x4) == 0) {
                            field4809[var7] = class98.method674(class98.method674(5373952, var9 + 1), -1845493760);
                            class79.field1342[var7] = class98.method674(5439488, var12);
                            var7 = var7 + 1 & 0xFFF;
                            class138.field2376[class297.field5058][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < 104 && class138.field2376[class297.field5058][var9 + 1][var12] != var6) {
                        field4809[var7] = class98.method674(1392508928, class98.method674(var9 + 1, 9568256));
                        class79.field1342[var7] = class98.method674(9633792, var12);
                        var7 = var7 + 1 & 0xFFF;
                        class138.field2376[class297.field5058][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class138.field2376[class297.field5058][var9 - 1][var12] != var6 && (class204.field3567[class297.field5058][var9][var12] & 0x4) == 0 && (class204.field3567[class297.field5058][var9 - 1][var12 + 1] & 0x4) == 0) {
                            field4809[var7] = class98.method674(301989888, class98.method674(13762560, var9 - 1));
                            class79.field1342[var7] = class98.method674(13828096, var12);
                            var7 = var7 + 1 & 0xFFF;
                            class138.field2376[class297.field5058][var9 - 1][var12] = var6;
                        }
                        if (class138.field2376[class297.field5058][var9][var12] != var6) {
                            field4809[var7] = class98.method674(-1828716544, class98.method674(13762560, var9));
                            class79.field1342[var7] = class98.method674(13828096, var12);
                            class138.field2376[class297.field5058][var9][var12] = var6;
                            var7 = var7 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class138.field2376[class297.field5058][var9 + 1][var12] != var6 && (class204.field3567[class297.field5058][var9][var12] & 0x4) == 0 && (class204.field3567[class297.field5058][var9 + 1][var12 + 1] & 0x4) == 0) {
                            field4809[var7] = class98.method674(-771751936, class98.method674(9568256, var9 + 1));
                            class79.field1342[var7] = class98.method674(9633792, var12);
                            var7 = var7 + 1 & 0xFFF;
                            class138.field2376[class297.field5058][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class291.field4883[arg4] != -1000000) {
                class291.field4883[arg4] += 10;
                class44.field761[arg4] -= 50;
                class224.field3892[arg4] += 50;
                class28.field388[arg4] += 50;
                class98.field1775[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "(I)V", line = 511)
    public static final void method1988(int arg0) {
        field4821++;
        if (arg0 != -27325) {
            method1987(-61, (class16[][][]) ((class16[][][]) null), -86, -110, -86, true);
        }
        if (class80.field1362 == 0 || class80.field1362 == 5) {
            return;
        }
        try {
            if (++class31.field467 > 2000) {
                if (class66.field1036 != null) {
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                }
                if (class261.field4467 >= 1) {
                    class80.field1362 = 0;
                    class95.field1735 = -5;
                    return;
                }
                class80.field1362 = 1;
                class261.field4467++;
                class31.field467 = 0;
                if (class92.field1643 == class39.field686) {
                    class39.field686 = class203.field3530;
                } else {
                    class39.field686 = class92.field1643;
                }
            }
            if (class80.field1362 == 1) {
                class133.field2297 = class55.field881.method831(class39.field686, (byte) 118, class135.field2339);
                class80.field1362 = 2;
            }
            if (class80.field1362 == 2) {
                if (class133.field2297.field5121 == 2) {
                    throw new IOException();
                }
                if (class133.field2297.field5121 != 1) {
                    return;
                }
                class66.field1036 = new class302((Socket) class133.field2297.field5122, class55.field881);
                class133.field2297 = null;
                long var1 = class9.field71 = class129.field2248.method568(22476);
                class61.field957.field2611 = 0;
                class61.field957.method1075(14, -1);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class61.field957.method1075(var3, -1);
                class66.field1036.method2083(true, 2, class61.field957.field2598, 0);
                if (class67.field1048 != null) {
                    class67.field1048.method752((byte) -113);
                }
                if (class142.field2435 != null) {
                    class142.field2435.method752((byte) -71);
                }
                int var4 = class66.field1036.method2089(-84);
                if (class67.field1048 != null) {
                    class67.field1048.method752((byte) -57);
                }
                if (class142.field2435 != null) {
                    class142.field2435.method752((byte) -39);
                }
                if (var4 != 0) {
                    class80.field1362 = 0;
                    class95.field1735 = var4;
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                    return;
                }
                class80.field1362 = 3;
            }
            if (class80.field1362 == 3) {
                if (class66.field1036.method2088((byte) 91) < 8) {
                    return;
                }
                class66.field1036.method2087(8, class35.field545.field2598, 0, (byte) 109);
                class35.field545.field2611 = 0;
                class53.field854 = class35.field545.method1067(-1510872160);
                int[] var5 = new int[4];
                class61.field957.field2611 = 0;
                var5[3] = (int) class53.field854;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class53.field854 >> 32);
                class61.field957.method1075(10, -1);
                class61.field957.method1065(178808912, var5[0]);
                class61.field957.method1065(178808912, var5[1]);
                class61.field957.method1065(arg0 + 178836237, var5[2]);
                class61.field957.method1065(178808912, var5[3]);
                class61.field957.method1057((byte) 43, class129.field2248.method568(22476));
                class61.field957.method1098((byte) 56, class129.field2239);
                class61.field957.method1079(class17.field180, class276.field4647, false);
                class129.field2243.field2611 = 0;
                if (class61.field959 == 40) {
                    class129.field2243.method1075(18, -1);
                } else {
                    class129.field2243.method1075(16, -1);
                }
                class129.field2243.method1102((byte) -46, class61.field957.field2611 + class201.method1413(class159.field2765, (byte) -125) + 159);
                class129.field2243.method1065(arg0 ^ 0xF557FD13, 522);
                class129.field2243.method1075(class233.field4042, -1);
                class129.field2243.method1075(class48.field802 ? 1 : 0, -1);
                class129.field2243.method1075(1, arg0 + 27324);
                class129.field2243.method1075(class284.method1972((byte) 15), -1);
                class129.field2243.method1102((byte) -21, class260.field4462);
                class129.field2243.method1102((byte) -72, class180.field3078);
                class129.field2243.method1075(class146.field2467, arg0 + 27324);
                class196.method1366(class129.field2243, -128);
                class129.field2243.method1098((byte) 56, class159.field2765);
                class129.field2243.method1065(arg0 ^ 0xF557FD13, class80.field1361);
                class129.field2243.method1065(arg0 + 178836237, class56.method387(-28234));
                class16.field149 = true;
                class129.field2243.method1102((byte) -33, class27.field359);
                class129.field2243.method1065(arg0 ^ 0xF557FD13, class111.field2009.method1584(118));
                class129.field2243.method1065(arg0 ^ 0xF557FD13, class191.field3190.method1584(arg0 + 27255));
                class129.field2243.method1065(178808912, class130.field2265.method1584(79));
                class129.field2243.method1065(178808912, class164.field2880.method1584(69));
                class129.field2243.method1065(178808912, field4822.method1584(-62));
                class129.field2243.method1065(178808912, class184.field3134.method1584(-125));
                class129.field2243.method1065(178808912, class33.field484.method1584(88));
                class129.field2243.method1065(arg0 + 178836237, class284.field4764.method1584(arg0 ^ 0xFFFF9503));
                class129.field2243.method1065(178808912, class182.field3117.method1584(-25));
                class129.field2243.method1065(178808912, class267.field4535.method1584(arg0 ^ 0x6AD7));
                class129.field2243.method1065(arg0 ^ 0xF557FD13, class279.field4679.method1584(-128));
                class129.field2243.method1065(178808912, class296.field5051.method1584(87));
                class129.field2243.method1065(178808912, class52.field846.method1584(arg0 + 27220));
                class129.field2243.method1065(178808912, class62.field976.method1584(109));
                class129.field2243.method1065(arg0 ^ 0xF557FD13, class88.field1565.method1584(-55));
                class129.field2243.method1065(178808912, class327.field5586.method1584(-25));
                class129.field2243.method1065(178808912, class19.field254.method1584(-98));
                class129.field2243.method1065(178808912, class231.field3984.method1584(-25));
                class129.field2243.method1065(178808912, class80.field1366.method1584(78));
                class129.field2243.method1065(arg0 ^ 0xF557FD13, class34.field530.method1584(arg0 + 27257));
                class129.field2243.method1065(178808912, class302.field5147.method1584(-83));
                class129.field2243.method1065(178808912, class243.field4219.method1584(113));
                class129.field2243.method1065(178808912, class35.field563.method1584(96));
                class129.field2243.method1065(arg0 + 178836237, class209.field3676.method1584(arg0 ^ 0xFFFF9517));
                class129.field2243.method1065(178808912, class63.field982.method1584(arg0 ^ 0x6AF1));
                class129.field2243.method1065(178808912, class203.field3497.method1584(64));
                class129.field2243.method1065(178808912, class119.field2103.method1584(arg0 + 27414));
                class129.field2243.method1065(arg0 + 178836237, class277.field4662.method1584(109));
                class129.field2243.method1106(class61.field957.field2598, class61.field957.field2611, (byte) 16, 0);
                class66.field1036.method2083(true, class129.field2243.field2611, class129.field2243.field2598, 0);
                class61.field957.method1501(var5, 123);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class35.field545.method1501(var5, arg0 + 27410);
                class80.field1362 = 4;
            }
            if (class80.field1362 == 4) {
                if (class66.field1036.method2088((byte) 91) < 1) {
                    return;
                }
                int var7 = class66.field1036.method2089(-112);
                if (var7 == 21) {
                    class80.field1362 = 7;
                } else if (var7 == 29) {
                    class80.field1362 = 10;
                } else if (var7 == 1) {
                    class80.field1362 = 5;
                    class95.field1735 = var7;
                    return;
                } else if (var7 == 2) {
                    class80.field1362 = 8;
                } else if (var7 == 15) {
                    class95.field1735 = var7;
                    class80.field1362 = 0;
                    return;
                } else if (var7 == 23 && class261.field4467 < 1) {
                    class31.field467 = 0;
                    class261.field4467++;
                    class80.field1362 = 1;
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                    return;
                } else {
                    class95.field1735 = var7;
                    class80.field1362 = 0;
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                    return;
                }
            }
            if (class80.field1362 == 6) {
                class61.field957.field2611 = 0;
                class61.field957.method1504(17, -1);
                class66.field1036.method2083(true, class61.field957.field2611, class61.field957.field2598, 0);
                class80.field1362 = 4;
                return;
            }
            if (class80.field1362 == 7) {
                if (class66.field1036.method2088((byte) 91) < 1) {
                    return;
                }
                class324.field5572 = class66.field1036.method2089(arg0 ^ 0x6ADF) * 60 + 180;
                class80.field1362 = 0;
                class95.field1735 = 21;
                class66.field1036.method2085(true);
                class66.field1036 = null;
                return;
            }
            if (class80.field1362 == 10) {
                if (class66.field1036.method2088((byte) 91) >= 1) {
                    class233.field4023 = class66.field1036.method2089(60);
                    class80.field1362 = 0;
                    class95.field1735 = 29;
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                    return;
                }
                return;
            }
            if (class80.field1362 == 8) {
                if (class66.field1036.method2088((byte) 91) < 14) {
                    return;
                }
                class66.field1036.method2087(14, class35.field545.field2598, 0, (byte) 127);
                class35.field545.field2611 = 0;
                class323.field5545 = class35.field545.method1082(-25);
                class69.field1066 = class35.field545.method1082(-105);
                class82.field1462 = class35.field545.method1082(arg0 + 27233) == 1;
                class317.field5437 = class35.field545.method1082(-70) == 1;
                class227.field3935 = class35.field545.method1082(-70) == 1;
                class289.field4864 = class35.field545.method1082(-90) == 1;
                class288.field4838 = class35.field545.method1082(-39) == 1;
                class109.field1949 = class35.field545.method1090(false);
                class86.field1534 = class35.field545.method1082(arg0 + 27299) == 1;
                class323.field5547 = class35.field545.method1082(-65) == 1;
                class297.method2057(class323.field5547, (byte) -31);
                class144.method981(-1, class323.field5547);
                if (!class48.field802) {
                    if ((!class82.field1462 || class227.field3935) && !class86.field1534) {
                        try {
                            class237.field4121.method549(class55.field881.field2109, (byte) 50);
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class87.field1547.method549(class55.field881.field2109, (byte) 95);
                        } catch (Throwable var11) {
                        }
                    }
                }
                class187.field3155 = class35.field545.method1503(121);
                class199.field3421 = class35.field545.method1090(false);
                class80.field1362 = 9;
            }
            if (class80.field1362 == 9) {
                if (class66.field1036.method2088((byte) 91) >= class199.field3421) {
                    class35.field545.field2611 = 0;
                    class66.field1036.method2087(class199.field3421, class35.field545.field2598, 0, (byte) 114);
                    class95.field1735 = 2;
                    class80.field1362 = 0;
                    class146.method988(0);
                    class260.field4465 = -1;
                    class109.method750(arg0 - 4553, false);
                    class187.field3155 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class66.field1036 != null) {
                class66.field1036.method2085(true);
                class66.field1036 = null;
            }
            if (class261.field4467 < 1) {
                class80.field1362 = 1;
                class31.field467 = 0;
                class261.field4467++;
                if (class92.field1643 == class39.field686) {
                    class39.field686 = class203.field3530;
                } else {
                    class39.field686 = class92.field1643;
                }
            } else {
                class95.field1735 = -4;
                class80.field1362 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(II)V", line = 893)
    public static final void method1989(int arg0, int arg1) {
        field4813++;
        class227 var2 = class215.method1531(-1, 5, arg1);
        var2.method1624((byte) -101);
        if (arg0 != -1477916752) {
            method1990(-94, -32, 20, 105, -6, -110, -8, -34);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIII)V", line = 907)
    public static final void method1990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4824++;
        int var8 = class163.method1179(arg5, class29.field399, class60.field931, (byte) -99);
        int var9 = class163.method1179(arg6, class29.field399, class60.field931, (byte) -110);
        int var10 = class163.method1179(arg7, class207.field3623, class200.field3443, (byte) -110);
        int var11 = class163.method1179(arg1, class207.field3623, class200.field3443, (byte) -120);
        int var12 = class163.method1179(arg3 + arg5, class29.field399, class60.field931, (byte) -70);
        int var13 = class163.method1179(arg6 - arg3, class29.field399, class60.field931, (byte) -112);
        for (int var14 = var8; var14 < var12; var14++) {
            class114.method780(arg0 ^ 0x2B, var10, var11, arg2, class73.field1117[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class114.method780(85, var10, var11, arg2, class73.field1117[var15]);
        }
        int var16 = class163.method1179(arg3 + arg7, class207.field3623, class200.field3443, (byte) -106);
        int var17 = class163.method1179(arg1 - arg3, class207.field3623, class200.field3443, (byte) -80);
        if (arg0 != -1) {
            method1987(19, (class16[][][]) ((class16[][][]) null), -66, -57, 94, true);
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class73.field1117[var18];
            class114.method780(-65, var10, var16, arg2, var19);
            class114.method780(-56, var16, var17, arg4, var19);
            class114.method780(arg0 ^ 0xFFFFFFA3, var17, var11, arg2, var19);
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 964)
    public static void method1991(byte arg0) {
        field4809 = null;
        field4811 = null;
        field4806 = null;
        if (arg0 > -121) {
            method1986((class82) null, (class82) null, -92, -92, (class82) null);
        }
        field4816 = (int[][][]) null;
        field4819 = null;
        field4822 = null;
        field4815 = null;
        field4823 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)[[I", line = 1000)
    public final int[][] method146(int arg0, byte arg1) {
        field4818++;
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[][] var4 = this.method1641(0, this.field4810 ? class209.field3684 - arg0 : arg0, (byte) -98);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4812) {
                for (int var11 = 0; var11 < class54.field858; var11++) {
                    var8[var11] = var5[class65.field1024 - var11];
                    var9[var11] = var7[class65.field1024 - var11];
                    var10[var11] = var6[class65.field1024 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class54.field858; var12++) {
                    var8[var12] = var5[var12];
                    var9[var12] = var7[var12];
                    var10[var12] = var6[var12];
                }
            }
        }
        if (arg1 != -82) {
            method1984(-85, -116);
        }
        return var3;
    }
}
