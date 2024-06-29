import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class92 extends class149 {

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "Z")
    private boolean field1338 = true;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Z")
    private boolean field1337 = true;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field1341;
        if (arg1 != 35) {
            this.field1337 = true;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2148 = ~arg2.method618((byte) 100) == -2;
                }
            } else {
                this.field1337 = arg2.method618((byte) 100) == 1;
            }
        } else {
            this.field1338 = arg2.method618((byte) 100) == 1;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field1339;
        int[] var3 = super.field2152.method2891(arg1, (byte) 77);
        if (arg0 != -10835) {
            this.field1337 = true;
        }
        if (super.field2152.field7051) {
            int[] var4 = this.method983(0, 24824, this.field1337 ? -arg1 + class51.field694 : arg1);
            if (this.field1338) {
                for (int var5 = 0; ~var5 > ~class316.field4838; ++var5) {
                    var3[var5] = var4[-var5 + class320.field4897];
                }
            } else {
                class361.method2284(var4, 0, var3, 0, class316.field4838);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILhu;I)I")
    public static final int method645(int arg0, class469 arg1, int arg2) {
        ++field1340;
        return arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(CI)Z")
    public static final boolean method646(char arg0, int arg1) {
        ++field1342;
        if (arg1 <= 52) {
            return false;
        } else {
            return ~arg0 <= -49 && ~arg0 >= -58 || ~arg0 <= -66 && ~arg0 >= -91 || arg0 >= 'a' && ~arg0 >= -123;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)[[I")
    public final int[][] method139(byte arg0, int arg1) {
        if (arg0 >= -45) {
            this.field1338 = false;
        }
        ++field1343;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int[][] var4 = this.method984((byte) 110, 0, !this.field1337 ? arg1 : class51.field694 - arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1338) {
                for (int var11 = 0; var11 < class316.field4838; ++var11) {
                    var8[var11] = var5[-var11 + class320.field4897];
                    var9[var11] = var6[-var11 + class320.field4897];
                    var10[var11] = var7[-var11 + class320.field4897];
                }
            } else {
                for (int var12 = 0; class316.field4838 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }
}
