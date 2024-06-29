import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class515 extends class61 {

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "Luv;")
    private class367 field6960;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "Ljs;")
    private class334 field6959;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "Z")
    private boolean field6957;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "Ltea;")
    private class241 field6958;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method76(char arg0, int arg1, int arg2, int arg3, boolean arg4, class487 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!gq", name = "fa", descriptor = "(CIIIZ)V")
    public final void method74(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6960.method2113(0);
        this.field6960.method2148(this.field6959, -127);
        if (this.field6957 || arg4) {
            this.field6960.method2156(class199.field2365, class365.field4838, 22831);
            this.field6960.method2174(0, -117, class421.field5897);
            this.field6960.method2134(2, arg3);
        } else {
            this.field6960.method2156(class365.field4838, class365.field4838, 22831);
        }
        class648 var6 = this.field6960.method2130((byte) -26);
        var6.method33(arg1, arg2, 0);
        this.field6960.method2103(1);
        this.field6960.method1325(0, true, this.field6958);
        this.field6960.method1330(this.field6960.field5156, (byte) 120);
        this.field6960.method1290(class401.field5677, arg0 * 4, (byte) 98, 2);
        if (this.field6957 || arg4) {
            this.field6960.method2174(0, -104, class71.field769);
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Luv;Lmv;[Ltw;Z)V")
    public class515(class367 arg0, class377 arg1, class204[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6960 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class204 var59 = arg2[var6];
            if (var59.field2419 > var5) {
                var5 = var59.field2419;
            }
            if (var59.field2421 > var5) {
                var5 = var59.field2421;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class204 var12 = arg2[var9];
                int var13 = var12.field2419;
                int var14 = var12.field2421;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field2422 == null) {
                    byte[] var19 = var12.field2416;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field2422;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1315(0, class695.field9710, class594.field8277)) {
                this.field6959 = arg0.method2176(var7, class695.field9710, (byte) 87, var8, false, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field6959 = arg0.method2150(var7, var7, (byte) 31, var10, false);
            }
            this.field6957 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class204 var44 = arg2[var26];
                int[] var45 = var44.field2417;
                byte[] var46 = var44.field2422;
                byte[] var47 = var44.field2416;
                int var48 = var44.field2419;
                int var49 = var44.field2421;
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
            this.field6959 = arg0.method2150(var7, var7, (byte) 31, var25, false);
            this.field6957 = false;
        }
        this.field6959.method272((byte) -81, class163.field2049);
        this.field6958 = arg0.method1292(false, 66);
        this.field6958.method1450(-20279, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field6958.method1451(true, (byte) 27);
            if (var28 != null) {
                Stream var29 = this.field6960.method2170(24022, var28);
                float var30 = this.field6959.method1692((byte) -63, (float) var7) / (float) var7;
                float var31 = this.field6959.method1688(-8473, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class204 var33 = arg2[var32];
                    int var34 = var33.field2419;
                    int var35 = var33.field2421;
                    int var36 = var33.field2420;
                    int var37 = var33.field2424;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3786()) {
                        var29.method3784((float) var37);
                        var29.method3784((float) var36);
                        var29.method3784(0.0F);
                        var29.method3784(var40);
                        var29.method3784(var41);
                        var29.method3784((float) var37);
                        var29.method3784((float) (var34 + var36));
                        var29.method3784(0.0F);
                        var29.method3784(var40);
                        var29.method3784(var43);
                        var29.method3784((float) (var35 + var37));
                        var29.method3784((float) (var34 + var36));
                        var29.method3784(0.0F);
                        var29.method3784(var42);
                        var29.method3784(var43);
                        var29.method3784((float) (var35 + var37));
                        var29.method3784((float) var36);
                        var29.method3784(0.0F);
                        var29.method3784(var42);
                        var29.method3784(var41);
                    } else {
                        var29.method3781((float) var37);
                        var29.method3781((float) var36);
                        var29.method3781(0.0F);
                        var29.method3781(var40);
                        var29.method3781(var41);
                        var29.method3781((float) var37);
                        var29.method3781((float) (var34 + var36));
                        var29.method3781(0.0F);
                        var29.method3781(var40);
                        var29.method3781(var43);
                        var29.method3781((float) (var35 + var37));
                        var29.method3781((float) (var34 + var36));
                        var29.method3781(0.0F);
                        var29.method3781(var42);
                        var29.method3781(var43);
                        var29.method3781((float) (var35 + var37));
                        var29.method3781((float) var36);
                        var29.method3781(0.0F);
                        var29.method3781(var42);
                        var29.method3781(var41);
                    }
                }
                var29.method3795();
                if (this.field6958.method1448(13623)) {
                    return;
                }
            }
        }
    }
}
