import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class611 extends class59 {

    @OriginalMember(owner = "client!cia", name = "y", descriptor = "Lln;")
    private class377 field8766;

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "Loq;")
    private class358 field8767;

    @OriginalMember(owner = "client!cia", name = "B", descriptor = "Z")
    private boolean field8768;

    @OriginalMember(owner = "client!cia", name = "x", descriptor = "Lel;")
    private class545 field8765;

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lln;Lur;[Lg;Z)V", line = 4)
    public class611(class377 arg0, class535 arg1, class155[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8766 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class155 var59 = arg2[var6];
            if (var59.field1706 > var5) {
                var5 = var59.field1706;
            }
            if (var59.field1708 > var5) {
                var5 = var59.field1708;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class155 var12 = arg2[var9];
                int var13 = var12.field1706;
                int var14 = var12.field1708;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field1707 == null) {
                    byte[] var19 = var12.field1702;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field1707;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method2192(class252.field3039, class687.field9697, true)) {
                this.field8767 = arg0.method2323(var8, class252.field3039, var7, var7, -93, false);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8767 = arg0.method2266(var10, 115, var7, var7, false);
            }
            this.field8768 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class155 var44 = arg2[var26];
                int[] var45 = var44.field1710;
                byte[] var46 = var44.field1707;
                byte[] var47 = var44.field1702;
                int var48 = var44.field1706;
                int var49 = var44.field1708;
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
            this.field8767 = arg0.method2266(var25, 112, var7, var7, false);
            this.field8768 = false;
        }
        this.field8767.method155(class755.field10532, -25446);
        this.field8765 = arg0.method2306(false, 0);
        this.field8765.method3110(2501, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8765.method3109(true, -22228);
            if (var28 != null) {
                Stream var29 = this.field8766.method2299(var28, 0);
                float var30 = this.field8767.method606(13050, (float) var7) / (float) var7;
                float var31 = this.field8767.method599((float) var7, 101) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class155 var33 = arg2[var32];
                    int var34 = var33.field1706;
                    int var35 = var33.field1708;
                    int var36 = var33.field1703;
                    int var37 = var33.field1709;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3823()) {
                        var29.method3810((float) var37);
                        var29.method3810((float) var36);
                        var29.method3810(0.0F);
                        var29.method3810(var40);
                        var29.method3810(var41);
                        var29.method3810((float) var37);
                        var29.method3810((float) (var34 + var36));
                        var29.method3810(0.0F);
                        var29.method3810(var40);
                        var29.method3810(var43);
                        var29.method3810((float) (var35 + var37));
                        var29.method3810((float) (var34 + var36));
                        var29.method3810(0.0F);
                        var29.method3810(var42);
                        var29.method3810(var43);
                        var29.method3810((float) (var35 + var37));
                        var29.method3810((float) var36);
                        var29.method3810(0.0F);
                        var29.method3810(var42);
                        var29.method3810(var41);
                    } else {
                        var29.method3815((float) var37);
                        var29.method3815((float) var36);
                        var29.method3815(0.0F);
                        var29.method3815(var40);
                        var29.method3815(var41);
                        var29.method3815((float) var37);
                        var29.method3815((float) (var34 + var36));
                        var29.method3815(0.0F);
                        var29.method3815(var40);
                        var29.method3815(var43);
                        var29.method3815((float) (var35 + var37));
                        var29.method3815((float) (var34 + var36));
                        var29.method3815(0.0F);
                        var29.method3815(var42);
                        var29.method3815(var43);
                        var29.method3815((float) (var35 + var37));
                        var29.method3815((float) var36);
                        var29.method3815(0.0F);
                        var29.method3815(var42);
                        var29.method3815(var41);
                    }
                }
                var29.method3821();
                if (this.field8765.method3107((byte) 106)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(CIIIZLaa;II)V", line = 309)
    public final void method82(char arg0, int arg1, int arg2, int arg3, boolean arg4, class485 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!cia", name = "fa", descriptor = "(CIIIZ)V", line = 313)
    public final void method80(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8766.method2233(0);
        this.field8766.method2207((byte) -61, this.field8767);
        if (this.field8768 || arg4) {
            this.field8766.method2242(-80, class372.field4752, class94.field989);
            this.field8766.method2264(0, class58.field582, (byte) 60);
            this.field8766.method2257(arg3, -552);
        } else {
            this.field8766.method2242(-70, class94.field989, class94.field989);
        }
        class427 var6 = this.field8766.method2263((byte) 55);
        var6.method1019(arg1, arg2, 0);
        this.field8766.method2304(123);
        this.field8766.method2301(true, this.field8765, 0);
        this.field8766.method2285(1, this.field8766.field5161);
        this.field8766.method2209(0, arg0 * 4, 2, class208.field2458);
        if (this.field8768 || arg4) {
            this.field8766.method2264(0, class424.field6157, (byte) 60);
        }
    }
}
