import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class178 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3126 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lv;")
    public static class147 field3120 = new class147(32);

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Leb;")
    public static class230 field3139 = class68.method589(0, "name_icons");

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field3138 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
    public static int[] field3137;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILfk;)Luj;")
    public static final class267 method1291(int arg0, class14 arg1) {
        if (arg0 == 0) {
            field3121++;
            return new class267(arg1.method178(-1), arg1.method178(-1), arg1.method178(-1), arg1.method178(-1), arg1.method190(-25267), arg1.method190(arg0 - 25267), arg1.method200(255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V")
    public static final void method1292(int arg0, byte arg1) {
        field3133++;
        if (!class202.method1422(arg0, true) || arg1 != 119) {
            return;
        }
        class245[] var2 = class99.field1839[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class245 var4 = var2[var3];
            if (var4 != null) {
                var4.field4271 = 0;
                var4.field4368 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3125++;
        if (class173.field3059 != null) {
            int var2 = class142.method1086(arg0, -1);
            if (var2 >= 0) {
                int var3 = class156.field2783 + 1 & 0x7F;
                if (class65.field1226 != var3) {
                    class141.field2535[class156.field2783] = -1;
                    class12.field240[class156.field2783] = var2;
                    class156.field2783 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!je", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class173.field3059 != null) {
            class24.field467 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class16.field363.length > var2) {
                var3 = class16.field363[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class183.field3192 >= 0 && var3 >= 0) {
                class213.field3697[class183.field3192] = ~var3;
                class183.field3192 = class183.field3192 + 1 & 0x7F;
                if (class264.field4685 == class183.field3192) {
                    class183.field3192 = -1;
                }
            }
        }
        field3122++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3130++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)V")
    public static final void method1293(byte arg0, int arg1) {
        field3128++;
        int var2 = 72 / ((arg0 - 29) / 55);
        class116.field2088.method1121(0, arg1);
        class46.field806.method1121(0, arg1);
        class213.field3686.method1121(0, arg1);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method1294(int arg0) {
        field3137 = null;
        field3139 = null;
        field3120 = null;
        if (arg0 < 41) {
            method1291(21, (class14) null);
        }
    }

    @OriginalMember(owner = "client!je", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3127++;
        if (class173.field3059 == null) {
            return;
        }
        class24.field467 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class16.field363.length) {
            var3 = class16.field363[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class183.field3192 >= 0 && var3 >= 0) {
            class213.field3697[class183.field3192] = var3;
            class183.field3192 = class183.field3192 + 1 & 0x7F;
            if (class264.field4685 == class183.field3192) {
                class183.field3192 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class156.field2783 + 1 & 0x7F;
            if (class65.field1226 != var4) {
                class141.field2535[class156.field2783] = var3;
                class12.field240[class156.field2783] = -1;
                class156.field2783 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3129++;
        if (class173.field3059 != null) {
            class183.field3192 = -1;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLtj;)V")
    public static final void method1295(byte arg0, class260 arg1) {
        int var2 = 17 / ((-arg0 - 6) / 55);
        field3132++;
        class66 var3 = (class66) class61.field1162.method394(arg1.field4620.method1587(60), -21083);
        if (var3 == null) {
            return;
        }
        if (var3.field1235 != null) {
            class117.field2096.method1682(var3.field1235);
            var3.field1235 = null;
        }
        var3.method518(117);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)I")
    public static final int method1296(int arg0) {
        field3134++;
        if (arg0 != 10) {
            method1297(107, 101, -83);
        }
        return class264.field4693;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)J")
    public static final long method1297(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4058; var4++) {
            class111 var5 = var3.field4050[var4];
            if ((var5.field2001 >> 29 & 0x3L) == 2L && var5.field1988 == arg1 && var5.field1994 == arg2) {
                return var5.field2001;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLkk;II)[Leh;")
    public static final class80[] method1298(byte arg0, class223 arg1, int arg2, int arg3) {
        field3124++;
        if (arg0 == -84) {
            return class205.method1440(arg2, arg3, arg0 + 86, arg1) ? class98.method840(arg0 + 85) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwa;")
    public static final class246 method1299(Throwable arg0, String arg1) {
        field3135++;
        class246 var2;
        if ((arg0 instanceof class246)) {
            var2 = (class246) arg0;
            var2.field4371 = var2.field4371 + ' ' + arg1;
        } else {
            var2 = new class246(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    public static final void method1300(int arg0, int arg1) {
        if (arg0 < 36) {
            field3137 = null;
        }
        class24 var2 = class22.field431;
        synchronized (class22.field431) {
            class264.field4693 = arg1;
        }
        field3131++;
    }
}
