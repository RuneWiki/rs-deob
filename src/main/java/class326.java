import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class326 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    private int field5129;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field5135 = -1;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Llo;")
    public static class306 field5131 = new class306("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field5136 = 0;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[I")
    public static int[] field5137 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Ldw;")
    public static class403 field5139 = new class403("", 16);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient;")
    public static client field5138;

    @OriginalMember(owner = "client!nk", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field5132++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 18)
    public static final void method2046(int arg0, int arg1) {
        class223.field3850 = 1000 / arg1;
        field5133++;
        if (arg0 != -18767) {
            field5131 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 29)
    public static void method2047(int arg0) {
        field5131 = null;
        if (arg0 != -26493) {
            method2050(93, 30, 105, true);
        }
        field5139 = null;
        field5137 = null;
        field5138 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(II)V", line = 43)
    public class326(int arg0, int arg1) {
        this.field5129 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)I", line = 55)
    public final int method2048(boolean arg0) {
        field5134++;
        return arg0 ? -91 : this.field5129;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lza;Lvl;IIIII)V", line = 70)
    public static final void method2049(class491 arg0, class243 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class76.field1315 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class236.field4089) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class276.field4537 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class465 var15 = class66.field977[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class360.field5592[var12].method1516(var13, var14) + class360.field5592[var12].method1516(var13 + 1, var14) + class360.field5592[var12].method1516(var13, var14 + 1) + class360.field5592[var12].method1516(var13 + 1, var14 + 1)) / 4 - (class360.field5592[arg2].method1516(arg3, arg4) + class360.field5592[arg2].method1516(arg3 + 1, arg4) + class360.field5592[arg2].method1516(arg3, arg4 + 1) + class360.field5592[arg2].method1516(arg3 + 1, arg4 + 1)) / 4;
                                    class218 var17 = var15.field6907;
                                    class218 var18 = var15.field6901;
                                    if (var17 != null && var17.method42(false)) {
                                        arg1.method39(0, (var13 - arg3) * class70.field1217 + (1 - arg5) * class331.field5211, arg0, (var14 - arg4) * class70.field1217 + (1 - arg6) * class331.field5211, var16, var17, var7);
                                    }
                                    if (var18 != null && var18.method42(false)) {
                                        arg1.method39(0, (var13 - arg3) * class70.field1217 + (1 - arg5) * class331.field5211, arg0, (var14 - arg4) * class70.field1217 + (1 - arg6) * class331.field5211, var16, var18, var7);
                                    }
                                    for (class1 var19 = var15.field6898; var19 != null; var19 = var19.field2) {
                                        class290 var20 = var19.field9;
                                        if (var20 != null && var20.method42(false) && (var20.field4718 == var13 || var8 == var13) && (var20.field4717 == var14 || var10 == var14)) {
                                            int var21 = var20.field4722 + 1 - var20.field4718;
                                            int var22 = var20.field4713 + 1 - var20.field4717;
                                            arg1.method39(0, (var20.field4718 - arg3) * class70.field1217 + (var21 - arg5) * class331.field5211, arg0, (var20.field4717 - arg4) * class70.field1217 + (var22 - arg6) * class331.field5211, var16, var20, var7);
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

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIZ)V", line = 158)
    public static final void method2050(int arg0, int arg1, int arg2, boolean arg3) {
        field5130++;
        class261.field4357.method152(arg2, (byte) -38);
        class261.field4357.method160(-742698264, arg1);
        class261.field4357.method160(-742698264, arg0);
        if (arg3) {
            field5136 = 105;
        }
    }
}
