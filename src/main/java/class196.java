import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class196 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lcea;")
    public static class180 field2376 = new class180("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "F")
    public static float field2377;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
    public static int[] field2378;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIII)I", line = 3)
    public static final int method1063(boolean arg0, int arg1, int arg2, int arg3) {
        field2373++;
        class125 var4 = class256.method1445(arg3, (byte) -23, arg0);
        if (var4 == null) {
            return -1;
        } else if (~arg1 <= arg2 && var4.field1535.length > arg1) {
            return var4.field1535[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLvn;Lqa;)I", line = 25)
    public static final int method1064(byte arg0, class259 arg1, class206 arg2) {
        field2375++;
        if (arg1.field3343 != -1) {
            return arg1.field3343;
        }
        if (arg1.field3336 != -1) {
            class217 var3 = arg2.field2481.method119(-113, arg2.method271() ? arg1.field3336 : arg1.field3338);
            if (!var3.field2646) {
                return var3.field2641;
            }
        }
        if (arg0 != -51) {
            method1066(16, (byte) 94, 72, -69, false);
        }
        return arg1.field3332;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 50)
    public static void method1065(byte arg0) {
        field2376 = null;
        field2378 = null;
        if (arg0 < 95) {
            field2377 = 0.9824089F;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBIIZ)V", line = 61)
    public static final void method1066(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field2374++;
        class615.field8919 = 0L;
        int var5 = class99.method608(false);
        if (arg1 != 83) {
            method1065((byte) 33);
        }
        if (arg0 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class210.field2560.method1135()) {
            arg4 = true;
        }
        class378.method2197(arg0, arg3, arg4, var5, arg2, 84);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lmd;I)V", line = 83)
    public static final void method1067(class463 arg0, int arg1) {
        if (arg1 != 24392) {
            return;
        }
        if (arg0 instanceof class459) {
            class459 var2 = (class459) arg0;
            if (var2.field6334 != null) {
                class224.method1283(var2, false, class103.field1265.field8660 != var2.field8660);
            }
        } else if (arg0 instanceof class545) {
            class545 var3 = (class545) arg0;
            class169.method947(var3, class103.field1265.field8660 != var3.field8660, -107);
        }
        field2372++;
    }
}
