import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class619 extends class442 {

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "Llba;")
    private class223 field8692;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "Lbw;")
    private class28 field8691;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "Z")
    private boolean field8690;

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "Lfw;")
    private class716 field8689;

    @OriginalMember(owner = "client!nca", name = "fa", descriptor = "(CIIIZ)V")
    public final void method1191(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8692.method1379((byte) -102);
        this.field8692.method1492(this.field8691, 2);
        if (this.field8690 || arg4) {
            this.field8692.method1494(class92.field1073, 775, class785.field10763);
            this.field8692.method1409(class41.field423, 0, -122);
            this.field8692.method1468((byte) 67, arg3);
        } else {
            this.field8692.method1494(class92.field1073, 775, class92.field1073);
        }
        class517 var6 = this.field8692.method1466(true);
        var6.method50(arg1, arg2, 0);
        this.field8692.method1428(0);
        this.field8692.method1386((byte) -109, this.field8689, 0);
        this.field8692.method1485(this.field8692.field3400, 32);
        this.field8692.method1403(127, class224.field3417, arg0 * 4, 2);
        if (this.field8690 || arg4) {
            this.field8692.method1409(class157.field2039, 0, -109);
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Llba;Lhw;[Lfm;Z)V")
    public class619(class223 arg0, class300 arg1, class279[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8692 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class279 var59 = arg2[var6];
            if (var59.field4008 > var5) {
                var5 = var59.field4008;
            }
            if (var59.field4014 > var5) {
                var5 = var59.field4014;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class279 var12 = arg2[var9];
                int var13 = var12.field4008;
                int var14 = var12.field4014;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field4009 == null) {
                    byte[] var19 = var12.field4010;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field4009;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1491(class612.field8616, 1, class29.field238)) {
                this.field8691 = arg0.method1407(var7, var7, var8, (byte) 92, false, class29.field238);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8691 = arg0.method1447((byte) -60, var7, var7, false, var10);
            }
            this.field8690 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class279 var44 = arg2[var26];
                int[] var45 = var44.field4012;
                byte[] var46 = var44.field4009;
                byte[] var47 = var44.field4010;
                int var48 = var44.field4008;
                int var49 = var44.field4014;
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
            this.field8691 = arg0.method1447((byte) -60, var7, var7, false, var25);
            this.field8690 = false;
        }
        this.field8691.method280((byte) -95, class22.field199);
        this.field8689 = arg0.method1421(false, true);
        this.field8689.method2277(20480, 20, false);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8689.method2276(true, false);
            if (var28 != null) {
                Stream var29 = this.field8692.method1449(14, var28);
                float var30 = this.field8691.method126((float) var7, 5263) / (float) var7;
                float var31 = this.field8691.method128((float) var7, true) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class279 var33 = arg2[var32];
                    int var34 = var33.field4008;
                    int var35 = var33.field4014;
                    int var36 = var33.field4011;
                    int var37 = var33.field4016;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2346()) {
                        var29.method2340((float) var37);
                        var29.method2340((float) var36);
                        var29.method2340(0.0F);
                        var29.method2340(var40);
                        var29.method2340(var41);
                        var29.method2340((float) var37);
                        var29.method2340((float) (var34 + var36));
                        var29.method2340(0.0F);
                        var29.method2340(var40);
                        var29.method2340(var43);
                        var29.method2340((float) (var35 + var37));
                        var29.method2340((float) (var34 + var36));
                        var29.method2340(0.0F);
                        var29.method2340(var42);
                        var29.method2340(var43);
                        var29.method2340((float) (var35 + var37));
                        var29.method2340((float) var36);
                        var29.method2340(0.0F);
                        var29.method2340(var42);
                        var29.method2340(var41);
                    } else {
                        var29.method2350((float) var37);
                        var29.method2350((float) var36);
                        var29.method2350(0.0F);
                        var29.method2350(var40);
                        var29.method2350(var41);
                        var29.method2350((float) var37);
                        var29.method2350((float) (var34 + var36));
                        var29.method2350(0.0F);
                        var29.method2350(var40);
                        var29.method2350(var43);
                        var29.method2350((float) (var35 + var37));
                        var29.method2350((float) (var34 + var36));
                        var29.method2350(0.0F);
                        var29.method2350(var42);
                        var29.method2350(var43);
                        var29.method2350((float) (var35 + var37));
                        var29.method2350((float) var36);
                        var29.method2350(0.0F);
                        var29.method2350(var42);
                        var29.method2350(var41);
                    }
                }
                var29.method2351();
                if (this.field8689.method2281(-14567)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method1190(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7) {
    }
}
