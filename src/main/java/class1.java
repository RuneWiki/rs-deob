import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class1 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Z")
    public static boolean field12 = false;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "[Lrp;")
    public static class250[] field4;

    @OriginalMember(owner = "client!ro", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class371.field5260 != null) {
            class14.field171 = 0;
            class414.field6013 = 0;
            int var2 = arg0.getModifiers();
        }
        field13++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ro", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ro", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class371.field5260 != null) {
            class14.field171 = 0;
            class165.field2351 = arg0.getX();
            class408.field5927 = arg0.getY();
        }
        field14++;
    }

    @OriginalMember(owner = "client!ro", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field10++;
        if (class371.field5260 != null) {
            class414.field6013 = 0;
        }
    }

    @OriginalMember(owner = "client!ro", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class371.field5260 != null) {
            class14.field171 = 0;
            class165.field2351 = arg0.getX();
            class408.field5927 = arg0.getY();
        }
        field11++;
    }

    @OriginalMember(owner = "client!ro", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field7++;
        if (class371.field5260 != null) {
            class14.field171 = 0;
            class165.field2351 = arg0.getX();
            class408.field5927 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static final void method1(byte arg0) {
        field6++;
        int var1 = 0;
        if (class412.field5977) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class406.method2609(var1, (byte) -95);
        class294.method1883(var1, (byte) 37);
        class427.method2690(-88, var1);
        class155.method1046((byte) -123, var1);
        class204.method1341(var1, 78);
        class191.method1267(99, var1);
        class326.method2054(-81, var1);
        if (arg0 < 60) {
            return;
        }
        class366.method2352(var1, -18735);
        class182.method1203((byte) 13, var1);
        if (class79.field1220 == 10) {
            class312.method1977(28, (byte) -47);
        } else if (class79.field1220 == 30) {
            class312.method1977(25, (byte) -81);
            return;
        }
    }

    @OriginalMember(owner = "client!ro", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field15++;
    }

    @OriginalMember(owner = "client!ro", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class371.field5260 != null) {
            class14.field171 = 0;
            class165.field2351 = -1;
            class408.field5927 = -1;
        }
        field1++;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static final void method2(int arg0) {
        if (arg0 != 29715) {
            method3(false, '\u0018');
        }
        class190 var1 = class411.field5963;
        synchronized (class411.field5963) {
            class411.field5963.method1249(1);
        }
        field5++;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZC)Z")
    public static final boolean method3(boolean arg0, char arg1) {
        if (arg0) {
            return true;
        }
        field9++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ro", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2++;
        if (class371.field5260 != null) {
            class14.field171 = 0;
            class426.field6117 = arg0.getX();
            class170.field2418 = arg0.getY();
            class216.field2870 = class224.method1425(-26805);
            if (arg0.isMetaDown()) {
                class373.field5327 = 2;
                class414.field6013 = 2;
            } else {
                class373.field5327 = 1;
                class414.field6013 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBILrg;IIII)V")
    public static final void method4(int arg0, byte arg1, int arg2, class383 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 70) {
            return;
        }
        field8++;
        if (arg3.field5488 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg3.field5454; var11++) {
                for (int var12 = 0; var12 < arg3.field5493; var12++) {
                    int var13 = (arg3.field5425 + 32) * var12 + arg5;
                    int var14 = arg7 + ((arg3.field5592 + 32) * var11);
                    if (var10 < 20) {
                        var14 += arg3.field5451[var10];
                        var13 += arg3.field5422[var10];
                    }
                    if (arg3.field5564[var10] > 0 && (arg2 < var13 + 32 && var13 < arg6 && (var14 + 32) > arg0 && arg4 > var14 || class145.field2106 == arg3 && class437.field6288 == var10)) {
                        if (var10 < var8) {
                            var8 = var10;
                        }
                        if (var10 > var9) {
                            var9 = var10;
                        }
                    }
                    var10++;
                }
            }
            client.method1101(var8, class408.field5920, var9, arg3, 70);
        } else if (arg3.field5488 == 5 && arg3.field5569 != -1) {
            class54.method369((byte) 107, class408.field5920, arg3);
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public static void method5(int arg0) {
        int var1 = -82 % ((arg0 - 30) / 58);
        field4 = null;
    }
}
