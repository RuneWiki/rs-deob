import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class87 extends class155 {

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "[Lpg;")
    public static class58[] field1436 = new class58[6];

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "Ldm;")
    public static class20 field1445 = new class20(0, -1);

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field1449 = 0;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1450 = " from your ignore list first.";

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public int field1446;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "Laj;")
    public static class151 field1433;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "Ljava/lang/String;")
    public String field1437;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "[I")
    public int[] field1441;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "[I")
    public int[] field1444;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "[Luj;")
    public class132[] field1438;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field1440;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIIIBII)V")
    public static final void method609(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class208.field3522 = arg2;
        class189.field3026 = arg1;
        class233.field3939 = arg3;
        class31.field508 = arg5;
        field1442++;
        class145.field2385 = arg6;
        if (arg0 && class145.field2385 >= 100) {
            class76.field1302 = class233.field3939 * 128 + 64;
            class107.field1758 = class208.field3522 * 128 + 64;
            class263.field4393 = class277.method1939(class182.field2898, class107.field1758, class76.field1302, (byte) -34) - class31.field508;
        }
        if (arg4 <= 117) {
            method612(74);
        }
        class169.field2739 = 2;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method610(int arg0, Component arg1) {
        arg1.removeMouseListener(class109.field1791);
        arg1.removeMouseMotionListener(class109.field1791);
        field1447++;
        arg1.removeFocusListener(class109.field1791);
        class35.field554 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static final void method611(boolean arg0) {
        int var1 = class171.field2775;
        field1434++;
        if (!arg0) {
            method611(false);
        }
        int var2 = class49.field838;
        int var3 = class145.field2390 - (class182.field2901 + var1);
        int var4 = class61.field1051 - class155.field2567 - var2;
        if (var2 <= 0 && var4 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class218.field3682 != null) {
                var5 = class218.field3682;
            } else if (class64.field1086 == null) {
                var5 = class142.field2344.field1380;
            } else {
                var5 = class64.field1086;
            }
            int var6 = 0;
            int var7 = 0;
            if (class64.field1086 == var5) {
                Insets var8 = class64.field1086.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var6, var7, var2, class145.field2390);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class61.field1051, var1);
            }
            if (var4 > 0) {
                var9.fillRect(class61.field1051 + var6 - var4, var7, var4, class145.field2390);
            }
            if (var3 > 0) {
                var9.fillRect(var6, class145.field2390 + var7 - var3, class61.field1051, var3);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "(I)V")
    public static void method612(int arg0) {
        field1445 = null;
        field1436 = null;
        field1433 = null;
        field1450 = null;
        if (arg0 != -2) {
            method612(49);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)I")
    public static final int method613(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1435++;
        if (arg3 < 84) {
            method610(70, (Component) null);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }
}
