import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class86 {

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    private int field1272 = 0;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[Llh;")
    public class59[] field1252;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "J")
    public static long field1251 = 0L;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Lok;")
    public static class41 field1253 = class137.method956("", 45);

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Z")
    public static boolean field1266 = false;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Lbc;")
    public static class302 field1264 = null;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Lok;")
    public static class41 field1271 = class137.method956("sch-Utteln:", 45);

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field1268 = 0;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "J")
    private long field1250;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lbc;")
    public static class302 field1254;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Llh;")
    private class59 field1256;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Llh;")
    private class59 field1270;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Llh;", line = 5)
    public final class59 method609(int arg0) {
        int var2 = -32 % ((arg0 - 71) / 33);
        this.field1272 = 0;
        field1255++;
        return this.method616(114);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILlh;J)V", line = 17)
    public final void method610(int arg0, class59 arg1, long arg2) {
        field1260++;
        if (arg1.field856 != null) {
            arg1.method418(6971);
        }
        class59 var5 = this.field1252[(int) (arg2 & (long) (this.field1265 - 1))];
        arg1.field844 = arg2;
        arg1.field841 = var5;
        arg1.field856 = var5.field856;
        arg1.field856.field841 = arg1;
        if (arg0 < 76) {
            this.method612(103, (class59[]) null);
        }
        arg1.field841.field856 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 38)
    public static void method611(int arg0) {
        field1254 = null;
        if (arg0 != 1) {
            method619((class126) null, 104, -79, 23, -91, -59);
        }
        field1253 = null;
        field1264 = null;
        field1271 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[Llh;)I", line = 51)
    public final int method612(int arg0, class59[] arg1) {
        field1263++;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 128) {
            field1253 = (class41) null;
        }
        while (var4 < this.field1265) {
            class59 var5 = this.field1252[var4];
            for (class59 var6 = var5.field841; var6 != var5; var6 = var6.field841) {
                arg1[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)Llh;", line = 93)
    public final class59 method613(int arg0) {
        field1267++;
        if (this.field1256 == null) {
            return null;
        }
        class59 var2 = this.field1252[(int) (this.field1250 & (long) (this.field1265 - 1))];
        while (this.field1256 != var2) {
            if (this.field1256.field844 == this.field1250) {
                class59 var3 = this.field1256;
                this.field1256 = this.field1256.field841;
                return var3;
            }
            this.field1256 = this.field1256.field841;
        }
        this.field1256 = null;
        int var4 = -84 / ((-arg0 - 37) / 35);
        return null;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)I", line = 135)
    public final int method614(int arg0) {
        field1261++;
        int var2 = 0;
        if (arg0 >= -16) {
            return 91;
        }
        for (int var3 = 0; var3 < this.field1265; var3++) {
            class59 var4 = this.field1252[var3];
            class59 var5 = var4.field841;
            while (var4 != var5) {
                var5 = var5.field841;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V", line = 175)
    public final void method615(int arg0) {
        field1249++;
        int var2 = 0;
        if (arg0 != 15968) {
            return;
        }
        while (this.field1265 > var2) {
            class59 var3 = this.field1252[var2];
            while (true) {
                class59 var4 = var3.field841;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method418(6971);
            }
        }
        this.field1256 = null;
        this.field1270 = null;
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)Llh;", line = 207)
    public final class59 method616(int arg0) {
        field1273++;
        if (this.field1272 > 0 && this.field1252[this.field1272 - 1] != this.field1270) {
            class59 var2 = this.field1270;
            this.field1270 = var2.field841;
            return var2;
        }
        int var3 = 13 % ((arg0 - 65) / 46);
        class59 var4;
        do {
            if (this.field1272 >= this.field1265) {
                return null;
            }
            var4 = this.field1252[this.field1272++].field841;
        } while (this.field1252[this.field1272 - 1] == var4);
        this.field1270 = var4.field841;
        return var4;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(JZ)Llh;", line = 241)
    public final class59 method617(long arg0, boolean arg1) {
        this.field1250 = arg0;
        field1257++;
        class59 var4 = this.field1252[(int) ((long) (this.field1265 - 1) & arg0)];
        this.field1256 = var4.field841;
        if (arg1) {
            return (class59) null;
        }
        while (this.field1256 != var4) {
            if (this.field1256.field844 == arg0) {
                class59 var5 = this.field1256;
                this.field1256 = this.field1256.field841;
                return var5;
            }
            this.field1256 = this.field1256.field841;
        }
        this.field1256 = null;
        return null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)I", line = 276)
    public final int method618(byte arg0) {
        if (arg0 == 104) {
            field1258++;
            return this.field1265;
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lth;IIIII)V", line = 289)
    public static final void method619(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class308.field5184 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class272.field4434) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class65.field996 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class308 var14 = class205.field3312[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class278.field4548[var11][var12 + 1][var13] + class278.field4548[var11][var12][var13] + class278.field4548[var11][var12][var13 + 1] + class278.field4548[var11][var12 + 1][var13 + 1]) / 4 - (class278.field4548[arg1][arg2 + 1][arg3] + class278.field4548[arg1][arg2][arg3] + class278.field4548[arg1][arg2][arg3 + 1] + class278.field4548[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class241 var16 = var14.field5210;
                                    if (var16 != null) {
                                        if (var16.field3864.method889()) {
                                            arg0.method885(var16.field3864, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3854 != null && var16.field3854.method889()) {
                                            arg0.method885(var16.field3854, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field5193; var17++) {
                                        class232 var18 = var14.field5201[var17];
                                        if (var18 != null && var18.field3674.method889() && (var18.field3668 == var12 || var7 == var12) && (var18.field3665 == var13 || var9 == var13)) {
                                            int var19 = var18.field3673 + 1 - var18.field3668;
                                            int var20 = var18.field3676 + 1 - var18.field3665;
                                            arg0.method885(var18.field3674, (var18.field3668 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3665 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V", line = 389)
    public static final void method620(int arg0) {
        field1262++;
        if (arg0 == 3066 && class259.field4132 == 5) {
            class259.field4132 = 6;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(I)V", line = 402)
    public class86(int arg0) {
        this.field1252 = new class59[arg0];
        this.field1265 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class59 var3 = this.field1252[var2] = new class59();
            var3.field856 = var3;
            var3.field841 = var3;
        }
    }
}
