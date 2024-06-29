import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class129 extends class386 {

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "Lmq;")
    public static class472 field1644 = new class472(4);

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V", line = 3)
    public static final void method879(int arg0) {
        ++field1642;
        if (arg0 != 0) {
            field1647 = -27;
        }
        class207.field2527.method3674((byte) -37);
        class687.field9806.method3674((byte) -123);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)[I", line = 15)
    public final int[] method359(int arg0, int arg1) {
        ++field1648;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = 8 % ((13 - arg1) / 40);
        if (super.field5140.field3482) {
            int[] var5 = this.method2212((byte) -85, arg0, 0);
            for (int var6 = 0; ~var6 > ~class599.field8643; ++var6) {
                var3[var6] = -var5[var6] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)[[I", line = 49)
    public final int[][] method645(int arg0, int arg1) {
        ++field1645;
        if (arg1 != 3) {
            return null;
        } else {
            int[][] var3 = super.field5148.method1054(arg0, 16257);
            if (super.field5148.field2041) {
                int[][] var4 = this.method2211(arg0, 0, -128);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class599.field8643 < ~var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V", line = 97)
    public class129() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(B)V", line = 101)
    public static void method880(byte arg0) {
        field1644 = null;
        if (arg0 < 76) {
            method880((byte) 125);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIB)Z", line = 115)
    public static final boolean method881(int arg0, int arg1, byte arg2) {
        ++field1643;
        if (arg2 != -71) {
            method879(-115);
        }
        if (!class361.field4805) {
            return false;
        } else {
            int var3 = arg1 >> 16;
            int var4 = arg1 & 65535;
            if (class516.field7555[var3] != null && class516.field7555[var3][var4] != null) {
                class17 var5 = class516.field7555[var3][var4];
                if (~arg0 == 0 && var5.field379 == 0) {
                    for (class377 var6 = (class377) class34.field679.method1132((byte) 75); var6 != null; var6 = (class377) class34.field679.method1134(arg2 + 8517)) {
                        if (~var6.field5062 == -4 || var6.field5062 == 1007 || var6.field5062 == 19 || ~var6.field5062 == -60 || var6.field5062 == 11) {
                            for (class17 var7 = class400.method2420((byte) -109, var6.field5065); var7 != null; var7 = class532.method3129(var7, 3450)) {
                                if (~var5.field465 == ~var7.field465) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class377 var8 = (class377) class34.field679.method1132((byte) -120); var8 != null; var8 = (class377) class34.field679.method1134(arg2 + 8517)) {
                        if (var8.field5063 == arg0 && var5.field465 == var8.field5065 && (var8.field5062 == 3 || var8.field5062 == 1007 || ~var8.field5062 == -20 || ~var8.field5062 == -60 || var8.field5062 == 11)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBLun;)V", line = 184)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field1646;
        if (arg1 <= 111) {
            field1647 = 125;
        }
        if (~arg0 == -1) {
            super.field5145 = arg2.method2229(255) == 1;
        }
    }
}
