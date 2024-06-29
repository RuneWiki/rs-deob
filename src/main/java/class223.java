import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class223 extends class419 {

    @OriginalMember(owner = "client!dea", name = "B", descriptor = "Lifa;")
    private class393 field2903;

    @OriginalMember(owner = "client!dea", name = "y", descriptor = "Lco;")
    private class103 field2901;

    @OriginalMember(owner = "client!dea", name = "x", descriptor = "Z")
    private boolean field2900;

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "Lel;")
    private class508 field2902;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method1064(char arg0, int arg1, int arg2, int arg3, boolean arg4, class616 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!dea", name = "OA", descriptor = "(CIIIZ)V")
    public final void method1063(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2903.method2324((byte) 94);
        this.field2903.method2316((byte) 109, this.field2901);
        if (this.field2900 || arg4) {
            this.field2903.method2303((byte) 121, class652.field9230, class231.field3011);
            this.field2903.method2301(0, class308.field4083, 2);
            this.field2903.method2331(true, arg3);
        } else {
            this.field2903.method2303((byte) -104, class231.field3011, class231.field3011);
        }
        class653 var6 = this.field2903.method2329(32639);
        var6.method712(arg1, arg2, 0);
        this.field2903.method2325(false);
        this.field2903.method493(0, 0, this.field2902);
        this.field2903.method480(this.field2903.field5548, 85);
        this.field2903.method508(0, 2, arg0 * 4, class290.field3934);
        if (this.field2900 || arg4) {
            this.field2903.method2301(0, class519.field7612, 2);
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lifa;Lgda;[Lpga;Z)V")
    public class223(class393 arg0, class50 arg1, class495[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2903 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class495 var59 = arg2[var6];
            if (var59.field6906 > var5) {
                var5 = var59.field6906;
            }
            if (var59.field6899 > var5) {
                var5 = var59.field6899;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class495 var12 = arg2[var9];
                int var13 = var12.field6906;
                int var14 = var12.field6899;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field6902 == null) {
                    byte[] var19 = var12.field6907;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field6902;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method481(class384.field5117, false, class279.field3793)) {
                this.field2901 = arg0.method2363(var7, false, var8, var7, class384.field5117, (byte) -103);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field2901 = arg0.method2307(var7, false, var10, var7, 0);
            }
            this.field2900 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class495 var44 = arg2[var26];
                int[] var45 = var44.field6905;
                byte[] var46 = var44.field6902;
                byte[] var47 = var44.field6907;
                int var48 = var44.field6906;
                int var49 = var44.field6899;
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
            this.field2901 = arg0.method2307(var7, false, var25, var7, 0);
            this.field2900 = false;
        }
        this.field2901.method798(-13883, class512.field7495);
        this.field2902 = arg0.method516((byte) 92, false);
        this.field2902.method742(20, 20480, true);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field2902.method741(true, false);
            if (var28 != null) {
                Stream var29 = this.field2903.method2350(var28, true);
                float var30 = this.field2901.method758(12943, (float) var7) / (float) var7;
                float var31 = this.field2901.method761((float) var7, -22297) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class495 var33 = arg2[var32];
                    int var34 = var33.field6906;
                    int var35 = var33.field6899;
                    int var36 = var33.field6900;
                    int var37 = var33.field6901;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3579()) {
                        var29.method3584((float) var37);
                        var29.method3584((float) var36);
                        var29.method3584(0.0F);
                        var29.method3584(var40);
                        var29.method3584(var41);
                        var29.method3584((float) var37);
                        var29.method3584((float) (var34 + var36));
                        var29.method3584(0.0F);
                        var29.method3584(var40);
                        var29.method3584(var43);
                        var29.method3584((float) (var35 + var37));
                        var29.method3584((float) (var34 + var36));
                        var29.method3584(0.0F);
                        var29.method3584(var42);
                        var29.method3584(var43);
                        var29.method3584((float) (var35 + var37));
                        var29.method3584((float) var36);
                        var29.method3584(0.0F);
                        var29.method3584(var42);
                        var29.method3584(var41);
                    } else {
                        var29.method3577((float) var37);
                        var29.method3577((float) var36);
                        var29.method3577(0.0F);
                        var29.method3577(var40);
                        var29.method3577(var41);
                        var29.method3577((float) var37);
                        var29.method3577((float) (var34 + var36));
                        var29.method3577(0.0F);
                        var29.method3577(var40);
                        var29.method3577(var43);
                        var29.method3577((float) (var35 + var37));
                        var29.method3577((float) (var34 + var36));
                        var29.method3577(0.0F);
                        var29.method3577(var42);
                        var29.method3577(var43);
                        var29.method3577((float) (var35 + var37));
                        var29.method3577((float) var36);
                        var29.method3577(0.0F);
                        var29.method3577(var42);
                        var29.method3577(var41);
                    }
                }
                var29.method3578();
                if (this.field2902.method740(114)) {
                    return;
                }
            }
        }
    }
}
