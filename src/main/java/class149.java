import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class149 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public static int[] field2232 = new int[99];

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
    public static boolean field2235;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "F")
    public static float field2234;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static final void method940(boolean arg0) {
        class50.field692 = class325.method2061(35, arg0, 0.4F, 8, 8, 2048, 4, 4698);
        field2231++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Lsk;")
    public static final class405 method941(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        return var3 == null || var3.field1070 == null ? null : var3.field1070;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lnp;ILb;Lb;)V")
    public static final void method942(class313 arg0, int arg1, class201 arg2, class201 arg3) {
        class293.field4252 = class387.method2330(2, arg3, 0, class434.field6054);
        field2233++;
        class453.field6355 = arg0.method688(class293.field4252, class72.method432(arg2, class434.field6054, 0), true);
        class252.field3717 = class387.method2330(2, arg3, arg1, class338.field4914);
        class92.field1166 = arg0.method688(class252.field3717, class72.method432(arg2, class338.field4914, 0), true);
        class37.field488 = class387.method2330(2, arg3, 0, class70.field878);
        class491.field6928 = arg0.method688(class37.field488, class72.method432(arg2, class70.field878, 0), true);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2232 = null;
        if (arg0 != 2048) {
            method940(false);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2232[var1] = var0 / 4;
        }
        field2235 = false;
    }
}
