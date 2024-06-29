import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class285 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3931 = 2;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3928 = 0;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3939 = 0;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lsd;")
    public static class74 field3941 = new class74(72, 10);

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lrg;")
    public static class395 field3922;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lg;")
    public static class470 field3937;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
    public static int[] field3938;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 3)
    public final void method1655(byte arg0) {
        field3933++;
        if (class176.field2130) {
            class451.method2641((byte) 86);
        }
        if (class231.field3205 != null) {
            class231.field3205.method1754(1);
        }
        if (arg0 < 125) {
            this.method1674((byte) 38, -92);
        }
        if (class348.field4961 != null) {
            class470.method2766((byte) -102, class42.field512, class348.field4961);
            class348.field4961 = null;
        }
        if (class322.field4655 != null) {
            class322.field4655.method669(5000);
            class322.field4655 = null;
        }
        if (class117.field1446 != null) {
            class117.field1446.method1106(class126.field1542, 2);
        }
        class117.field1446 = null;
        if (class46.field594 != null) {
            class46.field594.method2652(-120);
        }
        if (class460.field6501 != null) {
            class460.field6501.method2652(-103);
        }
        class331.field4766.method1023((byte) 98);
        class178.field2157.method2402(27434);
        if (class99.field1213 != null) {
            class99.field1213.method2069((byte) -2);
            class99.field1213 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 55)
    private final void method1656(int arg0) {
        if (!class468.field6577) {
            for (int var2 = 0; var2 < class42.field506; var2++) {
                if (class257.field3719[var2].method1918(39) == 's' || class257.field3719[var2].method1918(arg0 ^ 0x22) == 'S') {
                    class468.field6577 = true;
                    break;
                }
            }
        }
        field3932++;
        if (arg0 != 2) {
            return;
        }
        if (class399.field5679 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class434.method2591(arg0 ^ 0xFFFFB490);
            if (class424.field6128 == 0L) {
                class424.field6128 = var5;
            }
            if (var4 > 16384 && (var5 - class424.field6128) < 5000L) {
                if ((var5 - class381.field5403) > 1000L) {
                    System.gc();
                    class381.field5403 = var5;
                }
                class192.field2647 = class262.field3776.method205((byte) 102, class68.field849);
                class297.field4421 = 5;
            } else {
                class192.field2647 = class62.field767.method205((byte) 109, class68.field849);
                class297.field4421 = 5;
                class399.field5679 = 10;
            }
        } else if (class399.field5679 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class174.field2093[var7] = class142.method674(true, class159.field1895, class289.field4316);
            }
            class192.field2647 = class302.field4484.method205((byte) 116, class68.field849);
            class297.field4421 = 10;
            class399.field5679 = 20;
        } else if (class399.field5679 == 20) {
            if (class41.field498 == null) {
                class41.field498 = new class422(class331.field4766, class178.field2157);
            }
            if (class41.field498.method2514(16969)) {
                class293.field4360 = class349.method2113(0, false, (byte) -76, 1, true);
                class474.field6660 = class349.method2113(1, false, (byte) -116, 1, true);
                class198.field2753 = class349.method2113(2, false, (byte) -105, 1, true);
                class17.field217 = class349.method2113(3, false, (byte) -59, 1, true);
                class90.field1129 = class349.method2113(4, false, (byte) -120, 1, true);
                class242.field3319 = class349.method2113(5, true, (byte) -65, 1, true);
                class93.field1162 = class349.method2113(6, true, (byte) -90, 1, false);
                class291.field4336 = class349.method2113(7, false, (byte) -96, 1, true);
                class171.field2022 = class349.method2113(8, false, (byte) -52, 1, true);
                class200.field2781 = class349.method2113(9, false, (byte) -116, 1, true);
                class313.field4568 = class349.method2113(10, false, (byte) -97, 1, true);
                class258.field3728 = class349.method2113(11, false, (byte) -78, 1, true);
                field3937 = class349.method2113(12, false, (byte) -91, 1, true);
                class39.field470 = class349.method2113(13, false, (byte) -50, 1, true);
                class74.field900 = class349.method2113(14, false, (byte) -77, 1, false);
                class4.field51 = class349.method2113(15, false, (byte) -76, 1, true);
                class83.field1012 = class349.method2113(16, false, (byte) -126, 1, true);
                class349.field5018 = class349.method2113(17, false, (byte) -116, 1, true);
                class438.field6283 = class349.method2113(18, false, (byte) -81, 1, true);
                class78.field936 = class349.method2113(19, false, (byte) -119, 1, true);
                class160.field1929 = class349.method2113(20, false, (byte) -66, 1, true);
                class443.field6325 = class349.method2113(21, false, (byte) -104, 1, true);
                class348.field4956 = class349.method2113(22, false, (byte) -97, 1, true);
                class353.field5071 = class349.method2113(23, true, (byte) -118, 1, true);
                class474.field6659 = class349.method2113(24, false, (byte) -59, 1, true);
                class310.field4541 = class349.method2113(25, false, (byte) -71, 1, true);
                class198.field2750 = class349.method2113(26, true, (byte) -67, 1, true);
                class76.field919 = class349.method2113(27, false, (byte) -107, 1, true);
                class28.field367 = class349.method2113(28, true, (byte) -61, 1, true);
                class192.field2647 = class422.field6095.method205((byte) 121, class68.field849);
                class399.field5679 = 30;
                class297.field4421 = 15;
            } else {
                class192.field2647 = class486.field6895.method205((byte) 112, class68.field849);
                class297.field4421 = 12;
            }
        } else if (class399.field5679 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class442.field6315[var9].method2849((byte) 105) * class471.field6636[var9] / 100;
            }
            if (var8 == 100) {
                class192.field2647 = class406.field5777.method205((byte) 120, class68.field849);
                class297.field4421 = 20;
                class397.method2376(class171.field2022, arg0 ^ 0x3C);
                class239.method1313(107, class171.field2022);
                class399.field5679 = 40;
            } else {
                if (var8 != 0) {
                    class192.field2647 = class45.field585.method205((byte) 112, class68.field849) + var8 + "%";
                }
                class297.field4421 = 20;
            }
        } else if (class399.field5679 == 40) {
            if (class28.field367.method2748((byte) -75)) {
                this.method1678(-125, class28.field367.method2779(1, 1));
                class192.field2647 = class362.field5216.method205((byte) 119, class68.field849);
                class297.field4421 = 25;
                class399.field5679 = 50;
            } else {
                class192.field2647 = class157.field1871.method205((byte) 119, class68.field849) + class28.field367.method2757((byte) 112) + "%";
                class297.field4421 = 25;
            }
        } else if (class399.field5679 == 50) {
            class78.method393(2, 22050, (byte) 84, class364.field5231);
            class216.field2978 = new class180();
            class216.field2978.method970(128, 255, 9);
            class46.field594 = class400.method2392(0, 22050, (byte) 86, class126.field1542, class42.field512);
            class46.field594.method2653(class216.field2978, (byte) -117);
            class476.method2815(class4.field51, class216.field2978, class74.field900, (byte) 18, class90.field1129);
            class460.field6501 = class400.method2392(1, 2048, (byte) 104, class126.field1542, class42.field512);
            class226.field3136 = new class107();
            class460.field6501.method2653(class226.field3136, (byte) -113);
            class185.field2435 = new class292(22050, class345.field4936);
            class364.field5233 = class93.field1162.method2761(arg0 ^ 0x2, "scape main");
            class192.field2647 = class249.field3504.method205((byte) 105, class68.field849);
            class399.field5679 = 60;
            class297.field4421 = 30;
        } else if (class399.field5679 == 60) {
            int var10 = class255.method1569((byte) 112, class171.field2022, class39.field470);
            int var11 = class361.method2200((byte) 29);
            if (var11 > var10) {
                class192.field2647 = class375.field5344.method205((byte) 113, class68.field849) + var10 * 100 / var11 + "%";
                class297.field4421 = 35;
            } else {
                class192.field2647 = class69.field854.method205((byte) 107, class68.field849);
                class399.field5679 = 70;
                class297.field4421 = 35;
            }
        } else if (class399.field5679 == 70) {
            int var12 = class364.method2210(class171.field2022, -58);
            int var13 = class150.method728((byte) -110);
            if (var12 < var13) {
                class192.field2647 = class278.field3967.method205((byte) 106, class68.field849) + var12 * 100 / var13 + "%";
                class297.field4421 = 40;
            } else {
                class192.field2647 = class414.field5902.method205((byte) 108, class68.field849);
                class399.field5679 = 80;
                class297.field4421 = 40;
            }
        } else if (class399.field5679 == 80) {
            if (class198.field2750.method2748((byte) 119)) {
                class314.field4583 = new class119(class198.field2750, class200.field2781, class171.field2022);
                class192.field2647 = class285.field4209.method205((byte) 110, class68.field849);
                class297.field4421 = 45;
                class399.field5679 = 90;
            } else {
                class192.field2647 = class229.field3175.method205((byte) 107, class68.field849) + class198.field2750.method2757((byte) 112) + "%";
                class297.field4421 = 45;
            }
        } else if (class399.field5679 == 90) {
            class192.field2647 = class175.field2102.method205((byte) 114, class68.field849);
            class399.field5679 = 95;
            class297.field4421 = 50;
        } else if (class399.field5679 == 95) {
            if (class468.field6577) {
                class262.field3766 = 1;
                class154.field1855 = 0;
                class46.field597 = 0;
                class401.field5719 = 0;
                class300.field4466 = 0;
            }
            class468.field6577 = true;
            class120.method582(arg0 - 4, class42.field512);
            class63.method322(class300.field4466, false, false);
            class192.field2647 = class353.field5069.method205((byte) 117, class68.field849);
            class297.field4421 = 55;
            class399.field5679 = 100;
        } else if (class399.field5679 == 100) {
            class182.method992(class231.field3205, (byte) 56, class171.field2022, class39.field470);
            class192.field2647 = class156.field1864.method205((byte) 104, class68.field849);
            class297.field4421 = 60;
            class404.method2413(false, 5);
            class399.field5679 = 110;
        } else if (class399.field5679 == 110) {
            byte var14 = 0;
            class198.field2753.method2748((byte) -66);
            int var15 = var14 + class198.field2753.method2757((byte) 112);
            class83.field1012.method2748((byte) 124);
            int var16 = var15 + class83.field1012.method2757((byte) 112);
            class349.field5018.method2748((byte) -110);
            int var17 = var16 + class349.field5018.method2757((byte) 112);
            class438.field6283.method2748((byte) 125);
            int var18 = var17 + class438.field6283.method2757((byte) 112);
            class78.field936.method2748((byte) -96);
            int var19 = var18 + class78.field936.method2757((byte) 112);
            class160.field1929.method2748((byte) -116);
            int var20 = var19 + class160.field1929.method2757((byte) 112);
            class443.field6325.method2748((byte) -98);
            int var21 = var20 + class443.field6325.method2757((byte) 112);
            class348.field4956.method2748((byte) 112);
            int var22 = var21 + class348.field4956.method2757((byte) 112);
            class474.field6659.method2748((byte) 73);
            int var23 = var22 + class474.field6659.method2757((byte) 112);
            class310.field4541.method2748((byte) 88);
            int var24 = var23 + class310.field4541.method2757((byte) 112);
            class76.field919.method2748((byte) -74);
            int var25 = var24 + class76.field919.method2757((byte) 112);
            if (var25 < 1100) {
                class192.field2647 = class302.field4487.method205((byte) 121, class68.field849) + var25 / 11 + "%";
                class297.field4421 = 65;
            } else {
                class422.field6084 = new class342(class289.field4317, class68.field849, class198.field2753);
                class415.field6001 = new class311(class289.field4317, class68.field849, class198.field2753);
                class319.field4642 = new class291(class289.field4317, class68.field849, class198.field2753, class171.field2022);
                class327.field4708 = new class301(class289.field4317, class68.field849, class349.field5018);
                class413.field5876 = new class75(class289.field4317, class68.field849, class198.field2753);
                class127.field1573 = new class418(class289.field4317, class68.field849, class198.field2753);
                class19.field254 = new class129(class289.field4317, class68.field849, class198.field2753, class291.field4336);
                class420.field6055 = new class390(class289.field4317, class68.field849, class198.field2753);
                class312.field4557 = new class153(class289.field4317, class68.field849, class198.field2753);
                class173.field2084 = new class382(class289.field4317, class68.field849, true, class83.field1012, class291.field4336);
                class47.field611 = new class302(class289.field4317, class68.field849, class198.field2753, class171.field2022);
                class44.field568 = new class237(class289.field4317, class68.field849, class198.field2753, class171.field2022);
                class390.field5575 = new class420(class289.field4317, class68.field849, true, class438.field6283, class291.field4336);
                class422.field6096 = new class18(class289.field4317, class68.field849, true, class422.field6084, class78.field936, class291.field4336);
                class424.field6126 = new class304(class289.field4317, class68.field849, class198.field2753);
                class175.field2103 = new class229(class289.field4317, class68.field849, class160.field1929, class293.field4360, class474.field6660);
                class128.field1576 = new class241(class289.field4317, class68.field849, class198.field2753);
                class459.field6482 = new class224(class289.field4317, class68.field849, class198.field2753);
                class234.field3258 = new class414(class289.field4317, class68.field849, class443.field6325, class291.field4336);
                class64.field811 = new class138(class289.field4317, class68.field849, class198.field2753);
                class278.field3965 = new class358(class289.field4317, class68.field849, class198.field2753);
                class173.field2088 = new class61(class289.field4317, class68.field849, class198.field2753);
                class269.field3860 = new class182(class289.field4317, class68.field849, class348.field4956);
                class75.field907 = new class350(class289.field4317, class68.field849, class198.field2753);
                class406.method2421(class39.field470, class17.field217, -79, class171.field2022, class291.field4336);
                class150.method727(class474.field6659, new class444(), true, class310.field4541);
                class334.method2030(class310.field4541, class474.field6659, 1);
                class192.field2647 = class315.field4611.method205((byte) 120, class68.field849);
                class297.field4421 = 65;
                class403.method2405((byte) -80);
                class173.field2084.method2294(0, !class420.method2503((byte) -110));
                class75.field909 = new class460();
                class244.method1330((byte) -54);
                class399.field5679 = 120;
            }
        } else if (class399.field5679 == 120) {
            int var26 = class345.method2094((byte) -19, class171.field2022);
            int var27 = class204.method1110((byte) -80);
            if (var26 < var27) {
                class192.field2647 = class82.field990.method205((byte) 101, class68.field849) + var26 * 100 / var27 + "%";
                class297.field4421 = 70;
            } else {
                class403.method2409(class171.field2022, arg0 ^ 0xFFFFFFC7, class231.field3205);
                class404.method2412(arg0 - 58, class83.field1014);
                class192.field2647 = class16.field210.method205((byte) 111, class68.field849);
                class297.field4421 = 70;
                class399.field5679 = 130;
            }
        } else if (class399.field5679 == 130) {
            class192.field2647 = class122.field1515.method205((byte) 100, class68.field849);
            class399.field5679 = 140;
            class297.field4421 = 75;
        } else if (class399.field5679 == 140) {
            if (class313.field4568.method2764("huffman", "", 339)) {
                class150 var28 = new class150(class313.field4568.method2753("huffman", (byte) -42, ""));
                class113.method543(var28, false);
                class192.field2647 = class147.field1782.method205((byte) 123, class68.field849);
                class399.field5679 = 150;
                class297.field4421 = 80;
            } else {
                class192.field2647 = class424.field6129.method205((byte) 106, class68.field849) + "0%";
                class297.field4421 = 80;
            }
        } else if (class399.field5679 == 150) {
            if (!class17.field217.method2748((byte) -111)) {
                class192.field2647 = class210.field2919.method205((byte) 127, class68.field849) + class17.field217.method2757((byte) 112) * 3 / 4 + "%";
                class297.field4421 = 85;
            } else if (!field3937.method2748((byte) -90)) {
                class192.field2647 = class210.field2919.method205((byte) 119, class68.field849) + (field3937.method2757((byte) 112) / 10 + 75) + "%";
                class297.field4421 = 85;
            } else if (!class39.field470.method2748((byte) 69)) {
                class192.field2647 = class210.field2919.method205((byte) 103, class68.field849) + (class39.field470.method2757((byte) 112) / 20 + 85) + "%";
                class297.field4421 = 85;
            } else if (class353.field5071.method2763("details", 3)) {
                class429.method2575(class353.field5071, class413.field5876, class127.field1573, class173.field2084, class47.field611, class44.field568, class75.field909);
                class399.method2389(class76.field919, arg0 ^ 0x7D);
                class79.method397(class314.field4583, 100, class291.field4336);
                class192.field2647 = class138.field1670.method205((byte) 114, class68.field849);
                class297.field4421 = 85;
                class399.field5679 = 160;
            } else {
                class192.field2647 = class210.field2919.method205((byte) 100, class68.field849) + (class353.field5071.method2782("details", arg0 - 2) / 10 + 90) + "%";
                class297.field4421 = 85;
            }
        } else if (class399.field5679 == 160) {
            int var29 = class462.method2720((byte) 70);
            if (var29 == -1) {
                class192.field2647 = class361.field5202.method205((byte) 122, class68.field849);
                class297.field4421 = 90;
            } else if (var29 == 7 || var29 == 9) {
                this.method1794("worldlistfull", (byte) 125);
                class404.method2413(false, 1000);
            } else if (class470.field6631) {
                class192.field2647 = class262.field3765.method205((byte) 120, class68.field849);
                class297.field4421 = 90;
                class399.field5679 = 170;
            } else {
                this.method1794("worldlistio_" + var29, (byte) 120);
                class404.method2413(false, 1000);
            }
        } else if (class399.field5679 == 170) {
            class44.field565 = new String[class278.field3965.field5170];
            class288.field4312 = new int[class173.field2088.field757];
            class190.field2599 = new boolean[class173.field2088.field757];
            for (int var30 = 0; var30 < class173.field2088.field757; var30++) {
                if (class173.field2088.method312(var30, false).field2969 == 0) {
                    class190.field2599[var30] = true;
                    class349.field5022++;
                }
                class288.field4312[var30] = -1;
            }
            class110.method522(0);
            class231.field3204 = class17.field217.method2761(arg0 ^ 0x2, "loginscreen");
            class242.field3319.method2780(false, true, arg0 ^ 0xFFFFFF80);
            class93.field1162.method2780(true, true, -116);
            class171.field2022.method2780(true, true, -124);
            class39.field470.method2780(true, true, -123);
            class313.field4568.method2780(true, true, -117);
            class17.field217.method2780(true, true, -126);
            class198.field2753.field6602 = 2;
            class398.field5663 = true;
            class349.field5018.field6602 = 2;
            class83.field1012.field6602 = 2;
            class438.field6283.field6602 = 2;
            class78.field936.field6602 = 2;
            class160.field1929.field6602 = 2;
            class443.field6325.field6602 = 2;
            class445.method2620(-1, class262.field3766, false, -4, -1);
            class192.field2647 = class282.field4104.method205((byte) 118, class68.field849);
            class297.field4421 = 95;
            class399.field5679 = 180;
        } else if (class399.field5679 == 180) {
            class171.method842(-1, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 594)
    public final void method1657(int arg0) {
        field3929++;
        if (class453.field6415 == 1000) {
            return;
        }
        class204.field2796++;
        if ((class204.field2796 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class199.field2768 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class82.field989.setSeed((long) class199.field2768);
        }
        if (class204.field2796 % 50 == 0) {
            class146.field1765 = class424.field6117;
            class424.field6117 = 0;
            class217.field3042 = class2.field14;
            class2.field14 = 0;
        }
        this.method1668(48);
        if (class41.field498 != null) {
            class41.field498.method2518(125);
        }
        class128.method610(3145);
        class199.method1094((byte) -47);
        if (arg0 != 21) {
            method1671();
        }
        class308.field4529.method1686(arg0 ^ 0xFFFFFF83);
        class278.field3966.method845((byte) 81);
        if (class117.field1446 != null) {
            int var3 = class117.field1446.method1108((byte) -62);
            class483.field6824 = var3;
        }
        if (class231.field3205 != null) {
            class231.field3205.method1350((int) class434.method2591(-19310));
        }
        class147.method699(127);
        class42.field506 = 0;
        for (class348 var4 = class308.field4529.method1685(16); var4 != null && class42.field506 < 128; var4 = class308.field4529.method1685(arg0 - 5)) {
            if (var4.method1923(4) != 1) {
                char var5 = var4.method1918(arg0 + 43);
                if (!class226.method1246(arg0 ^ 0xFFFFBBE4) || var5 != '`' && var5 != '§') {
                    class257.field3719[class42.field506] = var4;
                    class42.field506++;
                } else if (class457.method2692(-112)) {
                    class96.method472((byte) 87);
                } else {
                    class299.method1884(-109);
                }
            }
        }
        class361.field5205 = null;
        for (class100 var6 = class278.field3966.method833(arg0 - 7972); var6 != null; var6 = class278.field3966.method833(arg0 - 7972)) {
            int var7 = var6.method488((byte) 75);
            if (var7 == -1) {
                class392.field5583.method803(var6, 50);
            } else if (class3.method14(-1, var7)) {
                class361.field5205 = var6;
            }
        }
        if (class457.method2692(arg0 ^ 0xFFFFFFFD)) {
            class10.method76(true);
        }
        if (class453.field6415 == 0) {
            this.method1656(2);
            class192.method1053((byte) -91);
        } else if (class453.field6415 == 5) {
            this.method1656(arg0 ^ 0x17);
            class192.method1053((byte) -39);
        } else if (class453.field6415 == 25 || class453.field6415 == 28) {
            class99.method486(-23003);
        }
        if (class453.field6415 == 10) {
            this.method1659(false);
            class275.method1654(107);
            class94.method464(arg0 + 1003);
            class86.method440(12);
        } else if (class453.field6415 == 30) {
            class113.method542((byte) -10);
        } else if (class453.field6415 == 40) {
            class86.method440(arg0 ^ 0x19);
            if (class224.field3107 != -3 && class224.field3107 != 2 && class224.field3107 != 15) {
                class100.method491((byte) 123);
            }
        }
        class308.method1917(class231.field3205, true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 737)
    public static final void method1658() {
        for (int var0 = 0; var0 < class159.field1895; var0++) {
            int[] var1 = class417.field6014[var0];
            for (int var2 = 0; var2 < class289.field4316; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 754)
    private final void method1659(boolean arg0) {
        field3926++;
        class263.field3805++;
        class430.method2577(-1, 86, -1, (class256) null);
        class237.method1306(-1, (class256) null, (byte) 24, -1);
        class85.method431(-91);
        class129.field1601++;
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            class137 var12 = class448.field6366[var2];
            if (var12 != null) {
                byte var13 = var12.field1643.field6718;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method1012(false);
                    if ((var13 & 0x2) != 0 && var12.field2538 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field2539[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > (class159.field1895 - var14 - 1)) {
                                var17 = class159.field1895 - var14 - 1;
                            }
                            int var18 = var12.field2536[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (class289.field4316 - var14 - 1 < var18) {
                                var18 = class289.field4316 - var14 - 1;
                            }
                            int var19 = class420.method2500(128, class174.field2093[var12.field994], var14, var14, 0, 0, var12.field2536[0], var17, var12.field2539[0], true, var14, -1, class382.field5421, var18, class166.field1978);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field2539[var20] = class382.field5421[var19 - var20 - 1];
                                    var12.field2536[var20] = class166.field1978[var19 - var20 - 1];
                                    var12.field2531[var20] = 1;
                                }
                                var12.field2538 = var19;
                            }
                        }
                    }
                    class146.method693(var12, true, -1);
                    int var21 = class328.method1992((byte) 118, var12);
                    class39.method201(var12, class122.field1517, 4735, var21, class451.field6375);
                    class373.method2254(89, var12);
                }
            }
        }
        if (class354.field5089 == 0 && class56.field714 == 0) {
            if (class358.field5167 == 2) {
                class82.method418(8654);
            } else {
                class360.method2196((byte) -116);
            }
            if ((class58.field734 >> 7) < 14 || class58.field734 >> 7 >= class159.field1895 - 14 || (class351.field5047 >> 7) < 14 || class289.field4316 - 14 <= class351.field5047 >> 7) {
                class57.method296(true);
            }
        }
        while (true) {
            class35 var3;
            class256 var4;
            class256 var5;
            do {
                var3 = (class35) class205.field2808.method810(26315);
                if (var3 == null) {
                    while (true) {
                        class35 var6;
                        class256 var7;
                        class256 var8;
                        do {
                            var6 = (class35) class390.field5574.method810(26315);
                            if (var6 == null) {
                                while (true) {
                                    class35 var9;
                                    class256 var10;
                                    class256 var11;
                                    do {
                                        var9 = (class35) class12.field177.method810(26315);
                                        if (var9 == null) {
                                            if (class484.field6868 != null) {
                                                class204.method1118(false);
                                            }
                                            if ((class204.field2796 % 1500) == 0) {
                                                class325.method1979((byte) -102);
                                            }
                                            class371.method2244((byte) -116);
                                            if (class176.field2130 && class128.field1582 < class434.method2591(-19310) - 60000L) {
                                                class451.method2641((byte) 58);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field429;
                                        if (var10.field3568 < 0) {
                                            break;
                                        }
                                        var11 = class399.method2387(var10.field3646, -1857167024);
                                    } while (var11 == null || var11.field3643 == null || var10.field3568 >= var11.field3643.length || var11.field3643[var10.field3568] != var10);
                                    class396.method2371(var9);
                                }
                            }
                            var7 = var6.field429;
                            if (var7.field3568 < 0) {
                                break;
                            }
                            var8 = class399.method2387(var7.field3646, -1857167024);
                        } while (var8 == null || var8.field3643 == null || var8.field3643.length <= var7.field3568 || var8.field3643[var7.field3568] != var7);
                        class396.method2371(var6);
                    }
                }
                var4 = var3.field429;
                if (var4.field3568 < 0) {
                    break;
                }
                var5 = class399.method2387(var4.field3646, -1857167024);
            } while (var5 == null || var5.field3643 == null || var4.field3568 >= var5.field3643.length || var5.field3643[var4.field3568] != var4);
            class396.method2371(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lab;)Lmb;", line = 958)
    public static final class281 method1660(class256 arg0) {
        class281 var1 = (class281) class146.field1757.method233(116, ((long) arg0.field3659 << 32) + (long) arg0.field3568);
        return var1 == null ? arg0.field3699 : var1;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 963)
    public static void method1661(int arg0) {
        field3941 = null;
        field3938 = null;
        if (arg0 <= -62) {
            field3937 = null;
            field3922 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZZ)V", line = 976)
    public static final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class482.field6812 = arg0;
        class200.field2777 = 0x1 << class482.field6812;
        class137.field1663 = class200.field2777 >> 1;
        class93.field1159 = (int) Math.sqrt((double) (class137.field1663 * class137.field1663 + class137.field1663 * class137.field1663));
        class176.field2122 = arg2;
        class225.field3116 = arg3;
        class218.field3071 = arg4;
        class105.field1264 = new class263[arg1][class176.field2122][class225.field3116];
        class443.field6329 = new class443[arg1];
        if (arg5) {
            class275.field3914 = new int[class176.field2122][class225.field3116];
            class3.field24 = new byte[class176.field2122][class225.field3116];
            class419.field6040 = new byte[class176.field2122][class225.field3116];
            class159.field1901 = new class263[1][class176.field2122][class225.field3116];
            class361.field5208 = new class443[1];
        } else {
            class275.field3914 = null;
            class3.field24 = null;
            class419.field6040 = null;
            class159.field1901 = null;
            class361.field5208 = null;
        }
        if (arg6) {
            class382.field5424 = new long[arg1][arg2][arg3];
            class364.field5236 = new class326[65535];
            class323.field4671 = new boolean[65535];
            class10.field129 = 0;
        } else {
            class382.field5424 = null;
            class364.field5236 = null;
            class323.field4671 = null;
            class10.field129 = 0;
        }
        class270.method1634(false);
        class334.field4806 = new class85[500];
        class87.field1086 = 0;
        class388.field5563 = new class85[500];
        class174.field2095 = 0;
        class348.field4960 = new int[arg1][class176.field2122 + 1][class225.field3116 + 1];
        class413.field5880 = new class83[5000];
        class63.field782 = 0;
        class115.field1413 = new boolean[class218.field3071 + class218.field3071 + 1][class218.field3071 + class218.field3071 + 1];
        class241.field3311 = new boolean[class218.field3071 + class218.field3071 + 2][class218.field3071 + class218.field3071 + 2];
        class96.field1187 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1031)
    public final void method1663(int arg0) {
        field3923++;
        if (class453.field6415 == 1000 || arg0 != 4) {
            return;
        }
        long var2 = class249.method1513((byte) -55) / 1000000L - class257.field3716;
        class257.field3716 = class249.method1513((byte) -55) / 1000000L;
        boolean var4 = class187.method1009(true);
        if (var4 && class60.field756 && class46.field594 != null) {
            class46.field594.method2654(-25531);
        }
        if (class453.field6415 == 30 || class453.field6415 == 10) {
            if (class188.field2543 != 0L && class434.method2591(-19310) > class188.field2543) {
                class445.method2620(class282.field4111, class71.method366(79), false, -4, class92.field1143);
            } else if (class231.field3205.method1421() && class226.field3133) {
                class348.method2107(arg0 ^ 0x78);
            }
        }
        if (class348.field4961 == null) {
            Container var5;
            if (class41.field500 == null) {
                var5 = class42.field512.field5106;
            } else {
                var5 = class41.field500;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class41.field500 == var5) {
                Insets var8 = class41.field500.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class74.field898 != var6 || class119.field1473 != var7) {
                if (class231.field3205 == null || class231.field3205.method1438()) {
                    class90.method452(79);
                } else {
                    class74.field898 = var6;
                    class119.field1473 = var7;
                }
                class188.field2543 = class434.method2591(-19310) + 500L;
            }
        }
        if (class348.field4961 != null && !class87.field1087 && (class453.field6415 == 30 || class453.field6415 == 10)) {
            class445.method2620(-1, class262.field3766, false, -4, -1);
        }
        boolean var9 = false;
        if (class2.field9) {
            class2.field9 = false;
            var9 = true;
        }
        if (var9) {
            class85.method435(-1);
        }
        if (class231.field3205 != null && class231.field3205.method1481() || class71.method366(63) != 1) {
            class415.method2469((byte) 121);
        }
        if (class453.field6415 == 0) {
            class312.method1933(class297.field4421, class22.field299[class24.field318], -21572, var9, class343.field4907[class24.field318], class368.field5256[class24.field318], class192.field2647);
        } else if (class453.field6415 == 5) {
            class415.method2471(class101.field1230, class368.field5256[class24.field318].getRGB(), class231.field3205, arg0 ^ 0xFFFFFF88, class22.field299[class24.field318].getRGB(), var9 | class231.field3205.method1481(), class343.field4907[class24.field318].getRGB());
        } else if (class453.field6415 == 10) {
            class237.method1312(0);
        } else if (class453.field6415 == 25 || class453.field6415 == 28) {
            if (class148.field1808 == 1) {
                if (field3928 > class349.field5015) {
                    class349.field5015 = field3928;
                }
                int var10 = (class349.field5015 - field3928) * 50 / class349.field5015;
                class291.method1835(true, class273.field3875, class154.field1854.method205((byte) 123, class68.field849) + "<br>(" + var10 + "%)", false);
            } else if (class148.field1808 == 2) {
                if (class262.field3774 > class27.field363) {
                    class27.field363 = class262.field3774;
                }
                int var11 = (class27.field363 - class262.field3774) * 50 / class27.field363 + 50;
                class291.method1835(true, class273.field3875, class154.field1854.method205((byte) 125, class68.field849) + "<br>(" + var11 + "%)", false);
            } else {
                class291.method1835(true, class273.field3875, class154.field1854.method205((byte) 127, class68.field849), false);
            }
        } else if (class453.field6415 == 30) {
            class474.method2806(var2, arg0 + 27073);
        } else if (class453.field6415 == 40) {
            class291.method1835(true, class273.field3875, class291.field4333.method205((byte) 105, class68.field849) + "<br>" + class308.field4525.method205((byte) 119, class68.field849), false);
        }
        if (class17.field216 == 3) {
            for (int var12 = 0; var12 < class358.field5172; var12++) {
                Rectangle var13 = class18.field235[var12];
                if (class412.field5866[var12]) {
                    class231.field3205.method1759(-6923, var13.height, var13.width, var13.y, -1996553985, var13.x);
                } else if (class217.field2994[var12]) {
                    class231.field3205.method1759(-6923, var13.height, var13.width, var13.y, -1996554240, var13.x);
                }
            }
        }
        if (class457.method2692(-120)) {
            class392.method2352((byte) 70, class231.field3205);
        }
        if ((class453.field6415 == 30 || class453.field6415 == 10) && class17.field216 == 0 && class71.method366(arg0 ^ 0x75) == 1 && !var9 && class355.field5104.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class358.field5172; var15++) {
                if (class217.field2994[var15]) {
                    class217.field2994[var15] = false;
                    class458.field6450[var14++] = class18.field235[var15];
                }
            }
            class231.field3205.method1429(class458.field6450, var14);
        } else if (class453.field6415 != 0) {
            class231.field3205.method1477();
            for (int var16 = 0; var16 < class358.field5172; var16++) {
                class217.field2994[var16] = false;
            }
        }
        if (class217.field3010 == 0) {
            class85.method433(15L, 117);
        } else if (class217.field3010 == 1) {
            class85.method433(10L, arg0 ^ 0x73);
        } else if (class217.field3010 == 2) {
            class85.method433(5L, -92);
        } else if (class217.field3010 == 3) {
            class85.method433(2L, -46);
        }
        if (class398.field5663) {
            class392.method2354((byte) 114);
        }
        if (class468.field6577 && class453.field6415 == 10 && class57.field725 != -1) {
            class468.field6577 = false;
            class120.method582(arg0 ^ 0xFFFFFFFA, class42.field512);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1265)
    public static final void main(String[] arg0) {
        field3921++;
        try {
            if (arg0.length != 4) {
                class135.method642((byte) 106, "argument count");
            }
            class140.field1683 = Integer.parseInt(arg0[0]);
            class145.field1754 = class142.field1725;
            if (arg0[1].equals("live")) {
                class41.field494 = class193.field2655;
            } else if (arg0[1].equals("rc")) {
                class41.field494 = class160.field1921;
            } else if (arg0[1].equals("wip")) {
                class41.field494 = class158.field1891;
            } else {
                class135.method642((byte) 97, "modewhat");
            }
            class68.field849 = class382.method2291(arg0[2], true);
            if (class68.field849 == -1) {
                if (arg0[2].equals("english")) {
                    class68.field849 = 0;
                } else if (arg0[2].equals("german")) {
                    class68.field849 = 1;
                } else {
                    class135.method642((byte) -44, "language");
                }
            }
            class275.field3919 = false;
            class220.field3076 = false;
            if (arg0[3].equals("game0")) {
                class289.field4317 = class475.field6675;
            } else if (arg0[3].equals("game1")) {
                class289.field4317 = class262.field3772;
            } else {
                class135.method642((byte) 73, "game");
            }
            class24.field318 = class289.field4317.field6073;
            class344.field4926 = 0;
            class62.field772 = 0;
            class326.field4695 = "";
            class419.field6038 = true;
            class18.field238 = true;
            client var1 = new client();
            class310.field4546 = var1;
            var1.method1789(class41.field494.method6(116) + 32, class289.field4317.field6077, false, true, 768, 29, 1024, 574);
            class41.field500.setLocation(40, 40);
        } catch (Exception var3) {
            class144.method678(var3, true, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1330)
    public final void method1664(byte arg0) {
        field3935++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class90.method452(117);
        class178.field2157 = new class403(class42.field512);
        class331.field4766 = new class188();
        if (class414.field5904 != class145.field1754) {
            class382.field5432 = new byte[50][];
        }
        if (arg0 <= 54) {
            return;
        }
        class45.method231(class42.field512, 60);
        if (class414.field5904 == class145.field1754) {
            class104.field1258 = this.getCodeBase().getHost();
            class457.field6442 = 43594;
            class189.field2594 = 443;
        } else if (class35.method181(class145.field1754, 14)) {
            class104.field1258 = this.getCodeBase().getHost();
            class189.field2594 = class140.field1683 + 50000;
            class457.field6442 = class140.field1683 + 40000;
        } else if (class145.field1754 == class142.field1725) {
            class104.field1258 = "127.0.0.1";
            class189.field2594 = class140.field1683 + 50000;
            class457.field6442 = class140.field1683 + 40000;
        }
        class169.field2007 = class104.field1258;
        class302.field4488 = class457.field6442;
        class335.field4841 = class457.field6442;
        class236.field3268 = class189.field2594;
        class210.field2903 = class57.field727 = class153.field1834 = class138.field1677 = new short[256];
        if (class355.field5092 == 3) {
            class232.field3220 = class140.field1683;
        }
        if (class289.field4317 == class262.field3772) {
            class368.field5265 = class144.field1737;
            class224.field3100 = true;
            class481.field6798 = 0;
            class422.field6094 = class183.field2364;
            class178.field2155 = class148.field1795;
            class172.field2065 = 16777215;
            class78.field935 = class3.field31;
        } else {
            class368.field5265 = class352.field5050;
            class178.field2155 = class404.field5752;
            class422.field6094 = class399.field5692;
            class78.field935 = class418.field6023;
        }
        class463.field6529 = class302.field4488;
        class308.field4529 = class233.method1283(false, class126.field1542);
        class278.field3966 = class342.method2074(true, -78, class126.field1542);
        class117.field1446 = class135.method639(-118);
        if (class117.field1446 != null) {
            class117.field1446.method1107(class126.field1542, true);
        }
        class66.field827 = class355.field5092;
        try {
            if (class42.field512.field5101 != null) {
                class170.field2019 = new class274(class42.field512.field5101, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class348.field4958[var3] = new class274(class42.field512.field5102[var3], 6000, 0);
                }
                class432.field6245 = new class274(class42.field512.field5091, 6000, 0);
                class171.field2045 = new class398(255, class170.field2019, class432.field6245, 500000);
                class287.field4307 = new class274(class42.field512.field5093, 24, 0);
                class42.field512.field5091 = null;
                class42.field512.field5102 = null;
                class42.field512.field5101 = null;
                class42.field512.field5093 = null;
            }
        } catch (IOException var4) {
            class432.field6245 = null;
            class170.field2019 = null;
            class287.field4307 = null;
            class171.field2045 = null;
        }
        if (class414.field5904 != class145.field1754) {
            class327.field4709 = true;
        }
        class334.field4814 = (class475.field6675 == class289.field4317 ? class127.field1554 : class244.field3326).method205((byte) 102, class68.field849);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1447)
    public static final void method1665(int arg0) {
        int var1 = class438.field6286;
        int[] var2 = class79.field944;
        int var3 = class274.field3911 ? var1 : class356.field5112 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class187 var5;
            if (var4 < var1) {
                var5 = class46.field596[var2[var4]];
            } else {
                var5 = class448.field6366[class25.field353[var4 - var1]];
            }
            if (var5.field994 == arg0) {
                var5.field2475 = 0;
                if (var5.field2455 < 0) {
                    var5.field2503 = false;
                } else {
                    int var6 = var5.method1012(false);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1008 & 0x7F) != 0 || (var5.field1005 & 0x7F) != 0) {
                            var5.field2503 = false;
                            continue;
                        }
                    } else if ((var5.field1008 & 0x7F) != 64 || (var5.field1005 & 0x7F) != 64) {
                        var5.field2503 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1008 >> 7;
                        int var8 = var5.field1005 >> 7;
                        if (class417.field6014[var7][var8] != var5.field2455) {
                            var5.field2503 = true;
                            continue;
                        }
                        if (class299.field4462[var7][var8] > 1) {
                            var10002 = class299.field4462[var7][var8]--;
                            var5.field2503 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field1008 - var9 >> 7;
                        int var11 = var5.field1005 - var9 >> 7;
                        int var12 = var5.field1008 + var9 >> 7;
                        int var13 = var5.field1005 + var9 >> 7;
                        if (!class414.method2450(var13, var11, var10, 1, var12, var5.field2455)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class417.field6014[var14][var15] == var5.field2455) {
                                        var10002 = class299.field4462[var14][var15]--;
                                    }
                                }
                            }
                            var5.field2503 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class198 && var5.field2533 != null && class204.field2796 >= var5.field2533.field2114 && class204.field2796 < var5.field2533.field2126) {
                        ((class198) var5).field2711 = false;
                    }
                    var5.field2503 = false;
                    var5.field1001 = class375.method2264(-1547, var5.field1005, var5.field994, var5.field1008);
                    class223.method1232(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 1564)
    public final void method1666(byte arg0) {
        method1661(-73);
        field3925++;
        class230.method1274(14490);
        class299.method1886(-93);
        class89.method447(1067336200);
        class40.method206(-32542);
        class278.method1687(false);
        class356.method2177((byte) -50);
        class196.method1065(-2222);
        class147.method705((byte) -88);
        class485.method2870(128);
        class45.method238(-7);
        class285.method1788(true);
        class347.method2102(114);
        class2.method7(-64);
        class29.method151(true);
        class421.method2509((byte) -122);
        class327.method1986(35);
        class280.method1753((byte) -126);
        class231.method1277(-112);
        class460.method2716(116);
        class166.method808((byte) -70);
        class362.method2205(false);
        class142.method677(-6109);
        class188.method1031(true);
        class403.method2403((byte) 56);
        class422.method2517((byte) -109);
        class470.method2754(-126);
        class274.method1644(12027);
        class398.method2385(666584968);
        class210.method1177((byte) -77);
        class311.method1926(-92);
        class291.method1830(0);
        class301.method1891((byte) 91);
        class75.method381(0);
        class418.method2484(22437);
        class129.method615((byte) -112);
        class390.method2347(-125);
        class153.method741((byte) -81);
        class382.method2295(0);
        class302.method1895((byte) 104);
        class237.method1304(105);
        class420.method2504(0);
        class18.method113(2);
        class342.method2080(50);
        class304.method1904(127);
        class229.method1264((byte) 89);
        class241.method1322(16);
        class224.method1237(-1);
        class414.method2452((byte) 92);
        class138.method662(-28594);
        class358.method2190(82);
        class61.method314(-2401);
        class182.method987(false);
        class350.method2123(64);
        class137.method648(118);
        class331.method2007(-1);
        class74.method379(true);
        class340.method2066(1496702376);
        class424.method2523(113);
        class227.method1249(102);
        class318.method1955(16729);
        class388.method2344(false);
        class159.method769(-1453);
        class198.method1076(117);
        class249.method1512((byte) 120);
        class329.method1995((byte) 118);
        class180.method943(5972);
        class453.method2647((byte) 52);
        class292.method1842(83);
        class179.method910(4);
        class207.method1145((byte) -80);
        class187.method1019((byte) -118);
        class206.method1127(127);
        class263.method1602(17452);
        class140.method663(-116);
        class41.method208(-16099);
        class76.method388((byte) -122);
        class68.method347(111);
        class281.method1763(true);
        class72.method368((byte) -118);
        class313.method1937(-59);
        class345.method2093(-128);
        class406.method2422(-98);
        class352.method2137(false);
        class443.method2616(1);
        class46.method245(2048);
        class190.method1040(false);
        class77.method390(-95);
        class412.method2444(true);
        class27.method148(-31796);
        class335.method2033((byte) 28);
        class468.method2741(true);
        class288.method1822(1);
        class215.method1204(-80);
        class201.method1102(-13607);
        class79.method400(32765);
        class57.method297(false);
        class435.method2592((byte) 6);
        class448.method2629((byte) 51);
        class170.method829(false);
        class178.method875(24181);
        class131.method622((byte) -87);
        class160.method773(0);
        class186.method1006(21);
        class415.method2475(121);
        class324.method1974(false);
        if (arg0 >= -48) {
            field3937 = null;
        }
        class476.method2817(-114);
        class385.method2315(36);
        class28.method150(3);
        class369.method2231(83);
        class34.method174((byte) 117);
        class62.method316(22452);
        class108.method520(1);
        class283.method1777(-121);
        class289.method1823(104);
        class270.method1631((byte) 81);
        class213.method1197();
        class381.method2286(90);
        class146.method697(0);
        class169.method825(10);
        class479.method2835(-36);
        class242.method1326(1000000);
        class157.method757(20028);
        class156.method753(-56);
        class396.method2374();
        class429.method2567();
        class445.method2619(1);
        class21.method133(true);
        class209.method1156();
        class432.method2581(true);
        class334.method2022((byte) 122);
        class312.method1934(false);
        class344.method2089(false);
        class119.method576((byte) 87);
        class260.method1596((byte) -121);
        class189.method1036(-12);
        class145.method687((byte) -124);
        class307.method1912(-34);
        class349.method2119(true);
        class64.method326(-81);
        class112.method535(2);
        class233.method1281(79);
        class361.method2198((byte) 115);
        class337.method2047(-18316);
        class417.method2478((byte) -53);
        class162.method783(0);
        class105.method503(-19);
        class364.method2208((byte) 113);
        class478.method2829((byte) 62);
        class12.method93(6958);
        class323.method1968(0);
        class216.method1207((byte) 58);
        class36.method186((byte) 36);
        class199.method1091(true);
        class32.method170(8533);
        class37.method192(0);
        class244.method1328(32);
        class205.method1123(108);
        class150.method723(125);
        class22.method136(0);
        class120.method583(-2);
        class401.method2394(0);
        class81.method410();
        class220.method1229((byte) -80);
        class409.method2428((byte) 74);
        class239.method1317(30469);
        class265.method1608(-11306);
        class69.method349(-1);
        class346.method2095(1);
        class319.method1957(64);
        class257.method1582(0);
        class35.method176(-22341);
        class354.method2145((byte) -33);
        class83.method419(true);
        class78.method391(124);
        class451.method2640(0);
        class204.method1111(true);
        class380.method2279();
        class176.method865(256);
        class293.method1844((byte) 115);
        class85.method434(false);
        class326.method1983(0);
        class60.method310(-1);
        class287.method1820((byte) -125);
        class261.method1600(98);
        class183.method994(true);
        class248.method1508((byte) -55);
        class258.method1585(true);
        class125.method596((byte) 59);
        class353.method2144(true);
        class456.method2688(-22084);
        class458.method2694((byte) 35);
        class308.method1916((byte) 52);
        class223.method1231(128);
        class294.method1845(-1323174201);
        class48.method253(4);
        class399.method2388(0);
        class217.method1217((byte) 72);
        class172.method851(1206551841);
        class96.method473(true);
        class450.method2636((byte) 19);
        class370.method2238();
        class247.method1506(0);
        class368.method2226(-448482718);
        class357.method2180((byte) -28);
        class459.method2702(5890);
        class101.method493((byte) 73);
        class330.method2002(false);
        class173.method855(false);
        class17.method110(-17196);
        class24.method140(-2608);
        class484.method2859((byte) -106);
        class110.method525(false);
        class63.method321(-11726);
        class413.method2446(29822);
        class47.method251(17822);
        class490.method2883((byte) 98);
        class144.method682(8);
        class322.method1965(118);
        class410.method2430();
        class118.method571((byte) -125);
        class282.method1772((byte) 89);
        class464.method2733(0);
        class427.method2543((byte) 25);
        class171.method840(-116);
        class477.method2825(-13657);
        class480.method2838(-1);
        class474.method2805((byte) -62);
        class67.method344(-13);
        class42.method213(1);
        class375.method2265(-1);
        class339.method2054();
        class185.method1004(true);
        class66.method343(1);
        class218.method1224(-1);
        class20.method132(0);
        class127.method605(0);
        class44.method228((byte) -83);
        class181.method981(true);
        class4.method29((byte) 105);
        class117.method570(1);
        class314.method1940(-12);
        class297.method1872((byte) -86);
        class19.method124(false);
        class419.method2496(-126);
        class440.method2606((byte) 5);
        class103.method497((byte) 74);
        class333.method2019();
        class316.method1949();
        class430.method2579((byte) 123);
        class122.method589(true);
        class325.method1978((byte) 115);
        class373.method2257(-1);
        class363.method2206(false);
        class9.method59();
        class132.method631();
        class126.method599((byte) 27);
        class70.method359();
        class16.method109((byte) 120);
        class372.method2248(-97);
        class298.method1879(true);
        class174.method858((byte) -78);
        class305.method1905(6267);
        class273.method1639(25857);
        class487.method2880((byte) -14);
        class475.method2808(74);
        class90.method453((byte) 52);
        class236.method1302(24790);
        class39.method202(-92);
        class52.method280(true);
        class184.method1001(3205);
        class53.method284((byte) 93);
        class148.method712((byte) -56);
        class343.method2086((byte) -66);
        class392.method2353(false);
        class442.method2607(46);
        class82.method417(false);
        class200.method1097(-22064);
        class284.method1780(122);
        class367.method2216((byte) 59);
        class486.method2872((byte) 13);
        class56.method291(0);
        class93.method460(1435);
        class315.method1944(-128);
        class154.method743(28276);
        class208.method1155(true);
        class175.method859((byte) -108);
        class192.method1046(32768);
        class226.method1248(125);
        class31.method154(2);
        class404.method2414((byte) 104);
        class168.method821((byte) 118);
        class482.method2842(789221);
        class88.method443((byte) 124);
        class25.method144((byte) -66);
        class457.method2693(5713);
        class276.method1680(true);
        class438.method2602(1);
        class134.method634((byte) -109);
        class234.method1296(-4);
        class84.method424((byte) 123);
        class426.method2541(-48);
        class115.method566((byte) -128);
        class259.method1589(-1);
        class141.method666(-29361);
        class128.method609((byte) -20);
        class3.method11((byte) 25);
        class328.method1987(57);
        class86.method439((byte) 58);
        class360.method2195((byte) -96);
        class262.method1601(-110);
        class99.method485(120);
        class195.method1057(-29838);
        class94.method467(false);
        class279.method1727();
        class452.method2643();
        class471.method2785((byte) 20);
        class397.method2375(16711680);
        class408.method2427((byte) 101);
        class275.method1653(2000);
        class58.method304(0);
        class481.method2840((byte) 62);
        class214.method1200(-28827);
        class437.method2594(2);
        class240.method1318(0);
        class351.method2125(false);
        class251.method1556(true);
        class92.method457(102);
        class371.method2241(7);
        class348.method2105(false);
        class269.method1630((byte) 94);
        class463.method2727(false);
        class232.method1279(-1);
        class50.method266(8486);
        class158.method763(2);
        class310.method1924(1);
        class462.method2721(false);
        class80.method403(true);
        class193.method1054(127);
        class106.method507((byte) -84);
        class366.method2214(12);
        class104.method500(1324744908);
        class121.method584(27399);
        class73.method373(28127);
        class376.method2266((byte) 11);
        if (class285.field4224) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1921)
    public static final void method1667(int arg0) {
        int var1 = class438.field6286;
        int[] var2 = class79.field944;
        for (int var3 = 0; var3 < class356.field5112 + var1; var3++) {
            class187 var4;
            if (var3 < var1) {
                var4 = class46.field596[var2[var3]];
            } else {
                var4 = class448.field6366[class25.field353[var3 - var1]];
            }
            if (var4.field994 == arg0 && var4.field2455 >= 0) {
                int var5 = var4.method1012(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1008 & 0x7F) != 0 || (var4.field1005 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field1008 & 0x7F) != 64 || (var4.field1005 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1008 >> 7;
                    int var7 = var4.field1005 >> 7;
                    if (var4.field2455 > class417.field6014[var6][var7]) {
                        class417.field6014[var6][var7] = var4.field2455;
                        class299.field4462[var6][var7] = 1;
                    } else if (class417.field6014[var6][var7] == var4.field2455) {
                        var10002 = class299.field4462[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field1008 - var8 >> 7;
                    int var10 = var4.field1005 - var8 >> 7;
                    int var11 = var4.field1008 + var8 >> 7;
                    int var12 = var4.field1005 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field2455 > class417.field6014[var13][var14]) {
                                class417.field6014[var13][var14] = var4.field2455;
                                class299.field4462[var13][var14] = 1;
                            } else if (class417.field6014[var13][var14] == var4.field2455) {
                                var10002 = class299.field4462[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2020)
    public final void init() {
        field3940++;
        if (!this.method1791((byte) 31)) {
            return;
        }
        class140.field1683 = Integer.parseInt(this.getParameter("worldid"));
        class145.field1754 = class196.method1062(Integer.parseInt(this.getParameter("modewhere")), (byte) 95);
        if (!class35.method181(class145.field1754, 14) && class414.field5904 != class145.field1754) {
            class145.field1754 = class414.field5904;
        }
        class41.field494 = class128.method612(Integer.parseInt(this.getParameter("modewhat")), (byte) -112);
        if (class41.field494 != class158.field1891 && class41.field494 != class160.field1921 && class41.field494 != class193.field2655) {
            class41.field494 = class193.field2655;
        }
        try {
            class68.field849 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class68.field849 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class275.field3919 = true;
        } else {
            class275.field3919 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class220.field3076 = true;
        } else {
            class220.field3076 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class24.field330 = true;
        } else {
            class24.field330 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class289.field4317 = class262.field3772;
        } else {
            class289.field4317 = class475.field6675;
        }
        try {
            class62.field772 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class62.field772 = 0;
        }
        class89.field1117 = this.getParameter("quiturl");
        class326.field4695 = this.getParameter("settings");
        if (class326.field4695 == null) {
            class326.field4695 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class344.field4926 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class344.field4926 = 0;
            }
        }
        class24.field318 = Integer.parseInt(this.getParameter("colourid"));
        if (class24.field318 < 0 || class24.field318 >= class22.field299.length) {
            class24.field318 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class419.field6038 = true;
            class18.field238 = true;
        }
        if (class475.field6675 == class289.field4317) {
            class462.field6513 = 503;
            class48.field629 = 765;
        } else if (class289.field4317 == class262.field3772) {
            class48.field629 = 640;
            class462.field6513 = 480;
        }
        class310.field4546 = this;
        this.method1792(31, class41.field494.method6(-80) + 32, class48.field629, class462.field6513, 574);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2120)
    private final void method1668(int arg0) {
        field3936++;
        boolean var2 = class331.field4766.method1034((byte) -91);
        if (!var2) {
            this.method1670((byte) -127);
        }
        if (arg0 != 48) {
            field3937 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lab;IIIIIIIII)V", line = 2138)
    public static final void method1669(class256[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class256 var11 = arg0[var10];
            if (var11 != null && var11.field3646 == arg1) {
                int var12 = var11.field3703 + arg6;
                int var13 = var11.field3576 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field3654 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field3597 + var12;
                    int var19 = var11.field3707 + var13;
                    if (var11.field3654 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field3654 == 0 || var11.field3598 || method1660(var11).field4087 != 0 || class487.field6916 == var11 || class263.field3803 == var11.field3591) {
                    if (!method1675(var11)) {
                        if (class484.field6868 == var11) {
                            class183.field2365 = true;
                            class415.field5991 = var12;
                            class420.field6054 = var13;
                        }
                        if (var11.field3623 || var14 < var16 && var15 < var17) {
                            if (var11.field3654 == 0 && var11.field3609 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class35 var20 = (class35) class12.field177.method802((byte) 110); var20 != null; var20 = (class35) class12.field177.method806((byte) 104)) {
                                    if (var20.field434) {
                                        var20.method702((byte) -114);
                                        var20.field429.field3686 = false;
                                    }
                                }
                                if (class146.field1770 == 0) {
                                    class484.field6868 = null;
                                    class487.field6916 = null;
                                }
                                class318.field4628 = 0;
                                class206.field2835 = false;
                                class189.field2595 = false;
                                if (!class385.field5517) {
                                    class364.method2211(-128);
                                }
                            }
                            boolean var21;
                            if (class278.field3966.method837(-1) >= var14 && class278.field3966.method838(122) >= var15 && class278.field3966.method837(-1) < var16 && class278.field3966.method838(-88) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class385.field5517 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class280.method1762((byte) 48, arg9 - var13, var11, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class278.field3966.method834((byte) 110) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class361.field5205 != null && class361.field5205.method488((byte) 15) == 0 && class361.field5205.method490(0) >= var14 && class361.field5205.method487((byte) 96) >= var15 && class361.field5205.method490(0) < var16 && class361.field5205.method487((byte) 96) < var17) {
                                var23 = true;
                            }
                            if (var11.field3611 != null) {
                                for (int var24 = 0; var24 < var11.field3611.length; var24++) {
                                    if (class308.field4529.method1689((byte) -118, var11.field3611[var24])) {
                                        if (var11.field3688 == null || class204.field2796 >= var11.field3688[var24]) {
                                            byte var25 = var11.field3706[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class308.field4529.method1689((byte) -118, 86) && !class308.field4529.method1689((byte) -118, 82) && !class308.field4529.method1689((byte) -118, 81)) && ((var25 & 0x2) == 0 || class308.field4529.method1689((byte) -118, 86)) && ((var25 & 0x1) == 0 || class308.field4529.method1689((byte) -118, 82)) && ((var25 & 0x4) == 0 || class308.field4529.method1689((byte) -118, 81))) {
                                                class36.method187(var24 + 1, var11.field3659, 102, "", -1);
                                                int var26 = var11.field3630[var24];
                                                if (var11.field3688 == null) {
                                                    var11.field3688 = new int[var11.field3611.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field3688[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field3688[var24] = class204.field2796 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field3688 != null) {
                                        var11.field3688[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class337.method2043(class361.field5205.method487((byte) 96) - var13, class361.field5205.method490(0) - var12, (byte) -17, var11);
                            }
                            if (class484.field6868 != null && class484.field6868 != var11 && var21 && method1660(var11).method1766((byte) 36)) {
                                class261.field3763 = var11;
                            }
                            if (class487.field6916 == var11) {
                                class105.field1271 = true;
                                class404.field5750 = var12;
                                class297.field4435 = var13;
                            }
                            if (var11.field3598 || var11.field3591 != 0) {
                                if (var21 && class483.field6824 != 0 && var11.field3653 != null) {
                                    class35 var27 = new class35();
                                    var27.field434 = true;
                                    var27.field429 = var11;
                                    var27.field430 = class483.field6824;
                                    var27.field435 = var11.field3653;
                                    class12.field177.method803(var27, 50);
                                }
                                if (class484.field6868 != null || class385.field5517 || class21.field293 != var11.field3591 && class318.field4628 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field3591 != 0) {
                                    if (class437.field6276 == var11.field3591 || class305.field4502 == var11.field3591) {
                                        class187.field2526 = var11;
                                        if (class381.field5395 != null) {
                                            class381.field5395.method1041(var11.field3707, -75, class231.field3205);
                                        }
                                        if (class437.field6276 == var11.field3591) {
                                            if (!class385.field5517 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class362.method2204(arg9, class231.field3205, arg8, -27090);
                                                for (class13 var28 = (class13) class144.field1733.method2334(-108); var28 != null; var28 = (class13) class144.field1733.method2340(-105)) {
                                                    if (arg8 >= var28.field188 && arg8 < var28.field189 && arg9 >= var28.field184 && arg9 < var28.field185) {
                                                        class364.method2211(86);
                                                        class13.method98(var28.field194, (byte) -84);
                                                    }
                                                }
                                            }
                                            class430.method2577(var12, 103, var13, var11);
                                            continue;
                                        }
                                    }
                                    if (class263.field3803 == var11.field3591) {
                                        if (var11.method1576(class231.field3205, 18785) == null || class73.field890 != 0 && class73.field890 != 3 || class385.field5517 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field3573[var30];
                                        if (var29 < var31 || var29 > var11.field3634[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field3597 / 2;
                                        int var33 = var30 - var11.field3707 / 2;
                                        int var34;
                                        if (class358.field5167 == 4) {
                                            var34 = (int) class349.field5021 & 0x3FFF;
                                        } else {
                                            var34 = (int) class349.field5021 + class367.field5251 & 0x3FFF;
                                        }
                                        int var35 = class16.field212[var34];
                                        int var36 = class16.field214[var34];
                                        if (class358.field5167 != 4) {
                                            var35 = (class415.field6000 + 256) * var35 >> 8;
                                            var36 = (class415.field6000 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class358.field5167 == 4) {
                                            var39 = (class255.field3554 >> 7) + (var37 >> 2);
                                            var40 = (class369.field5280 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class19.field258.method1012(false) - 1) * 64;
                                            var39 = (class19.field258.field1008 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class19.field258.field1005 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class293.field4359 && (class284.field4135 & 0x40) != 0) {
                                            class256 var42 = class66.method339(class274.field3905, 0, class145.field1749);
                                            if (var42 == null) {
                                                class379.method2270((byte) -37);
                                            } else {
                                                method1672(1L, var39, 21, var11.field3585, class435.field6264, class390.field5570, var40, false, " ->", 7520, true);
                                            }
                                            continue;
                                        }
                                        if (class289.field4317 == class262.field3772) {
                                            method1672(1L, var39, 23, -1, -1, class214.field2958.method205((byte) 104, class68.field849), var40, false, "", 7520, true);
                                        }
                                        method1672(1L, var39, 9, -1, -1, class343.field4920, var40, false, "", 7520, true);
                                        continue;
                                    }
                                    if (class21.field293 == var11.field3591) {
                                        class289.field4318 = var11;
                                        if (var21) {
                                            class206.field2835 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class361.field5205.method490(0) - var12 - var11.field3597 / 2) * 2.0D / (double) class429.field6195);
                                            int var44 = (int) (-((double) (class361.field5205.method487((byte) 96) - var13 - var11.field3707 / 2) * 2.0D / (double) class429.field6195));
                                            int var45 = class486.field6898 + var43 + class429.field6205;
                                            int var46 = class17.field218 + var44 + class429.field6210;
                                            class227 var47 = class113.method546((byte) -116);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method1255(var48, var46, -107, var45);
                                            if (var48 != null) {
                                                if (class308.field4529.method1689((byte) -118, 82) && class369.field5285 > 0) {
                                                    class340.method2064(var48[2], var48[1], var48[0], -7207);
                                                    continue;
                                                }
                                                class189.field2595 = true;
                                                class362.field5220 = var48[0];
                                                class207.field2849 = var48[1];
                                                class82.field991 = var48[2];
                                            }
                                            class318.field4628 = 1;
                                            class298.field4444 = false;
                                            class101.field1231 = class278.field3966.method837(-1);
                                            class318.field4635 = class278.field3966.method838(121);
                                            continue;
                                        }
                                        if (var22 && class318.field4628 > 0) {
                                            if (class318.field4628 == 1 && (class101.field1231 != class278.field3966.method837(-1) || class318.field4635 != class278.field3966.method838(127))) {
                                                class140.field1688 = class486.field6898;
                                                class101.field1232 = class17.field218;
                                                class318.field4628 = 2;
                                            }
                                            if (class318.field4628 == 2) {
                                                class298.field4444 = true;
                                                class331.method2005(89, class140.field1688 + (int) ((double) (class101.field1231 - class278.field3966.method837(-1)) * 2.0D / (double) class429.field6192));
                                                class138.method658(-13903, class101.field1232 - (int) ((double) (class318.field4635 - class278.field3966.method838(-125)) * 2.0D / (double) class429.field6192));
                                            }
                                            continue;
                                        }
                                        if (class318.field4628 > 0 && !class298.field4444) {
                                            if ((class381.field5402 == 1 || class312.method1932(-1011)) && class223.field3099 > 2) {
                                                class480.method2836(class101.field1231, 0, class318.field4635);
                                            } else if (class78.method395(-1)) {
                                                class480.method2836(class101.field1231, 0, class318.field4635);
                                            }
                                        }
                                        class318.field4628 = 0;
                                        continue;
                                    }
                                    if (class196.field2679 == var11.field3591) {
                                        if (var22) {
                                            class78.method392(class278.field3966.method837(-1) - var12, (byte) -83, var11.field3597, class278.field3966.method838(127) - var13, var11.field3707);
                                        }
                                        continue;
                                    }
                                    if (class50.field656 == var11.field3591) {
                                        class237.method1306(var13, var11, (byte) 24, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field3689 && var23) {
                                    var11.field3689 = true;
                                    if (var11.field3702 != null) {
                                        class35 var49 = new class35();
                                        var49.field434 = true;
                                        var49.field429 = var11;
                                        var49.field433 = class361.field5205.method490(0) - var12;
                                        var49.field430 = class361.field5205.method487((byte) 96) - var13;
                                        var49.field435 = var11.field3702;
                                        class12.field177.method803(var49, 50);
                                    }
                                }
                                if (var11.field3689 && var22 && var11.field3586 != null) {
                                    class35 var50 = new class35();
                                    var50.field434 = true;
                                    var50.field429 = var11;
                                    var50.field433 = class278.field3966.method837(-1) - var12;
                                    var50.field430 = class278.field3966.method838(-45) - var13;
                                    var50.field435 = var11.field3586;
                                    class12.field177.method803(var50, 50);
                                }
                                if (var11.field3689 && !var22) {
                                    var11.field3689 = false;
                                    if (var11.field3697 != null) {
                                        class35 var51 = new class35();
                                        var51.field434 = true;
                                        var51.field429 = var11;
                                        var51.field433 = class278.field3966.method837(-1) - var12;
                                        var51.field430 = class278.field3966.method838(-123) - var13;
                                        var51.field435 = var11.field3697;
                                        class390.field5574.method803(var51, 50);
                                    }
                                }
                                if (var22 && var11.field3662 != null) {
                                    class35 var52 = new class35();
                                    var52.field434 = true;
                                    var52.field429 = var11;
                                    var52.field433 = class278.field3966.method837(-1) - var12;
                                    var52.field430 = class278.field3966.method838(-34) - var13;
                                    var52.field435 = var11.field3662;
                                    class12.field177.method803(var52, 50);
                                }
                                if (!var11.field3686 && var21) {
                                    var11.field3686 = true;
                                    if (var11.field3676 != null) {
                                        class35 var53 = new class35();
                                        var53.field434 = true;
                                        var53.field429 = var11;
                                        var53.field433 = class278.field3966.method837(-1) - var12;
                                        var53.field430 = class278.field3966.method838(126) - var13;
                                        var53.field435 = var11.field3676;
                                        class12.field177.method803(var53, 50);
                                    }
                                }
                                if (var11.field3686 && var21 && var11.field3698 != null) {
                                    class35 var54 = new class35();
                                    var54.field434 = true;
                                    var54.field429 = var11;
                                    var54.field433 = class278.field3966.method837(-1) - var12;
                                    var54.field430 = class278.field3966.method838(123) - var13;
                                    var54.field435 = var11.field3698;
                                    class12.field177.method803(var54, 50);
                                }
                                if (var11.field3686 && !var21) {
                                    var11.field3686 = false;
                                    if (var11.field3660 != null) {
                                        class35 var55 = new class35();
                                        var55.field434 = true;
                                        var55.field429 = var11;
                                        var55.field433 = class278.field3966.method837(-1) - var12;
                                        var55.field430 = class278.field3966.method838(-100) - var13;
                                        var55.field435 = var11.field3660;
                                        class390.field5574.method803(var55, 50);
                                    }
                                }
                                if (var11.field3590 != null) {
                                    class35 var56 = new class35();
                                    var56.field429 = var11;
                                    var56.field435 = var11.field3590;
                                    class205.field2808.method803(var56, 50);
                                }
                                if (var11.field3652 != null && class448.field6363 > var11.field3620) {
                                    if (var11.field3574 == null || class448.field6363 - var11.field3620 > 32) {
                                        class35 var61 = new class35();
                                        var61.field429 = var11;
                                        var61.field435 = var11.field3652;
                                        class12.field177.method803(var61, 50);
                                    } else {
                                        label672: for (int var57 = var11.field3620; var57 < class448.field6363; var57++) {
                                            int var58 = class153.field1837[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field3574.length; var59++) {
                                                if (var11.field3574[var59] == var58) {
                                                    class35 var60 = new class35();
                                                    var60.field429 = var11;
                                                    var60.field435 = var11.field3652;
                                                    class12.field177.method803(var60, 50);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3620 = class448.field6363;
                                }
                                if (var11.field3684 != null && class329.field4735 > var11.field3595) {
                                    if (var11.field3692 == null || class329.field4735 - var11.field3595 > 32) {
                                        class35 var66 = new class35();
                                        var66.field429 = var11;
                                        var66.field435 = var11.field3684;
                                        class12.field177.method803(var66, 50);
                                    } else {
                                        label648: for (int var62 = var11.field3595; var62 < class329.field4735; var62++) {
                                            int var63 = class94.field1181[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field3692.length; var64++) {
                                                if (var11.field3692[var64] == var63) {
                                                    class35 var65 = new class35();
                                                    var65.field429 = var11;
                                                    var65.field435 = var11.field3684;
                                                    class12.field177.method803(var65, 50);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3595 = class329.field4735;
                                }
                                if (var11.field3624 != null && class217.field3011 > var11.field3650) {
                                    if (var11.field3569 == null || class217.field3011 - var11.field3650 > 32) {
                                        class35 var71 = new class35();
                                        var71.field429 = var11;
                                        var71.field435 = var11.field3624;
                                        class12.field177.method803(var71, 50);
                                    } else {
                                        label624: for (int var67 = var11.field3650; var67 < class217.field3011; var67++) {
                                            int var68 = class474.field6655[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field3569.length; var69++) {
                                                if (var11.field3569[var69] == var68) {
                                                    class35 var70 = new class35();
                                                    var70.field429 = var11;
                                                    var70.field435 = var11.field3624;
                                                    class12.field177.method803(var70, 50);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3650 = class217.field3011;
                                }
                                if (var11.field3600 != null && class330.field4749 > var11.field3633) {
                                    if (var11.field3664 == null || class330.field4749 - var11.field3633 > 32) {
                                        class35 var76 = new class35();
                                        var76.field429 = var11;
                                        var76.field435 = var11.field3600;
                                        class12.field177.method803(var76, 50);
                                    } else {
                                        label600: for (int var72 = var11.field3633; var72 < class330.field4749; var72++) {
                                            int var73 = class236.field3266[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field3664.length; var74++) {
                                                if (var11.field3664[var74] == var73) {
                                                    class35 var75 = new class35();
                                                    var75.field429 = var11;
                                                    var75.field435 = var11.field3600;
                                                    class12.field177.method803(var75, 50);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3633 = class330.field4749;
                                }
                                if (var11.field3642 != null && class189.field2593 > var11.field3680) {
                                    if (var11.field3690 == null || class189.field2593 - var11.field3680 > 32) {
                                        class35 var81 = new class35();
                                        var81.field429 = var11;
                                        var81.field435 = var11.field3642;
                                        class12.field177.method803(var81, 50);
                                    } else {
                                        label576: for (int var77 = var11.field3680; var77 < class189.field2593; var77++) {
                                            int var78 = class224.field3111[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field3690.length; var79++) {
                                                if (var11.field3690[var79] == var78) {
                                                    class35 var80 = new class35();
                                                    var80.field429 = var11;
                                                    var80.field435 = var11.field3642;
                                                    class12.field177.method803(var80, 50);
                                                    break label576;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3680 = class189.field2593;
                                }
                                if (class340.field4877 > var11.field3602 && var11.field3577 != null) {
                                    class35 var82 = new class35();
                                    var82.field429 = var11;
                                    var82.field435 = var11.field3577;
                                    class12.field177.method803(var82, 50);
                                }
                                if (class205.field2807 > var11.field3602 && var11.field3579 != null) {
                                    class35 var83 = new class35();
                                    var83.field429 = var11;
                                    var83.field435 = var11.field3579;
                                    class12.field177.method803(var83, 50);
                                }
                                if (class430.field6227 > var11.field3602 && var11.field3601 != null) {
                                    class35 var84 = new class35();
                                    var84.field429 = var11;
                                    var84.field435 = var11.field3601;
                                    class12.field177.method803(var84, 50);
                                }
                                if (class122.field1521 > var11.field3602 && var11.field3561 != null) {
                                    class35 var85 = new class35();
                                    var85.field429 = var11;
                                    var85.field435 = var11.field3561;
                                    class12.field177.method803(var85, 50);
                                }
                                if (class360.field5190 > var11.field3602 && var11.field3661 != null) {
                                    class35 var86 = new class35();
                                    var86.field429 = var11;
                                    var86.field435 = var11.field3661;
                                    class12.field177.method803(var86, 50);
                                }
                                var11.field3602 = class129.field1601;
                                if (var11.field3606 != null) {
                                    for (int var87 = 0; var87 < class42.field506; var87++) {
                                        class35 var88 = new class35();
                                        var88.field429 = var11;
                                        var88.field420 = class257.field3719[var87].method1921((byte) -102);
                                        var88.field427 = class257.field3719[var87].method1918(53);
                                        var88.field435 = var11.field3606;
                                        class12.field177.method803(var88, 50);
                                    }
                                }
                                if (class84.field1018 && var11.field3617 != null) {
                                    class35 var89 = new class35();
                                    var89.field429 = var11;
                                    var89.field435 = var11.field3617;
                                    class12.field177.method803(var89, 50);
                                }
                            }
                            if (var11.field3654 == 5 && var11.field3640 != -1) {
                                var11.method1573(class459.field6482, -138675032, class128.field1576).method1041(var11.field3707, -117, class231.field3205);
                            }
                            class206.method1131(81, var11);
                            if (var11.field3654 == 0) {
                                method1669(arg0, var11.field3659, var14, var15, var16, var17, var12 - var11.field3638, var13 - var11.field3658, arg8, arg9);
                                if (var11.field3643 != null) {
                                    method1669(var11.field3643, var11.field3659, var14, var15, var16, var17, var12 - var11.field3638, var13 - var11.field3658, arg8, arg9);
                                }
                                class68 var90 = (class68) class369.field5270.method233(-85, (long) var11.field3659);
                                if (var90 != null) {
                                    if (class475.field6675 == class289.field4317 && var90.field844 == 0 && !class385.field5517 && var21 && !class192.field2640) {
                                        class364.method2211(-127);
                                    }
                                    class51.method271(var12, arg8, var14, var17, var13, var16, var90.field850, true, var15, arg9);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class206.method1131(126, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 3015)
    private final void method1670(byte arg0) {
        field3934++;
        if (class331.field4766.field2570 > class319.field4640) {
            class261.field3764 = (class331.field4766.field2570 * 50 - 50) * 5;
            if (class463.field6529 == class335.field4841) {
                class463.field6529 = class236.field3268;
            } else {
                class463.field6529 = class335.field4841;
            }
            if (class261.field3764 > 3000) {
                class261.field3764 = 3000;
            }
            if (class331.field4766.field2570 >= 2 && class331.field4766.field2567 == 6) {
                this.method1794("js5connect_outofdate", (byte) 125);
                class453.field6415 = 1000;
                return;
            }
            if (class331.field4766.field2570 >= 4 && class331.field4766.field2567 == -1) {
                this.method1794("js5crc", (byte) 117);
                class453.field6415 = 1000;
                return;
            }
            if (class331.field4766.field2570 >= 4 && (class453.field6415 == 0 || class453.field6415 == 5)) {
                if (class331.field4766.field2567 == 7 || class331.field4766.field2567 == 9) {
                    this.method1794("js5connect_full", (byte) 119);
                } else if (class331.field4766.field2567 <= 0) {
                    this.method1794("js5io", (byte) 121);
                } else {
                    this.method1794("js5connect", (byte) 120);
                }
                class453.field6415 = 1000;
                return;
            }
        }
        class319.field4640 = class331.field4766.field2570;
        if (class261.field3764 > 0) {
            class261.field3764--;
            return;
        }
        try {
            if (class428.field6178 == 0) {
                class215.field2965 = class42.field512.method2175(class463.field6529, (byte) 32, class169.field2007);
                class428.field6178++;
            }
            if (arg0 < -108) {
                if (class428.field6178 == 1) {
                    if (class215.field2965.field5759 == 2) {
                        this.method1674((byte) 97, 1000);
                        return;
                    }
                    if (class215.field2965.field5759 == 1) {
                        class428.field6178++;
                    }
                }
                if (class428.field6178 == 2) {
                    class315.field4608 = new class142((Socket) class215.field2965.field5755, class42.field512);
                    class179 var2 = new class179(5);
                    var2.method909(class214.field2948.field4563, -1);
                    var2.method897(574, -108);
                    class315.field4608.method675(5, 0, (byte) 88, var2.field2159);
                    class428.field6178++;
                    class60.field754 = class434.method2591(-19310);
                }
                if (class428.field6178 == 3) {
                    if (class453.field6415 == 0 || class453.field6415 == 5 || class315.field4608.method676((byte) -49) > 0) {
                        int var3 = class315.field4608.method673(-2101);
                        if (var3 != 0) {
                            this.method1674((byte) 97, var3);
                            return;
                        }
                        class428.field6178++;
                    } else if (class434.method2591(-19310) - class60.field754 > 30000L) {
                        this.method1674((byte) 97, 1001);
                        return;
                    }
                }
                if (class428.field6178 == 4) {
                    boolean var4 = class453.field6415 == 5 || class453.field6415 == 10 || class453.field6415 == 28;
                    class331.field4766.method1022(!var4, class315.field4608, (byte) -70);
                    class428.field6178 = 0;
                    class215.field2965 = null;
                    class315.field4608 = null;
                }
            }
        } catch (IOException var5) {
            this.method1674((byte) 97, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 3159)
    public static final void method1671() {
        int var0 = class438.field6286;
        int[] var1 = class79.field944;
        int var2 = class274.field3911 ? var0 : class356.field5112 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class187 var4;
            if (var3 < var0) {
                var4 = class46.field596[var1[var3]];
            } else {
                var4 = class448.field6366[class25.field353[var3 - var0]];
            }
            if (var4.field2455 >= 0) {
                int var5 = var4.method1012(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1008 & 0x7F) == 0 && (var4.field1005 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field1008 & 0x7F) == 64 && (var4.field1005 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class198 && var4.field2533 != null && class204.field2796 >= var4.field2533.field2114 && class204.field2796 < var4.field2533.field2126) {
                    ((class198) var4).field2711 = false;
                }
                var4.field1001 = class375.method2264(-1547, var4.field1005, var4.field994, var4.field1008);
                class223.method1232(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JIIIILjava/lang/String;IZLjava/lang/String;IZ)V", line = 3203)
    public static final void method1672(long arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, boolean arg7, String arg8, int arg9, boolean arg10) {
        field3920++;
        if (class385.field5517 || class223.field3099 >= 500) {
            return;
        }
        int var12 = arg4 == -1 ? class283.field4126 : arg4;
        class158 var13 = new class158(arg5, arg8, var12, arg2, arg3, arg0, arg1, arg6, arg10, arg7);
        class485.field6882.method803(var13, 50);
        class223.field3099++;
        if (arg9 != 7520) {
            method1679();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lab;)Lab;", line = 3223)
    public static final class256 method1673(class256 arg0) {
        int var1 = method1660(arg0).method1769((byte) 65);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class399.method2387(arg0.field3646, -1857167024);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 3246)
    private final void method1674(byte arg0, int arg1) {
        class331.field4766.field2570++;
        if (arg0 != 97) {
            return;
        }
        class315.field4608 = null;
        field3927++;
        class428.field6178 = 0;
        class331.field4766.field2567 = arg1;
        class215.field2965 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lab;)Z", line = 3271)
    public static final boolean method1675(class256 arg0) {
        if (class192.field2640) {
            if (method1660(arg0).field4087 != 0) {
                return false;
            }
            if (arg0.field3654 == 0) {
                return false;
            }
        }
        return arg0.field3656;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I", line = 3287)
    public static final int method1676(int arg0, int arg1) {
        if (arg0 >= -44) {
            method1677();
        }
        field3924++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 3299)
    public static final void method1677() {
        class388.field5559 = 0;
        for (int var0 = 0; var0 < class356.field5112; var0++) {
            class137 var1 = class448.field6366[class25.field353[var0]];
            if (var1.field2503 && var1.method652((byte) 56) != -1) {
                int var2 = (var1.method1012(false) - 1) * 64 + 60;
                int var3 = var1.field1008 - var2 >> 7;
                int var4 = var1.field1005 - var2 >> 7;
                class187 var5 = class118.method572(var1.field994, var3, 64, var4);
                if (var5 != null) {
                    int var6 = var5.field2457;
                    if (var5 instanceof class137) {
                        var6 += 2048;
                    }
                    if (var5.field2475 == 0 && var5.method652((byte) -71) != -1) {
                        class430.field6226[class388.field5559] = var6;
                        class215.field2964[class388.field5559] = var6;
                        class388.field5559++;
                        var5.field2475++;
                    }
                    class430.field6226[class388.field5559] = var6;
                    class215.field2964[class388.field5559] = var1.field2457 + 2048;
                    class388.field5559++;
                    var5.field2475++;
                }
            }
        }
        class463.method2724(class215.field2964, true, class430.field6226, 0, class388.field5559 - 1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V", line = 3352)
    private final void method1678(int arg0, byte[] arg1) {
        field3930++;
        int var3 = -26 / ((-arg0 - 64) / 60);
        class179 var4 = new class179(arg1);
        while (true) {
            while (true) {
                int var5 = var4.method895((byte) -90);
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    int[] var6 = class261.field3762 = new int[6];
                    var6[0] = var4.method916(21933);
                    var6[1] = var4.method916(21933);
                    var6[2] = var4.method916(21933);
                    var6[3] = var4.method916(21933);
                    var6[4] = var4.method916(21933);
                    var6[5] = var4.method916(21933);
                } else if (var5 == 4) {
                    int var9 = var4.method895((byte) -80);
                    class89.field1122 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        class89.field1122[var10] = var4.method916(21933);
                        if (class89.field1122[var10] == 65535) {
                            class89.field1122[var10] = -1;
                        }
                    }
                } else if (var5 == 5) {
                    int var7 = var4.method895((byte) -106);
                    class162.field1943 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class162.field1943[var8] = var4.method916(21933);
                        if (class162.field1943[var8] == 65535) {
                            class162.field1943[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3431)
    public static final void method1679() {
        int var0 = class438.field6286;
        int[] var1 = class79.field944;
        boolean var2 = class346.field4943 == 1 && var0 > 200 || class346.field4943 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class198 var12 = class46.field596[var1[var3]];
            if (var12.method1079((byte) 118)) {
                var12.method422(-92);
                if (var12.field999 >= 0 && var12.field1004 >= 0 && var12.field1011 < class159.field1895 && var12.field997 < class289.field4316) {
                    var12.field2711 = var12.field2497 ? var2 : false;
                    if (class19.field258 == var12) {
                        var12.field2455 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field2503) {
                            var13++;
                        }
                        if (var12.field2469 > class204.field2796) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method1012(false) << 2);
                        if (class173.field2081 == 0) {
                            var14 += 32;
                        } else {
                            var14 += 128;
                        }
                        var14 += 256;
                        var12.field2455 = var14 + 1;
                    }
                } else {
                    var12.field2455 = -1;
                }
            } else {
                var12.field2455 = -1;
            }
        }
        for (int var4 = 0; var4 < class356.field5112; var4++) {
            class137 var9 = class448.field6366[class25.field353[var4]];
            if (var9.method655((byte) -99) && var9.field1643.method2822((byte) -116, class75.field909)) {
                var9.method422(-94);
                if (var9.field999 >= 0 && var9.field1004 >= 0 && var9.field1011 < class159.field1895 && var9.field997 < class289.field4316) {
                    int var10 = 0;
                    if (!var9.field2503) {
                        var10++;
                    }
                    if (var9.field2469 > class204.field2796) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method1012(false) << 2);
                    if (class173.field2081 == 0) {
                        if (var9.field1643.field6711) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class173.field2081 == 1) {
                        if (var9.field1643.field6711) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field1643.field6726) {
                        var11 += 1024;
                    } else if (!var9.field1643.field6715) {
                        var11 += 256;
                    }
                    var9.field2455 = var11 + 1;
                } else {
                    var9.field2455 = -1;
                }
            } else {
                var9.field2455 = -1;
            }
        }
        for (int var5 = 0; var5 < class251.field3525.length; var5++) {
            class231 var6 = class251.field3525[var5];
            if (var6 != null) {
                if (var6.field3198 == 1) {
                    class137 var7 = class448.field6366[var6.field3192];
                    if (var7 != null && var7.field2455 >= 0) {
                        var7.field2455 += 2048;
                    }
                } else if (var6.field3198 == 10) {
                    class198 var8 = class46.field596[var6.field3192];
                    if (var8 != null && class19.field258 != var8 && var8.field2455 >= 0) {
                        var8.field2455 += 2048;
                    }
                }
            }
        }
    }
}
