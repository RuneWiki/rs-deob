import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class400 {

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lgp;")
    public static class553 field5734 = new class553("game4", 3);

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lkr;")
    public static class602 field5735 = null;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method2489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5731++;
        int var8 = class41.method223(true, class262.field3848, class291.field4181, arg5);
        int var9 = class41.method223(true, class262.field3848, class291.field4181, arg4);
        int var10 = class41.method223(true, class726.field10064, class607.field8185, arg0);
        int var11 = class41.method223(true, class726.field10064, class607.field8185, arg2);
        int var12 = class41.method223(true, class262.field3848, class291.field4181, arg5 + arg6);
        int var13 = class41.method223(true, class262.field3848, class291.field4181, arg4 - arg6);
        for (int var14 = var8; var14 < var12; var14++) {
            class102.method675(arg1, -63, var10, var11, class538.field7454[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class102.method675(arg1, -58, var10, var11, class538.field7454[var15]);
        }
        int var16 = class41.method223(true, class726.field10064, class607.field8185, arg0 + arg6);
        if (arg7 <= 88) {
            method2491(-4);
        }
        int var17 = class41.method223(true, class726.field10064, class607.field8185, arg2 - arg6);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class538.field7454[var18];
            class102.method675(arg1, -127, var10, var16, var19);
            class102.method675(arg3, -95, var16, var17, var19);
            class102.method675(arg1, 109, var17, var11, var19);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 57)
    public static final void method2490(int arg0) {
        if (class135.field1915.toLowerCase().indexOf("microsoft") == -1) {
            class601.field8133[44] = 71;
            class601.field8133[92] = 74;
            if (class135.field1928 == null) {
                class601.field8133[192] = 58;
                class601.field8133[222] = 59;
            } else {
                class601.field8133[222] = 58;
                class601.field8133[520] = 59;
                class601.field8133[192] = 28;
            }
            class601.field8133[91] = 42;
            class601.field8133[59] = 57;
            class601.field8133[93] = 43;
            class601.field8133[47] = 73;
            class601.field8133[61] = 27;
            class601.field8133[45] = 26;
            class601.field8133[46] = 72;
        } else {
            class601.field8133[191] = 73;
            class601.field8133[221] = 43;
            class601.field8133[188] = 71;
            class601.field8133[220] = 74;
            class601.field8133[192] = 58;
            class601.field8133[222] = 59;
            class601.field8133[189] = 26;
            class601.field8133[223] = 28;
            class601.field8133[219] = 42;
            class601.field8133[186] = 57;
            class601.field8133[187] = 27;
            class601.field8133[190] = 72;
        }
        if (arg0 != -15227) {
            method2492(68, 22, -106, -118, 73, -111);
        }
        field5732++;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 109)
    public static void method2491(int arg0) {
        field5735 = null;
        field5734 = null;
        if (arg0 < 85) {
            field5735 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)Z", line = 123)
    public static final boolean method2492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5730++;
        for (int var6 = arg4; var6 <= arg2; var6++) {
            for (int var7 = arg3; var7 <= arg0; var7++) {
                if (class598.field8109[var6][var7] == arg1 && class437.field6095[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg5 > -118) {
            field5734 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V", line = 159)
    public static final void method2493(int arg0, int arg1) {
        field5733++;
        class346 var2 = class299.method1976(arg1 ^ arg1, 12, arg0);
        var2.method2208(-1719);
    }
}
