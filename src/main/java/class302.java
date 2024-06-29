import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class302 extends class483 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[Z")
    private boolean[] field4487 = new boolean[112];

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Ldp;")
    public static class347 field4490 = new class347("K", "T", "K", "K");

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Z")
    public static boolean field4504 = false;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Luh;")
    private class406 field4497;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Luh;")
    private class406 field4501;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Luh;")
    private class406 field4506;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lok;")
    public static class74 field4502;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field4488;

    static {
        new class347("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }

    @OriginalMember(owner = "client!ub", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 6)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1884(-1, '\u0000', 0, false);
        field4489++;
    }

    @OriginalMember(owner = "client!ub", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 14)
    public final void focusGained(FocusEvent arg0) {
        field4507++;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 22)
    private final void method1874(int arg0) {
        field4492++;
        if (this.field4488 == null) {
            return;
        }
        this.field4488.removeKeyListener(this);
        this.field4488.removeFocusListener(this);
        if (arg0 < 9) {
            field4502 = null;
        }
        this.field4488 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field4487[var2] = false;
        }
        this.field4497 = null;
        this.field4501 = null;
        this.field4506 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 52)
    private final void method1875(Component arg0, byte arg1) {
        field4495++;
        this.method1874(101);
        if (arg1 != -3) {
            field4502 = null;
        }
        this.field4488 = arg0;
        Method var3 = class109.field1631;
        if (var3 != null) {
            try {
                var3.invoke(this.field4488, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field4488.addKeyListener(this);
        this.field4488.addFocusListener(this);
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V", line = 82)
    public static void method1876(int arg0) {
        field4490 = null;
        field4502 = null;
        if (arg0 != 64) {
            method1876(-89);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 96)
    public final synchronized void method1877(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4505++;
        for (class406 var2 = this.field4497; var2 != null; var2 = var2.field6119) {
            if (var2.field6112 == 0) {
                if (var2.field6121 >= 0) {
                    var2.field6110 = !this.field4487[var2.field6121];
                }
                this.field4487[var2.field6121] = true;
            } else if (var2.field6112 == 1) {
                this.field4487[var2.field6121] = false;
            } else if (var2.field6112 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field4487[var3] = false;
                }
            }
        }
        this.field4506 = this.field4497;
        this.field4497 = null;
        this.field4501 = null;
    }

    @OriginalMember(owner = "client!ub", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 153)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method1883(arg0, -1, 1);
        field4503++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lkh;I)I", line = 161)
    public static final int method1878(class400 arg0, int arg1) {
        field4496++;
        if (arg0.field5971 == arg1) {
            return 0;
        }
        if (arg0.field5991 != -1) {
            class400 var2 = null;
            if (arg0.field5991 < 32768) {
                var2 = class88.field1375[arg0.field5991];
            } else if (arg0.field5991 >= 32768) {
                var2 = class83.field1327[arg0.field5991 - 32768];
            }
            if (var2 != null) {
                int var3 = arg0.field7681 - var2.field7681;
                int var4 = arg0.field7671 - var2.field7671;
                if (var3 != 0 || var4 != 0) {
                    arg0.method2426((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, (byte) 38);
                }
            }
        }
        if (arg0 instanceof class480) {
            class480 var5 = (class480) arg0;
            if (var5.field7093 != -1 && (var5.field6066 == 0 || var5.field6059 > 0)) {
                var5.method2426(var5.field7093, (byte) 38);
                var5.field7093 = -1;
            }
        } else if (arg0 instanceof class351) {
            class351 var6 = (class351) arg0;
            if (var6.field5397 != -1 && (var6.field6066 == 0 || var6.field6059 > 0)) {
                int var7 = var6.field7681 - (var6.field5397 - class267.field3979 - class267.field3979) * 64;
                int var8 = var6.field7671 - ((var6.field5399 - class241.field3358 - class241.field3358) * 64);
                if (var7 != 0 || var8 != 0) {
                    var6.method2426((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, (byte) 38);
                }
                var6.field5397 = -1;
            }
        }
        return arg0.method2412((byte) 99);
    }

    @OriginalMember(owner = "client!ub", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 231)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4485++;
        this.method1883(arg0, -1, 0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Z", line = 239)
    public final boolean method1879(int arg0, boolean arg1) {
        if (arg1) {
            field4500++;
            return arg0 >= 0 && arg0 < 112 ? this.field4487[arg0] : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 255)
    public final void method1880(int arg0) {
        field4491++;
        if (arg0 != -1) {
            this.field4497 = null;
        }
        this.method1874(82);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)Las;", line = 268)
    public final class18 method1881(boolean arg0) {
        field4498++;
        class406 var2;
        for (var2 = this.field4506; var2 != null && var2.field6112 == -1; var2 = var2.field6119) {
        }
        if (var2 == null) {
            this.field4506 = null;
        } else {
            this.field4506 = var2.field6119;
        }
        return arg0 ? null : var2;
    }

    @OriginalMember(owner = "client!ub", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 292)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field4494++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class402.method2428(var2, 1)) {
            this.method1884(2, var2, -1, false);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 307)
    public static final void method1882(byte arg0) {
        field4499++;
        if (class52.field674 == class5.field47) {
            return;
        }
        try {
            class331.method2049(class197.field2894, "tbrefresh", -3460);
            if (arg0 != 31) {
                method1882((byte) -58);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 329)
    private final void method1883(KeyEvent arg0, int arg1, int arg2) {
        field4493++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class55.field744.length > var4) {
            int var5 = class55.field744[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (~var6 != arg1) {
            this.method1884(arg2, '\u0000', var6, false);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 392)
    public class302(Component arg0) {
        class299.method1859(-114);
        this.method1875(arg0, (byte) -3);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ICIZ)V", line = 371)
    private final void method1884(int arg0, char arg1, int arg2, boolean arg3) {
        field4486++;
        class406 var5 = new class406();
        var5.field6121 = arg2;
        var5.field6104 = arg1;
        var5.field6112 = arg0;
        var5.field6113 = class381.method2281((byte) -107);
        if (this.field4501 == null) {
            this.field4497 = var5;
        } else {
            this.field4501.field6119 = var5;
        }
        if (!arg3) {
            this.field4501 = var5;
        }
    }
}
