import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class166 {

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    private int field199 = 4096;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 == 96) {
            ++field197;
            if (~arg2 == -1) {
                this.field199 = arg1.method912(-102);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class14() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(BI)V")
    public static final void method73(byte arg0, int arg1) {
        class72.field1397.method1708(-1009973721, arg1);
        int var2 = -82 / ((arg0 - 28) / 48);
        ++field196;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -29 % ((79 - arg3) / 44);
        ++field200;
        if (arg5 >= 1 && arg2 >= 1 && ~arg5 >= -103 && arg2 <= 102) {
            if (!class163.method1215(79) && (class19.field246[0][arg5][arg2] & 2) == 0) {
                int var9 = arg7;
                if (~(8 & class19.field246[arg7][arg5][arg2]) != -1) {
                    var9 = 0;
                }
                if (~class97.field1811 != ~var9) {
                    return;
                }
            }
            int var10 = arg7;
            if (~arg7 > -4 && (2 & class19.field246[1][arg5][arg2]) == 2) {
                var10 = arg7 + 1;
            }
            class175.method1272(class79.field1518[arg7], (byte) -79, arg7, arg6, arg2, var10, arg5);
            if (arg4 >= 0) {
                boolean var11 = class64.field1246;
                class64.field1246 = true;
                class45.method258(arg2, arg0, arg4, 8315, false, false, arg1, var10, arg7, class79.field1518[arg7], arg5);
                class64.field1246 = var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            this.method18((byte) -44, (class128) null, 121);
        }
        ++field198;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(126, class138.field2583 & arg0 + -1, 0);
            int[] var5 = this.method1231(arg1 + -8388658, arg0, 0);
            int[] var6 = this.method1231(123, arg0 + 1 & class138.field2583, 0);
            for (int var7 = 0; var7 < class253.field4565; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field199;
                int var9 = var8 >> 12;
                int var10 = (var5[var7 - -1 & class12.field183] - var5[var7 + -1 & class12.field183]) * this.field199;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - (-var13 - 4096)) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }
}
