import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class101 extends class201 {

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "Lkea;")
    private class223 field1297;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Lem;")
    private class212 field1295;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Z")
    private boolean field1294;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Lii;")
    private class519 field1296;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(CIIIZLfa;II)V", line = 3)
    public final void method55(char arg0, int arg1, int arg2, int arg3, boolean arg4, class219 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "(CIIIZ)V", line = 10)
    public final void method53(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1297.method1283((byte) -28);
        this.field1297.method1349(this.field1295, false);
        if (this.field1294 || arg4) {
            this.field1297.method1287(class607.field8276, (byte) 57, class291.field3672);
            this.field1297.method1274((byte) 82, class666.field9048, 0);
            this.field1297.method1341((byte) -125, arg3);
        } else {
            this.field1297.method1287(class291.field3672, (byte) 57, class291.field3672);
        }
        class581 var6 = this.field1297.method1329(1);
        var6.method591(arg1, arg2, 0);
        this.field1297.method1348(71);
        this.field1297.method363(-104, 0, this.field1296);
        this.field1297.method344(28303, this.field1297.field2900);
        this.field1297.method328(1, class572.field7310, 2, arg0 * 4);
        if (this.field1294 || arg4) {
            this.field1297.method1274((byte) 101, class290.field3662, 0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lkea;Lub;[Liba;Z)V", line = 33)
    public class101(class223 arg0, class20 arg1, class495[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1297 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class495 var59 = arg2[var6];
            if (var59.field6195 > var5) {
                var5 = var59.field6195;
            }
            if (var59.field6193 > var5) {
                var5 = var59.field6193;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class495 var12 = arg2[var9];
                int var13 = var12.field6195;
                int var14 = var12.field6193;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field6189 == null) {
                    byte[] var19 = var12.field6191;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field6189;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method357(-22567, class100.field1288, class190.field2256)) {
                this.field1295 = arg0.method1286(var7, var8, (byte) 98, false, class190.field2256, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field1295 = arg0.method1295((byte) -102, var7, var10, var7, false);
            }
            this.field1294 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class495 var44 = arg2[var26];
                int[] var45 = var44.field6187;
                byte[] var46 = var44.field6189;
                byte[] var47 = var44.field6191;
                int var48 = var44.field6195;
                int var49 = var44.field6193;
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
            this.field1295 = arg0.method1295((byte) -109, var7, var25, var7, false);
            this.field1294 = false;
        }
        this.field1295.method43(-29198, class681.field9273);
        this.field1296 = arg0.method341(122, false);
        this.field1296.method2814(20, (byte) -99, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field1296.method62(true, true);
            if (var28 != null) {
                Stream var29 = this.field1297.method1289(123, var28);
                float var30 = this.field1295.method42((byte) 126, (float) var7) / (float) var7;
                float var31 = this.field1295.method39((float) var7, -125) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class495 var33 = arg2[var32];
                    int var34 = var33.field6195;
                    int var35 = var33.field6193;
                    int var36 = var33.field6192;
                    int var37 = var33.field6190;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3525()) {
                        var29.method3517((float) var37);
                        var29.method3517((float) var36);
                        var29.method3517(0.0F);
                        var29.method3517(var40);
                        var29.method3517(var41);
                        var29.method3517((float) var37);
                        var29.method3517((float) (var34 + var36));
                        var29.method3517(0.0F);
                        var29.method3517(var40);
                        var29.method3517(var43);
                        var29.method3517((float) (var35 + var37));
                        var29.method3517((float) (var34 + var36));
                        var29.method3517(0.0F);
                        var29.method3517(var42);
                        var29.method3517(var43);
                        var29.method3517((float) (var35 + var37));
                        var29.method3517((float) var36);
                        var29.method3517(0.0F);
                        var29.method3517(var42);
                        var29.method3517(var41);
                    } else {
                        var29.method3527((float) var37);
                        var29.method3527((float) var36);
                        var29.method3527(0.0F);
                        var29.method3527(var40);
                        var29.method3527(var41);
                        var29.method3527((float) var37);
                        var29.method3527((float) (var34 + var36));
                        var29.method3527(0.0F);
                        var29.method3527(var40);
                        var29.method3527(var43);
                        var29.method3527((float) (var35 + var37));
                        var29.method3527((float) (var34 + var36));
                        var29.method3527(0.0F);
                        var29.method3527(var42);
                        var29.method3527(var43);
                        var29.method3527((float) (var35 + var37));
                        var29.method3527((float) var36);
                        var29.method3527(0.0F);
                        var29.method3527(var42);
                        var29.method3527(var41);
                    }
                }
                var29.method3530();
                if (this.field1296.method61((byte) 96)) {
                    return;
                }
            }
        }
    }
}
