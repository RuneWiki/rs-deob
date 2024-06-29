import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class204 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field2867 = 0;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "[I")
    public static int[] field2869;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfp;BLct;)V")
    public static final void method1398(class9 arg0, byte arg1, class104 arg2) {
        field2868++;
        class144[] var3 = class144.method993(arg2, class264.field3914, 0);
        class458.field6760 = new class285[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class458.field6760[var4] = arg0.method100(var3[var4], true);
        }
        class144[] var5 = class144.method993(arg2, class164.field2174, 0);
        class253.field3719 = new class285[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class253.field3719[var6] = arg0.method100(var5[var6], true);
        }
        if (arg1 > -31) {
            field2870 = 122;
        }
        class144[] var7 = class144.method993(arg2, class356.field5178, 0);
        class56.field685 = new class285[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class56.field685[var8] = arg0.method100(var7[var8], true);
        }
        class144[] var9 = class144.method993(arg2, class447.field6544, 0);
        class136.field1870 = new class285[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class136.field1870[var10] = arg0.method100(var9[var10], true);
        }
        class144[] var11 = class144.method993(arg2, class206.field2883, 0);
        class130.field1781 = new class285[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class130.field1781[var12] = arg0.method100(var11[var12], true);
        }
        class144[] var13 = class144.method993(arg2, class358.field5187, 0);
        class369.field5353 = new class285[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class369.field5353[var14] = arg0.method100(var13[var14], true);
        }
        class144[] var15 = class144.method993(arg2, class153.field2062, 0);
        class376.field5490 = new class285[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class376.field5490[var16] = arg0.method100(var15[var16], true);
        }
        class144[] var17 = class144.method993(arg2, class125.field1667, 0);
        class163.field2157 = new class285[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class163.field2157[var18] = arg0.method100(var17[var18], true);
        }
        class144[] var19 = class144.method993(arg2, class223.field3341, 0);
        class328.field4886 = new class285[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class328.field4886[var20] = arg0.method100(var19[var20], true);
        }
        class144[] var21 = class144.method993(arg2, class332.field4918, 0);
        class249.field3666 = new class285[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class249.field3666[var22] = arg0.method100(var21[var22], true);
        }
        class144[] var23 = class144.method993(arg2, class239.field3560, 0);
        class403.field5831 = new class285[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class403.field5831[var24] = arg0.method100(var23[var24], true);
        }
        class144[] var25 = class144.method993(arg2, class465.field6853, 0);
        class115.field1559 = new class285[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class115.field1559[var26] = arg0.method100(var25[var26], true);
        }
        class100.field1245 = arg0.method100(class144.method991(arg2, class305.field4506, 0), true);
        class226.field3383 = arg0.method100(class144.method991(arg2, class376.field5496, 0), true);
        class144[] var27 = class144.method993(arg2, class132.field1798, 0);
        class269.field3995 = new class285[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class269.field3995[var28] = arg0.method100(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public static void method1399(int arg0) {
        field2869 = null;
        if (arg0 < 72) {
            method1400(true);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
    public static final void method1400(boolean arg0) {
        if (arg0) {
            class178.field2530 = class200.field2829;
            class215.field3069 = class161.field2151;
        } else {
            class178.field2530 = class349.field5121;
            class215.field3069 = class28.field401;
        }
        field2870 = class178.field2530.length;
    }

    static {
        new class409("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field2869 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        field2871 = 0;
    }
}
