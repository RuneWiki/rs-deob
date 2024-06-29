import java.awt.Frame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class153 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2434 = 2;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Lck;")
    public static class119 field2439 = class298.method1987((byte) 125, "Card:");

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field2441 = 0;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[S")
    public static short[] field2436 = new short[256];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lob;")
    public static class294 field2432;

    @OriginalMember(owner = "client!dj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 13)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class299.field5049 != null) {
            class266.field4354 = 0;
            class181.field2877 = arg0.getX();
            class272.field4476 = arg0.getY();
        }
        field2433++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 31)
    public static void method978(int arg0) {
        field2436 = null;
        if (arg0 == 0) {
            field2432 = null;
            field2439 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 47)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2443++;
        if (class299.field5049 != null) {
            class266.field4354 = 0;
            class181.field2877 = arg0.getX();
            class272.field4476 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Llh;IIIII)Ljava/awt/Frame;", line = 64)
    public static final Frame method979(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2440++;
        if (arg5 > -2) {
            field2432 = (class294) null;
        }
        if (!arg0.method1865(true)) {
            return null;
        }
        if (arg1 == 0) {
            class72[] var6 = class1.method2((byte) -126, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1119 == arg4 && var6[var8].field1117 == arg3 && (arg2 == 0 || var6[var8].field1120 == arg2) && (!var7 || var6[var8].field1122 > arg1)) {
                    var7 = true;
                    arg1 = var6[var8].field1122;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class275 var9 = arg0.method1876(arg3, arg4, (byte) -8, arg1, arg2);
        while (var9.field4496 == 0) {
            class232.method1493(10L, (byte) -51);
        }
        Frame var10 = (Frame) var9.field4499;
        if (var10 == null) {
            return null;
        } else if (var9.field4496 == 2) {
            class81.method555(var10, arg0, 0);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!dj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 136)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2431++;
        if (class299.field5049 != null) {
            class266.field4354 = 0;
            class246.field3980 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 171)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class299.field5049 != null) {
            class266.field4354 = 0;
            class181.field2877 = arg0.getX();
            class272.field4476 = arg0.getY();
        }
        field2447++;
    }

    @OriginalMember(owner = "client!dj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 193)
    public final void mouseClicked(MouseEvent arg0) {
        field2446++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIII)V", line = 206)
    public static final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field2445++;
        int var9 = arg2;
        int var10 = arg6 - arg4;
        int var11 = 0;
        int var12 = arg2 - arg4;
        int var13 = arg6 * arg6;
        int var14 = arg2 * arg2;
        int var15 = var10 * var10;
        int var16 = var12 * var12;
        if (arg3 > -49) {
            method980(-109, 93, 68, -116, 86, -23, -1, 55);
        }
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = (1 - var21) * var13 + var18;
        int var23 = var12 << 1;
        int var24 = var14 - ((var21 - 1) * var17);
        int var25 = var13 << 2;
        int var26 = (1 - var23) * var15 + var19;
        int var27 = var16 - ((var23 - 1) * var20);
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var18 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = var29;
        int var34 = (arg2 - 1) * var25;
        int var35 = var19 * 3;
        int var36 = (var23 - 3) * var20;
        int var37 = var30;
        int var38 = (var12 - 1) * var28;
        if (class108.field1650 <= arg5 && arg5 <= class236.field3800) {
            int[] var39 = class256.field4113[arg5];
            int var40 = class197.method1264(-121, arg1 - arg6, class79.field1226, class59.field957);
            int var41 = class197.method1264(-109, arg1 + arg6, class79.field1226, class59.field957);
            int var42 = class197.method1264(-111, arg1 - var10, class79.field1226, class59.field957);
            int var43 = class197.method1264(-125, arg1 + var10, class79.field1226, class59.field957);
            class36.method282(var42, var40, arg0, var39, 26175);
            class36.method282(var43, var42, arg7, var39, 26175);
            class36.method282(var41, var43, arg0, var39, 26175);
        }
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var24 += var33;
                    var33 += var29;
                    var22 += var31;
                    var31 += var29;
                }
            }
            if (var24 < 0) {
                var8++;
                var24 += var33;
                var33 += var29;
                var22 += var31;
                var31 += var29;
            }
            var24 += -var32;
            var32 -= var25;
            boolean var44 = var9 <= var12;
            var22 += -var34;
            var34 -= var25;
            var9--;
            int var45 = arg5 + var9;
            int var46 = arg5 - var9;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var11++;
                        var26 += var35;
                        var35 += var30;
                        var27 += var37;
                        var37 += var30;
                    }
                }
                if (var27 < 0) {
                    var11++;
                    var26 += var35;
                    var27 += var37;
                    var37 += var30;
                    var35 += var30;
                }
                var27 += -var36;
                var36 -= var28;
                var26 += -var38;
                var38 -= var28;
            }
            if (var45 >= class108.field1650 && class236.field3800 >= var46) {
                int var47 = class197.method1264(-114, arg1 + var8, class79.field1226, class59.field957);
                int var48 = class197.method1264(-115, arg1 - var8, class79.field1226, class59.field957);
                if (var44) {
                    int var49 = class197.method1264(-119, arg1 + var11, class79.field1226, class59.field957);
                    int var50 = class197.method1264(-106, arg1 - var11, class79.field1226, class59.field957);
                    if (class108.field1650 <= var46) {
                        int[] var51 = class256.field4113[var46];
                        class36.method282(var50, var48, arg0, var51, 26175);
                        class36.method282(var49, var50, arg7, var51, 26175);
                        class36.method282(var47, var49, arg0, var51, 26175);
                    }
                    if (var45 <= class236.field3800) {
                        int[] var52 = class256.field4113[var45];
                        class36.method282(var50, var48, arg0, var52, 26175);
                        class36.method282(var49, var50, arg7, var52, 26175);
                        class36.method282(var47, var49, arg0, var52, 26175);
                    }
                } else {
                    if (class108.field1650 <= var46) {
                        class36.method282(var47, var48, arg0, class256.field4113[var46], 26175);
                    }
                    if (var45 <= class236.field3800) {
                        class36.method282(var47, var48, arg0, class256.field4113[var45], 26175);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 432)
    public final void focusGained(FocusEvent arg0) {
        field2438++;
    }

    @OriginalMember(owner = "client!dj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 446)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class299.field5049 != null) {
            class266.field4354 = 0;
            class181.field2877 = -1;
            class272.field4476 = -1;
        }
        field2435++;
    }

    @OriginalMember(owner = "client!dj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 465)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2437++;
        if (class299.field5049 != null) {
            class266.field4354 = 0;
            class262.field4221 = arg0.getX();
            class174.field2794 = arg0.getY();
            class114.field1728 = class110.method707((byte) 72);
            if (arg0.isMetaDown()) {
                class253.field4084 = 2;
                class246.field3980 = 2;
            } else {
                class253.field4084 = 1;
                class246.field3980 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 522)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2444++;
        if (class299.field5049 != null) {
            class246.field3980 = 0;
        }
    }
}
