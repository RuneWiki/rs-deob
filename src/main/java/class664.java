import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class664 extends class393 {

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lum;")
    private class528 field9437;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lfj;")
    private class75 field9438;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
    private boolean field9439;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lega;")
    private class184 field9436;

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lum;Lfo;[Lut;Z)V")
    public class664(class528 arg0, class606 arg1, class616[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field9437 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class616 var59 = arg2[var6];
            if (var59.field8868 > var5) {
                var5 = var59.field8868;
            }
            if (var59.field8869 > var5) {
                var5 = var59.field8869;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class616 var12 = arg2[var9];
                int var13 = var12.field8868;
                int var14 = var12.field8869;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field8875 == null) {
                    byte[] var19 = var12.field8871;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field8875;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method780(class592.field8601, class106.field1573, 61)) {
                this.field9438 = arg0.method3009(var8, (byte) 62, var7, false, class592.field8601, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field9438 = arg0.method3035(var7, var7, (byte) -50, false, var10);
            }
            this.field9439 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class616 var44 = arg2[var26];
                int[] var45 = var44.field8873;
                byte[] var46 = var44.field8875;
                byte[] var47 = var44.field8871;
                int var48 = var44.field8868;
                int var49 = var44.field8869;
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
            this.field9438 = arg0.method3035(var7, var7, (byte) -50, false, var25);
            this.field9439 = false;
        }
        this.field9438.method1215(class81.field1300, 19759);
        this.field9436 = arg0.method806(10, false);
        this.field9436.method1229(20480, 20, 29812);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field9436.method1231(true, 3696);
            if (var28 != null) {
                Stream var29 = this.field9437.method3038(-10641, var28);
                float var30 = this.field9438.method433(-27156, (float) var7) / (float) var7;
                float var31 = this.field9438.method429((float) var7, -101) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class616 var33 = arg2[var32];
                    int var34 = var33.field8868;
                    int var35 = var33.field8869;
                    int var36 = var33.field8874;
                    int var37 = var33.field8870;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2077()) {
                        var29.method2075((float) var37);
                        var29.method2075((float) var36);
                        var29.method2075(0.0F);
                        var29.method2075(var40);
                        var29.method2075(var41);
                        var29.method2075((float) var37);
                        var29.method2075((float) (var34 + var36));
                        var29.method2075(0.0F);
                        var29.method2075(var40);
                        var29.method2075(var43);
                        var29.method2075((float) (var35 + var37));
                        var29.method2075((float) (var34 + var36));
                        var29.method2075(0.0F);
                        var29.method2075(var42);
                        var29.method2075(var43);
                        var29.method2075((float) (var35 + var37));
                        var29.method2075((float) var36);
                        var29.method2075(0.0F);
                        var29.method2075(var42);
                        var29.method2075(var41);
                    } else {
                        var29.method2088((float) var37);
                        var29.method2088((float) var36);
                        var29.method2088(0.0F);
                        var29.method2088(var40);
                        var29.method2088(var41);
                        var29.method2088((float) var37);
                        var29.method2088((float) (var34 + var36));
                        var29.method2088(0.0F);
                        var29.method2088(var40);
                        var29.method2088(var43);
                        var29.method2088((float) (var35 + var37));
                        var29.method2088((float) (var34 + var36));
                        var29.method2088(0.0F);
                        var29.method2088(var42);
                        var29.method2088(var43);
                        var29.method2088((float) (var35 + var37));
                        var29.method2088((float) var36);
                        var29.method2088(0.0F);
                        var29.method2088(var42);
                        var29.method2088(var41);
                    }
                }
                var29.method2084();
                if (this.field9436.method1230(-62)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "OA", descriptor = "(CIIIZ)V")
    public final void method874(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field9437.method3063((byte) -114);
        this.field9437.method3011(-127, this.field9438);
        if (this.field9439 || arg4) {
            this.field9437.method3013(class519.field7276, 102, class492.field6998);
            this.field9437.method3025(class475.field6812, -1, 0);
            this.field9437.method3028(arg3, false);
        } else {
            this.field9437.method3013(class519.field7276, 87, class519.field7276);
        }
        class300 var6 = this.field9437.method3014(-11433);
        var6.method883(arg1, arg2, 0);
        this.field9437.method2989((byte) -18);
        this.field9437.method754(this.field9436, 0, 27910);
        this.field9437.method811(this.field9437.field7788, (byte) -113);
        this.field9437.method778(class223.field2949, 2, (byte) -99, arg0 * 4);
        if (this.field9439 || arg4) {
            this.field9437.method3025(class283.field3777, -1, 0);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method876(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7) {
    }
}
