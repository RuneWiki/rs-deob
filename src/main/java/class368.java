import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class368 extends class216 {

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "Ljj;")
    private class334 field5334;

    @OriginalMember(owner = "client!mea", name = "B", descriptor = "Lcf;")
    private class196 field5335;

    @OriginalMember(owner = "client!mea", name = "A", descriptor = "Z")
    private boolean field5337;

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "Lbl;")
    private class719 field5336;

    @OriginalMember(owner = "client!mea", name = "fa", descriptor = "(CIIIZ)V", line = 3)
    public final void method950(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5334.method2621(88);
        this.field5334.method2668(24, this.field5335);
        if (this.field5337 || arg4) {
            this.field5334.method2624(class256.field3668, (byte) 108, class539.field7920);
            this.field5334.method2655(1, 0, class659.field9335);
            this.field5334.method2658(arg3, -8793);
        } else {
            this.field5334.method2624(class256.field3668, (byte) 125, class256.field3668);
        }
        class639 var6 = this.field5334.method2618(-111);
        var6.method739(arg1, arg2, 0);
        this.field5334.method2671((byte) -118);
        this.field5334.method2088(this.field5336, 0, false);
        this.field5334.method2120(this.field5334.field4836, -1);
        this.field5334.method2103(class36.field443, 2, arg0 * 4, 105);
        if (this.field5337 || arg4) {
            this.field5334.method2655(1, 0, class784.field11325);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(CIIIZLaa;II)V", line = 29)
    public final void method946(char arg0, int arg1, int arg2, int arg3, boolean arg4, class685 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljj;Lcd;[Lcu;Z)V", line = 32)
    public class368(class334 arg0, class161 arg1, class66[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5334 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class66 var59 = arg2[var6];
            if (var59.field977 > var5) {
                var5 = var59.field977;
            }
            if (var59.field981 > var5) {
                var5 = var59.field981;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class66 var12 = arg2[var9];
                int var13 = var12.field977;
                int var14 = var12.field981;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field976 == null) {
                    byte[] var19 = var12.field982;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field976;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method2082(-27964, class496.field7281, class18.field235)) {
                this.field5335 = arg0.method2675(var7, false, var8, class18.field235, (byte) -103, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field5335 = arg0.method2613(var7, 10, false, var10, var7);
            }
            this.field5337 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class66 var44 = arg2[var26];
                int[] var45 = var44.field979;
                byte[] var46 = var44.field976;
                byte[] var47 = var44.field982;
                int var48 = var44.field977;
                int var49 = var44.field981;
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
            this.field5335 = arg0.method2613(var7, 10, false, var25, var7);
            this.field5337 = false;
        }
        this.field5335.method2250(class659.field9336, 18475);
        this.field5336 = arg0.method2117(false, 16);
        this.field5336.method2402(13179, 20480, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field5336.method2401(true, true);
            if (var28 != null) {
                Stream var29 = this.field5334.method2651(var28, 16);
                float var30 = this.field5335.method1702(89, (float) var7) / (float) var7;
                float var31 = this.field5335.method1703(false, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class66 var33 = arg2[var32];
                    int var34 = var33.field977;
                    int var35 = var33.field981;
                    int var36 = var33.field983;
                    int var37 = var33.field984;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3200()) {
                        var29.method3202((float) var37);
                        var29.method3202((float) var36);
                        var29.method3202(0.0F);
                        var29.method3202(var40);
                        var29.method3202(var41);
                        var29.method3202((float) var37);
                        var29.method3202((float) (var34 + var36));
                        var29.method3202(0.0F);
                        var29.method3202(var40);
                        var29.method3202(var43);
                        var29.method3202((float) (var35 + var37));
                        var29.method3202((float) (var34 + var36));
                        var29.method3202(0.0F);
                        var29.method3202(var42);
                        var29.method3202(var43);
                        var29.method3202((float) (var35 + var37));
                        var29.method3202((float) var36);
                        var29.method3202(0.0F);
                        var29.method3202(var42);
                        var29.method3202(var41);
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
                var29.method3199();
                if (this.field5336.method2405(-9200)) {
                    return;
                }
            }
        }
    }
}
