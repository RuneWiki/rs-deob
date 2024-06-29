import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class505 extends class360 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Lwo;")
    private class445 field6966 = new class445();

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "Lwo;")
    private class445 field6976 = new class445();

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "[Z")
    private boolean[] field6979 = new boolean[112];

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "Ljava/awt/Component;")
    private Component field6983;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Z")
    public static boolean field6963;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 3)
    private final void method2870(int arg0, Component arg1) {
        this.method2872(arg0 ^ arg0);
        field6980++;
        this.field6983 = arg1;
        Method var3 = class388.field5197;
        if (var3 != null) {
            try {
                var3.invoke(this.field6983, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6983.addKeyListener(this);
        this.field6983.addFocusListener(this);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(CIII)V", line = 26)
    private final void method2871(char arg0, int arg1, int arg2, int arg3) {
        field6962++;
        class688 var5 = new class688();
        var5.field9723 = arg1;
        int var6 = -85 % ((72 - arg2) / 38);
        var5.field9715 = arg0;
        var5.field9724 = arg3;
        var5.field9711 = class529.method2982((byte) -69);
        this.field6976.method2507(var5, (byte) -122);
    }

    @OriginalMember(owner = "client!bi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 43)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field6964++;
        this.method2873(0, (byte) 127, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 60)
    private final void method2872(int arg0) {
        field6977++;
        if (this.field6983 == null) {
            return;
        }
        this.field6983.removeKeyListener(this);
        this.field6983.removeFocusListener(this);
        this.field6983 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field6979[var2] = false;
        }
        this.field6966.method2512(-11558);
        this.field6976.method2512(arg0 ^ 0xFFFFD2DA);
    }

    @OriginalMember(owner = "client!bi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 88)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6969++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class664.method3786(-129, var2)) {
            this.method2871(var2, -1, 121, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 104)
    public final synchronized void method2110(int arg0) {
        if (arg0 > -123) {
            method2876(88, -26, 33);
        }
        field6975++;
        this.field6966.method2512(-11558);
        for (class688 var2 = (class688) this.field6976.method2502((byte) -118); var2 != null; var2 = (class688) this.field6976.method2502((byte) 43)) {
            var2.field9725 = this.method2875((byte) 58);
            if (var2.field9724 == 0) {
                if (!this.field6979[var2.field9723]) {
                    class688 var5 = new class688();
                    var5.field9715 = '\u0000';
                    var5.field9723 = var2.field9723;
                    var5.field9724 = 0;
                    var5.field9711 = var2.field9711;
                    var5.field9725 = var2.field9725;
                    this.field6966.method2507(var5, (byte) -128);
                    this.field6979[var2.field9723] = true;
                }
                var2.field9724 = 2;
                this.field6966.method2507(var2, (byte) -126);
            } else if (var2.field9724 == 1) {
                if (this.field6979[var2.field9723]) {
                    this.field6966.method2507(var2, (byte) -124);
                    this.field6979[var2.field9723] = false;
                }
            } else if (var2.field9724 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field6979[var3]) {
                        class688 var4 = new class688();
                        var4.field9711 = var2.field9711;
                        var4.field9715 = '\u0000';
                        var4.field9723 = var3;
                        var4.field9725 = var2.field9725;
                        var4.field9724 = 1;
                        this.field6966.method2507(var4, (byte) -125);
                        this.field6979[var3] = false;
                    }
                }
            } else if (var2.field9724 == 3) {
                this.field6966.method2507(var2, (byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 194)
    public final void focusGained(FocusEvent arg0) {
        field6973++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Z", line = 204)
    public final boolean method2106(byte arg0, int arg1) {
        field6961++;
        if (arg0 >= -104) {
            this.field6983 = null;
        }
        return arg1 >= 0 && arg1 < 112 ? this.field6979[arg1] : false;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V", line = 221)
    private final void method2873(int arg0, byte arg1, KeyEvent arg2) {
        int var4 = 27 / ((70 - arg1) / 50);
        field6970++;
        int var5 = arg2.getKeyCode();
        int var7;
        if (var5 == 0) {
            var7 = 0;
        } else if (var5 >= 0 && var5 < class111.field1422.length) {
            int var6 = class111.field1422[var5];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var7 = 0;
            } else {
                var7 = var6 & 0xFFFFFF7F;
            }
        } else {
            var7 = 0;
        }
        if (var7 != 0) {
            this.method2871('\u0000', var7, 120, arg0);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!bi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 255)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2873(1, (byte) -38, arg0);
        field6974++;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 387)
    public class505(Component arg0) {
        class417.method2361((byte) 31);
        this.method2870(0, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[F)[F", line = 266)
    public static final float[] method2874(int arg0, int arg1, float[] arg2) {
        field6972++;
        float[] var3 = new float[arg0];
        class2.method6(arg2, arg1, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)I", line = 277)
    private final int method2875(byte arg0) {
        field6982++;
        int var2 = 0;
        int var3 = 43 % ((arg0 + 21) / 59);
        if (this.field6979[81]) {
            var2 |= 0x1;
        }
        if (this.field6979[82]) {
            var2 |= 0x4;
        }
        if (this.field6979[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 301)
    public static final void method2876(int arg0, int arg1, int arg2) {
        field6971++;
        if (arg0 == -14680) {
            class256 var3 = class592.method3279((byte) -44, 5, arg2);
            var3.method1549(-32042);
            var3.field3358 = arg1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 321)
    public final void method2105(int arg0) {
        if (arg0 <= 49) {
            this.field6979 = null;
        }
        field6958++;
        this.method2872(0);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Ltea;", line = 336)
    public final class477 method2111(byte arg0) {
        if (arg0 <= 92) {
            field6967 = 127;
        }
        field6978++;
        return (class477) this.field6966.method2502((byte) 116);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z", line = 347)
    public static final boolean method2877(int arg0, int arg1, int arg2) {
        if (arg0 <= 51) {
            method2878(-22, null, null);
        }
        field6965++;
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 367)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2871('\u0000', 0, -98, -1);
        field6959++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILfa;Lga;)V", line = 375)
    public static final void method2878(int arg0, class522 arg1, class332 arg2) {
        if (arg0 != -25467) {
            method2876(-40, 52, -23);
        }
        field6981++;
        class574.field7845 = arg1;
        class609.field8466 = arg2;
    }
}
