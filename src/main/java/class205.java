import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class205 implements class276 {

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lui;")
    private class239 field3281 = new class239(256);

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Ljj;")
    private class134 field3286;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ljj;")
    private class134 field3292;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "[Lld;")
    private class109[] field3287;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
    public static boolean field3279 = true;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3278 = "scroll:";

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3284 = -1;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3282 = "Choose Option";

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field3285 = 0;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3290 = "Walk here";

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field3293 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZFII)[I")
    public final int[] method1372(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        if (arg4 == 1) {
            field3289++;
            return this.method1266(arg5, 4611).method1977(arg1, false, this, (double) arg3, this.field3292, arg2, this.field3287[arg5].field1879, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(BI)Z")
    public static final boolean method1373(byte arg0, int arg1) {
        field3294++;
        if (arg0 < 67) {
            method1373((byte) -77, 12);
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)Ldj;")
    public class296 method1266(int arg0, int arg1) {
        class175 var3 = this.field3281.method1579((long) arg0, 0);
        field3280++;
        if (var3 != null) {
            return (class296) var3;
        }
        if (arg1 != 4611) {
            field3291 = -38;
        }
        byte[] var4 = this.field3286.method939(true, arg0);
        if (var4 == null) {
            return null;
        } else {
            class296 var5 = new class296(new class264(var4));
            this.field3281.method1578(var5, (long) arg0, arg1 - 4561);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static final void method1374(byte arg0) {
        field3277++;
        int var1 = 104 % ((55 - arg0) / 60);
        class251.field4025 = 0;
        int var2 = (class197.field3179.field614 >> 7) + class296.field4685;
        int var3 = (class197.field3179.field613 >> 7) + class93.field1321;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class251.field4025 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class251.field4025 = 1;
        }
        if (class251.field4025 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class251.field4025 = 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static final void method1375(byte arg0) {
        if (arg0 != -14) {
            field3285 = -39;
        }
        class6.field75 = null;
        field3288++;
        class206.field3313 = null;
        class189.field3021 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)Z")
    public final boolean method1376(boolean arg0, int arg1) {
        field3295++;
        if (arg0) {
            class296 var3 = this.method1266(arg1, 4611);
            return var3 != null && var3.method1979(this, -13722, this.field3292);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method1377(int arg0) {
        int var1 = -74 % ((arg0 + 56) / 36);
        field3290 = null;
        field3278 = null;
        field3282 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lld;")
    public final class109 method1378(int arg0, int arg1) {
        if (arg1 != 3139) {
            field3284 = 65;
        }
        field3283++;
        return this.field3287[arg0];
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljj;Ljj;Ljj;)V")
    public class205(class134 arg0, class134 arg1, class134 arg2) {
        this.field3286 = arg1;
        this.field3292 = arg2;
        class264 var4 = new class264(arg0.method940((byte) 81, 0, 0));
        int var5 = var4.method1777(-57);
        this.field3287 = new class109[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1779(-124) == 1) {
                this.field3287[var6] = new class109();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3287[var7] != null) {
                this.field3287[var7].field1883 = var4.method1779(-73) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3287[var8] != null) {
                this.field3287[var8].field1888 = var4.method1779(-101) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3287[var9] != null) {
                this.field3287[var9].field1886 = var4.method1779(-118) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3287[var10] != null) {
                var4.method1779(-88);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3287[var11] != null) {
                var4.method1767(16711680);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3287[var12] != null) {
                var4.method1767(16711680);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3287[var13] != null) {
                var4.method1767(16711680);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3287[var14] != null) {
                var4.method1767(16711680);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3287[var15] != null) {
                this.field3287[var15].field1887 = (short) var4.method1777(-116);
            }
        }
        if (var4.field4198.length > var4.field4195) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field3287[var16] != null) {
                    var4.method1767(16711680);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field3287[var17] != null) {
                    var4.method1767(16711680);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field3287[var18] != null) {
                    var4.method1779(-83);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field3287[var19] != null) {
                    this.field3287[var19].field1879 = var4.method1779(-90) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field3287[var20] != null) {
                    var4.method1767(16711680);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field3287[var21] != null) {
                    var4.method1779(-93);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field3287[var22] != null) {
                    var4.method1779(-59);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field3287[var23] != null) {
                    var4.method1779(-100);
                }
            }
        }
    }
}
