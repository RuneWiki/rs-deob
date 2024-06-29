import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class13 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "Lua;")
    public static class41 field121 = class16.method86("Switch to ", true);

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "Lua;")
    public static class41 field123 = class16.method86("Spice Shop", true);

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "Lua;")
    public static class41 field124 = class16.method86("Silk Trader", true);

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "Lua;")
    public static class41 field125 = class16.method86("100(U", true);

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "I")
    public static int originX;

    @OriginalMember(owner = "mapview!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 20)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class17.field145 != null) {
            class3.field53 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Lua;BLua;Lw;)[Lba;", line = 52)
    public static final class5[] method74(class41 arg0, byte arg1, class41 arg2, class43 arg3) {
        if (arg1 < 125) {
            originX = -17;
        }
        int var4 = arg3.method256(arg0, -73);
        int var5 = arg3.method264(arg2, 868, var4);
        return class19.method103(var5, var4, 0, arg3);
    }

    @OriginalMember(owner = "mapview!ga", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 64)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class17.field145 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class1.field8.length > var2) {
            var3 = class1.field8[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class3.field53 >= 0 && var3 >= 0) {
            class16.field136[class3.field53] = var3;
            class3.field53 = class3.field53 + 1 & 0x7F;
            if (class3.field55 == class3.field53) {
                class3.field53 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = mapview.field298 + 1 & 0x7F;
            if (class32.field415 != var4) {
                class41.field505[mapview.field298] = var3;
                class36.field447[mapview.field298] = -1;
                mapview.field298 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([BBI)I", line = 135)
    public static final int method75(byte[] arg0, byte arg1, int arg2) {
        if (arg1 != 13) {
            method77((byte) 59);
        }
        return class31.method192(0, arg0, -32607, arg2);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IIIIII[III[B)V", line = 147)
    public static final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, byte[] arg9) {
        int var10 = -(arg4 >> 2);
        if (arg0 != 0) {
            method74(null, (byte) 111, null, null);
        }
        int var11 = -(arg4 & 0x3);
        for (int var12 = -arg1; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg9[arg8++] == 0) {
                    arg7++;
                } else {
                    arg6[arg7++] = arg3;
                }
                if (arg9[arg8++] == 0) {
                    arg7++;
                } else {
                    arg6[arg7++] = arg3;
                }
                if (arg9[arg8++] == 0) {
                    arg7++;
                } else {
                    arg6[arg7++] = arg3;
                }
                if (arg9[arg8++] == 0) {
                    arg7++;
                } else {
                    arg6[arg7++] = arg3;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg9[arg8++] == 0) {
                    arg7++;
                } else {
                    arg6[arg7++] = arg3;
                }
            }
            arg7 += arg5;
            arg8 += arg2;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 211)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(B)V", line = 222)
    public static void method77(byte arg0) {
        field125 = null;
        field121 = null;
        field123 = null;
        field124 = null;
        if (arg0 != -18) {
            originX = 48;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 260)
    public static final void method78(Component arg0, int arg1) {
        Method var2 = class30.field399;
        if (arg1 != 16495) {
            return;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class17.field145);
        arg0.addFocusListener(class17.field145);
    }

    @OriginalMember(owner = "mapview!ga", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 281)
    public final void keyTyped(KeyEvent arg0) {
        if (class17.field145 != null) {
            int var2 = class35.method199(-21050, arg0);
            if (var2 >= 0) {
                int var3 = mapview.field298 + 1 & 0x7F;
                if (class32.field415 != var3) {
                    class41.field505[mapview.field298] = -1;
                    class36.field447[mapview.field298] = var2;
                    mapview.field298 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ga", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 348)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class17.field145 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class1.field8.length) {
                var3 = class1.field8[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class3.field53 >= 0 && var3 >= 0) {
                class16.field136[class3.field53] = ~var3;
                class3.field53 = class3.field53 + 1 & 0x7F;
                if (class3.field55 == class3.field53) {
                    class3.field53 = -1;
                }
            }
        }
        arg0.consume();
    }
}
