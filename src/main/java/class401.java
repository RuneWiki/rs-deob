import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class401 extends class642 {

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    private int field6034 = 1;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    private int field6032 = 0;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field6030 = 0;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Lvg;")
    public static class622 field6035 = new class622(113, 6);

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Loba;")
    public static class324 field6037 = new class324();

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "[Lnp;")
    public static class154[] field6039 = new class154[100];

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field6041 = 0;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "Liba;")
    public static class211 field6040 = new class211(75, -1);

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method2483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 10050) {
            field6035 = null;
        }
        for (int var6 = arg3; var6 <= arg1; ++var6) {
            class41.method235(arg4, class565.field8253[var6], arg0 ^ 10050, arg2, arg5);
        }
        ++field6038;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILpo;Lpo;)V", line = 24)
    public static final void method2484(int arg0, int arg1, int arg2, class332 arg3, class332 arg4) {
        class44 var5 = class471.method2715(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field668 = arg3;
            var5.field670 = arg4;
            int var6 = class383.field5753 == class178.field2480 ? 1 : 0;
            if (arg3.method270(-79)) {
                if (arg3.method274(-1510217528)) {
                    class403.field6051[var6][class48.field760[var6]++] = arg3;
                } else {
                    class313.field4591[var6][class311.field4576[var6]++] = arg3;
                }
            } else {
                class153.field2152[var6][class464.field6700[var6]++] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method270(-50)) {
                    if (arg4.method274(-1510217528)) {
                        class403.field6051[var6][class48.field760[var6]++] = arg4;
                        return;
                    }
                    class313.field4591[var6][class311.field4576[var6]++] = arg4;
                    return;
                }
                class153.field2152[var6][class464.field6700[var6]++] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 191)
    public class401() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILgk;B)V", line = 69)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field6031;
        if (arg2 > 29) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 3) {
                        this.field6034 = arg1.method3115(29871);
                    }
                } else {
                    this.field6032 = arg1.method3115(29871);
                }
            } else {
                this.field6030 = arg1.method3115(29871);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[I", line = 112)
    public final int[] method3(int arg0, int arg1) {
        if (arg1 != -9) {
            this.field6032 = 85;
        }
        ++field6033;
        int[] var3 = super.field9216.method1185(arg0, -124);
        if (super.field9216.field2418) {
            int var4 = class400.field6026[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class338.field4909 < ~var6; ++var6) {
                int var7 = class542.field8026[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field6030 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field6034 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field6034;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field6032 == -1) {
                    var12 = class229.field3042[(4094 & var12) >> 4] + 4096 >> 1;
                } else if (this.field6032 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V", line = 194)
    public final void method2(int arg0) {
        ++field6036;
        class531.method3078(false);
        if (arg0 != 6276) {
            method2485(81);
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V", line = 205)
    public static void method2485(int arg0) {
        field6039 = null;
        field6037 = null;
        if (arg0 != 0) {
            field6035 = null;
        }
        field6035 = null;
        field6040 = null;
    }
}
