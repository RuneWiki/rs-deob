import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class218 extends class233 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "[Z")
    private boolean[] field3436 = new boolean[112];

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field3435 = 0;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
    public static int[] field3418 = new int[5];

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Z")
    public static boolean field3421 = false;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field3439 = 0;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    public static int[] field3428 = new int[32];

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lli;")
    private class298 field3426;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Lli;")
    private class298 field3438;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lli;")
    private class298 field3440;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field3422;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3428[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method1456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class102.field1944 = arg0;
        class457.field6778 = arg4;
        class522.field7579 = arg2;
        class471.field6992 = arg3;
        class417.field6288 = arg1;
        field3423++;
        int var6 = 68 / ((-arg5 - 6) / 32);
        if (class471.field6992 >= 100) {
            int var7 = class457.field6778 * 128 + 64;
            int var8 = class522.field7579 * 128 + 64;
            int var9 = class483.method2899(class211.field3371, var7, var8, false) - class102.field1944;
            int var10 = var7 - class509.field7427;
            int var11 = var9 - class428.field6406;
            int var12 = var8 - class432.field6435;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class41.field577 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class139.field2325 = (int) (Math.atan2((double) var10, (double) var12) * -2607.5945876176133D) & 0x3FFF;
            class311.field4707 = 0;
            if (class41.field577 < 1024) {
                class41.field577 = 1024;
            }
            if (class41.field577 > 3072) {
                class41.field577 = 3072;
            }
        }
        class510.field7435 = 2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;I)V", line = 50)
    private final void method1457(boolean arg0, KeyEvent arg1, int arg2) {
        field3433++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class288.field4363.length) {
            int var6 = class288.field4363[var4];
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
        this.method1461(false, var5, arg2, '\u0000');
        arg1.consume();
        if (!arg0) {
            this.method1463(-96);
        }
    }

    @OriginalMember(owner = "client!wb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 88)
    public final void focusGained(FocusEvent arg0) {
        field3419++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Z", line = 100)
    public final boolean method1458(int arg0, int arg1) {
        if (arg0 != 100) {
            this.field3426 = null;
        }
        field3420++;
        return arg1 >= 0 && arg1 < 112 ? this.field3436[arg1] : false;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 115)
    private final void method1459(Component arg0, int arg1) {
        this.method1463(arg1 - 17983);
        if (arg1 != 17870) {
            return;
        }
        field3441++;
        this.field3422 = arg0;
        Method var3 = class480.field7091;
        if (var3 != null) {
            try {
                var3.invoke(this.field3422, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3422.addKeyListener(this);
        this.field3422.addFocusListener(this);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 140)
    public final void method1460(int arg0) {
        int var2 = -22 / ((arg0 + 63) / 62);
        field3424++;
        this.method1463(-113);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIIC)V", line = 150)
    private final void method1461(boolean arg0, int arg1, int arg2, char arg3) {
        if (arg0) {
            return;
        }
        field3430++;
        class298 var5 = new class298();
        var5.field4508 = arg2;
        var5.field4515 = arg3;
        var5.field4509 = arg1;
        var5.field4504 = class423.method2578(-19698);
        if (this.field3426 == null) {
            this.field3440 = var5;
        } else {
            this.field3426.field4513 = var5;
        }
        this.field3426 = var5;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 175)
    public final synchronized void method1462(int arg0) {
        field3437++;
        for (class298 var2 = this.field3440; var2 != null; var2 = var2.field4513) {
            if (var2.field4508 == 0) {
                if (var2.field4509 >= 0) {
                    var2.field4505 = !this.field3436[var2.field4509];
                }
                this.field3436[var2.field4509] = true;
            } else if (var2.field4508 == 1) {
                this.field3436[var2.field4509] = false;
            } else if (var2.field4508 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field3436[var3] = false;
                }
            }
        }
        this.field3438 = this.field3440;
        this.field3440 = null;
        if (arg0 < 48) {
            this.method1463(71);
        }
        this.field3426 = null;
    }

    @OriginalMember(owner = "client!wb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 230)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3434++;
        this.method1457(true, arg0, 0);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V", line = 241)
    private final void method1463(int arg0) {
        field3429++;
        if (this.field3422 == null) {
            return;
        }
        if (arg0 != -113) {
            field3428 = null;
        }
        this.field3422.removeKeyListener(this);
        this.field3422.removeFocusListener(this);
        this.field3422 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3436[var2] = false;
        }
        this.field3438 = null;
        this.field3426 = null;
        this.field3440 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 269)
    public static void method1464(byte arg0) {
        if (arg0 != -114) {
            field3421 = false;
        }
        field3428 = null;
        field3418 = null;
    }

    @OriginalMember(owner = "client!wb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 284)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3431++;
        this.method1457(true, arg0, 1);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 359)
    public class218(Component arg0) {
        class52.method489((byte) 126);
        this.method1459(arg0, 17870);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Lab;", line = 302)
    public final class477 method1465(int arg0) {
        field3427++;
        class298 var2 = this.field3438;
        if (arg0 != -65536) {
            return null;
        }
        while (var2 != null && var2.field4508 == -1) {
            var2 = var2.field4513;
        }
        if (var2 == null) {
            this.field3438 = null;
        } else {
            this.field3438 = var2.field4513;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 326)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3432++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class296.method1913(255, var2)) {
            this.method1461(false, -1, 2, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 351)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1461(false, 0, -1, '\u0000');
        field3442++;
    }
}
