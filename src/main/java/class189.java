import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class189 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field3284 = 0;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
    public static int[] field3287 = new int[2000];

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field3286 = 0;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Ls;")
    public static class261 field3288 = new class261(50);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[I")
    public static int[] field3283;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1267(int arg0) {
        field3282++;
        if (!class117.method702(true) && class281.field4855 != class133.field2315) {
            class171.method1148(class163.field2796.field450[0], class163.field2796.field422[0], class133.field2315, arg0 - 5, class164.field2825, class51.field1010, false);
            return;
        }
        if (class228.field3971 != class133.field2315) {
            class228.field3971 = class133.field2315;
            class66.method446(103, class133.field2315);
            class152.method1014(0);
        }
        if (arg0 != 127) {
            field3283 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lsb;", line = 43)
    public static final class104 method1268(Throwable arg0, String arg1) {
        field3279++;
        class104 var2;
        if ((arg0 instanceof class104)) {
            var2 = (class104) arg0;
            var2.field1792 = var2.field1792 + ' ' + arg1;
        } else {
            var2 = new class104(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 67)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3281++;
        if (class210.field3715 != null) {
            class222.field3901 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class147.field2513.length > var2) {
                var3 = class147.field2513[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field3286 >= 0 && var3 >= 0) {
                class303.field5133[field3286] = ~var3;
                field3286 = field3286 + 1 & 0x7F;
                if (field3286 == class139.field2373) {
                    field3286 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V", line = 98)
    public static final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3278++;
        int var8 = arg6 + arg7;
        int var9 = arg1 + arg7;
        int var10 = arg2 - arg7;
        int var11 = arg3 - arg7;
        int var12 = -75 / ((arg5 + 48) / 44);
        for (int var13 = arg6; var13 < var8; var13++) {
            class314.method2138(arg3, true, arg0, class219.field3850[var13], arg1);
        }
        for (int var14 = arg2; var14 > var10; var14--) {
            class314.method2138(arg3, true, arg0, class219.field3850[var14], arg1);
        }
        for (int var15 = var8; var15 <= var10; var15++) {
            int[] var16 = class219.field3850[var15];
            class314.method2138(var9, true, arg0, var16, arg1);
            class314.method2138(var11, true, arg4, var16, var9);
            class314.method2138(arg3, true, arg0, var16, var11);
        }
    }

    @OriginalMember(owner = "client!fh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 143)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class210.field3715 != null) {
            class222.field3901 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class147.field2513.length) {
                var3 = class147.field2513[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (field3286 >= 0 && var3 >= 0) {
                class303.field5133[field3286] = var3;
                field3286 = field3286 + 1 & 0x7F;
                if (field3286 == class139.field2373) {
                    field3286 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class66.field1274 + 1 & 0x7F;
                if (class130.field2270 != var4) {
                    class62.field1174[class66.field1274] = var3;
                    class205.field3617[class66.field1274] = -1;
                    class66.field1274 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3280++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 201)
    private static final int method1270(KeyEvent arg0, int arg1) {
        if (arg1 != -86) {
            return 52;
        }
        int var2 = arg0.getKeyChar();
        field3292++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 235)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3291++;
        if (class210.field3715 != null) {
            field3286 = -1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 297)
    public static void method1271(byte arg0) {
        field3287 = null;
        field3283 = null;
        field3288 = null;
        if (arg0 != 0) {
            field3287 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 332)
    public final void focusGained(FocusEvent arg0) {
        field3285++;
    }

    @OriginalMember(owner = "client!fh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 340)
    public final void keyTyped(KeyEvent arg0) {
        if (class210.field3715 != null) {
            int var2 = method1270(arg0, -86);
            if (var2 >= 0) {
                int var3 = class66.field1274 + 1 & 0x7F;
                if (class130.field2270 != var3) {
                    class62.field1174[class66.field1274] = -1;
                    class205.field3617[class66.field1274] = var2;
                    class66.field1274 = var3;
                }
            }
        }
        arg0.consume();
        field3290++;
    }
}
