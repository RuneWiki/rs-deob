import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class628 extends class67 {

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Lwg;")
    private class449 field8591;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lada;")
    private class175 field8590;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Z")
    private boolean field8592;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Loda;")
    private class129 field8593;

    @OriginalMember(owner = "client!re", name = "fa", descriptor = "(CIIIZ)V")
    public final void method226(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8591.method2648(31145);
        this.field8591.method2643(-2, this.field8590);
        if (this.field8592 || arg4) {
            this.field8591.method2716(class269.field3180, 103, class75.field1039);
            this.field8591.method2694((byte) -49, 0, class555.field7718);
            this.field8591.method2673(arg3, -97);
        } else {
            this.field8591.method2716(class75.field1039, 74, class75.field1039);
        }
        class256 var6 = this.field8591.method2652(-17);
        var6.method130(arg1, arg2, 0);
        this.field8591.method2688(0);
        this.field8591.method64(0, this.field8593, 0);
        this.field8591.method85((byte) 96, this.field8591.field6329);
        this.field8591.method19((byte) 84, class657.field9051, arg0 * 4, 2);
        if (this.field8592 || arg4) {
            this.field8591.method2694((byte) -49, 0, class507.field7214);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method225(char arg0, int arg1, int arg2, int arg3, boolean arg4, class513 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lwg;Lbq;[Lcr;Z)V")
    public class628(class449 arg0, class307 arg1, class600[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8591 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class600 var59 = arg2[var6];
            if (var59.field8116 > var5) {
                var5 = var59.field8116;
            }
            if (var59.field8123 > var5) {
                var5 = var59.field8123;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class600 var12 = arg2[var9];
                int var13 = var12.field8116;
                int var14 = var12.field8123;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field8119 == null) {
                    byte[] var19 = var12.field8122;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field8119;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method42(class748.field10384, class205.field2451, -121)) {
                this.field8590 = arg0.method2653(var7, -127, false, var8, class205.field2451, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8590 = arg0.method2712(false, var7, var7, 0, var10);
            }
            this.field8592 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class600 var44 = arg2[var26];
                int[] var45 = var44.field8120;
                byte[] var46 = var44.field8119;
                byte[] var47 = var44.field8122;
                int var48 = var44.field8116;
                int var49 = var44.field8123;
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
            this.field8590 = arg0.method2712(false, var7, var7, 0, var25);
            this.field8592 = false;
        }
        this.field8590.method1439(class450.field6370, -41);
        this.field8593 = arg0.method57(14, false);
        this.field8593.method273(20480, (byte) 125, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8593.method271(true, (byte) 78);
            if (var28 != null) {
                Stream var29 = this.field8591.method2650((byte) -104, var28);
                float var30 = this.field8590.method1196(-23865, (float) var7) / (float) var7;
                float var31 = this.field8590.method1200((byte) 72, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class600 var33 = arg2[var32];
                    int var34 = var33.field8116;
                    int var35 = var33.field8123;
                    int var36 = var33.field8124;
                    int var37 = var33.field8118;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3985()) {
                        var29.method3979((float) var37);
                        var29.method3979((float) var36);
                        var29.method3979(0.0F);
                        var29.method3979(var40);
                        var29.method3979(var41);
                        var29.method3979((float) var37);
                        var29.method3979((float) (var34 + var36));
                        var29.method3979(0.0F);
                        var29.method3979(var40);
                        var29.method3979(var43);
                        var29.method3979((float) (var35 + var37));
                        var29.method3979((float) (var34 + var36));
                        var29.method3979(0.0F);
                        var29.method3979(var42);
                        var29.method3979(var43);
                        var29.method3979((float) (var35 + var37));
                        var29.method3979((float) var36);
                        var29.method3979(0.0F);
                        var29.method3979(var42);
                        var29.method3979(var41);
                    } else {
                        var29.method3981((float) var37);
                        var29.method3981((float) var36);
                        var29.method3981(0.0F);
                        var29.method3981(var40);
                        var29.method3981(var41);
                        var29.method3981((float) var37);
                        var29.method3981((float) (var34 + var36));
                        var29.method3981(0.0F);
                        var29.method3981(var40);
                        var29.method3981(var43);
                        var29.method3981((float) (var35 + var37));
                        var29.method3981((float) (var34 + var36));
                        var29.method3981(0.0F);
                        var29.method3981(var42);
                        var29.method3981(var43);
                        var29.method3981((float) (var35 + var37));
                        var29.method3981((float) var36);
                        var29.method3981(0.0F);
                        var29.method3981(var42);
                        var29.method3981(var41);
                    }
                }
                var29.method3992();
                if (this.field8593.method275(22022)) {
                    return;
                }
            }
        }
    }
}
