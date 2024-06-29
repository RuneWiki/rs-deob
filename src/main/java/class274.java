import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class274 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[S")
    public static short[] field4279 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Lgd;")
    public static class325 field4284 = new class325(64);

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Lgd;")
    public static class325 field4290 = new class325(30);

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "[I")
    public static int[] field4291 = new int[100];

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[I")
    public static int[] field4294 = new int[1000];

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "[I")
    public static int[] field4293;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Lbi;", line = 11)
    public static final class91 method1947(int arg0) {
        if (arg0 < 96) {
            field4284 = (class325) null;
        }
        field4286++;
        return class322.field5049;
    }

    @OriginalMember(owner = "client!ik", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 23)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class243.field3645 != null) {
            class70.field1059 = 0;
            class183.field2887 = arg0.getX();
            class139.field2257 = arg0.getY();
            class220.field3435 = class212.method1543(22326);
            if (arg0.isMetaDown()) {
                class218.field3397 = 2;
                class327.field5114 = 2;
            } else {
                class218.field3397 = 1;
                class327.field5114 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4278++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 72)
    public static void method1948(boolean arg0) {
        field4293 = null;
        field4290 = null;
        field4284 = null;
        if (!arg0) {
            field4279 = null;
            field4294 = null;
            field4291 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BIII)I", line = 88)
    public static final int method1949(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field4274++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            int var5 = 120 % ((arg0 + 20) / 43);
            return var4 == 2 ? 7 - arg3 : arg1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILpk;Lpk;II)Lcm;", line = 109)
    public static final class205 method1950(int arg0, class120 arg1, class120 arg2, int arg3, int arg4) {
        field4287++;
        if (arg4 <= 4) {
            field4293 = (int[]) null;
        }
        return class107.method854(arg2, arg0, arg3, (byte) -36) ? class220.method1602((byte) 85, arg1.method967(arg3, arg0, 65280)) : null;
    }

    @OriginalMember(owner = "client!ik", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 124)
    public final void mouseClicked(MouseEvent arg0) {
        field4288++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ik", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 136)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class243.field3645 != null) {
            class327.field5114 = 0;
        }
        field4289++;
    }

    @OriginalMember(owner = "client!ik", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 147)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4273++;
        if (class243.field3645 != null) {
            class70.field1059 = 0;
            class45.field704 = arg0.getX();
            class13.field300 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ik", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4283++;
        if (class243.field3645 != null) {
            class70.field1059 = 0;
            class45.field704 = arg0.getX();
            class13.field300 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ik", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 180)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4285++;
        if (class243.field3645 != null) {
            class70.field1059 = 0;
            class45.field704 = -1;
            class13.field300 = -1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;)I", line = 197)
    public static final int method1951(int arg0, String arg1) {
        if (arg0 != -1) {
            method1952((byte) -53);
        }
        field4275++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!ik", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 211)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4282++;
        if (class243.field3645 != null) {
            class70.field1059 = 0;
            class45.field704 = arg0.getX();
            class13.field300 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 228)
    public static final void method1952(byte arg0) {
        field4280++;
        int var1 = -98 / ((arg0 - 42) / 63);
        for (class93 var2 = (class93) class143.field2320.method268(-1); var2 != null; var2 = (class93) class143.field2320.method278(1)) {
            class76 var3 = var2.field1520;
            if (class75.field1153 != var3.field1187 || var3.field1167) {
                var2.method489(false);
            } else if (class307.field4869 >= var3.field1175) {
                var3.method600(true, class137.field2241);
                if (var3.field1167) {
                    var2.method489(false);
                } else {
                    class149.method1132(var3.field1187, var3.field1190, var3.field1174, var3.field1177, 60, var3, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V", line = 264)
    public static final void method1953(boolean arg0) {
        class339 var1 = class24.field411;
        synchronized (class24.field411) {
            class321.field5030++;
            class110.field1790 = class151.field2491;
            if (class175.field2805 >= 0) {
                while (class78.field1224 != class175.field2805) {
                    int var2 = class284.field4438[class78.field1224];
                    class78.field1224 = class78.field1224 + 1 & 0x7F;
                    if (var2 < 0) {
                        class48.field737[~var2] = false;
                    } else {
                        class48.field737[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class48.field737[var3] = false;
                }
                class175.field2805 = class78.field1224;
            }
            if (!arg0) {
                method1951(83, (String) null);
            }
            class151.field2491 = class171.field2748;
        }
        field4277++;
    }

    @OriginalMember(owner = "client!ik", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 308)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class243.field3645 != null) {
            class70.field1059 = 0;
            class327.field5114 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4276++;
    }

    @OriginalMember(owner = "client!ik", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 342)
    public final void focusGained(FocusEvent arg0) {
        field4281++;
    }
}
