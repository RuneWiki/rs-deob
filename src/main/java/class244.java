import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class244 extends class43 {

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public static int field3244 = 2;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "Lbb;")
    public static class270 field3241 = new class270();

    @OriginalMember(owner = "client!up", name = "t", descriptor = "[I")
    public static int[] field3248 = new int[1000];

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field3249 = 0;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public int field3240;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "Lwo;")
    public static class285 field3242;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "Z")
    public static boolean field3246;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "[[I")
    public static int[][] field3251;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBLuo;)V", line = 4)
    public static final void method1601(int arg0, int arg1, byte arg2, class118 arg3) {
        field3250++;
        class276.field3581 = arg3;
        class284.field3715 = new class342[arg1][arg0];
        if (class62.field760 != null) {
            class190.field2227 = class162.method1032((byte) -24, class62.field760[1], class62.field760[3], class62.field760[5], class62.field760[2], class62.field760[0], class62.field760[4]);
        }
        int var4 = -12 / ((38 - arg2) / 46);
        class12.field139 = new class342();
        class240.method1533((byte) 84);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V", line = 27)
    public static void method1602(int arg0) {
        field3242 = null;
        field3241 = null;
        if (arg0 != 0) {
            method1606((class285) null, -89, (class118) null);
        }
        field3248 = null;
        field3251 = null;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(Z)Z", line = 42)
    public static final boolean method1603(boolean arg0) {
        for (int var1 = class367.field5003; var1 < class238.field3149; var1++) {
            class316[][] var2 = class347.field4722[var1];
            for (int var3 = -class347.field4720; var3 <= 0; var3++) {
                int var4 = class325.field4341 + var3;
                int var5 = class325.field4341 - var3;
                if (var4 >= class118.field1361 || var5 < class386.field5281) {
                    for (int var6 = -class347.field4720; var6 <= 0; var6++) {
                        int var7 = class121.field1381 + var6;
                        int var8 = class121.field1381 - var6;
                        if (var4 >= class118.field1361) {
                            if (var7 >= field3247) {
                                class316 var9 = var2[var4][var7];
                                if (var9 != null && var9.field4267) {
                                    class133.field1515 = arg0;
                                    class419.field5721.method282(-117, var9);
                                    class419.field5721.method286((byte) 108);
                                }
                            }
                            if (var8 < class369.field5031) {
                                class316 var10 = var2[var4][var8];
                                if (var10 != null && var10.field4267) {
                                    class133.field1515 = arg0;
                                    class419.field5721.method282(-27, var10);
                                    class419.field5721.method286((byte) 88);
                                }
                            }
                        }
                        if (var5 < class386.field5281) {
                            if (var7 >= field3247) {
                                class316 var11 = var2[var5][var7];
                                if (var11 != null && var11.field4267) {
                                    class133.field1515 = arg0;
                                    class419.field5721.method282(-47, var11);
                                    class419.field5721.method286((byte) 123);
                                }
                            }
                            if (var8 < class369.field5031) {
                                class316 var12 = var2[var5][var8];
                                if (var12 != null && var12.field4267) {
                                    class133.field1515 = arg0;
                                    class419.field5721.method282(-91, var12);
                                    class419.field5721.method286((byte) 27);
                                }
                            }
                        }
                        if (class196.field2330 == 0) {
                            if (class217.field2665) {
                                class419.field5721.method298(26, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V", line = 151)
    public static final void method1604(int arg0, int arg1) {
        field3239++;
        if (arg0 == -1 || !class184.field2135[arg0]) {
            return;
        }
        class365.field4965.method1815((byte) -100, arg0);
        if (class362.field4903[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class362.field4903[arg0].length; var3++) {
            if (class362.field4903[arg0][var3] != null) {
                if (class362.field4903[arg0][var3].field6383 == 2) {
                    var2 = false;
                } else {
                    class362.field4903[arg0][var3] = null;
                }
            }
        }
        if (arg1 != 2) {
            method1605((byte) -84, 19);
        }
        if (var2) {
            class362.field4903[arg0] = null;
        }
        class184.field2135[arg0] = false;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)V", line = 199)
    public static final void method1605(byte arg0, int arg1) {
        if (class183.field2126 == null) {
            class183.field2126 = new byte[4][class22.field232][class196.field2329];
        }
        field3243++;
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class22.field232; var3++) {
                for (int var4 = 0; var4 < class196.field2329; var4++) {
                    class183.field2126[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lwo;ILuo;)V", line = 235)
    public static final void method1606(class285 arg0, int arg1, class118 arg2) {
        field3252++;
        class132[] var3 = class132.method853(arg0, class259.field3346, 0);
        class300.field4006 = new class436[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class300.field4006[var4] = arg2.method697(var3[var4], true);
        }
        class132[] var5 = class132.method853(arg0, class150.field1749, 0);
        class133.field1527 = new class436[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class133.field1527[var6] = arg2.method697(var5[var6], true);
        }
        class132[] var7 = class132.method853(arg0, class103.field1209, 0);
        class12.field156 = new class436[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class12.field156[var8] = arg2.method697(var7[var8], true);
        }
        class132[] var9 = class132.method853(arg0, class241.field3164, 0);
        class433.field5916 = new class436[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class433.field5916[var10] = arg2.method697(var9[var10], true);
        }
        class132[] var11 = class132.method853(arg0, class364.field4954, 0);
        class412.field5673 = new class436[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class412.field5673[var12] = arg2.method697(var11[var12], true);
        }
        class132[] var13 = class132.method853(arg0, class413.field5677, 0);
        class150.field1756 = new class436[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class150.field1756[var14] = arg2.method697(var13[var14], true);
        }
        class132[] var15 = class132.method853(arg0, class39.field459, 0);
        class383.field5249 = new class436[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class383.field5249[var16] = arg2.method697(var15[var16], true);
        }
        if (arg1 != 5356) {
            return;
        }
        class132[] var17 = class132.method853(arg0, class31.field336, 0);
        class286.field3766 = new class436[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class286.field3766[var18] = arg2.method697(var17[var18], true);
        }
        class132[] var19 = class132.method853(arg0, class316.field4257, 0);
        class270.field3502 = new class436[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class270.field3502[var20] = arg2.method697(var19[var20], true);
        }
        class132[] var21 = class132.method853(arg0, class229.field2892, 0);
        class266.field3432 = new class436[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class266.field3432[var22] = arg2.method697(var21[var22], true);
        }
        class132[] var23 = class132.method853(arg0, class432.field5902, 0);
        class170.field1992 = new class436[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class170.field1992[var24] = arg2.method697(var23[var24], true);
        }
        class132[] var25 = class132.method853(arg0, class388.field5298, 0);
        class333.field4546 = new class436[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class333.field4546[var26] = arg2.method697(var25[var26], true);
        }
        class132[] var27 = class132.method853(arg0, class191.field2249, 0);
        class195.field2319 = new class436[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class195.field2319[var28] = arg2.method697(var27[var28], true);
        }
        class17.field189 = arg2.method697(class132.method849(arg0, class390.field5309, 0), true);
    }
}
