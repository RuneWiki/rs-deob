import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class295 extends class215 {

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    private int field4672 = 4096;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    private int field4670 = 0;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "[I")
    public static int[] field4675 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(II)V")
    public static final void method1977(int arg0, int arg1) {
        class246 var2 = class46.field585[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class246 var4 = class46.field585[var3][arg0][arg1] = class46.field585[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field4040;
                for (int var5 = 0; var5 < var4.field4044; ++var5) {
                    class19 var6 = var4.field4038[var5];
                    if ((var6.field244 >> 29 & 3L) == 2L && var6.field240 == arg0 && var6.field235 == arg1) {
                        --var6.field246;
                    }
                }
            }
        }
        if (class46.field585[0][arg0][arg1] == null) {
            class46.field585[0][arg0][arg1] = new class246(0, arg0, arg1);
        }
        class46.field585[0][arg0][arg1].field4058 = var2;
        class46.field585[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field4671;
        int[] var3 = super.field3445.method1755(arg0, (byte) 103);
        if (super.field3445.field4163) {
            int[] var4 = this.method1503(-1, 0, arg0);
            for (int var5 = 0; ~class244.field4015 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field4670 <= var6 && ~this.field4672 <= ~var6 ? 4096 : 0;
            }
        }
        return arg1 != 255 ? null : var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method1978(boolean arg0) {
        if (arg0) {
            field4675 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)I")
    public static final int method1979(int arg0) {
        if (arg0 != -18843) {
            method1980(-73, 44, -86, 111, -105, 70, 101);
        }
        ++field4669;
        return 15;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 3;
        ++field4673;
        if (var8 == 0) {
            return arg6;
        } else {
            int var9 = 106 / ((arg0 - -65) / 36);
            if (~var8 == -2) {
                return -arg1 - -8 - arg5;
            } else {
                return var8 == 2 ? -arg4 - -1 + 7 - arg6 : arg5;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field4676;
        if (arg0 == 1521146348) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field4672 = arg2.method549(255);
                }
            } else {
                this.field4670 = arg2.method549(arg0 ^ 1521146131);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class295() {
        super(1, true);
    }
}
