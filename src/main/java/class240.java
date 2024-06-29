import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class240 extends class446 {

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "Lt;")
    public class400 field3418;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field3419 = 0;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "[Lcq;")
    public static class274[] field3424;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "Lsg;")
    public static class226 field3421;

    static {
        new class442("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field3423 = 0;
        field3424 = new class274[16];
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 6)
    public static void method1632(int arg0) {
        if (arg0 != 0) {
            field3419 = -22;
        }
        field3421 = null;
        field3424 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIBI)V", line = 18)
    public static final void method1633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3420++;
        int var8 = class302.method1951(class290.field4058, 0, arg4, class442.field6212);
        int var9 = class302.method1951(class290.field4058, 0, arg1, class442.field6212);
        int var10 = class302.method1951(class154.field2161, 0, arg2, class233.field3350);
        int var11 = class302.method1951(class154.field2161, 0, arg0, class233.field3350);
        int var12 = class302.method1951(class290.field4058, 0, arg4 + arg5, class442.field6212);
        int var13 = class302.method1951(class290.field4058, 0, arg1 - arg5, class442.field6212);
        for (int var14 = var8; var14 < var12; var14++) {
            class295.method1924(3289650, class296.field4138[var14], var11, arg3, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class295.method1924(3289650, class296.field4138[var15], var11, arg3, var10);
        }
        int var16 = class302.method1951(class154.field2161, 0, arg2 + arg5, class233.field3350);
        int var17 = class302.method1951(class154.field2161, 0, arg0 - arg5, class233.field3350);
        int var18 = var12;
        int var19 = -65 / ((arg6 + 32) / 45);
        while (var13 >= var18) {
            int[] var20 = class296.field4138[var18];
            class295.method1924(3289650, var20, var16, arg3, var10);
            class295.method1924(3289650, var20, var17, arg7, var16);
            class295.method1924(3289650, var20, var11, arg3, var17);
            var18++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lt;)V", line = 75)
    public class240(class400 arg0) {
        this.field3418 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V", line = 84)
    public static final void method1634(int arg0, int arg1, int arg2) {
        class125 var3 = class328.field4549[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1756 != null) {
            var3.field1756 = null;
        }
        if (var3.field1761 != null) {
            var3.field1761 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lnq;I)V", line = 97)
    public static final void method1635(class268 arg0, int arg1) {
        class103.field1413 = arg0.method1751(arg1 ^ 0x24, "titlebg");
        field3417++;
        class299.field4159 = arg0.method1751(69, "logo");
        if (arg1 != 0) {
            field3423 = -97;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Z")
    public abstract boolean method393(boolean arg0);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method395(boolean arg0);
}
