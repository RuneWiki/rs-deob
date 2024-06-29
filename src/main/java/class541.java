import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class541 extends class483 {

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    private int field7533;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    private int field7529;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    private int field7524;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    private int field7531;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    private int field7528;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    private int field7535;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "Lnd;")
    private class632 field7526;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
    public static int field7525 = 0;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public static int field7536 = -1;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "Lui;")
    public static class587 field7534;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "Luba;")
    private class628 field7527;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(B)Luba;", line = 3)
    public final class628 method2782(byte arg0) {
        field7530++;
        if (arg0 >= -65) {
            this.field7533 = -89;
        }
        if (this.field7527 == null) {
            class24.field333[5] = this.field7533;
            class24.field333[3] = this.field7524;
            class24.field333[2] = this.field7529;
            class24.field333[0] = this.field7528;
            class24.field333[4] = this.field7531;
            class24.field333[1] = this.field7535;
            class472 var2 = this.field7526.field2443;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2389(-55, class24.field333[var5])) {
                    return null;
                }
                class576 var7 = var2.method2387((byte) 127, class24.field333[var5]);
                int var8 = var7.field8205 ? 64 : 128;
                if (var7.field8201 > 0) {
                    var3 = 1;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class261.field3788[var6] = var2.method2388(var4, var4, false, class24.field333[var6], 1.0F, (byte) -64);
            }
            this.field7527 = this.field7526.method93(var4, class261.field3788, (byte) 56, var3 != 0);
        }
        return this.field7527;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)Z", line = 73)
    public static final boolean method3037(int arg0, int arg1) {
        field7532++;
        if (arg0 < 83) {
            return false;
        } else {
            return arg1 == 9 || arg1 == 10 || arg1 == 11;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 87)
    public static void method3038(int arg0) {
        field7534 = null;
        if (arg0 != 0) {
            method3037(-11, 2);
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lnd;IIIIII)V", line = 100)
    public class541(class632 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7533 = arg6;
        this.field7529 = arg3;
        this.field7524 = arg4;
        this.field7531 = arg5;
        this.field7528 = arg1;
        this.field7535 = arg2;
        this.field7526 = arg0;
    }
}
