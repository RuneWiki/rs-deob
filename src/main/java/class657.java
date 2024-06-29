import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class657 extends class314 {

    @OriginalMember(owner = "client!ip", name = "R", descriptor = "I")
    private int field9167 = 4096;

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "Z")
    public static boolean field9163 = false;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "[I")
    public static int[] field9166;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method6(int arg0, int arg1) {
        ++field9161;
        int[] var3 = super.field4928.method534((byte) -45, arg0);
        if (super.field4928.field618) {
            int[] var4 = this.method2140(0, arg0 + -1 & class66.field849, -124);
            int[] var5 = this.method2140(0, arg0, -122);
            int[] var6 = this.method2140(0, arg0 + 1 & class66.field849, -125);
            for (int var7 = 0; var7 < class81.field1009; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field9167;
                int var9 = (var5[class504.field7373 & var7 + 1] + -var5[class504.field7373 & var7 + -1]) * this.field9167;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 - -4096 + var12) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return arg1 <= 109 ? null : var3;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)V", line = 62)
    public static final void method3776(boolean arg0) {
        ++field9164;
        if (arg0) {
            for (class232 var1 = (class232) class463.field6919.method3465((byte) -120); var1 != null; var1 = (class232) class463.field6919.method3469(0)) {
                class99 var2 = var1.field3691;
                if (class562.field8084 <= var2.field1595) {
                    if (class562.field8084 >= var2.field1635) {
                        if (~var2.field1600 < -1) {
                            class348 var3 = (class348) class592.field8395.method1558((long) (var2.field1600 + -1), (byte) -93);
                            if (var3 != null) {
                                class589 var4 = var3.field5577;
                                if (~var4.field9696 <= -1 && var4.field9696 < class275.field4426 * 512 && ~var4.field9705 <= -1 && var4.field9705 < class417.field6374 * 512) {
                                    var2.method964(class562.field8084, 116, class202.method1568(var4.field9696, var2.field9695, var4.field9705, 2) + -var2.field1640, var4.field9696, var4.field9705);
                                }
                            }
                        }
                        if (~var2.field1600 > -1) {
                            int var5 = -var2.field1600 - 1;
                            class304 var6;
                            if (class114.field1793 != var5) {
                                var6 = class597.field8465[var5];
                            } else {
                                var6 = class567.field8141;
                            }
                            if (var6 != null && ~var6.field9696 <= -1 && ~(class275.field4426 * 512) < ~var6.field9696 && var6.field9705 >= 0 && var6.field9705 < class417.field6374 * 512) {
                                var2.method964(class562.field8084, 122, class202.method1568(var6.field9696, var2.field9695, var6.field9705, 2) + -var2.field1640, var6.field9696, var6.field9705);
                            }
                        }
                        var2.method965(class116.field1805, -100);
                        class259.method1830(var2, true);
                    }
                } else {
                    var1.method707((byte) -46);
                    var2.method962(-24);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "(I)V", line = 132)
    public static void method3777(int arg0) {
        if (arg0 != 512) {
            method3776(true);
        }
        field9166 = null;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)V", line = 142)
    public static final void method3778(int arg0, int arg1) {
        ++field9162;
        class413 var2 = class674.method3852(arg1, arg0, 122);
        var2.method2634(1065768928);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 170)
    public class657() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLie;I)V", line = 156)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field9165;
        if (arg2 == 0) {
            this.field9167 = arg1.method67(12021);
        }
        if (arg0 >= -1) {
            this.method6(-101, 38);
        }
    }
}
