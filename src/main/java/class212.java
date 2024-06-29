import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class212 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Z")
    public boolean field3282 = false;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field3293 = -1;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[I")
    private int[] field3305 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3288 = new String[100];

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3291 = -1;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[Lqd;")
    public static class3[] field3286 = new class3[14];

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field3289 = -1;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3304 = "M";

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "[I")
    private int[] field3295;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[S")
    private short[] field3283;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[S")
    private short[] field3285;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[S")
    private short[] field3290;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[S")
    private short[] field3294;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lui;")
    public final class234 method1434(int arg0) {
        field3302++;
        if (arg0 != -23973) {
            return null;
        }
        int var2 = 0;
        class234[] var3 = new class234[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3305[var4] != -1) {
                var3[var2++] = class234.method1575(class265.field4241, this.field3305[var4], 0);
            }
        }
        class234 var5 = new class234(var3, var2);
        if (this.field3285 != null) {
            for (int var6 = 0; var6 < this.field3285.length; var6++) {
                var5.method1565(this.field3285[var6], this.field3283[var6]);
            }
        }
        if (this.field3294 != null) {
            for (int var7 = 0; var7 < this.field3294.length; var7++) {
                var5.method1571(this.field3294[var7], this.field3290[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static final void method1435(byte arg0) {
        class8.field163.method1898((byte) 20);
        if (arg0 != 27) {
            method1443(93, -51);
        }
        field3301++;
        class57.field944.method1898((byte) 113);
        class171.field2664.method1898((byte) 84);
        class161.field2504.method1898((byte) 78);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIILji;Lji;IIIIJ)V")
    public static final void method1436(int arg0, int arg1, int arg2, int arg3, class43 arg4, class43 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class206 var12 = new class206();
        var12.field3217 = arg10;
        var12.field3213 = arg1 * 128 + 64;
        var12.field3211 = arg2 * 128 + 64;
        var12.field3223 = arg3;
        var12.field3224 = arg4;
        var12.field3222 = arg5;
        var12.field3218 = arg6;
        var12.field3216 = arg7;
        var12.field3210 = arg8;
        var12.field3221 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class269.field4298[var13][arg1][arg2] == null) {
                class269.field4298[var13][arg1][arg2] = new class6(var13, arg1, arg2);
            }
        }
        class269.field4298[arg0][arg1][arg2].field123 = var12;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field3287++;
        if (!arg6) {
            return;
        }
        int var8 = arg3 + arg7;
        int var9 = arg1 - arg7;
        int var10 = arg4 + arg7;
        int var11 = arg5 - arg7;
        for (int var12 = arg3; var12 < var8; var12++) {
            class166.method1124(true, class154.field2406[var12], arg5, arg0, arg4);
        }
        for (int var13 = arg1; var13 > var9; var13--) {
            class166.method1124(arg6, class154.field2406[var13], arg5, arg0, arg4);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class154.field2406[var14];
            class166.method1124(true, var15, var10, arg0, arg4);
            class166.method1124(true, var15, var11, arg2, var10);
            class166.method1124(true, var15, arg5, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Lui;")
    public final class234 method1438(int arg0) {
        field3300++;
        if (this.field3295 == null) {
            return null;
        }
        class234[] var2 = new class234[this.field3295.length];
        if (arg0 < 77) {
            return null;
        }
        for (int var3 = 0; var3 < this.field3295.length; var3++) {
            var2[var3] = class234.method1575(class265.field4241, this.field3295[var3], 0);
        }
        class234 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class234(var2, var2.length);
        }
        if (this.field3285 != null) {
            for (int var5 = 0; var5 < this.field3285.length; var5++) {
                var4.method1565(this.field3285[var5], this.field3283[var5]);
            }
        }
        if (this.field3294 != null) {
            for (int var6 = 0; var6 < this.field3294.length; var6++) {
                var4.method1571(this.field3294[var6], this.field3290[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Z")
    public final boolean method1439(byte arg0) {
        field3297++;
        if (this.field3295 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3295.length; var3++) {
            if (!class265.field4241.method1615(arg0 - 217, this.field3295[var3], 0)) {
                var2 = false;
            }
        }
        if (arg0 != 102) {
            field3304 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILhc;II)Z")
    public static final boolean method1440(int arg0, class235 arg1, int arg2, int arg3) {
        field3281++;
        byte[] var4 = arg1.method1590(arg0, (byte) -25, arg2);
        if (arg3 != 41) {
            field3286 = null;
        }
        if (var4 == null) {
            return false;
        } else {
            class179.method1210(1, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Z")
    public final boolean method1441(byte arg0) {
        field3303++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3305[var3] != -1 && !class265.field4241.method1615(-28, this.field3305[var3], 0)) {
                var2 = false;
            }
        }
        if (arg0 < 11) {
            this.field3294 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILai;I)V")
    private final void method1442(int arg0, class88 arg1, int arg2) {
        field3299++;
        if (arg0 == 1) {
            this.field3293 = arg1.method633(119);
        } else if (arg0 == 2) {
            int var4 = arg1.method633(101);
            this.field3295 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3295[var5] = arg1.method645(11596);
            }
        } else if (arg0 == 3) {
            this.field3282 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method633(94);
            this.field3285 = new short[var8];
            this.field3283 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3285[var9] = (short) arg1.method645(11596);
                this.field3283[var9] = (short) arg1.method645(class87.method619(arg2, -14422));
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method633(arg2 + 5459);
            this.field3294 = new short[var6];
            this.field3290 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3294[var7] = (short) arg1.method645(11596);
                this.field3290[var7] = (short) arg1.method645(11596);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field3305[arg0 - 60] = arg1.method645(11596);
        }
        if (arg2 != -5402) {
            this.field3305 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public static final void method1443(int arg0, int arg1) {
        field3284++;
        class50.field736.method1897(true, arg0);
        int var2 = -19 % ((54 - arg1) / 54);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static void method1444(int arg0) {
        field3286 = null;
        field3304 = null;
        if (arg0 == 0) {
            field3288 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lai;I)V")
    public final void method1445(class88 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method633(arg1 - 22617);
            if (var3 == 0) {
                if (arg1 != 22710) {
                    this.method1441((byte) 96);
                }
                field3298++;
                return;
            }
            this.method1442(var3, arg0, arg1 - 28112);
        }
    }
}
