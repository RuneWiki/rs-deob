import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class216 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
    public static boolean field2939 = false;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field2943 = 0;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lka;")
    public class299 field2944;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lr;")
    public class736 field2942;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2940++;
        if (arg5 >= 1 && arg8 >= 1 && arg5 <= (class240.field3280 - 2) && (class276.field3602 - 2) >= arg8) {
            int var9 = arg7;
            if (arg7 < 3 && class433.method2484(arg8, arg6 ^ 0x43F1, arg5)) {
                var9 = arg7 + 1;
            }
            if (class485.field6252.field6942.method2278(false) == 0 && !class408.method2373(class711.field9393, 16, arg8, arg5, var9)) {
                return;
            }
            if (class28.field252 == null) {
                return;
            }
            class731.field9578.method4083(arg5, class576.field7320, arg0, class179.field2391[arg7], -30419, arg8, arg7);
            if (arg2 >= 0) {
                int var10 = class485.field6252.field6938.method2223(false);
                class485.field6252.method2986(1, class485.field6252.field6938, (byte) 109);
                class731.field9578.method4079(var9, arg5, arg3, class179.field2391[arg7], arg8, 125, arg2, arg1, class576.field7320, arg4, arg7);
                class485.field6252.method2986(var10, class485.field6252.field6938, (byte) 65);
            }
        }
        if (arg6 != 17393) {
            field2943 = -44;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILjba;)V")
    public static final void method1423(int arg0, int arg1, class11 arg2) {
        field2938++;
        if (class303.field3823 >= 50 || arg2 == null || arg2.field95 == null || arg2.field95.length <= arg0 || arg2.field95[arg0] == null) {
            return;
        }
        int var3 = arg2.field95[arg0][arg1];
        int var4 = var3 >> 8;
        if (arg2.field95[arg0].length > 1) {
            int var5 = (int) (Math.random() * (double) arg2.field95[arg0].length);
            if (var5 > 0) {
                var4 = arg2.field95[arg0][var5];
            }
        }
        int var6 = var3 >> 5 & 0x7;
        int var7 = 256;
        if (arg2.field117 != null && arg2.field114 != null) {
            var7 = class783.method4296((byte) 57, arg2.field117[arg0], arg2.field114[arg0]);
        }
        if (arg2.field100) {
            class590.method3173(255, var7, 0, 0, false, var6, var4);
        } else {
            class380.method2165(arg1 + 9736, 255, var6, var7, var4, 0);
        }
    }
}
