import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class348 extends class751 {

    @OriginalMember(owner = "client!pba", name = "J", descriptor = "I")
    private int field5100 = 4096;

    @OriginalMember(owner = "client!pba", name = "C", descriptor = "Z")
    private boolean field5095 = true;

    @OriginalMember(owner = "client!pba", name = "A", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!pba", name = "B", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!pba", name = "D", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!pba", name = "E", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!pba", name = "F", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!pba", name = "H", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!pba", name = "K", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(II)Z")
    public static final boolean method2200(int arg0, int arg1) {
        ++field5099;
        if (arg0 != -4) {
            return true;
        } else {
            return ~arg1 == -3 || ~arg1 == -4;
        }
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "(III)V")
    public static final void method2201(int arg0, int arg1, int arg2) {
        ++field5097;
        class678 var3 = class630.method3597(29636, arg2, (long) arg0);
        var3.method3834((byte) -124);
        var3.field9649 = arg1;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IB)[[I")
    public final int[][] method147(int arg0, byte arg1) {
        ++field5096;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (arg1 != 57) {
            method2203((byte) -117, (class120) null);
        }
        if (super.field10409.field8481) {
            int[] var4 = this.method4173(field5094 & arg0 - 1, (byte) -124, 0);
            int[] var5 = this.method4173(arg0, (byte) -119, 0);
            int[] var6 = this.method4173(arg0 + 1 & field5094, (byte) -127, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class673.field9452; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field5100;
                int var12 = (var5[class407.field5754 & var10 + 1] - var5[var10 + -1 & class407.field5754]) * this.field5100;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field5095) {
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field5095 = arg1.method842(2384) == 1;
            }
        } else {
            this.field5100 = arg1.method898((byte) -113);
        }
        int var5 = -69 % ((25 - arg0) / 63);
        ++field5101;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V")
    public class348() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZLiw;)V")
    public static final void method2202(int arg0, boolean arg1, class331 arg2) {
        ++field5098;
        if (!arg1) {
            method2200(-30, -49);
        }
        class486.field6883 = 0;
        class208.field3031 = false;
        class778.method4278(arg2, (byte) -81);
        class360.method2261(arg2, -18530);
        if (class208.field3031) {
            System.out.println("---endgpp---");
        }
        if (~arg2.field1521 != ~arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field1521 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLrv;)V")
    public static final void method2203(byte arg0, class120 arg1) {
        ++field5093;
        if (arg1.field1556.length + -arg1.field1521 >= 1) {
            int var2 = arg1.method842(2384);
            if (~var2 <= -1 && ~var2 >= -2) {
                if (~(arg1.field1556.length + -arg1.field1521) <= -3) {
                    if (arg0 > 46) {
                        int var3 = arg1.method898((byte) -87);
                        if (~(arg1.field1556.length + -arg1.field1521) <= ~(var3 * 6)) {
                            for (int var4 = 0; var3 > var4; ++var4) {
                                int var5 = arg1.method898((byte) -84);
                                int var6 = arg1.method871(23995);
                                if (~var5 > ~class604.field8499.length && class9.field127[var5] && (class463.field6616.method633((byte) -20, var5).field10450 != '1' || var6 >= -1 && ~var6 >= -2)) {
                                    class604.field8499[var5] = var6;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
