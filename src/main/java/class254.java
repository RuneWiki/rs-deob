import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class254 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lud;")
    public static class279 field4531 = class130.method1024("(Y<)4col>", 255);

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lud;")
    private static class279 field4539 = class130.method1024("flash1:", 255);

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lud;")
    public static class279 field4541 = field4539;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lud;")
    public static class279 field4540 = class130.method1024("Textures charg-Bes", 255);

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lud;")
    public static class279 field4543 = field4539;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZJ)Lud;", line = 6)
    public static final class279 method1816(boolean arg0, long arg1) {
        if (!arg0) {
            method1818((byte) -110);
        }
        field4542++;
        return class315.method2233(10, arg1, false, 1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 19)
    public static final void method1817(int arg0, int arg1, int arg2) {
        field4537++;
        class268.field4809 = class309.field5482[arg1][arg2].field2609;
        class245.field4350 = class309.field5482[arg1][arg2].field2617;
        class192.field3471 = class309.field5482[arg1][arg2].field2615;
        if (arg0 <= -38) {
            class219.method1600((float) class268.field4809, (float) class245.field4350, (float) class192.field3471);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 36)
    public static void method1818(byte arg0) {
        int var1 = 25 / ((-arg0 - 51) / 54);
        field4539 = null;
        field4531 = null;
        field4540 = null;
        field4541 = null;
        field4543 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIFIIIZI)[[I", line = 66)
    public static final int[][] method1819(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field4535++;
        class214 var9 = new class214();
        int[][] var10 = new int[arg0][arg8];
        if (arg6 < 100) {
            return (int[][]) ((int[][]) null);
        }
        var9.field3771 = (int) (arg3 * 4096.0F);
        var9.field3757 = arg5;
        var9.field3768 = arg1;
        var9.field3767 = arg2;
        var9.field3770 = arg7;
        var9.method627(7);
        class163.method1281(true, arg0, arg8);
        for (int var11 = 0; var11 < arg0; var11++) {
            var9.method1571(var11, -16421, var10[var11]);
        }
        return var10;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lgf;I)Z", line = 128)
    public static final boolean method1820(class8 arg0, int arg1) {
        field4545++;
        if (arg0.field171 == null) {
            return false;
        } else if (arg1 == -4) {
            for (int var2 = 0; var2 < arg0.field171.length; var2++) {
                int var3 = class44.method382(arg0, var2, -2148);
                int var4 = arg0.field239[var2];
                if (arg0.field171[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg0.field171[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg0.field171[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 205)
    public final void keyTyped(KeyEvent arg0) {
        if (class101.field1892 != null) {
            int var2 = class161.method1275(arg0, (byte) 69);
            if (var2 >= 0) {
                int var3 = class238.field4174 + 1 & 0x7F;
                if (class110.field2032 != var3) {
                    class233.field4080[class238.field4174] = -1;
                    class195.field3521[class238.field4174] = var2;
                    class238.field4174 = var3;
                }
            }
        }
        field4536++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!tf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 237)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4538++;
        if (class101.field1892 == null) {
            return;
        }
        class260.field4619 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class16.field514.length) {
            var3 = class16.field514[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class262.field4664 >= 0 && var3 >= 0) {
            class31.field720[class262.field4664] = var3;
            class262.field4664 = class262.field4664 + 1 & 0x7F;
            if (class262.field4664 == class221.field3907) {
                class262.field4664 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class238.field4174 + 1 & 0x7F;
            if (class110.field2032 != var4) {
                class233.field4080[class238.field4174] = var3;
                class195.field3521[class238.field4174] = -1;
                class238.field4174 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 297)
    public final void focusGained(FocusEvent arg0) {
        field4534++;
    }

    @OriginalMember(owner = "client!tf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 314)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4532++;
        if (class101.field1892 != null) {
            class260.field4619 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class16.field514.length > var2) {
                var3 = class16.field514[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class262.field4664 >= 0 && var3 >= 0) {
                class31.field720[class262.field4664] = ~var3;
                class262.field4664 = class262.field4664 + 1 & 0x7F;
                if (class262.field4664 == class221.field3907) {
                    class262.field4664 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!tf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 347)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class101.field1892 != null) {
            class262.field4664 = -1;
        }
        field4544++;
    }
}
