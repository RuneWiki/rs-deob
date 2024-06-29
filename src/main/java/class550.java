import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class550 extends class59 {

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "Lsr;")
    private class251 field7675;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "Ldh;")
    private class320 field7673;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "Z")
    private boolean field7674;

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "Lada;")
    private class161 field7676;

    @OriginalMember(owner = "client!cba", name = "fa", descriptor = "(CIIIZ)V")
    public final void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7675.method1639(256);
        this.field7675.method1663(this.field7673, -2);
        if (this.field7674 || arg4) {
            this.field7675.method1613(-30, class719.field9987, class502.field7202);
            this.field7675.method1664((byte) -102, class679.field9315, 0);
            this.field7675.method1640(true, arg3);
        } else {
            this.field7675.method1613(-30, class719.field9987, class719.field9987);
        }
        class328 var6 = this.field7675.method1587(3);
        var6.method339(arg1, arg2, 0);
        this.field7675.method1662(2);
        this.field7675.method1460(0, 1, this.field7676);
        this.field7675.method1479(this.field7675.field3647, 16);
        this.field7675.method1481(2, arg0 * 4, 113, class166.field2284);
        if (this.field7674 || arg4) {
            this.field7675.method1664((byte) -92, class597.field8397, 0);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method102(char arg0, int arg1, int arg2, int arg3, boolean arg4, class486 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lsr;Lqm;[Ldga;Z)V")
    public class550(class251 arg0, class143 arg1, class204[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7675 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class204 var59 = arg2[var6];
            if (var59.field2664 > var5) {
                var5 = var59.field2664;
            }
            if (var59.field2657 > var5) {
                var5 = var59.field2657;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class204 var12 = arg2[var9];
                int var13 = var12.field2664;
                int var14 = var12.field2657;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field2660 == null) {
                    byte[] var19 = var12.field2661;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field2660;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1444(class309.field4305, class233.field3143, (byte) -45)) {
                this.field7673 = arg0.method1612(false, class233.field3143, var8, 121, var7, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field7673 = arg0.method1650(var7, var10, false, var7, false);
            }
            this.field7674 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class204 var44 = arg2[var26];
                int[] var45 = var44.field2656;
                byte[] var46 = var44.field2660;
                byte[] var47 = var44.field2661;
                int var48 = var44.field2664;
                int var49 = var44.field2657;
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
            this.field7673 = arg0.method1650(var7, var25, false, var7, false);
            this.field7674 = false;
        }
        this.field7673.method81(class497.field7145, -21969);
        this.field7676 = arg0.method1429(false, 30519);
        this.field7676.method1061(-126, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field7676.method1063(-5419, true);
            if (var28 != null) {
                Stream var29 = this.field7675.method1666(var28, true);
                float var30 = this.field7673.method1322((byte) 119, (float) var7) / (float) var7;
                float var31 = this.field7673.method1318(true, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class204 var33 = arg2[var32];
                    int var34 = var33.field2664;
                    int var35 = var33.field2657;
                    int var36 = var33.field2659;
                    int var37 = var33.field2662;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3662()) {
                        var29.method3666((float) var37);
                        var29.method3666((float) var36);
                        var29.method3666(0.0F);
                        var29.method3666(var40);
                        var29.method3666(var41);
                        var29.method3666((float) var37);
                        var29.method3666((float) (var34 + var36));
                        var29.method3666(0.0F);
                        var29.method3666(var40);
                        var29.method3666(var43);
                        var29.method3666((float) (var35 + var37));
                        var29.method3666((float) (var34 + var36));
                        var29.method3666(0.0F);
                        var29.method3666(var42);
                        var29.method3666(var43);
                        var29.method3666((float) (var35 + var37));
                        var29.method3666((float) var36);
                        var29.method3666(0.0F);
                        var29.method3666(var42);
                        var29.method3666(var41);
                    } else {
                        var29.method3658((float) var37);
                        var29.method3658((float) var36);
                        var29.method3658(0.0F);
                        var29.method3658(var40);
                        var29.method3658(var41);
                        var29.method3658((float) var37);
                        var29.method3658((float) (var34 + var36));
                        var29.method3658(0.0F);
                        var29.method3658(var40);
                        var29.method3658(var43);
                        var29.method3658((float) (var35 + var37));
                        var29.method3658((float) (var34 + var36));
                        var29.method3658(0.0F);
                        var29.method3658(var42);
                        var29.method3658(var43);
                        var29.method3658((float) (var35 + var37));
                        var29.method3658((float) var36);
                        var29.method3658(0.0F);
                        var29.method3658(var42);
                        var29.method3658(var41);
                    }
                }
                var29.method3656();
                if (this.field7676.method1060(-17151)) {
                    return;
                }
            }
        }
    }
}
