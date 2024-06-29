import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class181 extends class503 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "Lpk;")
    private class133 field2554 = new class133();

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "Lpk;")
    private class133 field2570 = new class133();

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "Z")
    private boolean field2574;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    private int field2559;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field2575;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[Z")
    public static boolean[] field2543;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)I", line = 3)
    public final int method1268(byte arg0) {
        if (arg0 != 58) {
            field2543 = null;
        }
        field2563++;
        return this.field2549;
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z", line = 14)
    public final boolean method1269(int arg0) {
        if (arg0 == 2) {
            field2566++;
            return (this.field2568 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V", line = 28)
    public static void method1270(int arg0) {
        if (arg0 != 128) {
            field2543 = null;
        }
        field2543 = null;
    }

    @OriginalMember(owner = "client!gf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 40)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2542++;
        this.field2573 = -1;
        this.field2572 = -1;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Z", line = 51)
    public final boolean method1271(int arg0) {
        field2541++;
        if (arg0 == 1) {
            return (this.field2568 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V", line = 65)
    private final void method1272(boolean arg0) {
        field2550++;
        if (this.field2575 == null) {
            return;
        }
        this.field2575.removeMouseListener(this);
        this.field2575.removeMouseMotionListener(this);
        if (!arg0) {
            this.field2572 = -103;
        }
        this.field2575 = null;
        this.field2554 = null;
        this.field2572 = this.field2573 = this.field2571 = 0;
        this.field2549 = this.field2559 = this.field2568 = 0;
        this.field2570 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 90)
    private final int method1273(MouseEvent arg0, int arg1) {
        field2562++;
        int var3 = arg0.getModifiers();
        boolean var4 = (arg1 & var3) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 127)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2555++;
        int var2 = this.method1273(arg0, 16);
        if ((var2 & this.field2571) == 0) {
            var2 = this.field2571;
        }
        if ((var2 & 0x1) != 0) {
            this.method1277(arg0.getX(), arg0.getY(), (byte) 100, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method1277(arg0.getX(), arg0.getY(), (byte) 100, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method1277(arg0.getX(), arg0.getY(), (byte) 100, 4);
        }
        this.field2571 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BZ)V", line = 155)
    public static final void method1274(byte arg0, boolean arg1) {
        class242.field3581 = 0;
        class200.field2934 = 0;
        field2546++;
        class47.method489((byte) -53);
        class272.method1757(arg1, (byte) -128);
        if (arg0 != -30) {
            method1276(14, -20, 116, 21);
        }
        class130.method998((byte) 127);
        for (int var2 = 0; var2 < class242.field3581; var2++) {
            int var4 = class160.field2254[var2];
            if (class263.field3867 != class250.field3690[var4].field1688) {
                if (class250.field3690[var4].field6790.method852(-94)) {
                    class248.method1626(class250.field3690[var4], 16777216);
                }
                class250.field3690[var4].method2771((byte) -121, null);
                class250.field3690[var4] = null;
            }
        }
        if (class26.field314 != class85.field1163.field827) {
            throw new RuntimeException("gnp1 pos:" + class85.field1163.field827 + " psize:" + class26.field314);
        }
        for (int var3 = 0; var3 < class232.field3410; var3++) {
            if (class250.field3690[class173.field2454[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class232.field3410);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V", line = 208)
    public final synchronized void method1275(int arg0) {
        this.field2549 = this.field2572;
        this.field2559 = this.field2573;
        field2557++;
        if (arg0 > -21) {
            this.method1271(94);
        }
        this.field2568 = this.field2571;
        class133 var2 = this.field2554;
        this.field2554 = this.field2570;
        this.field2570 = var2;
        this.field2570.method1016(-82);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)Z", line = 232)
    public static final boolean method1276(int arg0, int arg1, int arg2, int arg3) {
        if (!class518.method3077(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class527.field7754;
        int var5 = arg2 << class527.field7754;
        int var6 = class131.field1899[arg0].method430(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class527.field7754 - 7);
        int var8 = var6 - (0xE6 << class527.field7754 - 7);
        int var9 = var6 - (0xEE << class527.field7754 - 7);
        if (arg3 == 1) {
            if (var4 > class215.field3070) {
                if (!class473.method2861(var4, var6, var5)) {
                    return false;
                }
                if (!class473.method2861(var4, var6, class47.field517 + var5)) {
                    return false;
                }
                if (!class473.method2861(var4, var6, class376.field5566 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class473.method2861(var4, var7, var5)) {
                    return false;
                }
                if (!class473.method2861(var4, var7, class47.field517 + var5)) {
                    return false;
                }
                if (!class473.method2861(var4, var7, class376.field5566 + var5)) {
                    return false;
                }
            }
            if (!class473.method2861(var4, var8, var5)) {
                return false;
            } else if (class473.method2861(var4, var8, class47.field517 + var5)) {
                return class473.method2861(var4, var8, class376.field5566 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class55.field585) {
                if (!class473.method2861(var4, var6, class376.field5566 + var5)) {
                    return false;
                }
                if (!class473.method2861(class47.field517 + var4, var6, class376.field5566 + var5)) {
                    return false;
                }
                if (!class473.method2861(class376.field5566 + var4, var6, class376.field5566 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class473.method2861(var4, var7, class376.field5566 + var5)) {
                    return false;
                }
                if (!class473.method2861(class47.field517 + var4, var7, class376.field5566 + var5)) {
                    return false;
                }
                if (!class473.method2861(class376.field5566 + var4, var7, class376.field5566 + var5)) {
                    return false;
                }
            }
            if (!class473.method2861(var4, var8, class376.field5566 + var5)) {
                return false;
            } else if (class473.method2861(class47.field517 + var4, var8, class376.field5566 + var5)) {
                return class473.method2861(class376.field5566 + var4, var8, class376.field5566 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class215.field3070) {
                if (!class473.method2861(class376.field5566 + var4, var6, var5)) {
                    return false;
                }
                if (!class473.method2861(class376.field5566 + var4, var6, class47.field517 + var5)) {
                    return false;
                }
                if (!class473.method2861(class376.field5566 + var4, var6, class376.field5566 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class473.method2861(class376.field5566 + var4, var7, var5)) {
                    return false;
                }
                if (!class473.method2861(class376.field5566 + var4, var7, class47.field517 + var5)) {
                    return false;
                }
                if (!class473.method2861(class376.field5566 + var4, var7, class376.field5566 + var5)) {
                    return false;
                }
            }
            if (!class473.method2861(class376.field5566 + var4, var8, var5)) {
                return false;
            } else if (class473.method2861(class376.field5566 + var4, var8, class47.field517 + var5)) {
                return class473.method2861(class376.field5566 + var4, var8, class376.field5566 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class55.field585) {
                if (!class473.method2861(var4, var6, var5)) {
                    return false;
                }
                if (!class473.method2861(class47.field517 + var4, var6, var5)) {
                    return false;
                }
                if (!class473.method2861(class376.field5566 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class473.method2861(var4, var7, var5)) {
                    return false;
                }
                if (!class473.method2861(class47.field517 + var4, var7, var5)) {
                    return false;
                }
                if (!class473.method2861(class376.field5566 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class473.method2861(var4, var8, var5)) {
                return false;
            } else if (class473.method2861(class47.field517 + var4, var8, var5)) {
                return class473.method2861(class376.field5566 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class473.method2861(class47.field517 + var4, var9, class47.field517 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class473.method2861(var4, var8, class376.field5566 + var5);
        } else if (arg3 == 32) {
            return class473.method2861(class376.field5566 + var4, var8, class376.field5566 + var5);
        } else if (arg3 == 64) {
            return class473.method2861(class376.field5566 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class473.method2861(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBI)V", line = 447)
    private final void method1277(int arg0, int arg1, byte arg2, int arg3) {
        field2560++;
        class29 var5 = new class29();
        var5.field353 = arg0;
        var5.field362 = arg1;
        var5.field355 = arg3;
        var5.field350 = class437.method2644(-77);
        if (arg2 != 100) {
            this.field2574 = false;
        }
        this.field2570.method1015(false, var5);
    }

    @OriginalMember(owner = "client!gf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 468)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2547++;
        this.method1278(arg0, false);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)V", line = 478)
    private final void method1278(MouseEvent arg0, boolean arg1) {
        field2565++;
        this.field2572 = arg0.getX();
        this.field2573 = arg0.getY();
        if (this.field2574) {
            this.method1277(arg0.getX(), arg0.getY(), (byte) 100, -1);
        }
        if (arg1) {
            this.method1280(46);
        }
    }

    @OriginalMember(owner = "client!gf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 497)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2558++;
    }

    @OriginalMember(owner = "client!gf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 508)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2548++;
        int var2 = this.method1273(arg0, 16);
        if (var2 == 1) {
            this.method1277(arg0.getX(), arg0.getY(), (byte) 100, 0);
        } else if (var2 == 4) {
            this.method1277(arg0.getX(), arg0.getY(), (byte) 100, 2);
        } else if (var2 == 2) {
            this.method1277(arg0.getX(), arg0.getY(), (byte) 100, 1);
        }
        this.field2571 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 533)
    private final void method1279(Component arg0, int arg1) {
        this.method1272(true);
        field2564++;
        this.field2575 = arg0;
        if (arg1 != -25329) {
            this.method1281(false);
        }
        this.field2575.addMouseListener(this);
        this.field2575.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I", line = 550)
    public final int method1280(int arg0) {
        if (arg0 != 3045) {
            this.field2573 = -75;
        }
        field2552++;
        return this.field2559;
    }

    @OriginalMember(owner = "client!gf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 566)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1278(arg0, false);
        field2551++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 574)
    public final void method1281(boolean arg0) {
        this.method1272(arg0);
        field2567++;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)Z", line = 583)
    public final boolean method1282(byte arg0) {
        int var2 = 41 % ((arg0 + 45) / 60);
        field2556++;
        return (this.field2568 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 593)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1278(arg0, false);
        field2569++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z", line = 601)
    public static final boolean method1283(int arg0, int arg1, int arg2) {
        field2545++;
        if (arg0 != -16623) {
            field2544 = -80;
        }
        return (arg2 & 0x40000) != 0 | class355.method2145(arg2, arg1, (byte) -60) || class66.method645(-20147, arg1, arg2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Los;", line = 616)
    public final class306 method1284(byte arg0) {
        if (arg0 >= -20) {
            this.field2575 = null;
        }
        field2553++;
        return (class306) this.field2554.method1014(4095);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 627)
    public static final String[] method1285(int arg0, String[] arg1) {
        field2561++;
        String[] var2 = new String[arg0];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 661)
    public class181(Component arg0, boolean arg1) {
        this.method1279(arg0, -25329);
        this.field2574 = arg1;
    }
}
