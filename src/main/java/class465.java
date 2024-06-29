import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class465 extends class694 {

    @OriginalMember(owner = "client!bda", name = "H", descriptor = "Z")
    private boolean field6539 = true;

    @OriginalMember(owner = "client!bda", name = "I", descriptor = "Z")
    private boolean field6540 = true;

    @OriginalMember(owner = "client!bda", name = "L", descriptor = "Luc;")
    public static class27 field6543 = new class27(47, -1);

    @OriginalMember(owner = "client!bda", name = "N", descriptor = "[B")
    public static byte[] field6545 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!bda", name = "J", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!bda", name = "M", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!bda", name = "O", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!bda", name = "P", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!bda", name = "K", descriptor = "Lpj;")
    public static class132 field6542;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBLbt;)Lub;")
    public static final class20 method2665(int arg0, byte arg1, class39 arg2) {
        ++field6546;
        int var3 = -52 % ((28 - arg1) / 56);
        class20 var4;
        if (class15.field226 == null) {
            var4 = new class20();
        } else {
            var4 = class15.field226;
            class15.field226 = class15.field226.field284;
            var4.field284 = null;
            --class545.field7384;
        }
        var4.field286 = arg0;
        var4.field281 = arg2;
        return var4;
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
    public class465() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field6538;
        int var4 = -49 % ((arg2 - 58) / 63);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field9744 = ~arg1.method718(-91) == -2;
                }
            } else {
                this.field6540 = ~arg1.method718(-81) == -2;
            }
        } else {
            this.field6539 = arg1.method718(103) == 1;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field6541;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int[] var4 = this.method3809(0, this.field6540 ? -arg1 + class384.field5383 : arg1, (byte) 35);
            if (this.field6539) {
                for (int var5 = 0; ~var5 > ~field6544; ++var5) {
                    var3[var5] = var4[class168.field2537 - var5];
                }
            } else {
                class282.method1703(var4, 0, var3, 0, field6544);
            }
        }
        return arg0 < 112 ? null : var3;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
    public static void method2666(byte arg0) {
        field6545 = null;
        if (arg0 == 0) {
            field6542 = null;
            field6543 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field6547;
        if (arg0 != -22151) {
            field6542 = null;
        }
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int[][] var4 = this.method3812(this.field6540 ? class384.field5383 - arg1 : arg1, 0, -14032);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6539) {
                for (int var11 = 0; ~var11 > ~field6544; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~field6544; ++var12) {
                    var8[var12] = var5[-var12 + class168.field2537];
                    var9[var12] = var6[class168.field2537 - var12];
                    var10[var12] = var7[class168.field2537 - var12];
                }
            }
        }
        return var3;
    }
}
