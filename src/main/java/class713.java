import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class713 extends class59 {

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "Lgt;")
    private class453 field9962;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "Lwda;")
    private class636 field9961;

    @OriginalMember(owner = "client!jga", name = "u", descriptor = "Z")
    private boolean field9959;

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "Lcaa;")
    private class302 field9960;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method106(char arg0, int arg1, int arg2, int arg3, boolean arg4, class484 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!jga", name = "fa", descriptor = "(CIIIZ)V")
    public final void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field9962.method2735((byte) -20);
        this.field9962.method2732(-60, this.field9961);
        if (this.field9959 || arg4) {
            this.field9962.method2769(class571.field8118, class140.field2165, 18721);
            this.field9962.method2767(0, 25103, class142.field2176);
            this.field9962.method2730(arg3, -32755);
        } else {
            this.field9962.method2769(class140.field2165, class140.field2165, 18721);
        }
        class25 var6 = this.field9962.method2765((byte) -111);
        var6.method157(arg1, arg2, 0);
        this.field9962.method2698(0);
        this.field9962.method1059(this.field9960, 0, -101);
        this.field9962.method1014(this.field9962.field6560, false);
        this.field9962.method1022(class442.field6159, -108, 2, arg0 * 4);
        if (this.field9959 || arg4) {
            this.field9962.method2767(0, 25103, class68.field1225);
        }
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lgt;Lfp;[Lfw;Z)V")
    public class713(class453 arg0, class323 arg1, class55[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field9962 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class55 var59 = arg2[var6];
            if (var59.field1038 > var5) {
                var5 = var59.field1038;
            }
            if (var59.field1044 > var5) {
                var5 = var59.field1044;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class55 var12 = arg2[var9];
                int var13 = var12.field1038;
                int var14 = var12.field1044;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field1040 == null) {
                    byte[] var19 = var12.field1041;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field1040;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1035(-109, class438.field6117, class643.field9137)) {
                this.field9961 = arg0.method2750(var8, false, var7, class643.field9137, var7, -19);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field9961 = arg0.method2740(false, var7, var7, var10, (byte) -100);
            }
            this.field9959 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class55 var44 = arg2[var26];
                int[] var45 = var44.field1039;
                byte[] var46 = var44.field1040;
                byte[] var47 = var44.field1041;
                int var48 = var44.field1038;
                int var49 = var44.field1044;
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
            this.field9961 = arg0.method2740(false, var7, var7, var25, (byte) -100);
            this.field9959 = false;
        }
        this.field9961.method979(class514.field7326, -124);
        this.field9960 = arg0.method1036((byte) -40, false);
        this.field9960.method1497(20, 20480, -29407);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field9960.method1492((byte) -20, true);
            if (var28 != null) {
                Stream var29 = this.field9962.method2764(var28, (byte) -76);
                float var30 = this.field9961.method423(31272, (float) var7) / (float) var7;
                float var31 = this.field9961.method432((float) var7, -12086) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class55 var33 = arg2[var32];
                    int var34 = var33.field1038;
                    int var35 = var33.field1044;
                    int var36 = var33.field1036;
                    int var37 = var33.field1042;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3762()) {
                        var29.method3774((float) var37);
                        var29.method3774((float) var36);
                        var29.method3774(0.0F);
                        var29.method3774(var40);
                        var29.method3774(var41);
                        var29.method3774((float) var37);
                        var29.method3774((float) (var34 + var36));
                        var29.method3774(0.0F);
                        var29.method3774(var40);
                        var29.method3774(var43);
                        var29.method3774((float) (var35 + var37));
                        var29.method3774((float) (var34 + var36));
                        var29.method3774(0.0F);
                        var29.method3774(var42);
                        var29.method3774(var43);
                        var29.method3774((float) (var35 + var37));
                        var29.method3774((float) var36);
                        var29.method3774(0.0F);
                        var29.method3774(var42);
                        var29.method3774(var41);
                    } else {
                        var29.method3770((float) var37);
                        var29.method3770((float) var36);
                        var29.method3770(0.0F);
                        var29.method3770(var40);
                        var29.method3770(var41);
                        var29.method3770((float) var37);
                        var29.method3770((float) (var34 + var36));
                        var29.method3770(0.0F);
                        var29.method3770(var40);
                        var29.method3770(var43);
                        var29.method3770((float) (var35 + var37));
                        var29.method3770((float) (var34 + var36));
                        var29.method3770(0.0F);
                        var29.method3770(var42);
                        var29.method3770(var43);
                        var29.method3770((float) (var35 + var37));
                        var29.method3770((float) var36);
                        var29.method3770(0.0F);
                        var29.method3770(var42);
                        var29.method3770(var41);
                    }
                }
                var29.method3761();
                if (this.field9960.method1494(5069)) {
                    return;
                }
            }
        }
    }
}
