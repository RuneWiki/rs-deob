import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class87 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Li;")
    public static class88 field561 = class208.method1425(105, "titlebox");

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field563 = 0;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field569 = -1;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Li;")
    public static class88 field570 = class208.method1425(105, "underlay)3dat");

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lnb;")
    public static class144 field567;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    public static boolean field576;

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method213(int arg0) {
        field573++;
        if (class151.field2940 >= 4) {
            this.method588((byte) -49, "js5crc");
            class229.field4286 = 1000;
            return;
        }
        if (class77.field1389 >= 4) {
            if (class229.field4286 <= 5) {
                this.method588((byte) -49, "js5io");
                class229.field4286 = 1000;
                return;
            }
            class77.field1389 = 3;
            class164.field3140 = 3000;
        }
        if (class164.field3140-- > 0) {
            return;
        }
        try {
            if (class244.field4495 == 0) {
                class62.field1151 = class126.field2326.method1290(class95.field1761, class168.field3248, arg0 ^ 0x5A);
                class244.field4495++;
            }
            if (class244.field4495 == 1) {
                if (class62.field1151.field3136 == 2) {
                    this.method217(-1, 1);
                    return;
                }
                if (class62.field1151.field3136 == 1) {
                    class244.field4495++;
                }
            }
            if (class244.field4495 == 2) {
                class190.field3682 = new class137((Socket) class62.field1151.field3131, class126.field2326);
                class46 var2 = new class46(5);
                var2.method346(255, 15);
                var2.method338(2112555600, 500);
                class190.field3682.method913(5, 0, var2.field842, 17492);
                class244.field4495++;
                class101.field1842 = class206.method1420(false);
            }
            if (class244.field4495 == 3) {
                if (class229.field4286 <= 5 || class190.field3682.method911(arg0 - 9) > 0) {
                    int var3 = class190.field3682.method918(0);
                    if (var3 != 0) {
                        this.method217(var3, 1);
                        return;
                    }
                    class244.field4495++;
                } else if (class206.method1420(false) - class101.field1842 > 30000L) {
                    this.method217(-2, 1);
                    return;
                }
            }
            if (class244.field4495 == 4) {
                class80.method529(class229.field4286 > 20, 113, class190.field3682);
                class244.field4495 = 0;
                class119.field2161 = 0;
                class62.field1151 = null;
                class190.field3682 = null;
            }
        } catch (IOException var4) {
            this.method217(-3, 1);
        }
        if (arg0 != 10) {
            field569 = -72;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method214(int arg0) {
        if (arg0 != 100) {
            this.init();
        }
        class117.field2110 = class120.field2194 = class7.field108 = class109.field1970 = new short[256];
        field574++;
        if (class47.field884 == 1) {
            class7.field96 = class99.field1812;
            class87.field1596 = class202.field3852;
            class146.field2752 = class70.field1265;
            class14.field219 = class202.field3855;
        } else {
            class14.field219 = class208.field3957;
            class146.field2752 = class88.field1601;
            class7.field96 = class217.field4064;
            class87.field1596 = class141.field2613;
        }
        class220.field4158 = class115.field2073 == 0 ? 43594 : class28.field470 + 40000;
        class49.field911 = class115.field2073 == 0 ? 443 : class28.field470 + 50000;
        class168.field3248 = class220.field4158;
        class204.method1403(-126);
        class143.method937((byte) 48, class154.field2977);
        class109.method750(class154.field2977, arg0 ^ 0x66);
        class167.field3224 = class35.method235((byte) 117);
        if (class167.field3224 != null) {
            class167.field3224.method173(64, class154.field2977);
        }
        class52.field941 = class181.field3581;
        try {
            if (class126.field2326.field3592 != null) {
                class18.field299 = new class119(class126.field2326.field3592, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class246.field4506[var2] = new class119(class126.field2326.field3586[var2], 6000, 0);
                }
                class104.field1894 = new class119(class126.field2326.field3584, 6000, 0);
                class167.field3225 = new class222(255, class18.field299, class104.field1894, 500000);
                class175.field3531 = new class119(class126.field2326.field3590, 24, 0);
                class126.field2326.field3586 = null;
                class126.field2326.field3584 = null;
                class126.field2326.field3590 = null;
                class126.field2326.field3592 = null;
            }
        } catch (IOException var3) {
            class104.field1894 = null;
            class18.field299 = null;
            class175.field3531 = null;
            class167.field3225 = null;
        }
        class147.field2754 = class132.field2468;
        if (class115.field2073 != 0) {
            class148.field2770 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method215(int arg0) {
        field570 = null;
        field567 = null;
        field561 = null;
        if (arg0 != -10) {
            field563 = 11;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public static final void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class67.field1207 <= arg6 - arg0 && class12.field183 >= arg6 + arg0 && class49.field919 <= arg3 - arg0 && class18.field279 >= arg0 + arg3) {
            class9.method46(arg1, arg6, arg2, arg0, arg4 + 14870, arg3, arg5);
        } else {
            class122.method829(arg1, arg3, arg2, arg0, arg6, arg5, (byte) 108);
        }
        if (arg4 != -14871) {
            method221(null, true, -32);
        }
        field565++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field559++;
        if (!this.method590(22541)) {
            return;
        }
        class28.field470 = Integer.parseInt(this.getParameter("worldid"));
        class139.field2586 = Integer.parseInt(this.getParameter("modewhat"));
        class115.field2073 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class64.method452((byte) 116);
        } else {
            class64.method451(64);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class67.field1215 = true;
        } else {
            class67.field1215 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class112.method769(161);
            class126.field2350 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class47.field884 = 1;
        } else {
            class47.field884 = 0;
        }
        try {
            class70.field1281 = Integer.parseInt(this.getParameter("js"));
            class143.field2659 = Integer.parseInt(this.getParameter("plug"));
            class4.field46 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class218.field4136 = class109.field1996.method608(this, 94);
        if (class218.field4136 == null) {
            class218.field4136 = class174.field3455;
        }
        class95.field1761 = this.getCodeBase().getHost();
        this.method593((byte) -49, 500, class139.field2586 + 32, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field562++;
        try {
            if (arg0.length != 7) {
                class114.method778(false);
            }
            class28.field470 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class115.field2073 = 0;
            } else if (arg0[1].equals("office")) {
                class115.field2073 = 1;
            } else if (arg0[1].equals("local")) {
                class115.field2073 = 2;
            } else {
                class114.method778(false);
            }
            if (arg0[2].equals("live")) {
                class139.field2586 = 0;
            } else if (arg0[2].equals("rc")) {
                class139.field2586 = 1;
            } else if (arg0[2].equals("wip")) {
                class139.field2586 = 2;
            } else {
                class114.method778(false);
            }
            if (arg0[3].equals("lowmem")) {
                class64.method452((byte) 123);
            } else if (arg0[3].equals("highmem")) {
                class64.method451(64);
            } else {
                class114.method778(false);
            }
            if (arg0[4].equals("free")) {
                class67.field1215 = false;
            } else if (arg0[4].equals("members")) {
                class67.field1215 = true;
            } else {
                class114.method778(false);
            }
            if (arg0[5].equals("english")) {
                class126.field2350 = 0;
            } else if (arg0[5].equals("german")) {
                class112.method769(161);
                class126.field2350 = 1;
            } else {
                class114.method778(false);
            }
            if (arg0[6].equals("game0")) {
                class47.field884 = 0;
            } else if (arg0[6].equals("game1")) {
                class47.field884 = 1;
            } else {
                class114.method778(false);
            }
            class4.field46 = 0;
            class218.field4136 = class174.field3455;
            class95.field1761 = "127.0.0.1";
            client var1 = new client();
            var1.method586(27, 503, 765, 500, class139.field2586 + 32, -11124, "runescape");
            class201.field3834.setLocation(40, 40);
        } catch (Exception var3) {
            class221.method1490((byte) 0, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method217(int arg0, int arg1) {
        class62.field1151 = null;
        class244.field4495 = 0;
        class190.field3682 = null;
        if (arg1 != 1) {
            field569 = 120;
        }
        class119.field2161++;
        if (class220.field4158 == class168.field3248) {
            class168.field3248 = class49.field911;
        } else {
            class168.field3248 = class220.field4158;
        }
        if (class119.field2161 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class229.field4286 > 5) {
                class164.field3140 = 3000;
            } else {
                this.method588((byte) -49, "js5connect_full");
                class229.field4286 = 1000;
            }
        } else if (class119.field2161 >= 2 && arg0 == 6) {
            this.method588((byte) -49, "js5connect_outofdate");
            class229.field4286 = 1000;
        } else if (class119.field2161 >= 4) {
            if (class229.field4286 <= 5) {
                this.method588((byte) -49, "js5connect");
                class229.field4286 = 1000;
            } else {
                class164.field3140 = 3000;
            }
        }
        field572++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method218(int arg0) {
        field564++;
        if (arg0 <= 100) {
            this.method214(80);
        }
        if (class219.field4145 != null) {
            class219.field4145.field717 = false;
        }
        class219.field4145 = null;
        if (class33.field556 != null) {
            class33.field556.method919(true);
            class33.field556 = null;
        }
        class120.method821(class154.field2977, 88);
        class116.method792((byte) -122, class154.field2977);
        if (class167.field3224 != null) {
            class167.field3224.method177(-99999999, class154.field2977);
        }
        class146.method977(52776016);
        class47.method362(3);
        class167.field3224 = null;
        if (class27.field458 != null) {
            class27.field458.method402(0);
        }
        if (class114.field2058 != null) {
            class114.field2058.method402(0);
        }
        class45.method290(0);
        class236.method1566(1);
        try {
            if (class18.field299 != null) {
                class18.field299.method819(-32103);
            }
            if (class246.field4506 != null) {
                for (int var2 = 0; var2 < class246.field4506.length; var2++) {
                    if (class246.field4506[var2] != null) {
                        class246.field4506[var2].method819(-32103);
                    }
                }
            }
            if (class104.field1894 != null) {
                class104.field1894.method819(-32103);
            }
            if (class175.field3531 != null) {
                class175.field3531.method819(-32103);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method219(byte arg0) {
        field560++;
        if (class32.field519 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class206.method1420(false);
            if (class1.field10 == 0L) {
                class1.field10 = var4;
            }
            if (var3 > 16384 && var4 - class1.field10 < 5000L) {
                if (var4 - class175.field3521 > 1000L) {
                    System.gc();
                    class175.field3521 = var4;
                }
                class6.field83 = 5;
                class209.field3965 = class58.field1093;
            } else {
                class32.field519 = 10;
                class6.field83 = 5;
                class209.field3965 = class177.field3551;
            }
        } else if (class32.field519 == 10) {
            class179.method1279(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class166.field3202[var6] = new class89(104, 104);
            }
            class6.field83 = 10;
            class209.field3965 = class10.field144;
            class32.field519 = 30;
        } else if (class32.field519 == 30) {
            class67.field1204 = class98.method686((byte) 38, 0, true, true, false);
            class223.field4203 = class98.method686((byte) -83, 1, true, true, false);
            class85.field1546 = class98.method686((byte) -100, 2, true, false, true);
            class89.field1671 = class98.method686((byte) 26, 3, true, true, false);
            class12.field172 = class98.method686((byte) -107, 4, true, true, false);
            class27.field451 = class98.method686((byte) 100, 5, true, true, true);
            class99.field1816 = class98.method686((byte) 77, 6, false, true, true);
            class233.field4367 = class98.method686((byte) 5, 7, true, true, false);
            class226.field4245 = class98.method686((byte) 32, 8, true, true, false);
            class66.field1193 = class98.method686((byte) -106, 9, true, true, false);
            class9.field137 = class98.method686((byte) 37, 10, true, true, false);
            class133.field2488 = class98.method686((byte) -89, 11, true, true, false);
            class18.field300 = class98.method686((byte) -106, 12, true, true, false);
            class98.field1795 = class98.method686((byte) 70, 13, true, true, false);
            class18.field280 = class98.method686((byte) -82, 14, false, true, false);
            class147.field2762 = class98.method686((byte) 77, 15, true, true, false);
            class109.field2006 = class98.method686((byte) 108, 16, true, true, false);
            class190.field3674 = class98.method686((byte) -123, 17, true, true, false);
            class161.field3115 = class98.method686((byte) 15, 18, true, true, false);
            class248.field4552 = class98.method686((byte) 47, 19, true, true, false);
            class196.field3773 = class98.method686((byte) -83, 20, true, true, false);
            class17.field274 = class98.method686((byte) 77, 21, true, true, false);
            class238.field4433 = class98.method686((byte) 97, 22, true, true, false);
            class130.field2442 = class98.method686((byte) 117, 23, true, true, true);
            class20.field321 = class98.method686((byte) -114, 24, true, true, false);
            class203.field3872 = class98.method686((byte) -118, 25, true, true, false);
            class155.field2996 = class98.method686((byte) -112, 26, true, true, true);
            class32.field519 = 40;
            class6.field83 = 15;
            class209.field3965 = class68.field1251;
        } else if (class32.field519 == 40) {
            byte var7 = 0;
            int var8 = var7 + class67.field1204.method115(true) * 4 / 100;
            int var9 = var8 + class223.field4203.method115(true) * 4 / 100;
            int var10 = var9 + class85.field1546.method115(true) / 100;
            int var11 = var10 + class89.field1671.method115(true) * 2 / 100;
            int var12 = var11 + class12.field172.method115(true) * 6 / 100;
            int var13 = var12 + class27.field451.method115(true) * 4 / 100;
            int var14 = var13 + class99.field1816.method115(true) * 2 / 100;
            int var15 = var14 + class233.field4367.method115(true) * 50 / 100;
            int var16 = var15 + class226.field4245.method115(true) * 2 / 100;
            int var17 = var16 + class66.field1193.method115(true) * 2 / 100;
            int var18 = var17 + class9.field137.method115(true) * 2 / 100;
            int var19 = var18 + class133.field2488.method115(true) * 2 / 100;
            int var20 = var19 + class18.field300.method115(true) * 2 / 100;
            int var21 = var20 + class98.field1795.method115(true) * 2 / 100;
            int var22 = var21 + class18.field280.method115(true) * 2 / 100;
            int var23 = var22 + class147.field2762.method115(true) * 2 / 100;
            int var24 = var23 + class109.field2006.method115(true) / 100;
            int var25 = var24 + class190.field3674.method115(true) / 100;
            int var26 = var25 + class161.field3115.method115(true) / 100;
            int var27 = var26 + class248.field4552.method115(true) / 100;
            int var28 = var27 + class196.field3773.method115(true) / 100;
            int var29 = var28 + class17.field274.method115(true) / 100;
            int var30 = var29 + class238.field4433.method115(true) / 100;
            int var31 = var30 + class130.field2442.method115(true) / 100;
            int var32 = var31 + class20.field321.method115(true) / 100;
            int var33 = var32 + class203.field3872.method115(true) / 100;
            int var34 = var33 + class155.field2996.method115(true) / 100;
            if (var34 == 100) {
                class6.field83 = 20;
                class209.field3965 = class247.field4517;
                class152.method1040(class99.field1816, class9.field137, 0, class226.field4245);
                class32.field519 = 45;
            } else {
                if (var34 != 0) {
                    class209.field3965 = class166.method1142(new class88[] { class14.field212, class170.method1214(var34, 54), class149.field2897 }, -3);
                }
                class6.field83 = 20;
            }
        } else if (class32.field519 == 45) {
            class44.method284(2, (byte) -104, !class245.field4499, 22050);
            class170 var35 = new class170();
            var35.method1211(9, 2059290670, 128);
            class27.field458 = class220.method1485(0, class154.field2977, class126.field2326, (byte) -120, 22050);
            class27.field458.method410(var35, 8);
            class165.method1136((byte) -124, class18.field280, var35, class12.field172, class147.field2762);
            class114.field2058 = class220.method1485(1, class154.field2977, class126.field2326, (byte) -23, 2048);
            class226.field4250 = new class224();
            class114.field2058.method410(class226.field4250, 8);
            class117.field2126 = new class179(22050, class11.field161);
            class32.field519 = 50;
            class209.field3965 = class31.field507;
            class6.field83 = 30;
        } else if (class32.field519 == 50) {
            int var36 = 0;
            if (class226.field4245.method946(class199.field3797, -1)) {
                var36++;
            }
            if (class226.field4245.method946(class158.field3047, -1)) {
                var36++;
            }
            if (class226.field4245.method946(class108.field1959, -1)) {
                var36++;
            }
            if (class98.field1795.method946(class199.field3797, -1)) {
                var36++;
            }
            if (class98.field1795.method946(class158.field3047, -1)) {
                var36++;
            }
            if (class98.field1795.method946(class108.field1959, -1)) {
                var36++;
            }
            if (var36 < 6) {
                class209.field3965 = class166.method1142(new class88[] { class115.field2078, class170.method1214(var36 * 100 / 6, -115), class149.field2897 }, -3);
                class6.field83 = 35;
            } else {
                class6.field83 = 35;
                class32.field519 = 60;
                class209.field3965 = class154.field2988;
            }
        } else if (class32.field519 == 60) {
            int var37 = class46.method330(class9.field137, (byte) -110, class226.field4245);
            int var38 = class104.method719((byte) 120);
            if (var37 < var38) {
                class209.field3965 = class166.method1142(new class88[] { class46.field817, class170.method1214(var37 * 100 / var38, 75), class149.field2897 }, -3);
                class6.field83 = 40;
            } else {
                class6.field83 = 40;
                class209.field3965 = class99.field1814;
                class32.field519 = 65;
            }
        } else if (class32.field519 == 65) {
            class49.field917 = class60.method429(class98.field1795, class226.field4245, class174.field3455, -118, class199.field3797);
            class154.field2968 = (class41) class49.field917;
            class3.field30 = class60.method429(class98.field1795, class226.field4245, class174.field3455, -91, class158.field3047);
            class54.field1011 = class60.method429(class98.field1795, class226.field4245, class174.field3455, -79, class108.field1959);
            class6.field83 = 45;
            class209.field3965 = class2.field24;
            class131.method883(5, 65536);
            class32.field519 = 70;
        } else if (class32.field519 == 70) {
            class85.field1546.method964((byte) 99);
            byte var39 = 0;
            int var40 = var39 + class85.field1546.method952(false);
            class109.field2006.method964((byte) 122);
            int var41 = var40 + class109.field2006.method952(false);
            class190.field3674.method964((byte) 123);
            int var42 = var41 + class190.field3674.method952(false);
            class161.field3115.method964((byte) 118);
            int var43 = var42 + class161.field3115.method952(false);
            class248.field4552.method964((byte) 104);
            int var44 = var43 + class248.field4552.method952(false);
            class196.field3773.method964((byte) 124);
            int var45 = var44 + class196.field3773.method952(false);
            class17.field274.method964((byte) 106);
            int var46 = var45 + class17.field274.method952(false);
            class238.field4433.method964((byte) 123);
            int var47 = var46 + class238.field4433.method952(false);
            class20.field321.method964((byte) 125);
            int var48 = var47 + class20.field321.method952(false);
            class203.field3872.method964((byte) 117);
            int var49 = var48 + class203.field3872.method952(false);
            if (var49 < 1000) {
                class209.field3965 = class166.method1142(new class88[] { class49.field918, class170.method1214(var49 / 10, -96), class149.field2897 }, -3);
                class6.field83 = 50;
            } else {
                class98.method688((byte) 104, class85.field1546);
                class137.method912((byte) 64, class85.field1546);
                class135.method900(class85.field1546, 28809);
                class199.method1366((byte) 113, class233.field4367, class85.field1546);
                class27.method166(class109.field2006, -70, class233.field4367, class67.field1215, class245.field4499);
                class47.method357(-96, class161.field3115, class233.field4367);
                class189.method1320(class67.field1215, class248.field4552, class154.field2968, class233.field4367, (byte) 17);
                class18.method91(class85.field1546, false);
                class45.method291(class196.field3773, (byte) -124, class67.field1204, class223.field4203);
                class211.method1445(94, class233.field4367, class17.field274);
                class180.method1284(class238.field4433, (byte) -32);
                class149.method1009(class85.field1546, 21644);
                class126.method858(class226.field4245, 95, class89.field1671, class98.field1795, class233.field4367);
                class190.method1326(class85.field1546, 99);
                class74.method502(2, class190.field3674);
                class153.method1047(class203.field3872, new class164(), class20.field321, (byte) -60);
                class189.method1318((byte) 111, class20.field321, class203.field3872);
                class209.field3965 = class214.field4042;
                class6.field83 = 50;
                class206.method1418(0);
                class32.field519 = 80;
            }
        } else if (class32.field519 == 80) {
            int var50 = 0;
            if (class47.field887 == null) {
                class169 var51 = class9.method49(class59.field1106, (byte) -123, class226.field4245, class174.field3455);
                if (var51 != null) {
                    var51.method1180();
                    class47.field887 = var51;
                }
            } else {
                var50++;
            }
            if (class240.field4462 == null) {
                class240.field4462 = class147.method983(2, class17.field260, class174.field3455, class226.field4245);
            } else {
                var50++;
            }
            if (class31.field505 == null) {
                class31.field505 = class3.method15(class1.field7, false, class174.field3455, class226.field4245);
            } else {
                var50++;
            }
            if (class145.field2720 == null) {
                class145.field2720 = class239.method1584(class144.field2666, true, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            if (class238.field4427 == null) {
                class238.field4427 = class239.method1584(class98.field1798, true, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            if (class130.field2430 == null) {
                class130.field2430 = class239.method1584(class106.field1923, true, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            if (class176.field3545 == null) {
                class176.field3545 = class239.method1584(class233.field4369, true, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            if (class227.field4259 == null) {
                class227.field4259 = class239.method1584(class142.field2624, true, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            if (class113.field2043 == null) {
                class169[] var52 = class3.method15(class39.field690, false, class174.field3455, class226.field4245);
                if (var52 != null) {
                    for (int var53 = 0; var53 < var52.length; var53++) {
                        var52[var53].method1180();
                    }
                    class113.field2043 = var52;
                }
            } else {
                var50++;
            }
            if (class200.field3828 == null) {
                class200.field3828 = class221.method1492(class237.field4413, class174.field3455, (byte) -47, class226.field4245);
            } else {
                var50++;
            }
            if (class154.field2984 == null) {
                class154.field2984 = class239.method1584(class227.field4253, true, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            if (class35.field597 == null) {
                class35.field597 = class239.method1584(class115.field2077, true, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            if (class7.field106 == null) {
                class7.field106 = class1.method2(class142.field2623, (byte) 124, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            if (class34.field587 == null) {
                class34.field587 = class1.method2(class240.field4461, (byte) 126, class226.field4245, class174.field3455);
            } else {
                var50++;
            }
            var50++;
            if (var50 < 15) {
                class209.field3965 = class166.method1142(new class88[] { class151.field2941, class170.method1214(var50 * 100 / 15, 56), class149.field2897 }, -3);
                class6.field83 = 60;
            } else {
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                class49.field917.method149(class34.field587, null);
                class3.field30.method149(class34.field587, null);
                int var57 = (int) (Math.random() * 41.0D) - 20;
                class54.field1011.method149(class34.field587, null);
                for (int var58 = 0; var58 < class31.field505.length; var58++) {
                    class31.field505[var58].method1160(var54 + var57, var56 + var57, var55 + var57);
                }
                class240.field4462[0].method1338(var54 + var57, var56 + var57, var55 + var57);
                class6.field83 = 60;
                class32.field519 = 90;
                class247.field4527 = class31.field505;
                class209.field3965 = class143.field2635;
            }
        } else if (class32.field519 != 90) {
            int var60 = -95 / ((41 - arg0) / 49);
            if (class32.field519 == 110) {
                class219.field4145 = new class42();
                class126.field2326.method1289(2, class219.field4145, 10);
                class209.field3965 = class200.field3831;
                class6.field83 = 75;
                class32.field519 = 120;
            } else if (class32.field519 == 120) {
                if (class9.field137.method948(114, class154.field2975, class174.field3455)) {
                    class214 var61 = new class214(class9.field137.method962(0, class154.field2975, class174.field3455));
                    class14.method69((byte) 85, var61);
                    class32.field519 = 130;
                    class209.field3965 = class85.field1547;
                    class6.field83 = 80;
                } else {
                    class209.field3965 = class166.method1142(new class88[] { class211.field4009, class200.field3816 }, -3);
                    class6.field83 = 80;
                }
            } else if (class32.field519 == 130) {
                if (!class89.field1671.method964((byte) 119)) {
                    class209.field3965 = class166.method1142(new class88[] { class71.field1322, class170.method1214(class89.field1671.method952(false) * 4 / 5, -119), class149.field2897 }, -3);
                    class6.field83 = 85;
                } else if (!class18.field300.method964((byte) 119)) {
                    class209.field3965 = class166.method1142(new class88[] { class71.field1322, class170.method1214(class18.field300.method952(false) / 6 + 80, -80), class149.field2897 }, -3);
                    class6.field83 = 85;
                } else if (class98.field1795.method964((byte) 108)) {
                    class6.field83 = 100;
                    class32.field519 = 140;
                    class209.field3965 = class24.field392;
                } else {
                    class209.field3965 = class166.method1142(new class88[] { class71.field1322, class170.method1214(class98.field1795.method952(false) / 20 + 96, -98), class149.field2897 }, -3);
                    class6.field83 = 85;
                }
            } else if (class32.field519 == 140) {
                class27.field451.method967(false, true, -17541);
                class99.field1816.method967(true, true, -17541);
                class226.field4245.method967(true, true, -17541);
                class98.field1795.method967(true, true, -17541);
                class9.field137.method967(true, true, -17541);
                class89.field1671.method967(true, true, -17541);
                class131.method883(10, 65536);
            }
        } else if (class155.field2996.method964((byte) 105)) {
            class68 var59 = new class68(class66.field1193, class155.field2996, class226.field4245, 20, class245.field4499);
            class173.method1238(var59);
            class173.method1226(0.7F);
            class209.field3965 = class138.field2571;
            class32.field519 = 110;
            class6.field83 = 70;
        } else {
            class209.field3965 = class166.method1142(new class88[] { class230.field4297, class170.method1214(class155.field2996.method952(false), -78), class149.field2897 }, -3);
            class6.field83 = 70;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method220(int arg0) {
        field568++;
        boolean var2 = false;
        boolean var3 = class142.method931(true);
        if (var3 && class110.field2014 && class27.field458 != null) {
            class27.field458.method401(-118);
        }
        if (class53.field971) {
            var2 = true;
            class53.field971 = false;
        }
        if (class229.field4286 == 0) {
            class166.method1144(-484, null, class209.field3965, var2, class6.field83);
        } else if (class229.field4286 == 5 || class229.field4286 == 10 || class229.field4286 == 20) {
            class188.method1312(class49.field917, (byte) 75, class54.field1011);
        } else if (class229.field4286 == 25) {
            if (class203.field3863 == 1) {
                if (class196.field3756 > class146.field2753) {
                    class146.field2753 = class196.field3756;
                }
                int var5 = (class146.field2753 - class196.field3756) * 50 / class146.field2753;
                method221(class166.method1142(new class88[] { class242.field4480, class31.field509, class170.method1214(var5, 49), class14.field216 }, -3), false, -22717);
            } else if (class203.field3863 == 2) {
                if (class113.field2047 > class143.field2654) {
                    class143.field2654 = class113.field2047;
                }
                int var4 = (class143.field2654 - class113.field2047) * 50 / class143.field2654 + 50;
                method221(class166.method1142(new class88[] { class242.field4480, class31.field509, class170.method1214(var4, 49), class14.field216 }, -3), false, arg0 - 38446);
            } else {
                method221(class242.field4480, false, -22717);
            }
        } else if (class229.field4286 == 30) {
            class245.method1607(arg0 ^ 0x3D71);
        } else if (class229.field4286 == 40) {
            method221(class166.method1142(new class88[] { class113.field2042, class142.field2620, class101.field1840 }, -3), false, arg0 - 38446);
        }
        if (arg0 != 15729) {
            field563 = -15;
        }
        Canvas var6 = class154.field2977;
        if (class229.field4286 == 30 && class134.field2505 == 0 && !var2) {
            try {
                Graphics var9 = var6.getGraphics();
                for (int var10 = 0; var10 < class206.field3925; var10++) {
                    if (class211.field4007[var10]) {
                        class202.field3854.method242((byte) 87, class80.field1447[var10], class133.field2487[var10], class132.field2473[var10], class81.field1455[var10], var9);
                        class211.field4007[var10] = false;
                    }
                }
            } catch (Exception var11) {
                var6.repaint();
            }
        } else if (class229.field4286 > 0) {
            try {
                Graphics var7 = var6.getGraphics();
                class202.field3854.method246(0, -14013488, 0, var7);
                for (int var8 = 0; var8 < class206.field3925; var8++) {
                    class211.field4007[var8] = false;
                }
            } catch (Exception var12) {
                var6.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Li;ZI)V")
    public static final void method221(class88 arg0, boolean arg1, int arg2) {
        field566++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class3.field30.method156(arg0, 250);
        if (arg2 != -22717) {
            return;
        }
        int var7 = class3.field30.method163(arg0, 250) * 13;
        class72.method478(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 0);
        class72.method476(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class3.field30.method153(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class126.method863(var3 + var7 + var3, var6 - -var3 + var3, var5 - var3, var4 - var3, (byte) -122);
        if (!arg1) {
            class129.method876(var4, var7, 0, var6, var5);
            return;
        }
        Canvas var8 = class154.field2977;
        try {
            Graphics var9 = var8.getGraphics();
            class202.field3854.method246(0, -14013488, 0, var9);
        } catch (Exception var10) {
            var8.repaint();
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method222(byte arg0) {
        class117.field2115++;
        if (class117.field2115 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class27.field454 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class70.field1259.setSeed((long) class27.field454);
        }
        this.method223(false);
        class45.method293(arg0 - 4344);
        field571++;
        class22.method107(false);
        class219.method1481(2);
        class48.method366(121);
        if (arg0 != -18) {
            field567 = null;
        }
        class204.method1399((byte) -125);
        if (class167.field3224 != null) {
            int var3 = class167.field3224.method176((byte) -59);
            class90.field1709 = var3;
        }
        if (class229.field4286 == 0) {
            this.method219((byte) 104);
            class108.method740(false);
        } else if (class229.field4286 == 5) {
            class50.method376((byte) 66, this);
            this.method219((byte) -17);
            class108.method740(false);
        } else if (class229.field4286 == 10) {
            class50.method376((byte) 66, this);
        } else if (class229.field4286 == 20) {
            class50.method376((byte) 66, this);
            class176.method1263((byte) -107);
        } else if (class229.field4286 == 25) {
            class184.method1299(false);
        }
        if (class229.field4286 == 30) {
            class116.method791(-100);
        } else if (class229.field4286 == 40) {
            class176.method1263((byte) -42);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method223(boolean arg0) {
        if (arg0) {
            field567 = null;
        }
        field558++;
        if (class229.field4286 != 1000) {
            boolean var2 = class99.method689(30203);
            if (!var2) {
                this.method213(10);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class238.field4431[arg0][var8][var14] == -class143.field2629) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class62.field1137[arg0][arg1][arg3] + arg5;
            if (!class104.method720(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class104.method720(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class104.method720(var9, var11, var13)) {
                return false;
            } else if (class104.method720(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class239.method1583(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class104.method720(var6 + 1, class62.field1137[arg0][arg1][arg3] + arg5, var7 + 1) && class104.method720(var6 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class104.method720(var6 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class104.method720(var6 + 1, class62.field1137[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method225(int arg0) {
        method215(-10);
        field575++;
        class88.method598(126);
        class87.method591(arg0 ^ 0x4D9A);
        class86.method582(14642);
        class228.method1524(arg0 - 1978971683);
        class42.method275((byte) -83);
        class118.method802(-1);
        class46.method354(0);
        class137.method910(-81);
        class22.method108(-6);
        class119.method813((byte) -119);
        class222.method1498(-22187);
        class191.method1331(-14327);
        class6.method32(false);
        class26.method159();
        class89.method648(3661);
        class188.method1315(true);
        class130.method882(-14445);
        class174.method1249((byte) -58);
        class44.method283((byte) -59);
        class248.method1616((byte) 106);
        class154.method1055(-1);
        class29.method178(arg0 - 16136);
        class71.method471(arg0 ^ 0xFFFFFF9B);
        class131.method886(true);
        class55.method414(false);
        class179.method1277(82);
        class209.method1435((byte) 61);
        class109.method754(arg0 - 99);
        class218.method1474(false);
        class159.method1073(false);
        class126.method865(arg0 ^ 0xFFFFFF9B);
        class168.method1151((byte) 113);
        class67.method461((byte) 109);
        class146.method978(false);
        class21.method104(-22);
        class24.method132((byte) -64);
        if (arg0 != 100) {
            return;
        }
        class223.method1503((byte) 96);
        class14.method68(95);
        class110.method762(true);
        class25.method136(true);
        class52.method386(3353893);
        class108.method738((byte) 9);
        class13.method66(arg0 ^ 0x1A);
        class145.method973(-126);
        class157.method1063(125);
        class64.method450(105);
        class166.method1143(34);
        class95.method679((byte) -65);
        class56.method415();
        class158.method1067(arg0 - 28216);
        class115.method786(0);
        class148.method994(-125);
        class136.method905((byte) -3);
        class144.method963(true);
        class92.method670((byte) -112);
        class82.method557();
        class210.method1438(108);
        class149.method1014(-96);
        class125.method847();
        class53.method392(-3976);
        class17.method80((byte) 103);
        class206.method1419((byte) -93);
        class10.method52(true);
        class31.method200(arg0 ^ 0xFFFFE2F8);
        class142.method933((byte) 75);
        class170.method1194((byte) -92);
        class151.method1032(arg0 ^ 0x6B2);
        class134.method897(false);
        class3.method14(-5);
        class70.method468(7);
        class161.method1085((byte) -73);
        class112.method771(arg0 ^ 0x65);
        class202.method1385((byte) -116);
        class97.method682((byte) 85);
        class99.method691(false);
        class59.method425((byte) -112);
        class127.method870(true);
        class40.method268();
        class105.method729(-109);
        class204.method1404(-12699);
        class201.method1379((byte) 117);
        class150.method1028((byte) 95);
        class4.method18((byte) -112);
        class7.method40((byte) 114);
        class37.method249(256);
        class237.method1570((byte) -35);
        class231.method1546(-27162);
        class176.method1264(20);
        class147.method989(4);
        class175.method1260(true);
        class129.method875(arg0 + 11504);
        class33.method212((byte) 103);
        class226.method1519(-32535);
        class229.method1532(-85);
        class114.method782((byte) 110);
        class47.method361((byte) 24);
        class205.method1408(-119);
        class164.method1129((byte) -105);
        class117.method800(true);
        class72.method492();
        class68.method463(-55);
        class199.method1365(false);
        class173.method1228();
        class214.method1457(-83);
        class54.method396((byte) -6);
        class49.method370((byte) 122);
        class16.method77((byte) 77);
        class177.method1269((byte) 85);
        class106.method736((byte) -77);
        class221.method1493(-124);
        class75.method504();
        class143.method934(true);
        class247.method1611((byte) -36);
        class98.method685(101);
        class39.method257(arg0 + 17378);
        class240.method1589((byte) 32);
        class141.method929(48);
        class217.method1471(67);
        class123.method834();
        class245.method1605((byte) -128);
        class233.method1552(-115);
        class77.method515((byte) 72);
        class18.method92((byte) 74);
        class192.method1337(false);
        class111.method768((byte) -58);
        class81.method539(true);
        class225.method1513(-115);
        class190.method1328(29073);
        class216.method1470(-306674912);
        class102.method708(arg0 ^ 0xFFFFEAF2);
        class66.method456(arg0 ^ 0xE4);
        class15.method76((byte) 106);
        class32.method206(-1);
        class36.method240(-111);
        class200.method1374(arg0 ^ 0xCBBD77EA);
        class93.method674(0);
        class1.method3(-84);
        class138.method921(-1);
        class84.method574();
        class185.method1306();
        class197.method1364();
        class239.method1582(false);
        class215.method1465();
        class165.method1138((byte) -103);
        class78.method521((byte) 123);
        class90.method658(true);
        class153.method1043(27958);
        class121.method827(0);
        class195.method1349();
        class100.method700();
        class35.method236((byte) 124);
        class238.method1578(0);
        class23.method125(false);
        class241.method1591((byte) 117);
        class230.method1540(0);
        class160.method1076(-112);
        class12.method59(true);
        class9.method47(arg0 + 16494);
        class8.method45(arg0 - 50);
        class172.method1219(true);
        class135.method898((byte) -1);
        class80.method531(1938883111);
        class28.method172(arg0 ^ 0x38C);
        class45.method294((byte) 127);
        class116.method789(-107);
        class171.method1218(false);
        class212.method1450(7400);
        class57.method420(-15);
        class220.method1486((byte) -97);
        class139.method925(-11875);
        class132.method890((byte) -94);
        class208.method1426((byte) -8);
        class180.method1283(arg0 ^ 0xFFFFEACE);
        class120.method824(15506);
        class211.method1442((byte) 60);
        class167.method1147(2);
        class58.method422(4080);
        class60.method430(500);
        class11.method57((byte) 81);
        class34.method228((byte) -56);
        class234.method1559(65367);
        class194.method1345((byte) -112);
        class152.method1041(arg0 ^ 0x12);
        class128.method872(-116);
        class62.method442((byte) -19);
        class232.method1550(100);
        class186.method1308(false);
        class133.method893(true);
        class113.method773(96);
        class184.method1301(-1230);
        class85.method575(-127);
        class2.method8((byte) -44);
        class43.method280(-19580);
        class196.method1362((byte) -113);
        class104.method718(-118);
        class79.method526(true);
        class207.method1424(26);
        class27.method171(false);
        class48.method365((byte) 16);
        class236.method1569((byte) -122);
        class246.method1609((byte) -26);
        class219.method1482((byte) -108);
        class227.method1521((byte) 60);
        class20.method97(64);
        class242.method1595((byte) -124);
        class101.method705(113);
        class65.method454(85);
        class244.method1601((byte) 77);
        class189.method1319(-1400);
        class156.method1061(0);
        class155.method1058((byte) -80);
        class50.method378(-8605);
        class203.method1394(236);
        class103.method715(492525772);
        class74.method503(16777215);
        class122.method831(1);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public static final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 26) {
            return;
        }
        int var6 = class156.method1060(class49.field919, class18.field279, -103, arg1);
        field557++;
        int var7 = class156.method1060(class49.field919, class18.field279, -126, arg2);
        int var8 = class156.method1060(class67.field1207, class12.field183, -106, arg4);
        int var9 = class156.method1060(class67.field1207, class12.field183, -113, arg5);
        for (int var10 = var6; var10 <= var7; var10++) {
            class230.method1536(var8, arg0, -7, var9, class3.field42[var10]);
        }
    }
}
