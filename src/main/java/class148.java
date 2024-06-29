import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class148 extends class175 {

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "Z")
    private boolean field1995 = true;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "Z")
    private boolean field1994 = true;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "[I")
    public static int[] field1992 = null;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "Lmw;")
    public static class517 field1988 = new class517(27, 4);

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "Z")
    public static boolean field1989;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field1990;
        if (!arg2) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field2305 = arg1.method1731((byte) 64) == 1;
                    }
                } else {
                    this.field1994 = ~arg1.method1731((byte) 64) == -2;
                }
            } else {
                this.field1995 = ~arg1.method1731((byte) 64) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field1991;
        if (arg1 >= -47) {
            this.method47(false, 127);
        }
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746) {
            int[][] var4 = this.method1205(0, this.field1994 ? -arg0 + class698.field9254 : arg0, 29179);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1995) {
                for (int var11 = 0; ~var11 > ~class598.field8136; ++var11) {
                    var8[var11] = var5[-var11 + class412.field5896];
                    var9[var11] = var6[-var11 + class412.field5896];
                    var10[var11] = var7[-var11 + class412.field5896];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class598.field8136; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field1996;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            this.method44(35, (class254) null, false);
        }
        if (super.field2310.field169) {
            int[] var4 = this.method1202(!this.field1994 ? arg1 : -arg1 + class698.field9254, -1150480797, 0);
            if (!this.field1995) {
                class421.method2531(var4, 0, var3, 0, class598.field8136);
            } else {
                for (int var5 = 0; ~var5 > ~class598.field8136; ++var5) {
                    var3[var5] = var4[-var5 + class412.field5896];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field1992 = null;
        field1988 = null;
        if (arg0 != -23103) {
            method1039(-31);
        }
    }
}
