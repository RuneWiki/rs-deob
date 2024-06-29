import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class258 extends class67 {

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Lee;")
    private class703 field3835;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Lfk;")
    private class678 field3836;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Z")
    private boolean field3833;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Lkm;")
    private class373 field3834;

    @OriginalMember(owner = "client!ig", name = "fa", descriptor = "(CIIIZ)V", line = 5)
    public final void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3835.method3888(-19229);
        this.field3835.method3882(0, this.field3836);
        if (this.field3833 || arg4) {
            this.field3835.method3911(22228, class291.field4152, class117.field1574);
            this.field3835.method3859(119, 0, class64.field840);
            this.field3835.method3838(arg3, Integer.MAX_VALUE);
        } else {
            this.field3835.method3911(22228, class117.field1574, class117.field1574);
        }
        class532 var6 = this.field3835.method3864((byte) -57);
        var6.method814(arg1, arg2, 0);
        this.field3835.method3852(true);
        this.field3835.method2818(false, this.field3834, 0);
        this.field3835.method2816((byte) 97, this.field3835.field9622);
        this.field3835.method2778((byte) -93, arg0 * 4, 2, class9.field88);
        if (this.field3833 || arg4) {
            this.field3835.method3859(125, 0, class790.field10851);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(CIIIZLaa;II)V", line = 28)
    public final void method107(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lee;Leb;[Lvf;Z)V", line = 33)
    public class258(class703 arg0, class651 arg1, class162[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3835 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class162 var59 = arg2[var6];
            if (var59.field2155 > var5) {
                var5 = var59.field2155;
            }
            if (var59.field2156 > var5) {
                var5 = var59.field2156;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class162 var12 = arg2[var9];
                int var13 = var12.field2155;
                int var14 = var12.field2156;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field2157 == null) {
                    byte[] var19 = var12.field2154;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field2157;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method2784(true, class415.field5986, class325.field4613)) {
                this.field3836 = arg0.method3861(var7, var7, false, 12413, var8, class325.field4613);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field3836 = arg0.method3856(false, var7, var7, var10, false);
            }
            this.field3833 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class162 var44 = arg2[var26];
                int[] var45 = var44.field2160;
                byte[] var46 = var44.field2157;
                byte[] var47 = var44.field2154;
                int var48 = var44.field2155;
                int var49 = var44.field2156;
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
            this.field3836 = arg0.method3856(false, var7, var7, var25, false);
            this.field3833 = false;
        }
        this.field3836.method706((byte) -96, class164.field2195);
        this.field3834 = arg0.method2795(0, false);
        this.field3834.method2339(20480, -32754, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field3834.method2338(true, false);
            if (var28 != null) {
                Stream var29 = this.field3835.method3889(0, var28);
                float var30 = this.field3836.method617((float) var7, false) / (float) var7;
                float var31 = this.field3836.method621(20490, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class162 var33 = arg2[var32];
                    int var34 = var33.field2155;
                    int var35 = var33.field2156;
                    int var36 = var33.field2161;
                    int var37 = var33.field2159;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3798()) {
                        var29.method3800((float) var37);
                        var29.method3800((float) var36);
                        var29.method3800(0.0F);
                        var29.method3800(var40);
                        var29.method3800(var41);
                        var29.method3800((float) var37);
                        var29.method3800((float) (var34 + var36));
                        var29.method3800(0.0F);
                        var29.method3800(var40);
                        var29.method3800(var43);
                        var29.method3800((float) (var35 + var37));
                        var29.method3800((float) (var34 + var36));
                        var29.method3800(0.0F);
                        var29.method3800(var42);
                        var29.method3800(var43);
                        var29.method3800((float) (var35 + var37));
                        var29.method3800((float) var36);
                        var29.method3800(0.0F);
                        var29.method3800(var42);
                        var29.method3800(var41);
                    } else {
                        var29.method3809((float) var37);
                        var29.method3809((float) var36);
                        var29.method3809(0.0F);
                        var29.method3809(var40);
                        var29.method3809(var41);
                        var29.method3809((float) var37);
                        var29.method3809((float) (var34 + var36));
                        var29.method3809(0.0F);
                        var29.method3809(var40);
                        var29.method3809(var43);
                        var29.method3809((float) (var35 + var37));
                        var29.method3809((float) (var34 + var36));
                        var29.method3809(0.0F);
                        var29.method3809(var42);
                        var29.method3809(var43);
                        var29.method3809((float) (var35 + var37));
                        var29.method3809((float) var36);
                        var29.method3809(0.0F);
                        var29.method3809(var42);
                        var29.method3809(var41);
                    }
                }
                var29.method3797();
                if (this.field3834.method2337(6544)) {
                    return;
                }
            }
        }
    }
}
