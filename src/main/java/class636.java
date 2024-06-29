import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class636 extends class67 {

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "Lkd;")
    private class296 field9251;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Lwp;")
    private class191 field9252;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "Z")
    private boolean field9249;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "Lsfa;")
    private class723 field9250;

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lkd;Llq;[Liga;Z)V")
    public class636(class296 arg0, class578 arg1, class481[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field9251 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class481 var59 = arg2[var6];
            if (var59.field6977 > var5) {
                var5 = var59.field6977;
            }
            if (var59.field6970 > var5) {
                var5 = var59.field6970;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class481 var12 = arg2[var9];
                int var13 = var12.field6977;
                int var14 = var12.field6970;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field6973 == null) {
                    byte[] var19 = var12.field6975;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field6973;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method855(class157.field1952, class667.field9691, -331365768)) {
                this.field9252 = arg0.method2448(false, true, class667.field9691, var7, var8, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field9252 = arg0.method2447(var10, var7, var7, false, 26236);
            }
            this.field9249 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class481 var44 = arg2[var26];
                int[] var45 = var44.field6969;
                byte[] var46 = var44.field6973;
                byte[] var47 = var44.field6975;
                int var48 = var44.field6977;
                int var49 = var44.field6970;
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
            this.field9252 = arg0.method2447(var25, var7, var7, false, 26236);
            this.field9249 = false;
        }
        this.field9252.method2776(true, class265.field4054);
        this.field9250 = arg0.method850(false, 0);
        this.field9250.method166(120, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field9250.method170(false, true);
            if (var28 != null) {
                Stream var29 = this.field9251.method2476(var28, (byte) -3);
                float var30 = this.field9252.method740((byte) -122, (float) var7) / (float) var7;
                float var31 = this.field9252.method748(-19847, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class481 var33 = arg2[var32];
                    int var34 = var33.field6977;
                    int var35 = var33.field6970;
                    int var36 = var33.field6976;
                    int var37 = var33.field6971;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method5102()) {
                        var29.method5112((float) var37);
                        var29.method5112((float) var36);
                        var29.method5112(0.0F);
                        var29.method5112(var40);
                        var29.method5112(var41);
                        var29.method5112((float) var37);
                        var29.method5112((float) (var34 + var36));
                        var29.method5112(0.0F);
                        var29.method5112(var40);
                        var29.method5112(var43);
                        var29.method5112((float) (var35 + var37));
                        var29.method5112((float) (var34 + var36));
                        var29.method5112(0.0F);
                        var29.method5112(var42);
                        var29.method5112(var43);
                        var29.method5112((float) (var35 + var37));
                        var29.method5112((float) var36);
                        var29.method5112(0.0F);
                        var29.method5112(var42);
                        var29.method5112(var41);
                    } else {
                        var29.method5105((float) var37);
                        var29.method5105((float) var36);
                        var29.method5105(0.0F);
                        var29.method5105(var40);
                        var29.method5105(var41);
                        var29.method5105((float) var37);
                        var29.method5105((float) (var34 + var36));
                        var29.method5105(0.0F);
                        var29.method5105(var40);
                        var29.method5105(var43);
                        var29.method5105((float) (var35 + var37));
                        var29.method5105((float) (var34 + var36));
                        var29.method5105(0.0F);
                        var29.method5105(var42);
                        var29.method5105(var43);
                        var29.method5105((float) (var35 + var37));
                        var29.method5105((float) var36);
                        var29.method5105(0.0F);
                        var29.method5105(var42);
                        var29.method5105(var41);
                    }
                }
                var29.method5103();
                if (this.field9250.method167(-20743)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method129(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ji", name = "fa", descriptor = "(CIIIZ)V")
    public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field9251.method2461(true);
        this.field9251.method2467(12, this.field9252);
        if (this.field9249 || arg4) {
            this.field9251.method2417(-68, class684.field9909, class206.field3175);
            this.field9251.method2498(0, class114.field1352, (byte) -122);
            this.field9251.method2462(arg3, -1);
        } else {
            this.field9251.method2417(-79, class206.field3175, class206.field3175);
        }
        class770 var6 = this.field9251.method2468((byte) -109);
        var6.method2389(arg1, arg2, 0);
        this.field9251.method2418(17654);
        this.field9251.method856(0, this.field9250, true);
        this.field9251.method868(false, this.field9251.field4655);
        this.field9251.method892((byte) -5, class242.field3692, arg0 * 4, 2);
        if (this.field9249 || arg4) {
            this.field9251.method2498(0, class48.field546, (byte) 45);
        }
    }
}
