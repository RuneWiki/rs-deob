import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class151 extends class200 {

    @OriginalMember(owner = "client!tba", name = "A", descriptor = "Lej;")
    private class111 field2403;

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "Lak;")
    private class324 field2402;

    @OriginalMember(owner = "client!tba", name = "y", descriptor = "Z")
    private boolean field2401;

    @OriginalMember(owner = "client!tba", name = "x", descriptor = "Leu;")
    private class448 field2400;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "(CIIIZ)V", line = 5)
    public final void method134(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2403.method908(0);
        this.field2403.method897(this.field2402, true);
        if (this.field2401 || arg4) {
            this.field2403.method909(class586.field7773, -11, class521.field6963);
            this.field2403.method859((byte) 29, class149.field2382, 0);
            this.field2403.method865(arg3, -67);
        } else {
            this.field2403.method909(class586.field7773, -126, class586.field7773);
        }
        class74 var6 = this.field2403.method857(1558);
        var6.method576(arg1, arg2, 0);
        this.field2403.method848(-362227984);
        this.field2403.method48((byte) -32, this.field2400, 0);
        this.field2403.method62(false, this.field2403.field1926);
        this.field2403.method89((byte) -97, 2, arg0 * 4, class95.field1448);
        if (this.field2401 || arg4) {
            this.field2403.method859((byte) 29, class350.field4792, 0);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(CIIIZLfa;II)V", line = 27)
    public final void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4, class217 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lej;Lkga;[Lpga;Z)V", line = 32)
    public class151(class111 arg0, class511 arg1, class500[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2403 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class500 var59 = arg2[var6];
            if (var59.field6700 > var5) {
                var5 = var59.field6700;
            }
            if (var59.field6698 > var5) {
                var5 = var59.field6698;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class500 var12 = arg2[var9];
                int var13 = var12.field6700;
                int var14 = var12.field6698;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field6696 == null) {
                    byte[] var19 = var12.field6697;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field6696;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method69(class616.field8164, true, class294.field4160)) {
                this.field2402 = arg0.method884((byte) 96, false, var7, var8, class616.field8164, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field2402 = arg0.method878(false, var7, var7, var10, (byte) -22);
            }
            this.field2401 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class500 var44 = arg2[var26];
                int[] var45 = var44.field6702;
                byte[] var46 = var44.field6696;
                byte[] var47 = var44.field6697;
                int var48 = var44.field6700;
                int var49 = var44.field6698;
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
            this.field2402 = arg0.method878(false, var7, var7, var25, (byte) -22);
            this.field2401 = false;
        }
        this.field2402.method166(class175.field2696, 7651);
        this.field2400 = arg0.method108(false, 15918);
        this.field2400.method2520(-5368, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field2400.method27((byte) -64, true);
            if (var28 != null) {
                Stream var29 = this.field2403.method896(var28, (byte) -126);
                float var30 = this.field2402.method948(22051, (float) var7) / (float) var7;
                float var31 = this.field2402.method940((float) var7, false) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class500 var33 = arg2[var32];
                    int var34 = var33.field6700;
                    int var35 = var33.field6698;
                    int var36 = var33.field6699;
                    int var37 = var33.field6695;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3473()) {
                        var29.method3480((float) var37);
                        var29.method3480((float) var36);
                        var29.method3480(0.0F);
                        var29.method3480(var40);
                        var29.method3480(var41);
                        var29.method3480((float) var37);
                        var29.method3480((float) (var34 + var36));
                        var29.method3480(0.0F);
                        var29.method3480(var40);
                        var29.method3480(var43);
                        var29.method3480((float) (var35 + var37));
                        var29.method3480((float) (var34 + var36));
                        var29.method3480(0.0F);
                        var29.method3480(var42);
                        var29.method3480(var43);
                        var29.method3480((float) (var35 + var37));
                        var29.method3480((float) var36);
                        var29.method3480(0.0F);
                        var29.method3480(var42);
                        var29.method3480(var41);
                    } else {
                        var29.method3477((float) var37);
                        var29.method3477((float) var36);
                        var29.method3477(0.0F);
                        var29.method3477(var40);
                        var29.method3477(var41);
                        var29.method3477((float) var37);
                        var29.method3477((float) (var34 + var36));
                        var29.method3477(0.0F);
                        var29.method3477(var40);
                        var29.method3477(var43);
                        var29.method3477((float) (var35 + var37));
                        var29.method3477((float) (var34 + var36));
                        var29.method3477(0.0F);
                        var29.method3477(var42);
                        var29.method3477(var43);
                        var29.method3477((float) (var35 + var37));
                        var29.method3477((float) var36);
                        var29.method3477(0.0F);
                        var29.method3477(var42);
                        var29.method3477(var41);
                    }
                }
                var29.method3479();
                if (this.field2400.method28(11390)) {
                    return;
                }
            }
        }
    }
}
