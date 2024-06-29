import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class240 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3516 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3522 = "Allocated memory";

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[Z")
    public static boolean[] field3519 = new boolean[200];

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field3525 = 3;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3529 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Llc;")
    public static class270 field3515;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Llc;")
    public static class270 field3518;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3511++;
        class279 var5 = class111.method844(arg4, arg1, -1780180960);
        var5.method1928(false);
        var5.field4489 = arg3;
        var5.field4488 = arg0;
        var5.field4505 = arg2;
    }

    @OriginalMember(owner = "client!v", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3513++;
        if (class34.field431 != null) {
            class273.field4409 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class100.field1706.length > var2) {
                var3 = class100.field1706[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class241.field3538 >= 0 && var3 >= 0) {
                class136.field2218[class241.field3538] = ~var3;
                class241.field3538 = class241.field3538 + 1 & 0x7F;
                if (class241.field3538 == class110.field1844) {
                    class241.field3538 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!v", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3523++;
        if (class34.field431 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class191.method1357(1691, var2)) {
                int var3 = class275.field4457 + 1 & 0x7F;
                if (class254.field3835 != var3) {
                    class293.field4656[class275.field4457] = -1;
                    class77.field1222[class275.field4457] = var2;
                    class275.field4457 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3512++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIBLii;II)V")
    public static final void method1640(int arg0, int arg1, int arg2, byte arg3, class228 arg4, int arg5, int arg6) {
        long var7 = 0L;
        field3514++;
        boolean var9 = false;
        boolean var10 = true;
        if (arg3 != 17) {
            return;
        }
        if (arg6 == 0) {
            var7 = class205.method1455(arg5, arg2, arg0);
        } else if (arg6 == 1) {
            var7 = class210.method1481(arg5, arg2, arg0);
        } else if (arg6 == 2) {
            var7 = class238.method1637(arg5, arg2, arg0);
        } else if (arg6 == 3) {
            var7 = class91.method678(arg5, arg2, arg0);
        }
        int var11 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var12 = false;
        int var13 = ((int) var7 & 0x360C72) >> 20;
        class93 var14 = class48.method297(false, var11);
        int var15 = (int) var7 >> 14 & 0x1F;
        if (var14.method715((byte) 125)) {
            class263.method1819(arg2, var14, arg5, 128, arg0);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg6 == 0) {
            class282.method1952(arg5, arg2, arg0);
            if (var14.field1574 != 0) {
                arg4.method1578((byte) -116, !var14.field1537, var13, var15, arg0, arg2, var14.field1538);
            }
        } else if (arg6 == 1) {
            class139.method1047(arg5, arg2, arg0);
        } else if (arg6 == 2) {
            class263.method1810(arg5, arg2, arg0);
            if (var14.field1574 != 0 && var14.field1544 + arg2 < 104 && arg0 + var14.field1544 < 104 && (var14.field1557 + arg2) < 104 && (var14.field1557 + arg0) < 104) {
                arg4.method1589(arg0, var14.field1538, var14.field1557, !var14.field1537, var14.field1544, (byte) -128, var13, arg2);
            }
        } else if (arg6 == 3) {
            class9.method53(arg5, arg2, arg0);
            if (var14.field1574 == 1) {
                arg4.method1586(arg0, arg3 ^ 0xFFFF857A, arg2);
            }
        }
        if (var14.field1528 != null) {
            var14.method710(arg3 - 17);
            return;
        }
    }

    @OriginalMember(owner = "client!v", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class34.field431 != null) {
            class273.field4409 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class100.field1706.length > var2) {
                var3 = class100.field1706[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class241.field3538 >= 0 && var3 >= 0) {
                class136.field2218[class241.field3538] = var3;
                class241.field3538 = class241.field3538 + 1 & 0x7F;
                if (class241.field3538 == class110.field1844) {
                    class241.field3538 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class275.field4457 + 1 & 0x7F;
                if (class254.field3835 != var4) {
                    class293.field4656[class275.field4457] = var3;
                    class77.field1222[class275.field4457] = '\u0000';
                    class275.field4457 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3517++;
    }

    @OriginalMember(owner = "client!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class34.field431 != null) {
            class241.field3538 = -1;
        }
        field3521++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1641(int arg0) {
        if (arg0 != 255) {
            field3524 = -8;
        }
        field3519 = null;
        field3522 = null;
        field3518 = null;
        field3529 = null;
        field3515 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbh;")
    public static final class17 method1642(Throwable arg0, String arg1) {
        class17 var2;
        if (arg0 instanceof class17) {
            var2 = (class17) arg0;
            var2.field177 = var2.field177 + ' ' + arg1;
        } else {
            var2 = new class17(arg0, arg1);
        }
        field3520++;
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
    public static final int method1643(int arg0, int arg1) {
        double var2 = (double) ((arg1 & 0xFFE1F7) >> 16) / 256.0D;
        field3527++;
        if (arg0 < 110) {
            method1639(-122, 39, 118, -72, 42);
        }
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = 0.0D;
        double var10 = var2;
        if (var2 > var4) {
            var10 = var4;
        }
        double var12 = 0.0D;
        if (var10 > var6) {
            var10 = var6;
        }
        double var14 = var2;
        if (var2 < var4) {
            var14 = var4;
        }
        if (var6 > var14) {
            var14 = var6;
        }
        double var16 = (var10 + var14) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var10 != var14) {
            if (var16 < 0.5D) {
                var8 = (var14 - var10) / (var10 + var14);
            }
            if (var16 >= 0.5D) {
                var8 = (var14 - var10) / (2.0D - var14 - var10);
            }
            if (var2 == var14) {
                var12 = (var4 - var6) / (var14 - var10);
            } else if (var4 == var14) {
                var12 = (var6 - var2) / (var14 - var10) + 2.0D;
            } else if (var6 == var14) {
                var12 = (var2 - var4) / (var14 - var10) + 4.0D;
            }
        }
        double var19 = var12 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var8 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var18 > 243) {
            var22 >>= 0x4;
        } else if (var18 > 217) {
            var22 >>= 0x3;
        } else if (var18 > 192) {
            var22 >>= 0x2;
        } else if (var18 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var22 >> 5 << 7) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Component;III)Lkc;")
    public static final class49 method1644(Component arg0, int arg1, int arg2, int arg3) {
        field3526++;
        try {
            if (arg2 >= -101) {
                method1643(103, -6);
            }
            Class var4 = Class.forName("dl");
            class49 var5 = (class49) var4.getDeclaredConstructor().newInstance();
            var5.method179(arg3, arg0, arg1, -125);
            return var5;
        } catch (Throwable var7) {
            class37 var6 = new class37();
            var6.method179(arg3, arg0, arg1, 113);
            return var6;
        }
    }
}
