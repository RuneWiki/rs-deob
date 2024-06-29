import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class526 {

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Z")
    public static boolean field7774 = false;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lgn;")
    public static class526 field7775 = new class526(10, 7);

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Lns;")
    public static class62 field7777 = new class62(0);

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Laa;")
    public static class76 field7779 = new class76(67, 6);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Ljd;")
    public static class414 field7776;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
    public static void method3135(byte arg0) {
        field7777 = null;
        field7776 = null;
        field7775 = null;
        if (arg0 != 76) {
            method3135((byte) 12);
        }
        field7779 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/awt/Color;IZLjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;)V")
    public static final void method3136(Color arg0, int arg1, boolean arg2, String arg3, int arg4, Color arg5, Color arg6) {
        try {
            Graphics var7 = class357.field5469.getGraphics();
            if (class93.field1448 == null) {
                class93.field1448 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class155.field2347, class413.field6241);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class110.field1658 == null) {
                    class110.field1658 = class357.field5469.createImage(304, 34);
                }
                Graphics var8 = class110.field1658.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg6);
                var8.fillRect(2, 2, arg1 * 3, 30);
                int var9 = 30 / ((arg4 + 29) / 46);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var8.setFont(class93.field1448);
                var8.setColor(arg0);
                var8.drawString(arg3, (304 - (arg3.length() * 6)) / 2, 22);
                var7.drawImage(class110.field1658, class155.field2347 / 2 - 152, class413.field6241 / 2 + -18, null);
            } catch (Exception var12) {
                int var10 = class155.field2347 / 2 - 152;
                int var11 = class413.field6241 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg6);
                var7.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + var10 + 2, var11 - -2, 300 - (arg1 * 3), 30);
                var7.setFont(class93.field1448);
                var7.setColor(arg0);
                var7.drawString(arg3, (304 - (arg3.length() * 6)) / 2 + var10, var11 - -22);
            }
            if (class128.field1917 != null) {
                var7.setFont(class93.field1448);
                var7.setColor(arg0);
                var7.drawString(class128.field1917, class155.field2347 / 2 - (class128.field1917.length() * 6 / 2), class413.field6241 / 2 + -26);
            }
        } catch (Exception var13) {
            class357.field5469.repaint();
        }
        field7772++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
    public static final void method3137(int arg0, int arg1) {
        field7778++;
        if (class411.field6213 == arg0) {
            return;
        }
        if (class411.field6213 == 0) {
            class34.method287(123);
        }
        if (arg0 == 12) {
            class134.method987(class42.field553, 500, class462.field6730, class368.field5603);
        }
        if (arg1 != 2270) {
            field7779 = null;
        }
        if (arg0 != 12 && class133.field1984 != null) {
            class133.field1984.method669((byte) 27);
            class133.field1984 = null;
        }
        if (arg0 == 2) {
            class500.method2970(-3, class476.field7026 != class256.field3477);
        }
        if (arg0 == 6) {
            class148.method1076(188, class256.field3477 != class100.field1525);
        }
        if (arg0 == 4) {
            class365.method2181(class462.field6730, (byte) 119, class368.field5603);
        } else if (arg0 == 5) {
            class134.method987(class42.field553, 500, class462.field6730, class368.field5603);
        } else if (arg0 == 8) {
            class134.method987(class42.field553, arg1 ^ 0x92A, class462.field6730, class368.field5603);
        } else if (arg0 == 11) {
            class365.method2181(class462.field6730, (byte) 117, class368.field5603);
        }
        if (class26.method256(716, class411.field6213)) {
            class292.field4376.field1051 = 2;
            class7.field61.field1051 = 2;
            class12.field122.field1051 = 2;
            class36.field499.field1051 = 2;
            class509.field7486.field1051 = 2;
            class303.field4519.field1051 = 2;
            class488.field7279.field1051 = 2;
        }
        if (class26.method256(716, arg0)) {
            class314.field4856 = 0;
            class245.field3393 = 0;
            class389.field5863 = 0;
            class470.field6885 = 1;
            class480.field7097 = 1;
            class151.method1090(true, (byte) 67);
            class292.field4376.field1051 = 1;
            class7.field61.field1051 = 1;
            class12.field122.field1051 = 1;
            class36.field499.field1051 = 1;
            class509.field7486.field1051 = 1;
            class303.field4519.field1051 = 1;
            class488.field7279.field1051 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class302.method1882((byte) 31);
        }
        if (arg0 == 1) {
            class157.method1120(class142.field2146, 0, class407.field6147);
        } else {
            class326.method2029(false);
        }
        boolean var2 = arg0 == 1 || class119.method899(arg0, -3) || class11.method106(arg0, -124);
        boolean var3 = class411.field6213 == 1 || class119.method899(class411.field6213, -3) || class11.method106(class411.field6213, arg1 - 2380);
        if (var3 != var2) {
            if (var2) {
                class120.field1840 = class427.field6369;
                if (class454.field6661.field980 == 0) {
                    class12.method165(2, (byte) 104);
                } else {
                    class304.method1898(class497.field7381, class454.field6661.field980, class427.field6369, 0, (byte) -58, false, 2);
                }
                class264.field3946.method1787(false, arg1 - 2270);
            } else {
                class12.method165(2, (byte) 96);
                class264.field3946.method1787(true, 0);
            }
        }
        if (class26.method256(arg1 ^ 0xA12, arg0) || arg0 == 12) {
            class407.field6147.method74();
        }
        class411.field6213 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7773++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(II)V")
    public class526(int arg0, int arg1) {
    }
}
