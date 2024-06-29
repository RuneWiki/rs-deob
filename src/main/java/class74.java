import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class74 {

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field1646 = 0;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "[Lke;")
    private class65[] field1636;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lrc;")
    private static class105 field1641 = class43.method374("World", 0);

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lrc;")
    public static class105 field1637 = field1641;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field1640 = 0;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lrc;")
    public static class105 field1643 = class43.method374("mapmarker", 0);

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lrc;")
    public static class105 field1644 = class43.method374("mapdots", 0);

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Z")
    public static volatile boolean field1645 = true;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lcd;")
    public static class17 field1635 = new class17();

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Lrc;")
    private static class105 field1651 = class43.method374("Loading fonts )2 ", 0);

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "Lrc;")
    public static class105 field1653 = field1651;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "[I")
    public static int[] field1655 = new int[128];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "J")
    private long field1623;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lva;")
    public static class127 field1634;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lvc;")
    public static class129 field1630;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lke;")
    private class65 field1622;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Lke;")
    private class65 field1649;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lme;")
    public static class77 field1624;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Z")
    public static boolean field1648;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "[I")
    public static int[] field1647;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "[Lbd;")
    public static class11[] field1652;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILme;Lme;)V", line = 10)
    public static final void method619(int arg0, class77 arg1, class77 arg2) {
        class59.field1320.method323(arg0 - 180);
        field1638++;
        if (class78.field1761 == 0 || class78.field1761 == 5) {
            byte var3 = 20;
            arg1.method668(class97.field2231, 180, 74 - var3, 16777215);
            int var4 = 82 - var3;
            class69.method588(28, var4, 304, 34, 9179409);
            class69.method588(29, var4 + 1, 302, 32, 0);
            class69.method580(30, var4 + 2, class122.field2986 * 3, 30, 9179409);
            class69.method580(class122.field2986 * 3 + 30, var4 + 2, 300 - class122.field2986 * 3, 30, 0);
            arg1.method668(class37.field865, 180, 105 - var3, 16777215);
        }
        if (class78.field1761 == 20) {
            class6.field66.method134(0, 0);
            byte var5 = 40;
            arg1.method673(class37.field849, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg1.method673(class37.field857, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg1.method673(class37.field863, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg1.method658(class108.method878(new class105[] { class72.field1588, class37.field855 }, 2867), 90, var22, 16777215, true);
            int var24 = var22 + 15;
            arg1.method658(class108.method878(new class105[] { class67.field1523, class37.field850.method838(true) }, 2867), 92, var24, 16777215, true);
            int var25 = var24 + 15;
        }
        if (class78.field1761 == 10) {
            class6.field66.method134(0, 0);
            if (class9.field173 == 0) {
                byte var6 = 80;
                byte var7 = 100;
                arg1.method673(class98.field2259, 180, var6, 16776960, true);
                int var23 = var6 + 30;
                byte var8 = 120;
                class19.field449.method134(var7 - 73, var8 - 20);
                arg1.method669(class123.field3020, var7 - 73, var8 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var9 = 260;
                class19.field449.method134(var9 - 73, var8 + -20);
                arg1.method669(class104.field2369, var9 - 73, var8 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class9.field173 == 2) {
                byte var13 = 40;
                byte var14 = 100;
                arg1.method673(class37.field849, 180, var13, 16776960, true);
                int var30 = var13 + 15;
                arg1.method673(class37.field857, 180, var30, 16776960, true);
                int var31 = var30 + 15;
                arg1.method673(class37.field863, 180, var31, 16776960, true);
                int var32 = var31 + 15;
                int var33 = var32 + 10;
                arg1.method658(class108.method878(new class105[] { class72.field1588, class37.field855, class104.field2351 % 40 < 20 & class127.field3085 == 0 ? class29.field663 : class37.field858 }, 2867), 90, var33, 16777215, true);
                int var34 = var33 + 15;
                short var15 = 150;
                arg1.method658(class108.method878(new class105[] { class67.field1523, class37.field850.method838(true), class104.field2351 % 40 < 20 & class127.field3085 == 1 ? class29.field663 : class37.field858 }, 2867), 92, var34, 16777215, true);
                int var35 = var34 + 15;
                class19.field449.method134(var14 - 73, var15 + -20);
                arg1.method673(class66.field1491, var14, var15 + 5, 16777215, true);
                short var16 = 260;
                class19.field449.method134(var16 - 73, var15 + -20);
                arg1.method673(class43.field1006, var16, var15 + 5, 16777215, true);
            } else if (class9.field173 == 3) {
                short var10 = 180;
                byte var11 = 65;
                arg1.method673(class19.field469, 180, 40, 16776960, true);
                arg1.method673(class41.field930, 180, var11, 16777215, true);
                int var26 = var11 + 15;
                arg1.method673(class104.field2367, 180, var26, 16777215, true);
                short var12 = 150;
                int var27 = var26 + 15;
                arg1.method673(class121.field2957, 180, var27, 16777215, true);
                int var28 = var27 + 15;
                arg1.method673(class92.field2153, 180, var28, 16777215, true);
                class19.field449.method134(var10 - 73, var12 + -20);
                int var29 = var28 + 15;
                arg1.method673(class43.field1006, var10, var12 + 5, 16777215, true);
            }
        }
        class6.method53(-127);
        try {
            Graphics var17 = class41.field935.getGraphics();
            class59.field1320.method320(202, var17, (byte) -89, 171);
            class45.field1014.method320(0, var17, (byte) -89, 0);
            class133.field3234.method320(637, var17, (byte) -89, 0);
            if (arg0 == 180 && class67.field1506) {
                class67.field1506 = false;
                class37.field861.method320(128, var17, (byte) -89, 0);
                class123.field3028.method320(202, var17, (byte) -89, 371);
                class128.field3107.method320(0, var17, (byte) -89, 265);
                class37.field853.method320(562, var17, (byte) -89, 265);
                class96.field2212.method320(128, var17, (byte) -89, 171);
                class10.field208.method320(562, var17, (byte) -89, 171);
            }
        } catch (Exception var18) {
            class41.field935.repaint();
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Lke;", line = 147)
    public final class65 method620(byte arg0) {
        field1631++;
        if (this.field1622 == null) {
            return null;
        }
        int var2 = 108 / ((arg0 - 21) / 61);
        class65 var3 = this.field1636[(int) (this.field1623 & (long) (this.field1632 - 1))];
        while (this.field1622 != var3) {
            if (this.field1622.field1448 == this.field1623) {
                class65 var4 = this.field1622;
                this.field1622 = this.field1622.field1449;
                return var4;
            }
            this.field1622 = this.field1622.field1449;
        }
        this.field1622 = null;
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lke;", line = 176)
    public final class65 method621(int arg0) {
        field1626++;
        this.field1646 = 0;
        return arg0 < 30 ? null : this.method623(103);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 202)
    public static final void method622(int arg0) {
        field1621++;
        class119.field2880.method323(0);
        class34.field793.method134(0, 0);
        class95.field2190 = class38.method355(class95.field2190);
        if (arg0 >= -63) {
            field1624 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lke;", line = 217)
    private final class65 method623(int arg0) {
        field1627++;
        if (this.field1646 > 0 && this.field1636[this.field1646 - 1] != this.field1649) {
            class65 var2 = this.field1649;
            this.field1649 = var2.field1449;
            return var2;
        }
        int var3 = -61 / ((arg0 - 4) / 42);
        while (this.field1646 < this.field1632) {
            class65 var4 = this.field1636[this.field1646++].field1449;
            if (this.field1636[this.field1646 - 1] != var4) {
                this.field1649 = var4.field1449;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)Lke;", line = 247)
    public final class65 method624(byte arg0, long arg1) {
        field1642++;
        this.field1623 = arg1;
        if (arg0 <= 33) {
            this.method620((byte) 29);
        }
        class65 var4 = this.field1636[(int) (arg1 & (long) (this.field1632 - 1))];
        for (this.field1622 = var4.field1449; this.field1622 != var4; this.field1622 = this.field1622.field1449) {
            if (this.field1622.field1448 == arg1) {
                class65 var5 = this.field1622;
                this.field1622 = this.field1622.field1449;
                return var5;
            }
        }
        this.field1622 = null;
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLke;J)V", line = 277)
    public final void method625(byte arg0, class65 arg1, long arg2) {
        field1629++;
        if (arg1.field1467 != null) {
            arg1.method551(102);
        }
        int var5 = -26 / ((arg0 + 64) / 52);
        class65 var6 = this.field1636[(int) ((long) (this.field1632 - 1) & arg2)];
        arg1.field1449 = var6;
        arg1.field1448 = arg2;
        arg1.field1467 = var6.field1467;
        arg1.field1467.field1449 = arg1;
        arg1.field1449.field1467 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 305)
    public static final void method626(byte arg0, int arg1) {
        field1628++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class128.field3104[arg1];
        int var3 = class96.field2225[arg1];
        int var4 = class15.field298[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class67.field1521[arg1];
        if (class98.field2257 != 0 && var4 != 1005) {
            class90.field2064 = true;
            class98.field2257 = 0;
        }
        if (var4 == 23) {
            class39.field914 = var3;
            class112.field2639 = var2;
            class57.field1199 = 1;
            class43.field995 = var5;
            class29.field661 = class108.method878(new class105[] { class134.field3263, class75.method636(var5, 0).field706, class90.field2060 }, 2867);
            if (class29.field661 == null) {
                class29.field661 = class85.field1919;
            }
            class80.field1805 = true;
            class122.field3003 = 0;
            return;
        }
        if (var4 == 49) {
            class19.field459++;
            class132.method1046(var3, var5, (byte) 18, var2);
            class66.field1472.method781(47, (byte) -52);
            class66.field1472.method68(class107.field2466 + var3, (byte) 31);
            class66.field1472.method111(class23.field562 + var2, -27867);
            class66.field1472.method113(var5 >> 14 & 0x7FFF, 111);
        }
        if (var4 == 15) {
            boolean var6 = true;
            class119 var7 = class119.method964(65535, var3);
            if (var7.field2847 > 0) {
                var6 = class16.method174(var7, 1);
            }
            if (var6) {
                class66.field1472.method781(36, (byte) -35);
                class107.field2457++;
                class66.field1472.method100(var3, false);
            }
        }
        if (var4 == 10) {
            class118.field2753++;
            class66.field1472.method781(20, (byte) -57);
            class66.field1472.method76(-105, var5);
            class66.field1472.method110(var3, 255);
            class66.field1472.method111(var2, -27867);
            class117.field2735 = 2;
            class61.field1346 = var2;
            class113.field2651 = var3;
            class66.field1475 = 0;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 17) {
            class105 var8 = class95.field2197[arg1];
            int var9 = var8.method834((byte) 127, class90.field2060);
            if (var9 != -1) {
                if (class18.field418 == -1) {
                    class16.method172(arg0 + 90);
                    if (class29.field657 != -1) {
                        class43.field1008 = var8.method862(var9 + 5, (byte) 56).method843(32);
                        class109.field2519 = false;
                        class39.field897 = class18.field418 = class29.field657;
                    }
                } else {
                    client.method207(class43.field992, -6, 0, class92.field2151);
                }
            }
        }
        if (var4 == 38) {
            class115 var10 = class19.field466[var5];
            if (var10 != null) {
                class126.field3064++;
                class93.method773((byte) 80, var10.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var10.field1281[0]);
                class16.field334 = class86.field1937;
                class24.field583 = 2;
                class133.field3228 = 0;
                class81.field1835 = class30.field683;
                class66.field1472.method781(154, (byte) -54);
                class66.field1472.method113(var5, 120);
            }
        }
        if (var4 == 47) {
            boolean var11 = class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 0, 2, class119.field2842.field1261[0], 0, var2);
            class55.field1089++;
            if (!var11) {
                class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var2);
            }
            class16.field334 = class86.field1937;
            class133.field3228 = 0;
            class24.field583 = 2;
            class81.field1835 = class30.field683;
            class66.field1472.method781(249, (byte) -123);
            class66.field1472.method76(-105, var5);
            class66.field1472.method76(-105, class23.field562 + var2);
            class66.field1472.method68(var3 + class107.field2466, (byte) 31);
        }
        if (var4 == 12) {
            class105 var13 = class95.field2197[arg1];
            int var14 = var13.method834((byte) 125, class90.field2060);
            if (var14 != -1) {
                long var15 = var13.method862(var14 + 5, (byte) 66).method843(32).method828(455);
                int var17 = -1;
                for (int var18 = 0; var18 < class81.field1817; var18++) {
                    if (class12.field238[var18] == var15) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 != -1 && class122.field2994[var17] > 0) {
                    class90.field2064 = true;
                    class98.field2257 = 0;
                    class43.field1004 = class43.field992;
                    class118.field2750 = 3;
                    class85.field1901 = true;
                    class93.field2170 = class12.field238[var17];
                    class43.field999 = class108.method878(new class105[] { class26.field608, class86.field1938[var17] }, 2867);
                }
            }
        }
        if (var4 == 40) {
            boolean var19 = class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 0, 2, class119.field2842.field1261[0], 0, var2);
            class58.field1231++;
            if (!var19) {
                class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var2);
            }
            class24.field583 = 2;
            class81.field1835 = class30.field683;
            class133.field3228 = 0;
            class16.field334 = class86.field1937;
            class66.field1472.method781(228, (byte) -108);
            class66.field1472.method111(class107.field2466 + var3, -27867);
            class66.field1472.method113(class23.field562 + var2, 75);
            class66.field1472.method68(var5, (byte) 31);
        }
        if (var4 == 1) {
            class115 var21 = class19.field466[var5];
            if (var21 != null) {
                class93.method773((byte) 80, var21.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var21.field1281[0]);
                class16.field334 = class86.field1937;
                class81.field1835 = class30.field683;
                class24.field583 = 2;
                class133.field3228 = 0;
                class102.field2312++;
                class66.field1472.method781(98, (byte) -59);
                class66.field1472.method76(arg0 ^ 0x32, var5);
            }
        }
        if (var4 == 24) {
            class117.field2727++;
            class66.field1472.method781(149, (byte) -66);
            class66.field1472.method81(1872517936, var3);
            class66.field1472.method111(var5, -27867);
            class66.field1472.method113(var2, 82);
            class61.field1346 = var2;
            class113.field2651 = var3;
            class66.field1475 = 0;
            class117.field2735 = 2;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 13) {
            class106.field2433++;
            class66.field1472.method781(76, (byte) -104);
            class66.field1472.method110(var3, 255);
            class66.field1472.method76(arg0 ^ 0x32, var2);
            class66.field1472.method113(var5, 124);
            class66.field1475 = 0;
            class61.field1346 = var2;
            class117.field2735 = 2;
            class113.field2651 = var3;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 46) {
            class110.method895(var3, var2, false, var5);
        }
        if (var4 == 16) {
            class66.field1472.method781(36, (byte) -114);
            class107.field2457++;
            class66.field1472.method100(var3, false);
            class119 var22 = class119.method964(65535, var3);
            if (var22.field2777 != null && var22.field2777[0][0] == 5) {
                int var23 = var22.field2777[0][1];
                class16.field337[var23] = 1 - class16.field337[var23];
                class61.method490(var23, 26);
                class80.field1805 = true;
            }
        }
        if (var4 == 56) {
            class3.field39++;
            class66.field1472.method781(136, (byte) -46);
            class66.field1472.method113(var2, arg0 ^ 0xFFFFFFF5);
            class66.field1472.method111(var5, -27867);
            class66.field1472.method74((byte) -118, var3);
            class117.field2735 = 2;
            class61.field1346 = var2;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            class66.field1475 = 0;
            class113.field2651 = var3;
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 7) {
            class83.field1858++;
            class132.method1046(var3, var5, (byte) 18, var2);
            class66.field1472.method781(104, (byte) -50);
            class66.field1472.method113(class107.field2466 + var3, 117);
            class66.field1472.method111(var5 >> 14 & 0x7FFF, -27867);
            class66.field1472.method111(class23.field562 + var2, arg0 ^ 0x6C80);
        }
        if (var4 == 1002) {
            class133.field3228 = 0;
            class16.field334 = class86.field1937;
            class81.field1835 = class30.field683;
            class12.field244++;
            class24.field583 = 2;
            class66.field1472.method781(40, (byte) -97);
            class66.field1472.method68(var5 >> 14 & 0x7FFF, (byte) 31);
        }
        if (var4 == 22) {
            class115 var24 = class19.field466[var5];
            if (var24 != null) {
                class93.method773((byte) 80, var24.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var24.field1281[0]);
                class16.field334 = class86.field1937;
                class133.field3228 = 0;
                class81.field1835 = class30.field683;
                class24.field583 = 2;
                class66.field1472.method781(113, (byte) -53);
                class66.field1472.method113(var5, 89);
                class51.field1079++;
            }
        }
        if (var4 == 50 || var4 == 41 || var4 == 27 || var4 == 57) {
            class105 var25 = class95.field2197[arg1];
            int var26 = var25.method834((byte) 125, class90.field2060);
            if (var26 != -1) {
                long var27 = var25.method862(var26 + 5, (byte) 119).method843(32).method828(arg0 ^ 0xFFFFFE62);
                if (var4 == 50) {
                    class126.method1016(var27, -21650);
                }
                if (var4 == 41) {
                    class58.method464(var27, arg0 ^ 0x1357);
                }
                if (var4 == 27) {
                    class76.method647(var27, -116);
                }
                if (var4 == 57) {
                    class126.method1015(var27, 111);
                }
            }
        }
        if (var4 == 19) {
            class132.method1046(var3, var5, (byte) 18, var2);
            class109.field2512++;
            class66.field1472.method781(114, (byte) -14);
            class66.field1472.method111(var2 + class23.field562, arg0 + -27776);
            class66.field1472.method68(class107.field2466 + var3, (byte) 31);
            class66.field1472.method68(var5 >> 14 & 0x7FFF, (byte) 31);
        }
        if (var4 == 8) {
            boolean var29 = class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 0, 2, class119.field2842.field1261[0], 0, var2);
            class17.field356++;
            if (!var29) {
                class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var2);
            }
            class81.field1835 = class30.field683;
            class24.field583 = 2;
            class133.field3228 = 0;
            class16.field334 = class86.field1937;
            class66.field1472.method781(251, (byte) -25);
            class66.field1472.method68(class107.field2466 + var3, (byte) 31);
            class66.field1472.method76(-105, var5);
            class66.field1472.method111(var2 + class23.field562, arg0 ^ 0x6C80);
        }
        if (var4 == 51) {
            class29.field655++;
            boolean var31 = class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 0, 2, class119.field2842.field1261[0], 0, var2);
            if (!var31) {
                class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var2);
            }
            class16.field334 = class86.field1937;
            class133.field3228 = 0;
            class81.field1835 = class30.field683;
            class24.field583 = 2;
            class66.field1472.method781(94, (byte) -47);
            class66.field1472.method76(-105, var2 + class23.field562);
            class66.field1472.method68(class107.field2466 + var3, (byte) 31);
            class66.field1472.method111(var5, -27867);
        }
        if (var4 == 2) {
            class65.field1453++;
            class66.field1472.method781(191, (byte) -117);
            class66.field1472.method74((byte) -118, var3);
            class66.field1472.method111(var5, -27867);
            class66.field1472.method76(-105, var2);
            class117.field2735 = 2;
            class61.field1346 = var2;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
            class66.field1475 = 0;
            class113.field2651 = var3;
        }
        if (var4 == 9) {
            class115 var33 = class19.field466[var5];
            if (var33 != null) {
                class93.method773((byte) 80, var33.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var33.field1281[0]);
                class30.field675++;
                class133.field3228 = 0;
                class16.field334 = class86.field1937;
                class81.field1835 = class30.field683;
                class24.field583 = 2;
                class66.field1472.method781(174, (byte) -59);
                class66.field1472.method110(class39.field914, 255);
                class66.field1472.method68(class43.field995, (byte) 31);
                class66.field1472.method113(class112.field2639, 80);
                class66.field1472.method111(var5, -27867);
            }
        }
        if (var4 == 1003) {
            class119 var34 = class119.method964(65535, var3);
            if (var34 == null || var34.field2804[var2] < 100000) {
                class102.field2327++;
                class66.field1472.method781(29, (byte) -28);
                class66.field1472.method76(arg0 ^ 0x32, var5);
            } else {
                client.method207(class43.field992, -102, 0, class108.method878(new class105[] { class75.method637(var34.field2804[var2], arg0 + 8332), class41.field923, class75.method636(var5, 0).field706 }, 2867));
            }
            class117.field2735 = 2;
            class113.field2651 = var3;
            class61.field1346 = var2;
            class66.field1475 = 0;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 54) {
            boolean var35 = class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 0, 2, class119.field2842.field1261[0], 0, var2);
            class28.field616++;
            if (!var35) {
                class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var2);
            }
            class81.field1835 = class30.field683;
            class24.field583 = 2;
            class16.field334 = class86.field1937;
            class133.field3228 = 0;
            class66.field1472.method781(223, (byte) -93);
            class66.field1472.method111(var5, -27867);
            class66.field1472.method113(var2 + class23.field562, arg0 + 209);
            class66.field1472.method113(class107.field2466 + var3, 95);
            class66.field1472.method74((byte) -118, class104.field2372);
        }
        if (var4 == 53) {
            class115 var37 = class19.field466[var5];
            if (var37 != null) {
                class81.field1842++;
                class93.method773((byte) 80, var37.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var37.field1281[0]);
                class133.field3228 = 0;
                class81.field1835 = class30.field683;
                class16.field334 = class86.field1937;
                class24.field583 = 2;
                class66.field1472.method781(182, (byte) -116);
                class66.field1472.method111(var5, arg0 - 27776);
            }
        }
        if (var4 == 18 && class132.method1046(var3, var5, (byte) 18, var2)) {
            class132.field3175++;
            class66.field1472.method781(177, (byte) -101);
            class66.field1472.method100(class39.field914, false);
            class66.field1472.method113(class23.field562 + var2, arg0 ^ 0xFFFFFFFE);
            class66.field1472.method76(-105, class112.field2639);
            class66.field1472.method111(var5 >> 14 & 0x7FFF, -27867);
            class66.field1472.method68(class43.field995, (byte) 31);
            class66.field1472.method68(class107.field2466 + var3, (byte) 31);
        }
        if (var4 == 37) {
            boolean var38 = class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 0, 2, class119.field2842.field1261[0], 0, var2);
            if (!var38) {
                class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var2);
            }
            class81.field1820++;
            class16.field334 = class86.field1937;
            class24.field583 = 2;
            class81.field1835 = class30.field683;
            class133.field3228 = 0;
            class66.field1472.method781(7, (byte) -45);
            class66.field1472.method111(class43.field995, -27867);
            class66.field1472.method113(class107.field2466 + var3, 112);
            class66.field1472.method100(class39.field914, false);
            class66.field1472.method68(class23.field562 + var2, (byte) 31);
            class66.field1472.method111(var5, -27867);
            class66.field1472.method68(class112.field2639, (byte) 31);
        }
        if (var4 == 34) {
            class115 var40 = class19.field466[var5];
            if (var40 != null) {
                class93.method773((byte) 80, var40.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var40.field1281[0]);
                class16.field334 = class86.field1937;
                class42.field958++;
                class133.field3228 = 0;
                class24.field583 = 2;
                class81.field1835 = class30.field683;
                class66.field1472.method781(12, (byte) -23);
                class66.field1472.method81(1872517936, class104.field2372);
                class66.field1472.method113(var5, 102);
            }
        }
        if (var4 == 1007) {
            class119 var41 = class119.method964(65535, var3);
            if (var41 != null && var41.field2831 != null && var2 != -1) {
                var41 = var41.field2831[var2];
            }
            if (var41 == null || var41.field2882 < 100000) {
                class102.field2327++;
                class66.field1472.method781(29, (byte) -118);
                class66.field1472.method76(-105, var5);
            } else {
                client.method207(class43.field992, -3, 0, class108.method878(new class105[] { class75.method637(var41.field2882, 8241), class41.field923, class75.method636(var5, 0).field706 }, 2867));
            }
        }
        if (var4 == 25) {
            class17.field364++;
            class66.field1472.method781(152, (byte) -14);
            class66.field1472.method76(-105, var2);
            class66.field1472.method68(var5, (byte) 31);
            class66.field1472.method100(var3, false);
            class61.field1346 = var2;
            class113.field2651 = var3;
            class66.field1475 = 0;
            class117.field2735 = 2;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 1004) {
            class132.method1046(var3, var5, (byte) 18, var2);
            class127.field3068++;
            class66.field1472.method781(164, (byte) -44);
            class66.field1472.method68(var5 >> 14 & 0x7FFF, (byte) 31);
            class66.field1472.method68(var2 + class23.field562, (byte) 31);
            class66.field1472.method68(class107.field2466 + var3, (byte) 31);
        }
        if (var4 == 55) {
            class66.field1472.method781(238, (byte) -107);
            class66.field1472.method76(-105, var2);
            class78.field1751++;
            class66.field1472.method113(var5, 81);
            class66.field1472.method81(1872517936, class104.field2372);
            class66.field1472.method81(1872517936, var3);
            class113.field2651 = var3;
            class66.field1475 = 0;
            class117.field2735 = 2;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
            class61.field1346 = var2;
        }
        if (var4 == 48) {
            class66.field1472.method781(243, (byte) -92);
            class118.field2756++;
            class66.field1472.method113(class43.field995, arg0 + 212);
            class66.field1472.method68(var2, (byte) 31);
            class66.field1472.method68(class112.field2639, (byte) 31);
            class66.field1472.method68(var5, (byte) 31);
            class66.field1472.method110(class39.field914, 255);
            class66.field1472.method81(arg0 ^ 0x9063A495, var3);
            class66.field1475 = 0;
            class61.field1346 = var2;
            class117.field2735 = 2;
            class113.field2651 = var3;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 14) {
            class119 var42 = class119.method964(65535, var3);
            class84.field1884 = var42.field2854;
            class104.field2372 = var3;
            class122.field3003 = 1;
            class80.field1805 = true;
            class57.field1199 = 0;
            class84.field1886 = var42.field2833;
            class105.field2386 = class108.method878(new class105[] { class58.field1243, var42.field2879, class90.field2060 }, 2867);
            if (class84.field1886 == 16) {
                class80.field1805 = true;
                class134.field3265 = 3;
                class98.field2263 = true;
            }
            return;
        }
        if (var4 == 39) {
            class15 var43 = class58.field1303[var5];
            if (var43 != null) {
                class93.method773((byte) 80, var43.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var43.field1281[0]);
                class81.field1835 = class30.field683;
                class133.field3228 = 0;
                class16.field334 = class86.field1937;
                class26.field592++;
                class24.field583 = 2;
                class66.field1472.method781(252, (byte) -30);
                class66.field1472.method111(var5, -27867);
                class66.field1472.method74((byte) -118, class104.field2372);
            }
        }
        if (var4 == 1001) {
            class81.field1835 = class30.field683;
            class24.field583 = 2;
            class133.field3228 = 0;
            class16.field334 = class86.field1937;
            class115 var44 = class19.field466[var5];
            if (var44 != null) {
                class19 var45 = var44.field2681;
                if (var45.field462 != null) {
                    var45 = var45.method223(true);
                }
                if (var45 != null) {
                    class122.field2985++;
                    class66.field1472.method781(81, (byte) -47);
                    class66.field1472.method113(var45.field463, 95);
                }
            }
        }
        if (var4 == 26) {
            class59.field1322++;
            boolean var46 = class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 0, 2, class119.field2842.field1261[0], 0, var2);
            if (!var46) {
                class93.method773((byte) 80, var3, 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var2);
            }
            class24.field583 = 2;
            class133.field3228 = 0;
            class81.field1835 = class30.field683;
            class16.field334 = class86.field1937;
            class66.field1472.method781(148, (byte) -11);
            class66.field1472.method113(var5, arg0 ^ 0xFFFFFFC4);
            class66.field1472.method113(class107.field2466 + var3, 110);
            class66.field1472.method76(-105, class23.field562 + var2);
        }
        if (var4 == 3) {
            class115 var48 = class19.field466[var5];
            if (var48 != null) {
                class109.field2503++;
                class93.method773((byte) 80, var48.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var48.field1281[0]);
                class24.field583 = 2;
                class133.field3228 = 0;
                class16.field334 = class86.field1937;
                class81.field1835 = class30.field683;
                class66.field1472.method781(161, (byte) -112);
                class66.field1472.method113(var5, arg0 + 208);
            }
        }
        if (var4 == 4) {
            if (class130.field3165) {
                class130.field3161.method492(var2 - 4, var3 + -4);
            } else {
                class130.field3161.method492(class86.field1937 - 4, class30.field683 - 4);
            }
        }
        if (var4 == 44 && class85.field1909 == -1) {
            class22.method234((byte) -65, 0, var3);
            class85.field1909 = var3;
        }
        if (var4 == 42 || var4 == 11) {
            class105 var49 = class95.field2197[arg1];
            int var50 = var49.method834((byte) 126, class90.field2060);
            if (var50 != -1) {
                boolean var51 = false;
                class105 var52 = var49.method862(var50 + 5, (byte) -67).method843(32);
                class105 var53 = var52.method826(false).method844(arg0 ^ 0xFFFFAA72);
                for (int var54 = 0; var54 < class97.field2250; var54++) {
                    class15 var55 = class58.field1303[class121.field2956[var54]];
                    if (var55 != null && var55.field300 != null && var55.field300.method831(var53, -21607)) {
                        var51 = true;
                        class93.method773((byte) 80, var55.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var55.field1281[0]);
                        if (var4 == 42) {
                            class120.field2892++;
                            class66.field1472.method781(85, (byte) -114);
                            class66.field1472.method113(class121.field2956[var54], 125);
                        }
                        if (var4 == 11) {
                            class90.field2058++;
                            class66.field1472.method781(23, (byte) -32);
                            class66.field1472.method68(class121.field2956[var54], (byte) 31);
                        }
                        break;
                    }
                }
                if (!var51) {
                    client.method207(class43.field992, -64, 0, class108.method878(new class105[] { class39.field907, var53 }, arg0 + 2958));
                }
            }
        }
        if (var4 == 28) {
            class66.field1472.method781(117, (byte) -26);
            class73.field1608++;
            class66.field1472.method68(var5, (byte) 31);
            class66.field1472.method68(var2, (byte) 31);
            class66.field1472.method110(var3, 255);
            class113.field2651 = var3;
            class66.field1475 = 0;
            class117.field2735 = 2;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
            class61.field1346 = var2;
        }
        if (arg0 != -91) {
            method627(null, 97);
        }
        if (var4 == 6) {
            class15 var56 = class58.field1303[var5];
            if (var56 != null) {
                class98.field2261++;
                class93.method773((byte) 80, var56.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var56.field1281[0]);
                class81.field1835 = class30.field683;
                class133.field3228 = 0;
                class24.field583 = 2;
                class16.field334 = class86.field1937;
                class66.field1472.method781(101, (byte) -107);
                class66.field1472.method76(arg0 ^ 0x32, var5);
            }
        }
        if (var4 == 30) {
            class118.method955(class51.field1069, arg0 + 3910);
            class51.field1069 = -1;
            class90.field2064 = true;
        }
        if (var4 == 5) {
            class60.field1334++;
            class66.field1472.method781(189, (byte) -80);
            class66.field1472.method111(var5, -27867);
            class66.field1472.method68(var2, (byte) 31);
            class66.field1472.method81(arg0 + 1872518027, var3);
            class61.field1346 = var2;
            class113.field2651 = var3;
            class66.field1475 = 0;
            class117.field2735 = 2;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 20) {
            class15 var57 = class58.field1303[var5];
            if (var57 != null) {
                class93.method773((byte) 80, var57.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var57.field1281[0]);
                class16.field334 = class86.field1937;
                class133.field3228 = 0;
                class90.field2058++;
                class24.field583 = 2;
                class81.field1835 = class30.field683;
                class66.field1472.method781(23, (byte) -110);
                class66.field1472.method68(var5, (byte) 31);
            }
        }
        if (var4 == 31) {
            class15 var58 = class58.field1303[var5];
            if (var58 != null) {
                class93.method773((byte) 80, var58.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var58.field1281[0]);
                class81.field1835 = class30.field683;
                class65.field1451++;
                class133.field3228 = 0;
                class24.field583 = 2;
                class16.field334 = class86.field1937;
                class66.field1472.method781(121, (byte) -9);
                class66.field1472.method111(var5, -27867);
            }
        }
        if (var4 == 52) {
            class19.field480++;
            class132.method1046(var3, var5, (byte) 18, var2);
            class66.field1472.method781(44, (byte) -103);
            class66.field1472.method76(-105, var5 >> 14 & 0x7FFF);
            class66.field1472.method111(var2 + class23.field562, -27867);
            class66.field1472.method76(-105, var3 + class107.field2466);
        }
        if (var4 == 29) {
            class116.field2707++;
            class66.field1472.method781(150, (byte) -20);
            class66.field1472.method74((byte) -118, var3);
            class66.field1472.method113(var2, arg0 + 201);
            class66.field1472.method68(var5, (byte) 31);
            class117.field2735 = 2;
            class66.field1475 = 0;
            class113.field2651 = var3;
            class61.field1346 = var2;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 35) {
            class66.field1472.method781(36, (byte) -87);
            class107.field2457++;
            class66.field1472.method100(var3, false);
            class119 var59 = class119.method964(65535, var3);
            if (var59.field2777 != null && var59.field2777[0][0] == 5) {
                int var60 = var59.field2777[0][1];
                if (class16.field337[var60] != var59.field2813[0]) {
                    class16.field337[var60] = var59.field2813[0];
                    class61.method490(var60, 26);
                    class80.field1805 = true;
                }
            }
        }
        if (var4 == 36) {
            class16.method172(arg0 + 90);
        }
        if (var4 == 43) {
            class15 var61 = class58.field1303[var5];
            if (var61 != null) {
                class45.field1026++;
                class93.method773((byte) 80, var61.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var61.field1281[0]);
                class81.field1835 = class30.field683;
                class16.field334 = class86.field1937;
                class133.field3228 = 0;
                class24.field583 = 2;
                class66.field1472.method781(45, (byte) -103);
                class66.field1472.method76(arg0 - 14, class112.field2639);
                class66.field1472.method113(var5, 88);
                class66.field1472.method100(class39.field914, false);
                class66.field1472.method113(class43.field995, 122);
            }
        }
        if (var4 == 21) {
            class15 var62 = class58.field1303[var5];
            if (var62 != null) {
                class93.method773((byte) 80, var62.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var62.field1281[0]);
                class133.field3228 = 0;
                class97.field2236++;
                class24.field583 = 2;
                class81.field1835 = class30.field683;
                class16.field334 = class86.field1937;
                class66.field1472.method781(118, (byte) -67);
                class66.field1472.method113(var5, 112);
            }
        }
        if (var4 == 32) {
            class122.field2997++;
            class66.field1472.method781(142, (byte) -44);
            class66.field1472.method76(-105, var5);
            class66.field1472.method110(var3, arg0 ^ 0xFFFFFF5A);
            class66.field1472.method111(var2, -27867);
            class61.field1346 = var2;
            class117.field2735 = 2;
            class113.field2651 = var3;
            class66.field1475 = 0;
            if (var3 >> 16 == class18.field418) {
                class117.field2735 = 1;
            }
            if (var3 >> 16 == class1.field4) {
                class117.field2735 = 3;
            }
        }
        if (var4 == 1006) {
            class102.field2327++;
            class133.field3228 = 0;
            class24.field583 = 2;
            class81.field1835 = class30.field683;
            class16.field334 = class86.field1937;
            class66.field1472.method781(29, (byte) -60);
            class66.field1472.method76(-105, var5);
        }
        if (var4 == 33) {
            class15 var63 = class58.field1303[var5];
            if (var63 != null) {
                class93.method773((byte) 80, var63.field1261[0], 0, class119.field2842.field1281[0], false, 0, 0, 1, 2, class119.field2842.field1261[0], 1, var63.field1281[0]);
                class81.field1835 = class30.field683;
                class120.field2892++;
                class16.field334 = class86.field1937;
                class24.field583 = 2;
                class133.field3228 = 0;
                class66.field1472.method781(85, (byte) -113);
                class66.field1472.method113(var5, arg0 ^ 0xFFFFFFCA);
            }
        }
        if (var4 == 45 && class132.method1046(var3, var5, (byte) 18, var2)) {
            class66.field1472.method781(102, (byte) -29);
            class66.field1472.method76(-105, var2 + class23.field562);
            class66.field1472.method81(arg0 ^ 0x9063A495, class104.field2372);
            class66.field1472.method76(-105, var5 >> 14 & 0x7FFF);
            class66.field1472.method111(var3 + class107.field2466, -27867);
            class123.field3025++;
        }
        if (class57.field1199 != 0) {
            class57.field1199 = 0;
            class80.field1805 = true;
        }
        if (class122.field3003 != 0) {
            class80.field1805 = true;
            class122.field3003 = 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lrc;I)Z", line = 1480)
    public static final boolean method627(class105 arg0, int arg1) {
        field1639++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -91 / ((arg1 + 75) / 40);
        for (int var3 = 0; var3 < class81.field1817; var3++) {
            if (arg0.method831(class86.field1938[var3], -21607)) {
                return true;
            }
        }
        return arg0.method831(class119.field2842.field300, -21607);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V", line = 1525)
    public class74(int arg0) {
        this.field1632 = arg0;
        this.field1636 = new class65[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class65 var3 = this.field1636[var2] = new class65();
            var3.field1449 = var3;
            var3.field1467 = var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V", line = 1547)
    public static void method628(byte arg0) {
        if (arg0 != -34) {
            return;
        }
        field1634 = null;
        field1647 = null;
        field1655 = null;
        field1644 = null;
        field1635 = null;
        field1624 = null;
        field1630 = null;
        field1641 = null;
        field1643 = null;
        field1652 = null;
        field1637 = null;
        field1653 = null;
        field1651 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V", line = 1572)
    public static final void method629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1633++;
        int var5 = 55 / ((53 - arg3) / 43);
        for (int var6 = arg2; var6 <= arg2 + arg1; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class127.field3100[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        class9.field151[0][var7][var6] = class9.field151[0][var7 - 1][var6];
                    }
                    if (arg0 + arg4 == var7 && var7 < 103) {
                        class9.field151[0][var7][var6] = class9.field151[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        class9.field151[0][var7][var6] = class9.field151[0][var7][var6 - 1];
                    }
                    if (arg1 + arg2 == var6 && var6 < 103) {
                        class9.field151[0][var7][var6] = class9.field151[0][var7][var6 + 1];
                    }
                }
            }
        }
    }
}
