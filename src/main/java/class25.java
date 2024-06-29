import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class25 extends class37 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "[Z")
    private boolean[] field343 = new boolean[112];

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lbn;")
    public static class160 field341 = new class160(64, -1);

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "Los;")
    private class390 field349;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Los;")
    private class390 field353;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "Los;")
    private class390 field354;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "Ljava/awt/Component;")
    private Component field355;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;ZI)V", line = 9)
    private final void method252(KeyEvent arg0, boolean arg1, int arg2) {
        field346++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class200.field2830.length > var4) {
            int var6 = class200.field2830[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 == 0) {
            return;
        }
        if (!arg1) {
            field352 = 116;
        }
        this.method255(arg2, '\u0000', var5, 0);
        arg0.consume();
    }

    @OriginalMember(owner = "client!fk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 45)
    public final void focusGained(FocusEvent arg0) {
        field347++;
    }

    @OriginalMember(owner = "client!fk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 54)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field344++;
        this.method252(arg0, true, 1);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 288)
    public class25(Component arg0) {
        class275.method1877(-118);
        this.method261(arg0, (byte) 48);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lsc;", line = 66)
    public final class408 method253(int arg0) {
        if (arg0 != 32) {
            return null;
        }
        field350++;
        class390 var2;
        for (var2 = this.field349; var2 != null && var2.field5693 == -1; var2 = var2.field5692) {
        }
        if (var2 == null) {
            this.field349 = null;
        } else {
            this.field349 = var2.field5692;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 87)
    public final synchronized void focusLost(FocusEvent arg0) {
        field337++;
        this.method255(-1, '\u0000', 0, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIBII)V", line = 95)
    public static final void method254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg7 < 84) {
            field341 = null;
        }
        field339++;
        if (class103.method695(arg3, -105)) {
            client.method1812(class444.field6470[arg3], -1, arg4, arg6, arg8, arg9, arg5, arg1, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ICII)V", line = 110)
    private final void method255(int arg0, char arg1, int arg2, int arg3) {
        field342++;
        class390 var5 = new class390();
        var5.field5695 = arg1;
        var5.field5687 = arg2;
        var5.field5693 = arg0;
        var5.field5688 = class43.method364(-16756);
        if (arg3 != 0) {
            this.focusLost((FocusEvent) null);
        }
        if (this.field354 == null) {
            this.field353 = var5;
        } else {
            this.field354.field5692 = var5;
        }
        this.field354 = var5;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Z", line = 133)
    public final boolean method256(int arg0, int arg1) {
        if (arg0 >= -80) {
            this.field354 = null;
        }
        field357++;
        return arg1 >= 0 && arg1 < 112 ? this.field343[arg1] : false;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V", line = 149)
    public static final void method257(int arg0) {
        field340++;
        if (!class147.field1993) {
            return;
        }
        if (arg0 <= 33) {
            field341 = null;
        }
        class223 var1 = class99.method654(-1, class243.field3605, class74.field949);
        if (var1 != null && var1.field3265 != null) {
            class288 var2 = new class288();
            var2.field4217 = var1;
            var2.field4218 = var1.field3265;
            class107.method762(var2);
        }
        class392.field5703 = -1;
        class147.field1993 = false;
        class155.field2092 = -1;
        if (var1 != null) {
            class15.method216((byte) 122, var1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 182)
    private final void method258(byte arg0) {
        field348++;
        if (this.field355 == null) {
            return;
        }
        this.field355.removeKeyListener(this);
        this.field355.removeFocusListener(this);
        this.field355 = null;
        int var2 = -108 % ((arg0 - 43) / 51);
        for (int var3 = 0; var3 < 112; var3++) {
            this.field343[var3] = false;
        }
        this.field349 = null;
        this.field353 = null;
        this.field354 = null;
    }

    @OriginalMember(owner = "client!fk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 210)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field345++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class353.method2261(var2, (byte) 109)) {
            this.method255(2, var2, -1, 0);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V", line = 227)
    public static void method259(int arg0) {
        field341 = null;
        if (arg0 < 53) {
            field352 = 44;
        }
    }

    @OriginalMember(owner = "client!fk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 240)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method252(arg0, true, 0);
        field358++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 248)
    public final void method260(boolean arg0) {
        this.method258((byte) -87);
        if (!arg0) {
            this.method258((byte) 36);
        }
        field338++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 261)
    private final void method261(Component arg0, byte arg1) {
        this.method258((byte) -62);
        if (arg1 < 37) {
            this.method258((byte) -40);
        }
        field351++;
        this.field355 = arg0;
        Method var3 = class341.field5027;
        if (var3 != null) {
            try {
                var3.invoke(this.field355, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field355.addKeyListener(this);
        this.field355.addFocusListener(this);
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 298)
    public final synchronized void method262(int arg0) {
        field356++;
        class390 var2 = this.field353;
        if (arg0 > -115) {
            return;
        }
        while (var2 != null) {
            if (var2.field5693 == 0) {
                if (var2.field5687 >= 0) {
                    var2.field5689 = !this.field343[var2.field5687];
                }
                this.field343[var2.field5687] = true;
            } else if (var2.field5693 == 1) {
                this.field343[var2.field5687] = false;
            } else if (var2.field5693 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field343[var3] = false;
                }
            }
            var2 = var2.field5692;
        }
        this.field349 = this.field353;
        this.field353 = null;
        this.field354 = null;
    }
}
