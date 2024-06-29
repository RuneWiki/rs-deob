import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class119 {

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[I")
    private int[] field2955 = new int[5];

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    private int field2946 = 0;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public int field2953 = 500;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field2957 = 100;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field2948 = 0;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[I")
    private int[] field2959 = new int[5];

    @OriginalMember(owner = "client!te", name = "m", descriptor = "[I")
    private int[] field2958 = new int[5];

    @OriginalMember(owner = "client!te", name = "t", descriptor = "[I")
    private static int[] field2965 = new int[32768];

    @OriginalMember(owner = "client!te", name = "g", descriptor = "[I")
    private static int[] field2952;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    private static int[] field2947;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "[I")
    private static int[] field2967;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "[I")
    private static int[] field2968;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[I")
    private static int[] field2966;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "[I")
    private static int[] field2970;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "[I")
    private static int[] field2969;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lea;")
    private class26 field2949;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lea;")
    private class26 field2950;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lea;")
    private class26 field2951;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lea;")
    private class26 field2954;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lea;")
    private class26 field2956;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Lea;")
    private class26 field2960;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Lea;")
    private class26 field2961;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lea;")
    private class26 field2962;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lea;")
    private class26 field2963;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Lhb;")
    private class44 field2964;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2965[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2952 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2952[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2947 = new int[220500];
        field2967 = new int[5];
        field2968 = new int[5];
        field2966 = new int[5];
        field2970 = new int[5];
        field2969 = new int[5];
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lgb;)V", line = 8)
    public final void method943(class39 arg0) {
        this.field2950 = new class26();
        this.field2950.method220(arg0);
        this.field2963 = new class26();
        this.field2963.method220(arg0);
        int var2 = arg0.method330(-30864);
        if (var2 != 0) {
            arg0.field957--;
            this.field2960 = new class26();
            this.field2960.method220(arg0);
            this.field2961 = new class26();
            this.field2961.method220(arg0);
        }
        int var3 = arg0.method330(-30864);
        if (var3 != 0) {
            arg0.field957--;
            this.field2956 = new class26();
            this.field2956.method220(arg0);
            this.field2962 = new class26();
            this.field2962.method220(arg0);
        }
        int var4 = arg0.method330(-30864);
        if (var4 != 0) {
            arg0.field957--;
            this.field2951 = new class26();
            this.field2951.method220(arg0);
            this.field2949 = new class26();
            this.field2949.method220(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method328((byte) 85);
            if (var6 == 0) {
                break;
            }
            this.field2959[var5] = var6;
            this.field2955[var5] = arg0.method320(18956);
            this.field2958[var5] = arg0.method328((byte) 85);
        }
        this.field2946 = arg0.method328((byte) 85);
        this.field2957 = arg0.method328((byte) 85);
        this.field2953 = arg0.method343((byte) -6);
        this.field2948 = arg0.method343((byte) -6);
        this.field2964 = new class44();
        this.field2954 = new class26();
        this.field2964.method369(arg0, this.field2954);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V", line = 69)
    public static void method944() {
        field2947 = null;
        field2965 = null;
        field2952 = null;
        field2970 = null;
        field2969 = null;
        field2968 = null;
        field2967 = null;
        field2966 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)I", line = 79)
    private final int method945(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2952[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2965[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[I", line = 120)
    public final int[] method946(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field2947[var3] = 0;
        }
        if (arg1 < 10) {
            return field2947;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2950.method219();
        this.field2963.method219();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field2960 != null) {
            this.field2960.method219();
            this.field2961.method219();
            var6 = (int) ((double) (this.field2960.field641 - this.field2960.field636) * 32.768D / var4);
            var7 = (int) ((double) this.field2960.field636 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field2956 != null) {
            this.field2956.method219();
            this.field2962.method219();
            var9 = (int) ((double) (this.field2956.field641 - this.field2956.field636) * 32.768D / var4);
            var10 = (int) ((double) this.field2956.field636 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field2959[var12] != 0) {
                field2970[var12] = 0;
                field2969[var12] = (int) ((double) this.field2958[var12] * var4);
                field2968[var12] = (this.field2959[var12] << 14) / 100;
                field2967[var12] = (int) ((double) (this.field2950.field641 - this.field2950.field636) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2955[var12]) / var4);
                field2966[var12] = (int) ((double) this.field2950.field636 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field2950.method218(arg0);
            int var41 = this.field2963.method218(arg0);
            if (this.field2960 != null) {
                int var42 = this.field2960.method218(arg0);
                int var43 = this.field2961.method218(arg0);
                var40 += this.method945(var8, var43, this.field2960.field640) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field2956 != null) {
                int var44 = this.field2956.method218(arg0);
                int var45 = this.field2962.method218(arg0);
                var41 = var41 * ((this.method945(var11, var45, this.field2956.field640) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field2959[var46] != 0) {
                    int var47 = field2969[var46] + var13;
                    if (var47 < arg0) {
                        field2947[var47] += this.method945(field2970[var46], field2968[var46] * var41 >> 15, this.field2950.field640);
                        field2970[var46] += (field2967[var46] * var40 >> 16) + field2966[var46];
                    }
                }
            }
        }
        if (this.field2951 != null) {
            this.field2951.method219();
            this.field2949.method219();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field2951.method218(arg0);
                int var19 = this.field2949.method218(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field2951.field641 - this.field2951.field636) * var18 >> 8) + this.field2951.field636;
                } else {
                    var20 = ((this.field2951.field641 - this.field2951.field636) * var19 >> 8) + this.field2951.field636;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field2947[var17] = 0;
                }
            }
        }
        if (this.field2946 > 0 && this.field2957 > 0) {
            int var21 = (int) ((double) this.field2946 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field2947[var22] += field2947[var22 - var21] * this.field2957 / 100;
            }
        }
        if (this.field2964.field1114[0] > 0 || this.field2964.field1114[1] > 0) {
            this.field2954.method219();
            int var23 = this.field2954.method218(arg0 + 1);
            int var24 = this.field2964.method365(0, (float) var23 / 65536.0F);
            int var25 = this.field2964.method365(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field2947[var24 + var26] * (long) class44.field1113 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field2947[var24 + var26 - var37 - 1] * (long) class44.field1118[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field2947[var26 - var38 - 1] * (long) class44.field1118[1][var38] >> 16);
                    }
                    field2947[var26] = var36;
                    var23 = this.field2954.method218(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field2947[var24 + var26] * (long) class44.field1113 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field2947[var24 + var26 - var34 - 1] * (long) class44.field1118[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field2947[var26 - var35 - 1] * (long) class44.field1118[1][var35] >> 16);
                        }
                        field2947[var26] = var33;
                        var23 = this.field2954.method218(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field2947[var24 + var26 - var30 - 1] * (long) class44.field1118[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field2947[var26 - var31 - 1] * (long) class44.field1118[1][var31] >> 16);
                            }
                            field2947[var26] = var29;
                            this.field2954.method218(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field2964.method365(0, (float) var23 / 65536.0F);
                    var25 = this.field2964.method365(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field2947[var39] < -32768) {
                field2947[var39] = -32768;
            }
            if (field2947[var39] > 32767) {
                field2947[var39] = 32767;
            }
        }
        return field2947;
    }
}
