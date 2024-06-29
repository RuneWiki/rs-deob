import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class401 extends class421 {

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "Lcf;")
    private class562 field5814;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "Lhi;")
    private class190 field5815;

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "Z")
    private boolean field5816;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "Lwl;")
    private class378 field5817;

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lcf;Ldaa;[Lvw;Z)V")
    public class401(class562 arg0, class11 arg1, class279[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5814 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class279 var59 = arg2[var6];
            if (var59.field4171 > var5) {
                var5 = var59.field4171;
            }
            if (var59.field4174 > var5) {
                var5 = var59.field4174;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class279 var12 = arg2[var9];
                int var13 = var12.field4171;
                int var14 = var12.field4174;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field4170 == null) {
                    byte[] var19 = var12.field4167;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field4170;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method2848(class2.field372, class410.field5938, (byte) -98)) {
                this.field5815 = arg0.method3259(var7, var8, var7, false, class410.field5938, 0);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field5815 = arg0.method3270(var7, var10, (byte) 50, false, var7);
            }
            this.field5816 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class279 var44 = arg2[var26];
                int[] var45 = var44.field4169;
                byte[] var46 = var44.field4170;
                byte[] var47 = var44.field4167;
                int var48 = var44.field4171;
                int var49 = var44.field4174;
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
            this.field5815 = arg0.method3270(var7, var25, (byte) 50, false, var7);
            this.field5816 = false;
        }
        this.field5815.method774(true, class540.field7542);
        this.field5817 = arg0.method2851(true, false);
        this.field5817.method2164(20, 3573, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field5817.method2167(-1926, true);
            if (var28 != null) {
                Stream var29 = this.field5814.method3219(var28, 1009);
                float var30 = this.field5815.method467((float) var7, -13359) / (float) var7;
                float var31 = this.field5815.method471((float) var7, 5235) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class279 var33 = arg2[var32];
                    int var34 = var33.field4171;
                    int var35 = var33.field4174;
                    int var36 = var33.field4172;
                    int var37 = var33.field4168;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3580()) {
                        var29.method3582((float) var37);
                        var29.method3582((float) var36);
                        var29.method3582(0.0F);
                        var29.method3582(var40);
                        var29.method3582(var41);
                        var29.method3582((float) var37);
                        var29.method3582((float) (var34 + var36));
                        var29.method3582(0.0F);
                        var29.method3582(var40);
                        var29.method3582(var43);
                        var29.method3582((float) (var35 + var37));
                        var29.method3582((float) (var34 + var36));
                        var29.method3582(0.0F);
                        var29.method3582(var42);
                        var29.method3582(var43);
                        var29.method3582((float) (var35 + var37));
                        var29.method3582((float) var36);
                        var29.method3582(0.0F);
                        var29.method3582(var42);
                        var29.method3582(var41);
                    } else {
                        var29.method3584((float) var37);
                        var29.method3584((float) var36);
                        var29.method3584(0.0F);
                        var29.method3584(var40);
                        var29.method3584(var41);
                        var29.method3584((float) var37);
                        var29.method3584((float) (var34 + var36));
                        var29.method3584(0.0F);
                        var29.method3584(var40);
                        var29.method3584(var43);
                        var29.method3584((float) (var35 + var37));
                        var29.method3584((float) (var34 + var36));
                        var29.method3584(0.0F);
                        var29.method3584(var42);
                        var29.method3584(var43);
                        var29.method3584((float) (var35 + var37));
                        var29.method3584((float) var36);
                        var29.method3584(0.0F);
                        var29.method3584(var42);
                        var29.method3584(var41);
                    }
                }
                var29.method3576();
                if (this.field5817.method2169((byte) 93)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method676(char arg0, int arg1, int arg2, int arg3, boolean arg4, class619 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!rba", name = "OA", descriptor = "(CIIIZ)V")
    public final void method678(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5814.method3208(14);
        this.field5814.method3266(-2, this.field5815);
        if (this.field5816 || arg4) {
            this.field5814.method3232(class525.field7399, class509.field7205, (byte) -105);
            this.field5814.method3231(0, class370.field5487, (byte) -54);
            this.field5814.method3242((byte) -73, arg3);
        } else {
            this.field5814.method3232(class525.field7399, class525.field7399, (byte) -99);
        }
        class391 var6 = this.field5814.method3190((byte) 63);
        var6.method905(arg1, arg2, 0);
        this.field5814.method3260((byte) -120);
        this.field5814.method2873(1, 0, this.field5817);
        this.field5814.method2862(13427, this.field5814.field8212);
        this.field5814.method2859(class645.field9293, arg0 * 4, 1, 2);
        if (this.field5816 || arg4) {
            this.field5814.method3231(0, class435.field6296, (byte) -109);
        }
    }
}
