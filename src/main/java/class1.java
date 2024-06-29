import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class1 extends class273 {

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    private int field4 = 0;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    private int field7 = 4096;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field2 = -1;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "F")
    public static float field1 = 0.0F;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(ZI)I")
    public static final int method1(boolean arg0, int arg1) {
        if (!arg0) {
            method1(true, -41);
        }
        ++field8;
        return 1023 & arg1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field9;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field4358 = arg0.method1012(4) == 1;
                }
            } else {
                this.field7 = arg0.method996(65280);
            }
        } else {
            this.field4 = arg0.method996(65280);
        }
        if (arg2 != 5) {
            field2 = 11;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 < 122) {
            field3 = -44;
        }
        int[][] var3 = super.field4357.method1949(true, arg1);
        ++field6;
        if (super.field4357.field4631) {
            int[][] var4 = this.method1853(0, arg1, (byte) 8);
            int[] var5 = var3[0];
            int[] var6 = var4[1];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class26.field458; ++var11) {
                int var12 = var6[var11];
                int var13 = var10[var11];
                int var14 = var9[var11];
                if (var13 < this.field4) {
                    var5[var11] = this.field4;
                } else if (this.field7 < var13) {
                    var5[var11] = this.field7;
                } else {
                    var5[var11] = var13;
                }
                if (~this.field4 < ~var12) {
                    var8[var11] = this.field4;
                } else if (this.field7 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field7;
                }
                if (var14 < this.field4) {
                    var7[var11] = this.field4;
                } else if (~var14 >= ~this.field7) {
                    var7[var11] = var14;
                } else {
                    var7[var11] = this.field7;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class1() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field5;
        if (arg0) {
            field2 = -124;
        }
        int[] var3 = super.field4359.method387((byte) -43, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(arg1, 0, (byte) 49);
            for (int var5 = 0; ~class26.field458 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field4) {
                    if (var6 > this.field7) {
                        var3[var5] = this.field7;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field4;
                }
            }
        }
        return var3;
    }
}
