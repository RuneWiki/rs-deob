import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class632 extends class385 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "Lada;")
    private class164 field8855 = new class164();

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "Lada;")
    private class164 field8857 = new class164();

    @OriginalMember(owner = "client!pda", name = "E", descriptor = "[Z")
    private boolean[] field8859 = new boolean[112];

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "[[I")
    public static int[][] field8839 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "[F")
    public static float[] field8849 = new float[4];

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "Lst;")
    public static class435 field8840;

    @OriginalMember(owner = "client!pda", name = "D", descriptor = "Ljava/awt/Component;")
    private Component field8858;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)V")
    public static final void method3640(int arg0, int arg1) {
        field8841++;
        class150 var2 = class676.method3885(1000, 17, arg1);
        var2.method1115(true);
        int var3 = -2 / ((arg0 + 60) / 39);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method3641(Component arg0, int arg1) {
        this.method3642(112);
        field8854++;
        this.field8858 = arg0;
        Method var3 = class711.field10017;
        if (var3 != null) {
            try {
                var3.invoke(this.field8858, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field8858.addKeyListener(this);
        this.field8858.addFocusListener(this);
        if (arg1 < 23) {
            method3640(39, 105);
        }
    }

    @OriginalMember(owner = "client!pda", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field8835++;
    }

    @OriginalMember(owner = "client!pda", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field8837++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class4.method26(var2, (byte) 126)) {
            this.method3647(0, 3, var2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public final void method2475(int arg0) {
        field8836++;
        if (arg0 != 0) {
            field8839 = null;
        }
        this.method3642(arg0 + 112);
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
    private final void method3642(int arg0) {
        field8845++;
        if (this.field8858 == null) {
            return;
        }
        this.field8858.removeKeyListener(this);
        this.field8858.removeFocusListener(this);
        this.field8858 = null;
        if (arg0 != 112) {
            field8849 = null;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field8859[var2] = false;
        }
        this.field8855.method1200(arg0 - 59);
        this.field8857.method1200(85);
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(Z)V")
    public static void method3643(boolean arg0) {
        if (!arg0) {
            method3640(116, 35);
        }
        field8839 = null;
        field8840 = null;
        field8849 = null;
    }

    @OriginalMember(owner = "client!pda", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method3645(arg0, 1, false);
        field8848++;
    }

    @OriginalMember(owner = "client!pda", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method3645(arg0, 0, false);
        field8844++;
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)I")
    private final int method3644(int arg0) {
        field8847++;
        int var2 = 0;
        if (this.field8859[arg0]) {
            var2 |= 0x1;
        }
        if (this.field8859[82]) {
            var2 |= 0x4;
        }
        if (this.field8859[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IZ)V")
    private final void method3645(KeyEvent arg0, int arg1, boolean arg2) {
        field8851++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class427.field6336.length > var4) {
            int var6 = class427.field6336[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method3647(0, arg1, '\u0000', var5);
            if (!arg2) {
                arg0.consume();
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
    public final synchronized void method2473(byte arg0) {
        if (arg0 <= 21) {
            field8852 = 26;
        }
        field8838++;
        this.field8855.method1200(81);
        for (class88 var2 = (class88) this.field8857.method1198((byte) 76); var2 != null; var2 = (class88) this.field8857.method1198((byte) 36)) {
            var2.field1260 = this.method3644(81);
            if (var2.field1261 == 0) {
                if (!this.field8859[var2.field1250]) {
                    class88 var5 = new class88();
                    var5.field1252 = '\u0000';
                    var5.field1253 = var2.field1253;
                    var5.field1260 = var2.field1260;
                    var5.field1250 = var2.field1250;
                    var5.field1261 = 0;
                    this.field8855.method1203(var5, (byte) -61);
                    this.field8859[var2.field1250] = true;
                }
                var2.field1261 = 2;
                this.field8855.method1203(var2, (byte) 74);
            } else if (var2.field1261 == 1) {
                if (this.field8859[var2.field1250]) {
                    this.field8855.method1203(var2, (byte) 90);
                    this.field8859[var2.field1250] = false;
                }
            } else if (var2.field1261 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field8859[var3]) {
                        class88 var4 = new class88();
                        var4.field1250 = var3;
                        var4.field1253 = var2.field1253;
                        var4.field1261 = 1;
                        var4.field1260 = var2.field1260;
                        var4.field1252 = '\u0000';
                        this.field8855.method1203(var4, (byte) -50);
                        this.field8859[var3] = false;
                    }
                }
            } else if (var2.field1261 == 3) {
                this.field8855.method1203(var2, (byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B[Lpga;)V")
    public static final void method3646(byte arg0, class536[] arg1) {
        client.field4274 = arg1.length;
        field8850++;
        class409.field6169 = new int[client.field4274 + 10];
        class259.field3701 = new class536[client.field4274 + 10];
        class319.method2017(arg1, 0, class259.field3701, 0, client.field4274);
        for (int var2 = 0; var2 < client.field4274; var2++) {
            class409.field6169[var2] = class259.field3701[var2].method1514();
        }
        int var3 = 41 % ((arg0 - 71) / 50);
        for (int var4 = client.field4274; var4 < class259.field3701.length; var4++) {
            class409.field6169[var4] = 12;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IB)Z")
    public final boolean method2474(int arg0, byte arg1) {
        if (arg1 <= 114) {
            field8849 = null;
        }
        field8842++;
        return arg0 >= 0 && arg0 < 112 ? this.field8859[arg0] : false;
    }

    @OriginalMember(owner = "client!pda", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field8853++;
        this.method3647(0, -1, '\u0000', 0);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IICI)V")
    private final void method3647(int arg0, int arg1, char arg2, int arg3) {
        field8856++;
        class88 var5 = new class88();
        var5.field1250 = arg3;
        var5.field1261 = arg1;
        if (arg0 == 0) {
            var5.field1252 = arg2;
            var5.field1253 = class524.method3075(18);
            this.field8857.method1203(var5, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Loc;")
    public final class204 method2476(int arg0) {
        if (arg0 < 48) {
            field8849 = null;
        }
        field8846++;
        return (class204) this.field8855.method1198((byte) 72);
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class632(Component arg0) {
        class225.method1521(32259);
        this.method3641(arg0, 26);
    }
}
