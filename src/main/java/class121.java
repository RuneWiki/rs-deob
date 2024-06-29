import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[Lsc;")
    public static class128[] field2790 = new class128[4];

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lr;")
    private static class118 field2792 = class153.method1136(88, "Take");

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lr;")
    public static class118 field2796 = field2792;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lr;")
    private static class118 field2793 = class153.method1136(89, "Loading fonts )2 ");

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lr;")
    private static class118 field2802 = class153.method1136(111, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lr;")
    public static class118 field2801 = field2802;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lr;")
    public static class118 field2800 = class153.method1136(85, "titlebutton");

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lr;")
    public static class118 field2807 = field2793;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Lff;")
    public static class42 field2805;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method946(int arg0, boolean arg1) {
        field2791++;
        if (arg0 == 100 && class30.field769 > 0) {
            byte[] var2 = class27.field664[--class30.field769];
            class27.field664[class30.field769] = null;
            return var2;
        } else if (arg0 == 5000 && class53.field1262 > 0) {
            byte[] var3 = class81.field1966[--class53.field1262];
            class81.field1966[class53.field1262] = null;
            return var3;
        } else {
            if (arg1) {
                method950((byte) -114);
            }
            if (arg0 == 30000 && class106.field2478 > 0) {
                byte[] var4 = class77.field1870[--class106.field2478];
                class77.field1870[class106.field2478] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
    public static final void method947(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2797++;
        int var5 = 121 % ((13 - arg2) / 54);
        for (int var6 = 0; var6 < class153.field3481; var6++) {
            if (class91.field2183[var6] + class63.field1447[var6] > arg0 && class91.field2183[var6] < arg0 + arg1 && arg4 < class89.field2144[var6] + class44.field1059[var6] && arg3 + arg4 > class44.field1059[var6]) {
                class54.field1274[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lff;BLr;Lr;)[Lvd;")
    public static final class150[] method948(class42 arg0, byte arg1, class118 arg2, class118 arg3) {
        field2794++;
        int var4 = arg0.method356(arg2, 0);
        int var5 = -60 / ((-arg1 - 2) / 56);
        int var6 = arg0.method351(5, arg3, var4);
        return class26.method229(var6, arg0, var4, (byte) -75);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ldf;ILdf;)V")
    public static final void method949(class28 arg0, int arg1, class28 arg2) {
        field2806++;
        if (class108.field2508) {
            class89.method715(arg0, arg2, (byte) -109);
            return;
        }
        if (class26.field631 == 0 || class26.field631 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg0.method44(class4.field66, 382, 245 - var3, 16777215, -1);
            class52.method478(230, var4, 304, 34, 9179409);
            class52.method478(231, var4 + 1, 302, 32, 0);
            class52.method473(232, var4 + 2, class36.field917 * 3, 30, 9179409);
            class52.method473(class36.field917 * 3 + 232, var4 + 2, 300 - class36.field917 * 3, 30, 0);
            arg0.method44(class132.field3028, 382, 276 - var3, 16777215, -1);
        }
        if (class26.field631 == 20) {
            short var5 = 211;
            class91.field2174.method719(382 - class91.field2174.field2159 / 2, -(class91.field2174.field2158 / 2) + 271);
            arg0.method44(class132.field3024, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method44(class132.field3026, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method44(class132.field3025, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method47(class144.method1066(true, new class118[] { class10.field220, class8.method59(class132.field3022) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method47(class144.method1066(true, new class118[] { class2.field33, class132.field3021.method930(-102) }), 274, var28, 16777215, 0);
            int var30 = var28 + 15;
        }
        if (arg1 <= 113) {
            return;
        }
        if (class26.field631 == 10) {
            class91.field2174.method719(202, 171);
            if (class2.field46 == 0) {
                short var15 = 302;
                short var16 = 251;
                arg0.method44(class118.field2772, 382, var16, 16776960, 0);
                int var35 = var16 + 30;
                short var17 = 291;
                class24.field605.method719(var15 - 73, var17 + -20);
                arg0.method50(class85.field2085, var15 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                class24.field605.method719(var18 - 73, var17 + -20);
                arg0.method50(class55.field1300, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class2.field46 == 2) {
                short var6 = 211;
                arg0.method44(class132.field3024, 382, var6, 16776960, 0);
                short var7 = 302;
                short var8 = 321;
                int var27 = var6 + 15;
                arg0.method44(class132.field3026, 382, var27, 16776960, 0);
                int var29 = var27 + 15;
                arg0.method44(class132.field3025, 382, var29, 16776960, 0);
                boolean var9;
                if (class47.field1138 == 0 && class65.field1479 % 40 < 20 && class67.field1558) {
                    var9 = true;
                } else {
                    var9 = false;
                }
                var27 = var29 + 15;
                var27 += 10;
                arg0.method47(class144.method1066(true, new class118[] { class10.field220, class8.method59(class132.field3022), var9 ? class10.field239 : class132.field3023 }), 272, var27, 16777215, 0);
                var27 += 15;
                boolean var10;
                if (class47.field1138 == 1 && class65.field1479 % 40 < 20 && class67.field1558) {
                    var10 = true;
                } else {
                    var10 = false;
                }
                arg0.method47(class144.method1066(true, new class118[] { class2.field33, class132.field3021.method930(60), var10 ? class10.field239 : class132.field3023 }), 274, var27, 16777215, 0);
                var27 += 15;
                class24.field605.method719(var7 - 73, var8 + -20);
                arg0.method44(class14.field301, var7, var8 + 5, 16777215, 0);
                short var11 = 462;
                class24.field605.method719(var11 - 73, var8 + -20);
                arg0.method44(class83.field1985, var11, var8 + 5, 16777215, 0);
            } else if (class2.field46 == 3) {
                arg0.method44(class148.field3296, 382, 211, 16776960, 0);
                short var12 = 382;
                short var13 = 236;
                short var14 = 321;
                arg0.method44(class84.field2011, 382, var13, 16777215, 0);
                int var31 = var13 + 15;
                arg0.method44(class80.field1937, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                arg0.method44(class9.field192, 382, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg0.method44(class78.field1901, 382, var33, 16777215, 0);
                int var34 = var33 + 15;
                class24.field605.method719(var12 - 73, var14 + -20);
                arg0.method44(class83.field1985, var12, var14 + 5, 16777215, 0);
            }
        }
        if (class125.field2869 != 1) {
            if (class69.field1611 > 0) {
                class34.method282((byte) 119, class69.field1611);
                class69.field1611 = 0;
            }
            class60.method538(256);
        }
        class14.field319[class45.field1088 ? 1 : 0].method719(725, 463);
        if (class26.field631 <= 5 || class103.field2369 == 2 || class15.field390 != 0) {
            return;
        }
        if (class39.field951 == null) {
            class39.field951 = class75.method635(class132.field3023, class53.field1263, class127.field2910, 0);
            return;
        }
        byte var19 = 5;
        short var20 = 463;
        byte var21 = 100;
        class39.field951.method719(var19, var20);
        byte var22 = 35;
        arg0.method44(class144.method1066(true, new class118[] { class43.field1033, class108.field2522, class43.method359(class74.field1836, (byte) -122) }), var21 / 2 + var19, var22 / 2 + var20 + -2, 16777215, 0);
        if (class139.field3167 == null) {
            arg2.method44(class125.field2859, var19 + var21 / 2, var20 + 12 - -(var22 / 2), 16777215, 0);
        } else {
            arg2.method44(class53.field1260, var21 / 2 + var19, var22 / 2 + var20 + 12, 16777215, 0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method950(byte arg0) {
        class70.method600(13492);
        class118.method927((byte) 60);
        if (arg0 < 0) {
            return;
        }
        class35.method293((byte) -88);
        class127.method987((byte) 89);
        field2798++;
        class23.method209((byte) -5);
        class149.method1094(128);
        class65.method569(4);
        class32.method276(true);
        class79.method670((byte) -103);
        class103.method785((byte) 56);
        class142.method1056((byte) 121);
        class73.method616(-23854);
        ((class77) class58.field1351).method653(true);
        class136.field3082.method394(12693);
        class55.field1309.method336(0);
        class70.field1633.method336(0);
        class4.field79.method336(0);
        class91.field2189.method336(0);
        class51.field1223.method336(0);
        class46.field1113.method336(0);
        class159.field3658.method336(0);
        class53.field1263.method336(0);
        class92.field2220.method336(0);
        class55.field1305.method336(0);
        client.field518.method336(0);
        class142.field3221.method336(0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method951(int arg0) {
        field2799++;
        if (arg0 != -1) {
            field2802 = null;
        }
        for (class24 var1 = (class24) class140.field3186.method889(arg0 ^ 0xFFFFFF81); var1 != null; var1 = (class24) class140.field3186.method884(true)) {
            if (class106.field2468 != var1.field586 || var1.field595 < class65.field1479) {
                var1.method768(-1);
            } else if (class65.field1479 >= var1.field567) {
                if (var1.field574 > 0) {
                    class83 var2 = class74.field1833[var1.field574 - 1];
                    if (var2 != null && var2.field760 >= 0 && var2.field760 < 13312 && var2.field712 >= 0 && var2.field712 < 13312) {
                        var1.method217(class46.method386(-15186, var1.field586, var2.field760, var2.field712) - var1.field590, class65.field1479, 7, var2.field760, var2.field712);
                    }
                }
                if (var1.field574 < 0) {
                    int var3 = -var1.field574 - 1;
                    class132 var4;
                    if (class94.field2240 == var3) {
                        var4 = class89.field2150;
                    } else {
                        var4 = class108.field2526[var3];
                    }
                    if (var4 != null && var4.field760 >= 0 && var4.field760 < 13312 && var4.field712 >= 0 && var4.field712 < 13312) {
                        var1.method217(class46.method386(-15186, var1.field586, var4.field760, var4.field712) - var1.field590, class65.field1479, 7, var4.field760, var4.field712);
                    }
                }
                var1.method219(class9.field212, -112);
                class68.field1583.method1191(class106.field2468, (int) var1.field578, (int) var1.field600, (int) var1.field594, 60, var1, var1.field566, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I")
    public static final int method952(byte arg0) {
        field2808++;
        if (arg0 != -11) {
            field2807 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;Z)I")
    public static final int method953(KeyEvent arg0, boolean arg1) {
        field2795++;
        int var2 = arg0.getKeyChar();
        if (!arg1) {
            method952((byte) 118);
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method954(int arg0) {
        if (class4.field68 != null) {
            class56 var1 = class4.field68;
            synchronized (class4.field68) {
                class4.field68 = null;
            }
        }
        if (arg0 != 15) {
            method949(null, 38, null);
        }
        field2803++;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static void method955(int arg0) {
        field2792 = null;
        field2793 = null;
        field2790 = null;
        field2807 = null;
        if (arg0 > -86) {
            field2802 = null;
        }
        field2805 = null;
        field2800 = null;
        field2796 = null;
        field2801 = null;
        field2802 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
    public static final Class method956(String arg0, boolean arg1) throws ClassNotFoundException {
        field2804++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg1) {
                method954(112);
            }
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }
}
