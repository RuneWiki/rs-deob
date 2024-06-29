import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class402 extends class30 {

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    private int field5629 = 1024;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    private int field5634 = 2048;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    private int field5635 = 3072;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "[F")
    public static float[] field5639 = new float[4];

    @OriginalMember(owner = "client!io", name = "B", descriptor = "Llh;")
    public static class487 field5630 = new class487(16, 3);

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "Lsea;")
    public static class648 field5641;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZF)F", line = 5)
    public static final float method2343(boolean arg0, float arg1) {
        if (!arg0) {
            field5641 = null;
        }
        ++field5633;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F + -15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)[[I", line = 17)
    public final int[][] method30(int arg0, byte arg1) {
        ++field5637;
        if (arg1 != 7) {
            field5630 = null;
        }
        int[][] var3 = super.field377.method3683(arg0, (byte) -23);
        if (super.field377.field9085) {
            int[][] var4 = this.method292(99, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class31.field399 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field5634 >> 12) + this.field5629;
                var9[var11] = (var6[var11] * this.field5634 >> 12) + this.field5629;
                var10[var11] = (var7[var11] * this.field5634 >> 12) + this.field5629;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 70)
    public class402() {
        super(1, false);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[I", line = 73)
    public final int[] method48(int arg0, int arg1) {
        ++field5632;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1, 0, (byte) -104);
            for (int var5 = 0; ~class31.field399 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field5634 >> 12) + this.field5629;
            }
        }
        if (arg0 != 1) {
            field5630 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IB)Lkba;", line = 106)
    public static final class91 method2344(int arg0, byte arg1) {
        ++field5638;
        if (arg1 != 57) {
            field5630 = null;
        }
        class91 var2 = (class91) class14.field146.method3747((byte) -66, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class477.field6581.method3654(arg1 ^ -15560, 1, arg0);
            class91 var4 = new class91();
            var4.field1314 = arg0;
            if (var3 != null) {
                var4.method666(new class501(var3), (byte) -93);
            }
            var4.method661(false);
            if (var4.field1299 == 2 && class264.field3581.method970((byte) 89, (long) arg0) == null) {
                class264.field3581.method968((long) arg0, new class72(class12.field120), arg1 ^ -58);
                class414.field5863[class12.field120++] = var4;
            }
            class14.field146.method3748((long) arg0, var4, 12537);
            return var4;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 143)
    public final void method29(byte arg0) {
        this.field5634 = -this.field5629 + this.field5635;
        if (arg0 >= -10) {
            method2347((byte) -50, -118);
        }
        ++field5628;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lqh;B)I", line = 159)
    public static final int method2345(class61 arg0, byte arg1) {
        ++field5631;
        class568 var2 = arg0.field674;
        if (var2.field8079 != null) {
            var2 = var2.method3259((byte) 116, class578.field8156);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field8083;
        if (arg1 < 90) {
            return -25;
        } else {
            class67 var4 = arg0.method895(-25227);
            if (arg0.field1761 != -1 && !arg0.field1703) {
                if (arg0.field1761 != var4.field875 && ~arg0.field1761 != ~var4.field893 && ~arg0.field1761 != ~var4.field911 && ~arg0.field1761 != ~var4.field874) {
                    if (arg0.field1761 == var4.field890 || arg0.field1761 == var4.field870 || ~arg0.field1761 == ~var4.field886 || arg0.field1761 == var4.field906) {
                        var3 = var2.field8059;
                    }
                } else {
                    var3 = var2.field8065;
                }
            } else {
                var3 = var2.field8007;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)I", line = 202)
    public static final int method2346(int arg0, int arg1) {
        return class24.field305 != null ? class24.field305[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)Lde;", line = 205)
    public static final class492 method2347(byte arg0, int arg1) {
        ++field5640;
        if (arg0 > -97) {
            method2348((byte) -126);
        }
        return ~arg1 <= -1 && ~arg1 > -101 ? class301.field4192[arg1] : null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BILac;)V", line = 219)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field5636;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field378 = ~arg2.method2874((byte) -75) == -2;
                }
            } else {
                this.field5635 = arg2.method2845(-1);
            }
        } else {
            this.field5629 = arg2.method2845(-1);
        }
        if (arg0 <= 100) {
            this.field5629 = 3;
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(B)V", line = 262)
    public static void method2348(byte arg0) {
        field5641 = null;
        field5630 = null;
        field5639 = null;
        if (arg0 != 33) {
            method2343(false, 0.20602432F);
        }
    }
}
