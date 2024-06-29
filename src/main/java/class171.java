import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class171 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public int field2798 = -1;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lqd;")
    public static class40 field2796 = class147.method1106("rot:", (byte) -61);

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lqd;")
    public static class40 field2799 = class147.method1106("ul", (byte) -73);

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lqd;")
    public static class40 field2802 = class147.method1106("Lade)3)3)3", (byte) -111);

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lbc;")
    public class112 field2804;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
    public static int[] field2797;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[I")
    public int[] field2801;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[Lqd;")
    public class40[] field2803;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBLqd;Lqd;ILqd;)V", line = 6)
    public static final void method1265(int arg0, byte arg1, class40 arg2, class40 arg3, int arg4, class40 arg5) {
        if (arg1 != -81) {
            method1265(63, (byte) -38, (class40) null, (class40) null, 65, (class40) null);
        }
        field2800++;
        for (int var6 = 99; var6 > 0; var6--) {
            class209.field3344[var6] = class209.field3344[var6 - 1];
            class61.field1164[var6] = class61.field1164[var6 - 1];
            class279.field4706[var6] = class279.field4706[var6 - 1];
            class194.field3127[var6] = class194.field3127[var6 - 1];
            class81.field1433[var6] = class81.field1433[var6 - 1];
        }
        class61.field1164[0] = arg2;
        class209.field3344[0] = arg4;
        class2.field22 = class60.field1152;
        class98.field1755++;
        class279.field4706[0] = arg3;
        class194.field3127[0] = arg5;
        class81.field1433[0] = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 76)
    public static void method1266(int arg0) {
        field2797 = null;
        field2796 = null;
        if (arg0 != 0) {
            field2797 = (int[]) null;
        }
        field2799 = null;
        field2802 = null;
    }
}
