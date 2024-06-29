import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 {

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lbd;")
    public class12 field483 = new class12();

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lwa;")
    public static class154 field470 = null;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field474 = 1;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field472 = -1;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
    public static int[] field479 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lpe;")
    private static class109 field487 = class141.method1120("RuneScape is loading )2 please wait)3)3)3", 0);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lpe;")
    public static class109 field462 = class141.method1120("Fps:", 0);

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lpe;")
    public static class109 field489 = field487;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lpe;")
    public static class109 field464 = class141.method1120("(Z", 0);

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Lre;")
    public static class123 field481;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lbd;")
    private class12 field486;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lh;")
    public static class49 field477;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lna;")
    public static class91 field478;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lna;")
    public static class91 field485;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "[Le;")
    public static class29[] field475;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lbd;BLbd;)V")
    public final void method187(class12 arg0, byte arg1, class12 arg2) {
        if (arg0.field266 != null) {
            arg0.method101((byte) 97);
        }
        if (arg1 > -88) {
            return;
        }
        field465++;
        arg0.field266 = arg2.field266;
        arg0.field263 = arg2;
        arg0.field266.field263 = arg0;
        arg0.field263.field266 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILbd;)V")
    public final void method188(int arg0, class12 arg1) {
        field461++;
        if (arg1.field266 != null) {
            arg1.method101((byte) 101);
        }
        arg1.field263 = this.field483;
        arg1.field266 = this.field483.field266;
        arg1.field266.field263 = arg1;
        if (arg0 != -2) {
            method191(-34, -4, null, (byte) 29);
        }
        arg1.field263.field266 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method189(byte arg0) {
        if (arg0 <= 99) {
            field474 = -37;
        }
        field485 = null;
        field489 = null;
        field477 = null;
        field478 = null;
        field470 = null;
        field462 = null;
        field475 = null;
        field481 = null;
        field464 = null;
        field487 = null;
        field479 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Lbd;")
    public final class12 method190(byte arg0) {
        if (arg0 >= -89) {
            field487 = null;
        }
        class12 var2 = this.field483.field266;
        field491++;
        if (this.field483 == var2) {
            this.field486 = null;
            return null;
        } else {
            this.field486 = var2.field266;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILha;B)V")
    public static final void method191(int arg0, int arg1, class50 arg2, byte arg3) {
        if ((arg0 & 0x200) != 0) {
            arg2.field3093 = class82.field1733.method120(18235);
            arg2.field3084 = class82.field1733.method132((byte) -23);
            arg2.field3086 = class82.field1733.method108(0);
            arg2.field3098 = class82.field1733.method120(18235);
            arg2.field3112 = class82.field1733.method128((byte) 83) + class12.field264;
            arg2.field3070 = class82.field1733.method136(2) + class12.field264;
            arg2.field3105 = class82.field1733.method108(0);
            arg2.field3110 = 0;
            arg2.field3080 = 1;
        }
        if ((arg0 & 0x8) != 0) {
            int var4 = class82.field1733.method142(27467);
            int var5 = class82.field1733.method132((byte) -59);
            arg2.method1124(var4, -23371, class12.field264, var5);
            arg2.field3097 = class12.field264 + 300;
            arg2.field3085 = class82.field1733.method108(0);
            arg2.field3118 = class82.field1733.method142(27467);
        }
        field460++;
        if ((arg0 & 0x400) != 0) {
            arg2.field3128 = class82.field1733.method105(1375221240);
            int var6 = class82.field1733.method124(-3);
            if (arg2.field3128 == 65535) {
                arg2.field3128 = -1;
            }
            arg2.field3065 = 0;
            arg2.field3082 = 0;
            arg2.field3054 = (var6 & 0xFFFF) + class12.field264;
            arg2.field3062 = var6 >> 16;
            if (arg2.field3054 > class12.field264) {
                arg2.field3065 = -1;
            }
        }
        if ((arg0 & 0x40) != 0) {
            arg2.field3123 = class82.field1733.method136(2);
            if (arg2.field3123 == 65535) {
                arg2.field3123 = -1;
            }
        }
        if ((arg0 & 0x100) != 0) {
            int var7 = class82.field1733.method142(27467);
            int var8 = class82.field1733.method108(0);
            arg2.method1124(var7, -23371, class12.field264, var8);
            arg2.field3097 = class12.field264 + 300;
            arg2.field3085 = class82.field1733.method132((byte) -51);
            arg2.field3118 = class82.field1733.method132((byte) -101);
        }
        if ((arg0 & 0x80) != 0) {
            int var9 = class82.field1733.method136(2);
            int var10 = class82.field1733.method132((byte) -91);
            if (var9 == 65535) {
                var9 = -1;
            }
            class24.method231(arg2, var9, (byte) 15, var10);
        }
        if ((arg0 & 0x1) != 0) {
            int var11 = class82.field1733.method136(2);
            int var12 = class82.field1733.method108(0);
            int var13 = class82.field1733.method142(27467);
            int var14 = class82.field1733.field309;
            if (arg2.field1051 != null && arg2.field1025 != null) {
                long var15 = arg2.field1051.method889(true);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < class63.field1295; var18++) {
                        if (class38.field838[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && class118.field2617 == 0) {
                    class152.field3339.field309 = 0;
                    class82.field1733.method144(0, -112, var13, class152.field3339.field279);
                    class152.field3339.field309 = 0;
                    class109 var19 = class70.method550(class139.method1098(class152.field3339, 50).method883((byte) -73));
                    arg2.field3091 = var19.method870(-58);
                    arg2.field3096 = var11 & 0xFF;
                    arg2.field3103 = 150;
                    arg2.field3117 = var11 >> 8;
                    if (var12 == 2 || var12 == 3) {
                        class75.method593(1, class44.method405(new class109[] { class16.field403, arg2.field1051 }, (byte) -74), -8870, var19);
                    } else if (var12 == 1) {
                        class75.method593(1, class44.method405(new class109[] { class82.field1761, arg2.field1051 }, (byte) -74), -8870, var19);
                    } else {
                        class75.method593(2, arg2.field1051, -8870, var19);
                    }
                }
            }
            class82.field1733.field309 = var13 + var14;
        }
        if ((arg0 & 0x4) != 0) {
            arg2.field3077 = class82.field1733.method128((byte) 83);
            arg2.field3101 = class82.field1733.method111(107);
        }
        if ((arg0 & 0x10) != 0) {
            int var20 = class82.field1733.method108(0);
            byte[] var21 = new byte[var20];
            class13 var22 = new class13(var21);
            class82.field1733.method141(0, var21, (byte) -73, var20);
            class53.field1094[arg1] = var22;
            arg2.method429((byte) 67, var22);
        }
        if ((arg0 & 0x20) != 0) {
            arg2.field3091 = class82.field1733.method140(0);
            if (arg2.field3091.method906(0, false) == 126) {
                arg2.field3091 = arg2.field3091.method897(false, 1);
                class75.method593(2, arg2.field1051, -8870, arg2.field3091);
            } else if (class136.field2975 == arg2) {
                class75.method593(2, arg2.field1051, -8870, arg2.field3091);
            }
            arg2.field3103 = 150;
            arg2.field3117 = 0;
            arg2.field3096 = 0;
        }
        if (arg3 < 53) {
            method191(-99, 115, null, (byte) 10);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Lbd;")
    public final class12 method192(int arg0) {
        field473++;
        class12 var2 = this.field483.field263;
        if (arg0 != 30) {
            field481 = null;
        }
        if (this.field483 == var2) {
            return null;
        } else {
            var2.method101((byte) 121);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Lbd;")
    public final class12 method193(int arg0) {
        field469++;
        class12 var2 = this.field486;
        int var3 = 26 % ((arg0 - 43) / 37);
        if (this.field483 == var2) {
            this.field486 = null;
            return null;
        } else {
            this.field486 = var2.field266;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(ILbd;)V")
    public final void method194(int arg0, class12 arg1) {
        if (arg1.field266 != null) {
            arg1.method101((byte) 118);
        }
        if (arg0 != 22) {
            this.field486 = null;
        }
        arg1.field266 = this.field483;
        arg1.field263 = this.field483.field263;
        field480++;
        arg1.field266.field263 = arg1;
        arg1.field263.field266 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Lbd;")
    public final class12 method195(byte arg0) {
        field492++;
        class12 var2 = this.field483.field263;
        if (this.field483 == var2) {
            this.field486 = null;
            return null;
        }
        if (arg0 <= 98) {
            method196((byte) -108, 90);
        }
        this.field486 = var2.field263;
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Z")
    public static final boolean method196(byte arg0, int arg1) {
        if (arg0 != -35) {
            field485 = null;
        }
        field459++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Color;Lpe;II)V")
    public static final void method197(Color arg0, class109 arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class137.field2980.getGraphics();
            if (class119.field2648 == null) {
                class119.field2648 = new Font("Helvetica", 1, 13);
                class48.field993 = class137.field2980.getFontMetrics(class119.field2648);
            }
            if (class53.field1088) {
                class53.field1088 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class62.field1272, class41.field859);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class121.field2684 == null) {
                    class121.field2684 = class137.field2980.createImage(304, 34);
                }
                Graphics var5 = class121.field2684.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, arg2 - arg3 * 3, 30);
                var5.setFont(class119.field2648);
                var5.setColor(Color.white);
                arg1.method887(22, var5, (byte) 108, (304 - arg1.method892(true, class48.field993)) / 2);
                var4.drawImage(class121.field2684, class62.field1272 / 2 - 152, class41.field859 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class62.field1272 / 2 - 152;
                int var7 = class41.field859 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 - -1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class119.field2648);
                var4.setColor(Color.white);
                arg1.method887(var7 + 22, var4, (byte) 108, var6 + (304 - arg1.method892(true, class48.field993)) / 2);
            }
        } catch (Exception var9) {
            class137.field2980.repaint();
        }
        field488++;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Lbd;")
    public final class12 method198(byte arg0) {
        field471++;
        if (arg0 > -49) {
            return null;
        }
        class12 var2 = this.field486;
        if (this.field483 == var2) {
            this.field486 = null;
            return null;
        } else {
            this.field486 = var2.field263;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)Lbd;")
    public final class12 method199(byte arg0) {
        field466++;
        class12 var2 = this.field483.field266;
        if (arg0 != 102) {
            field485 = null;
        }
        if (this.field483 == var2) {
            return null;
        } else {
            var2.method101((byte) 100);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class19() {
        this.field483.field266 = this.field483;
        this.field483.field263 = this.field483;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    public final void method200(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field468++;
        while (true) {
            class12 var2 = this.field483.field263;
            if (this.field483 == var2) {
                return;
            }
            var2.method101((byte) 86);
        }
    }
}
