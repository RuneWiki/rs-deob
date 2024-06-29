import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class178 extends class23 {

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    private int field3182 = 4096;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    private int field3181 = 4096;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    private int field3195 = 4096;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "Llc;")
    public static class143 field3183 = class66.method374("hitbar_default", -1);

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Llc;")
    public static class143 field3189 = class66.method374("<col=ff0000>", -1);

    @OriginalMember(owner = "client!og", name = "V", descriptor = "[I")
    public static int[] field3194 = new int[] { 0, 0, 0, -2, 0, 0, 0, 9, 10, 0, 0, 6, 0, -1, 0, 0, 0, 0, 0, -1, 24, 0, 0, 0, 5, -2, -2, -2, 0, 8, 0, 0, 0, 0, 0, 0, -2, 5, 0, 0, -2, 0, 0, 15, 0, 2, 15, -1, -1, 4, 0, 0, 8, 0, 0, 0, -2, 6, 0, 0, 5, 14, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 10, -1, 0, 6, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 20, 0, 0, -2, 0, 1, 7, 0, 0, 0, 0, 1, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 7, 0, 12, 1, -2, 0, 0, 3, 0, -2, 0, 0, 0, 0, 10, 0, 0, 4, 6, 0, 10, 0, 10, 12, 3, 0, 0, 0, 6, 0, 2, 0, 0, 0, 8, 5, 0, 0, 0, -1, 0, 2, -1, 0, 0, 4, 0, 0, 0, 4, 0, 0, -1, 8, -1, 3, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 8, 0, 6, 0, 0, 9, 0, 0, 0, 5, 4, 0, 7, 3, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 6, 0, -1, -2, 5, 14, 0, 0, 6, 0, 0, 0, 0, 0, 0, -1, 6, 6, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 8, 0, 0, 0, 0, -1, 0, 0, 0, 2, 1, 0, 0, 2 };

    @OriginalMember(owner = "client!og", name = "O", descriptor = "Llc;")
    public static class143 field3187 = class66.method374("Weiter", -1);

    @OriginalMember(owner = "client!og", name = "T", descriptor = "Llc;")
    private static class143 field3192 = class66.method374("slide:", -1);

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Llc;")
    public static class143 field3186 = field3192;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "Llc;")
    public static class143 field3191 = field3192;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "[I")
    public static int[] field3193;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(III)Lri;")
    public static final class57 method1170(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class57 var4 = var3.field2131;
            var3.field2131 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(III)V")
    public static final void method1171(int arg0, int arg1, int arg2) {
        if (class10.field216 > 0) {
            class13.method108(class10.field216, false);
            class10.field216 = 0;
        }
        ++field3185;
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        int var6 = class260.field4650 * arg2;
        for (int var7 = 1; var7 < var3 + -1; ++var7) {
            int var8 = (-var7 + var3) * class261.field4662[var7] / var3;
            if (~var8 > -1) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; ++var9) {
                int var11 = class67.field1268[var4++];
                int var12 = class260.field4651[var6++ + arg1];
                if (~var11 != -1) {
                    int var13 = var11 - -18;
                    if (~var13 < -256) {
                        var13 = 255;
                    }
                    int var14 = -var11 + 238;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class99.field1784[var11];
                    class283.field4988.field2894[var5++] = class129.method777(16711680, class129.method777(var15, 65280) * var13 + class129.method777(65280, var12) * var14) + class129.method777(var13 * class129.method777(16711935, var15) + class129.method777(16711935, var12) * var14, -16711936) >> 8;
                } else {
                    class283.field4988.field2894[var5++] = var12;
                }
            }
            for (int var10 = 0; ~var10 > ~var8; ++var10) {
                class283.field4988.field2894[var5++] = class260.field4651[var6++ + arg1];
            }
            var6 += class260.field4650 + -128;
        }
        if (arg0 != 65280) {
            method1174(-29, (class7) null, 53);
        }
        class283.field4988.method1043(arg1, arg2);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field3181 = arg0.method1275(128);
                    }
                } else {
                    this.field3182 = arg0.method1275(128);
                }
            } else {
                this.field3195 = arg0.method1275(128);
            }
            ++field3184;
        }
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    public static void method1172(int arg0) {
        if (arg0 <= 125) {
            field3192 = null;
        }
        field3187 = null;
        field3192 = null;
        field3193 = null;
        field3191 = null;
        field3189 = null;
        field3194 = null;
        field3186 = null;
        field3183 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
    public static final void method1173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg1;
        if (arg0 == -1) {
            while (~arg5 <= ~var6) {
                class289.method1927(class15.field268[var6], arg3, arg4, -120, arg2);
                ++var6;
            }
            ++field3188;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILgf;I)Lek;")
    public static final class160 method1174(int arg0, class7 arg1, int arg2) {
        ++field3190;
        if (arg2 != 0) {
            return null;
        } else {
            return !class177.method1164(arg0, 55, arg1) ? null : class207.method1445(arg2 ^ 128);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field3196;
        if (arg1 != 1) {
            field3191 = null;
        }
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int[][] var4 = this.method161(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class72.field1359; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 == var14 && var13 == var14) {
                    var9[var11] = this.field3195 * var12 >> 12;
                    var8[var11] = this.field3182 * var14 >> 12;
                    var10[var11] = this.field3181 * var13 >> 12;
                } else {
                    var9[var11] = this.field3195;
                    var8[var11] = this.field3182;
                    var10[var11] = this.field3181;
                }
            }
        }
        return var3;
    }
}
