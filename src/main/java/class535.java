import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class535 extends class91 {

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lwr;")
    private class388 field7482;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "Lwn;")
    private class617 field7484;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
    private boolean field7481;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "Llu;")
    private class609 field7483;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lwr;Lpu;[Lbt;Z)V")
    public class535(class388 arg0, class483 arg1, class38[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7482 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class38 var59 = arg2[var6];
            if (var59.field783 > var5) {
                var5 = var59.field783;
            }
            if (var59.field785 > var5) {
                var5 = var59.field785;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class38 var12 = arg2[var9];
                int var13 = var12.field783;
                int var14 = var12.field785;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field790 == null) {
                    byte[] var19 = var12.field782;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field790;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1632(0, class519.field7310, class608.field8759)) {
                this.field7484 = arg0.method2327(-20920, var7, class519.field7310, false, var7, var8);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field7484 = arg0.method2322(var7, var10, var7, 8, false);
            }
            this.field7481 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class38 var44 = arg2[var26];
                int[] var45 = var44.field784;
                byte[] var46 = var44.field790;
                byte[] var47 = var44.field782;
                int var48 = var44.field783;
                int var49 = var44.field785;
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
            this.field7484 = arg0.method2322(var7, var25, var7, 8, false);
            this.field7481 = false;
        }
        this.field7484.method1483(false, class339.field4575);
        this.field7483 = arg0.method1644((byte) 115, false);
        this.field7483.method619(20, 59, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field7483.method613(true, -25838);
            if (var28 != null) {
                Stream var29 = this.field7482.method2269(114, var28);
                float var30 = this.field7484.method1814(122, (float) var7) / (float) var7;
                float var31 = this.field7484.method1815(25485, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class38 var33 = arg2[var32];
                    int var34 = var33.field783;
                    int var35 = var33.field785;
                    int var36 = var33.field786;
                    int var37 = var33.field787;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3294()) {
                        var29.method3289((float) var37);
                        var29.method3289((float) var36);
                        var29.method3289(0.0F);
                        var29.method3289(var40);
                        var29.method3289(var41);
                        var29.method3289((float) var37);
                        var29.method3289((float) (var34 + var36));
                        var29.method3289(0.0F);
                        var29.method3289(var40);
                        var29.method3289(var43);
                        var29.method3289((float) (var35 + var37));
                        var29.method3289((float) (var34 + var36));
                        var29.method3289(0.0F);
                        var29.method3289(var42);
                        var29.method3289(var43);
                        var29.method3289((float) (var35 + var37));
                        var29.method3289((float) var36);
                        var29.method3289(0.0F);
                        var29.method3289(var42);
                        var29.method3289(var41);
                    } else {
                        var29.method3293((float) var37);
                        var29.method3293((float) var36);
                        var29.method3293(0.0F);
                        var29.method3293(var40);
                        var29.method3293(var41);
                        var29.method3293((float) var37);
                        var29.method3293((float) (var34 + var36));
                        var29.method3293(0.0F);
                        var29.method3293(var40);
                        var29.method3293(var43);
                        var29.method3293((float) (var35 + var37));
                        var29.method3293((float) (var34 + var36));
                        var29.method3293(0.0F);
                        var29.method3293(var42);
                        var29.method3293(var43);
                        var29.method3293((float) (var35 + var37));
                        var29.method3293((float) var36);
                        var29.method3293(0.0F);
                        var29.method3293(var42);
                        var29.method3293(var41);
                    }
                }
                var29.method3288();
                if (this.field7483.method616((byte) -89)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "HA", descriptor = "(CIIIZ)V")
    public final void method669(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7482.method2278(true);
        this.field7482.method2267(2, this.field7484);
        if (this.field7481 || arg4) {
            this.field7482.method2313(class167.field2417, -82, class137.field2155);
            this.field7482.method2315(class610.field8770, 0, 8);
            this.field7482.method2309(arg3, -9683);
        } else {
            this.field7482.method2313(class137.field2155, 117, class137.field2155);
        }
        class557 var6 = this.field7482.method2342((byte) -85);
        var6.method1054(arg1, arg2, 0);
        this.field7482.method2286(21838);
        this.field7482.method1609(this.field7482.field5500, -113);
        this.field7482.method1607(this.field7483, 0, false);
        this.field7482.method1638((byte) 76, arg0 * 4, 2, class509.field7106);
        if (this.field7481 || arg4) {
            this.field7482.method2315(class583.field8185, 0, 8);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(CIIIZLpa;II)V")
    public final void method672(char arg0, int arg1, int arg2, int arg3, boolean arg4, class310 arg5, int arg6, int arg7) {
    }
}
