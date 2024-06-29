import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class344 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    private int field4963;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    private int field4964;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    private int field4973;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "Z")
    private boolean field4978;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    private int field4965;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    private int field4975;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    private int field4972;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    private int field4966;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "[I")
    private static int[] field4970 = new int[4];

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    private int field4967;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    private int field4969;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    private int field4976;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    private int field4979;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Lvj;")
    private static class256 field4968;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Lvj;")
    private static class256 field4974;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Lvj;")
    private class256 field4977;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Lni;")
    private static class305 field4971;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lvq;IIIIII)V", line = 6)
    public final void method2254(class269 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4977 == null) {
            return;
        }
        int var8 = this.field4976 - arg5 & 0x3FFF;
        int var9 = this.field4979 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4969) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4969) / 2;
        if (var10 < arg4 && this.field4969 + var10 > 0 && var11 < arg3 && this.field4969 + var11 > 0) {
            this.field4977.method1774(arg1 + var11, arg2 + var10, this.field4969, this.field4969);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)Z", line = 33)
    public final boolean method2255(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4978) {
            this.field4980 = 1073741823;
            var8 = this.field4963;
            var9 = this.field4964;
            var10 = this.field4973;
        } else {
            int var5 = this.field4963 - arg0;
            int var6 = this.field4964 - arg1;
            int var7 = this.field4973 - arg2;
            this.field4980 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4980 == 0) {
                this.field4980 = 1;
            }
            var8 = (var5 << 8) / this.field4980;
            var9 = (var6 << 8) / this.field4980;
            var10 = (var7 << 8) / this.field4980;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4969 = this.field4972 * arg3 / (this.field4978 ? 1024 : this.field4980);
        } else {
            this.field4969 = 0;
        }
        if (this.field4969 < 8) {
            this.field4977 = null;
            return false;
        }
        int var12 = class258.method1787(-125, this.field4969);
        if (var12 > arg3) {
            var12 = class434.method2709(arg3, (byte) 105);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4967 != var12) {
            this.field4967 = var12;
        }
        this.field4976 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4979 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4977 = null;
        return true;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lvq;Lcr;)Z", line = 89)
    public final boolean method2256(class269 arg0, class344 arg1) {
        return this.field4977 != null || this.method2257(arg0, arg1);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Lvq;Lcr;)Z", line = 95)
    private final boolean method2257(class269 arg0, class344 arg1) {
        if (this.field4977 == null) {
            if (this.field4966 == 0) {
                if (class119.field1611.method1471(-31571, this.field4965)) {
                    int[] var3 = class119.field1611.method1470(0.7F, this.field4965, this.field4967, 3962, this.field4967, false);
                    this.field4977 = arg0.method876(var3, 0, this.field4967, this.field4967, this.field4967);
                }
            } else if (this.field4966 == 2) {
                this.method2260(arg0, arg1);
            } else if (this.field4966 == 1) {
                this.method2263(arg0, arg1);
            }
        }
        return this.field4977 != null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "()V", line = 131)
    public static void method2258() {
        field4971 = null;
        field4974 = null;
        field4968 = null;
        field4970 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lvq;)V", line = 138)
    private static final void method2259(class269 arg0) {
        if (field4968 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field4968 = arg0.method876(var2, 0, 128, 128, 128);
        field4974 = arg0.method876(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(Lvq;Lcr;)V", line = 203)
    private final void method2260(class269 arg0, class344 arg1) {
        class406 var3 = class294.method1986(0, -116, this.field4965, class269.field3920);
        if (var3 == null) {
            return;
        }
        arg0.method904(field4970);
        arg0.method937(0, 0, this.field4967, this.field4967);
        arg0.method1012(0, 0, this.field4967, this.field4967, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4978) {
                var4 = -arg1.field4963;
                var5 = -arg1.field4964;
                var6 = -arg1.field4973;
            } else {
                var4 = this.field4963 - arg1.field4963;
                var5 = this.field4964 - arg1.field4964;
                var6 = this.field4973 - arg1.field4973;
            }
        }
        if (this.field4976 != 0) {
            int var7 = -this.field4976 & 0x3FFF;
            int var8 = class447.field6381[var7];
            int var9 = class447.field6390[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4979 != 0) {
            int var11 = -this.field4979 & 0x3FFF;
            int var12 = class447.field6381[var11];
            int var13 = class447.field6390[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method883(1.0F);
        arg0.method873(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class305 var15 = arg0.method905(var3, 1024, 0, 64, 768);
        int var16 = var15.method202() - var15.method252();
        int var17 = var15.method214() - var15.method221();
        int var18 = var15.method252() + var16 / 2;
        int var19 = var15.method221() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1003(var18, var19, var20, var20);
        arg0.method973(arg0.method1016());
        class154 var21 = arg0.method884();
        var21.method1133(0, 0, arg0.method892() - var15.method199());
        var15.method223(var21, (class144) null, arg0.method892(), 1);
        this.field4977 = arg0.method1027(0, 0, this.field4967, this.field4967, true);
        this.field4977.method84(0, 0, 3);
        arg0.method937(field4970[0], field4970[1], field4970[2], field4970[3]);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "()V", line = 289)
    public final void method2261() {
        this.field4977 = null;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "()V", line = 306)
    public static final void method2262() {
        field4971 = null;
        field4968 = null;
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(Lvq;Lcr;)V", line = 311)
    private final void method2263(class269 arg0, class344 arg1) {
        method2264(arg0);
        method2259(arg0);
        arg0.method904(field4970);
        arg0.method937(0, 0, this.field4967, this.field4967);
        arg0.method897();
        arg0.method1012(0, 0, this.field4967, this.field4967, this.field4975 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4978) {
                var3 = -arg1.field4963;
                var4 = -arg1.field4964;
                var5 = -arg1.field4973;
            } else {
                var3 = arg1.field4963 - this.field4963;
                var4 = arg1.field4964 - this.field4964;
                var5 = arg1.field4973 - this.field4973;
            }
        }
        if (this.field4976 != 0) {
            int var6 = class447.field6381[this.field4976];
            int var7 = class447.field6390[this.field4976];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4979 != 0) {
            int var9 = class447.field6381[this.field4979];
            int var10 = class447.field6390[this.field4979];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class305 var12 = field4971.method200((byte) 0, 25600, true);
        if (arg0.method887()) {
            var12.method222((short) 0, (short) this.field4965);
        } else {
            var12.method196((short) 127, class119.field1611.method1475(this.field4965, 17673).field4175);
            var12.method222((short) 0, (short) -1);
        }
        arg0.method883(1.0F);
        arg0.method873(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4967 * 1024 / (var12.method202() - var12.method252());
        if (this.field4975 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1003(this.field4967 / 2, this.field4967 / 2, var13, var13);
        arg0.method973(arg0.method1016());
        class154 var14 = arg0.method1016();
        var14.method1133(0, 0, arg0.method892() - var12.method199());
        var12.method223(var14, (class144) null, 1024, 1);
        int var15 = this.field4967 * 13 / 16;
        int var16 = (this.field4967 - var15) / 2;
        field4974.method74(var16, var16, var15, var15, 1, this.field4975 | 0xFF000000, 1);
        this.field4977 = arg0.method1027(0, 0, this.field4967, this.field4967, true);
        arg0.method897();
        arg0.method1012(0, 0, this.field4967, this.field4967, 0, 0);
        field4968.method74(0, 0, this.field4967, this.field4967, 0, 0, 0);
        this.field4977.method84(0, 0, 0);
        arg0.method937(field4970[0], field4970[1], field4970[2], field4970[3]);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Lvq;)V", line = 400)
    private static final void method2264(class269 arg0) {
        if (field4971 != null) {
            return;
        }
        class406 var1 = new class406(580, 1104, 1);
        var1.method2552((short) 0, (byte) 0, (short) 32767, (short) 1024, (short) 1024, (short) 0, (byte) 87, (short) 1024, (byte) 0, (byte) 0);
        var1.method2554(0, -97, 0, 128);
        var1.method2554(0, -71, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class447.field6381[var3];
            int var5 = class447.field6390[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class447.field6390[var12] >> 8;
                int var14 = class447.field6381[var12] * var4 >> 23;
                int var15 = class447.field6381[var12] * var5 >> 23;
                var1.method2554(var15, -93, -var14, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2551((byte) 66, (byte) 0, (short) 0, 0, (byte) 0, (byte) 0, var8, (short) 127, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2551((byte) 66, (byte) 0, (short) 0, var8, (byte) 0, (byte) 0, var10, (short) 127, var7);
                    var1.method2551((byte) 66, (byte) 0, (short) 0, var10, (byte) 0, (byte) 0, var11, (short) 127, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2551((byte) 66, (byte) 0, (short) 0, var7, (byte) 0, (byte) 0, var8, (short) 127, 1);
            }
        }
        var1.field5702 = var1.field5719;
        var1.field5722 = null;
        var1.field5686 = null;
        var1.field5707 = null;
        field4971 = arg0.method905(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4963 = arg2;
        this.field4964 = arg3;
        this.field4973 = arg4;
        this.field4978 = arg7;
        this.field4965 = arg1;
        this.field4975 = arg6;
        this.field4972 = arg5;
        this.field4966 = arg0;
    }
}
