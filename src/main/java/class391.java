import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class391 extends class326 {

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "Z")
    private boolean field5433 = true;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
    private boolean field5432 = true;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field5427 = 1;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Lsj;")
    public static class293 field5430;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I", line = 4)
    public final int[] method30(byte arg0, int arg1) {
        ++field5428;
        if (arg0 >= -6) {
            field5427 = 65;
        }
        int[] var3 = super.field4344.method130(arg1, 66);
        if (super.field4344.field286) {
            int[] var4 = this.method1824(0, false, !this.field5433 ? arg1 : class266.field3509 - arg1);
            if (!this.field5432) {
                class380.method2332(var4, 0, var3, 0, class181.field2495);
            } else {
                for (int var5 = 0; ~var5 > ~class181.field2495; ++var5) {
                    var3[var5] = var4[class459.field6226 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 43)
    public class391() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILbt;I)V", line = 48)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 > -3) {
            this.method48(-101, (byte) 43);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4358 = ~arg1.method201((byte) -128) == -2;
                }
            } else {
                this.field5433 = ~arg1.method201((byte) -118) == -2;
            }
        } else {
            this.field5432 = ~arg1.method201((byte) -109) == -2;
        }
        ++field5431;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V", line = 98)
    public static void method2397(int arg0) {
        field5430 = null;
        int var1 = -114 / ((arg0 - 22) / 44);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)[[I", line = 113)
    public final int[][] method48(int arg0, byte arg1) {
        ++field5429;
        int[][] var3 = super.field4343.method2356(arg0, 104);
        if (arg1 > -52) {
            this.field5433 = true;
        }
        if (super.field4343.field5336) {
            int[][] var4 = this.method1828(0, true, this.field5433 ? class266.field3509 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field5432) {
                for (int var11 = 0; var11 < class181.field2495; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class181.field2495 < ~var12; ++var12) {
                    var8[var12] = var5[class459.field6226 - var12];
                    var9[var12] = var6[-var12 + class459.field6226];
                    var10[var12] = var7[-var12 + class459.field6226];
                }
            }
        }
        return var3;
    }
}
