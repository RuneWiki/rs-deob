import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class694 extends class61 {

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "Lwu;")
    private class373 field9586;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "Lch;")
    private class465 field9584;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "Z")
    private boolean field9587;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "Lll;")
    private class366 field9585;

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lwu;Lhia;[Lfg;Z)V", line = 3)
    public class694(class373 arg0, class66 arg1, class129[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field9586 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class129 var59 = arg2[var6];
            if (var59.field1739 > var5) {
                var5 = var59.field1739;
            }
            if (var59.field1734 > var5) {
                var5 = var59.field1734;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class129 var12 = arg2[var9];
                int var13 = var12.field1739;
                int var14 = var12.field1734;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field1736 == null) {
                    byte[] var19 = var12.field1738;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field1736;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method2311((byte) -13, class256.field3677, class39.field413)) {
                this.field9584 = arg0.method2386(var7, (byte) -59, false, var8, class39.field413, var7);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field9584 = arg0.method2358(-7, false, var7, var10, var7);
            }
            this.field9587 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class129 var44 = arg2[var26];
                int[] var45 = var44.field1732;
                byte[] var46 = var44.field1736;
                byte[] var47 = var44.field1738;
                int var48 = var44.field1739;
                int var49 = var44.field1734;
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
            this.field9584 = arg0.method2358(-115, false, var7, var25, var7);
            this.field9587 = false;
        }
        this.field9584.method1342((byte) 127, class699.field9640);
        this.field9585 = arg0.method2384(false, -77);
        this.field9585.method1290(-126, 20, 20480);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field9585.method1283((byte) 22, true);
            if (var28 != null) {
                Stream var29 = this.field9586.method2392(var28, -15232);
                float var30 = this.field9584.method1263((byte) 109, (float) var7) / (float) var7;
                float var31 = this.field9584.method1273((float) var7, -123) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class129 var33 = arg2[var32];
                    int var34 = var33.field1739;
                    int var35 = var33.field1734;
                    int var36 = var33.field1737;
                    int var37 = var33.field1735;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method3869()) {
                        var29.method3863((float) var37);
                        var29.method3863((float) var36);
                        var29.method3863(0.0F);
                        var29.method3863(var40);
                        var29.method3863(var41);
                        var29.method3863((float) var37);
                        var29.method3863((float) (var34 + var36));
                        var29.method3863(0.0F);
                        var29.method3863(var40);
                        var29.method3863(var43);
                        var29.method3863((float) (var35 + var37));
                        var29.method3863((float) (var34 + var36));
                        var29.method3863(0.0F);
                        var29.method3863(var42);
                        var29.method3863(var43);
                        var29.method3863((float) (var35 + var37));
                        var29.method3863((float) var36);
                        var29.method3863(0.0F);
                        var29.method3863(var42);
                        var29.method3863(var41);
                    } else {
                        var29.method3864((float) var37);
                        var29.method3864((float) var36);
                        var29.method3864(0.0F);
                        var29.method3864(var40);
                        var29.method3864(var41);
                        var29.method3864((float) var37);
                        var29.method3864((float) (var34 + var36));
                        var29.method3864(0.0F);
                        var29.method3864(var40);
                        var29.method3864(var43);
                        var29.method3864((float) (var35 + var37));
                        var29.method3864((float) (var34 + var36));
                        var29.method3864(0.0F);
                        var29.method3864(var42);
                        var29.method3864(var43);
                        var29.method3864((float) (var35 + var37));
                        var29.method3864((float) var36);
                        var29.method3864(0.0F);
                        var29.method3864(var42);
                        var29.method3864(var41);
                    }
                }
                var29.method3872();
                if (this.field9585.method1289((byte) 62)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(CIIIZLaa;II)V", line = 308)
    public final void method22(char arg0, int arg1, int arg2, int arg3, boolean arg4, class488 arg5, int arg6, int arg7) {
    }

    @OriginalMember(owner = "client!ev", name = "fa", descriptor = "(CIIIZ)V", line = 312)
    public final void method23(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field9586.method2312((byte) -88);
        this.field9586.method2294(this.field9584, -2);
        if (this.field9587 || arg4) {
            this.field9586.method2300(class336.field4874, class499.field7099, 0);
            this.field9586.method2329(0, (byte) -128, class469.field6850);
            this.field9586.method2415(arg3, 0);
        } else {
            this.field9586.method2300(class499.field7099, class499.field7099, 0);
        }
        class441 var6 = this.field9586.method2334((byte) 107);
        var6.method774(arg1, arg2, 0);
        this.field9586.method2406(true);
        this.field9586.method2389(0, (byte) -64, this.field9585);
        this.field9586.method2368(this.field9586.field5654, (byte) 67);
        this.field9586.method2408(class299.field4249, (byte) -40, arg0 * 4, 2);
        if (this.field9587 || arg4) {
            this.field9586.method2329(0, (byte) -127, class331.field4759);
        }
    }
}
