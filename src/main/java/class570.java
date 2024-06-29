import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class570 extends class60 {

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "Lrv;")
    private class111 field7494;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "Ltr;")
    private class297 field7493;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "Z")
    private boolean field7495;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "Lam;")
    private class633 field7496;

    @OriginalMember(owner = "client!hj", name = "fa", descriptor = "(CIIIZ)V", line = 4)
    public final void method118(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7494.method884(1);
        this.field7494.method823(this.field7493, -8423);
        if (this.field7495 || arg4) {
            this.field7494.method849((byte) 93, class312.field4469, class99.field1265);
            this.field7494.method840(0, -116, class362.field5101);
            this.field7494.method870(arg3, false);
        } else {
            this.field7494.method849((byte) 98, class99.field1265, class99.field1265);
        }
        class615 var6 = this.field7494.method846(-24720);
        var6.method1727(arg1, arg2, 0);
        this.field7494.method842(55);
        this.field7494.method825(0, 8, this.field7496);
        this.field7494.method898(this.field7494.field1840, (byte) -15);
        this.field7494.method828(class76.field922, 2, arg0 * 4, 0);
        if (this.field7495 || arg4) {
            this.field7494.method840(0, -101, class454.field6199);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lrv;Lrc;[Ljn;Z)V", line = 30)
    public class570(class111 arg0, class539 arg1, class720[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7494 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class720 var59 = arg2[var6];
            if (var59.field10029 > var5) {
                var5 = var59.field10029;
            }
            if (var59.field10028 > var5) {
                var5 = var59.field10028;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class720 var12 = arg2[var9];
                int var13 = var12.field10029;
                int var14 = var12.field10028;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field10030 == null) {
                    byte[] var19 = var12.field10023;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field10030;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method827(-3119, class408.field5668, class155.field2358)) {
                this.field7493 = arg0.method866(var8, 0, var7, class155.field2358, var7, false);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field7493 = arg0.method927(var7, var10, (byte) -64, false, var7);
            }
            this.field7495 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class720 var44 = arg2[var26];
                int[] var45 = var44.field10027;
                byte[] var46 = var44.field10030;
                byte[] var47 = var44.field10023;
                int var48 = var44.field10029;
                int var49 = var44.field10028;
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
            this.field7493 = arg0.method927(var7, var25, (byte) -51, false, var7);
            this.field7495 = false;
        }
        this.field7493.method340(-9495, class94.field1141);
        this.field7496 = arg0.method904(71, false);
        this.field7496.method2603(20, -30987, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field7496.method2599(-4448, true);
            if (var28 != null) {
                Stream var29 = this.field7494.method820((byte) -20, var28);
                float var30 = this.field7493.method591(-2092, (float) var7) / (float) var7;
                float var31 = this.field7493.method597((float) var7, -71) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class720 var33 = arg2[var32];
                    int var34 = var33.field10029;
                    int var35 = var33.field10028;
                    int var36 = var33.field10031;
                    int var37 = var33.field10024;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3739()) {
                        var29.method3733((float) var37);
                        var29.method3733((float) var36);
                        var29.method3733(0.0F);
                        var29.method3733(var40);
                        var29.method3733(var41);
                        var29.method3733((float) var37);
                        var29.method3733((float) (var34 + var36));
                        var29.method3733(0.0F);
                        var29.method3733(var40);
                        var29.method3733(var43);
                        var29.method3733((float) (var35 + var37));
                        var29.method3733((float) (var34 + var36));
                        var29.method3733(0.0F);
                        var29.method3733(var42);
                        var29.method3733(var43);
                        var29.method3733((float) (var35 + var37));
                        var29.method3733((float) var36);
                        var29.method3733(0.0F);
                        var29.method3733(var42);
                        var29.method3733(var41);
                    } else {
                        var29.method3741((float) var37);
                        var29.method3741((float) var36);
                        var29.method3741(0.0F);
                        var29.method3741(var40);
                        var29.method3741(var41);
                        var29.method3741((float) var37);
                        var29.method3741((float) (var34 + var36));
                        var29.method3741(0.0F);
                        var29.method3741(var40);
                        var29.method3741(var43);
                        var29.method3741((float) (var35 + var37));
                        var29.method3741((float) (var34 + var36));
                        var29.method3741(0.0F);
                        var29.method3741(var42);
                        var29.method3741(var43);
                        var29.method3741((float) (var35 + var37));
                        var29.method3741((float) var36);
                        var29.method3741(0.0F);
                        var29.method3741(var42);
                        var29.method3741(var41);
                    }
                }
                var29.method3734();
                if (this.field7496.method2601(-13472)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(CIIIZLaa;II)V", line = 333)
    public final void method115(char arg0, int arg1, int arg2, int arg3, boolean arg4, class490 arg5, int arg6, int arg7) {
    }
}
