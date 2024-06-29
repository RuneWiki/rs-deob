import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class91 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Loh;")
    public static class258 field1602 = class153.method1046("(Udns", 120);

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lmb;")
    public static class172 field1596 = new class172(32);

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field1607 = 0;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Loh;")
    public static class258 field1608 = class153.method1046("T", 110);

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Loh;")
    public static class258 field1609 = class153.method1046(")4l=", 112);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 7)
    public static final void method675(int arg0, int arg1) {
        field1601++;
        if (arg0 != 12519) {
            field1610 = -70;
        }
        class286 var2 = class48.method389(arg1, 12, arg0 - 1781);
        var2.method2010((byte) -38);
    }

    @OriginalMember(owner = "client!lg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 19)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1595++;
        if (class299.field5112 != null) {
            class246.field4267 = 0;
            class285.field4914 = arg0.getX();
            class260.field4519 = arg0.getY();
            class224.field3835 = class25.method197(-3418);
            if (arg0.isMetaDown()) {
                class300.field5125 = 2;
                class312.field5295 = 2;
            } else {
                class300.field5125 = 1;
                class312.field5295 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 73)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class299.field5112 != null) {
            class246.field4267 = 0;
            class197.field3467 = arg0.getX();
            class240.field4175 = arg0.getY();
        }
        field1600++;
    }

    @OriginalMember(owner = "client!lg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 89)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class299.field5112 != null) {
            class246.field4267 = 0;
            class197.field3467 = -1;
            class240.field4175 = -1;
        }
        field1598++;
    }

    @OriginalMember(owner = "client!lg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 106)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1591++;
        if (class299.field5112 != null) {
            class246.field4267 = 0;
            class312.field5295 = 0;
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
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 150)
    public static void method676(byte arg0) {
        field1608 = null;
        field1596 = null;
        field1602 = null;
        field1609 = null;
        if (arg0 < 86) {
            field1610 = -91;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Loi;IIIIIIIZ)V", line = 164)
    public static final void method677(class26 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class190.field3359;
        int var11;
        int var12 = var11 = (arg7 << 7) - class289.field4986;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class201.field3482[arg1][arg6][arg7] - class258.field4463;
        int var18 = class201.field3482[arg1][arg6 + 1][arg7] - class258.field4463;
        int var19 = class201.field3482[arg1][arg6 + 1][arg7 + 1] - class258.field4463;
        int var20 = class201.field3482[arg1][arg6][arg7 + 1] - class258.field4463;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class266.field4635;
        int var46 = (var24 << 9) / var25 + class266.field4632;
        int var47 = (var27 << 9) / var31 + class266.field4635;
        int var48 = (var30 << 9) / var31 + class266.field4632;
        int var49 = (var33 << 9) / var37 + class266.field4635;
        int var50 = (var36 << 9) / var37 + class266.field4632;
        int var51 = (var39 << 9) / var43 + class266.field4635;
        int var52 = (var42 << 9) / var43 + class266.field4632;
        class266.field4630 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class145.field2457 && class179.method1226(class78.field1345 + class266.field4635, class65.field1149 + class266.field4632, var50, var52, var48, var49, var51, var47)) {
                class188.field3326 = arg6;
                class20.field237 = arg7;
            }
            if (!class257.field4390 && !arg8) {
                class266.field4641 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class266.field4638 || var51 > class266.field4638 || var47 > class266.field4638) {
                    class266.field4641 = true;
                }
                if (arg0.field315 == -1) {
                    if (arg0.field311 != 12345678) {
                        class266.method1876(var50, var52, var48, var49, var51, var47, arg0.field311, arg0.field312, arg0.field302);
                    }
                } else if (!class50.field743) {
                    int var53 = class266.field4643.method196(arg0.field315, true);
                    class266.method1876(var50, var52, var48, var49, var51, var47, class13.method89(var53, arg0.field311), class13.method89(var53, arg0.field312), class13.method89(var53, arg0.field302));
                } else if (arg0.field305) {
                    class266.method1860(var50, var52, var48, var49, var51, var47, arg0.field311, arg0.field312, arg0.field302, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field315);
                } else {
                    class266.method1860(var50, var52, var48, var49, var51, var47, arg0.field311, arg0.field312, arg0.field302, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field315);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class145.field2457 && class179.method1226(class78.field1345 + class266.field4635, class65.field1149 + class266.field4632, var46, var48, var52, var45, var47, var51)) {
            class188.field3326 = arg6;
            class20.field237 = arg7;
        }
        if (class257.field4390 || arg8) {
            return;
        }
        class266.field4641 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class266.field4638 || var47 > class266.field4638 || var51 > class266.field4638) {
            class266.field4641 = true;
        }
        if (arg0.field315 == -1) {
            if (arg0.field306 != 12345678) {
                class266.method1876(var46, var48, var52, var45, var47, var51, arg0.field306, arg0.field302, arg0.field312);
            }
        } else if (class50.field743) {
            class266.method1860(var46, var48, var52, var45, var47, var51, arg0.field306, arg0.field302, arg0.field312, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field315);
        } else {
            int var54 = class266.field4643.method196(arg0.field315, true);
            class266.method1876(var46, var48, var52, var45, var47, var51, class13.method89(var54, arg0.field306), class13.method89(var54, arg0.field302), class13.method89(var54, arg0.field312));
        }
    }

    @OriginalMember(owner = "client!lg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 323)
    public final void focusGained(FocusEvent arg0) {
        field1604++;
    }

    @OriginalMember(owner = "client!lg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 331)
    public final void mouseClicked(MouseEvent arg0) {
        field1599++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 342)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class299.field5112 != null) {
            class312.field5295 = 0;
        }
        field1606++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 355)
    public static final void method678(int arg0) {
        int[] var1 = new int[class137.field2336];
        int var2 = 0;
        field1605++;
        for (int var3 = arg0; var3 < class137.field2336; var3++) {
            class61 var4 = class186.method1256((byte) 110, var3);
            if (var4.field1045 >= 0 || var4.field1009 >= 0) {
                var1[var2++] = var3;
            }
        }
        class146.field2481 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class146.field2481[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)I", line = 394)
    public static final int method679(int arg0, int arg1) {
        if (arg1 == -26276) {
            field1592++;
            return arg0 & 0xFF;
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!lg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 411)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1593++;
        if (class299.field5112 != null) {
            class246.field4267 = 0;
            class197.field3467 = arg0.getX();
            class240.field4175 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!lg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 427)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class299.field5112 != null) {
            class246.field4267 = 0;
            class197.field3467 = arg0.getX();
            class240.field4175 = arg0.getY();
        }
        field1603++;
    }
}
