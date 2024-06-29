import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class386 {

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Z")
    public static boolean field4932 = false;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Luaa;")
    public static class391 field4934;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIZI)V")
    public static final void method2220(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 == ~class485.field6252.field6949.method2402(false)) {
            class3.method9(64, false);
        } else {
            class409.field5431 = class485.field6252.field6949.method2402(false);
            class432.method2483((byte) 76, 0, true);
        }
        field4937++;
        class602.field7655 = arg1;
        class752.field10253 = arg4;
        class13.field137 = arg3;
        class402.method2338(arg2);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI[BIIIII[B)V")
    public static final void method2221(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field4936++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        int var11 = -arg5;
        if (arg0 >= -36) {
            method2220(-18, 25, -55, true, -5);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg2[var10001] += arg8[arg1++];
                int var14 = arg3++;
                arg2[var14] += arg8[arg1++];
                int var15 = arg3++;
                arg2[var15] += arg8[arg1++];
                int var16 = arg3++;
                arg2[var16] += arg8[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg2[var10001] += arg8[arg1++];
            }
            arg1 += arg7;
            arg3 += arg6;
            var11++;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method2222(int arg0) {
        field4934 = null;
        if (arg0 != 0) {
            method2221((byte) 86, -104, null, 96, -105, 113, -13, -120, null);
        }
    }
}
