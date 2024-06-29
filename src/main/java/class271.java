import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class271 extends class175 {

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    private int field3944 = 2048;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    private int field3951 = 3072;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    private int field3954 = 1024;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Ljb;")
    public static class519 field3949 = new class519(107, -2);

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field3947;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2305 = arg1.method1731((byte) 64) == 1;
                }
            } else {
                this.field3951 = arg1.method1728((byte) 66);
            }
        } else {
            this.field3954 = arg1.method1728((byte) 72);
        }
        if (arg2) {
            field3953 = 52;
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field3949 = null;
        if (arg0 != 2) {
            field3950 = -45;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)I")
    public static final int method1802(byte arg0, boolean arg1) {
        if (arg0 != 60) {
            return -27;
        } else {
            ++field3948;
            int var2 = class206.field2664;
            if (~var2 != -1) {
                if (~var2 != -2) {
                    return var2 == 2 ? 0 : 0;
                } else {
                    return class16.field155;
                }
            } else {
                return arg1 ? 0 : class16.field155;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.field3944 = -this.field3954 + this.field3951;
        ++field3952;
        if (arg0 != -8) {
            this.method47(false, -11);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field3945;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 > -47) {
            method1802((byte) -94, true);
        }
        if (super.field2316.field8746) {
            int[][] var4 = this.method1205(0, arg0, 29179);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class598.field8136 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field3944 >> 12) + this.field3954;
                var9[var11] = (var6[var11] * this.field3944 >> 12) + this.field3954;
                var10[var11] = (var7[var11] * this.field3944 >> 12) + this.field3954;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field3946;
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int[] var4 = this.method1202(arg1, -1150480797, 0);
            for (int var5 = 0; class598.field8136 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field3944 >> 12) + this.field3954;
            }
        }
        if (!arg0) {
            method1801(55);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class271() {
        super(1, false);
    }
}
