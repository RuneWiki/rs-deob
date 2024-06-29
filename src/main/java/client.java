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
public class client extends class97 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lpj;")
    public static class237 field2717 = class33.method353("loc", 122);

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
    public static int[] field2716;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static void method1038(int arg0) {
        field2716 = null;
        field2717 = null;
        if (arg0 >= -70) {
            field2716 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2708++;
        if (!this.method733((byte) -112)) {
            return;
        }
        class11.field198 = Integer.parseInt(this.getParameter("worldid"));
        class12.field212 = Integer.parseInt(this.getParameter("modewhere"));
        if (class12.field212 < 0 || class12.field212 > 1) {
            class12.field212 = 0;
        }
        class57.field1170 = Integer.parseInt(this.getParameter("modewhat"));
        if (class57.field1170 < 0 || class57.field1170 > 2) {
            class57.field1170 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class170.field2979 = true;
        } else {
            class170.field2979 = false;
        }
        try {
            class37.field835 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class37.field835 = 0;
        }
        class223.method1479(67, class37.field835);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class84.field1563 = true;
        } else {
            class84.field1563 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class53.field1106 = true;
        } else {
            class53.field1106 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class184.field3222 = 1;
        } else {
            class184.field3222 = 0;
        }
        try {
            class106.field1873 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class106.field1873 = 0;
        }
        class117.field2050 = class38.field863.method1584(-128, this);
        if (class117.field2050 == null) {
            class117.field2050 = class239.field4202;
        }
        String var5 = this.getParameter("haveie6");
        if (var5 != null && var5.equals("1")) {
            class126.field2204 = true;
        } else {
            class126.field2204 = false;
        }
        class269.field4606 = this;
        this.method730(503, 515, class57.field1170 + 32, 765, -121);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method740(int arg0) {
        field2711++;
        if (class264.field4507 == 1000 || arg0 != 32) {
            return;
        }
        class241.field4246++;
        if ((class241.field4246 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class48.field1033 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class253.field4349.setSeed((long) class48.field1033);
        }
        this.method1041(125);
        if (class195.field3392 != null) {
            class195.field3392.method75(arg0 ^ 0xFFFFC505);
        }
        class172.method1194(75);
        class96.method718((byte) -52);
        class153.method1051(arg0 - 33);
        class247.method1693(false);
        if (class235.field4093 != null) {
            int var3 = class235.field4093.method59(arg0 ^ 0x726E);
            class79.field1480 = var3;
        }
        if (class264.field4507 == 0) {
            this.method1048(27487);
            class135.method936(true);
        } else if (class264.field4507 == 5) {
            this.method1048(27487);
            class135.method936(true);
        } else if (class264.field4507 == 25 || class264.field4507 == 28) {
            class28.method256(true);
        }
        if (class264.field4507 == 10) {
            this.method1046(arg0 - 159);
            class12.method118(-68);
            class229.method1518(-51);
            class152.method1037(-97);
        } else if (class264.field4507 == 30) {
            class87.method664(83);
            return;
        } else if (class264.field4507 == 40) {
            class152.method1037(-64);
            if (class259.field4450 != -3) {
                if (class259.field4450 == 15) {
                    class177.method1222((byte) 0);
                } else if (class259.field4450 != 2) {
                    class126.method893(true, (byte) 121);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method1039(byte arg0) {
        if (arg0 <= 102) {
            field2716 = null;
        }
        field2714++;
        if (class202.field3475.field876 >= 4) {
            this.method736("js5crc", true);
            class264.field4507 = 1000;
            return;
        }
        if (class202.field3475.field877 >= 4) {
            if (class264.field4507 == 0 || class264.field4507 == 5) {
                this.method736("js5io", true);
                class264.field4507 = 1000;
                return;
            }
            class202.field3475.field877 = 3;
            class238.field4160 = 3000;
        }
        if (class238.field4160-- > 0) {
            return;
        }
        try {
            if (class214.field3652 == 0) {
                class57.field1174 = class268.field4572.method543(class174.field3042, class96.field1714, (byte) -118);
                class214.field3652++;
            }
            if (class214.field3652 == 1) {
                if (class57.field1174.field1823 == 2) {
                    this.method1040(21822, -1);
                    return;
                }
                if (class57.field1174.field1823 == 1) {
                    class214.field3652++;
                }
            }
            if (class214.field3652 == 2) {
                class256.field4407 = new class214((Socket) class57.field1174.field1826, class268.field4572);
                class32 var2 = new class32(5);
                var2.method293((byte) 125, 15);
                var2.method290((byte) -20, 515);
                class256.field4407.method1434(0, -26363, 5, var2.field644);
                class214.field3652++;
                class261.field4469 = class181.method1244((byte) -57);
            }
            if (class214.field3652 == 3) {
                if (class264.field4507 == 0 || class264.field4507 == 5 || class256.field4407.method1438(12) > 0) {
                    int var3 = class256.field4407.method1437((byte) 85);
                    if (var3 != 0) {
                        this.method1040(21822, var3);
                        return;
                    }
                    class214.field3652++;
                } else if ((class181.method1244((byte) -112) - class261.field4469) > 30000L) {
                    this.method1040(21822, -2);
                    return;
                }
            }
            if (class214.field3652 == 4) {
                boolean var4 = class264.field4507 == 5 || class264.field4507 == 10 || class264.field4507 == 28;
                class202.field3475.method396(class256.field4407, !var4, (byte) 126);
                class57.field1174 = null;
                class214.field3652 = 0;
                class178.field3139 = 0;
                class256.field4407 = null;
            }
        } catch (IOException var5) {
            this.method1040(21822, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1040(int arg0, int arg1) {
        field2705++;
        class57.field1174 = null;
        class178.field3139++;
        if (class96.field1714 == class258.field4433) {
            class96.field1714 = class56.field1162;
        } else {
            class96.field1714 = class258.field4433;
        }
        class256.field4407 = null;
        if (arg0 != 21822) {
            this.method1039((byte) -17);
        }
        class214.field3652 = 0;
        if (class178.field3139 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class264.field4507 == 0 || class264.field4507 == 5) {
                this.method736("js5connect_full", true);
                class264.field4507 = 1000;
            } else {
                class238.field4160 = 3000;
            }
        } else if (class178.field3139 >= 2 && arg1 == 6) {
            this.method736("js5connect_outofdate", true);
            class264.field4507 = 1000;
        } else if (class178.field3139 >= 4) {
            if (class264.field4507 == 0 || class264.field4507 == 5) {
                this.method736("js5connect", true);
                class264.field4507 = 1000;
            } else {
                class238.field4160 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1041(int arg0) {
        if (arg0 < 30) {
            return;
        }
        field2703++;
        boolean var2 = class202.field3475.method388(14679);
        if (!var2) {
            this.method1039((byte) 103);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method725(byte arg0) {
        field2702++;
        if (class70.field1385 != null) {
            class70.field1385.field4424 = false;
        }
        class70.field1385 = null;
        if (class127.field2219 != null) {
            class127.field2219.method1431((byte) 49);
            class127.field2219 = null;
        }
        class178.method1230(class20.field379, 9591);
        class118.method860(0, class20.field379);
        if (class235.field4093 != null) {
            class235.field4093.method58(true, class20.field379);
        }
        class130.method916(32537);
        class16.method143(6735);
        class235.field4093 = null;
        if (class79.field1485 != null) {
            class79.field1485.method1080(0);
        }
        if (class131.field2312 != null) {
            class131.field2312.method1080(0);
        }
        class202.field3475.method389(0);
        class247.field4308.method531(-1);
        try {
            if (class226.field3870 != null) {
                class226.field3870.method625(-124);
            }
            if (arg0 <= -1) {
                if (class181.field3179 != null) {
                    for (int var2 = 0; var2 < class181.field3179.length; var2++) {
                        if (class181.field3179[var2] != null) {
                            class181.field3179[var2].method625(-124);
                        }
                    }
                }
                if (class58.field1198 != null) {
                    class58.field1198.method625(-124);
                }
                if (class100.field1781 != null) {
                    class100.field1781.method625(-126);
                }
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lw;)I")
    public static final int method1042(class141 arg0) {
        class166 var1 = (class166) class232.field4021.method568(((long) arg0.field2530 << 32) + (long) arg0.field2433, -1);
        return var1 == null ? arg0.field2426 : var1.field2932;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method737(int arg0) {
        field2712++;
        if (class264.field4507 == 1000) {
            return;
        }
        boolean var2 = class163.method1147(arg0 - 1290);
        if (var2 && class140.field2406 && class79.field1485 != null) {
            class79.field1485.method1085(true);
        }
        if (arg0 != -10) {
            return;
        }
        if ((class264.field4507 == 30 || class264.field4507 == 10) && (class61.field1234 || class34.field744 != 0L && class181.method1244((byte) -125) > class34.field744)) {
            class221.method1471(class61.field1234, class177.field3096, class121.field2135, (byte) -45, class37.method381(arg0 ^ 0xFFFFFFF6));
        }
        if (class24.field433 == null) {
            Container var3;
            if (class24.field433 != null) {
                var3 = class24.field433;
            } else if (class43.field946 == null) {
                var3 = class268.field4572.field1306;
            } else {
                var3 = class43.field946;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class43.field946 == var3) {
                Insets var6 = class43.field946.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class170.field2976 != var4 || class231.field3976 != var5) {
                if (class67.field1320.startsWith("mac")) {
                    class170.field2976 = var4;
                    class231.field3976 = var5;
                } else {
                    class107.method795(2);
                }
                class34.field744 = class181.method1244((byte) -80) + 500L;
            }
        }
        boolean var7 = false;
        if (class240.field4220) {
            class240.field4220 = false;
            var7 = true;
        }
        if (var7) {
            class256.method1737(15375);
        }
        if (class264.field4507 == 0) {
            class59.method513(class264.field4513, -1, var7, (Color) null, class108.field1931);
        } else if (class264.field4507 == 5) {
            class260.method1751(class80.field1507, 106, false);
        } else if (class264.field4507 == 10) {
            class110.method818(121);
        } else if (class264.field4507 == 25 || class264.field4507 == 28) {
            if (class81.field1524 == 1) {
                if (class240.field4230 > class92.field1669) {
                    class92.field1669 = class240.field4230;
                }
                int var8 = (class92.field1669 - class240.field4230) * 50 / class92.field1669;
                class118.method856(class238.method1626(new class237[] { class45.field983, class189.field3300, class14.method130(var8, (byte) 117), class199.field3453 }, -86), false, -12010);
            } else if (class81.field1524 == 2) {
                if (class144.field2597 > class23.field425) {
                    class23.field425 = class144.field2597;
                }
                int var9 = ((class23.field425 - class144.field2597) * 50 / class23.field425) + 50;
                class118.method856(class238.method1626(new class237[] { class45.field983, class189.field3300, class14.method130(var9, (byte) 117), class199.field3453 }, -70), false, arg0 - 12000);
            } else {
                class118.method856(class45.field983, false, arg0 - 12000);
            }
        } else if (class264.field4507 == 30) {
            class200.method1363(0);
        } else if (class264.field4507 == 40) {
            class118.method856(class238.method1626(new class237[] { class174.field3058, class270.field4629, class205.field3507 }, -60), false, -12010);
        }
        if ((class264.field4507 == 30 || class264.field4507 == 10) && class95.field1691 == 0 && !var7) {
            try {
                Graphics var12 = class20.field379.getGraphics();
                for (int var13 = 0; var13 < class68.field1348; var13++) {
                    if (class114.field2008[var13]) {
                        class38.field845.method154(class260.field4458[var13], class115.field2023[var13], class183.field3215[var13], 62, class249.field4324[var13], var12);
                        class114.field2008[var13] = false;
                    }
                }
            } catch (Exception var14) {
                class20.field379.repaint();
            }
        } else if (class264.field4507 != 0) {
            try {
                Graphics var10 = class20.field379.getGraphics();
                class38.field845.method152(var10, arg0 ^ 0x11CB, 0, 0);
                for (int var11 = 0; var11 < class68.field1348; var11++) {
                    class114.field2008[var11] = false;
                }
            } catch (Exception var15) {
                class20.field379.repaint();
            }
        }
        if (class32.field698) {
            class190.method1290((byte) -126);
        }
        if (class83.field1557 && class264.field4507 == 10 && class84.field1573 != -1) {
            class83.field1557 = false;
            class128.method904(class268.field4572, 127);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILfa;B)Lgj;")
    public static final class225 method1043(int arg0, class239 arg1, byte arg2) {
        field2706++;
        if (arg2 != 6) {
            field2716 = null;
        }
        return class122.method872(arg1, arg0, (byte) -20) ? class22.method208(5) : null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lw;IIIIIII)V")
    public static final void method1044(class141[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class141 var9 = arg0[var8];
            if (var9 != null && var9.field2535 == arg1 && (!var9.field2536 || var9.field2529 == 0 || var9.field2423 || method1042(var9) != 0 || class185.field3237 == var9 || var9.field2492 == 1338) && (!var9.field2536 || !method1047(var9))) {
                int var10 = var9.field2416 + arg6;
                int var11 = var9.field2438 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2529 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2575 + var10;
                    int var17 = var9.field2490 + var11;
                    if (var9.field2529 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class45.field972 == var9) {
                    class181.field3170 = true;
                    class124.field2187 = var10;
                    class121.field2144 = var11;
                }
                if (!var9.field2536 || var12 < var14 && var13 < var15) {
                    if (var9.field2529 == 0) {
                        if (!var9.field2536 && method1047(var9) && class210.field3582 != var9) {
                            continue;
                        }
                        if (var9.field2564 && class28.field515 >= var12 && class174.field3059 >= var13 && class28.field515 < var14 && class174.field3059 < var15) {
                            for (class117 var18 = (class117) class71.field1389.method673(false); var18 != null; var18 = (class117) class71.field1389.method680(77)) {
                                if (var18.field2061) {
                                    var18.method629(0);
                                }
                            }
                            if (class111.field1951 == 0) {
                                class45.field972 = null;
                                class185.field3237 = null;
                            }
                            class186.field3265 = false;
                            class196.field3418 = null;
                        }
                    }
                    if (var9.field2536) {
                        boolean var19;
                        if (class28.field515 >= var12 && class174.field3059 >= var13 && class28.field515 < var14 && class174.field3059 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class170.field2986 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class123.field2173 == 1 && class227.field3891 >= var12 && class58.field1196 >= var13 && class227.field3891 < var14 && class58.field1196 < var15) {
                            var21 = true;
                        }
                        if (class141.field2565 > 0 && var9.field2567 != null) {
                            for (int var22 = 0; var22 < var9.field2567.length; var22++) {
                                for (int var23 = 0; var23 < class141.field2565; var23++) {
                                    int var24 = var9.field2567[var22] & 0xFF;
                                    if (class76.field1442[var23] == var24) {
                                        if (var9.field2502 != null) {
                                            byte var25 = var9.field2502[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class119.field2083[86] || (var25 & 0x1) != 0 && !class119.field2083[82] || (var25 & 0x4) != 0 && !class119.field2083[81])) {
                                                continue;
                                            }
                                        }
                                        class31.method288(5, var22 + 1, class239.field4202, var9.field2530, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class20.method202(var9, 112, class58.field1196 - var11, class227.field3891 - var10);
                        }
                        if (class45.field972 != null && class45.field972 != var9 && var19 && class113.method833(true, method1042(var9))) {
                            class104.field1830 = var9;
                        }
                        if (class185.field3237 == var9) {
                            class124.field2177 = true;
                            class76.field1444 = var10;
                            class239.field4211 = var11;
                        }
                        if (var9.field2423 || var9.field2492 != 0) {
                            if (var19 && class79.field1480 != 0 && var9.field2436 != null) {
                                class117 var26 = new class117();
                                var26.field2061 = true;
                                var26.field2046 = var9;
                                var26.field2055 = class79.field1480;
                                var26.field2053 = var9.field2436;
                                class71.field1389.method675(var26, (byte) -91);
                            }
                            if (class45.field972 != null || class101.field1803 != null || class247.field4306 || var9.field2492 != 1400 && class186.field3265) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2492 != 0) {
                                if (var9.field2492 == 1337) {
                                    class262.field4484 = var9;
                                    class128.method911(var9, -17149);
                                    continue;
                                }
                                if (var9.field2492 == 1338) {
                                    if (var21) {
                                        class196.field3418 = var9;
                                        class41.field935 = class227.field3891 - var10;
                                        class78.field1475 = class58.field1196 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2492 == 1400) {
                                    class59.field1210 = var9;
                                    if (var21) {
                                        if (class119.field2083[82] && class64.field1283 > 0) {
                                            int var27 = (int) ((double) (class227.field3891 - var10 - var9.field2575 / 2) * 2.0D / (double) class169.field2966);
                                            int var28 = (int) ((double) (class58.field1196 - var11 - var9.field2490 / 2) * 2.0D / (double) class169.field2966);
                                            int var29 = class215.field3681 + var27;
                                            int var30 = class22.field405 + var28;
                                            int var31 = class202.field3466 + var29;
                                            int var32 = class115.field2017 + class17.field296 - var30 - 1;
                                            class196.method1349(325, var32, 0, var31);
                                            class117.method853(117);
                                            continue;
                                        }
                                        class186.field3265 = true;
                                        class158.field2854 = class28.field515;
                                        class262.field4485 = class174.field3059;
                                        class245.field4285 = class215.field3681;
                                        class148.field2640 = class22.field405;
                                        continue;
                                    }
                                    if (var20 && class186.field3265) {
                                        class80.method621((int) ((double) (class158.field2854 - class28.field515) * 2.0D / (double) class95.field1697) + class245.field4285, -69);
                                        class17.method157((int) ((double) (class262.field4485 - class174.field3059) * 2.0D / (double) class95.field1697) + class148.field2640, (byte) -64);
                                        continue;
                                    }
                                    class186.field3265 = false;
                                    continue;
                                }
                                if (var9.field2492 == 1401) {
                                    if (var20) {
                                        class209.method1399(class174.field3059 - var11, var9.field2490, var9.field2575, (byte) -121, class28.field515 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field2492 == 1402) {
                                    class128.method911(var9, -17149);
                                    continue;
                                }
                            }
                            if (!var9.field2539 && var21) {
                                var9.field2539 = true;
                                if (var9.field2515 != null) {
                                    class117 var33 = new class117();
                                    var33.field2061 = true;
                                    var33.field2046 = var9;
                                    var33.field2056 = class227.field3891 - var10;
                                    var33.field2055 = class58.field1196 - var11;
                                    var33.field2053 = var9.field2515;
                                    class71.field1389.method675(var33, (byte) -48);
                                }
                            }
                            if (var9.field2539 && var20 && var9.field2473 != null) {
                                class117 var34 = new class117();
                                var34.field2061 = true;
                                var34.field2046 = var9;
                                var34.field2056 = class28.field515 - var10;
                                var34.field2055 = class174.field3059 - var11;
                                var34.field2053 = var9.field2473;
                                class71.field1389.method675(var34, (byte) -117);
                            }
                            if (var9.field2539 && !var20) {
                                var9.field2539 = false;
                                if (var9.field2504 != null) {
                                    class117 var35 = new class117();
                                    var35.field2061 = true;
                                    var35.field2046 = var9;
                                    var35.field2056 = class28.field515 - var10;
                                    var35.field2055 = class174.field3059 - var11;
                                    var35.field2053 = var9.field2504;
                                    class21.field394.method675(var35, (byte) -117);
                                }
                            }
                            if (var20 && var9.field2411 != null) {
                                class117 var36 = new class117();
                                var36.field2061 = true;
                                var36.field2046 = var9;
                                var36.field2056 = class28.field515 - var10;
                                var36.field2055 = class174.field3059 - var11;
                                var36.field2053 = var9.field2411;
                                class71.field1389.method675(var36, (byte) -76);
                            }
                            if (!var9.field2422 && var19) {
                                var9.field2422 = true;
                                if (var9.field2549 != null) {
                                    class117 var37 = new class117();
                                    var37.field2061 = true;
                                    var37.field2046 = var9;
                                    var37.field2056 = class28.field515 - var10;
                                    var37.field2055 = class174.field3059 - var11;
                                    var37.field2053 = var9.field2549;
                                    class71.field1389.method675(var37, (byte) -72);
                                }
                            }
                            if (var9.field2422 && var19 && var9.field2435 != null) {
                                class117 var38 = new class117();
                                var38.field2061 = true;
                                var38.field2046 = var9;
                                var38.field2056 = class28.field515 - var10;
                                var38.field2055 = class174.field3059 - var11;
                                var38.field2053 = var9.field2435;
                                class71.field1389.method675(var38, (byte) -46);
                            }
                            if (var9.field2422 && !var19) {
                                var9.field2422 = false;
                                if (var9.field2553 != null) {
                                    class117 var39 = new class117();
                                    var39.field2061 = true;
                                    var39.field2046 = var9;
                                    var39.field2056 = class28.field515 - var10;
                                    var39.field2055 = class174.field3059 - var11;
                                    var39.field2053 = var9.field2553;
                                    class21.field394.method675(var39, (byte) -82);
                                }
                            }
                            if (var9.field2526 != null) {
                                class117 var40 = new class117();
                                var40.field2046 = var9;
                                var40.field2053 = var9.field2526;
                                class189.field3288.method675(var40, (byte) -89);
                            }
                            if (var9.field2450 != null && class209.field3563 > var9.field2507) {
                                if (var9.field2448 == null || class209.field3563 - var9.field2507 > 32) {
                                    class117 var45 = new class117();
                                    var45.field2046 = var9;
                                    var45.field2053 = var9.field2450;
                                    class71.field1389.method675(var45, (byte) -107);
                                } else {
                                    label546: for (int var41 = var9.field2507; var41 < class209.field3563; var41++) {
                                        int var42 = class111.field1948[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field2448.length; var43++) {
                                            if (var9.field2448[var43] == var42) {
                                                class117 var44 = new class117();
                                                var44.field2046 = var9;
                                                var44.field2053 = var9.field2450;
                                                class71.field1389.method675(var44, (byte) -52);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field2507 = class209.field3563;
                            }
                            if (var9.field2514 != null && class207.field3527 > var9.field2412) {
                                if (var9.field2558 == null || class207.field3527 - var9.field2412 > 32) {
                                    class117 var50 = new class117();
                                    var50.field2046 = var9;
                                    var50.field2053 = var9.field2514;
                                    class71.field1389.method675(var50, (byte) -40);
                                } else {
                                    label522: for (int var46 = var9.field2412; var46 < class207.field3527; var46++) {
                                        int var47 = class160.field2872[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field2558.length; var48++) {
                                            if (var9.field2558[var48] == var47) {
                                                class117 var49 = new class117();
                                                var49.field2046 = var9;
                                                var49.field2053 = var9.field2514;
                                                class71.field1389.method675(var49, (byte) -99);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field2412 = class207.field3527;
                            }
                            if (var9.field2439 != null && class207.field3523 > var9.field2554) {
                                if (var9.field2578 == null || class207.field3523 - var9.field2554 > 32) {
                                    class117 var55 = new class117();
                                    var55.field2046 = var9;
                                    var55.field2053 = var9.field2439;
                                    class71.field1389.method675(var55, (byte) -124);
                                } else {
                                    label498: for (int var51 = var9.field2554; var51 < class207.field3523; var51++) {
                                        int var52 = class179.field3150[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field2578.length; var53++) {
                                            if (var9.field2578[var53] == var52) {
                                                class117 var54 = new class117();
                                                var54.field2046 = var9;
                                                var54.field2053 = var9.field2439;
                                                class71.field1389.method675(var54, (byte) -51);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field2554 = class207.field3523;
                            }
                            if (var9.field2449 != null && class230.field3936 > var9.field2501) {
                                if (var9.field2489 == null || class230.field3936 - var9.field2501 > 32) {
                                    class117 var60 = new class117();
                                    var60.field2046 = var9;
                                    var60.field2053 = var9.field2449;
                                    class71.field1389.method675(var60, (byte) -80);
                                } else {
                                    label474: for (int var56 = var9.field2501; var56 < class230.field3936; var56++) {
                                        int var57 = class158.field2857[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field2489.length; var58++) {
                                            if (var9.field2489[var58] == var57) {
                                                class117 var59 = new class117();
                                                var59.field2046 = var9;
                                                var59.field2053 = var9.field2449;
                                                class71.field1389.method675(var59, (byte) -64);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field2501 = class230.field3936;
                            }
                            if (var9.field2512 != null && class159.field2864 > var9.field2415) {
                                if (var9.field2518 == null || class159.field2864 - var9.field2415 > 32) {
                                    class117 var65 = new class117();
                                    var65.field2046 = var9;
                                    var65.field2053 = var9.field2512;
                                    class71.field1389.method675(var65, (byte) -123);
                                } else {
                                    label450: for (int var61 = var9.field2415; var61 < class159.field2864; var61++) {
                                        int var62 = class254.field4358[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field2518.length; var63++) {
                                            if (var9.field2518[var63] == var62) {
                                                class117 var64 = new class117();
                                                var64.field2046 = var9;
                                                var64.field2053 = var9.field2512;
                                                class71.field1389.method675(var64, (byte) -47);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field2415 = class159.field2864;
                            }
                            if (class209.field3566 > var9.field2498 && var9.field2463 != null) {
                                class117 var66 = new class117();
                                var66.field2046 = var9;
                                var66.field2053 = var9.field2463;
                                class71.field1389.method675(var66, (byte) -95);
                            }
                            if (class20.field381 > var9.field2498 && var9.field2511 != null) {
                                class117 var67 = new class117();
                                var67.field2046 = var9;
                                var67.field2053 = var9.field2511;
                                class71.field1389.method675(var67, (byte) -53);
                            }
                            if (class167.field2960 > var9.field2498 && var9.field2491 != null) {
                                class117 var68 = new class117();
                                var68.field2046 = var9;
                                var68.field2053 = var9.field2491;
                                class71.field1389.method675(var68, (byte) -109);
                            }
                            if (class221.field3804 > var9.field2498 && var9.field2443 != null) {
                                class117 var69 = new class117();
                                var69.field2046 = var9;
                                var69.field2053 = var9.field2443;
                                class71.field1389.method675(var69, (byte) -99);
                            }
                            if (class143.field2594 > var9.field2498 && var9.field2527 != null) {
                                class117 var70 = new class117();
                                var70.field2046 = var9;
                                var70.field2053 = var9.field2527;
                                class71.field1389.method675(var70, (byte) -124);
                            }
                            var9.field2498 = class3.field31;
                            if (var9.field2424 != null) {
                                for (int var71 = 0; var71 < class141.field2565; var71++) {
                                    class117 var72 = new class117();
                                    var72.field2046 = var9;
                                    var72.field2045 = class76.field1442[var71];
                                    var72.field2051 = class229.field3912[var71];
                                    var72.field2053 = var9.field2424;
                                    class71.field1389.method675(var72, (byte) -75);
                                }
                            }
                            if (class34.field732 && var9.field2516 != null) {
                                class117 var73 = new class117();
                                var73.field2046 = var9;
                                var73.field2053 = var9.field2516;
                                class71.field1389.method675(var73, (byte) -116);
                            }
                        }
                    }
                    if (!var9.field2536 && class45.field972 == null && class101.field1803 == null && !class247.field4306) {
                        if ((var9.field2451 >= 0 || var9.field2577 != 0) && class28.field515 >= var12 && class174.field3059 >= var13 && class28.field515 < var14 && class174.field3059 < var15) {
                            if (var9.field2451 >= 0) {
                                class210.field3582 = arg0[var9.field2451];
                            } else {
                                class210.field3582 = var9;
                            }
                        }
                        if (var9.field2529 == 8 && class28.field515 >= var12 && class174.field3059 >= var13 && class28.field515 < var14 && class174.field3059 < var15) {
                            class221.field3807 = var9;
                        }
                        if (var9.field2500 > var9.field2490) {
                            class269.method1791(var11, var9.field2500, class28.field515, var9.field2575 + var10, true, var9.field2490, var9, class174.field3059);
                        }
                    }
                    if (var9.field2529 == 0) {
                        method1044(arg0, var9.field2530, var12, var13, var14, var15, var10 - var9.field2555, var11 - var9.field2413);
                        if (var9.field2457 != null) {
                            method1044(var9.field2457, var9.field2530, var12, var13, var14, var15, var10 - var9.field2555, var11 - var9.field2413);
                        }
                        class58 var74 = (class58) class164.field2915.method568((long) var9.field2530, -1);
                        if (var74 != null) {
                            class121.method871(var12, var14, -17476, var74.field1191, var11, var10, var15, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method726(boolean arg0) {
        class107.method795(2);
        field2710++;
        class247.field4308 = new class64();
        class202.field3475 = new class38();
        class55.method484((byte) -28, class268.field4572);
        if (arg0) {
            field2716 = null;
        }
        if (class12.field212 == 0) {
            class170.field2982 = this.getCodeBase().getHost();
            class189.field3290 = 443;
            class221.field3803 = 43594;
        } else if (class12.field212 == 1) {
            class170.field2982 = this.getCodeBase().getHost();
            class189.field3290 = class11.field198 + 50000;
            class221.field3803 = class11.field198 + 40000;
        } else if (class12.field212 == 2) {
            class170.field2982 = "127.0.0.1";
            class221.field3803 = class11.field198 + 40000;
            class189.field3290 = class11.field198 + 50000;
        }
        class164.field2923 = class255.field4373 = class25.field468 = class177.field3112 = new short[256];
        if (class184.field3222 == 1) {
            class11.field203 = class57.field1178;
            class46.field1003 = class189.field3295;
            class207.field3516 = class131.field2301;
            class196.field3413 = class271.field4641;
        } else {
            class196.field3413 = class259.field4451;
            class46.field1003 = class253.field4357;
            class207.field3516 = class87.field1608;
            class11.field203 = class191.field3324;
        }
        class258.field4433 = class221.field3803;
        class245.field4291 = class221.field3803;
        class174.field3042 = class170.field2982;
        class96.field1714 = class245.field4291;
        class56.field1162 = class189.field3290;
        if (class67.field1311 == 3 && class12.field212 != 2) {
            class126.field2205 = class11.field198;
        }
        class215.method1443(arg0);
        class271.method1804(class20.field379, 26130);
        class271.method1799((byte) 6, class20.field379);
        class235.field4093 = class19.method194((byte) 123);
        if (class235.field4093 != null) {
            class235.field4093.method60(arg0, class20.field379);
        }
        class121.field2141 = class67.field1311;
        try {
            if (class268.field4572.field1319 != null) {
                class226.field3870 = new class80(class268.field4572.field1319, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class181.field3179[var2] = new class80(class268.field4572.field1310[var2], 6000, 0);
                }
                class58.field1198 = new class80(class268.field4572.field1321, 6000, 0);
                class264.field4506 = new class128(255, class226.field3870, class58.field1198, 500000);
                class100.field1781 = new class80(class268.field4572.field1317, 24, 0);
                class268.field4572.field1317 = null;
                class268.field4572.field1319 = null;
                class268.field4572.field1321 = null;
                class268.field4572.field1310 = null;
            }
        } catch (IOException var3) {
            class264.field4506 = null;
            class226.field3870 = null;
            class58.field1198 = null;
            class100.field1781 = null;
        }
        class199.field3455 = class231.field3983;
        if (class12.field212 != 0) {
            class129.field2259 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2707++;
        try {
            if (arg0.length != 4) {
                class105.method783("argument count", (byte) -105);
            }
            int var1 = -1;
            class11.field198 = Integer.parseInt(arg0[0]);
            class12.field212 = 2;
            if (arg0[1].equals("live")) {
                class57.field1170 = 0;
            } else if (arg0[1].equals("rc")) {
                class57.field1170 = 1;
            } else if (arg0[1].equals("wip")) {
                class57.field1170 = 2;
            } else {
                class105.method783("modewhat", (byte) -105);
            }
            class170.field2979 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class32.method345(62, class97.method723(0, var2.length, (byte) -118, var2));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class37.field835 = var1;
            } else if (arg0[2].equals("english")) {
                class37.field835 = 0;
            } else if (arg0[2].equals("german")) {
                class37.field835 = 1;
            } else {
                class105.method783("language", (byte) -105);
            }
            class223.method1479(-94, class37.field835);
            class53.field1106 = false;
            class84.field1563 = false;
            if (arg0[3].equals("game0")) {
                class184.field3222 = 0;
            } else if (arg0[3].equals("game1")) {
                class184.field3222 = 1;
            } else {
                class105.method783("game", (byte) -105);
            }
            class126.field2204 = false;
            class117.field2050 = class239.field4202;
            class106.field1873 = 0;
            client var3 = new client();
            class269.field4606 = var3;
            var3.method727(class57.field1170 + 32, 768, 27, (byte) -59, 1024, 515, "runescape");
            class43.field946.setLocation(40, 40);
        } catch (Exception var6) {
            class158.method1123((String) null, (byte) -122, var6);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lw;)Lw;")
    public static final class141 method1045(class141 arg0) {
        int var1 = class275.method1873((byte) 80, method1042(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class70.method572(20043, arg0.field2535);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1046(int arg0) {
        field2713++;
        for (class141.field2565 = 0; class206.method1382(32) && class141.field2565 < 128; class141.field2565++) {
            class76.field1442[class141.field2565] = class89.field1626;
            class229.field3912[class141.field2565] = class56.field1150;
        }
        if (arg0 > -119) {
            method1047((class141) null);
        }
        class59.field1204++;
        if (class84.field1573 != -1) {
            class121.method871(0, class142.field2585, -17476, class84.field1573, 0, 0, class119.field2087, 0);
        }
        class3.field31++;
        class202.method1373(37);
        while (true) {
            class117 var2;
            class141 var3;
            class141 var4;
            do {
                var2 = (class117) class189.field3288.method678(false);
                if (var2 == null) {
                    while (true) {
                        class117 var5;
                        class141 var6;
                        class141 var7;
                        do {
                            var5 = (class117) class21.field394.method678(false);
                            if (var5 == null) {
                                while (true) {
                                    class117 var8;
                                    class141 var9;
                                    class141 var10;
                                    do {
                                        var8 = (class117) class71.field1389.method678(false);
                                        if (var8 == null) {
                                            if (class45.field972 != null) {
                                                class105.method785(20618);
                                            }
                                            if (class234.field4066 != null && class234.field4066.field1823 == 1) {
                                                if (class234.field4066.field1826 != null) {
                                                    class146.method997(class28.field545, class39.field882, false);
                                                }
                                                class234.field4066 = null;
                                                class39.field882 = false;
                                                class28.field545 = null;
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2046;
                                        if (var9.field2433 < 0) {
                                            break;
                                        }
                                        var10 = class70.method572(20043, var9.field2535);
                                    } while (var10 == null || var10.field2457 == null || var9.field2433 >= var10.field2457.length || var10.field2457[var9.field2433] != var9);
                                    class229.method1519(-124, var8);
                                }
                            }
                            var6 = var5.field2046;
                            if (var6.field2433 < 0) {
                                break;
                            }
                            var7 = class70.method572(20043, var6.field2535);
                        } while (var7 == null || var7.field2457 == null || var6.field2433 >= var7.field2457.length || var7.field2457[var6.field2433] != var6);
                        class229.method1519(-86, var5);
                    }
                }
                var3 = var2.field2046;
                if (var3.field2433 < 0) {
                    break;
                }
                var4 = class70.method572(20043, var3.field2535);
            } while (var4 == null || var4.field2457 == null || var3.field2433 >= var4.field2457.length || var4.field2457[var3.field2433] != var3);
            class229.method1519(-92, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lw;)Z")
    public static final boolean method1047(class141 arg0) {
        if (class215.field3731) {
            if (method1042(arg0) != 0) {
                return false;
            }
            if (arg0.field2529 == 0) {
                return false;
            }
        }
        return arg0.field2460;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method731(int arg0) {
        method1038(arg0 ^ 0xFFFFFFA7);
        field2709++;
        class237.method1586(true);
        class255.method1721(true);
        class224.method1490((byte) 37);
        class46.method428(false);
        class97.method738(127);
        class221.method1472(arg0 - 21);
        class17.method156(93);
        class257.method1738((byte) -45);
        class71.method574((byte) -31);
        class32.method299(127);
        class214.method1432(121);
        class38.method398((byte) 104);
        class64.method533(arg0 + 44);
        class6.method73(-22086);
        class16.method151(true);
        class239.method1657(93);
        class80.method618(arg0 ^ 0xFFFFFFEB);
        class128.method905((byte) -117);
        class135.method938((byte) -95);
        class210.method1408((byte) -115);
        class34.method366(true);
        class25.method220(arg0 ^ 0x6E);
        class141.method977(-10);
        class271.method1806((byte) 71);
        class88.method677(false);
        class69.method564(arg0 ^ 0xFFFFF569);
        class59.method512(150);
        class196.method1350(false);
        class52.method462(20807);
        class115.method843(false);
        class274.method1842(true);
        class156.method1075((byte) -33);
        class202.method1370((byte) -79);
        class29.method265((byte) -49);
        class256.method1730(-65);
        class215.method1446((byte) -95);
        class35.method369(7704);
        class61.method520(124);
        class231.method1527(-1);
        class58.method505((byte) 94);
        class81.method632(0);
        class272.method1810((byte) 47);
        class3.method48(-257);
        class253.method1716(arg0 + 144);
        class159.method1125((byte) 27);
        class92.method696((byte) 124);
        class50.method456((byte) 111);
        class126.method894(arg0 - 20);
        class195.method1347(0);
        class174.method1207((byte) 83);
        class100.method761((byte) 58);
        class222.method1473(false);
        class28.method257(0);
        class144.method990(120);
        class258.method1741(arg0 ^ 0x15AF);
        class157.method1112();
        class129.method913(-125);
        class8.method98(arg0 - 17);
        class18.method179();
        class213.method1428(119);
        class175.method1211(29421);
        class181.method1242(16);
        class140.method964(true);
        class48.method447(-4070);
        class33.method351((byte) 109);
        class15.method133(1000);
        class155.method1071(false);
        class194.method1325();
        class55.method492(-2593);
        class269.method1787((byte) 106);
        class98.method743();
        class263.method1763((byte) 102);
        class229.method1514((byte) -68);
        class110.method819(arg0 + 23796);
        class86.method653();
        class62.method523(true);
        class68.method555((byte) 115);
        class124.method887(true);
        class12.method120((byte) -128);
        class192.method1297();
        class53.method474(104);
        class19.method197(65);
        class238.method1627(2);
        class153.method1052(-24442);
        class233.method1545(-58);
        class137.method950(true);
        class260.method1749(-121);
        class101.method764(0);
        class172.method1197(1689);
        class79.method606((byte) 46);
        class200.method1365(-16535);
        class193.method1318((byte) -125);
        class160.method1128((byte) -117);
        class49.method454(95);
        class223.method1482(0);
        class176.method1217(false);
        class261.method1753(0);
        class131.method928(0);
        class235.method1560((byte) 79);
        class211.method1415(118);
        class78.method599(true);
        class7.method85((byte) 96);
        class273.method1832(0);
        class150.method1016();
        class89.method682((byte) 124);
        class204.method1378((byte) -88);
        class90.method686(true);
        class220.method1468(arg0 ^ arg0);
        class122.method873((byte) -34);
        class179.method1237((byte) -56);
        class37.method380((byte) -86);
        class189.method1282(false);
        class117.method852(-128);
        class95.method711(60);
        class191.method1292(7823);
        class36.method375(arg0 + 4186);
        class114.method840(true);
        class212.method1417(3);
        class232.method1544(arg0 ^ 0x6A);
        class244.method1684((byte) -66);
        class254.method1719((byte) 84);
        class132.method931();
        class152.method1036(0);
        class242.method1677(arg0 ^ 0x4A);
        class63.method528(arg0 ^ 0x7C);
        class24.method217((byte) 110);
        class85.method650(0);
        class180.method1240(arg0 ^ 0x6F);
        class270.method1798((byte) 105);
        class44.method419(-128);
        class249.method1704(-24568);
        class186.method1272(115);
        class41.method409((byte) 121);
        class187.method1276(arg0 ^ 0x6C3A0EC2);
        class173.method1201();
        class104.method782(-29267);
        class206.method1383(true);
        class106.method790((byte) -123);
        class39.method403(122);
        class94.method698((byte) 75);
        class166.method1164(3);
        class54.method477(arg0 ^ 0x11);
        class218.method1459(false);
        class20.method199(-13938);
        class275.method1874((byte) 78);
        class190.method1286(5);
        class45.method423(-114);
        class23.method213((byte) -48);
        class70.method571(false);
        class247.method1692(0);
        class43.method413(arg0 - 15637);
        class241.method1673((byte) -73);
        class170.method1176((byte) -74);
        class268.method1784(true);
        class162.method1143(23713);
        class73.method575(arg0 ^ 0x76);
        class161.method1140();
        class120.method866(false);
        class31.method285(arg0 + 27563);
        class151.method1031(-111);
        class138.method953(-111);
        class203.method1374(106);
        class185.method1268(arg0 ^ 0xFFFFAD30);
        class251.method1706();
        class30.method279();
        class116.method849();
        class149.method1007(5886);
        class183.method1256(73);
        class264.method1765(false);
        class267.method1782();
        class5.method61();
        class182.method1247(true);
        class143.method984((byte) 119);
        class107.method798((byte) -98);
        class259.method1744(7595);
        class82.method639(0);
        class207.method1387((byte) 59);
        class83.method641(2000);
        class47.method433(0);
        class27.method243((byte) -95);
        class178.method1229((byte) 82);
        class108.method803((byte) 126);
        class227.method1512((byte) -9);
        class167.method1170((byte) -118);
        class111.method822(arg0 ^ 0xEB);
        class26.method238(-1);
        class205.method1381(105);
        class134.method932((byte) 106);
        class130.method919(arg0 ^ 0xFFFFF814);
        class208.method1392(0);
        class216.method1453((byte) -107);
        class245.method1687(96);
        class87.method666(69);
        class209.method1401(true);
        class56.method495(arg0 ^ 0x11);
        class169.method1174(true);
        class102.method774(-4);
        class14.method129((byte) -115);
        class148.method1004(-27283);
        class119.method861(-90);
        class125.method890(true);
        class199.method1360(false);
        class184.method1262(arg0 ^ 0x4B);
        class123.method880(-95);
        class164.method1149(1);
        class262.method1759((byte) 89);
        class99.method757(0);
        class158.method1121(-12118);
        class240.method1668(-2048);
        class112.method824(true);
        class127.method901(true);
        class21.method206((byte) -41);
        class74.method580(127);
        class177.method1221(arg0 + 26979);
        class118.method859(2);
        class234.method1559((byte) 18);
        class76.method589(494);
        class13.method126(-53);
        class147.method998((byte) 112);
        class142.method981(127);
        class188.method1279(true);
        class113.method831(true);
        class163.method1148((byte) -74);
        class22.method210(5);
        class51.method460(true);
        class226.method1506(arg0 + 4076);
        class252.method1709(1);
        class77.method594(true);
        class65.method538((byte) -83);
        class10.method111(false);
        class121.method869(8);
        class11.method115((byte) -74);
        class96.method720((byte) 113);
        class139.method958(8);
        class146.method996(0);
        class243.method1681((byte) 73);
        class105.method788((byte) -122);
        class57.method498(arg0 ^ 0xFFFFFFBA);
        class230.method1526(0);
        class197.method1352((byte) 84);
        class84.method644((byte) 48);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1048(int arg0) {
        field2704++;
        if (!class83.field1557) {
            label222: while (true) {
                do {
                    if (!class206.method1382(-118)) {
                        break label222;
                    }
                } while (class56.field1150 != 115 && class56.field1150 != 83);
                class83.field1557 = true;
            }
        }
        if (class254.field4368 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class181.method1244((byte) -113);
            if (class190.field3309 == 0L) {
                class190.field3309 = var4;
            }
            if (var3 > 16384 && (var4 - class190.field3309) < 5000L) {
                if (var4 - class275.field4829 > 1000L) {
                    System.gc();
                    class275.field4829 = var4;
                }
                class264.field4513 = 5;
                class108.field1931 = class272.field4693;
            } else {
                class108.field1931 = class73.field1407;
                class264.field4513 = 5;
                class254.field4368 = 10;
            }
        } else if (class254.field4368 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class146.field2613[var6] = new class25(104, 104);
            }
            class254.field4368 = 30;
            class108.field1931 = class252.field4343;
            class264.field4513 = 10;
        } else if (class254.field4368 == 30) {
            if (class195.field3392 == null) {
                class195.field3392 = new class6(class202.field3475, class247.field4308);
            }
            if (class195.field3392.method74(-16754)) {
                class105.field1854 = class254.method1717(true, 2, true, false, 0);
                class143.field2587 = class254.method1717(true, 2, true, false, 1);
                class177.field3123 = class254.method1717(false, arg0 - 27485, true, true, 2);
                class255.field4371 = class254.method1717(true, 2, true, false, 3);
                class108.field1928 = class254.method1717(true, 2, true, false, 4);
                class241.field4241 = class254.method1717(true, 2, true, true, 5);
                class151.field2685 = class254.method1717(true, 2, false, true, 6);
                class8.field118 = class254.method1717(true, arg0 - 27485, true, false, 7);
                class76.field1440 = class254.method1717(true, 2, true, false, 8);
                class21.field398 = class254.method1717(true, 2, true, false, 9);
                class223.field3825 = class254.method1717(true, 2, true, false, 10);
                class44.field969 = class254.method1717(true, arg0 - 27485, true, false, 11);
                class76.field1441 = class254.method1717(true, 2, true, false, 12);
                class104.field1842 = class254.method1717(true, 2, true, false, 13);
                class273.field4739 = class254.method1717(true, 2, false, false, 14);
                class97.field1750 = class254.method1717(true, 2, true, false, 15);
                class33.field721 = class254.method1717(true, 2, true, false, 16);
                class48.field1038 = class254.method1717(true, 2, true, false, 17);
                class210.field3575 = class254.method1717(true, arg0 - 27485, true, false, 18);
                class34.field746 = class254.method1717(true, 2, true, false, 19);
                class6.field63 = class254.method1717(true, 2, true, false, 20);
                class78.field1464 = class254.method1717(true, 2, true, false, 21);
                class160.field2882 = class254.method1717(true, arg0 ^ 0x6B5D, true, false, 22);
                class270.field4618 = class254.method1717(true, 2, true, true, 23);
                class58.field1193 = class254.method1717(true, 2, true, false, 24);
                class8.field139 = class254.method1717(true, 2, true, false, 25);
                class271.field4631 = class254.method1717(true, 2, true, true, 26);
                class254.field4368 = 40;
                class264.field4513 = 15;
                class108.field1931 = class256.field4400;
            } else {
                class108.field1931 = class227.field3894;
                class264.field4513 = 12;
            }
        } else if (class254.field4368 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class206.field3514[var8].method147(76) * class104.field1839[var8] / 100;
            }
            if (var7 == 100) {
                class108.field1931 = class35.field752;
                class264.field4513 = 20;
                class87.method669(class76.field1440, false);
                class41.method410(64, class76.field1440);
                class124.method886(arg0 - 52802, class76.field1440);
                class254.field4368 = 45;
            } else {
                if (var7 != 0) {
                    class108.field1931 = class238.method1626(new class237[] { class88.field1625, class14.method130(var7, (byte) 117), class175.field3070 }, arg0 - 27609);
                }
                class264.field4513 = 20;
            }
        } else if (class254.field4368 == 45) {
            class268.method1783(class141.field2499, 2, 10867, 22050);
            class243.field4262 = new class274();
            class243.field4262.method1837((byte) 79, 9, 128);
            class79.field1485 = class134.method933(class20.field379, 0, (byte) 93, class268.field4572, 22050);
            class79.field1485.method1078(90, class243.field4262);
            class158.method1122(class243.field4262, class97.field1750, class108.field1928, class273.field4739, arg0 ^ 0x6B5D);
            class131.field2312 = class134.method933(class20.field379, 1, (byte) 93, class268.field4572, 2048);
            class74.field1424 = new class75();
            class131.field2312.method1078(76, class74.field1424);
            class105.field1846 = new class202(22050, class255.field4372);
            class110.field1940 = class151.field2685.method1643(class189.field3298, (byte) -11);
            class264.field4513 = 30;
            class108.field1931 = class158.field2856;
            class254.field4368 = 50;
        } else if (class254.field4368 == 50) {
            int var9 = class169.method1173(17419, class104.field1842, class76.field1440);
            int var10 = class231.method1529((byte) 82);
            if (var10 > var9) {
                class108.field1931 = class238.method1626(new class237[] { class26.field477, class14.method130(var9 * 100 / var10, (byte) 117), class175.field3070 }, -49);
                class264.field4513 = 35;
            } else {
                class264.field4513 = 35;
                class254.field4368 = 60;
                class108.field1931 = class233.field4038;
            }
        } else if (class254.field4368 == 60) {
            int var11 = class36.method376(class76.field1440, -20097);
            int var12 = class115.method847((byte) 103);
            if (var12 > var11) {
                class108.field1931 = class238.method1626(new class237[] { class106.field1869, class14.method130(var11 * 100 / var12, (byte) 117), class175.field3070 }, -17);
                class264.field4513 = 40;
            } else {
                class254.field4368 = 65;
                class264.field4513 = 40;
                class108.field1931 = class164.field2927;
            }
        } else if (class254.field4368 == 65) {
            class51.method461(arg0 - 27597, class104.field1842, class76.field1440);
            class264.field4513 = 45;
            class108.field1931 = class127.field2222;
            class79.method610(5, (byte) 103);
            class254.field4368 = 70;
        } else if (class254.field4368 == 70) {
            class177.field3123.method1665((byte) -71);
            byte var13 = 0;
            int var14 = var13 + class177.field3123.method1663(true);
            class33.field721.method1665((byte) -64);
            int var15 = var14 + class33.field721.method1663(true);
            class48.field1038.method1665((byte) -37);
            int var16 = var15 + class48.field1038.method1663(true);
            class210.field3575.method1665((byte) -98);
            int var17 = var16 + class210.field3575.method1663(true);
            class34.field746.method1665((byte) -99);
            int var18 = var17 + class34.field746.method1663(true);
            class6.field63.method1665((byte) -65);
            int var19 = var18 + class6.field63.method1663(true);
            class78.field1464.method1665((byte) -76);
            int var20 = var19 + class78.field1464.method1663(true);
            class160.field2882.method1665((byte) -20);
            int var21 = var20 + class160.field2882.method1663(true);
            class58.field1193.method1665((byte) -124);
            int var22 = var21 + class58.field1193.method1663(true);
            class8.field139.method1665((byte) -33);
            int var23 = var22 + class8.field139.method1663(true);
            if (var23 < 1000) {
                class108.field1931 = class238.method1626(new class237[] { class272.field4682, class14.method130(var23 / 10, (byte) 117), class175.field3070 }, -106);
                class264.field4513 = 50;
            } else {
                class34.method359(31340, class177.field3123);
                class247.method1694(arg0 ^ 0xFFFF94D0, class177.field3123);
                class55.method491(class177.field3123, -6219);
                class184.method1260(class8.field118, class177.field3123, (byte) 30);
                class91.method691(class8.field118, class33.field721, -86, true);
                class125.method891(class8.field118, 104, class210.field3575);
                class203.method1375(class8.field118, class155.field2749, arg0 ^ 0x6B56, true, class34.field746);
                class221.method1470(class177.field3123, -1);
                class81.method631(class6.field63, class105.field1854, -127, class143.field2587);
                class54.method478(-113, class78.field1464, class8.field118);
                class262.method1760(-678727418, class160.field2882);
                class215.method1449(-124, class177.field3123);
                class158.method1120(class255.field4371, class104.field1842, class76.field1440, class8.field118, (byte) 105);
                class34.method357(-90, class177.field3123);
                class235.method1563(24871, class48.field1038);
                class33.method352((byte) 54, class8.field139, new class211(), class58.field1193);
                class100.method763(class8.field139, class58.field1193, (byte) -30);
                class108.field1931 = class138.field2390;
                class264.field4513 = 50;
                class240.method1672((byte) 88);
                class254.field4368 = 80;
            }
        } else if (class254.field4368 == 80) {
            int var24 = class38.method385(class76.field1440, (byte) 82);
            int var25 = class272.method1818(8);
            if (var24 < var25) {
                class108.field1931 = class238.method1626(new class237[] { class33.field715, class14.method130(var24 * 100 / var25, (byte) 117), class175.field3070 }, -63);
                class264.field4513 = 60;
            } else {
                class180.method1239(0, class76.field1440);
                class254.field4368 = 90;
                class108.field1931 = class223.field3834;
                class264.field4513 = 60;
            }
        } else if (class254.field4368 == 90) {
            if (class271.field4631.method1665((byte) -121)) {
                class7 var26 = new class7(class21.field398, class271.field4631, class76.field1440, 20, !class223.field3837);
                class150.method1021(var26);
                if (class10.field196 == 1) {
                    class150.method1026(0.9F);
                }
                if (class10.field196 == 2) {
                    class150.method1026(0.8F);
                }
                if (class10.field196 == 3) {
                    class150.method1026(0.7F);
                }
                if (class10.field196 == 4) {
                    class150.method1026(0.6F);
                }
                class264.field4513 = 70;
                class254.field4368 = 100;
                class108.field1931 = class130.field2270;
            } else {
                class108.field1931 = class238.method1626(new class237[] { class272.field4692, class14.method130(class271.field4631.method1663(true), (byte) 117), class175.field3070 }, -59);
                class264.field4513 = 70;
            }
        } else if (class254.field4368 == 100) {
            if (class123.method876(class76.field1440, (byte) 13)) {
                class254.field4368 = 110;
            }
        } else if (class254.field4368 == 110) {
            class70.field1385 = new class257();
            class268.field4572.method542(class70.field1385, arg0 ^ 0x6B5F, 10);
            class264.field4513 = 75;
            class254.field4368 = 120;
            class108.field1931 = class62.field1253;
        } else if (class254.field4368 == 120) {
            if (class223.field3825.method1644(class258.field4441, (byte) 102, class239.field4202)) {
                class89 var27 = new class89(class223.field3825.method1661(arg0 ^ 0xFFFFFF26, class258.field4441, class239.field4202));
                class260.method1750((byte) -56, var27);
                class254.field4368 = 130;
                class108.field1931 = class13.field217;
                class264.field4513 = 80;
            } else {
                class108.field1931 = class238.method1626(new class237[] { class167.field2953, class179.field3141 }, -60);
                class264.field4513 = 80;
            }
        } else if (class254.field4368 == 130) {
            if (!class255.field4371.method1665((byte) -53)) {
                class108.field1931 = class238.method1626(new class237[] { class51.field1080, class14.method130(class255.field4371.method1663(true) * 3 / 4, (byte) 117), class175.field3070 }, -62);
                class264.field4513 = 85;
            } else if (!class76.field1441.method1665((byte) -20)) {
                class108.field1931 = class238.method1626(new class237[] { class51.field1080, class14.method130(class76.field1441.method1663(true) / 10 + 75, (byte) 117), class175.field3070 }, -59);
                class264.field4513 = 85;
            } else if (!class104.field1842.method1665((byte) -65)) {
                class108.field1931 = class238.method1626(new class237[] { class51.field1080, class14.method130(class104.field1842.method1663(true) / 20 + 85, (byte) 117), class175.field3070 }, -54);
                class264.field4513 = 85;
            } else if (class270.field4618.method1649(class131.field2299, 0)) {
                class191.method1293(class221.field3805, class106.field1867, (byte) -117, class264.field4515, class270.field4618, class152.field2696, class36.field794);
                class254.field4368 = 135;
                class264.field4513 = 95;
                class108.field1931 = class31.field615;
            } else {
                class108.field1931 = class238.method1626(new class237[] { class51.field1080, class14.method130(class270.field4618.method1632(class131.field2299, 90) / 10 + 90, (byte) 117), class175.field3070 }, arg0 ^ 0xFFFF94CA);
                class264.field4513 = 85;
            }
        } else if (class254.field4368 == 135) {
            if (class155.method1070(arg0 - 27489)) {
                class254.field4368 = 140;
                class108.field1931 = class28.field566;
                class264.field4513 = 96;
            } else {
                class264.field4513 = 95;
                class108.field1931 = class62.field1239;
            }
        } else if (class254.field4368 == 140) {
            class269.field4605 = class255.field4371.method1643(class164.field2922, (byte) -93);
            class241.field4241.method1658(true, false, -103);
            class151.field2685.method1658(true, true, -98);
            class76.field1440.method1658(true, true, -99);
            class104.field1842.method1658(true, true, -87);
            class223.field3825.method1658(true, true, -50);
            class255.field4371.method1658(true, true, -109);
            class254.field4368 = 150;
            class264.field4513 = 97;
            class32.field698 = true;
            class108.field1931 = class234.field4049;
        } else if (class254.field4368 == 150) {
            if (class83.field1557) {
                class17.field298 = 0;
            }
            class83.field1557 = true;
            class128.method904(class268.field4572, 125);
            class221.method1471(false, -1, -1, (byte) -45, class17.field298);
            class254.field4368 = 160;
            class264.field4513 = 100;
            class108.field1931 = class68.field1333;
        } else if (class254.field4368 == 160) {
            class126.method893(true, (byte) 112);
        } else if (arg0 != 27487) {
            method1042((class141) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjh;II)V")
    public static final void method1049(int arg0, class271 arg1, int arg2, int arg3) {
        field2715++;
        if (arg1.field3722 == arg3 && arg3 != -1) {
            class256 var4 = class256.method1732(arg3, true);
            int var5 = var4.field4388;
            if (var5 == 1) {
                arg1.field3737 = 0;
                arg1.field3688 = arg2;
                arg1.field3684 = 0;
                arg1.field3673 = 0;
                class95.method706(arg1.field3700, class229.field3911 == arg1, arg1.field3673, (byte) 108, arg1.field3710, var4);
            }
            if (var5 == 2) {
                arg1.field3737 = 0;
            }
        } else if (arg3 == -1 || arg1.field3722 == -1 || class256.method1732(arg3, true).field4405 >= class256.method1732(arg1.field3722, true).field4405) {
            arg1.field3722 = arg3;
            arg1.field3684 = 0;
            arg1.field3703 = arg1.field3740;
            arg1.field3688 = arg2;
            arg1.field3737 = 0;
            arg1.field3673 = 0;
            if (arg1.field3722 != -1) {
                class95.method706(arg1.field3700, class229.field3911 == arg1, arg1.field3673, (byte) 116, arg1.field3710, class256.method1732(arg1.field3722, true));
            }
        }
        if (arg0 != 0) {
            method1042((class141) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILqe;IJ)Z")
    public static final boolean method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class43.method416(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
