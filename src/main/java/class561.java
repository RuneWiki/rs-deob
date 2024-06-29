import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class561 extends class392 {

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "Lem;")
    public static class206 field7580 = new class206(19, 12);

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "F")
    public float field7550;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "F")
    public float field7552;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "F")
    public float field7556;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "F")
    public float field7558;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "F")
    public float field7559;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "F")
    public float field7560;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "F")
    public float field7563;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "F")
    public float field7567;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "F")
    public float field7576;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "F")
    public float field7578;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "F")
    public float field7582;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "F")
    public float field7585;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!cf", name = "oa", descriptor = "(I)V", line = 3)
    public final void method678(int arg0) {
        field7572++;
        this.field7559 = 1.0F;
        this.field7578 = this.field7558 = class562.field7596[arg0 & 0x3FFF];
        this.field7556 = class562.field7595[arg0 & 0x3FFF];
        this.field7552 = this.field7563 = this.field7585 = this.field7567 = this.field7582 = this.field7576 = this.field7560 = 0.0F;
        this.field7550 = -this.field7556;
    }

    @OriginalMember(owner = "client!cf", name = "wa", descriptor = "(III[I)V", line = 20)
    public final void method690(int arg0, int arg1, int arg2, int[] arg3) {
        field7579++;
        arg3[0] = (int) ((float) arg2 * this.field7563 + (float) arg0 * this.field7559 + (float) arg1 * this.field7552);
        arg3[2] = (int) ((float) arg2 * this.field7558 + (float) arg0 * this.field7576 + (float) arg1 * this.field7556);
        arg3[1] = (int) ((float) arg2 * this.field7550 + (float) arg0 * this.field7567 + (float) arg1 * this.field7578);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)[F", line = 30)
    public final float[] method3132(boolean arg0) {
        if (!arg0) {
            this.field7578 = 0.2992657F;
        }
        class209.field2939[2] = this.field7576;
        class209.field2939[8] = this.field7563;
        class209.field2939[4] = this.field7552;
        class209.field2939[10] = this.field7558;
        class209.field2939[5] = this.field7578;
        class209.field2939[1] = this.field7567;
        class209.field2939[6] = this.field7556;
        class209.field2939[14] = this.field7560;
        field7561++;
        class209.field2939[12] = this.field7585;
        class209.field2939[0] = this.field7559;
        class209.field2939[9] = this.field7550;
        class209.field2939[13] = this.field7582;
        return class209.field2939;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()Lq;", line = 53)
    public final class392 method681() {
        field7548++;
        class561 var1 = new class561();
        var1.field7582 = this.field7582;
        var1.field7559 = this.field7559;
        var1.field7567 = this.field7567;
        var1.field7556 = this.field7556;
        var1.field7552 = this.field7552;
        var1.field7558 = this.field7558;
        var1.field7576 = this.field7576;
        var1.field7578 = this.field7578;
        var1.field7563 = this.field7563;
        var1.field7550 = this.field7550;
        var1.field7585 = this.field7585;
        var1.field7560 = this.field7560;
        return var1;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 75)
    public final void method3133(int arg0) {
        this.field7560 = -this.field7560;
        this.field7582 = -this.field7582;
        this.field7567 = -this.field7567;
        field7554++;
        if (arg0 != 13) {
            this.field7563 = -0.2670074F;
        }
        this.field7578 = -this.field7578;
        this.field7556 = -this.field7556;
        this.field7550 = -this.field7550;
        this.field7558 = -this.field7558;
        this.field7576 = -this.field7576;
    }

    @OriginalMember(owner = "client!cf", name = "YA", descriptor = "([I)V", line = 100)
    public final void method677(int[] arg0) {
        field7581++;
        float var2 = (float) arg0[0] - this.field7585;
        float var3 = (float) arg0[1] - this.field7582;
        float var4 = (float) arg0[2] - this.field7560;
        arg0[2] = (int) (this.field7558 * var4 + this.field7563 * var2 + this.field7550 * var3);
        arg0[0] = (int) (this.field7576 * var4 + this.field7567 * var3 + this.field7559 * var2);
        arg0[1] = (int) (this.field7556 * var4 + this.field7578 * var3 + this.field7552 * var2);
    }

    @OriginalMember(owner = "client!cf", name = "NA", descriptor = "(III)V", line = 116)
    public final void method689(int arg0, int arg1, int arg2) {
        this.field7560 = arg2;
        field7569++;
        this.field7582 = arg1;
        this.field7559 = this.field7578 = this.field7558 = 1.0F;
        this.field7585 = arg0;
        this.field7567 = this.field7576 = this.field7552 = this.field7556 = this.field7563 = this.field7550 = 0.0F;
    }

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "(I)V", line = 128)
    public final void method684(int arg0) {
        field7574++;
        float var2 = class562.field7596[arg0 & 0x3FFF];
        float var3 = class562.field7595[arg0 & 0x3FFF];
        float var4 = this.field7567;
        float var5 = this.field7578;
        float var6 = this.field7550;
        float var7 = this.field7582;
        this.field7567 = var2 * var4 - (this.field7576 * var3);
        this.field7578 = var2 * var5 - (this.field7556 * var3);
        this.field7576 = this.field7576 * var2 + var3 * var4;
        this.field7556 = this.field7556 * var2 + var3 * var5;
        this.field7550 = var2 * var6 - (this.field7558 * var3);
        this.field7558 = this.field7558 * var2 + var3 * var6;
        this.field7582 = var2 * var7 - this.field7560 * var3;
        this.field7560 = this.field7560 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lq;Z)V", line = 155)
    public final void method3134(class392 arg0, boolean arg1) {
        field7575++;
        class561 var3 = (class561) arg0;
        this.field7552 = var3.field7567;
        this.field7563 = var3.field7576;
        this.field7559 = var3.field7559;
        this.field7550 = var3.field7556;
        this.field7578 = var3.field7578;
        this.field7576 = var3.field7563;
        this.field7567 = var3.field7552;
        if (!arg1) {
            return;
        }
        this.field7556 = var3.field7550;
        this.field7558 = var3.field7558;
        this.field7585 = -(this.field7563 * var3.field7560 + this.field7559 * var3.field7585 + this.field7552 * var3.field7582);
        this.field7582 = -(this.field7550 * var3.field7560 + this.field7578 * var3.field7582 + this.field7567 * var3.field7585);
        this.field7560 = -(this.field7558 * var3.field7560 + this.field7576 * var3.field7585 + this.field7556 * var3.field7582);
    }

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "(I)V", line = 179)
    public final void method685(int arg0) {
        this.field7578 = 1.0F;
        field7549++;
        this.field7559 = this.field7558 = class562.field7596[arg0 & 0x3FFF];
        this.field7563 = class562.field7595[arg0 & 0x3FFF];
        this.field7552 = this.field7585 = this.field7567 = this.field7550 = this.field7582 = this.field7556 = this.field7560 = 0.0F;
        this.field7576 = -this.field7563;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[I)V", line = 197)
    public final void method682(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field7563 + (float) arg0 * this.field7559 + (float) arg1 * this.field7552 + this.field7585);
        arg3[2] = (int) ((float) arg2 * this.field7558 + (float) arg0 * this.field7576 + (float) arg1 * this.field7556 + this.field7560);
        arg3[1] = (int) ((float) arg2 * this.field7550 + (float) arg0 * this.field7567 + (float) arg1 * this.field7578 + this.field7582);
        field7564++;
    }

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "(III[I)V", line = 208)
    public final void method676(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg1 - this.field7582);
        int var6 = (int) ((float) arg2 - this.field7560);
        int var7 = (int) ((float) arg0 - this.field7585);
        field7570++;
        arg3[2] = (int) ((float) var6 * this.field7558 + (float) var5 * this.field7550 + (float) var7 * this.field7563);
        arg3[0] = (int) ((float) var6 * this.field7576 + (float) var5 * this.field7567 + (float) var7 * this.field7559);
        arg3[1] = (int) ((float) var6 * this.field7556 + (float) var5 * this.field7578 + (float) var7 * this.field7552);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[S)[S", line = 221)
    public static final short[] method3135(byte arg0, short[] arg1) {
        int var2 = -37 % ((arg0 - 46) / 50);
        field7568++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var3 = new short[arg1.length];
            class359.method2050(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "(III)V", line = 238)
    public final void method687(int arg0, int arg1, int arg2) {
        this.field7560 += arg2;
        this.field7585 += arg0;
        this.field7582 += arg1;
        field7555++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILr;)V", line = 248)
    public static final void method3136(int arg0, class166 arg1) {
        field7571++;
        int var2 = class603.field8403;
        int var3 = class627.field8692;
        int var4 = class568.field8040;
        int var5 = class426.field5970;
        int var6 = -10660793;
        arg1.method1170(var6, var5, var2, var4, var3, -28207);
        arg1.method1170(-16777216, 16, var2 + 1, var4 + -2, var3 + 1, -28207);
        arg1.method1166(var3 + 18, arg0, -16777216, var2 + 1, var4 + -2, var5 - 19);
        class428.field5986.method2423(class65.field812.method555(class697.field9900, true), var2 + 3, false, var6, var3 + 14, -1);
        int var7 = class214.field2991.method1499(8);
        int var8 = class214.field2991.method1491((byte) 117);
        int var9 = 0;
        for (class499 var10 = (class499) class588.field8265.method1436(28964); var10 != null; var10 = (class499) class588.field8265.method1443((byte) 6)) {
            int var11 = var3 + ((-var9 + class137.field1948 - 1) * 16) + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < var2 + var4 && var11 - 13 < var8 && var11 + 3 > var8 && var10.field6776) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class420.method2434(var10.field6780, (byte) -77)) {
                var13 = class599.field8366.method3949(arg0 - 1, (int) var10.field6787).field9200;
            } else if (var10.field6779 != -1) {
                var13 = class599.field8366.method3949(0, var10.field6779).field9200;
            } else if (class628.method3514(var10.field6780, (byte) 49)) {
                class393 var14 = (class393) class299.field4071.method970((byte) 89, (long) ((int) var10.field6787));
                if (var14 != null) {
                    class61 var15 = var14.field5552;
                    class568 var16 = var15.field674;
                    if (var16.field8079 != null) {
                        var16 = var16.method3259((byte) 118, class578.field8156);
                    }
                    if (var16 != null) {
                        var13 = var16.field8056;
                    }
                }
            } else if (class556.method3115(30916, var10.field6780)) {
                Object var17 = null;
                class301 var18;
                if (var10.field6780 == 1010) {
                    var18 = class475.field6543.method2685((int) var10.field6787, -69);
                } else {
                    var18 = class475.field6543.method2685((int) (var10.field6787 >>> 32 & 0x7FFFFFFFL), -111);
                }
                if (var18.field4113 != null) {
                    var18 = var18.method1833(-101, class578.field8156);
                }
                if (var18 != null) {
                    var13 = var18.field4120;
                }
            }
            String var19 = class91.method664(var10, arg0 ^ 0x76);
            if (var13 != null) {
                var19 = var19 + class90.method656(var13, (byte) -101);
            }
            class428.field5986.method2414(class599.field8362, false, var11, 0, var2 + 3, var12, class66.field862, var19);
            if (var10.field6784) {
                class164.field2361.method3927(class377.field5030.method1736(17046, var19) + var2 + 5, var11 + -12);
            }
            var9++;
        }
        class474.method2670(class568.field8040, (byte) -111, class426.field5970, class627.field8692, class603.field8403);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FI[FFFF)V", line = 352)
    public final void method3137(float arg0, int arg1, float[] arg2, float arg3, float arg4, float arg5) {
        field7566++;
        if (arg1 <= 50) {
            return;
        }
        arg2[2] = this.field7558 * arg5 + this.field7576 * arg0 + this.field7556 * arg4;
        arg2[1] = this.field7550 * arg5 + this.field7578 * arg4 + this.field7567 * arg0;
        arg2[0] = this.field7563 * arg5 + this.field7559 * arg0 + this.field7552 * arg4;
        float var8;
        float var9;
        float var10;
        if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
            float var12 = -arg3 / arg0;
            var9 = this.field7576 * var12 + this.field7560;
            var10 = this.field7567 * var12 + this.field7582;
            var8 = this.field7559 * var12 + this.field7585;
        } else if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var11 = -arg3 / arg4;
            var8 = this.field7552 * var11 + this.field7585;
            var9 = this.field7556 * var11 + this.field7560;
            var10 = this.field7578 * var11 + this.field7582;
        } else {
            float var7 = -arg3 / arg5;
            var8 = this.field7563 * var7 + this.field7585;
            var9 = this.field7558 * var7 + this.field7560;
            var10 = this.field7550 * var7 + this.field7582;
        }
        arg2[3] = -(arg2[2] * var9 + arg2[0] * var8 + arg2[1] * var10);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 397)
    public static void method3138(int arg0) {
        if (arg0 != -30709) {
            method3140(88, 26);
        }
        field7580 = null;
    }

    @OriginalMember(owner = "client!cf", name = "AA", descriptor = "(I)V", line = 417)
    public final void method673(int arg0) {
        field7583++;
        float var2 = class562.field7596[arg0 & 0x3FFF];
        float var3 = class562.field7595[arg0 & 0x3FFF];
        float var4 = this.field7559;
        float var5 = this.field7552;
        float var6 = this.field7563;
        this.field7559 = var2 * var4 - this.field7567 * var3;
        float var7 = this.field7585;
        this.field7567 = this.field7567 * var2 + var3 * var4;
        this.field7552 = var2 * var5 - this.field7578 * var3;
        this.field7578 = this.field7578 * var2 + var3 * var5;
        this.field7563 = var2 * var6 - (this.field7550 * var3);
        this.field7585 = var2 * var7 - this.field7582 * var3;
        this.field7550 = this.field7550 * var2 + var3 * var6;
        this.field7582 = this.field7582 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cf", name = "ZA", descriptor = "(I)V", line = 444)
    public final void method674(int arg0) {
        field7553++;
        float var2 = class562.field7596[arg0 & 0x3FFF];
        float var3 = class562.field7595[arg0 & 0x3FFF];
        float var4 = this.field7559;
        float var5 = this.field7552;
        float var6 = this.field7563;
        this.field7559 = this.field7576 * var3 + var2 * var4;
        float var7 = this.field7585;
        this.field7576 = this.field7576 * var2 - (var3 * var4);
        this.field7552 = this.field7556 * var3 + var2 * var5;
        this.field7556 = this.field7556 * var2 - var3 * var5;
        this.field7563 = this.field7558 * var3 + var2 * var6;
        this.field7585 = this.field7560 * var3 + var2 * var7;
        this.field7558 = this.field7558 * var2 - (var3 * var6);
        this.field7560 = this.field7560 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!cf", name = "na", descriptor = "(IIIIII)V", line = 472)
    public final void method680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7577++;
        float var7 = class562.field7596[arg3 & 0x3FFF];
        float var8 = class562.field7595[arg3 & 0x3FFF];
        float var9 = class562.field7596[arg4 & 0x3FFF];
        float var10 = class562.field7595[arg4 & 0x3FFF];
        float var11 = class562.field7596[arg5 & 0x3FFF];
        float var12 = class562.field7595[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7550 = var9 * var13 + var10 * var12;
        this.field7552 = var7 * var12;
        this.field7558 = var7 * var9;
        this.field7563 = -var10 * var11 + var9 * var14;
        this.field7559 = var9 * var11 + var10 * var14;
        this.field7556 = -var8;
        this.field7567 = -var9 * var12 + var10 * var13;
        this.field7576 = var7 * var10;
        this.field7578 = var7 * var11;
        this.field7560 = (float) (-arg0) * this.field7576 - (float) arg1 * this.field7556 - (float) arg2 * this.field7558;
        this.field7582 = (float) (-arg0) * this.field7567 - (float) arg1 * this.field7578 - ((float) arg2 * this.field7550);
        this.field7585 = (float) (-arg0) * this.field7559 - (float) arg1 * this.field7552 - ((float) arg2 * this.field7563);
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)[F", line = 511)
    public final float[] method3139(int arg0) {
        field7562++;
        class209.field2939[5] = this.field7578;
        class209.field2939[4] = this.field7552;
        class209.field2939[0] = this.field7559;
        class209.field2939[12] = 0.0F;
        class209.field2939[1] = this.field7567;
        class209.field2939[10] = this.field7558;
        class209.field2939[13] = 0.0F;
        class209.field2939[8] = this.field7563;
        class209.field2939[14] = 0.0F;
        class209.field2939[6] = this.field7556;
        class209.field2939[9] = this.field7550;
        class209.field2939[2] = this.field7576;
        if (arg0 != -24302) {
            this.field7582 = 0.46161836F;
        }
        return class209.field2939;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Z", line = 541)
    public static final boolean method3140(int arg0, int arg1) {
        field7551++;
        if (arg0 <= 110) {
            field7580 = null;
        }
        for (class499 var2 = (class499) class588.field8265.method1436(28964); var2 != null; var2 = (class499) class588.field8265.method1443((byte) 6)) {
            if (class628.method3514(var2.field6780, (byte) 49) && (long) arg1 == var2.field6787) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "(Lq;)V", line = 565)
    public final void method675(class392 arg0) {
        field7557++;
        class561 var2 = (class561) arg0;
        this.field7576 = var2.field7576;
        this.field7567 = var2.field7567;
        this.field7563 = var2.field7563;
        this.field7556 = var2.field7556;
        this.field7578 = var2.field7578;
        this.field7552 = var2.field7552;
        this.field7558 = var2.field7558;
        this.field7582 = var2.field7582;
        this.field7585 = var2.field7585;
        this.field7560 = var2.field7560;
        this.field7559 = var2.field7559;
        this.field7550 = var2.field7550;
    }

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "()V", line = 586)
    public final void method679() {
        field7573++;
        this.field7559 = this.field7578 = this.field7558 = 1.0F;
        this.field7567 = this.field7576 = this.field7552 = this.field7556 = this.field7563 = this.field7550 = this.field7585 = this.field7582 = this.field7560 = 0.0F;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FBIFIIF)V", line = 595)
    public final void method3141(float arg0, byte arg1, int arg2, float arg3, int arg4, int arg5, float arg6) {
        if (arg5 == 0) {
            this.field7567 = this.field7576 = this.field7552 = this.field7556 = this.field7563 = this.field7550 = 0.0F;
            this.field7578 = arg4;
            this.field7558 = 1.0F;
            this.field7559 = arg2;
        } else {
            float var8 = class562.field7596[arg5 & 0x3FFF];
            float var9 = class562.field7595[arg5 & 0x3FFF];
            this.field7578 = (float) arg4 * var8;
            this.field7576 = this.field7556 = this.field7563 = this.field7550 = 0.0F;
            this.field7559 = (float) arg2 * var8;
            this.field7567 = (float) arg2 * var9;
            this.field7552 = (float) arg4 * -var9;
            this.field7558 = 1.0F;
        }
        field7584++;
        this.field7582 = arg0;
        this.field7560 = arg6;
        if (arg1 < -70) {
            this.field7585 = arg3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "(I)V", line = 629)
    public final void method686(int arg0) {
        field7565++;
        this.field7558 = 1.0F;
        this.field7559 = this.field7578 = class562.field7596[arg0 & 0x3FFF];
        this.field7567 = class562.field7595[arg0 & 0x3FFF];
        this.field7552 = -this.field7567;
        this.field7563 = this.field7585 = this.field7550 = this.field7582 = this.field7576 = this.field7556 = this.field7560 = 0.0F;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 641)
    public class561() {
        this.method679();
    }
}
