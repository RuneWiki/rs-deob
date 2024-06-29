import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class216 extends class611 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
    public static boolean field2730 = false;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field2731 = new Random();

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
    public static void method1306(boolean arg0) {
        if (!arg0) {
            field2731 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ldv;[III)V")
    public static final void method1307(class124 arg0, int[] arg1, int arg2, int arg3) {
        field2733++;
        if (arg0.field408 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field408.length; var5++) {
                if (arg0.field408[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field376 != -1) {
                class747 var6 = class646.field8903.method643(arg0.field376, -122);
                int var7 = var6.field10437;
                if (var7 == 1) {
                    arg0.field388 = 0;
                    arg0.field326 = 0;
                    arg0.field364 = arg3;
                    arg0.field385 = 1;
                    arg0.field346 = 0;
                    if (!arg0.field417) {
                        class107.method729(arg0.field388, var6, arg0, -4855);
                    }
                }
                if (var7 == 2) {
                    arg0.field346 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg0.field408 == null || arg0.field408[var9] == -1 || class646.field8903.method643(arg1[var9], -92).field10447 >= class646.field8903.method643(arg0.field408[var9], -80).field10447) {
                arg0.field408 = arg1;
                arg0.field364 = arg3;
                arg0.field434 = arg0.field427;
            }
        }
        if (arg2 <= -107 && var8) {
            arg0.field434 = arg0.field427;
            arg0.field364 = arg3;
            arg0.field408 = arg1;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)I")
    public static int method1308(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public static final void method1309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -122) {
            field2730 = true;
        }
        field2732++;
        if (arg0 > arg2) {
            for (int var5 = arg2; var5 < arg0; var5++) {
                class15.field220[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; var6++) {
                class15.field220[var6][arg4] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lha;ILkha;)V")
    public static final void method1310(class454 arg0, int arg1, class687 arg2) {
        field2729++;
        class196[] var3 = class196.method1225(arg2, class284.field3617, 0);
        class714.field10048 = new class712[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class714.field10048[var4] = arg0.method60(var3[var4], true);
        }
        class196[] var5 = class196.method1225(arg2, class34.field524, 0);
        class376.field5268 = new class712[var5.length];
        for (int var6 = arg1; var6 < var5.length; var6++) {
            class376.field5268[var6] = arg0.method60(var5[var6], true);
        }
        class196[] var7 = class196.method1225(arg2, class401.field5558, 0);
        class637.field8811 = new class712[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class637.field8811[var8] = arg0.method60(var7[var8], true);
        }
        class196[] var9 = class196.method1225(arg2, class1.field4, 0);
        class229.field2990 = new class712[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class229.field2990[var10] = arg0.method60(var9[var10], true);
        }
        class196[] var11 = class196.method1225(arg2, class84.field1085, 0);
        class22.field303 = new class712[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class22.field303[var12] = arg0.method60(var11[var12], true);
        }
        class196[] var13 = class196.method1225(arg2, class634.field8785, 0);
        class487.field6935 = new class712[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class487.field6935[var14] = arg0.method60(var13[var14], true);
        }
        class196[] var15 = class196.method1225(arg2, class574.field8014, 0);
        class15.field219 = new class712[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class15.field219[var16] = arg0.method60(var15[var16], true);
        }
        class196[] var17 = class196.method1225(arg2, class244.field3143, 0);
        class560.field7826 = new class712[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class560.field7826[var18] = arg0.method60(var17[var18], true);
        }
        class196[] var19 = class196.method1225(arg2, class463.field6706, 0);
        class188.field2469 = new class712[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class188.field2469[var20] = arg0.method60(var19[var20], true);
        }
        class196[] var21 = class196.method1225(arg2, class462.field6703, 0);
        class48.field706 = new class712[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class48.field706[var22] = arg0.method60(var21[var22], true);
        }
        class196[] var23 = class196.method1225(arg2, class270.field3408, 0);
        class100.field1233 = new class712[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class100.field1233[var24] = arg0.method60(var23[var24], true);
        }
        class196[] var25 = class196.method1225(arg2, class266.field3366, 0);
        class328.field4189 = new class712[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class328.field4189[var26] = arg0.method60(var25[var26], true);
        }
        class756.field10535 = arg0.method60(class196.method1231(arg2, class28.field456, 0), true);
        class270.field3426 = arg0.method60(class196.method1231(arg2, class477.field6823, 0), true);
        class196[] var27 = class196.method1225(arg2, class449.field6310, 0);
        class88.field1115 = new class712[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class88.field1115[var28] = arg0.method60(var27[var28], true);
        }
    }
}
