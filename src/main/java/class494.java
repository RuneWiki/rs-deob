import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class494 extends class436 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!on", name = "v", descriptor = "[Z")
    private boolean[] field7151 = new boolean[112];

    @OriginalMember(owner = "client!on", name = "o", descriptor = "[[I")
    public static int[][] field7144 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!on", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field7148 = new String[200];

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public static int field7155 = 0;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Lai;")
    private class349 field7136;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Lai;")
    private class349 field7149;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "Lai;")
    private class349 field7152;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field7153;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
    private final void method2919(byte arg0, int arg1, KeyEvent arg2) {
        field7137++;
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class327.field4463.length) {
            int var6 = class327.field4463[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (arg0 < 97) {
            this.method2925(null, true);
        }
        if (var5 != 0) {
            this.method2922(arg1, '\u0000', var5, false);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!on", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2919((byte) 101, 1, arg0);
        field7140++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)Z")
    public final boolean method2585(int arg0, byte arg1) {
        field7147++;
        if (arg0 >= 0 && arg0 < 112) {
            return arg1 <= 52 ? false : this.field7151[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public static final void method2920(int arg0) {
        field7134++;
        if (class516.field7579 == 5) {
            if (arg0 != -11461) {
                field7150 = -113;
            }
            class516.field7579 = 6;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(Z)V")
    public final void method2586(boolean arg0) {
        field7145++;
        if (arg0) {
            this.method2582(-3);
        }
        this.method2923(arg0);
    }

    @OriginalMember(owner = "client!on", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field7156++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class398.method2359(var2, (byte) -51)) {
            this.method2922(2, var2, -1, false);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V")
    public final synchronized void method2584(boolean arg0) {
        field7135++;
        for (class349 var2 = this.field7152; var2 != null; var2 = var2.field5068) {
            if (var2.field5064 == 0) {
                if (var2.field5066 >= 0) {
                    var2.field5060 = !this.field7151[var2.field5066];
                }
                this.field7151[var2.field5066] = true;
            } else if (var2.field5064 == 1) {
                this.field7151[var2.field5066] = false;
            } else if (var2.field5064 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field7151[var3] = false;
                }
            }
        }
        if (!arg0) {
            field7150 = 123;
        }
        this.field7136 = this.field7152;
        this.field7152 = null;
        this.field7149 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLor;ILjava/lang/String;)Lgp;")
    public static final class464 method2921(byte arg0, class173 arg1, int arg2, String arg3) {
        field7139++;
        if (arg2 == 0) {
            return arg1.method1188(arg3, true);
        } else if (arg2 == 1) {
            try {
                class344.method2075(new Object[] { (new URL(arg1.field2623.getCodeBase(), arg3)).toString() }, arg1.field2623, "openjs", -23912);
                class464 var4 = new class464();
                var4.field6699 = 1;
                return var4;
            } catch (Throwable var10) {
                class464 var5 = new class464();
                var5.field6699 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg1.field2623.getAppletContext().showDocument(new URL(arg1.field2623.getCodeBase(), arg3), "_blank");
                class464 var6 = new class464();
                var6.field6699 = 1;
                return var6;
            } catch (Exception var11) {
                class464 var7 = new class464();
                var7.field6699 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class344.method2077(false, "loggedout", arg1.field2623);
            } catch (Throwable var13) {
            }
            try {
                arg1.field2623.getAppletContext().showDocument(new URL(arg1.field2623.getCodeBase(), arg3), "_top");
                class464 var8 = new class464();
                var8.field6699 = 1;
                return var8;
            } catch (Exception var12) {
                class464 var9 = new class464();
                var9.field6699 = 2;
                return var9;
            }
        } else {
            if (arg0 != -17) {
                method2921((byte) 53, null, 108, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ICIZ)V")
    private final void method2922(int arg0, char arg1, int arg2, boolean arg3) {
        field7159++;
        class349 var5 = new class349();
        var5.field5066 = arg2;
        var5.field5070 = arg1;
        var5.field5064 = arg0;
        var5.field5058 = class254.method1522((byte) -51);
        if (this.field7149 == null) {
            this.field7152 = var5;
        } else {
            this.field7149.field5068 = var5;
        }
        this.field7149 = var5;
        if (arg3) {
            field7155 = 49;
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(Z)V")
    private final void method2923(boolean arg0) {
        field7138++;
        if (this.field7153 == null) {
            return;
        }
        this.field7153.removeKeyListener(this);
        if (arg0) {
            field7150 = -53;
        }
        this.field7153.removeFocusListener(this);
        this.field7153 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field7151[var2] = false;
        }
        this.field7136 = null;
        this.field7152 = null;
        this.field7149 = null;
    }

    @OriginalMember(owner = "client!on", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2922(-1, '\u0000', 0, false);
        field7158++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Lav;")
    public final class235 method2582(int arg0) {
        field7143++;
        class349 var2 = this.field7136;
        if (arg0 > -101) {
            this.method2585(-76, (byte) -54);
        }
        while (var2 != null && var2.field5064 == -1) {
            var2 = var2.field5068;
        }
        if (var2 == null) {
            this.field7136 = null;
        } else {
            this.field7136 = var2.field5068;
        }
        return var2;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lpu;[[BI)V")
    public static final void method2924(class177 arg0, byte[][] arg1, int arg2) {
        int var3 = 0;
        if (arg2 < 88) {
            return;
        }
        while (var3 < arg0.field17) {
            class287.method1649(841283500);
            for (int var4 = 0; var4 < (class9.field111 >> 3); var4++) {
                for (int var5 = 0; var5 < class192.field2809 >> 3; var5++) {
                    int var6 = class93.field1520[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3CA0BD9) >> 24;
                        if (!arg0.field29 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            for (int var12 = 0; var12 < class463.field6689.length; var12++) {
                                if (class463.field6689[var12] == var11 && arg1[var12] != null) {
                                    arg0.method1216(arg1[var12], var4 * 8, var8, (var9 & 0x7) * 8, var7, var5 * 8, (var10 & 0x7) * 8, class275.field3737, var3, false, class264.field3553);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var3++;
        }
        field7146++;
    }

    @OriginalMember(owner = "client!on", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field7157++;
    }

    @OriginalMember(owner = "client!on", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field7141++;
        this.method2919((byte) 116, 0, arg0);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method2925(Component arg0, boolean arg1) {
        this.method2923(arg1);
        field7142++;
        this.field7153 = arg0;
        Method var3 = class173.field2636;
        if (var3 != null) {
            try {
                var3.invoke(this.field7153, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field7153.addKeyListener(this);
        this.field7153.addFocusListener(this);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class494(Component arg0) {
        class512.method3038(false);
        this.method2925(arg0, false);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    public static void method2926(byte arg0) {
        field7144 = null;
        field7148 = null;
        int var1 = 21 % (-arg0 / 52);
    }
}
