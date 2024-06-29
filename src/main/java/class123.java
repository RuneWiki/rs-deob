import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class123 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lsf;")
    public static class108 field2092 = class140.method973(255, "Chargement de l(W-Bcran)2titre )2 ");

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[[Lek;")
    public static class186[][] field2094 = new class186[13][13];

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lsf;")
    private static class108 field2096 = class140.method973(255, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lsf;")
    public static class108 field2095 = null;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lsf;")
    public static class108 field2097 = field2096;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "F")
    public static float field2093;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 32)
    public static void method856(int arg0) {
        field2096 = null;
        field2092 = null;
        field2095 = null;
        if (arg0 != 0) {
            field2094 = (class186[][]) ((class186[][]) null);
        }
        field2094 = (class186[][]) null;
        field2097 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lrm;Z)V", line = 59)
    public static final void method857(class249 arg0, boolean arg1) {
        field2091++;
        int var2 = arg0.method1739((byte) -42);
        class265.field4675 = new class285[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class265.field4675[var3] = new class285();
            class265.field4675[var3].field4977 = arg0.method1739((byte) -121);
            class265.field4675[var3].field4984 = arg0.method1747(0);
        }
        class5.field68 = arg0.method1739((byte) -112);
        class110.field1931 = arg0.method1739((byte) -59);
        class110.field1926 = arg0.method1739((byte) -35);
        class184.field3388 = new class278[class110.field1931 + 1 - class5.field68];
        for (int var4 = 0; var4 < class110.field1926; var4++) {
            int var5 = arg0.method1739((byte) -106);
            class278 var6 = class184.field3388[var5] = new class278();
            var6.field2865 = arg0.method1731(true);
            var6.field2868 = arg0.method1738(-1756395344);
            var6.field4887 = class5.field68 + var5;
            var6.field4881 = arg0.method1747(0);
            var6.field4882 = arg0.method1747(0);
        }
        class216.field3839 = arg0.method1738(-1756395344);
        class320.field5487 = arg1;
    }
}
