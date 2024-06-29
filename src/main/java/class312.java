import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class312 {

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public int field4563;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Lsd;")
    public static class74 field4558 = new class74(30, -1);

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "Lcf;")
    public static class153 field4557;

    @OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field4561++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z", line = 15)
    public static final boolean method1932(int arg0) {
        field4560++;
        class158 var1 = (class158) class485.field6882.field1985.field1777;
        if (var1 == null || class485.field6882.field1985 == var1) {
            return false;
        } else {
            if (var1.field1889 >= 2000) {
                var1.field1889 -= 2000;
            }
            return ~var1.field1889 == arg0;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/awt/Color;IZLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V", line = 38)
    public static final void method1933(int arg0, Color arg1, int arg2, boolean arg3, Color arg4, Color arg5, String arg6) {
        field4559++;
        try {
            Graphics var7 = class126.field1542.getGraphics();
            if (class323.field4667 == null) {
                class323.field4667 = new Font("Helvetica", 1, 13);
            }
            if (arg3) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class110.field1336, class464.field6541);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (class45.field569 == null) {
                    class45.field569 = class126.field1542.createImage(304, 34);
                }
                Graphics var8 = class45.field569.getGraphics();
                var8.setColor(arg4);
                var8.drawRect(0, 0, 303, 33);
                if (arg2 != -21572) {
                    method1932(9);
                }
                var8.setColor(arg1);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var8.setFont(class323.field4667);
                var8.setColor(arg5);
                var8.drawString(arg6, (304 - (arg6.length() * 6)) / 2, 22);
                var7.drawImage(class45.field569, class110.field1336 / 2 - 152, class464.field6541 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class110.field1336 / 2 - 152;
                int var10 = class464.field6541 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var7.setFont(class323.field4667);
                var7.setColor(arg5);
                var7.drawString(arg6, var9 + (304 - (arg6.length() * 6)) / 2, var10 + 22);
            }
            if (class334.field4814 != null) {
                var7.setFont(class323.field4667);
                var7.setColor(arg5);
                var7.drawString(class334.field4814, class110.field1336 / 2 - (class334.field4814.length() * 6 / 2), class464.field6541 / 2 - 26);
            }
        } catch (Exception var12) {
            class126.field1542.repaint();
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 118)
    public static void method1934(boolean arg0) {
        field4557 = null;
        if (arg0) {
            method1935((byte) -88);
        }
        field4558 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 129)
    public static final void method1935(byte arg0) {
        field4562++;
        class282.field4114.method1169(1076);
        if (arg0 != 63) {
            method1935((byte) 43);
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(II)V", line = 141)
    public class312(int arg0, int arg1) {
        this.field4563 = arg0;
    }
}
