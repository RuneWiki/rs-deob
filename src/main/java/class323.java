import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class323 extends class42 {

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Lor;")
    private class451 field4233;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "Lbo;")
    private class511 field4247;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Lui;")
    private class151 field4242;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    private int field4254;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "[[F")
    private float[][] field4249;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "[[F")
    private float[][] field4252;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "[[F")
    private float[][] field4246;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lmd;")
    private class379 field4230;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "Lmm;")
    private class182 field4250;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Lub;")
    private class18 field4234;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "Lgb;")
    private class142 field4248;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "Lrg;")
    private class453 field4245;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Lgs;")
    private class34 field4232;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "Lgs;")
    private class34 field4240;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Z")
    public static volatile boolean field4235 = true;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lvj;")
    public static class304 field4229 = new class304("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "Lvj;")
    public static class304 field4257;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    private int field4231;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    private int field4241;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILqa;)V")
    public static final void method1860(int arg0, class162 arg1) {
        field4256++;
        int var2 = 36 / ((arg0 - 51) / 55);
        if (class473.field6514 != class385.field5232.field573 && class497.field6886 != null && class335.method1916(arg1, 0, class385.field5232.field573)) {
            class473.field6514 = class385.field5232.field573;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[B")
    public static final byte[] method1861(int arg0, int arg1) {
        field4238++;
        class266 var2 = (class266) class111.field1590.method1515(0, (long) arg1);
        if (arg0 != 255) {
            method1863(-128, null, -78, (byte) 51, -19, 13);
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class363.method2116(var7, var4, true);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class266(var3);
            class111.field1590.method1518(var2, (byte) 123, (long) arg1);
        }
        return var2.field3509;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1862(int arg0) {
        field4257 = null;
        if (arg0 != -11711256) {
            field4257 = null;
        }
        field4229 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1863(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class39.field603++;
        class363.field4921 = 0;
        for (int var6 = class71.field1089; var6 < class508.field7055; var6++) {
            class409[][] var17 = class497.field6886[var6];
            for (int var18 = class414.field5728; var18 < class260.field3439; var18++) {
                for (int var19 = class65.field1017; var19 < class380.field5200; var19++) {
                    class409 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class461.field6365[var18 + class22.field388 - class95.field1428][var19 + class22.field388 - class259.field3429] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field5614 = true;
                            var20.field5629 = true;
                            if (var20.field5630 == null) {
                                var20.field5626 = false;
                            } else {
                                var20.field5626 = true;
                            }
                            class363.field4921++;
                        } else {
                            var20.field5614 = false;
                            var20.field5629 = false;
                            var20.field5606 = 0;
                            if (var18 >= class95.field1428 - 16 && var18 <= class95.field1428 + 16 && var19 >= class259.field3429 - 16 && var19 <= class259.field3429 + 16 && (var20.field5627 != null || var20.field5607 != null || var20.field5625 != null || var20.field5628 != null || var20.field5618 != null || var20.field5630 != null)) {
                                class399.field5370.method1046(29736, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class37.field582 == class141.field2049;
        for (int var8 = class71.field1089; var8 < class508.field7055; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class280.field3693.method627() && var8 >= arg2 && arg1 != null) {
                int var10 = class461.field6365.length;
                if (class461.field6365.length + class414.field5728 > class439.field6036) {
                    var10 -= class461.field6365.length + class414.field5728 - class439.field6036;
                }
                int var11 = class461.field6365[0].length;
                if (class461.field6365[0].length + class65.field1017 > class318.field4170) {
                    var11 -= class461.field6365[0].length + class65.field1017 - class318.field4170;
                }
                int var12 = class61.field959;
                while (true) {
                    if (var12 >= var10) {
                        class399.field5370.method1047(var8, var9, true, class141.field2049[var8], 0);
                        break;
                    }
                    int var13 = class414.field5728 + var12 - class61.field959;
                    for (int var14 = class260.field3431; var14 < var11; var14++) {
                        class245.field3273[var12][var14] = false;
                        if (class461.field6365[var12][var14]) {
                            int var15 = class65.field1017 + var14 - class260.field3431;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class497.field6886[var16][var13][var15] != null && class497.field6886[var16][var13][var15].field5620 == var8) {
                                    class245.field3273[var12][var14] = class497.field6886[var16][var13][var15].field5614;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class399.field5370.method1047(var8, var9, false, class141.field2049[var8], 0);
            }
            class399.field5370.method1039((byte) 74);
        }
        if (!class48.method364(true)) {
            class48.method364(false);
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Ljr;")
    public static final class72 method1864(int arg0) {
        field4236++;
        try {
            return new class502();
        } catch (Throwable var2) {
            if (arg0 != 0) {
                method1860(56, null);
            }
            try {
                return (class72) Class.forName("jf").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class459();
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[[ZBI)V")
    public final void method1865(int arg0, int arg1, boolean[][] arg2, byte arg3, int arg4) {
        field4243++;
        if (this.field4248 == null || (arg1 + arg0) < this.field4239 || (arg1 - arg0) > this.field4254 || this.field4251 > arg0 + arg4 || this.field4237 < arg4 - arg0) {
            return;
        }
        int var6 = this.field4251;
        if (arg3 > -107) {
            field4235 = true;
        }
        while (var6 <= this.field4237) {
            for (int var7 = this.field4239; var7 <= this.field4254; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg4;
                if (var8 > -arg0 && arg0 > var8 && (-arg0) < var9 && var9 < arg0 && arg2[var8 + arg0][arg0 + var9]) {
                    this.field4247.method2986((int) (this.field4233.method2580((byte) -117) * 255.0F) << 24, (byte) -58);
                    this.field4247.method2975(null, this.field4232, null, this.field4240, -101);
                    this.field4247.method2971(0, this.field4241, this.field4248, 7629, 4);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(SI)V")
    private final void method1866(short arg0, int arg1) {
        field4244++;
        if (this.field4247.field7493) {
            this.field4230.method2246(arg0, (byte) -96);
        } else {
            this.field4230.method2215(arg0, (byte) 54);
        }
        if (arg1 != 0) {
            method1867(-16, -53, 104);
        }
        this.field4241++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
    public static final void method1867(int arg0, int arg1, int arg2) {
        field4253++;
        class253 var3 = class332.method1911(arg1, (byte) 102, arg0);
        var3.method1522(0);
        var3.field3356 = arg2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)V")
    private final void method1868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4255++;
        long var8 = -1L;
        int var10 = (arg6 << this.field4242.field558) + arg4;
        int var11 = (arg5 << this.field4242.field558) + arg1;
        int var12 = this.field4242.method276(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class42 var13 = this.field4234.method182(var8, (byte) 72);
            if (var13 != null) {
                this.method1866(((class367) var13).field4960, 0);
                return;
            }
        }
        short var14 = (short) (this.field4231++);
        if (var8 != -1L) {
            this.field4234.method173(var8, new class367(var14), (byte) 121);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg1 == 0) {
            var15 = this.field4252[arg2][arg0];
            var16 = this.field4249[arg2][arg0];
            var17 = this.field4246[arg2][arg0];
        } else if (this.field4242.field555 == arg4 && arg1 == 0) {
            var15 = this.field4252[arg2 + 1][arg0];
            var16 = this.field4249[arg2 + 1][arg0];
            var17 = this.field4246[arg2 + 1][arg0];
        } else if (this.field4242.field555 == arg4 && this.field4242.field555 == arg1) {
            var15 = this.field4252[arg2 + 1][arg0 + 1];
            var17 = this.field4246[arg2 + 1][arg0 + 1];
            var16 = this.field4249[arg2 + 1][arg0 + 1];
        } else if (arg4 == 0 && this.field4242.field555 == arg1) {
            var16 = this.field4249[arg2][arg0 + 1];
            var15 = this.field4252[arg2][arg0 + 1];
            var17 = this.field4246[arg2][arg0 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field4242.field555;
            float var19 = (float) arg1 / (float) this.field4242.field555;
            float var20 = this.field4252[arg2][arg0];
            float var21 = this.field4249[arg2][arg0];
            float var22 = this.field4246[arg2][arg0];
            float var23 = this.field4252[arg2 + 1][arg0];
            float var24 = this.field4249[arg2 + 1][arg0];
            float var25 = (this.field4252[arg2][arg0 + 1] - var20) * var18 + var20;
            float var26 = this.field4246[arg2 + 1][arg0];
            float var27 = (this.field4249[arg2][arg0 + 1] - var21) * var18 + var21;
            float var28 = (this.field4252[arg2 + 1][arg0 + 1] - var23) * var18 + var23;
            float var29 = (this.field4249[arg2 + 1][arg0 + 1] - var24) * var18 + var24;
            float var30 = (this.field4246[arg2][arg0 + 1] - var22) * var18 + var22;
            var15 = (var28 - var25) * var19 + var25;
            var16 = (var29 - var27) * var19 + var27;
            float var31 = (this.field4246[arg2 + 1][arg0 + 1] - var26) * var18 + var26;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field4233.method2577((byte) -51) - var10);
        float var33 = (float) (this.field4233.method2581(28) - var12);
        float var34 = (float) (this.field4233.method2582((byte) 70) - var11);
        int var35 = 124 / ((arg3 + 1) / 60);
        float var36 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var37 = 1.0F / var36;
        float var38 = var34 * var37;
        float var39 = var33 * var37;
        float var40 = var32 * var37;
        float var41 = var36 / (float) this.field4233.method2578(22477);
        float var42 = 1.0F - (var41 * var41);
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var17 * var38 + var15 * var40 + var16 * var39;
        if (var43 < 0.0F) {
            var43 = 0.0F;
        }
        float var44 = var42 * var43 * 2.0F;
        if (var44 > 1.0F) {
            var44 = 1.0F;
        }
        int var45 = this.field4233.method2579(105);
        int var46 = (int) ((float) ((var45 & 0xFFC612) >> 16) * var44);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) ((var45 & 0xFF44) >> 8) * var44);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var44);
        if (this.field4247.field7493) {
            this.field4250.method1194((byte) 98, (float) var10);
            this.field4250.method1194((byte) 111, (float) var12);
            this.field4250.method1194((byte) 106, (float) var11);
        } else {
            this.field4250.method1197(1495637648, (float) var10);
            this.field4250.method1197(1495637648, (float) var12);
            this.field4250.method1197(1495637648, (float) var11);
        }
        if (var48 > 255) {
            var48 = 255;
        }
        this.field4250.method2200(7, var46);
        this.field4250.method2200(7, var47);
        this.field4250.method2200(7, var48);
        this.field4250.method2200(7, 255);
        this.method1866(var14, 0);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lbo;Lui;Lor;[I)V")
    public class323(class511 arg0, class151 arg1, class451 arg2, int[] arg3) {
        this.field4233 = arg2;
        this.field4247 = arg0;
        this.field4242 = arg1;
        int var5 = this.field4233.method2578(22477) - (arg1.field555 >> 1);
        this.field4239 = this.field4233.method2577((byte) -114) - var5 >> arg1.field558;
        this.field4254 = this.field4233.method2577((byte) -85) + var5 >> arg1.field558;
        this.field4251 = this.field4233.method2582((byte) 70) - var5 >> arg1.field558;
        this.field4237 = var5 + this.field4233.method2582((byte) 70) >> arg1.field558;
        int var6 = this.field4254 - (this.field4239 - 1);
        int var7 = this.field4237 + 1 - this.field4251;
        this.field4249 = new float[var6 + 1][var7 + 1];
        this.field4252 = new float[var6 + 1][var7 + 1];
        this.field4246 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field4251 + var8;
            if (var24 > 0 && (this.field4242.field559 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field4239;
                    if (var26 > 0 && (this.field4242.field557 - 1) > var26) {
                        int var27 = arg1.method272(var26 + 1, var24) - arg1.method272(var26 - 1, var24);
                        int var28 = arg1.method272(var26, var24 + 1) - arg1.method272(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536)));
                        this.field4252[var25][var8] = (float) var27 * var29;
                        this.field4249[var25][var8] = var29 * -256.0F;
                        this.field4246[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field4251; var11 <= this.field4237; var11++) {
            if (var11 >= 0 && var11 < arg1.field559) {
                for (int var21 = this.field4239; var21 <= this.field4254; var21++) {
                    if (var21 >= 0 && var21 < arg1.field557) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field2171[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field4254 - this.field4239;
            }
        }
        if (var9 > 0) {
            this.field4230 = new class379(var9 * 2);
            this.field4250 = new class182(var9 * 16);
            this.field4234 = new class18(class321.method1857((byte) 113, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field4251; var14 <= this.field4237; var14++) {
                if (var14 >= 0 && arg1.field559 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field4239; var16 <= this.field4254; var16++) {
                        if (var16 >= 0 && arg1.field557 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field2171[var16][var14];
                            int[] var19 = arg1.field2159[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1868(var12, var19[var20], var15, 60, var18[var20], var14, var16);
                                    }
                                } else if (var17 == 3) {
                                    this.method1868(var12, 0, var15, -119, 0, var14, var16);
                                    this.method1868(var12, 0, var15, -61, arg1.field555, var14, var16);
                                    this.method1868(var12, arg1.field555, var15, 107, 0, var14, var16);
                                } else if (var17 == 2) {
                                    this.method1868(var12, 0, var15, -79, arg1.field555, var14, var16);
                                    this.method1868(var12, arg1.field555, var15, -96, arg1.field555, var14, var16);
                                    this.method1868(var12, 0, var15, -69, 0, var14, var16);
                                } else if (var17 == 5) {
                                    this.method1868(var12, arg1.field555, var15, -126, arg1.field555, var14, var16);
                                    this.method1868(var12, arg1.field555, var15, -118, 0, var14, var16);
                                    this.method1868(var12, 0, var15, -63, arg1.field555, var14, var16);
                                } else if (var17 == 4) {
                                    this.method1868(var12, arg1.field555, var15, -128, 0, var14, var16);
                                    this.method1868(var12, 0, var15, -110, 0, var14, var16);
                                    this.method1868(var12, arg1.field555, var15, -71, arg1.field555, var14, var16);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field4254 - this.field4239;
                }
                var12++;
            }
            this.field4248 = this.field4247.method2957(true, this.field4230.field5152, this.field4230.field5173, 5123, false);
            this.field4245 = this.field4247.method2999(16, -128, false, this.field4250.field5173, this.field4250.field5152);
            this.field4232 = new class34(this.field4247, this.field4245, 5126, 3, 0);
            this.field4240 = new class34(this.field4247, this.field4245, 5121, 4, 12);
        } else {
            this.field4240 = null;
            this.field4245 = null;
            this.field4232 = null;
            this.field4248 = null;
        }
        this.field4252 = this.field4249 = this.field4246 = null;
        this.field4230 = null;
        this.field4250 = null;
        this.field4234 = null;
    }

    static {
        new class304("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field4257 = new class304("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }
}
