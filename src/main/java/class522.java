import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class522 extends class227 {

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    private int field7674 = -1;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "[S")
    public static short[] field7677 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "[I")
    public static int[] field7683 = new int[4];

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "Lho;")
    public static class103 field7676 = new class103(73, 1);

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    private int field7680;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    private int field7685;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "Lo;")
    public static class24 field7672;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "Lqm;")
    public static class98 field7673;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "[I")
    private int[] field7678;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)[[I", line = 6)
    public final int[][] method112(int arg0, boolean arg1) {
        ++field7675;
        int[][] var3 = super.field3059.method28((byte) -66, arg0);
        if (!arg1) {
            this.field7685 = 89;
        }
        if (super.field3059.field57) {
            int var4 = this.field7685 * (class305.field4055 != this.field7680 ? this.field7680 * arg0 / class305.field4055 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class446.field6486 != ~this.field7685) {
                for (int var8 = 0; var8 < class446.field6486; ++var8) {
                    int var9 = this.field7685 * var8 / class446.field6486;
                    int var10 = this.field7678[var4 + var9];
                    var7[var8] = class95.method534(4080, var10 << 4);
                    var6[var8] = class95.method534(65280, var10) >> 4;
                    var5[var8] = class95.method534(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~class446.field6486 < ~var11; ++var11) {
                    int var12 = this.field7678[var4++];
                    var7[var11] = class95.method534(4080, var12 << 4);
                    var6[var11] = class95.method534(var12 >> 4, 4080);
                    var5[var11] = class95.method534(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lug;II)V", line = 72)
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field7682;
        if (arg1 != 487215116) {
            this.method61((class396) null, 84, 120);
        }
        if (~arg2 == -1) {
            this.field7674 = arg0.method2386(arg1 + -487238764);
        }
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)I", line = 86)
    public final int method1453(int arg0) {
        if (arg0 != 2045302183) {
            this.method112(16, true);
        }
        ++field7671;
        return this.field7674;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 102)
    public static void method3110(byte arg0) {
        field7673 = null;
        field7677 = null;
        if (arg0 >= 37) {
            field7676 = null;
            field7683 = null;
            field7672 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V", line = 129)
    public final void method1454(int arg0) {
        ++field7681;
        if (arg0 > -33) {
            this.field7680 = -5;
        }
        super.method1454(-54);
        this.field7678 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILta;IILjk;ILo;B)V", line = 142)
    public static final void method3111(int arg0, class144 arg1, int arg2, int arg3, class450 arg4, int arg5, class24 arg6, byte arg7) {
        ++field7679;
        if (arg6 != null) {
            int var8;
            if (~class47.field491 == -5) {
                var8 = 16383 & (int) class143.field1907;
            } else {
                var8 = (int) class143.field1907 - -class299.field3928 & 16383;
            }
            if (arg7 != 39) {
                method3111(-123, (class144) null, 36, -28, (class450) null, -112, (class24) null, (byte) 93);
            }
            int var9 = 10 + Math.max(arg4.field6612 / 2, arg4.field6573 / 2);
            int var10 = arg3 * arg3 + arg5 * arg5;
            if (~var10 >= ~(var9 * var9)) {
                int var11 = class456.field6812[var8];
                int var12 = class456.field6811[var8];
                if (class47.field491 != 4) {
                    var12 = var12 * 256 / (class420.field6099 - -256);
                    var11 = var11 * 256 / (class420.field6099 + 256);
                }
                int var13 = arg3 * var11 + arg5 * var12 >> 15;
                int var14 = arg3 * var12 + -(arg5 * var11) >> 15;
                arg6.method7(arg4.field6612 / 2 + arg0 - (-var13 + arg6.method155() / 2), -var14 + (arg4.field6573 / 2 + arg2 - arg6.method153() / 2), arg1, arg0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 184)
    public class522() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)V", line = 190)
    public final void method1462(int arg0, int arg1, byte arg2) {
        ++field7684;
        super.method1462(arg0, arg1, (byte) 118);
        if (this.field7674 >= 0 && class363.field4965 != null) {
            int var4 = class363.field4965.method94(this.field7674, (byte) -72).field6302 ? 64 : 128;
            this.field7678 = class363.field4965.method90(1.0F, false, false, this.field7674, var4, var4);
            this.field7680 = var4;
            this.field7685 = var4;
        }
        if (arg2 <= 43) {
            this.field7678 = null;
        }
    }
}
