import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class503 extends class409 {

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "Lqq;")
    private class651 field6930;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "Lgn;")
    private class691 field6927;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "Z")
    private boolean field6928;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "Lwr;")
    private class697 field6929;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method756(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lqq;Laga;[Ltq;Z)V")
    public class503(class651 arg0, class658 arg1, class92[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6930 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class92 var59 = arg2[var6];
            if (var59.field1128 > var5) {
                var5 = var59.field1128;
            }
            if (var59.field1132 > var5) {
                var5 = var59.field1132;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class92 var12 = arg2[var9];
                int var13 = var12.field1128;
                int var14 = var12.field1132;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field1129 == null) {
                    byte[] var19 = var12.field1130;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field1129;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method2037(class404.field5338, class635.field8783, (byte) 51)) {
                this.field6927 = arg0.method3653(class635.field8783, var7, var8, false, -29799, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field6927 = arg0.method3662(var7, false, var7, -111, var10);
            }
            this.field6928 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class92 var44 = arg2[var26];
                int[] var45 = var44.field1127;
                byte[] var46 = var44.field1129;
                byte[] var47 = var44.field1130;
                int var48 = var44.field1128;
                int var49 = var44.field1132;
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
            this.field6927 = arg0.method3662(var7, false, var7, -106, var25);
            this.field6928 = false;
        }
        this.field6927.method390(29613, class695.field9800);
        this.field6929 = arg0.method1996(false, (byte) 127);
        this.field6929.method2567(20, (byte) -128, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field6929.method2566(true, (byte) 6);
            if (var28 != null) {
                Stream var29 = this.field6930.method3614(var28, 0);
                float var30 = this.field6927.method843((float) var7, (byte) 58) / (float) var7;
                float var31 = this.field6927.method841((byte) -40, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class92 var33 = arg2[var32];
                    int var34 = var33.field1128;
                    int var35 = var33.field1132;
                    int var36 = var33.field1126;
                    int var37 = var33.field1125;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3445()) {
                        var29.method3439((float) var37);
                        var29.method3439((float) var36);
                        var29.method3439(0.0F);
                        var29.method3439(var40);
                        var29.method3439(var41);
                        var29.method3439((float) var37);
                        var29.method3439((float) (var34 + var36));
                        var29.method3439(0.0F);
                        var29.method3439(var40);
                        var29.method3439(var43);
                        var29.method3439((float) (var35 + var37));
                        var29.method3439((float) (var34 + var36));
                        var29.method3439(0.0F);
                        var29.method3439(var42);
                        var29.method3439(var43);
                        var29.method3439((float) (var35 + var37));
                        var29.method3439((float) var36);
                        var29.method3439(0.0F);
                        var29.method3439(var42);
                        var29.method3439(var41);
                    } else {
                        var29.method3438((float) var37);
                        var29.method3438((float) var36);
                        var29.method3438(0.0F);
                        var29.method3438(var40);
                        var29.method3438(var41);
                        var29.method3438((float) var37);
                        var29.method3438((float) (var34 + var36));
                        var29.method3438(0.0F);
                        var29.method3438(var40);
                        var29.method3438(var43);
                        var29.method3438((float) (var35 + var37));
                        var29.method3438((float) (var34 + var36));
                        var29.method3438(0.0F);
                        var29.method3438(var42);
                        var29.method3438(var43);
                        var29.method3438((float) (var35 + var37));
                        var29.method3438((float) var36);
                        var29.method3438(0.0F);
                        var29.method3438(var42);
                        var29.method3438(var41);
                    }
                }
                var29.method3440();
                if (this.field6929.method2564(126)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "OA", descriptor = "(CIIIZ)V")
    public final void method754(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6930.method3683((byte) 26);
        this.field6930.method3613((byte) 103, this.field6927);
        if (this.field6928 || arg4) {
            this.field6930.method3672((byte) 28, class274.field3642, class298.field3941);
            this.field6930.method3624(class137.field1869, -116, 0);
            this.field6930.method3678(-128, arg3);
        } else {
            this.field6930.method3672((byte) -81, class298.field3941, class298.field3941);
        }
        class149 var6 = this.field6930.method3675(63);
        var6.method359(arg1, arg2, 0);
        this.field6930.method3685(-127);
        this.field6930.method2020(-51, 0, this.field6929);
        this.field6930.method1994(this.field6930.field9291, 3);
        this.field6930.method2012(2, 255, class67.field826, arg0 * 4);
        if (this.field6928 || arg4) {
            this.field6930.method3624(class630.field8719, -113, 0);
        }
    }
}
