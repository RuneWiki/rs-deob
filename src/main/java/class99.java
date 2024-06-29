import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class99 extends class66 {

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "Lpj;")
    private class156 field1121;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "Loga;")
    private class498 field1120;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "Z")
    private boolean field1118;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "Lhl;")
    private class553 field1119;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(CIIIZLaa;II)V", line = 3)
    public final void method215(char arg0, int arg1, int arg2, int arg3, boolean arg4, class511 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lpj;Lie;[Lus;Z)V", line = 6)
    public class99(class156 arg0, class6 arg1, class1[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1121 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class1 var59 = arg2[var6];
            if (var59.field7 > var5) {
                var5 = var59.field7;
            }
            if (var59.field4 > var5) {
                var5 = var59.field4;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class1 var12 = arg2[var9];
                int var13 = var12.field7;
                int var14 = var12.field4;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field2 == null) {
                    byte[] var19 = var12.field3;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field2;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1198(13554, class88.field993, class34.field457)) {
                this.field1120 = arg0.method1141(var7, var7, var8, false, false, class88.field993);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field1120 = arg0.method1093((byte) 112, false, var7, var10, var7);
            }
            this.field1118 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class1 var44 = arg2[var26];
                int[] var45 = var44.field6;
                byte[] var46 = var44.field2;
                byte[] var47 = var44.field3;
                int var48 = var44.field7;
                int var49 = var44.field4;
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
            this.field1120 = arg0.method1093((byte) 112, false, var7, var25, var7);
            this.field1118 = false;
        }
        this.field1120.method2563(-1764, class439.field5927);
        this.field1119 = arg0.method1074((byte) 46, false);
        this.field1119.method679(20480, 20, true);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field1119.method676((byte) 98, true);
            if (var28 != null) {
                Stream var29 = this.field1121.method1190(0, var28);
                float var30 = this.field1120.method2024((float) var7, -23091) / (float) var7;
                float var31 = this.field1120.method2022((float) var7, 16678) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class1 var33 = arg2[var32];
                    int var34 = var33.field7;
                    int var35 = var33.field4;
                    int var36 = var33.field5;
                    int var37 = var33.field1;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3953()) {
                        var29.method3952((float) var37);
                        var29.method3952((float) var36);
                        var29.method3952(0.0F);
                        var29.method3952(var40);
                        var29.method3952(var41);
                        var29.method3952((float) var37);
                        var29.method3952((float) (var34 + var36));
                        var29.method3952(0.0F);
                        var29.method3952(var40);
                        var29.method3952(var43);
                        var29.method3952((float) (var35 + var37));
                        var29.method3952((float) (var34 + var36));
                        var29.method3952(0.0F);
                        var29.method3952(var42);
                        var29.method3952(var43);
                        var29.method3952((float) (var35 + var37));
                        var29.method3952((float) var36);
                        var29.method3952(0.0F);
                        var29.method3952(var42);
                        var29.method3952(var41);
                    } else {
                        var29.method3949((float) var37);
                        var29.method3949((float) var36);
                        var29.method3949(0.0F);
                        var29.method3949(var40);
                        var29.method3949(var41);
                        var29.method3949((float) var37);
                        var29.method3949((float) (var34 + var36));
                        var29.method3949(0.0F);
                        var29.method3949(var40);
                        var29.method3949(var43);
                        var29.method3949((float) (var35 + var37));
                        var29.method3949((float) (var34 + var36));
                        var29.method3949(0.0F);
                        var29.method3949(var42);
                        var29.method3949(var43);
                        var29.method3949((float) (var35 + var37));
                        var29.method3949((float) var36);
                        var29.method3949(0.0F);
                        var29.method3949(var42);
                        var29.method3949(var41);
                    }
                }
                var29.method3945();
                if (this.field1119.method678(14234)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "fa", descriptor = "(CIIIZ)V", line = 313)
    public final void method214(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1121.method1115(4);
        this.field1121.method1118(0, this.field1120);
        if (this.field1118 || arg4) {
            this.field1121.method1080(class776.field10666, class463.field6532, -30);
            this.field1121.method1180(0, (byte) 91, class683.field9465);
            this.field1121.method1159((byte) -72, arg3);
        } else {
            this.field1121.method1080(class776.field10666, class776.field10666, -30);
        }
        class385 var6 = this.field1121.method1117((byte) 111);
        var6.method1869(arg1, arg2, 0);
        this.field1121.method1147(true);
        this.field1121.method1178(0, (byte) 96, this.field1119);
        this.field1121.method1111((byte) 116, this.field1121.field2514);
        this.field1121.method1183(true, arg0 * 4, class744.field10310, 2);
        if (this.field1118 || arg4) {
            this.field1121.method1180(0, (byte) 91, class605.field8453);
        }
    }
}
