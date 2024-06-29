import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class152 extends class106 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[Z")
    private boolean[] field2187 = new boolean[112];

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2186 = 0;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[I")
    public static int[] field2182 = new int[32];

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "[Z")
    public static boolean[] field2204 = new boolean[100];

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Llo;")
    private class303 field2188;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "Llo;")
    private class303 field2191;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "Llo;")
    private class303 field2203;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field2196;

    @OriginalMember(owner = "client!eh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method994(arg0, 0, -42);
        field2199++;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public final void method709(int arg0) {
        field2198++;
        this.method991(0);
        if (arg0 != -21357) {
            this.field2203 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    private final void method991(int arg0) {
        field2183++;
        if (this.field2196 == null) {
            return;
        }
        this.field2196.removeKeyListener(this);
        this.field2196.removeFocusListener(this);
        this.field2196 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field2187[var2] = false;
        }
        this.field2191 = null;
        this.field2203 = null;
        this.field2188 = null;
    }

    @OriginalMember(owner = "client!eh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field2190++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class31.method230(var2, -126)) {
            this.method997(2, 86, -1, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Z")
    public final boolean method705(byte arg0, int arg1) {
        if (arg0 != 43) {
            this.method707((byte) -32);
        }
        field2189++;
        return arg1 >= 0 && arg1 < 112 ? this.field2187[arg1] : false;
    }

    @OriginalMember(owner = "client!eh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method994(arg0, 1, -48);
        field2193++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
    public static final int method992(int arg0, int arg1) {
        if (arg0 == 127) {
            field2197++;
            return arg1 & 0x7F;
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!eh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method997(-1, 65, 0, '\u0000');
        field2201++;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public static void method993(int arg0) {
        field2182 = null;
        if (arg0 > -37) {
            field2204 = null;
        }
        field2204 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
    private final void method994(KeyEvent arg0, int arg1, int arg2) {
        field2192++;
        int var4 = arg0.getKeyCode();
        int var5 = 92 / ((arg2 - 47) / 55);
        int var7;
        if (var4 == 0) {
            var7 = 0;
        } else if (var4 >= 0 && var4 < class485.field7077.length) {
            int var6 = class485.field7077[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var7 = 0;
            } else {
                var7 = var6 & 0xFFFFFF7F;
            }
        } else {
            var7 = 0;
        }
        if (var7 != 0) {
            this.method997(arg1, 90, var7, '\u0000');
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZB)V")
    public static final void method995(boolean arg0, byte arg1) {
        field2200++;
        if (arg0) {
            if (class329.field5062 != -1) {
                class129.method818(-14241, class329.field5062);
            }
            for (class407 var2 = (class407) class27.field449.method948(75); var2 != null; var2 = (class407) class27.field449.method938(126)) {
                if (!var2.method2788(-124)) {
                    var2 = (class407) class27.field449.method948(67);
                    if (var2 == null) {
                        break;
                    }
                }
                class143.method953((byte) -34, false, var2, true);
            }
            class329.field5062 = -1;
            class27.field449 = new class141(8);
            class283.method1850(0);
            class329.field5062 = class332.field5147;
            class519.method3092(false, 256);
            class268.method1710(true);
            class291.method1878(class329.field5062);
        }
        class477.method2857(0);
        int var3 = 7 % ((35 - arg1) / 56);
        class479.field7008 = -1;
        class35.method262(class170.field2470, (byte) 15);
        class339.field5365 = new class322();
        class339.field5365.field2217 = class96.field1403 * 128 / 2;
        class339.field5365.field2215 = class485.field7122 * 128 / 2;
        class339.field5365.field5339[0] = class96.field1403 / 2;
        class301.field4447 = 0;
        class34.field539 = 0;
        class339.field5365.field5344[0] = class485.field7122 / 2;
        if (class432.field6409 == 2) {
            class34.field539 = class363.field5623 << 7;
            class301.field4447 = class54.field721 << 7;
        } else {
            class325.method2106(-74);
        }
        class459.method2760((byte) 104);
        if (class34.field539 == 0 || class301.field4447 == 0) {
            class524.method3106(10, (byte) 14);
        } else {
            class466.method2783(-21726);
            class524.method3106(28, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!eh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2184++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Lsk;")
    public final class333 method708(int arg0) {
        field2194++;
        class303 var2 = this.field2188;
        int var3 = -14 / ((71 - arg0) / 52);
        while (var2 != null && var2.field4462 == -1) {
            var2 = var2.field4460;
        }
        if (var2 == null) {
            this.field2188 = null;
        } else {
            this.field2188 = var2.field4460;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public final synchronized void method707(byte arg0) {
        field2202++;
        for (class303 var2 = this.field2203; var2 != null; var2 = var2.field4460) {
            if (var2.field4462 == 0) {
                if (var2.field4456 >= 0) {
                    var2.field4453 = !this.field2187[var2.field4456];
                }
                this.field2187[var2.field4456] = true;
            } else if (var2.field4462 == 1) {
                this.field2187[var2.field4456] = false;
            } else if (var2.field4462 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field2187[var3] = false;
                }
            }
        }
        this.field2188 = this.field2203;
        this.field2203 = null;
        this.field2191 = null;
        if (arg0 != -84) {
            this.method996((byte) -101, null);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class152(Component arg0) {
        class35.method261(-114);
        this.method996((byte) -117, arg0);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method996(byte arg0, Component arg1) {
        field2185++;
        this.method991(0);
        this.field2196 = arg1;
        Method var3 = class469.field6864;
        if (var3 != null) {
            try {
                var3.invoke(this.field2196, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field2196.addKeyListener(this);
        this.field2196.addFocusListener(this);
        if (arg0 > -96) {
            field2186 = 64;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIC)V")
    private final void method997(int arg0, int arg1, int arg2, char arg3) {
        field2195++;
        class303 var5 = new class303();
        var5.field4456 = arg2;
        var5.field4465 = arg3;
        var5.field4462 = arg0;
        if (arg1 <= 58) {
            this.method994(null, -112, -63);
        }
        var5.field4467 = class264.method1698(true);
        if (this.field2191 == null) {
            this.field2203 = var5;
        } else {
            this.field2191.field4460 = var5;
        }
        this.field2191 = var5;
    }

    static {
        new class375(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }
}
