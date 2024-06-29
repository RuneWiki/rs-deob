import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class585 extends class66 {

    @OriginalMember(owner = "client!po", name = "y", descriptor = "Lai;")
    private class626 field7800;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "Lec;")
    private class248 field7802;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "Z")
    private boolean field7801;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "Lid;")
    private class612 field7803;

    @OriginalMember(owner = "client!po", name = "fa", descriptor = "(CIIIZ)V", line = 5)
    public final void method153(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7800.method3490(1);
        this.field7800.method3520(true, this.field7802);
        if (this.field7801 || arg4) {
            this.field7800.method3513(class364.field5299, class521.field7150, 109);
            this.field7800.method3514((byte) 108, class109.field1493, 0);
            this.field7800.method3525(arg3, 1);
        } else {
            this.field7800.method3513(class521.field7150, class521.field7150, -122);
        }
        class754 var6 = this.field7800.method3482((byte) 88);
        var6.method981(arg1, arg2, 0);
        this.field7800.method3508(11570);
        this.field7800.method883(this.field7803, 0, 76);
        this.field7800.method913(this.field7800.field8749, (byte) -63);
        this.field7800.method855(class432.field6127, 2, arg0 * 4, (byte) 92);
        if (this.field7801 || arg4) {
            this.field7800.method3514((byte) 108, class122.field1782, 0);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(CIIIZLaa;II)V", line = 29)
    public final void method154(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lai;Leia;[Leu;Z)V", line = 33)
    public class585(class626 arg0, class255 arg1, class508[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7800 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class508 var59 = arg2[var6];
            if (var59.field7014 > var5) {
                var5 = var59.field7014;
            }
            if (var59.field7017 > var5) {
                var5 = var59.field7017;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class508 var12 = arg2[var9];
                int var13 = var12.field7014;
                int var14 = var12.field7017;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field7019 == null) {
                    byte[] var19 = var12.field7018;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field7019;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method863(class250.field3704, -2, class258.field3847)) {
                this.field7802 = arg0.method3462(var8, var7, var7, (byte) -62, false, class250.field3704);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field7802 = arg0.method3517((byte) -114, var7, var7, false, var10);
            }
            this.field7801 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class508 var44 = arg2[var26];
                int[] var45 = var44.field7013;
                byte[] var46 = var44.field7019;
                byte[] var47 = var44.field7018;
                int var48 = var44.field7014;
                int var49 = var44.field7017;
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
            this.field7802 = arg0.method3517((byte) -107, var7, var7, false, var25);
            this.field7801 = false;
        }
        this.field7802.method1003(-114, class179.field2385);
        this.field7803 = arg0.method902(0, false);
        this.field7803.method2642(20480, 20, -10760);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field7803.method2646(true, true);
            if (var28 != null) {
                Stream var29 = this.field7800.method3445(9, var28);
                float var30 = this.field7802.method1666(-18982, (float) var7) / (float) var7;
                float var31 = this.field7802.method1670(-51, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class508 var33 = arg2[var32];
                    int var34 = var33.field7014;
                    int var35 = var33.field7017;
                    int var36 = var33.field7016;
                    int var37 = var33.field7020;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3926()) {
                        var29.method3930((float) var37);
                        var29.method3930((float) var36);
                        var29.method3930(0.0F);
                        var29.method3930(var40);
                        var29.method3930(var41);
                        var29.method3930((float) var37);
                        var29.method3930((float) (var34 + var36));
                        var29.method3930(0.0F);
                        var29.method3930(var40);
                        var29.method3930(var43);
                        var29.method3930((float) (var35 + var37));
                        var29.method3930((float) (var34 + var36));
                        var29.method3930(0.0F);
                        var29.method3930(var42);
                        var29.method3930(var43);
                        var29.method3930((float) (var35 + var37));
                        var29.method3930((float) var36);
                        var29.method3930(0.0F);
                        var29.method3930(var42);
                        var29.method3930(var41);
                    } else {
                        var29.method3929((float) var37);
                        var29.method3929((float) var36);
                        var29.method3929(0.0F);
                        var29.method3929(var40);
                        var29.method3929(var41);
                        var29.method3929((float) var37);
                        var29.method3929((float) (var34 + var36));
                        var29.method3929(0.0F);
                        var29.method3929(var40);
                        var29.method3929(var43);
                        var29.method3929((float) (var35 + var37));
                        var29.method3929((float) (var34 + var36));
                        var29.method3929(0.0F);
                        var29.method3929(var42);
                        var29.method3929(var43);
                        var29.method3929((float) (var35 + var37));
                        var29.method3929((float) var36);
                        var29.method3929(0.0F);
                        var29.method3929(var42);
                        var29.method3929(var41);
                    }
                }
                var29.method3922();
                if (this.field7803.method2640(10925)) {
                    return;
                }
            }
        }
    }
}
