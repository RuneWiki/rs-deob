import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class645 {

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field8658 = 0;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Lgba;")
    public static class625 field8657 = null;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIILfa;Lgba;IIJ)V")
    public static final void method3540(int arg0, int arg1, int arg2, int arg3, class217 arg4, class625 arg5, int arg6, int arg7, long arg8) {
        field8659++;
        int var10 = arg2 * arg2 + (arg3 * arg3);
        if (arg8 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg5.field8350 / arg7, arg5.field8361 / 2);
        if (var10 <= var11 * var11) {
            class146.method1056(arg4, arg1, arg3, arg2, arg5, false, class284.field4022[arg0], arg6);
            return;
        }
        var11 -= 10;
        int var12;
        if (class140.field2254 == 4) {
            var12 = (int) class42.field602 & 0x3FFF;
        } else {
            var12 = (int) class42.field602 + class588.field7795 & 0x3FFF;
        }
        int var13 = class126.field2116[var12];
        int var14 = class126.field2105[var12];
        if (class140.field2254 != 4) {
            var14 = var14 * 256 / (class376.field5073 + 256);
            var13 = var13 * 256 / (class376.field5073 + 256);
        }
        int var15 = arg3 * var13 + (arg2 * var14) >> 14;
        int var16 = arg3 * var14 - arg2 * var13 >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class55.field756[arg0].method2636((float) arg5.field8350 / 2.0F + (float) arg1 + (float) var19, (float) arg5.field8361 / 2.0F + (float) arg6 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static void method3541(int arg0) {
        int var1 = -19 / ((-arg0 - 13) / 45);
        field8657 = null;
    }
}
