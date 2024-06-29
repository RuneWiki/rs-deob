import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class45 {

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "Lce;")
    private static class126 field701 = class206.method1445(-7923, "Loaded textures");

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lce;")
    public static class126 field696 = field701;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lce;")
    public static class126 field698 = class206.method1445(-7923, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field700 = 0;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Lce;")
    private static class126 field705 = class206.method1445(-7923, "Loaded update list");

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lce;")
    public static class126 field692 = field705;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lce;")
    public class126 field691;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field693;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "[I")
    public static int[] field697;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBII)V", line = 17)
    public static final void method278(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field704++;
        if (arg3 < 126) {
            field701 = (class126) null;
        }
        for (int var6 = arg1; var6 <= arg2; var6++) {
            class94.method647(class314.field5393[var6], arg4, -7, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)Lce;", line = 43)
    public static final class126 method279(boolean arg0) {
        field694++;
        if (arg0) {
            return (class126) null;
        }
        class126 var1;
        if (class257.field4316 == 1 && class173.field3067 < 2) {
            var1 = class12.method69(new class126[] { class286.field4731, class307.field5188, class279.field4640, class128.field2203 }, (byte) 117);
        } else if (class313.field5371 && class173.field3067 < 2) {
            var1 = class12.method69(new class126[] { class85.field1345, class307.field5188, class187.field3236, class128.field2203 }, (byte) 126);
        } else if (class39.field626 && class217.field3655[81] && class173.field3067 > 2) {
            var1 = class202.method1426(22247, class173.field3067 - 2);
        } else {
            var1 = class202.method1426(22247, class173.field3067 - 1);
        }
        if (class173.field3067 > 2) {
            var1 = class12.method69(new class126[] { var1, class50.field779, class195.method1386((byte) 20, class173.field3067 - 2), class33.field494 }, (byte) 122);
        }
        return var1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lcc;B)V", line = 70)
    public static final void method280(class313 arg0, byte arg1) {
        if (arg1 <= 89) {
            method281(-95);
        }
        field699++;
        class33.field497 = arg0.method2176(class264.field4408, 0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 81)
    public static void method281(int arg0) {
        field698 = null;
        field697 = null;
        field701 = null;
        int var1 = 110 % ((arg0 + 3) / 39);
        field705 = null;
        field692 = null;
        field693 = null;
        field696 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)I", line = 111)
    public static final int method282(int arg0) {
        field695++;
        if (field693 != null) {
            return 3;
        }
        int var1 = -69 % ((9 - arg0) / 55);
        if (class56.field846 && class309.field5242) {
            return 2;
        } else if (class56.field846 && !class309.field5242) {
            return 1;
        } else {
            return 0;
        }
    }
}
