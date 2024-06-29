import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class174 {

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2662 = 0;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lnn;")
    public static class151 field2661 = new class151("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[I")
    public static int[] field2664 = new int[50];

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Z")
    public static boolean field2665 = false;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "J")
    public static long field2663;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)J")
    public abstract long method1066(int arg0);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I")
    public abstract int method1067(int arg0);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1068(String arg0, int arg1) {
        field2659++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class145.field1985; var2++) {
            if (arg0.equalsIgnoreCase(class137.field1853[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class113.field1500.field2459);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
    public static final void method1069(int arg0, int arg1) {
        field2660++;
        class26.field327 = arg1;
        class241 var2 = class306.field4633;
        synchronized (class306.field4633) {
            if (arg0 != 0) {
                field2665 = true;
            }
            class306.field4633.method1485(-22032);
        }
        class241 var3 = class386.field5705;
        synchronized (class386.field5705) {
            class386.field5705.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)C")
    public abstract char method1070(byte arg0);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public static void method1071(byte arg0) {
        if (arg0 > -120) {
            field2664 = null;
        }
        field2664 = null;
        field2661 = null;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I")
    public abstract int method1072(int arg0);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)V")
    public static final void method1073(int arg0, int arg1) {
        field2667++;
        class241 var2 = class295.field4482;
        synchronized (class295.field4482) {
            class295.field4482.method1481(3, arg1);
        }
        if (arg0 != -10826) {
            method1069(44, 109);
        }
        class241 var3 = class186.field2797;
        synchronized (class186.field2797) {
            class186.field2797.method1481(3, arg1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Z")
    public abstract boolean method1074(int arg0);
}
