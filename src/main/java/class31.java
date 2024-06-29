import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class31 implements class96 {

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Loa;")
    private class149 field394 = new class149(256);

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Liq;")
    private class134 field389;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Liq;")
    private class134 field393;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "[Lhe;")
    private class154[] field398;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lpf;")
    public static class425 field392 = new class425(45, 4);

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "[[I")
    public static int[][] field397 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Lqf;")
    public static class130 field396;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)Lij;")
    private final class408 method177(int arg0, int arg1) {
        field388++;
        if (arg0 <= 89) {
            method184(true, (class134) null, (class134) null);
        }
        class426 var3 = this.field394.method927((long) arg1, -117);
        if (var3 != null) {
            return (class408) var3;
        }
        byte[] var4 = this.field389.method825(arg1, 0);
        if (var4 == null) {
            return null;
        } else {
            class408 var5 = new class408(new class385(var4));
            this.field394.method929((long) arg1, var5, false);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)Z")
    public final boolean method178(boolean arg0, int arg1) {
        field391++;
        if (arg0) {
            field396 = null;
        }
        class408 var3 = this.method177(126, arg1);
        return var3 != null && var3.method2560(this, this.field393, -1857);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method179(int arg0) {
        field397 = null;
        field392 = null;
        field396 = null;
        if (arg0 != 0) {
            field396 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lhe;")
    public final class154 method180(int arg0, int arg1) {
        int var3 = -10 % ((arg1 + 61) / 44);
        field387++;
        return this.field398[arg0];
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lfh;ILor;IIIIZI)V")
    public static final void method181(class170 arg0, int arg1, class153 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field384++;
        if (!arg7) {
            return;
        }
        int var9 = arg5 * arg5 + arg8 * arg8;
        if (arg1 < var9) {
            return;
        }
        int var10 = Math.min(arg0.field2561 / 2, arg0.field2501 / 2);
        if (var10 * var10 >= var9) {
            class171.method1055(class116.field1525[arg6], 0, arg2, arg0, arg4, arg3, arg8, arg5);
            return;
        }
        var10 -= 10;
        int var11;
        if (class80.field1054 == 4) {
            var11 = (int) class462.field6810 & 0x3FFF;
        } else {
            var11 = (int) class462.field6810 + class3.field39 & 0x3FFF;
        }
        int var12 = class110.field1450[var11];
        int var13 = class110.field1452[var11];
        if (class80.field1054 != 4) {
            var12 = var12 * 256 / (class343.field5138 + 256);
            var13 = var13 * 256 / (class343.field5138 + 256);
        }
        int var14 = arg5 * var12 + (arg8 * var13) >> 15;
        int var15 = arg5 * var13 - (arg8 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var10);
        int var19 = (int) ((double) var10 * Math.cos(var16));
        class402.field6008[arg6].method1414((float) arg0.field2561 / 2.0F + (float) arg3 + (float) var18, (float) arg0.field2501 / 2.0F + (float) arg4 - (float) var19, 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZFBI)[F")
    public final float[] method182(int arg0, int arg1, boolean arg2, float arg3, byte arg4, int arg5) {
        if (arg4 >= -29) {
            return null;
        } else {
            field395++;
            return this.method177(95, arg1).method2564(44, arg5, this, this.field398[arg1].field2132, this.field393, arg0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IFIIZI)[I")
    public final int[] method183(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == 30111) {
            field390++;
            return this.method177(118, arg3).method2565(-76, arg5, this.field393, (double) arg1, arg2, this.field398[arg3].field2132, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLiq;Liq;)V")
    public static final void method184(boolean arg0, class134 arg1, class134 arg2) {
        class442.field6499 = arg1;
        class180.field2713 = arg2;
        field386++;
        if (arg0) {
            method184(false, (class134) null, (class134) null);
        }
        class442.field6499.method812(34, (byte) -41);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZIFII)[I")
    public final int[] method185(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg4 != 17486) {
            field396 = null;
        }
        field385++;
        return this.method177(101, arg5).method2562(this, arg2, arg0, arg1, (double) arg3, this.field398[arg5].field2132, this.field393, 0);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Liq;Liq;Liq;)V")
    public class31(class134 arg0, class134 arg1, class134 arg2) {
        this.field389 = arg1;
        this.field393 = arg2;
        class385 var4 = new class385(arg0.method823(0, -20334, 0));
        int var5 = var4.method2323(-70);
        this.field398 = new class154[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2343(255) == 1) {
                this.field398[var6] = new class154();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field398[var7] != null) {
                this.field398[var7].field2129 = var4.method2343(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field398[var8] != null) {
                this.field398[var8].field2111 = var4.method2343(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field398[var9] != null) {
                this.field398[var9].field2126 = var4.method2343(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field398[var10] != null) {
                this.field398[var10].field2107 = var4.method2343(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field398[var11] != null) {
                this.field398[var11].field2108 = var4.method2341((byte) 54);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field398[var12] != null) {
                this.field398[var12].field2123 = var4.method2341((byte) 54);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field398[var13] != null) {
                this.field398[var13].field2125 = var4.method2341((byte) 54);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field398[var14] != null) {
                this.field398[var14].field2128 = var4.method2341((byte) 54);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field398[var15] != null) {
                this.field398[var15].field2134 = (short) var4.method2323(-13);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field398[var16] != null) {
                this.field398[var16].field2110 = var4.method2341((byte) 54);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field398[var17] != null) {
                this.field398[var17].field2127 = var4.method2341((byte) 54);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field398[var18] != null) {
                this.field398[var18].field2116 = var4.method2343(255) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field398[var19] != null) {
                this.field398[var19].field2132 = var4.method2343(255) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field398[var20] != null) {
                this.field398[var20].field2131 = var4.method2341((byte) 54);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field398[var21] != null) {
                this.field398[var21].field2120 = var4.method2343(255) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field398[var22] != null) {
                this.field398[var22].field2133 = var4.method2343(255) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field398[var23] != null) {
                this.field398[var23].field2114 = var4.method2343(255) == 1;
            }
        }
    }
}
