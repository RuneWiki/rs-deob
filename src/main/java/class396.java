import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class396 {

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static final void method2379(int arg0) {
        class232 var1 = class143.field1895;
        synchronized (class143.field1895) {
            class143.field1895.method1475(0);
        }
        field5644++;
        class232 var2 = class368.field5316;
        synchronized (class368.field5316) {
            class368.field5316.method1475(arg0 + 8);
        }
        if (arg0 != -8) {
            method2380(-78, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)I")
    public static final int method2380(int arg0, byte arg1) {
        if (arg1 >= -108) {
            method2380(-73, (byte) -112);
        }
        field5641++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
    public static final void method2381(int arg0) {
        field5642++;
        if (class304.field4318) {
            return;
        }
        int var1 = 51 / ((-arg0 - 53) / 50);
        class304.field4318 = true;
        class132.field1732 = true;
        if (class314.field4438.field5782) {
            class483.field6806 = (float) ((int) class483.field6806 - 17 & 0xFFFFFFF0);
        } else {
            class342.field4991 += (-12.0F - class342.field4991) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIB)V")
    public static final void method2382(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5643++;
        if (class202.field2967 == 1) {
            class273.field3976[class76.field938 / 100].method1079(class279.field4100 - 8, class264.field3854 - 8);
        }
        if (class202.field2967 == 2) {
            class273.field3976[class76.field938 / 100 + 4].method1079(class279.field4100 - 8, class264.field3854 + -8);
        }
        if (arg4 != -12) {
            field5645 = 114;
        }
        class132.method826(arg4 ^ 0xFFFFFFC9);
    }

    static {
        new class326("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field5645 = 0;
    }
}
