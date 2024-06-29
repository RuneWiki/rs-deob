import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class111 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[Lef;")
    public static class322[] field1563 = new class322[28];

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lhi;")
    public static class291 field1568 = new class291(new byte[5000]);

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lwm;")
    public static class152 field1570 = class157.method1048("Connexion perdue)3", 118);

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "J")
    public static long field1572 = 0L;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Z")
    public static boolean field1571 = false;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lib;IIIIIIZ)V", line = 4)
    public static final void method740(class95 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1353.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1353[var9] - class27.field460;
            int var11 = arg0.field1356[var9] - class3.field54;
            int var12 = arg0.field1354[var9] - class239.field3916;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1369 != null) {
                class95.field1358[var9] = var13;
                class95.field1364[var9] = var16;
                class95.field1351[var9] = var17;
            }
            class95.field1370[var9] = (var13 << 9) / var17 + class181.field2883;
            class95.field1359[var9] = (var16 << 9) / var17 + class181.field2880;
        }
        class181.field2893 = 0;
        int var19 = arg0.field1366.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1366[var20];
            int var22 = arg0.field1361[var20];
            int var23 = arg0.field1350[var20];
            int var24 = class95.field1370[var21];
            int var25 = class95.field1370[var22];
            int var26 = class95.field1370[var23];
            int var27 = class95.field1359[var21];
            int var28 = class95.field1359[var22];
            int var29 = class95.field1359[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class240.field3937 && class199.method1327(class181.field2883 + class108.field1548, class302.field5207 + class181.field2880, var27, var28, var29, var24, var25, var26)) {
                    class233.field3815 = arg5;
                    class258.field4422 = arg6;
                }
                if (!class217.field3516 && !arg7) {
                    class181.field2876 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class181.field2888 || var25 > class181.field2888 || var26 > class181.field2888) {
                        class181.field2876 = true;
                    }
                    if (arg0.field1369 == null || arg0.field1369[var20] == -1) {
                        if (arg0.field1365[var20] != 12345678) {
                            class181.method1198(var27, var28, var29, var24, var25, var26, arg0.field1365[var20], arg0.field1371[var20], arg0.field1355[var20]);
                        }
                    } else if (!class92.field1307) {
                        int var30 = class181.field2878.method1773(arg0.field1369[var20], (byte) 78);
                        class181.method1198(var27, var28, var29, var24, var25, var26, class94.method624(var30, arg0.field1365[var20]), class94.method624(var30, arg0.field1371[var20]), class94.method624(var30, arg0.field1355[var20]));
                    } else if (arg0.field1357) {
                        class181.method1185(var27, var28, var29, var24, var25, var26, arg0.field1365[var20], arg0.field1371[var20], arg0.field1355[var20], class95.field1358[0], class95.field1358[1], class95.field1358[3], class95.field1364[0], class95.field1364[1], class95.field1364[3], class95.field1351[0], class95.field1351[1], class95.field1351[3], arg0.field1369[var20]);
                    } else {
                        class181.method1185(var27, var28, var29, var24, var25, var26, arg0.field1365[var20], arg0.field1371[var20], arg0.field1355[var20], class95.field1358[var21], class95.field1358[var22], class95.field1358[var23], class95.field1364[var21], class95.field1364[var22], class95.field1364[var23], class95.field1351[var21], class95.field1351[var22], class95.field1351[var23], arg0.field1369[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)I", line = 116)
    public static final int method741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1558++;
        if (class268.field4518) {
            arg4 = 1000000;
            class268.field4518 = false;
        }
        class174 var5 = class131.field1994[arg2][arg1];
        int var6 = -36 % ((arg0 - 35) / 44);
        float var7 = ((float) arg3 * 0.1F + 0.7F) * var5.field2793;
        int var8 = var5.field2778;
        float var9 = var5.field2792;
        float var10 = var5.field2791;
        int var11 = var5.field2777;
        int var12 = var5.field2785;
        if (!class236.field3870) {
            var11 = 0;
        }
        if (class122.field1723 != var8 || class183.field2911 != var7 || class270.field4624 != var10 || class54.field846 != var9 || class107.field1530 != var12 || class155.field2462 != var11) {
            class287.field4863 = class112.field1586;
            class122.field1723 = var8;
            class155.field2462 = var11;
            class55.field866 = class270.field4627;
            class232.field3786 = 0;
            class112.field1592 = class85.field1200;
            class107.field1530 = var12;
            class30.field509 = class8.field112;
            class306.field5260 = class120.field1704;
            class183.field2911 = var7;
            class304.field5233 = class107.field1520;
            class270.field4624 = var10;
            class54.field846 = var9;
        }
        if (class232.field3786 < 65536) {
            class232.field3786 += arg4 * 250;
            if (class232.field3786 >= 65536) {
                class232.field3786 = 65536;
            }
            float var13 = (float) (65536 - class232.field3786) / 65536.0F;
            int var14 = 65536 - class232.field3786 >> 8;
            int var15 = class232.field3786 >> 8;
            class85.field1200 = ((class112.field1592 & 0xFF00FF) * var14 + (class107.field1530 & 0xFF00FF) * var15 & 0xFF00FF00) + ((class112.field1592 & 0xFF00) * var14 + (class107.field1530 & 0xFF00) * var15 & 0xFF0000) >> 8;
            float var16 = (float) class232.field3786 / 65536.0F;
            class107.field1520 = class54.field846 * var16 + class304.field5233 * var13;
            class270.field4627 = ((class55.field866 & 0xFF00FF) * var14 + ((class122.field1723 & 0xFF00FF) * var15) & 0xFF00FF00) + ((class55.field866 & 0xFF00) * var14 + ((class122.field1723 & 0xFF00) * var15) & 0xFF0000) >> 8;
            class112.field1586 = class287.field4863 * var13 + class270.field4624 * var16;
            class120.field1704 = class306.field5260 * var13 + class183.field2911 * var16;
            class8.field112 = class30.field509 * var14 + (class155.field2462 * var15) >> 8;
        }
        class14.method93(class270.field4627, class120.field1704, class112.field1586, class107.field1520);
        class14.method87(class85.field1200, class8.field112);
        class14.method88((float) class313.field5427, (float) class108.field1546, (float) class279.field4769);
        class14.method91();
        return class85.field1200;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IJ)Lwm;", line = 197)
    public static final class152 method742(int arg0, long arg1) {
        field1559++;
        class226.field3672.setTime(new Date(arg1));
        int var3 = class226.field3672.get(7);
        int var4 = class226.field3672.get(5);
        int var5 = class226.field3672.get(2);
        int var6 = class226.field3672.get(1);
        int var7 = class226.field3672.get(11);
        int var8 = class226.field3672.get(12);
        int var9 = class226.field3672.get(arg0);
        return class195.method1307(new class152[] { class51.field803[var3 - 1], class55.field865, class38.method280(113, var4 / 10), class38.method280(arg0 + 91, var4 % 10), class260.field4447, class159.field2516[var5], class260.field4447, class38.method280(96, var6), class131.field1996, class38.method280(78, var7 / 10), class38.method280(95, var7 % 10), class202.field3261, class38.method280(74, var8 / 10), class38.method280(122, var8 % 10), class202.field3261, class38.method280(109, var9 / 10), class38.method280(108, var9 % 10), class141.field2165 }, (byte) 29);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 228)
    public static void method743(byte arg0) {
        field1568 = null;
        int var1 = 20 / ((-arg0 - 63) / 42);
        field1570 = null;
        field1563 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 249)
    public static final void method744(byte arg0) {
        if (arg0 != 57) {
            method744((byte) -62);
        }
        class85 var1 = (class85) class134.field2063.method1221((byte) 124);
        field1560++;
        while (var1 != null) {
            if (var1.field1192 > 0) {
                var1.field1192--;
            }
            if (var1.field1192 != 0) {
                if (var1.field1179 > 0) {
                    var1.field1179--;
                }
                if (var1.field1179 == 0 && var1.field1181 >= 1 && var1.field1189 >= 1 && var1.field1181 <= 102 && var1.field1189 <= 102 && (var1.field1180 < 0 || class87.method573((byte) -53, var1.field1184, var1.field1180))) {
                    class283.method1918(var1.field1181, var1.field1180, false, var1.field1185, var1.field1182, var1.field1184, var1.field1177, var1.field1189);
                    var1.field1179 = -1;
                    if (var1.field1196 == var1.field1180 && var1.field1196 == -1) {
                        var1.method1880(-25368);
                    } else if (var1.field1196 == var1.field1180 && var1.field1187 == var1.field1185 && var1.field1193 == var1.field1184) {
                        var1.method1880(-25368);
                    }
                }
            } else if (var1.field1196 < 0 || class87.method573((byte) -53, var1.field1193, var1.field1196)) {
                class283.method1918(var1.field1181, var1.field1196, false, var1.field1187, var1.field1182, var1.field1193, var1.field1177, var1.field1189);
                var1.method1880(-25368);
            }
            var1 = (class85) class134.field2063.method1223(119);
        }
    }
}
