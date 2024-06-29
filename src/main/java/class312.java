import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class312 extends class417 {

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "Lnv;")
    private class382 field4318;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Lcm;")
    private class679 field4316;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "Z")
    private boolean field4317;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Lvc;")
    private class288 field4315;

    @OriginalMember(owner = "client!ng", name = "OA", descriptor = "(CIIIZ)V", line = 4)
    public final void method1202(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4318.method2209((byte) 113);
        this.field4318.method2241(this.field4316, (byte) 44);
        if (this.field4317 || arg4) {
            this.field4318.method2199(class276.field3814, 9797, class334.field4505);
            this.field4318.method2264(9, class452.field6221, 0);
            this.field4318.method2233(false, arg3);
        } else {
            this.field4318.method2199(class276.field3814, 9797, class276.field3814);
        }
        class274 var6 = this.field4318.method2224((byte) 99);
        var6.method689(arg1, arg2, 0);
        this.field4318.method2219(0);
        this.field4318.method1021(this.field4315, (byte) 104, 0);
        this.field4318.method1050(0, this.field4318.field5403);
        this.field4318.method1079(arg0 * 4, class412.field5846, 2, 10);
        if (this.field4317 || arg4) {
            this.field4318.method2264(9, class262.field3553, 0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(CIIIZLua;II)V", line = 27)
    public final void method1200(char arg0, int arg1, int arg2, int arg3, boolean arg4, class618 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lnv;Lvn;[Lqga;Z)V", line = 33)
    public class312(class382 arg0, class283 arg1, class168[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4318 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class168 var59 = arg2[var6];
            if (var59.field2449 > var5) {
                var5 = var59.field2449;
            }
            if (var59.field2445 > var5) {
                var5 = var59.field2445;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class168 var12 = arg2[var9];
                int var13 = var12.field2449;
                int var14 = var12.field2445;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field2447 == null) {
                    byte[] var19 = var12.field2450;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field2447;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1054(class309.field4271, class559.field7539, -68)) {
                this.field4316 = arg0.method2236(class559.field7539, var8, (byte) 126, var7, false, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field4316 = arg0.method2206(false, var10, var7, var7, -12482);
            }
            this.field4317 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class168 var44 = arg2[var26];
                int[] var45 = var44.field2442;
                byte[] var46 = var44.field2447;
                byte[] var47 = var44.field2450;
                int var48 = var44.field2449;
                int var49 = var44.field2445;
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
            this.field4316 = arg0.method2206(false, var25, var7, var7, -12482);
            this.field4317 = false;
        }
        this.field4316.method1259(class216.field3051, (byte) 110);
        this.field4315 = arg0.method1038(false, 92);
        this.field4315.method1768(20480, -26595, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field4315.method1769(true, 115);
            if (var28 != null) {
                Stream var29 = this.field4318.method2238(var28, -125);
                float var30 = this.field4316.method2135((byte) -84, (float) var7) / (float) var7;
                float var31 = this.field4316.method2138((byte) 118, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class168 var33 = arg2[var32];
                    int var34 = var33.field2449;
                    int var35 = var33.field2445;
                    int var36 = var33.field2448;
                    int var37 = var33.field2446;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3484()) {
                        var29.method3486((float) var37);
                        var29.method3486((float) var36);
                        var29.method3486(0.0F);
                        var29.method3486(var40);
                        var29.method3486(var41);
                        var29.method3486((float) var37);
                        var29.method3486((float) (var34 + var36));
                        var29.method3486(0.0F);
                        var29.method3486(var40);
                        var29.method3486(var43);
                        var29.method3486((float) (var35 + var37));
                        var29.method3486((float) (var34 + var36));
                        var29.method3486(0.0F);
                        var29.method3486(var42);
                        var29.method3486(var43);
                        var29.method3486((float) (var35 + var37));
                        var29.method3486((float) var36);
                        var29.method3486(0.0F);
                        var29.method3486(var42);
                        var29.method3486(var41);
                    } else {
                        var29.method3478((float) var37);
                        var29.method3478((float) var36);
                        var29.method3478(0.0F);
                        var29.method3478(var40);
                        var29.method3478(var41);
                        var29.method3478((float) var37);
                        var29.method3478((float) (var34 + var36));
                        var29.method3478(0.0F);
                        var29.method3478(var40);
                        var29.method3478(var43);
                        var29.method3478((float) (var35 + var37));
                        var29.method3478((float) (var34 + var36));
                        var29.method3478(0.0F);
                        var29.method3478(var42);
                        var29.method3478(var43);
                        var29.method3478((float) (var35 + var37));
                        var29.method3478((float) var36);
                        var29.method3478(0.0F);
                        var29.method3478(var42);
                        var29.method3478(var41);
                    }
                }
                var29.method3477();
                if (this.field4315.method1771(84)) {
                    return;
                }
            }
        }
    }
}
