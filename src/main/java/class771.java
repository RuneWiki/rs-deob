import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class771 {

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "Lqj;")
    private class535 field10605 = new class535(256);

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "Llf;")
    private class250 field10608;

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "Ld;")
    private class161 field10610;

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
    public static int field10606;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field10609;

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
    public static int field10611;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "Laka;")
    public static class86 field10604;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)Lrba;")
    public final class456 method4240(int arg0, int arg1) {
        field10611++;
        Object var3 = this.field10605.method3109((byte) 122, (long) arg1);
        if (var3 != null) {
            return (class456) var3;
        } else if (this.field10610.method1112(29302, arg1)) {
            if (arg0 != 2) {
                this.field10610 = null;
            }
            class577 var4 = this.field10610.method1114(arg1, -110);
            int var5 = var4.field7853 ? 64 : this.field10608.field3507;
            class456 var7;
            if (var4.field7872 && this.field10608.method472()) {
                float[] var6 = this.field10610.method1110(false, 0.7F, var5, arg1, var5, 149);
                var7 = new class456(this.field10608, 3553, 34842, var5, var5, var4.field7874 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field7860 != 2 && class107.method806((byte) 83, var4.field7855)) {
                    var8 = this.field10610.method1113(-85, var5, var5, true, arg1, 0.7F);
                } else {
                    var8 = this.field10610.method1111(66, 0.7F, var5, arg1, var5, false);
                }
                var7 = new class456(this.field10608, 3553, 6408, var5, var5, var4.field7874 != 0, var8, 0, 0, false);
            }
            var7.method2708((byte) -126, var4.field7858, var4.field7873);
            this.field10605.method3108((long) arg1, 16337, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public final void method4241(int arg0) {
        field10609++;
        if (arg0 <= 27) {
            field10604 = null;
        }
        this.field10605.method3103(-11294);
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V")
    public final void method4242(int arg0) {
        this.field10605.method3101(false, 5);
        int var2 = -6 / ((arg0 + 17) / 39);
        field10606++;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIIIILqba;Lqba;II)V")
    public static final void method4243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class425 arg6, class425 arg7, int arg8, int arg9) {
        field10607++;
        int var10 = arg7.method125((byte) 124);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class140 var12 = (class140) class145.field1948.method3109((byte) 123, (long) var10);
        if (var12 == null) {
            class162[] var13 = class162.method1122(class490.field6826, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class375.field5490.method466(var13[0], true);
            class145.field1948.method3108((long) var10, 16337, var12);
        }
        class497.method2918(arg9 >> 1, arg4 >> 1, 0, arg6.field2813, arg1, arg6.field2810, arg6.field2802, arg3, arg6.method2563(arg2 ^ 0x624E) * 256, (byte) -110);
        int var14 = class548.field7567[0] + arg8 - 18;
        int var15 = arg0 / 4 * 18 + var14;
        int var16 = arg5 + class548.field7567[1] - 16 - 54;
        int var17 = arg0 % 4 * 18 + var16;
        var12.method968(var15, var17);
        if (arg6 == arg7) {
            class375.field5490.method553(18, var15 - 1, var17 + -1, -256, 115, 18);
        }
        if (arg2 != -20586) {
            field10604 = null;
        }
        class199.method1300(var17 - 1, var15 + 18, 8963, var15 - 1, var17 + 18);
        class480 var18 = class751.method4100(-1073741824);
        var18.field6738 = var15;
        var18.field6746 = var15 + 16;
        var18.field6739 = arg7;
        var18.field6743 = var17;
        var18.field6744 = var17 + 16;
        class572.field7792.method2188((byte) 31, var18);
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
    public static void method4244(int arg0) {
        if (arg0 != -1) {
            method4243(58, 35, -115, -31, -107, 63, null, null, -27, -122);
        }
        field10604 = null;
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Llf;Ld;)V")
    public class771(class250 arg0, class161 arg1) {
        this.field10608 = arg0;
        this.field10610 = arg1;
    }
}
