import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class139 {

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "Lqt;")
    public static class459 field2162 = new class459(5, 7);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 11)
    public static void method1013(int arg0) {
        field2162 = null;
        if (arg0 != 6744) {
            method1015(-97);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V", line = 27)
    public static final void method1014(int arg0, byte arg1) {
        if (class386.field5507 == null) {
            class386.field5507 = new byte[4][class69.field1139][class255.field3763];
        }
        field2160++;
        if (arg0 <= 63) {
            method1016(-70, true);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class69.field1139; var3++) {
                for (int var4 = 0; var4 < class255.field3763; var4++) {
                    class386.field5507[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)[Lea;", line = 63)
    public static final class390[] method1015(int arg0) {
        field2163++;
        if (arg0 != 0) {
            method1016(-96, true);
        }
        return new class390[] { class391.field5558, class192.field2799, class545.field7993 };
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZ)V", line = 74)
    public static final void method1016(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        class511 var2 = class53.field980;
        synchronized (class53.field980) {
            class53.field980.method2989(false, arg0);
        }
        field2161++;
    }
}
