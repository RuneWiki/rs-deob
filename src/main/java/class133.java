import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class133 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lad;")
    public static class5 field3213 = class88.method674("(X", -62);

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lad;")
    private static class5 field3211 = class88.method674("Loaded textures", 44);

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lad;")
    private static class5 field3212 = class88.method674("Login server offline)3", -105);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lad;")
    public static class5 field3208 = field3211;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[I")
    public static int[] field3217 = new int[128];

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lad;")
    public static class5 field3210 = field3212;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lad;")
    private static class5 field3219 = class88.method674("Moderator option: Mute player for 48 hours: <ON>", -62);

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lad;")
    public static class5 field3218 = field3219;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field3207;

    @OriginalMember(owner = "client!wb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 5)
    public final void keyTyped(KeyEvent arg0) {
        field3222++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 22)
    public static void method1026(byte arg0) {
        field3208 = null;
        field3211 = null;
        field3218 = null;
        field3207 = null;
        field3210 = null;
        field3219 = null;
        if (arg0 != 59) {
            field3212 = null;
        }
        field3217 = null;
        field3213 = null;
        field3212 = null;
    }

    @OriginalMember(owner = "client!wb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 91)
    public final void focusGained(FocusEvent arg0) {
        field3214++;
    }

    @OriginalMember(owner = "client!wb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 101)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class5.field209 != null) {
            class19.field523 = -1;
        }
        field3224++;
    }

    @OriginalMember(owner = "client!wb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 126)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3221++;
        if (class5.field209 != null) {
            class18.field474 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class60.field1466.length > var2) {
                var3 = class60.field1466[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class19.field523 >= 0 && var3 >= 0) {
                class23.field599[class19.field523] = ~var3;
                class19.field523 = class19.field523 + 1 & 0x7F;
                if (class54.field1354 == class19.field523) {
                    class19.field523 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIB)V", line = 156)
    public static final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != -89) {
            method1028(null, 10);
        }
        field3209++;
        if (arg3 < 1 || arg5 < 1 || arg3 > 102 || arg5 > 102) {
            return;
        }
        if (class40.field1048 && class54.field1344 != arg4) {
            return;
        }
        int var8 = 0;
        if (arg6 == 0) {
            var8 = class42.field1065.method776(arg4, arg3, arg5);
        }
        if (arg6 == 1) {
            var8 = class42.field1065.method741(arg4, arg3, arg5);
        }
        if (arg6 == 2) {
            var8 = class42.field1065.method780(arg4, arg3, arg5);
        }
        boolean var9 = true;
        if (arg6 == 3) {
            var8 = class42.field1065.method772(arg4, arg3, arg5);
        }
        boolean var10 = false;
        boolean var11 = false;
        if (var8 != 0) {
            int var12 = class42.field1065.method756(arg4, arg3, arg5, var8);
            int var13 = var12 >> 6 & 0x3;
            int var14 = var12 & 0x1F;
            int var15 = var8 >> 14 & 0x7FFF;
            if (arg6 == 0) {
                class42.field1065.method784(arg4, arg3, arg5);
                class70 var16 = class42.method357(var15, (byte) -42);
                if (var16.field1668) {
                    class13.field387[arg4].method466(var16.field1685, arg5, arg3, var13, -1, var14);
                }
            }
            if (arg6 == 1) {
                class42.field1065.method765(arg4, arg3, arg5);
            }
            if (arg6 == 2) {
                class42.field1065.method788(arg4, arg3, arg5);
                class70 var17 = class42.method357(var15, (byte) -42);
                if (var17.field1705 + arg3 > 103 || var17.field1705 + arg5 > 103 || var17.field1693 + arg3 > 103 || arg5 + var17.field1693 > 103) {
                    return;
                }
                if (var17.field1668) {
                    class13.field387[arg4].method470(var13, var17.field1685, arg5, var17.field1693, 18344, var17.field1705, arg3);
                }
            }
            if (arg6 == 3) {
                class42.field1065.method753(arg4, arg3, arg5);
                class70 var18 = class42.method357(var15, (byte) -42);
                if (var18.field1668 && var18.field1667 == 1) {
                    class13.field387[arg4].method477(arg3, (byte) 107, arg5);
                }
            }
        }
        if (arg1 < 0) {
            return;
        }
        int var19 = arg4;
        if (arg4 < 3 && (class12.field371[1][arg3][arg5] & 0x2) == 2) {
            var19 = arg4 + 1;
        }
        class79.method615(arg1, class13.field387[arg4], arg3, 512, arg5, class42.field1065, var19, arg0, arg4, arg2);
        return;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lad;I)Z", line = 258)
    public static final boolean method1028(class5 arg0, int arg1) {
        field3223++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class100.field2437; var2++) {
            if (arg0.method75(false, class21.field543[var2])) {
                return true;
            }
        }
        return arg0.method75(false, class82.field1932.field2801);
    }

    @OriginalMember(owner = "client!wb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 341)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class5.field209 != null) {
            class18.field474 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class60.field1466.length > var2) {
                var3 = class60.field1466[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class30.method246(arg0, 0);
            }
            if (class19.field523 >= 0 && var3 >= 0) {
                class23.field599[class19.field523] = var3;
                class19.field523 = class19.field523 + 1 & 0x7F;
                if (class54.field1354 == class19.field523) {
                    class19.field523 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class120.field2972 + 1 & 0x7F;
                if (class27.field713 != var5) {
                    class96.field2288[class120.field2972] = var3;
                    field3217[class120.field2972] = var4;
                    class120.field2972 = var5;
                }
            }
        }
        arg0.consume();
        field3215++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 413)
    public static final void method1029(int arg0) {
        field3216++;
        class70.field1653.method101((byte) -127);
        if (arg0 != -2080) {
            method1027(120, -67, -100, 96, 55, 35, 69, (byte) -94);
        }
    }
}
