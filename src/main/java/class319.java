import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class319 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[Lp;")
    public static class107[] field4898 = new class107[2048];

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Ldh;")
    public static class179 field4897 = new class179(20);

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4910 = new String[5];

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
    public static int[] field4908 = new int[32];

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ltk;I)V", line = 8)
    public static final void method2223(class265 arg0, int arg1) {
        field4896++;
        class51 var2 = null;
        try {
            class18 var3 = arg0.method1921(arg1 ^ 0x5F44, "runescape");
            if (arg1 != 24398) {
                method2226((byte) -93, (String) null, (char) 65532);
            }
            while (var3.field238 == 0) {
                class81.method485(1L, arg1 ^ 0x5F4F);
            }
            if (var3.field238 == 1) {
                var2 = (class51) var3.field241;
                class107 var4 = class9.method47(-10294);
                var2.method313((byte) -74, var4.field1388, 0, var4.field1400);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method316(1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 45)
    public static void method2224(byte arg0) {
        field4910 = null;
        field4898 = null;
        if (arg0 >= 93) {
            field4908 = null;
            field4897 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 61)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4904++;
        if (class138.field1928 != null) {
            class233.field3395 = -1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 78)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4900++;
        if (class138.field1928 == null) {
            return;
        }
        class43.field509 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class41.field486.length) {
            var3 = class41.field486[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class233.field3395 >= 0 && var3 >= 0) {
            class217.field3057[class233.field3395] = var3;
            class233.field3395 = class233.field3395 + 1 & 0x7F;
            if (class90.field1127 == class233.field3395) {
                class233.field3395 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class166.field2292 + 1 & 0x7F;
            if (class325.field4982 != var4) {
                class326.field4991[class166.field2292] = var3;
                class216.field3039[class166.field2292] = '\u0000';
                class166.field2292 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILlc;I)Lhi;", line = 140)
    public static final class307 method2225(int arg0, class175 arg1, int arg2) {
        if (arg0 <= 75) {
            return (class307) null;
        } else {
            field4899++;
            return class115.method786(arg2, 114, arg1) ? class342.method2368((byte) 47) : null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;", line = 160)
    public static final String[] method2226(byte arg0, String arg1, char arg2) {
        field4903++;
        int var3 = -79 / ((arg0 - 48) / 58);
        int var4 = class59.method342(arg2, -6347, arg1);
        String[] var5 = new String[var4 + 1];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var4; var8++) {
            int var9;
            for (var9 = var6; arg2 != arg1.charAt(var9); var9++) {
            }
            var5[var7++] = arg1.substring(var6, var9);
            var6 = var9 + 1;
        }
        var5[var4] = arg1.substring(var6);
        return var5;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V", line = 195)
    public static final void method2227(int arg0, int arg1) {
        field4905++;
        class55.method330(true);
        class217.method1501((byte) 98);
        int var2 = class221.method1519((byte) 81, arg0).field3477;
        if (var2 == 0) {
            return;
        }
        int var3 = class226.field3235[arg0];
        if (var2 == 6) {
            class134.field1847 = var3;
        }
        if (var2 == 5) {
            class58.field698 = var3;
        }
        if (var2 == 9) {
            class165.field2277 = var3;
        }
        if (arg1 != -2708) {
            field4902 = -118;
        }
    }

    @OriginalMember(owner = "client!hk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 227)
    public final void focusGained(FocusEvent arg0) {
        field4901++;
    }

    @OriginalMember(owner = "client!hk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 234)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class138.field1928 != null) {
            class43.field509 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class41.field486.length > var2) {
                var3 = class41.field486[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class233.field3395 >= 0 && var3 >= 0) {
                class217.field3057[class233.field3395] = ~var3;
                class233.field3395 = class233.field3395 + 1 & 0x7F;
                if (class90.field1127 == class233.field3395) {
                    class233.field3395 = -1;
                }
            }
        }
        field4895++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBII)V", line = 265)
    public static final void method2228(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (class248.field3759 >= arg5 && arg2 >= class272.field4273) {
            boolean var6;
            if (arg1 < class109.field1494) {
                arg1 = class109.field1494;
                var6 = false;
            } else if (arg1 <= class56.field678) {
                var6 = true;
            } else {
                var6 = false;
                arg1 = class56.field678;
            }
            boolean var7;
            if (arg0 < class109.field1494) {
                var7 = false;
                arg0 = class109.field1494;
            } else if (arg0 > class56.field678) {
                arg0 = class56.field678;
                var7 = false;
            } else {
                var7 = true;
            }
            if (class272.field4273 <= arg5) {
                class279.method1997(arg0, -824384948, arg1, arg4, class206.field2886[arg5++]);
            } else {
                arg5 = class272.field4273;
            }
            if (arg2 > class248.field3759) {
                arg2 = class248.field3759;
            } else {
                class279.method1997(arg0, -824384948, arg1, arg4, class206.field2886[arg2--]);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg2; var8++) {
                    int[] var9 = class206.field2886[var8];
                    var9[arg1] = var9[arg0] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg2; var11++) {
                    class206.field2886[var11][arg1] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg2; var10++) {
                    class206.field2886[var10][arg0] = arg4;
                }
            }
        }
        if (arg3 != 119) {
            method2227(-85, -23);
        }
        field4907++;
    }

    @OriginalMember(owner = "client!hk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 370)
    public final void keyTyped(KeyEvent arg0) {
        field4909++;
        if (class138.field1928 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class262.method1884(var2, true)) {
                int var3 = class166.field2292 + 1 & 0x7F;
                if (class325.field4982 != var3) {
                    class326.field4991[class166.field2292] = -1;
                    class216.field3039[class166.field2292] = var2;
                    class166.field2292 = var3;
                }
            }
        }
        arg0.consume();
    }
}
