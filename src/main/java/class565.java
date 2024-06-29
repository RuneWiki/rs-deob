import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class565 extends class64 {

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "Lgca;")
    private class261 field8227;

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "Lah;")
    private class406 field8226;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "Z")
    private boolean field8229;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "Lfk;")
    private class682 field8228;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIIIZLaa;II)V", line = 5)
    public final void method118(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ur", name = "fa", descriptor = "(CIIIZ)V", line = 9)
    public final void method120(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8227.method2218(-118);
        this.field8227.method2233((byte) -118, this.field8226);
        if (this.field8229 || arg4) {
            this.field8227.method2223(class734.field10762, class434.field6809, (byte) 110);
            this.field8227.method2262((byte) -119, class119.field1723, 0);
            this.field8227.method2204(3, arg3);
        } else {
            this.field8227.method2223(class434.field6809, class434.field6809, (byte) 124);
        }
        class615 var6 = this.field8227.method2253(-29405);
        var6.method2465(arg1, arg2, 0);
        this.field8227.method2277(12587);
        this.field8227.method1036(this.field8228, 0, 2);
        this.field8227.method1042((byte) 123, this.field8227.field4239);
        this.field8227.method1050(class376.field6098, arg0 * 4, 2, 7645);
        if (this.field8229 || arg4) {
            this.field8227.method2262((byte) 117, class339.field5532, 0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lgca;Lkaa;[Luh;Z)V", line = 33)
    public class565(class261 arg0, class49 arg1, class174[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8227 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class174 var59 = arg2[var6];
            if (var59.field2782 > var5) {
                var5 = var59.field2782;
            }
            if (var59.field2781 > var5) {
                var5 = var59.field2781;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class174 var12 = arg2[var9];
                int var13 = var12.field2782;
                int var14 = var12.field2781;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field2779 == null) {
                    byte[] var19 = var12.field2776;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field2779;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1058(6, class544.field8004, class335.field5466)) {
                this.field8226 = arg0.method2246(var8, var7, class335.field5466, var7, -113, false);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8226 = arg0.method2206(1826, false, var7, var10, var7);
            }
            this.field8229 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class174 var44 = arg2[var26];
                int[] var45 = var44.field2775;
                byte[] var46 = var44.field2779;
                byte[] var47 = var44.field2776;
                int var48 = var44.field2782;
                int var49 = var44.field2781;
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
            this.field8226 = arg0.method2206(1826, false, var7, var25, var7);
            this.field8229 = false;
        }
        this.field8226.method1170(15249, class494.field7430);
        this.field8228 = arg0.method1030(false, false);
        this.field8228.method3933((byte) -107, 20480, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8228.method3929(true, -31222);
            if (var28 != null) {
                Stream var29 = this.field8227.method2227(var28, (byte) 79);
                float var30 = this.field8226.method3164((float) var7, false) / (float) var7;
                float var31 = this.field8226.method3173((float) var7, 32263) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class174 var33 = arg2[var32];
                    int var34 = var33.field2782;
                    int var35 = var33.field2781;
                    int var36 = var33.field2778;
                    int var37 = var33.field2774;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method5108()) {
                        var29.method5109((float) var37);
                        var29.method5109((float) var36);
                        var29.method5109(0.0F);
                        var29.method5109(var40);
                        var29.method5109(var41);
                        var29.method5109((float) var37);
                        var29.method5109((float) (var34 + var36));
                        var29.method5109(0.0F);
                        var29.method5109(var40);
                        var29.method5109(var43);
                        var29.method5109((float) (var35 + var37));
                        var29.method5109((float) (var34 + var36));
                        var29.method5109(0.0F);
                        var29.method5109(var42);
                        var29.method5109(var43);
                        var29.method5109((float) (var35 + var37));
                        var29.method5109((float) var36);
                        var29.method5109(0.0F);
                        var29.method5109(var42);
                        var29.method5109(var41);
                    } else {
                        var29.method5106((float) var37);
                        var29.method5106((float) var36);
                        var29.method5106(0.0F);
                        var29.method5106(var40);
                        var29.method5106(var41);
                        var29.method5106((float) var37);
                        var29.method5106((float) (var34 + var36));
                        var29.method5106(0.0F);
                        var29.method5106(var40);
                        var29.method5106(var43);
                        var29.method5106((float) (var35 + var37));
                        var29.method5106((float) (var34 + var36));
                        var29.method5106(0.0F);
                        var29.method5106(var42);
                        var29.method5106(var43);
                        var29.method5106((float) (var35 + var37));
                        var29.method5106((float) var36);
                        var29.method5106(0.0F);
                        var29.method5106(var42);
                        var29.method5106(var41);
                    }
                }
                var29.method5097();
                if (this.field8228.method3932((byte) -114)) {
                    return;
                }
            }
        }
    }
}
