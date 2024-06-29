import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class334 extends class259 {

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "Lnd;")
    private class632 field4793;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "Ldea;")
    private class405 field4794;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Z")
    private boolean field4791;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Lup;")
    private class342 field4792;

    @OriginalMember(owner = "client!jg", name = "HA", descriptor = "(CIIIZ)V", line = 3)
    public final void method807(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4793.method3572(false);
        this.field4793.method3577(this.field4794, true);
        if (this.field4791 || arg4) {
            this.field4793.method3583(false, class634.field9219, class635.field9225);
            this.field4793.method3601(-75, class104.field1753, 0);
            this.field4793.method3574(false, arg3);
        } else {
            this.field4793.method3583(false, class634.field9219, class634.field9219);
        }
        class516 var6 = this.field4793.method3617(118);
        var6.method884(arg1, arg2, 0);
        this.field4793.method3579(86);
        this.field4793.method114(this.field4793.field9165, (byte) -12);
        this.field4793.method152(0, this.field4792, 117);
        this.field4793.method148(arg0 * 4, class449.field6540, 2, 0);
        if (this.field4791 || arg4) {
            this.field4793.method3601(-8, class477.field6813, 0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lnd;Lrl;[Lfba;Z)V", line = 27)
    public class334(class632 arg0, class633 arg1, class518[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4793 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class518 var59 = arg2[var6];
            if (var59.field7195 > var5) {
                var5 = var59.field7195;
            }
            if (var59.field7202 > var5) {
                var5 = var59.field7202;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class518 var12 = arg2[var9];
                int var13 = var12.field7195;
                int var14 = var12.field7202;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field7196 == null) {
                    byte[] var19 = var12.field7197;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field7196;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method144(-93, class343.field4922, class384.field5715)) {
                this.field4794 = arg0.method3596(var7, var7, false, 0, var8, class384.field5715);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field4794 = arg0.method3587(false, var7, var10, var7, (byte) -51);
            }
            this.field4791 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class518 var44 = arg2[var26];
                int[] var45 = var44.field7198;
                byte[] var46 = var44.field7196;
                byte[] var47 = var44.field7197;
                int var48 = var44.field7195;
                int var49 = var44.field7202;
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
            this.field4794 = arg0.method3587(false, var7, var25, var7, (byte) -64);
            this.field4791 = false;
        }
        this.field4794.method840(class174.field2517, -123);
        this.field4792 = arg0.method128(16240, false);
        this.field4792.method1343(20, 20480, (byte) -118);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field4792.method251(true, (byte) 60);
            if (var28 != null) {
                Stream var29 = this.field4793.method3588(var28, (byte) 110);
                float var30 = this.field4794.method1532(-8221, (float) var7) / (float) var7;
                float var31 = this.field4794.method1531(false, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class518 var33 = arg2[var32];
                    int var34 = var33.field7195;
                    int var35 = var33.field7202;
                    int var36 = var33.field7200;
                    int var37 = var33.field7199;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3248()) {
                        var29.method3250((float) var37);
                        var29.method3250((float) var36);
                        var29.method3250(0.0F);
                        var29.method3250(var40);
                        var29.method3250(var41);
                        var29.method3250((float) var37);
                        var29.method3250((float) (var34 + var36));
                        var29.method3250(0.0F);
                        var29.method3250(var40);
                        var29.method3250(var43);
                        var29.method3250((float) (var35 + var37));
                        var29.method3250((float) (var34 + var36));
                        var29.method3250(0.0F);
                        var29.method3250(var42);
                        var29.method3250(var43);
                        var29.method3250((float) (var35 + var37));
                        var29.method3250((float) var36);
                        var29.method3250(0.0F);
                        var29.method3250(var42);
                        var29.method3250(var41);
                    } else {
                        var29.method3247((float) var37);
                        var29.method3247((float) var36);
                        var29.method3247(0.0F);
                        var29.method3247(var40);
                        var29.method3247(var41);
                        var29.method3247((float) var37);
                        var29.method3247((float) (var34 + var36));
                        var29.method3247(0.0F);
                        var29.method3247(var40);
                        var29.method3247(var43);
                        var29.method3247((float) (var35 + var37));
                        var29.method3247((float) (var34 + var36));
                        var29.method3247(0.0F);
                        var29.method3247(var42);
                        var29.method3247(var43);
                        var29.method3247((float) (var35 + var37));
                        var29.method3247((float) var36);
                        var29.method3247(0.0F);
                        var29.method3247(var42);
                        var29.method3247(var41);
                    }
                }
                var29.method3246();
                if (this.field4792.method245(-11359)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(CIIIZLpa;II)V", line = 332)
    public final void method808(char arg0, int arg1, int arg2, int arg3, boolean arg4, class593 arg5, int arg6, int arg7) {
    }
}
