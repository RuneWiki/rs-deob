import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class741 extends class237 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lbg;")
    private class464 field10303 = new class464();

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lbg;")
    private class464 field10309 = new class464();

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "[Z")
    private boolean[] field10311 = new boolean[112];

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field10293 = -50;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field10291;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field10294;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field10296;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field10297;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field10310;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "[[[B")
    public static byte[][][] field10305;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(CIII)V")
    private final void method4135(char arg0, int arg1, int arg2, int arg3) {
        field10295++;
        class94 var5 = new class94();
        if (arg3 != 0) {
            return;
        }
        var5.field1093 = arg0;
        var5.field1091 = arg2;
        var5.field1102 = arg1;
        var5.field1096 = class479.method2864((byte) -122);
        this.field10309.method2770((byte) -13, var5);
    }

    @OriginalMember(owner = "client!qc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field10307++;
        this.method4135('\u0000', -1, 0, 0);
    }

    @OriginalMember(owner = "client!qc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field10304++;
        this.method4139(1, (byte) -71, arg0);
    }

    @OriginalMember(owner = "client!qc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field10291++;
        this.method4139(0, (byte) -71, arg0);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method4136(byte arg0, Component arg1) {
        field10294++;
        this.method4140((byte) -45);
        if (arg0 > -101) {
            return;
        }
        this.field10310 = arg1;
        Method var3 = class316.field4390;
        if (var3 != null) {
            try {
                var3.invoke(this.field10310, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field10310.addKeyListener(this);
        this.field10310.addFocusListener(this);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method4137(boolean arg0) {
        field10305 = null;
        if (!arg0) {
            method4138(58);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)[Lgg;")
    public static final class172[] method4138(int arg0) {
        if (arg0 == -1) {
            field10301++;
            return new class172[] { class657.field9005, class315.field4362, class661.field9054 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z")
    public final boolean method1517(int arg0, int arg1) {
        if (arg0 == 0) {
            field10292++;
            return arg1 >= 0 && arg1 < 112 ? this.field10311[arg1] : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V")
    private final void method4139(int arg0, byte arg1, KeyEvent arg2) {
        if (arg1 != -71) {
            return;
        }
        field10290++;
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class124.field1505.length) {
            int var6 = class124.field1505[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method4135('\u0000', arg0, var5, arg1 ^ 0xFFFFFFB9);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)V")
    private final void method4140(byte arg0) {
        field10308++;
        if (this.field10310 == null) {
            return;
        }
        this.field10310.removeKeyListener(this);
        this.field10310.removeFocusListener(this);
        this.field10310 = null;
        int var2 = 0;
        if (arg0 != -45) {
            this.method1520((byte) 71);
        }
        while (var2 < 112) {
            this.field10311[var2] = false;
            var2++;
        }
        this.field10303.method2767((byte) -19);
        this.field10309.method2767((byte) -19);
    }

    @OriginalMember(owner = "client!qc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field10297++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class211.method1301(var2, false)) {
            this.method4135(var2, 3, -1, 0);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public final void method1519(byte arg0) {
        field10306++;
        this.method4140((byte) -45);
        if (arg0 < 10) {
            field10305 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lkia;")
    public final class620 method1520(byte arg0) {
        int var2 = -89 % ((arg0 - 21) / 42);
        field10298++;
        return (class620) this.field10303.method2762((byte) -16);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
    public final synchronized void method1522(byte arg0) {
        this.field10303.method2767((byte) -19);
        if (arg0 != -30) {
            this.field10309 = null;
        }
        field10300++;
        for (class94 var2 = (class94) this.field10309.method2762((byte) -16); var2 != null; var2 = (class94) this.field10309.method2762((byte) -16)) {
            var2.field1097 = this.method4141(1);
            if (var2.field1102 == 0) {
                if (!this.field10311[var2.field1091]) {
                    class94 var3 = new class94();
                    var3.field1093 = '\u0000';
                    var3.field1096 = var2.field1096;
                    var3.field1091 = var2.field1091;
                    var3.field1102 = 0;
                    var3.field1097 = var2.field1097;
                    this.field10303.method2770((byte) -13, var3);
                    this.field10311[var2.field1091] = true;
                }
                var2.field1102 = 2;
                this.field10303.method2770((byte) -13, var2);
            } else if (var2.field1102 == 1) {
                if (this.field10311[var2.field1091]) {
                    this.field10303.method2770((byte) -13, var2);
                    this.field10311[var2.field1091] = false;
                }
            } else if (var2.field1102 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field10311[var4]) {
                        class94 var5 = new class94();
                        var5.field1093 = '\u0000';
                        var5.field1097 = var2.field1097;
                        var5.field1096 = var2.field1096;
                        var5.field1102 = 1;
                        var5.field1091 = var4;
                        this.field10303.method2770((byte) -13, var5);
                        this.field10311[var4] = false;
                    }
                }
            } else if (var2.field1102 == 3) {
                this.field10303.method2770((byte) -13, var2);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field10302++;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
    private final int method4141(int arg0) {
        field10296++;
        int var2 = 0;
        if (arg0 != 1) {
            return -118;
        }
        if (this.field10311[81]) {
            var2 |= 0x1;
        }
        if (this.field10311[82]) {
            var2 |= 0x4;
        }
        if (this.field10311[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILsl;Lsl;)V")
    public static final void method4142(int arg0, int arg1, int arg2, class458 arg3, class458 arg4) {
        class165 var5 = class307.method2008(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2267 = arg3;
        var5.field2278 = arg4;
        int var6 = class459.field6474 == class135.field1969 ? 1 : 0;
        if (!arg3.method746(-127)) {
            arg3.field1251 = class321.field4433[var6];
            class321.field4433[var6] = arg3;
        } else if (arg3.method751(false)) {
            arg3.field1251 = class373.field5234[var6];
            class373.field5234[var6] = arg3;
        } else {
            arg3.field1251 = class710.field9861[var6];
            class710.field9861[var6] = arg3;
            class230.field3098 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method746(-116)) {
            if (arg4.method751(false)) {
                arg4.field1251 = class373.field5234[var6];
                class373.field5234[var6] = arg4;
                return;
            }
            arg4.field1251 = class710.field9861[var6];
            class710.field9861[var6] = arg4;
            class230.field3098 = true;
            return;
        }
        arg4.field1251 = class321.field4433[var6];
        class321.field4433[var6] = arg4;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class741(Component arg0) {
        class614.method3437(false);
        this.method4136((byte) -127, arg0);
    }
}
