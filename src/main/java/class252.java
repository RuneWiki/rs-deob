import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class252 {

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Lve;")
    public static class255 field4246 = class87.method607(103, "<col=ffff00>");

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lff;")
    public static class47 field4244 = new class47(16);

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lve;")
    public static class255 field4249 = class87.method607(118, "www)2wtrc");

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
    public static int[] field4248 = new int[] { 7, 0, 0, 0, 0, 2, 3, 0, 0, 12, 8, -1, 0, 0, 12, -1, 2, -2, 0, 0, 0, 0, 9, 2, 0, 0, 5, 0, 0, -2, 0, 0, 0, 8, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 10, 0, 0, 0, -2, 20, 0, 0, 0, 5, 10, -2, 0, 2, 0, 0, 4, -1, 0, 0, 2, 0, 0, 3, 6, 0, 10, 1, 10, -2, 0, 5, 0, 0, 0, 0, 0, -1, 0, 6, 8, 0, 8, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, -2, 15, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 2, 14, 0, 0, 7, 6, 0, 0, 0, 1, 24, -2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, -1, 0, 0, 0, 0, -2, 3, 0, 4, 0, 4, -2, 0, 0, 0, 0, -1, 0, 0, 6, 0, 6, 0, 0, 0, -2, 7, 0, 0, 0, 5, 5, 0, 0, 1, -2, 0, 8, 0, 0, 7, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0, 0, 3, 0, 15, 0, 0, 0, -1, 1, 6, 0, 0, 0, 8, 0, -1, 0, 14, 6, 4, 0, 0, 0, 0, 0, 0, 0, -2, 5, 0 };

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[Ldm;")
    public static class273[] field4245;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 36)
    public static final void method1726(byte arg0) {
        field4242++;
        if (arg0 <= 119) {
            return;
        }
        int var1 = class162.field2728;
        int var2 = class64.field965;
        int var3 = class289.field4980 - class210.field3589 - var2;
        int var4 = class107.field1790 - class201.field3479 - var1;
        if (var2 <= 0 && var3 <= 0 && var1 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class307.field5221 != null) {
                var5 = class307.field5221;
            } else if (class37.field561 == null) {
                var5 = class221.field3728.field626;
            } else {
                var5 = class37.field561;
            }
            int var6 = 0;
            int var7 = 0;
            if (class37.field561 == var5) {
                Insets var8 = class37.field561.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var6, var7, var2, class107.field1790);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class289.field4980, var1);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class289.field4980 - var3, var7, var3, class107.field1790);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class107.field1790 + var7 - var4, class289.field4980, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)J", line = 108)
    public static final long method1727(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        return var3 == null || var3.field4192 == null ? 0L : var3.field4192.field3674;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V", line = 126)
    public static void method1728(byte arg0) {
        field4244 = null;
        field4245 = null;
        field4248 = null;
        if (arg0 != 38) {
            field4245 = (class273[]) null;
        }
        field4246 = null;
        field4249 = null;
    }
}
