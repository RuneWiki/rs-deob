import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class512 extends class478 {

    @OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
    private int field7339 = -1;

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
    private int field7337;

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!iaa", name = "I", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!iaa", name = "K", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!iaa", name = "L", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!iaa", name = "N", descriptor = "I")
    private int field7346;

    @OriginalMember(owner = "client!iaa", name = "J", descriptor = "Lir;")
    public static class27 field7343;

    @OriginalMember(owner = "client!iaa", name = "O", descriptor = "[I")
    private int[] field7347;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILnp;I)V", line = 4)
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 != 255) {
            this.method2750(false);
        }
        if (~arg2 == -1) {
            this.field7339 = arg1.method643((byte) -77);
        }
        ++field7338;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)V", line = 18)
    public final void method2749(int arg0, int arg1, int arg2) {
        super.method2749(arg0, arg1, arg2);
        ++field7341;
        if (this.field7339 >= 0 && class50.field504 != null) {
            int var4 = !class50.field504.method140(this.field7339, 862).field3668 ? 128 : 64;
            this.field7347 = class50.field504.method145(var4, false, 1.0F, -18551, var4, this.field7339);
            this.field7337 = var4;
            this.field7346 = var4;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)I", line = 37)
    public final int method2750(boolean arg0) {
        ++field7335;
        if (arg0) {
            this.field7339 = 70;
        }
        return this.field7339;
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)V", line = 56)
    public static void method2932(int arg0) {
        field7343 = null;
        if (arg0 != 28921) {
            field7345 = -85;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IIB)Z", line = 66)
    public static final boolean method2933(int arg0, int arg1, byte arg2) {
        ++field7342;
        if (arg2 != -83) {
            field7343 = null;
        }
        return (arg0 & 458752) != 0 | class231.method1386(arg1, -84, arg0) || class662.method3678(arg1, arg0, 8);
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "()V", line = 130)
    public class512() {
        super(0, false);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Z)V", line = 82)
    public final void method107(boolean arg0) {
        super.method107(arg0);
        ++field7344;
        this.field7347 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(Z)V", line = 92)
    public static final void method2934(boolean arg0) {
        for (int var1 = 0; class16.field131.length > var1; ++var1) {
            for (int var2 = 0; var2 < class16.field131[0].length; ++var2) {
                for (int var3 = 0; var3 < class16.field131[0][0].length; ++var3) {
                    class16.field131[var1][var2][var3] = 0;
                }
            }
        }
        if (!arg0) {
            field7345 = 19;
        }
        ++field7336;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZI)[[I", line = 133)
    public final int[][] method104(boolean arg0, int arg1) {
        if (!arg0) {
            this.method104(true, -108);
        }
        ++field7340;
        int[][] var3 = super.field6889.method2091(30, arg1);
        if (super.field6889.field4765) {
            int var4 = (~class407.field5435 == ~this.field7346 ? arg1 : this.field7346 * arg1 / class407.field5435) * this.field7337;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class436.field6154 != this.field7337) {
                for (int var8 = 0; var8 < class436.field6154; ++var8) {
                    int var9 = this.field7337 * var8 / class436.field6154;
                    int var10 = this.field7347[var4 - -var9];
                    var7[var8] = class105.method572(4080, var10 << 4);
                    var6[var8] = class105.method572(var10, 65280) >> 4;
                    var5[var8] = class105.method572(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class436.field6154; ++var11) {
                    int var12 = this.field7347[var4++];
                    var7[var11] = class105.method572(255, var12) << 4;
                    var6[var11] = class105.method572(var12, 65280) >> 4;
                    var5[var11] = class105.method572(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
