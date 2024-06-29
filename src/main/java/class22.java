import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 extends class320 {

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "Lfk;")
    private class462 field444;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "Lsi;")
    private class390 field452;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "Lvj;")
    private class303 field446;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "[[F")
    private float[][] field435;

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "[[F")
    private float[][] field460;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "[[F")
    private float[][] field440;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "Lnh;")
    private class525 field436;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "Lkd;")
    private class184 field454;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "Lu;")
    private class52 field450;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "Lkd;")
    private class184 field451;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "Lcu;")
    private class145 field442;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "Lht;")
    private class409 field432;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "Lan;")
    private class20 field433;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "Liv;")
    public static class64 field457 = new class64(77, 8);

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "[[Lmq;")
    public static class350[][] field438;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public static void method180(byte arg0) {
        field457 = null;
        if (arg0 == 75) {
            field438 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method181(String arg0, byte arg1) {
        field439++;
        if (arg0 == null || arg1 < 53) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class33.method351(arg0, -69);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class184.field2756; var3++) {
            String var4 = class436.field6504[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class33.method351(var4, -118);
            if (var5 != null && var5.equals(var2)) {
                class184.field2756--;
                for (int var6 = var3; var6 < class184.field2756; var6++) {
                    class436.field6504[var6] = class436.field6504[var6 + 1];
                    class208.field3014[var6] = class208.field3014[var6 + 1];
                    class338.field5098[var6] = class338.field5098[var6 + 1];
                    class255.field3654[var6] = class255.field3654[var6 + 1];
                    class526.field7778[var6] = class526.field7778[var6 + 1];
                    class284.field4054[var6] = class284.field4054[var6 + 1];
                }
                class242.field3491++;
                class85.field1475 = class431.field6404;
                class28.method321(class127.field2026, -5001);
                class410.field6141.method1109(false, class217.method1444(arg0, -122));
                class410.field6141.method1089((byte) -89, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZIIII)V")
    private final void method182(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field455++;
        long var8 = -1L;
        int var10 = (arg6 << this.field452.field679) + arg4;
        int var11 = (arg0 << this.field452.field679) + arg3;
        int var12 = this.field452.method371(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class320 var13 = this.field433.method171((byte) 38, var8);
            if (var13 != null) {
                this.method184((byte) 119, ((class420) var13).field6282);
                return;
            }
        }
        short var14 = (short) (this.field456++);
        if (var8 != -1L) {
            this.field433.method166(new class420(var14), var8, -128);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg3 == 0) {
            var15 = this.field440[arg5][arg1];
            var16 = this.field460[arg5][arg1];
            var17 = this.field435[arg5][arg1];
        } else if (this.field452.field676 == arg4 && arg3 == 0) {
            var16 = this.field460[arg5 + 1][arg1];
            var17 = this.field435[arg5 + 1][arg1];
            var15 = this.field440[arg5 + 1][arg1];
        } else if (this.field452.field676 == arg4 && this.field452.field676 == arg3) {
            var17 = this.field435[arg5 + 1][arg1 + 1];
            var16 = this.field460[arg5 + 1][arg1 + 1];
            var15 = this.field440[arg5 + 1][arg1 + 1];
        } else if (arg4 == 0 && this.field452.field676 == arg3) {
            var16 = this.field460[arg5][arg1 + 1];
            var17 = this.field435[arg5][arg1 + 1];
            var15 = this.field440[arg5][arg1 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field452.field676;
            float var19 = (float) arg3 / (float) this.field452.field676;
            float var20 = this.field460[arg5][arg1];
            float var21 = this.field440[arg5][arg1];
            float var22 = this.field435[arg5][arg1];
            float var23 = this.field460[arg5 + 1][arg1];
            float var24 = this.field440[arg5 + 1][arg1];
            float var25 = this.field435[arg5 + 1][arg1];
            float var26 = (this.field440[arg5][arg1 + 1] - var21) * var18 + var21;
            float var27 = (this.field460[arg5 + 1][arg1 + 1] - var23) * var18 + var23;
            float var28 = (this.field460[arg5][arg1 + 1] - var20) * var18 + var20;
            float var29 = (this.field435[arg5][arg1 + 1] - var22) * var18 + var22;
            float var30 = (this.field440[arg5 + 1][arg1 + 1] - var24) * var18 + var24;
            var16 = (var27 - var28) * var19 + var28;
            float var31 = (this.field435[arg5 + 1][arg1 + 1] - var25) * var18 + var25;
            var15 = (var30 - var26) * var19 + var26;
            var17 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field444.method2752(-25273) - var10);
        float var33 = (float) (this.field444.method2746((byte) -126) - var12);
        float var34 = (float) (this.field444.method2744(-254) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field444.method2749((byte) -115);
        float var41 = 1.0F - (var40 * var40);
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
        int var44 = this.field444.method2750(arg2);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field446.field4599) {
            this.field432.method2489((float) var10, 24204);
            this.field432.method2489((float) var12, 24204);
            this.field432.method2489((float) var11, 24204);
        } else {
            this.field432.method2487(986946216, (float) var10);
            this.field432.method2487(986946216, (float) var12);
            this.field432.method2487(986946216, (float) var11);
        }
        this.field432.method1109(!arg2, var45);
        this.field432.method1109(false, var46);
        this.field432.method1109(!arg2, var47);
        this.field432.method1109(!arg2, 255);
        this.method184((byte) 117, var14);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI)Z")
    public static final boolean method183(int arg0, byte arg1, int arg2) {
        field445++;
        if (arg1 != -126) {
            method180((byte) -112);
        }
        return class53.method472(-1, arg2, arg0) | (arg2 & 0x70000) != 0 || class33.method350((byte) 68, arg0, arg2);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BS)V")
    private final void method184(byte arg0, short arg1) {
        field453++;
        if (this.field446.field4599) {
            this.field442.method1094(1618659784, arg1);
        } else {
            this.field442.method1066(-2012325976, arg1);
        }
        this.field449++;
        if (arg0 < 49) {
            this.field440 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([[ZIIII)V")
    public final void method185(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field437++;
        if (this.field450 == null || arg1 + arg3 < this.field441 || this.field434 < (arg1 - arg3) || this.field443 > arg3 + arg4 || this.field447 < (arg4 - arg3)) {
            return;
        }
        int var6 = this.field443;
        if (arg2 != 27964) {
            this.field456 = 127;
        }
        while (this.field447 >= var6) {
            for (int var7 = this.field441; var7 <= this.field434; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg4;
                if (var8 > -arg3 && var8 < arg3 && var9 > -arg3 && var9 < arg3 && arg0[var8 + arg3][arg3 + var9]) {
                    this.field446.method1953(-28487, (int) (this.field444.method2748(true) * 255.0F) << 24);
                    this.field446.method1982(this.field451, null, this.field454, null, arg2 ^ 0x6D25);
                    this.field446.method1988(this.field449, this.field450, 0, false, 4);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lvj;Lsi;Lfk;[I)V")
    public class22(class303 arg0, class390 arg1, class462 arg2, int[] arg3) {
        this.field444 = arg2;
        this.field452 = arg1;
        this.field446 = arg0;
        int var5 = this.field444.method2749((byte) -120) - (arg1.field676 >> 1);
        this.field441 = this.field444.method2752(-25273) - var5 >> arg1.field679;
        this.field434 = this.field444.method2752(-25273) + var5 >> arg1.field679;
        this.field443 = this.field444.method2744(-254) - var5 >> arg1.field679;
        this.field447 = var5 + this.field444.method2744(-254) >> arg1.field679;
        int var6 = this.field434 + 1 - this.field441;
        int var7 = this.field447 - (this.field443 - 1);
        this.field435 = new float[var6 + 1][var7 + 1];
        this.field460 = new float[var6 + 1][var7 + 1];
        this.field440 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field443 + var8;
            if (var24 > 0 && (this.field452.field678 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field441;
                    if (var26 > 0 && var26 < (this.field452.field673 - 1)) {
                        int var27 = arg1.method376(var26 + 1, var24) - arg1.method376(var26 - 1, var24);
                        int var28 = arg1.method376(var26, var24 + 1) - arg1.method376(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + var28 * var28 + 65536)));
                        this.field460[var25][var8] = (float) var27 * var29;
                        this.field440[var25][var8] = var29 * -256.0F;
                        this.field435[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field443; var11 <= this.field447; var11++) {
            if (var11 >= 0 && var11 < arg1.field678) {
                for (int var21 = this.field441; var21 <= this.field434; var21++) {
                    if (var21 >= 0 && arg1.field673 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field5882[var21][var11];
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
                var10 += this.field434 - this.field441;
            }
        }
        if (var9 <= 0) {
            this.field436 = null;
            this.field454 = null;
            this.field450 = null;
            this.field451 = null;
        } else {
            this.field442 = new class145(var9 * 2);
            this.field432 = new class409(var9 * 16);
            this.field433 = new class20(class51.method464(1905326856, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field443; var14 <= this.field447; var14++) {
                if (var14 >= 0 && arg1.field678 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field441; var16 <= this.field434; var16++) {
                        if (var16 >= 0 && arg1.field673 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field5882[var16][var14];
                            int[] var19 = arg1.field5895[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method182(var14, var12, true, var19[var20], var18[var20], var15, var16);
                                    }
                                } else if (var17 == 3) {
                                    this.method182(var14, var12, true, 0, 0, var15, var16);
                                    this.method182(var14, var12, true, 0, arg1.field676, var15, var16);
                                    this.method182(var14, var12, true, arg1.field676, 0, var15, var16);
                                } else if (var17 == 2) {
                                    this.method182(var14, var12, true, 0, arg1.field676, var15, var16);
                                    this.method182(var14, var12, true, arg1.field676, arg1.field676, var15, var16);
                                    this.method182(var14, var12, true, 0, 0, var15, var16);
                                } else if (var17 == 5) {
                                    this.method182(var14, var12, true, arg1.field676, arg1.field676, var15, var16);
                                    this.method182(var14, var12, true, arg1.field676, 0, var15, var16);
                                    this.method182(var14, var12, true, 0, arg1.field676, var15, var16);
                                } else if (var17 == 4) {
                                    this.method182(var14, var12, true, arg1.field676, 0, var15, var16);
                                    this.method182(var14, var12, true, 0, 0, var15, var16);
                                    this.method182(var14, var12, true, arg1.field676, arg1.field676, var15, var16);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field434 - this.field441;
                }
                var12++;
            }
            this.field450 = this.field446.method1920(this.field442.field2289, this.field442.field2270, false, 255, 5123);
            this.field436 = this.field446.method1946(false, this.field432.field2289, this.field432.field2270, 16, 4564);
            this.field454 = new class184(this.field436, 5126, 3, 0);
            this.field451 = new class184(this.field436, 5121, 4, 12);
        }
        this.field432 = null;
        this.field442 = null;
        this.field433 = null;
        this.field460 = this.field440 = this.field435 = null;
    }
}
