import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lrd;")
    private static class114 field1440 = class84.method656("Please wait)3)3)3", (byte) 127);

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lrd;")
    public static class114 field1446 = field1440;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "[I")
    public static int[] field1444 = new int[200];

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lrd;")
    public static class114 field1452 = field1440;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Lrd;")
    private static class114 field1453 = class84.method656("Accept trade", (byte) 122);

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lrd;")
    public static class114 field1443 = field1453;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1451 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lrd;")
    public static class114 field1457 = class84.method656(" )2> @yel@", (byte) 119);

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lrd;")
    public static class114 field1456 = class84.method656("Cabbage", (byte) 126);

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1455 = 0;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lrd;")
    private static class114 field1460 = class84.method656("wave2:", (byte) 121);

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lrd;")
    public static class114 field1454 = field1460;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Ldd;")
    public static class26 field1458 = new class26(64);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "J")
    public long field1448;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Lpb;")
    public static class100 field1459;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lje;")
    public class67 field1436;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lje;")
    public class67 field1441;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method534(int arg0) {
        field1460 = null;
        field1454 = null;
        field1440 = null;
        if (arg0 != 65536) {
            field1455 = 79;
        }
        field1457 = null;
        field1453 = null;
        field1456 = null;
        field1458 = null;
        field1444 = null;
        field1452 = null;
        field1451 = null;
        field1459 = null;
        field1446 = null;
        field1443 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)I")
    public static final int method535(int arg0) {
        field1437++;
        int var1 = 3;
        if (arg0 > -15) {
            return 84;
        }
        if (class88.field1966 < 310) {
            int var2 = class143.field3404 >> 7;
            int var3 = class7.field103.field712 >> 7;
            int var4 = class99.field2253 >> 7;
            if ((class22.field430[class20.field346][var2][var4] & 0x4) != 0) {
                var1 = class20.field346;
            }
            int var5;
            if (var3 <= var2) {
                var5 = var2 - var3;
            } else {
                var5 = var3 - var2;
            }
            int var6 = class7.field103.field756 >> 7;
            int var7;
            if (var6 <= var4) {
                var7 = var4 - var6;
            } else {
                var7 = var6 - var4;
            }
            if (var7 < var5) {
                int var8 = var7 * 65536 / var5;
                int var9 = 32768;
                while (var2 != var3) {
                    var9 += var8;
                    if (var3 > var2) {
                        var2++;
                    } else if (var2 > var3) {
                        var2--;
                    }
                    if ((class22.field430[class20.field346][var2][var4] & 0x4) != 0) {
                        var1 = class20.field346;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var6 > var4) {
                            var4++;
                        } else if (var4 > var6) {
                            var4--;
                        }
                        if ((class22.field430[class20.field346][var2][var4] & 0x4) != 0) {
                            var1 = class20.field346;
                        }
                    }
                }
            } else {
                int var10 = var5 * 65536 / var7;
                int var11 = 32768;
                while (var4 != var6) {
                    if (var6 > var4) {
                        var4++;
                    } else if (var6 < var4) {
                        var4--;
                    }
                    var11 += var10;
                    if ((class22.field430[class20.field346][var2][var4] & 0x4) != 0) {
                        var1 = class20.field346;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var2 < var3) {
                            var2++;
                        } else if (var2 > var3) {
                            var2--;
                        }
                        if ((class22.field430[class20.field346][var2][var4] & 0x4) != 0) {
                            var1 = class20.field346;
                        }
                    }
                }
            }
        }
        if ((class22.field430[class20.field346][class7.field103.field712 >> 7][class7.field103.field756 >> 7] & 0x4) != 0) {
            var1 = class20.field346;
        }
        return var1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static final void method536(boolean arg0) {
        field1438++;
        if (class14.field312 != 0) {
            return;
        }
        class60.field1263 = 1;
        class123.field2878[0] = class47.field987;
        class117.field2734[0] = 1004;
        if (class34.field671 != -1) {
            class48.field993 = -1;
            class145.field3466 = -1;
            class74.method605(503, class75.field1741, 765, 0, 2331, 0, 0, class34.field671, class100.field2289);
            class13.field293 = class48.field993;
            class14.field313 = class145.field3466;
            return;
        }
        boolean var1 = false;
        class79.method632(!arg0);
        class145.field3466 = -1;
        class48.field993 = -1;
        if (class100.field2289 > 4 && class75.field1741 > 4 && class100.field2289 < 516 && class75.field1741 < 338) {
            if (class117.field2747 == -1) {
                class34.method248(false);
            } else {
                class74.method605(338, class75.field1741, 516, 4, 2331, 4, 0, class117.field2747, class100.field2289);
            }
        }
        class13.field293 = class48.field993;
        class48.field993 = -1;
        class14.field313 = class145.field3466;
        class145.field3466 = -1;
        if (!arg0) {
            method539(true);
        }
        if (class100.field2289 > 553 && class75.field1741 > 205 && class100.field2289 < 743 && class75.field1741 < 466) {
            if (class123.field2905 != -1) {
                class74.method605(466, class75.field1741, 743, 553, 2331, 205, 1, class123.field2905, class100.field2289);
            } else if (class123.field2906[class102.field2351] != -1) {
                class74.method605(466, class75.field1741, 743, 553, 2331, 205, 1, class123.field2906[class102.field2351], class100.field2289);
            }
        }
        if (class48.field993 != class107.field2474) {
            class24.field460 = true;
            class107.field2474 = class48.field993;
        }
        if (class16.field327 != class145.field3466) {
            class16.field327 = class145.field3466;
            class24.field460 = true;
        }
        class145.field3466 = -1;
        class48.field993 = -1;
        if (class100.field2289 > 17 && class75.field1741 > 357 && class100.field2289 < 496 && class75.field1741 < 453) {
            if (class123.field2899 != -1) {
                class74.method605(453, class75.field1741, 496, 17, 2331, 357, 2, class123.field2899, class100.field2289);
            } else if (class8.field120 != -1) {
                class74.method605(453, class75.field1741, 496, 17, 2331, 357, 3, class8.field120, class100.field2289);
            } else if (class75.field1741 < 434 && class100.field2289 < 426) {
                class28.method206(class100.field2289 - 17, class75.field1741 + -357, (byte) 106);
            }
        }
        if ((class123.field2899 != -1 || class8.field120 != -1) && class48.field993 != class128.field3053) {
            class128.field3053 = class48.field993;
            class140.field3335 = true;
        }
        if ((class123.field2899 != -1 || class8.field120 != -1) && class145.field3466 != class127.field3032) {
            class127.field3032 = class145.field3466;
            class140.field3335 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class60.field1263 - 1; var2++) {
                if (class117.field2734[var2] < 1000 && class117.field2734[var2 + 1] > 1000) {
                    var1 = false;
                    class114 var3 = class123.field2878[var2];
                    class123.field2878[var2] = class123.field2878[var2 + 1];
                    class123.field2878[var2 + 1] = var3;
                    int var4 = class117.field2734[var2];
                    class117.field2734[var2] = class117.field2734[var2 + 1];
                    class117.field2734[var2 + 1] = var4;
                    int var5 = class72.field1594[var2];
                    class72.field1594[var2] = class72.field1594[var2 + 1];
                    class72.field1594[var2 + 1] = var5;
                    int var6 = class118.field2767[var2];
                    class118.field2767[var2] = class118.field2767[var2 + 1];
                    class118.field2767[var2 + 1] = var6;
                    int var7 = class103.field2415[var2];
                    class103.field2415[var2] = class103.field2415[var2 + 1];
                    class103.field2415[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z")
    public final boolean method537(int arg0) {
        field1445++;
        if (arg0 != -32303) {
            method536(false);
        }
        return this.field1436 != null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILjava/awt/Component;)Ljd;")
    public static final class66 method538(int arg0, int arg1, int arg2, Component arg3) {
        field1439++;
        try {
            if (arg0 >= -57) {
                return null;
            } else {
                Class var4 = Class.forName("rc");
                class66 var5 = (class66) var4.getDeclaredConstructor().newInstance();
                var5.method533(arg1, 0, arg2, arg3);
                return var5;
            }
        } catch (Throwable var7) {
            class107 var6 = new class107();
            var6.method533(arg1, 0, arg2, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
    public static final void method539(boolean arg0) {
        field1442++;
        class118.field2773.method528(-1926);
        if (arg0) {
            method539(false);
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public final void method540(int arg0) {
        field1447++;
        if (this.field1436 == null) {
            return;
        }
        this.field1436.field1441 = this.field1441;
        if (arg0 != -26669) {
            field1458 = null;
        }
        this.field1441.field1436 = this.field1436;
        this.field1441 = null;
        this.field1436 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Color;ILrd;I)V")
    public static final void method541(Color arg0, int arg1, class114 arg2, int arg3) {
        try {
            Graphics var4 = class114.field2678.getGraphics();
            if (class90.field2114 == null) {
                class90.field2114 = new Font("Helvetica", 1, 13);
                class123.field2879 = class114.field2678.getFontMetrics(class90.field2114);
            }
            if (class34.field678) {
                class34.field678 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class99.field2243, class69.field1524);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class36.field767 == null) {
                    class36.field767 = class114.field2678.createImage(304, 34);
                }
                Graphics var5 = class36.field767.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                if (arg3 != -3857) {
                    return;
                }
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class90.field2114);
                var5.setColor(Color.white);
                arg2.method869((304 - arg2.method882(class123.field2879, -82)) / 2, -71, 22, var5);
                var4.drawImage(class36.field767, class99.field2243 / 2 - 152, class69.field1524 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class99.field2243 / 2 - 152;
                int var7 = class69.field1524 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg1 * 3 + var6 + 2, var7 - -2, 300 - arg1 * 3, 30);
                var4.setFont(class90.field2114);
                var4.setColor(Color.white);
                arg2.method869(var6 + (304 - arg2.method882(class123.field2879, -91)) / 2, -108, var7 + 22, var4);
            }
        } catch (Exception var9) {
            class114.field2678.repaint();
        }
        field1450++;
    }
}
