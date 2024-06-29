import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class7 {

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Z")
    public static boolean field85 = false;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lij;", line = 11)
    public static final class90 method50(int arg0, int arg1) {
        field86++;
        if (arg0 != 128) {
            method51(124, 117, (class320) null, 117, (class149) null, 59, -55, (class196) null);
        }
        class90 var2 = (class90) class225.field3576.method1619((long) arg1, 58);
        if (var2 != null) {
            return var2;
        }
        class90 var3 = class36.method234(class139.field2084, false, class79.field1189, arg1, (byte) 48);
        if (var3 != null) {
            class225.field3576.method1621((long) arg1, 22, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILc;ILch;IILek;)V", line = 46)
    public static final void method51(int arg0, int arg1, class320 arg2, int arg3, class149 arg4, int arg5, int arg6, class196 arg7) {
        class197 var8 = new class197();
        if (arg1 != -22958) {
            return;
        }
        field84++;
        var8.field3238 = arg3;
        var8.field3225 = arg5 * 128;
        var8.field3226 = arg0 * 128;
        if (arg4 != null) {
            var8.field3242 = arg4.field2218;
            var8.field3241 = arg4.field2224 * 128;
            var8.field3227 = arg4.field2247;
            int var10 = arg4.field2278;
            int var11 = arg4.field2253;
            var8.field3243 = arg4.field2240;
            if (arg6 == 1 || arg6 == 3) {
                var11 = arg4.field2278;
                var10 = arg4.field2253;
            }
            var8.field3236 = arg4.field2270;
            var8.field3239 = (arg0 + var11) * 128;
            var8.field3237 = arg4;
            var8.field3229 = (arg5 + var10) * 128;
            var8.field3235 = arg4.field2287;
            if (arg4.field2223 != null) {
                var8.field3231 = true;
                var8.method1442(125);
            }
            if (var8.field3242 != null) {
                var8.field3228 = var8.field3243 + (int) ((double) (var8.field3227 - var8.field3243) * Math.random());
            }
            class114.field1709.method1815((byte) -122, var8);
        } else if (arg7 != null) {
            var8.field3244 = arg7;
            class118 var9 = arg7.field3210;
            if (var9.field1786 != null) {
                var8.field3231 = true;
                var9 = var9.method819((byte) -9);
            }
            if (var9 != null) {
                var8.field3229 = (var9.field1808 + arg5) * 128;
                var8.field3239 = (var9.field1808 + arg0) * 128;
                var8.field3236 = class113.method780(122, arg7);
                var8.field3235 = var9.field1788;
                var8.field3241 = var9.field1763 * 128;
            }
            class287.field4526.method1815((byte) 52, var8);
        } else if (arg2 != null) {
            var8.field3234 = arg2;
            var8.field3239 = (arg2.method910(arg1 ^ 0x59AD) + arg0) * 128;
            var8.field3229 = (arg2.method910(-1) + arg5) * 128;
            var8.field3236 = class340.method2347((byte) 87, arg2);
            var8.field3235 = arg2.field5007;
            var8.field3241 = arg2.field4991 * 128;
            class55.field722.method1750(var8, (byte) 119, class232.method1669(arg1 + 22995, arg2.field5003));
        }
    }
}
