import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class248 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lvba;")
    private class36 field3521 = new class36();

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[I")
    public static int[] field3519 = new int[200];

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Z")
    public static boolean field3523 = false;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lkca;")
    public static class73 field3515 = new class73(23, -1);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Ltw;")
    public static class174 field3524;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Lvba;")
    private class36 field3526;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1640(boolean arg0) {
        if (!arg0) {
            field3519 = null;
            field3515 = null;
            field3524 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 18)
    public final void method1641(int arg0) {
        while (true) {
            class36 var2 = this.field3521.field399;
            if (this.field3521 == var2) {
                field3517++;
                if (arg0 != -5681) {
                    return;
                }
                this.field3526 = null;
                return;
            }
            var2.method199(arg0 ^ 0x1652);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Lvba;", line = 39)
    public final class36 method1642(int arg0) {
        if (arg0 != 0) {
            field3524 = null;
        }
        field3518++;
        class36 var2 = this.field3526;
        if (this.field3521 == var2) {
            this.field3526 = null;
            return null;
        } else {
            this.field3526 = var2.field399;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I", line = 75)
    public final int method1643(int arg0) {
        if (arg0 != 14030) {
            return 62;
        }
        field3520++;
        int var2 = 0;
        class36 var3 = this.field3521.field399;
        while (this.field3521 != var3) {
            var3 = var3.field399;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lvba;", line = 96)
    public final class36 method1644(byte arg0) {
        field3516++;
        class36 var2 = this.field3521.field399;
        if (this.field3521 == var2) {
            this.field3526 = null;
            return null;
        }
        if (arg0 > -120) {
            this.method1642(-124);
        }
        this.field3526 = var2.field399;
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 294)
    public class248() {
        this.field3521.field399 = this.field3521;
        this.field3521.field402 = this.field3521;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)Lvba;", line = 128)
    public final class36 method1645(int arg0) {
        int var2 = -21 % ((arg0 - 29) / 58);
        field3527++;
        class36 var3 = this.field3521.field399;
        if (this.field3521 == var3) {
            return null;
        } else {
            var3.method199(-125);
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILvba;)V", line = 145)
    public final void method1646(int arg0, class36 arg1) {
        field3522++;
        if (arg1.field402 != null) {
            arg1.method199(-127);
        }
        int var3 = 54 / ((-arg0 - 47) / 49);
        arg1.field402 = this.field3521.field402;
        arg1.field399 = this.field3521;
        arg1.field402.field399 = arg1;
        arg1.field399.field402 = arg1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILkea;Loa;)V", line = 163)
    public static final void method1647(int arg0, class203 arg1, class605 arg2) {
        field3525++;
        class372[] var3 = class372.method2393(arg1, class32.field363, 0);
        class485.field7097 = new class433[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class485.field7097[var4] = arg2.method388(var3[var4], true);
        }
        class372[] var5 = class372.method2393(arg1, class11.field93, 0);
        class98.field1156 = new class433[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class98.field1156[var6] = arg2.method388(var5[var6], true);
        }
        class372[] var7 = class372.method2393(arg1, class447.field6681, 0);
        class206.field2768 = new class433[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class206.field2768[var8] = arg2.method388(var7[var8], true);
        }
        class372[] var9 = class372.method2393(arg1, class18.field180, 0);
        class595.field8693 = new class433[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class595.field8693[var10] = arg2.method388(var9[var10], true);
        }
        class372[] var11 = class372.method2393(arg1, class86.field987, 0);
        class349.field4999 = new class433[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class349.field4999[var12] = arg2.method388(var11[var12], true);
        }
        class372[] var13 = class372.method2393(arg1, class322.field4661, 0);
        class633.field9109 = new class433[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class633.field9109[var14] = arg2.method388(var13[var14], true);
        }
        class372[] var15 = class372.method2393(arg1, class86.field982, 0);
        class233.field3268 = new class433[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class233.field3268[var16] = arg2.method388(var15[var16], true);
        }
        class372[] var17 = class372.method2393(arg1, class656.field9488, 0);
        class425.field6327 = new class433[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class425.field6327[var18] = arg2.method388(var17[var18], true);
        }
        class372[] var19 = class372.method2393(arg1, class561.field8012, 0);
        class168.field2052 = new class433[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class168.field2052[var20] = arg2.method388(var19[var20], true);
        }
        class372[] var21 = class372.method2393(arg1, class381.field5774, 0);
        class528.field7651 = new class433[var21.length];
        int var22 = 0;
        if (arg0 != -1) {
            field3523 = false;
        }
        while (var21.length > var22) {
            class528.field7651[var22] = arg2.method388(var21[var22], true);
            var22++;
        }
        class372[] var23 = class372.method2393(arg1, class650.field9383, 0);
        class190.field2376 = new class433[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class190.field2376[var24] = arg2.method388(var23[var24], true);
        }
        class372[] var25 = class372.method2393(arg1, class114.field1424, 0);
        class603.field8816 = new class433[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class603.field8816[var26] = arg2.method388(var25[var26], true);
        }
        class614.field8942 = arg2.method388(class372.method2398(arg1, class346.field4959, 0), true);
        class32.field375 = arg2.method388(class372.method2398(arg1, class499.field7267, 0), true);
        class372[] var27 = class372.method2393(arg1, class321.field4644, 0);
        class96.field1135 = new class433[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class96.field1135[var28] = arg2.method388(var27[var28], true);
        }
    }
}
