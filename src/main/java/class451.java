import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class451 extends class313 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Lps;")
    private class63 field6770 = new class63();

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "Lps;")
    private class63 field6786 = new class63();

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "[Z")
    private boolean[] field6788 = new boolean[112];

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "[I")
    public static int[] field6774 = new int[25];

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "Laa;")
    public static class341 field6771;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field6787;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
    private final int method2746(byte arg0) {
        field6767++;
        int var2 = 0;
        if (this.field6788[81]) {
            var2 |= 0x1;
        }
        if (this.field6788[82]) {
            var2 |= 0x4;
        }
        if (arg0 != -122) {
            this.field6770 = null;
        }
        if (this.field6788[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)I")
    public static final int method2747(byte arg0, int arg1) {
        if (arg0 != 81) {
            method2747((byte) -80, 96);
        }
        field6783++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xF9) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)V")
    private final void method2748(byte arg0) {
        field6778++;
        if (this.field6787 == null || arg0 >= -113) {
            return;
        }
        this.field6787.removeKeyListener(this);
        this.field6787.removeFocusListener(this);
        this.field6787 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field6788[var2] = false;
        }
        this.field6770.method450((byte) 73);
        this.field6786.method450((byte) 73);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    public final void method1971(int arg0) {
        if (arg0 <= 115) {
            this.field6786 = null;
        }
        field6775++;
        this.method2748((byte) -127);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2749(Component arg0, int arg1) {
        this.method2748((byte) -121);
        field6785++;
        if (arg1 != -4982) {
            this.field6786 = null;
        }
        this.field6787 = arg0;
        Method var3 = class500.field7390;
        if (var3 != null) {
            try {
                var3.invoke(this.field6787, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6787.addKeyListener(this);
        this.field6787.addFocusListener(this);
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)V")
    public static final void method2750(int arg0) {
        if (arg0 < 116) {
            return;
        }
        field6784++;
        for (int var1 = 0; var1 < class303.field4434; var1++) {
            class153 var2 = class475.field7049[var1];
            if (var2.field2002 == 2) {
                if (var2.field1997 == null) {
                    var2.field1998 = Integer.MIN_VALUE;
                } else {
                    class31.field463.method883(var2.field1997);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final synchronized void method1972(byte arg0) {
        field6769++;
        this.field6770.method450((byte) 73);
        if (arg0 < 12) {
            this.method2752(60, -126, null);
        }
        for (class43 var2 = (class43) this.field6786.method447(8); var2 != null; var2 = (class43) this.field6786.method447(8)) {
            var2.field621 = this.method2746((byte) -122);
            if (var2.field626 == 0) {
                if (!this.field6788[var2.field617]) {
                    class43 var3 = new class43();
                    var3.field624 = var2.field624;
                    var3.field617 = var2.field617;
                    var3.field627 = '\u0000';
                    var3.field626 = 0;
                    var3.field621 = var2.field621;
                    this.field6770.method453((byte) 105, var3);
                    this.field6788[var2.field617] = true;
                }
                var2.field626 = 2;
                this.field6770.method453((byte) 103, var2);
            } else if (var2.field626 == 1) {
                if (this.field6788[var2.field617]) {
                    this.field6770.method453((byte) 110, var2);
                    this.field6788[var2.field617] = false;
                }
            } else if (var2.field626 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field6788[var4]) {
                        class43 var5 = new class43();
                        var5.field626 = 1;
                        var5.field621 = var2.field621;
                        var5.field624 = var2.field624;
                        var5.field627 = '\u0000';
                        var5.field617 = var4;
                        this.field6770.method453((byte) 113, var5);
                        this.field6788[var4] = false;
                    }
                }
            } else if (var2.field626 == 3) {
                this.field6770.method453((byte) 119, var2);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field6766++;
        this.method2752(0, -1, arg0);
    }

    @OriginalMember(owner = "client!tq", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6782++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class241.method1584(var2, 111)) {
            this.method2753(-1, var2, 3, 0);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Liq;")
    public final class438 method1969(int arg0) {
        if (arg0 != 32) {
            this.method1969(50);
        }
        field6779++;
        return (class438) this.field6770.method447(8);
    }

    @OriginalMember(owner = "client!tq", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2752(1, -1, arg0);
        field6776++;
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
    public static void method2751(int arg0) {
        if (arg0 != 0) {
            method2751(52);
        }
        field6774 = null;
        field6771 = null;
    }

    @OriginalMember(owner = "client!tq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2753(0, '\u0000', -1, 0);
        field6773++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
    private final void method2752(int arg0, int arg1, KeyEvent arg2) {
        field6772++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class417.field6357.length > var4) {
            int var5 = class417.field6357[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (arg1 != -1) {
            this.field6787 = null;
        }
        if (var6 != 0) {
            this.method2753(var6, '\u0000', arg0, 0);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ICII)V")
    private final void method2753(int arg0, char arg1, int arg2, int arg3) {
        field6780++;
        if (arg3 != 0) {
            return;
        }
        class43 var5 = new class43();
        var5.field617 = arg0;
        var5.field626 = arg2;
        var5.field627 = arg1;
        var5.field624 = class58.method427((byte) -19);
        this.field6786.method453((byte) 122, var5);
    }

    @OriginalMember(owner = "client!tq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6768++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)Z")
    public final boolean method1970(boolean arg0, int arg1) {
        field6781++;
        if (arg1 >= 0 && arg1 < 112) {
            return arg0 ? this.field6788[arg1] : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class451(Component arg0) {
        class485.method2903(101);
        this.method2749(arg0, -4982);
    }
}
