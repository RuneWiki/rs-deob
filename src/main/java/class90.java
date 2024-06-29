import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class90 {

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Ljv;")
    private class55 field1565 = new class55(64);

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lbu;")
    private class17 field1561;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lbu;")
    private class17 field1560;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Ltb;")
    public static class273 field1563;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lqa;BLm;)V", line = 4)
    public static final void method699(class162 arg0, byte arg1, class126 arg2) {
        field1562++;
        if (class509.field7483 == null) {
            return;
        }
        if (class368.field5569 < 10) {
            if (!class509.field7488.method133(class509.field7483.field6260, (byte) -95)) {
                class368.field5569 = class407.field6109.method117(class509.field7483.field6260, 0) / 10;
                return;
            }
            class173.method1250(0);
            class368.field5569 = 10;
        }
        if (class368.field5569 == 10) {
            class509.field7519 = class509.field7483.field6272 >> 6 << 6;
            class509.field7503 = class509.field7483.field6255 >> 6 << 6;
            class509.field7522 = (class509.field7483.field6264 >> 6 << 6) + 64 - class509.field7503;
            class509.field7504 = (class509.field7483.field6252 >> 6 << 6) + 64 - class509.field7519;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class509.field7483.method2537((class139.field2224.field6228 >> 7) + class200.field2931, (class139.field2224.field6233 >> 7) + class403.field6059, var3, class139.field2224.field6232, -26767)) {
                var5 = var3[2] - class509.field7519;
                var4 = var3[1] - class509.field7503;
            }
            if (!class398.field6004 && var4 >= 0 && class509.field7522 > var4 && var5 >= 0 && var5 < class509.field7504) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class404.field6067 = var6;
                class158.field2464 = var7;
            } else if (class91.field1571 == -1 || class492.field7282 == -1) {
                class509.field7483.method2528(0, class509.field7483.field6258 >> 14 & 0x3FFF, class509.field7483.field6258 & 0x3FFF, var3);
                class404.field6067 = var3[1] - class509.field7503;
                class158.field2464 = var3[2] - class509.field7519;
            } else {
                class509.field7483.method2528(0, class91.field1571, class492.field7282, var3);
                class492.field7282 = -1;
                class91.field1571 = -1;
                if (var3 != null) {
                    class158.field2464 = var3[2] - class509.field7519;
                    class404.field6067 = var3[1] - class509.field7503;
                }
                class398.field6004 = false;
            }
            if (class509.field7483.field6265 == 37) {
                class509.field7493 = 3.0F;
                class509.field7492 = 3.0F;
            } else if (class509.field7483.field6265 == 50) {
                class509.field7493 = 4.0F;
                class509.field7492 = 4.0F;
            } else if (class509.field7483.field6265 == 75) {
                class509.field7493 = 6.0F;
                class509.field7492 = 6.0F;
            } else if (class509.field7483.field6265 == 100) {
                class509.field7493 = 8.0F;
                class509.field7492 = 8.0F;
            } else if (class509.field7483.field6265 == 200) {
                class509.field7493 = 16.0F;
                class509.field7492 = 16.0F;
            } else {
                class509.field7493 = 8.0F;
                class509.field7492 = 8.0F;
            }
            class509.field7495 = (int) class509.field7493 >> 1;
            class509.field7498 = class406.method2479(class509.field7495, (byte) 89);
            class216.method1443(true);
            class509.method3053();
            class329.field4971 = new class392();
            class509.field7500 += (int) (Math.random() * 5.0D) - 2;
            if (class509.field7500 < -8) {
                class509.field7500 = -8;
            }
            class509.field7499 += (int) (Math.random() * 5.0D) - 2;
            if (class509.field7500 > 8) {
                class509.field7500 = 8;
            }
            if (class509.field7499 < -16) {
                class509.field7499 = -16;
            }
            if (class509.field7499 > 16) {
                class509.field7499 = 16;
            }
            class509.method3036(arg2, class509.field7500 >> 2 << 10, class509.field7499 >> 1);
            class509.field7486.method1813((byte) -118, 256, 1024);
            class509.field7484.method1191(256, (byte) -29, 256);
            class509.field7482.method2869(4096, (byte) 119);
            class419.field6271.method1385(24805, 256);
            class368.field5569 = 20;
        } else if (class368.field5569 == 20) {
            class480.method2860(22662, true);
            class509.method3041(arg0, class509.field7500, class509.field7499);
            class368.field5569 = 60;
            class480.method2860(22662, true);
            class466.method2762((byte) 97);
        } else if (class368.field5569 == 60) {
            if (class509.field7488.method122(class509.field7483.field6260 + "_staticelements", 0)) {
                if (!class509.field7488.method133(class509.field7483.field6260 + "_staticelements", (byte) -95)) {
                    return;
                }
                class509.field7491 = class488.method2895(105, class509.field7488, class223.field3193, class509.field7483.field6260 + "_staticelements");
            } else {
                class509.field7491 = new class7(0);
            }
            class509.method3048();
            class368.field5569 = 70;
            class480.method2860(22662, true);
            class466.method2762((byte) 125);
        } else {
            int var8 = -112 % ((arg1 + 59) / 48);
            if (class368.field5569 == 70) {
                class102.field1684 = new class351(arg0, 11, true, class370.field5611);
                class368.field5569 = 73;
                class480.method2860(22662, true);
                class466.method2762((byte) 111);
            } else if (class368.field5569 == 73) {
                class100.field1654 = new class351(arg0, 12, true, class370.field5611);
                class368.field5569 = 76;
                class480.method2860(22662, true);
                class466.method2762((byte) 114);
            } else if (class368.field5569 == 76) {
                class138.field2221 = new class351(arg0, 14, true, class370.field5611);
                class368.field5569 = 79;
                class480.method2860(22662, true);
                class466.method2762((byte) 69);
            } else if (class368.field5569 == 79) {
                class4.field111 = new class351(arg0, 17, true, class370.field5611);
                class368.field5569 = 82;
                class480.method2860(22662, true);
                class466.method2762((byte) 77);
            } else if (class368.field5569 == 82) {
                class102.field1692 = new class351(arg0, 19, true, class370.field5611);
                class368.field5569 = 85;
                class480.method2860(22662, true);
                class466.method2762((byte) 94);
            } else if (class368.field5569 == 85) {
                class177.field2703 = new class351(arg0, 22, true, class370.field5611);
                class368.field5569 = 88;
                class480.method2860(22662, true);
                class466.method2762((byte) 43);
            } else if (class368.field5569 == 88) {
                class257.field3731 = new class351(arg0, 26, true, class370.field5611);
                class368.field5569 = 91;
                class480.method2860(22662, true);
                class466.method2762((byte) 119);
            } else {
                class358.field5447 = new class351(arg0, 30, true, class370.field5611);
                class368.field5569 = 100;
                class480.method2860(22662, true);
                class466.method2762((byte) 69);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)Lrg;", line = 232)
    public final class453 method700(int arg0, byte arg1) {
        field1557++;
        class453 var3 = (class453) this.field1565.method494(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field1561.method114(arg0 & 0x7FFF, 0, arg1 ^ 0xFFFFFFF0);
        } else {
            var4 = this.field1560.method114(arg0, 0, -58);
        }
        class453 var5 = new class453();
        if (var4 != null) {
            var5.method2704(0, new class145(var4));
        }
        if (arg0 >= 32768) {
            var5.method2708((byte) 89);
        }
        this.field1565.method485((long) arg0, (byte) -125, var5);
        return arg1 == -31 ? var5 : null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 270)
    public static final int method701(int arg0, String arg1) {
        field1564++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 <= 89) {
            method701(78, null);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + arg1.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 294)
    public static final void method702(int arg0) {
        field1559++;
        class410.field6141.field2289 = 0;
        class306.field4673 = null;
        class291.field4140 = 0;
        class92.field1573.field2289 = 0;
        class277.field4001 = null;
        class34.field666 = 0;
        class298.field4247 = null;
        class158.field2463 = null;
        class23.field468 = 0;
        class429.method2573(338);
        class109.method813(50);
        for (int var1 = 0; var1 < 2048; var1++) {
            class183.field2747[var1] = null;
        }
        class139.field2224 = null;
        for (int var2 = 0; var2 < class34.field668.length; var2++) {
            class255 var4 = class34.field668[var2];
            if (var4 != null) {
                var4.field7602 = -1;
            }
        }
        class468.method2774(-115);
        class85.field1473 = 1;
        class244.method1590(30, (byte) 24);
        for (int var3 = 0; var3 < 100; var3++) {
            class355.field5424[var3] = true;
        }
        class474.method2839((byte) 95);
        if (arg0 >= 90) {
            class462.field6919 = 0L;
            class188.field2817 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 360)
    public static void method703(byte arg0) {
        if (arg0 <= 15) {
            method701(-48, null);
        }
        field1563 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(ILbu;Lbu;)V", line = 374)
    public class90(int arg0, class17 arg1, class17 arg2) {
        this.field1561 = arg2;
        this.field1560 = arg1;
        if (this.field1560 != null) {
            this.field1560.method119(29630, 0);
        }
        if (this.field1561 != null) {
            this.field1561.method119(29630, 0);
        }
    }
}
