import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class128 extends class287 {

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field2092 = 3;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Z")
    public static boolean field2096 = false;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[Ltl;")
    public static class59[] field2095 = new class59[100];

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Ltl;")
    public static class59 field2097 = class85.method639("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 9588);

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public int field2105;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Lma;")
    public class263 field2104;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "Lma;")
    public class263 field2110;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Ltl;")
    public class59 field2094;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Z")
    public boolean field2098;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field2103;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lim;ILjava/awt/Frame;)V", line = 12)
    public static final void method938(class175 arg0, int arg1, Frame arg2) {
        while (true) {
            class257 var3 = arg0.method1299(-20648, arg2);
            while (var3.field4256 == 0) {
                class183.method1360(false, 10L);
            }
            if (var3.field4256 == 1) {
                int var4 = -61 % ((arg1 - 5) / 56);
                field2107++;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class183.method1360(false, 100L);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZLtl;)V", line = 38)
    public static final void method939(int arg0, boolean arg1, class59 arg2) {
        byte var3 = 4;
        int var4 = 112 / ((arg0 - 29) / 37);
        int var5 = var3 + 6;
        int var6 = var3 + 6;
        field2093++;
        int var7 = class69.field1062.method701(arg2, 250);
        int var8 = class69.field1062.method717(arg2, 250) * 13;
        if (class55.field815) {
            class240.method1688(var6 - var3, -var3 + var5, var3 + var7 + var3, var3 + var8 - -var3, 0);
            class240.method1680(var6 - var3, -var3 + var5, var3 + var7 + var3, var3 + var8 - -var3, 16777215);
        } else {
            class272.method1892(var6 - var3, -var3 + var5, var3 + var7 + var3, var8 - -var3 + var3, 0);
            class272.method1899(var6 - var3, var5 - var3, var3 + var7 + var3, var3 + var8 + var3, 16777215);
        }
        class69.field1062.method712(arg2, var6, var5, var7, var8, 16777215, -1, 1, 1, 0);
        class120.method895(var3 + var7 + var3, (byte) 1, var5 - var3, var8 - -var3 + var3, var6 - var3);
        if (!arg1) {
            class167.method1182((byte) -4, var7, var6, var8, var5);
        } else if (class55.field815) {
            class55.method416();
        } else {
            try {
                Graphics var9 = class160.field2607.getGraphics();
                class221.field3582.method357(0, 0, 1, var9);
            } catch (Exception var11) {
                class160.field2607.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V", line = 102)
    public static void method940(int arg0) {
        if (arg0 == 16777215) {
            field2097 = null;
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)Z", line = 115)
    public static final boolean method941(int arg0) {
        field2099++;
        try {
            if (class212.field3471 == 2) {
                if (class23.field300 == null) {
                    class23.field300 = class192.method1406(class149.field2442, class219.field3566, class97.field1561);
                    if (class23.field300 == null) {
                        return false;
                    }
                }
                if (class173.field2842 == null) {
                    class173.field2842 = new class125(class176.field2885, class19.field256);
                }
                if (class84.field1316.method1594(22050, class173.field2842, class183.field3068, ~arg0, class23.field300)) {
                    class84.field1316.method1604((byte) 122);
                    class84.field1316.method1597(class7.field92, (byte) -122);
                    class84.field1316.method1578(class228.field3687, class23.field300, 1);
                    class149.field2442 = null;
                    class173.field2842 = null;
                    class212.field3471 = 0;
                    class23.field300 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class84.field1316.method1570((byte) -93);
            class149.field2442 = null;
            class173.field2842 = null;
            class23.field300 = null;
            class212.field3471 = 0;
        }
        if (arg0 != 0) {
            field2097 = (class59) null;
        }
        return false;
    }
}
