import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class155 {

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lqe;")
    private static class179 field2781 = class206.method1380("cyan:", (byte) -127);

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lqe;")
    public static class179 field2776 = field2781;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lqe;")
    public static class179 field2788 = field2781;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lnc;")
    public static class144 field2777 = new class144(32);

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lqe;")
    public static class179 field2791 = class206.method1380("Lade Benutzeroberfl-=che )2 ", (byte) 112);

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Lqe;")
    public static class179 field2792 = class206.method1380("bevor Sie den Vorgang wiederholen)3", (byte) -127);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lae;")
    public static class6 field2790;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[B")
    public byte[] field2775;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[B")
    public byte[] field2784;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "[I")
    public static int[] field2795;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lwg;")
    public static class241[] field2786;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lqe;I)Z")
    public static final boolean method991(class179 arg0, int arg1) {
        field2783++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -127 % ((arg1 - 52) / 39);
        for (int var3 = 0; var3 < class202.field3741; var3++) {
            if (arg0.method1138(false, class152.field2743[var3])) {
                return true;
            }
        }
        return arg0.method1138(false, class61.field1298.field2168);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method992(int arg0) {
        field2781 = null;
        field2791 = null;
        field2777 = null;
        field2795 = null;
        field2790 = null;
        if (arg0 != 0) {
            field2777 = null;
        }
        field2776 = null;
        field2788 = null;
        field2792 = null;
        field2786 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method993(int arg0) {
        field2772++;
        if (!class182.field3358) {
            class215.field3993[0] = class189.field3509;
            class23.field552[0] = 1005;
            class23.field567[0] = class207.field3868;
            class113.field2118 = 1;
        }
        if (class159.field2899 != -1) {
            class239.method1552(class159.field2899, (byte) -72);
        }
        for (int var1 = 0; var1 < class160.field2907; var1++) {
            if (class143.field2592[var1]) {
                class186.field3455[var1] = true;
            }
            class147.field2667[var1] = class143.field2592[var1];
            class143.field2592[var1] = false;
        }
        if (arg0 != -16371) {
            field2792 = null;
        }
        class99.field1849 = -1;
        class115.field2175 = class13.field322;
        class100.field1868 = null;
        class131.field2379 = -1;
        if (class159.field2899 != -1) {
            class160.field2907 = 0;
            class106.method691(class159.field2899, class216.field4001, -1, -1412584499, 0, 0, 0, 0, class102.field1962);
        }
        class145.method915();
        class157.method1022(-1001);
        if (class182.field3358) {
            class125.method788((byte) -116);
        } else if (class99.field1849 != -1) {
            class60.method406(arg0 + 16386, class99.field1849, class131.field2379);
        }
        if (class110.field2056 == 3) {
            for (int var2 = 0; var2 < class160.field2907; var2++) {
                if (class147.field2667[var2]) {
                    class145.method923(class99.field1845[var2], class116.field2185[var2], class84.field1636[var2], class15.field401[var2], 16711935, 128);
                } else if (class186.field3455[var2]) {
                    class145.method923(class99.field1845[var2], class116.field2185[var2], class84.field1636[var2], class15.field401[var2], 16711680, 128);
                }
            }
        }
        class205.method1368(class49.field1038, class66.field1342, (byte) -49, class61.field1298.field3159, class61.field1298.field3198);
        class66.field1342 = 0;
    }
}
