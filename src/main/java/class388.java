import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class388 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    private int field4950 = 100;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
    private int[] field4962 = new int[5];

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    private int field4959 = 0;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
    private int[] field4957 = new int[5];

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
    private int[] field4965 = new int[5];

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public int field4958 = 0;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public int field4971 = 500;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "[I")
    private static int[] field4966 = new int[32768];

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    private static int[] field4953;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "[I")
    private static int[] field4961;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "[I")
    private static int[] field4969;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "[I")
    private static int[] field4970;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[I")
    private static int[] field4967;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "[I")
    private static int[] field4968;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "[I")
    private static int[] field4972;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Lvw;")
    private class308 field4960;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lnha;")
    private class325 field4948;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lnha;")
    private class325 field4949;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lnha;")
    private class325 field4951;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lnha;")
    private class325 field4952;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lnha;")
    private class325 field4954;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lnha;")
    private class325 field4955;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lnha;")
    private class325 field4956;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lnha;")
    private class325 field4963;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Lnha;")
    private class325 field4964;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
    public final int[] method2207(int arg0, int arg1) {
        class135.method994(field4961, 0, arg0);
        if (arg1 < 10) {
            return field4961;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4954.method1899();
        this.field4963.method1899();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4964 != null) {
            this.field4964.method1899();
            this.field4952.method1899();
            var5 = (int) ((double) (this.field4964.field4173 - this.field4964.field4174) * 32.768D / var3);
            var6 = (int) ((double) this.field4964.field4174 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4956 != null) {
            this.field4956.method1899();
            this.field4948.method1899();
            var8 = (int) ((double) (this.field4956.field4173 - this.field4956.field4174) * 32.768D / var3);
            var9 = (int) ((double) this.field4956.field4174 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4957[var11] != 0) {
                field4972[var11] = 0;
                field4970[var11] = (int) ((double) this.field4965[var11] * var3);
                field4969[var11] = (this.field4957[var11] << 14) / 100;
                field4967[var11] = (int) ((double) (this.field4954.field4173 - this.field4954.field4174) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4962[var11]) / var3);
                field4968[var11] = (int) ((double) this.field4954.field4174 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4954.method1897(arg0);
            int var40 = this.field4963.method1897(arg0);
            if (this.field4964 != null) {
                int var41 = this.field4964.method1897(arg0);
                int var42 = this.field4952.method1897(arg0);
                var39 += this.method2208(var7, var42, this.field4964.field4176) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4956 != null) {
                int var43 = this.field4956.method1897(arg0);
                int var44 = this.field4948.method1897(arg0);
                var40 = var40 * ((this.method2208(var10, var44, this.field4956.field4176) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4957[var45] != 0) {
                    int var46 = field4970[var45] + var12;
                    if (var46 < arg0) {
                        field4961[var46] += this.method2208(field4972[var45], field4969[var45] * var40 >> 15, this.field4954.field4176);
                        field4972[var45] += (field4967[var45] * var39 >> 16) + field4968[var45];
                    }
                }
            }
        }
        if (this.field4955 != null) {
            this.field4955.method1899();
            this.field4951.method1899();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4955.method1897(arg0);
                int var18 = this.field4951.method1897(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4955.field4173 - this.field4955.field4174) * var17 >> 8) + this.field4955.field4174;
                } else {
                    var19 = ((this.field4955.field4173 - this.field4955.field4174) * var18 >> 8) + this.field4955.field4174;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4961[var16] = 0;
                }
            }
        }
        if (this.field4959 > 0 && this.field4950 > 0) {
            int var20 = (int) ((double) this.field4959 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4961[var21] += field4961[var21 - var20] * this.field4950 / 100;
            }
        }
        if (this.field4960.field4061[0] > 0 || this.field4960.field4061[1] > 0) {
            this.field4949.method1899();
            int var22 = this.field4949.method1897(arg0 + 1);
            int var23 = this.field4960.method1854(0, (float) var22 / 65536.0F);
            int var24 = this.field4960.method1854(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4961[var23 + var25] * (long) class308.field4060 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4961[var23 + var25 - var36 - 1] * (long) class308.field4063[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4961[var25 - var37 - 1] * (long) class308.field4063[1][var37] >> 16);
                    }
                    field4961[var25] = var35;
                    var22 = this.field4949.method1897(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4961[var23 + var25] * (long) class308.field4060 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4961[var23 + var25 - var33 - 1] * (long) class308.field4063[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4961[var25 - var34 - 1] * (long) class308.field4063[1][var34] >> 16);
                        }
                        field4961[var25] = var32;
                        var22 = this.field4949.method1897(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4961[var23 + var25 - var29 - 1] * (long) class308.field4063[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4961[var25 - var30 - 1] * (long) class308.field4063[1][var30] >> 16);
                            }
                            field4961[var25] = var28;
                            this.field4949.method1897(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4960.method1854(0, (float) var22 / 65536.0F);
                    var24 = this.field4960.method1854(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4961[var38] < -32768) {
                field4961[var38] = -32768;
            }
            if (field4961[var38] > 32767) {
                field4961[var38] = 32767;
            }
        }
        return field4961;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)I")
    private final int method2208(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4953[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4966[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
    public static void method2209() {
        field4961 = null;
        field4966 = null;
        field4953 = null;
        field4972 = null;
        field4970 = null;
        field4969 = null;
        field4967 = null;
        field4968 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lsl;)V")
    public final void method2210(class461 arg0) {
        this.field4954 = new class325();
        this.field4954.method1898(arg0);
        this.field4963 = new class325();
        this.field4963.method1898(arg0);
        int var2 = arg0.method2600((byte) -125);
        if (var2 != 0) {
            arg0.field6193--;
            this.field4964 = new class325();
            this.field4964.method1898(arg0);
            this.field4952 = new class325();
            this.field4952.method1898(arg0);
        }
        int var3 = arg0.method2600((byte) -124);
        if (var3 != 0) {
            arg0.field6193--;
            this.field4956 = new class325();
            this.field4956.method1898(arg0);
            this.field4948 = new class325();
            this.field4948.method1898(arg0);
        }
        int var4 = arg0.method2600((byte) -128);
        if (var4 != 0) {
            arg0.field6193--;
            this.field4955 = new class325();
            this.field4955.method1898(arg0);
            this.field4951 = new class325();
            this.field4951.method1898(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2594(3340);
            if (var6 == 0) {
                break;
            }
            this.field4957[var5] = var6;
            this.field4962[var5] = arg0.method2564((byte) 34);
            this.field4965[var5] = arg0.method2594(3340);
        }
        this.field4959 = arg0.method2594(3340);
        this.field4950 = arg0.method2594(3340);
        this.field4971 = arg0.method2566(-2);
        this.field4958 = arg0.method2566(-2);
        this.field4960 = new class308();
        this.field4949 = new class325();
        this.field4960.method1852(arg0, this.field4949);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4966[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4953 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4953[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4961 = new int[220500];
        field4969 = new int[5];
        field4970 = new int[5];
        field4967 = new int[5];
        field4968 = new int[5];
        field4972 = new int[5];
    }
}
