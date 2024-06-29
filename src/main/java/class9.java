import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class90 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lgca;")
    private class227 field76 = new class227();

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Lgca;")
    private class227 field88 = new class227();

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "[Z")
    private boolean[] field89 = new boolean[112];

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Lgo;")
    public static class581 field86 = new class581(4, 1, 1, 1);

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Z")
    public static boolean field90 = false;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Ljava/awt/Component;")
    private Component field91;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[Lui;")
    public static class209[] field72;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
    public final boolean method34(int arg0, int arg1) {
        if (arg1 != -16215) {
            field90 = false;
        }
        field77++;
        return arg0 >= 0 && arg0 < 112 ? this.field89[arg0] : false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BZ)V")
    public static final void method35(byte arg0, boolean arg1) {
        if (class589.field8272 != null) {
            class589.field8272.method1935(0);
            class589.field8272 = null;
        }
        field78++;
        class521.field7090 = 0;
        class63.method526(false);
        class256.method1575();
        for (int var2 = 0; var2 < 4; var2++) {
            class151.field2218[var2].method2183(1);
        }
        class152.method1095(false, true);
        System.gc();
        class180.method1241(2, -1);
        class636.field8795 = false;
        class507.field6950 = -1;
        class167.method1179((byte) -126);
        class216.method1388(true, (byte) -59);
        class452.field6238 = 0;
        class273.field3739 = 0;
        class236.field3253 = 0;
        class498.field6774 = 0;
        class186.field2695 = 0;
        class613.field8555 = 0;
        for (int var3 = 0; var3 < class309.field4278.length; var3++) {
            class309.field4278[var3] = null;
        }
        class520.method2964((byte) -102);
        for (int var4 = 0; var4 < 2048; var4++) {
            class671.field9407[var4] = null;
        }
        class698.field9912 = 0;
        class299.field4071.method974(-20470);
        class254.field3465 = 0;
        class687.field9801.method974(-20470);
        class377.method2159(false);
        class442.field6115 = 0;
        class578.field8156.method866(0);
        class578.method3297(-22998);
        class167.method1177(5926);
        int var5 = -7 % ((arg0 + 75) / 48);
        class706.field9973 = 0L;
        class108.field1501 = null;
        if (arg1) {
            class178.method1232(12, (byte) -84);
            return;
        }
        class178.method1232(3, (byte) -72);
        try {
            class204.method1329((byte) -57, class59.field668, "loggedout");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BICI)V")
    private final void method36(byte arg0, int arg1, char arg2, int arg3) {
        field71++;
        class331 var5 = new class331();
        var5.field4467 = arg2;
        var5.field4470 = arg1;
        var5.field4471 = arg3;
        var5.field4472 = class577.method3295((byte) 15);
        this.field88.method1441(var5, 0);
        if (arg0 > -44) {
            this.method34(-65, 33);
        }
    }

    @OriginalMember(owner = "client!ff", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method36((byte) -96, -1, '\u0000', 0);
        field84++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final synchronized void method37(int arg0) {
        this.field76.method1444(-27547);
        field75++;
        int var2 = -2 / ((arg0 + 68) / 42);
        for (class331 var3 = (class331) this.field88.method1442(-10011); var3 != null; var3 = (class331) this.field88.method1442(-10011)) {
            var3.field4464 = this.method40(-16356);
            if (var3.field4470 == 0) {
                if (!this.field89[var3.field4471]) {
                    class331 var4 = new class331();
                    var4.field4467 = '\u0000';
                    var4.field4471 = var3.field4471;
                    var4.field4470 = 0;
                    var4.field4472 = var3.field4472;
                    var4.field4464 = var3.field4464;
                    this.field76.method1441(var4, 0);
                    this.field89[var3.field4471] = true;
                }
                var3.field4470 = 2;
                this.field76.method1441(var3, 0);
            } else if (var3.field4470 == 1) {
                if (this.field89[var3.field4471]) {
                    this.field76.method1441(var3, 0);
                    this.field89[var3.field4471] = false;
                }
            } else if (var3.field4470 == -1) {
                for (int var5 = 0; var5 < 112; var5++) {
                    if (this.field89[var5]) {
                        class331 var6 = new class331();
                        var6.field4464 = var3.field4464;
                        var6.field4470 = 1;
                        var6.field4471 = var5;
                        var6.field4467 = '\u0000';
                        var6.field4472 = var3.field4472;
                        this.field76.method1441(var6, 0);
                        this.field89[var5] = false;
                    }
                }
            } else if (var3.field4470 == 3) {
                this.field76.method1441(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static void method38(byte arg0) {
        int var1 = 59 % ((arg0 + 74) / 36);
        field86 = null;
        field72 = null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    private final void method39(int arg0) {
        field70++;
        if (this.field91 == null) {
            return;
        }
        this.field91.removeKeyListener(this);
        this.field91.removeFocusListener(this);
        this.field91 = null;
        if (arg0 < 76) {
            method38((byte) -110);
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field89[var2] = false;
        }
        this.field76.method1444(-27547);
        this.field88.method1444(-27547);
    }

    @OriginalMember(owner = "client!ff", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field80++;
        this.method43(0, arg0, 2);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I")
    private final int method40(int arg0) {
        field69++;
        int var2 = 0;
        if (this.field89[81]) {
            var2 |= 0x1;
        }
        if (this.field89[82]) {
            var2 |= 0x4;
        }
        if (this.field89[86]) {
            var2 |= 0x2;
        }
        return arg0 == -16356 ? var2 : -106;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method41(byte arg0, Component arg1) {
        field74++;
        this.method39(arg0 ^ 0x6C);
        this.field91 = arg1;
        Method var3 = class105.field1458;
        if (arg0 != 4) {
            method42(7, 53, -81, -82, 46, -47, -32);
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field91, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field91.addKeyListener(this);
        this.field91.addFocusListener(this);
    }

    @OriginalMember(owner = "client!ff", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field87++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class355.method2035(-1, var2)) {
            this.method36((byte) -92, 3, var2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V")
    public static final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 12803) {
            method38((byte) 112);
        }
        class384.field5456 = arg3;
        class285.field3916 = arg2;
        class15.field154 = arg5;
        class34.field419 = arg1;
        field83++;
        class567.field7997 = arg6;
        class91.field1318 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
    private final void method43(int arg0, KeyEvent arg1, int arg2) {
        field85++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class652.field9062.length) {
            int var6 = class652.field9062[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
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
        if (arg2 != 2) {
            method35((byte) 109, false);
        }
        this.method36((byte) -98, arg0, '\u0000', var5);
        arg1.consume();
    }

    @OriginalMember(owner = "client!ff", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field92++;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Ljo;")
    public final class305 method44(byte arg0) {
        field82++;
        if (arg0 >= -82) {
            this.method43(-76, null, 36);
        }
        return (class305) this.field76.method1442(-10011);
    }

    @OriginalMember(owner = "client!ff", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method43(1, arg0, 2);
        field79++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIII)V")
    public static final void method45(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field73++;
        class352 var5 = class555.method3114(-1);
        var5.field4686.method2817(class206.field2893.field6750, true);
        var5.field4686.method2817(arg4, true);
        var5.field4686.method2817(arg0, true);
        var5.field4686.method2837(arg3, -2);
        var5.field4686.method2837(arg2, -2);
        class602.method3388(var5, (byte) 28);
        class129.field1850 = 0;
        if (arg1 < 83) {
            method45(124, (byte) -63, -42, -27, 16);
        }
        class610.field8467 = -3;
        class263.field3571 = 1;
        class672.field9428 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public final void method46(byte arg0) {
        field81++;
        if (arg0 > 35) {
            this.method39(94);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class9(Component arg0) {
        class17.method85(false);
        this.method41((byte) 4, arg0);
    }
}
