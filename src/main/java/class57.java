import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class57 extends class105 {

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    private int field1166 = -1;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "Lvf;")
    private static class265 field1158 = class87.method582(-46, "M");

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lvf;")
    public static class265 field1171 = class87.method582(-46, "voudrait faire un -Bchange avec vous)3");

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Lvf;")
    public static class265 field1154 = class87.method582(-46, "loc");

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lvf;")
    public static class265 field1169 = field1158;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "Lvf;")
    private static class265 field1153 = class87.method582(-46, "scroll:");

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static volatile int field1162 = 0;

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
    public static int field1177 = 0;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "Lvf;")
    public static class265 field1176 = field1153;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "Lvf;")
    public static class265 field1156 = field1153;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lvf;")
    public static class265 field1167 = field1158;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lvf;")
    public static class265 field1165 = class87.method582(-46, ":");

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "Lvf;")
    private static class265 field1160 = class87.method582(-46, "Opened title screen");

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lvf;")
    public static class265 field1175 = field1160;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "[I")
    public int[] field1172;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "[Loe;")
    public static class108[] field1159;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)Z")
    public final boolean method429(int arg0) {
        ++field1168;
        if (this.field1172 != null) {
            return true;
        } else if (~this.field1166 <= -1) {
            class88 var2 = class172.field3111 < 0 ? class68.method484(this.field1166, class198.field3533, (byte) 0) : class66.method473(-1, this.field1166, class172.field3111, class198.field3533);
            var2.method608();
            this.field1172 = var2.field1592;
            this.field1178 = var2.field1896;
            this.field1163 = var2.field1904;
            return true;
        } else {
            if (arg0 != 4080) {
                this.field1172 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZII)V")
    public static final void method430(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field1174;
        boolean var5 = false;
        class176.field3143 = (long) arg3;
        int var6 = class232.method1565((byte) 125);
        if (~var6 >= -1 != ~arg0 >= -1) {
            var5 = true;
        }
        if (~arg0 == -4 || ~var6 == -4) {
            arg2 = true;
        }
        if (class226.field4011.startsWith("mac") && ~arg0 < -1) {
            arg2 = true;
        }
        if (arg2 && ~arg0 < -1) {
            var5 = true;
        }
        class218.method1500(-123, var6, arg0, var5, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)[[I")
    public int[][] method18(int arg0, byte arg1) {
        ++field1151;
        if (arg1 >= -110) {
            method430(-7, -98, false, -97, -33);
        }
        int[][] var3 = super.field1870.method569((byte) -96, arg0);
        if (super.field1870.field1567 && this.method429(4080)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field1178 * (~class102.field1804 != ~this.field1163 ? this.field1163 * arg0 / class102.field1804 : arg0);
            if (~class94.field1668 != ~this.field1178) {
                for (int var8 = 0; var8 < class94.field1668; ++var8) {
                    int var9 = this.field1178 * var8 / class94.field1668;
                    int var10 = this.field1172[var7 + var9];
                    var6[var8] = class203.method1395(var10, 255) << 4;
                    var5[var8] = class203.method1395(4080, var10 >> 4);
                    var4[var8] = class203.method1395(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class94.field1668; ++var11) {
                    int var12 = this.field1172[var7++];
                    var6[var11] = class203.method1395(var12 << 4, 4080);
                    var5[var11] = class203.method1395(var12 >> 4, 4080);
                    var4[var11] = class203.method1395(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static void method431(byte arg0) {
        field1154 = null;
        field1158 = null;
        field1153 = null;
        field1176 = null;
        field1160 = null;
        field1165 = null;
        field1175 = null;
        field1167 = null;
        field1159 = null;
        field1171 = null;
        field1169 = null;
        if (arg0 <= 20) {
            field1159 = null;
        }
        field1156 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field1173;
        if (arg0 == 0) {
            this.field1166 = arg2.method927(126);
        }
        if (arg1 != 255) {
            this.method130(56);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[B")
    public static final byte[] method432(byte arg0, int arg1) {
        if (arg0 > -104) {
            method432((byte) 85, 108);
        }
        class233 var2 = (class233) class97.field1705.method1424((long) arg1, (byte) 98);
        ++field1164;
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class100.method664((byte) -86, var3, var7);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[-var6 + 511] = var9;
            }
            var2 = new class233(var4);
            class97.field1705.method1419(0, (long) arg1, var2);
        }
        return var2.field4108;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)I")
    public final int method433(int arg0) {
        ++field1155;
        if (arg0 >= -17) {
            this.method18(27, (byte) 45);
        }
        return this.field1166;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public final void method130(int arg0) {
        ++field1157;
        super.method130(arg0);
        this.field1172 = null;
    }
}
