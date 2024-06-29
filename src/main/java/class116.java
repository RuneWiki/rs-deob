import java.awt.Component;
import java.awt.datatransfer.Clipboard;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class116 extends class374 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "[Z")
    private boolean[] field1572 = new boolean[112];

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "Lkg;")
    public static class179 field1552 = new class179(34, 0);

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "F")
    public static float field1566;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "Lca;")
    private class200 field1558;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "Lca;")
    private class200 field1561;

    @OriginalMember(owner = "client!gw", name = "u", descriptor = "Lca;")
    private class200 field1568;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "Luo;")
    public static class407 field1567;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field1556;

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1569;

    static {
        new class335("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }

    @OriginalMember(owner = "client!gw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 9)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method840(-113, 0, -1, '\u0000');
        field1563++;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)V", line = 18)
    public static void method832(int arg0) {
        field1567 = null;
        if (arg0 >= 5) {
            field1569 = null;
            field1552 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V", line = 31)
    private final void method833(int arg0, byte arg1, KeyEvent arg2) {
        field1560++;
        if (arg1 >= -20) {
            this.field1561 = null;
        }
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class418.field5937.length) {
            int var6 = class418.field5937[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method840(-113, var5, arg0, '\u0000');
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!gw", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 67)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method833(1, (byte) -63, arg0);
        field1557++;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)Z", line = 75)
    public final boolean method834(boolean arg0, int arg1) {
        field1555++;
        if (arg0) {
            this.method833(103, (byte) -70, null);
        }
        return arg1 >= 0 && arg1 < 112 ? this.field1572[arg1] : false;
    }

    @OriginalMember(owner = "client!gw", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 90)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1574++;
        this.method833(0, (byte) -103, arg0);
    }

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "(I)V", line = 98)
    private final void method835(int arg0) {
        field1564++;
        if (this.field1556 == null) {
            return;
        }
        this.field1556.removeKeyListener(this);
        this.field1556.removeFocusListener(this);
        this.field1556 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field1572[var2] = false;
        }
        if (arg0 != 15769) {
            field1571 = 119;
        }
        this.field1558 = null;
        this.field1568 = null;
        this.field1561 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V", line = 128)
    public final void method836(boolean arg0) {
        field1559++;
        this.method835(15769);
        if (!arg0) {
            this.method838(-112);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 140)
    private final void method837(int arg0, Component arg1) {
        field1570++;
        this.method835(15769);
        this.field1556 = arg1;
        Method var3 = class476.field6909;
        if (arg0 != 0) {
            this.method840(4, 39, -33, '*');
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field1556, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field1556.addKeyListener(this);
        this.field1556.addFocusListener(this);
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V", line = 169)
    public final synchronized void method838(int arg0) {
        field1554++;
        for (class200 var2 = this.field1558; var2 != null; var2 = var2.field2598) {
            if (var2.field2609 == 0) {
                if (var2.field2611 >= 0) {
                    var2.field2605 = !this.field1572[var2.field2611];
                }
                this.field1572[var2.field2611] = true;
            } else if (var2.field2609 == 1) {
                this.field1572[var2.field2611] = false;
            } else if (var2.field2609 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field1572[var3] = false;
                }
            }
        }
        this.field1561 = this.field1558;
        if (arg0 != -1121067160) {
            method839(60, true);
        }
        this.field1568 = null;
        this.field1558 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)Lni;", line = 237)
    public static final class363 method839(int arg0, boolean arg1) {
        field1573++;
        if (!arg1) {
            field1569 = null;
        }
        class363[] var2 = class394.method2266((byte) 83);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class363 var4 = var2[var3];
            if (var4.field4728 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIC)V", line = 266)
    private final void method840(int arg0, int arg1, int arg2, char arg3) {
        field1551++;
        class200 var5 = new class200();
        var5.field2609 = arg2;
        var5.field2611 = arg1;
        var5.field2597 = arg3;
        if (arg0 != -113) {
            this.method841(-62);
        }
        var5.field2607 = class504.method3034((byte) -116);
        if (this.field1568 == null) {
            this.field1558 = var5;
        } else {
            this.field1568.field2598 = var5;
        }
        this.field1568 = var5;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Lks;", line = 289)
    public final class304 method841(int arg0) {
        if (arg0 > -114) {
            field1552 = null;
        }
        field1575++;
        class200 var2;
        for (var2 = this.field1561; var2 != null && var2.field2609 == -1; var2 = var2.field2598) {
        }
        if (var2 == null) {
            this.field1561 = null;
        } else {
            this.field1561 = var2.field2598;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gw", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 310)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field1562++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class405.method2398(var2, (byte) -126)) {
            this.method840(-113, -1, 2, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 330)
    public class116(Component arg0) {
        class392.method2223(true);
        this.method837(0, arg0);
    }

    @OriginalMember(owner = "client!gw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 339)
    public final void focusGained(FocusEvent arg0) {
        field1553++;
    }
}
