import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class270 extends class86 {

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field3778 = -1;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field3779 = new String[100];

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "[I")
    public static int[] field3775;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)I")
    public abstract int method1019(byte arg0);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static final void method1648(int arg0) {
        field3776++;
        class265.method1630(false, -118);
        if (class297.field4326 >= 0 && class297.field4326 != 0) {
            class46.method353(class297.field4326, true);
            class297.field4326 = -1;
        }
        if (arg0 != -1) {
            field3779 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
    public static void method1649(int arg0) {
        field3779 = null;
        if (arg0 != 22702) {
            field3779 = null;
        }
        field3775 = null;
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)I")
    public abstract int method1018(int arg0);

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
    public static final void method1650(int arg0) {
        field3780++;
        if (class217.field3043 != null) {
            return;
        }
        if (arg0 != -24453) {
            field3775 = null;
        }
        int var1 = class103.field1387;
        int var2 = class323.field4734;
        int var3 = class452.field6577 - class223.field3156 - var1;
        int var4 = class380.field5667 - class207.field2874 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class75.field1066 == null) {
                var5 = class86.field1182.field668;
            } else {
                var5 = class75.field1066;
            }
            int var6 = 0;
            int var7 = 0;
            if (class75.field1066 == var5) {
                Insets var8 = class75.field1066.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class380.field5667);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class452.field6577, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class452.field6577 - var3, var7, var3, class380.field5667);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class380.field5667 - var4, class452.field6577, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)V")
    public static final void method1651(byte arg0) {
        field3777++;
        if (arg0 >= -7 || class348.field5044 != null && class150.field1944 != null) {
            return;
        }
        class348.field5044 = new int[256];
        class150.field1944 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class348.field5044[var1] = (int) (Math.sin(var2) * 4096.0D);
            class150.field1944[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "(I)I")
    public abstract int method1015(int arg0);

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "(B)J")
    public abstract long method1014(byte arg0);
}
