import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class396 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lwl;")
    public static class452 field5920 = new class452(87, -2);

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field5922 = 99;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lwl;")
    public static class452 field5921 = new class452(4, -1);

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field5925 = 0;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lwl;")
    public static class452 field5924 = new class452(75, 5);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method2499(int arg0) {
        field5924 = null;
        field5921 = null;
        int var1 = 56 / ((5 - arg0) / 49);
        field5920 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= class192.field2917 && class39.field497 >= arg3 && arg8 >= class192.field2917 && arg8 <= class39.field497 && class192.field2917 <= arg1 && arg1 <= class39.field497 && arg2 >= class192.field2917 && arg2 <= class39.field497 && arg9 >= class189.field2831 && class204.field3060 >= arg9 && class189.field2831 <= arg7 && class204.field3060 >= arg7 && arg4 >= class189.field2831 && arg4 <= class204.field3060 && class189.field2831 <= arg6 && class204.field3060 >= arg6) {
            class33.method197(arg3, arg7, arg2, arg8, arg5 ^ 0xFFFFC8F7, arg0, arg4, arg1, arg9, arg6);
        } else {
            class241.method1490(arg1, arg6, arg7, arg4, arg0, arg5 ^ 0x3709, arg3, arg9, arg2, arg8);
        }
        if (arg5 == 14088) {
            field5923++;
        }
    }

    static {
        new class151("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
