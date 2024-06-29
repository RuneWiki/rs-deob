import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 extends class128 {

    @OriginalMember(owner = "client!la", name = "M", descriptor = "[B")
    public byte[] field1894;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lid;")
    private static class60 field1881 = class11.method72("Invalid loginserver requested)3", (byte) 106);

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Lid;")
    public static class60 field1884 = field1881;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Lid;")
    public static class60 field1887 = class11.method72("Okay", (byte) -90);

    @OriginalMember(owner = "client!la", name = "C", descriptor = "Lid;")
    public static class60 field1885 = class11.method72("::fpson", (byte) 101);

    @OriginalMember(owner = "client!la", name = "D", descriptor = "Lid;")
    public static class60 field1886 = class11.method72("<col=ff7000>", (byte) 101);

    @OriginalMember(owner = "client!la", name = "F", descriptor = "Lfd;")
    public static class40 field1888 = null;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "Lid;")
    private static class60 field1895 = class11.method72("Loaded sprites", (byte) 127);

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lid;")
    public static class60 field1877 = class11.method72("oder ung-Ultiges Passwort)3", (byte) -75);

    @OriginalMember(owner = "client!la", name = "K", descriptor = "Lid;")
    public static class60 field1893 = field1895;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public static int field1892 = 0;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[[[B")
    public static byte[][][] field1889;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static final void method623(byte arg0) {
        field1896++;
        int var1 = class139.field3152 * 128 + 64;
        int var2 = class14.field305 * 128 + 64;
        int var3 = class50.method381(class46.field1222, var2, var1, (byte) 10) - class73.field1753;
        if (var3 > class101.field2461) {
            class101.field2461 += (var3 - class101.field2461) * class64.field1599 / 1000 + class14.field256;
            if (class101.field2461 > var3) {
                class101.field2461 = var3;
            }
        }
        if (var3 < class101.field2461) {
            class101.field2461 -= (class101.field2461 - var3) * class64.field1599 / 1000 + class14.field256;
            if (var3 > class101.field2461) {
                class101.field2461 = var3;
            }
        }
        if (class140.field3198 < var1) {
            class140.field3198 += (var1 - class140.field3198) * class64.field1599 / 1000 + class14.field256;
            if (var1 < class140.field3198) {
                class140.field3198 = var1;
            }
        }
        if (var2 > class128.field2931) {
            class128.field2931 += (var2 - class128.field2931) * class64.field1599 / 1000 + class14.field256;
            if (class128.field2931 > var2) {
                class128.field2931 = var2;
            }
        }
        if (var1 < class140.field3198) {
            class140.field3198 -= class14.field256 + (class140.field3198 - var1) * class64.field1599 / 1000;
            if (class140.field3198 < var1) {
                class140.field3198 = var1;
            }
        }
        if (var2 < class128.field2931) {
            class128.field2931 -= (class128.field2931 - var2) * class64.field1599 / 1000 + class14.field256;
            if (var2 > class128.field2931) {
                class128.field2931 = var2;
            }
        }
        int var4 = class53.field1347 * 128 + 64;
        int var5 = class148.field3368 * 128 + 64;
        int var6 = class50.method381(class46.field1222, var4, var5, (byte) 10) - class109.field2659;
        int var7 = var6 - class101.field2461;
        int var8 = var5 - class140.field3198;
        int var9 = var4 - class128.field2931;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (class63.field1567 < var11) {
            class63.field1567 += (var11 - class63.field1567) * class59.field1427 / 1000 + class155.field3549;
            if (class63.field1567 > var11) {
                class63.field1567 = var11;
            }
        }
        if (class63.field1567 > var11) {
            class63.field1567 -= (class63.field1567 - var11) * class59.field1427 / 1000 + class155.field3549;
            if (var11 > class63.field1567) {
                class63.field1567 = var11;
            }
        }
        int var13 = var12 - class74.field1787;
        if (arg0 < 88) {
            return;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class74.field1787 += class59.field1427 * var13 / 1000 + class155.field3549;
            class74.field1787 &= 0x7FF;
        }
        if (var13 < 0) {
            class74.field1787 -= class155.field3549 + -var13 * class59.field1427 / 1000;
            class74.field1787 &= 0x7FF;
        }
        int var14 = var12 - class74.field1787;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class74.field1787 = var12;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static void method624(boolean arg0) {
        field1877 = null;
        field1885 = null;
        field1886 = null;
        field1888 = null;
        field1893 = null;
        field1887 = null;
        field1889 = null;
        field1881 = null;
        field1884 = null;
        field1895 = null;
        if (!arg0) {
            method629((byte) 25, -30, null, 82);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
    public static final int method625(int arg0, int arg1, int arg2) {
        field1880++;
        if (arg0 < 42) {
            field1889 = null;
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lof;B)Lid;")
    public static final class60 method626(class103 arg0, byte arg1) {
        if (arg1 <= 111) {
            method627(57);
        }
        field1883++;
        return class17.method142(32767, true, arg0);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
    public static final void method627(int arg0) {
        field1891++;
        if (class24.field594 != null || class154.field3474 != null) {
            return;
        }
        int var1 = class60.field1466;
        if (class135.field3067) {
            if (var1 != 1) {
                int var2 = class43.field1153;
                int var3 = class21.field494;
                if (var2 < class101.field2465 - 10 || var2 > class2.field54 + class101.field2465 + 10 || class63.field1576 - 10 > var3 || class63.field1576 + class17.field416 + 10 < var3) {
                    class135.field3067 = false;
                    class10.method65(arg0 ^ 0x63, class2.field54, class101.field2465, class17.field416, class63.field1576);
                }
            }
            if (var1 == 1) {
                int var4 = class63.field1576;
                int var5 = class101.field2465;
                int var6 = class140.field3185;
                int var7 = -1;
                int var8 = class139.field3174;
                int var9 = class2.field54;
                for (int var10 = 0; var10 < class80.field1956; var10++) {
                    int var11 = (class80.field1956 - var10 - 1) * 15 + var4 + 31;
                    if (var6 > var5 && var6 < var5 + var9 && var11 - 13 < var8 && var11 + 3 > var8) {
                        var7 = var10;
                    }
                }
                if (var7 != -1) {
                    class139.method1085(true, var7);
                }
                class135.field3067 = false;
                class10.method65(87, class2.field54, class101.field2465, class17.field416, class63.field1576);
            }
        } else {
            if (var1 == 1 && class80.field1956 > 0) {
                int var12 = class90.field2249[class80.field1956 - 1];
                if (var12 == 5 || var12 == 38 || var12 == 20 || var12 == 47 || var12 == 2 || var12 == 30 || var12 == 31 || var12 == 37 || var12 == 23 || var12 == 26 || var12 == 49 || var12 == 1001) {
                    int var13 = class56.field1406[class80.field1956 - 1];
                    int var14 = class69.field1653[class80.field1956 - 1];
                    class40 var15 = class132.method1041(true, var14);
                    if (class10.method68(class97.method770(var15, -1370253216), (byte) 115) || class154.method1171(1030700721, class97.method770(var15, arg0 - 1370253217))) {
                        class75.field1797 = 0;
                        class129.field2938 = false;
                        if (class24.field594 != null) {
                            class12.method79(-30833, class24.field594);
                        }
                        class24.field594 = class132.method1041(true, var14);
                        class50.field1285 = class140.field3185;
                        class28.field685 = class139.field3174;
                        class60.field1475 = var13;
                        class12.method79(arg0 - 30834, class24.field594);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class61.field1539 == 1 && class80.field1956 > 2 || class103.method842(1012065392, class80.field1956 - 1))) {
                var1 = 2;
            }
            if (var1 == 1 && class80.field1956 > 0) {
                class139.method1085(true, class80.field1956 - 1);
            }
            if (var1 == 2 && class80.field1956 > 0) {
                class12.method76(arg0 ^ 0x3F56);
            }
        }
        if (arg0 != 1) {
            field1887 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILie;I)Z")
    public static final boolean method628(int arg0, int arg1, class61 arg2, int arg3) {
        if (arg3 >= -115) {
            method623((byte) -43);
        }
        byte[] var4 = arg2.method473((byte) 123, arg0, arg1);
        field1879++;
        if (var4 == null) {
            return false;
        } else {
            class13.method84(-121, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI[BI)Z")
    public static final boolean method629(byte arg0, int arg1, byte[] arg2, int arg3) {
        field1890++;
        class103 var4 = new class103(arg2);
        if (arg0 > -12) {
            method627(-34);
        }
        boolean var5 = true;
        int var6 = -1;
        label58: while (true) {
            int var7 = var4.method835(-24298);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var4.method835(-24298);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 & 0x3F;
                    int var13 = var9 >> 6 & 0x3F;
                    int var14 = var4.method829((byte) 66) >> 2;
                    int var15 = var13 + arg3;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class148 var17 = class31.method238(-29628, var6);
                        if (var14 != 22 || !class22.field548 || var17.field3359 != 0 || var17.field3348 == 1 || var17.field3318) {
                            var8 = true;
                            if (!var17.method1133(105)) {
                                var5 = false;
                                class102.field2474++;
                            }
                        }
                    }
                }
                int var10 = var4.method835(-24298);
                if (var10 == 0) {
                    break;
                }
                var4.method829((byte) 107);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method630(byte arg0, Component arg1) {
        arg1.removeMouseListener(class145.field3268);
        if (arg0 > -23) {
            field1893 = null;
        }
        field1878++;
        arg1.removeMouseMotionListener(class145.field3268);
        arg1.removeFocusListener(class145.field3268);
        class136.field3084 = 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLef;)V")
    public static final void method631(boolean arg0, class35 arg1) {
        if (arg1.field862 == 0) {
            arg1.field822 = 1024;
        }
        arg1.field836 = 0;
        int var2 = arg1.field851 - class82.field2065;
        if (arg1.field862 == 1) {
            arg1.field822 = 1536;
        }
        if (arg1.field862 == 2) {
            arg1.field822 = 0;
        }
        field1882++;
        if (arg1.field862 == 3) {
            arg1.field822 = 512;
        }
        int var3 = arg1.field818 * 128 + arg1.field872 * 64;
        arg1.field854 += (var3 - arg1.field854) / var2;
        int var4 = arg1.field835 * 128 + arg1.field872 * 64;
        if (!arg0) {
            method627(19);
        }
        arg1.field828 += (var4 - arg1.field828) / var2;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
    public class77(byte[] arg0) {
        this.field1894 = arg0;
    }
}
