import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class331 extends class90 {

    @OriginalMember(owner = "client!br", name = "x", descriptor = "Lbda;")
    private class428 field4312;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "Leea;")
    private class112 field4313;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "Z")
    private boolean field4310;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "Lrq;")
    private class293 field4311;

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lbda;Lfc;[Ldp;Z)V", line = 5)
    public class331(class428 arg0, class216 arg1, class3[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4312 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class3 var59 = arg2[var6];
            if (var59.field14 > var5) {
                var5 = var59.field14;
            }
            if (var59.field15 > var5) {
                var5 = var59.field15;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class3 var12 = arg2[var9];
                int var13 = var12.field14;
                int var14 = var12.field15;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field9 == null) {
                    byte[] var19 = var12.field11;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field9;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1805(27, class160.field1932, class37.field293)) {
                this.field4313 = arg0.method2477(var7, var8, 0, false, class37.field293, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field4313 = arg0.method2430(-128, var10, var7, var7, false);
            }
            this.field4310 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class3 var44 = arg2[var26];
                int[] var45 = var44.field13;
                byte[] var46 = var44.field9;
                byte[] var47 = var44.field11;
                int var48 = var44.field14;
                int var49 = var44.field15;
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
            this.field4313 = arg0.method2430(-123, var25, var7, var7, false);
            this.field4310 = false;
        }
        this.field4313.method1272(13027, class116.field1453);
        this.field4311 = arg0.method1823(118, false);
        this.field4311.method444(false, 20480, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field4311.method440(-105, true);
            if (var28 != null) {
                Stream var29 = this.field4312.method2426(var28, (byte) 11);
                float var30 = this.field4313.method652((byte) -127, (float) var7) / (float) var7;
                float var31 = this.field4313.method646((float) var7, false) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class3 var33 = arg2[var32];
                    int var34 = var33.field14;
                    int var35 = var33.field15;
                    int var36 = var33.field10;
                    int var37 = var33.field12;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3340()) {
                        var29.method3348((float) var37);
                        var29.method3348((float) var36);
                        var29.method3348(0.0F);
                        var29.method3348(var40);
                        var29.method3348(var41);
                        var29.method3348((float) var37);
                        var29.method3348((float) (var34 + var36));
                        var29.method3348(0.0F);
                        var29.method3348(var40);
                        var29.method3348(var43);
                        var29.method3348((float) (var35 + var37));
                        var29.method3348((float) (var34 + var36));
                        var29.method3348(0.0F);
                        var29.method3348(var42);
                        var29.method3348(var43);
                        var29.method3348((float) (var35 + var37));
                        var29.method3348((float) var36);
                        var29.method3348(0.0F);
                        var29.method3348(var42);
                        var29.method3348(var41);
                    } else {
                        var29.method3344((float) var37);
                        var29.method3344((float) var36);
                        var29.method3344(0.0F);
                        var29.method3344(var40);
                        var29.method3344(var41);
                        var29.method3344((float) var37);
                        var29.method3344((float) (var34 + var36));
                        var29.method3344(0.0F);
                        var29.method3344(var40);
                        var29.method3344(var43);
                        var29.method3344((float) (var35 + var37));
                        var29.method3344((float) (var34 + var36));
                        var29.method3344(0.0F);
                        var29.method3344(var42);
                        var29.method3344(var43);
                        var29.method3344((float) (var35 + var37));
                        var29.method3344((float) var36);
                        var29.method3344(0.0F);
                        var29.method3344(var42);
                        var29.method3344(var41);
                    }
                }
                var29.method3342();
                if (this.field4311.method442(-64)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(CIIIZLpa;II)V", line = 308)
    public final void method543(char arg0, int arg1, int arg2, int arg3, boolean arg4, class309 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!br", name = "HA", descriptor = "(CIIIZ)V", line = 312)
    public final void method541(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4312.method2443(4);
        this.field4312.method2459(120, this.field4313);
        if (this.field4310 || arg4) {
            this.field4312.method2429(class564.field8287, class2.field7, 35);
            this.field4312.method2435(0, 58, class264.field3445);
            this.field4312.method2434(126, arg3);
        } else {
            this.field4312.method2429(class2.field7, class2.field7, 69);
        }
        class335 var6 = this.field4312.method2471((byte) 122);
        var6.method661(arg1, arg2, 0);
        this.field4312.method2457((byte) -106);
        this.field4312.method1837(this.field4312.field5805, 9);
        this.field4312.method1792(this.field4311, 0, (byte) 89);
        this.field4312.method1791(class257.field3308, 2, 2, arg0 * 4);
        if (this.field4310 || arg4) {
            this.field4312.method2435(0, 58, class289.field3751);
        }
    }
}
