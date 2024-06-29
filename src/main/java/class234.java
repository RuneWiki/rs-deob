import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class234 extends class472 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!av", name = "w", descriptor = "[Z")
    private boolean[] field3044 = new boolean[112];

    @OriginalMember(owner = "client!av", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3042 = "";

    @OriginalMember(owner = "client!av", name = "z", descriptor = "I")
    public static int field3047 = 2;

    @OriginalMember(owner = "client!av", name = "C", descriptor = "Lhb;")
    public static class250 field3050 = new class250(79, 16);

    @OriginalMember(owner = "client!av", name = "G", descriptor = "Loi;")
    public static class169 field3054 = new class169("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!av", name = "I", descriptor = "[I")
    public static int[] field3056 = new int[5];

    @OriginalMember(owner = "client!av", name = "H", descriptor = "F")
    public static float field3055;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!av", name = "B", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!av", name = "D", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!av", name = "F", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Lbg;")
    private class273 field3034;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "Lbg;")
    private class273 field3035;

    @OriginalMember(owner = "client!av", name = "v", descriptor = "Lbg;")
    private class273 field3043;

    @OriginalMember(owner = "client!av", name = "E", descriptor = "Ljava/awt/Component;")
    private Component field3052;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "[I")
    public static int[] field3041;

    @OriginalMember(owner = "client!av", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1483(0, false, arg0);
        field3033++;
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
    public final synchronized void method1480(int arg0) {
        field3053++;
        for (class273 var2 = this.field3035; var2 != null; var2 = var2.field3471) {
            if (var2.field3462 == 0) {
                if (var2.field3463 >= 0) {
                    var2.field3468 = !this.field3044[var2.field3463];
                }
                this.field3044[var2.field3463] = true;
            } else if (var2.field3462 == 1) {
                this.field3044[var2.field3463] = false;
            } else if (var2.field3462 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field3044[var3] = false;
                }
            }
        }
        this.field3034 = this.field3035;
        this.field3035 = null;
        this.field3043 = null;
        if (arg0 >= -48) {
            field3041 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)Lkc;")
    public final class156 method1481(int arg0) {
        field3046++;
        class273 var2;
        for (var2 = this.field3034; var2 != null && var2.field3462 == -1; var2 = var2.field3471) {
        }
        if (var2 == null) {
            this.field3034 = null;
        } else {
            this.field3034 = var2.field3471;
        }
        if (arg0 != 0) {
            this.method1487(-80);
        }
        return var2;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
    public static final void method1482(int arg0, int arg1, int arg2) {
        boolean var3 = class470.field6877[0][arg1][arg2] != null && class470.field6877[0][arg1][arg2].field7483 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class470.field6877[var4][arg1][arg2] == null) {
                class510 var5 = class470.field6877[var4][arg1][arg2] = new class510(var4, arg1, arg2);
                if (var3) {
                    var5.field7500++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
    private final void method1483(int arg0, boolean arg1, KeyEvent arg2) {
        field3036++;
        if (arg1) {
            field3054 = null;
        }
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class376.field4884.length) {
            int var6 = class376.field4884[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method1491('\u0000', var5, -31828, arg0);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!av", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3039++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class463.method2772(var2, (byte) 52)) {
            this.method1491(var2, -1, -31828, 2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BIILib;I)V")
    public static final void method1484(byte arg0, int arg1, int arg2, class9 arg3, int arg4) {
        field3040++;
        long var5 = (long) (arg2 | arg1 << 14 | arg4 << 28);
        class237 var7 = (class237) class376.field4885.method2085(var5, -5423);
        if (var7 == null) {
            class237 var8 = new class237();
            class376.field4885.method2096(var5, var8, (byte) 76);
            var8.field3082.method42(arg3, 0);
            return;
        }
        if (arg0 < 33) {
            method1485(-31);
        }
        class497 var9 = class89.field1238.method111(arg3.field92, -115);
        int var10 = var9.field7254;
        if (var9.field7298 == 1) {
            var10 = (arg3.field88 + 1) * var10;
        }
        for (class9 var11 = (class9) var7.field3082.method49(-119); var11 != null; var11 = (class9) var7.field3082.method46((byte) 45)) {
            class497 var12 = class89.field1238.method111(var11.field92, -111);
            int var13 = var12.field7254;
            if (var12.field7298 == 1) {
                var13 = (var11.field88 + 1) * var13;
            }
            if (var10 > var13) {
                class263.method1644(var11, arg3, (byte) 59);
                return;
            }
        }
        var7.field3082.method42(arg3, 0);
    }

    @OriginalMember(owner = "client!av", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3030++;
        this.method1491('\u0000', 0, -31828, -1);
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V")
    public static void method1485(int arg0) {
        field3054 = null;
        if (arg0 != 0) {
            field3047 = 90;
        }
        field3050 = null;
        field3041 = null;
        field3042 = null;
        field3056 = null;
    }

    @OriginalMember(owner = "client!av", name = "f", descriptor = "(I)V")
    public static final void method1486(int arg0) {
        field3038++;
        if (class352.field4498) {
            return;
        }
        if (arg0 >= -56) {
            field3047 = -12;
        }
        class267.field3387 = true;
        class352.field4498 = true;
        if (class421.field5647.field7707) {
            class244.field3138 = ((int) class244.field3138 - 65 & 0xFFFFFF80);
        } else {
            class36.field553 += (-24.0F - class36.field553) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)V")
    public final void method1487(int arg0) {
        this.method1489((byte) 25);
        field3048++;
        if (arg0 != 3) {
            this.field3043 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)Z")
    public final boolean method1488(byte arg0, int arg1) {
        field3045++;
        if (arg1 >= 0 && arg1 < 112) {
            return arg0 < 58 ? false : this.field3044[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
    private final void method1489(byte arg0) {
        field3037++;
        if (this.field3052 == null) {
            return;
        }
        this.field3052.removeKeyListener(this);
        this.field3052.removeFocusListener(this);
        this.field3052 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3044[var2] = false;
        }
        int var3 = 8 % ((-arg0 - 24) / 47);
        this.field3034 = null;
        this.field3035 = null;
        this.field3043 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1490(int arg0, Component arg1) {
        this.method1489((byte) 56);
        field3051++;
        this.field3052 = arg1;
        if (arg0 != 7543) {
            return;
        }
        Method var3 = class441.field6159;
        if (var3 != null) {
            try {
                var3.invoke(this.field3052, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3052.addKeyListener(this);
        this.field3052.addFocusListener(this);
    }

    @OriginalMember(owner = "client!av", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3049++;
    }

    @OriginalMember(owner = "client!av", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3031++;
        this.method1483(1, false, arg0);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(CIII)V")
    private final void method1491(char arg0, int arg1, int arg2, int arg3) {
        field3032++;
        class273 var5 = new class273();
        var5.field3463 = arg1;
        var5.field3462 = arg3;
        var5.field3464 = arg0;
        if (arg2 != -31828) {
            return;
        }
        var5.field3465 = class173.method1134(true);
        if (this.field3043 == null) {
            this.field3035 = var5;
        } else {
            this.field3043.field3471 = var5;
        }
        this.field3043 = var5;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class234(Component arg0) {
        class69.method394(false);
        this.method1490(7543, arg0);
    }
}
