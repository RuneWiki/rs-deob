import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class97 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lfg;")
    public static class203 field1672 = new class203();

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "S")
    public static short field1679 = 32767;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lve;")
    public static class255 field1678 = class87.method607(97, "(U2");

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[I")
    public static int[] field1682 = new int[100];

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "F")
    public static float field1683;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "J")
    public static long field1681;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lrg;")
    public static class88 field1675;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Ljava/lang/Thread;")
    public static Thread field1680;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 12)
    public static void method764(int arg0) {
        field1675 = null;
        field1680 = null;
        field1682 = null;
        field1672 = null;
        field1678 = null;
        if (arg0 != 2) {
            field1683 = -0.35917696F;
        }
    }

    @OriginalMember(owner = "client!mb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 38)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1676++;
        if (class60.field917 == null) {
            return;
        }
        class32.field515 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class155.field2647.length) {
            var3 = class155.field2647[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class82.field1333 >= 0 && var3 >= 0) {
            class309.field5268[class82.field1333] = var3;
            class82.field1333 = class82.field1333 + 1 & 0x7F;
            if (class82.field1333 == class100.field1699) {
                class82.field1333 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class115.field1957 + 1 & 0x7F;
            if (class197.field3354 != var4) {
                class289.field4967[class115.field1957] = var3;
                class7.field109[class115.field1957] = -1;
                class115.field1957 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[I[J)V", line = 98)
    public static final void method765(byte arg0, int[] arg1, long[] arg2) {
        if (arg0 != 40) {
            method768(31, -118, -5);
        }
        field1671++;
        class37.method224(arg2, arg2.length - 1, arg0 ^ 0x62, arg1, 0);
    }

    @OriginalMember(owner = "client!mb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 118)
    public final void focusGained(FocusEvent arg0) {
        field1670++;
    }

    @OriginalMember(owner = "client!mb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 145)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1677++;
        if (class60.field917 != null) {
            class82.field1333 = -1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Ldd;", line = 175)
    public static final class238 method766(int arg0) {
        field1669++;
        if (class116.field1972 >= class242.field4047.length) {
            return arg0 == 4 ? null : (class238) null;
        } else {
            return class242.field4047[class116.field1972++];
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ltl;ZBII)V", line = 194)
    public static final void method767(class197 arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field1668++;
        if (arg2 != 10) {
            field1672 = (class203) null;
        }
        int var5 = arg0.field3294;
        int var6 = arg0.field3253;
        if (arg0.field3341 == 0) {
            arg0.field3253 = arg0.field3303;
        } else if (arg0.field3341 == 1) {
            arg0.field3253 = arg4 - arg0.field3303;
        } else if (arg0.field3341 == 2) {
            arg0.field3253 = arg0.field3303 * arg4 >> 14;
        } else if (arg0.field3341 == 3) {
            if (arg0.field3281 == 2) {
                arg0.field3253 = arg0.field3303 * 32 + ((arg0.field3303 - 1) * arg0.field3267);
            } else if (arg0.field3281 == 7) {
                arg0.field3253 = arg0.field3303 * 12 + ((arg0.field3303 - 1) * arg0.field3267);
            }
        }
        if (arg0.field3292 == 0) {
            arg0.field3294 = arg0.field3343;
        } else if (arg0.field3292 == 1) {
            arg0.field3294 = arg3 - arg0.field3343;
        } else if (arg0.field3292 == 2) {
            arg0.field3294 = arg0.field3343 * arg3 >> 14;
        } else if (arg0.field3292 == 3) {
            if (arg0.field3281 == 2) {
                arg0.field3294 = (arg0.field3343 - 1) * arg0.field3362 + arg0.field3343 * 32;
            } else if (arg0.field3281 == 7) {
                arg0.field3294 = (arg0.field3343 - 1) * arg0.field3362 + arg0.field3343 * 115;
            }
        }
        if (arg0.field3292 == 4) {
            arg0.field3294 = arg0.field3253 * arg0.field3246 / arg0.field3286;
        }
        if (arg0.field3341 == 4) {
            arg0.field3253 = arg0.field3294 * arg0.field3286 / arg0.field3246;
        }
        if (class198.field3421 && (client.method1673(arg0) != 0 || arg0.field3281 == 0)) {
            if (arg0.field3253 < 5 && arg0.field3294 < 5) {
                arg0.field3253 = 5;
                arg0.field3294 = 5;
            } else {
                if (arg0.field3253 <= 0) {
                    arg0.field3253 = 5;
                }
                if (arg0.field3294 <= 0) {
                    arg0.field3294 = 5;
                }
            }
        }
        if (arg0.field3392 == 1337) {
            class288.field4961 = arg0;
        }
        if (arg1 && arg0.field3410 != null && (arg0.field3294 != var5 || arg0.field3253 != var6)) {
            class26 var7 = new class26();
            var7.field414 = arg0.field3410;
            var7.field424 = arg0;
            class151.field2562.method1472(true, var7);
        }
    }

    @OriginalMember(owner = "client!mb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 302)
    public final void keyTyped(KeyEvent arg0) {
        field1673++;
        if (class60.field917 != null) {
            int var2 = class72.method523(0, arg0);
            if (var2 >= 0) {
                int var3 = class115.field1957 + 1 & 0x7F;
                if (class197.field3354 != var3) {
                    class289.field4967[class115.field1957] = -1;
                    class7.field109[class115.field1957] = var2;
                    class115.field1957 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!mb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 372)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class60.field917 != null) {
            class32.field515 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class155.field2647.length > var2) {
                var3 = class155.field2647[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class82.field1333 >= 0 && var3 >= 0) {
                class309.field5268[class82.field1333] = ~var3;
                class82.field1333 = class82.field1333 + 1 & 0x7F;
                if (class82.field1333 == class100.field1699) {
                    class82.field1333 = -1;
                }
            }
        }
        field1674++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z", line = 405)
    public static final boolean method768(int arg0, int arg1, int arg2) {
        int var3 = class38.field585[arg0][arg1][arg2];
        if (-class54.field857 == var3) {
            return false;
        } else if (class54.field857 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class222.method1557(var4 + 1, class106.field1783[arg0][arg1][arg2], var5 + 1) && class222.method1557(var4 + 128 - 1, class106.field1783[arg0][arg1 + 1][arg2], var5 + 1) && class222.method1557(var4 + 128 - 1, class106.field1783[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class222.method1557(var4 + 1, class106.field1783[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class38.field585[arg0][arg1][arg2] = class54.field857;
                return true;
            } else {
                class38.field585[arg0][arg1][arg2] = -class54.field857;
                return false;
            }
        }
    }
}
