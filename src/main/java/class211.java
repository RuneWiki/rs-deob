import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class211 extends class4 {

    @OriginalMember(owner = "client!in", name = "K", descriptor = "Z")
    private boolean field2723 = true;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    private int field2721 = 4096;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field2718 = 0;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "Lbv;")
    public static class568 field2722 = new class568();

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "Lov;")
    public static class346 field2725;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field2720;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (arg1 >= -83) {
            this.field2721 = 93;
        }
        if (super.field38.field7618) {
            int[] var4 = this.method20(0, -21986, arg0 + -1 & class376.field5248);
            int[] var5 = this.method20(0, -21986, arg0);
            int[] var6 = this.method20(0, -21986, class376.field5248 & arg0 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class132.field1627; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2721;
                int var12 = (var5[class150.field1971 & var10 + 1] + -var5[var10 + -1 & class150.field1971]) * this.field2721;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var20 = var12 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field2723) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
    public static final void method1342(int arg0, int arg1) {
        ++field2719;
        if (arg0 <= 108) {
            field2722 = null;
        }
        if (arg1 != -1) {
            if (class71.field965[arg1]) {
                class296.field3844.method2058(arg1, 5121);
                class508.field7087[arg1] = null;
                class567.field7930[arg1] = null;
                class71.field965[arg1] = false;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
    public class211() {
        super(1, false);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(III)Z")
    public static final boolean method1343(int arg0, int arg1, int arg2) {
        ++field2726;
        if (!class55.method304(false, arg0, arg2)) {
            return false;
        } else {
            return (36864 & arg0) != arg1 | class452.method2628(arg2, arg0, (byte) 125) | class597.method3440((byte) 90, arg0, arg2) ? true : (class83.method468(true, arg0, arg2) | ~(8192 & arg0) != -1 | class168.method1001(arg2, ~arg1, arg0)) & ~(55 & arg2) == -1;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
    public static final void method1344(int arg0, int arg1) {
        ++field2724;
        if (!class501.field6954.field7871) {
            arg1 = -1;
        }
        if (~class334.field4666 != ~arg1) {
            int var2 = 15 / ((arg0 - -61) / 55);
            if (~arg1 != 0) {
                class145 var3 = class104.field1365.method642(arg1, -21629);
                class295 var4 = var3.method795(-1);
                if (var4 == null) {
                    arg1 = -1;
                } else {
                    class31.field488.method1723(var4.method1807(), var4.method1802(), var4.method1810(), class141.field1806, new Point(var3.field1881, var3.field1882), 71);
                    class334.field4666 = arg1;
                }
            }
            if (~arg1 == 0 && ~class334.field4666 != 0) {
                class31.field488.method1723((int[]) null, -1, -1, class141.field1806, new Point(), 12);
                class334.field4666 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
    public static void method1345(byte arg0) {
        field2725 = null;
        if (arg0 > 72) {
            field2722 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field2723 = arg1.method3045(-125) == 1;
            }
        } else {
            this.field2721 = arg1.method3090(-115);
        }
        if (arg0 >= -89) {
            method1342(-28, 25);
        }
        ++field2717;
    }
}
