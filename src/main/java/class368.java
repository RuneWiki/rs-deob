import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class368 extends class478 {

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "I")
    private int field5038 = 4;

    @OriginalMember(owner = "client!ew", name = "K", descriptor = "I")
    private int field5042 = 4;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "[I")
    public static int[] field5034 = new int[25];

    @OriginalMember(owner = "client!ew", name = "L", descriptor = "I")
    public static int field5043 = -60;

    @OriginalMember(owner = "client!ew", name = "E", descriptor = "I")
    public static int field5036 = 1;

    @OriginalMember(owner = "client!ew", name = "D", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ew", name = "H", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ew", name = "J", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILnp;I)V", line = 5)
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field5040;
        if (arg0 != 255) {
            this.field5042 = -22;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field5042 = arg1.method620((byte) -126);
            }
        } else {
            this.field5038 = arg1.method620((byte) 49);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZI)[[I", line = 40)
    public final int[][] method104(boolean arg0, int arg1) {
        ++field5039;
        int[][] var3 = super.field6889.method2091(-115, arg1);
        if (super.field6889.field4765) {
            int var4 = class436.field6154 / this.field5038;
            int var5 = class407.field5435 / this.field5042;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method2753(0, class407.field5435 * var6 / var5, (byte) 11);
            } else {
                var7 = this.method2753(0, 0, (byte) 11);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class436.field6154 < ~var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class436.field6154 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        if (!arg0) {
            this.field5042 = -52;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)[I", line = 116)
    public final int[] method35(int arg0, int arg1) {
        ++field5041;
        int[] var3 = super.field6886.method789(arg0, (byte) 123);
        if (arg1 != -11323) {
            this.method33(-116, (class115) null, -114);
        }
        if (super.field6886.field1592) {
            int var4 = class436.field6154 / this.field5038;
            int var5 = class407.field5435 / this.field5042;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2752(class407.field5435 * var6 / var5, -54, 0);
            } else {
                var7 = this.method2752(0, -23, 0);
            }
            for (int var8 = 0; class436.field6154 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class436.field6154 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V", line = 169)
    public class368() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V", line = 176)
    public static void method2154(int arg0) {
        field5034 = null;
        if (arg0 < 10) {
            method2155((byte) 42);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V", line = 197)
    public static final void method2155(byte arg0) {
        ++field5035;
        class302.method1752();
        if (arg0 != -110) {
            method2154(-104);
        }
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class282.field3534[var1].method1557((byte) 44);
        }
        class527.method2968((byte) -26);
        class471.method2715(false);
        System.gc();
        class701.field9813.method969();
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(B)V", line = 222)
    public static final void method2156(byte arg0) {
        class461.field6560 = null;
        if (arg0 <= -102) {
            class7.field81 = null;
            ++field5037;
        }
    }
}
