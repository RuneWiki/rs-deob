import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class109 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lhg;")
    public static class176 field2689 = new class176();

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lp;")
    public static class280 field2696 = class18.method140((byte) -121, ")3");

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lp;")
    private static class280 field2697 = class18.method140((byte) -123, "Connecting to update server");

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lp;")
    public static class280 field2698 = field2697;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ltg;")
    public static class180 field2700;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
    public static boolean field2701;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lua;)Lua;")
    public static final class113 method1095(class113 arg0) {
        int var1 = class221.method1488(true, method1099(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class233.method1569(65535, arg0.field1998);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2686++;
        if (!this.method770(-68)) {
            return;
        }
        class45.field749 = Integer.parseInt(this.getParameter("worldid"));
        class128.field2232 = Integer.parseInt(this.getParameter("modewhere"));
        if (class128.field2232 < 0 || class128.field2232 > 1) {
            class128.field2232 = 0;
        }
        class189.field3314 = Integer.parseInt(this.getParameter("modewhat"));
        if (class189.field3314 < 0 || class189.field3314 > 2) {
            class189.field3314 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class16.field295 = true;
        } else {
            class16.field295 = false;
        }
        try {
            class269.field4725 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class269.field4725 = 0;
        }
        class34.method285(1559051078, class269.field4725);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class105.field1739 = true;
        } else {
            class105.field1739 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class255.field4481 = true;
        } else {
            class255.field4481 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class283.field4992 = 1;
        } else {
            class283.field4992 = 0;
        }
        try {
            class108.field1778 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class108.field1778 = 0;
        }
        class188.field3309 = class271.field4736.method1879(this, 84);
        if (class188.field3309 == null) {
            class188.field3309 = class229.field3959;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class201.field3514 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class201.field3514 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class47.field783 = true;
        } else {
            class47.field783 = false;
        }
        class194.field3418 = this;
        this.method765(class189.field3314 + 32, true, 765, 528, 503);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1096(int arg0) {
        field2692++;
        if (!class242.field4247) {
            label233: while (true) {
                do {
                    if (!class249.method1683(arg0 ^ 0xFFFFE066)) {
                        break label233;
                    }
                } while (class244.field4295 != 115 && class244.field4295 != 83);
                class242.field4247 = true;
            }
        }
        if (arg0 != -8159) {
            return;
        }
        if (class25.field471 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class77.method569((byte) -115);
            if (class74.field1212 == 0L) {
                class74.field1212 = var4;
            }
            if (var3 > 16384 && var4 - class74.field1212 < 5000L) {
                if ((var4 - class56.field911) > 1000L) {
                    System.gc();
                    class56.field911 = var4;
                }
                class209.field3602 = class28.field531;
                class50.field830 = 5;
            } else {
                class25.field471 = 10;
                class209.field3602 = class278.field4878;
                class50.field830 = 5;
            }
        } else if (class25.field471 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class183.field3211[var6] = new class99(104, 104);
            }
            class50.field830 = 10;
            class209.field3602 = class203.field3527;
            class25.field471 = 30;
        } else if (class25.field471 == 30) {
            if (class228.field3950 == null) {
                class228.field3950 = new class86(class168.field2941, class176.field3065);
            }
            if (class228.field3950.method614(5)) {
                class190.field3333 = class193.method1333(11806, false, true, true, 0);
                class23.field407 = class193.method1333(arg0 ^ 0xFFFFCE3F, false, true, true, 1);
                class199.field3485 = class193.method1333(11806, true, false, true, 2);
                class132.field2342 = class193.method1333(11806, false, true, true, 3);
                class52.field862 = class193.method1333(11806, false, true, true, 4);
                class148.field2569 = class193.method1333(11806, true, true, true, 5);
                class184.field3246 = class193.method1333(11806, true, true, false, 6);
                class57.field925 = class193.method1333(11806, false, true, true, 7);
                class220.field3778 = class193.method1333(11806, false, true, true, 8);
                class123.field2159 = class193.method1333(arg0 ^ 0xFFFFCE3F, false, true, true, 9);
                class199.field3492 = class193.method1333(11806, false, true, true, 10);
                class107.field1769 = class193.method1333(11806, false, true, true, 11);
                class101.field1641 = class193.method1333(11806, false, true, true, 12);
                class204.field3550 = class193.method1333(11806, false, true, true, 13);
                class98.field1568 = class193.method1333(11806, false, true, false, 14);
                class59.field955 = class193.method1333(11806, false, true, true, 15);
                class86.field1410 = class193.method1333(11806, false, true, true, 16);
                class16.field293 = class193.method1333(arg0 ^ 0xFFFFCE3F, false, true, true, 17);
                class99.field1606 = class193.method1333(11806, false, true, true, 18);
                class235.field4106 = class193.method1333(11806, false, true, true, 19);
                class113.field1929 = class193.method1333(11806, false, true, true, 20);
                class283.field4991 = class193.method1333(arg0 + 19965, false, true, true, 21);
                class275.field4763 = class193.method1333(11806, false, true, true, 22);
                class267.field4691 = class193.method1333(11806, true, true, true, 23);
                class7.field136 = class193.method1333(11806, false, true, true, 24);
                class90.field1468 = class193.method1333(11806, false, true, true, 25);
                class8.field166 = class193.method1333(11806, true, true, true, 26);
                field2700 = class193.method1333(arg0 + 19965, false, true, true, 27);
                class25.field471 = 40;
                class50.field830 = 15;
                class209.field3602 = class211.field3619;
            } else {
                class209.field3602 = field2698;
                class50.field830 = 12;
            }
        } else if (class25.field471 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class267.field4696[var8].method1546(106) * class97.field1561[var8] / 100;
            }
            if (var7 == 100) {
                class50.field830 = 20;
                class209.field3602 = class267.field4692;
                class15.method119(class220.field3778, -112);
                class60.method425(true, class220.field3778);
                class176.method1206(class220.field3778, false);
                class25.field471 = 45;
            } else {
                if (var7 != 0) {
                    class209.field3602 = class30.method266(new class280[] { class50.field828, class249.method1685((byte) 121, var7), class47.field781 }, (byte) -87);
                }
                class50.field830 = 20;
            }
        } else if (class25.field471 == 45) {
            class100.method712(2, class157.field2752, 22050, arg0 ^ 0x1F8A);
            class255.field4502 = new class1();
            class255.field4502.method35(128, 2, 9);
            class4.field118 = class21.method163(0, 22050, -25872, class118.field2117, class41.field707);
            class4.field118.method87(class255.field4502, 28667);
            class106.method744(class98.field1568, class255.field4502, class59.field955, (byte) 105, class52.field862);
            class250.field4391 = class21.method163(1, 2048, -25872, class118.field2117, class41.field707);
            class234.field4082 = new class274();
            class250.field4391.method87(class234.field4082, 28667);
            class140.field2433 = new class18(22050, class204.field3549);
            class116.field2098 = class184.field3246.method1234((byte) -88, class140.field2436);
            class50.field830 = 30;
            class209.field3602 = class181.field3171;
            class25.field471 = 50;
        } else if (class25.field471 == 50) {
            int var9 = class155.method1107(class220.field3778, class204.field3550, 3514);
            int var10 = class233.method1566(arg0 ^ 0xFFFFEFC0);
            if (var10 > var9) {
                class209.field3602 = class30.method266(new class280[] { class126.field2205, class249.method1685((byte) -105, var9 * 100 / var10), class47.field781 }, (byte) -87);
                class50.field830 = 35;
            } else {
                class209.field3602 = class64.field1084;
                class25.field471 = 60;
                class50.field830 = 35;
            }
        } else if (class25.field471 == 60) {
            int var11 = class267.method1795(class220.field3778, (byte) 49);
            int var12 = class173.method1194(86);
            if (var12 > var11) {
                class209.field3602 = class30.method266(new class280[] { class122.field2142, class249.method1685((byte) 115, var11 * 100 / var12), class47.field781 }, (byte) -87);
                class50.field830 = 40;
            } else {
                class50.field830 = 40;
                class25.field471 = 65;
                class209.field3602 = class205.field3560;
            }
        } else if (class25.field471 == 65) {
            class61.method436(arg0 ^ 0xFFFFE021, class204.field3550, class220.field3778);
            class50.field830 = 45;
            class209.field3602 = class193.field3396;
            class90.method641((byte) 66, 5);
            class25.field471 = 70;
        } else if (class25.field471 == 70) {
            class199.field3485.method1244(-27341);
            byte var13 = 0;
            int var14 = var13 + class199.field3485.method1256(arg0 - 5655);
            class86.field1410.method1244(-27341);
            int var15 = var14 + class86.field1410.method1256(-13814);
            class16.field293.method1244(arg0 - 19182);
            int var16 = var15 + class16.field293.method1256(-13814);
            class99.field1606.method1244(-27341);
            int var17 = var16 + class99.field1606.method1256(arg0 - 5655);
            class235.field4106.method1244(-27341);
            int var18 = var17 + class235.field4106.method1256(-13814);
            class113.field1929.method1244(-27341);
            int var19 = var18 + class113.field1929.method1256(-13814);
            class283.field4991.method1244(-27341);
            int var20 = var19 + class283.field4991.method1256(-13814);
            class275.field4763.method1244(arg0 ^ 0x7512);
            int var21 = var20 + class275.field4763.method1256(-13814);
            class7.field136.method1244(-27341);
            int var22 = var21 + class7.field136.method1256(arg0 ^ 0x2A2B);
            class90.field1468.method1244(-27341);
            int var23 = var22 + class90.field1468.method1256(-13814);
            field2700.method1244(-27341);
            int var24 = var23 + field2700.method1256(-13814);
            if (var24 < 1100) {
                class209.field3602 = class30.method266(new class280[] { class158.field2758, class249.method1685((byte) -87, var24 / 11), class47.field781 }, (byte) -87);
                class50.field830 = 50;
            } else {
                class160.method1139(class199.field3485, 4);
                class49.method364((byte) 42, class199.field3485);
                class252.method1694(class199.field3485, -112);
                class260.method1761(class199.field3485, true, class57.field925);
                class164.method1159(true, 125, class86.field1410, class57.field925);
                class176.method1209(class57.field925, true, class99.field1606);
                class282.method1910(-1887, class235.field4106, true, class264.field4665, class57.field925);
                class144.method996(0, class199.field3485);
                class147.method1024(arg0 + 8168, class113.field1929, class23.field407, class190.field3333);
                class255.method1716(class57.field925, (byte) 126, class283.field4991);
                class61.method435(arg0 ^ 0xFFFFE021, class275.field4763);
                class112.method778((byte) 89, class199.field3485);
                class242.method1643(class220.field3778, class132.field2342, 48, class57.field925, class204.field3550);
                class255.method1722(124, class199.field3485);
                class178.method1223(class16.field293, (byte) -106);
                class45.method343(class7.field136, new class89(), arg0 ^ 0xFFFFE020, class90.field1468);
                class228.method1535(class7.field136, class90.field1468, (byte) 89);
                class126.method869(class199.field3485, class220.field3778, false);
                class50.field830 = 50;
                class209.field3602 = class80.field1307;
                class153.method1086(arg0 + 8160);
                class25.field471 = 80;
            }
        } else if (class25.field471 == 80) {
            int var25 = class253.method1698(class220.field3778, (byte) 69);
            int var26 = class231.method1558((byte) -127);
            if (var26 > var25) {
                class209.field3602 = class30.method266(new class280[] { class83.field1382, class249.method1685((byte) -90, var25 * 100 / var26), class47.field781 }, (byte) -87);
                class50.field830 = 60;
            } else {
                class65.method448(false, class220.field3778);
                class50.field830 = 60;
                class209.field3602 = class120.field2138;
                class25.field471 = 90;
            }
        } else if (class25.field471 == 90) {
            if (class8.field166.method1244(-27341)) {
                class215 var27 = new class215(class123.field2159, class8.field166, class220.field3778, 20, !class83.field1376);
                class146.method1013(var27);
                if (class120.field2126 == 1) {
                    class146.method1019(0.9F);
                }
                if (class120.field2126 == 2) {
                    class146.method1019(0.8F);
                }
                if (class120.field2126 == 3) {
                    class146.method1019(0.7F);
                }
                if (class120.field2126 == 4) {
                    class146.method1019(0.6F);
                }
                class50.field830 = 70;
                class209.field3602 = class122.field2150;
                class25.field471 = 100;
            } else {
                class209.field3602 = class30.method266(new class280[] { class241.field4211, class249.method1685((byte) 74, class8.field166.method1256(-13814)), class47.field781 }, (byte) -87);
                class50.field830 = 70;
            }
        } else if (class25.field471 == 100) {
            if (class3.method53(class220.field3778, 0)) {
                class25.field471 = 110;
            }
        } else if (class25.field471 == 110) {
            class252.field4400 = new class122();
            class118.field2117.method1361(class252.field4400, 4, 10);
            class50.field830 = 75;
            class209.field3602 = class37.field668;
            class25.field471 = 120;
        } else if (class25.field471 == 120) {
            if (class199.field3492.method1261(class242.field4238, 0, class229.field3959)) {
                class153 var28 = new class153(class199.field3492.method1231(class242.field4238, class229.field3959, 96));
                class255.method1721(var28, arg0 ^ 0xFFFFE053);
                class50.field830 = 80;
                class25.field471 = 130;
                class209.field3602 = class228.field3940;
            } else {
                class209.field3602 = class30.method266(new class280[] { class182.field3209, class86.field1413 }, (byte) -87);
                class50.field830 = 80;
            }
        } else if (class25.field471 == 130) {
            if (!class132.field2342.method1244(-27341)) {
                class209.field3602 = class30.method266(new class280[] { class44.field736, class249.method1685((byte) -101, class132.field2342.method1256(arg0 - 5655) * 3 / 4), class47.field781 }, (byte) -87);
                class50.field830 = 85;
            } else if (!class101.field1641.method1244(-27341)) {
                class209.field3602 = class30.method266(new class280[] { class44.field736, class249.method1685((byte) -75, class101.field1641.method1256(-13814) / 10 + 75), class47.field781 }, (byte) -87);
                class50.field830 = 85;
            } else if (!class204.field3550.method1244(-27341)) {
                class209.field3602 = class30.method266(new class280[] { class44.field736, class249.method1685((byte) 80, class204.field3550.method1256(arg0 - 5655) / 20 + 85), class47.field781 }, (byte) -87);
                class50.field830 = 85;
            } else if (class267.field4691.method1257((byte) -90, class180.field3146)) {
                class47.method350(class191.field3346, class12.field245, class276.field4781, class199.field3487, true, class203.field3525, class267.field4691);
                class209.field3602 = class14.field277;
                class25.field471 = 135;
                class50.field830 = 95;
            } else {
                class209.field3602 = class30.method266(new class280[] { class44.field736, class249.method1685((byte) -126, class267.field4691.method1260(class180.field3146, 115) / 10 + 90), class47.field781 }, (byte) -87);
                class50.field830 = 85;
            }
        } else if (class25.field471 == 135) {
            int var29 = class263.method1781((byte) 127);
            if (var29 == -1) {
                class50.field830 = 95;
                class209.field3602 = class107.field1774;
            } else if (var29 == 7 || var29 == 9) {
                this.method767("worldlistfull", -7078);
                class90.method641((byte) 66, 1000);
            } else if (class36.field655) {
                class50.field830 = 96;
                class209.field3602 = class32.field595;
                class25.field471 = 140;
            } else {
                this.method767("worldlistio_" + var29, -7078);
                class90.method641((byte) 66, 1000);
            }
        } else if (class25.field471 == 140) {
            class19.field364 = class132.field2342.method1234((byte) -88, class118.field2121);
            class148.field2569.method1253((byte) -124, true, false);
            class184.field3246.method1253((byte) -103, true, true);
            class220.field3778.method1253((byte) -61, true, true);
            class204.field3550.method1253((byte) -107, true, true);
            class199.field3492.method1253((byte) -59, true, true);
            class132.field2342.method1253((byte) 72, true, true);
            class25.field471 = 150;
            class209.field3602 = class82.field1340;
            class50.field830 = 97;
            class54.field886 = true;
        } else if (class25.field471 == 150) {
            if (class242.field4247) {
                class128.field2234 = 0;
                class50.field817 = 0;
                class9.field190 = 0;
                class98.field1573 = 0;
            }
            class242.field4247 = true;
            class47.method351(class118.field2117, -583);
            class27.method245(-1, false, -1, false, class98.field1573);
            class50.field830 = 100;
            class25.field471 = 160;
            class209.field3602 = class230.field3972;
        } else if (class25.field471 == 160) {
            class43.method327(-40, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1097(int arg0, byte arg1) {
        class214.field3677 = null;
        class168.field2941.field4563 = arg0;
        field2685++;
        int var3 = -58 % ((49 - arg1) / 39);
        class6.field122 = 0;
        class191.field3347 = null;
        class168.field2941.field4561++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1098(int arg0) {
        field2690++;
        if (arg0 != 0) {
            field2699 = 42;
        }
        boolean var2 = class168.field2941.method1734(-13970);
        if (!var2) {
            this.method1105(arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lua;)I")
    public static final int method1099(class113 arg0) {
        class190 var1 = (class190) class167.field2924.method150(((long) arg0.field1964 << 32) + (long) arg0.field1955, 111);
        return var1 == null ? arg0.field1909 : var1.field3329;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method768(int arg0) {
        field2688++;
        if (class162.field2858 == 1000) {
            return;
        }
        boolean var2 = class90.method650((byte) 106);
        if (var2 && class54.field893 && class4.field118 != null) {
            class4.field118.method88(-118);
        }
        if ((class162.field2858 == 30 || class162.field2858 == 10) && (class264.field4661 || class242.field4242 != 0L && class242.field4242 < class77.method569((byte) -123))) {
            class27.method245(class175.field3029, false, class222.field3854, class264.field4661, class210.method1410(arg0 ^ 0xFFFFAA8B));
        }
        if (class129.field2237 == null) {
            Container var3;
            if (class129.field2237 != null) {
                var3 = class129.field2237;
            } else if (class153.field2656 == null) {
                var3 = class118.field2117.field3473;
            } else {
                var3 = class153.field2656;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class153.field2656 == var3) {
                Insets var6 = class153.field2656.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class145.field2527 != var4 || class126.field2202 != var5) {
                if (class198.field3457.startsWith("mac")) {
                    class126.field2202 = var5;
                    class145.field2527 = var4;
                } else {
                    class19.method152((byte) 127);
                }
                class242.field4242 = class77.method569((byte) -2) + 500L;
            }
        }
        if (arg0 != -21877) {
            return;
        }
        boolean var7 = false;
        if (class14.field272) {
            var7 = true;
            class14.field272 = false;
        }
        if (var7) {
            class47.method354(arg0 ^ 0x550A);
        }
        if (class162.field2858 == 0) {
            class57.method412((byte) 28, class209.field3602, var7, class50.field830, (Color) null);
        } else if (class162.field2858 == 5) {
            class209.method1409(class54.field890, false, 16777215);
        } else if (class162.field2858 == 10) {
            class83.method608((byte) 15);
        } else if (class162.field2858 == 25 || class162.field2858 == 28) {
            if (class88.field1432 == 1) {
                if (class253.field4427 < class157.field2739) {
                    class253.field4427 = class157.field2739;
                }
                int var9 = (class253.field4427 - class157.field2739) * 50 / class253.field4427;
                class200.method1373(false, 6, class30.method266(new class280[] { class196.field3435, class278.field4880, class249.method1685((byte) 111, var9), class9.field208 }, (byte) -87));
            } else if (class88.field1432 == 2) {
                if (class109.field1829 < class123.field2160) {
                    class109.field1829 = class123.field2160;
                }
                int var8 = (class109.field1829 - class123.field2160) * 50 / class109.field1829 + 50;
                class200.method1373(false, arg0 ^ 0xFFFFAA8D, class30.method266(new class280[] { class196.field3435, class278.field4880, class249.method1685((byte) 40, var8), class9.field208 }, (byte) -87));
            } else {
                class200.method1373(false, 6, class196.field3435);
            }
        } else if (class162.field2858 == 30) {
            class144.method993((byte) 75);
        } else if (class162.field2858 == 40) {
            class200.method1373(false, 6, class30.method266(new class280[] { class58.field937, class20.field370, class241.field4216 }, (byte) -87));
        }
        if ((class162.field2858 == 30 || class162.field2858 == 10) && class201.field3522 == 0 && !var7) {
            try {
                Graphics var10 = class41.field707.getGraphics();
                for (int var11 = 0; var11 < class31.field585; var11++) {
                    if (class120.field2130[var11]) {
                        class152.field2629.method302(var10, class232.field4052[var11], class169.field2958[var11], class14.field278[var11], class91.field1478[var11], (byte) -16);
                        class120.field2130[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class41.field707.repaint();
            }
        } else if (class162.field2858 != 0) {
            try {
                Graphics var12 = class41.field707.getGraphics();
                class152.field2629.method300(-14412, 0, var12, 0);
                for (int var13 = 0; var13 < class31.field585; var13++) {
                    class120.field2130[var13] = false;
                }
            } catch (Exception var14) {
                class41.field707.repaint();
            }
        }
        if (class54.field886) {
            class262.method1772(false);
        }
        if (class242.field4247 && class162.field2858 == 10 && class246.field4315 != -1) {
            class242.field4247 = false;
            class47.method351(class118.field2117, -583);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1100(int arg0) {
        for (class252.field4413 = 0; class249.method1683(109) && class252.field4413 < 128; class252.field4413++) {
            class187.field3280[class252.field4413] = class123.field2165;
            class43.field723[class252.field4413] = class244.field4295;
        }
        field2683++;
        class165.field2889++;
        if (class246.field4315 != arg0) {
            class140.method973(0, 0, 0, class103.field1724, 53, class190.field3328, class246.field4315, 0);
        }
        class237.field4118++;
        class76.method568(false);
        while (true) {
            class178 var2;
            class113 var3;
            class113 var4;
            do {
                var2 = (class178) class92.field1498.method642(2);
                if (var2 == null) {
                    while (true) {
                        class178 var5;
                        class113 var6;
                        class113 var7;
                        do {
                            var5 = (class178) class244.field4292.method642(2);
                            if (var5 == null) {
                                while (true) {
                                    class178 var8;
                                    class113 var9;
                                    class113 var10;
                                    do {
                                        var8 = (class178) class43.field722.method642(2);
                                        if (var8 == null) {
                                            if (class57.field927 != null) {
                                                class28.method249(false);
                                            }
                                            if (class255.field4509 != null && class255.field4509.field3025 == 1) {
                                                if (class255.field4509.field3028 != null) {
                                                    class199.method1370(class101.field1643, class57.field918, -1);
                                                }
                                                class255.field4509 = null;
                                                class101.field1643 = null;
                                                class57.field918 = false;
                                            }
                                            if ((class117.field2104 % 1500) == 0) {
                                                class93.method659((byte) -77);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field3106;
                                        if (var9.field1955 < 0) {
                                            break;
                                        }
                                        var10 = class233.method1569(65535, var9.field1998);
                                    } while (var10 == null || var10.field1865 == null || var9.field1955 >= var10.field1865.length || var10.field1865[var9.field1955] != var9);
                                    class199.method1371(200000, var8);
                                }
                            }
                            var6 = var5.field3106;
                            if (var6.field1955 < 0) {
                                break;
                            }
                            var7 = class233.method1569(65535, var6.field1998);
                        } while (var7 == null || var7.field1865 == null || var7.field1865.length <= var6.field1955 || var7.field1865[var6.field1955] != var6);
                        class199.method1371(200000, var5);
                    }
                }
                var3 = var2.field3106;
                if (var3.field1955 < 0) {
                    break;
                }
                var4 = class233.method1569(arg0 + 65536, var3.field1998);
            } while (var4 == null || var4.field1865 == null || var3.field1955 >= var4.field1865.length || var4.field1865[var3.field1955] != var3);
            class199.method1371(200000, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method772(int arg0) {
        field2681++;
        if (class162.field2858 == 1000) {
            return;
        }
        class117.field2104++;
        if (class117.field2104 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class89.field1436 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class34.field634.setSeed((long) class89.field1436);
        }
        this.method1098(0);
        if (class228.field3950 != null) {
            class228.field3950.method616(0);
        }
        class168.method1169((byte) 98);
        class128.method884(-19552);
        class33.method283((byte) -26);
        class175.method1199(0);
        if (class196.field3439 != null) {
            int var3 = class196.field3439.method467(0);
            class19.field365 = var3;
        }
        if (class162.field2858 == 0) {
            this.method1096(-8159);
            class224.method1514(false);
        } else if (class162.field2858 == 5) {
            this.method1096(-8159);
            class224.method1514(false);
        } else if (class162.field2858 == 25 || class162.field2858 == 28) {
            class79.method587(false);
        }
        if (arg0 > -60) {
            main((String[]) null);
        }
        if (class162.field2858 == 10) {
            this.method1100(-1);
            class52.method387(-124);
            class246.method1667((byte) 116);
            class65.method449(-59);
        } else if (class162.field2858 == 30) {
            class82.method594((byte) -58);
        } else if (class162.field2858 == 40) {
            class65.method449(-42);
            if (class8.field148 != -3) {
                if (class8.field148 == 15) {
                    class38.method303((byte) -95);
                } else if (class8.field148 != 2) {
                    class40.method313((byte) 71);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lua;)Z")
    public static final boolean method1101(class113 arg0) {
        if (class250.field4377) {
            if (method1099(arg0) != 0) {
                return false;
            }
            if (arg0.field1879 == 0) {
                return false;
            }
        }
        return arg0.field1924;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class112.field1836 == 0) {
            int var7 = class37.field663;
            int var8 = class162.field2831;
            int var9 = class13.field262;
            int var10 = class211.field3623;
            int var11 = (arg0 - arg1) * (var10 - var9) / arg2 + var9;
            int var12 = (arg5 - arg6) * (var8 - var7) / arg4 + var7;
            if (class263.field4647 && (class167.field2931 & 0x40) == 64) {
                class113 var13 = class224.method1509(class235.field4098, class28.field529, (byte) -25);
                if (var13 == null) {
                    class34.method286((byte) 125);
                } else {
                    class184.method1276(var12, class90.field1473, 6479, (short) 41, -1, 0L, class210.field3612, var11);
                }
            } else {
                if (class283.field4992 == 1) {
                    class184.method1276(var12, class230.field3988, 6479, (short) 21, -1, 0L, class229.field3959, var11);
                }
                class184.method1276(var12, class18.field337, arg3 ^ 0x1966, (short) 33, -1, 0L, class229.field3959, var11);
                class180.field3131++;
            }
        }
        field2693++;
        long var14 = -1L;
        if (arg3 != 41) {
            field2699 = -42;
        }
        for (int var16 = 0; var16 < class99.field1600; var16++) {
            long var17 = class25.field464[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FC2) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class236.method1584(class231.field4013, var19, var20, var17)) {
                    class130 var23 = class32.method277((byte) -87, var22);
                    if (var23.field2269 != null) {
                        var23 = var23.method891(0);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class112.field1836 == 1) {
                        class182.field3188++;
                        class184.method1276(var19, class182.field3199, 6479, (short) 57, class248.field4347, var17, class30.method266(new class280[] { class48.field791, class234.field4078, var23.field2250 }, (byte) -87), var20);
                    } else if (!class263.field4647) {
                        class235.field4104++;
                        class280[] var24 = var23.field2256;
                        if (class54.field888) {
                            var24 = class234.method1575((byte) -88, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 58;
                                    }
                                    int var27 = -1;
                                    if (var25 == 1) {
                                        var26 = 26;
                                    }
                                    if (var23.field2254 == var25) {
                                        var27 = var23.field2255;
                                    }
                                    class280.field4890++;
                                    if (var25 == 2) {
                                        var26 = 8;
                                    }
                                    if (var23.field2264 == var25) {
                                        var27 = var23.field2319;
                                    }
                                    if (var25 == 3) {
                                        var26 = 46;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1005;
                                    }
                                    class184.method1276(var19, var24[var25], 6479, var26, var27, var17, class30.method266(new class280[] { class11.field236, var23.field2250 }, (byte) -87), var20);
                                }
                            }
                        }
                        class184.method1276(var19, class126.field2214, arg3 + 6438, (short) 1007, class127.field2225, (long) var23.field2290, class30.method266(new class280[] { class11.field236, var23.field2250 }, (byte) -87), var20);
                    } else if ((class167.field2931 & 0x4) == 4) {
                        class73.field1196++;
                        class184.method1276(var19, class90.field1473, 6479, (short) 37, -1, var17, class30.method266(new class280[] { class268.field4702, class234.field4078, var23.field2250 }, (byte) -87), var20);
                    }
                }
                if (var21 == 1) {
                    class61 var28 = class46.field756[var22];
                    if (var28.field987.field4489 == 1 && (var28.field4791 & 0x7F) == 64 && (var28.field4793 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < class112.field1845; var29++) {
                            class61 var32 = class46.field756[class46.field767[var29]];
                            if (var32 != null && var28 != var32 && var32.field987.field4489 == 1 && var28.field4791 == var32.field4791 && var28.field4793 == var32.field4793) {
                                class261.method1764(var32.field987, class46.field767[var29], 34, var20, var19);
                            }
                        }
                        for (int var30 = 0; var30 < class205.field3554; var30++) {
                            class142 var31 = class280.field4940[class250.field4376[var30]];
                            if (var31 != null && var28.field4791 == var31.field4791 && var28.field4793 == var31.field4793) {
                                class181.method1265(var19, var31, class250.field4376[var30], var20, (byte) -30);
                            }
                        }
                    }
                    class261.method1764(var28.field987, var22, 34, var20, var19);
                }
                if (var21 == 0) {
                    class142 var33 = class280.field4940[var22];
                    if ((var33.field4791 & 0x7F) == 64 && (var33.field4793 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < class112.field1845; var34++) {
                            class61 var37 = class46.field756[class46.field767[var34]];
                            if (var37 != null && var37.field987.field4489 == 1 && var33.field4791 == var37.field4791 && var33.field4793 == var37.field4793) {
                                class261.method1764(var37.field987, class46.field767[var34], 34, var20, var19);
                            }
                        }
                        for (int var35 = 0; var35 < class205.field3554; var35++) {
                            class142 var36 = class280.field4940[class250.field4376[var35]];
                            if (var36 != null && var33 != var36 && var33.field4791 == var36.field4791 && var33.field4793 == var36.field4793) {
                                class181.method1265(var19, var36, class250.field4376[var35], var20, (byte) -30);
                            }
                        }
                    }
                    class181.method1265(var19, var33, var22, var20, (byte) -30);
                }
                if (var21 == 3) {
                    class90 var38 = class165.field2896[class231.field4013][var19][var20];
                    if (var38 != null) {
                        for (class60 var39 = (class60) var38.method646((byte) 22); var39 != null; var39 = (class60) var38.method647(false)) {
                            int var40 = var39.field968.field1326;
                            class220 var41 = class23.method177((byte) -97, var40);
                            if (class112.field1836 == 1) {
                                class158.field2765++;
                                class184.method1276(var19, class182.field3199, 6479, (short) 29, class248.field4347, (long) var40, class30.method266(new class280[] { class48.field791, class38.field674, var41.field3818 }, (byte) -87), var20);
                            } else if (!class263.field4647) {
                                class32.field593++;
                                class280[] var42 = var41.field3814;
                                if (class54.field888) {
                                    var42 = class234.method1575((byte) -88, var42);
                                }
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        byte var44 = 0;
                                        class122.field2146++;
                                        int var45 = -1;
                                        if (var41.field3798 == var43) {
                                            var45 = var41.field3826;
                                        }
                                        if (var41.field3776 == var43) {
                                            var45 = var41.field3796;
                                        }
                                        if (var43 == 0) {
                                            var44 = 1;
                                        }
                                        if (var43 == 1) {
                                            var44 = 3;
                                        }
                                        if (var43 == 2) {
                                            var44 = 20;
                                        }
                                        if (var43 == 3) {
                                            var44 = 42;
                                        }
                                        if (var43 == 4) {
                                            var44 = 59;
                                        }
                                        class184.method1276(var19, var42[var43], 6479, var44, var45, (long) var40, class30.method266(new class280[] { class173.field3015, var41.field3818 }, (byte) -87), var20);
                                    }
                                }
                                class184.method1276(var19, class126.field2214, 6479, (short) 1006, class127.field2225, (long) var40, class30.method266(new class280[] { class173.field3015, var41.field3818 }, (byte) -87), var20);
                            } else if ((class167.field2931 & 0x1) == 1) {
                                class126.field2211++;
                                class184.method1276(var19, class90.field1473, arg3 + 6438, (short) 12, -1, (long) var40, class30.method266(new class280[] { class268.field4702, class38.field674, var41.field3818 }, (byte) -87), var20);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static void method1103(byte arg0) {
        if (arg0 > -124) {
            field2696 = null;
        }
        field2689 = null;
        field2700 = null;
        field2696 = null;
        field2697 = null;
        field2698 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method771(boolean arg0) {
        method1103((byte) -125);
        class280.method1868((byte) -107);
        class34.method288(-106);
        class103.method726(0);
        field2691++;
        class184.method1285(128);
        class109.method763(31);
        class133.method921(120);
        class38.method304((byte) 19);
        class122.method859(1);
        class249.method1679(156);
        class25.method229((byte) -125);
        class227.method1530(5000);
        class257.method1741((byte) -21);
        class21.method161((byte) -97);
        class86.method617(8);
        class230.method1550(true);
        class180.method1232(-97);
        class187.method1310(21746);
        class211.method1412(75);
        class221.method1484(0);
        class61.method430(false);
        class74.method556(98);
        class99.method705(-100);
        class113.method786((byte) 37);
        class142.method982(70);
        class90.method644(14359);
        class108.method753(!arg0);
        class19.method149((byte) 120);
        class123.method861(-10518);
        class51.method378(-1);
        class262.method1778((byte) 115);
        class1.method9(-24742);
        class9.method98(127);
        class18.method134(true);
        class176.method1211(0);
        class78.method575(9);
        class277.method1837(12070);
        class162.method1149(5);
        class155.method1110(false);
        class255.method1715(8);
        class144.method992((byte) -23);
        class161.method1148(1);
        class31.method269((byte) 122);
        class152.method1076(-94);
        class147.method1023((byte) -20);
        class203.method1385(127);
        class117.method841(-1);
        class267.method1792((byte) 86);
        class36.method292(26406);
        class15.method122(-116);
        class120.method855((byte) -125);
        class209.method1406(74);
        class206.method1397(0);
        class207.method1400(35);
        class219.method1461(1);
        class208.method1403((byte) 97);
        class130.method905(-116);
        class268.method1798((byte) 2);
        class225.method1517(0);
        class118.method845(256);
        class114.method811();
        class273.method1817(-11302);
        class220.method1471((byte) -119);
        class239.method1609();
        class57.method411(arg0);
        class205.method1395((byte) 108);
        class261.method1770(-128);
        class29.method257((byte) -113);
        class80.method589(128);
        class106.method743(10);
        class82.method593(124);
        class72.method517();
        class24.method180(7);
        class64.method444((byte) 53);
        class139.method964();
        class46.method345((byte) -128);
        class258.method1747((byte) 118);
        class88.method629(false);
        class137.method947();
        class55.method404(0);
        class62.method439(64);
        class43.method330(arg0);
        class260.method1760(false);
        class151.method1058();
        class58.method415(768);
        class30.method263((byte) 107);
        class27.method248(-1);
        class53.method393((byte) 125);
        class253.method1705(0);
        class73.method544(6);
        class37.method295((byte) -123);
        class275.method1831(false);
        class136.method930(127);
        class50.method366(false);
        class101.method715((byte) 39);
        class199.method1367(85);
        class149.method1031(0);
        class241.method1636(110);
        class248.method1677((byte) 32);
        class20.method158(0);
        class240.method1631(16);
        class283.method1921((byte) -84);
        class150.method1040(arg0);
        class89.method630(1);
        class105.method740(-1);
        class41.method317((byte) -11);
        class215.method1443(0);
        class246.method1673(false);
        class146.method1008();
        class153.method1081(24);
        class96.method674((byte) 104);
        class276.method1832((byte) 91);
        class107.method746(-59);
        class2.method47(-18633);
        class145.method998(false);
        class237.method1589(64);
        class165.method1162((byte) -89);
        class229.method1542((byte) 82);
        class178.method1224(103);
        class265.method1786(false);
        class160.method1144(81);
        class33.method280(-56);
        class163.method1152(28104);
        class49.method359(29);
        class245.method1665((byte) 30);
        class196.method1342(12802);
        class169.method1174(69);
        class63.method442();
        class100.method711((byte) -128);
        class235.method1580((byte) 97);
        class56.method409((byte) -59);
        class47.method353(0);
        class271.method1813(30066);
        class44.method336((byte) -71);
        class116.method838(92);
        class157.method1122(115);
        class201.method1378(-123);
        class23.method176(-128);
        class236.method1583(11480);
        class182.method1267(true);
        class175.method1198((byte) 103);
        class166.method1165();
        class79.method586(-2087691388);
        class244.method1656(!arg0);
        class124.method862(29490);
        class192.method1326(383);
        class224.method1512(false);
        class14.method115(255);
        class190.method1320((byte) -68);
        class81.method591(-32768);
        class234.method1578(false);
        class148.method1029(88);
        class185.method1289(true);
        class238.method1594(11738);
        class226.method1520(-21704);
        class52.method386(4);
        class104.method732(-12926);
        class128.method883(false);
        class140.method975((byte) 125);
        class66.method455(0);
        class17.method132(6);
        class16.method125(arg0);
        class45.method344(11851);
        class76.method566(100);
        class87.method624();
        class8.method81((byte) 75);
        class125.method866(true);
        class251.method1690((byte) 83);
        class263.method1782(123);
        class216.method1451();
        class138.method951();
        class156.method1111();
        class115.method837((byte) 125);
        class233.method1567((byte) -25);
        class170.method1184();
        class213.method1425();
        class102.method723((byte) -125);
        class65.method453(60);
        class242.method1646(-256);
        class264.method1784(2762);
        class132.method915((byte) 77);
        class212.method1418(arg0);
        class28.method253(true);
        class11.method104((byte) -9);
        class97.method679((byte) 115);
        class48.method357(-5401);
        class252.method1695((byte) 64);
        class158.method1124(99);
        class181.method1264((byte) 109);
        class197.method1345(-105);
        class129.method886(-64);
        class126.method871(false);
        class98.method689((byte) 0);
        class6.method73(arg0);
        class40.method314(3740);
        class127.method878((byte) 114);
        class193.method1335((byte) -73);
        class278.method1844(-17137);
        class282.method1907(674566340);
        class75.method561(2);
        class13.method112(-27030);
        class279.method1849((byte) 123);
        class200.method1375(0);
        class232.method1561(0);
        class259.method1753((byte) -15);
        class228.method1538(38);
        class91.method652(31722);
        class154.method1092((byte) 6);
        class173.method1197((byte) -47);
        class167.method1167(89);
        class93.method662(true);
        class35.method289(5803);
        class194.method1339(-27158);
        class131.method908(-32769);
        class214.method1434(25914);
        class243.method1651(!arg0);
        class112.method783(-80);
        class54.method399(false);
        class177.method1219(2);
        class159.method1134(-126);
        class183.method1272(!arg0);
        class12.method108(79);
        class3.method48(0);
        class231.method1555((byte) -123);
        class269.method1801(-1);
        class250.method1689(false);
        class32.method275(3510);
        class266.method1789((byte) 126);
        class134.method924(4096);
        class210.method1411((byte) 72);
        class4.method59(128);
        class168.method1172(-120);
        class60.method423((byte) -116);
        class67.method461((byte) -42);
        class204.method1390(31969);
        class68.method465(true);
        class254.method1708((byte) 69);
        class59.method419(-1770);
        class189.method1314(121);
        class7.method75(true);
        class164.method1158(0);
        class94.method666(4);
        class92.method656(0);
        class188.method1313(-18195);
        class83.method606(-58);
        class191.method1324(124);
        if (class109.field1830) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2680++;
        try {
            if (arg0.length != 4) {
                class73.method546(-27635, "argument count");
            }
            class45.field749 = Integer.parseInt(arg0[0]);
            int var1 = -1;
            class128.field2232 = 2;
            if (arg0[1].equals("live")) {
                class189.field3314 = 0;
            } else if (arg0[1].equals("rc")) {
                class189.field3314 = 1;
            } else if (arg0[1].equals("wip")) {
                class189.field3314 = 2;
            } else {
                class73.method546(-27635, "modewhat");
            }
            class16.field295 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class50.method373(false, class153.method1084(0, var2, 0, var2.length));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class269.field4725 = var1;
            } else if (arg0[2].equals("english")) {
                class269.field4725 = 0;
            } else if (arg0[2].equals("german")) {
                class269.field4725 = 1;
            } else {
                class73.method546(-27635, "language");
            }
            class34.method285(1559051078, class269.field4725);
            class255.field4481 = false;
            class105.field1739 = false;
            if (arg0[3].equals("game0")) {
                class283.field4992 = 0;
            } else if (arg0[3].equals("game1")) {
                class283.field4992 = 1;
            } else {
                class73.method546(-27635, "game");
            }
            class188.field3309 = class229.field3959;
            class47.field783 = false;
            class108.field1778 = 0;
            class201.field3514 = 0;
            client var3 = new client();
            class194.field3418 = var3;
            var3.method775(1024, 28, (byte) -74, false, 528, 768, "runescape", class189.field3314 + 32);
            class153.field2656.setLocation(40, 40);
        } catch (Exception var6) {
            class207.method1398((String) null, -80, var6);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lua;IIIIIII)V")
    public static final void method1104(class113[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class113 var9 = arg0[var8];
            if (var9 != null && var9.field1998 == arg1 && (!var9.field2008 || var9.field1879 == 0 || var9.field1971 || method1099(var9) != 0 || class264.field4657 == var9 || var9.field1899 == 1338) && (!var9.field2008 || !method1101(var9))) {
                int var10 = var9.field1900 + arg6;
                int var11 = var9.field1897 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1879 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1869 + var10;
                    int var17 = var9.field1995 + var11;
                    if (var9.field1879 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class57.field927 == var9) {
                    class266.field4677 = true;
                    class8.field155 = var10;
                    class82.field1352 = var11;
                }
                if (!var9.field2008 || var12 < var14 && var13 < var15) {
                    if (var9.field1879 == 0) {
                        if (!var9.field2008 && method1101(var9) && class185.field3251 != var9) {
                            continue;
                        }
                        if (var9.field1942 && class229.field3957 >= var12 && class154.field2673 >= var13 && class229.field3957 < var14 && class154.field2673 < var15) {
                            for (class178 var18 = (class178) class43.field722.method651(12916); var18 != null; var18 = (class178) class43.field722.method643(11066)) {
                                if (var18.field3092) {
                                    var18.method1146(26159);
                                    var18.field3106.field1892 = false;
                                }
                            }
                            if (class105.field1754 == 0) {
                                class57.field927 = null;
                                class264.field4657 = null;
                            }
                            class167.field2929 = false;
                        }
                    }
                    if (var9.field2008) {
                        boolean var19;
                        if (class229.field3957 >= var12 && class154.field2673 >= var13 && class229.field3957 < var14 && class154.field2673 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class74.field1229 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class175.field3034 == 1 && class98.field1572 >= var12 && class187.field3268 >= var13 && class98.field1572 < var14 && class187.field3268 < var15) {
                            var21 = true;
                        }
                        if (class252.field4413 > 0 && var9.field2033 != null) {
                            for (int var22 = 0; var22 < var9.field2033.length; var22++) {
                                for (int var23 = 0; var23 < class252.field4413; var23++) {
                                    int var24 = var9.field2033[var22] & 0xFF;
                                    if (class187.field3280[var23] == var24) {
                                        if (var9.field2024 != null) {
                                            byte var25 = var9.field2024[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class88.field1431[86] || (var25 & 0x1) != 0 && !class88.field1431[82] || (var25 & 0x4) != 0 && !class88.field1431[81])) {
                                                continue;
                                            }
                                        }
                                        class153.method1087(class229.field3959, -1, -11714, var22 + 1, var9.field1964);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class261.method1766(var9, class187.field3268 - var11, 0, class98.field1572 - var10);
                        }
                        if (class57.field927 != null && class57.field927 != var9 && var19 && class250.method1687(-8651, method1099(var9))) {
                            class226.field3901 = var9;
                        }
                        if (class264.field4657 == var9) {
                            class224.field3864 = true;
                            class283.field4974 = var10;
                            class12.field254 = var11;
                        }
                        if (var9.field1971 || var9.field1899 != 0) {
                            if (var19 && class19.field365 != 0 && var9.field2014 != null) {
                                class178 var26 = new class178();
                                var26.field3092 = true;
                                var26.field3106 = var9;
                                var26.field3097 = class19.field365;
                                var26.field3107 = var9.field2014;
                                class43.field722.method649(var26, (byte) 87);
                            }
                            if (class57.field927 != null || class221.field3837 != null || class31.field582 || var9.field1899 != 1400 && class167.field2929) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1899 != 0) {
                                if (var9.field1899 == 1337) {
                                    class157.field2740 = var9;
                                    class242.method1642((byte) 65, var9);
                                    continue;
                                }
                                if (var9.field1899 == 1338) {
                                    if (var21) {
                                        class68.field1126 = class98.field1572 - var10;
                                        class226.field3898 = class187.field3268 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1899 == 1400) {
                                    class145.field2532 = var9;
                                    if (var21) {
                                        if (class88.field1431[82] && class129.field2238 > 0) {
                                            int var27 = (int) ((double) (class98.field1572 - var10 - var9.field1869 / 2) * 2.0D / (double) class49.field809);
                                            int var28 = (int) ((double) (class187.field3268 - var11 - var9.field1995 / 2) * 2.0D / (double) class49.field809);
                                            int var29 = class266.field4684 + var27;
                                            int var30 = class47.field780 + var28;
                                            int var31 = class113.field2023 + var29;
                                            int var32 = class74.field1222 + class243.field4268 - var30 - 1;
                                            class207.method1399(var31, 0, 29607, var32);
                                            class275.method1827((byte) 32);
                                            continue;
                                        }
                                        class167.field2929 = true;
                                        class108.field1783 = class229.field3957;
                                        class109.field1797 = class154.field2673;
                                        class157.field2749 = class266.field4684;
                                        class56.field912 = class47.field780;
                                        continue;
                                    }
                                    if (var20 && class167.field2929) {
                                        class221.method1486((int) ((double) (class108.field1783 - class229.field3957) * 2.0D / (double) class53.field866) + class157.field2749, 20386);
                                        class113.method787(1, (int) ((double) (class109.field1797 - class154.field2673) * 2.0D / (double) class53.field866) + class56.field912);
                                        continue;
                                    }
                                    class167.field2929 = false;
                                    continue;
                                }
                                if (var9.field1899 == 1401) {
                                    if (var20) {
                                        class241.method1639(var9.field1869, -1, var9.field1995, class154.field2673 - var11, class229.field3957 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field1899 == 1402) {
                                    class242.method1642((byte) 113, var9);
                                    continue;
                                }
                            }
                            if (!var9.field2001 && var21) {
                                var9.field2001 = true;
                                if (var9.field2002 != null) {
                                    class178 var33 = new class178();
                                    var33.field3092 = true;
                                    var33.field3106 = var9;
                                    var33.field3098 = class98.field1572 - var10;
                                    var33.field3097 = class187.field3268 - var11;
                                    var33.field3107 = var9.field2002;
                                    class43.field722.method649(var33, (byte) 115);
                                }
                            }
                            if (var9.field2001 && var20 && var9.field1965 != null) {
                                class178 var34 = new class178();
                                var34.field3092 = true;
                                var34.field3106 = var9;
                                var34.field3098 = class229.field3957 - var10;
                                var34.field3097 = class154.field2673 - var11;
                                var34.field3107 = var9.field1965;
                                class43.field722.method649(var34, (byte) 111);
                            }
                            if (var9.field2001 && !var20) {
                                var9.field2001 = false;
                                if (var9.field1922 != null) {
                                    class178 var35 = new class178();
                                    var35.field3092 = true;
                                    var35.field3106 = var9;
                                    var35.field3098 = class229.field3957 - var10;
                                    var35.field3097 = class154.field2673 - var11;
                                    var35.field3107 = var9.field1922;
                                    class244.field4292.method649(var35, (byte) 89);
                                }
                            }
                            if (var20 && var9.field1946 != null) {
                                class178 var36 = new class178();
                                var36.field3092 = true;
                                var36.field3106 = var9;
                                var36.field3098 = class229.field3957 - var10;
                                var36.field3097 = class154.field2673 - var11;
                                var36.field3107 = var9.field1946;
                                class43.field722.method649(var36, (byte) 88);
                            }
                            if (!var9.field1892 && var19) {
                                var9.field1892 = true;
                                if (var9.field1938 != null) {
                                    class178 var37 = new class178();
                                    var37.field3092 = true;
                                    var37.field3106 = var9;
                                    var37.field3098 = class229.field3957 - var10;
                                    var37.field3097 = class154.field2673 - var11;
                                    var37.field3107 = var9.field1938;
                                    class43.field722.method649(var37, (byte) 111);
                                }
                            }
                            if (var9.field1892 && var19 && var9.field1948 != null) {
                                class178 var38 = new class178();
                                var38.field3092 = true;
                                var38.field3106 = var9;
                                var38.field3098 = class229.field3957 - var10;
                                var38.field3097 = class154.field2673 - var11;
                                var38.field3107 = var9.field1948;
                                class43.field722.method649(var38, (byte) 99);
                            }
                            if (var9.field1892 && !var19) {
                                var9.field1892 = false;
                                if (var9.field1954 != null) {
                                    class178 var39 = new class178();
                                    var39.field3092 = true;
                                    var39.field3106 = var9;
                                    var39.field3098 = class229.field3957 - var10;
                                    var39.field3097 = class154.field2673 - var11;
                                    var39.field3107 = var9.field1954;
                                    class244.field4292.method649(var39, (byte) 80);
                                }
                            }
                            if (var9.field1919 != null) {
                                class178 var40 = new class178();
                                var40.field3106 = var9;
                                var40.field3107 = var9.field1919;
                                class92.field1498.method649(var40, (byte) 86);
                            }
                            if (var9.field1967 != null && class27.field514 > var9.field1979) {
                                if (var9.field1974 == null || class27.field514 - var9.field1979 > 32) {
                                    class178 var45 = new class178();
                                    var45.field3106 = var9;
                                    var45.field3107 = var9.field1967;
                                    class43.field722.method649(var45, (byte) 82);
                                } else {
                                    label546: for (int var41 = var9.field1979; var41 < class27.field514; var41++) {
                                        int var42 = class233.field4057[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1974.length; var43++) {
                                            if (var9.field1974[var43] == var42) {
                                                class178 var44 = new class178();
                                                var44.field3106 = var9;
                                                var44.field3107 = var9.field1967;
                                                class43.field722.method649(var44, (byte) 116);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field1979 = class27.field514;
                            }
                            if (var9.field1926 != null && class165.field2894 > var9.field1887) {
                                if (var9.field1941 == null || class165.field2894 - var9.field1887 > 32) {
                                    class178 var50 = new class178();
                                    var50.field3106 = var9;
                                    var50.field3107 = var9.field1926;
                                    class43.field722.method649(var50, (byte) 100);
                                } else {
                                    label522: for (int var46 = var9.field1887; var46 < class165.field2894; var46++) {
                                        int var47 = class49.field810[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1941.length; var48++) {
                                            if (var9.field1941[var48] == var47) {
                                                class178 var49 = new class178();
                                                var49.field3106 = var9;
                                                var49.field3107 = var9.field1926;
                                                class43.field722.method649(var49, (byte) 107);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field1887 = class165.field2894;
                            }
                            if (var9.field1893 != null && class41.field706 > var9.field1935) {
                                if (var9.field2027 == null || class41.field706 - var9.field1935 > 32) {
                                    class178 var55 = new class178();
                                    var55.field3106 = var9;
                                    var55.field3107 = var9.field1893;
                                    class43.field722.method649(var55, (byte) 117);
                                } else {
                                    label498: for (int var51 = var9.field1935; var51 < class41.field706; var51++) {
                                        int var52 = class183.field3217[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field2027.length; var53++) {
                                            if (var9.field2027[var53] == var52) {
                                                class178 var54 = new class178();
                                                var54.field3106 = var9;
                                                var54.field3107 = var9.field1893;
                                                class43.field722.method649(var54, (byte) 106);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field1935 = class41.field706;
                            }
                            if (var9.field1961 != null && class65.field1086 > var9.field1908) {
                                if (var9.field2032 == null || class65.field1086 - var9.field1908 > 32) {
                                    class178 var60 = new class178();
                                    var60.field3106 = var9;
                                    var60.field3107 = var9.field1961;
                                    class43.field722.method649(var60, (byte) 95);
                                } else {
                                    label474: for (int var56 = var9.field1908; var56 < class65.field1086; var56++) {
                                        int var57 = class264.field4658[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field2032.length; var58++) {
                                            if (var9.field2032[var58] == var57) {
                                                class178 var59 = new class178();
                                                var59.field3106 = var9;
                                                var59.field3107 = var9.field1961;
                                                class43.field722.method649(var59, (byte) 122);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field1908 = class65.field1086;
                            }
                            if (var9.field1980 != null && class89.field1437 > var9.field1920) {
                                if (var9.field1867 == null || class89.field1437 - var9.field1920 > 32) {
                                    class178 var65 = new class178();
                                    var65.field3106 = var9;
                                    var65.field3107 = var9.field1980;
                                    class43.field722.method649(var65, (byte) 125);
                                } else {
                                    label450: for (int var61 = var9.field1920; var61 < class89.field1437; var61++) {
                                        int var62 = class282.field4955[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1867.length; var63++) {
                                            if (var9.field1867[var63] == var62) {
                                                class178 var64 = new class178();
                                                var64.field3106 = var9;
                                                var64.field3107 = var9.field1980;
                                                class43.field722.method649(var64, (byte) 92);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field1920 = class89.field1437;
                            }
                            if (class243.field4266 > var9.field2010 && var9.field1936 != null) {
                                class178 var66 = new class178();
                                var66.field3106 = var9;
                                var66.field3107 = var9.field1936;
                                class43.field722.method649(var66, (byte) 90);
                            }
                            if (class259.field4597 > var9.field2010 && var9.field1928 != null) {
                                class178 var67 = new class178();
                                var67.field3106 = var9;
                                var67.field3107 = var9.field1928;
                                class43.field722.method649(var67, (byte) 89);
                            }
                            if (class2.field82 > var9.field2010 && var9.field1952 != null) {
                                class178 var68 = new class178();
                                var68.field3106 = var9;
                                var68.field3107 = var9.field1952;
                                class43.field722.method649(var68, (byte) 82);
                            }
                            if (class181.field3159 > var9.field2010 && var9.field1905 != null) {
                                class178 var69 = new class178();
                                var69.field3106 = var9;
                                var69.field3107 = var9.field1905;
                                class43.field722.method649(var69, (byte) 87);
                            }
                            if (class83.field1380 > var9.field2010 && var9.field1882 != null) {
                                class178 var70 = new class178();
                                var70.field3106 = var9;
                                var70.field3107 = var9.field1882;
                                class43.field722.method649(var70, (byte) 125);
                            }
                            var9.field2010 = class237.field4118;
                            if (var9.field1927 != null) {
                                for (int var71 = 0; var71 < class252.field4413; var71++) {
                                    class178 var72 = new class178();
                                    var72.field3106 = var9;
                                    var72.field3109 = class187.field3280[var71];
                                    var72.field3103 = class43.field723[var71];
                                    var72.field3107 = var9.field1927;
                                    class43.field722.method649(var72, (byte) 85);
                                }
                            }
                            if (class75.field1240 && var9.field1901 != null) {
                                class178 var73 = new class178();
                                var73.field3106 = var9;
                                var73.field3107 = var9.field1901;
                                class43.field722.method649(var73, (byte) 111);
                            }
                        }
                    }
                    if (!var9.field2008 && class57.field927 == null && class221.field3837 == null && !class31.field582) {
                        if ((var9.field2003 >= 0 || var9.field2026 != 0) && class229.field3957 >= var12 && class154.field2673 >= var13 && class229.field3957 < var14 && class154.field2673 < var15) {
                            if (var9.field2003 >= 0) {
                                class185.field3251 = arg0[var9.field2003];
                            } else {
                                class185.field3251 = var9;
                            }
                        }
                        if (var9.field1879 == 8 && class229.field3957 >= var12 && class154.field2673 >= var13 && class229.field3957 < var14 && class154.field2673 < var15) {
                            class158.field2766 = var9;
                        }
                        if (var9.field1875 > var9.field1995) {
                            class253.method1701(var9, var9.field1995, var9.field1869 + var10, (byte) 118, class154.field2673, var11, var9.field1875, class229.field3957);
                        }
                    }
                    if (var9.field1879 == 0) {
                        method1104(arg0, var9.field1964, var12, var13, var14, var15, var10 - var9.field1877, var11 - var9.field2025);
                        if (var9.field1865 != null) {
                            method1104(var9.field1865, var9.field1964, var12, var13, var14, var15, var10 - var9.field1877, var11 - var9.field2025);
                        }
                        class144 var74 = (class144) class261.field4614.method150((long) var9.field1964, -57);
                        if (var74 != null) {
                            class140.method973(var13, var10, var12, var15, 35, var14, var74.field2517, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method769(byte arg0) {
        if (class252.field4400 != null) {
            class252.field4400.field2152 = false;
        }
        field2694++;
        class252.field4400 = null;
        if (class44.field727 != null) {
            class44.field727.method1532(30);
            class44.field727 = null;
        }
        class97.method678(class41.field707, -92);
        class277.method1840((byte) -91, class41.field707);
        if (class196.field3439 != null) {
            class196.field3439.method466(0, class41.field707);
        }
        class153.method1083(-104);
        class144.method994((byte) 83);
        if (arg0 >= -13) {
            return;
        }
        class196.field3439 = null;
        if (class4.field118 != null) {
            class4.field118.method93(127);
        }
        if (class250.field4391 != null) {
            class250.field4391.method93(126);
        }
        class168.field2941.method1731(-101);
        class176.field3065.method168(10);
        try {
            if (class79.field1297 != null) {
                class79.field1297.method1300(8);
            }
            if (class59.field957 != null) {
                for (int var2 = 0; var2 < class59.field957.length; var2++) {
                    if (class59.field957[var2] != null) {
                        class59.field957[var2].method1300(8);
                    }
                }
            }
            if (class50.field831 != null) {
                class50.field831.method1300(8);
            }
            if (class191.field3338 != null) {
                class191.field3338.method1300(8);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1105(int arg0) {
        field2687++;
        if (class209.field3609 < class168.field2941.field4561) {
            class61.field997 = (class168.field2941.field4561 * 50 - 50) * 5;
            if (class61.field997 > 3000) {
                class61.field997 = 3000;
            }
            if (class238.field4132 == class152.field2637) {
                class152.field2637 = class74.field1218;
            } else {
                class152.field2637 = class238.field4132;
            }
            if (class168.field2941.field4561 >= 2 && class168.field2941.field4563 == 6) {
                this.method767("js5connect_outofdate", arg0 - 7078);
                class162.field2858 = 1000;
                return;
            }
            if (class168.field2941.field4561 >= 4 && class168.field2941.field4563 == -1) {
                this.method767("js5crc", -7078);
                class162.field2858 = 1000;
                return;
            }
            if (class168.field2941.field4561 >= 4 && (class162.field2858 == 0 || class162.field2858 == 5)) {
                if (class168.field2941.field4563 == 7 || class168.field2941.field4563 == 9) {
                    this.method767("js5connect_full", arg0 ^ 0xFFFFE45A);
                } else if (class168.field2941.field4563 <= 0) {
                    this.method767("js5io", -7078);
                } else {
                    this.method767("js5connect", -7078);
                }
                class162.field2858 = 1000;
                return;
            }
        }
        class209.field3609 = class168.field2941.field4561;
        if (class61.field997 > 0) {
            class61.field997--;
            return;
        }
        try {
            if (class6.field122 == arg0) {
                class214.field3677 = class118.field2117.method1358(class152.field2637, arg0 ^ 0xFFFFFF8F, class54.field895);
                class6.field122++;
            }
            if (class6.field122 == 1) {
                if (class214.field3677.field3025 == 2) {
                    this.method1097(1000, (byte) -72);
                    return;
                }
                if (class214.field3677.field3025 == 1) {
                    class6.field122++;
                }
            }
            if (class6.field122 == 2) {
                class191.field3347 = new class227((Socket) class214.field3677.field3028, class118.field2117);
                class25 var2 = new class25(5);
                var2.method227(arg0 ^ 0xFFFFB02D, 15);
                var2.method231(11510, 528);
                class191.field3347.method1526(5, 120, 0, var2.field475);
                class6.field122++;
                class46.field759 = class77.method569((byte) -122);
            }
            if (class6.field122 == 3) {
                if (class162.field2858 == 0 || class162.field2858 == 5 || class191.field3347.method1525(5000) > 0) {
                    int var3 = class191.field3347.method1529(0);
                    if (var3 != 0) {
                        this.method1097(var3, (byte) -118);
                        return;
                    }
                    class6.field122++;
                } else if (class77.method569((byte) -117) - class46.field759 > 30000L) {
                    this.method1097(1001, (byte) -127);
                    return;
                }
            }
            if (class6.field122 == 4) {
                boolean var4 = class162.field2858 == 5 || class162.field2858 == 10 || class162.field2858 == 28;
                class168.field2941.method1736(!var4, class191.field3347, (byte) 98);
                class214.field3677 = null;
                class6.field122 = 0;
                class191.field3347 = null;
            }
        } catch (IOException var5) {
            this.method1097(1002, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method764(boolean arg0) {
        field2684++;
        class19.method152((byte) 85);
        class176.field3065 = new class21();
        class168.field2941 = new class257();
        if (class189.field3314 != 0) {
            class276.field4782 = new byte[50][];
        }
        class3.method51((byte) -90, class118.field2117);
        if (class128.field2232 == 0) {
            class208.field3592 = this.getCodeBase().getHost();
            class106.field1764 = 43594;
            class132.field2345 = 443;
        } else if (class128.field2232 == 1) {
            class208.field3592 = this.getCodeBase().getHost();
            class106.field1764 = class45.field749 + 40000;
            class132.field2345 = class45.field749 + 50000;
        } else if (class128.field2232 == 2) {
            class106.field1764 = class45.field749 + 40000;
            class132.field2345 = class45.field749 + 50000;
            class208.field3592 = "127.0.0.1";
        }
        if (class283.field4992 == 1) {
            class257.field4544 = class182.field3202;
            class241.field4220 = class127.field2220;
            class133.field2359 = class182.field3210;
            class134.field2369 = class142.field2512;
            class73.field1206 = true;
        } else {
            class134.field2369 = class32.field597;
            class257.field4544 = class37.field664;
            class133.field2359 = class265.field4668;
            class241.field4220 = class184.field3244;
        }
        class238.field4132 = class106.field1764;
        class54.field895 = class208.field3592;
        class125.field2195 = class8.field187 = class120.field2139 = class263.field4641 = new short[256];
        class74.field1218 = class132.field2345;
        if (class198.field3469 == 3 && class128.field2232 != 2) {
            class105.field1741 = class45.field749;
        }
        class86.field1426 = class106.field1764;
        class152.field2637 = class86.field1426;
        class150.method1036((byte) 81);
        class96.method672(class41.field707, (byte) 17);
        class133.method920(class41.field707, -90);
        class196.field3439 = class18.method135(-97);
        if (class196.field3439 != null) {
            class196.field3439.method468(class41.field707, false);
        }
        class160.field2813 = class198.field3469;
        try {
            if (class118.field2117.field3461 != null) {
                class79.field1297 = new class187(class118.field2117.field3461, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class59.field957[var2] = new class187(class118.field2117.field3470[var2], 6000, 0);
                }
                class50.field831 = new class187(class118.field2117.field3458, 6000, 0);
                class227.field3914 = new class211(255, class79.field1297, class50.field831, 500000);
                class191.field3338 = new class187(class118.field2117.field3464, 24, 0);
                class118.field2117.field3464 = null;
                class118.field2117.field3461 = null;
                class118.field2117.field3458 = null;
                class118.field2117.field3470 = null;
            }
        } catch (IOException var3) {
            class191.field3338 = null;
            class79.field1297 = null;
            class50.field831 = null;
            class227.field3914 = null;
        }
        if (!arg0) {
            if (class128.field2232 != 0) {
                class226.field3894 = true;
            }
            class178.field3100 = class74.field1214;
        }
    }
}
