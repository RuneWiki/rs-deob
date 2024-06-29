import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class156 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "[I")
    private int[] field2313 = new int[5];

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    private int field2314 = 100;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public int field2321 = 500;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    private int[] field2315 = new int[5];

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field2326 = 0;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "[I")
    private int[] field2327 = new int[5];

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    private int field2329 = 0;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "[I")
    private static int[] field2328 = new int[32768];

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "[I")
    private static int[] field2330;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "[I")
    private static int[] field2317;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "[I")
    private static int[] field2333;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
    private static int[] field2334;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "[I")
    private static int[] field2335;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "[I")
    private static int[] field2336;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
    private static int[] field2332;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Llg;")
    private class116 field2312;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Llg;")
    private class116 field2316;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Llg;")
    private class116 field2319;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Llg;")
    private class116 field2320;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Llg;")
    private class116 field2322;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Llg;")
    private class116 field2323;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Llg;")
    private class116 field2324;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Llg;")
    private class116 field2325;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Llg;")
    private class116 field2331;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lne;")
    private class224 field2318;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I")
    public final int[] method1082(int arg0, int arg1) {
        class103.method694(field2317, 0, arg0);
        if (arg1 < 10) {
            return field2317;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2316.method768();
        this.field2324.method768();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2312 != null) {
            this.field2312.method768();
            this.field2331.method768();
            var5 = (int) ((double) (this.field2312.field1685 - this.field2312.field1683) * 32.768D / var3);
            var6 = (int) ((double) this.field2312.field1683 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2322 != null) {
            this.field2322.method768();
            this.field2325.method768();
            var8 = (int) ((double) (this.field2322.field1685 - this.field2322.field1683) * 32.768D / var3);
            var9 = (int) ((double) this.field2322.field1683 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2315[var11] != 0) {
                field2333[var11] = 0;
                field2335[var11] = (int) ((double) this.field2327[var11] * var3);
                field2336[var11] = (this.field2315[var11] << 14) / 100;
                field2332[var11] = (int) ((double) (this.field2316.field1685 - this.field2316.field1683) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2313[var11]) / var3);
                field2334[var11] = (int) ((double) this.field2316.field1683 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2316.method765(arg0);
            int var40 = this.field2324.method765(arg0);
            if (this.field2312 != null) {
                int var41 = this.field2312.method765(arg0);
                int var42 = this.field2331.method765(arg0);
                var39 += this.method1085(var7, var42, this.field2312.field1684) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2322 != null) {
                int var43 = this.field2322.method765(arg0);
                int var44 = this.field2325.method765(arg0);
                var40 = var40 * ((this.method1085(var10, var44, this.field2322.field1684) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2315[var45] != 0) {
                    int var46 = field2335[var45] + var12;
                    if (var46 < arg0) {
                        field2317[var46] += this.method1085(field2333[var45], field2336[var45] * var40 >> 15, this.field2316.field1684);
                        field2333[var45] += (field2332[var45] * var39 >> 16) + field2334[var45];
                    }
                }
            }
        }
        if (this.field2319 != null) {
            this.field2319.method768();
            this.field2320.method768();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2319.method765(arg0);
                int var18 = this.field2320.method765(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2319.field1685 - this.field2319.field1683) * var17 >> 8) + this.field2319.field1683;
                } else {
                    var19 = ((this.field2319.field1685 - this.field2319.field1683) * var18 >> 8) + this.field2319.field1683;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2317[var16] = 0;
                }
            }
        }
        if (this.field2329 > 0 && this.field2314 > 0) {
            int var20 = (int) ((double) this.field2329 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2317[var21] += field2317[var21 - var20] * this.field2314 / 100;
            }
        }
        if (this.field2318.field3503[0] > 0 || this.field2318.field3503[1] > 0) {
            this.field2323.method768();
            int var22 = this.field2323.method765(arg0 + 1);
            int var23 = this.field2318.method1589(0, (float) var22 / 65536.0F);
            int var24 = this.field2318.method1589(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2317[var23 + var25] * (long) class224.field3500 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2317[var23 + var25 - var36 - 1] * (long) class224.field3496[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2317[var25 - var37 - 1] * (long) class224.field3496[1][var37] >> 16);
                    }
                    field2317[var25] = var35;
                    var22 = this.field2323.method765(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2317[var23 + var25] * (long) class224.field3500 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2317[var23 + var25 - var33 - 1] * (long) class224.field3496[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2317[var25 - var34 - 1] * (long) class224.field3496[1][var34] >> 16);
                        }
                        field2317[var25] = var32;
                        var22 = this.field2323.method765(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2317[var23 + var25 - var29 - 1] * (long) class224.field3496[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2317[var25 - var30 - 1] * (long) class224.field3496[1][var30] >> 16);
                            }
                            field2317[var25] = var28;
                            this.field2323.method765(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2318.method1589(0, (float) var22 / 65536.0F);
                    var24 = this.field2318.method1589(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2317[var38] < -32768) {
                field2317[var38] = -32768;
            }
            if (field2317[var38] > 32767) {
                field2317[var38] = 32767;
            }
        }
        return field2317;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()V")
    public static void method1083() {
        field2317 = null;
        field2328 = null;
        field2330 = null;
        field2333 = null;
        field2335 = null;
        field2336 = null;
        field2332 = null;
        field2334 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lim;)V")
    public final void method1084(class170 arg0) {
        this.field2316 = new class116();
        this.field2316.method767(arg0);
        this.field2324 = new class116();
        this.field2324.method767(arg0);
        int var2 = arg0.method1218(-97);
        if (var2 != 0) {
            arg0.field2676--;
            this.field2312 = new class116();
            this.field2312.method767(arg0);
            this.field2331 = new class116();
            this.field2331.method767(arg0);
        }
        int var3 = arg0.method1218(-115);
        if (var3 != 0) {
            arg0.field2676--;
            this.field2322 = new class116();
            this.field2322.method767(arg0);
            this.field2325 = new class116();
            this.field2325.method767(arg0);
        }
        int var4 = arg0.method1218(105);
        if (var4 != 0) {
            arg0.field2676--;
            this.field2319 = new class116();
            this.field2319.method767(arg0);
            this.field2320 = new class116();
            this.field2320.method767(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1162(-129);
            if (var6 == 0) {
                break;
            }
            this.field2315[var5] = var6;
            this.field2313[var5] = arg0.method1208(255);
            this.field2327[var5] = arg0.method1162(-129);
        }
        this.field2329 = arg0.method1162(-129);
        this.field2314 = arg0.method1162(-129);
        this.field2321 = arg0.method1186((byte) -50);
        this.field2326 = arg0.method1186((byte) -56);
        this.field2318 = new class224();
        this.field2323 = new class116();
        this.field2318.method1588(arg0, this.field2323);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
    private final int method1085(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2330[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2328[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2328[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2330 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2330[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2317 = new int[220500];
        field2333 = new int[5];
        field2334 = new int[5];
        field2335 = new int[5];
        field2336 = new int[5];
        field2332 = new int[5];
    }
}
