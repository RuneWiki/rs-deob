import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class58 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1477 = -1;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "[Z")
    public static boolean[] field1484 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Loe;")
    public static class89 field1475 = new class89();

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
    public static int[] field1485 = new int[2000];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "J")
    public static long field1486;

    @OriginalMember(owner = "client!jd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 29)
    public final void focusGained(FocusEvent arg0) {
        field1480++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIILee;IIB)V", line = 57)
    public static final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, class30 arg5, int arg6, int arg7, byte arg8) {
        if (class50.field1285) {
            class98.field2318 = 32;
        } else {
            class98.field2318 = 0;
        }
        class50.field1285 = false;
        field1478++;
        int var9 = 90 % ((arg8 + 21) / 51);
        if (arg7 <= arg1 && arg7 + 16 > arg1 && arg2 <= arg0 && arg2 + 16 > arg0) {
            if (arg4 == 1) {
                class45.field1124 = true;
            }
            arg5.field697 -= class49.field1259 * 4;
            if (arg4 == 2 || arg4 == 3) {
                class122.field2880 = true;
            }
        } else if (arg7 <= arg1 && arg7 + 16 > arg1 && arg2 + arg6 - 16 <= arg0 && arg0 < arg2 + arg6) {
            if (arg4 == 1) {
                class45.field1124 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class122.field2880 = true;
            }
            arg5.field697 += class49.field1259 * 4;
        } else if (arg7 - class98.field2318 <= arg1 && arg7 + class98.field2318 + 16 > arg1 && arg2 + 16 <= arg0 && arg2 + arg6 - 16 > arg0 && class49.field1259 > 0) {
            if (arg4 == 2 || arg4 == 3) {
                class122.field2880 = true;
            }
            class50.field1285 = true;
            if (arg4 == 1) {
                class45.field1124 = true;
            }
            int var10 = (arg6 - 32) * arg6 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - var10 - 32;
            int var12 = arg0 - arg2 - var10 / 2 - 16;
            arg5.field697 = (arg3 - arg6) * var12 / var11;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lrb;III)[Lmb;", line = 125)
    public static final class73[] method435(class103 arg0, int arg1, int arg2, int arg3) {
        field1481++;
        if (class126.method1000(arg3, arg0, arg2, true)) {
            return arg1 == -30624 ? class129.method1017((byte) 40) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLrb;ZLrb;Lhe;)V", line = 147)
    public static final void method436(byte arg0, class103 arg1, boolean arg2, class103 arg3, class47 arg4) {
        class104.field2548 = arg2;
        class40.field998 = arg3;
        class51.field1306 = arg1;
        field1479++;
        class5.field147 = class40.field998.method729(1, 10);
        if (arg0 < -35) {
            class31.field767 = arg4;
        }
    }

    @OriginalMember(owner = "client!jd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 168)
    public final void keyTyped(KeyEvent arg0) {
        field1470++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!jd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 176)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class134.field3260 != null) {
            class56.field1446 = -1;
        }
        field1476++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lib;", line = 202)
    public static final class49 method437(int arg0, int arg1) {
        field1473++;
        class49 var2 = (class49) class48.field1199.method39(110, (long) arg0);
        if (arg1 != -4990) {
            field1484 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class11.field290.method731(arg0, 13, (byte) -102);
        class49 var4 = new class49();
        var4.field1241 = arg0;
        if (var3 != null) {
            var4.method382(new class104(var3), (byte) 85);
        }
        class48.field1199.method38(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 237)
    public static final void method438(boolean arg0) {
        field1471++;
        class108.field2622.method561((byte) -74);
        class83.field1886.method497(0, 0);
        if (arg0) {
            field1475 = null;
        }
        class53.field1353 = class109.method835(class53.field1353);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZI)I", line = 256)
    public static final int method439(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg1 >> 7;
        field1483++;
        if (arg2) {
            method438(true);
        }
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class112.field2716[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var7) * class89.field2021[var6][var4][var5 + 1] + class89.field2021[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var9 = arg0 & 0x7F;
        int var10 = (128 - var7) * class89.field2021[var6][var4][var5] + class89.field2021[var6][var4 + 1][var5] * var7 >> 7;
        return (128 - var9) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!jd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 295)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1482++;
        if (class134.field3260 != null) {
            class106.field2575 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class77.field1781.length) {
                var3 = class77.field1781[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class56.field1446 >= 0 && var3 >= 0) {
                class70.field1684[class56.field1446] = ~var3;
                class56.field1446 = class56.field1446 + 1 & 0x7F;
                if (class65.field1580 == class56.field1446) {
                    class56.field1446 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 334)
    public static void method440(int arg0) {
        if (arg0 != -1) {
            method435(null, 20, -79, 62);
        }
        field1475 = null;
        field1484 = null;
        field1485 = null;
    }

    @OriginalMember(owner = "client!jd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 364)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1474++;
        if (class134.field3260 != null) {
            class106.field2575 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class77.field1781.length > var2) {
                var3 = class77.field1781[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class79.method528(-9087, arg0);
            }
            if (class56.field1446 >= 0 && var3 >= 0) {
                class70.field1684[class56.field1446] = var3;
                class56.field1446 = class56.field1446 + 1 & 0x7F;
                if (class65.field1580 == class56.field1446) {
                    class56.field1446 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class136.field3332 + 1 & 0x7F;
                if (class66.field1629 != var5) {
                    class108.field2638[class136.field3332] = var3;
                    class18.field432[class136.field3332] = var4;
                    class136.field3332 = var5;
                }
            }
        }
        arg0.consume();
    }
}
