import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class76 extends class598 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "Lae;")
    private class40 field1051 = new class40();

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "Lae;")
    private class40 field1052 = new class40();

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "[Z")
    private boolean[] field1053 = new boolean[112];

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field1046 = -2;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field1054;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I", line = 4)
    private final int method447(int arg0) {
        field1044++;
        int var2 = 0;
        if (this.field1053[81]) {
            var2 |= 0x1;
        }
        if (this.field1053[82]) {
            var2 |= 0x4;
        }
        if (this.field1053[arg0]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)Z", line = 24)
    public final boolean method448(byte arg0, int arg1) {
        if (arg0 == -68) {
            field1041++;
            return arg1 >= 0 && arg1 < 112 ? this.field1053[arg1] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V", line = 38)
    private final void method449(int arg0, KeyEvent arg1, int arg2) {
        field1036++;
        int var4 = arg1.getKeyCode();
        int var6;
        if (~var4 == arg2) {
            var6 = 0;
        } else if (var4 >= 0 && class5.field138.length > var4) {
            int var5 = class5.field138[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method453(var6, arg0, -123, '\u0000');
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 70)
    private final void method450(Component arg0, byte arg1) {
        this.method452(-127);
        field1039++;
        this.field1054 = arg0;
        Method var3 = class648.field9161;
        if (var3 != null) {
            try {
                var3.invoke(this.field1054, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field1054.addKeyListener(this);
        this.field1054.addFocusListener(this);
        int var4 = -110 % ((arg1 + 55) / 41);
    }

    @OriginalMember(owner = "client!jp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 96)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1049++;
        this.method449(0, arg0, -1);
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)V", line = 108)
    public final void method451(byte arg0) {
        field1037++;
        this.method452(-108);
        if (arg0 != 29) {
            method454(true);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 119)
    private final void method452(int arg0) {
        field1048++;
        if (this.field1054 == null) {
            return;
        }
        this.field1054.removeKeyListener(this);
        this.field1054.removeFocusListener(this);
        this.field1054 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field1053[var2] = false;
        }
        if (arg0 >= -62) {
            this.field1051 = null;
        }
        this.field1051.method247(2);
        this.field1052.method247(2);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIC)V", line = 151)
    private final void method453(int arg0, int arg1, int arg2, char arg3) {
        field1042++;
        class98 var5 = new class98();
        if (arg2 > -73) {
            this.field1052 = null;
        }
        var5.field1335 = arg0;
        var5.field1340 = arg3;
        var5.field1339 = arg1;
        var5.field1341 = class571.method3150(107);
        this.field1052.method239(var5, (byte) 93);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V", line = 169)
    public static final void method454(boolean arg0) {
        class167.field2192++;
        field1038++;
        class704 var1 = class314.method1820(class431.field5393, class400.field5014, (byte) -113);
        var1.field9929.method3509(class193.method1167(101), (byte) -116);
        if (!arg0) {
            field1046 = -99;
        }
        var1.field9929.method3526(class523.field7111, 13469);
        var1.field9929.method3526(class244.field3022, 13469);
        var1.field9929.method3509(class301.field3698.field6645, (byte) -115);
        class122.method654(var1, (byte) -36);
    }

    @OriginalMember(owner = "client!jp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 187)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method449(1, arg0, -1);
        field1040++;
    }

    @OriginalMember(owner = "client!jp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 196)
    public final void focusGained(FocusEvent arg0) {
        field1045++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 204)
    public final synchronized void method455(byte arg0) {
        this.field1051.method247(2);
        field1043++;
        if (arg0 != 32) {
            this.method450(null, (byte) -72);
        }
        for (class98 var2 = (class98) this.field1052.method244(true); var2 != null; var2 = (class98) this.field1052.method244(true)) {
            var2.field1331 = this.method447(86);
            if (var2.field1339 == 0) {
                if (!this.field1053[var2.field1335]) {
                    class98 var5 = new class98();
                    var5.field1341 = var2.field1341;
                    var5.field1340 = '\u0000';
                    var5.field1335 = var2.field1335;
                    var5.field1331 = var2.field1331;
                    var5.field1339 = 0;
                    this.field1051.method239(var5, (byte) 93);
                    this.field1053[var2.field1335] = true;
                }
                var2.field1339 = 2;
                this.field1051.method239(var2, (byte) 93);
            } else if (var2.field1339 == 1) {
                if (this.field1053[var2.field1335]) {
                    this.field1051.method239(var2, (byte) 93);
                    this.field1053[var2.field1335] = false;
                }
            } else if (var2.field1339 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field1053[var3]) {
                        class98 var4 = new class98();
                        var4.field1341 = var2.field1341;
                        var4.field1331 = var2.field1331;
                        var4.field1340 = '\u0000';
                        var4.field1339 = 1;
                        var4.field1335 = var3;
                        this.field1051.method239(var4, (byte) 93);
                        this.field1053[var3] = false;
                    }
                }
            } else if (var2.field1339 == 3) {
                this.field1051.method239(var2, (byte) 93);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 295)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1035++;
        this.method453(0, -1, -74, '\u0000');
    }

    @OriginalMember(owner = "client!jp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 303)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field1047++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class262.method1519((byte) 24, var2)) {
            this.method453(-1, 3, -127, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(B)Lau;", line = 325)
    public final class521 method456(byte arg0) {
        if (arg0 >= -79) {
            field1046 = 11;
        }
        field1050++;
        return (class521) this.field1051.method244(true);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 348)
    public class76(Component arg0) {
        class160.method927(-15630);
        this.method450(arg0, (byte) 18);
    }
}
