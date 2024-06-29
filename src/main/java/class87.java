import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class87 extends class262 {

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "Lre;")
    private class582 field1167;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "Lgq;")
    private class305 field1165;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "Z")
    private boolean field1166;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "Llca;")
    private class133 field1164;

    @OriginalMember(owner = "client!gt", name = "HA", descriptor = "(CIIIZ)V")
    public final void method487(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1167.method3324(30426);
        this.field1167.method3344(29639, this.field1165);
        if (this.field1166 || arg4) {
            this.field1167.method3316(class509.field7093, -119, class443.field6123);
            this.field1167.method3300(true, 0, class320.field4434);
            this.field1167.method3334(8, arg3);
        } else {
            this.field1167.method3316(class509.field7093, 52, class509.field7093);
        }
        class186 var6 = this.field1167.method3346((byte) 75);
        var6.method361(arg1, arg2, 0);
        this.field1167.method3336((byte) 59);
        this.field1167.method1207(this.field1167.field8404, 1);
        this.field1167.method1171(this.field1164, 0, (byte) -98);
        this.field1167.method1208(class603.field8706, arg0 * 4, 86, 2);
        if (this.field1166 || arg4) {
            this.field1167.method3300(true, 0, class93.field1233);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(CIIIZLpa;II)V")
    public final void method488(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lre;Lpe;[Lig;Z)V")
    public class87(class582 arg0, class157 arg1, class295[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1167 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class295 var59 = arg2[var6];
            if (var59.field3834 > var5) {
                var5 = var59.field3834;
            }
            if (var59.field3835 > var5) {
                var5 = var59.field3835;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class295 var12 = arg2[var9];
                int var13 = var12.field3834;
                int var14 = var12.field3835;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field3833 == null) {
                    byte[] var19 = var12.field3831;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field3833;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1214(class280.field3663, class33.field495, 127)) {
                this.field1165 = arg0.method3350(class33.field495, (byte) -28, var8, false, var7, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field1165 = arg0.method3349(-114, var7, false, var7, var10);
            }
            this.field1166 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class295 var44 = arg2[var26];
                int[] var45 = var44.field3828;
                byte[] var46 = var44.field3833;
                byte[] var47 = var44.field3831;
                int var48 = var44.field3834;
                int var49 = var44.field3835;
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
            this.field1165 = arg0.method3349(-22, var7, false, var7, var25);
            this.field1166 = false;
        }
        this.field1165.method49(class6.field57, 27754);
        this.field1164 = arg0.method1197(10, false);
        this.field1164.method703(20480, 11360, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field1164.method297((byte) 52, true);
            if (var28 != null) {
                Stream var29 = this.field1167.method3287(-1, var28);
                float var30 = this.field1165.method1053((byte) 3, (float) var7) / (float) var7;
                float var31 = this.field1165.method1051(-3008, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class295 var33 = arg2[var32];
                    int var34 = var33.field3834;
                    int var35 = var33.field3835;
                    int var36 = var33.field3832;
                    int var37 = var33.field3830;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3209()) {
                        var29.method3197((float) var37);
                        var29.method3197((float) var36);
                        var29.method3197(0.0F);
                        var29.method3197(var40);
                        var29.method3197(var41);
                        var29.method3197((float) var37);
                        var29.method3197((float) (var34 + var36));
                        var29.method3197(0.0F);
                        var29.method3197(var40);
                        var29.method3197(var43);
                        var29.method3197((float) (var35 + var37));
                        var29.method3197((float) (var34 + var36));
                        var29.method3197(0.0F);
                        var29.method3197(var42);
                        var29.method3197(var43);
                        var29.method3197((float) (var35 + var37));
                        var29.method3197((float) var36);
                        var29.method3197(0.0F);
                        var29.method3197(var42);
                        var29.method3197(var41);
                    } else {
                        var29.method3206((float) var37);
                        var29.method3206((float) var36);
                        var29.method3206(0.0F);
                        var29.method3206(var40);
                        var29.method3206(var41);
                        var29.method3206((float) var37);
                        var29.method3206((float) (var34 + var36));
                        var29.method3206(0.0F);
                        var29.method3206(var40);
                        var29.method3206(var43);
                        var29.method3206((float) (var35 + var37));
                        var29.method3206((float) (var34 + var36));
                        var29.method3206(0.0F);
                        var29.method3206(var42);
                        var29.method3206(var43);
                        var29.method3206((float) (var35 + var37));
                        var29.method3206((float) var36);
                        var29.method3206(0.0F);
                        var29.method3206(var42);
                        var29.method3206(var41);
                    }
                }
                var29.method3207();
                if (this.field1164.method290(22526)) {
                    return;
                }
            }
        }
    }
}
