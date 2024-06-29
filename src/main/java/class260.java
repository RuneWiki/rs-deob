import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class260 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
    public boolean field3350 = true;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    private int field3353 = -1;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    private int field3365;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Ldc;")
    private class5 field3356;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    private int field3363;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Lmh;")
    private class537 field3362;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    private int field3366;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lwj;")
    private class332 field3351;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lwm;")
    private class482 field3354;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lrr;")
    private class303 field3359;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Let;")
    public static class509 field3358 = null;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field3355 = -1;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBLwj;)V")
    private final void method1458(int arg0, byte arg1, class332 arg2) {
        if (arg1 != -54) {
            this.method1463(-119);
        }
        field3357++;
        if (arg0 != 0) {
            this.method1463(128);
            this.field3362.method3083((byte) 127, this.field3359);
            this.field3362.method3120(arg1 ^ 0x166B, arg0, 4, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method1459(int arg0) {
        this.method1458(this.field3366, (byte) -54, this.field3351);
        if (arg0 != -128) {
            field3358 = null;
        }
        field3352++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static void method1460(byte arg0) {
        if (arg0 < -10) {
            field3358 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)Z")
    public static final boolean method1461(byte arg0) {
        if (arg0 != -17) {
            method1464(125, -53, 48, -15, -30, 57, 93);
        }
        field3368++;
        return class199.field2397 > 0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[BII)V")
    public final void method1462(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3354.method1862(arg0 ^ 0xFFFF82DC, this.field3362.method3064(arg3, -1) * arg2, arg1, arg3);
        if (arg0 != 0) {
            field3355 = -11;
        }
        field3360++;
        this.method1458(arg2, (byte) -54, this.field3354);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lmh;Ldc;Lae;IIIII)V")
    public class260(class537 arg0, class5 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3365 = arg7;
        this.field3356 = arg1;
        this.field3363 = arg6;
        this.field3362 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2116 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field2510[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3366 = var10;
        if (var10 <= 0) {
            this.field3359 = null;
        } else {
            class374 var14 = new class374(var10 * 2);
            if (this.field3362.field7754) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2116 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field2510[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2115(var18[var19] & 0xFFFF, 3324);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2116 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field2510[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2097(-985, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3351 = this.field3362.method3137(var14.field4929, 5123, -36, false, var14.field4966);
            this.field3354 = new class482(this.field3362, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    private final void method1463(int arg0) {
        field3364++;
        if (!this.field3350) {
            return;
        }
        this.field3350 = false;
        byte[] var2 = this.field3356.field40;
        byte[] var3 = this.field3362.field7877;
        int var4 = 0;
        int var5 = this.field3356.field36;
        int var6 = this.field3363 + (this.field3356.field36 * this.field3365);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3359 != null && this.field3353 == var4) {
            this.field3350 = false;
            return;
        }
        if (arg0 != 128) {
            method1460((byte) -18);
        }
        this.field3353 = var4;
        int var8 = this.field3365 * var5 + this.field3363;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field3356.field36 - 128;
        }
        if (this.field3359 == null) {
            this.field3359 = new class303(this.field3362, 3553, 6406, 128, 128, false, this.field3362.field7877, 6406, false);
            this.field3359.method1671((byte) -46, false, false);
            this.field3359.method1358((byte) 111, true);
        } else {
            this.field3359.method1673(false, 6406, this.field3362.field7877, 0, 128, 0, 0, 128, false, 0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3367++;
        int var7 = arg2 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 8 - arg3 - arg4;
        } else {
            if (arg5 >= -87) {
                field3358 = null;
            }
            return 1 + 7 - arg6 - arg0;
        }
    }
}
