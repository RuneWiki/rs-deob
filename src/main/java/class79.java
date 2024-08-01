import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ia")
public class class79 implements KeyListener, FocusListener {

    @OriginalMember(owner = "ia", name = "b", descriptor = "Llf;")
    public static class109 field1559 = class35.method275("<col=ff9040>", 2);

    @OriginalMember(owner = "ia", name = "a", descriptor = "Llf;")
    public static class109 field1558 = class35.method275("logo", 2);

    @OriginalMember(owner = "ia", name = "g", descriptor = "Llf;")
    public static class109 field1564 = class35.method275("Einloggen", 2);

    @OriginalMember(owner = "ia", name = "l", descriptor = "Llf;")
    public static class109 field1569 = class35.method275("<img=0>", 2);

    @OriginalMember(owner = "ia", name = "k", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "ia", name = "m", descriptor = "Llf;")
    public static class109 field1570 = class35.method275("Verbindung abgebrochen)3", 2);

    @OriginalMember(owner = "ia", name = "c", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "ia", name = "d", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "ia", name = "e", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "ia", name = "f", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "ia", name = "h", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "ia", name = "i", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "ia", name = "j", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "ia", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class205.field4019 != null) {
            class77.field1475 = -1;
        }
        field1566++;
    }

    @OriginalMember(owner = "ia", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class205.field4019 != null) {
            int var2 = class93.method676((byte) 117, arg0);
            if (var2 >= 0) {
                int var3 = class115.field2272 + 1 & 0x7F;
                if (class177.field3347 != var3) {
                    class80.field1583[class115.field2272] = -1;
                    class30.field659[class115.field2272] = var2;
                    class115.field2272 = var3;
                }
            }
        }
        field1560++;
        arg0.consume();
    }

    @OriginalMember(owner = "ia", name = "a", descriptor = "(ILvg;IILkf;II)V")
    public static final void method508(int arg0, class200 arg1, int arg2, int arg3, class100 arg4, int arg5, int arg6) {
        int var7 = Math.min(arg1.field3881 / 2, arg1.field3901 / 2);
        field1567++;
        int var8 = arg0 * arg0 + arg6 * arg6;
        if (var7 * var7 < var8 && var8 < 90000) {
            var7 -= 10;
            int var9 = class69.field1343 + class47.field970 & 0x7FF;
            int var10 = class124.field2387[var9];
            int var11 = class124.field2383[var9];
            int var12 = var11 * 256 / (class144.field2780 + 256);
            int var13 = var10 * 256 / (class144.field2780 + 256);
            int var14 = arg6 * var13 - arg0 * var12 >> 16;
            int var15 = arg0 * var13 + arg6 * var12 >> 16;
            double var16 = Math.atan2((double) var15, (double) var14);
            int var18 = (int) ((double) var7 * Math.sin(var16));
            int var19 = (int) (Math.cos(var16) * (double) var7);
            class164.field3076.method722(arg1.field3881 / 2 + arg2 + var18 - 10, arg1.field3901 / 2 + arg5 + -var19 - 10, 20, 20, 15, 15, var16, 256);
        } else {
            class81.method517(arg0, arg2, arg6, arg5, arg4, (byte) 110, arg1);
        }
        int var20 = 21 % ((arg3 + 25) / 60);
    }

    @OriginalMember(owner = "ia", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1562++;
    }

    @OriginalMember(owner = "ia", name = "a", descriptor = "(B)V")
    public static void method509(byte arg0) {
        field1558 = null;
        field1564 = null;
        field1559 = null;
        field1570 = null;
        field1569 = null;
        if (arg0 != 93) {
            method509((byte) 116);
        }
    }

    @OriginalMember(owner = "ia", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1561++;
        if (class205.field4019 != null) {
            class74.field1420 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class107.field2126.length > var2) {
                var3 = class107.field2126[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class77.field1475 >= 0 && var3 >= 0) {
                class159.field2985[class77.field1475] = ~var3;
                class77.field1475 = class77.field1475 + 1 & 0x7F;
                if (class77.field1475 == class55.field1112) {
                    class77.field1475 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "ia", name = "a", descriptor = "(III)Lla;")
    public static final class104 method510(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        return var3 == null ? null : var3.field34;
    }

    @OriginalMember(owner = "ia", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class205.field4019 != null) {
            class74.field1420 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class107.field2126.length) {
                var3 = class107.field2126[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class77.field1475 >= 0 && var3 >= 0) {
                class159.field2985[class77.field1475] = var3;
                class77.field1475 = class77.field1475 + 1 & 0x7F;
                if (class77.field1475 == class55.field1112) {
                    class77.field1475 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class115.field2272 + 1 & 0x7F;
                if (class177.field3347 != var4) {
                    class80.field1583[class115.field2272] = var3;
                    class30.field659[class115.field2272] = -1;
                    class115.field2272 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1565++;
    }
}
