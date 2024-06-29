import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class514 {

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "[Lrs;")
    public static class655[] field7296;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public static void method3036(byte arg0) {
        if (arg0 != 89) {
            method3039(null, false, null);
        }
        field7296 = null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Z")
    public static final boolean method3037(int arg0, int arg1, int arg2) {
        if (arg0 >= -58) {
            return false;
        } else {
            field7298++;
            return (arg2 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(III)Z")
    public static final boolean method3038(int arg0, int arg1, int arg2) {
        field7299++;
        if (arg0 != 0) {
            method3039(null, false, null);
        }
        boolean var3 = (arg1 & 0x37) == 0 ? class348.method2206(arg2, arg1, 55) : class456.method2790(arg1, arg0 ^ 0xFFFFFFFA, arg2);
        return var3 | class33.method170(arg1, (byte) -87, arg2) | (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lha;ZLvd;)V")
    public static final void method3039(class60 arg0, boolean arg1, class39 arg2) {
        field7295++;
        class129[] var3 = class129.method920(arg2, class520.field7450, 0);
        class236.field3432 = new class536[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class236.field3432[var4] = arg0.method422(var3[var4], true);
        }
        class129[] var5 = class129.method920(arg2, class196.field2978, 0);
        class12.field169 = new class536[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class12.field169[var6] = arg0.method422(var5[var6], true);
        }
        class129[] var7 = class129.method920(arg2, class738.field10353, 0);
        class474.field6895 = new class536[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class474.field6895[var8] = arg0.method422(var7[var8], true);
        }
        class129[] var9 = class129.method920(arg2, class456.field6714, 0);
        class457.field6749 = new class536[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class457.field6749[var10] = arg0.method422(var9[var10], true);
        }
        class129[] var11 = class129.method920(arg2, class249.field3615, 0);
        class438.field6489 = new class536[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class438.field6489[var12] = arg0.method422(var11[var12], true);
        }
        class129[] var13 = class129.method920(arg2, class548.field7821, 0);
        class76.field1063 = new class536[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class76.field1063[var14] = arg0.method422(var13[var14], true);
        }
        class129[] var15 = class129.method920(arg2, class177.field2749, 0);
        class452.field6681 = new class536[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class452.field6681[var16] = arg0.method422(var15[var16], true);
        }
        class129[] var17 = class129.method920(arg2, class438.field6497, 0);
        class504.field7166 = new class536[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class504.field7166[var18] = arg0.method422(var17[var18], true);
        }
        class129[] var19 = class129.method920(arg2, class473.field6890, 0);
        class80.field1134 = new class536[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class80.field1134[var20] = arg0.method422(var19[var20], true);
        }
        class129[] var21 = class129.method920(arg2, class703.field9806, 0);
        class667.field9350 = new class536[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class667.field9350[var22] = arg0.method422(var21[var22], true);
        }
        class129[] var23 = class129.method920(arg2, class405.field6101, 0);
        class732.field10245 = new class536[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class732.field10245[var24] = arg0.method422(var23[var24], true);
        }
        class129[] var25 = class129.method920(arg2, class93.field1340, 0);
        class391.field5894 = new class536[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class391.field5894[var26] = arg0.method422(var25[var26], true);
        }
        class195.field2970 = arg0.method422(class129.method919(arg2, class210.field3082, 0), arg1);
        class385.field5817 = arg0.method422(class129.method919(arg2, class754.field10539, 0), true);
        class129[] var27 = class129.method920(arg2, class233.field3395, 0);
        class25.field253 = new class536[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class25.field253[var28] = arg0.method422(var27[var28], true);
        }
    }
}
