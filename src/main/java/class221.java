import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class221 extends class45 {

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "Z")
    public static boolean field3438 = false;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field3437 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field3440 = -1;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field3430 = 0;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3436 = "glow1:";

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field3439 = 0;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "[Lho;")
    public static class215[] field3434;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lrn;I)V", line = 12)
    public static final void method1655(class18 arg0, int arg1) {
        class44.field702 = arg0;
        field3432++;
        int var2 = 26 / ((14 - arg1) / 50);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)Z", line = 30)
    public static final boolean method1656(byte arg0) {
        field3435++;
        if (class42.field671 == 0) {
            if (arg0 != -117) {
                field3430 = 105;
            }
            return class128.field2122.method133(4);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILvo;Lec;I)V", line = 45)
    public static final void method1657(int arg0, int arg1, class22 arg2, class181 arg3, int arg4) {
        field3431++;
        if (arg3.field2835 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg3.field2835.length];
            for (int var7 = 0; var7 < (var6.length / 2); var7++) {
                int var8 = arg3.field2835[var7 * 2] + arg2.field339;
                int var9 = arg2.field348 - arg3.field2835[var7 * 2 + 1];
                int var10 = var6[var7 * 2] = (var8 - class351.field5603) * (class351.field5610 - class351.field5614) / (class351.field5611 - class351.field5603) + class351.field5614;
                int var11 = var6[var7 * 2 + 1] = (var9 - class351.field5615) * (class351.field5604 - class351.field5605) / (class351.field5606 - class351.field5615) + class351.field5605;
                if (var10 > class351.field5614 && class351.field5610 > var10 && class351.field5605 < var11 && class351.field5604 > var11) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class241.method1825(var6, arg3.field2839, arg3.field2839 >>> 24);
            for (int var12 = 0; var12 < (var6.length / 2 - 1); var12++) {
                class60.method591(var6[var12 * 2], var6[var12 * 2 + 1], var6[var12 * 2 + 2], var6[(var12 + 1) * 2 + 1], arg3.field2862, arg3.field2862 >>> 24);
            }
            class60.method591(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg3.field2862, arg3.field2862 >>> 24);
        } else if (arg2.field347) {
            return;
        }
        class77 var13 = null;
        if (arg4 >= -59) {
            return;
        }
        class255 var14 = new class255(arg2);
        if (arg3.field2863 != -1) {
            if (arg2.field340 && arg3.field2854 != -1) {
                var13 = (class77) arg3.method1406(true, true, -127);
            } else {
                var13 = (class77) arg3.method1406(true, false, -120);
            }
            if (var13 != null) {
                if (class300.field4664 > 0 && (class310.field4800 != -1 && class310.field4800 == arg2.field349 || class155.field2503 != -1 && class155.field2503 == arg3.field2857)) {
                    int var15;
                    if (class332.field5098 > 50) {
                        var15 = (100 - class332.field5098) * 3;
                    } else {
                        var15 = class332.field5098 * 3;
                    }
                    class60.method599(arg2.field343, arg2.field345, var13.field3827 / 2 + 7, 16776960, var15);
                    class60.method599(arg2.field343, arg2.field345, var13.field3827 / 2 + 5, 16776960, var15);
                    class60.method599(arg2.field343, arg2.field345, var13.field3827 / 2 + 3, 16776960, var15);
                    class60.method599(arg2.field343, arg2.field345, var13.field3827 / 2 + 1, 16776960, var15);
                    class60.method599(arg2.field343, arg2.field345, var13.field3827 / 2, 16776960, var15);
                }
                var13.method711(arg2.field343 - (var13.field3827 >> 1), -(var13.field3826 >> 1) + arg2.field345);
                var14.field3919 = arg2.field343 + arg0 - (var13.field3827 >> 1);
                var14.field3922 = (var13.field3826 >> 1) + arg2.field345 + arg1;
                var14.field3930 = arg2.field343 + arg0 + (var13.field3827 >> 1);
                var14.field3934 = arg2.field345 + arg1 - (var13.field3826 >> 1);
            }
        }
        if (arg3.field2841 != null) {
            if (var13 == null) {
                class311.method2208(arg1, arg2, 10, var14, 0, arg0, true, arg3);
            } else {
                class311.method2208(arg1, arg2, 10, var14, (var13.field3826 >> 1) + 5, arg0, false, arg3);
            }
        }
        if (var14.method1891(class78.field1129, class268.field4137, (byte) -123) && arg3.field2860 != null) {
            if (arg3.field2860[4] != null) {
                class268.method1963((short) 1005, arg3.field2844, 0, -1, arg3.field2860[4], (long) arg2.field349, -25900, arg3.field2857);
            }
            if (arg3.field2860[3] != null) {
                class268.method1963((short) 1003, arg3.field2844, 0, -1, arg3.field2860[3], (long) arg2.field349, -25900, arg3.field2857);
            }
            if (arg3.field2860[2] != null) {
                class268.method1963((short) 1002, arg3.field2844, 0, -1, arg3.field2860[2], (long) arg2.field349, -25900, arg3.field2857);
            }
            if (arg3.field2860[1] != null) {
                class268.method1963((short) 1004, arg3.field2844, 0, -1, arg3.field2860[1], (long) arg2.field349, -25900, arg3.field2857);
            }
            if (arg3.field2860[0] != null) {
                class268.method1963((short) 1008, arg3.field2844, 0, -1, arg3.field2860[0], (long) arg2.field349, -25900, arg3.field2857);
            }
        }
        class128.field2131.method2245(var14, 64);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BB)C", line = 182)
    public static final char method1658(byte arg0, byte arg1) {
        if (arg0 >= -110) {
            return 'o';
        }
        int var2 = arg1 & 0xFF;
        field3441++;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class71.field1068[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIILjava/lang/String;)V", line = 210)
    public static final void method1659(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class342 var5 = class320.method2259(arg0, arg2, 0);
        field3433++;
        if (var5 == null) {
            return;
        }
        if (var5.field5422 != null) {
            class112 var6 = new class112();
            var6.field1711 = var5.field5422;
            var6.field1706 = var5;
            var6.field1714 = arg4;
            var6.field1707 = arg3;
            class160.method1288((byte) -45, var6);
        }
        if (arg1 != 12832) {
            method1655((class18) null, 35);
        }
        boolean var7 = true;
        if (var5.field5427 > 0) {
            var7 = class118.method1005(var5, (byte) 109);
        }
        if (!var7 || !client.method1022(var5).method1701(true, arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class99.field1491.method1628((byte) -67, 173);
            class99.field1491.method310(arg1 ^ 0x3274, arg2);
            class99.field1491.method304(false, arg0);
            class255.field3924++;
        }
        if (arg3 == 2) {
            class99.field1491.method1628((byte) -36, 157);
            class293.field4548++;
            class99.field1491.method310(89, arg2);
            class99.field1491.method304(false, arg0);
        }
        if (arg3 == 3) {
            class178.field2808++;
            class99.field1491.method1628((byte) -102, 118);
            class99.field1491.method310(arg1 ^ 0x325A, arg2);
            class99.field1491.method304(false, arg0);
        }
        if (arg3 == 4) {
            class81.field1180++;
            class99.field1491.method1628((byte) -111, 55);
            class99.field1491.method310(119, arg2);
            class99.field1491.method304(false, arg0);
        }
        if (arg3 == 5) {
            class101.field1523++;
            class99.field1491.method1628((byte) -60, 226);
            class99.field1491.method310(115, arg2);
            class99.field1491.method304(false, arg0);
        }
        if (arg3 == 6) {
            class99.field1491.method1628((byte) -70, 191);
            class217.field3384++;
            class99.field1491.method310(55, arg2);
            class99.field1491.method304(false, arg0);
        }
        if (arg3 == 7) {
            class208.field3209++;
            class99.field1491.method1628((byte) -89, 212);
            class99.field1491.method310(arg1 - 12773, arg2);
            class99.field1491.method304(false, arg0);
        }
        if (arg3 == 8) {
            class99.field1491.method1628((byte) -50, 164);
            class223.field3470++;
            class99.field1491.method310(122, arg2);
            class99.field1491.method304(false, arg0);
        }
        if (arg3 == 9) {
            class99.field1491.method1628((byte) -114, 67);
            class99.field1491.method310(65, arg2);
            class167.field2652++;
            class99.field1491.method304(false, arg0);
        }
        if (arg3 == 10) {
            class167.field2668++;
            class99.field1491.method1628((byte) -28, 170);
            class99.field1491.method310(61, arg2);
            class99.field1491.method304(false, arg0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 342)
    public static void method1660(boolean arg0) {
        field3434 = null;
        if (arg0) {
            method1657(-81, -93, (class22) null, (class181) null, -104);
        }
        field3436 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIC)I", line = 381)
    public static final int method1661(int arg0, int arg1, char arg2) {
        int var3 = arg2 << 4;
        if (arg0 != -1) {
            return 54;
        }
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        field3442++;
        return var3;
    }
}
