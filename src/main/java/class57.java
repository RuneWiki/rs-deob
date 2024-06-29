import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class57 extends class413 {

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "Lmj;")
    private class344 field572;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "Lpm;")
    private class134 field573;

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "Z")
    private boolean field571;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "Lsu;")
    private class155 field574;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(CIIIZLua;II)V", line = 4)
    public final void method299(char arg0, int arg1, int arg2, int arg3, boolean arg4, class598 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!rq", name = "OA", descriptor = "(CIIIZ)V", line = 10)
    public final void method300(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field572.method1978((byte) 97);
        this.field572.method1997(127, this.field573);
        if (this.field571 || arg4) {
            this.field572.method1994(-30, class250.field3133, class428.field6081);
            this.field572.method2012((byte) -93, 0, class107.field1154);
            this.field572.method1988(arg3, 4);
        } else {
            this.field572.method1994(-30, class428.field6081, class428.field6081);
        }
        class537 var6 = this.field572.method2014(390);
        var6.method23(arg1, arg2, 0);
        this.field572.method2033((byte) 101);
        this.field572.method1281(this.field574, 0, 107);
        this.field572.method1285(true, this.field572.field4635);
        this.field572.method1291(class25.field218, arg0 * 4, true, 2);
        if (this.field571 || arg4) {
            this.field572.method2012((byte) -88, 0, class304.field3769);
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lmj;Lho;[Lqo;Z)V", line = 33)
    public class57(class344 arg0, class463 arg1, class550[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field572 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class550 var59 = arg2[var6];
            if (var59.field7872 > var5) {
                var5 = var59.field7872;
            }
            if (var59.field7873 > var5) {
                var5 = var59.field7873;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class550 var12 = arg2[var9];
                int var13 = var12.field7872;
                int var14 = var12.field7873;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field7868 == null) {
                    byte[] var19 = var12.field7869;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field7868;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1334(1, class179.field2008, class274.field3431)) {
                this.field573 = arg0.method2046(var7, var8, (byte) 124, var7, class274.field3431, false);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field573 = arg0.method1983(false, (byte) 106, var7, var7, var10);
            }
            this.field571 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class550 var44 = arg2[var26];
                int[] var45 = var44.field7871;
                byte[] var46 = var44.field7868;
                byte[] var47 = var44.field7869;
                int var48 = var44.field7872;
                int var49 = var44.field7873;
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
            this.field573 = arg0.method1983(false, (byte) 112, var7, var7, var25);
            this.field571 = false;
        }
        this.field573.method2077(class401.field5388, (byte) 93);
        this.field574 = arg0.method1283(false, -1);
        this.field574.method353(20480, 20, (byte) 108);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field574.method354(true, true);
            if (var28 != null) {
                Stream var29 = this.field572.method1980((byte) -74, var28);
                float var30 = this.field573.method756((float) var7, 5044) / (float) var7;
                float var31 = this.field573.method758((float) var7, false) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class550 var33 = arg2[var32];
                    int var34 = var33.field7872;
                    int var35 = var33.field7873;
                    int var36 = var33.field7867;
                    int var37 = var33.field7870;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3480()) {
                        var29.method3469((float) var37);
                        var29.method3469((float) var36);
                        var29.method3469(0.0F);
                        var29.method3469(var40);
                        var29.method3469(var41);
                        var29.method3469((float) var37);
                        var29.method3469((float) (var34 + var36));
                        var29.method3469(0.0F);
                        var29.method3469(var40);
                        var29.method3469(var43);
                        var29.method3469((float) (var35 + var37));
                        var29.method3469((float) (var34 + var36));
                        var29.method3469(0.0F);
                        var29.method3469(var42);
                        var29.method3469(var43);
                        var29.method3469((float) (var35 + var37));
                        var29.method3469((float) var36);
                        var29.method3469(0.0F);
                        var29.method3469(var42);
                        var29.method3469(var41);
                    } else {
                        var29.method3475((float) var37);
                        var29.method3475((float) var36);
                        var29.method3475(0.0F);
                        var29.method3475(var40);
                        var29.method3475(var41);
                        var29.method3475((float) var37);
                        var29.method3475((float) (var34 + var36));
                        var29.method3475(0.0F);
                        var29.method3475(var40);
                        var29.method3475(var43);
                        var29.method3475((float) (var35 + var37));
                        var29.method3475((float) (var34 + var36));
                        var29.method3475(0.0F);
                        var29.method3475(var42);
                        var29.method3475(var43);
                        var29.method3475((float) (var35 + var37));
                        var29.method3475((float) var36);
                        var29.method3475(0.0F);
                        var29.method3475(var42);
                        var29.method3475(var41);
                    }
                }
                var29.method3472();
                if (this.field574.method357(-28830)) {
                    return;
                }
            }
        }
    }
}
