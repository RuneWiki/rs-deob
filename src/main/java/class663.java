import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class663 extends class478 {

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lcq;")
    public static class110 field9287 = new class110(15, 6);

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI)[[I", line = 6)
    public final int[][] method104(boolean arg0, int arg1) {
        ++field9284;
        int[][] var3 = super.field6889.method2091(-2, arg1);
        if (!arg0) {
            return null;
        } else {
            if (super.field6889.field4765) {
                int[][] var4 = this.method2753(0, arg1, (byte) 11);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class436.field6154 > var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 54)
    public static void method3682(byte arg0) {
        if (arg0 != -107) {
            field9287 = null;
        }
        field9287 = null;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V", line = 66)
    public static final void method3683(byte arg0) {
        if (class334.field4188 != null) {
            for (int var1 = 0; ~class581.field8265 < ~var1; ++var1) {
                class334.field4188[var1] = null;
            }
            class334.field4188 = null;
        }
        ++field9286;
        if (class651.field9147 != null) {
            for (int var2 = 0; var2 < class394.field5341; ++var2) {
                class651.field9147[var2] = null;
            }
            class651.field9147 = null;
        }
        if (class389.field5262 != null) {
            for (int var3 = 0; ~class120.field1341 < ~var3; ++var3) {
                class389.field5262[var3] = null;
            }
            class389.field5262 = null;
        }
        if (arg0 != -89) {
            method3683((byte) 101);
        }
        class269.field3348 = null;
        class303.field3755 = -1;
        class148.field1637 = -1;
        class560.field7990 = null;
        class246.field3033 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILwp;)V", line = 121)
    public static final void method3684(int arg0, class452 arg1) {
        if (arg0 != 15085) {
            field9287 = null;
        }
        ++field9283;
        if (~arg1.field6471 == -6 && arg1.field6434 != -1) {
            class129.method735(-96, class701.field9813, arg1);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[I", line = 138)
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -11323) {
            return null;
        } else {
            ++field9288;
            int[] var3 = super.field6886.method789(arg0, (byte) 123);
            if (super.field6886.field1592) {
                int[] var4 = this.method2752(arg0, -126, 0);
                for (int var5 = 0; ~var5 > ~class436.field6154; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 171)
    public class663() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILnp;I)V", line = 174)
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field9285;
        if (~arg2 == -1) {
            super.field6881 = ~arg1.method620((byte) -127) == -2;
        }
        if (arg0 != 255) {
            this.method35(-85, 21);
        }
    }
}
