import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class399 extends class61 {

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "Lij;")
    private class424 field5078;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Lwk;")
    private class145 field5076;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "Z")
    private boolean field5079;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "Lia;")
    private class591 field5077;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method120(char arg0, int arg1, int arg2, int arg3, boolean arg4, class489 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!hf", name = "fa", descriptor = "(CIIIZ)V")
    public final void method121(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5078.method2421(-127);
        this.field5078.method2396(22357, this.field5076);
        if (this.field5079 || arg4) {
            this.field5078.method2397(class476.field6418, class405.field5120, (byte) -77);
            this.field5078.method2394(class21.field383, (byte) 116, 0);
            this.field5078.method2382(arg3, -4068);
        } else {
            this.field5078.method2397(class476.field6418, class476.field6418, (byte) -71);
        }
        class477 var6 = this.field5078.method2372(true);
        var6.method596(arg1, arg2, 0);
        this.field5078.method2430(1);
        this.field5078.method2041(0, this.field5077, (byte) 73);
        this.field5078.method2033(17069, this.field5078.field5685);
        this.field5078.method2004(class426.field5714, 2, arg0 * 4, -128);
        if (this.field5079 || arg4) {
            this.field5078.method2394(class447.field5937, (byte) 89, 0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lij;Ljl;[Lhb;Z)V")
    public class399(class424 arg0, class274 arg1, class728[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5078 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class728 var59 = arg2[var6];
            if (var59.field10132 > var5) {
                var5 = var59.field10132;
            }
            if (var59.field10135 > var5) {
                var5 = var59.field10135;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class728 var12 = arg2[var9];
                int var13 = var12.field10132;
                int var14 = var12.field10135;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field10133 == null) {
                    byte[] var19 = var12.field10134;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field10133;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1985(class522.field7319, (byte) 76, class285.field3589)) {
                this.field5076 = arg0.method2376(var8, class522.field7319, var7, var7, false, -109);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field5076 = arg0.method2407(66, false, var10, var7, var7);
            }
            this.field5079 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class728 var44 = arg2[var26];
                int[] var45 = var44.field10131;
                byte[] var46 = var44.field10133;
                byte[] var47 = var44.field10134;
                int var48 = var44.field10132;
                int var49 = var44.field10135;
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
            this.field5076 = arg0.method2407(109, false, var25, var7, var7);
            this.field5079 = false;
        }
        this.field5076.method694(-21167, class291.field3813);
        this.field5077 = arg0.method2042(false, false);
        this.field5077.method296(20, 20480, 20442);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field5077.method295(true, -32022);
            if (var28 != null) {
                Stream var29 = this.field5078.method2409((byte) 76, var28);
                float var30 = this.field5076.method814(20275, (float) var7) / (float) var7;
                float var31 = this.field5076.method808((float) var7, 9347) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class728 var33 = arg2[var32];
                    int var34 = var33.field10132;
                    int var35 = var33.field10135;
                    int var36 = var33.field10128;
                    int var37 = var33.field10129;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3798()) {
                        var29.method3796((float) var37);
                        var29.method3796((float) var36);
                        var29.method3796(0.0F);
                        var29.method3796(var40);
                        var29.method3796(var41);
                        var29.method3796((float) var37);
                        var29.method3796((float) (var34 + var36));
                        var29.method3796(0.0F);
                        var29.method3796(var40);
                        var29.method3796(var43);
                        var29.method3796((float) (var35 + var37));
                        var29.method3796((float) (var34 + var36));
                        var29.method3796(0.0F);
                        var29.method3796(var42);
                        var29.method3796(var43);
                        var29.method3796((float) (var35 + var37));
                        var29.method3796((float) var36);
                        var29.method3796(0.0F);
                        var29.method3796(var42);
                        var29.method3796(var41);
                    } else {
                        var29.method3794((float) var37);
                        var29.method3794((float) var36);
                        var29.method3794(0.0F);
                        var29.method3794(var40);
                        var29.method3794(var41);
                        var29.method3794((float) var37);
                        var29.method3794((float) (var34 + var36));
                        var29.method3794(0.0F);
                        var29.method3794(var40);
                        var29.method3794(var43);
                        var29.method3794((float) (var35 + var37));
                        var29.method3794((float) (var34 + var36));
                        var29.method3794(0.0F);
                        var29.method3794(var42);
                        var29.method3794(var43);
                        var29.method3794((float) (var35 + var37));
                        var29.method3794((float) var36);
                        var29.method3794(0.0F);
                        var29.method3794(var42);
                        var29.method3794(var41);
                    }
                }
                var29.method3793();
                if (this.field5077.method299(2581)) {
                    return;
                }
            }
        }
    }
}
