import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class518 extends class194 {

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "Lgj;")
    private class580 field7076;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "Lhr;")
    private class483 field7075;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Z")
    private boolean field7073;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "Liq;")
    private class555 field7074;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "(CIIIZ)V")
    public final void method55(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7076.method3186(false);
        this.field7076.method3232(false, this.field7075);
        if (this.field7073 || arg4) {
            this.field7076.method3193(class24.field325, class137.field1929, 0);
            this.field7076.method3177(0, 61, class22.field305);
            this.field7076.method3248((byte) -113, arg3);
        } else {
            this.field7076.method3193(class24.field325, class24.field325, 0);
        }
        class367 var6 = this.field7076.method3216(1);
        var6.method1288(arg1, arg2, 0);
        this.field7076.method3228(true);
        this.field7076.method313(this.field7074, 15, 0);
        this.field7076.method348((byte) -62, this.field7076.field8083);
        this.field7076.method294(2, arg0 * 4, (byte) 112, class126.field1758);
        if (this.field7073 || arg4) {
            this.field7076.method3177(0, 98, class558.field7530);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZLfa;II)V")
    public final void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4, class212 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lgj;Lmj;[Lkq;Z)V")
    public class518(class580 arg0, class599 arg1, class543[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7076 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class543 var59 = arg2[var6];
            if (var59.field7373 > var5) {
                var5 = var59.field7373;
            }
            if (var59.field7377 > var5) {
                var5 = var59.field7377;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class543 var12 = arg2[var9];
                int var13 = var12.field7373;
                int var14 = var12.field7377;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field7380 == null) {
                    byte[] var19 = var12.field7378;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field7380;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method345(class381.field5355, (byte) 40, class82.field1147)) {
                this.field7075 = arg0.method3231(var8, 30569, var7, false, class381.field5355, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field7075 = arg0.method3214(var7, var7, -17318, var10, false);
            }
            this.field7073 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class543 var44 = arg2[var26];
                int[] var45 = var44.field7376;
                byte[] var46 = var44.field7380;
                byte[] var47 = var44.field7378;
                int var48 = var44.field7373;
                int var49 = var44.field7377;
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
            this.field7075 = arg0.method3214(var7, var7, -17318, var25, false);
            this.field7073 = false;
        }
        this.field7075.method131((byte) 108, class13.field214);
        this.field7074 = arg0.method337((byte) -61, false);
        this.field7074.method1249(20480, 20, (byte) -126);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field7074.method779((byte) -20, true);
            if (var28 != null) {
                Stream var29 = this.field7076.method3212(var28, (byte) 89);
                float var30 = this.field7075.method781((float) var7, -8639) / (float) var7;
                float var31 = this.field7075.method787((float) var7, (byte) 72) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class543 var33 = arg2[var32];
                    int var34 = var33.field7373;
                    int var35 = var33.field7377;
                    int var36 = var33.field7374;
                    int var37 = var33.field7375;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3418()) {
                        var29.method3421((float) var37);
                        var29.method3421((float) var36);
                        var29.method3421(0.0F);
                        var29.method3421(var40);
                        var29.method3421(var41);
                        var29.method3421((float) var37);
                        var29.method3421((float) (var34 + var36));
                        var29.method3421(0.0F);
                        var29.method3421(var40);
                        var29.method3421(var43);
                        var29.method3421((float) (var35 + var37));
                        var29.method3421((float) (var34 + var36));
                        var29.method3421(0.0F);
                        var29.method3421(var42);
                        var29.method3421(var43);
                        var29.method3421((float) (var35 + var37));
                        var29.method3421((float) var36);
                        var29.method3421(0.0F);
                        var29.method3421(var42);
                        var29.method3421(var41);
                    } else {
                        var29.method3428((float) var37);
                        var29.method3428((float) var36);
                        var29.method3428(0.0F);
                        var29.method3428(var40);
                        var29.method3428(var41);
                        var29.method3428((float) var37);
                        var29.method3428((float) (var34 + var36));
                        var29.method3428(0.0F);
                        var29.method3428(var40);
                        var29.method3428(var43);
                        var29.method3428((float) (var35 + var37));
                        var29.method3428((float) (var34 + var36));
                        var29.method3428(0.0F);
                        var29.method3428(var42);
                        var29.method3428(var43);
                        var29.method3428((float) (var35 + var37));
                        var29.method3428((float) var36);
                        var29.method3428(0.0F);
                        var29.method3428(var42);
                        var29.method3428(var41);
                    }
                }
                var29.method3426();
                if (this.field7074.method774(-22324)) {
                    return;
                }
            }
        }
    }
}
