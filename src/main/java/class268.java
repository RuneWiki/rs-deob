import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class268 {

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "[I")
    private int[] field3506;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[I")
    private int[] field3498;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "[I")
    private int[] field3502;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "[I")
    private int[] field3503;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[[I")
    private int[][] field3504;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    private int field3501;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
    private int[] field3495;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[I")
    private static int[] field3497 = new int[] { 256, 128, 86, 64 };

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[F")
    private static float[] field3500 = new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
    private static int[] field3496;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "[I")
    private static int[] field3499;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[Z")
    private static boolean[] field3505;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII[FI)V", line = 7)
    private final void method1598(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5) {
        int var7 = arg3 - arg1;
        int var8 = arg2 - arg0;
        int var9 = var7 < 0 ? -var7 : var7;
        int var10 = var7 / var8;
        int var11 = arg1;
        int var12 = 0;
        int var13 = var7 < 0 ? var10 - 1 : var10 + 1;
        int var14 = var9 - (var10 < 0 ? -var10 : var10) * var8;
        arg4[arg0] *= field3500[arg1];
        if (arg2 > arg5) {
            arg2 = arg5;
        }
        for (int var15 = arg0 + 1; var15 < arg2; var15++) {
            var12 += var14;
            if (var12 >= var8) {
                var12 -= var8;
                var11 += var13;
            } else {
                var11 += var10;
            }
            arg4[var15] *= field3500[var11];
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V", line = 55)
    public static void method1599() {
        field3497 = null;
        field3500 = null;
        field3499 = null;
        field3496 = null;
        field3505 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([II)I", line = 63)
    private static final int method1600(int[] arg0, int arg1) {
        int var2 = arg0[arg1];
        int var3 = -1;
        int var4 = Integer.MIN_VALUE;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var6 = arg0[var5];
            if (var6 < var2 && var6 > var4) {
                var3 = var5;
                var4 = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V", line = 88)
    private final void method1601(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = field3499[arg0];
        int var5 = field3496[arg0];
        boolean var6 = field3505[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = field3499[var7];
            if (var8 < var4) {
                field3499[var3] = var8;
                field3496[var3] = field3496[var7];
                field3505[var3] = field3505[var7];
                var3++;
                field3499[var7] = field3499[var3];
                field3496[var7] = field3496[var3];
                field3505[var7] = field3505[var3];
            }
        }
        field3499[var3] = var4;
        field3496[var3] = var5;
        field3505[var3] = var6;
        this.method1601(arg0, var3 - 1);
        this.method1601(var3 + 1, arg1);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()Z", line = 128)
    public final boolean method1602() {
        boolean var1 = class577.method3191() != 0;
        if (!var1) {
            return false;
        }
        int var2 = this.field3495.length;
        for (int var3 = 0; var3 < var2; var3++) {
            field3499[var3] = this.field3495[var3];
        }
        int var4 = field3497[this.field3501 - 1];
        int var5 = class252.method1532(-68, var4 - 1);
        field3496[0] = class577.method3183(var5);
        field3496[1] = class577.method3183(var5);
        int var6 = 2;
        for (int var7 = 0; var7 < this.field3506.length; var7++) {
            int var8 = this.field3506[var7];
            int var9 = this.field3498[var8];
            int var10 = this.field3502[var8];
            int var11 = (0x1 << var10) - 1;
            int var12 = 0;
            if (var10 > 0) {
                var12 = class577.field7881[this.field3503[var8]].method406();
            }
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = this.field3504[var8][var12 & var11];
                var12 >>>= var10;
                field3496[var6++] = var14 >= 0 ? class577.field7881[var14].method406() : 0;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([FI)V", line = 187)
    public final void method1603(float[] arg0, int arg1) {
        int var3 = this.field3495.length;
        int var4 = field3497[this.field3501 - 1];
        field3505[0] = field3505[1] = true;
        for (int var5 = 2; var5 < var3; var5++) {
            int var13 = method1600(field3499, var5);
            int var14 = method1604(field3499, var5);
            int var15 = this.method1605(field3499[var13], field3496[var13], field3499[var14], field3496[var14], field3499[var5]);
            int var16 = field3496[var5];
            int var17 = var4 - var15;
            int var19 = (var17 < var15 ? var17 : var15) << 1;
            if (var16 == 0) {
                field3505[var5] = false;
                field3496[var5] = var15;
            } else {
                field3505[var13] = field3505[var14] = true;
                field3505[var5] = true;
                if (var16 >= var19) {
                    field3496[var5] = var17 > var15 ? var16 + var15 - var15 : var15 - var16 + var17 - 1;
                } else {
                    field3496[var5] = (var16 & 0x1) == 0 ? var16 / 2 + var15 : var15 - (var16 + 1) / 2;
                }
            }
        }
        this.method1601(0, var3 - 1);
        int var6 = 0;
        int var7 = field3496[0] * this.field3501;
        for (int var8 = 1; var8 < var3; var8++) {
            if (field3505[var8]) {
                int var11 = field3499[var8];
                int var12 = field3496[var8] * this.field3501;
                this.method1598(var6, var7, var11, var12, arg0, arg1);
                if (var11 >= arg1) {
                    return;
                }
                var6 = var11;
                var7 = var12;
            }
        }
        float var9 = field3500[var7];
        for (int var10 = var6; var10 < arg1; var10++) {
            arg0[var10] *= var9;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "([II)I", line = 278)
    private static final int method1604(int[] arg0, int arg1) {
        int var2 = arg0[arg1];
        int var3 = -1;
        int var4 = Integer.MAX_VALUE;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var6 = arg0[var5];
            if (var6 > var2 && var6 < var4) {
                var3 = var5;
                var4 = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 301)
    public class268() {
        int var1 = class577.method3183(16);
        if (var1 != 1) {
            throw new RuntimeException();
        }
        int var2 = class577.method3183(5);
        int var3 = 0;
        this.field3506 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            int var17 = class577.method3183(4);
            this.field3506[var4] = var17;
            if (var17 >= var3) {
                var3 = var17 + 1;
            }
        }
        this.field3498 = new int[var3];
        this.field3502 = new int[var3];
        this.field3503 = new int[var3];
        this.field3504 = new int[var3][];
        for (int var5 = 0; var5 < var3; var5++) {
            this.field3498[var5] = class577.method3183(3) + 1;
            int var13 = this.field3502[var5] = class577.method3183(2);
            if (var13 != 0) {
                this.field3503[var5] = class577.method3183(8);
            }
            int var14 = 0x1 << var13;
            int[] var15 = new int[var14];
            this.field3504[var5] = var15;
            for (int var16 = 0; var16 < var14; var16++) {
                var15[var16] = class577.method3183(8) - 1;
            }
        }
        this.field3501 = class577.method3183(2) + 1;
        int var6 = class577.method3183(4);
        int var7 = 2;
        for (int var8 = 0; var8 < var2; var8++) {
            var7 += this.field3498[this.field3506[var8]];
        }
        this.field3495 = new int[var7];
        this.field3495[0] = 0;
        this.field3495[1] = 0x1 << var6;
        int var9 = 2;
        for (int var10 = 0; var10 < var2; var10++) {
            int var11 = this.field3506[var10];
            for (int var12 = 0; var12 < this.field3498[var11]; var12++) {
                this.field3495[var9++] = class577.method3183(var6);
            }
        }
        if (field3499 == null || field3499.length < var9) {
            field3499 = new int[var9];
            field3496 = new int[var9];
            field3505 = new boolean[var9];
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)I", line = 402)
    private final int method1605(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg3 - arg1;
        int var7 = arg2 - arg0;
        int var8 = var6 < 0 ? -var6 : var6;
        int var9 = (arg4 - arg0) * var8;
        int var10 = var9 / var7;
        return var6 < 0 ? arg1 - var10 : arg1 + var10;
    }
}
