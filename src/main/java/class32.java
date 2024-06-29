import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class32 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lwa;")
    private static class75 field458 = class66.method560("Oct", false);

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lwa;")
    private static class75 field464 = class66.method560("May", false);

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field462 = -1;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[S")
    public static short[] field459 = new short[] { 42, 1, 6, 4, 34, 26, 8, 51 };

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lwa;")
    private static class75 field466 = class66.method560("Aug", false);

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lwa;")
    private static class75 field471 = class66.method560("Nov", false);

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lwa;")
    private static class75 field473 = class66.method560("Jul", false);

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lwa;")
    private static class75 field470 = class66.method560("Feb", false);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lwa;")
    private static class75 field460 = class66.method560("Dec", false);

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field472 = 0;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lwa;")
    public static class75 field457 = class66.method560("http:)4)4", false);

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "Lwa;")
    private static class75 field482 = class66.method560("Jan", false);

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lwa;")
    private static class75 field461 = class66.method560("Jun", false);

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Lwa;")
    private static class75 field478 = class66.method560("Sep", false);

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lwa;")
    private static class75 field469 = class66.method560("Apr", false);

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Lwa;")
    public static class75 field480 = class66.method560(" ", false);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lwa;")
    private static class75 field465 = class66.method560("Mar", false);

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[Lwa;")
    public static class75[] field476 = new class75[] { field482, field470, field465, field469, field464, field461, field473, field466, field478, field458, field471, field460 };

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)Z", line = 16)
    public static final boolean method212(int arg0, int arg1, int arg2, int arg3) {
        if (class3.method18(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class2.method9(var4 + 1, class53.field879[arg0][arg1][arg2] + arg3, var5 + 1) && class2.method9(var4 + 128 - 1, class53.field879[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class2.method9(var4 + 128 - 1, class53.field879[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class2.method9(var4 + 1, class53.field879[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[I[III)V", line = 31)
    public static final void method213(byte arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field477++;
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (arg1[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method213((byte) -98, arg1, arg2, arg3, var6 - 1);
            method213((byte) -107, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0 >= -87) {
            method214((class85) null, false);
        }
    }

    @OriginalMember(owner = "client!hb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 99)
    public final void keyTyped(KeyEvent arg0) {
        if (class13.field171 != null) {
            int var2 = class69.method585(arg0, (byte) 123);
            if (var2 >= 0) {
                int var3 = class265.field4576 + 1 & 0x7F;
                if (class190.field3172 != var3) {
                    class150.field2584[class265.field4576] = -1;
                    class19.field264[class265.field4576] = var2;
                    class265.field4576 = var3;
                }
            }
        }
        arg0.consume();
        field474++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lbb;Z)V", line = 145)
    public static final void method214(class85 arg0, boolean arg1) {
        long var2 = 0L;
        field481++;
        if (arg0.field1401 == 0) {
            var2 = class230.method1684(arg0.field1411, arg0.field1396, arg0.field1406);
        }
        if (arg0.field1401 == 1) {
            var2 = class237.method1720(arg0.field1411, arg0.field1396, arg0.field1406);
        }
        if (arg0.field1401 == 2) {
            var2 = class237.method1719(arg0.field1411, arg0.field1396, arg0.field1406);
        }
        if (arg0.field1401 == 3) {
            var2 = class196.method1463(arg0.field1411, arg0.field1396, arg0.field1406);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (!arg1) {
            method217(53, 37, false, -73);
        }
        if (var2 != 0L) {
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = ((int) var2 & 0x37F5EB) >> 20;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg0.field1395 = var4;
        arg0.field1402 = var6;
        arg0.field1405 = var5;
    }

    @OriginalMember(owner = "client!hb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 202)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class13.field171 != null) {
            class130.field2247 = -1;
        }
        field467++;
    }

    @OriginalMember(owner = "client!hb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 215)
    public final void focusGained(FocusEvent arg0) {
        field468++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 242)
    public static void method215(int arg0) {
        field458 = null;
        field480 = null;
        field459 = null;
        field476 = null;
        field482 = null;
        field457 = null;
        field461 = null;
        field460 = null;
        field478 = null;
        field473 = null;
        if (arg0 != 127) {
            field480 = (class75) null;
        }
        field466 = null;
        field469 = null;
        field471 = null;
        field470 = null;
        field464 = null;
        field465 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 288)
    public static final void method216(boolean arg0) {
        class153.field2633 = arg0;
        field479++;
    }

    @OriginalMember(owner = "client!hb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 300)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field475++;
        if (class13.field171 != null) {
            class145.field2499 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class299.field5098.length) {
                var3 = class299.field5098[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class130.field2247 >= 0 && var3 >= 0) {
                class97.field1602[class130.field2247] = ~var3;
                class130.field2247 = class130.field2247 + 1 & 0x7F;
                if (class178.field3007 == class130.field2247) {
                    class130.field2247 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!hb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 343)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field456++;
        if (class13.field171 == null) {
            return;
        }
        class145.field2499 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class299.field5098.length) {
            var3 = class299.field5098[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class130.field2247 >= 0 && var3 >= 0) {
            class97.field1602[class130.field2247] = var3;
            class130.field2247 = class130.field2247 + 1 & 0x7F;
            if (class178.field3007 == class130.field2247) {
                class130.field2247 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class265.field4576 + 1 & 0x7F;
            if (class190.field3172 != var4) {
                class150.field2584[class265.field4576] = var3;
                class19.field264[class265.field4576] = -1;
                class265.field4576 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZI)I", line = 439)
    public static final int method217(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg0 >> 7;
        field463++;
        if (!arg2) {
            return 115;
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class204.field3459[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var8) * class53.field879[var6][var4][var5 + 1] + class53.field879[var6][var4 + 1][var5 + 1] * var8 >> 7;
        int var10 = (128 - var8) * class53.field879[var6][var4][var5] + (class53.field879[var6][var4 + 1][var5] * var8) >> 7;
        return (128 - var7) * var10 + (var7 * var9) >> 7;
    }
}
