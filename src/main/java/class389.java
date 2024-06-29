import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class389 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field4973 = -1;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!bp", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4974++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIIII)V", line = 16)
    public static final void method2211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 8 && arg3 != 16) {
            class14 var7 = class197.field2689[arg2][arg5][arg0];
            if (var7 == null) {
                var7 = new class14(arg2);
            }
            if (arg3 == 1) {
                var7.field280 = (short) arg1;
                var7.field285 = (short) arg4;
            } else if (arg3 == 2) {
                var7.field286 = (short) arg4;
                var7.field281 = (short) arg1;
            }
            if (class561.field7908) {
                class701.method3946(false);
            }
        } else if (arg3 == 8) {
            int var14 = arg5 << class480.field6531;
            int var15 = var14 + class699.field9729;
            int var16 = arg0 << class480.field6531;
            int var17 = class699.field9729 + var16;
            int var18 = class707.field9826[arg2].method1677(arg0, (byte) 49, arg5);
            int var19 = class707.field9826[arg2].method1677(arg0 + 1, (byte) 51, arg5 + 1);
            class737.field10238[class291.field3814++] = new class222(arg3, arg2, var14, var15, var15, var14, var18, var19, var19 - arg4, var18 - arg4, var16, var17, var17, var16);
        } else {
            int var8 = (arg5 << class480.field6531) + class699.field9729;
            int var9 = var8 - class699.field9729;
            int var10 = arg0 << class480.field6531;
            int var11 = class699.field9729 + var10;
            int var12 = class707.field9826[arg2].method1677(arg0, (byte) 95, arg5 + 1);
            int var13 = class707.field9826[arg2].method1677(arg0 + 1, (byte) 38, arg5);
            class737.field10238[class291.field3814++] = new class222(arg3, arg2, var8, var9, var9, var8, var12, var13, var13 - arg4, -arg4 + var12, var10, var11, var11, var10);
        }
        field4975++;
        if (arg6 != -2) {
            field4973 = -28;
        }
    }
}
