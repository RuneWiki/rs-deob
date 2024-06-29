import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class572 extends class400 {

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "Lpga;")
    private class492 field8088;

    @OriginalMember(owner = "client!kia", name = "x", descriptor = "Loia;")
    private class51 field8086;

    @OriginalMember(owner = "client!kia", name = "B", descriptor = "Z")
    private boolean field8089;

    @OriginalMember(owner = "client!kia", name = "y", descriptor = "Llk;")
    private class251 field8087;

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lpga;Loq;[Ltba;Z)V")
    public class572(class492 arg0, class742 arg1, class320[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8088 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class320 var59 = arg2[var6];
            if (var59.field4121 > var5) {
                var5 = var59.field4121;
            }
            if (var59.field4122 > var5) {
                var5 = var59.field4122;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class320 var12 = arg2[var9];
                int var13 = var12.field4121;
                int var14 = var12.field4122;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field4124 == null) {
                    byte[] var19 = var12.field4125;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field4124;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method616(class197.field2845, class720.field10164, (byte) 93)) {
                this.field8086 = arg0.method2883(false, var7, var7, (byte) -65, var8, class197.field2845);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8086 = arg0.method2936(false, var7, var7, var10, (byte) 103);
            }
            this.field8089 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class320 var44 = arg2[var26];
                int[] var45 = var44.field4128;
                byte[] var46 = var44.field4124;
                byte[] var47 = var44.field4125;
                int var48 = var44.field4121;
                int var49 = var44.field4122;
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
            this.field8086 = arg0.method2936(false, var7, var7, var25, (byte) 103);
            this.field8089 = false;
        }
        this.field8086.method521((byte) -99, class482.field6532);
        this.field8087 = arg0.method638((byte) -102, false);
        this.field8087.method1591(-17230, 20480, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8087.method1590((byte) 64, true);
            if (var28 != null) {
                Stream var29 = this.field8088.method2917(var28, false);
                float var30 = this.field8086.method353((byte) 119, (float) var7) / (float) var7;
                float var31 = this.field8086.method354(-23477, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class320 var33 = arg2[var32];
                    int var34 = var33.field4121;
                    int var35 = var33.field4122;
                    int var36 = var33.field4123;
                    int var37 = var33.field4127;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2541()) {
                        var29.method2552((float) var37);
                        var29.method2552((float) var36);
                        var29.method2552(0.0F);
                        var29.method2552(var40);
                        var29.method2552(var41);
                        var29.method2552((float) var37);
                        var29.method2552((float) (var34 + var36));
                        var29.method2552(0.0F);
                        var29.method2552(var40);
                        var29.method2552(var43);
                        var29.method2552((float) (var35 + var37));
                        var29.method2552((float) (var34 + var36));
                        var29.method2552(0.0F);
                        var29.method2552(var42);
                        var29.method2552(var43);
                        var29.method2552((float) (var35 + var37));
                        var29.method2552((float) var36);
                        var29.method2552(0.0F);
                        var29.method2552(var42);
                        var29.method2552(var41);
                    } else {
                        var29.method2550((float) var37);
                        var29.method2550((float) var36);
                        var29.method2550(0.0F);
                        var29.method2550(var40);
                        var29.method2550(var41);
                        var29.method2550((float) var37);
                        var29.method2550((float) (var34 + var36));
                        var29.method2550(0.0F);
                        var29.method2550(var40);
                        var29.method2550(var43);
                        var29.method2550((float) (var35 + var37));
                        var29.method2550((float) (var34 + var36));
                        var29.method2550(0.0F);
                        var29.method2550(var42);
                        var29.method2550(var43);
                        var29.method2550((float) (var35 + var37));
                        var29.method2550((float) var36);
                        var29.method2550(0.0F);
                        var29.method2550(var42);
                        var29.method2550(var41);
                    }
                }
                var29.method2551();
                if (this.field8087.method1592(-14952)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "fa", descriptor = "(CIIIZ)V")
    public final void method296(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8088.method2875(-2);
        this.field8088.method2933((byte) 116, this.field8086);
        if (this.field8089 || arg4) {
            this.field8088.method2878(class369.field4717, 28768, class253.field3501);
            this.field8088.method2946(0, class123.field1675, (byte) 127);
            this.field8088.method2912((byte) 9, arg3);
        } else {
            this.field8088.method2878(class253.field3501, 28768, class253.field3501);
        }
        class173 var6 = this.field8088.method2891(-100);
        var6.method848(arg1, arg2, 0);
        this.field8088.method2901((byte) 53);
        this.field8088.method564(0, this.field8087, false);
        this.field8088.method565(false, this.field8088.field6925);
        this.field8088.method580(arg0 * 4, 2, 96, class54.field758);
        if (this.field8089 || arg4) {
            this.field8088.method2946(0, class186.field2725, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4, class571 arg5, int arg6, int arg7) {
    }
}
