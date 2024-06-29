import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class292 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lcd;")
    public static class64 field5040 = class44.method335((byte) 71, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lsg;")
    public static class34 field5033 = new class34(0, 0);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
    public static int[] field5045;

    @OriginalMember(owner = "client!hk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5044++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[BII)Lcd;", line = 15)
    public static final class64 method2015(int arg0, byte[] arg1, int arg2, int arg3) {
        field5031++;
        class64 var4 = new class64();
        var4.field1274 = arg0;
        var4.field1252 = new byte[arg3];
        for (int var5 = arg2; var5 < (arg2 + arg3); var5++) {
            if (arg1[var5] != 0) {
                var4.field1252[var4.field1274++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 41)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class163.field2873 != null) {
            class245.field4260 = 0;
            class56.field949 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5037++;
    }

    @OriginalMember(owner = "client!hk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 95)
    public final void focusGained(FocusEvent arg0) {
        field5043++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZLka;)V", line = 103)
    public static final void method2016(int arg0, boolean arg1, class179 arg2) {
        if (class123.field2216 || arg1) {
            int var3 = class58.field960;
            int var4 = var3 * 956 / 503;
            class265.field4558.method309((class13.field290 - var4) / 2, 0, var4, var3);
            class164.field2881.method279(class13.field290 / 2 - class164.field2881.field3008 / 2, 18);
        }
        field5036++;
        if (arg0 != 16917) {
            field5032 = 21;
        }
        arg2.method1263(class275.field4727, class13.field290 / 2, class58.field960 / 2 - 26, 16777215, -1);
        int var5 = class58.field960 / 2 - 18;
        if (class123.field2216) {
            class21.method212(class13.field290 / 2 - 152, var5, 304, 34, 9179409);
            class21.method212(class13.field290 / 2 - 151, var5 + 1, 302, 32, 0);
            class21.method208(class13.field290 / 2 - 150, var5 + 2, class27.field445 * 3, 30, 9179409);
            class21.method208(class13.field290 / 2 + (class27.field445 * 3) - 150, var5 + 2, 300 - class27.field445 * 3, 30, 0);
        } else {
            class210.method1468(class13.field290 / 2 - 152, var5, 304, 34, 9179409);
            class210.method1468(class13.field290 / 2 - 151, var5 + 1, 302, 32, 0);
            class210.method1469(class13.field290 / 2 - 150, var5 - -2, class27.field445 * 3, 30, 9179409);
            class210.method1469(class13.field290 / 2 + (class27.field445 * 3) - 150, var5 + 2, 300 - (class27.field445 * 3), 30, 0);
        }
        arg2.method1263(class289.field4949, class13.field290 / 2, class58.field960 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!hk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 143)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class163.field2873 != null) {
            class56.field949 = 0;
        }
        field5029++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIBI)V", line = 165)
    public static final void method2017(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5039++;
        class31.method268(arg2 + arg1, arg4 ^ 0xFFFFFFB4, arg2 - arg1, class124.field2241[arg3], arg0);
        int var6 = arg5;
        int var7 = 0;
        int var8 = arg1 * arg1;
        if (arg4 != -50) {
            method2017(84, -42, 124, 71, (byte) 110, 28);
        }
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = arg5 << 1;
        int var12 = var8 << 2;
        int var13 = (1 - var11) * var8 + var10;
        int var14 = var9 << 2;
        int var15 = ((var7 << 1) + 3) * var10;
        int var16 = (arg5 - 1) * var12;
        int var17 = (var7 + 1) * var14;
        int var18 = var8 << 1;
        int var19 = var9 - ((var11 - 1) * var18);
        int var20 = ((arg5 << 1) - 3) * var18;
        while (var6 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var7++;
                    var19 += var17;
                    var13 += var15;
                    var15 += var14;
                    var17 += var14;
                }
            }
            var6--;
            int var21 = arg3 - var6;
            int var22 = arg3 + var6;
            if (var19 < 0) {
                var19 += var17;
                var13 += var15;
                var7++;
                var15 += var14;
                var17 += var14;
            }
            int var23 = arg2 - var7;
            var19 += -var20;
            var13 += -var16;
            var20 -= var12;
            int var24 = arg2 + var7;
            var16 -= var12;
            class31.method268(var24, 118, var23, class124.field2241[var21], arg0);
            class31.method268(var24, 123, var23, class124.field2241[var22], arg0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 257)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class163.field2873 != null) {
            class245.field4260 = 0;
            class247.field4304 = arg0.getX();
            class135.field2414 = arg0.getY();
        }
        field5030++;
    }

    @OriginalMember(owner = "client!hk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 275)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class163.field2873 != null) {
            class245.field4260 = 0;
            class247.field4304 = arg0.getX();
            class135.field2414 = arg0.getY();
        }
        field5034++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 292)
    public static void method2018(byte arg0) {
        if (arg0 >= -27) {
            method2019(-26, (byte) -52);
        }
        field5045 = null;
        field5033 = null;
        field5040 = null;
    }

    @OriginalMember(owner = "client!hk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 305)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class163.field2873 != null) {
            class245.field4260 = 0;
            class247.field4304 = arg0.getX();
            class135.field2414 = arg0.getY();
        }
        field5041++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V", line = 322)
    public static final void method2019(int arg0, byte arg1) {
        if (arg1 != 62) {
            field5033 = (class34) null;
        }
        field5042++;
        class299 var2 = class158.method1135(arg0, -101, 2);
        var2.method2093((byte) -83);
    }

    @OriginalMember(owner = "client!hk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 334)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class163.field2873 != null) {
            class245.field4260 = 0;
            class113.field2089 = arg0.getX();
            class277.field4779 = arg0.getY();
            class165.field2899 = class154.method1114(true);
            if (arg0.isMetaDown()) {
                class218.field3688 = 2;
                class56.field949 = 2;
            } else {
                class218.field3688 = 1;
                class56.field949 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        field5038++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 381)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5035++;
        if (class163.field2873 != null) {
            class245.field4260 = 0;
            class247.field4304 = -1;
            class135.field2414 = -1;
        }
    }
}
