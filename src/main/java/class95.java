import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class95 extends class92 {

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "Lcb;")
    private class444 field1406;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "Ljb;")
    private class422 field1405;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Z")
    private boolean field1404;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Lql;")
    private class628 field1403;

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lcb;Llg;[Lqm;Z)V")
    public class95(class444 arg0, class352 arg1, class126[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1406 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class126 var59 = arg2[var6];
            if (var59.field1771 > var5) {
                var5 = var59.field1771;
            }
            if (var59.field1767 > var5) {
                var5 = var59.field1767;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class126 var12 = arg2[var9];
                int var13 = var12.field1771;
                int var14 = var12.field1767;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field1769 == null) {
                    byte[] var19 = var12.field1773;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field1769;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method2633((byte) 127, class194.field2874, class613.field9072)) {
                this.field1405 = arg0.method2622(false, var7, 3000, var8, var7, class613.field9072);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field1405 = arg0.method2631(var7, var10, false, false, var7);
            }
            this.field1404 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class126 var44 = arg2[var26];
                int[] var45 = var44.field1772;
                byte[] var46 = var44.field1769;
                byte[] var47 = var44.field1773;
                int var48 = var44.field1771;
                int var49 = var44.field1767;
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
            this.field1405 = arg0.method2631(var7, var25, false, false, var7);
            this.field1404 = false;
        }
        this.field1405.method31(class192.field2855, 29557);
        this.field1403 = arg0.method2627(false, -30125);
        this.field1403.method1866(20480, 20, (byte) -89);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field1403.method282(-13803, true);
            if (var28 != null) {
                Stream var29 = this.field1406.method2597(var28, 1);
                float var30 = this.field1405.method1651((float) var7, 86) / (float) var7;
                float var31 = this.field1405.method1653((float) var7, (byte) -111) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class126 var33 = arg2[var32];
                    int var34 = var33.field1771;
                    int var35 = var33.field1767;
                    int var36 = var33.field1770;
                    int var37 = var33.field1766;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3454()) {
                        var29.method3446((float) var37);
                        var29.method3446((float) var36);
                        var29.method3446(0.0F);
                        var29.method3446(var40);
                        var29.method3446(var41);
                        var29.method3446((float) var37);
                        var29.method3446((float) (var34 + var36));
                        var29.method3446(0.0F);
                        var29.method3446(var40);
                        var29.method3446(var43);
                        var29.method3446((float) (var35 + var37));
                        var29.method3446((float) (var34 + var36));
                        var29.method3446(0.0F);
                        var29.method3446(var42);
                        var29.method3446(var43);
                        var29.method3446((float) (var35 + var37));
                        var29.method3446((float) var36);
                        var29.method3446(0.0F);
                        var29.method3446(var42);
                        var29.method3446(var41);
                    } else {
                        var29.method3453((float) var37);
                        var29.method3453((float) var36);
                        var29.method3453(0.0F);
                        var29.method3453(var40);
                        var29.method3453(var41);
                        var29.method3453((float) var37);
                        var29.method3453((float) (var34 + var36));
                        var29.method3453(0.0F);
                        var29.method3453(var40);
                        var29.method3453(var43);
                        var29.method3453((float) (var35 + var37));
                        var29.method3453((float) (var34 + var36));
                        var29.method3453(0.0F);
                        var29.method3453(var42);
                        var29.method3453(var43);
                        var29.method3453((float) (var35 + var37));
                        var29.method3453((float) var36);
                        var29.method3453(0.0F);
                        var29.method3453(var42);
                        var29.method3453(var41);
                    }
                }
                var29.method3448();
                if (this.field1403.method280(28596)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "HA", descriptor = "(CIIIZ)V")
    public final void method216(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1406.method2635(-19838);
        this.field1406.method2632(this.field1405, 0);
        if (this.field1404 || arg4) {
            this.field1406.method2643(class132.field1816, -10304, class296.field4074);
            this.field1406.method2598(class314.field4331, 0, (byte) 59);
            this.field1406.method2688(arg3, 28366);
        } else {
            this.field1406.method2643(class296.field4074, -10304, class296.field4074);
        }
        class57 var6 = this.field1406.method2680(0);
        var6.method353(arg1, arg2, 0);
        this.field1406.method2576((byte) 28);
        this.field1406.method2584(true, this.field1406.field6209);
        this.field1406.method2617(this.field1403, 0, (byte) 114);
        this.field1406.method2587(class230.field3373, 5, 2, arg0 * 4);
        if (this.field1404 || arg4) {
            this.field1406.method2598(class453.field6405, 0, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(CIIIZLpa;II)V")
    public final void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class311 arg5, int arg6, int arg7) {
    }
}
