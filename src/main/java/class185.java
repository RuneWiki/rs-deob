import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class185 extends class219 {

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    private int field3192 = -1;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "[I")
    public static int[] field3185 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field3197 = 0;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    private int field3183;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    private int field3187;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "[I")
    private int[] field3193;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I", line = 6)
    public final int method1396(int arg0) {
        field3190++;
        return arg0 == 1 ? this.field3192 : -114;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILb;)V", line = 19)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            this.field3192 = 110;
        }
        if (arg0 == 0) {
            this.field3192 = arg2.method761((byte) 108);
        }
        field3184++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIBIII)V", line = 35)
    public static final void method1397(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = arg1;
        int var7 = 0;
        if (arg2 > -85) {
            field3185 = (int[]) null;
        }
        field3198++;
        int var8 = arg1 * arg1;
        int var9 = var8 << 1;
        int var10 = arg0 * arg0;
        class3.method14(arg4, arg5 - arg0, arg5 - -arg0, class184.field3180[arg3], -108);
        int var11 = arg1 << 1;
        int var12 = var10 << 1;
        int var13 = (1 - var11) * var10 + var9;
        int var14 = ((var7 << 1) + 3) * var9;
        int var15 = var8 << 2;
        int var16 = var8 - ((var11 - 1) * var12);
        int var17 = var10 << 2;
        int var18 = ((arg1 << 1) - 3) * var12;
        int var19 = (arg1 - 1) * var17;
        int var20 = (var7 + 1) * var15;
        while (var6 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var7++;
                    var13 += var14;
                    var16 += var20;
                    var14 += var15;
                    var20 += var15;
                }
            }
            if (var16 < 0) {
                var13 += var14;
                var7++;
                var16 += var20;
                var20 += var15;
                var14 += var15;
            }
            var13 += -var19;
            var16 += -var18;
            var19 -= var17;
            int var21 = arg5 + var7;
            var18 -= var17;
            int var22 = arg5 - var7;
            var6--;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            class3.method14(arg4, var22, var21, class184.field3180[var24], -114);
            class3.method14(arg4, var22, var21, class184.field3180[var23], -113);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Z", line = 117)
    private final boolean method1398(int arg0) {
        field3196++;
        if (this.field3193 != null) {
            return true;
        } else if (arg0 <= this.field3192) {
            int var2 = class128.field2326;
            int var3 = class47.field749;
            int var4 = class216.field3614.method154(this.field3192, 103) ? 64 : 128;
            this.field3193 = class216.field3614.method144(this.field3192, arg0 ^ 0xFFFFFFD8);
            this.field3187 = var4;
            this.field3183 = var4;
            class260.method1795(8827, var2, var3);
            return this.field3193 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 142)
    public class185() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 146)
    public final void method216(int arg0) {
        super.method216(-61);
        field3188++;
        if (arg0 > -12) {
            this.method1398(20);
        }
        this.field3193 = null;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)V", line = 162)
    public static void method1399(byte arg0) {
        if (arg0 != 89) {
            field3195 = -45;
        }
        field3185 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[[I", line = 184)
    public final int[][] method219(int arg0, byte arg1) {
        field3189++;
        if (arg1 != 83) {
            this.field3187 = 110;
        }
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917 && this.method1398(0)) {
            int var4 = this.field3187 * (class47.field749 == this.field3183 ? arg0 : this.field3183 * arg0 / class47.field749);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class128.field2326 == this.field3187) {
                for (int var11 = 0; var11 < class128.field2326; var11++) {
                    int var12 = this.field3193[var4++];
                    var7[var11] = class92.method695(255, var12) << 4;
                    var6[var11] = class92.method695(65280, var12) >> 4;
                    var5[var11] = class92.method695(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class128.field2326; var8++) {
                    int var9 = this.field3187 * var8 / class128.field2326;
                    int var10 = this.field3193[var4 + var9];
                    var7[var8] = class92.method695(var10 << 4, 4080);
                    var6[var8] = class92.method695(var10, 65280) >> 4;
                    var5[var8] = class92.method695(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)I", line = 258)
    public static final int method1400(int arg0, int arg1, int arg2, int arg3) {
        field3186++;
        if ((class213.field3580[arg1][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg2 > -23) {
            return -7;
        } else if (arg1 <= 0 || (class213.field3580[1][arg0][arg3] & 0x2) == 0) {
            return arg1;
        } else {
            return arg1 - 1;
        }
    }
}
