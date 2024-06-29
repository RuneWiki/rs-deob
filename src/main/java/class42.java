import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class42 extends class703 {

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "S")
    public static short field557 = 205;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lkk;")
    public static class192 field553;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "Lhda;")
    public static class752 field552;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lpf;I)V", line = 4)
    public static final void method309(class583 arg0, int arg1) {
        class731.field10136.method11(arg0, arg1 - 99);
        field556++;
        arg0.field7634 = arg0.field7637.field9419;
        class18.field243 += arg0.field7634;
        arg0.field7637.field9419 = arg1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBIIII)V", line = 23)
    public static final void method310(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field555++;
        int var6 = 0;
        int var7 = arg5;
        if (arg1 != 0) {
            method311(false);
        }
        int var8 = arg4 * arg4;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        if (class380.field5289 <= arg2 && class431.field5944 >= arg2) {
            int var21 = class10.method99(class209.field3090, 47, class261.field3632, arg3 + arg4);
            int var22 = class10.method99(class209.field3090, arg1 ^ 0xB, class261.field3632, arg3 - arg4);
            class717.method4012(arg0, arg1 ^ 0xFFFFFFA3, var22, class690.field9616[arg2], var21);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (class380.field5289 <= var24 && class431.field5944 >= var23) {
                int var25 = class10.method99(class209.field3090, 72, class261.field3632, arg3 + var6);
                int var26 = class10.method99(class209.field3090, 74, class261.field3632, arg3 - var6);
                if (var23 >= class380.field5289) {
                    class717.method4012(arg0, -50, var26, class690.field9616[var23], var25);
                }
                if (var24 <= class431.field5944) {
                    class717.method4012(arg0, -68, var26, class690.field9616[var24], var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V", line = 124)
    public static void method311(boolean arg0) {
        field553 = null;
        field552 = null;
        if (arg0) {
            field557 = -26;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lck;I)Z", line = 141)
    public static final boolean method312(class642 arg0, int arg1) {
        field551++;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1 != -3) {
                field554 = -40;
            }
            return class703.method3958(arg0.field8542 - arg0.field8539, -arg0.field8547 + arg0.field8543, arg0.field8547, arg0.field8540, arg0.field8539, 96, arg0.field8538 - arg0.field8540);
        }
    }
}
