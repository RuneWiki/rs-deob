import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class18 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lsb;")
    public static class98 field336 = class47.method368("Fertigkeit)2", 0);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method169(int arg0) {
        if (arg0 != 4642031) {
            field336 = null;
        }
        field336 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lsb;I)I")
    public static final int method170(class98 arg0, int arg1) {
        field337++;
        if (arg0.method724((byte) 25) == 0) {
            return -1;
        }
        if (arg1 != 13247) {
            method174((byte) 1, true, (class75) null, (class75) null);
        }
        for (int var2 = 0; var2 < class31.field552.field4409; var2++) {
            if (class31.field552.field4413[var2].method739(class243.field4216, 9975, class143.field2519).method741(101, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZZI)I")
    public static final int method171(boolean arg0, boolean arg1, int arg2) {
        field335++;
        if (arg2 != -928) {
            method170((class98) null, -118);
        }
        int var3 = 0;
        if (arg0) {
            var3 += class146.field2560 + class101.field1788;
        }
        if (arg1) {
            var3 += class116.field2086 + class225.field3879;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Llj;I)Lof;")
    public static final class222 method172(class216 arg0, int arg1) {
        arg0.method1446(5350);
        field339++;
        int var2 = arg0.method1446(arg1 ^ 0xFFFFC1F4);
        class222 var3 = class237.method1623(arg1 ^ arg1, var2);
        var3.field3828 = arg0.method1446(arg1 + 16340);
        int var4 = arg0.method1446(5350);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1446(5350);
            var3.method3(arg0, false, var6);
        }
        var3.method288(-102);
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class211.field3610 * 128) {
            arg0 = class211.field3610 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class72.field1194 * 128) {
            arg2 = class72.field1194 * 128 - 1;
        }
        class46.field778 = class160.field2893[arg3];
        class189.field3264 = class160.field2890[arg3];
        class136.field2411 = class160.field2893[arg4];
        class14.field278 = class160.field2890[arg4];
        class120.field2196 = arg0;
        class239.field4112 = arg1;
        class154.field2810 = arg2;
        class101.field1786 = arg0 / 128;
        class82.field1455 = arg2 / 128;
        class223.field3851 = class101.field1786 - class171.field3012;
        if (class223.field3851 < 0) {
            class223.field3851 = 0;
        }
        class162.field2935 = class82.field1455 - class171.field3012;
        if (class162.field2935 < 0) {
            class162.field2935 = 0;
        }
        class200.field3436 = class171.field3012 + class101.field1786;
        if (class200.field3436 > class211.field3610) {
            class200.field3436 = class211.field3610;
        }
        class238.field4097 = class82.field1455 + class171.field3012;
        if (class238.field4097 > class72.field1194) {
            class238.field4097 = class72.field1194;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class171.field3012 + class171.field3012 + 2; var16++) {
            for (int var19 = 0; var19 < class171.field3012 + class171.field3012 + 2; var19++) {
                int var20 = (var16 - class171.field3012 << 7) - (class120.field2196 & 0x7F);
                int var21 = (var19 - class171.field3012 << 7) - (class154.field2810 & 0x7F);
                int var22 = class101.field1786 + var16 - class171.field3012;
                int var23 = class82.field1455 + var19 - class171.field3012;
                if (var22 >= 0 && var23 >= 0 && var22 < class211.field3610 && var23 < class72.field1194) {
                    int var24;
                    if (class87.field1547 == null) {
                        var24 = class244.field4248[0][var22][var23] + 128 - class239.field4112;
                    } else {
                        var24 = class87.field1547[0][var22][var23] + 128 - class239.field4112;
                    }
                    int var25 = class244.field4248[3][var22][var23] - class239.field4112 - 1000;
                    class31.field551[var16][var19] = class226.method1556(var20, var25, var24, var21, var15);
                } else {
                    class31.field551[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class171.field3012 + class171.field3012 + 1; var17++) {
            for (int var18 = 0; var18 < class171.field3012 + class171.field3012 + 1; var18++) {
                class171.field3020[var17][var18] = class31.field551[var17][var18] || class31.field551[var17 + 1][var18] || class31.field551[var17][var18 + 1] || class31.field551[var17 + 1][var18 + 1];
            }
        }
        class61.field1029 = arg6;
        class93.field1639 = arg7;
        class11.field225 = arg8;
        class62.field1038 = arg9;
        class243.field4217 = arg10;
        class80.method597();
        class133.method1004(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BZLtg;Ltg;)V")
    public static final void method174(byte arg0, boolean arg1, class75 arg2, class75 arg3) {
        class14.field262 = arg3;
        class145.field2541 = arg1;
        field338++;
        if (arg0 <= -58) {
            class233.field4016 = arg2;
        }
    }
}
