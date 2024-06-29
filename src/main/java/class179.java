import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class179 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2712 = 0;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2714 = 0;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2716 = 0;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Ljc;")
    public static class284 field2711;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lnh;")
    public static class305 field2715;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lnh;")
    public static class305 field2723;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1141(int arg0) {
        int var1 = -116 % ((-arg0 - 52) / 57);
        field2715 = null;
        field2723 = null;
        field2711 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI[I[II)V")
    public static final void method1142(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (((var9 & 0x1) + var7) < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method1142(false, arg1, arg2, arg3, var6 - 1);
            method1142(false, var6 + 1, arg2, arg3, arg4);
        }
        field2709++;
        if (arg0) {
            field2712 = -17;
        }
    }

    @OriginalMember(owner = "client!vc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2722++;
        if (class257.field4154 != null) {
            class129.field1797 = -1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLbj;)Loj;")
    public static final class246 method1143(byte arg0, class215 arg1) {
        field2719++;
        if (arg0 < 42) {
            field2717 = -6;
        }
        return new class246(arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1403(6591), arg1.method1374((byte) -60));
    }

    @OriginalMember(owner = "client!vc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class257.field4154 != null) {
            class228.field3572 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class93.field1363.length) {
                var3 = class93.field1363[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class129.field1797 >= 0 && var3 >= 0) {
                class93.field1360[class129.field1797] = ~var3;
                class129.field1797 = class129.field1797 + 1 & 0x7F;
                if (class157.field2169 == class129.field1797) {
                    class129.field1797 = -1;
                }
            }
        }
        arg0.consume();
        field2724++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)Ldl;")
    public static final class48 method1144(boolean arg0) {
        field2708++;
        if (!arg0) {
            return null;
        }
        try {
            return (class48) Class.forName("dd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2725++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lnh;Luh;ZLnh;I)V")
    public static final void method1145(class305 arg0, class239 arg1, boolean arg2, class305 arg3, int arg4) {
        if (arg4 <= 80) {
            method1145((class305) null, (class239) null, true, (class305) null, -47);
        }
        field2720++;
        class114.field1629 = arg3;
        class265.field4270 = arg0;
        class212.field3197 = arg2;
        int var5 = class265.field4270.method2048(true) - 1;
        class216.field3308 = class265.field4270.method2067(var5, (byte) 51) + var5 * 256;
        class171.field2436 = new String[] { null, null, class205.field3060, null, null };
        class263.field4229 = new String[] { null, null, null, null, class195.field2990 };
        class227.field3556 = arg1;
    }

    @OriginalMember(owner = "client!vc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class257.field4154 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class17.method121(false, var2)) {
                int var3 = class243.field3818 + 1 & 0x7F;
                if (class93.field1364 != var3) {
                    class242.field3806[class243.field3818] = -1;
                    class197.field3022[class243.field3818] = var2;
                    class243.field3818 = var3;
                }
            }
        }
        field2710++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!vc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2718++;
        if (class257.field4154 == null) {
            return;
        }
        class228.field3572 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class93.field1363.length > var2) {
            var3 = class93.field1363[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class129.field1797 >= 0 && var3 >= 0) {
            class93.field1360[class129.field1797] = var3;
            class129.field1797 = class129.field1797 + 1 & 0x7F;
            if (class157.field2169 == class129.field1797) {
                class129.field1797 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class243.field3818 + 1 & 0x7F;
            if (class93.field1364 != var4) {
                class242.field3806[class243.field3818] = var3;
                class197.field3022[class243.field3818] = '\u0000';
                class243.field3818 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBI)I")
    public static final int method1146(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 31) {
            field2717 = 73;
        }
        field2713++;
        if (arg0 <= arg3) {
            return arg3 > arg1 ? arg1 : arg3;
        } else {
            return arg0;
        }
    }
}
