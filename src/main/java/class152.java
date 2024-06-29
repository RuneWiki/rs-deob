import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class152 extends class17 {

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    private int field2748 = 1024;

    @OriginalMember(owner = "client!di", name = "pb", descriptor = "I")
    private int field2760 = 0;

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "I")
    private int field2751 = 819;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    private int field2746 = 0;

    @OriginalMember(owner = "client!di", name = "qb", descriptor = "I")
    private int field2761 = 1024;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "I")
    private int field2747 = 409;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
    private int field2750 = 2048;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    private int field2749 = 1024;

    @OriginalMember(owner = "client!di", name = "jb", descriptor = "I")
    private int field2754 = 1024;

    @OriginalMember(owner = "client!di", name = "ob", descriptor = "[I")
    public static int[] field2759 = new int[32];

    @OriginalMember(owner = "client!di", name = "sb", descriptor = "Z")
    public static boolean field2763;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!di", name = "ib", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!di", name = "kb", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!di", name = "mb", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!di", name = "nb", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!di", name = "rb", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!di", name = "lb", descriptor = "Lik;")
    public static class262 field2756;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIB[[IILjava/util/Random;)V", line = 6)
    private final void method1072(int arg0, int arg1, int arg2, byte arg3, int[][] arg4, int arg5, Random arg6) {
        field2752++;
        int var8 = this.field2749 <= 0 ? 4096 : 4096 - class109.method792(arg3 ^ 0x2BD5, arg6, this.field2749);
        int var9 = this.field2761 * this.field2755 >> 12;
        if (arg3 != -80) {
            this.method116(false);
        }
        int var10 = this.field2755 - (var9 <= 0 ? 0 : class109.method792(-11163, arg6, var9));
        if (class116.field2008 <= arg1) {
            arg1 -= class116.field2008;
        }
        if (var10 > 0) {
            if (arg2 <= 0 || arg0 <= 0) {
                return;
            }
            int var15 = arg0 / 2;
            int var16 = arg2 / 2;
            int var17 = var10 > var15 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg0 - var17 * 2;
            int var20 = arg1 + var17;
            for (int var21 = 0; var21 < arg2; var21++) {
                int[] var22 = arg4[arg5 + var21];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field2746 == 0) {
                        for (int var26 = 0; var26 < var17; var26++) {
                            int var27 = var8 * var26 / var17;
                            var22[class162.method1118(arg1 + var26, class249.field4327)] = var22[class162.method1118(arg1 + arg0 - var26 - 1, class249.field4327)] = var23 * var27 >> 12;
                        }
                    } else {
                        for (int var24 = 0; var24 < var17; var24++) {
                            int var25 = var8 * var24 / var17;
                            var22[class162.method1118(arg1 + var24, class249.field4327)] = var22[class162.method1118(class249.field4327, arg1 - (1 - arg0) - var24)] = var25 >= var23 ? var23 : var25;
                        }
                    }
                    if ((var20 + var19) <= class116.field2008) {
                        class23.method155(var22, var20, var19, var23);
                    } else {
                        int var28 = class116.field2008 - var20;
                        class23.method155(var22, var20, var28, var23);
                        class23.method155(var22, 0, var19 - var28, var23);
                    }
                } else {
                    int var29 = arg2 - var21 - 1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field2746 == 0) {
                            for (int var31 = 0; var31 < var17; var31++) {
                                int var32 = var8 * var31 / var17;
                                var22[class162.method1118(arg1 + var31, class249.field4327)] = var22[class162.method1118(class249.field4327, arg0 + arg1 - var31 - 1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; var33++) {
                                int var34 = var8 * var33 / var17;
                                var22[class162.method1118(class249.field4327, arg1 + var33)] = var22[class162.method1118(class249.field4327, arg0 + arg1 - (var33 + 1))] = var34 < var30 ? var34 : var30;
                            }
                        }
                        if (var20 + var19 > class116.field2008) {
                            int var35 = class116.field2008 - var20;
                            class23.method155(var22, var20, var35, var30);
                            class23.method155(var22, 0, var19 - var35, var30);
                        } else {
                            class23.method155(var22, var20, var19, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; var36++) {
                            var22[class162.method1118(class249.field4327, arg1 + var36)] = var22[class162.method1118(class249.field4327, arg1 + arg0 - var36 - 1)] = var8 * var36 / var17;
                        }
                        if (class116.field2008 < (var19 + var20)) {
                            int var37 = class116.field2008 - var20;
                            class23.method155(var22, var20, var37, var8);
                            class23.method155(var22, 0, var19 - var37, var8);
                        } else {
                            class23.method155(var22, var20, var19, var8);
                        }
                    }
                }
            }
        } else if (class116.field2008 < (arg0 + arg1)) {
            int var11 = class116.field2008 - arg1;
            for (int var12 = 0; var12 < arg2; var12++) {
                int[] var13 = arg4[arg5 + var12];
                class23.method155(var13, arg1, var11, var8);
                class23.method155(var13, 0, arg0 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg2; var14++) {
                class23.method155(arg4[arg5 + var14], arg1, arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIZ)V", line = 200)
    public static final void method1073(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class320.field5489 = arg1;
        class325.field5535 = arg2;
        class288.field5040 = arg3;
        class303.field5269 = new class74[arg0][class320.field5489][class325.field5535];
        class104.field1809 = new int[arg0][class320.field5489 + 1][class325.field5535 + 1];
        if (class231.field4051) {
            class295.field5149 = new class133[4][];
        }
        if (arg4) {
            class206.field3701 = new class74[1][class320.field5489][class325.field5535];
            class182.field3355 = new int[class320.field5489][class325.field5535];
            class105.field1819 = new int[1][class320.field5489 + 1][class325.field5535 + 1];
            if (class231.field4051) {
                class200.field3623 = new class133[1][];
            }
        } else {
            class206.field3701 = (class74[][][]) null;
            class182.field3355 = (int[][]) null;
            class105.field1819 = (int[][][]) null;
            class200.field3623 = (class133[][]) null;
        }
        class1.method2(false);
        class285.field4985 = new class92[500];
        class145.field2621 = 0;
        class247.field4292 = new class92[500];
        class227.field3986 = 0;
        class168.field3023 = new int[arg0][class320.field5489 + 1][class325.field5535 + 1];
        class182.field3349 = new class326[5000];
        class74.field1146 = 0;
        class72.field1098 = new class326[100];
        class78.field1179 = new boolean[class288.field5040 + class288.field5040 + 1][class288.field5040 + class288.field5040 + 1];
        class211.field3773 = new boolean[class288.field5040 + class288.field5040 + 2][class288.field5040 + class288.field5040 + 2];
        class311.field5382 = new byte[arg0][class320.field5489][class325.field5535];
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)V", line = 242)
    public final void method116(boolean arg0) {
        field2745++;
        if (!arg0) {
            this.field2750 = 110;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLrm;I)V", line = 254)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            this.field2750 = 68;
        }
        if (arg2 == 0) {
            this.field2760 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field2754 = arg1.method1712(arg0 + 113);
        } else if (arg2 == 2) {
            this.field2750 = arg1.method1712(arg0 ^ 0x71);
        } else if (arg2 == 3) {
            this.field2747 = arg1.method1712(-1);
        } else if (arg2 == 4) {
            this.field2751 = arg1.method1712(arg0 ^ 0x71);
        } else if (arg2 == 5) {
            this.field2748 = arg1.method1712(-1);
        } else if (arg2 == 6) {
            this.field2746 = arg1.method1731(true);
        } else if (arg2 == 7) {
            this.field2761 = arg1.method1712(arg0 ^ 0x71);
        } else if (arg2 == 8) {
            this.field2749 = arg1.method1712(-1);
        }
        field2753++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)Leg;", line = 346)
    public static final class305 method1074(byte arg0, int arg1) {
        field2758++;
        class305 var2 = (class305) class317.field5451.method642((long) arg1, (byte) -126);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 86) {
            return (class305) null;
        } else {
            byte[] var3 = class233.field4123.method1868(12236, class255.method1796(-112, arg1), class64.method446(arg1, 118));
            class305 var4 = new class305();
            var4.field5309 = arg1;
            if (var3 != null) {
                var4.method2141(-1, new class249(var3));
            }
            class317.field5451.method643((byte) -49, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 369)
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(II)[I", line = 377)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            return (int[]) null;
        }
        field2762++;
        int[] var3 = this.field217.method1698(-54, arg1);
        if (!this.field217.field4295) {
            return var3;
        }
        int[][] var4 = this.field217.method1695(0);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = true;
        int var12 = 0;
        int var13 = class116.field2008 * this.field2754 >> 12;
        int var14 = class289.field5059 * this.field2747 >> 12;
        int var15 = 0;
        int var16 = class116.field2008 * this.field2750 >> 12;
        int var17 = class289.field5059 * this.field2751 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        int var18 = class116.field2008 / var13 + 1;
        this.field2755 = class116.field2008 / 8 * this.field2748 >> 12;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field2760);
        while (true) {
            while (true) {
                int var22 = class109.method792(-11163, var21, var16 - var13) + var13;
                int var23 = var10 + var22;
                int var24 = class109.method792(-11163, var21, var17 - var14) + var14;
                if (class116.field2008 < var23) {
                    var23 = class116.field2008;
                    var22 = class116.field2008 - var10;
                }
                int var30;
                if (var11) {
                    var30 = 0;
                } else {
                    int var25 = var8;
                    int var26 = 0;
                    int var27 = var5 + var23;
                    if (var27 < 0) {
                        var27 += class116.field2008;
                    }
                    if (var27 > class116.field2008) {
                        var27 -= class116.field2008;
                    }
                    while (true) {
                        int[] var28 = var19[var25];
                        if (var27 >= var28[0] && var27 <= var28[1]) {
                            int[] var29 = var19[var8];
                            var30 = var29[2];
                            if (var8 != var25) {
                                int var31 = var5 + var10;
                                if (var31 < 0) {
                                    var31 += class116.field2008;
                                }
                                if (class116.field2008 < var31) {
                                    var31 -= class116.field2008;
                                }
                                for (int var32 = 1; var32 <= var26; var32++) {
                                    int[] var33 = var19[(var8 + var32) % var15];
                                    var30 = Math.max(var30, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var26; var34++) {
                                    int[] var35 = var19[(var8 + var34) % var15];
                                    int var36 = var35[2];
                                    if (var30 != var36) {
                                        int var37 = var35[1];
                                        int var38 = var35[0];
                                        int var39;
                                        int var40;
                                        if (var27 > var31) {
                                            var39 = Math.max(var31, var38);
                                            var40 = Math.min(var27, var37);
                                        } else if (var38 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var27, var37);
                                        } else {
                                            var39 = Math.max(var31, var38);
                                            var40 = class116.field2008;
                                        }
                                        this.method1072(var40 - var39, var7 + var39, var30 - var36, (byte) -80, var4, var36, var21);
                                    }
                                }
                            }
                            var8 = var25;
                            break;
                        }
                        var26++;
                        var25++;
                        if (var15 <= var25) {
                            var25 = 0;
                        }
                    }
                }
                if (class289.field5059 < (var24 + var30)) {
                    var24 = class289.field5059 - var30;
                } else {
                    var9 = false;
                }
                if (class116.field2008 == var23) {
                    this.method1072(var22, var6 + var10, var24, (byte) -80, var4, var30, var21);
                    if (var9) {
                        return var3;
                    }
                    var8 = 0;
                    var9 = true;
                    var7 = var6;
                    int[] var41 = var20[var12++];
                    var41[1] = var23;
                    var15 = var12;
                    var41[0] = var10;
                    var11 = false;
                    var41[2] = var24 + var30;
                    var12 = 0;
                    int[][] var42 = var19;
                    var10 = 0;
                    var19 = var20;
                    var6 = class109.method792(-11163, var21, class116.field2008);
                    var5 = var6 - var7;
                    int var43 = var5;
                    if (var5 < 0) {
                        var43 = class116.field2008 + var5;
                    }
                    var20 = var42;
                    if (var43 > class116.field2008) {
                        var43 -= class116.field2008;
                    }
                    while (true) {
                        int[] var44 = var19[var8];
                        if (var44[0] <= var43 && var44[1] >= var43) {
                            break;
                        }
                        var8++;
                        if (var15 <= var8) {
                            var8 = 0;
                        }
                    }
                } else {
                    int[] var45 = var20[var12++];
                    var45[2] = var24 + var30;
                    var45[1] = var23;
                    var45[0] = var10;
                    this.method1072(var22, var6 + var10, var24, (byte) -80, var4, var30, var21);
                    var10 = var23;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(I)V", line = 643)
    public static void method1075(int arg0) {
        field2759 = null;
        if (arg0 < 117) {
            field2759 = (int[]) null;
        }
        field2756 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2759[var1] = var0 - 1;
            var0 += var0;
        }
        field2763 = false;
    }
}
