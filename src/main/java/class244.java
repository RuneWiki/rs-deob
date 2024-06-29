import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class244 extends class72 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Low;")
    private class665 field3496 = new class665();

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Low;")
    private class665 field3502 = new class665();

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "[Z")
    private boolean[] field3505 = new boolean[112];

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
    public static boolean field3488 = false;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field3498 = 0;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "Ljava/awt/Component;")
    private Component field3504;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field3506;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1626(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 3)
    private final void method1618(int arg0) {
        field3503++;
        if (this.field3504 == null) {
            return;
        }
        this.field3504.removeKeyListener(this);
        this.field3504.removeFocusListener(this);
        this.field3504 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field3505[var2] = false;
        }
        this.field3496.method3735(-4676);
        this.field3502.method3735(-4676);
    }

    @OriginalMember(owner = "client!ue", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 30)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3492++;
        this.method1619(1, 95, arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V", line = 39)
    private final void method1619(int arg0, int arg1, KeyEvent arg2) {
        field3484++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class231.field3377.length) {
            int var5 = class231.field3377[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method1621(1, arg0, '\u0000', var6);
            arg2.consume();
            int var7 = 99 / ((38 - arg1) / 44);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I", line = 76)
    private final int method1620(boolean arg0) {
        field3490++;
        int var2 = 0;
        if (this.field3505[81]) {
            var2 |= 0x1;
        }
        if (this.field3505[82]) {
            var2 |= 0x4;
        }
        if (arg0) {
            if (this.field3505[86]) {
                var2 |= 0x2;
            }
            return var2;
        } else {
            return -73;
        }
    }

    @OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 101)
    public final void focusGained(FocusEvent arg0) {
        field3497++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IICI)V", line = 108)
    private final void method1621(int arg0, int arg1, char arg2, int arg3) {
        field3501++;
        class86 var5 = new class86();
        if (arg0 != 1) {
            this.field3504 = null;
        }
        var5.field1284 = arg2;
        var5.field1275 = arg1;
        var5.field1286 = arg3;
        var5.field1278 = class337.method2062(false);
        this.field3502.method3728((byte) 98, var5);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Ltm;", line = 129)
    public final class618 method680(int arg0) {
        if (arg0 == 13) {
            field3485++;
            return (class618) this.field3496.method3726(12691);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 141)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1619(0, 92, arg0);
        field3493++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 152)
    public final synchronized void method679(int arg0) {
        field3494++;
        this.field3496.method3735(-4676);
        if (arg0 < 59) {
            this.field3504 = null;
        }
        for (class86 var2 = (class86) this.field3502.method3726(12691); var2 != null; var2 = (class86) this.field3502.method3726(12691)) {
            var2.field1282 = this.method1620(true);
            if (var2.field1275 == 0) {
                if (!this.field3505[var2.field1286]) {
                    class86 var3 = new class86();
                    var3.field1278 = var2.field1278;
                    var3.field1275 = 0;
                    var3.field1284 = '\u0000';
                    var3.field1282 = var2.field1282;
                    var3.field1286 = var2.field1286;
                    this.field3496.method3728((byte) 112, var3);
                    this.field3505[var2.field1286] = true;
                }
                var2.field1275 = 2;
                this.field3496.method3728((byte) 125, var2);
            } else if (var2.field1275 == 1) {
                if (this.field3505[var2.field1286]) {
                    this.field3496.method3728((byte) 123, var2);
                    this.field3505[var2.field1286] = false;
                }
            } else if (var2.field1275 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field3505[var4]) {
                        class86 var5 = new class86();
                        var5.field1278 = var2.field1278;
                        var5.field1275 = 1;
                        var5.field1286 = var4;
                        var5.field1284 = '\u0000';
                        var5.field1282 = var2.field1282;
                        this.field3496.method3728((byte) 112, var5);
                        this.field3505[var4] = false;
                    }
                }
            } else if (var2.field1275 == 3) {
                this.field3496.method3728((byte) 100, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lwt;", line = 243)
    public static final class522 method1622(Component arg0, boolean arg1, boolean arg2) {
        field3500++;
        try {
            if (!arg1) {
                method1624(false);
            }
            Constructor var3 = Class.forName("oia").getDeclaredConstructor(field3506 == null ? (field3506 = method1626("java.awt.Component")) : field3506, Boolean.TYPE);
            return (class522) var3.newInstance(arg0, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class606(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V", line = 262)
    public static final void method1623() {
        for (int var0 = class614.field8712; var0 < class169.field2565; var0++) {
            for (int var1 = 0; var1 < class42.field520; var1++) {
                for (int var2 = 0; var2 < class681.field9665; var2++) {
                    class172 var3 = class514.field7096[var0][var1][var2];
                    if (var3 != null) {
                        class338 var4 = var3.field2593;
                        class338 var5 = var3.field2600;
                        if (var4 != null && var4.method197(true)) {
                            class97.method801(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method197(true)) {
                                class97.method801(var5, var0, var1, var2, 1, 1);
                                var5.method194(-24659, 0, 0, class29.field307, var4, false, 0);
                                var5.method196(-10382);
                            }
                            var4.method196(-10382);
                        }
                        for (class11 var6 = var3.field2594; var6 != null; var6 = var6.field145) {
                            class208 var8 = var6.field143;
                            if (var8 != null && var8.method197(true)) {
                                class97.method801(var8, var0, var1, var2, var8.field3030 + 1 - var8.field3027, var8.field3038 - var8.field3035 + 1);
                                var8.method196(-10382);
                            }
                        }
                        class203 var7 = var3.field2595;
                        if (var7 != null && var7.method197(true)) {
                            class472.method2757(var7, var0, var1, var2);
                            var7.method196(-10382);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)Z", line = 337)
    public final boolean method681(byte arg0, int arg1) {
        if (arg0 <= 96) {
            this.keyPressed(null);
        }
        field3487++;
        return arg1 >= 0 && arg1 < 112 ? this.field3505[arg1] : false;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 470)
    public class244(Component arg0) {
        class203.method1432(false);
        this.method1625(arg0, -124);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V", line = 360)
    public static final void method1624(boolean arg0) {
        field3499++;
        int var1 = class420.field5820.field9460.method3420(17539);
        if (var1 == 0) {
            class23.field257 = null;
            class505.method2958(0, 91);
        } else if (var1 == 1) {
            class329.method2000((byte) 91, (byte) 0);
            class505.method2958(512, 70);
            if (class336.field4782 != null) {
                class112.method929((byte) 76);
            }
        } else {
            class329.method2000((byte) 68, (byte) (class626.field8887 - 4 & 0xFF));
            class505.method2958(2, -59);
        }
        if (!arg0) {
            method1624(false);
        }
        class381.field5338 = class403.field5560;
    }

    @OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 402)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3491++;
        this.method1621(1, -1, '\u0000', 0);
    }

    @OriginalMember(owner = "client!ue", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 410)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3489++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class617.method3545(var2, 0)) {
            this.method1621(1, 3, var2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 424)
    public final void method685(int arg0) {
        field3495++;
        if (arg0 >= 96) {
            this.method1618(0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 436)
    private final void method1625(Component arg0, int arg1) {
        field3486++;
        this.method1618(0);
        int var3 = -53 % ((-arg1 - 58) / 59);
        this.field3504 = arg0;
        Method var4 = class111.field1610;
        if (var4 != null) {
            try {
                var4.invoke(this.field3504, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field3504.addKeyListener(this);
        this.field3504.addFocusListener(this);
    }
}
