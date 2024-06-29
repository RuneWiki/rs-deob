import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class132 extends class402 {

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "Lrl;")
    private class232 field1848;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "Ldg;")
    private class19 field1847;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "Z")
    private boolean field1849;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "Lrv;")
    private class440 field1850;

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lrl;Lej;[Loia;Z)V", line = 4)
    public class132(class232 arg0, class179 arg1, class52[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1848 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class52 var59 = arg2[var6];
            if (var59.field766 > var5) {
                var5 = var59.field766;
            }
            if (var59.field767 > var5) {
                var5 = var59.field767;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class52 var12 = arg2[var9];
                int var13 = var12.field766;
                int var14 = var12.field767;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field759 == null) {
                    byte[] var19 = var12.field763;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field759;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method323(class38.field472, class401.field5747, (byte) -16)) {
                this.field1847 = arg0.method1416(class401.field5747, var7, false, true, var8, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field1847 = arg0.method1520(var10, var7, false, var7, (byte) -115);
            }
            this.field1849 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class52 var44 = arg2[var26];
                int[] var45 = var44.field760;
                byte[] var46 = var44.field759;
                byte[] var47 = var44.field763;
                int var48 = var44.field766;
                int var49 = var44.field767;
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
            this.field1847 = arg0.method1520(var25, var7, false, var7, (byte) -126);
            this.field1849 = false;
        }
        this.field1847.method1121(class352.field5092, (byte) 66);
        this.field1850 = arg0.method319((byte) 61, false);
        this.field1850.method2140((byte) -70, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field1850.method2145(true, 27425);
            if (var28 != null) {
                Stream var29 = this.field1848.method1473(-1969469652, var28);
                float var30 = this.field1847.method96((float) var7, -21696) / (float) var7;
                float var31 = this.field1847.method97(-28409, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class52 var33 = arg2[var32];
                    int var34 = var33.field766;
                    int var35 = var33.field767;
                    int var36 = var33.field761;
                    int var37 = var33.field765;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2614()) {
                        var29.method2608((float) var37);
                        var29.method2608((float) var36);
                        var29.method2608(0.0F);
                        var29.method2608(var40);
                        var29.method2608(var41);
                        var29.method2608((float) var37);
                        var29.method2608((float) (var34 + var36));
                        var29.method2608(0.0F);
                        var29.method2608(var40);
                        var29.method2608(var43);
                        var29.method2608((float) (var35 + var37));
                        var29.method2608((float) (var34 + var36));
                        var29.method2608(0.0F);
                        var29.method2608(var42);
                        var29.method2608(var43);
                        var29.method2608((float) (var35 + var37));
                        var29.method2608((float) var36);
                        var29.method2608(0.0F);
                        var29.method2608(var42);
                        var29.method2608(var41);
                    } else {
                        var29.method2617((float) var37);
                        var29.method2617((float) var36);
                        var29.method2617(0.0F);
                        var29.method2617(var40);
                        var29.method2617(var41);
                        var29.method2617((float) var37);
                        var29.method2617((float) (var34 + var36));
                        var29.method2617(0.0F);
                        var29.method2617(var40);
                        var29.method2617(var43);
                        var29.method2617((float) (var35 + var37));
                        var29.method2617((float) (var34 + var36));
                        var29.method2617(0.0F);
                        var29.method2617(var42);
                        var29.method2617(var43);
                        var29.method2617((float) (var35 + var37));
                        var29.method2617((float) var36);
                        var29.method2617(0.0F);
                        var29.method2617(var42);
                        var29.method2617(var41);
                    }
                }
                var29.method2613();
                if (this.field1850.method2143(-103)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "fa", descriptor = "(CIIIZ)V", line = 307)
    public final void method829(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1848.method1478(-1610404404);
        this.field1848.method1458(399403340, this.field1847);
        if (this.field1849 || arg4) {
            this.field1848.method1388(class179.field2467, (byte) 52, class87.field1239);
            this.field1848.method1408(0, 0, class520.field7247);
            this.field1848.method1414(arg3, (byte) -100);
        } else {
            this.field1848.method1388(class87.field1239, (byte) 52, class87.field1239);
        }
        class474 var6 = this.field1848.method1428((byte) 121);
        var6.method905(arg1, arg2, 0);
        this.field1848.method1443(0);
        this.field1848.method314(-107, 0, this.field1850);
        this.field1848.method265(1024, this.field1848.field3463);
        this.field1848.method347(57, class151.field2082, 2, arg0 * 4);
        if (this.field1849 || arg4) {
            this.field1848.method1408(0, 0, class15.field140);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(CIIIZLaa;II)V", line = 329)
    public final void method830(char arg0, int arg1, int arg2, int arg3, boolean arg4, class573 arg5, int arg6, int arg7) {
    }
}
