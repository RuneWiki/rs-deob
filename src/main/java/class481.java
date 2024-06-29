import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class481 extends class14 {

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "Lhq;")
    public static class108 field6632 = new class108(5000);

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)V")
    public static final void method2761(int arg0, int arg1) {
        ++field6637;
        class253 var2 = class332.method1911(arg1, (byte) 101, 11);
        if (arg0 != 0) {
            method2762(113);
        }
        var2.method1523((byte) -119);
    }

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)V")
    public static void method2762(int arg0) {
        field6632 = null;
        if (arg0 != 2) {
            method2764(-38);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZI)V")
    private final void method2763(int arg0, boolean arg1, int arg2) {
        ++field6635;
        int var4 = class195.field2715[arg2];
        int var5 = class273.field3590[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if (!arg1) {
            this.method2763(127, true, -114);
        }
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class439.field6035 = arg0;
            class59.field930 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class59.field930 = arg0;
            class439.field6035 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class439.field6035 = arg2;
            class59.field930 = -arg0 + class115.field1637;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class59.field930 = arg2;
            class439.field6035 = -arg0 + class494.field6866;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class439.field6035 = class494.field6866 - arg0;
            class59.field930 = -arg2 + class115.field1637;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class59.field930 = -arg0 + class115.field1637;
            class439.field6035 = -arg2 + class494.field6866;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class439.field6035 = -arg2 + class494.field6866;
            class59.field930 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class59.field930 = -arg2 + class115.field1637;
            class439.field6035 = arg0;
        }
        class439.field6035 &= class511.field7361;
        class59.field930 &= class305.field4023;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field6634;
        int[][] var3 = super.field268.method2561(arg1, arg0 ^ arg0);
        if (super.field268.field6091) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class115.field1637 < ~var7; ++var7) {
                this.method2763(arg1, true, var7);
                int[][] var8 = this.method139(0, 2, class439.field6035);
                var4[var7] = var8[0][class59.field930];
                var5[var7] = var8[1][class59.field930];
                var6[var7] = var8[2][class59.field930];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field6636;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            field6632 = null;
        }
        if (super.field270.field5222) {
            for (int var4 = 0; class115.field1637 > var4; ++var4) {
                this.method2763(arg0, true, var4);
                int[] var5 = this.method145(class439.field6035, 0, -18596);
                var3[var4] = var5[class59.field930];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (~arg0 == -1) {
            super.field263 = arg2.method2238(255) == 1;
        }
        ++field6633;
        int var4 = -38 % ((-51 - arg1) / 37);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class481() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
    public static final void method2764(int arg0) {
        ++field6638;
        if (class216.field2911 != 3) {
            class145.field2063 = -1;
        }
        if (arg0 != 0) {
            method2764(10);
        }
    }
}
