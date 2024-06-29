import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class134 {

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public int field2321 = -1;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field2314 = -1;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2315 = -1;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2323 = " more options";

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2324 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static volatile int field2316 = -1;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lrc;")
    public static class9 field2325 = new class9(64);

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2330 = new String[1000];

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
    public int[] field2318;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILeh;I)V")
    public final void method926(int arg0, class101 arg1, int arg2) {
        if (arg2 <= 65) {
            return;
        }
        while (true) {
            int var4 = arg1.method669((byte) 36);
            if (var4 == 0) {
                field2329++;
                return;
            }
            this.method929((byte) -48, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method927(int arg0) {
        class178.method1181((byte) -124, 5);
        class220.method1459(5, 3);
        class175.method1162(false, 5);
        if (arg0 < 122) {
            field2315 = -127;
        }
        field2319++;
        class161.method1097(5, (byte) -42);
        class109.method763(5, (byte) -105);
        class204.method1351(-91, 5);
        class263.method1745(5, -89);
        class203.method1342((byte) 55, 5);
        class175.method1161(-76, 5);
        class6.method31((byte) -94, 5);
        class124.method852(5, 3204);
        class253.method1675(-29529, 5);
        class161.method1094((byte) -94, 5);
        class57.method357((byte) 27, 5);
        class153.method1050(5, (byte) -71);
        class239.method1578((byte) 81, 5);
        class273.method1796((byte) 114, 5);
        class225.method1514(0, 50);
        class259.method1722(0, 5);
        class76.method463(5, 4);
        class151.field2525.method63(0, 5);
        class51.field882.method63(0, 5);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
    public static final void method928(boolean arg0, int arg1) {
        if (arg0) {
            field2327++;
            class55 var2 = class62.method395(12, arg1, (byte) -66);
            var2.method341((byte) 62);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIILeh;)V")
    private final void method929(byte arg0, int arg1, int arg2, class101 arg3) {
        if (arg0 > -31) {
            method934(0, (Component) null);
        }
        field2320++;
        if (arg1 == 1) {
            this.field2321 = arg3.method677(false);
        } else if (arg1 == 2) {
            this.field2318 = new int[arg3.method669((byte) 36)];
            for (int var5 = 0; var5 < this.field2318.length; var5++) {
                this.field2318[var5] = arg3.method677(false);
            }
        } else if (arg1 == 3) {
            this.field2314 = arg3.method669((byte) 36);
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static final void method930(int arg0) {
        int var1 = 67 % ((arg0 + 41) / 38);
        field2326++;
        if (class158.field2642 == null) {
            return;
        }
        if (class101.field1785 < 10) {
            if (!class186.field3020.method736(class158.field2642.field595, (byte) 6)) {
                class101.field1785 = class101.field1739.method728(0, class158.field2642.field595) / 10;
                return;
            }
            class9.method59(19234);
            class101.field1785 = 10;
        }
        if (class101.field1785 == 10) {
            class193.field3114 = class158.field2642.field591 >> 6 << 6;
            class124.field2184 = class158.field2642.field580 >> 6 << 6;
            class203.field3318 = (class158.field2642.field594 >> 6 << 6) + 64 - class124.field2184;
            class83.field1514 = (class158.field2642.field589 >> 6 << 6) - (class193.field3114 - 64);
            int[] var2 = class158.field2642.method265((class273.field4378.field1458 >> 7) + class255.field4162, (class273.field4378.field1397 >> 7) + class126.field2206, class176.field2886, 5);
            int var3 = -1;
            int var4 = -1;
            if (var2 != null) {
                var4 = var2[1] - class124.field2184;
                var3 = class193.field3114 + class83.field1514 - var2[2] - 1;
            }
            if (var4 >= 0 && class203.field3318 > var4 && var3 >= 0 && class83.field1514 > var3) {
                int var5 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class294.field4681 = var5;
                int var6 = var3 + (int) (Math.random() * 10.0D) - 5;
                class213.field3583 = var6;
            } else if (class106.field1890 == -1 || class5.field62 == -1) {
                int[] var8 = class158.field2642.method263(class158.field2642.field579 & 0x3FFF, (byte) -55, class158.field2642.field579 >> 14 & 0x3FFF);
                class294.field4681 = var8[1] - class124.field2184;
                class213.field3583 = class83.field1514 + class193.field3114 - var8[2] - 1;
            } else {
                int[] var7 = class158.field2642.method263(class5.field62, (byte) -43, class106.field1890);
                if (var7 != null) {
                    class294.field4681 = var7[1] - class124.field2184;
                    class213.field3583 = class83.field1514 + class193.field3114 - var7[2] - 1;
                }
                class5.field62 = -1;
                class106.field1890 = -1;
            }
            if (class158.field2642.field576 == 37) {
                class116.field2077 = 3.0F;
                class151.field2534 = 3.0F;
            } else if (class158.field2642.field576 == 50) {
                class116.field2077 = 4.0F;
                class151.field2534 = 4.0F;
            } else if (class158.field2642.field576 == 75) {
                class116.field2077 = 6.0F;
                class151.field2534 = 6.0F;
            } else if (class158.field2642.field576 == 100) {
                class116.field2077 = 8.0F;
                class151.field2534 = 8.0F;
            } else if (class158.field2642.field576 == 200) {
                class116.field2077 = 16.0F;
                class151.field2534 = 16.0F;
            } else {
                class116.field2077 = 8.0F;
                class151.field2534 = 8.0F;
            }
            class27.method180((byte) -120);
            int var9 = class250.field4086 >> 2 << 10;
            int var10 = class83.field1514 >> 6;
            int var11 = class203.field3318 >> 6;
            class122.field2157 = new byte[var11][var10][];
            class92.field1615 = new int[class165.field2705 + 1];
            int var12 = class207.field3462 >> 1;
            class24.field384 = new byte[var11][var10][];
            class30.field447 = new int[var11][var10][];
            class262.field4278 = new byte[var11][var10][];
            class259.field4244 = new byte[var11][var10][];
            class45.field635 = new int[var11][var10][];
            class171.field2810 = new int[var11][var10][];
            class211.field3567 = new byte[var11][var10][];
            class179.method1187(var9, var12, 16473);
            class101.field1785 = 20;
        } else if (class101.field1785 == 20) {
            class263.method1744(new class101(class186.field3020.method729(class158.field2642.field595, 97, "underlay")), false);
            class101.field1785 = 30;
            class78.method511(true, 8033);
            class2.method10((byte) 125);
        } else if (class101.field1785 == 30) {
            class217.method1443(520085025, new class101(class186.field3020.method729(class158.field2642.field595, -107, "overlay")));
            class101.field1785 = 40;
            class2.method10((byte) 65);
        } else if (class101.field1785 == 40) {
            class10.method65(-94, new class101(class186.field3020.method729(class158.field2642.field595, -68, "overlay2")));
            class101.field1785 = 50;
            class2.method10((byte) 87);
        } else if (class101.field1785 == 50) {
            class23.method164(new class101(class186.field3020.method729(class158.field2642.field595, -56, "loc")), false);
            class101.field1785 = 60;
            class78.method511(true, 8033);
            class2.method10((byte) -125);
        } else if (class101.field1785 == 60) {
            if (class186.field3020.method741(-16808, class158.field2642.field595 + "_labels")) {
                if (!class186.field3020.method736(class158.field2642.field595 + "_labels", (byte) 6)) {
                    return;
                }
                class252.field4135 = client.method1921(class158.field2642.field595 + "_labels", 0, class186.field3020);
            } else {
                class252.field4135 = new class195(0);
            }
            class101.field1785 = 70;
            class2.method10((byte) 43);
        } else if (class101.field1785 == 70) {
            class183.field2979 = new class137(11, true, class118.field2099);
            class101.field1785 = 73;
            class78.method511(true, 8033);
            class2.method10((byte) -116);
        } else if (class101.field1785 == 73) {
            class91.field1613 = new class137(12, true, class118.field2099);
            class101.field1785 = 76;
            class78.method511(true, 8033);
            class2.method10((byte) 123);
        } else if (class101.field1785 == 76) {
            class292.field4666 = new class137(14, true, class118.field2099);
            class101.field1785 = 79;
            class78.method511(true, 8033);
            class2.method10((byte) 87);
        } else if (class101.field1785 == 79) {
            class24.field380 = new class137(17, true, class118.field2099);
            class101.field1785 = 82;
            class78.method511(true, 8033);
            class2.method10((byte) 58);
        } else if (class101.field1785 == 82) {
            class140.field2409 = new class137(19, true, class118.field2099);
            class101.field1785 = 85;
            class78.method511(true, 8033);
            class2.method10((byte) 76);
        } else if (class101.field1785 == 85) {
            class158.field2636 = new class137(22, true, class118.field2099);
            class101.field1785 = 88;
            class78.method511(true, 8033);
            class2.method10((byte) 24);
        } else if (class101.field1785 == 88) {
            class151.field2535 = new class137(26, true, class118.field2099);
            class101.field1785 = 91;
            class78.method511(true, 8033);
            class2.method10((byte) -114);
        } else {
            class121.field2122 = new class137(30, true, class118.field2099);
            class101.field1785 = 100;
            class78.method511(true, 8033);
            class2.method10((byte) 43);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field2325 = null;
        if (arg0 >= -76) {
            field2324 = null;
        }
        field2330 = null;
        field2323 = null;
        field2324 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(ZI)V")
    public static final void method932(boolean arg0, int arg1) {
        field2328++;
        int var2 = class157.field2624;
        if (arg1 == 0) {
            var2 = 1;
        }
        if (!arg0) {
            return;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class288 var20;
            if (arg1 == 0) {
                var20 = class273.field4378;
            } else {
                var20 = class105.field1874[class280.field4458[var3]];
            }
            if (var20 != null && var20.method536(124)) {
                int var21 = var20.method528(-95);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field1397 & 0x7F) == 64 && (var20.field1458 & 0x7F) == 64) {
                            int var28 = var20.field1397 >> 7;
                            int var29 = var20.field1458 >> 7;
                            if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                var10002 = class50.field861[var28][var29]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field1397 & 0x7F) == 0 && (var20.field1458 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field1397 & 0x7F) == 64 && (var20.field1458 & 0x7F) == 64)) {
                        int var22 = var20.field1458 - (var21 * 64) >> 7;
                        int var23 = var20.field1397 - (var21 * 64) >> 7;
                        int var24 = var20.method528(-26) + var23;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        int var25 = var20.method528(-48) + var22;
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        for (int var26 = var23; var26 < var24; var26++) {
                            for (int var27 = var22; var27 < var25; var27++) {
                                var10002 = class50.field861[var26][var27]++;
                            }
                        }
                    }
                }
            }
        }
        label216: for (int var4 = 0; var4 < var2; var4++) {
            class288 var5;
            long var6;
            if (arg1 == 0) {
                var5 = class273.field4378;
                var6 = 8791798054912L;
            } else {
                var6 = (long) class280.field4458[var4] << 32;
                var5 = class105.field1874[class280.field4458[var4]];
            }
            if (var5 != null && var5.method536(124)) {
                int var8 = var5.method528(124);
                if (arg1 == 0 || arg1 == var8) {
                    var5.field4594 = false;
                    var5.field1479 = true;
                    if ((class11.field156 && class157.field2624 > 200 || class157.field2624 > 50) && arg1 != 0 && var5.field1421 == var5.method533(-1).field531) {
                        var5.field4594 = true;
                    }
                    if (var8 == 1) {
                        if ((var5.field1397 & 0x7F) == 64 && (var5.field1458 & 0x7F) == 64) {
                            int var9 = var5.field1458 >> 7;
                            int var10 = var5.field1397 >> 7;
                            if (var10 < 0 || var10 >= 104 || var9 < 0 || var9 >= 104) {
                                continue;
                            }
                            if (class50.field861[var10][var9] > 1) {
                                var10002 = class50.field861[var10][var9]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var5.field1397 & 0x7F) == 0 && (var5.field1458 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field1397 & 0x7F) == 64 && (var5.field1458 & 0x7F) == 0) {
                        int var11 = var5.field1397 - (var8 * 64) >> 7;
                        int var12 = var5.field1458 - (var8 * 64) >> 7;
                        int var13 = var11 + var8;
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        int var14 = var12 + var8;
                        if (var14 > 104) {
                            var14 = 104;
                        }
                        boolean var15 = true;
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        for (int var16 = var11; var16 < var13; var16++) {
                            for (int var19 = var12; var19 < var14; var19++) {
                                if (class50.field861[var16][var19] <= 1) {
                                    var15 = false;
                                    break;
                                }
                            }
                        }
                        if (var15) {
                            int var17 = var11;
                            while (true) {
                                if (var17 >= var13) {
                                    continue label216;
                                }
                                for (int var18 = var12; var18 < var14; var18++) {
                                    var10002 = class50.field861[var17][var18]--;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var5.field1442 == null || var5.field1410 > class266.field4301 || var5.field1436 <= class266.field4301) {
                        var5.field1479 = false;
                        var5.field1391 = class10.method68(arg0, class176.field2886, var5.field1458, var5.field1397);
                        class121.method823(class176.field2886, var5.field1397, var5.field1458, var5.field1391, (var8 - 1) * 64 + 60, var5, var5.field1413, var6, var5.field1432);
                    } else {
                        var5.field1479 = false;
                        var5.field4594 = false;
                        var5.field1391 = class10.method68(true, class176.field2886, var5.field1458, var5.field1397);
                        class224.method1506(class176.field2886, var5.field1397, var5.field1458, var5.field1391, var5, var5.field1413, var6, var5.field1394, var5.field1416, var5.field1417, var5.field1455);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lfc;I)V")
    public static final void method933(class148 arg0, int arg1) {
        if (arg1 != 18243) {
            field2330 = null;
        }
        field2322++;
        for (int var2 = 0; var2 < class163.field2696.length; var2++) {
            class163.field2696[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class163.field2696[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class106.field1902[var15] = (class163.field2696[var15 - 128] + class163.field2696[var15 - 1] - (-class163.field2696[var15 + 1] - class163.field2696[var15 + 128])) / 4;
                }
            }
            int[] var13 = class163.field2696;
            class163.field2696 = class106.field1902;
            class106.field1902 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field1709; var7++) {
            for (int var8 = 0; var8 < arg0.field1711; var8++) {
                if (arg0.field2508[var6++] != 0) {
                    int var9 = arg0.field1713 + var8 + 16;
                    int var10 = arg0.field1718 + var7 + 16;
                    int var11 = var9 + (var10 << 7);
                    class163.field2696[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method934(int arg0, Component arg1) {
        field2317++;
        arg1.removeMouseListener(class253.field4140);
        arg1.removeMouseMotionListener(class253.field4140);
        arg1.removeFocusListener(class253.field4140);
        int var2 = -20 % ((arg0 + 70) / 40);
        class272.field4374 = 0;
    }
}
