import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class97 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    public static int[] field1774 = new int[5];

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lrd;")
    public static class173 field1772 = class133.method843("Bitte versuchen Sie es erneut)3", 52);

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public static boolean field1773 = false;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[I")
    public static int[] field1775;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lrd;Lrd;ILrd;Z)V")
    public static final void method597(class173 arg0, class173 arg1, int arg2, class173 arg3, boolean arg4) {
        for (int var5 = 99; var5 > 0; var5--) {
            class195.field3784[var5] = class195.field3784[var5 - 1];
            class131.field2481[var5] = class131.field2481[var5 - 1];
            class111.field2071[var5] = class111.field2071[var5 - 1];
            class179.field3540[var5] = class179.field3540[var5 - 1];
        }
        class195.field3784[0] = arg2;
        class96.field1769++;
        class131.field2481[0] = arg3;
        if (!arg4) {
            class111.field2071[0] = arg0;
            field1777++;
            class179.field3540[0] = arg1;
            class197.field3849 = class34.field741;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method598(byte arg0) {
        if (arg0 != -33) {
            method597(null, null, 86, null, false);
        }
        field1774 = null;
        field1772 = null;
        field1775 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)J")
    public static final synchronized long method599(int arg0) {
        field1779++;
        long var1 = System.currentTimeMillis();
        if (var1 < class145.field2706) {
            class219.field4212 += class145.field2706 - var1;
        }
        class145.field2706 = var1;
        if (arg0 != 5) {
            field1778 = -82;
        }
        return class219.field4212 + var1;
    }
}
