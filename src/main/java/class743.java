import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class743 extends class60 {

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "Lwga;")
    private class745 field9991;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "Lwfa;")
    private class200 field9989;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "Z")
    private boolean field9990;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "Ltc;")
    private class353 field9992;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4, class487 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lwga;Loea;[Lrh;Z)V")
    public class743(class745 arg0, class597 arg1, class267[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field9991 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class267 var59 = arg2[var6];
            if (var59.field3778 > var5) {
                var5 = var59.field3778;
            }
            if (var59.field3784 > var5) {
                var5 = var59.field3784;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class267 var12 = arg2[var9];
                int var13 = var12.field3778;
                int var14 = var12.field3784;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field3777 == null) {
                    byte[] var19 = var12.field3781;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field3777;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method2249(class523.field7249, class556.field7676, (byte) 126)) {
                this.field9989 = arg0.method4155(var8, var7, class556.field7676, 2, false, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field9989 = arg0.method4091(var7, var7, -15137, false, var10);
            }
            this.field9990 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class267 var44 = arg2[var26];
                int[] var45 = var44.field3779;
                byte[] var46 = var44.field3777;
                byte[] var47 = var44.field3781;
                int var48 = var44.field3778;
                int var49 = var44.field3784;
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
            this.field9989 = arg0.method4091(var7, var7, -15137, false, var25);
            this.field9990 = false;
        }
        this.field9989.method376(class643.field8843, -22095);
        this.field9992 = arg0.method2300(false, 16711680);
        this.field9992.method879(20480, (byte) 126, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field9992.method880(true, 26775);
            if (var28 != null) {
                Stream var29 = this.field9991.method4122(var28, 9179);
                float var30 = this.field9989.method1004((float) var7, 96) / (float) var7;
                float var31 = this.field9989.method1002((byte) -45, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class267 var33 = arg2[var32];
                    int var34 = var33.field3778;
                    int var35 = var33.field3784;
                    int var36 = var33.field3782;
                    int var37 = var33.field3785;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3789()) {
                        var29.method3780((float) var37);
                        var29.method3780((float) var36);
                        var29.method3780(0.0F);
                        var29.method3780(var40);
                        var29.method3780(var41);
                        var29.method3780((float) var37);
                        var29.method3780((float) (var34 + var36));
                        var29.method3780(0.0F);
                        var29.method3780(var40);
                        var29.method3780(var43);
                        var29.method3780((float) (var35 + var37));
                        var29.method3780((float) (var34 + var36));
                        var29.method3780(0.0F);
                        var29.method3780(var42);
                        var29.method3780(var43);
                        var29.method3780((float) (var35 + var37));
                        var29.method3780((float) var36);
                        var29.method3780(0.0F);
                        var29.method3780(var42);
                        var29.method3780(var41);
                    } else {
                        var29.method3792((float) var37);
                        var29.method3792((float) var36);
                        var29.method3792(0.0F);
                        var29.method3792(var40);
                        var29.method3792(var41);
                        var29.method3792((float) var37);
                        var29.method3792((float) (var34 + var36));
                        var29.method3792(0.0F);
                        var29.method3792(var40);
                        var29.method3792(var43);
                        var29.method3792((float) (var35 + var37));
                        var29.method3792((float) (var34 + var36));
                        var29.method3792(0.0F);
                        var29.method3792(var42);
                        var29.method3792(var43);
                        var29.method3792((float) (var35 + var37));
                        var29.method3792((float) var36);
                        var29.method3792(0.0F);
                        var29.method3792(var42);
                        var29.method3792(var41);
                    }
                }
                var29.method3784();
                if (this.field9992.method882(6331)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "fa", descriptor = "(CIIIZ)V")
    public final void method130(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field9991.method4145(true);
        this.field9991.method4097((byte) -41, this.field9989);
        if (this.field9990 || arg4) {
            this.field9991.method4112(class534.field7355, 112, class720.field9793);
            this.field9991.method4096((byte) 47, 0, class4.field31);
            this.field9991.method4123(-28186, arg3);
        } else {
            this.field9991.method4112(class720.field9793, 126, class720.field9793);
        }
        class81 var6 = this.field9991.method4150(-99);
        var6.method744(arg1, arg2, 0);
        this.field9991.method4138(0);
        this.field9991.method2263(54, this.field9992, 0);
        this.field9991.method2289(0, this.field9991.field10318);
        this.field9991.method2280(2, arg0 * 4, class187.field2805, true);
        if (this.field9990 || arg4) {
            this.field9991.method4096((byte) 47, 0, class755.field10544);
        }
    }
}
