import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class623 extends class400 {

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Lpj;")
    private class38 field8735;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lrm;")
    private class90 field8736;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Z")
    private boolean field8733;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lfb;")
    private class669 field8734;

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lpj;Lpia;[Lgu;Z)V")
    public class623(class38 arg0, class54 arg1, class726[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8735 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class726 var59 = arg2[var6];
            if (var59.field10186 > var5) {
                var5 = var59.field10186;
            }
            if (var59.field10184 > var5) {
                var5 = var59.field10184;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class726 var12 = arg2[var9];
                int var13 = var12.field10186;
                int var14 = var12.field10184;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field10185 == null) {
                    byte[] var19 = var12.field10181;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field10185;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method399(18154, class121.field1859, class215.field3556)) {
                this.field8736 = arg0.method391(var8, var7, false, class215.field3556, var7, 122);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field8736 = arg0.method265(var7, false, var7, var10, 0);
            }
            this.field8733 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class726 var44 = arg2[var26];
                int[] var45 = var44.field10183;
                byte[] var46 = var44.field10185;
                byte[] var47 = var44.field10181;
                int var48 = var44.field10186;
                int var49 = var44.field10184;
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
            this.field8736 = arg0.method265(var7, false, var7, var25, 0);
            this.field8733 = false;
        }
        this.field8736.method204(class70.field1080, 55);
        this.field8734 = arg0.method293(false, 6);
        this.field8734.method693(true, 20480, 20);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field8734.method692(true, -31414);
            if (var28 != null) {
                Stream var29 = this.field8735.method368((byte) -121, var28);
                float var30 = this.field8736.method590(72, (float) var7) / (float) var7;
                float var31 = this.field8736.method591(121, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class726 var33 = arg2[var32];
                    int var34 = var33.field10186;
                    int var35 = var33.field10184;
                    int var36 = var33.field10182;
                    int var37 = var33.field10179;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2572()) {
                        var29.method2576((float) var37);
                        var29.method2576((float) var36);
                        var29.method2576(0.0F);
                        var29.method2576(var40);
                        var29.method2576(var41);
                        var29.method2576((float) var37);
                        var29.method2576((float) (var34 + var36));
                        var29.method2576(0.0F);
                        var29.method2576(var40);
                        var29.method2576(var43);
                        var29.method2576((float) (var35 + var37));
                        var29.method2576((float) (var34 + var36));
                        var29.method2576(0.0F);
                        var29.method2576(var42);
                        var29.method2576(var43);
                        var29.method2576((float) (var35 + var37));
                        var29.method2576((float) var36);
                        var29.method2576(0.0F);
                        var29.method2576(var42);
                        var29.method2576(var41);
                    } else {
                        var29.method2579((float) var37);
                        var29.method2579((float) var36);
                        var29.method2579(0.0F);
                        var29.method2579(var40);
                        var29.method2579(var41);
                        var29.method2579((float) var37);
                        var29.method2579((float) (var34 + var36));
                        var29.method2579(0.0F);
                        var29.method2579(var40);
                        var29.method2579(var43);
                        var29.method2579((float) (var35 + var37));
                        var29.method2579((float) (var34 + var36));
                        var29.method2579(0.0F);
                        var29.method2579(var42);
                        var29.method2579(var43);
                        var29.method2579((float) (var35 + var37));
                        var29.method2579((float) var36);
                        var29.method2579(0.0F);
                        var29.method2579(var42);
                        var29.method2579(var41);
                    }
                }
                var29.method2573();
                if (this.field8734.method696(-11404)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "fa", descriptor = "(CIIIZ)V")
    public final void method492(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8735.method237(26736);
        this.field8735.method215(8, this.field8736);
        if (this.field8733 || arg4) {
            this.field8735.method365(class750.field10454, class333.field4884, (byte) -122);
            this.field8735.method321(class327.field4819, 0, (byte) -95);
            this.field8735.method228(2, arg3);
        } else {
            this.field8735.method365(class750.field10454, class750.field10454, (byte) -122);
        }
        class341 var6 = this.field8735.method431((byte) 51);
        var6.method675(arg1, arg2, 0);
        this.field8735.method309((byte) -60);
        this.field8735.method327(this.field8734, 0, 0);
        this.field8735.method330(19661, this.field8735.field692);
        this.field8735.method403(2, class255.field4027, false, arg0 * 4);
        if (this.field8733 || arg4) {
            this.field8735.method321(class388.field5817, 0, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method491(char arg0, int arg1, int arg2, int arg3, boolean arg4, class570 arg5, int arg6, int arg7) {
    }
}
