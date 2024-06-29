import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class197 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field2820 = 0;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field2823 = 2048;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public int field2822 = 2048;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public int field2826 = 0;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lub;")
    public static class15 field2819 = new class15(64);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
    public static int[] field2825 = new int[32];

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "F")
    public static float field2824;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 13)
    public static void method1399(int arg0) {
        if (arg0 == 0) {
            field2819 = null;
            field2825 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 25)
    public static final void method1400(int arg0, int arg1, int arg2) {
        boolean var3 = class385.field5449[0][arg1][arg2] != null && class385.field5449[0][arg1][arg2].field963 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class385.field5449[var4][arg1][arg2] == null) {
                class74 var5 = class385.field5449[var4][arg1][arg2] = new class74(var4, arg1, arg2);
                if (var3) {
                    var5.field961++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Llf;II)V", line = 51)
    public final void method1401(class130 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method837(true);
            if (var4 == 0) {
                if (arg2 != -1) {
                    field2819 = null;
                }
                field2818++;
                return;
            }
            this.method1403(var4, arg1, arg0, 3);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lvq;Ltj;I)V", line = 71)
    public static final void method1402(class269 arg0, class108 arg1, int arg2) {
        field2827++;
        class337[] var3 = class337.method2215(arg1, class294.field4259, 0);
        class431.field6174 = new class256[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class431.field6174[var4] = arg0.method870(var3[var4], true);
        }
        if (arg2 < 12) {
            return;
        }
        class337[] var5 = class337.method2215(arg1, class262.field3872, 0);
        class451.field6467 = new class256[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class451.field6467[var6] = arg0.method870(var5[var6], true);
        }
        class337[] var7 = class337.method2215(arg1, class103.field1331, 0);
        class358.field5177 = new class256[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class358.field5177[var8] = arg0.method870(var7[var8], true);
        }
        class337[] var9 = class337.method2215(arg1, class297.field4326, 0);
        class374.field5322 = new class256[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class374.field5322[var10] = arg0.method870(var9[var10], true);
        }
        class337[] var11 = class337.method2215(arg1, class340.field4922, 0);
        class252.field3740 = new class256[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class252.field3740[var12] = arg0.method870(var11[var12], true);
        }
        class337[] var13 = class337.method2215(arg1, class62.field829, 0);
        class70.field928 = new class256[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class70.field928[var14] = arg0.method870(var13[var14], true);
        }
        class337[] var15 = class337.method2215(arg1, class379.field5394, 0);
        class15.field235 = new class256[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class15.field235[var16] = arg0.method870(var15[var16], true);
        }
        class337[] var17 = class337.method2215(arg1, class291.field4228, 0);
        class376.field5356 = new class256[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class376.field5356[var18] = arg0.method870(var17[var18], true);
        }
        class337[] var19 = class337.method2215(arg1, class449.field6405, 0);
        class3.field50 = new class256[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class3.field50[var20] = arg0.method870(var19[var20], true);
        }
        class337[] var21 = class337.method2215(arg1, class255.field3772, 0);
        class171.field2418 = new class256[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class171.field2418[var22] = arg0.method870(var21[var22], true);
        }
        class337[] var23 = class337.method2215(arg1, class444.field6345, 0);
        class419.field6012 = new class256[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class419.field6012[var24] = arg0.method870(var23[var24], true);
        }
        class337[] var25 = class337.method2215(arg1, class432.field6185, 0);
        class120.field1622 = new class256[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class120.field1622[var26] = arg0.method870(var25[var26], true);
        }
        class337[] var27 = class337.method2215(arg1, class106.field1353, 0);
        class425.field6080 = new class256[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class425.field6080[var28] = arg0.method870(var27[var28], true);
        }
        class366.field5235 = arg0.method870(class337.method2225(arg1, class140.field2140, 0), true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILlf;I)V", line = 213)
    private final void method1403(int arg0, int arg1, class130 arg2, int arg3) {
        if (arg3 != 3) {
            return;
        }
        field2821++;
        if (arg0 == 1) {
            this.field2820 = arg2.method837(true);
        } else if (arg0 == 2) {
            this.field2823 = arg2.method798(false);
        } else if (arg0 == 3) {
            this.field2822 = arg2.method798(false);
        } else if (arg0 == 4) {
            this.field2826 = arg2.method844(698527688);
        }
    }
}
