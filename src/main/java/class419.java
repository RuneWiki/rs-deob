import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class419 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field5717 = -1;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[Lsj;")
    public static class432[] field5715 = new class432[29];

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field5720 = 12;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Ltg;")
    public static class439 field5721;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "[Leb;")
    public static class54[] field5724;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[[[B")
    public static byte[][][] field5719;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5716++;
        class453 var7 = class378.method2346(-23490, arg5, arg4);
        if (var7 == null) {
            return;
        }
        if (var7.field6321 != null) {
            class221 var8 = new class221();
            var8.field2732 = var7;
            var8.field2735 = var7.field6321;
            class93.method578(var8);
        }
        class105.field1248 = arg0;
        class122.field1384 = arg1;
        class272.field3513 = arg3;
        if (arg6 != 0) {
            return;
        }
        class416.field5698 = var7.field6358;
        class104.field1224 = true;
        class46.field530 = arg2;
        class62.field759 = arg5;
        class357.field4844 = arg4;
        class303.method1923(var7, 10240);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method2570(int arg0) {
        if (arg0 != 0) {
            method2570(98);
        }
        class365 var1 = class242.field3196;
        synchronized (class242.field3196) {
            class242.field3196.method2290(13831);
        }
        field5722++;
        class365 var2 = class231.field3036;
        synchronized (class231.field3036) {
            class231.field3036.method2290(arg0 ^ 0x3607);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method2571(int arg0) {
        field5723++;
        if (class53.field620 != null) {
            return;
        }
        if (arg0 != 29) {
            field5721 = null;
        }
        int var1 = class398.field5402;
        int var2 = class236.field3104;
        int var3 = class283.field3693 - var1 - class39.field457;
        int var4 = class450.field6290 - class28.field315 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class167.field1942 == null) {
                var5 = class401.field5525.field6077;
            } else {
                var5 = class167.field1942;
            }
            int var6 = 0;
            int var7 = 0;
            if (class167.field1942 == var5) {
                Insets var8 = class167.field1942.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class450.field6290);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class283.field3693, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class283.field3693 + var6 - var3, var7, var3, class450.field6290);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class450.field6290 - var4, class283.field3693, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static final void method2572(boolean arg0) {
        field5718++;
        if (class252.field3301 != null) {
            class252.field3301.method1105((byte) 37);
        }
        if (class424.field5811 != null) {
            class424.field5811.method1105((byte) 37);
        }
        if (arg0) {
            field5721 = null;
        }
        class453.method2800(class373.field5049, (byte) -111, 2, 22050);
        class252.field3301 = class334.method2138(class357.field4845, 22050, class401.field5525, 0, -1);
        class252.field3301.method1110(class217.field2666, 77);
        class424.field5811 = class334.method2138(class357.field4845, 2048, class401.field5525, 1, -1);
        class424.field5811.method1110(class352.field4781, 51);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method2573(byte arg0) {
        field5724 = null;
        field5719 = null;
        field5721 = null;
        if (arg0 == -84) {
            field5715 = null;
        }
    }
}
