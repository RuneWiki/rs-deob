import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class26 extends class167 {

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    private int field649 = 4;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    private int field659 = 4;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static volatile int field656 = 0;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "Leh;")
    public static class53 field653 = new class53(4);

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "Lai;")
    public static class10 field662;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "[I")
    public static int[] field655;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
    public static void method230(byte arg0) {
        field662 = null;
        field655 = null;
        field653 = null;
        if (arg0 >= -80) {
            method231((byte) -84);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int var4 = class115.field2146 / this.field649;
            int var5 = class57.field1185 / this.field659;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1180(class57.field1185 * var6 / var5, 26851, 0);
            } else {
                var7 = this.method1180(0, arg1 + 36030, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[2];
            int[] var10 = var7[1];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; ~var14 > ~class115.field2146; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class115.field2146 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var13[var14] = var10[var16];
                var12[var14] = var9[var16];
            }
        }
        if (arg1 != -9179) {
            this.method116(-29, -106);
        }
        ++field652;
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)I")
    public static final int method231(byte arg0) {
        ++field650;
        if (arg0 > -93) {
            method230((byte) 35);
        }
        return 6;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field658;
        if (!arg1) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    this.field659 = arg0.method998(95);
                }
            } else {
                this.field649 = arg0.method998(118);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)V")
    public static final void method232(int arg0, byte arg1) {
        class176.field3183 = 0;
        class39.field905 = arg0;
        class66.field1273 = -1;
        class154.field2765 = -1;
        class209.field3751 = 1;
        class213.field3879 = null;
        class69.field1328 = false;
        if (arg1 > 62) {
            ++field651;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            field655 = null;
        }
        ++field660;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int var4 = class115.field2146 / this.field649;
            int var5 = class57.field1185 / this.field659;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1186(0, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1186(class57.field1185 * var7 / var5, 0, 0);
            }
            for (int var8 = 0; ~var8 > ~class115.field2146; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class115.field2146 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }
}
