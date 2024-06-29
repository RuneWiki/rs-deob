import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lcd;")
    public static class23 field175 = class54.method414("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", -1);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lcd;")
    private static class23 field174 = class54.method414("FULL", -1);

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lcd;")
    public static class23 field177 = class54.method414(" zuerst von Ihrer Ignorieren)2Liste(Q", -1);

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lcd;")
    public static class23 field178 = field174;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field176 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Li;")
    public static class72 field172;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[[[B")
    public static byte[][][] field185;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lcd;")
    public static final class23 method52(int arg0, byte arg1) {
        field182++;
        if (arg1 <= 124) {
            return null;
        } else if (class81.field1771[arg0].method143(-41) <= 0) {
            return class88.field1876[arg0];
        } else {
            return class3.method14(true, new class23[] { class88.field1876[arg0], class183.field3608, class81.field1771[arg0] });
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBII)I")
    public static final int method53(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field179++;
        int var5 = -83 / ((-arg1 - 49) / 45);
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLjava/awt/Color;Lcd;)V")
    public static final void method54(int arg0, byte arg1, Color arg2, class23 arg3) {
        try {
            Graphics var4 = class27.field558.getGraphics();
            if (class73.field1668 == null) {
                class73.field1668 = new Font("Helvetica", 1, 13);
                class69.field1625 = class27.field558.getFontMetrics(class73.field1668);
            }
            if (class21.field433) {
                class21.field433 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class47.field1018, class68.field1595);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class166.field3319 == null) {
                    class166.field3319 = class27.field558.createImage(304, 34);
                }
                Graphics var5 = class166.field3319.getGraphics();
                if (arg1 <= 55) {
                    field183 = -117;
                }
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class73.field1668);
                var5.setColor(Color.white);
                arg3.method148(var5, 22, (304 - arg3.method140(class69.field1625, (byte) 24)) / 2, (byte) 113);
                var4.drawImage(class166.field3319, class47.field1018 / 2 - 152, class68.field1595 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class47.field1018 / 2 - 152;
                int var7 = class68.field1595 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class73.field1668);
                var4.setColor(Color.white);
                arg3.method148(var4, var7 + 22, var6 - -((304 - arg3.method140(class69.field1625, (byte) 51)) / 2), (byte) 113);
            }
        } catch (Exception var9) {
            class27.field558.repaint();
        }
        field180++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
    public static final boolean method55(int arg0) {
        field181++;
        try {
            if (arg0 < 54) {
                method53(-110, (byte) 58, 71, 126);
            }
            if (class190.field3775 == 2) {
                if (class86.field1853 == null) {
                    class86.field1853 = class99.method666(class124.field2540, class91.field1951, class58.field1371);
                    if (class86.field1853 == null) {
                        return false;
                    }
                }
                if (class19.field399 == null) {
                    class19.field399 = new class49(class2.field23, class201.field3974);
                }
                if (class203.field4001.method1295(class86.field1853, class19.field399, 22050, -1, class145.field2960)) {
                    class203.field4001.method1298(false);
                    class203.field4001.method1312(class74.field1683, -119);
                    class203.field4001.method1291(class102.field2185, class86.field1853, 0);
                    class86.field1853 = null;
                    class19.field399 = null;
                    class124.field2540 = null;
                    class190.field3775 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class203.field4001.method1319(-6648);
            class86.field1853 = null;
            class190.field3775 = 0;
            class19.field399 = null;
            class124.field2540 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static void method56(int arg0) {
        field175 = null;
        if (arg0 != 33) {
            field172 = null;
        }
        field177 = null;
        field185 = null;
        field174 = null;
        field178 = null;
        field172 = null;
    }
}
