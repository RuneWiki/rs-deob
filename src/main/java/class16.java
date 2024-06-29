import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class16 extends class404 {

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Lpo;")
    public static class375 field224 = new class375();

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Loe;")
    public static class127 field225 = new class127(67, 12);

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Ljava/lang/Object;")
    public static Object field229;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 3)
    public static final void method86(String arg0, int arg1) {
        ++field221;
        if (class17.field236 != null) {
            ++class234.field3557;
            class400.method2379((byte) -75, class12.field143);
            class230.field3508.method221(-1, class220.method1343(arg0, (byte) -82));
            if (arg1 < 49) {
                method88(88, (class458) null, (class458) null);
            }
            class230.field3508.method240(arg0, 125);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILha;I)V", line = 22)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            field229 = null;
        }
        ++field227;
        if (~arg2 == -1) {
            super.field5873 = ~arg1.method257((byte) 32) == -2;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILlt;Llt;)I", line = 38)
    public static final int method88(int arg0, class458 arg1, class458 arg2) {
        ++field222;
        int var3 = 0;
        if (arg2.method2729(class12.field145, -9055)) {
            ++var3;
        }
        if (arg2.method2729(class85.field1432, -9055)) {
            ++var3;
        }
        if (arg2.method2729(class53.field804, -9055)) {
            ++var3;
        }
        if (arg1.method2729(class12.field145, -9055)) {
            ++var3;
        }
        int var4 = -33 % ((arg0 - -29) / 39);
        if (arg1.method2729(class85.field1432, -9055)) {
            ++var3;
        }
        if (arg1.method2729(class53.field804, -9055)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 73)
    public class16() {
        super(3, false);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[[I", line = 76)
    public final int[][] method89(int arg0, int arg1) {
        if (arg0 != -1) {
            return null;
        } else {
            ++field223;
            int[][] var3 = super.field5869.method2819(arg1, arg0 ^ -2);
            if (super.field5869.field7156) {
                int[] var4 = this.method2394(2, (byte) 64, arg1);
                int[][] var5 = this.method2400(-11872, arg1, 0);
                int[][] var6 = this.method2400(-11872, arg1, 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~var16 > ~class431.field6348; ++var16) {
                    int var17 = var4[var16];
                    if (var17 != 4096) {
                        if (~var17 == -1) {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        } else {
                            int var18 = 4096 - var17;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I", line = 162)
    public final int[] method90(int arg0, int arg1) {
        ++field228;
        if (arg0 > -47) {
            field224 = null;
        }
        int[] var3 = super.field5870.method372(arg1, (byte) 18);
        if (super.field5870.field810) {
            int[] var4 = this.method2394(0, (byte) 64, arg1);
            int[] var5 = this.method2394(1, (byte) 64, arg1);
            int[] var6 = this.method2394(2, (byte) 64, arg1);
            for (int var7 = 0; ~var7 > ~class431.field6348; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 215)
    public static void method91(byte arg0) {
        field229 = null;
        field224 = null;
        if (arg0 <= 7) {
            method86((String) null, -34);
        }
        field225 = null;
    }
}
