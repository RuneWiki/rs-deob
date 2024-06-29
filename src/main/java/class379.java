import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class379 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field5569 = -1;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5573 = new String[100];

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
    public static int[] field5577 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Z")
    public static boolean field5570;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "[[[Ldn;")
    public static class302[][][] field5582;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILmg;II)V", line = 4)
    public static final void method2407(int arg0, int arg1, int arg2, class81 arg3, int arg4, int arg5) {
        field5578++;
        if (arg3.field915 == -1 && arg3.field910 == null) {
            return;
        }
        int var6 = 0;
        if (arg3.field918 < arg5) {
            var6 += arg5 - arg3.field918;
        } else if (arg5 < arg3.field911) {
            var6 += arg3.field911 - arg5;
        }
        int var7 = class308.field4405 * arg3.field905 >> 8;
        if (arg2 > arg3.field904) {
            var6 += arg2 - arg3.field904;
        } else if (arg2 < arg3.field902) {
            var6 += arg3.field902 - arg2;
        }
        if (arg3.field907 == 0 || var6 - 64 > arg3.field907 || class308.field4405 == 0 || arg3.field929 != arg0) {
            if (arg3.field909 != null) {
                class135.field1884.method2807(arg3.field909);
                arg3.field909 = null;
            }
            if (arg3.field926 != null) {
                class135.field1884.method2807(arg3.field926);
                arg3.field926 = null;
            }
            return;
        }
        if (arg4 != 2) {
            field5573 = null;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field907 - var6) * var7 / arg3.field907;
        if (arg3.field909 != null) {
            arg3.field909.method2451(var8);
        } else if (arg3.field915 >= 0) {
            class46 var9 = class46.method291(class151.field2113, arg3.field915, 0);
            if (var9 != null) {
                class177 var10 = var9.method289().method1165(class206.field2802);
                class380 var11 = class380.method2436(var10, 100, var8);
                var11.method2442(-1);
                class135.field1884.method2810(var11);
                arg3.field909 = var11;
            }
        }
        if (arg3.field926 != null) {
            arg3.field926.method2451(var8);
            if (arg3.field926.method2289(109)) {
                return;
            }
            arg3.field926 = null;
        } else if (arg3.field910 != null && (arg3.field908 -= arg1) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field910.length);
            class46 var13 = class46.method291(class151.field2113, arg3.field910[var12], 0);
            if (var13 != null) {
                class177 var14 = var13.method289().method1165(class206.field2802);
                class380 var15 = class380.method2436(var14, 100, var8);
                var15.method2442(0);
                class135.field1884.method2810(var15);
                arg3.field926 = var15;
                arg3.field908 = arg3.field928 + ((int) (Math.random() * (double) (arg3.field921 - arg3.field928)));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 129)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class343.field5050 != null) {
            class109.field1254 = 0;
            class271.field3843 = arg0.getX();
            class168.field2349 = arg0.getY();
        }
        field5576++;
    }

    @OriginalMember(owner = "client!jk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 146)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class343.field5050 != null) {
            class109.field1254 = 0;
            class66.field748 = 0;
            int var2 = arg0.getModifiers();
        }
        field5566++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIII)V", line = 179)
    public static final void method2408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= class143.field2029 && class128.field1785 >= arg7 && arg2 >= class20.field209 && arg5 <= class407.field5914) {
            class223.method1447(arg0, arg3, 2, arg4, arg5, arg7, arg1, arg2);
        } else {
            class134.method799(arg5, arg2, arg7, (byte) 116, arg0, arg1, arg3, arg4);
        }
        if (arg6 >= -120) {
            field5570 = true;
        }
        field5580++;
    }

    @OriginalMember(owner = "client!jk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 197)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5572++;
    }

    @OriginalMember(owner = "client!jk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 208)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5568++;
        if (class343.field5050 != null) {
            class109.field1254 = 0;
            class271.field3843 = arg0.getX();
            class168.field2349 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 225)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5567++;
        if (class343.field5050 != null) {
            class109.field1254 = 0;
            class271.field3843 = arg0.getX();
            class168.field2349 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 243)
    public final void focusGained(FocusEvent arg0) {
        field5565++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V", line = 251)
    public static final void method2409(int arg0, int arg1) {
        class331 var2 = class350.field5107;
        synchronized (class350.field5107) {
            class350.field5107.method2054(97, arg1);
        }
        field5579++;
        if (arg0 != 1) {
            field5570 = true;
        }
        class331 var3 = class422.field6060;
        synchronized (class422.field6060) {
            class422.field6060.method2054(97, arg1);
        }
    }

    @OriginalMember(owner = "client!jk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 272)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5574++;
        if (class343.field5050 != null) {
            class109.field1254 = 0;
            class271.field3843 = -1;
            class168.field2349 = -1;
        }
    }

    @OriginalMember(owner = "client!jk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 292)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5571++;
        if (class343.field5050 != null) {
            class66.field748 = 0;
        }
    }

    @OriginalMember(owner = "client!jk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 305)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5581++;
        if (class343.field5050 != null) {
            class109.field1254 = 0;
            class150.field2102 = arg0.getX();
            client.field2297 = arg0.getY();
            class132.field1815 = class203.method1299((byte) 5);
            if (arg0.isMetaDown()) {
                class147.field2057 = 2;
                class66.field748 = 2;
            } else {
                class147.field2057 = 1;
                class66.field748 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILbk;)V", line = 354)
    public static final void method2410(int arg0, class211 arg1) {
        if (arg0 != -4370) {
            return;
        }
        for (int var2 = 0; var2 < class393.field5753; var2++) {
            int var3 = arg1.method1376(arg0 ^ 0xFFFFEE6E);
            int var4 = arg1.method1355(arg0 + 36506);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class155.field2211[var3] != null) {
                class155.field2211[var3].field775 = var4;
            }
        }
        field5583++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 388)
    public static void method2411(int arg0) {
        field5577 = null;
        if (arg0 == 0) {
            field5573 = null;
            field5582 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljf;IZII)V", line = 419)
    public static final void method2412(class119 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5575++;
        int var5 = arg0.field1552;
        int var6 = arg0.field1498;
        if (~arg0.field1482 == arg4) {
            arg0.field1552 = arg0.field1461;
        } else if (arg0.field1482 == 1) {
            arg0.field1552 = arg3 - arg0.field1461;
        } else if (arg0.field1482 == 2) {
            arg0.field1552 = arg0.field1461 * arg3 >> 14;
        } else if (arg0.field1482 == 3) {
            if (arg0.field1535 == 2) {
                arg0.field1552 = (arg0.field1461 - 1) * arg0.field1445 + arg0.field1461 * 32;
            } else if (arg0.field1535 == 7) {
                arg0.field1552 = (arg0.field1461 - 1) * arg0.field1445 + arg0.field1461 * 115;
            }
        }
        if (arg0.field1497 == 0) {
            arg0.field1498 = arg0.field1458;
        } else if (arg0.field1497 == 1) {
            arg0.field1498 = arg1 - arg0.field1458;
        } else if (arg0.field1497 == 2) {
            arg0.field1498 = arg0.field1458 * arg1 >> 14;
        } else if (arg0.field1497 == 3) {
            if (arg0.field1535 == 2) {
                arg0.field1498 = arg0.field1458 * 32 + ((arg0.field1458 - 1) * arg0.field1421);
            } else if (arg0.field1535 == 7) {
                arg0.field1498 = (arg0.field1458 - 1) * arg0.field1421 + arg0.field1458 * 12;
            }
        }
        if (arg0.field1482 == 4) {
            arg0.field1552 = arg0.field1498 * arg0.field1455 / arg0.field1453;
        }
        if (arg0.field1497 == 4) {
            arg0.field1498 = arg0.field1552 * arg0.field1453 / arg0.field1455;
        }
        if (class267.field3764 && (client.method1076(arg0).field39 != 0 || arg0.field1535 == 0)) {
            if (arg0.field1498 < 5 && arg0.field1552 < 5) {
                arg0.field1498 = 5;
                arg0.field1552 = 5;
            } else {
                if (arg0.field1498 <= 0) {
                    arg0.field1498 = 5;
                }
                if (arg0.field1552 <= 0) {
                    arg0.field1552 = 5;
                }
            }
        }
        if (arg0.field1538 == 1337) {
            class56.field631 = arg0;
        }
        if (arg2 && arg0.field1413 != null && arg0.field1552 != var5 || arg0.field1498 != var6) {
            class191 var7 = new class191();
            var7.field2602 = arg0.field1413;
            var7.field2605 = arg0;
            class364.field5293.method1125(-1, var7);
        }
    }
}
