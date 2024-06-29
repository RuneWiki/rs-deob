import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class452 extends class83 {

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    private int field6577 = 4096;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    private int field6578 = 4096;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    private int field6585 = 4096;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field6573 = 0;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field6584 = 0;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "[I")
    public static int[] field6575 = new int[14];

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "Z")
    public static boolean field6586 = false;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "[I")
    public static int[] field6572;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "[I")
    public static int[] field6576;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "[[[B")
    public static byte[][][] field6580;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IJLvm;)V", line = 3)
    public static final void method2806(int arg0, long arg1, class322 arg2) {
        class205.field2770 = class260.field3531;
        class182.field2320 = 0;
        ++field6571;
        int var4 = 110 % ((arg0 - -66) / 52);
        class260.field3531 = 0;
        long var5 = class442.method2730(25207);
        for (class174 var7 = (class174) class299.field4074.method986((byte) 112); var7 != null; var7 = (class174) class299.field4074.method984((byte) 82)) {
            if (var7.method916(arg2, arg1)) {
                ++class182.field2320;
            }
        }
        if (class436.field6375 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class299.field4074.method988((byte) 54) + ", running: " + class182.field2320 + ". Particles: " + class260.field3531 + ". Time taken: " + (-var5 + class442.method2730(25207)) + "ms");
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBLtq;)V", line = 37)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field6582;
        int var4 = 30 % ((arg1 - -27) / 50);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field6578 = arg2.method1374(-2);
                }
            } else {
                this.field6585 = arg2.method1374(-2);
            }
        } else {
            this.field6577 = arg2.method1374(-2);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 87)
    public class452() {
        super(1, false);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V", line = 95)
    public static void method2807(int arg0) {
        field6572 = null;
        field6575 = null;
        field6576 = null;
        int var1 = 1 / ((arg0 - -4) / 52);
        field6580 = null;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V", line = 116)
    public static final void method2808(int arg0) {
        class308.field4171 = class383.field5461.field5879 + class383.field5461.field5866 + 2;
        class205.field2774 = class111.field1385.field5866 - -class111.field1385.field5879 + 2;
        ++field6579;
        int var1 = 5 / ((arg0 - -51) / 48);
        class330.field4403 = new String[350 / class308.field4171];
        for (int var2 = 0; ~var2 > ~class330.field4403.length; ++var2) {
            class330.field4403[var2] = "";
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)[[I", line = 135)
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            field6573 = -29;
        }
        ++field6583;
        int[][] var3 = super.field927.method1774((byte) 125, arg1);
        if (super.field927.field4104) {
            int[][] var4 = this.method449(0, arg0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class420.field6139 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field6577 * var12 >> 12;
                    var9[var11] = this.field6585 * var13 >> 12;
                    var10[var11] = this.field6578 * var14 >> 12;
                } else {
                    var8[var11] = this.field6577;
                    var9[var11] = this.field6585;
                    var10[var11] = this.field6578;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(II)V", line = 201)
    public static final void method2809(int arg0, int arg1) {
        ++field6581;
        class114 var2 = class396.field5700;
        synchronized (class396.field5700) {
            class396.field5700.method614(-118, arg0);
        }
        class114 var3 = class203.field2718;
        synchronized (class203.field2718) {
            class203.field2718.method614(-128, arg0);
        }
        if (arg1 != -24785) {
            field6586 = false;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIFIIIIZ)[[I", line = 225)
    public static final int[][] method2810(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field6574;
        int[][] var9 = new int[arg2][arg7];
        class125 var10 = new class125();
        var10.field1609 = arg8;
        if (arg6 != 350) {
            return null;
        } else {
            var10.field1605 = arg5;
            var10.field1606 = (int) (arg3 * 4096.0F);
            var10.field1608 = arg0;
            var10.field1612 = arg1;
            var10.method120(false);
            class345.method2022(arg7, arg2, true);
            for (int var11 = 0; var11 < arg2; ++var11) {
                var10.method678(-7126, var9[var11], var11);
            }
            return var9;
        }
    }
}
