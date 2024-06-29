import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class192 extends class80 {

    @OriginalMember(owner = "client!si", name = "O", descriptor = "B")
    public byte field3416 = 0;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public int field3398 = 0;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    public int field3428 = 0;

    @OriginalMember(owner = "client!si", name = "sb", descriptor = "Z")
    private boolean field3446 = false;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "[I")
    public int[] field3403;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[I")
    public int[] field3399;

    @OriginalMember(owner = "client!si", name = "mb", descriptor = "[I")
    public int[] field3440;

    @OriginalMember(owner = "client!si", name = "qb", descriptor = "[I")
    private int[] field3444;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "[I")
    public int[] field3435;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "[I")
    public int[] field3420;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "[I")
    public int[] field3423;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "[B")
    public byte[] field3412;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "[B")
    public byte[] field3433;

    @OriginalMember(owner = "client!si", name = "lb", descriptor = "[B")
    public byte[] field3439;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "[S")
    public short[] field3408;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "[S")
    public short[] field3430;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "[B")
    public byte[] field3406;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "[I")
    private int[] field3419;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "[B")
    public byte[] field3431;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "[S")
    public short[] field3425;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "[S")
    public short[] field3407;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "[S")
    public short[] field3424;

    @OriginalMember(owner = "client!si", name = "pb", descriptor = "[S")
    private short[] field3443;

    @OriginalMember(owner = "client!si", name = "rb", descriptor = "[S")
    private short[] field3445;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "[S")
    private short[] field3417;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "[B")
    private byte[] field3413;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "[B")
    private byte[] field3427;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "[B")
    private byte[] field3415;

    @OriginalMember(owner = "client!si", name = "nb", descriptor = "[B")
    private byte[] field3441;

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "[B")
    private byte[] field3436;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "[[I")
    public int[][] field3401;

    @OriginalMember(owner = "client!si", name = "jb", descriptor = "[[I")
    public int[][] field3437;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "[Lok;")
    public class39[] field3422;

    @OriginalMember(owner = "client!si", name = "ob", descriptor = "[Lab;")
    public class142[] field3442;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "[Lok;")
    public class39[] field3410;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "S")
    public short field3409;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "S")
    public short field3434;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    private static int field3404 = 0;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "[I")
    private static int[] field3414 = class145.field2742;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "[I")
    private static int[] field3421 = new int[10000];

    @OriginalMember(owner = "client!si", name = "kb", descriptor = "[I")
    private static int[] field3438 = class145.field2746;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "[I")
    private static int[] field3411 = new int[10000];

    @OriginalMember(owner = "client!si", name = "w", descriptor = "S")
    private short field3400;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "S")
    private short field3402;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "S")
    private short field3405;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "S")
    private short field3418;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "S")
    private short field3426;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "S")
    private short field3429;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIBSB)I")
    public final int method1313(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3435[this.field3398] = arg0;
        this.field3420[this.field3398] = arg1;
        this.field3423[this.field3398] = arg2;
        this.field3412[this.field3398] = arg3;
        this.field3406[this.field3398] = -1;
        this.field3408[this.field3398] = arg4;
        this.field3430[this.field3398] = -1;
        this.field3439[this.field3398] = arg5;
        return this.field3398++;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "()Lsi;")
    public final class192 method1314() {
        class192 var1 = new class192();
        if (this.field3412 != null) {
            var1.field3412 = new byte[this.field3398];
            for (int var2 = 0; var2 < this.field3398; var2++) {
                var1.field3412[var2] = this.field3412[var2];
            }
        }
        var1.field3428 = this.field3428;
        var1.field3398 = this.field3398;
        var1.field3432 = this.field3432;
        var1.field3403 = this.field3403;
        var1.field3399 = this.field3399;
        var1.field3440 = this.field3440;
        var1.field3435 = this.field3435;
        var1.field3420 = this.field3420;
        var1.field3423 = this.field3423;
        var1.field3433 = this.field3433;
        var1.field3439 = this.field3439;
        var1.field3406 = this.field3406;
        var1.field3408 = this.field3408;
        var1.field3430 = this.field3430;
        var1.field3416 = this.field3416;
        var1.field3431 = this.field3431;
        var1.field3425 = this.field3425;
        var1.field3407 = this.field3407;
        var1.field3424 = this.field3424;
        var1.field3443 = this.field3443;
        var1.field3445 = this.field3445;
        var1.field3417 = this.field3417;
        var1.field3413 = this.field3413;
        var1.field3427 = this.field3427;
        var1.field3415 = this.field3415;
        var1.field3441 = this.field3441;
        var1.field3436 = this.field3436;
        var1.field3444 = this.field3444;
        var1.field3419 = this.field3419;
        var1.field3401 = this.field3401;
        var1.field3437 = this.field3437;
        var1.field3422 = this.field3422;
        var1.field3442 = this.field3442;
        var1.field3409 = this.field3409;
        var1.field3434 = this.field3434;
        return var1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "()V")
    public final void method1315() {
        for (int var1 = 0; var1 < this.field3428; var1++) {
            int var2 = this.field3440[var1];
            this.field3440[var1] = this.field3403[var1];
            this.field3403[var1] = -var2;
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIIII)Lie;")
    public final class32 method1316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class89(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([[III)I")
    private static final int method1317(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(SS)V")
    public final void method1318(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3398; var3++) {
            if (this.field3408[var3] == arg0) {
                this.field3408[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lsi;I)I")
    private final int method1319(class192 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3403[arg1];
        int var5 = arg0.field3399[arg1];
        int var6 = arg0.field3440[arg1];
        for (int var7 = 0; var7 < this.field3428; var7++) {
            if (this.field3403[var7] == var4 && this.field3399[var7] == var5 && this.field3440[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3403[this.field3428] = var4;
            this.field3399[this.field3428] = var5;
            this.field3440[this.field3428] = var6;
            if (arg0.field3444 != null) {
                this.field3444[this.field3428] = arg0.field3444[arg1];
            }
            var3 = this.field3428++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "()V")
    public final void method1320() {
        if (this.field3422 != null) {
            return;
        }
        this.field3422 = new class39[this.field3428];
        for (int var1 = 0; var1 < this.field3428; var1++) {
            this.field3422[var1] = new class39();
        }
        for (int var2 = 0; var2 < this.field3398; var2++) {
            int var3 = this.field3435[var2];
            int var4 = this.field3420[var2];
            int var5 = this.field3423[var2];
            int var6 = this.field3403[var4] - this.field3403[var3];
            int var7 = this.field3399[var4] - this.field3399[var3];
            int var8 = this.field3440[var4] - this.field3440[var3];
            int var9 = this.field3403[var5] - this.field3403[var3];
            int var10 = this.field3399[var5] - this.field3399[var3];
            int var11 = this.field3440[var5] - this.field3440[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field3412 == null) {
                var19 = 0;
            } else {
                var19 = this.field3412[var2];
            }
            if (var19 == 0) {
                class39 var20 = this.field3422[var3];
                var20.field912 += var16;
                var20.field907 += var17;
                var20.field908 += var18;
                var20.field915++;
                class39 var21 = this.field3422[var4];
                var21.field912 += var16;
                var21.field907 += var17;
                var21.field908 += var18;
                var21.field915++;
                class39 var22 = this.field3422[var5];
                var22.field912 += var16;
                var22.field907 += var17;
                var22.field908 += var18;
                var22.field915++;
            } else if (var19 == 1) {
                if (this.field3442 == null) {
                    this.field3442 = new class142[this.field3398];
                }
                class142 var23 = this.field3442[var2] = new class142();
                var23.field2697 = var16;
                var23.field2705 = var17;
                var23.field2694 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    private final void method1321(int arg0) {
        int var2 = field3438[arg0];
        int var3 = field3414[arg0];
        for (int var4 = 0; var4 < this.field3428; var4++) {
            int var5 = this.field3399[var4] * var3 - this.field3440[var4] * var2 >> 16;
            this.field3440[var4] = this.field3440[var4] * var3 + this.field3399[var4] * var2 >> 16;
            this.field3399[var4] = var5;
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V")
    public final void method1322(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3438[arg2];
            int var5 = field3414[arg2];
            for (int var6 = 0; var6 < this.field3428; var6++) {
                int var7 = this.field3403[var6] * var5 + this.field3399[var6] * var4 >> 16;
                this.field3399[var6] = this.field3399[var6] * var5 - this.field3403[var6] * var4 >> 16;
                this.field3403[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3438[arg0];
            int var9 = field3414[arg0];
            for (int var10 = 0; var10 < this.field3428; var10++) {
                int var11 = this.field3399[var10] * var9 - this.field3440[var10] * var8 >> 16;
                this.field3440[var10] = this.field3440[var10] * var9 + this.field3399[var10] * var8 >> 16;
                this.field3399[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3438[arg1];
        int var13 = field3414[arg1];
        for (int var14 = 0; var14 < this.field3428; var14++) {
            int var15 = this.field3440[var14] * var12 + this.field3403[var14] * var13 >> 16;
            this.field3440[var14] = this.field3440[var14] * var13 - this.field3403[var14] * var12 >> 16;
            this.field3403[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(III)V")
    public final void method1323(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3428; var4++) {
            this.field3403[var4] = this.field3403[var4] * arg0 / 128;
            this.field3399[var4] = this.field3399[var4] * arg1 / 128;
            this.field3440[var4] = this.field3440[var4] * arg2 / 128;
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "()V")
    public final void method1324() {
        for (int var1 = 0; var1 < this.field3428; var1++) {
            int var2 = this.field3403[var1];
            this.field3403[var1] = this.field3440[var1];
            this.field3440[var1] = -var2;
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "()V")
    public static void method1325() {
        field3421 = null;
        field3411 = null;
        field3438 = null;
        field3414 = null;
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "()V")
    public final void method1326() {
        for (int var1 = 0; var1 < this.field3428; var1++) {
            this.field3403[var1] = -this.field3403[var1];
            this.field3440[var1] = -this.field3440[var1];
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Leh;IIIZ)V")
    public final void method562(class80 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class192 var6 = (class192) arg0;
        var6.method1335();
        var6.method1320();
        field3404++;
        int var7 = 0;
        int[] var8 = var6.field3403;
        int var9 = var6.field3428;
        for (int var10 = 0; var10 < this.field3428; var10++) {
            class39 var13 = this.field3422[var10];
            if (var13.field915 != 0) {
                int var14 = this.field3399[var10] - arg2;
                if (var14 >= var6.field3426 && var14 <= var6.field3429) {
                    int var15 = this.field3403[var10] - arg1;
                    if (var15 >= var6.field3400 && var15 <= var6.field3405) {
                        int var16 = this.field3440[var10] - arg3;
                        if (var16 >= var6.field3402 && var16 <= var6.field3418) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class39 var18 = var6.field3422[var17];
                                if (var8[var17] == var15 && var6.field3440[var17] == var16 && var6.field3399[var17] == var14 && var18.field915 != 0) {
                                    if (this.field3410 == null) {
                                        this.field3410 = new class39[this.field3428];
                                    }
                                    if (var6.field3410 == null) {
                                        var6.field3410 = new class39[var9];
                                    }
                                    class39 var19 = this.field3410[var10];
                                    if (var19 == null) {
                                        var19 = this.field3410[var10] = new class39(var13);
                                    }
                                    class39 var20 = var6.field3410[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3410[var17] = new class39(var18);
                                    }
                                    var19.field912 += var18.field912;
                                    var19.field907 += var18.field907;
                                    var19.field908 += var18.field908;
                                    var19.field915 += var18.field915;
                                    var20.field912 += var13.field912;
                                    var20.field907 += var13.field907;
                                    var20.field908 += var13.field908;
                                    var20.field915 += var13.field915;
                                    var7++;
                                    field3421[var10] = field3404;
                                    field3411[var17] = field3404;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field3398; var11++) {
            if (field3421[this.field3435[var11]] == field3404 && field3421[this.field3420[var11]] == field3404 && field3421[this.field3423[var11]] == field3404) {
                if (this.field3412 == null) {
                    this.field3412 = new byte[this.field3398];
                }
                this.field3412[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3398; var12++) {
            if (field3411[var6.field3435[var12]] == field3404 && field3411[var6.field3420[var12]] == field3404 && field3411[var6.field3423[var12]] == field3404) {
                if (var6.field3412 == null) {
                    var6.field3412 = new byte[var6.field3398];
                }
                var6.field3412[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public final void method1327(int arg0) {
        int var2 = field3438[arg0];
        int var3 = field3414[arg0];
        for (int var4 = 0; var4 < this.field3428; var4++) {
            int var5 = this.field3440[var4] * var2 + this.field3403[var4] * var3 >> 16;
            this.field3440[var4] = this.field3440[var4] * var3 - this.field3403[var4] * var2 >> 16;
            this.field3403[var4] = var5;
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(III)I")
    public final int method1328(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3428; var4++) {
            if (this.field3403[var4] == arg0 && this.field3399[var4] == arg1 && this.field3440[var4] == arg2) {
                return var4;
            }
        }
        this.field3403[this.field3428] = arg0;
        this.field3399[this.field3428] = arg1;
        this.field3440[this.field3428] = arg2;
        return this.field3428++;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(III)V")
    public final void method1329(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3428; var4++) {
            this.field3403[var4] += arg0;
            this.field3399[var4] += arg1;
            this.field3440[var4] += arg2;
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Leh;")
    public final class80 method559(int arg0, int arg1, int arg2) {
        return this.method1316(this.field3409, this.field3434, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "()V")
    public final void method1330() {
        for (int var1 = 0; var1 < this.field3428; var1++) {
            this.field3440[var1] = -this.field3440[var1];
        }
        for (int var2 = 0; var2 < this.field3398; var2++) {
            int var3 = this.field3435[var2];
            this.field3435[var2] = this.field3423[var2];
            this.field3423[var2] = var3;
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "j", descriptor = "()V")
    public final void method1331() {
        int var10002;
        if (this.field3444 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3428; var3++) {
                int var7 = this.field3444[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3401 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3401[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3428) {
                int var6 = this.field3444[var5];
                this.field3401[var6][var1[var6]++] = var5++;
            }
            this.field3444 = null;
        }
        if (this.field3419 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3398; var10++) {
            int var14 = this.field3419[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3437 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3437[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3398) {
            int var13 = this.field3419[var12];
            this.field3437[var13][var8[var13]++] = var12++;
        }
        this.field3419 = null;
    }

    @OriginalMember(owner = "client!si", name = "k", descriptor = "()V")
    private final void method1332() {
        this.field3422 = null;
        this.field3410 = null;
        this.field3442 = null;
        this.field3446 = false;
    }

    @OriginalMember(owner = "client!si", name = "l", descriptor = "()V")
    public final void method1333() {
        this.field3444 = null;
        this.field3419 = null;
        this.field3401 = null;
        this.field3437 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([[IIIIII)V")
    private final void method1334(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1317(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1317(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1317(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1317(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1321(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1341(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1329(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!si", name = "m", descriptor = "()V")
    private final void method1335() {
        if (this.field3446) {
            return;
        }
        this.field3446 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3428; var7++) {
            int var8 = this.field3403[var7];
            int var9 = this.field3399[var7];
            int var10 = this.field3440[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field3400 = (short) var1;
        this.field3405 = (short) var4;
        this.field3426 = (short) var2;
        this.field3429 = (short) var5;
        this.field3402 = (short) var3;
        this.field3418 = (short) var6;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II[[I[[IIIIZZ)Lsi;")
    public final class192 method1336(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1335();
        int var10 = this.field3400 + arg4;
        int var11 = this.field3405 + arg4;
        int var12 = this.field3402 + arg6;
        int var13 = this.field3418 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class192 var18;
        if (arg7) {
            var18 = new class192();
            var18.field3428 = this.field3428;
            var18.field3398 = this.field3398;
            var18.field3432 = this.field3432;
            var18.field3435 = this.field3435;
            var18.field3420 = this.field3420;
            var18.field3423 = this.field3423;
            var18.field3412 = this.field3412;
            var18.field3433 = this.field3433;
            var18.field3439 = this.field3439;
            var18.field3406 = this.field3406;
            var18.field3408 = this.field3408;
            var18.field3430 = this.field3430;
            var18.field3416 = this.field3416;
            var18.field3431 = this.field3431;
            var18.field3425 = this.field3425;
            var18.field3407 = this.field3407;
            var18.field3424 = this.field3424;
            var18.field3443 = this.field3443;
            var18.field3445 = this.field3445;
            var18.field3417 = this.field3417;
            var18.field3413 = this.field3413;
            var18.field3427 = this.field3427;
            var18.field3415 = this.field3415;
            var18.field3441 = this.field3441;
            var18.field3436 = this.field3436;
            var18.field3444 = this.field3444;
            var18.field3419 = this.field3419;
            var18.field3401 = this.field3401;
            var18.field3437 = this.field3437;
            var18.field3409 = this.field3409;
            var18.field3434 = this.field3434;
            var18.field3422 = this.field3422;
            var18.field3442 = this.field3442;
            var18.field3410 = this.field3410;
            if (arg0 == 3) {
                var18.field3403 = class34.method252(-78, this.field3403);
                var18.field3399 = class34.method252(124, this.field3399);
                var18.field3440 = class34.method252(123, this.field3440);
            } else {
                var18.field3403 = this.field3403;
                var18.field3399 = new int[var18.field3428];
                var18.field3440 = this.field3440;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3428; var19++) {
                int var20 = this.field3403[var19] + arg4;
                int var21 = this.field3440[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3399[var19] = this.field3399[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3428; var29++) {
                int var30 = (this.field3399[var29] << 16) / this.field3426;
                if (var30 < arg1) {
                    int var31 = this.field3403[var29] + arg4;
                    int var32 = this.field3440[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3399[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3399[var29];
                } else {
                    var18.field3399[var29] = this.field3399[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1334(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3429 - this.field3426;
            for (int var43 = 0; var43 < this.field3428; var43++) {
                int var44 = this.field3403[var43] + arg4;
                int var45 = this.field3440[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3399[var43] = var52 + this.field3399[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3429 - this.field3426;
            for (int var54 = 0; var54 < this.field3428; var54++) {
                int var55 = this.field3403[var54] + arg4;
                int var56 = this.field3440[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field3399[var54] = ((this.field3399[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1332();
        } else {
            this.field3446 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(IIIII)Lbb;")
    public final class89 method1337(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class89(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([B)V")
    private final void method1338(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class200 var4 = new class200(arg0);
        class200 var5 = new class200(arg0);
        class200 var6 = new class200(arg0);
        class200 var7 = new class200(arg0);
        class200 var8 = new class200(arg0);
        var4.field3565 = arg0.length - 18;
        int var9 = var4.method1410(-104);
        int var10 = var4.method1410(-65);
        int var11 = var4.method1408((byte) -84);
        int var12 = var4.method1408((byte) -16);
        int var13 = var4.method1408((byte) -63);
        int var14 = var4.method1408((byte) -28);
        int var15 = var4.method1408((byte) -41);
        int var16 = var4.method1408((byte) -97);
        int var17 = var4.method1410(-106);
        int var18 = var4.method1410(-67);
        int var19 = var4.method1410(-84);
        int var20 = var4.method1410(-96);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field3428 = var9;
        this.field3398 = var10;
        this.field3432 = var11;
        this.field3403 = new int[var9];
        this.field3399 = new int[var9];
        this.field3440 = new int[var9];
        this.field3435 = new int[var10];
        this.field3420 = new int[var10];
        this.field3423 = new int[var10];
        if (var11 > 0) {
            this.field3431 = new byte[var11];
            this.field3425 = new short[var11];
            this.field3407 = new short[var11];
            this.field3424 = new short[var11];
        }
        if (var16 == 1) {
            this.field3444 = new int[var9];
        }
        if (var12 == 1) {
            this.field3412 = new byte[var10];
            this.field3406 = new byte[var10];
            this.field3430 = new short[var10];
        }
        if (var13 == 255) {
            this.field3433 = new byte[var10];
        } else {
            this.field3416 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3439 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3419 = new int[var10];
        }
        this.field3408 = new short[var10];
        var4.field3565 = var21;
        var5.field3565 = var36;
        var6.field3565 = var38;
        var7.field3565 = var40;
        var8.field3565 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1408((byte) -124);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1404(0);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1404(0);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1404(0);
            }
            this.field3403[var46] = var43 + var63;
            this.field3399[var46] = var44 + var64;
            this.field3440[var46] = var45 + var65;
            var43 = this.field3403[var46];
            var44 = this.field3399[var46];
            var45 = this.field3440[var46];
            if (var16 == 1) {
                this.field3444[var46] = var8.method1408((byte) -88);
            }
        }
        var4.field3565 = var32;
        var5.field3565 = var28;
        var6.field3565 = var26;
        var7.field3565 = var30;
        var8.field3565 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3408[var47] = (short) var4.method1410(-77);
            if (var12 == 1) {
                int var61 = var5.method1408((byte) -78);
                if ((var61 & 0x1) == 1) {
                    this.field3412[var47] = 1;
                    var2 = true;
                } else {
                    this.field3412[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3406[var47] = (byte) (var61 >> 2);
                    this.field3430[var47] = this.field3408[var47];
                    this.field3408[var47] = 127;
                    if (this.field3430[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3406[var47] = -1;
                    this.field3430[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3433[var47] = var6.method1412((byte) 79);
            }
            if (var14 == 1) {
                this.field3439[var47] = var7.method1412((byte) 109);
            }
            if (var15 == 1) {
                this.field3419[var47] = var8.method1408((byte) -72);
            }
        }
        var4.field3565 = var25;
        var5.field3565 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1408((byte) -76);
            if (var57 == 1) {
                var48 = var4.method1404(0) + var51;
                var49 = var4.method1404(0) + var48;
                var50 = var4.method1404(0) + var49;
                var51 = var50;
                this.field3435[var52] = var48;
                this.field3420[var52] = var49;
                this.field3423[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1404(0) + var51;
                var51 = var50;
                this.field3435[var52] = var48;
                this.field3420[var52] = var49;
                this.field3423[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1404(0) + var51;
                var51 = var50;
                this.field3435[var52] = var48;
                this.field3420[var52] = var49;
                this.field3423[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1404(0) + var51;
                var51 = var50;
                this.field3435[var52] = var48;
                this.field3420[var52] = var60;
                this.field3423[var52] = var50;
            }
        }
        var4.field3565 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3431[var53] = 0;
            this.field3425[var53] = (short) var4.method1410(-58);
            this.field3407[var53] = (short) var4.method1410(-126);
            this.field3424[var53] = (short) var4.method1410(-53);
        }
        if (this.field3406 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3406[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3425[var56] & 0xFFFF) == this.field3435[var55] && (this.field3407[var56] & 0xFFFF) == this.field3420[var55] && (this.field3424[var56] & 0xFFFF) == this.field3423[var55]) {
                        this.field3406[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3406 = null;
            }
        }
        if (!var3) {
            this.field3430 = null;
        }
        if (!var2) {
            this.field3412 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lbj;II)Lsi;")
    public static final class192 method1339(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1084((byte) -122, arg1, arg2);
        return var3 == null ? null : new class192(var3);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()Z")
    public final boolean method563() {
        return true;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "([B)V")
    private final void method1340(byte[] arg0) {
        class200 var2 = new class200(arg0);
        class200 var3 = new class200(arg0);
        class200 var4 = new class200(arg0);
        class200 var5 = new class200(arg0);
        class200 var6 = new class200(arg0);
        class200 var7 = new class200(arg0);
        class200 var8 = new class200(arg0);
        var2.field3565 = arg0.length - 23;
        int var9 = var2.method1410(-80);
        int var10 = var2.method1410(-91);
        int var11 = var2.method1408((byte) -123);
        int var12 = var2.method1408((byte) -128);
        int var13 = var2.method1408((byte) -66);
        int var14 = var2.method1408((byte) -23);
        int var15 = var2.method1408((byte) -103);
        int var16 = var2.method1408((byte) -40);
        int var17 = var2.method1408((byte) -73);
        int var18 = var2.method1410(-91);
        int var19 = var2.method1410(-125);
        int var20 = var2.method1410(-72);
        int var21 = var2.method1410(-66);
        int var22 = var2.method1410(-105);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3431 = new byte[var11];
            var2.field3565 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3431[var26] = var2.method1412((byte) 118);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field3428 = var9;
        this.field3398 = var10;
        this.field3432 = var11;
        this.field3403 = new int[var9];
        this.field3399 = new int[var9];
        this.field3440 = new int[var9];
        this.field3435 = new int[var10];
        this.field3420 = new int[var10];
        this.field3423 = new int[var10];
        if (var17 == 1) {
            this.field3444 = new int[var9];
        }
        if (var12 == 1) {
            this.field3412 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3433 = new byte[var10];
        } else {
            this.field3416 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3439 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3419 = new int[var10];
        }
        if (var16 == 1) {
            this.field3430 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3406 = new byte[var10];
        }
        this.field3408 = new short[var10];
        if (var11 > 0) {
            this.field3425 = new short[var11];
            this.field3407 = new short[var11];
            this.field3424 = new short[var11];
            if (var24 > 0) {
                this.field3443 = new short[var24];
                this.field3445 = new short[var24];
                this.field3417 = new short[var24];
                this.field3413 = new byte[var24];
                this.field3427 = new byte[var24];
                this.field3415 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3441 = new byte[var25];
                this.field3436 = new byte[var25];
            }
        }
        var2.field3565 = var11;
        var3.field3565 = var44;
        var4.field3565 = var46;
        var5.field3565 = var48;
        var6.field3565 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1408((byte) -57);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1404(0);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1404(0);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1404(0);
            }
            this.field3403[var66] = var63 + var80;
            this.field3399[var66] = var64 + var81;
            this.field3440[var66] = var65 + var82;
            var63 = this.field3403[var66];
            var64 = this.field3399[var66];
            var65 = this.field3440[var66];
            if (var17 == 1) {
                this.field3444[var66] = var6.method1408((byte) -59);
            }
        }
        var2.field3565 = var42;
        var3.field3565 = var31;
        var4.field3565 = var34;
        var5.field3565 = var37;
        var6.field3565 = var35;
        var7.field3565 = var40;
        var8.field3565 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field3408[var67] = (short) var2.method1410(-85);
            if (var12 == 1) {
                this.field3412[var67] = var3.method1412((byte) 117);
            }
            if (var13 == 255) {
                this.field3433[var67] = var4.method1412((byte) 84);
            }
            if (var14 == 1) {
                this.field3439[var67] = var5.method1412((byte) 76);
            }
            if (var15 == 1) {
                this.field3419[var67] = var6.method1408((byte) -100);
            }
            if (var16 == 1) {
                this.field3430[var67] = (short) (var7.method1410(-123) - 1);
            }
            if (this.field3406 != null) {
                if (this.field3430[var67] == -1) {
                    this.field3406[var67] = -1;
                } else {
                    this.field3406[var67] = (byte) (var8.method1408((byte) -25) - 1);
                }
            }
        }
        var2.field3565 = var33;
        var3.field3565 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1408((byte) -55);
            if (var75 == 1) {
                var68 = var2.method1404(0) + var71;
                var69 = var2.method1404(0) + var68;
                var70 = var2.method1404(0) + var69;
                var71 = var70;
                this.field3435[var72] = var68;
                this.field3420[var72] = var69;
                this.field3423[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1404(0) + var71;
                var71 = var70;
                this.field3435[var72] = var68;
                this.field3420[var72] = var69;
                this.field3423[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1404(0) + var71;
                var71 = var70;
                this.field3435[var72] = var68;
                this.field3420[var72] = var69;
                this.field3423[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1404(0) + var71;
                var71 = var70;
                this.field3435[var72] = var68;
                this.field3420[var72] = var78;
                this.field3423[var72] = var70;
            }
        }
        var2.field3565 = var50;
        var3.field3565 = var52;
        var4.field3565 = var54;
        var5.field3565 = var56;
        var6.field3565 = var58;
        var7.field3565 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field3431[var73] & 0xFF;
            if (var74 == 0) {
                this.field3425[var73] = (short) var2.method1410(-112);
                this.field3407[var73] = (short) var2.method1410(-108);
                this.field3424[var73] = (short) var2.method1410(-123);
            }
            if (var74 == 1) {
                this.field3425[var73] = (short) var3.method1410(-108);
                this.field3407[var73] = (short) var3.method1410(-124);
                this.field3424[var73] = (short) var3.method1410(-72);
                this.field3443[var73] = (short) var4.method1410(-107);
                this.field3445[var73] = (short) var4.method1410(-128);
                this.field3417[var73] = (short) var4.method1410(-76);
                this.field3413[var73] = var5.method1412((byte) 74);
                this.field3427[var73] = var6.method1412((byte) 98);
                this.field3415[var73] = var7.method1412((byte) 95);
            }
            if (var74 == 2) {
                this.field3425[var73] = (short) var3.method1410(-67);
                this.field3407[var73] = (short) var3.method1410(-61);
                this.field3424[var73] = (short) var3.method1410(-122);
                this.field3443[var73] = (short) var4.method1410(-128);
                this.field3445[var73] = (short) var4.method1410(-62);
                this.field3417[var73] = (short) var4.method1410(-114);
                this.field3413[var73] = var5.method1412((byte) 122);
                this.field3427[var73] = var6.method1412((byte) 83);
                this.field3415[var73] = var7.method1412((byte) 76);
                this.field3441[var73] = var7.method1412((byte) 105);
                this.field3436[var73] = var7.method1412((byte) 112);
            }
            if (var74 == 3) {
                this.field3425[var73] = (short) var3.method1410(-73);
                this.field3407[var73] = (short) var3.method1410(-63);
                this.field3424[var73] = (short) var3.method1410(-96);
                this.field3443[var73] = (short) var4.method1410(-76);
                this.field3445[var73] = (short) var4.method1410(-104);
                this.field3417[var73] = (short) var4.method1410(-59);
                this.field3413[var73] = var5.method1412((byte) 109);
                this.field3427[var73] = var6.method1412((byte) 117);
                this.field3415[var73] = var7.method1412((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
    private final void method1341(int arg0) {
        int var2 = field3438[arg0];
        int var3 = field3414[arg0];
        for (int var4 = 0; var4 < this.field3428; var4++) {
            int var5 = this.field3403[var4] * var3 + this.field3399[var4] * var2 >> 16;
            this.field3399[var4] = this.field3399[var4] * var3 - this.field3403[var4] * var2 >> 16;
            this.field3403[var4] = var5;
        }
        this.method1332();
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(SS)V")
    public final void method1342(short arg0, short arg1) {
        if (this.field3430 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3398; var3++) {
            if (this.field3430[var3] == arg0) {
                this.field3430[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()I")
    public final int method233() {
        if (!this.field3446) {
            this.method1335();
        }
        return this.field3426;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    private class192() {
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "([B)V")
    private class192(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1340(arg0);
        } else {
            this.method1338(arg0);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(III)V")
    public class192(int arg0, int arg1, int arg2) {
        this.field3403 = new int[arg0];
        this.field3399 = new int[arg0];
        this.field3440 = new int[arg0];
        this.field3444 = new int[arg0];
        this.field3435 = new int[arg1];
        this.field3420 = new int[arg1];
        this.field3423 = new int[arg1];
        this.field3412 = new byte[arg1];
        this.field3433 = new byte[arg1];
        this.field3439 = new byte[arg1];
        this.field3408 = new short[arg1];
        this.field3430 = new short[arg1];
        this.field3406 = new byte[arg1];
        this.field3419 = new int[arg1];
        if (arg2 > 0) {
            this.field3431 = new byte[arg2];
            this.field3425 = new short[arg2];
            this.field3407 = new short[arg2];
            this.field3424 = new short[arg2];
            this.field3443 = new short[arg2];
            this.field3445 = new short[arg2];
            this.field3417 = new short[arg2];
            this.field3413 = new byte[arg2];
            this.field3427 = new byte[arg2];
            this.field3415 = new byte[arg2];
            this.field3441 = new byte[arg2];
            this.field3436 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "([Lsi;I)V")
    public class192(class192[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3428 = 0;
        this.field3398 = 0;
        this.field3432 = 0;
        this.field3416 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class192 var15 = arg0[var9];
            if (var15 != null) {
                this.field3428 += var15.field3428;
                this.field3398 += var15.field3398;
                this.field3432 += var15.field3432;
                if (var15.field3433 == null) {
                    if (this.field3416 == -1) {
                        this.field3416 = var15.field3416;
                    }
                    if (this.field3416 != var15.field3416) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field3412 != null;
                var5 |= var15.field3439 != null;
                var6 |= var15.field3419 != null;
                var7 |= var15.field3430 != null;
                var8 |= var15.field3406 != null;
            }
        }
        this.field3403 = new int[this.field3428];
        this.field3399 = new int[this.field3428];
        this.field3440 = new int[this.field3428];
        this.field3444 = new int[this.field3428];
        this.field3435 = new int[this.field3398];
        this.field3420 = new int[this.field3398];
        this.field3423 = new int[this.field3398];
        if (var3) {
            this.field3412 = new byte[this.field3398];
        }
        if (var4) {
            this.field3433 = new byte[this.field3398];
        }
        if (var5) {
            this.field3439 = new byte[this.field3398];
        }
        if (var6) {
            this.field3419 = new int[this.field3398];
        }
        if (var7) {
            this.field3430 = new short[this.field3398];
        }
        if (var8) {
            this.field3406 = new byte[this.field3398];
        }
        this.field3408 = new short[this.field3398];
        if (this.field3432 > 0) {
            this.field3431 = new byte[this.field3432];
            this.field3425 = new short[this.field3432];
            this.field3407 = new short[this.field3432];
            this.field3424 = new short[this.field3432];
            this.field3443 = new short[this.field3432];
            this.field3445 = new short[this.field3432];
            this.field3417 = new short[this.field3432];
            this.field3413 = new byte[this.field3432];
            this.field3427 = new byte[this.field3432];
            this.field3415 = new byte[this.field3432];
            this.field3441 = new byte[this.field3432];
            this.field3436 = new byte[this.field3432];
        }
        this.field3428 = 0;
        this.field3398 = 0;
        this.field3432 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class192 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3398; var12++) {
                    if (var3 && var11.field3412 != null) {
                        this.field3412[this.field3398] = var11.field3412[var12];
                    }
                    if (var4) {
                        if (var11.field3433 == null) {
                            this.field3433[this.field3398] = var11.field3416;
                        } else {
                            this.field3433[this.field3398] = var11.field3433[var12];
                        }
                    }
                    if (var5 && var11.field3439 != null) {
                        this.field3439[this.field3398] = var11.field3439[var12];
                    }
                    if (var6 && var11.field3419 != null) {
                        this.field3419[this.field3398] = var11.field3419[var12];
                    }
                    if (var7) {
                        if (var11.field3430 == null) {
                            this.field3430[this.field3398] = -1;
                        } else {
                            this.field3430[this.field3398] = var11.field3430[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field3406 == null || var11.field3406[var12] == -1) {
                            this.field3406[this.field3398] = -1;
                        } else {
                            this.field3406[this.field3398] = (byte) (var11.field3406[var12] + this.field3432);
                        }
                    }
                    this.field3408[this.field3398] = var11.field3408[var12];
                    this.field3435[this.field3398] = this.method1319(var11, var11.field3435[var12]);
                    this.field3420[this.field3398] = this.method1319(var11, var11.field3420[var12]);
                    this.field3423[this.field3398] = this.method1319(var11, var11.field3423[var12]);
                    this.field3398++;
                }
                for (int var13 = 0; var13 < var11.field3432; var13++) {
                    byte var14 = this.field3431[this.field3432] = var11.field3431[var13];
                    if (var14 == 0) {
                        this.field3425[this.field3432] = (short) this.method1319(var11, var11.field3425[var13]);
                        this.field3407[this.field3432] = (short) this.method1319(var11, var11.field3407[var13]);
                        this.field3424[this.field3432] = (short) this.method1319(var11, var11.field3424[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3425[this.field3432] = var11.field3425[var13];
                        this.field3407[this.field3432] = var11.field3407[var13];
                        this.field3424[this.field3432] = var11.field3424[var13];
                        this.field3443[this.field3432] = var11.field3443[var13];
                        this.field3445[this.field3432] = var11.field3445[var13];
                        this.field3417[this.field3432] = var11.field3417[var13];
                        this.field3413[this.field3432] = var11.field3413[var13];
                        this.field3427[this.field3432] = var11.field3427[var13];
                        this.field3415[this.field3432] = var11.field3415[var13];
                    }
                    if (var14 == 2) {
                        this.field3441[this.field3432] = var11.field3441[var13];
                        this.field3436[this.field3432] = var11.field3436[var13];
                    }
                    this.field3432++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lsi;ZZZZ)V")
    public class192(class192 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3428 = arg0.field3428;
        this.field3398 = arg0.field3398;
        this.field3432 = arg0.field3432;
        if (arg1) {
            this.field3403 = arg0.field3403;
            this.field3399 = arg0.field3399;
            this.field3440 = arg0.field3440;
        } else {
            this.field3403 = new int[this.field3428];
            this.field3399 = new int[this.field3428];
            this.field3440 = new int[this.field3428];
            for (int var6 = 0; var6 < this.field3428; var6++) {
                this.field3403[var6] = arg0.field3403[var6];
                this.field3399[var6] = arg0.field3399[var6];
                this.field3440[var6] = arg0.field3440[var6];
            }
        }
        if (arg2) {
            this.field3408 = arg0.field3408;
        } else {
            this.field3408 = new short[this.field3398];
            for (int var7 = 0; var7 < this.field3398; var7++) {
                this.field3408[var7] = arg0.field3408[var7];
            }
        }
        if (arg3 || arg0.field3430 == null) {
            this.field3430 = arg0.field3430;
        } else {
            this.field3430 = new short[this.field3398];
            for (int var8 = 0; var8 < this.field3398; var8++) {
                this.field3430[var8] = arg0.field3430[var8];
            }
        }
        if (arg4) {
            this.field3439 = arg0.field3439;
        } else {
            this.field3439 = new byte[this.field3398];
            if (arg0.field3439 == null) {
                for (int var9 = 0; var9 < this.field3398; var9++) {
                    this.field3439[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3398; var10++) {
                    this.field3439[var10] = arg0.field3439[var10];
                }
            }
        }
        this.field3435 = arg0.field3435;
        this.field3420 = arg0.field3420;
        this.field3423 = arg0.field3423;
        this.field3412 = arg0.field3412;
        this.field3433 = arg0.field3433;
        this.field3406 = arg0.field3406;
        this.field3416 = arg0.field3416;
        this.field3431 = arg0.field3431;
        this.field3425 = arg0.field3425;
        this.field3407 = arg0.field3407;
        this.field3424 = arg0.field3424;
        this.field3443 = arg0.field3443;
        this.field3445 = arg0.field3445;
        this.field3417 = arg0.field3417;
        this.field3413 = arg0.field3413;
        this.field3427 = arg0.field3427;
        this.field3415 = arg0.field3415;
        this.field3441 = arg0.field3441;
        this.field3436 = arg0.field3436;
        this.field3444 = arg0.field3444;
        this.field3419 = arg0.field3419;
        this.field3401 = arg0.field3401;
        this.field3437 = arg0.field3437;
        this.field3422 = arg0.field3422;
        this.field3442 = arg0.field3442;
        this.field3410 = arg0.field3410;
        this.field3409 = arg0.field3409;
        this.field3434 = arg0.field3434;
    }
}
