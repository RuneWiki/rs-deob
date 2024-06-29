import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class133 {

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field2312 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Luf;")
    public static class164 field2310;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2307;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public static final void method922(int arg0, int arg1, int arg2, int arg3, String arg4) {
        field2309++;
        class46 var5 = class285.method1902(arg0, arg1, arg3 + 8);
        if (var5 == null) {
            return;
        }
        if (var5.field771 != null) {
            class198 var6 = new class198();
            var6.field3205 = var5;
            var6.field3193 = arg2;
            var6.field3204 = var5.field771;
            var6.field3192 = arg4;
            class71.method434(-10521, var6);
        }
        boolean var7 = true;
        if (var5.field777 > 0) {
            var7 = class5.method28((byte) 93, var5);
        }
        if (!var7 || !client.method1922(var5).method1256(arg2 - 1, (byte) -26)) {
            return;
        }
        if (arg2 == 1) {
            class168.field2778.method199(182, 122);
            class168.field2778.method698(118, arg0);
            class61.field1063++;
            class168.field2778.method639(arg1, 15267);
        }
        if (~arg2 == arg3) {
            class225.field3783++;
            class168.field2778.method199(209, arg3 ^ 0x77);
            class168.field2778.method698(118, arg0);
            class168.field2778.method639(arg1, 15267);
        }
        if (arg2 == 3) {
            class168.field2778.method199(250, 124);
            class168.field2778.method698(97, arg0);
            class20.field313++;
            class168.field2778.method639(arg1, 15267);
        }
        if (arg2 == 4) {
            class168.field2778.method199(186, 25);
            class2.field19++;
            class168.field2778.method698(arg3 ^ 0xFFFFFF93, arg0);
            class168.field2778.method639(arg1, 15267);
        }
        if (arg2 == 5) {
            class195.field3157++;
            class168.field2778.method199(222, -7);
            class168.field2778.method698(96, arg0);
            class168.field2778.method639(arg1, 15267);
        }
        if (arg2 == 6) {
            class9.field98++;
            class168.field2778.method199(110, -87);
            class168.field2778.method698(97, arg0);
            class168.field2778.method639(arg1, arg3 ^ 0xFFFFC45E);
        }
        if (arg2 == 7) {
            class52.field911++;
            class168.field2778.method199(251, arg3 + 124);
            class168.field2778.method698(-65, arg0);
            class168.field2778.method639(arg1, 15267);
        }
        if (arg2 == 8) {
            class172.field2819++;
            class168.field2778.method199(255, 124);
            class168.field2778.method698(arg3 ^ 0xFFFFFF9B, arg0);
            class168.field2778.method639(arg1, 15267);
        }
        if (arg2 == 9) {
            class15.field201++;
            class168.field2778.method199(217, arg3 ^ 0x7B);
            class168.field2778.method698(arg3 + 128, arg0);
            class168.field2778.method639(arg1, 15267);
        }
        if (arg2 == 10) {
            class196.field3180++;
            class168.field2778.method199(77, arg3 - 52);
            class168.field2778.method698(-24, arg0);
            class168.field2778.method639(arg1, 15267);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method923(int arg0) {
        field2310 = null;
        if (arg0 != 0) {
            method923(-26);
        }
        field2307 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILcj;IIILdl;)V")
    public static final void method924(int arg0, int arg1, class74 arg2, int arg3, int arg4, int arg5, class46 arg6) {
        field2313++;
        if (arg2 == null) {
            return;
        }
        int var7 = arg4 * arg4 + arg5 * arg5;
        int var8 = (int) class106.field1900 + class173.field2833 & 0x7FF;
        int var9 = Math.max(arg6.field701 / 2, arg6.field715 / arg0) + 10;
        if (var7 > var9 * var9) {
            return;
        }
        int var10 = class287.field4567[var8];
        int var11 = var10 * 256 / (class231.field3871 + 256);
        int var12 = class287.field4562[var8];
        int var13 = var12 * 256 / (class231.field3871 + 256);
        int var14 = arg5 * var13 - (arg4 * var11) >> 16;
        int var15 = arg4 * var13 + arg5 * var11 >> 16;
        ((class197) arg2).method1310(arg6.field701 / 2 + (var15 - arg2.field1230 / 2) + arg3, arg6.field715 / 2 + -var14 + -(arg2.field1227 / 2) + arg1, arg6.field671, arg6.field714);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Lie;")
    public static final class47 method925(int arg0, byte arg1) {
        field2311++;
        class47 var2 = (class47) class204.field3333.method57((long) arg0, -118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class258.field4219.method746(class286.method1908(arg0, (byte) 70), (byte) -128, class228.method1535(-2023748438, arg0));
        class47 var4 = new class47();
        if (var3 != null) {
            var4.method295((byte) -128, new class101(var3));
        }
        if (arg1 <= 37) {
            field2310 = null;
        }
        class204.field3333.method62(0, var4, (long) arg0);
        return var4;
    }
}
