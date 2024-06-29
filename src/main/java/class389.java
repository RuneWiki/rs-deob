import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class389 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Lvd;")
    public static class261 field5702;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ll;ZILgt;Ljava/awt/Canvas;)Lza;")
    public static final class299 method2461(class127 arg0, boolean arg1, int arg2, class66 arg3, Canvas arg4) {
        field5703++;
        if (arg1) {
            method2463(null, 18, 122);
        }
        return new class69(arg2, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method2462(boolean arg0) {
        if (arg0) {
            field5699 = -36;
        }
        field5702 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public abstract void method1433(int arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lum;II)Lap;")
    public static final class29 method2463(class83 arg0, int arg1, int arg2) {
        field5700++;
        if (arg1 <= 123) {
            return null;
        } else {
            byte[] var3 = arg0.method735(arg2, 0);
            return var3 == null ? null : new class29(var3);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)J")
    public abstract long method1430(int arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILeg;II)Ltr;")
    public static final class247 method2464(int arg0, class34 arg1, int arg2, int arg3) {
        field5701++;
        int var4 = arg1.field411 | arg2 << 8;
        class247 var5 = (class247) class298.field4580.method3008((long) var4 << 16, (byte) 123);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class151.field2261.method735(class151.field2261.method753(arg3 ^ 0x45, var4), arg3 ^ arg3);
        if (var6 == null) {
            int var8 = arg0 + 65536 << 8 | arg1.field411;
            class247 var9 = (class247) class298.field4580.method3008((long) var8 << 16, (byte) 103);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class151.field2261.method735(class151.field2261.method753(86, var8), 0);
            if (var10 == null) {
                int var12 = arg1.field411 | 0xFFFF00;
                class247 var13 = (class247) class298.field4580.method3008((long) var12 << 16, (byte) 117);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class151.field2261.method735(class151.field2261.method753(113, var12), 0);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class247 var15 = class438.method2713(-2, var14);
                    var15.field3695 = arg1;
                    class298.field4580.method3011((long) var12 << 16, var15, 107);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class247 var11 = class438.method2713(-2, var10);
                var11.field3695 = arg1;
                class298.field4580.method3011((long) var8 << 16, var11, 89);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class247 var7 = class438.method2713(-2, var6);
            var7.field3695 = arg1;
            class298.field4580.method3011((long) var4 << 16, var7, 120);
            return var7;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)I")
    public abstract int method1431(int arg0, boolean arg1);
}
