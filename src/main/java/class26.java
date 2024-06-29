import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class26 implements class210 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lgq;")
    private class418 field368 = new class418(256);

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Llm;")
    private class347 field373;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Llm;")
    private class347 field377;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[Ljh;")
    private class444[] field376;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public static int[] field365 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static volatile int field364 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lcr;")
    public static class189 field362 = new class189(64);

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
    public static int[] field380 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Z")
    public static boolean field379;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
    public static int[] field363;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBZIIF)[I", line = 3)
    public final int[] method181(int arg0, byte arg1, boolean arg2, int arg3, int arg4, float arg5) {
        if (arg1 != 100) {
            field364 = -58;
        }
        field371++;
        return this.method182(arg4, arg1 + 27).method2008(-61, arg3, this.field373, arg2, arg0, (double) arg5, this, this.field376[arg4].field6492);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)Ltg;", line = 15)
    private final class294 method182(int arg0, int arg1) {
        field375++;
        class225 var3 = this.field368.method2674((long) arg0, 22300);
        if (var3 != null) {
            return (class294) var3;
        }
        int var4 = -68 / ((arg1 - 39) / 55);
        byte[] var5 = this.field377.method2266((byte) 56, arg0);
        if (var5 == null) {
            return null;
        } else {
            class294 var6 = new class294(new class228(var5));
            this.field368.method2673((long) arg0, var6, 11465);
            return var6;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIZFII)[F", line = 46)
    public final float[] method183(boolean arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        if (arg2) {
            return null;
        } else {
            field374++;
            return this.method182(arg4, -116).method2010(arg1, this.field373, arg5, this.field376[arg4].field6492, this, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Z", line = 61)
    public final boolean method184(int arg0, int arg1) {
        field372++;
        if (arg1 == 14556) {
            class294 var3 = this.method182(arg0, arg1 ^ 0xFFFFC749);
            return var3 != null && var3.method2011(this, this.field373, 0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIIIFI)[I", line = 75)
    public final int[] method185(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5) {
        if (arg1 > -105) {
            this.method184(-97, -112);
        }
        field369++;
        return this.method182(arg5, -128).method2013(this, (double) arg4, arg3, false, arg2, this.field373, this.field376[arg5].field6492);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Ljh;", line = 86)
    public final class444 method186(int arg0, int arg1) {
        field367++;
        if (arg1 != -9590) {
            this.method184(-18, -112);
        }
        return this.field376[arg0];
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 101)
    public static final void method187(int arg0) {
        class362.field5233 = 0;
        class126.field1771 = 0;
        class368.field5313 = false;
        class102.field1416 = -3;
        class188.field2532 = 1;
        if (arg0 != 21274) {
            method187(-90);
        }
        class324.field4751 = 0;
        class178.field2362 = -1;
        field366++;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 119)
    public static void method188(int arg0) {
        field363 = null;
        field380 = null;
        field365 = null;
        field362 = null;
        if (arg0 != 0) {
            method188(-65);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Llm;Llm;Llm;)V", line = 152)
    public class26(class347 arg0, class347 arg1, class347 arg2) {
        this.field373 = arg2;
        this.field377 = arg1;
        class228 var4 = new class228(arg0.method2261(0, 0, 65));
        int var5 = var4.method1343(255);
        this.field376 = new class444[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1348(-91) == 1) {
                this.field376[var6] = new class444();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field376[var7] != null) {
                this.field376[var7].field6494 = var4.method1348(-113) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field376[var8] != null) {
                this.field376[var8].field6500 = var4.method1348(-107) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field376[var9] != null) {
                this.field376[var9].field6509 = var4.method1348(-100) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field376[var10] != null) {
                this.field376[var10].field6502 = var4.method1348(-87) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field376[var11] != null) {
                this.field376[var11].field6512 = var4.method1349(3);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field376[var12] != null) {
                this.field376[var12].field6495 = var4.method1349(3);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field376[var13] != null) {
                this.field376[var13].field6506 = var4.method1349(3);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field376[var14] != null) {
                this.field376[var14].field6499 = var4.method1349(3);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field376[var15] != null) {
                this.field376[var15].field6504 = (short) var4.method1343(255);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field376[var16] != null) {
                this.field376[var16].field6493 = var4.method1349(3);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field376[var17] != null) {
                this.field376[var17].field6510 = var4.method1349(3);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field376[var18] != null) {
                this.field376[var18].field6501 = var4.method1348(-96) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field376[var19] != null) {
                this.field376[var19].field6492 = var4.method1348(-103) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field376[var20] != null) {
                this.field376[var20].field6497 = var4.method1349(3);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field376[var21] != null) {
                this.field376[var21].field6503 = var4.method1348(-96) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field376[var22] != null) {
                this.field376[var22].field6507 = var4.method1348(-95) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field376[var23] != null) {
                this.field376[var23].field6511 = var4.method1348(-95) == 1;
            }
        }
    }
}
