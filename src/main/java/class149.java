import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class149 extends class273 {

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "Ljd;")
    public static class86 field2772 = class122.method868("Opened titlescreen)3", true);

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "Lmg;")
    public static class252 field2774 = new class252(16);

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "Ljd;")
    private static class86 field2779 = class122.method868("Loaded input handler", true);

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "Ljd;")
    public static class86 field2776 = class122.method868(" zuerst von Ihrer Freunde)2Liste(Q", true);

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "Ljd;")
    public static class86 field2778 = field2779;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "Lbj;")
    public static class151 field2777;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 == -1) {
            super.field4778 = arg1.method1408((byte) -19) == 1;
        }
        if (arg2 > -16) {
            this.method31(55, 31);
        }
        ++field2770;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class149() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILbj;)V")
    public static final void method1062(int arg0, class151 arg1) {
        if (arg0 != -21591) {
            field2774 = null;
        }
        ++field2775;
        class22.field557 = arg1.method1079(118, class164.field3070);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = 104 % ((arg1 - 12) / 58);
        ++field2773;
        int[][] var4 = super.field4787.method1657(arg0, (byte) -115);
        if (super.field4787.field4355) {
            int[][] var5 = this.method1859(arg0, 0, 3);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; ~var12 > ~class176.field3200; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var11[var12] = -var7[var12] + 4096;
                var10[var12] = -var8[var12] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field2771;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (arg0 != -7420) {
            return null;
        } else {
            if (super.field4800.field3160) {
                int[] var4 = this.method1863(-89, 0, arg1);
                for (int var5 = 0; ~var5 > ~class176.field3200; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
    public static void method1063(int arg0) {
        field2777 = null;
        field2772 = null;
        field2774 = null;
        field2776 = null;
        int var1 = -54 / ((arg0 - -3) / 50);
        field2778 = null;
        field2779 = null;
    }
}
