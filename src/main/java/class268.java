import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class268 extends class395 {

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Lnh;")
    private class495 field3827;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "Ldca;")
    private class612 field3828;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Z")
    private boolean field3826;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lwf;")
    private class483 field3825;

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lnh;Lll;[Lfda;Z)V", line = 7)
    public class268(class495 arg0, class490 arg1, class628[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3827 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class628 var59 = arg2[var6];
            if (var59.field8940 > var5) {
                var5 = var59.field8940;
            }
            if (var59.field8936 > var5) {
                var5 = var59.field8936;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class628 var12 = arg2[var9];
                int var13 = var12.field8940;
                int var14 = var12.field8936;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field8934 == null) {
                    byte[] var19 = var12.field8939;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field8934;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method91(class665.field9353, 16674, class689.field9771)) {
                this.field3828 = arg0.method2902(var8, 0, var7, class665.field9353, var7, false);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field3828 = arg0.method2928(false, var7, false, var7, var10);
            }
            this.field3826 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class628 var44 = arg2[var26];
                int[] var45 = var44.field8938;
                byte[] var46 = var44.field8934;
                byte[] var47 = var44.field8939;
                int var48 = var44.field8940;
                int var49 = var44.field8936;
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
            this.field3828 = arg0.method2928(false, var7, false, var7, var25);
            this.field3826 = false;
        }
        this.field3828.method394((byte) -110, class28.field391);
        this.field3825 = arg0.method119(false, 0);
        this.field3825.method535(14036, 20480, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field3825.method532(true, (byte) 56);
            if (var28 != null) {
                Stream var29 = this.field3827.method2912(107, var28);
                float var30 = this.field3828.method416(-14098, (float) var7) / (float) var7;
                float var31 = this.field3828.method418((float) var7, false) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class628 var33 = arg2[var32];
                    int var34 = var33.field8940;
                    int var35 = var33.field8936;
                    int var36 = var33.field8935;
                    int var37 = var33.field8933;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2042()) {
                        var29.method2037((float) var37);
                        var29.method2037((float) var36);
                        var29.method2037(0.0F);
                        var29.method2037(var40);
                        var29.method2037(var41);
                        var29.method2037((float) var37);
                        var29.method2037((float) (var34 + var36));
                        var29.method2037(0.0F);
                        var29.method2037(var40);
                        var29.method2037(var43);
                        var29.method2037((float) (var35 + var37));
                        var29.method2037((float) (var34 + var36));
                        var29.method2037(0.0F);
                        var29.method2037(var42);
                        var29.method2037(var43);
                        var29.method2037((float) (var35 + var37));
                        var29.method2037((float) var36);
                        var29.method2037(0.0F);
                        var29.method2037(var42);
                        var29.method2037(var41);
                    } else {
                        var29.method2035((float) var37);
                        var29.method2035((float) var36);
                        var29.method2035(0.0F);
                        var29.method2035(var40);
                        var29.method2035(var41);
                        var29.method2035((float) var37);
                        var29.method2035((float) (var34 + var36));
                        var29.method2035(0.0F);
                        var29.method2035(var40);
                        var29.method2035(var43);
                        var29.method2035((float) (var35 + var37));
                        var29.method2035((float) (var34 + var36));
                        var29.method2035(0.0F);
                        var29.method2035(var42);
                        var29.method2035(var43);
                        var29.method2035((float) (var35 + var37));
                        var29.method2035((float) var36);
                        var29.method2035(0.0F);
                        var29.method2035(var42);
                        var29.method2035(var41);
                    }
                }
                var29.method2034();
                if (this.field3825.method530(-14770)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "OA", descriptor = "(CIIIZ)V", line = 310)
    public final void method368(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3827.method2972(3644);
        this.field3827.method2924(13528, this.field3828);
        if (this.field3826 || arg4) {
            this.field3827.method2959(class345.field4866, class55.field715, (byte) 53);
            this.field3827.method2914(90, 0, class450.field6484);
            this.field3827.method2936(arg3, -128);
        } else {
            this.field3827.method2959(class345.field4866, class345.field4866, (byte) 82);
        }
        class14 var6 = this.field3827.method2925(0);
        var6.method166(arg1, arg2, 0);
        this.field3827.method2973(true);
        this.field3827.method131(3438, this.field3825, 0);
        this.field3827.method98((byte) -6, this.field3827.field7397);
        this.field3827.method74((byte) -33, 2, arg0 * 4, class486.field6928);
        if (this.field3826 || arg4) {
            this.field3827.method2914(21, 0, class171.field2763);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(CIIIZLua;II)V", line = 332)
    public final void method366(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7) {
    }
}
