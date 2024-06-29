import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class464 extends class646 {

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Z")
    private boolean field6650 = true;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "Z")
    private boolean field6643 = true;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "[J")
    public static long[] field6645 = new long[10];

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Leda;")
    public static class116 field6651 = new class116(77, 12);

    @OriginalMember(owner = "client!og", name = "R", descriptor = "[I")
    public static int[] field6652 = new int[1];

    @OriginalMember(owner = "client!og", name = "J", descriptor = "F")
    public static float field6644;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[[I")
    public final int[][] method298(int arg0, int arg1) {
        ++field6647;
        int[][] var3 = super.field9164.method1002(93, arg1);
        if (arg0 != -12424) {
            return null;
        } else {
            if (super.field9164.field2082) {
                int[][] var4 = this.method3626(arg0 ^ -12477, this.field6643 ? -arg1 + class453.field6525 : arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field6650) {
                    for (int var11 = 0; ~var11 > ~class89.field1330; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; ~var12 > ~class89.field1330; ++var12) {
                        var8[var12] = var5[-var12 + class156.field2572];
                        var9[var12] = var6[-var12 + class156.field2572];
                        var10[var12] = var7[-var12 + class156.field2572];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    public static void method2686(int arg0) {
        field6651 = null;
        field6652 = null;
        if (arg0 >= -62) {
            field6652 = null;
        }
        field6645 = null;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static final void method2687(int arg0) {
        class80 var1 = (class80) class135.field2178.method3306((byte) -101);
        if (arg0 == 2) {
            while (var1 != null) {
                class143.method1115((byte) -58, var1);
                var1 = (class80) class135.field2178.method3306((byte) -63);
            }
            ++field6646;
            int var2;
            int var3;
            if (!class525.field7713.method3471(class76.field1182, false)) {
                var2 = class132.field2149;
                var3 = class132.field2149;
            } else {
                var2 = 3;
                var3 = 0;
            }
            client.method706();
            for (int var4 = var3; ~var4 >= ~var2; ++var4) {
                client.method697();
                client.method709(var4);
                client.method701(var4);
            }
            client.method698();
            client.method710();
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class464() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field6648;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (arg1 != -120) {
            this.method295((class465) null, 102, (byte) -61);
        }
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 0, !this.field6643 ? arg0 : -arg0 + class453.field6525);
            if (!this.field6650) {
                class553.method3244(var4, 0, var3, 0, class89.field1330);
            } else {
                for (int var5 = 0; var5 < class89.field1330; ++var5) {
                    var3[var5] = var4[class156.field2572 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field6649;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field9160 = arg0.method2705(-74) == 1;
                }
            } else {
                this.field6643 = arg0.method2705(-79) == 1;
            }
        } else {
            this.field6650 = arg0.method2705(-51) == 1;
        }
        if (arg2 < 7) {
            method2687(46);
        }
    }
}
