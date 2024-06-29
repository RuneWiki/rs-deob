import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class219 extends class79 {

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    public int field3345 = -1;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "Lbd;")
    public static class44 field3344 = new class44("M", "M", "M", "M");

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "I")
    public static int field3349 = 503;

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "Z")
    public static boolean field3351 = false;

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "F")
    public static float field3348;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!vv", name = "A", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "Ljava/lang/String;")
    public String field3343;

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "Ljava/lang/String;")
    public String field3346;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static final void method1485(byte arg0) {
        ++field3350;
        if (class230.field3443 == null) {
            int var1 = class360.field5250;
            int var2 = class245.field3670;
            if (arg0 < 107) {
                method1486(-76);
            }
            int var3 = -class50.field927 + class228.field3431 + -var1;
            int var4 = -var2 + class299.field4463 + -class76.field1247;
            if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
                try {
                    Container var5;
                    if (class70.field1153 != null) {
                        var5 = class70.field1153;
                    } else {
                        var5 = class280.field4173.field5824;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class70.field1153 == var5) {
                        Insets var8 = class70.field1153.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (~var1 < -1) {
                        var9.fillRect(var6, var7, var1, class299.field4463);
                    }
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, class228.field3431, var2);
                    }
                    if (~var3 < -1) {
                        var9.fillRect(-var3 + var6 + class228.field3431, var7, var3, class299.field4463);
                    }
                    if (var4 > 0) {
                        var9.fillRect(var6, class299.field4463 + var7 + -var4, class228.field3431, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)V")
    public static final void method1486(int arg0) {
        class336.field4972.method1447(true);
        ++field3342;
        if (arg0 != 0) {
            field3349 = -105;
        }
        class479.field6987 = null;
        class92.field1478 = 1;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V")
    public static void method1487(boolean arg0) {
        field3344 = null;
        if (!arg0) {
            field3348 = 1.1193734F;
        }
    }

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "(I)Lrc;")
    public final class383 method1488(int arg0) {
        if (arg0 != 0) {
            method1487(true);
        }
        ++field3352;
        return class10.field100[super.field1286];
    }
}
