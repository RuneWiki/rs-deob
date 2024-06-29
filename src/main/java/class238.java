import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class238 extends class278 {

    @OriginalMember(owner = "client!ws", name = "R", descriptor = "[I")
    public static int[] field3277 = new int[1];

    @OriginalMember(owner = "client!ws", name = "Q", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "F")
    public static float field3269;

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ws", name = "M", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ws", name = "N", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ws", name = "O", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ws", name = "P", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(B)V", line = 3)
    public static void method1380(byte arg0) {
        field3277 = null;
        int var1 = -102 % ((77 - arg0) / 39);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIBI[FI)V", line = 12)
    public static final void method1381(int arg0, int arg1, int arg2, byte arg3, int arg4, float[] arg5, int arg6) {
        ++field3273;
        if (arg6 > 0 && !class455.method2685(arg6, 20721)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class455.method2685(arg0, 20721)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class185.method1115(-127, arg2);
            int var8 = 0;
            if (arg3 < -6) {
                int var9 = ~arg0 >= ~arg6 ? arg0 : arg6;
                int var10 = arg6 >> 1;
                int var11 = arg0 >> 1;
                float[] var12 = arg5;
                float[] var13 = new float[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Df(arg4, var8, arg1, arg6, arg0, 0, arg2, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg6 * var7;
                    for (int var15 = 0; ~var15 > ~var7; ++var15) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14 + var15;
                        for (int var20 = 0; var20 < var11; ++var20) {
                            for (int var21 = 0; ~var10 < ~var21; ++var21) {
                                float var22 = var12[var18];
                                int var23 = var7 + var18;
                                float var24 = var12[var23] + var22;
                                var18 = var7 + var23;
                                float var25 = var12[var19] + var24;
                                int var26 = var7 + var19;
                                float var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = var27 * 0.25F;
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    float[] var16 = var13;
                    var13 = var12;
                    var12 = var16;
                    arg6 = var10;
                    arg0 = var11;
                    ++var8;
                    var11 >>= 1;
                    var10 >>= 1;
                    var9 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V", line = 108)
    public class238() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(BI)V", line = 111)
    public static final void method1382(byte arg0, int arg1) {
        ++field3274;
        int var2 = 50 % ((arg0 - 30) / 33);
        if (class131.field1813 == null || ~class131.field1813.length > ~arg1) {
            class131.field1813 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)[I", line = 132)
    public final int[] method208(int arg0, int arg1) {
        ++field3271;
        if (arg0 != -9) {
            field3277 = null;
        }
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int[][] var4 = this.method1568(arg0 + 5435, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class507.field7456; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBLss;Lea;IIIJI)V", line = 182)
    public static final void method1383(int arg0, byte arg1, class295 arg2, class382 arg3, int arg4, int arg5, int arg6, long arg7, int arg8) {
        ++field3275;
        int var10 = arg8 * arg8 - -(arg0 * arg0);
        if (~arg7 <= ~((long) var10)) {
            int var11 = Math.min(arg2.field4022 / 2, arg2.field3960 / 2);
            if (arg1 < 114) {
                method1382((byte) -35, -88);
            }
            if (var10 <= var11 * var11) {
                class101.method667(arg3, arg6, arg8, arg0, arg2, class467.field6832[arg5], false, arg4);
            } else {
                var11 -= 10;
                int var12;
                if (~class128.field1742 != -5) {
                    var12 = 16383 & (int) class40.field553 + class22.field349;
                } else {
                    var12 = (int) class40.field553 & 16383;
                }
                int var13 = class377.field5316[var12];
                int var14 = class377.field5315[var12];
                if (~class128.field1742 != -5) {
                    var14 = var14 * 256 / (class482.field7072 + 256);
                    var13 = var13 * 256 / (class482.field7072 + 256);
                }
                int var15 = arg0 * var13 + arg8 * var14 >> 15;
                int var16 = arg0 * var14 + -(arg8 * var13) >> 15;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) (Math.sin(var17) * (double) var11);
                int var20 = (int) ((double) var11 * Math.cos(var17));
                class407.field5642[arg5].method3109((float) arg2.field4022 / 2.0F + (float) arg4 + (float) var19, (float) arg2.field3960 / 2.0F + (float) arg6 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
        }
    }
}
