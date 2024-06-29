import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class260 extends class38 {

    @OriginalMember(owner = "client!sda", name = "D", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!sda", name = "E", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!sda", name = "G", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!sda", name = "H", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!sda", name = "F", descriptor = "Lnp;")
    public static class492 field3707;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BLaa;IILsca;Lpga;II)V")
    public static final void method1688(byte arg0, class488 arg1, int arg2, int arg3, class46 arg4, class536 arg5, int arg6, int arg7) {
        ++field3709;
        if (arg5 != null) {
            int var8;
            if (class264.field3784 == 4) {
                var8 = 16383 & (int) class255.field3659;
            } else {
                var8 = (int) class255.field3659 + class748.field10464 & 16383;
            }
            int var9 = 10 + Math.max(arg4.field549 / 2, arg4.field574 / 2);
            if (arg0 != -96) {
                field3707 = null;
            }
            int var10 = arg7 * arg7 - -(arg2 * arg2);
            if (var10 <= var9 * var9) {
                int var11 = class373.field5548[var8];
                int var12 = class373.field5549[var8];
                if (class264.field3784 != 4) {
                    var11 = var11 * 256 / (class305.field4322 + 256);
                    var12 = var12 * 256 / (class305.field4322 + 256);
                }
                int var13 = arg2 * var11 + arg7 * var12 >> 14;
                int var14 = arg2 * var12 + -(arg7 * var11) >> 14;
                arg5.method131(arg6 + (arg4.field549 / 2 + var13 - arg5.method1504() / 2), arg4.field574 / 2 + arg3 + -var14 + -(arg5.method1514() / 2), arg1, arg6, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
    public static void method1689(int arg0) {
        field3707 = null;
        if (arg0 != 4096) {
            method1688((byte) 14, (class488) null, -73, -110, (class46) null, (class536) null, 62, -42);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        if (arg0 >= -43) {
            return null;
        } else {
            ++field3708;
            int[] var3 = super.field397.method1376(arg1, (byte) 126);
            if (super.field397.field3005) {
                int[] var4 = this.method189(arg1, 0, (byte) -92);
                for (int var5 = 0; var5 < class729.field10216; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)[[I")
    public final int[][] method196(int arg0, int arg1) {
        ++field3706;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[][] var4 = this.method195(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class729.field10216; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        if (arg0 != -18210) {
            this.method196(111, 92);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field3705;
        if (arg0 >= 34) {
            if (arg1 == 0) {
                super.field388 = ~arg2.method3745(-6314) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "()V")
    public class260() {
        super(1, false);
    }
}
