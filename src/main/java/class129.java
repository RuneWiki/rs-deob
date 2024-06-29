import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class129 {

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lcr;")
    public static class189 field1787 = new class189(128);

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1788 = 0;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Z")
    public static boolean field1790 = false;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lcr;")
    public static class189 field1789 = new class189(4);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Llm;")
    public static class347 field1785;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)I", line = 9)
    public static final int method815(boolean arg0, int arg1) {
        field1784++;
        return arg0 ? arg1 >>> 7 : -86;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lii;Lnc;IIIII)V", line = 21)
    public static final void method816(class405 arg0, class126 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class180.field2380 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class104.field1436) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class214.field2858 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class254 var15 = class213.field2852[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class12.field205[var12].method742(var13, var14) + class12.field205[var12].method742(var13 + 1, var14) + class12.field205[var12].method742(var13, var14 + 1) + class12.field205[var12].method742(var13 + 1, var14 + 1)) / 4 - (class12.field205[arg2].method742(arg3, arg4) + class12.field205[arg2].method742(arg3 + 1, arg4) + class12.field205[arg2].method742(arg3, arg4 + 1) + class12.field205[arg2].method742(arg3 + 1, arg4 + 1)) / 4;
                                    class97 var17 = var15.field3510;
                                    class97 var18 = var15.field3512;
                                    if (var17 != null && var17.method166(-17506)) {
                                        arg1.method169(arg0, (var14 - arg4) * 128 + (1 - arg6) * 64, var16, -123, (var13 - arg3) * 128 + (1 - arg5) * 64, var17, var7);
                                    }
                                    if (var18 != null && var18.method166(-17506)) {
                                        arg1.method169(arg0, (var14 - arg4) * 128 + (1 - arg6) * 64, var16, -120, (var13 - arg3) * 128 + (1 - arg5) * 64, var18, var7);
                                    }
                                    for (class328 var19 = var15.field3515; var19 != null; var19 = var19.field4783) {
                                        class55 var20 = var19.field4785;
                                        if (var20 != null && var20.method166(-17506) && (var20.field743 == var13 || var8 == var13) && (var20.field726 == var14 || var10 == var14)) {
                                            int var21 = var20.field742 + 1 - var20.field743;
                                            int var22 = var20.field737 + 1 - var20.field726;
                                            arg1.method169(arg0, (var20.field726 - arg4) * 128 + (var22 - arg6) * 64, var16, -126, (var20.field743 - arg3) * 128 + (var21 - arg5) * 64, var20, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 115)
    public static void method817(int arg0) {
        field1787 = null;
        field1789 = null;
        field1785 = null;
        int var1 = 115 / ((-arg0 - 64) / 61);
    }
}
