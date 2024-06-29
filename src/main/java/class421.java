import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class421 extends class413 {

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Len;")
    private class478 field5285;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Lls;")
    private class459 field5288;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Z")
    private boolean field5287;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lnba;")
    private class401 field5286;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Len;Lsa;[Laga;Z)V", line = 4)
    public class421(class478 arg0, class595 arg1, class661[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5285 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class661 var59 = arg2[var6];
            if (var59.field9353 > var5) {
                var5 = var59.field9353;
            }
            if (var59.field9351 > var5) {
                var5 = var59.field9351;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class661 var12 = arg2[var9];
                int var13 = var12.field9353;
                int var14 = var12.field9351;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field9355 == null) {
                    byte[] var19 = var12.field9352;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field9355;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1687(79, class117.field1509, class586.field8227)) {
                this.field5288 = arg0.method2592(var8, var7, var7, class586.field8227, false, (byte) 73);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field5288 = arg0.method2576(var7, false, var7, var10, (byte) 119);
            }
            this.field5287 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class661 var44 = arg2[var26];
                int[] var45 = var44.field9358;
                byte[] var46 = var44.field9355;
                byte[] var47 = var44.field9352;
                int var48 = var44.field9353;
                int var49 = var44.field9351;
                int var50 = var26 % 16 * var5;
                int var51 = var26 / 16 * var5;
                int var52 = var7 * var51 + var50;
                int var53 = 0;
                if (var46 == null) {
                    for (int var56 = 0; var56 < var48; var56++) {
                        for (int var57 = 0; var57 < var49; var57++) {
                            byte var58;
                            if ((var58 = var47[var53++]) == 0) {
                                var52++;
                            } else {
                                var25[var52++] = var45[var58 & 0xFF] | 0xFF000000;
                            }
                        }
                        var52 += var7 - var49;
                    }
                } else {
                    for (int var54 = 0; var54 < var48; var54++) {
                        for (int var55 = 0; var55 < var49; var55++) {
                            var25[var52++] = var46[var53] << 24 | var45[var47[var53] & 0xFF];
                            var53++;
                        }
                        var52 += var7 - var49;
                    }
                }
            }
            this.field5288 = arg0.method2576(var7, false, var7, var25, (byte) 112);
            this.field5287 = false;
        }
        this.field5288.method521(class47.field659, 15590);
        this.field5286 = arg0.method1716(false, false);
        this.field5286.method324(-90, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field5286.method325(true, 32726);
            if (var28 != null) {
                Stream var29 = this.field5285.method2573(var28, 110);
                float var30 = this.field5288.method522(false, (float) var7) / (float) var7;
                float var31 = this.field5288.method518((float) var7, (byte) -59) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class661 var33 = arg2[var32];
                    int var34 = var33.field9353;
                    int var35 = var33.field9351;
                    int var36 = var33.field9356;
                    int var37 = var33.field9354;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3420()) {
                        var29.method3418((float) var37);
                        var29.method3418((float) var36);
                        var29.method3418(0.0F);
                        var29.method3418(var40);
                        var29.method3418(var41);
                        var29.method3418((float) var37);
                        var29.method3418((float) (var34 + var36));
                        var29.method3418(0.0F);
                        var29.method3418(var40);
                        var29.method3418(var43);
                        var29.method3418((float) (var35 + var37));
                        var29.method3418((float) (var34 + var36));
                        var29.method3418(0.0F);
                        var29.method3418(var42);
                        var29.method3418(var43);
                        var29.method3418((float) (var35 + var37));
                        var29.method3418((float) var36);
                        var29.method3418(0.0F);
                        var29.method3418(var42);
                        var29.method3418(var41);
                    } else {
                        var29.method3427((float) var37);
                        var29.method3427((float) var36);
                        var29.method3427(0.0F);
                        var29.method3427(var40);
                        var29.method3427(var41);
                        var29.method3427((float) var37);
                        var29.method3427((float) (var34 + var36));
                        var29.method3427(0.0F);
                        var29.method3427(var40);
                        var29.method3427(var43);
                        var29.method3427((float) (var35 + var37));
                        var29.method3427((float) (var34 + var36));
                        var29.method3427(0.0F);
                        var29.method3427(var42);
                        var29.method3427(var43);
                        var29.method3427((float) (var35 + var37));
                        var29.method3427((float) var36);
                        var29.method3427(0.0F);
                        var29.method3427(var42);
                        var29.method3427(var41);
                    }
                }
                var29.method3424();
                if (this.field5286.method322(115)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(CIIIZLua;II)V", line = 308)
    public final void method634(char arg0, int arg1, int arg2, int arg3, boolean arg4, class600 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!bb", name = "OA", descriptor = "(CIIIZ)V", line = 311)
    public final void method633(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5285.method2583(true);
        this.field5285.method2596(this.field5288, 0);
        if (this.field5287 || arg4) {
            this.field5285.method2550(class538.field7226, true, class112.field1466);
            this.field5285.method2602(0, 1, class700.field9903);
            this.field5285.method2597((byte) 48, arg3);
        } else {
            this.field5285.method2550(class538.field7226, true, class538.field7226);
        }
        class691 var6 = this.field5285.method2598(12083);
        var6.method914(arg1, arg2, 0);
        this.field5285.method2588(-114);
        this.field5285.method1695((byte) -16, this.field5286, 0);
        this.field5285.method1709(true, this.field5285.field6342);
        this.field5285.method1715(class26.field394, arg0 * 4, 2, 28463);
        if (this.field5287 || arg4) {
            this.field5285.method2602(0, 1, class5.field119);
        }
    }
}
