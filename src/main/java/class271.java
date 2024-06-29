import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class271 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lrm;")
    public static class184 field4200 = new class184(16);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field4207 = 0;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4208 = "Close";

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field4209 = -1;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "F")
    public static float field4205;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public int field4202;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lcl;")
    public static class114 field4210;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 11)
    public static void method1913(byte arg0) {
        field4200 = null;
        field4208 = null;
        field4210 = null;
        if (arg0 != -76) {
            method1913((byte) -23);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)Z", line = 27)
    public static final boolean method1914(int arg0, int arg1, int arg2, int arg3) {
        if (class307.method2124(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class117.method830(var4 + 1, class172.field2843[arg0][arg1][arg2] + arg3, var5 + 1) && class117.method830(var4 + 128 - 1, class172.field2843[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class117.method830(var4 + 128 - 1, class172.field2843[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class117.method830(var4 + 1, class172.field2843[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V", line = 54)
    public static final void method1915(byte arg0) {
        if (arg0 >= -30) {
            field4210 = (class114) null;
        }
        field4204++;
        int var1 = class333.field5186;
        int var2 = class200.field3208;
        int var3 = class287.field4434 - class127.field1841 - var1;
        int var4 = class333.field5181 - (class95.field1258 + var2);
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class134.field1966 != null) {
                var5 = class134.field1966;
            } else if (class184.field2976 == null) {
                var5 = class42.field581.field2181;
            } else {
                var5 = class184.field2976;
            }
            int var6 = 0;
            int var7 = 0;
            if (class184.field2976 == var5) {
                Insets var8 = class184.field2976.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class333.field5181);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class287.field4434, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class287.field4434 + var6 - var3, var7, var3, class333.field5181);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class333.field5181 + var7 - var4, class287.field4434, var4);
            }
        } catch (Exception var11) {
        }
    }
}
