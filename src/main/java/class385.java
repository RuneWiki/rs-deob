import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class385 extends class301 {

    @OriginalMember(owner = "client!su", name = "z", descriptor = "Lsv;")
    private class312 field5585;

    @OriginalMember(owner = "client!su", name = "B", descriptor = "Lsd;")
    private class595 field5587;

    @OriginalMember(owner = "client!su", name = "y", descriptor = "Z")
    private boolean field5584;

    @OriginalMember(owner = "client!su", name = "A", descriptor = "Lvp;")
    private class467 field5586;

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lsv;Lil;[Lme;Z)V", line = 7)
    public class385(class312 arg0, class598 arg1, class366[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5585 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class366 var59 = arg2[var6];
            if (var59.field5253 > var5) {
                var5 = var59.field5253;
            }
            if (var59.field5252 > var5) {
                var5 = var59.field5252;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class366 var12 = arg2[var9];
                int var13 = var12.field5253;
                int var14 = var12.field5252;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field5255 == null) {
                    byte[] var19 = var12.field5256;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field5255;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method826(class394.field5654, class680.field9664, true)) {
                this.field5587 = arg0.method1978((byte) 55, var7, var8, var7, false, class394.field5654);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field5587 = arg0.method1974(var7, var7, false, var10, false);
            }
            this.field5584 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class366 var44 = arg2[var26];
                int[] var45 = var44.field5248;
                byte[] var46 = var44.field5255;
                byte[] var47 = var44.field5256;
                int var48 = var44.field5253;
                int var49 = var44.field5252;
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
            this.field5587 = arg0.method1974(var7, var7, false, var25, false);
            this.field5584 = false;
        }
        this.field5587.method172(class428.field5951, (byte) 64);
        this.field5586 = arg0.method819(false, (byte) -2);
        this.field5586.method1019(20, 20480, -26802);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field5586.method1025(true, (byte) 67);
            if (var28 != null) {
                Stream var29 = this.field5585.method1920((byte) 98, var28);
                float var30 = this.field5587.method168(31688, (float) var7) / (float) var7;
                float var31 = this.field5587.method170((float) var7, -17968) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class366 var33 = arg2[var32];
                    int var34 = var33.field5253;
                    int var35 = var33.field5252;
                    int var36 = var33.field5251;
                    int var37 = var33.field5250;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method1519()) {
                        var29.method1530((float) var37);
                        var29.method1530((float) var36);
                        var29.method1530(0.0F);
                        var29.method1530(var40);
                        var29.method1530(var41);
                        var29.method1530((float) var37);
                        var29.method1530((float) (var34 + var36));
                        var29.method1530(0.0F);
                        var29.method1530(var40);
                        var29.method1530(var43);
                        var29.method1530((float) (var35 + var37));
                        var29.method1530((float) (var34 + var36));
                        var29.method1530(0.0F);
                        var29.method1530(var42);
                        var29.method1530(var43);
                        var29.method1530((float) (var35 + var37));
                        var29.method1530((float) var36);
                        var29.method1530(0.0F);
                        var29.method1530(var42);
                        var29.method1530(var41);
                    } else {
                        var29.method1520((float) var37);
                        var29.method1520((float) var36);
                        var29.method1520(0.0F);
                        var29.method1520(var40);
                        var29.method1520(var41);
                        var29.method1520((float) var37);
                        var29.method1520((float) (var34 + var36));
                        var29.method1520(0.0F);
                        var29.method1520(var40);
                        var29.method1520(var43);
                        var29.method1520((float) (var35 + var37));
                        var29.method1520((float) (var34 + var36));
                        var29.method1520(0.0F);
                        var29.method1520(var42);
                        var29.method1520(var43);
                        var29.method1520((float) (var35 + var37));
                        var29.method1520((float) var36);
                        var29.method1520(0.0F);
                        var29.method1520(var42);
                        var29.method1520(var41);
                    }
                }
                var29.method1523();
                if (this.field5586.method1021(true)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(CIIIZLfa;II)V", line = 309)
    public final void method1103(char arg0, int arg1, int arg2, int arg3, boolean arg4, class185 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!su", name = "q", descriptor = "(CIIIZ)V", line = 313)
    public final void method1099(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5585.method1936(13);
        this.field5585.method1884(this.field5587, -2);
        if (this.field5584 || arg4) {
            this.field5585.method1917(false, class594.field8145, class66.field868);
            this.field5585.method1997(class577.field7974, 0, -84);
            this.field5585.method1883(arg3, (byte) 97);
        } else {
            this.field5585.method1917(false, class66.field868, class66.field868);
        }
        class492 var6 = this.field5585.method2004((byte) -87);
        var6.method609(arg1, arg2, 0);
        this.field5585.method1959(false);
        this.field5585.method809(1, 0, this.field5586);
        this.field5585.method849((byte) 43, this.field5585.field4488);
        this.field5585.method856(-2, arg0 * 4, class490.field6606, 2);
        if (this.field5584 || arg4) {
            this.field5585.method1997(class322.field4722, 0, -107);
        }
    }
}
