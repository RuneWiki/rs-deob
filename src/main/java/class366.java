import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class366 extends class34 {

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "Lrb;")
    public static class283 field5255 = new class283(70, 0);

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "B")
    public static byte field5258;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "Lmk;")
    public static class382 field5257;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "Lws;")
    public static class440 field5256;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "[Lo;")
    public static class359[] field5259;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        field5253++;
        int var3 = 127 / (-arg1 / 50);
        return class91.field1463;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z[B)Z")
    public static final boolean method2188(boolean arg0, byte[] arg1) {
        field5254++;
        class319 var2 = new class319(arg1);
        int var3 = var2.method1869(-86);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method1869(-88) == 1;
        if (var4) {
            class27.method173(var2, -124);
        }
        if (!arg0) {
            method2192(88, (byte) -80, 35);
        }
        class23.method141(var2, -65536);
        return true;
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V")
    public static void method2189(int arg0) {
        if (arg0 != 22374) {
            field5259 = null;
        }
        field5257 = null;
        field5256 = null;
        field5259 = null;
        field5255 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lsv;I)Lkj;")
    public static final class200 method2190(class319 arg0, int arg1) {
        if (arg1 != -1) {
            method2191(-37);
        }
        field5250++;
        return new class200(arg0.method1847(arg1 + 116), arg0.method1847(arg1 ^ 0xFFFFFFCB), arg0.method1847(79), arg0.method1847(104), arg0.method1852(arg1 + 1086280489), arg0.method1869(-94));
    }

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
    public static final void method2191(int arg0) {
        field5251++;
        if (class26.field358 != null) {
            return;
        }
        if (arg0 != 0) {
            field5260 = -70;
        }
        int var1 = class122.field1894;
        int var2 = class74.field1046;
        int var3 = class233.field3246 - var1 - class66.field953;
        int var4 = class389.field5618 - class348.field5033 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class391.field5642 == null) {
                var5 = class346.field4985.field2623;
            } else {
                var5 = class391.field5642;
            }
            int var6 = 0;
            int var7 = 0;
            if (class391.field5642 == var5) {
                Insets var8 = class391.field5642.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class389.field5618);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class233.field3246, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class233.field3246 + var6 - var3, var7, var3, class389.field5618);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class389.field5618 - var4, class233.field3246, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
    public class366() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IBI)I")
    public static final int method2192(int arg0, byte arg1, int arg2) {
        field5249++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return arg1 == -2 ? var3 : -14;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(ZII)Z")
    public static final boolean method2193(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2193(false, 92, 34);
        }
        field5252++;
        return (arg1 & 0x800) != 0 | class266.method1572(arg2, arg1, true) || class391.method2317(true, arg1, arg2);
    }
}
