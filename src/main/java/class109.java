import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class109 {

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public int field1526 = -1;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lhn;")
    public static class509 field1520 = new class509(46, -2);

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field1529 = 0;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
    public static int[] field1528 = new int[5];

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field1531 = -1;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "[I")
    public static int[] field1530;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([[[Lfq;B)V", line = 3)
    public static final void method834(class138[][][] arg0, byte arg1) {
        int var2 = 0;
        if (arg1 <= 77) {
            method835((byte) -40);
        }
        while (var2 < arg0.length) {
            class138[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class138 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2105 instanceof class164) {
                            ((class164) var6.field2105).method616(23504);
                        }
                        if (var6.field2115 instanceof class164) {
                            ((class164) var6.field2115).method616(23504);
                        }
                        if (var6.field2106 instanceof class164) {
                            ((class164) var6.field2106).method616(23504);
                        }
                        if (var6.field2114 instanceof class164) {
                            ((class164) var6.field2114).method616(23504);
                        }
                        if (var6.field2104 instanceof class164) {
                            ((class164) var6.field2104).method616(23504);
                        }
                        for (class327 var7 = var6.field2118; var7 != null; var7 = var7.field4922) {
                            class389 var8 = var7.field4921;
                            if (var8 instanceof class164) {
                                ((class164) var8).method616(23504);
                            }
                        }
                    }
                }
            }
            var2++;
        }
        field1521++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 76)
    public static void method835(byte arg0) {
        field1520 = null;
        if (arg0 < 25) {
            field1529 = -19;
        }
        field1528 = null;
        field1530 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lya;BLul;)V", line = 92)
    public static final void method836(class38 arg0, byte arg1, class406 arg2) {
        field1525++;
        class84[] var3 = class84.method698(arg2, class284.field4315, 0);
        class530.field7740 = new class16[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class530.field7740[var4] = arg0.method345(var3[var4], true);
        }
        class84[] var5 = class84.method698(arg2, class260.field3982, 0);
        class460.field6697 = new class16[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class460.field6697[var6] = arg0.method345(var5[var6], true);
        }
        class84[] var7 = class84.method698(arg2, class60.field722, 0);
        class296.field4508 = new class16[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class296.field4508[var8] = arg0.method345(var7[var8], true);
        }
        class84[] var9 = class84.method698(arg2, class138.field2120, 0);
        class68.field871 = new class16[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class68.field871[var10] = arg0.method345(var9[var10], true);
        }
        class84[] var11 = class84.method698(arg2, class24.field300, 0);
        class132.field2030 = new class16[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class132.field2030[var12] = arg0.method345(var11[var12], true);
        }
        class84[] var13 = class84.method698(arg2, class454.field6614, 0);
        class118.field1789 = new class16[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class118.field1789[var14] = arg0.method345(var13[var14], true);
        }
        class84[] var15 = class84.method698(arg2, class88.field1265, 0);
        class366.field5393 = new class16[var15.length];
        if (arg1 != 44) {
            method835((byte) 110);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            class366.field5393[var16] = arg0.method345(var15[var16], true);
        }
        class84[] var17 = class84.method698(arg2, class106.field1497, 0);
        class107.field1503 = new class16[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class107.field1503[var18] = arg0.method345(var17[var18], true);
        }
        class84[] var19 = class84.method698(arg2, class367.field5399, 0);
        class48.field612 = new class16[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class48.field612[var20] = arg0.method345(var19[var20], true);
        }
        class84[] var21 = class84.method698(arg2, class156.field2318, 0);
        class285.field4326 = new class16[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class285.field4326[var22] = arg0.method345(var21[var22], true);
        }
        class84[] var23 = class84.method698(arg2, class22.field274, 0);
        class424.field6318 = new class16[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class424.field6318[var24] = arg0.method345(var23[var24], true);
        }
        class84[] var25 = class84.method698(arg2, class239.field3827, 0);
        class141.field2146 = new class16[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class141.field2146[var26] = arg0.method345(var25[var26], true);
        }
        class514.field7474 = arg0.method345(class84.method702(arg2, class289.field4362, 0), true);
        client.field3313 = arg0.method345(class84.method702(arg2, class270.field4132, 0), true);
        class84[] var27 = class84.method698(arg2, class291.field4402, 0);
        class425.field6324 = new class16[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class425.field6324[var28] = arg0.method345(var27[var28], true);
        }
    }
}
