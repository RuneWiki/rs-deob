import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class219 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field3945 = 0;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field3955 = 0;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field3954 = 1;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "Lfl;")
    public static class192 field3956;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lvf;")
    public static class265 field3935;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Z")
    public static boolean field3957;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[I")
    public static int[] field3951;

    @OriginalMember(owner = "client!ik", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3943++;
        if (class232.field4089 != null) {
            class208.field3748 = 0;
            class254.field4366 = arg0.getX();
            class144.field2696 = arg0.getY();
            class110.field1930 = class136.method950(8954);
            if (arg0.isMetaDown()) {
                class57.field1162 = 2;
                class89.field1598 = 2;
            } else {
                class57.field1162 = 1;
                class89.field1598 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ik", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3939++;
        if (class232.field4089 != null) {
            class208.field3748 = 0;
            class135.field2426 = arg0.getX();
            class161.field2942 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method1502(byte arg0) {
        int var1 = 0;
        int[] var2 = new int[class97.field1718];
        for (int var3 = 0; var3 < class97.field1718; var3++) {
            class261 var6 = class54.method418(var3, 0);
            if (var6.field4557 >= 0 || var6.field4552 >= 0) {
                var2[var1++] = var3;
            }
        }
        class56.field1145 = new int[var1];
        field3937++;
        int var4 = 87 / ((-arg0 - 47) / 37);
        for (int var5 = 0; var5 < var1; var5++) {
            class56.field1145[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!ik", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3953++;
        if (class232.field4089 != null) {
            class208.field3748 = 0;
            class135.field2426 = -1;
            class161.field2942 = -1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3941++;
        if (class232.field4089 != null) {
            class89.field1598 = 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3940++;
        if (class232.field4089 != null) {
            class208.field3748 = 0;
            class135.field2426 = arg0.getX();
            class161.field2942 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZIIII)V")
    public static final void method1503(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3936++;
        int var5 = arg4;
        int var6 = 0;
        int var7 = -arg4;
        int var8 = -1;
        if (!arg0) {
            return;
        }
        int var9 = method1507(class79.field1510, class107.field1890, arg1 + arg4, 0);
        int var10 = method1507(class79.field1510, class107.field1890, arg1 - arg4, 0);
        class203.method1394(class44.field973[arg3], var10, var9, -7249, arg2);
        while (var6 < var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var5--;
                var7 -= var5 << 1;
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                if (var12 >= class81.field1521 && class205.field3681 >= var11) {
                    int var13 = method1507(class79.field1510, class107.field1890, arg1 + var6, 0);
                    int var14 = method1507(class79.field1510, class107.field1890, arg1 - var6, 0);
                    if (var12 <= class205.field3681) {
                        class203.method1394(class44.field973[var12], var14, var13, -7249, arg2);
                    }
                    if (class81.field1521 <= var11) {
                        class203.method1394(class44.field973[var11], var14, var13, -7249, arg2);
                    }
                }
            }
            var6++;
            int var15 = arg3 - var6;
            int var16 = arg3 + var6;
            if (var16 >= class81.field1521 && var15 <= class205.field3681) {
                int var17 = method1507(class79.field1510, class107.field1890, arg1 + var5, 0);
                int var18 = method1507(class79.field1510, class107.field1890, arg1 - var5, 0);
                if (class205.field3681 >= var16) {
                    class203.method1394(class44.field973[var16], var18, var17, -7249, arg2);
                }
                if (var15 >= class81.field1521) {
                    class203.method1394(class44.field973[var15], var18, var17, -7249, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public static void method1504(byte arg0) {
        int var1 = -72 / ((arg0 - 12) / 53);
        field3935 = null;
        field3951 = null;
        field3956 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    public static final void method1505(int arg0, int arg1, int arg2) {
        if (class123.field2222 > 0) {
            client.method1473(arg2 + 281, class123.field2222);
            class123.field2222 = 0;
        }
        field3944++;
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        int var6 = class35.field824 * arg0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class256.field4379[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class35.field822[arg1 + (var6++)];
                int var12 = class51.field1066[var4++];
                if (var12 == 0) {
                    class252.field4330.field1592[var5++] = var11;
                } else {
                    int var13 = 256 - var12 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = var12 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class103.field1826[var12];
                    class252.field4330.field1592[var5++] = class203.method1395(class203.method1395(var11, 65280) * var13 + class203.method1395(65280, var15) * var14, 16711680) + class203.method1395(-16711936, class203.method1395(var15, 16711935) * var14 + var13 * class203.method1395(var11, 16711935)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class252.field4330.field1592[var5++] = class35.field822[var6++ + arg1];
            }
            var6 += class35.field824 - 128;
        }
        class252.field4330.method604(arg1, arg0);
        if (arg2 != -256) {
            method1505(114, -29, 65);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V")
    public static final void method1506(boolean arg0, int arg1) {
        class213.field3820.method1891(-23549, arg1);
        field3950++;
        if (!arg0) {
            field3935 = null;
        }
        class70.field1357.method1891(-23549, arg1);
    }

    @OriginalMember(owner = "client!ik", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3949++;
    }

    @OriginalMember(owner = "client!ik", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3938++;
        if (class232.field4089 != null) {
            class208.field3748 = 0;
            class89.field1598 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)I")
    public static final int method1507(int arg0, int arg1, int arg2, int arg3) {
        field3948++;
        if (arg3 != 0) {
            return 84;
        } else if (arg1 > arg2) {
            return arg1;
        } else if (arg0 < arg2) {
            return arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Lcg;")
    public static final class34 method1508(int arg0) {
        field3952++;
        class34 var1 = new class34(class203.field3643, class14.field429, class207.field3737[0], class269.field4810[0], class190.field3417[0], class6.field127[0], class6.field230[0], class268.field4715);
        class261.method1739(26);
        return arg0 == -22811 ? var1 : null;
    }

    @OriginalMember(owner = "client!ik", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3946++;
    }

    @OriginalMember(owner = "client!ik", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3942++;
        if (class232.field4089 != null) {
            class208.field3748 = 0;
            class135.field2426 = arg0.getX();
            class161.field2942 = arg0.getY();
        }
    }
}
