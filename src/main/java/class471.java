import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class471 extends class513 {

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
    public static boolean field6574 = false;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "[I")
    public static int[] field6575 = new int[1];

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V", line = 8)
    public static void method2764(byte arg0) {
        field6575 = null;
        if (arg0 >= -19) {
            field6575 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lub;IIIII)V", line = 30)
    public static final void method2765(class20 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class663.field9391 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class455.field6393) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class302.field4057 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class433 var14 = class281.field3808[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class155.field1899[var11].method437(100, var13, var12) + class155.field1899[var11].method437(89, var13, var12 + 1) + class155.field1899[var11].method437(104, var13 + 1, var12) + class155.field1899[var11].method437(126, var13 + 1, var12 + 1)) / 4 - (class155.field1899[arg1].method437(127, arg3, arg2) + class155.field1899[arg1].method437(124, arg3, arg2 + 1) + class155.field1899[arg1].method437(112, arg3 + 1, arg2) + class155.field1899[arg1].method437(113, arg3 + 1, arg2 + 1)) / 4;
                                    class242 var16 = var14.field6217;
                                    class242 var17 = var14.field6210;
                                    if (var16 != null && var16.method167((byte) 118)) {
                                        arg0.method169((var13 - arg3) * class454.field6392 + (1 - arg5) * class480.field6727, var15, var6, class298.field4017, 117, var16, (var12 - arg2) * class454.field6392 + (1 - arg4) * class480.field6727);
                                    }
                                    if (var17 != null && var17.method167((byte) 118)) {
                                        arg0.method169((var13 - arg3) * class454.field6392 + (1 - arg5) * class480.field6727, var15, var6, class298.field4017, 118, var17, (var12 - arg2) * class454.field6392 + (1 - arg4) * class480.field6727);
                                    }
                                    for (class182 var18 = var14.field6218; var18 != null; var18 = var18.field2226) {
                                        class43 var19 = var18.field2227;
                                        if (var19 != null && var19.method167((byte) 118) && (var19.field769 == var12 || var7 == var12) && (var19.field768 == var13 || var9 == var13)) {
                                            int var20 = var19.field770 + 1 - var19.field769;
                                            int var21 = var19.field765 + 1 - var19.field768;
                                            arg0.method169((var19.field768 - arg3) * class454.field6392 + (var21 - arg5) * class480.field6727, var15, var6, class298.field4017, 122, var19, (var19.field769 - arg2) * class454.field6392 + (var20 - arg4) * class480.field6727);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I")
    public abstract int method1732(byte arg0);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)J")
    public abstract long method1731(boolean arg0);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)I")
    public abstract int method1729(boolean arg0);

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(Z)I")
    public abstract int method1730(boolean arg0);

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)I")
    public abstract int method1733(byte arg0);
}
