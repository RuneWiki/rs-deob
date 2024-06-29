import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class class472 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[I")
    public static int[] field6400 = new int[13];

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V", line = 8)
    public static final void method2717(int arg0) {
        field6401++;
        if (arg0 != 0) {
            field6400 = null;
        }
        if (class703.field9674 != null) {
            return;
        }
        int var1 = class596.field8354;
        int var2 = class41.field665;
        int var3 = class760.field10464 - class732.field10098 - var1;
        int var4 = class540.field7360 - class108.field1697 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class194.field2956 != null) {
                var5 = class194.field2956;
            } else if (class286.field3936 == null) {
                var5 = class286.field3938;
            } else {
                var5 = class286.field3936;
            }
            int var6 = 0;
            int var7 = 0;
            if (class194.field2956 == var5) {
                Insets var8 = class194.field2956.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class540.field7360);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class760.field10464, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 - (var3 - class760.field10464), var7, var3, class540.field7360);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class540.field7360 - var4, class760.field10464, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V", line = 82)
    public static void method2718(int arg0) {
        if (arg0 != -1) {
            method2718(-127);
        }
        field6400 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)Lofa;")
    public abstract class349 method1530(byte arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public abstract void method1527(int arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public abstract void method1529(boolean arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Z")
    public abstract boolean method1531(int arg0, int arg1);
}
