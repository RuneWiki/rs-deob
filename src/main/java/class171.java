import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class171 extends class195 {

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Lfo;")
    private class473 field2049;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "Lae;")
    private class228 field2048;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "Z")
    private boolean field2047;

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "Ltfa;")
    private class31 field2050;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "(CIIIZ)V")
    public final void method13(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2049.method2706((byte) 82);
        this.field2049.method2696(-2, this.field2048);
        if (this.field2047 || arg4) {
            this.field2049.method2759(class193.field2323, (byte) -5, class676.field9584);
            this.field2049.method2757(class521.field7461, (byte) -73, 0);
            this.field2049.method2719(arg3, (byte) -127);
        } else {
            this.field2049.method2759(class676.field9584, (byte) -5, class676.field9584);
        }
        class667 var6 = this.field2049.method2752((byte) 3);
        var6.method228(arg1, arg2, 0);
        this.field2049.method2693(28392);
        this.field2049.method1198(0, (byte) 120, this.field2050);
        this.field2049.method1174(0, this.field2049.field6892);
        this.field2049.method1176(arg0 * 4, 1768, 2, class18.field166);
        if (this.field2047 || arg4) {
            this.field2049.method2757(class67.field708, (byte) -73, 0);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(CIIIZLfa;II)V")
    public final void method17(char arg0, int arg1, int arg2, int arg3, boolean arg4, class213 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lfo;Led;[Laaa;Z)V")
    public class171(class473 arg0, class645 arg1, class563[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2049 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class563 var59 = arg2[var6];
            if (var59.field8005 > var5) {
                var5 = var59.field8005;
            }
            if (var59.field8002 > var5) {
                var5 = var59.field8002;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class563 var12 = arg2[var9];
                int var13 = var12.field8005;
                int var14 = var12.field8002;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field8001 == null) {
                    byte[] var19 = var12.field8006;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field8001;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1169(class595.field8446, class271.field3429, (byte) 126)) {
                this.field2048 = arg0.method2741(class595.field8446, false, var8, var7, (byte) 112, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field2048 = arg0.method2732(var10, var7, false, 0, var7);
            }
            this.field2047 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class563 var44 = arg2[var26];
                int[] var45 = var44.field8000;
                byte[] var46 = var44.field8001;
                byte[] var47 = var44.field8006;
                int var48 = var44.field8005;
                int var49 = var44.field8002;
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
            this.field2048 = arg0.method2732(var25, var7, false, 0, var7);
            this.field2047 = false;
        }
        this.field2048.method842(16327, class275.field3476);
        this.field2050 = arg0.method1203(false, false);
        this.field2050.method169(20480, 20, 1103);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field2050.method167(18829, true);
            if (var28 != null) {
                Stream var29 = this.field2049.method2714(var28, (byte) 5);
                float var30 = this.field2048.method1332((float) var7, 30994) / (float) var7;
                float var31 = this.field2048.method1326(30658, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class563 var33 = arg2[var32];
                    int var34 = var33.field8005;
                    int var35 = var33.field8002;
                    int var36 = var33.field8007;
                    int var37 = var33.field8004;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3440()) {
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
                    } else {
                        var29.method3444((float) var37);
                        var29.method3444((float) var36);
                        var29.method3444(0.0F);
                        var29.method3444(var40);
                        var29.method3444(var41);
                        var29.method3444((float) var37);
                        var29.method3444((float) (var34 + var36));
                        var29.method3444(0.0F);
                        var29.method3444(var40);
                        var29.method3444(var43);
                        var29.method3444((float) (var35 + var37));
                        var29.method3444((float) (var34 + var36));
                        var29.method3444(0.0F);
                        var29.method3444(var42);
                        var29.method3444(var43);
                        var29.method3444((float) (var35 + var37));
                        var29.method3444((float) var36);
                        var29.method3444(0.0F);
                        var29.method3444(var42);
                        var29.method3444(var41);
                    }
                }
                var29.method3434();
                if (this.field2050.method170(9406)) {
                    return;
                }
            }
        }
    }
}
