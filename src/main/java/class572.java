import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class572 extends class262 {

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lkw;")
    private class174 field8452;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "Lhc;")
    private class391 field8454;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "Z")
    private boolean field8453;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Ltq;")
    private class90 field8451;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(CIIIZLpa;II)V", line = 3)
    public final void method529(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "(CIIIZ)V", line = 7)
    public final void method528(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8452.method1121(16131);
        this.field8452.method1152(this.field8454, true);
        if (this.field8453 || arg4) {
            this.field8452.method1102(class43.field527, class609.field8962, 127);
            this.field8452.method1160(0, (byte) -113, class455.field6635);
            this.field8452.method1168(arg3, (byte) 84);
        } else {
            this.field8452.method1102(class43.field527, class43.field527, -20);
        }
        class124 var6 = this.field8452.method1137(0);
        var6.method613(arg1, arg2, 0);
        this.field8452.method1099(0);
        this.field8452.method326(43, this.field8452.field2642);
        this.field8452.method296(0, this.field8451, 95);
        this.field8452.method300(arg0 * 4, class25.field227, 2, -125);
        if (this.field8453 || arg4) {
            this.field8452.method1160(0, (byte) -113, class248.field3625);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lkw;Ldd;[Lqr;Z)V", line = 33)
    public class572(class174 arg0, class166 arg1, class610[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8452 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class610 var59 = arg2[var6];
            if (var59.field8972 > var5) {
                var5 = var59.field8972;
            }
            if (var59.field8975 > var5) {
                var5 = var59.field8975;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class610 var12 = arg2[var9];
                int var13 = var12.field8972;
                int var14 = var12.field8975;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field8970 == null) {
                    byte[] var19 = var12.field8976;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field8970;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method338(false, class629.field9208, class566.field8401)) {
                this.field8454 = arg0.method1165(false, var8, var7, var7, -9, class566.field8401);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8454 = arg0.method1105(var10, false, var7, 6978, var7);
            }
            this.field8453 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class610 var44 = arg2[var26];
                int[] var45 = var44.field8974;
                byte[] var46 = var44.field8970;
                byte[] var47 = var44.field8976;
                int var48 = var44.field8972;
                int var49 = var44.field8975;
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
            this.field8454 = arg0.method1105(var25, false, var7, 6978, var7);
            this.field8453 = false;
        }
        this.field8454.method379(class577.field8511, 2068);
        this.field8451 = arg0.method304(false, false);
        this.field8451.method412(20480, 20, (byte) -61);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8451.method410(true, (byte) -56);
            if (var28 != null) {
                Stream var29 = this.field8452.method1163(var28, -4455);
                float var30 = this.field8454.method565(-32442, (float) var7) / (float) var7;
                float var31 = this.field8454.method569(-2297, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class610 var33 = arg2[var32];
                    int var34 = var33.field8972;
                    int var35 = var33.field8975;
                    int var36 = var33.field8973;
                    int var37 = var33.field8971;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3328()) {
                        var29.method3326((float) var37);
                        var29.method3326((float) var36);
                        var29.method3326(0.0F);
                        var29.method3326(var40);
                        var29.method3326(var41);
                        var29.method3326((float) var37);
                        var29.method3326((float) (var34 + var36));
                        var29.method3326(0.0F);
                        var29.method3326(var40);
                        var29.method3326(var43);
                        var29.method3326((float) (var35 + var37));
                        var29.method3326((float) (var34 + var36));
                        var29.method3326(0.0F);
                        var29.method3326(var42);
                        var29.method3326(var43);
                        var29.method3326((float) (var35 + var37));
                        var29.method3326((float) var36);
                        var29.method3326(0.0F);
                        var29.method3326(var42);
                        var29.method3326(var41);
                    } else {
                        var29.method3333((float) var37);
                        var29.method3333((float) var36);
                        var29.method3333(0.0F);
                        var29.method3333(var40);
                        var29.method3333(var41);
                        var29.method3333((float) var37);
                        var29.method3333((float) (var34 + var36));
                        var29.method3333(0.0F);
                        var29.method3333(var40);
                        var29.method3333(var43);
                        var29.method3333((float) (var35 + var37));
                        var29.method3333((float) (var34 + var36));
                        var29.method3333(0.0F);
                        var29.method3333(var42);
                        var29.method3333(var43);
                        var29.method3333((float) (var35 + var37));
                        var29.method3333((float) var36);
                        var29.method3333(0.0F);
                        var29.method3333(var42);
                        var29.method3333(var41);
                    }
                }
                var29.method3332();
                if (this.field8451.method411(-112)) {
                    return;
                }
            }
        }
    }
}
