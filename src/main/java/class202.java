import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class202 {

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lhb;")
    public static class629 field2697;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2695;

    static {
        new class474("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field2696 = 0;
        field2697 = new class629(9, 7);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method1276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2695++;
        if (arg4 != -17806) {
            field2696 = 35;
        }
        for (int var6 = arg5; var6 <= arg2; var6++) {
            class645.method3675(105, class402.field6087[var6], arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 26)
    public static void method1277(int arg0) {
        field2697 = null;
        if (arg0 != 9) {
            method1276(-62, 113, -100, -122, 41, -118);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lrt;Z)Luh;", line = 37)
    public static final class145 method1278(class194 arg0, boolean arg1) {
        arg0.method1177(255);
        field2694++;
        if (!arg1) {
            field2697 = null;
        }
        int var2 = arg0.method1177(255);
        class145 var3 = class298.method1991(var2, -28);
        var3.field1787 = arg0.method1177(255);
        int var4 = arg0.method1177(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1177(255);
            var3.method28(var6, -82, arg0);
        }
        var3.method145(-99);
        return var3;
    }
}
