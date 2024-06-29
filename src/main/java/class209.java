import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class209 extends class423 {

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Lbm;")
    private class684 field2685;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Lbaa;")
    private class620 field2683;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Z")
    private boolean field2686;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lu;")
    private class60 field2684;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lbm;Ltba;[Lbe;Z)V", line = 5)
    public class209(class684 arg0, class56 arg1, class196[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2685 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class196 var59 = arg2[var6];
            if (var59.field2525 > var5) {
                var5 = var59.field2525;
            }
            if (var59.field2527 > var5) {
                var5 = var59.field2527;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class196 var12 = arg2[var9];
                int var13 = var12.field2525;
                int var14 = var12.field2527;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field2523 == null) {
                    byte[] var19 = var12.field2521;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field2523;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1399(class240.field3093, (byte) 62, class15.field215)) {
                this.field2683 = arg0.method3714(var7, 0, var7, var8, false, class15.field215);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field2683 = arg0.method3731(var10, false, (byte) 118, var7, var7);
            }
            this.field2686 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class196 var44 = arg2[var26];
                int[] var45 = var44.field2529;
                byte[] var46 = var44.field2523;
                byte[] var47 = var44.field2521;
                int var48 = var44.field2525;
                int var49 = var44.field2527;
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
            this.field2683 = arg0.method3731(var25, false, (byte) 111, var7, var7);
            this.field2686 = false;
        }
        this.field2683.method1466(class211.field2698, 13584);
        this.field2684 = arg0.method1423(111, false);
        this.field2684.method472(20, 20480, -2898);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field2684.method471((byte) 28, true);
            if (var28 != null) {
                Stream var29 = this.field2685.method3772(var28, 4);
                float var30 = this.field2683.method376((float) var7, -31566) / (float) var7;
                float var31 = this.field2683.method374((float) var7, true) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class196 var33 = arg2[var32];
                    int var34 = var33.field2525;
                    int var35 = var33.field2527;
                    int var36 = var33.field2522;
                    int var37 = var33.field2526;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2226()) {
                        var29.method2229((float) var37);
                        var29.method2229((float) var36);
                        var29.method2229(0.0F);
                        var29.method2229(var40);
                        var29.method2229(var41);
                        var29.method2229((float) var37);
                        var29.method2229((float) (var34 + var36));
                        var29.method2229(0.0F);
                        var29.method2229(var40);
                        var29.method2229(var43);
                        var29.method2229((float) (var35 + var37));
                        var29.method2229((float) (var34 + var36));
                        var29.method2229(0.0F);
                        var29.method2229(var42);
                        var29.method2229(var43);
                        var29.method2229((float) (var35 + var37));
                        var29.method2229((float) var36);
                        var29.method2229(0.0F);
                        var29.method2229(var42);
                        var29.method2229(var41);
                    } else {
                        var29.method2237((float) var37);
                        var29.method2237((float) var36);
                        var29.method2237(0.0F);
                        var29.method2237(var40);
                        var29.method2237(var41);
                        var29.method2237((float) var37);
                        var29.method2237((float) (var34 + var36));
                        var29.method2237(0.0F);
                        var29.method2237(var40);
                        var29.method2237(var43);
                        var29.method2237((float) (var35 + var37));
                        var29.method2237((float) (var34 + var36));
                        var29.method2237(0.0F);
                        var29.method2237(var42);
                        var29.method2237(var43);
                        var29.method2237((float) (var35 + var37));
                        var29.method2237((float) var36);
                        var29.method2237(0.0F);
                        var29.method2237(var42);
                        var29.method2237(var41);
                    }
                }
                var29.method2223();
                if (this.field2684.method475((byte) 97)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(CIIIZLaa;II)V", line = 308)
    public final void method565(char arg0, int arg1, int arg2, int arg3, boolean arg4, class81 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!bb", name = "fa", descriptor = "(CIIIZ)V", line = 312)
    public final void method564(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2685.method3722(20330);
        this.field2685.method3711(false, this.field2683);
        if (this.field2686 || arg4) {
            this.field2685.method3708(97, class155.field1901, class409.field5765);
            this.field2685.method3777(false, 0, class663.field9083);
            this.field2685.method3717(arg3, (byte) -89);
        } else {
            this.field2685.method3708(105, class409.field5765, class409.field5765);
        }
        class462 var6 = this.field2685.method3750((byte) 117);
        var6.method1963(arg1, arg2, 0);
        this.field2685.method3744(false);
        this.field2685.method1407(this.field2684, (byte) 123, 0);
        this.field2685.method1436(14522, this.field2685.field9673);
        this.field2685.method1389(2, class401.field5557, arg0 * 4, (byte) -3);
        if (this.field2686 || arg4) {
            this.field2685.method3777(false, 0, class632.field8774);
        }
    }
}
