import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class68 implements Runnable {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Z")
    public boolean field1588 = true;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field1594 = new Object();

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public int field1598 = 0;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "[I")
    public int[] field1602 = new int[500];

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "[I")
    public int[] field1601 = new int[500];

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lld;")
    public static class111 field1587 = new class111(64);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field1595 = -1;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[[B")
    public static byte[][] field1599 = new byte[1000][];

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Ldd;")
    public static class35 field1597 = class180.method1196((byte) -42, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lae;")
    public static class6 field1600;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1596;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)Lf;")
    public static final class51 method550(int arg0, byte arg1) {
        if (arg1 != 27) {
            field1599 = null;
        }
        field1585++;
        class51 var2 = (class51) class34.field700.method817(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class51 var3 = class130.method901(class134.field2863, arg0, class93.field2068, false, (byte) -87);
        if (var3 != null) {
            class34.field700.method816(var3, (long) arg0, 16);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BILfd;)I")
    public static final int method551(byte arg0, int arg1, class55 arg2) {
        field1591++;
        if (arg2.field1288 == null || arg1 >= arg2.field1288.length) {
            return -2;
        } else if (arg0 == 7) {
            try {
                int[] var3 = arg2.field1288[arg1];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = 0;
                    byte var8 = 0;
                    int var9 = var3[var5++];
                    if (var9 == 0) {
                        return var4;
                    }
                    if (var9 == 1) {
                        var7 = class159.field3239[var3[var5++]];
                    }
                    if (var9 == 15) {
                        var8 = 1;
                    }
                    if (var9 == 16) {
                        var8 = 2;
                    }
                    if (var9 == 17) {
                        var8 = 3;
                    }
                    if (var9 == 2) {
                        var7 = class129.field2781[var3[var5++]];
                    }
                    if (var9 == 3) {
                        var7 = class172.field3440[var3[var5++]];
                    }
                    if (var9 == 4) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class55 var12 = class131.method903(arg0 ^ 0x244DBDD7, var11);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class207.method1370((byte) -73, var13).field989 || class22.field442)) {
                            for (int var14 = 0; var14 < var12.field1316.length; var14++) {
                                if (var13 + 1 == var12.field1316[var14]) {
                                    var7 += var12.field1242[var14];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var7 = class115.field2557[var3[var5++]];
                    }
                    if (var9 == 6) {
                        var7 = class175.field3576[class129.field2781[var3[var5++]] - 1];
                    }
                    if (var9 == 7) {
                        var7 = class115.field2557[var3[var5++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var7 = class71.field1704.field2262;
                    }
                    if (var9 == 9) {
                        for (int var15 = 0; var15 < 25; var15++) {
                            if (class71.field1705[var15]) {
                                var7 += class129.field2781[var15];
                            }
                        }
                    }
                    if (var9 == 10) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class55 var18 = class131.method903(arg0 + 609074633, var17);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class207.method1370((byte) -73, var19).field989 || class22.field442)) {
                            for (int var20 = 0; var20 < var18.field1316.length; var20++) {
                                if (var19 + 1 == var18.field1316[var20]) {
                                    var7 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var7 = class115.field2587;
                    }
                    if (var9 == 12) {
                        var7 = class24.field484;
                    }
                    if (var9 == 13) {
                        int var21 = class115.field2557[var3[var5++]];
                        int var22 = var3[var5++];
                        var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                    }
                    if (var9 == 14) {
                        int var23 = var3[var5++];
                        var7 = class120.method855(var23, (byte) -111);
                    }
                    if (var9 == 18) {
                        var7 = (class71.field1704.field1664 >> 7) + class172.field3444;
                    }
                    if (var9 == 19) {
                        var7 = (class71.field1704.field1676 >> 7) + class67.field1552;
                    }
                    if (var9 == 20) {
                        var7 = var3[var5++];
                    }
                    if (var8 == 0) {
                        if (var6 == 0) {
                            var4 += var7;
                        }
                        if (var6 == 1) {
                            var4 -= var7;
                        }
                        if (var6 == 2 && var7 != 0) {
                            var4 /= var7;
                        }
                        if (var6 == 3) {
                            var4 *= var7;
                        }
                        var6 = 0;
                    } else {
                        var6 = var8;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method552(int arg0) {
        field1600 = null;
        int var1 = -43 % ((arg0 + 73) / 53);
        field1596 = null;
        field1587 = null;
        field1599 = null;
        field1597 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static final void method553(int arg0) {
        class154.method1035(false, -3);
        field1586++;
        class31.field659 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class129.field2783.length; var2++) {
            if (class110.field2434[var2] != -1 && class129.field2783[var2] == null) {
                class129.field2783[var2] = class48.field1055.method39(class110.field2434[var2], -1, 0);
                if (class129.field2783[var2] == null) {
                    var1 = false;
                    class31.field659++;
                }
            }
            if (class73.field1734[var2] != -1 && class118.field2624[var2] == null) {
                class118.field2624[var2] = class48.field1055.method47(class133.field2844[var2], class73.field1734[var2], 0, 14593);
                if (class118.field2624[var2] == null) {
                    var1 = false;
                    class31.field659++;
                }
            }
        }
        if (!var1) {
            class114.field2556 = 1;
            return;
        }
        boolean var3 = true;
        class26.field576 = 0;
        for (int var4 = 0; var4 < class129.field2783.length; var4++) {
            byte[] var56 = class118.field2624[var4];
            if (var56 != null) {
                int var57 = (class167.field3374[var4] >> 8) * 64 - class172.field3444;
                int var58 = (class167.field3374[var4] & 0xFF) * 64 - class67.field1552;
                if (class102.field2252) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class136.method933(var57, var56, (byte) -117, var58);
            }
        }
        if (!var3) {
            class114.field2556 = 2;
            return;
        }
        if (class114.field2556 != 0) {
            class162.method1076(class63.method529(new class35[] { class172.field3442, class148.field3111 }, (byte) 105), (byte) -103, true);
        }
        class145.method993(true);
        class42.method396(false);
        class145.method993(true);
        class188.method1244();
        class145.method993(true);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class167.field3375[var5].method297(-5);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class40.field894[var6][var54][var55] = 0;
                }
            }
        }
        class145.method993(true);
        class178.method1184(false);
        int var7 = class129.field2783.length;
        class17.method159((byte) -17);
        class154.method1035(true, -3);
        if (!class102.field2252) {
            for (int var8 = 0; var8 < var7; var8++) {
                byte[] var17 = class129.field2783[var8];
                int var18 = (class167.field3374[var8] & 0xFF) * 64 - class67.field1552;
                int var19 = (class167.field3374[var8] >> 8) * 64 - class172.field3444;
                if (var17 != null) {
                    class145.method993(true);
                    class100.method752(var18, (client.field632 - 6) * 8, (byte) 23, class167.field3375, var19, var17, class93.field2051 * 8 - 48);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class167.field3374[var9] >> 8) * 64 - class172.field3444;
                int var15 = (class167.field3374[var9] & 0xFF) * 64 - class67.field1552;
                byte[] var16 = class129.field2783[var9];
                if (var16 == null && class93.field2051 < 800) {
                    class145.method993(true);
                    class99.method747(var15, 64, var14, 64, (byte) 33);
                }
            }
            class154.method1035(true, -3);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class118.field2624[var10];
                if (var11 != null) {
                    int var12 = (class167.field3374[var10] >> 8) * 64 - class172.field3444;
                    int var13 = (class167.field3374[var10] & 0xFF) * 64 - class67.field1552;
                    class145.method993(true);
                    class197.method1290((byte) -4, var12, var11, var13, class167.field3375);
                }
            }
        }
        if (class102.field2252) {
            for (int var20 = 0; var20 < 4; var20++) {
                class145.method993(true);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class44.field954[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 1 & 0x3;
                            int var39 = var37 >> 14 & 0x3FF;
                            int var40 = var37 >> 24 & 0x3;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var39 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class167.field3374.length; var43++) {
                                if (class167.field3374[var43] == var42 && class129.field2783[var43] != null) {
                                    class95.method728(var34 * 8, (var41 & 0x7) * 8, class129.field2783[var43], false, var35 * 8, (var39 & 0x7) * 8, var40, var20, var38, class167.field3375);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class124.method882(var20, var34 * 8, var35 * 8, (byte) -128);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class44.field954[0][var21][var32];
                    if (var33 == -1) {
                        class99.method747(var32 * 8, 8, var21 * 8, 8, (byte) 109);
                    }
                }
            }
            class154.method1035(true, arg0 - 3);
            for (int var22 = 0; var22 < 4; var22++) {
                class145.method993(true);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class44.field954[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class167.field3374.length; var31++) {
                                if (class167.field3374[var31] == var30 && class118.field2624[var31] != null) {
                                    class160.method1062((var29 & 0x7) * 8, var24 * 8, (var28 & 0x7) * 8, class118.field2624[var31], var23 * 8, var27, class167.field3375, 16311, var22, var26);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class154.method1035(true, -3);
        class42.method396(false);
        class145.method993(true);
        class148.method1011(class167.field3375, -126);
        class154.method1035(true, -3);
        int var44 = class25.field502;
        if (class175.field3585 < var44) {
            var44 = class175.field3585;
        }
        if (var44 < class175.field3585 - 1) {
            int var45 = class175.field3585 - 1;
        }
        if (class35.field781) {
            class181.method1204(class25.field502);
        } else {
            class181.method1204(0);
        }
        for (int var46 = arg0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class181.method1201(var53, var46, 2048);
            }
        }
        class145.method993(true);
        class181.method1203(101);
        class42.method396(false);
        if (class109.field2415 != null) {
            class179.field3665++;
            class1.field11.method659(152, true);
            class1.field11.method249(1057001181, arg0 + 111);
        }
        if (!class102.field2252) {
            int var47 = (client.field632 + 6) / 8;
            int var48 = (class93.field2051 - 6) / 8;
            int var49 = (client.field632 - 6) / 8;
            int var50 = (class93.field2051 + 6) / 8;
            for (int var51 = var49 - 1; var51 <= var47 + 1; var51++) {
                for (int var52 = var48 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var49 || var51 > var47 || var48 > var52 || var50 < var52) {
                        class48.field1055.method63((byte) 115, class63.method529(new class35[] { class20.field396, class3.method19(var51, arg0 - 29578), class107.field2376, class3.method19(var52, -29578) }, (byte) 126));
                        class48.field1055.method63((byte) -33, class63.method529(new class35[] { class110.field2435, class3.method19(var51, arg0 ^ 0xFFFF8C76), class107.field2376, class3.method19(var52, -29578) }, (byte) 124));
                    }
                }
            }
        }
        class59.method509(30, (byte) 123);
        class145.method993(true);
        class165.method1090((byte) -28);
        class1.field11.method659(64, true);
        class55.method487((byte) 73);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lae;ILae;)V")
    public static final void method554(class6 arg0, int arg1, class6 arg2) {
        if (class70.field1687 == null) {
            class70.field1687 = class88.method648(class133.field2847, (byte) 124, 0, class78.field1815);
        }
        field1589++;
        if (class99.field2169 == null) {
            class99.field2169 = class129.method897(class108.field2402, class78.field1815, 0, true);
        }
        if (class145.field3075 == null) {
            class145.field3075 = class129.method897(class176.field3600, class78.field1815, 0, true);
        }
        int var3 = 4 / ((49 - arg1) / 38);
        if (class101.field2240 == null) {
            class101.field2240 = class129.method897(class210.field4162, class78.field1815, 0, true);
        }
        class140.method970(0, 23, 765, 480, 0);
        class140.method960(0, 0, 125, 23, 12425273, 9135624);
        class140.method960(125, 0, 640, 23, 5197647, 2697513);
        arg0.method1326(class195.field3893, 62, 15, 0, -1);
        if (class101.field2240 != null) {
            class101.field2240[1].method162(140, 1);
            arg2.method1322(class90.field2017, 152, 10, 16777215, -1);
            class101.field2240[0].method162(140, 12);
            arg2.method1322(class42.field922, 152, 21, 16777215, -1);
        }
        if (class145.field3075 != null) {
            short var4 = 280;
            if (class100.field2192[0] == 0 && class120.field2642[0] == 0) {
                class145.field3075[2].method162(var4, 4);
            } else {
                class145.field3075[0].method162(var4, 4);
            }
            short var5 = 500;
            if (class100.field2192[0] == 0 && class120.field2642[0] == 1) {
                class145.field3075[3].method162(var4 + 15, 4);
            } else {
                class145.field3075[1].method162(var4 + 15, 4);
            }
            short var6 = 610;
            short var7 = 390;
            arg0.method1322(class143.field3004, var4 + 32, 17, 16777215, -1);
            if (class100.field2192[0] == 1 && class120.field2642[0] == 0) {
                class145.field3075[2].method162(var7, 4);
            } else {
                class145.field3075[0].method162(var7, 4);
            }
            if (class100.field2192[0] == 1 && class120.field2642[0] == 1) {
                class145.field3075[3].method162(var7 + 15, 4);
            } else {
                class145.field3075[1].method162(var7 + 15, 4);
            }
            arg0.method1322(class38.field840, var7 + 32, 17, 16777215, -1);
            if (class100.field2192[0] == 2 && class120.field2642[0] == 0) {
                class145.field3075[2].method162(var5, 4);
            } else {
                class145.field3075[0].method162(var5, 4);
            }
            if (class100.field2192[0] == 2 && class120.field2642[0] == 1) {
                class145.field3075[3].method162(var5 + 15, 4);
            } else {
                class145.field3075[1].method162(var5 + 15, 4);
            }
            arg0.method1322(class99.field2183, var5 + 32, 17, 16777215, -1);
            if (class100.field2192[0] == 3 && class120.field2642[0] == 0) {
                class145.field3075[2].method162(var6, 4);
            } else {
                class145.field3075[0].method162(var6, 4);
            }
            if (class100.field2192[0] == 3 && class120.field2642[0] == 1) {
                class145.field3075[3].method162(var6 + 15, 4);
            } else {
                class145.field3075[1].method162(var6 + 15, 4);
            }
            arg0.method1322(class182.field3740, var6 + 32, 17, 16777215, -1);
        }
        class140.method970(708, 4, 50, 16, 0);
        arg2.method1326(class147.field3102, 733, 16, 16777215, -1);
        class166.field3350 = -1;
        if (class70.field1687 == null) {
            return;
        }
        byte var8 = 88;
        byte var9 = 19;
        int var10 = 765 / (var8 + 1);
        int var11 = 480 / (var9 + 1);
        int var12;
        int var13;
        do {
            var12 = var10;
            var13 = var11;
            if (class131.field2813 <= (var10 - 1) * var11) {
                var10--;
            }
            if ((var11 - 1) * var10 >= class131.field2813) {
                var11--;
            }
            if (class131.field2813 <= (var11 - 1) * var10) {
                var11--;
            }
        } while (var11 != var13 || var10 != var12);
        int var14 = (765 - var8 * var10) / (var10 + 1);
        if (var14 > 5) {
            var14 = 5;
        }
        int var15 = (765 - var8 * var10 - (var10 + -1) * var14) / 2;
        int var16 = (480 - var9 * var11) / (var11 + 1);
        if (var16 > 5) {
            var16 = 5;
        }
        int var17 = (480 - (var11 - 1) * var16 - var9 * var11) / 2;
        int var18 = var15;
        int var19 = var17 + 23;
        int var20 = 0;
        for (int var21 = 0; var21 < class131.field2813; var21++) {
            boolean var22 = true;
            class84 var23 = class20.field399[var21];
            class35 var24 = class3.method19(var23.field1934, -29578);
            if (var23.field1934 == -1) {
                var22 = false;
                var24 = class64.field1532;
            } else if (var23.field1934 > 1980) {
                var22 = false;
                var24 = class64.field1540;
            }
            if (var18 <= class17.field329 && class98.field2168 >= var19 && var18 + var8 > class17.field329 && var19 + var9 > class98.field2168 && var22) {
                class166.field3350 = var21;
                class70.field1687[var23.field1922 ? 1 : 0].method112(var18, var19, 128, 16777215);
            } else {
                class70.field1687[var23.field1922 ? 1 : 0].method93(var18, var19);
            }
            if (class99.field2169 != null) {
                class99.field2169[var23.field1933 + (var23.field1922 ? 8 : 0)].method162(var18 + 29, var19);
            }
            arg0.method1326(class3.method19(var23.field1935, -29578), var18 + 15, var19 + 5 - -(var9 / 2), 0, -1);
            arg2.method1326(var24, var18 + 60, var9 / 2 + 5 + var19, 268435455, -1);
            var19 += var9 + var16;
            var20++;
            if (var20 >= var11) {
                var18 += var8 + var14;
                var20 = 0;
                var19 = var17 + 23;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)[Lbg;")
    public static final class18[] method555(byte arg0) {
        int var1 = 33 % ((arg0 - 46) / 56);
        field1590++;
        class18[] var2 = new class18[class135.field2904];
        for (int var3 = 0; var3 < class135.field2904; var3++) {
            class18 var4 = new class18();
            var4.field357 = class37.field815;
            var4.field359 = class57.field1425;
            var4.field354 = class207.field4119[var3];
            var4.field360 = class143.field3003[var3];
            var4.field358 = class15.field269[var3];
            var4.field356 = class118.field2623[var3];
            var4.field355 = class116.field2591;
            var4.field361 = class203.field4039[var3];
            var2[var3] = var4;
        }
        class123.method878(-93);
        return var2;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
    public static final int method556(int arg0, int arg1, int arg2) {
        field1592++;
        class210 var3 = (class210) class35.field746.method796(true, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 != -26374) {
            return -125;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4155.length; var5++) {
                if (var3.field4156[var5] == arg2) {
                    var4 += var3.field4155[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gh", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1588) {
            Object var1 = this.field1594;
            synchronized (this.field1594) {
                if (this.field1598 < 500) {
                    this.field1601[this.field1598] = class17.field329;
                    this.field1602[this.field1598] = class98.field2168;
                    this.field1598++;
                }
            }
            class204.method1347(50L, false);
        }
        field1593++;
    }
}
