import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class210 extends class400 {

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "Lch;")
    private class38 field3159;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "Lug;")
    private class60 field3158;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "Z")
    private boolean field3157;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "Lfg;")
    private class436 field3160;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method1275(char arg0, int arg1, int arg2, int arg3, boolean arg4, class569 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lch;Lqt;[Lffa;Z)V")
    public class210(class38 arg0, class502 arg1, class676[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3159 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class676 var59 = arg2[var6];
            if (var59.field9618 > var5) {
                var5 = var59.field9618;
            }
            if (var59.field9614 > var5) {
                var5 = var59.field9614;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class676 var12 = arg2[var9];
                int var13 = var12.field9618;
                int var14 = var12.field9614;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field9616 == null) {
                    byte[] var19 = var12.field9612;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field9616;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method256(0, class315.field4259, class674.field9590)) {
                this.field3158 = arg0.method350(var7, var8, false, -119, var7, class315.field4259);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field3158 = arg0.method303(false, var7, var7, var10, -5);
            }
            this.field3157 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class676 var44 = arg2[var26];
                int[] var45 = var44.field9615;
                byte[] var46 = var44.field9616;
                byte[] var47 = var44.field9612;
                int var48 = var44.field9618;
                int var49 = var44.field9614;
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
            this.field3158 = arg0.method303(false, var7, var7, var25, -5);
            this.field3157 = false;
        }
        this.field3158.method616(false, class435.field6224);
        this.field3160 = arg0.method327(false, false);
        this.field3160.method1101(-32376, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field3160.method1103((byte) 73, true);
            if (var28 != null) {
                Stream var29 = this.field3159.method325((byte) -120, var28);
                float var30 = this.field3158.method561((byte) -57, (float) var7) / (float) var7;
                float var31 = this.field3158.method567((float) var7, 17714) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class676 var33 = arg2[var32];
                    int var34 = var33.field9618;
                    int var35 = var33.field9614;
                    int var36 = var33.field9610;
                    int var37 = var33.field9613;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2551()) {
                        var29.method2557((float) var37);
                        var29.method2557((float) var36);
                        var29.method2557(0.0F);
                        var29.method2557(var40);
                        var29.method2557(var41);
                        var29.method2557((float) var37);
                        var29.method2557((float) (var34 + var36));
                        var29.method2557(0.0F);
                        var29.method2557(var40);
                        var29.method2557(var43);
                        var29.method2557((float) (var35 + var37));
                        var29.method2557((float) (var34 + var36));
                        var29.method2557(0.0F);
                        var29.method2557(var42);
                        var29.method2557(var43);
                        var29.method2557((float) (var35 + var37));
                        var29.method2557((float) var36);
                        var29.method2557(0.0F);
                        var29.method2557(var42);
                        var29.method2557(var41);
                    } else {
                        var29.method2564((float) var37);
                        var29.method2564((float) var36);
                        var29.method2564(0.0F);
                        var29.method2564(var40);
                        var29.method2564(var41);
                        var29.method2564((float) var37);
                        var29.method2564((float) (var34 + var36));
                        var29.method2564(0.0F);
                        var29.method2564(var40);
                        var29.method2564(var43);
                        var29.method2564((float) (var35 + var37));
                        var29.method2564((float) (var34 + var36));
                        var29.method2564(0.0F);
                        var29.method2564(var42);
                        var29.method2564(var43);
                        var29.method2564((float) (var35 + var37));
                        var29.method2564((float) var36);
                        var29.method2564(0.0F);
                        var29.method2564(var42);
                        var29.method2564(var41);
                    }
                }
                var29.method2554();
                if (this.field3160.method1099((byte) -127)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "fa", descriptor = "(CIIIZ)V")
    public final void method1278(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3159.method269(false);
        this.field3159.method264(this.field3158, -2);
        if (this.field3157 || arg4) {
            this.field3159.method386((byte) -123, class281.field3934, class567.field8198);
            this.field3159.method230(class231.field3462, 0, 58);
            this.field3159.method213(arg3, 3);
        } else {
            this.field3159.method386((byte) -117, class567.field8198, class567.field8198);
        }
        class417 var6 = this.field3159.method345(0);
        var6.method845(arg1, arg2, 0);
        this.field3159.method384((byte) 19);
        this.field3159.method405(this.field3160, 0, (byte) 11);
        this.field3159.method265(this.field3159.field645, (byte) -111);
        this.field3159.method399(class575.field8272, 2, arg0 * 4, (byte) -117);
        if (this.field3157 || arg4) {
            this.field3159.method230(class234.field3509, 0, 31);
        }
    }
}
