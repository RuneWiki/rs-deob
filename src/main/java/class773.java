import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class773 extends class67 {

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lwk;")
    private class151 field10660;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lkt;")
    private class166 field10659;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Z")
    private boolean field10662;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lfka;")
    private class741 field10661;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method30(char arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!qc", name = "fa", descriptor = "(CIIIZ)V")
    public final void method31(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field10660.method1084((byte) 104);
        this.field10660.method1104(true, this.field10659);
        if (this.field10662 || arg4) {
            this.field10660.method1136((byte) -102, class438.field6278, class174.field2460);
            this.field10660.method1056(32, class490.field6966, 0);
            this.field10660.method1059(true, arg3);
        } else {
            this.field10660.method1136((byte) -123, class438.field6278, class438.field6278);
        }
        class468 var6 = this.field10660.method1115((byte) -99);
        var6.method1959(arg1, arg2, 0);
        this.field10660.method1122((byte) -79);
        this.field10660.method1091((byte) 114, 0, this.field10661);
        this.field10660.method1099(103, this.field10660.field2229);
        this.field10660.method1147(1, class375.field5405, 2, arg0 * 4);
        if (this.field10662 || arg4) {
            this.field10660.method1056(32, class412.field5814, 0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lwk;Lkf;[Lre;Z)V")
    public class773(class151 arg0, class263 arg1, class625[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field10660 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class625 var59 = arg2[var6];
            if (var59.field8822 > var5) {
                var5 = var59.field8822;
            }
            if (var59.field8827 > var5) {
                var5 = var59.field8827;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class625 var12 = arg2[var9];
                int var13 = var12.field8822;
                int var14 = var12.field8827;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field8820 == null) {
                    byte[] var19 = var12.field8828;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field8820;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1070(-92, class539.field7574, class770.field10614)) {
                this.field10659 = arg0.method1105(true, var8, var7, var7, class539.field7574, false);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field10659 = arg0.method1058(false, var10, var7, (byte) -24, var7);
            }
            this.field10662 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class625 var44 = arg2[var26];
                int[] var45 = var44.field8823;
                byte[] var46 = var44.field8820;
                byte[] var47 = var44.field8828;
                int var48 = var44.field8822;
                int var49 = var44.field8827;
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
            this.field10659 = arg0.method1058(false, var25, var7, (byte) -24, var7);
            this.field10662 = false;
        }
        this.field10659.method2161(class471.field6717, false);
        this.field10661 = arg0.method1139(6, false);
        this.field10661.method3457(20480, 20, 3882);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field10661.method3454(13952, true);
            if (var28 != null) {
                Stream var29 = this.field10660.method1127(-40, var28);
                float var30 = this.field10659.method39(2170, (float) var7) / (float) var7;
                float var31 = this.field10659.method36(-100, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class625 var33 = arg2[var32];
                    int var34 = var33.field8822;
                    int var35 = var33.field8827;
                    int var36 = var33.field8825;
                    int var37 = var33.field8826;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3956()) {
                        var29.method3955((float) var37);
                        var29.method3955((float) var36);
                        var29.method3955(0.0F);
                        var29.method3955(var40);
                        var29.method3955(var41);
                        var29.method3955((float) var37);
                        var29.method3955((float) (var34 + var36));
                        var29.method3955(0.0F);
                        var29.method3955(var40);
                        var29.method3955(var43);
                        var29.method3955((float) (var35 + var37));
                        var29.method3955((float) (var34 + var36));
                        var29.method3955(0.0F);
                        var29.method3955(var42);
                        var29.method3955(var43);
                        var29.method3955((float) (var35 + var37));
                        var29.method3955((float) var36);
                        var29.method3955(0.0F);
                        var29.method3955(var42);
                        var29.method3955(var41);
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
                var29.method3959();
                if (this.field10661.method3456((byte) 71)) {
                    return;
                }
            }
        }
    }
}
