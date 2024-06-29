import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class611 extends class416 {

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "Lhea;")
    private class387 field8568;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "Loi;")
    private class65 field8566;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "Z")
    private boolean field8569;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "Lbca;")
    private class613 field8567;

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lhea;Luq;[Lfg;Z)V")
    public class611(class387 arg0, class146 arg1, class113[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8568 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class113 var59 = arg2[var6];
            if (var59.field1708 > var5) {
                var5 = var59.field1708;
            }
            if (var59.field1706 > var5) {
                var5 = var59.field1706;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class113 var12 = arg2[var9];
                int var13 = var12.field1708;
                int var14 = var12.field1706;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field1701 == null) {
                    byte[] var19 = var12.field1709;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field1701;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1895(class218.field3050, true, class87.field1467)) {
                this.field8566 = arg0.method2330(false, class87.field1467, 0, var7, var8, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8566 = arg0.method2363(var7, 0, false, var10, var7);
            }
            this.field8569 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class113 var44 = arg2[var26];
                int[] var45 = var44.field1702;
                byte[] var46 = var44.field1701;
                byte[] var47 = var44.field1709;
                int var48 = var44.field1708;
                int var49 = var44.field1706;
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
            this.field8566 = arg0.method2363(var7, 0, false, var25, var7);
            this.field8569 = false;
        }
        this.field8566.method54(class630.field8812, -26149);
        this.field8567 = arg0.method1901(-21710, false);
        this.field8567.method993(20480, -6696, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8567.method995(true, 1614);
            if (var28 != null) {
                Stream var29 = this.field8568.method2381(0, var28);
                float var30 = this.field8566.method661((float) var7, -87) / (float) var7;
                float var31 = this.field8566.method666(true, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class113 var33 = arg2[var32];
                    int var34 = var33.field1708;
                    int var35 = var33.field1706;
                    int var36 = var33.field1707;
                    int var37 = var33.field1704;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3483()) {
                        var29.method3474((float) var37);
                        var29.method3474((float) var36);
                        var29.method3474(0.0F);
                        var29.method3474(var40);
                        var29.method3474(var41);
                        var29.method3474((float) var37);
                        var29.method3474((float) (var34 + var36));
                        var29.method3474(0.0F);
                        var29.method3474(var40);
                        var29.method3474(var43);
                        var29.method3474((float) (var35 + var37));
                        var29.method3474((float) (var34 + var36));
                        var29.method3474(0.0F);
                        var29.method3474(var42);
                        var29.method3474(var43);
                        var29.method3474((float) (var35 + var37));
                        var29.method3474((float) var36);
                        var29.method3474(0.0F);
                        var29.method3474(var42);
                        var29.method3474(var41);
                    } else {
                        var29.method3476((float) var37);
                        var29.method3476((float) var36);
                        var29.method3476(0.0F);
                        var29.method3476(var40);
                        var29.method3476(var41);
                        var29.method3476((float) var37);
                        var29.method3476((float) (var34 + var36));
                        var29.method3476(0.0F);
                        var29.method3476(var40);
                        var29.method3476(var43);
                        var29.method3476((float) (var35 + var37));
                        var29.method3476((float) (var34 + var36));
                        var29.method3476(0.0F);
                        var29.method3476(var42);
                        var29.method3476(var43);
                        var29.method3476((float) (var35 + var37));
                        var29.method3476((float) var36);
                        var29.method3476(0.0F);
                        var29.method3476(var42);
                        var29.method3476(var41);
                    }
                }
                var29.method3471();
                if (this.field8567.method992((byte) -88)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "OA", descriptor = "(CIIIZ)V")
    public final void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8568.method2368(1);
        this.field8568.method2337(false, this.field8566);
        if (this.field8569 || arg4) {
            this.field8568.method2339(class190.field2740, -32540, class153.field2209);
            this.field8568.method2324(0, class124.field1869, 1);
            this.field8568.method2321(arg3, 24);
        } else {
            this.field8568.method2339(class190.field2740, -32540, class190.field2740);
        }
        class21 var6 = this.field8568.method2336(false);
        var6.method252(arg1, arg2, 0);
        this.field8568.method2340(false);
        this.field8568.method1865(0, -26558, this.field8567);
        this.field8568.method1883(-68, this.field8568.field5743);
        this.field8568.method1880(14, class293.field4321, arg0 * 4, 2);
        if (this.field8569 || arg4) {
            this.field8568.method2324(0, class61.field1155, 1);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method60(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7) {
    }
}
