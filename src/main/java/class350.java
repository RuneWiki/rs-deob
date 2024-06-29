import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class350 extends class445 {

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "Lbf;")
    private class344 field4854;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "Lof;")
    private class404 field4865;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Lah;")
    private class238 field4850;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    private int field4851;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    private int field4849;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    private int field4858;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "[[F")
    private float[][] field4847;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[[F")
    private float[][] field4852;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "[[F")
    private float[][] field4860;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Lbt;")
    private class32 field4856;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lji;")
    private class399 field4857;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lad;")
    private class268 field4848;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "Lfd;")
    private class337 field4859;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lfg;")
    private class74 field4853;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Lkj;")
    private class366 field4855;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "Lkj;")
    private class366 field4861;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    private int field4862;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    private int field4863;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(SI)V", line = 11)
    private final void method2167(short arg0, int arg1) {
        if (arg1 != 8515) {
            this.method2168(-53, -3, -71, (boolean[][]) ((boolean[][]) null), -127);
        }
        if (this.field4854.field4721) {
            this.field4856.method229(arg0, arg1 + 1309441029);
        } else {
            this.field4856.method231(78, arg0);
        }
        this.field4862++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[[ZI)V", line = 27)
    public final void method2168(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        if (this.field4859 == null || (arg0 + arg1) < this.field4851 || this.field4864 < arg1 - arg0 || (arg0 + arg4) < this.field4849 || arg4 - arg0 > this.field4858) {
            return;
        }
        for (int var6 = this.field4849; var6 <= this.field4858; var6++) {
            for (int var7 = this.field4851; var7 <= this.field4864; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg4;
                if (-arg0 < var8 && var8 < arg0 && -arg0 < var9 && arg0 > var9 && arg3[arg0 + var8][arg0 + var9]) {
                    this.field4854.method1958((int) (this.field4865.field5540 * 255.0F) << 24);
                    this.field4854.method1980(this.field4855, (class366) null, this.field4861, (class366) null);
                    this.field4854.method2033(this.field4859, 4, 0, this.field4862);
                    return;
                }
            }
        }
        if (arg2 != 277784720) {
            this.field4852 = (float[][]) ((float[][]) null);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V", line = 89)
    private final void method2169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg5 << this.field4850.field3146) + arg0;
        int var11 = (arg2 << this.field4850.field3146) + arg6;
        int var12 = this.field4850.method368(var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var11 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class445 var13 = this.field4848.method1528(var8, 68);
            if (var13 != null) {
                this.method2167(((class311) var13).field4101, 8515);
                return;
            }
        }
        short var14 = (short) (this.field4863++);
        if (var8 != -1L) {
            this.field4848.method1525((byte) 19, new class311(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg6 == 0) {
            var15 = this.field4860[arg1][arg3];
            var16 = this.field4847[arg1][arg3];
            var17 = this.field4852[arg1][arg3];
        } else if (this.field4850.field3143 == arg0 && arg6 == 0) {
            var17 = this.field4852[arg1 + 1][arg3];
            var16 = this.field4847[arg1 + 1][arg3];
            var15 = this.field4860[arg1 + 1][arg3];
        } else if (this.field4850.field3143 == arg0 && this.field4850.field3143 == arg6) {
            var17 = this.field4852[arg1 + 1][arg3 + 1];
            var15 = this.field4860[arg1 + 1][arg3 + 1];
            var16 = this.field4847[arg1 + 1][arg3 + 1];
        } else if (arg0 == 0 && this.field4850.field3143 == arg6) {
            var15 = this.field4860[arg1][arg3 + 1];
            var17 = this.field4852[arg1][arg3 + 1];
            var16 = this.field4847[arg1][arg3 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field4850.field3143;
            float var19 = (float) arg6 / (float) this.field4850.field3143;
            float var20 = this.field4860[arg1][arg3];
            float var21 = this.field4847[arg1][arg3];
            float var22 = this.field4852[arg1][arg3];
            float var23 = this.field4860[arg1 + 1][arg3];
            float var24 = this.field4847[arg1 + 1][arg3];
            float var25 = (this.field4860[arg1 + 1][arg3 + 1] - var23) * var18 + var23;
            float var26 = (this.field4847[arg1 + 1][arg3 + 1] - var24) * var18 + var24;
            float var27 = (this.field4852[arg1][arg3 + 1] - var22) * var18 + var22;
            float var28 = (this.field4847[arg1][arg3 + 1] - var21) * var18 + var21;
            float var29 = (this.field4860[arg1][arg3 + 1] - var20) * var18 + var20;
            float var30 = this.field4852[arg1 + 1][arg3];
            var15 = (var25 - var29) * var19 + var29;
            var16 = (var26 - var28) * var19 + var28;
            float var31 = (this.field4852[arg1 + 1][arg3 + 1] - var30) * var18 + var30;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field4865.field5539 - var10);
        float var33 = (float) (this.field4865.field5536 - var12);
        float var34 = (float) (this.field4865.field5541 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        if (arg4 >= -78) {
            this.method2167((short) 26, 80);
        }
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field4865.field5545;
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var39 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4865.field5542;
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field4854.field4721) {
            this.field4857.method2422((float) var10, 22553);
            this.field4857.method2422((float) var12, 22553);
            this.field4857.method2422((float) var11, 22553);
        } else {
            this.field4857.method2421((float) var10, -2062917296);
            this.field4857.method2421((float) var12, -2062917296);
            this.field4857.method2421((float) var11, -2062917296);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field4857.method228(var45, 32);
        this.field4857.method228(var46, 32);
        this.field4857.method228(var47, 32);
        this.field4857.method228(255, 32);
        this.method2167(var14, 8515);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lbf;Lah;Lof;[I)V", line = 258)
    public class350(class344 arg0, class238 arg1, class404 arg2, int[] arg3) {
        this.field4854 = arg0;
        this.field4865 = arg2;
        this.field4850 = arg1;
        int var5 = this.field4865.field5545 - (arg1.field3143 >> 1);
        this.field4851 = this.field4865.field5539 - var5 >> arg1.field3146;
        this.field4864 = this.field4865.field5539 + var5 >> arg1.field3146;
        this.field4849 = this.field4865.field5541 - var5 >> arg1.field3146;
        this.field4858 = this.field4865.field5541 + var5 >> arg1.field3146;
        int var6 = this.field4864 + 1 - this.field4851;
        int var7 = this.field4858 + 1 - this.field4849;
        this.field4847 = new float[var6 + 1][var7 + 1];
        this.field4852 = new float[var6 + 1][var7 + 1];
        this.field4860 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field4849 + var8;
            if (var9 > 0 && this.field4850.field2409 - 1 > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = var10 + this.field4851;
                    if (var11 > 0 && this.field4850.field2410 - 1 > var11) {
                        int var12 = arg1.method371(var11 + 1, var9) - arg1.method371(var11 - 1, var9);
                        int var13 = arg1.method371(var11, var9 + 1) - arg1.method371(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field4860[var10][var8] = (float) var12 * var14;
                        this.field4847[var10][var8] = var14 * -256.0F;
                        this.field4852[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field4849; var17 <= this.field4858; var17++) {
            if (var17 >= 0 && var17 < arg1.field2409) {
                for (int var18 = this.field4851; var18 <= this.field4864; var18++) {
                    if (var18 >= 0 && var18 < arg1.field2410) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field3141[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field4864 - this.field4851;
            }
        }
        if (var15 > 0) {
            this.field4856 = new class32(var15 * 2);
            this.field4857 = new class399(var15 * 16);
            this.field4848 = new class268(class100.method616(var15, true));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field4849; var23 <= this.field4858; var23++) {
                if (var23 >= 0 && var23 < arg1.field2409) {
                    int var24 = 0;
                    for (int var25 = this.field4851; var25 <= this.field4864; var25++) {
                        if (var25 >= 0 && var25 < arg1.field2410) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field3141[var25][var23];
                            int[] var28 = arg1.field3140[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method2169(var27[var29], var24, var23, var21, -128, var25, var28[var29]);
                                    }
                                } else if (var26 == 3) {
                                    this.method2169(0, var24, var23, var21, -87, var25, 0);
                                    this.method2169(arg1.field3143, var24, var23, var21, -108, var25, 0);
                                    this.method2169(0, var24, var23, var21, -103, var25, arg1.field3143);
                                } else if (var26 == 2) {
                                    this.method2169(arg1.field3143, var24, var23, var21, -121, var25, 0);
                                    this.method2169(arg1.field3143, var24, var23, var21, -84, var25, arg1.field3143);
                                    this.method2169(0, var24, var23, var21, -82, var25, 0);
                                } else if (var26 == 5) {
                                    this.method2169(arg1.field3143, var24, var23, var21, -120, var25, arg1.field3143);
                                    this.method2169(0, var24, var23, var21, -106, var25, arg1.field3143);
                                    this.method2169(arg1.field3143, var24, var23, var21, -98, var25, 0);
                                } else if (var26 == 4) {
                                    this.method2169(0, var24, var23, var21, -89, var25, arg1.field3143);
                                    this.method2169(0, var24, var23, var21, -116, var25, 0);
                                    this.method2169(arg1.field3143, var24, var23, var21, -122, var25, arg1.field3143);
                                }
                            }
                        }
                        var22++;
                        var24++;
                    }
                } else {
                    var22 += this.field4864 - this.field4851;
                }
                var21++;
            }
            this.field4859 = this.field4854.method2078(5123, this.field4856.field472, this.field4856.field456, false);
            this.field4853 = this.field4854.method2038(16, this.field4857.field472, this.field4857.field456, false);
            this.field4855 = new class366(this.field4854, this.field4853, 5126, 3, 0);
            this.field4861 = new class366(this.field4854, this.field4853, 5121, 4, 12);
        } else {
            this.field4861 = null;
            this.field4853 = null;
            this.field4855 = null;
            this.field4859 = null;
        }
        this.field4860 = this.field4847 = this.field4852 = (float[][]) null;
        this.field4856 = null;
        this.field4848 = null;
        this.field4857 = null;
    }
}
