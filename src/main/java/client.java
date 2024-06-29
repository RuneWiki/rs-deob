import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class387 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lka;")
    public static class473 field7546 = new class473(5);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[Lav;")
    public static class235[] field7560 = new class235[128];

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field7561 = 0;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    public static int[] field7563 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field7562;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field7564;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field7565;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3068(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 4)
    private final void method3049(byte arg0) {
        if (!class76.field1075.field3681) {
            for (int var2 = 0; var2 < class329.field4472; var2++) {
                if (field7560[var2].method1435(-122) == 's' || field7560[var2].method1435(-122) == 'S') {
                    class76.field1075.field3681 = true;
                    break;
                }
            }
        }
        field7551++;
        if (class520.field7638 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class254.method1522((byte) -51);
            if (class510.field7461 == 0L) {
                class510.field7461 = var5;
            }
            if (var4 > 16384 && var5 - class510.field7461 < 5000L) {
                if ((var5 - class521.field7645) > 1000L) {
                    System.gc();
                    class521.field7645 = var5;
                }
                class397.field5705 = class151.field2324.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 5;
            } else {
                class397.field5705 = class136.field2062.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 5;
                class520.field7638 = 10;
            }
        } else if (class520.field7638 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class264.field3553[var7] = class22.method135(class192.field2809, class9.field111, 1);
            }
            class397.field5705 = class374.field5385.method1126(class486.field6998, (byte) -19);
            class520.field7638 = 20;
            class220.field3101 = 10;
        } else if (class520.field7638 == 20) {
            if (class418.field6059 == null) {
                class418.field6059 = new class517(class503.field7364, class367.field5268);
            }
            if (class418.field6059.method3080((byte) 116)) {
                class63.field914 = class346.method2082(0, 1, true, 1000000, false);
                class306.field4155 = class346.method2082(1, 1, true, 1000000, false);
                class503.field7358 = class346.method2082(2, 1, true, 1000000, false);
                class468.field6768 = class346.method2082(3, 1, true, 1000000, false);
                class481.field6956 = class346.method2082(4, 1, true, 1000000, false);
                class103.field1618 = class346.method2082(5, 1, true, 1000000, true);
                class437.field6309 = class346.method2082(6, 1, false, arg0 ^ 0xF4245, true);
                class91.field1457 = class346.method2082(7, 1, true, 1000000, false);
                class509.field7453 = class346.method2082(8, 1, true, 1000000, false);
                class515.field7535 = class346.method2082(9, 1, true, 1000000, false);
                class387.field5570 = class346.method2082(10, 1, true, 1000000, false);
                class206.field2965 = class346.method2082(11, 1, true, 1000000, false);
                class358.field5162 = class346.method2082(12, 1, true, 1000000, false);
                class300.field4107 = class346.method2082(13, 1, true, 1000000, false);
                class383.field5505 = class346.method2082(14, 1, false, arg0 ^ 0xF4245, false);
                class297.field4083 = class346.method2082(15, 1, true, arg0 ^ 0xF4245, false);
                class77.field1099 = class346.method2082(16, 1, true, 1000000, false);
                class457.field6656 = class346.method2082(17, 1, true, 1000000, false);
                class63.field923 = class346.method2082(18, 1, true, 1000000, false);
                class40.field597 = class346.method2082(19, 1, true, 1000000, false);
                class286.field3880 = class346.method2082(20, 1, true, arg0 ^ 0xF4245, false);
                class96.field1552 = class346.method2082(21, 1, true, 1000000, false);
                class215.field3057 = class346.method2082(22, 1, true, 1000000, false);
                class315.field4271 = class346.method2082(23, 1, true, 1000000, true);
                class392.field5667 = class346.method2082(24, 1, true, 1000000, false);
                class119.field1862 = class346.method2082(25, 1, true, 1000000, false);
                class455.field6646 = class346.method2082(26, 1, true, 1000000, true);
                class355.field5129 = class346.method2082(27, 1, true, 1000000, false);
                class411.field5838 = class346.method2082(28, 1, true, 1000000, true);
                class310.field4218 = class346.method2082(29, 1, true, 1000000, false);
                class397.field5705 = class300.field4102.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 15;
                class520.field7638 = 30;
            } else {
                class397.field5705 = class518.field7600.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 12;
            }
        } else if (class520.field7638 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class285.field3865[var9].method2408((byte) -45) * class523.field7657[var9] / 100;
            }
            if (var8 == 100) {
                class397.field5705 = class517.field7591.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 20;
                class123.method891(class509.field7453, arg0 + 24);
                class379.method2264((byte) 115, class509.field7453);
                class520.field7638 = 40;
            } else {
                if (var8 != 0) {
                    class397.field5705 = class202.field2926.method1126(class486.field6998, (byte) -19) + var8 + "%";
                }
                class220.field3101 = 20;
            }
        } else if (class520.field7638 == 40) {
            if (class411.field5838.method2497(arg0 ^ 0x5)) {
                this.method3057(60, class411.field5838.method2496(1, -112));
                class397.field5705 = class229.field3217.method1126(class486.field6998, (byte) -19);
                class520.field7638 = 50;
                class220.field3101 = 25;
            } else {
                class397.field5705 = class421.field6097.method1126(class486.field6998, (byte) -19) + class411.field5838.method2513((byte) -115) + "%";
                class220.field3101 = 25;
            }
        } else if (class520.field7638 == 50) {
            class120.method877((byte) -3);
            class397.field5705 = class276.field3757.method1126(class486.field6998, (byte) -19);
            class520.field7638 = 60;
            class220.field3101 = 30;
        } else if (class520.field7638 == 60) {
            int var10 = class109.method828(class509.field7453, false, class300.field4107);
            int var11 = class29.method214(-52);
            if (var11 > var10) {
                class397.field5705 = class98.field1562.method1126(class486.field6998, (byte) -19) + var10 * 100 / var11 + "%";
                class220.field3101 = 35;
            } else {
                class397.field5705 = class383.field5496.method1126(class486.field6998, (byte) -19);
                class520.field7638 = 70;
                class220.field3101 = 35;
            }
        } else if (class520.field7638 == 70) {
            int var12 = class426.method2546((byte) 20, class509.field7453);
            int var13 = class195.method1277((byte) 127);
            if (var12 < var13) {
                class397.field5705 = class308.field4180.method1126(class486.field6998, (byte) -19) + var12 * 100 / var13 + "%";
                class220.field3101 = 40;
            } else {
                class397.field5705 = class437.field6312.method1126(class486.field6998, (byte) -19);
                class520.field7638 = 80;
                class220.field3101 = 40;
            }
        } else if (class520.field7638 == 80) {
            if (class455.field6646.method2497(0)) {
                class239.field3307 = new class152(class455.field6646, class515.field7535, class509.field7453);
                class397.field5705 = class70.field1015.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 45;
                class520.field7638 = 90;
            } else {
                class397.field5705 = class126.field1962.method1126(class486.field6998, (byte) -19) + class455.field6646.method2513((byte) -83) + "%";
                class220.field3101 = 45;
            }
        } else if (class520.field7638 == 90) {
            class397.field5705 = class462.field6682.method1126(class486.field6998, (byte) -19);
            class520.field7638 = 95;
            class220.field3101 = 50;
        } else if (class520.field7638 == 95) {
            if (class76.field1075.field3681) {
                class76.field1075.field3689 = 0;
                class76.field1075.field3688 = 0;
                class76.field1075.field3661 = 0;
                class76.field1075.field3648 = 0;
                class76.field1075.field3676 = 1;
            }
            class76.field1075.field3681 = true;
            class76.field1075.method1098(-9, class346.field4985);
            class284.method1632(class76.field1075.field3688, (byte) -114, false);
            class397.field5705 = class133.field2024.method1126(class486.field6998, (byte) -19);
            class220.field3101 = 55;
            class520.field7638 = 100;
        } else if (class520.field7638 == 100) {
            class402.method2376(class509.field7453, 126, class275.field3737, class300.field4107);
            class397.field5705 = class230.field3222.method1126(class486.field6998, (byte) -19);
            class220.field3101 = 60;
            class63.method421(1, true);
            class520.field7638 = 110;
        } else if (class520.field7638 == 110) {
            class503.field7358.method2497(0);
            byte var14 = 0;
            int var15 = var14 + class503.field7358.method2513((byte) -89);
            class77.field1099.method2497(0);
            int var16 = var15 + class77.field1099.method2513((byte) -34);
            class457.field6656.method2497(0);
            int var17 = var16 + class457.field6656.method2513((byte) -58);
            class63.field923.method2497(arg0 ^ 0x5);
            int var18 = var17 + class63.field923.method2513((byte) -73);
            class40.field597.method2497(0);
            int var19 = var18 + class40.field597.method2513((byte) -107);
            class286.field3880.method2497(0);
            int var20 = var19 + class286.field3880.method2513((byte) -85);
            class96.field1552.method2497(0);
            int var21 = var20 + class96.field1552.method2513((byte) -73);
            class215.field3057.method2497(0);
            int var22 = var21 + class215.field3057.method2513((byte) -50);
            class392.field5667.method2497(arg0 - 5);
            int var23 = var22 + class392.field5667.method2513((byte) -31);
            class119.field1862.method2497(0);
            int var24 = var23 + class119.field1862.method2513((byte) -115);
            class355.field5129.method2497(0);
            int var25 = var24 + class355.field5129.method2513((byte) -76);
            class310.field4218.method2497(0);
            int var26 = var25 + class310.field4218.method2513((byte) -33);
            if (var26 < 1200) {
                class397.field5705 = class135.field2050.method1126(class486.field6998, (byte) -19) + var26 / 12 + "%";
                class220.field3101 = 65;
            } else {
                class365.field5241 = new class364(class152.field2343, class486.field6998, class503.field7358);
                class438.field6318 = new class338(class152.field2343, class486.field6998, class503.field7358);
                class485.field6979 = new class389(class152.field2343, class486.field6998, class503.field7358, class509.field7453);
                class196.field2877 = new class184(class152.field2343, class486.field6998, class457.field6656);
                class230.field3223 = new class39(class152.field2343, class486.field6998, class503.field7358);
                class72.field1035 = new class80(class152.field2343, class486.field6998, class503.field7358);
                class244.field3344 = new class390(class152.field2343, class486.field6998, class503.field7358, class91.field1457);
                class486.field6993 = new class17(class152.field2343, class486.field6998, class503.field7358);
                class364.field5236 = new class417(class152.field2343, class486.field6998, class503.field7358);
                class452.field6629 = new class77(class152.field2343, class486.field6998, true, class77.field1099, class91.field1457);
                class98.field1563 = new class288(class152.field2343, class486.field6998, class503.field7358, class509.field7453);
                class10.field116 = new class251(class152.field2343, class486.field6998, class503.field7358, class509.field7453);
                class233.field3248 = new class372(class152.field2343, class486.field6998, true, class63.field923, class91.field1457);
                class534.field7872 = new class518(class152.field2343, class486.field6998, true, class365.field5241, class40.field597, class91.field1457);
                class18.field278 = new class236(class152.field2343, class486.field6998, class503.field7358);
                class50.field716 = new class109(class152.field2343, class486.field6998, class286.field3880, class63.field914, class306.field4155);
                class90.field1454 = new class265(class152.field2343, class486.field6998, class503.field7358);
                class215.field3058 = new class367(class152.field2343, class486.field6998, class503.field7358);
                class316.field4288 = new class452(class152.field2343, class486.field6998, class96.field1552, class91.field1457);
                class32.field485 = new class180(class152.field2343, class486.field6998, class503.field7358);
                class421.field6120 = new class356(class152.field2343, class486.field6998, class503.field7358);
                class32.field493 = new class419(class152.field2343, class486.field6998, class503.field7358);
                class296.field3994 = new class206(class152.field2343, class486.field6998, class215.field3057);
                class110.field1782 = new class231(class152.field2343, class486.field6998, class503.field7358);
                class265.method1564(-68, class91.field1457, class468.field6768, class509.field7453, class300.field4107);
                class224.method1393((byte) 114, class310.field4218);
                class17.field277 = new class256(class486.field6998, class392.field5667, class119.field1862);
                class188.field2772 = new class223(class486.field6998, class392.field5667, class119.field1862, new class353());
                class397.field5705 = class509.field7440.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 65;
                class91.method746(arg0 - 6);
                class452.field6629.method599(-1, !class76.field1075.method1104(class195.field2849, 0));
                class309.field4200 = new class516();
                class264.method1552(5);
                class367.method2199((byte) 2, class355.field5129);
                class70.method567(class91.field1457, class239.field3307, 28806);
                class520.field7638 = 120;
            }
        } else if (class520.field7638 == 120) {
            int var27 = class309.method1787(class509.field7453, (byte) 122);
            int var28 = class88.method735(arg0 ^ 0xFFFFFF85);
            if (var27 < var28) {
                class397.field5705 = class500.field7322.method1126(class486.field6998, (byte) -19) + var27 * 100 / var28 + "%";
                class220.field3101 = 70;
            } else {
                class325.method1927(0, class509.field7453, class275.field3737);
                class398.method2360(class409.field5790, 0);
                class397.field5705 = class322.field4422.method1126(class486.field6998, (byte) -19);
                class520.field7638 = 130;
                class220.field3101 = 70;
            }
        } else if (class520.field7638 == 130) {
            if (class387.field5570.method2514("huffman", 114, "")) {
                class484 var29 = new class484(class387.field5570.method2490(arg0 - 4, "", "huffman"));
                class151.method1095(var29, (byte) 109);
                class397.field5705 = class488.field7062.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 75;
                class520.field7638 = 140;
            } else {
                class397.field5705 = class44.field632.method1126(class486.field6998, (byte) -19) + "0%";
                class220.field3101 = 75;
            }
        } else if (class520.field7638 == 140) {
            if (class468.field6768.method2497(arg0 - 5)) {
                class397.field5705 = class11.field128.method1126(class486.field6998, (byte) -19);
                class520.field7638 = 150;
                class220.field3101 = 80;
            } else {
                class397.field5705 = class104.field1715.method1126(class486.field6998, (byte) -19) + class468.field6768.method2513((byte) -33) + "%";
                class220.field3101 = 80;
            }
        } else if (class520.field7638 == 150) {
            if (class358.field5162.method2497(arg0 - 5)) {
                class397.field5705 = class409.field5782.method1126(class486.field6998, (byte) -19);
                class520.field7638 = 160;
                class220.field3101 = 82;
            } else {
                class397.field5705 = class327.field4462.method1126(class486.field6998, (byte) -19) + class358.field5162.method2513((byte) -63) + "%";
                class220.field3101 = 82;
            }
        } else if (class520.field7638 == 160) {
            if (class300.field4107.method2497(0)) {
                class397.field5705 = class353.field5112.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 85;
                class520.field7638 = 170;
            } else {
                class397.field5705 = class353.field5112.method1126(class486.field6998, (byte) -19) + class300.field4107.method2513((byte) -123) + "%";
                class220.field3101 = 85;
            }
        } else if (class520.field7638 == 170) {
            if (class315.field4271.method2491("details", arg0 + 250)) {
                class472.method2754(class315.field4271, class230.field3223, class72.field1035, class452.field6629, class98.field1563, class10.field116, class309.field4200);
                class397.field5705 = class330.field4487.method1126(class486.field6998, (byte) -19);
                class220.field3101 = 89;
                class520.field7638 = 190;
            } else {
                class397.field5705 = class30.field457.method1126(class486.field6998, (byte) -19) + class315.field4271.method2494("details", arg0 + 19852) + "%";
                class220.field3101 = 87;
            }
        } else if (class520.field7638 == 190) {
            class308.field4189 = new boolean[class32.field493.field6063];
            class1.field25 = new String[class421.field6120.field5144];
            class451.field6614 = new int[class32.field493.field6063];
            for (int var30 = 0; var30 < class32.field493.field6063; var30++) {
                if (class32.field493.method2479(var30, (byte) 10).field948 == 0) {
                    class308.field4189[var30] = true;
                    class146.field2213++;
                }
                class451.field6614[var30] = -1;
            }
            class373.method2232(18898);
            class415.field6027 = class468.field6768.method2488("loginscreen", false);
            class133.field2029 = class468.field6768.method2488("lobbyscreen", false);
            class103.field1618.method2511((byte) 120, true, false);
            class437.field6309.method2511((byte) 120, true, true);
            class509.field7453.method2511((byte) 120, true, true);
            class300.field4107.method2511((byte) 120, true, true);
            class387.field5570.method2511((byte) 120, true, true);
            class468.field6768.method2511((byte) 120, true, true);
            class199.field2901 = true;
            class503.field7358.field6093 = 2;
            class457.field6656.field6093 = 2;
            class77.field1099.field6093 = 2;
            class63.field923.field6093 = 2;
            class40.field597.field6093 = 2;
            class286.field3880.field6093 = 2;
            class96.field1552.field6093 = 2;
            class133.method964(class76.field1075.field3676, false, -1, arg0 - 9, -1);
            class397.field5705 = class515.field7541.method1126(class486.field6998, (byte) -19);
            class520.field7638 = 200;
            class220.field3101 = 95;
        } else if (class520.field7638 == 200) {
            class63.method421(2, true);
        } else if (arg0 != 5) {
            field7561 = -78;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 521)
    public static final void method3050() {
        class17.field276 = 0;
        for (int var0 = 0; var0 < class273.field3692; var0++) {
            class209 var1 = ((class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var0])).field4455;
            if (var1.field213 && var1.method105(false) != -1) {
                int var2 = (var1.method116(8569) - 1) * 64 + 60;
                int var3 = var1.field6284 - var2 >> 7;
                int var4 = var1.field6287 - var2 >> 7;
                class16 var5 = class279.method1613(var3, var4, 0, var1.field6279);
                if (var5 != null) {
                    int var6 = var5.field179;
                    if (var5 instanceof class209) {
                        var6 += 2048;
                    }
                    if (var5.field224 == 0 && var5.method105(false) != -1) {
                        class367.field5263[class17.field276] = var6;
                        class394.field5684[class17.field276] = var6;
                        class17.field276++;
                        var5.field224++;
                    }
                    class367.field5263[class17.field276] = var6;
                    class394.field5684[class17.field276] = var1.field179 + 2048;
                    class17.field276++;
                    var5.field224++;
                }
            }
        }
        class407.method2390(0, true, class394.field5684, class17.field276 - 1, class367.field5263);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 572)
    public static final void method3051() {
        int var0 = class210.field3001;
        int[] var1 = class169.field2570;
        boolean var2 = class76.field1075.field3665 == 1 && var0 > 200 || class76.field1075.field3665 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class487 var13 = class45.field642[var1[var3]];
            if (var13.method2884((byte) -113)) {
                var13.method100(0);
                if (var13.field6290 >= 0 && var13.field6277 >= 0 && var13.field6288 < class9.field111 && var13.field6282 < class192.field2809) {
                    var13.field7001 = var13.field247 ? var2 : false;
                    if (class81.field1158 == var13) {
                        var13.field248 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field213) {
                            var14++;
                        }
                        if (var13.field238 > class28.field417) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method116(8569) << 2);
                        if (var13.field7046) {
                            var15 += 512;
                        } else {
                            if (class349.field5073 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field248 = var15 + 1;
                    }
                } else {
                    var13.field248 = -1;
                }
            } else {
                var13.field248 = -1;
            }
        }
        for (int var4 = 0; var4 < class273.field3692; var4++) {
            class209 var10 = ((class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var4])).field4455;
            if (var10.method1334((byte) -81) && var10.field2976.method649(42, class309.field4200)) {
                var10.method100(0);
                if (var10.field6290 >= 0 && var10.field6277 >= 0 && var10.field6288 < class9.field111 && var10.field6282 < class192.field2809) {
                    int var11 = 0;
                    if (!var10.field213) {
                        var11++;
                    }
                    if (var10.field238 > class28.field417) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method116(8569) << 2);
                    if (class349.field5073 == 0) {
                        if (var10.field2976.field1236) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class349.field5073 == 1) {
                        if (var10.field2976.field1236) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field2976.field1279) {
                        var12 += 1024;
                    } else if (!var10.field2976.field1225) {
                        var12 += 256;
                    }
                    var10.field248 = var12 + 1;
                } else {
                    var10.field248 = -1;
                }
            } else {
                var10.field248 = -1;
            }
        }
        for (int var5 = 0; var5 < class413.field5884.length; var5++) {
            class449 var6 = class413.field5884[var5];
            if (var6 != null) {
                if (var6.field6572 == 1) {
                    class326 var7 = (class326) class281.field3826.method1592((byte) -25, (long) var6.field6581);
                    if (var7 != null) {
                        class209 var8 = var7.field4455;
                        if (var8.field248 >= 0) {
                            var8.field248 += 2048;
                        }
                    }
                } else if (var6.field6572 == 10) {
                    class487 var9 = class45.field642[var6.field6581];
                    if (var9 != null && class81.field1158 != var9 && var9.field248 >= 0) {
                        var9.field248 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 739)
    public static final void method3052() {
        for (int var0 = 0; var0 < class9.field111; var0++) {
            int[] var1 = class217.field3086[var0];
            for (int var2 = 0; var2 < class192.field2809; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 756)
    public final void method2293(int arg0) {
        field7552++;
        try {
            this.method3058(0);
        } catch (Error var3) {
            if (class195.field2849 != 2) {
                throw var3;
            }
            class54.method349(-108, 0);
            class187.method1255(var3, var3.getMessage() + " (Recovered) " + this.method2296(false), -107);
        }
        if (arg0 <= 46) {
            field7546 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 778)
    private final void method3053(int arg0) {
        field7549++;
        boolean var2 = class503.field7364.method1283(arg0 + 4155);
        if (!var2) {
            this.method3066(false);
        }
        if (arg0 != -4278) {
            field7561 = 6;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lat;)Z", line = 794)
    public static final boolean method3054(class444 arg0) {
        if (class181.field2693) {
            if (method3067(arg0).field6217 != 0) {
                return false;
            }
            if (arg0.field6477 == 0) {
                return false;
            }
        }
        return arg0.field6439;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 809)
    public static final void method3055(int arg0) {
        int var1 = class210.field3001;
        int[] var2 = class169.field2570;
        int var3 = class4.field61 ? var1 : class273.field3692 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class16 var5;
            if (var4 < var1) {
                var5 = class45.field642[var2[var4]];
            } else {
                var5 = ((class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var4 - var1])).field4455;
            }
            if (var5.field6279 == arg0) {
                var5.field224 = 0;
                if (var5.field248 < 0) {
                    var5.field213 = false;
                } else {
                    int var6 = var5.method116(8569);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6284 & 0x7F) != 0 || (var5.field6287 & 0x7F) != 0) {
                            var5.field213 = false;
                            continue;
                        }
                    } else if ((var5.field6284 & 0x7F) != 64 || (var5.field6287 & 0x7F) != 64) {
                        var5.field213 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6284 >> 7;
                        int var8 = var5.field6287 >> 7;
                        if (class217.field3086[var7][var8] != var5.field248) {
                            var5.field213 = true;
                            continue;
                        }
                        if (class473.field6844[var7][var8] > 1) {
                            var10002 = class473.field6844[var7][var8]--;
                            var5.field213 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6284 - var9 >> 7;
                        int var11 = var5.field6287 - var9 >> 7;
                        int var12 = var5.field6284 + var9 >> 7;
                        int var13 = var5.field6287 + var9 >> 7;
                        if (!class450.method2643(var10, (byte) -72, var11, var12, var13, var5.field248)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class217.field3086[var14][var15] == var5.field248) {
                                        var10002 = class473.field6844[var14][var15]--;
                                    }
                                }
                            }
                            var5.field213 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class487 && var5.field259 != null && class28.field417 >= var5.field259.field4297 && class28.field417 < var5.field259.field4281) {
                        ((class487) var5).field7001 = false;
                    }
                    var5.field213 = false;
                    var5.field6281 = class123.method893(var5.field6287, var5.field6284, (byte) -13, var5.field6279);
                    class112.method848(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 928)
    private final void method3056(int arg0) {
        field7562++;
        if (class494.field7155 == 13) {
            return;
        }
        class28.field417++;
        if ((class28.field417 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class122.field1900 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class154.field2369.setSeed((long) class122.field1900);
        }
        if ((class28.field417 % 50) == 0) {
            class228.field3202 = class411.field5846;
            class411.field5846 = 0;
            class506.field7405 = class301.field4112;
            class301.field4112 = 0;
        }
        this.method3053(-4278);
        if (class418.field6059 != null) {
            class418.field6059.method3081(2254);
        }
        class398.method2361(-256);
        class78.field1106.method2584(true);
        class113.field1820.method54(-111);
        if (class451.field6612 != null) {
            int var3 = class451.field6612.method783(0);
            class181.field2695 = var3;
        }
        if (class275.field3737 != null) {
            class275.field3737.method484((int) class254.method1522((byte) -51));
        }
        class267.method1574(false);
        if (arg0 > -13) {
            field7546 = null;
        }
        class329.field4472 = 0;
        for (class235 var4 = class78.field1106.method2582(-108); var4 != null && class329.field4472 < 128; var4 = class78.field1106.method2582(-107)) {
            if (var4.method1439(2) != 1) {
                char var5 = var4.method1435(-125);
                if (!class301.method1749((byte) 70) || !(var5 == '`' || var5 == '§')) {
                    field7560[class329.field4472] = var4;
                    class329.field4472++;
                } else if (class336.method2050(true)) {
                    class418.method2474(24202);
                } else {
                    class212.method1342((byte) -40);
                }
            }
        }
        for (class97 var6 = class113.field1820.method59(true); var6 != null; var6 = class113.field1820.method59(true)) {
            int var7 = var6.method777(101);
            if (var7 == -1) {
                class417.field6050.method3139(0, var6);
            } else if (class16.method111(0, var7)) {
                class14.field148.method3139(0, var6);
            }
            if (class14.field148.method3146((byte) -10) > 10) {
                class14.field148.method3134((byte) -72);
            }
        }
        if (class336.method2050(true)) {
            class190.method1263((byte) 44);
        }
        if (class494.field7155 == 0) {
            this.method3049((byte) 5);
            class441.method2607(0);
        } else if (class494.field7155 == 1) {
            this.method3049((byte) 5);
            class441.method2607(0);
        } else if (class473.method2769(2, class494.field7155)) {
            class38.method267(10);
        }
        if (class317.method1823(3, class494.field7155) && !class473.method2769(2, class494.field7155)) {
            this.method3063(105);
            class317.method1826((byte) 57);
            class461.method2682(false);
        } else if (class222.method1384(0, class494.field7155) && !class473.method2769(2, class494.field7155)) {
            this.method3063(110);
            class461.method2682(false);
        } else if (class494.field7155 == 11) {
            class461.method2682(false);
        } else if (class32.method239(class494.field7155, 0) && !class473.method2769(2, class494.field7155)) {
            class121.method887(128);
        } else if (class494.field7155 == 12) {
            class461.method2682(false);
            if (class382.field5489 != -3 && class382.field5489 != 2 && class382.field5489 != 15) {
                class384.method2276(0, false);
            }
        }
        class532.method3157(class275.field3737, (byte) 63);
        class14.field148.method3134((byte) 107);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 1087)
    public final void method2298(byte arg0) {
        field7559++;
        try {
            this.method3056(-97);
            int var2 = 98 / ((arg0 - 1) / 54);
        } catch (Error var4) {
            if (class195.field2849 != 2) {
                throw var4;
            }
            class54.method349(20, 0);
            class187.method1255(var4, var4.getMessage() + " (Recovered) " + this.method2296(false), -55);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1115)
    public final void method2299(byte arg0) {
        field7545++;
        method3060(-14922);
        class98.method781(-22);
        class113.method851((byte) -98);
        class314.method1812((byte) 54);
        class385.method2284((byte) 31);
        class436.method2583(true);
        class1.method5(true);
        class287.method1646(128);
        class476.method2792((byte) 103);
        class270.method1584((byte) 119);
        class387.method2292((byte) -107);
        class71.method570(10);
        class115.method862(arg0 ^ 0xFFFFFF93);
        class187.method1253(-12130);
        class12.method89(0);
        class512.method3036(13515);
        class295.method1708(127);
        class153.method1106((byte) -72);
        class449.method2642((byte) 120);
        class516.method3073(82);
        class530.method3144(arg0 - 108);
        class27.method178((byte) -44);
        class196.method1287((byte) -98);
        class310.method1793(126);
        class517.method3077(0);
        class410.method2412((byte) 103);
        class421.method2501(0);
        class149.method1080((byte) -109);
        class126.method911((byte) -22);
        class473.method2776((byte) 22);
        class338.method2056(false);
        class389.method2309(arg0 + 10);
        class184.method1244(false);
        class39.method277(51);
        class80.method615((byte) -79);
        class390.method2313(96);
        class17.method122(-49);
        class417.method2464(arg0 + 15110);
        class77.method601(arg0 ^ 0x69);
        class288.method1659((byte) 105);
        class251.method1497((byte) -115);
        class372.method2227(1);
        class518.method3091((byte) -102);
        class364.method2176(false);
        class236.method1447(arg0 - 73);
        class109.method829(2);
        class265.method1557((byte) -59);
        class367.method2198((byte) 114);
        class452.method2650((byte) 116);
        class180.method1223(arg0 - 90);
        class356.method2128(16);
        class419.method2477((byte) 28);
        class206.method1322(-29680);
        class231.method1416(false);
        class256.method1526(11394);
        class223.method1389((byte) 27);
        class326.method1931(3);
        class28.method186(true);
        class283.method1629(14);
        class418.method2473(121);
        class346.method2083((byte) 102);
        class466.method2714((byte) 99);
        class177.method1208((byte) 117);
        class465.method2696(12800);
        class439.method2597((byte) -55);
        class444.method2614((byte) -63);
        class487.method2882((byte) -35);
        class139.method984((byte) -81);
        class244.method1475((byte) -67);
        class486.method2874(15191);
        class16.method99(102);
        class306.method1765((byte) 122);
        class532.method3154(-108);
        class65.method428(arg0 ^ 0x2C);
        class170.method1169(-15676);
        class209.method1331(8);
        class91.method747(true);
        class428.method2550((byte) -77);
        class45.method302(2048);
        class458.method2675(90);
        class481.method2862((byte) 126);
        class19.method132((byte) 31);
        class423.method2525((byte) -56);
        class239.method1457(1);
        class14.method94(0);
        class468.method2722(-66);
        class515.method3048(arg0 - 111);
        class41.method284(arg0 + 335);
        class443.method2610(63);
        class76.method594(arg0 - 108);
        class232.method1419(1);
        class342.method2070((byte) -46);
        class296.method1721(false);
        class271.method1595(0);
        class291.method1679(-87);
        class420.method2486(1);
        class55.method362((byte) 95);
        class384.method2275(0);
        class285.method1635(1);
        class399.method2363(arg0 - 113);
        class382.method2270((byte) 17);
        class23.method142(-64);
        class219.method1370(97);
        class103.method807((byte) 116);
        class496.method2939(false);
        class135.method973(20);
        class11.method72(arg0 - 106);
        class83.method651((byte) -124);
        class297.method1728(-117);
        class336.method2051((byte) -114);
        class391.method2320(2);
        class61.method406(-116);
        class447.method2635(true);
        class521.method3102((byte) -57);
        class146.method1029((byte) 17);
        class509.method3016(arg0 ^ 0xFFFFA0E1);
        class330.method1950(arg0 - 147);
        class441.method2609((byte) 0);
        class5.method35(338);
        class18.method126(73);
        class514.method3045((byte) -121);
        class122.method889(2);
        class79.method613((byte) 99);
        class351.method2105(-1);
        class398.method2358(0);
        class434.method2575((byte) 122);
        class186.method1248(arg0 - 23498);
        class121.method886(123);
        class299.method1743(-866);
        class471.method2736();
        class316.method1820((byte) 127);
        class495.method2932(104);
        class451.method2647((byte) 78);
        class462.method2687(255);
        class3.method18(arg0 ^ 0x1AD);
        class40.method278(-9208);
        class47.method311();
        class472.method2755();
        class445.method2632((byte) 61);
        class237.method1451(-5);
        class155.method1116();
        class92.method748((byte) 57);
        class141.method988(126);
        class302.method1750(arg0 ^ 0x5577);
        class152.method1096(-13171);
        class400.method2372(-93);
        class249.method1488(false);
        class240.method1462((byte) 84);
        class13.method92((byte) 6);
        class145.method1005(-78);
        class505.method2996(2048);
        class488.method2901(-1);
        class534.method3164(-54);
        class320.method1901(30906);
        class266.method1568((byte) -73);
        class118.method873(0);
        class523.method3106(true);
        class392.method2329(true);
        class100.method785(67);
        class86.method728(102);
        class331.method1954(18031);
        class350.method2101(12288);
        class93.method763(42);
        class66.method432(1);
        class212.method1344(-2);
        class353.method2120((byte) -9);
        class10.method70(arg0 ^ 0x8);
        class148.method1066((byte) 95);
        class136.method974(true);
        class192.method1271((byte) -117);
        class216.method1353();
        class44.method300(-127);
        class484.method2868(0);
        class480.method2858(0);
        class75.method588(3);
        class104.method812((byte) -112);
        class414.method2435((byte) -70);
        class343.method2072((byte) -124);
        class433.method2570(71);
        class151.method1092((byte) -44);
        class168.method1162(-25306);
        class63.method420((byte) 125);
        class201.method1308((byte) 25);
        class224.method1392(false);
        class197.method1296(-10250);
        class2.method14(258441539);
        class116.method866(arg0 + 12);
        class412.method2424((byte) -123);
        class374.method2243((byte) -69);
        class427.method2548((byte) -119);
        class438.method2591((byte) 101);
        class137.method977(arg0 ^ 0xFFFFFF93);
        class529.method3130(-1407277524);
        class363.method2172(arg0 + 9050);
        class247.method1478(true);
        class304.method1756((byte) -97);
        class228.method1406(false);
        class248.method1483(arg0 - 116);
        class199.method1299(-1);
        class166.method1159(957);
        class221.method1379(arg0 - 710107644);
        class492.method2912((byte) 24);
        class110.method838((byte) -114);
        class259.method1543(0);
        class292.method1693(-66);
        class144.method1000((byte) -126);
        class222.method1382((byte) -53);
        class172.method1174((byte) -79);
        class147.method1056((byte) 9);
        class68.method451(0);
        class276.method1609(1);
        class133.method967((byte) -90);
        class483.method2866(255);
        class274.method1603((byte) -45);
        class226.method1400();
        class51.method342(-329);
        class502.method2982(true);
        class494.method2926((byte) -105);
        class298.method1740(-29632);
        class215.method1352((byte) -118);
        class522.method3104((byte) 59);
        class269.method1581((byte) -119);
        class84.method659(true);
        class87.method733(false);
        class312.method1801(105);
        class527.method3123((byte) 65);
        class324.method1916();
        class195.method1276(-3044);
        class42.method288((byte) -42);
        class327.method1936(arg0 - 23201);
        class225.method1397(arg0 - 103);
        class315.method1818(false);
        class26.method163(-116);
        class284.method1631(-1314633917);
        class425.method2536((byte) 36);
        class214.method1349(6144);
        class125.method902((byte) 0);
        class503.method2986(-47);
        class411.method2414(arg0 ^ 0x11);
        class32.method238(10771);
        class437.method2588(29);
        class290.method1677((byte) 89);
        class181.method1230(12959);
        class279.method1618((byte) 122);
        class4.method25(7428);
        class498.method2953();
        class229.method1407(true);
        class252.method1509();
        class268.method1576();
        class361.method2157();
        class264.method1553(32);
        class132.method958();
        class96.method775(0);
        class377.method2255((byte) -42);
        class526.method3119(0);
        class119.method875(-112);
        class352.method2113();
        class416.method2456(28205);
        class34.method253(3);
        class159.method1131(124);
        class50.method333(30);
        class308.method1779((byte) -35);
        class463.method2690(-117);
        class230.method1411(arg0 ^ 0xFFFFFFE6);
        class7.method49(26779);
        class360.method2151(-12202);
        class413.method2428((byte) -89);
        class140.method986(arg0 ^ 0x64);
        class161.method1134(false);
        class348.method2091(101);
        class333.method2010(-127);
        class233.method1422(9158);
        class358.method2134(true);
        class164.method1147((byte) -85);
        class81.method623(1);
        class499.method2974(arg0 + 11969);
        class511.method3034(23257);
        class29.method218(0);
        class60.method389(false);
        class128.method929((byte) -125);
        class142.method992(-1);
        class403.method2380(-3);
        class241.method1468(-6327);
        class415.method2440((byte) 125);
        class475.method2789(arg0 + 11);
        class504.method2987((byte) -94);
        class490.method2907(-113);
        class362.method2166();
        class366.method2189(22374);
        class454.method2664((byte) 0);
        class450.method2645((byte) -103);
        class202.method1309(arg0 + 608);
        class478.method2836(arg0 + 3988);
        class160.method1133(74);
        class535.method3167(2781);
        class38.method266(-104);
        class183.method1239(arg0 - 109);
        class455.method2668((byte) -61);
        class56.method368(-70);
        class165.method1154((byte) 20);
        class176.method1207(true);
        class273.method1599(1891076492);
        class311.method1798(false);
        class457.method2669(-118);
        class533.method3159(0);
        class375.method2246(85);
        class369.method2206(13863);
        class117.method867((byte) -113);
        class243.method1473(8);
        class108.method826((byte) -66);
        class217.method1364(false);
        class30.method224(false);
        class497.method2950((byte) 101);
        class286.method1643(2);
        class409.method2394(73);
        if (arg0 != 108) {
            field7546 = null;
        }
        class78.method607(31072);
        class210.method1337((byte) -114);
        class525.method3117((byte) -82);
        class134.method972((byte) 55);
        class24.method148((byte) -47);
        class138.method978();
        class85.method672();
        class281.method1625(0);
        class258.method1536((byte) -67);
        class325.method1926(-60);
        class154.method1112(17506);
        class124.method899((byte) 122);
        class220.method1373((byte) -14);
        class49.method329(arg0 ^ 0x6D);
        class379.method2259(false);
        class163.method1141(121);
        class88.method734(6);
        class53.method345((byte) -127);
        class22.method139(36161);
        class426.method2542((byte) -101);
        class246.method1477((byte) -91);
        class339.method2061((byte) 81);
        class280.method1620(-106);
        class500.method2978(256);
        class74.method579((byte) 25);
        class234.method1427(-2086);
        class397.method2356(-1);
        class365.method2187(16384);
        class33.method244(1);
        class94.method766(true);
        class72.method573(false);
        class467.method2718(-94);
        class323.method1911((byte) 55);
        class355.method2124(108);
        class519.method3097((byte) -97);
        class120.method880(-1);
        class169.method1167(arg0 + 15531);
        class203.method1310((byte) -107);
        class211.method1339(3);
        class402.method2378(3);
        class90.method741(-125);
        class188.method1257(3168);
        class383.method2274(-18);
        class422.method2524((byte) -117);
        class508.method3010(3);
        class294.method1699(-17422);
        class282.method1627(-28983);
        class207.method1325(85);
        class407.method2388((byte) 109);
        class485.method2871(-1647482933);
        class255.method1523(-2);
        class520.method3099(-1);
        class300.method1747(2);
        class250.method1489((byte) -121);
        class54.method354(true);
        class6.method37((byte) -112);
        class35.method261(true);
        class185.method1245((byte) -4);
        class102.method793(-114);
        class245.method1476((byte) -14);
        class322.method1910(51);
        class235.method1440(true);
        class97.method776(-983);
        class257.method1531(-99);
        class345.method2080(true);
        class309.method1786((byte) 124);
        class332.method1961(0);
        class191.method1265(74);
        class440.method2604(2048);
        class349.method2095((byte) 122);
        class429.method2557((byte) 73);
        class341.method2068((byte) 109);
        class347.method2087(91);
        class36.method262(arg0 ^ 0x6CAA);
        class70.method566(-1389);
        class200.method1302((byte) -21);
        class278.method1612(-119);
        class275.method1606(arg0 - 121166272);
        class105.method819(arg0 - 2042260032);
        class394.method2335(-35);
        class373.method2235(0);
        if (class387.field5573) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1521)
    public final void init() {
        field7553++;
        if (!this.method2291(0)) {
            return;
        }
        class13.field136 = new class41();
        class13.field136.field609 = Integer.parseInt(this.getParameter("worldid"));
        class414.field5911 = new class41();
        class414.field5911.field609 = Integer.parseInt(this.getParameter("lobbyid"));
        class414.field5911.field603 = this.getParameter("lobbyaddress");
        class475.field6872 = new class41();
        class475.field6872.field609 = Integer.parseInt(this.getParameter("demoid"));
        class475.field6872.field603 = this.getParameter("demoaddress");
        class523.field7659 = class327.method1939(126, Integer.parseInt(this.getParameter("modewhere")));
        if (!class519.method3096(101, class523.field7659) && class81.field1144 != class523.field7659) {
            class523.field7659 = class81.field1144;
        }
        class394.field5682 = class438.method2592(Integer.parseInt(this.getParameter("modewhat")), true);
        if (class455.field6645 != class394.field5682 && class487.field7053 != class394.field5682 && class394.field5682 != class245.field3353) {
            class394.field5682 = class245.field3353;
        }
        try {
            class486.field6998 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class486.field6998 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class346.field4977 = true;
        } else {
            class346.field4977 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class219.field3091 = true;
        } else {
            class219.field3091 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class191.field2794 = true;
        } else {
            class191.field2794 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class152.field2343 = class98.field1564;
            } else if (var4.equals("1")) {
                class152.field2343 = class308.field4192;
            }
        }
        try {
            class387.field5536 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class387.field5536 = 0;
        }
        class360.field5179 = this.getParameter("quiturl");
        class255.field3476 = this.getParameter("settings");
        if (class255.field3476 == null) {
            class255.field3476 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class153.field2362 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class153.field2362 = 0;
            }
        }
        class295.field3978 = Integer.parseInt(this.getParameter("colourid"));
        if (class295.field3978 < 0 || class295.field3978 >= class400.field5730.length) {
            class295.field3978 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class65.field936 = true;
            class296.field3998 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class520.field7640 = true;
        }
        if (class98.field1564 == class152.field2343) {
            class109.field1768 = 765;
            class3.field38 = 503;
        } else if (class308.field4192 == class152.field2343) {
            class109.field1768 = 640;
            class3.field38 = 480;
        }
        class502.field7343 = this;
        this.method2285(class394.field5682.method860(true) + 32, 599, class109.field1768, -109, class3.field38);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V", line = 1639)
    private final void method3057(int arg0, byte[] arg1) {
        if (arg0 <= 55) {
            return;
        }
        field7558++;
        class319 var3 = new class319(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method1869(-108);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class222.field3144 = new int[6];
                        var9[0] = var3.method1844(-126);
                        var9[1] = var3.method1844(-108);
                        var9[2] = var3.method1844(-116);
                        var9[3] = var3.method1844(-109);
                        var9[4] = var3.method1844(-121);
                        var9[5] = var3.method1844(-117);
                    } else if (var4 == 4) {
                        int var5 = var3.method1869(-77);
                        class490.field7076 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class490.field7076[var6] = var3.method1844(-116);
                            if (class490.field7076[var6] == 65535) {
                                class490.field7076[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method1869(-94);
                        class22.field313 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class22.field313[var8] = var3.method1844(-106);
                            if (class22.field313[var8] == 65535) {
                                class22.field313[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1715)
    public final void method2286(int arg0) {
        field7544++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class258.method1533(-82);
        class367.field5268 = new class310(class346.field4985);
        class503.field7364 = new class196();
        if (class81.field1144 != class523.field7659) {
            class7.field94 = new byte[50][];
        }
        class76.field1075 = new class153(class346.field4985);
        if (class81.field1144 == class523.field7659) {
            class13.field136.field603 = this.getCodeBase().getHost();
        } else if (class519.method3096(121, class523.field7659)) {
            class13.field136.field603 = this.getCodeBase().getHost();
            class13.field136.field604 = class13.field136.field609 + 40000;
            class414.field5911.field604 = class414.field5911.field609 + 40000;
            class13.field136.field605 = class13.field136.field609 + 50000;
            class475.field6872.field604 = class475.field6872.field609 + 40000;
            class414.field5911.field605 = class414.field5911.field609 + 50000;
            class475.field6872.field605 = class475.field6872.field609 + 50000;
        } else if (class6.field79 == class523.field7659) {
            class13.field136.field603 = "127.0.0.1";
            class414.field5911.field603 = "127.0.0.1";
            class13.field136.field604 = class13.field136.field609 + 40000;
            class475.field6872.field603 = "127.0.0.1";
            class414.field5911.field604 = class414.field5911.field609 + 40000;
            class475.field6872.field604 = class475.field6872.field609 + 40000;
            class13.field136.field605 = class13.field136.field609 + 50000;
            class414.field5911.field605 = class414.field5911.field609 + 50000;
            class475.field6872.field605 = class475.field6872.field609 + 50000;
        }
        if (class98.field1564 == class152.field2343) {
            class214.field3053 = false;
        }
        class184.field2737 = class13.field136;
        if (class308.field4192 == class152.field2343) {
            class211.field3011 = true;
            class533.field7846 = class144.field2129;
            class74.field1050 = class436.field6302;
            class278.field3773 = 16777215;
            class4.field68 = class369.field5280;
            class176.field2651 = class166.field2542;
            class482.field6959 = 0;
        } else {
            class533.field7846 = class490.field7085;
            class176.field2651 = class102.field1603;
            class74.field1050 = class485.field6978;
            class4.field68 = class372.field5337;
        }
        if (arg0 < 114) {
            field7561 = 41;
        }
        class485.field6980 = class230.field3221 = class394.field5681 = class500.field7327 = new short[256];
        class78.field1106 = class80.method617(1, class415.field6025);
        class113.field1820 = class153.method1100((byte) 126, class415.field6025, true);
        class451.field6612 = class391.method2321(-21344);
        if (class451.field6612 != null) {
            class451.field6612.method784((byte) 114, class415.field6025);
        }
        class299.field4092 = class173.field2628;
        try {
            if (class346.field4985.field2626 != null) {
                class184.field2733 = new class149(class346.field4985.field2626, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class148.field2269[var3] = new class149(class346.field4985.field2633[var3], 6000, 0);
                }
                class287.field3885 = new class149(class346.field4985.field2621, 6000, 0);
                class412.field5862 = new class126(255, class184.field2733, class287.field3885, 500000);
                class274.field3724 = new class149(class346.field4985.field2615, 24, 0);
                class346.field4985.field2633 = null;
                class346.field4985.field2621 = null;
                class346.field4985.field2615 = null;
                class346.field4985.field2626 = null;
            }
        } catch (IOException var4) {
            class287.field3885 = null;
            class412.field5862 = null;
            class274.field3724 = null;
            class184.field2733 = null;
        }
        if (class81.field1144 != class523.field7659) {
            class407.field5770 = true;
        }
        if (class98.field1564 == class152.field2343) {
            class285.field3870 = class79.field1117.method1126(class486.field6998, (byte) -19);
        } else if (class308.field4192 == class152.field2343) {
            class285.field3870 = class44.field634.method1126(class486.field6998, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1841)
    private final void method3058(int arg0) {
        field7547++;
        if (class494.field7155 == 13) {
            return;
        }
        long var2 = class104.method810(arg0 - 1) / 1000000L - class487.field7052;
        class487.field7052 = class104.method810(-1) / 1000000L;
        boolean var4 = class166.method1157(arg0 - 8978);
        if (var4 && class363.field5221 && class223.field3146 != null) {
            class223.field3146.method3014(14394);
        }
        if (class527.method3122((byte) 97, class494.field7155)) {
            if (class312.field4235 != 0L && class254.method1522((byte) -51) > class312.field4235) {
                class133.method964(class75.method586((byte) 72), false, class76.field1075.field3650, -4, class76.field1075.field3653);
            } else if (!class275.field3737.method550() && class169.field2573) {
                class466.method2711(10);
            }
        }
        if (class26.field358 == null) {
            Container var5;
            if (class391.field5642 == null) {
                var5 = class346.field4985.field2623;
            } else {
                var5 = class391.field5642;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class391.field5642 == var5) {
                Insets var8 = class391.field5642.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class233.field3246 != var6 || class389.field5618 != var7) {
                if (class275.field3737 == null || class275.field3737.method561()) {
                    class258.method1533(-81);
                } else {
                    class233.field3246 = var6;
                    class389.field5618 = var7;
                }
                class312.field4235 = class254.method1522((byte) -51) + 500L;
            }
        }
        if (class26.field358 != null && !class508.field7419 && class527.method3122((byte) 97, class494.field7155)) {
            class133.method964(class76.field1075.field3676, false, -1, -4, -1);
        }
        boolean var9 = false;
        if (class77.field1095) {
            var9 = true;
            class77.field1095 = false;
        }
        if (var9) {
            class366.method2191(0);
        }
        if (class275.field3737 != null && class275.field3737.method550() || class75.method586((byte) 72) != 1) {
            class157.method1127(1508614222);
        }
        if (class494.field7155 == arg0) {
            class19.method129(class343.field4969[class295.field3978], var9, class374.field5373[class295.field3978], class397.field5705, 2, class400.field5730[class295.field3978], class220.field3101);
        } else if (class494.field7155 == 1) {
            class180.method1222(class374.field5373[class295.field3978].getRGB(), class108.field1751, var9 | class275.field3737.method550(), class400.field5730[class295.field3978].getRGB(), class343.field4969[class295.field3978].getRGB(), class275.field3737, (byte) 89);
        } else if (class502.method2980(class494.field7155, (byte) 95)) {
            class66.method431(arg0 ^ 0xFFFFFFA0);
        } else if (class375.method2248(6, class494.field7155)) {
            class66.method431(-44);
        } else if (class473.method2769(2, class494.field7155)) {
            if (class191.field2789 == 1) {
                if (class473.field6857 < class37.field555) {
                    class473.field6857 = class37.field555;
                }
                int var11 = (class473.field6857 - class37.field555) * 50 / class473.field6857;
                class229.method1408(arg0, class314.field4251.method1126(class486.field6998, (byte) -19) + "<br>(" + var11 + "%)", class331.field4510, true);
            } else if (class191.field2789 == 2) {
                if (class193.field2814 > class95.field1540) {
                    class95.field1540 = class193.field2814;
                }
                int var10 = (class95.field1540 - class193.field2814) * 50 / class95.field1540 + 50;
                class229.method1408(0, class314.field4251.method1126(class486.field6998, (byte) -19) + "<br>(" + var10 + "%)", class331.field4510, true);
            } else {
                class229.method1408(0, class314.field4251.method1126(class486.field6998, (byte) -19), class331.field4510, true);
            }
        } else if (class494.field7155 == 9) {
            class87.method729(var2, (byte) -116);
        } else if (class494.field7155 == 12) {
            class229.method1408(0, class304.field4128.method1126(class486.field6998, (byte) -19) + "<br>" + class135.field2058.method1126(class486.field6998, (byte) -19), class331.field4510, true);
        }
        if (class482.field6960 == 3) {
            for (int var12 = 0; var12 < class293.field3963; var12++) {
                Rectangle var13 = class428.field6209[var12];
                if (class225.field3178[var12]) {
                    class275.field3737.method1712(var13.height, 0, -1996553985, var13.width, var13.y, var13.x);
                } else if (class259.field3517[var12]) {
                    class275.field3737.method1712(var13.height, arg0, -1996554240, var13.width, var13.y, var13.x);
                }
            }
        }
        if (class336.method2050(true)) {
            class379.method2262(12, class275.field3737);
        }
        if (class527.method3122((byte) 97, class494.field7155) && class482.field6960 == 0 && class75.method586((byte) 72) == 1 && !var9 && class173.field2620.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class293.field3963; var15++) {
                if (class259.field3517[var15]) {
                    class259.field3517[var15] = false;
                    class237.field3276[var14++] = class428.field6209[var15];
                }
            }
            class275.field3737.method476(class237.field3276, var14);
        } else if (class494.field7155 != 0) {
            class275.field3737.method536();
            for (int var16 = 0; var16 < class293.field3963; var16++) {
                class259.field3517[var16] = false;
            }
        }
        if (class76.field1075.field3686 == 0) {
            class334.method2047(15L, arg0);
        } else if (class76.field1075.field3686 == 1) {
            class334.method2047(10L, arg0);
        } else if (class76.field1075.field3686 == 2) {
            class334.method2047(5L, 0);
        } else if (class76.field1075.field3686 == 3) {
            class334.method2047(2L, 0);
        }
        if (class199.field2901) {
            class100.method787(-113);
        }
        if (class76.field1075.field3681 && class494.field7155 == 2 && class236.field3268 != -1) {
            class76.field1075.field3681 = false;
            class76.field1075.method1098(-9, class346.field4985);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2086)
    public static final void method3059(int arg0) {
        int var1 = class210.field3001;
        int[] var2 = class169.field2570;
        for (int var3 = 0; var3 < class273.field3692 + var1; var3++) {
            class16 var4;
            if (var3 < var1) {
                var4 = class45.field642[var2[var3]];
            } else {
                var4 = ((class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var3 - var1])).field4455;
            }
            if (var4.field6279 == arg0 && var4.field248 >= 0) {
                int var5 = var4.method116(8569);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6284 & 0x7F) != 0 || (var4.field6287 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6284 & 0x7F) != 64 || (var4.field6287 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6284 >> 7;
                    int var7 = var4.field6287 >> 7;
                    if (var4.field248 > class217.field3086[var6][var7]) {
                        class217.field3086[var6][var7] = var4.field248;
                        class473.field6844[var6][var7] = 1;
                    } else if (class217.field3086[var6][var7] == var4.field248) {
                        var10002 = class473.field6844[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6284 - var8 >> 7;
                    int var10 = var4.field6287 - var8 >> 7;
                    int var11 = var4.field6284 + var8 >> 7;
                    int var12 = var4.field6287 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field248 > class217.field3086[var13][var14]) {
                                class217.field3086[var13][var14] = var4.field248;
                                class473.field6844[var13][var14] = 1;
                            } else if (class217.field3086[var13][var14] == var4.field248) {
                                var10002 = class473.field6844[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2183)
    public static void method3060(int arg0) {
        field7563 = null;
        if (arg0 != -14922) {
            method3065(null, -74, -23, -111, 50, 65, 62, -40, -113, -79);
        }
        field7560 = null;
        field7546 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lat;)Lat;", line = 2196)
    public static final class444 method3061(class444 arg0) {
        int var1 = method3067(arg0).method2551(1762144786);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class22.method138(-122, arg0.field6515);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2215)
    public static final void main(String[] arg0) {
        field7555++;
        try {
            if (arg0.length != 6) {
                class77.method596(-14602, "Argument count");
            }
            class13.field136 = new class41();
            class13.field136.field609 = Integer.parseInt(arg0[0]);
            class414.field5911 = new class41();
            class414.field5911.field609 = Integer.parseInt(arg0[1]);
            class475.field6872 = new class41();
            class475.field6872.field609 = Integer.parseInt(arg0[2]);
            class523.field7659 = class6.field79;
            if (arg0[3].equals("live")) {
                class394.field5682 = class245.field3353;
            } else if (arg0[3].equals("rc")) {
                class394.field5682 = class487.field7053;
            } else if (arg0[3].equals("wip")) {
                class394.field5682 = class455.field6645;
            } else {
                class77.method596(-14602, "modewhat");
            }
            class486.field6998 = class238.method1453((byte) -75, arg0[4]);
            if (class486.field6998 == -1) {
                if (arg0[4].equals("english")) {
                    class486.field6998 = 0;
                } else if (arg0[4].equals("german")) {
                    class486.field6998 = 1;
                } else {
                    class77.method596(-14602, "language");
                }
            }
            class219.field3091 = false;
            class346.field4977 = false;
            if (arg0[5].equals("game0")) {
                class152.field2343 = class98.field1564;
            } else if (arg0[5].equals("game1")) {
                class152.field2343 = class308.field4192;
            } else {
                class77.method596(-14602, "game");
            }
            class153.field2362 = 0;
            class295.field3978 = class152.field2343.field134;
            class387.field5536 = 0;
            class520.field7640 = false;
            class65.field936 = true;
            class296.field3998 = true;
            class255.field3476 = "";
            client var1 = new client();
            class502.field7343 = var1;
            var1.method2301(1024, false, class394.field5682.method860(true) + 32, 0, 768, 30, class152.field2343.field129, 599);
            class391.field5642.setLocation(40, 40);
        } catch (Exception var3) {
            class187.method1255(var3, null, -19);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 2286)
    public final String method2296(boolean arg0) {
        field7556++;
        String var2 = null;
        try {
            var2 = "[1)" + class110.field1775 + "," + class399.field5727 + "," + class9.field111 + "," + class192.field2809 + "|";
            if (class81.field1158 != null) {
                var2 = var2 + "2)" + class366.field5260 + "," + (class81.field1158.field263[0] + class110.field1775) + "," + (class81.field1158.field257[0] + class399.field5727) + "|";
            }
            var2 = var2 + "3)" + class195.field2849 + "|4)" + class76.field1075.field3689 + "|5)" + class75.method586((byte) 72) + "|6)" + class66.field953 + "," + class348.field5033 + "|";
            var2 = var2 + "7)" + class76.field1075.method1597(arg0, class195.field2849) + "|";
            var2 = var2 + "8)" + class76.field1075.method1593(class195.field2849, 124) + "|";
            var2 = var2 + "9)" + class76.field1075.field3654 + "|";
            var2 = var2 + "10)" + class76.field1075.field3677 + "|";
            var2 = var2 + "11)" + class76.field1075.field3679 + "|";
            var2 = var2 + "12)" + class76.field1075.method1104(class195.field2849, 0) + "|";
            var2 = var2 + "13)" + class20.field294 + "|";
            var2 = var2 + "14)" + class494.field7155;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class195.field2849 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field7564 == null ? (field7564 = method3068("client")) : field7564).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2369)
    public static final void method3062() {
        int var0 = class210.field3001;
        int[] var1 = class169.field2570;
        int var2 = class4.field61 ? var0 : class273.field3692 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class16 var4;
            if (var3 < var0) {
                var4 = class45.field642[var1[var3]];
            } else {
                var4 = ((class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var3 - var0])).field4455;
            }
            if (var4.field248 >= 0) {
                int var5 = var4.method116(8569);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6284 & 0x7F) == 0 && (var4.field6287 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6284 & 0x7F) == 64 && (var4.field6287 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class487 && var4.field259 != null && class28.field417 >= var4.field259.field4297 && class28.field417 < var4.field259.field4281) {
                    ((class487) var4).field7001 = false;
                }
                var4.field6281 = class123.method893(var4.field6287, var4.field6284, (byte) -13, var4.field6279);
                class112.method848(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 2417)
    private final void method3063(int arg0) {
        field7557++;
        if (class494.field7155 == 6 && class516.field7579 == 0) {
            if (class492.field7133 > 0) {
                class492.field7133--;
            }
            if (class104.field1705 > 1) {
                class492.field7132 = class365.field5245;
                class104.field1705--;
            }
            if (!class526.field7677) {
                class283.method1630(true);
            }
            for (int var2 = 0; var2 < 100 && class42.method287((byte) 27); var2++) {
            }
        }
        class71.field1026++;
        if (arg0 < 100) {
            field7561 = -78;
        }
        class183.method1240(-1, null, (byte) 5, -1);
        class340.method2063(-1, (byte) -127, -1, null);
        class206.method1321((byte) 51);
        class365.field5245++;
        for (int var3 = 0; var3 < class534.field7854; var3++) {
            class209 var4 = class496.field7261[var3].field4455;
            if (var4 != null) {
                byte var5 = var4.field2976.field1229;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method116(8569);
                    if ((var5 & 0x2) != 0 && var4.field265 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field263[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class9.field111 - var6 - 1) {
                                var9 = class9.field111 - var6 - 1;
                            }
                            int var10 = var4.field257[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class192.field2809 - var6 - 1) < var10) {
                                var10 = class192.field2809 - var6 - 1;
                            }
                            int var11 = class295.method1710(var4.field257[0], var10, true, var4.field263[0], class264.field3553[var4.field6279], 0, class19.field284, var6, var9, -1, 0, var6, var6, -128, class104.field1707);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field263[var12] = class104.field1707[var11 - var12 - 1];
                                    var4.field257[var12] = class19.field284[var11 - var12 - 1];
                                    var4.field258[var12] = 1;
                                }
                                var4.field265 = var11;
                            }
                        }
                    }
                    class370.method2209(-21152, var4, true);
                    int var13 = class532.method3158(-5501, var4);
                    class214.method1350(var4, -1, class264.field3548, class392.field5666, var13);
                    class466.method2700(var4, 21758);
                }
            }
        }
        if (class516.field7579 == 0 && class196.field2876 == 0) {
            if (class247.field3363 == 2) {
                class95.method773(94);
            } else {
                class186.method1247(false);
            }
            if ((class118.field1848 >> 7) < 14 || (class118.field1848 >> 7) >= (class9.field111 - 14) || (class108.field1747 >> 7) < 14 || class108.field1747 >> 7 >= class192.field2809 - 14) {
                class441.method2606((byte) 116);
            }
        }
        while (true) {
            class414 var14;
            class444 var15;
            class444 var16;
            do {
                var14 = (class414) class50.field708.method3134((byte) -125);
                if (var14 == null) {
                    while (true) {
                        class414 var17;
                        class444 var18;
                        class444 var19;
                        do {
                            var17 = (class414) class269.field3623.method3134((byte) -53);
                            if (var17 == null) {
                                while (true) {
                                    class414 var20;
                                    class444 var21;
                                    class444 var22;
                                    do {
                                        var20 = (class414) class63.field922.method3134((byte) -84);
                                        if (var20 == null) {
                                            if (class294.field3967 != null) {
                                                class412.method2422(-10);
                                            }
                                            if ((class28.field417 % 1500) == 0) {
                                                class482.method2864((byte) 88);
                                            }
                                            if (class494.field7155 == 6 && class516.field7579 == 0) {
                                                class373.method2237(-10946);
                                            }
                                            class510.method3026(-29805);
                                            if (class267.field3590 && class254.method1522((byte) -51) - 60000L > class420.field6080) {
                                                class294.method1701((byte) 81);
                                            }
                                            for (class102 var23 = (class102) class416.field6029.method2600((byte) -103); var23 != null; var23 = (class102) class416.field6029.method2601(109)) {
                                                if ((long) var23.field1604 < class254.method1522((byte) -51) / 1000L - 5L) {
                                                    if (var23.field1601 > 0) {
                                                        class9.method68("", 0, 5, -1, var23.field1600 + class219.field3096.method1126(class486.field6998, (byte) -19), "");
                                                    }
                                                    if (var23.field1601 == 0) {
                                                        class9.method68("", 0, 5, -1, var23.field1600 + class68.field980.method1126(class486.field6998, (byte) -19), "");
                                                    }
                                                    var23.method2861((byte) 47);
                                                }
                                            }
                                            if (class494.field7155 == 6 && class516.field7579 == 0) {
                                                if (class104.field1702 == null) {
                                                    class384.method2276(0, false);
                                                    return;
                                                }
                                                class291.field3948++;
                                                if (class291.field3948 > 50) {
                                                    class346.field4981++;
                                                    class274.method1602(14, class332.field4516);
                                                }
                                                try {
                                                    if (class104.field1702 != null && class17.field275.field4360 > 0) {
                                                        class411.field5846 += class17.field275.field4360;
                                                        class104.field1702.method180(0, class17.field275.field4360, 18170, class17.field275.field4336);
                                                        class291.field3948 = 0;
                                                        class17.field275.field4360 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class384.method2276(0, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5896;
                                        if (var21.field6510 < 0) {
                                            break;
                                        }
                                        var22 = class22.method138(125, var21.field6515);
                                    } while (var22 == null || var22.field6491 == null || var21.field6510 >= var22.field6491.length || var22.field6491[var21.field6510] != var21);
                                    class47.method313(var20);
                                }
                            }
                            var18 = var17.field5896;
                            if (var18.field6510 < 0) {
                                break;
                            }
                            var19 = class22.method138(-62, var18.field6515);
                        } while (var19 == null || var19.field6491 == null || var19.field6491.length <= var18.field6510 || var19.field6491[var18.field6510] != var18);
                        class47.method313(var17);
                    }
                }
                var15 = var14.field5896;
                if (var15.field6510 < 0) {
                    break;
                }
                var16 = class22.method138(-98, var15.field6515);
            } while (var16 == null || var16.field6491 == null || var16.field6491.length <= var15.field6510 || var16.field6491[var15.field6510] != var15);
            class47.method313(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 2708)
    private final void method3064(int arg0, byte arg1) {
        class24.field328 = null;
        class240.field3317 = 0;
        if (arg1 != 94) {
            this.method3064(95, (byte) -39);
        }
        class503.field7364.field2888 = arg0;
        class503.field7364.field2887++;
        field7550++;
        class533.field7848 = null;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2723)
    public final void method2297(int arg0) {
        if (class267.field3590) {
            class294.method1701((byte) 94);
        }
        field7548++;
        if (class275.field3737 != null) {
            class275.field3737.method1713(-1);
        }
        if (class26.field358 != null) {
            class196.method1290(arg0 - 42979, class26.field358, class346.field4985);
            class26.field358 = null;
        }
        if (class104.field1702 != null) {
            class104.field1702.method172(arg0 - 16210);
            class104.field1702 = null;
        }
        if (class451.field6612 != null) {
            class451.field6612.method782(class415.field6025, false);
        }
        class451.field6612 = null;
        class236.method1442(arg0 - 28467);
        class503.field7364.method1282(79);
        if (arg0 != 28502) {
            this.method2296(false);
        }
        class367.field5268.method1794(true);
        if (class42.field624 != null) {
            class42.field624.method2471((byte) 127);
            class42.field624 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lat;IIIIIIIII)V", line = 2770)
    public static final void method3065(class444[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class444 var11 = arg0[var10];
            if (var11 != null && var11.field6515 == arg1) {
                int var12 = var11.field6500 + arg6;
                int var13 = var11.field6418 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6477 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6470 + var12;
                    int var19 = var11.field6453 + var13;
                    if (var11.field6477 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6477 == 0 || var11.field6395 || method3067(var11).field6217 != 0 || class250.field3411 == var11 || class294.field3971 == var11.field6384) {
                    if (!method3054(var11)) {
                        if (class294.field3967 == var11) {
                            class360.field5176 = true;
                            class402.field5751 = var12;
                            class172.field2601 = var13;
                        }
                        if (var11.field6485 || var14 < var16 && var15 < var17) {
                            if (var11.field6437 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class414 var20 = (class414) class63.field922.method3137(0); var20 != null; var20 = (class414) class63.field922.method3132(0)) {
                                    if (var20.field5893) {
                                        var20.method2791((byte) 112);
                                        var20.field5896.field6415 = false;
                                    }
                                }
                                if (class105.field1718 == 0) {
                                    class294.field3967 = null;
                                    class250.field3411 = null;
                                }
                                class123.field1909 = 0;
                                class300.field4108 = false;
                                class291.field3935 = false;
                                if (!class526.field7677) {
                                    class283.method1630(true);
                                }
                            }
                            boolean var21;
                            if (class113.field1820.method55((byte) -37) >= var14 && class113.field1820.method62((byte) 102) >= var15 && class113.field1820.method55((byte) -37) < var16 && class113.field1820.method62((byte) 108) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class375.field5390 && var21) {
                                if (var11.field6436 >= 0) {
                                    class358.field5165 = var11.field6436;
                                } else if (var11.field6437) {
                                    class358.field5165 = -1;
                                }
                            }
                            if (!class526.field7677 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class383.method2273(8, var11, arg9 - var13, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class113.field1820.method52((byte) 120) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class97 var24 = (class97) class14.field148.method3137(0);
                            if (var24 != null && var24.method777(-115) == 0 && var24.method778(-7747) >= var14 && var24.method779((byte) -105) >= var15 && var24.method778(-7747) < var16 && var24.method779((byte) -67) < var17) {
                                var23 = true;
                            }
                            if (var11.field6471 != null) {
                                for (int var25 = 0; var25 < var11.field6471.length; var25++) {
                                    if (class78.field1106.method2585(var11.field6471[var25], (byte) 73)) {
                                        if (var11.field6410 == null || class28.field417 >= var11.field6410[var25]) {
                                            byte var26 = var11.field6389[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class78.field1106.method2585(86, (byte) 73) && !class78.field1106.method2585(82, (byte) 116) && !class78.field1106.method2585(81, (byte) 125)) && ((var26 & 0x2) == 0 || class78.field1106.method2585(86, (byte) 119)) && ((var26 & 0x1) == 0 || class78.field1106.method2585(82, (byte) 73)) && ((var26 & 0x4) == 0 || class78.field1106.method2585(81, (byte) 63))) {
                                                if (var25 < 10) {
                                                    class237.method1449(-1, "", var11.field6469, var25 + 1, true);
                                                } else if (var25 == 10) {
                                                    class319.method1893(-84);
                                                    class428 var27 = method3067(var11);
                                                    class39.method275(true, var27.method2554(125), var11, var27.field6211);
                                                    class87.field1409 = class295.method1705(true, var11);
                                                    if (class87.field1409 == null) {
                                                        class87.field1409 = "Null";
                                                    }
                                                    class476.field6886 = var11.field6409 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field6529[var25];
                                                if (var11.field6410 == null) {
                                                    var11.field6410 = new int[var11.field6471.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field6410[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6410[var25] = class28.field417 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field6410 != null) {
                                        var11.field6410[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class129.method931(var24.method779((byte) 76) - var13, var11, var24.method778(-7747) - var12, 0);
                            }
                            if (class294.field3967 != null && class294.field3967 != var11 && var21 && method3067(var11).method2555(4120336)) {
                                class151.field2332 = var11;
                            }
                            if (class250.field3411 == var11) {
                                class141.field2101 = true;
                                class336.field4895 = var12;
                                class311.field4223 = var13;
                            }
                            if (var11.field6395 || var11.field6384 != 0) {
                                if (var21 && class181.field2695 != 0 && var11.field6428 != null) {
                                    class414 var29 = new class414();
                                    var29.field5893 = true;
                                    var29.field5896 = var11;
                                    var29.field5898 = class181.field2695;
                                    var29.field5900 = var11.field6428;
                                    class63.field922.method3139(0, var29);
                                }
                                if (class294.field3967 != null || class526.field7677 || class434.field6294 != var11.field6384 && class123.field1909 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6384 != 0) {
                                    if (class454.field6634 == var11.field6384 || class282.field3835 == var11.field6384) {
                                        class302.field4126 = var11;
                                        if (class284.field3854 != null) {
                                            class284.field3854.method847(var11.field6453, true, class275.field3737);
                                        }
                                        if (class454.field6634 == var11.field6384) {
                                            if (!class526.field7677 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class50.method335(class275.field3737, arg9, arg8, false);
                                                for (class221 var30 = (class221) class240.field3321.method2600((byte) -96); var30 != null; var30 = (class221) class240.field3321.method2601(109)) {
                                                    if (arg8 >= var30.field3119 && arg8 < var30.field3121 && arg9 >= var30.field3118 && arg9 < var30.field3123) {
                                                        class283.method1630(true);
                                                        class358.method2135(var30.field3120, Integer.MAX_VALUE);
                                                    }
                                                }
                                            }
                                            class183.method1240(var12, var11, (byte) 5, var13);
                                            continue;
                                        }
                                    }
                                    if (class294.field3971 == var11.field6384) {
                                        if (var11.method2619(17042, class275.field3737) == null || class195.field2827 != 0 && class195.field2827 != 3 || class526.field7677 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field6503[var32];
                                        if (var31 < var33 || var31 > var11.field6387[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field6470 / 2;
                                        int var35 = var32 - var11.field6453 / 2;
                                        int var36;
                                        if (class247.field3363 == 4) {
                                            var36 = (int) class191.field2797 & 0x3FFF;
                                        } else {
                                            var36 = (int) class191.field2797 + class457.field6666 & 0x3FFF;
                                        }
                                        int var37 = class51.field743[var36];
                                        int var38 = class51.field731[var36];
                                        if (class247.field3363 != 4) {
                                            var37 = (class532.field7816 + 256) * var37 >> 8;
                                            var38 = (class532.field7816 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class247.field3363 == 4) {
                                            var41 = (class387.field5569 >> 7) + (var39 >> 2);
                                            var42 = (class102.field1606 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class81.field1158.method116(8569) - 1) * 64;
                                            var41 = (class81.field1158.field6284 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class81.field1158.field6287 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class375.field5390 && (class107.field1737 & 0x40) != 0) {
                                            class444 var44 = class222.method1381(class478.field6914, class478.field6916, -109);
                                            if (var44 == null) {
                                                class319.method1893(120);
                                            } else {
                                                class193.method1274(var41, class87.field1409, true, class484.field6965, " ->", var11.field6481, var42, 59, false, true, 1L);
                                            }
                                            continue;
                                        }
                                        if (class308.field4192 == class152.field2343) {
                                            class193.method1274(var41, class2.field34.method1126(class486.field6998, (byte) -19), true, -1, "", -1, var42, 50, false, true, 1L);
                                        }
                                        class193.method1274(var41, class76.field1078, true, class347.field4989, "", -1, var42, 10, false, true, 1L);
                                        continue;
                                    }
                                    if (class434.field6294 == var11.field6384) {
                                        class387.field5556 = var11;
                                        if (var21) {
                                            class300.field4108 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method778(-7747) - var12 - var11.field6470 / 2) * 2.0D / (double) class472.field6812);
                                            int var46 = (int) (-((double) (var24.method779((byte) 60) - var13 - var11.field6453 / 2) * 2.0D / (double) class472.field6812));
                                            int var47 = class336.field4899 + var45 + class472.field6838;
                                            int var48 = class321.field4414 + var46 + class472.field6835;
                                            class465 var49 = class28.method188(255);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2693(var48, var50, 0, var47);
                                            if (var50 != null) {
                                                if (class78.field1106.method2585(82, (byte) 121) && class136.field2064 > 0) {
                                                    class378.method2256(var50[1], -127, var50[0], var50[2]);
                                                    continue;
                                                }
                                                class291.field3935 = true;
                                                class13.field143 = var50[0];
                                                class300.field4104 = var50[1];
                                                class485.field6981 = var50[2];
                                            }
                                            class123.field1909 = 1;
                                            class168.field2564 = false;
                                            class108.field1755 = class113.field1820.method55((byte) -37);
                                            class399.field5728 = class113.field1820.method62((byte) 71);
                                            continue;
                                        }
                                        if (var22 && class123.field1909 > 0) {
                                            if (class123.field1909 == 1 && (class108.field1755 != class113.field1820.method55((byte) -37) || class399.field5728 != class113.field1820.method62((byte) 105))) {
                                                class378.field5445 = class336.field4899;
                                                class71.field1024 = class321.field4414;
                                                class123.field1909 = 2;
                                            }
                                            if (class123.field1909 == 2) {
                                                class168.field2564 = true;
                                                class491.method2911((byte) 122, class378.field5445 + (int) ((double) (class108.field1755 - class113.field1820.method55((byte) -37)) * 2.0D / (double) class472.field6810));
                                                class445.method2631(class71.field1024 - (int) ((double) (class399.field5728 - class113.field1820.method62((byte) 125)) * 2.0D / (double) class472.field6810), 28314);
                                            }
                                            continue;
                                        }
                                        if (class123.field1909 > 0 && !class168.field2564) {
                                            if ((class419.field6074 == 1 || class248.method1485((byte) 109)) && class527.field7690 > 2) {
                                                class412.method2420(class399.field5728, class108.field1755, -27626);
                                            } else if (class325.method1929(true)) {
                                                class412.method2420(class399.field5728, class108.field1755, -27626);
                                            }
                                        }
                                        class123.field1909 = 0;
                                        continue;
                                    }
                                    if (class23.field314 == var11.field6384) {
                                        if (var22) {
                                            class248.method1484(var11.field6470, class113.field1820.method62((byte) 47) - var13, var11.field6453, 2, class113.field1820.method55((byte) -37) - var12);
                                        }
                                        continue;
                                    }
                                    if (class458.field6670 == var11.field6384) {
                                        class340.method2063(var13, (byte) -127, var12, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field6449 && var23) {
                                    var11.field6449 = true;
                                    if (var11.field6531 != null) {
                                        class414 var51 = new class414();
                                        var51.field5893 = true;
                                        var51.field5896 = var11;
                                        var51.field5897 = var24.method778(-7747) - var12;
                                        var51.field5898 = var24.method779((byte) 79) - var13;
                                        var51.field5900 = var11.field6531;
                                        class63.field922.method3139(0, var51);
                                    }
                                }
                                if (var11.field6449 && var22 && var11.field6489 != null) {
                                    class414 var52 = new class414();
                                    var52.field5893 = true;
                                    var52.field5896 = var11;
                                    var52.field5897 = class113.field1820.method55((byte) -37) - var12;
                                    var52.field5898 = class113.field1820.method62((byte) 54) - var13;
                                    var52.field5900 = var11.field6489;
                                    class63.field922.method3139(0, var52);
                                }
                                if (var11.field6449 && !var22) {
                                    var11.field6449 = false;
                                    if (var11.field6462 != null) {
                                        class414 var53 = new class414();
                                        var53.field5893 = true;
                                        var53.field5896 = var11;
                                        var53.field5897 = class113.field1820.method55((byte) -37) - var12;
                                        var53.field5898 = class113.field1820.method62((byte) 75) - var13;
                                        var53.field5900 = var11.field6462;
                                        class269.field3623.method3139(0, var53);
                                    }
                                }
                                if (var22 && var11.field6541 != null) {
                                    class414 var54 = new class414();
                                    var54.field5893 = true;
                                    var54.field5896 = var11;
                                    var54.field5897 = class113.field1820.method55((byte) -37) - var12;
                                    var54.field5898 = class113.field1820.method62((byte) 57) - var13;
                                    var54.field5900 = var11.field6541;
                                    class63.field922.method3139(0, var54);
                                }
                                if (!var11.field6415 && var21) {
                                    var11.field6415 = true;
                                    if (var11.field6532 != null) {
                                        class414 var55 = new class414();
                                        var55.field5893 = true;
                                        var55.field5896 = var11;
                                        var55.field5897 = class113.field1820.method55((byte) -37) - var12;
                                        var55.field5898 = class113.field1820.method62((byte) 117) - var13;
                                        var55.field5900 = var11.field6532;
                                        class63.field922.method3139(0, var55);
                                    }
                                }
                                if (var11.field6415 && var21 && var11.field6522 != null) {
                                    class414 var56 = new class414();
                                    var56.field5893 = true;
                                    var56.field5896 = var11;
                                    var56.field5897 = class113.field1820.method55((byte) -37) - var12;
                                    var56.field5898 = class113.field1820.method62((byte) 66) - var13;
                                    var56.field5900 = var11.field6522;
                                    class63.field922.method3139(0, var56);
                                }
                                if (var11.field6415 && !var21) {
                                    var11.field6415 = false;
                                    if (var11.field6465 != null) {
                                        class414 var57 = new class414();
                                        var57.field5893 = true;
                                        var57.field5896 = var11;
                                        var57.field5897 = class113.field1820.method55((byte) -37) - var12;
                                        var57.field5898 = class113.field1820.method62((byte) 90) - var13;
                                        var57.field5900 = var11.field6465;
                                        class269.field3623.method3139(0, var57);
                                    }
                                }
                                if (var11.field6394 != null) {
                                    class414 var58 = new class414();
                                    var58.field5896 = var11;
                                    var58.field5900 = var11.field6394;
                                    class50.field708.method3139(0, var58);
                                }
                                if (var11.field6508 != null && class121.field1883 > var11.field6421) {
                                    if (var11.field6433 == null || class121.field1883 - var11.field6421 > 32) {
                                        class414 var63 = new class414();
                                        var63.field5896 = var11;
                                        var63.field5900 = var11.field6508;
                                        class63.field922.method3139(0, var63);
                                    } else {
                                        label691: for (int var59 = var11.field6421; var59 < class121.field1883; var59++) {
                                            int var60 = class434.field6291[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field6433.length; var61++) {
                                                if (var11.field6433[var61] == var60) {
                                                    class414 var62 = new class414();
                                                    var62.field5896 = var11;
                                                    var62.field5900 = var11.field6508;
                                                    class63.field922.method3139(0, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6421 = class121.field1883;
                                }
                                if (var11.field6468 != null && class119.field1857 > var11.field6514) {
                                    if (var11.field6422 == null || class119.field1857 - var11.field6514 > 32) {
                                        class414 var68 = new class414();
                                        var68.field5896 = var11;
                                        var68.field5900 = var11.field6468;
                                        class63.field922.method3139(0, var68);
                                    } else {
                                        label667: for (int var64 = var11.field6514; var64 < class119.field1857; var64++) {
                                            int var65 = class77.field1082[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field6422.length; var66++) {
                                                if (var11.field6422[var66] == var65) {
                                                    class414 var67 = new class414();
                                                    var67.field5896 = var11;
                                                    var67.field5900 = var11.field6468;
                                                    class63.field922.method3139(0, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6514 = class119.field1857;
                                }
                                if (var11.field6521 != null && class342.field4940 > var11.field6547) {
                                    if (var11.field6441 == null || class342.field4940 - var11.field6547 > 32) {
                                        class414 var73 = new class414();
                                        var73.field5896 = var11;
                                        var73.field5900 = var11.field6521;
                                        class63.field922.method3139(0, var73);
                                    } else {
                                        label643: for (int var69 = var11.field6547; var69 < class342.field4940; var69++) {
                                            int var70 = class278.field3775[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field6441.length; var71++) {
                                                if (var11.field6441[var71] == var70) {
                                                    class414 var72 = new class414();
                                                    var72.field5896 = var11;
                                                    var72.field5900 = var11.field6521;
                                                    class63.field922.method3139(0, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6547 = class342.field4940;
                                }
                                if (var11.field6402 != null && class72.field1036 > var11.field6504) {
                                    if (var11.field6458 == null || class72.field1036 - var11.field6504 > 32) {
                                        class414 var78 = new class414();
                                        var78.field5896 = var11;
                                        var78.field5900 = var11.field6402;
                                        class63.field922.method3139(0, var78);
                                    } else {
                                        label619: for (int var74 = var11.field6504; var74 < class72.field1036; var74++) {
                                            int var75 = class266.field3584[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field6458.length; var76++) {
                                                if (var11.field6458[var76] == var75) {
                                                    class414 var77 = new class414();
                                                    var77.field5896 = var11;
                                                    var77.field5900 = var11.field6402;
                                                    class63.field922.method3139(0, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6504 = class72.field1036;
                                }
                                if (var11.field6427 != null && class34.field538 > var11.field6474) {
                                    if (var11.field6430 == null || class34.field538 - var11.field6474 > 32) {
                                        class414 var83 = new class414();
                                        var83.field5896 = var11;
                                        var83.field5900 = var11.field6427;
                                        class63.field922.method3139(0, var83);
                                    } else {
                                        label595: for (int var79 = var11.field6474; var79 < class34.field538; var79++) {
                                            int var80 = class165.field2541[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field6430.length; var81++) {
                                                if (var11.field6430[var81] == var80) {
                                                    class414 var82 = new class414();
                                                    var82.field5896 = var11;
                                                    var82.field5900 = var11.field6427;
                                                    class63.field922.method3139(0, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6474 = class34.field538;
                                }
                                if (class530.field7788 > var11.field6488 && var11.field6416 != null) {
                                    class414 var84 = new class414();
                                    var84.field5896 = var11;
                                    var84.field5900 = var11.field6416;
                                    class63.field922.method3139(0, var84);
                                }
                                if (class294.field3968 > var11.field6488 && var11.field6478 != null) {
                                    class414 var85 = new class414();
                                    var85.field5896 = var11;
                                    var85.field5900 = var11.field6478;
                                    class63.field922.method3139(0, var85);
                                }
                                if (class68.field976 > var11.field6488 && var11.field6438 != null) {
                                    class414 var86 = new class414();
                                    var86.field5896 = var11;
                                    var86.field5900 = var11.field6438;
                                    class63.field922.method3139(0, var86);
                                }
                                if (class296.field3996 > var11.field6488 && var11.field6457 != null) {
                                    class414 var87 = new class414();
                                    var87.field5896 = var11;
                                    var87.field5900 = var11.field6457;
                                    class63.field922.method3139(0, var87);
                                }
                                if (class492.field7132 > var11.field6488 && var11.field6393 != null) {
                                    class414 var88 = new class414();
                                    var88.field5896 = var11;
                                    var88.field5900 = var11.field6393;
                                    class63.field922.method3139(0, var88);
                                }
                                var11.field6488 = class365.field5245;
                                if (var11.field6432 != null) {
                                    for (int var89 = 0; var89 < class329.field4472; var89++) {
                                        class414 var90 = new class414();
                                        var90.field5896 = var11;
                                        var90.field5892 = field7560[var89].method1437(-24469);
                                        var90.field5908 = field7560[var89].method1435(-126);
                                        var90.field5900 = var11.field6432;
                                        class63.field922.method3139(0, var90);
                                    }
                                }
                                if (class375.field5394 && var11.field6460 != null) {
                                    class414 var91 = new class414();
                                    var91.field5896 = var11;
                                    var91.field5900 = var11.field6460;
                                    class63.field922.method3139(0, var91);
                                }
                            }
                            if (var11.field6477 == 5 && var11.field6539 != -1) {
                                var11.method2615(class90.field1454, 35, class215.field3058).method847(var11.field6453, true, class275.field3737);
                            }
                            class295.method1704(-20215, var11);
                            if (var11.field6477 == 0) {
                                method3065(arg0, var11.field6469, var14, var15, var16, var17, var12 - var11.field6443, var13 - var11.field6451, arg8, arg9);
                                if (var11.field6491 != null) {
                                    method3065(var11.field6491, var11.field6469, var14, var15, var16, var17, var12 - var11.field6443, var13 - var11.field6451, arg8, arg9);
                                }
                                class91 var92 = (class91) class425.field6168.method1592((byte) -25, (long) var11.field6469);
                                if (var92 != null) {
                                    if (class98.field1564 == class152.field2343 && var92.field1461 == 0 && !class526.field7677 && var21 && !class181.field2693) {
                                        class283.method1630(true);
                                    }
                                    class251.method1495(var16, var17, 3641, var13, arg9, var14, var12, arg8, var15, var92.field1460);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class295.method1704(-20215, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 3674)
    private final void method3066(boolean arg0) {
        field7554++;
        if (class40.field600 < class503.field7364.field2887) {
            class184.field2737.field613 = !class184.field2737.field613;
            class445.field6553 = (class503.field7364.field2887 * 50 - 50) * 5;
            if (class445.field6553 > 3000) {
                class445.field6553 = 3000;
            }
            if (class503.field7364.field2887 >= 2 && class503.field7364.field2888 == 6) {
                this.method2295("js5connect_outofdate", (byte) 42);
                class494.field7155 = 13;
                return;
            }
            if (class503.field7364.field2887 >= 4 && class503.field7364.field2888 == -1) {
                this.method2295("js5crc", (byte) 42);
                class494.field7155 = 13;
                return;
            }
            if (class503.field7364.field2887 >= 4 && class56.method369(class494.field7155, (byte) -112)) {
                if (class503.field7364.field2888 == 7 || class503.field7364.field2888 == 9) {
                    this.method2295("js5connect_full", (byte) 42);
                } else if (class503.field7364.field2888 <= 0) {
                    this.method2295("js5io", (byte) 42);
                } else {
                    this.method2295("js5connect", (byte) 42);
                }
                class494.field7155 = 13;
                return;
            }
        }
        class40.field600 = class503.field7364.field2887;
        if (class445.field6553 > 0) {
            class445.field6553--;
            return;
        }
        try {
            if (class240.field3317 == 0) {
                class533.field7848 = class346.field4985.method1181(class184.field2737.field603, 113, class184.field2737.method285(-88));
                class240.field3317++;
            }
            if (arg0) {
                field7563 = null;
            }
            if (class240.field3317 == 1) {
                if (class533.field7848.field6699 == 2) {
                    this.method3064(1000, (byte) 94);
                    return;
                }
                if (class533.field7848.field6699 == 1) {
                    class240.field3317++;
                }
            }
            if (class240.field3317 == 2) {
                class24.field328 = new class27((Socket) class533.field7848.field6695, class346.field4985);
                class319 var2 = new class319(5);
                var2.method1891(arg0, class88.field1430.field2102);
                var2.method1858(599, (byte) -88);
                class24.field328.method180(0, 5, 18170, var2.field4336);
                class240.field3317++;
                class193.field2816 = class254.method1522((byte) -51);
            }
            if (class240.field3317 == 3) {
                if (class56.method369(class494.field7155, (byte) 26) || class24.field328.method181(-1) > 0) {
                    int var3 = class24.field328.method175(-25652);
                    if (var3 != 0) {
                        this.method3064(var3, (byte) 94);
                        return;
                    }
                    class240.field3317++;
                } else if ((class254.method1522((byte) -51) - class193.field2816) > 30000L) {
                    this.method3064(1001, (byte) 94);
                    return;
                }
            }
            if (class240.field3317 == 4) {
                boolean var4 = class494.field7155 == 1 || class317.method1823(3, class494.field7155) || class222.method1384(0, class494.field7155);
                class503.field7364.method1285(0, class24.field328, !var4);
                class533.field7848 = null;
                class240.field3317 = 0;
                class24.field328 = null;
            }
        } catch (IOException var5) {
            this.method3064(1002, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lat;)Leo;", line = 3820)
    public static final class428 method3067(class444 arg0) {
        class428 var1 = (class428) class120.field1866.method1592((byte) -25, ((long) arg0.field6469 << 32) + (long) arg0.field6510);
        return var1 == null ? arg0.field6517 : var1;
    }
}
