import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class306 extends class67 {

    @OriginalMember(owner = "client!jfa", name = "y", descriptor = "Lsf;")
    private class551 field4195;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "Lgl;")
    private class627 field4193;

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "Z")
    private boolean field4196;

    @OriginalMember(owner = "client!jfa", name = "x", descriptor = "Lmha;")
    private class438 field4194;

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lsf;Lkc;[Lgs;Z)V")
    public class306(class551 arg0, class145 arg1, class49[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4195 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class49 var59 = arg2[var6];
            if (var59.field741 > var5) {
                var5 = var59.field741;
            }
            if (var59.field745 > var5) {
                var5 = var59.field745;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class49 var12 = arg2[var9];
                int var13 = var12.field741;
                int var14 = var12.field745;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field737 == null) {
                    byte[] var19 = var12.field743;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field737;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method810(class497.field6799, true, class485.field6566)) {
                this.field4193 = arg0.method3154(class485.field6566, var7, (byte) 74, var7, var8, false);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field4193 = arg0.method3139(false, var7, false, var7, var10);
            }
            this.field4196 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class49 var44 = arg2[var26];
                int[] var45 = var44.field739;
                byte[] var46 = var44.field737;
                byte[] var47 = var44.field743;
                int var48 = var44.field741;
                int var49 = var44.field745;
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
            this.field4193 = arg0.method3139(false, var7, false, var7, var25);
            this.field4196 = false;
        }
        this.field4193.method2034(class642.field8891, (byte) 124);
        this.field4194 = arg0.method818(0, false);
        this.field4194.method1736((byte) 112, 20480, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field4194.method1739(true, 114);
            if (var28 != null) {
                Stream var29 = this.field4195.method3170((byte) 5, var28);
                float var30 = this.field4193.method2675((float) var7, (byte) 124) / (float) var7;
                float var31 = this.field4193.method2669(31463, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class49 var33 = arg2[var32];
                    int var34 = var33.field741;
                    int var35 = var33.field745;
                    int var36 = var33.field738;
                    int var37 = var33.field744;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3910()) {
                        var29.method3914((float) var37);
                        var29.method3914((float) var36);
                        var29.method3914(0.0F);
                        var29.method3914(var40);
                        var29.method3914(var41);
                        var29.method3914((float) var37);
                        var29.method3914((float) (var34 + var36));
                        var29.method3914(0.0F);
                        var29.method3914(var40);
                        var29.method3914(var43);
                        var29.method3914((float) (var35 + var37));
                        var29.method3914((float) (var34 + var36));
                        var29.method3914(0.0F);
                        var29.method3914(var42);
                        var29.method3914(var43);
                        var29.method3914((float) (var35 + var37));
                        var29.method3914((float) var36);
                        var29.method3914(0.0F);
                        var29.method3914(var42);
                        var29.method3914(var41);
                    } else {
                        var29.method3909((float) var37);
                        var29.method3909((float) var36);
                        var29.method3909(0.0F);
                        var29.method3909(var40);
                        var29.method3909(var41);
                        var29.method3909((float) var37);
                        var29.method3909((float) (var34 + var36));
                        var29.method3909(0.0F);
                        var29.method3909(var40);
                        var29.method3909(var43);
                        var29.method3909((float) (var35 + var37));
                        var29.method3909((float) (var34 + var36));
                        var29.method3909(0.0F);
                        var29.method3909(var42);
                        var29.method3909(var43);
                        var29.method3909((float) (var35 + var37));
                        var29.method3909((float) var36);
                        var29.method3909(0.0F);
                        var29.method3909(var42);
                        var29.method3909(var41);
                    }
                }
                var29.method3901();
                if (this.field4194.method1737((byte) -75)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method134(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!jfa", name = "fa", descriptor = "(CIIIZ)V")
    public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4195.method3101(true);
        this.field4195.method3090(this.field4193, (byte) 127);
        if (this.field4196 || arg4) {
            this.field4195.method3118(class671.field9318, class371.field5051, 0);
            this.field4195.method3143(class633.field8767, true, 0);
            this.field4195.method3130((byte) -77, arg3);
        } else {
            this.field4195.method3118(class371.field5051, class371.field5051, 0);
        }
        class421 var6 = this.field4195.method3096(false);
        var6.method1868(arg1, arg2, 0);
        this.field4195.method3126(109);
        this.field4195.method863(0, (byte) 113, this.field4194);
        this.field4195.method846((byte) -97, this.field4195.field7779);
        this.field4195.method861(2, 2, class784.field10779, arg0 * 4);
        if (this.field4196 || arg4) {
            this.field4195.method3143(class327.field4459, true, 0);
        }
    }
}
