import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class280 extends class431 {

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "Lqp;")
    private class470 field4231;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "Lkd;")
    private class188 field4239;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "Llk;")
    private class417 field4241;

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    private int field4229;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    private int field4254;

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
    private int field4246;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "[[F")
    private float[][] field4247;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "[[F")
    private float[][] field4234;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "[[F")
    private float[][] field4253;

    @OriginalMember(owner = "client!ns", name = "G", descriptor = "Lhp;")
    private class217 field4249;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "Luc;")
    private class23 field4243;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "Lgu;")
    private class412 field4237;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "Lpl;")
    private class463 field4233;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Lwu;")
    private class253 field4230;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "Lgi;")
    private class481 field4238;

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "Lgi;")
    private class481 field4252;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "Z")
    public static boolean field4236 = false;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4228 = new Rectangle[100];

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "I")
    private int field4245;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
    private int field4255;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Ljn;")
    public static class507 field4227;

    @OriginalMember(owner = "client!ns", name = "H", descriptor = "[I")
    public static int[] field4250;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([[ZIZII)V", line = 18)
    public final void method1824(boolean[][] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4242++;
        if (this.field4233 == null || this.field4251 > (arg1 + arg4) || arg4 - arg1 > this.field4229) {
            return;
        }
        if (!arg2) {
            this.field4253 = null;
        }
        if (arg1 + arg3 < this.field4254 || this.field4246 < arg3 - arg1) {
            return;
        }
        for (int var6 = this.field4254; var6 <= this.field4246; var6++) {
            for (int var7 = this.field4251; var7 <= this.field4229; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg3;
                if (var8 > -arg1 && arg1 > var8 && (-arg1) < var9 && arg1 > var9 && arg0[arg1 + var8][arg1 + var9]) {
                    this.field4239.method1292((int) (this.field4231.method2834(97) * 255.0F) << 24, false);
                    this.field4239.method1267(null, null, (byte) -92, this.field4238, this.field4252);
                    this.field4239.method1270(this.field4233, this.field4255, 0, 4, -2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIII)V", line = 88)
    public static final void method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= 86) {
            method1828(true);
        }
        for (int var6 = arg3; var6 <= arg4; var6++) {
            class359.method2255((byte) -92, class416.field6200[var6], arg0, arg5, arg2);
        }
        field4232++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIII)V", line = 110)
    private final void method1826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 2411) {
            method1828(false);
        }
        field4240++;
        long var8 = -1L;
        int var10 = (arg6 << this.field4241.field2206) + arg3;
        int var11 = (arg5 << this.field4241.field2206) + arg0;
        int var12 = this.field4241.method412(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class431 var13 = this.field4237.method2585((byte) 114, var8);
            if (var13 != null) {
                this.method1827(-1, ((class49) var13).field631);
                return;
            }
        }
        short var14 = (short) (this.field4245++);
        if (var8 != -1L) {
            this.field4237.method2591(var8, new class49(var14), (byte) -110);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg0 == 0) {
            var15 = this.field4247[arg2][arg1];
            var16 = this.field4253[arg2][arg1];
            var17 = this.field4234[arg2][arg1];
        } else if (this.field4241.field2210 == arg3 && arg0 == 0) {
            var17 = this.field4234[arg2 + 1][arg1];
            var15 = this.field4247[arg2 + 1][arg1];
            var16 = this.field4253[arg2 + 1][arg1];
        } else if (this.field4241.field2210 == arg3 && this.field4241.field2210 == arg0) {
            var17 = this.field4234[arg2 + 1][arg1 + 1];
            var15 = this.field4247[arg2 + 1][arg1 + 1];
            var16 = this.field4253[arg2 + 1][arg1 + 1];
        } else if (arg3 == 0 && this.field4241.field2210 == arg0) {
            var15 = this.field4247[arg2][arg1 + 1];
            var17 = this.field4234[arg2][arg1 + 1];
            var16 = this.field4253[arg2][arg1 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field4241.field2210;
            float var19 = (float) arg0 / (float) this.field4241.field2210;
            float var20 = this.field4247[arg2][arg1];
            float var21 = this.field4253[arg2][arg1];
            float var22 = this.field4234[arg2][arg1];
            float var23 = this.field4247[arg2 + 1][arg1];
            float var24 = this.field4253[arg2 + 1][arg1];
            float var25 = (this.field4247[arg2][arg1 + 1] - var20) * var18 + var20;
            float var26 = (this.field4253[arg2][arg1 + 1] - var21) * var18 + var21;
            float var27 = (this.field4234[arg2][arg1 + 1] - var22) * var18 + var22;
            float var28 = (this.field4253[arg2 + 1][arg1 + 1] - var24) * var18 + var24;
            float var29 = (this.field4247[arg2 + 1][arg1 + 1] - var23) * var18 + var23;
            float var30 = this.field4234[arg2 + 1][arg1];
            var16 = (var28 - var26) * var19 + var26;
            float var31 = (this.field4234[arg2 + 1][arg1 + 1] - var30) * var18 + var30;
            var15 = (var29 - var25) * var19 + var25;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field4231.method2835(-30143) - var10);
        float var33 = (float) (this.field4231.method2832(false) - var12);
        float var34 = (float) (this.field4231.method2833((byte) 127) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field4231.method2838((byte) -111);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var39 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4231.method2836((byte) 102);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF03) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field4239.field3141) {
            this.field4243.method173((float) var10, 101127152);
            this.field4243.method173((float) var12, arg4 ^ 0x6071A9B);
            this.field4243.method173((float) var11, arg4 ^ 0x6071A9B);
        } else {
            this.field4243.method171((float) var10, (byte) 51);
            this.field4243.method171((float) var12, (byte) 51);
            this.field4243.method171((float) var11, (byte) 51);
        }
        this.field4243.method1545(var45, arg4 ^ 0xFFFFF6B4);
        this.field4243.method1545(var46, -87);
        this.field4243.method1545(var47, -40);
        this.field4243.method1545(255, -126);
        this.method1827(-1, var14);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IS)V", line = 278)
    private final void method1827(int arg0, short arg1) {
        if (arg0 != -1) {
            field4227 = null;
        }
        if (this.field4239.field3141) {
            this.field4249.method1542(arg1, arg0 - 2755);
        } else {
            this.field4249.method1504((byte) 104, arg1);
        }
        field4244++;
        this.field4255++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V", line = 298)
    public static void method1828(boolean arg0) {
        field4250 = null;
        if (arg0) {
            method1828(true);
        }
        field4228 = null;
        field4227 = null;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lkd;Llk;Lqp;[I)V", line = 309)
    public class280(class188 arg0, class417 arg1, class470 arg2, int[] arg3) {
        this.field4231 = arg2;
        this.field4239 = arg0;
        this.field4241 = arg1;
        int var5 = this.field4231.method2838((byte) -118) - (arg1.field2210 >> 1);
        this.field4251 = this.field4231.method2835(-30143) - var5 >> arg1.field2206;
        this.field4229 = this.field4231.method2835(-30143) + var5 >> arg1.field2206;
        this.field4254 = this.field4231.method2833((byte) 85) - var5 >> arg1.field2206;
        this.field4246 = var5 + this.field4231.method2833((byte) 78) >> arg1.field2206;
        int var6 = this.field4229 + 1 - this.field4251;
        int var7 = this.field4246 + 1 - this.field4254;
        this.field4247 = new float[var6 + 1][var7 + 1];
        this.field4234 = new float[var6 + 1][var7 + 1];
        this.field4253 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = var8 + this.field4254;
            if (var24 > 0 && this.field4241.field2211 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field4251;
                    if (var26 > 0 && this.field4241.field2207 - 1 > var26) {
                        int var27 = arg1.method411(var26 + 1, var24) - arg1.method411(var26 - 1, var24);
                        int var28 = arg1.method411(var26, var24 + 1) - arg1.method411(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + var28 * var28 + 65536)));
                        this.field4247[var25][var8] = (float) var27 * var29;
                        this.field4253[var25][var8] = var29 * -256.0F;
                        this.field4234[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field4254; var11 <= this.field4246; var11++) {
            if (var11 >= 0 && var11 < arg1.field2211) {
                for (int var21 = this.field4251; var21 <= this.field4229; var21++) {
                    if (var21 >= 0 && var21 < arg1.field2207) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field6220[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field4229 - this.field4251;
            }
        }
        if (var9 > 0) {
            this.field4249 = new class217(var9 * 2);
            this.field4243 = new class23(var9 * 16);
            this.field4237 = new class412(class396.method2493((byte) 66, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field4254; var14 <= this.field4246; var14++) {
                if (var14 >= 0 && var14 < arg1.field2211) {
                    int var15 = 0;
                    for (int var16 = this.field4251; var16 <= this.field4229; var16++) {
                        if (var16 >= 0 && var16 < arg1.field2207) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field6220[var16][var14];
                            int[] var19 = arg1.field6218[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1826(var19[var20], var12, var15, var18[var20], 2411, var14, var16);
                                    }
                                } else if (var17 == 3) {
                                    this.method1826(0, var12, var15, 0, 2411, var14, var16);
                                    this.method1826(0, var12, var15, arg1.field2210, 2411, var14, var16);
                                    this.method1826(arg1.field2210, var12, var15, 0, 2411, var14, var16);
                                } else if (var17 == 2) {
                                    this.method1826(0, var12, var15, arg1.field2210, 2411, var14, var16);
                                    this.method1826(arg1.field2210, var12, var15, arg1.field2210, 2411, var14, var16);
                                    this.method1826(0, var12, var15, 0, 2411, var14, var16);
                                } else if (var17 == 5) {
                                    this.method1826(arg1.field2210, var12, var15, arg1.field2210, 2411, var14, var16);
                                    this.method1826(arg1.field2210, var12, var15, 0, 2411, var14, var16);
                                    this.method1826(0, var12, var15, arg1.field2210, 2411, var14, var16);
                                } else if (var17 == 4) {
                                    this.method1826(arg1.field2210, var12, var15, 0, 2411, var14, var16);
                                    this.method1826(0, var12, var15, 0, 2411, var14, var16);
                                    this.method1826(arg1.field2210, var12, var15, arg1.field2210, 2411, var14, var16);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field4229 - this.field4251;
                }
                var12++;
            }
            this.field4233 = this.field4239.method1321(5123, this.field4249.field3572, false, this.field4249.field3556, true);
            this.field4230 = this.field4239.method1320(16, false, 81, this.field4243.field3572, this.field4243.field3556);
            this.field4238 = new class481(this.field4230, 5126, 3, 0);
            this.field4252 = new class481(this.field4230, 5121, 4, 12);
        } else {
            this.field4233 = null;
            this.field4230 = null;
            this.field4238 = null;
            this.field4252 = null;
        }
        this.field4247 = this.field4253 = this.field4234 = null;
        this.field4237 = null;
        this.field4249 = null;
        this.field4243 = null;
    }
}
