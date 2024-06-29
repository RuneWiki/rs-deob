import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class348 extends class420 {

    @OriginalMember(owner = "client!eca", name = "w", descriptor = "Lgd;")
    private class696 field4258;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "Lw;")
    private class471 field4261;

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "Z")
    private boolean field4259;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "Lcq;")
    private class233 field4260;

    @OriginalMember(owner = "client!eca", name = "fa", descriptor = "(CIIIZ)V", line = 3)
    public final void method1037(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4258.method3739(12);
        this.field4258.method3756(10, this.field4261);
        if (this.field4259 || arg4) {
            this.field4258.method3759(false, class174.field2285, class137.field1820);
            this.field4258.method3736(class324.field4001, 0, (byte) -88);
            this.field4258.method3771(arg3, -9445);
        } else {
            this.field4258.method3759(false, class174.field2285, class174.field2285);
        }
        class588 var6 = this.field4258.method3783(27);
        var6.method449(arg1, arg2, 0);
        this.field4258.method3761(0);
        this.field4258.method1200((byte) -108, 0, this.field4260);
        this.field4258.method1150(this.field4258.field9239, 0);
        this.field4258.method1191(class467.field6043, false, arg0 * 4, 2);
        if (this.field4259 || arg4) {
            this.field4258.method3736(class171.field2262, 0, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lgd;Lne;[Lvi;Z)V", line = 28)
    public class348(class696 arg0, class166 arg1, class388[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4258 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class388 var59 = arg2[var6];
            if (var59.field4946 > var5) {
                var5 = var59.field4946;
            }
            if (var59.field4950 > var5) {
                var5 = var59.field4950;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class388 var12 = arg2[var9];
                int var13 = var12.field4946;
                int var14 = var12.field4950;
                int var15 = var9 % 16 * var5;
                int var16 = var9 / 16 * var5;
                int var17 = var7 * var16 + var15;
                int var18 = 0;
                if (var12.field4947 == null) {
                    byte[] var19 = var12.field4949;
                    for (int var20 = 0; var20 < var13; var20++) {
                        for (int var21 = 0; var21 < var14; var21++) {
                            var8[var17++] = (byte) (var19[var18++] == 0 ? 0 : -1);
                        }
                        var17 += var7 - var14;
                    }
                } else {
                    byte[] var22 = var12.field4947;
                    for (int var23 = 0; var23 < var13; var23++) {
                        for (int var24 = 0; var24 < var14; var24++) {
                            var8[var17++] = var22[var18++];
                        }
                        var17 += var7 - var14;
                    }
                }
            }
            if (arg0.method1188(class483.field6239, (byte) -118, class73.field990)) {
                this.field4261 = arg0.method3753(87, var7, var8, var7, class483.field6239, false);
            } else {
                int[] var10 = new int[var8.length];
                for (int var11 = 0; var11 < var8.length; var11++) {
                    var10[var11] = var8[var11] << 24;
                }
                this.field4261 = arg0.method3719(var7, var10, (byte) -117, var7, false);
            }
            this.field4259 = true;
        } else {
            int[] var25 = new int[var7 * var7];
            for (int var26 = 0; var26 < 256; var26++) {
                class388 var44 = arg2[var26];
                int[] var45 = var44.field4951;
                byte[] var46 = var44.field4947;
                byte[] var47 = var44.field4949;
                int var48 = var44.field4946;
                int var49 = var44.field4950;
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
            this.field4261 = arg0.method3719(var7, var25, (byte) -117, var7, false);
            this.field4259 = false;
        }
        this.field4261.method774((byte) -105, class166.field2196);
        this.field4260 = arg0.method1162((byte) 31, false);
        this.field4260.method283(20480, 20, -21048);
        for (int var27 = 0; var27 < 4; var27++) {
            Buffer var28 = this.field4260.method286(16561, true);
            if (var28 != null) {
                Stream var29 = this.field4258.method3773(var28, (byte) -82);
                float var30 = this.field4261.method1125(true, (float) var7) / (float) var7;
                float var31 = this.field4261.method1129(-124, (float) var7) / (float) var7;
                for (int var32 = 0; var32 < 256; var32++) {
                    class388 var33 = arg2[var32];
                    int var34 = var33.field4946;
                    int var35 = var33.field4950;
                    int var36 = var33.field4945;
                    int var37 = var33.field4948;
                    float var38 = (float) (var32 % 16 * var5);
                    float var39 = (float) (var32 / 16 * var5);
                    float var40 = var30 * var38;
                    float var41 = var31 * var39;
                    float var42 = ((float) var35 + var38) * var30;
                    float var43 = ((float) var34 + var39) * var31;
                    if (Stream.method2528()) {
                        var29.method2518((float) var37);
                        var29.method2518((float) var36);
                        var29.method2518(0.0F);
                        var29.method2518(var40);
                        var29.method2518(var41);
                        var29.method2518((float) var37);
                        var29.method2518((float) (var34 + var36));
                        var29.method2518(0.0F);
                        var29.method2518(var40);
                        var29.method2518(var43);
                        var29.method2518((float) (var35 + var37));
                        var29.method2518((float) (var34 + var36));
                        var29.method2518(0.0F);
                        var29.method2518(var42);
                        var29.method2518(var43);
                        var29.method2518((float) (var35 + var37));
                        var29.method2518((float) var36);
                        var29.method2518(0.0F);
                        var29.method2518(var42);
                        var29.method2518(var41);
                    } else {
                        var29.method2524((float) var37);
                        var29.method2524((float) var36);
                        var29.method2524(0.0F);
                        var29.method2524(var40);
                        var29.method2524(var41);
                        var29.method2524((float) var37);
                        var29.method2524((float) (var34 + var36));
                        var29.method2524(0.0F);
                        var29.method2524(var40);
                        var29.method2524(var43);
                        var29.method2524((float) (var35 + var37));
                        var29.method2524((float) (var34 + var36));
                        var29.method2524(0.0F);
                        var29.method2524(var42);
                        var29.method2524(var43);
                        var29.method2524((float) (var35 + var37));
                        var29.method2524((float) var36);
                        var29.method2524(0.0F);
                        var29.method2524(var42);
                        var29.method2524(var41);
                    }
                }
                var29.method2519();
                if (this.field4260.method288(-12162)) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(CIIIZLaa;II)V", line = 333)
    public final void method1039(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7) {
    }
}
