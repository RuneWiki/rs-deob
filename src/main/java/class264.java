import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class264 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lce;")
    public static class126 field4402 = class206.method1445(-7923, "(U4");

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lce;")
    public static class126 field4406 = class206.method1445(-7923, " GMT");

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lce;")
    public static class126 field4408 = class206.method1445(-7923, "runes");

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lvc;")
    public static class129 field4399 = new class129();

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field4412 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Z")
    public static boolean field4407;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
    public static int[] field4398;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[[[B")
    public static byte[][][] field4400;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[[[I")
    public static int[][][] field4396;

    @OriginalMember(owner = "client!wa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 30)
    public final void focusGained(FocusEvent arg0) {
        field4394++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIBI)V", line = 38)
    public static final void method1773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4395++;
        if (class13.method75(arg8, (byte) -43)) {
            class58.field908 = null;
            class183.method1309(arg1, arg5, (byte) -121, arg0, arg2, class291.field4825[arg8], -1, arg6, arg3, arg4);
            if (arg7 >= 108 && class58.field908 != null) {
                class183.method1309(arg1, arg5, (byte) -124, arg0, class313.field5331, class58.field908, -1412584499, arg6, class228.field3839, arg4);
                class58.field908 = null;
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class220.field3698[var9] = true;
            }
        } else {
            class220.field3698[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 86)
    public static void method1774(boolean arg0) {
        field4399 = null;
        field4396 = (int[][][]) null;
        field4400 = (byte[][][]) null;
        field4402 = null;
        if (arg0) {
            method1773(59, -24, -96, 101, -68, 14, 76, (byte) 108, 30);
        }
        field4408 = null;
        field4406 = null;
        field4398 = null;
    }

    @OriginalMember(owner = "client!wa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 122)
    public final void keyTyped(KeyEvent arg0) {
        if (class50.field761 != null) {
            int var2 = class18.method99(arg0, (byte) -71);
            if (var2 >= 0) {
                int var3 = class205.field3517 + 1 & 0x7F;
                if (class14.field196 != var3) {
                    class117.field1977[class205.field3517] = -1;
                    class160.field2899[class205.field3517] = var2;
                    class205.field3517 = var3;
                }
            }
        }
        arg0.consume();
        field4409++;
    }

    @OriginalMember(owner = "client!wa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 152)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class50.field761 != null) {
            class98.field1587 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class317.field5432.length > var2) {
                var3 = class317.field5432[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class270.field4566 >= 0 && var3 >= 0) {
                class227.field3816[class270.field4566] = ~var3;
                class270.field4566 = class270.field4566 + 1 & 0x7F;
                if (class270.field4566 == class219.field3672) {
                    class270.field4566 = -1;
                }
            }
        }
        field4405++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!wa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 209)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4393++;
        if (class50.field761 != null) {
            class270.field4566 = -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)I", line = 226)
    public static final int method1775(byte arg0, int arg1) {
        int var2 = 0;
        field4397++;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 <= 35) {
            field4407 = true;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!wa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 304)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class50.field761 != null) {
            class98.field1587 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class317.field5432.length > var2) {
                var3 = class317.field5432[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class270.field4566 >= 0 && var3 >= 0) {
                class227.field3816[class270.field4566] = var3;
                class270.field4566 = class270.field4566 + 1 & 0x7F;
                if (class270.field4566 == class219.field3672) {
                    class270.field4566 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class205.field3517 + 1 & 0x7F;
                if (class14.field196 != var4) {
                    class117.field1977[class205.field3517] = var3;
                    class160.field2899[class205.field3517] = -1;
                    class205.field3517 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4410++;
    }
}
