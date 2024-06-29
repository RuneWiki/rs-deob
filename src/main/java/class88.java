import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class88 extends class124 {

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    private int field1440 = 1024;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    private int field1435 = 2048;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
    private int field1444 = 3072;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "[Z")
    public static boolean[] field1438 = new boolean[112];

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "Lwe;")
    public static class147 field1436 = new class147(64);

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "[I")
    public static int[] field1443 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "[Le;")
    public static class191[] field1445 = new class191[100];

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)V")
    public static void method533(int arg0) {
        field1436 = null;
        field1445 = null;
        field1443 = null;
        field1438 = null;
        if (arg0 != -2514) {
            method534((class102) null, 73, -111, -94, -61);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field1434;
        if (arg1 != -7) {
            return null;
        } else {
            int[][] var3 = super.field2053.method1775((byte) -127, arg0);
            if (super.field2053.field4558) {
                int[][] var4 = this.method843((byte) -103, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var4[2];
                for (int var11 = 0; class64.field1132 > var11; ++var11) {
                    var7[var11] = (var5[var11] * this.field1435 >> 12) + this.field1440;
                    var8[var11] = (var6[var11] * this.field1435 >> 12) + this.field1440;
                    var9[var11] = this.field1440 - -(var10[var11] * this.field1435 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field1441;
        if (!arg2) {
            field1443 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field2063 = arg1.method1580(-90) == 1;
                }
            } else {
                this.field1444 = arg1.method1593(true);
            }
        } else {
            this.field1440 = arg1.method1593(true);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field1442;
        if (arg0 < 68) {
            this.field1435 = -25;
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int[] var4 = this.method844(0, 33, arg1);
            for (int var5 = 0; var5 < class64.field1132; ++var5) {
                var3[var5] = (var4[var5] * this.field1435 >> 12) + this.field1440;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lsb;IIII)V")
    public static final void method534(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1432;
        if (arg3 != 2) {
            method534((class102) null, 94, -13, -5, -33);
        }
        for (class57 var5 = (class57) class191.field3397.method1173(96); var5 != null; var5 = (class57) class191.field3397.method1175(-1)) {
            if (~var5.field1055 == ~arg4 && arg1 * 128 == var5.field1066 && ~(arg2 * 128) == ~var5.field1060 && ~var5.field1049.field1690 == ~arg0.field1690) {
                if (var5.field1058 != null) {
                    class270.field4764.method504(var5.field1058);
                    var5.field1058 = null;
                }
                if (var5.field1047 != null) {
                    class270.field4764.method504(var5.field1047);
                    var5.field1047 = null;
                }
                var5.method655(63);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class88() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILqb;)V")
    public static final void method535(int arg0, int arg1, int arg2, class76 arg3) {
        ++field1431;
        if (~arg3.field3019 == ~arg0 && ~arg0 != 0) {
            class248 var4 = class67.method445((byte) -61, arg0);
            int var5 = var4.field4407;
            if (~var5 == -2) {
                arg3.field3016 = arg2;
                arg3.field3020 = 0;
                arg3.field2957 = 0;
                arg3.field2958 = 0;
                class252.method1750((byte) -8, arg3.field3003, arg3.field2972, var4, class175.field2946 == arg3, arg3.field2958);
            }
            if (var5 == 2) {
                arg3.field2957 = 0;
            }
        } else if (~arg0 == 0 || arg3.field3019 == -1 || ~class67.method445((byte) -61, arg0).field4405 <= ~class67.method445((byte) -61, arg3.field3019).field4405) {
            arg3.field2958 = 0;
            arg3.field3016 = arg2;
            arg3.field3010 = arg3.field2961;
            arg3.field3019 = arg0;
            arg3.field2957 = 0;
            arg3.field3020 = 0;
            if (~arg3.field3019 != 0) {
                class252.method1750((byte) -8, arg3.field3003, arg3.field2972, class67.method445((byte) -61, arg3.field3019), class175.field2946 == arg3, arg3.field2958);
            }
        }
        if (arg1 != 0) {
            method534((class102) null, 108, -65, -83, 87);
        }
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 != -1) {
            method533(127);
        }
        ++field1439;
        this.field1435 = this.field1444 - this.field1440;
    }
}
