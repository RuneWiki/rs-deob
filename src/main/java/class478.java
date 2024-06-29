import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class478 extends class107 {

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    private int field7271 = 0;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    private int field7280 = 0;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    private int field7270 = 0;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    private int field7283 = 0;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Z")
    private boolean field7286 = false;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lgca;")
    private class261 field7287;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    private int field7279;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    private int field7273;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "Lah;")
    private class406 field7288;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Z")
    private boolean field7290;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Z")
    private boolean field7295;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "Z")
    private boolean field7265;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Z")
    private boolean field7284;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field7297 = new String[] { method3657(method3656("\u001fR%lH")), method3657(method3656("\b\u001d%\n\u001d")), method3657(method3656("\u001fR%cH")), method3657(method3656("\u001dFgH")), method3657(method3656("\u001fR%b![")), method3657(method3656("\u001fR%\u0018\t\u001dZ\u007f\u001aH")), method3657(method3656("\u001fR%hH")), method3657(method3656("\u001fR%kH")), method3657(method3656("\u001fR%wH")), method3657(method3656("\u001fR%oH")), method3657(method3656("\u001fR%`![")), method3657(method3656("\u001fR%mH")), method3657(method3656("\u001fR%pH")), method3657(method3656("\u001fR%`H")), method3657(method3656("\u001fR%nH")), method3657(method3656("\u001fR%uH")), method3657(method3656("\u001fR%f![")), method3657(method3656("\u001fR%eH")), method3657(method3656("\u001fR%fH")), method3657(method3656("\u001fR%aH")), method3657(method3656("\u001fR%gH")), method3657(method3656("\u001fR%e![")) };

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field7266 = -1;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field7264 = 100;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "[[I")
    public static int[][] field7296 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IIII)V", line = 3)
    public final void method24(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field7280 = arg1;
            this.field7283 = arg2;
            this.field7270 = arg0;
            this.field7271 = arg3;
            field7291++;
            this.field7286 = this.field7270 != 0 || this.field7280 != 0 || this.field7283 != 0 || this.field7271 != 0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7297[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 17)
    public final void method25(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        try {
            field7278++;
            class615 var11 = this.field7287.method2253(-29405);
            class615 var12 = this.field7287.method2208((byte) -24);
            class22 var13 = (class22) arg7;
            class406 var14 = var13.field214;
            this.field7288.method1170(15249, this.field7290 || this.field7295 || (arg6 & 0x1) == 0 ? class494.field7430 : class585.field8484);
            this.field7287.method2272(9);
            this.field7287.method2233((byte) -35, this.field7288);
            this.field7287.method2254(1, 97);
            this.field7287.method2258(1, (byte) -107);
            if (this.field7286) {
                float var15 = (float) this.field7273 / (float) this.method26();
                float var16 = (float) this.field7279 / (float) this.method12();
                var11.method4485(0.0F, (arg2 - arg0) * var15, 50, 1.0F, 0.0F, (arg5 - arg1) * var16, 0.0F, (arg4 - arg0) * var16, 0.0F, (arg3 - arg1) * var15);
                var11.method4475((byte) 34, 0.0F, ((float) this.field7280 + arg1) * var16, ((float) this.field7270 + arg0) * var15);
            } else {
                var11.method4485(0.0F, arg2 - arg0, 116, 1.0F, 0.0F, arg5 - arg1, 0.0F, arg4 - arg0, 0.0F, arg3 - arg1);
                var11.method4475((byte) -126, 0.0F, arg1, arg0);
            }
            var12.method4486(6, this.field7288.method3173((float) this.field7279, 32263), this.field7288.method3164((float) this.field7273, false), 1.0F);
            this.field7287.method2252(class428.field6751, true);
            this.field7287.method2245(108, 1);
            this.field7287.method2233((byte) -59, var14);
            this.field7287.method2223(class734.field10762, class434.field6809, (byte) 120);
            this.field7287.method2262((byte) -73, class612.field8798, 0);
            class615 var17 = this.field7287.method2208((byte) -107);
            var17.method2461(var11);
            var17.method2480(-arg8, -arg9, 0);
            var17.method4481(var14.method3173(1.0F, 32263), (byte) -112, var14.method3164(1.0F, false), 1.0F);
            this.field7287.method2252(class428.field6751, true);
            this.field7287.method2277(12587);
            this.field7287.method2264(2);
            this.field7287.method2238(-32023);
            this.field7287.method2262((byte) -27, class339.field5532, 0);
            this.field7287.method2223(class734.field10762, class734.field10762, (byte) 102);
            this.field7287.method2233((byte) -79, null);
            this.field7287.method2245(99, 0);
            this.field7287.method2238(-32023);
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field7297[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field7297[3] : field7297[1]) + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFIIII)V", line = 72)
    public final void method17(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field7274++;
            class615 var11 = this.field7287.method2253(-29405);
            class615 var12 = this.field7287.method2208((byte) -69);
            this.field7288.method1170(15249, this.field7290 || this.field7295 || (arg9 & 0x1) == 0 ? class494.field7430 : class585.field8484);
            this.field7287.method2272(9);
            this.field7287.method2233((byte) -71, this.field7288);
            this.field7287.method2254(arg8, 127);
            this.field7287.method2258(arg6, (byte) -120);
            this.field7287.method2262((byte) -96, class119.field1723, 1);
            this.field7287.method2248((byte) -109, class119.field1723, 1);
            this.field7287.method2204(3, arg7);
            if (this.field7286) {
                float var13 = (float) this.method26();
                float var14 = (float) this.method12();
                float var15 = (arg2 - arg0) / var13;
                float var16 = (arg3 - arg1) / var13;
                float var17 = (arg4 - arg0) / var14;
                float var18 = (arg5 - arg1) / var14;
                float var19 = (float) this.field7280 * var17;
                float var20 = (float) this.field7280 * var18;
                float var21 = (float) this.field7270 * var15;
                float var22 = (float) this.field7270 * var16;
                float var23 = (float) this.field7283 * -var15;
                float var24 = (float) this.field7283 * -var16;
                float var25 = (float) this.field7271 * -var17;
                arg4 = arg4 + var21 + var25;
                arg3 = arg3 + var24 + var20;
                arg2 = arg2 + var23 + var19;
                arg0 = arg0 + var21 + var19;
                arg1 = arg1 + var22 + var20;
                float var26 = (float) this.field7271 * -var18;
                arg5 = arg5 + var22 + var26;
            }
            var11.method4485(0.0F, arg2 - arg0, 77, 1.0F, 0.0F, arg5 - arg1, 0.0F, arg4 - arg0, 0.0F, arg3 - arg1);
            var11.method4475((byte) -126, 0.0F, arg1, arg0);
            var12.method4486(6, this.field7288.method3173((float) this.field7279, 32263), this.field7288.method3164((float) this.field7273, false), 1.0F);
            this.field7287.method2252(class428.field6751, true);
            this.field7287.method2277(12587);
            this.field7287.method2264(2);
            this.field7287.method2238(-32023);
            this.field7287.method2262((byte) 68, class612.field8798, 1);
            this.field7287.method2248((byte) -109, class612.field8798, 1);
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field7297[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILpba;Lpba;)V", line = 139)
    public static final void method3650(int arg0, int arg1, int arg2, class350 arg3, class350 arg4) {
        class290 var5 = class438.method3442(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field4684 = arg3;
        var5.field4678 = arg4;
        int var6 = class757.field11125 == class740.field10902 ? 1 : 0;
        if (!arg3.method41((byte) 70)) {
            arg3.field9987 = class570.field8262[var6];
            class570.field8262[var6] = arg3;
        } else if (arg3.method45(-32768)) {
            arg3.field9987 = class50.field608[var6];
            class50.field608[var6] = arg3;
        } else {
            arg3.field9987 = class42.field476[var6];
            class42.field476[var6] = arg3;
            class540.field7961 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method41((byte) 126)) {
            if (arg4.method45(-32768)) {
                arg4.field9987 = class50.field608[var6];
                class50.field608[var6] = arg4;
                return;
            }
            arg4.field9987 = class42.field476[var6];
            class42.field476[var6] = arg4;
            class540.field7961 = true;
            return;
        }
        arg4.field9987 = class570.field8262[var6];
        class570.field8262[var6] = arg4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I", line = 200)
    public final int method7() {
        try {
            field7292++;
            return this.field7273;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7297[7] + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()I", line = 208)
    public final int method12() {
        try {
            field7275++;
            return this.field7279 + this.field7271 + this.field7280;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7297[12] + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBII)V", line = 216)
    public static final void method3651(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            field7263++;
            int var5 = 0;
            int var6 = arg3;
            int var7 = -arg3;
            if (arg2 < 89) {
                field7266 = 52;
            }
            int var8 = -1;
            class545.method4051(arg4 - arg3, arg0, arg3 + arg4, class193.field3047[arg1], -123);
            while (var6 > var5) {
                var8 += 2;
                var7 += var8;
                var5++;
                if (var7 >= 0) {
                    var6--;
                    var7 -= var6 << 1;
                    int[] var9 = class193.field3047[arg1 + var6];
                    int[] var10 = class193.field3047[arg1 - var6];
                    int var11 = arg4 + var5;
                    int var12 = arg4 - var5;
                    class545.method4051(var12, arg0, var11, var9, -106);
                    class545.method4051(var12, arg0, var11, var10, -112);
                }
                int var13 = arg4 + var6;
                int var14 = arg4 - var6;
                int[] var15 = class193.field3047[arg1 + var5];
                int[] var16 = class193.field3047[arg1 - var5];
                class545.method4051(var14, arg0, var13, var15, -114);
                class545.method4051(var14, arg0, var13, var16, -122);
            }
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field7297[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I", line = 271)
    public final int method13() {
        try {
            field7293++;
            return this.field7279;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7297[15] + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[B", line = 281)
    public static final byte[] method3652(int arg0, int arg1) {
        try {
            field7294++;
            if (arg0 != 512) {
                field7296 = null;
            }
            class546 var2 = (class546) class547.field8036.method4427(70, (long) arg1);
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg1);
                for (int var5 = 0; var5 < 255; var5++) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; var6 < 255; var6++) {
                    int var7 = 255 - var6;
                    int var8 = class235.method2039(var4, var7, arg0 - 606);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[511 - var6] = var9;
                }
                var2 = new class546(var3);
                class547.field8036.method4428((byte) 118, var2, (long) arg1);
            }
            return var2.field8032;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7297[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I)V", line = 330)
    public final void method20(int[] arg0) {
        try {
            arg0[3] = this.field7271;
            field7281++;
            arg0[0] = this.field7270;
            arg0[1] = this.field7280;
            arg0[2] = this.field7283;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7297[16] + (arg0 == null ? field7297[3] : field7297[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 348)
    public final void method14(int arg0, int arg1, int arg2) {
        try {
            field7277++;
            int[] var4 = this.field7287.method207(arg0, arg1, this.field7273, this.field7279);
            int[] var5 = new int[this.field7279 * this.field7273];
            this.field7288.method3170(10120, var5, this.field7279, this.field7273, 0, 0, 0);
            if (arg2 == 0) {
                for (int var15 = 0; var15 < this.field7279; var15++) {
                    int var16 = this.field7273 * var15;
                    for (int var17 = 0; var17 < this.field7273; var17++) {
                        var5[var16 + var17] = class553.method4099(class292.method2485(var4[var16 + var17], 939458560) << 8, class292.method2485(var5[var16 + var17], 16777215));
                    }
                }
            } else if (arg2 == 1) {
                for (int var6 = 0; var6 < this.field7279; var6++) {
                    int var7 = this.field7273 * var6;
                    for (int var8 = 0; var8 < this.field7273; var8++) {
                        var5[var7 + var8] = class553.method4099(class292.method2485(-16763714, var4[var7 + var8] << 16), class292.method2485(16777215, var5[var7 + var8]));
                    }
                }
            } else if (arg2 == 2) {
                for (int var9 = 0; var9 < this.field7279; var9++) {
                    int var10 = this.field7273 * var9;
                    for (int var11 = 0; var11 < this.field7273; var11++) {
                        var5[var10 + var11] = class553.method4099(class292.method2485(16777215, var5[var10 + var11]), class292.method2485(-14077972, var4[var10 + var11] << 24));
                    }
                }
            } else if (arg2 == 3) {
                for (int var12 = 0; var12 < this.field7279; var12++) {
                    int var13 = this.field7273 * var12;
                    for (int var14 = 0; var14 < this.field7273; var14++) {
                        var5[var13 + var14] = class553.method4099(class292.method2485(16777215, var5[var13 + var14]), var4[var13 + var14] == 0 ? 0 : -16777216);
                    }
                }
            }
            this.method3655(0, 0, this.field7273, this.field7279, var5, 0, this.field7273);
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field7297[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)V", line = 457)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field7269++;
            class615 var9 = this.field7287.method2253(-29405);
            class615 var10 = this.field7287.method2208((byte) -74);
            this.field7288.method1170(15249, this.field7290 || this.field7295 || (arg7 & 0x1) == 0 ? class494.field7430 : class585.field8484);
            this.field7287.method2272(9);
            this.field7287.method2233((byte) -30, this.field7288);
            this.field7287.method2254(arg6, 121);
            this.field7287.method2258(arg4, (byte) -127);
            this.field7287.method2262((byte) -44, class119.field1723, 1);
            this.field7287.method2248((byte) -109, class119.field1723, 1);
            this.field7287.method2204(3, arg5);
            var10.method4486(6, this.field7288.method3173((float) this.field7279, 32263), this.field7288.method3164((float) this.field7273, false), 1.0F);
            if (this.field7286) {
                arg2 = this.field7273 * arg2 / this.method26();
                arg3 = this.field7279 * arg3 / this.method12();
                arg1 += this.field7280 * arg3 / this.field7279;
                arg0 += this.field7270 * arg2 / this.field7273;
            }
            var9.method4486(6, (float) arg3, (float) arg2, 0.0F);
            var9.method2480(arg0, arg1, 0);
            this.field7287.method2252(class428.field6751, true);
            this.field7287.method2277(12587);
            this.field7287.method2264(2);
            this.field7287.method2238(-32023);
            this.field7287.method2262((byte) -50, class612.field8798, 1);
            this.field7287.method2248((byte) -109, class612.field8798, 1);
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field7297[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIII)V", line = 493)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field7268++;
            class615 var8 = this.field7287.method2253(-29405);
            class615 var9 = this.field7287.method2208((byte) -126);
            this.field7288.method1170(15249, class494.field7430);
            this.field7287.method2272(9);
            this.field7287.method2233((byte) -65, this.field7288);
            this.field7287.method2254(arg6, 126);
            this.field7287.method2258(arg4, (byte) -120);
            this.field7287.method2262((byte) 117, class119.field1723, 1);
            this.field7287.method2248((byte) -109, class119.field1723, 1);
            this.field7287.method2204(3, arg5);
            boolean var10 = this.field7284 && this.field7280 == 0 && this.field7271 == 0;
            boolean var11 = this.field7265 && this.field7270 == 0 && this.field7283 == 0;
            if (var11 & var10) {
                var9.method4486(6, this.field7288.method3173((float) arg3, 32263), this.field7288.method3164((float) arg2, false), 1.0F);
                var8.method4486(6, (float) arg3, (float) arg2, 0.0F);
                var8.method2480(arg0, arg1, 0);
                this.field7287.method2252(class428.field6751, true);
                this.field7287.method2277(12587);
                this.field7287.method2264(2);
            } else if (var11) {
                int var30 = arg1 + arg3;
                int var31 = this.method12();
                var9.method4486(6, this.field7288.method3173((float) this.field7279, 32263), this.field7288.method3164((float) arg2, false), 1.0F);
                this.field7287.method2252(class428.field6751, true);
                int var32 = this.field7280 + arg1;
                int var33 = var32 + this.field7279;
                while (var33 <= var30) {
                    var8.method4486(6, (float) this.field7279, (float) arg2, 0.0F);
                    var8.method2480(arg0, var32, 0);
                    this.field7287.method2277(12587);
                    this.field7287.method2264(2);
                    var33 += var31;
                    var32 += var31;
                }
                if (var32 < var30) {
                    int var34 = var30 - var32;
                    var9.method4486(6, this.field7288.method3173((float) var34, 32263), this.field7288.method3164((float) arg2, false), 1.0F);
                    this.field7287.method2252(class428.field6751, true);
                    var8.method4486(6, (float) var34, (float) arg2, 0.0F);
                    var8.method2480(arg0, var32, 0);
                    this.field7287.method2277(12587);
                    this.field7287.method2264(2);
                }
            } else if (var10) {
                int var25 = arg0 + arg2;
                int var26 = this.method26();
                var9.method4486(6, this.field7288.method3173((float) arg3, 32263), this.field7288.method3164((float) this.field7273, false), 1.0F);
                this.field7287.method2252(class428.field6751, true);
                int var27 = arg0 + this.field7270;
                int var28 = this.field7273 + var27;
                while (var28 <= var25) {
                    var8.method4486(6, (float) arg3, (float) this.field7273, 0.0F);
                    var8.method2480(var27, arg1, 0);
                    this.field7287.method2277(12587);
                    var28 += var26;
                    this.field7287.method2264(2);
                    var27 += var26;
                }
                if (var27 < var25) {
                    int var29 = var25 - var27;
                    var9.method4486(6, this.field7288.method3173((float) arg3, 32263), this.field7288.method3164((float) var29, false), 1.0F);
                    this.field7287.method2252(class428.field6751, true);
                    var8.method4486(6, (float) arg3, (float) var29, 0.0F);
                    var8.method2480(var27, arg1, 0);
                    this.field7287.method2277(12587);
                    this.field7287.method2264(2);
                }
            } else {
                int var12 = arg1 + arg3;
                int var13 = arg0 + arg2;
                int var14 = this.method26();
                int var15 = this.method12();
                int var16 = this.field7280 + arg1;
                int var17 = var16 + this.field7279;
                while (var17 <= var12) {
                    var9.method4486(6, this.field7288.method3173((float) this.field7279, 32263), this.field7288.method3164((float) this.field7273, false), 1.0F);
                    this.field7287.method2252(class428.field6751, true);
                    int var18 = arg0 + this.field7270;
                    int var19 = this.field7273 + var18;
                    while (var13 >= var19) {
                        var8.method4486(6, (float) this.field7279, (float) this.field7273, 0.0F);
                        var8.method2480(var18, var16, 0);
                        this.field7287.method2277(12587);
                        var19 += var14;
                        var18 += var14;
                        this.field7287.method2264(2);
                    }
                    if (var18 < var13) {
                        int var20 = var13 - var18;
                        var9.method4486(6, this.field7288.method3173((float) this.field7279, 32263), this.field7288.method3164((float) var20, false), 1.0F);
                        this.field7287.method2252(class428.field6751, true);
                        var8.method4486(6, (float) this.field7279, (float) var20, 0.0F);
                        var8.method2480(var18, var16, 0);
                        this.field7287.method2277(12587);
                        this.field7287.method2264(2);
                    }
                    var17 += var15;
                    var16 += var15;
                }
                if (var12 > var16) {
                    int var21 = var12 - var16;
                    var9.method4486(6, this.field7288.method3173((float) var21, 32263), this.field7288.method3164((float) this.field7273, false), 1.0F);
                    this.field7287.method2252(class428.field6751, true);
                    int var22 = this.field7270 + arg0;
                    int var23 = var22 + this.field7273;
                    while (var23 <= var13) {
                        var8.method4486(6, (float) var21, (float) this.field7273, 0.0F);
                        var8.method2480(var22, var16, 0);
                        this.field7287.method2277(12587);
                        this.field7287.method2264(2);
                        var23 += var14;
                        var22 += var14;
                    }
                    if (var13 > var22) {
                        int var24 = var13 - var22;
                        var9.method4486(6, this.field7288.method3173((float) var21, 32263), this.field7288.method3164((float) var24, false), 1.0F);
                        this.field7287.method2252(class428.field6751, true);
                        var8.method4486(6, (float) var21, (float) var24, 0.0F);
                        var8.method2480(var22, var16, 0);
                        this.field7287.method2277(12587);
                        this.field7287.method2264(2);
                    }
                }
            }
            this.field7287.method2238(-32023);
            this.field7287.method2262((byte) 103, class612.field8798, 1);
            this.field7287.method2248((byte) -109, class612.field8798, 1);
        } catch (RuntimeException var36) {
            throw class590.method4333(var36, field7297[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lgca;IIZ)V", line = 871)
    public class478(class261 arg0, int arg1, int arg2, boolean arg3) {
        try {
            this.field7287 = arg0;
            this.field7279 = arg2;
            this.field7273 = arg1;
            this.field7288 = arg0.method1048(arg1, class544.field8004, arg2, 34, arg3 ? class313.field5120 : class556.field8116);
            this.field7288.method3166(true, 8095, true);
            this.field7290 = arg1 != this.field7288.method3162((byte) 112);
            this.field7295 = this.field7288.method3172((byte) 110) != arg2;
            this.field7265 = !this.field7290 && this.field7288.method3163(-6990);
            this.field7284 = !this.field7295 && this.field7288.method3163(-6990);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7297[5] + (arg0 == null ? field7297[3] : field7297[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lgca;II[III)V", line = 890)
    public class478(class261 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        try {
            this.field7273 = arg1;
            this.field7279 = arg2;
            this.field7287 = arg0;
            this.field7288 = arg0.method1088(arg4, arg2, false, arg5, arg3, 3982, arg1);
            this.field7288.method3166(true, 8095, true);
            this.field7290 = arg1 != this.field7288.method3162((byte) 112);
            this.field7295 = arg2 != this.field7288.method3172((byte) 102);
            this.field7265 = !this.field7290 && this.field7288.method3163(-6990);
            this.field7284 = !this.field7295 && this.field7288.method3163(-6990);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7297[5] + (arg0 == null ? field7297[3] : field7297[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7297[3] : field7297[1]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILaa;II)V", line = 705)
    public final void method9(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        try {
            field7272++;
            class22 var6 = (class22) arg2;
            int var13 = this.field7270 + arg0;
            int var14 = this.field7280 + arg1;
            class406 var7 = var6.field214;
            this.field7288.method1170(15249, class494.field7430);
            this.field7287.method2272(9);
            this.field7287.method2233((byte) -58, this.field7288);
            this.field7287.method2254(1, 93);
            this.field7287.method2258(1, (byte) -109);
            class615 var8 = this.field7287.method2253(-29405);
            var8.method4486(6, (float) this.field7279, (float) this.field7273, 0.0F);
            var8.method2480(var13, var14, 0);
            this.field7287.method2277(12587);
            class615 var9 = this.field7287.method2208((byte) -57);
            var9.method4486(6, this.field7288.method3173((float) this.field7279, 32263), this.field7288.method3164((float) this.field7273, false), 1.0F);
            this.field7287.method2252(class428.field6751, true);
            this.field7287.method2245(51, 1);
            this.field7287.method2233((byte) -35, var7);
            this.field7287.method2223(class734.field10762, class434.field6809, (byte) 102);
            this.field7287.method2262((byte) 67, class612.field8798, 0);
            class615 var10 = this.field7287.method2208((byte) -127);
            var10.method4486(6, var7.method3173((float) this.field7279, 32263), var7.method3164((float) this.field7273, false), 1.0F);
            var10.method4475((byte) 98, 0.0F, var7.method3173((float) (var14 - arg4), 32263), var7.method3164((float) (var13 - arg3), false));
            this.field7287.method2252(class428.field6751, true);
            this.field7287.method2264(2);
            this.field7287.method2238(-32023);
            this.field7287.method2262((byte) -109, class339.field5532, 0);
            this.field7287.method2223(class734.field10762, class734.field10762, (byte) 101);
            this.field7287.method2233((byte) -55, null);
            this.field7287.method2245(117, 0);
            this.field7287.method2238(-32023);
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field7297[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7297[3] : field7297[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V", line = 749)
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field7289++;
            class615 var6 = this.field7287.method2253(-29405);
            class615 var7 = this.field7287.method2208((byte) -25);
            int var10 = this.field7270 + arg0;
            int var11 = this.field7280 + arg1;
            this.field7288.method1170(15249, class494.field7430);
            this.field7287.method2272(9);
            this.field7287.method2233((byte) -55, this.field7288);
            this.field7287.method2254(arg4, 85);
            this.field7287.method2258(arg2, (byte) -113);
            this.field7287.method2262((byte) -68, class119.field1723, 1);
            this.field7287.method2248((byte) -109, class119.field1723, 1);
            this.field7287.method2204(3, arg3);
            var6.method4486(6, (float) this.field7279, (float) this.field7273, 0.0F);
            var6.method2480(var10, var11, 0);
            var7.method4486(6, this.field7288.method3173((float) this.field7279, 32263), this.field7288.method3164((float) this.field7273, false), 1.0F);
            this.field7287.method2252(class428.field6751, true);
            this.field7287.method2277(12587);
            this.field7287.method2264(2);
            this.field7287.method2238(-32023);
            this.field7287.method2262((byte) -67, class612.field8798, 1);
            this.field7287.method2248((byte) -109, class612.field8798, 1);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7297[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIII)V", line = 788)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field7267++;
            int[] var7 = this.field7287.method207(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class553.method4099(var7[var8], -16777216);
                }
                this.method3655(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7297[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 810)
    public static void method3653(int arg0) {
        try {
            field7296 = null;
            if (arg0 <= 4) {
                method3653(31);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7297[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()I", line = 825)
    public final int method26() {
        try {
            field7282++;
            return this.field7283 + this.field7273 + this.field7270;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7297[8] + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZII)V", line = 839)
    public static final void method3654(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        try {
            if (class546.field8030 <= arg4 && arg2 <= class779.field11374 && arg5 >= class310.field5088 && field7264 >= arg1) {
                class664.method4819(arg4, arg0, (byte) -90, arg5, arg1, arg2);
            } else {
                class535.method3988(arg2, arg4, arg0, 10, arg5, arg1);
            }
            field7285++;
            if (arg3) {
                field7296 = null;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7297[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[III)V", line = 856)
    private final void method3655(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        try {
            this.field7288.method3169(arg1, arg5, arg3, arg4, arg6, (byte) 120, arg2, arg0);
            field7276++;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7297[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field7297[3] : field7297[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3656(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!la", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3657(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
