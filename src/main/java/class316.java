import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class316 extends class478 {

    @OriginalMember(owner = "client!jga", name = "I", descriptor = "I")
    private int field3932 = 32768;

    @OriginalMember(owner = "client!jga", name = "F", descriptor = "Z")
    public static volatile boolean field3929 = true;

    @OriginalMember(owner = "client!jga", name = "D", descriptor = "Lsb;")
    public static class305 field3927 = new class305(35, 11);

    @OriginalMember(owner = "client!jga", name = "B", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!jga", name = "C", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!jga", name = "G", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!jga", name = "H", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!jga", name = "J", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!jga", name = "K", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!jga", name = "E", descriptor = "Ltf;")
    public static class701 field3928;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V", line = 3)
    public static void method1813(int arg0) {
        if (arg0 != 11818) {
            field3928 = null;
        }
        field3928 = null;
        field3927 = null;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V", line = 15)
    public final void method34(byte arg0) {
        class625.method3518(0);
        ++field3931;
        if (arg0 != 23) {
            method1813(-106);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBLtf;)Lf;", line = 26)
    public static final class534 method1814(int arg0, byte arg1, class701 arg2) {
        if (arg1 <= 105) {
            field3927 = null;
        }
        ++field3933;
        class534 var3 = (class534) class285.field3550.method78(0, (long) arg0);
        if (var3 == null) {
            if (class194.field2250) {
                var3 = class701.field9813.method1041(class550.method3113(arg2, arg0), true);
            } else {
                var3 = class345.method2059(3136, arg2.method3859((byte) 125, arg0));
            }
            class285.field3550.method92(1, (long) arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILnp;I)V", line = 49)
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field6881 = arg1.method620((byte) -128) == 1;
            }
        } else {
            this.field3932 = arg1.method643((byte) -77) << 4;
        }
        if (arg0 != 255) {
            method1814(-34, (byte) -90, (class701) null);
        }
        ++field3925;
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(II)S", line = 91)
    public static final short method1815(int arg0, int arg1) {
        if (arg1 != -22553) {
            field3929 = false;
        }
        ++field3934;
        int var2 = arg0 >> 10 & 63;
        int var3 = (901 & arg0) >> 3;
        int var4 = 127 & arg0;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (-var4 + 127) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (~var6 == -1) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V", line = 121)
    public class316() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(II)[I", line = 128)
    public final int[] method35(int arg0, int arg1) {
        ++field3930;
        int[] var3 = super.field6886.method789(arg0, (byte) -80);
        if (super.field6886.field1592) {
            int[] var4 = this.method2752(arg0, 125, 1);
            int[] var5 = this.method2752(arg0, 101, 2);
            for (int var6 = 0; ~var6 > ~class436.field6154; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field3932 >> 12;
                int var9 = class609.field8517[var7] * var8 >> 12;
                int var10 = class215.field2608[var7] * var8 >> 12;
                int var11 = class204.field2414 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg0 & class156.field1746;
                int[] var13 = this.method2752(var12, 95, 0);
                var3[var6] = var13[var11];
            }
        }
        if (arg1 != -11323) {
            this.method104(false, 15);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZI)[[I", line = 181)
    public final int[][] method104(boolean arg0, int arg1) {
        ++field3926;
        int[][] var3 = super.field6889.method2091(18, arg1);
        if (!arg0) {
            this.field3932 = -8;
        }
        if (super.field6889.field4765) {
            int[] var4 = this.method2752(arg1, 114, 1);
            int[] var5 = this.method2752(arg1, -18, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class436.field6154 < ~var9; ++var9) {
                int var10 = (1046869 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field3932 >> 12;
                int var12 = class609.field8517[var10] * var11 >> 12;
                int var13 = class215.field2608[var10] * var11 >> 12;
                int var14 = class204.field2414 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg1 & class156.field1746;
                int[][] var16 = this.method2753(0, var15, (byte) 11);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
