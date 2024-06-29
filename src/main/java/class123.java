import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class123 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lhj;")
    private static class69 field2285 = class181.method1318(" has logged in)3", (byte) -128);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lhj;")
    public static class69 field2280 = field2285;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lhj;")
    public static class69 field2283 = class181.method1318(":tradereq:", (byte) -111);

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[I")
    public static int[] field2292 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lhj;")
    public static class69 field2289 = class181.method1318("p11_full", (byte) -124);

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lnc;")
    public static class83 field2286;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[Lhj;")
    public static class69[] field2281;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method882(byte arg0) {
        field2283 = null;
        field2280 = null;
        field2281 = null;
        field2286 = null;
        field2289 = null;
        if (arg0 == 68) {
            field2292 = null;
            field2285 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method883(int arg0) {
        if (arg0 != 0) {
            method884(-10, 90, 30, -66, 7, -46, -59);
        }
        field2287++;
        class80.field1536.method1713(arg0 ^ 0x2F);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class192 var7 = new class192();
        var7.field3482 = arg1 / 128;
        var7.field3470 = arg2 / 128;
        var7.field3464 = arg3 / 128;
        var7.field3478 = arg4 / 128;
        var7.field3477 = arg0;
        var7.field3468 = arg1;
        var7.field3471 = arg2;
        var7.field3472 = arg3;
        var7.field3475 = arg4;
        var7.field3481 = arg5;
        var7.field3490 = arg6;
        class231.field4228[class51.field893++] = var7;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static final void method885(int arg0) {
        field2282++;
        int var1 = class39.field549;
        int var2 = class46.field667 - class66.field1278 - var1;
        int var3 = class17.field224;
        if (arg0 > -114) {
            return;
        }
        int var4 = class11.field104 - class20.field287 - var3;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class47.field680 != null) {
                var5 = class47.field680;
            } else if (class10.field85 == null) {
                var5 = class36.field508.field601;
            } else {
                var5 = class10.field85;
            }
            int var6 = 0;
            int var7 = 0;
            if (class10.field85 == var5) {
                Insets var8 = class10.field85.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class11.field104);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7, class46.field667, var3);
            }
            if (var2 > 0) {
                var9.fillRect(var6 + class46.field667 - var2, var7, var2, class11.field104);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class11.field104 + var7 - var4, class46.field667, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)[Lhk;")
    public static final class121[] method886(int arg0) {
        int var1 = -82 % ((21 - arg0) / 63);
        field2284++;
        class121[] var2 = new class121[class196.field3573];
        for (int var3 = 0; var3 < class196.field3573; var3++) {
            var2[var3] = new class121(class229.field4196, class53.field941, class138.field2585[var3], class88.field1682[var3], class69.field1350[var3], class113.field2167[var3], class157.field2919[var3], class50.field841);
        }
        class229.method1636((byte) 53);
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIII)V")
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= class201.field3629 && arg4 <= class35.field485 && arg2 >= class19.field252 && class166.field3075 >= arg3) {
            class211.method1526(28, arg0, arg2, arg4, arg3, arg5);
        } else {
            class65.method421(arg5, arg0, arg4, -81, arg2, arg3);
        }
        int var6 = 88 % ((78 - arg1) / 42);
        field2293++;
    }
}
