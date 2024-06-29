import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class266 extends class105 {

    @OriginalMember(owner = "client!tia", name = "i", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(I)V")
    public class266(int arg0) {
        this.field3862 = arg0;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IILvg;ILvg;ZIIII)V")
    public static final void method1788(int arg0, int arg1, class52 arg2, int arg3, class52 arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field3863++;
        int var10 = arg4.method479(-62);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class743 var12 = (class743) class299.field4137.method3054((byte) -128, (long) var10);
        if (var12 == null) {
            class55[] var13 = class55.method507(class501.field7161, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class359.field5046.method637(var13[0], true);
            class299.field4137.method3047(!arg5, var12, (long) var10);
        }
        class151.method1163(arg6, arg0 >> 1, arg2.method482(false) * 256, arg8, 0, arg2.field644, arg2.field648, arg2.field649, arg7 >> 1, false);
        int var14 = class686.field9681[0] + arg9 - 18;
        int var15 = arg1 - (16 - class686.field9681[1]) - 54;
        int var16 = arg3 / 4 * 18 + var14;
        int var17 = arg3 % 4 * 18 + var15;
        var12.method4135(var16, var17);
        if (arg2 == arg4) {
            class359.field5046.method586(-256, var17 - 1, 12, 18, 18, var16 - 1);
        }
        class6.method33(arg5, var17 + 18, var17 + -1, var16 - 1, var16 + 18);
        class296 var18 = class182.method1306(-1);
        var18.field4130 = var16;
        var18.field4131 = var17;
        var18.field4127 = var17 + 16;
        var18.field4129 = arg4;
        var18.field4128 = var16 + 16;
        class684.field9653.method4152(var18, 0);
    }
}
