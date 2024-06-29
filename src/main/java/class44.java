import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class44 {

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field548 = 0;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Lnn;")
    public static class151 field550 = new class151(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public static final void method254(int arg0) {
        class70.field904.method2307(5142);
        if (arg0 == 1) {
            field549++;
            class236.field3537.method45(12);
            class423.field6225.method45(12);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
    public static void method255(boolean arg0) {
        field550 = null;
        if (!arg0) {
            method254(92);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (client.field6665[arg0][var8][var14] == -class68.field892) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class254.field3869) + 1;
            int var10 = (arg3 << class254.field3869) + 2;
            int var11 = class307.field4638[arg0].method92(arg1, arg3) + arg5;
            if (!class430.method2641(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class254.field3869) - 1;
            if (!class430.method2641(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class254.field3869) - 1;
            if (!class430.method2641(var9, var11, var13)) {
                return false;
            } else if (class430.method2641(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class331.method2032(arg0, arg1, arg3)) {
            int var6 = arg1 << class254.field3869;
            int var7 = arg3 << class254.field3869;
            return class430.method2641(var6 + 1, class307.field4638[arg0].method92(arg1, arg3) + arg5, var7 + 1) && class430.method2641(class26.field337 + var6 - 1, class307.field4638[arg0].method92(arg1 + 1, arg3) + arg5, var7 + 1) && class430.method2641(class26.field337 + var6 - 1, class307.field4638[arg0].method92(arg1 + 1, arg3 + 1) + arg5, class26.field337 + var7 - 1) && class430.method2641(var6 + 1, class307.field4638[arg0].method92(arg1, arg3 + 1) + arg5, class26.field337 + var7 - 1);
        } else {
            return false;
        }
    }
}
