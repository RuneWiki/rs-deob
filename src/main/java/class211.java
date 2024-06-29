import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class211 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Ljd;")
    public static class85 field3703 = class221.method1499("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) -128);

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field3704 = -2;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1448(int arg0) {
        field3703 = null;
        int var1 = -18 / ((arg0 - 42) / 34);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z")
    public static final boolean method1449(int arg0, int arg1) {
        if (arg0 == 3) {
            field3707++;
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Color;IZZLjd;)V")
    public static final void method1450(Color arg0, int arg1, boolean arg2, boolean arg3, class85 arg4) {
        try {
            Graphics var5 = class254.field4389.getGraphics();
            if (class255.field4442 == null) {
                class255.field4442 = new Font("Helvetica", 1, 13);
                class222.field3888 = class254.field4389.getFontMetrics(class255.field4442);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class154.field2664, class154.field2662);
            }
            if (arg3) {
                method1450((Color) null, 116, true, false, (class85) null);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class261.field4615 == null) {
                    class261.field4615 = class254.field4389.createImage(304, 34);
                }
                Graphics var6 = class261.field4615.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class255.field4442);
                var6.setColor(Color.white);
                arg4.method598(22, (304 - arg4.method635(class222.field3888, (byte) 92)) / 2, var6, 0);
                var5.drawImage(class261.field4615, class154.field2664 / 2 - 152, class154.field2662 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class154.field2664 / 2 - 152;
                int var8 = class154.field2662 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var7 + 2, var8 - -2, 300 - (arg1 * 3), 30);
                var5.setFont(class255.field4442);
                var5.setColor(Color.white);
                arg4.method598(var8 + 22, var7 + (-arg4.method635(class222.field3888, (byte) 92) + 304) / 2, var5, 0);
            }
            if (class50.field881 != null) {
                var5.setFont(class255.field4442);
                var5.setColor(Color.white);
                class50.field881.method598(class154.field2662 / 2 - 26, class154.field2664 / 2 + -(class50.field881.method635(class222.field3888, (byte) 92) / 2), var5, 0);
            }
        } catch (Exception var10) {
            class254.field4389.repaint();
        }
        field3701++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILge;Lge;)V")
    public static final void method1451(int arg0, class68 arg1, class68 arg2) {
        class7.field86 = arg1;
        class54.field954 = arg2;
        class95.field1742 = class7.field86.method456(3, -90);
        int var3 = -2 / ((arg0 + 5) / 58);
        field3705++;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Lka;")
    public static final class244 method1452(int arg0, int arg1) {
        field3702++;
        class244 var2 = (class244) class51.field889.method1472((long) arg1, -27162);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class228.field3957.method464(-1, 26, arg1);
        class244 var4 = new class244();
        if (var3 != null) {
            var4.method1653(52, new class247(var3));
        }
        if (arg0 != 1) {
            method1449(63, 88);
        }
        class51.field889.method1468(arg0 - 1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)Lcg;")
    public static final class161 method1453(boolean arg0, int arg1) {
        class161 var2 = (class161) class15.field208.method1269((long) arg1, (byte) 74);
        field3700++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class7.field86.method464(-1, 3, arg1);
        class161 var4 = new class161();
        if (arg0) {
            field3703 = null;
        }
        if (var3 != null) {
            var4.method1060((byte) -13, new class247(var3));
        }
        class15.field208.method1271(-15561, var4, (long) arg1);
        return var4;
    }
}
