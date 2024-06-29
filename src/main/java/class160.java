import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class160 extends class66 {

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!aba", name = "v", descriptor = "[I")
    public static int[] field2730 = new int[13];

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "Lce;")
    public static class283 field2729 = new class283();

    @OriginalMember(owner = "client!aba", name = "x", descriptor = "Lhga;")
    public static class158 field2732 = new class158(42, 28);

    @OriginalMember(owner = "client!aba", name = "y", descriptor = "[[I")
    public static int[][] field2733 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!aba", name = "A", descriptor = "[[B")
    public static byte[][] field2735;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lie;Z)Lrh;", line = 3)
    public static final class244 method1316(class6 arg0, boolean arg1) {
        field2725++;
        class499 var2 = class473.method2932(arg0, (byte) -58);
        int var3 = arg0.method72(-20);
        if (!arg1) {
            field2733 = null;
        }
        int var4 = arg0.method72(-55);
        int var5 = arg0.method67(12021);
        return new class244(var2.field7323, var2.field7322, var2.field7318, var2.field7314, var2.field7317, var2.field7316, var2.field7319, var2.field7324, var2.field7321, var3, var4, var5);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V", line = 23)
    public static void method1317(boolean arg0) {
        if (arg0) {
            field2735 = null;
        }
        field2735 = null;
        field2733 = null;
        field2732 = null;
        field2729 = null;
        field2730 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lri;Lr;B)V", line = 38)
    public static final void method1318(class97 arg0, class167 arg1, byte arg2) {
        field2731++;
        class284[] var3 = class284.method2018(arg0, class341.field5530, 0);
        class575.field8195 = new class702[var3.length];
        if (arg2 != -66) {
            field2733 = null;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            class575.field8195[var4] = arg1.method265(var3[var4], true);
        }
        class284[] var5 = class284.method2018(arg0, class81.field1003, 0);
        class262.field4278 = new class702[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class262.field4278[var6] = arg1.method265(var5[var6], true);
        }
        class284[] var7 = class284.method2018(arg0, class375.field5857, 0);
        class149.field2479 = new class702[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class149.field2479[var8] = arg1.method265(var7[var8], true);
        }
        class284[] var9 = class284.method2018(arg0, class200.field3268, 0);
        class350.field5591 = new class702[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class350.field5591[var10] = arg1.method265(var9[var10], true);
        }
        class284[] var11 = class284.method2018(arg0, class341.field5522, 0);
        class70.field888 = new class702[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class70.field888[var12] = arg1.method265(var11[var12], true);
        }
        class284[] var13 = class284.method2018(arg0, class475.field7034, 0);
        class487.field7143 = new class702[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class487.field7143[var14] = arg1.method265(var13[var14], true);
        }
        class284[] var15 = class284.method2018(arg0, class425.field6465, 0);
        class234.field3719 = new class702[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class234.field3719[var16] = arg1.method265(var15[var16], true);
        }
        class284[] var17 = class284.method2018(arg0, class690.field9674, 0);
        class706.field9991 = new class702[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class706.field9991[var18] = arg1.method265(var17[var18], true);
        }
        class284[] var19 = class284.method2018(arg0, class157.field2685, 0);
        class330.field5109 = new class702[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class330.field5109[var20] = arg1.method265(var19[var20], true);
        }
        class284[] var21 = class284.method2018(arg0, class200.field3250, 0);
        class672.field9480 = new class702[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class672.field9480[var22] = arg1.method265(var21[var22], true);
        }
        class284[] var23 = class284.method2018(arg0, class263.field4307, 0);
        class545.field7932 = new class702[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class545.field7932[var24] = arg1.method265(var23[var24], true);
        }
        class284[] var25 = class284.method2018(arg0, class606.field8622, 0);
        class220.field3579 = new class702[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class220.field3579[var26] = arg1.method265(var25[var26], true);
        }
        class65.field834 = arg1.method265(class284.method2027(arg0, class404.field6237, 0), true);
        class56.field733 = arg1.method265(class284.method2027(arg0, class73.field924, 0), true);
        class284[] var27 = class284.method2018(arg0, class294.field4618, 0);
        class597.field8469 = new class702[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class597.field8469[var28] = arg1.method265(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)I", line = 169)
    public static final int method1319(byte arg0) {
        field2727++;
        int var1 = class255.field4056.method3899(99);
        if (arg0 != -25) {
            field2733 = null;
        }
        if (class652.field9132.length - 1 > var1) {
            class255.field4056 = class652.field9132[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V", line = 189)
    public class160() {
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIII)I", line = 192)
    public static final int method1320(int arg0, int arg1, int arg2, int arg3) {
        field2726++;
        if (arg0 != 0) {
            method1319((byte) -83);
        }
        if (arg1 >= arg2) {
            return arg3 >= arg1 ? arg1 : arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(I)V", line = 203)
    public class160(int arg0) {
        this.field2728 = arg0;
    }
}
