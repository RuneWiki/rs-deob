import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class66 extends class157 {

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "Lve;")
    public static class188 field1269;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "Lve;")
    public static class188 field1270;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V")
    public static void method483(int arg0) {
        field1270 = null;
        field1269 = null;
        if (arg0 != -17397) {
            method483(27);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field1271;
        int[] var3 = super.field2879.method1269(arg1, arg0 + 17983);
        if (super.field2879.field3363) {
            class270.method1844(var3, 0, class226.field4124, class129.field2479[arg1]);
        }
        if (arg0 != -98) {
            field1272 = 35;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V")
    public static final void method484(int arg0, int arg1) {
        ++field1273;
        if (arg0 != -1) {
            if (class59.field1189[arg0]) {
                class142.field2625.method367((byte) 100, arg0);
                if (class50.field984[arg0] != null) {
                    boolean var2 = true;
                    if (arg1 < 35) {
                        field1272 = -52;
                    }
                    for (int var3 = 0; ~var3 > ~class50.field984[arg0].length; ++var3) {
                        if (class50.field984[arg0][var3] != null) {
                            if (class50.field984[arg0][var3].field810 == 2) {
                                var2 = false;
                            } else {
                                class50.field984[arg0][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class50.field984[arg0] = null;
                    }
                    class59.field1189[arg0] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Lcc;")
    public static final class209 method485(int arg0, byte arg1) {
        if (arg1 <= 0) {
            field1272 = 70;
        }
        ++field1268;
        return class206.method1404(false, arg0, 39, 10);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIILpb;Lpb;IIJ)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3, class126 arg4, class126 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class187 var10 = new class187();
            var10.field3385 = arg8;
            var10.field3380 = arg1 * 128 + 64;
            var10.field3378 = arg2 * 128 + 64;
            var10.field3372 = arg3;
            var10.field3377 = arg4;
            var10.field3387 = arg5;
            var10.field3376 = arg6;
            var10.field3371 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class106.field2089[var11][arg1][arg2] == null) {
                    class106.field2089[var11][arg1][arg2] = new class109(var11, arg1, arg2);
                }
            }
            class106.field2089[arg0][arg1][arg2].field2213 = var10;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }
}
