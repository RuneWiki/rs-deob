import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class153 extends class181 {

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "Ltu;")
    private class294 field1865;

    @OriginalMember(owner = "client!dca", name = "x", descriptor = "Lica;")
    private class579 field1863;

    @OriginalMember(owner = "client!dca", name = "w", descriptor = "Z")
    private boolean field1862;

    @OriginalMember(owner = "client!dca", name = "y", descriptor = "Lcca;")
    private class209 field1864;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "(CIIIZ)V")
    public final void method69(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1865.method1944(0);
        this.field1865.method1971((byte) -54, this.field1863);
        if (this.field1862 || arg4) {
            this.field1865.method1912(class457.field6837, class274.field3839, 117);
            this.field1865.method1970(93, class173.field2123, 0);
            this.field1865.method1939(arg3, true);
        } else {
            this.field1865.method1912(class274.field3839, class274.field3839, -108);
        }
        class646 var6 = this.field1865.method1898(false);
        var6.method2014(arg1, arg2, 0);
        this.field1865.method1959(8769);
        this.field1865.method1558(this.field1864, 101, 0);
        this.field1865.method1562(55, this.field1865.field4363);
        this.field1865.method1561(arg0 * 4, 2, 19382, class451.field6730);
        if (this.field1862 || arg4) {
            this.field1865.method1970(55, class83.field935, 0);
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Ltu;Lcq;[Laf;Z)V")
    public class153(class294 arg0, class402 arg1, class372[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1865 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class372 var59 = arg2[var6];
            if (var59.field5692 > var5) {
                var5 = var59.field5692;
            }
            if (var59.field5688 > var5) {
                var5 = var59.field5688;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class372 var12 = arg2[var9];
                int var13 = var12.field5692;
                int var14 = var12.field5688;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field5684 == null) {
                    byte[] var19 = var12.field5685;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field5684;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1528(class562.field8019, (byte) 59, class256.field3653)) {
                this.field1863 = arg0.method1948(class562.field8019, var8, var7, var7, false, true);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field1863 = arg0.method1947(123, var10, false, var7, var7);
            }
            this.field1862 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class372 var44 = arg2[var26];
                int[] var45 = var44.field5691;
                byte[] var46 = var44.field5684;
                byte[] var47 = var44.field5685;
                int var48 = var44.field5692;
                int var49 = var44.field5688;
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
            this.field1863 = arg0.method1947(114, var25, false, var7, var7);
            this.field1862 = false;
        }
        this.field1863.method154(class570.field8217, -8457);
        this.field1864 = arg0.method1548((byte) 50, false);
        this.field1864.method1071(20, -1249, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field1864.method652(true, 31983);
            if (var28 != null) {
                Stream var29 = this.field1865.method1932(var28, (byte) -82);
                float var30 = this.field1863.method473(false, (float) var7) / (float) var7;
                float var31 = this.field1863.method474(87, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class372 var33 = arg2[var32];
                    int var34 = var33.field5692;
                    int var35 = var33.field5688;
                    int var36 = var33.field5687;
                    int var37 = var33.field5686;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3423()) {
                        var29.method3415((float) var37);
                        var29.method3415((float) var36);
                        var29.method3415(0.0F);
                        var29.method3415(var40);
                        var29.method3415(var41);
                        var29.method3415((float) var37);
                        var29.method3415((float) (var34 + var36));
                        var29.method3415(0.0F);
                        var29.method3415(var40);
                        var29.method3415(var43);
                        var29.method3415((float) (var35 + var37));
                        var29.method3415((float) (var34 + var36));
                        var29.method3415(0.0F);
                        var29.method3415(var42);
                        var29.method3415(var43);
                        var29.method3415((float) (var35 + var37));
                        var29.method3415((float) var36);
                        var29.method3415(0.0F);
                        var29.method3415(var42);
                        var29.method3415(var41);
                    } else {
                        var29.method3416((float) var37);
                        var29.method3416((float) var36);
                        var29.method3416(0.0F);
                        var29.method3416(var40);
                        var29.method3416(var41);
                        var29.method3416((float) var37);
                        var29.method3416((float) (var34 + var36));
                        var29.method3416(0.0F);
                        var29.method3416(var40);
                        var29.method3416(var43);
                        var29.method3416((float) (var35 + var37));
                        var29.method3416((float) (var34 + var36));
                        var29.method3416(0.0F);
                        var29.method3416(var42);
                        var29.method3416(var43);
                        var29.method3416((float) (var35 + var37));
                        var29.method3416((float) var36);
                        var29.method3416(0.0F);
                        var29.method3416(var42);
                        var29.method3416(var41);
                    }
                }
                var29.method3411();
                if (this.field1864.method651(-15045)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(CIIIZLfa;II)V")
    public final void method73(char arg0, int arg1, int arg2, int arg3, boolean arg4, class199 arg5, int arg6, int arg7) {
    }
}
