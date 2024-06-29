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
public class client extends class64 {

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lmh;")
    public static class128 field4149 = class22.method156(122, "http:)4)4");

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4158 = 0;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lmh;")
    public static class128 field4151 = class22.method156(126, "<col=ff0000>");

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lmh;")
    public static class128 field4167 = class22.method156(124, "<img=1>");

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lcj;")
    public static class305 field4159;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lem;)Z", line = 12)
    public static final boolean method1646(class10 arg0) {
        if (class3.field57) {
            if (method1657(arg0) != 0) {
                return false;
            }
            if (arg0.field288 == 0) {
                return false;
            }
        }
        return arg0.field292;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 81)
    private final void method1647(boolean arg0) {
        field4155++;
        if (class56.field1078.field1894 >= 4) {
            this.method432("js5crc", -86);
            class105.field1799 = 1000;
        } else if (arg0) {
            if (class56.field1078.field1893 >= 4) {
                if (class105.field1799 == 0 || class105.field1799 == 5) {
                    this.method432("js5io", -123);
                    class105.field1799 = 1000;
                    return;
                }
                class166.field2850 = 3000;
                class56.field1078.field1893 = 3;
            }
            if ((class166.field2850--) <= 0) {
                try {
                    if (class303.field5147 == 0) {
                        class293.field5014 = class288.field4925.method1902(127, class241.field4137, class53.field1028);
                        class303.field5147++;
                    }
                    if (class303.field5147 == 1) {
                        if (class293.field5014.field560 == 2) {
                            this.method1654(-10593, -1);
                            return;
                        }
                        if (class293.field5014.field560 == 1) {
                            class303.field5147++;
                        }
                    }
                    if (class303.field5147 == 2) {
                        class74.field1398 = new class180((Socket) class293.field5014.field562, class288.field4925);
                        class194 var2 = new class194(5);
                        var2.method1352(7528, 15);
                        var2.method1337(-65, 516);
                        class74.field1398.method1228(var2.field3417, 0, false, 5);
                        class303.field5147++;
                        class182.field3183 = class71.method470(true);
                    }
                    if (class303.field5147 == 3) {
                        if (class105.field1799 == 0 || class105.field1799 == 5 || class74.field1398.method1230((byte) 11) > 0) {
                            int var3 = class74.field1398.method1231(-1);
                            if (var3 != 0) {
                                this.method1654(-10593, var3);
                                return;
                            }
                            class303.field5147++;
                        } else if (class71.method470(true) - class182.field3183 > 30000L) {
                            this.method1654(-10593, -2);
                            return;
                        }
                    }
                    if (class303.field5147 == 4) {
                        boolean var4 = class105.field1799 == 5 || class105.field1799 == 10 || class105.field1799 == 28;
                        class56.field1078.method673(!var4, class74.field1398, 0);
                        class74.field1398 = null;
                        class72.field1345 = 0;
                        class303.field5147 = 0;
                        class293.field5014 = null;
                    }
                } catch (IOException var6) {
                    this.method1654(-10593, -3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I", line = 203)
    public static final int method1648(int arg0, int arg1, int arg2) {
        field4153++;
        if (arg2 > -38) {
            method1652((byte) 30);
        }
        class245 var3 = (class245) class151.field2591.method728(false, (long) arg1);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field4185.length) {
            return var3.field4185[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 229)
    public final void init() {
        field4157++;
        if (!this.method425(-106)) {
            return;
        }
        class222.field3899 = Integer.parseInt(this.getParameter("worldid"));
        class236.field4057 = Integer.parseInt(this.getParameter("modewhere"));
        if (class236.field4057 < 0 || class236.field4057 > 1) {
            class236.field4057 = 0;
        }
        class206.field3627 = Integer.parseInt(this.getParameter("modewhat"));
        if (class206.field3627 < 0 || class206.field3627 > 2) {
            class206.field3627 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class268.field4645 = true;
        } else {
            class268.field4645 = false;
        }
        try {
            class77.field1417 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class77.field1417 = 0;
        }
        class307.method2096(class77.field1417, (byte) 43);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class266.field4606 = true;
        } else {
            class266.field4606 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class289.field4949 = true;
        } else {
            class289.field4949 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class98.field1701 = 1;
        } else {
            class98.field1701 = 0;
        }
        try {
            class36.field743 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class36.field743 = 0;
        }
        class221.field3890 = class134.field2333.method866((byte) -108, this);
        if (class221.field3890 == null) {
            class221.field3890 = class273.field4733;
        }
        String var7 = this.getParameter("haveie6");
        if (var7 != null && var7.equals("1")) {
            class156.field2688 = true;
        } else {
            class156.field2688 = false;
        }
        class139.field2385 = this;
        this.method439(765, 516, 503, (byte) -97, class206.field3627 + 32);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 300)
    public final void method435(int arg0) {
        field4152++;
        if (class105.field1799 == 1000) {
            return;
        }
        class293.field5011++;
        if (class293.field5011 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class225.field3938 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class265.field4602.setSeed((long) class225.field3938);
        }
        this.method1653(24738);
        if (class98.field1697 != null) {
            class98.field1697.method288((byte) 11);
        }
        class22.method153(1);
        class218.method1503(false);
        class117.method704(0);
        class161.method1062(0);
        if (class247.field4247) {
            class274.method1925();
        }
        if (class284.field4875 != null) {
            int var3 = class284.field4875.method161(arg0 - 13214);
            class235.field4041 = var3;
        }
        if (class105.field1799 == 0) {
            this.method1649((byte) 77);
            class265.method1855(32);
        } else if (class105.field1799 == 5) {
            this.method1649((byte) 77);
            class265.method1855(arg0 ^ 0x2A);
        } else if (class105.field1799 == 25 || class105.field1799 == 28) {
            class229.method1573(arg0 - 4);
        }
        if (class105.field1799 == arg0) {
            this.method1658(0);
            class52.method355(1);
            class50.method337(114);
            class12.method92(false);
        } else if (class105.field1799 == 30) {
            class180.method1233(24079);
        } else if (class105.field1799 == 40) {
            class12.method92(false);
            if (class77.field1413 != -3) {
                if (class77.field1413 == 15) {
                    class93.method585((byte) -77);
                } else if (class77.field1413 != 2) {
                    class192.method1288((byte) 86, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 392)
    public final void method423(byte arg0) {
        if (class247.field4247) {
            class247.method1709();
        }
        if (class114.field1924 != null) {
            class77.method498(class288.field4925, 100, class114.field1924);
            class114.field1924 = null;
        }
        field4162++;
        if (class288.field4925 != null) {
            class288.field4925.method1903(27068, this.getClass());
        }
        if (class234.field4030 != null) {
            class234.field4030.field4082 = false;
        }
        class234.field4030 = null;
        if (class121.field2041 != null) {
            class121.field2041.method1229(false);
            class121.field2041 = null;
        }
        class281.method1962((byte) 48, class203.field3589);
        class196.method1365(class203.field3589, (byte) -94);
        if (class284.field4875 != null) {
            class284.field4875.method159((byte) -120, class203.field3589);
        }
        class137.method898(206);
        class74.method487(2047);
        class284.field4875 = null;
        if (class257.field4412 != null) {
            class257.field4412.method1675(arg0 - 228);
        }
        if (class310.field5264 != null) {
            class310.field5264.method1675(-117);
        }
        class56.field1078.method675(arg0 - 80);
        class190.field3304.method1045(true);
        try {
            if (class313.field5280 != null) {
                class313.field5280.method349(-114);
            }
            if (class134.field2328 != null) {
                for (int var2 = 0; var2 < class134.field2328.length; var2++) {
                    if (class134.field2328[var2] != null) {
                        class134.field2328[var2].method349(44);
                    }
                }
            }
            if (class309.field5250 != null) {
                class309.field5250.method349(61);
            }
            if (arg0 != 101) {
                field4167 = (class128) null;
            }
            if (class310.field5257 != null) {
                class310.field5257.method349(-123);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 476)
    private final void method1649(byte arg0) {
        if (!class45.field908) {
            label229: while (true) {
                do {
                    if (!class86.method544(0)) {
                        break label229;
                    }
                } while (class74.field1397 != 115 && class74.field1397 != 83);
                class45.field908 = true;
            }
        }
        field4164++;
        if (class225.field3920 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class71.method470(true);
            if (class90.field1537 == 0L) {
                class90.field1537 = var4;
            }
            if (var3 > 16384 && (var4 - class90.field1537) < 5000L) {
                if ((var4 - class212.field3760) > 1000L) {
                    System.gc();
                    class212.field3760 = var4;
                }
                class10.field318 = 5;
                class205.field3620 = class128.field2218;
            } else {
                class10.field318 = 5;
                class205.field3620 = class196.field3439;
                class225.field3920 = 10;
            }
        } else if (class225.field3920 == 10) {
            class46.method321(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class180.field3158[var6] = new class249(104, 104);
            }
            class205.field3620 = class177.field3114;
            class10.field318 = 10;
            class225.field3920 = 30;
        } else if (class225.field3920 == 30) {
            if (class98.field1697 == null) {
                class98.field1697 = new class42(class56.field1078, class190.field3304);
            }
            if (class98.field1697.method294((byte) 93)) {
                class234.field4035 = class133.method884(true, -23702, true, false, 0);
                class248.field4267 = class133.method884(true, -23702, true, false, 1);
                class130.field2278 = class133.method884(true, -23702, false, true, 2);
                class129.field2252 = class133.method884(true, -23702, true, false, 3);
                class143.field2439 = class133.method884(true, -23702, true, false, 4);
                class288.field4924 = class133.method884(true, arg0 - 23779, true, true, 5);
                class162.field2765 = class133.method884(false, -23702, true, true, 6);
                class147.field2539 = class133.method884(true, -23702, true, false, 7);
                class4.field74 = class133.method884(true, -23702, true, false, 8);
                class211.field3734 = class133.method884(true, -23702, true, false, 9);
                class108.field1829 = class133.method884(true, -23702, true, false, 10);
                class104.field1781 = class133.method884(true, arg0 ^ 0xFFFFA327, true, false, 11);
                class311.field5266 = class133.method884(true, -23702, true, false, 12);
                class107.field1822 = class133.method884(true, -23702, true, false, 13);
                class259.field4481 = class133.method884(false, -23702, true, false, 14);
                class96.field1611 = class133.method884(true, arg0 ^ 0xFFFFA327, true, false, 15);
                class262.field4551 = class133.method884(true, -23702, true, false, 16);
                class294.field5037 = class133.method884(true, arg0 - 23779, true, false, 17);
                class167.field2881 = class133.method884(true, -23702, true, false, 18);
                class173.field3062 = class133.method884(true, arg0 ^ 0xFFFFA327, true, false, 19);
                class155.field2675 = class133.method884(true, -23702, true, false, 20);
                class77.field1416 = class133.method884(true, -23702, true, false, 21);
                class206.field3628 = class133.method884(true, arg0 ^ 0xFFFFA327, true, false, 22);
                class188.field3258 = class133.method884(true, -23702, true, true, 23);
                class38.field770 = class133.method884(true, -23702, true, false, 24);
                class86.field1505 = class133.method884(true, -23702, true, false, 25);
                class257.field4432 = class133.method884(true, -23702, true, true, 26);
                class205.field3620 = class301.field5119;
                class10.field318 = 15;
                class225.field3920 = 40;
            } else {
                class10.field318 = 12;
                class205.field3620 = class125.field2104;
            }
        } else if (class225.field3920 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class190.field3306[var8].method55((byte) 90) * class204.field3607[var8] / 100;
            }
            if (var7 == 100) {
                class10.field318 = 20;
                class205.field3620 = class255.field4393;
                class54.method369(class4.field74, -1114036085);
                class239.method1628(-127, class4.field74);
                class194.method1300(arg0 + 29274603, class4.field74);
                class225.field3920 = 45;
            } else {
                if (var7 != 0) {
                    class205.field3620 = class28.method177((byte) -75, new class128[] { class32.field709, class257.method1811(var7, (byte) 1), class267.field4628 });
                }
                class10.field318 = 20;
            }
        } else if (class225.field3920 == 45) {
            class309.method2104(22050, class31.field689, 2, 5304);
            class313.field5289 = new class173();
            class313.field5289.method1182(9, 128, (byte) 14);
            class257.field4412 = class190.method1274(class288.field4925, 0, 22050, (byte) 110, class203.field3589);
            class257.field4412.method1679(class313.field5289, true);
            class97.method612(class143.field2439, (byte) -58, class313.field5289, class96.field1611, class259.field4481);
            class310.field5264 = class190.method1274(class288.field4925, 1, 2048, (byte) 65, class203.field3589);
            class188.field3260 = new class59();
            class310.field5264.method1679(class188.field3260, true);
            class15.field407 = new class191(22050, class10.field356);
            class162.field2767 = class162.field2765.method2142(1, class301.field5115);
            class225.field3920 = 50;
            class205.field3620 = class62.field1189;
            class10.field318 = 30;
        } else if (class225.field3920 == 50) {
            int var9 = class121.method739(class4.field74, arg0 + 41, class107.field1822);
            int var10 = class103.method636((byte) -65);
            if (var10 > var9) {
                class205.field3620 = class28.method177((byte) -66, new class128[] { class31.field695, class257.method1811(var9 * 100 / var10, (byte) -118), class267.field4628 });
                class10.field318 = 35;
            } else {
                class225.field3920 = 60;
                class205.field3620 = class132.field2291;
                class10.field318 = 35;
            }
        } else if (class225.field3920 == 60) {
            int var26 = class115.method694((byte) -95, class4.field74);
            int var27 = class69.method466(-123);
            if (var27 > var26) {
                class205.field3620 = class28.method177((byte) -82, new class128[] { class205.field3615, class257.method1811(var26 * 100 / var27, (byte) -120), class267.field4628 });
                class10.field318 = 40;
            } else {
                class205.field3620 = class194.field3419;
                class225.field3920 = 65;
                class10.field318 = 40;
            }
        } else if (class225.field3920 == 65) {
            class145.method976((byte) 66, class4.field74, class107.field1822);
            class205.field3620 = class218.field3842;
            class10.field318 = 45;
            class298.method2039((byte) -52, 5);
            class225.field3920 = 70;
        } else if (class225.field3920 == 70) {
            class130.field2278.method2168(5);
            byte var15 = 0;
            int var16 = var15 + class130.field2278.method2144((byte) -54);
            class262.field4551.method2168(5);
            int var17 = var16 + class262.field4551.method2144((byte) -54);
            class294.field5037.method2168(arg0 ^ 0x48);
            int var18 = var17 + class294.field5037.method2144((byte) -54);
            class167.field2881.method2168(arg0 ^ 0x48);
            int var19 = var18 + class167.field2881.method2144((byte) -54);
            class173.field3062.method2168(5);
            int var20 = var19 + class173.field3062.method2144((byte) -54);
            class155.field2675.method2168(5);
            int var21 = var20 + class155.field2675.method2144((byte) -54);
            class77.field1416.method2168(5);
            int var22 = var21 + class77.field1416.method2144((byte) -54);
            class206.field3628.method2168(5);
            int var23 = var22 + class206.field3628.method2144((byte) -54);
            class38.field770.method2168(5);
            int var24 = var23 + class38.field770.method2144((byte) -54);
            class86.field1505.method2168(5);
            int var25 = var24 + class86.field1505.method2144((byte) -54);
            if (var25 < 1000) {
                class205.field3620 = class28.method177((byte) -124, new class128[] { class72.field1324, class257.method1811(var25 / 10, (byte) 32), class267.field4628 });
                class10.field318 = 50;
            } else {
                class182.method1241(class130.field2278, 0);
                class306.method2095(class130.field2278, 4);
                class248.method1720(class130.field2278, 32);
                class252.method1792(19216, class130.field2278, class147.field2539);
                class32.method232(127, class262.field4551, class147.field2539, true);
                class61.method404(class147.field2539, class167.field2881, 15828);
                class271.method1905(-4537, class173.field3062, class234.field4036, class147.field2539, true);
                class261.method1837(113, class130.field2278);
                class79.method510(class155.field2675, class234.field4035, (byte) -1, class248.field4267);
                class33.method236(class77.field1416, class147.field2539, false);
                class82.method523((byte) 21, class206.field3628);
                class238.method1625(class130.field2278, (byte) -123);
                class81.method517(class147.field2539, (byte) 104, class129.field2252, class107.field1822, class4.field74);
                class175.method1208(class130.field2278, (byte) 110);
                class217.method1496((byte) -110, class294.field5037);
                class33.method235(class38.field770, false, new class162(), class86.field1505);
                class262.method1843(true, class38.field770, class86.field1505);
                class10.field318 = 50;
                class205.field3620 = class130.field2275;
                class1.method2(arg0 ^ 0x54F8);
                class225.field3920 = 80;
            }
        } else if (class225.field3920 == 80) {
            int var13 = class148.method995(1799, class4.field74);
            int var14 = class61.method402(6);
            if (var14 > var13) {
                class205.field3620 = class28.method177((byte) -116, new class128[] { class256.field4400, class257.method1811(var13 * 100 / var14, (byte) -122), class267.field4628 });
                class10.field318 = 60;
            } else {
                class232.method1596(18284, class4.field74);
                class205.field3620 = class53.field1027;
                class10.field318 = 60;
                class225.field3920 = 90;
            }
        } else if (class225.field3920 == 90) {
            if (class257.field4432.method2168(5)) {
                class163 var12 = new class163(class211.field3734, class257.field4432, class4.field74, 20, !class1.field12);
                class141.method925(var12);
                if (class254.field4378 == 1) {
                    class141.method946(0.9F);
                }
                if (class254.field4378 == 2) {
                    class141.method946(0.8F);
                }
                if (class254.field4378 == 3) {
                    class141.method946(0.7F);
                }
                if (class254.field4378 == 4) {
                    class141.method946(0.6F);
                }
                class10.field318 = 70;
                class205.field3620 = class64.field1219;
                class225.field3920 = 100;
            } else {
                class205.field3620 = class28.method177((byte) -122, new class128[] { class34.field734, class257.method1811(class257.field4432.method2144((byte) -54), (byte) -127), class267.field4628 });
                class10.field318 = 70;
            }
        } else if (class225.field3920 == 100) {
            if (class137.method897(class4.field74, 0)) {
                class225.field3920 = 110;
            }
        } else if (class225.field3920 == 110) {
            class234.field4030 = new class239();
            class288.field4925.method1904((byte) -116, 10, class234.field4030);
            class10.field318 = 75;
            class225.field3920 = 120;
            class205.field3620 = class5.field87;
        } else if (class225.field3920 == 120) {
            if (class108.field1829.method2166(class229.field3995, arg0 - 181, class273.field4733)) {
                class91 var11 = new class91(class108.field1829.method2147(class273.field4733, (byte) 104, class229.field3995));
                class156.method1035((byte) -126, var11);
                class205.field3620 = class169.field2951;
                class225.field3920 = 130;
                class10.field318 = 80;
            } else {
                class205.field3620 = class28.method177((byte) -58, new class128[] { class264.field4578, class271.field4708 });
                class10.field318 = 80;
            }
        } else if (class225.field3920 == 130) {
            if (!class129.field2252.method2168(arg0 ^ 0x48)) {
                class205.field3620 = class28.method177((byte) -62, new class128[] { class166.field2846, class257.method1811(class129.field2252.method2144((byte) -54) * 3 / 4, (byte) -123), class267.field4628 });
                class10.field318 = 85;
            } else if (!class311.field5266.method2168(5)) {
                class205.field3620 = class28.method177((byte) -84, new class128[] { class166.field2846, class257.method1811(class311.field5266.method2144((byte) -54) / 10 + 75, (byte) -124), class267.field4628 });
                class10.field318 = 85;
            } else if (!class107.field1822.method2168(5)) {
                class205.field3620 = class28.method177((byte) -67, new class128[] { class166.field2846, class257.method1811(class107.field1822.method2144((byte) -54) / 20 + 85, (byte) 107), class267.field4628 });
                class10.field318 = 85;
            } else if (class188.field3258.method2159(class97.field1643, (byte) -81)) {
                class12.method93(false, class298.field5077, class283.field4869, class288.field4921, class188.field3258, class96.field1610, class61.field1159);
                class225.field3920 = 135;
                class10.field318 = 95;
                class205.field3620 = class283.field4867;
            } else {
                class205.field3620 = class28.method177((byte) -84, new class128[] { class166.field2846, class257.method1811(class188.field3258.method2143(-70, class97.field1643) / 10 + 90, (byte) -121), class267.field4628 });
                class10.field318 = 85;
            }
        } else if (class225.field3920 == 135) {
            if (class235.method1613(116)) {
                class10.field318 = 96;
                class205.field3620 = class62.field1179;
                class225.field3920 = 140;
            } else {
                class10.field318 = 95;
                class205.field3620 = class81.field1461;
            }
        } else if (class225.field3920 == 140) {
            class31.field683 = class129.field2252.method2142(1, class123.field2075);
            class288.field4924.method2170(true, arg0 ^ 0x4D, false);
            class162.field2765.method2170(true, 0, true);
            class4.field74.method2170(true, arg0 ^ 0x4D, true);
            class107.field1822.method2170(true, arg0 - 77, true);
            class108.field1829.method2170(true, arg0 ^ 0x4D, true);
            class129.field2252.method2170(true, 0, true);
            class225.field3920 = 150;
            class205.field3620 = class9.field206;
            class259.field4480 = true;
            class10.field318 = 97;
        } else if (class225.field3920 == 150) {
            class179.method1222();
            if (class45.field908) {
                class165.field2836 = 0;
            }
            class45.field908 = true;
            class187.method1255(class288.field4925, true);
            class217.method1502(class165.field2836, (byte) 69, -1, false, -1);
            class10.field318 = 100;
            class225.field3920 = 160;
            class205.field3620 = class248.field4270;
        } else if (arg0 == 77 && class225.field3920 == 160) {
            class192.method1288((byte) 86, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lem;)Lem;", line = 949)
    public static final class10 method1650(class10 arg0) {
        int var1 = class289.method1992(-22853, method1657(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class233.method1606(true, arg0.field267);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 973)
    public final void method438(byte arg0) {
        method1652((byte) -71);
        class128.method864(-18);
        class157.method1036(arg0 + 19);
        class241.method1637(0);
        class54.method364(-103);
        field4156++;
        class64.method433(arg0 - 66);
        class247.method1685();
        class50.method339(false);
        class165.method1084(124);
        class239.method1627((byte) 116);
        class199.method1380(arg0 ^ 0xFFFFFF94);
        class194.method1311(true);
        class180.method1234(-2);
        class112.method680((byte) 20);
        class158.method1042(arg0 ^ 0xFFFFFFA0);
        class42.method292(false);
        class7.method53(-23000);
        class314.method2139(arg0 ^ 0xFFFFFFF5);
        class51.method351(false);
        class177.method1216((byte) 86);
        class261.method1829(arg0 ^ 0xFFFFFFEA);
        class115.method693(-1);
        class90.method565((byte) -91);
        class249.method1728(-12806);
        class10.method76((byte) -119);
        class264.method1850(arg0 + 107);
        class123.method751(127);
        class296.method2032(-94);
        class120.method726(1);
        class309.method2109(false);
        class26.method166((byte) -4);
        class188.method1263(0);
        class55.method372(true);
        class173.method1184(5879);
        class246.method1674((byte) -126);
        class191.method1284(arg0 - 16711925);
        class6.method30(false);
        class1.method4(8508);
        class16.method119(false);
        class150.method1003((byte) 109);
        class236.method1619(true);
        class208.method1424((byte) -90);
        class88.method553((byte) -30);
        class287.method1981(false);
        class159.method1050(10628);
        class43.method300(arg0 ^ 0xFFFFFFF7);
        class302.method2053(1);
        class222.method1530(8624);
        class66.method447(true);
        class104.method642(true);
        class310.method2111(true);
        class171.method1145((byte) -126);
        class313.method2135((byte) 89);
        class218.method1506(-12926);
        class38.method250(true);
        class130.method877(true);
        class77.method497(0);
        class119.method718();
        class103.method633(-97);
        class168.method1104();
        class285.method1973(false);
        class126.method782();
        class200.method1389(-1);
        class29.method187();
        class189.method1271((byte) 0);
        class259.method1820((byte) -115);
        class71.method471(false);
        class134.method892(126);
        class72.method481(true);
        class274.method1926();
        class212.method1459(-117);
        class17.method132((byte) -90);
        class256.method1806(0);
        class152.method1015((byte) 4);
        class305.method2065();
        class252.method1793((byte) -120);
        class129.method871((byte) 52);
        class138.method909();
        class108.method662((byte) 107);
        class45.method306((byte) 94);
        class206.method1419(-257);
        class174.method1195();
        class46.method318();
        class97.method613(0);
        class306.method2091(arg0 ^ 0xFFFFFFF4);
        class303.method2061((byte) -83);
        class293.method2009((byte) -77);
        class254.method1797(-106);
        class213.method1465();
        class233.method1605(0);
        class164.method1081(63);
        class62.method414(arg0 - 6118);
        class220.method1523(0);
        class210.method1445(arg0 ^ 0x41);
        class201.method1399((byte) -122);
        class204.method1413((byte) -122);
        class225.method1551(22);
        class144.method960((byte) -125);
        class185.method1249((byte) -103);
        class153.method1020((byte) -79);
        class93.method584((byte) 22);
        class178.method1218(0);
        class133.method891(-88);
        class275.method1930(false);
        class4.method24(102);
        class234.method1609(-83);
        class196.method1372(109);
        class47.method329((byte) 114);
        class162.method1066(51);
        class81.method515((byte) -124);
        class163.method1075(1);
        class147.method991(-64);
        class291.method2003(arg0 - 99);
        class141.method930();
        class91.method575(-2);
        class299.method2042((byte) -105);
        class27.method174(-31717);
        class36.method245((byte) -10);
        class140.method921(arg0 ^ 0x8);
        class179.method1220();
        class32.method229(11244);
        class294.method2015(65536);
        class94.method589(true);
        class102.method629(-91);
        class226.method1556(2488);
        class182.method1239(true);
        class154.method1024();
        class5.method27(128);
        class96.method602(-28977);
        class65.method441(0);
        class161.method1065(false);
        class92.method578(7475);
        class289.method1991(1932219);
        class56.method376(false);
        class48.method335();
        class30.method222(21737);
        class118.method706(true);
        class253.method1796(5);
        class111.method670();
        class193.method1292(50);
        class312.method2130();
        class100.method625();
        class290.method1996(true);
        class9.method73((byte) 122);
        class215.method1488(0);
        class229.method1565((byte) 127);
        class245.method1665(15);
        class3.method20(0);
        class20.method146((byte) 93);
        class266.method1860(-31829);
        class198.method1377(4);
        class258.method1814();
        class205.method1416(arg0 + 32);
        class269.method1883();
        class301.method2052(125);
        class34.method244(125);
        class74.method489(arg0 ^ 0x3CF3);
        class98.method615((byte) 72);
        class242.method1645(arg0 + 17120);
        class155.method1030((byte) -65);
        class203.method1412(false);
        class271.method1907(128);
        class28.method179(true);
        class151.method1005(arg0 + 26);
        class57.method380((byte) -109);
        class292.method2005((byte) -103);
        class109.method664(64);
        class121.method737((byte) -112);
        class175.method1209((byte) -32);
        class267.method1865((byte) -114);
        class257.method1808(4);
        class250.method1748(0);
        class143.method953((byte) 93);
        class183.method1245(arg0 + 12);
        class110.method668(true);
        class124.method761();
        class61.method405(arg0 ^ 0xFFFFFEF5);
        class223.method1537(-7);
        class284.method1967(-1);
        class176.method1210(arg0 - 11);
        class125.method768((byte) 118);
        class116.method697((byte) -88);
        class172.method1151();
        class300.method2047();
        class73.method483();
        class311.method2114(-102);
        class106.method654((byte) 18);
        class235.method1611(0);
        class58.method385(-93);
        class18.method143();
        class95.method598();
        class279.method1952((byte) 127);
        class33.method237(261163);
        class170.method1136(arg0 ^ 0xFFFFCE8A);
        class265.method1853(arg0 ^ 0xFFFFFF8D);
        class167.method1095(arg0 + 61);
        class262.method1839(arg0 ^ 0xA);
        class181.method1236((byte) 126);
        class190.method1273(true);
        class145.method978(8);
        class217.method1495(120);
        class232.method1597(true);
        class221.method1528(arg0 ^ 0x74);
        class132.method881((byte) 75);
        class297.method2033((byte) -31);
        class207.method1423(-30);
        class272.method1912();
        class286.method1976();
        class263.method1845((byte) -86);
        class255.method1802(50);
        class31.method225((byte) -47);
        class53.method363((byte) -73);
        class288.method1984((byte) 107);
        class260.method1822(1142782988);
        if (arg0 != -11) {
            this.method431((byte) -110);
        }
        class117.method700(arg0 ^ 0xFFFFFFB6);
        class8.method68((byte) 112);
        class142.method948(arg0 - 46);
        class69.method459(-2431);
        class107.method659(arg0 + 86);
        class148.method994(false);
        class192.method1286(arg0 ^ 0xFFFFFFB5);
        class278.method1942(-784978420);
        class146.method982(-128);
        class11.method86(0);
        class139.method917((byte) -124);
        class156.method1033(arg0 ^ 0xFFFFFFF4);
        class169.method1132(-26);
        class307.method2098((byte) -128);
        class63.method418(-21312);
        class39.method268(383);
        class15.method116((byte) -10);
        class298.method2041(-116);
        class86.method545((byte) 49);
        class295.method2019(-117);
        class268.method1867((byte) -50);
        class166.method1086(1);
        class84.method539(true);
        class216.method1493((byte) 75);
        class276.method1937((byte) 2);
        class187.method1256(true);
        class248.method1721((byte) 82);
        class211.method1454(-124);
        class273.method1918(0);
        class70.method467((byte) 87);
        class219.method1512(-77);
        class114.method689(arg0 + 4107);
        class113.method685(3);
        class75.method494((byte) 40);
        class283.method1965(32);
        class315.method2176(arg0 - 17169);
        class52.method357(72);
        class89.method555(-9615);
        class238.method1624(arg0 ^ 0xFFFFFFF5);
        class37.method247(0);
        class228.method1562(arg0 ^ 0x44D34565);
        class214.method1484(-85);
        class308.method2099(0);
        class195.method1358(124);
        class79.method507((byte) -21);
        class137.method899(0);
        class240.method1631(9936);
        class99.method622((byte) -119);
        class22.method157((byte) -67);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I", line = 1246)
    public static final int method1651(int arg0, int arg1) {
        if (arg1 == -29987) {
            field4150++;
            return arg0 & 0xFF;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 1260)
    public static void method1652(byte arg0) {
        field4167 = null;
        field4159 = null;
        field4149 = null;
        field4151 = null;
        if (arg0 != -71) {
            field4151 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1295)
    private final void method1653(int arg0) {
        field4168++;
        if (arg0 != 24738) {
            field4158 = -55;
        }
        boolean var2 = class56.field1078.method677(2216);
        if (!var2) {
            this.method1647(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 1320)
    private final void method1654(int arg0, int arg1) {
        class72.field1345++;
        class293.field5014 = null;
        field4169++;
        class303.field5147 = 0;
        class74.field1398 = null;
        if (arg0 != -10593) {
            method1651(-31, 47);
        }
        if (class53.field1028 == class303.field5127) {
            class53.field1028 = class203.field3592;
        } else {
            class53.field1028 = class303.field5127;
        }
        if (class72.field1345 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class105.field1799 == 0 || class105.field1799 == 5) {
                this.method432("js5connect_full", arg0 + 10497);
                class105.field1799 = 1000;
            } else {
                class166.field2850 = 3000;
            }
        } else if (class72.field1345 >= 2 && arg1 == 6) {
            this.method432("js5connect_outofdate", -88);
            class105.field1799 = 1000;
        } else if (class72.field1345 >= 4) {
            if (class105.field1799 == 0 || class105.field1799 == 5) {
                this.method432("js5connect", -94);
                class105.field1799 = 1000;
            } else {
                class166.field2850 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1376)
    public final void method431(byte arg0) {
        field4160++;
        if (class105.field1799 == 1000) {
            return;
        }
        if (arg0 >= -7) {
            method1659((class10[]) null, 71, -83, 0, -71, -118, 14, -63);
        }
        boolean var2 = class32.method231(0);
        if (var2 && class64.field1205 && class257.field4412 != null) {
            class257.field4412.method1672(2000);
        }
        if ((class105.field1799 == 30 || class105.field1799 == 10) && (class167.field2872 || class245.field4181 != 0L && class245.field4181 < class71.method470(true))) {
            class217.method1502(class166.method1089(2), (byte) 52, class221.field3885, class167.field2872, class206.field3629);
        }
        if (class114.field1924 == null) {
            Container var3;
            if (class114.field1924 != null) {
                var3 = class114.field1924;
            } else if (class200.field3483 == null) {
                var3 = class288.field4925.field4677;
            } else {
                var3 = class200.field3483;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class200.field3483 == var3) {
                Insets var6 = class200.field3483.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class196.field3431 != var4 || class57.field1090 != var5) {
                if (class270.field4678.startsWith("mac")) {
                    class57.field1090 = var5;
                    class196.field3431 = var4;
                } else {
                    class218.method1504(0);
                }
                class245.field4181 = class71.method470(true) + 500L;
            }
        }
        if (class114.field1924 != null && !class157.field2695 && (class105.field1799 == 30 || class105.field1799 == 10)) {
            class217.method1502(class165.field2836, (byte) 59, -1, false, -1);
        }
        boolean var7 = false;
        if (class284.field4886) {
            var7 = true;
            class284.field4886 = false;
        }
        if (var7) {
            class259.method1818(0);
        }
        if (class247.field4247) {
            for (int var8 = 0; var8 < 100; var8++) {
                class26.field581[var8] = true;
            }
        }
        if (class105.field1799 == 0) {
            class169.method1130((Color) null, class10.field318, (byte) 77, var7, class205.field3620);
        } else if (class105.field1799 == 5) {
            class34.method243((byte) -17, false, field4159);
        } else if (class105.field1799 == 10) {
            class257.method1812(-104);
        } else if (class105.field1799 == 25 || class105.field1799 == 28) {
            if (class130.field2272 == 1) {
                if (class216.field3798 < class97.field1670) {
                    class216.field3798 = class97.field1670;
                }
                int var10 = (class216.field3798 - class97.field1670) * 50 / class216.field3798;
                class309.method2107(class28.method177((byte) -98, new class128[] { class32.field706, class75.field1403, class257.method1811(var10, (byte) 68), class292.field5003 }), false, -23465);
            } else if (class130.field2272 == 2) {
                if (class121.field2046 > class314.field5312) {
                    class314.field5312 = class121.field2046;
                }
                int var9 = (class314.field5312 - class121.field2046) * 50 / class314.field5312 + 50;
                class309.method2107(class28.method177((byte) -123, new class128[] { class32.field706, class75.field1403, class257.method1811(var9, (byte) -126), class292.field5003 }), false, -23465);
            } else {
                class309.method2107(class32.field706, false, -23465);
            }
        } else if (class105.field1799 == 30) {
            class159.method1056(-137);
        } else if (class105.field1799 == 40) {
            class309.method2107(class28.method177((byte) -56, new class128[] { class188.field3267, class97.field1680, class178.field3134 }), false, -23465);
        }
        if (class247.field4247 && class105.field1799 != 0) {
            class247.method1684();
            for (int var17 = 0; var17 < class257.field4424; var17++) {
                class199.field3468[var17] = false;
            }
        } else if ((class105.field1799 == 30 || class105.field1799 == 10) && class226.field3954 == 0 && !var7) {
            try {
                Graphics var11 = class203.field3589.getGraphics();
                for (int var12 = 0; var12 < class257.field4424; var12++) {
                    if (class199.field3468[var12]) {
                        class4.field76.method149(class275.field4762[var12], class313.field5281[var12], class120.field2037[var12], class32.field711[var12], 1, var11);
                        class199.field3468[var12] = false;
                    }
                }
            } catch (Exception var19) {
                class203.field3589.repaint();
            }
        } else if (class105.field1799 != 0) {
            try {
                Graphics var14 = class203.field3589.getGraphics();
                class4.field76.method148(0, 128, 0, var14);
                for (int var15 = 0; var15 < class257.field4424; var15++) {
                    class199.field3468[var15] = false;
                }
            } catch (Exception var18) {
                class203.field3589.repaint();
            }
        }
        if (class259.field4480) {
            class52.method358(107);
        }
        if (class45.field908 && class105.field1799 == 10 && class196.field3433 != -1) {
            class45.field908 = false;
            class187.method1255(class288.field4925, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 1603)
    public static final void method1655(byte arg0) {
        int var1 = 66 / ((arg0 + 68) / 52);
        field4165++;
        class222.field3897.method1832((byte) 44);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([SB)[S", line = 1613)
    public static final short[] method1656(short[] arg0, byte arg1) {
        field4166++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class224.method1544(arg0, 0, var2, 0, arg0.length);
            return arg1 == 118 ? var2 : (short[]) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1637)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class129.method873("argument count", 64);
            }
            int var1 = -1;
            class222.field3899 = Integer.parseInt(arg0[0]);
            class236.field4057 = 2;
            if (arg0[1].equals("live")) {
                class206.field3627 = 0;
            } else if (arg0[1].equals("rc")) {
                class206.field3627 = 1;
            } else if (arg0[1].equals("wip")) {
                class206.field3627 = 2;
            } else {
                class129.method873("modewhat", 64);
            }
            class268.field4645 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class7.method57(class220.method1520(var2.length, (byte) 86, 0, var2), (byte) -97);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class77.field1417 = var1;
            } else if (arg0[2].equals("english")) {
                class77.field1417 = 0;
            } else if (arg0[2].equals("german")) {
                class77.field1417 = 1;
            } else {
                class129.method873("language", 64);
            }
            class307.method2096(class77.field1417, (byte) 43);
            class266.field4606 = false;
            class289.field4949 = false;
            if (arg0[3].equals("game0")) {
                class98.field1701 = 0;
            } else if (arg0[3].equals("game1")) {
                class98.field1701 = 1;
            } else {
                class129.method873("game", 64);
            }
            class221.field3890 = class273.field4733;
            class156.field2688 = false;
            class36.field743 = 0;
            client var4 = new client();
            class139.field2385 = var4;
            var4.method436(27, 516, "runescape", class206.field3627 + 32, 768, (byte) 88, 1024);
            class200.field3483.setLocation(40, 40);
        } catch (Exception var7) {
            class79.method506((byte) -51, (String) null, var7);
        }
        field4161++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lem;)I", line = 1709)
    public static final int method1657(class10 arg0) {
        class155 var1 = (class155) class129.field2257.method728(false, ((long) arg0.field230 << 32) + (long) arg0.field259);
        return var1 == null ? arg0.field250 : var1.field2672;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 1725)
    public final void method424(byte arg0) {
        field4154++;
        class218.method1504(0);
        class190.field3304 = new class158();
        class56.field1078 = new class112();
        if (class206.field3627 == 0) {
        }
        class142.method947(class288.field4925, -17667);
        if (class236.field4057 == 0) {
            class163.field2801 = this.getCodeBase().getHost();
            class236.field4059 = 443;
            class182.field3195 = 43594;
        } else if (class236.field4057 == 1) {
            class163.field2801 = this.getCodeBase().getHost();
            class182.field3195 = class222.field3899 + 40000;
            class236.field4059 = class222.field3899 + 50000;
        } else if (class236.field4057 == 2) {
            class236.field4059 = class222.field3899 + 50000;
            class182.field3195 = class222.field3899 + 40000;
            class163.field2801 = "127.0.0.1";
        }
        class203.field3592 = class236.field4059;
        class17.field485 = class182.field3195;
        if (class270.field4676 == 3 && class236.field4057 != 2) {
            class105.field1793 = class222.field3899;
        }
        if (arg0 >= -77) {
            this.method438((byte) 88);
        }
        class53.field1028 = class17.field485;
        class303.field5127 = class182.field3195;
        class241.field4137 = class163.field2801;
        class298.field5083 = class151.field2602 = class109.field1854 = class183.field3201 = new short[256];
        if (class98.field1701 == 1) {
            class119.field2004 = 16777215;
            class119.field2015 = 0;
            class279.field4822 = class134.field2336;
            class254.field4383 = class216.field3806;
            class183.field3207 = class137.field2350;
            class151.field2603 = class92.field1570;
        } else {
            class183.field3207 = class279.field4815;
            class254.field4383 = class191.field3310;
            class151.field2603 = class276.field4785;
            class279.field4822 = class265.field4599;
        }
        class94.method587(false);
        class296.method2021(class203.field3589, 1211754408);
        class39.method266(class203.field3589, 23963);
        class284.field4875 = class9.method70(-121);
        if (class284.field4875 != null) {
            class284.field4875.method160(123, class203.field3589);
        }
        class94.field1594 = class270.field4676;
        try {
            if (class288.field4925.field4675 != null) {
                class313.field5280 = new class51(class288.field4925.field4675, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class134.field2328[var2] = new class51(class288.field4925.field4683[var2], 6000, 0);
                }
                class309.field5250 = new class51(class288.field4925.field4673, 6000, 0);
                class181.field3175 = new class177(255, class313.field5280, class309.field5250, 500000);
                class310.field5257 = new class51(class288.field4925.field4684, 24, 0);
                class288.field4925.field4675 = null;
                class288.field4925.field4683 = null;
                class288.field4925.field4684 = null;
                class288.field4925.field4673 = null;
            }
        } catch (IOException var4) {
            class310.field5257 = null;
            class181.field3175 = null;
            class309.field5250 = null;
            class313.field5280 = null;
        }
        if (class236.field4057 != 0) {
            class208.field3669 = true;
        }
        class261.field4523 = class268.field4654;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1848)
    private final void method1658(int arg0) {
        for (class109.field1856 = 0; class86.method544(0) && class109.field1856 < 128; class109.field1856++) {
            class106.field1812[class109.field1856] = class309.field5245;
            class32.field710[class109.field1856] = class74.field1397;
        }
        field4163++;
        class50.field992++;
        if (~class196.field3433 != arg0) {
            class281.method1961(class196.field3433, class16.field420, 0, class199.field3465, 0, 0, 0, -1);
        }
        class104.field1788++;
        if (class247.field4247) {
            int var2 = 19137023;
            label189: for (int var3 = 0; var3 < 32768; var3++) {
                class115 var4 = class201.field3560[var3];
                if (var4 != null) {
                    byte var5 = var4.field1934.field3678;
                    if ((var5 & 0x2) > 0 && var4.field414 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field450[0] = (var4.field478 >> 7) + var6;
                            var4.field422[0] = (var4.field418 >> 7) + var7;
                            class180.field3158[class133.field2315].method1736(var4.field478 >> 7, false, 96, var4.method118(-1), var4.field418 >> 7, var4.method118(-1), 0);
                            if (var4.field450[0] >= 0 && var4.field450[0] <= (104 - var4.method118(-1)) && var4.field422[0] >= 0 && var4.field422[0] <= 104 - var4.method118(-1) && class180.field3158[class133.field2315].method1734(var4.field422[0], true, var4.field418 >> 7, var4.field478 >> 7, var4.field450[0])) {
                                if (var4.method118(-1) > 1) {
                                    for (int var8 = var4.field450[0]; var8 < (var4.field450[0] + var4.method118(-1)); var8++) {
                                        for (int var9 = var4.field422[0]; (var4.field422[0] + var4.method118(-1)) > var9; var9++) {
                                            if ((class180.field3158[class133.field2315].field4306[var8][var9] & var2) != 0) {
                                                continue label189;
                                            }
                                        }
                                    }
                                }
                                var4.field414 = 1;
                            }
                        }
                    }
                    class117.method703(0, var4);
                    class79.method505(var4, -59);
                    class105.method645(arg0, var4);
                    class180.field3158[class133.field2315].method1740(false, (byte) -51, var4.method118(-1), var4.method118(arg0 - 1), var4.field418 >> 7, var4.field478 >> 7);
                }
            }
        }
        if (!class247.field4247) {
            class236.method1615(1);
        } else if (class254.field4382 == 0 && class4.field75 == 0) {
            if (class1.field21 == 2) {
                class39.method269(0);
            } else {
                class118.method705(-95);
            }
            if (class142.field2436 >> 7 < 14 || class142.field2436 >> 7 >= 90 || (class143.field2445 >> 7) < 14 || (class143.field2445 >> 7) >= 90) {
                class218.method1509(94);
            }
        }
        while (true) {
            class102 var10;
            class10 var17;
            class10 var18;
            do {
                var10 = (class102) class50.field979.method2020((byte) -88);
                if (var10 == null) {
                    while (true) {
                        class102 var11;
                        class10 var15;
                        class10 var16;
                        do {
                            var11 = (class102) class109.field1849.method2020((byte) -62);
                            if (var11 == null) {
                                while (true) {
                                    class102 var12;
                                    class10 var13;
                                    class10 var14;
                                    do {
                                        var12 = (class102) class123.field2073.method2020((byte) -110);
                                        if (var12 == null) {
                                            if (class165.field2839 != null) {
                                                class265.method1857(-1);
                                            }
                                            if (class74.field1399 != null && class74.field1399.field560 == 1) {
                                                if (class74.field1399.field562 != null) {
                                                    class84.method532(class7.field167, class72.field1328, false);
                                                }
                                                class72.field1328 = false;
                                                class74.field1399 = null;
                                                class7.field167 = null;
                                            }
                                            return;
                                        }
                                        var13 = var12.field1738;
                                        if (var13.field259 < 0) {
                                            break;
                                        }
                                        var14 = class233.method1606(true, var13.field267);
                                    } while (var14 == null || var14.field348 == null || var14.field348.length <= var13.field259 || var14.field348[var13.field259] != var13);
                                    class249.method1739(var12, -71);
                                }
                            }
                            var15 = var11.field1738;
                            if (var15.field259 < 0) {
                                break;
                            }
                            var16 = class233.method1606(true, var15.field267);
                        } while (var16 == null || var16.field348 == null || var15.field259 >= var16.field348.length || var16.field348[var15.field259] != var15);
                        class249.method1739(var11, -71);
                    }
                }
                var17 = var10.field1738;
                if (var17.field259 < 0) {
                    break;
                }
                var18 = class233.method1606(true, var17.field267);
            } while (var18 == null || var18.field348 == null || var18.field348.length <= var17.field259 || var18.field348[var17.field259] != var17);
            class249.method1739(var10, -71);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lem;IIIIIII)V", line = 2080)
    public static final void method1659(class10[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class10 var9 = arg0[var8];
            if (var9 != null && var9.field267 == arg1 && (!var9.field294 || var9.field288 == 0 || var9.field329 || method1657(var9) != 0 || class4.field73 == var9 || var9.field222 == 1338) && (!var9.field294 || !method1646(var9))) {
                int var10 = var9.field253 + arg6;
                int var11 = var9.field309 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field288 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field260 + var10;
                    int var17 = var9.field226 + var11;
                    if (var9.field288 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class165.field2839 == var9) {
                    class15.field411 = true;
                    class98.field1710 = var10;
                    class183.field3210 = var11;
                }
                if (!var9.field294 || var12 < var14 && var13 < var15) {
                    if (var9.field288 == 0) {
                        if (!var9.field294 && method1646(var9) && class279.field4829 != var9) {
                            continue;
                        }
                        if (var9.field301 && class275.field4760 >= var12 && class77.field1411 >= var13 && class275.field4760 < var14 && class77.field1411 < var15) {
                            for (class102 var18 = (class102) class123.field2073.method2024(0); var18 != null; var18 = (class102) class123.field2073.method2027(1211754408)) {
                                if (var18.field1755) {
                                    var18.method1978((byte) -127);
                                }
                            }
                            if (class250.field4327 == 0) {
                                class165.field2839 = null;
                                class4.field73 = null;
                            }
                            class165.field2841 = false;
                            class257.field4418 = null;
                        }
                    }
                    if (var9.field294) {
                        boolean var19;
                        if (class275.field4760 >= var12 && class77.field1411 >= var13 && class275.field4760 < var14 && class77.field1411 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class239.field4081 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class103.field1767 == 1 && class45.field915 >= var12 && class241.field4129 >= var13 && class45.field915 < var14 && class241.field4129 < var15) {
                            var21 = true;
                        }
                        if (class109.field1856 > 0 && var9.field277 != null) {
                            for (int var22 = 0; var22 < var9.field277.length; var22++) {
                                for (int var23 = 0; var23 < class109.field1856; var23++) {
                                    int var24 = var9.field277[var22] & 0xFF;
                                    if (class106.field1812[var23] == var24) {
                                        if (var9.field243 != null) {
                                            byte var25 = var9.field243[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class257.field4426[86] || (var25 & 0x1) != 0 && !class257.field4426[82] || (var25 & 0x4) != 0 && !class257.field4426[81])) {
                                                continue;
                                            }
                                        }
                                        class309.method2106(class273.field4733, var9.field230, false, -1, var22 + 1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class102.method630(class241.field4129 - var11, class45.field915 - var10, var9, 1163);
                        }
                        if (class165.field2839 != null && class165.field2839 != var9 && var19 && class104.method643(method1657(var9), false)) {
                            class222.field3906 = var9;
                        }
                        if (class4.field73 == var9) {
                            class256.field4405 = true;
                            class155.field2668 = var10;
                            class30.field681 = var11;
                        }
                        if (var9.field329 || var9.field222 != 0) {
                            if (var19 && class235.field4041 != 0 && var9.field303 != null) {
                                class102 var26 = new class102();
                                var26.field1755 = true;
                                var26.field1738 = var9;
                                var26.field1748 = class235.field4041;
                                var26.field1743 = var9.field303;
                                class123.field2073.method2029((byte) -34, var26);
                            }
                            if (class165.field2839 != null || class81.field1457 != null || class271.field4721 || var9.field222 != 1400 && class165.field2841) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field222 != 0) {
                                if (var9.field222 == 1337) {
                                    class266.field4621 = var9;
                                    class7.method48(var9, 0);
                                    continue;
                                }
                                if (var9.field222 == 1338) {
                                    if (var21) {
                                        class257.field4418 = var9;
                                        class308.field5237 = class45.field915 - var10;
                                        class102.field1757 = class241.field4129 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field222 == 1400) {
                                    class242.field4146 = var9;
                                    if (var21) {
                                        if (class257.field4426[82] && class226.field3943 > 0) {
                                            int var27 = (int) ((double) (class45.field915 - var10 - var9.field260 / 2) * 2.0D / (double) class143.field2438);
                                            int var28 = (int) ((double) (class241.field4129 - var11 - var9.field226 / 2) * 2.0D / (double) class143.field2438);
                                            int var29 = class143.field2441 + var27;
                                            int var30 = class310.field5255 + var28;
                                            int var31 = class212.field3754 + var29;
                                            int var32 = class155.field2671 + class39.field836 - var30 - 1;
                                            class106.method651(false, var32, 0, var31);
                                            class8.method67(true);
                                            continue;
                                        }
                                        class165.field2841 = true;
                                        class188.field3264 = class275.field4760;
                                        class4.field81 = class77.field1411;
                                        class164.field2828 = class143.field2441;
                                        class287.field4911 = class310.field5255;
                                        continue;
                                    }
                                    if (var20 && class165.field2841) {
                                        class56.method374(-1, (int) ((double) (class188.field3264 - class275.field4760) * 2.0D / (double) class3.field64) + class164.field2828);
                                        class200.method1398((int) ((double) (class4.field81 - class77.field1411) * 2.0D / (double) class3.field64) + class287.field4911, (byte) -47);
                                        continue;
                                    }
                                    class165.field2841 = false;
                                    continue;
                                }
                                if (var9.field222 == 1401) {
                                    if (var20) {
                                        class107.method658(0, var9.field226, class77.field1411 - var11, class275.field4760 - var10, var9.field260);
                                    }
                                    continue;
                                }
                                if (var9.field222 == 1402) {
                                    if (!class247.field4247) {
                                        class7.method48(var9, 0);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field233 && var21) {
                                var9.field233 = true;
                                if (var9.field269 != null) {
                                    class102 var33 = new class102();
                                    var33.field1755 = true;
                                    var33.field1738 = var9;
                                    var33.field1752 = class45.field915 - var10;
                                    var33.field1748 = class241.field4129 - var11;
                                    var33.field1743 = var9.field269;
                                    class123.field2073.method2029((byte) -34, var33);
                                }
                            }
                            if (var9.field233 && var20 && var9.field244 != null) {
                                class102 var34 = new class102();
                                var34.field1755 = true;
                                var34.field1738 = var9;
                                var34.field1752 = class275.field4760 - var10;
                                var34.field1748 = class77.field1411 - var11;
                                var34.field1743 = var9.field244;
                                class123.field2073.method2029((byte) -34, var34);
                            }
                            if (var9.field233 && !var20) {
                                var9.field233 = false;
                                if (var9.field300 != null) {
                                    class102 var35 = new class102();
                                    var35.field1755 = true;
                                    var35.field1738 = var9;
                                    var35.field1752 = class275.field4760 - var10;
                                    var35.field1748 = class77.field1411 - var11;
                                    var35.field1743 = var9.field300;
                                    class109.field1849.method2029((byte) -34, var35);
                                }
                            }
                            if (var20 && var9.field291 != null) {
                                class102 var36 = new class102();
                                var36.field1755 = true;
                                var36.field1738 = var9;
                                var36.field1752 = class275.field4760 - var10;
                                var36.field1748 = class77.field1411 - var11;
                                var36.field1743 = var9.field291;
                                class123.field2073.method2029((byte) -34, var36);
                            }
                            if (!var9.field245 && var19) {
                                var9.field245 = true;
                                if (var9.field345 != null) {
                                    class102 var37 = new class102();
                                    var37.field1755 = true;
                                    var37.field1738 = var9;
                                    var37.field1752 = class275.field4760 - var10;
                                    var37.field1748 = class77.field1411 - var11;
                                    var37.field1743 = var9.field345;
                                    class123.field2073.method2029((byte) -34, var37);
                                }
                            }
                            if (var9.field245 && var19 && var9.field316 != null) {
                                class102 var38 = new class102();
                                var38.field1755 = true;
                                var38.field1738 = var9;
                                var38.field1752 = class275.field4760 - var10;
                                var38.field1748 = class77.field1411 - var11;
                                var38.field1743 = var9.field316;
                                class123.field2073.method2029((byte) -34, var38);
                            }
                            if (var9.field245 && !var19) {
                                var9.field245 = false;
                                if (var9.field242 != null) {
                                    class102 var39 = new class102();
                                    var39.field1755 = true;
                                    var39.field1738 = var9;
                                    var39.field1752 = class275.field4760 - var10;
                                    var39.field1748 = class77.field1411 - var11;
                                    var39.field1743 = var9.field242;
                                    class109.field1849.method2029((byte) -34, var39);
                                }
                            }
                            if (var9.field211 != null) {
                                class102 var40 = new class102();
                                var40.field1738 = var9;
                                var40.field1743 = var9.field211;
                                class50.field979.method2029((byte) -34, var40);
                            }
                            if (var9.field342 != null && class259.field4462 > var9.field317) {
                                if (var9.field343 == null || class259.field4462 - var9.field317 > 32) {
                                    class102 var45 = new class102();
                                    var45.field1738 = var9;
                                    var45.field1743 = var9.field342;
                                    class123.field2073.method2029((byte) -34, var45);
                                } else {
                                    label548: for (int var41 = var9.field317; var41 < class259.field4462; var41++) {
                                        int var42 = class314.field5332[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field343.length; var43++) {
                                            if (var9.field343[var43] == var42) {
                                                class102 var44 = new class102();
                                                var44.field1738 = var9;
                                                var44.field1743 = var9.field342;
                                                class123.field2073.method2029((byte) -34, var44);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field317 = class259.field4462;
                            }
                            if (var9.field282 != null && class222.field3904 > var9.field218) {
                                if (var9.field332 == null || class222.field3904 - var9.field218 > 32) {
                                    class102 var50 = new class102();
                                    var50.field1738 = var9;
                                    var50.field1743 = var9.field282;
                                    class123.field2073.method2029((byte) -34, var50);
                                } else {
                                    label524: for (int var46 = var9.field218; var46 < class222.field3904; var46++) {
                                        int var47 = class260.field4506[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field332.length; var48++) {
                                            if (var9.field332[var48] == var47) {
                                                class102 var49 = new class102();
                                                var49.field1738 = var9;
                                                var49.field1743 = var9.field282;
                                                class123.field2073.method2029((byte) -34, var49);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field218 = class222.field3904;
                            }
                            if (var9.field227 != null && class84.field1488 > var9.field280) {
                                if (var9.field262 == null || class84.field1488 - var9.field280 > 32) {
                                    class102 var55 = new class102();
                                    var55.field1738 = var9;
                                    var55.field1743 = var9.field227;
                                    class123.field2073.method2029((byte) -34, var55);
                                } else {
                                    label500: for (int var51 = var9.field280; var51 < class84.field1488; var51++) {
                                        int var52 = class222.field3895[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field262.length; var53++) {
                                            if (var9.field262[var53] == var52) {
                                                class102 var54 = new class102();
                                                var54.field1738 = var9;
                                                var54.field1743 = var9.field227;
                                                class123.field2073.method2029((byte) -34, var54);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field280 = class84.field1488;
                            }
                            if (var9.field234 != null && class118.field2000 > var9.field363) {
                                if (var9.field293 == null || class118.field2000 - var9.field363 > 32) {
                                    class102 var60 = new class102();
                                    var60.field1738 = var9;
                                    var60.field1743 = var9.field234;
                                    class123.field2073.method2029((byte) -34, var60);
                                } else {
                                    label476: for (int var56 = var9.field363; var56 < class118.field2000; var56++) {
                                        int var57 = class232.field4016[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field293.length; var58++) {
                                            if (var9.field293[var58] == var57) {
                                                class102 var59 = new class102();
                                                var59.field1738 = var9;
                                                var59.field1743 = var9.field234;
                                                class123.field2073.method2029((byte) -34, var59);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field363 = class118.field2000;
                            }
                            if (var9.field313 != null && class39.field824 > var9.field304) {
                                if (var9.field248 == null || class39.field824 - var9.field304 > 32) {
                                    class102 var65 = new class102();
                                    var65.field1738 = var9;
                                    var65.field1743 = var9.field313;
                                    class123.field2073.method2029((byte) -34, var65);
                                } else {
                                    label452: for (int var61 = var9.field304; var61 < class39.field824; var61++) {
                                        int var62 = class99.field1721[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field248.length; var63++) {
                                            if (var9.field248[var63] == var62) {
                                                class102 var64 = new class102();
                                                var64.field1738 = var9;
                                                var64.field1743 = var9.field313;
                                                class123.field2073.method2029((byte) -34, var64);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field304 = class39.field824;
                            }
                            if (class187.field3252 > var9.field254 && var9.field367 != null) {
                                class102 var66 = new class102();
                                var66.field1738 = var9;
                                var66.field1743 = var9.field367;
                                class123.field2073.method2029((byte) -34, var66);
                            }
                            if (class208.field3708 > var9.field254 && var9.field284 != null) {
                                class102 var67 = new class102();
                                var67.field1738 = var9;
                                var67.field1743 = var9.field284;
                                class123.field2073.method2029((byte) -34, var67);
                            }
                            if (class58.field1106 > var9.field254 && var9.field298 != null) {
                                class102 var68 = new class102();
                                var68.field1738 = var9;
                                var68.field1743 = var9.field298;
                                class123.field2073.method2029((byte) -34, var68);
                            }
                            if (class147.field2521 > var9.field254 && var9.field355 != null) {
                                class102 var69 = new class102();
                                var69.field1738 = var9;
                                var69.field1743 = var9.field355;
                                class123.field2073.method2029((byte) -34, var69);
                            }
                            if (class217.field3833 > var9.field254 && var9.field219 != null) {
                                class102 var70 = new class102();
                                var70.field1738 = var9;
                                var70.field1743 = var9.field219;
                                class123.field2073.method2029((byte) -34, var70);
                            }
                            var9.field254 = class104.field1788;
                            if (var9.field210 != null) {
                                for (int var71 = 0; var71 < class109.field1856; var71++) {
                                    class102 var72 = new class102();
                                    var72.field1738 = var9;
                                    var72.field1753 = class106.field1812[var71];
                                    var72.field1746 = class32.field710[var71];
                                    var72.field1743 = var9.field210;
                                    class123.field2073.method2029((byte) -34, var72);
                                }
                            }
                            if (class63.field1203 && var9.field239 != null) {
                                class102 var73 = new class102();
                                var73.field1738 = var9;
                                var73.field1743 = var9.field239;
                                class123.field2073.method2029((byte) -34, var73);
                            }
                        }
                    }
                    if (!var9.field294 && class165.field2839 == null && class81.field1457 == null && !class271.field4721) {
                        if ((var9.field240 >= 0 || var9.field246 != 0) && class275.field4760 >= var12 && class77.field1411 >= var13 && class275.field4760 < var14 && class77.field1411 < var15) {
                            if (var9.field240 >= 0) {
                                class279.field4829 = arg0[var9.field240];
                            } else {
                                class279.field4829 = var9;
                            }
                        }
                        if (var9.field288 == 8 && class275.field4760 >= var12 && class77.field1411 >= var13 && class275.field4760 < var14 && class77.field1411 < var15) {
                            class43.field870 = var9;
                        }
                        if (var9.field349 > var9.field226) {
                            class264.method1851(var9, var11, var9.field226, (byte) -57, var9.field260 + var10, var9.field349, class77.field1411, class275.field4760);
                        }
                    }
                    if (var9.field288 == 0) {
                        method1659(arg0, var9.field230, var12, var13, var14, var15, var10 - var9.field281, var11 - var9.field241);
                        if (var9.field348 != null) {
                            method1659(var9.field348, var9.field230, var12, var13, var14, var15, var10 - var9.field281, var11 - var9.field241);
                        }
                        class88 var74 = (class88) class182.field3198.method728(false, (long) var9.field230);
                        if (var74 != null) {
                            class281.method1961(var74.field1510, var15, var13, var14, var11, var10, var12, -1);
                        }
                    }
                }
            }
        }
    }
}
