import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class192 extends class735 {

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    private int field2943;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "J")
    private long field2946;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILfca;)V")
    public final void method627(int arg0, class93 arg1) {
        this.field2943 = arg1.method773(arg0 ^ 0x6);
        if (arg0 != 5) {
            this.field2946 = -71L;
        }
        field2941++;
        this.field2946 = arg1.method770((byte) 75);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
    public static final int method1400(int arg0) {
        if (arg0 == 255) {
            field2939++;
            return class695.field9619.method3418(arg0 - 11562);
        } else {
            return -45;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Z")
    public static final boolean method1401(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field2945++;
            return (arg0 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIBLdc;)Luaa;")
    public static final class128 method1402(int[] arg0, int arg1, byte arg2, class5 arg3) {
        field2940++;
        if (arg2 != 95) {
            return null;
        }
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg3.field68 != null) {
            int var8 = arg3.field71;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var5 = new int[var8];
            var7 = new float[var8][];
            for (int var16 = 0; var16 < arg1; var16++) {
                int var23 = arg0[var16];
                if (arg3.field68[var23] != -1) {
                    int var24 = arg3.field68[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg3.field53[var23];
                        } else if (var25 == 1) {
                            var26 = arg3.field92[var23];
                        } else {
                            var26 = arg3.field89[var23];
                        }
                        int var27 = arg3.field64[var26];
                        int var28 = arg3.field83[var26];
                        int var29 = arg3.field61[var26];
                        if (var27 < var9[var24]) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var11[var24] > var28) {
                            var11[var24] = var28;
                        }
                        if (var12[var24] < var28) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var29 > var14[var24]) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var6 = new int[var8];
            var4 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg3.field86[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg3.field57[var17];
                        if (var19 == 0) {
                            var20 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 > 0) {
                            var21 = 1.0F;
                            var20 = (float) var19 / 1024.0F;
                        } else {
                            var21 = (float) (-var19) / 1024.0F;
                            var20 = 1.0F;
                        }
                        var22 = 64.0F / (float) arg3.field74[var17];
                    } else if (var18 == 2) {
                        var21 = 64.0F / (float) arg3.field57[var17];
                        var22 = 64.0F / (float) arg3.field74[var17];
                        var20 = 64.0F / (float) arg3.field85[var17];
                    } else {
                        var21 = (float) arg3.field57[var17] / 1024.0F;
                        var20 = (float) arg3.field85[var17] / 1024.0F;
                        var22 = (float) arg3.field74[var17] / 1024.0F;
                    }
                    var7[var17] = class542.method3058(var21, arg3.field78[var17], true, arg3.field94[var17], arg3.field75[var17], var22, var20, class204.method1456(arg3.field54[var17], 255));
                }
            }
        }
        return new class128(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILha;ILkh;)V")
    public static final void method1403(int arg0, int arg1, class66 arg2, int arg3, class17 arg4) {
        field2942++;
        byte var5 = 63;
        byte var6 = 7;
        for (int var7 = 63; var7 >= 0; var7--) {
            int var8 = (var6 & 0x7) << 7 | var7 & 0x3F << 10 | var5 & 0x7F;
            int var9 = class624.field8692[class752.method4172(var8, 1474149255) & 0xFFFF];
            arg2.method537(arg0, ((63 - var7) * arg4.field330 >> 6) + arg1, arg4.field347, (arg4.field330 >> 6) + 1, var9, 0);
        }
        if (arg3 == 31914) {
            ;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lrh;Z)V")
    public final void method624(class280 arg0, boolean arg1) {
        arg0.method1791(this.field2943, 1, this.field2946);
        field2944++;
        if (arg1) {
            this.field2946 = -10L;
        }
    }
}
