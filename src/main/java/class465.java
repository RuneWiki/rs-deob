import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class465 {

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public int field6727 = 0;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public int field6726 = 2048;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public int field6729 = 0;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public int field6731 = 2048;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Lob;")
    public static class521 field6728 = new class521(60, 5);

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field6732 = 0;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field6734 = new String[200];

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Lak;")
    public static class234 field6735 = new class234("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "Lks;")
    public static class305 field6733;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBLhp;)V")
    private final void method2812(int arg0, byte arg1, class217 arg2) {
        if (arg1 != 6) {
            field6735 = null;
        }
        if (arg0 == 1) {
            this.field6729 = arg2.method1515((byte) 123);
        } else if (arg0 == 2) {
            this.field6731 = arg2.method1511(-48);
        } else if (arg0 == 3) {
            this.field6726 = arg2.method1511(-21);
        } else if (arg0 == 4) {
            this.field6727 = arg2.method1529((byte) -110);
        }
        field6724++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILhp;)V")
    public final void method2813(int arg0, class217 arg1) {
        while (true) {
            int var3 = arg1.method1515((byte) 122);
            if (var3 == 0) {
                field6725++;
                if (arg0 >= -76) {
                    method2815(43);
                    return;
                }
                return;
            }
            this.method2812(var3, (byte) 6, arg1);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBIII)V")
    public static final void method2814(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class407.field6061 == 1) {
            class48.field612[class363.field5374 / 100].method132(class88.field1266 - 8, class483.field6940 + -8);
        }
        field6730++;
        if (class407.field6061 == 2) {
            class48.field612[class363.field5374 / 100 + 4].method132(class88.field1266 - 8, class483.field6940 + -8);
        }
        int var5 = -123 / ((1 - arg1) / 48);
        class373.method2338(9535);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method2815(int arg0) {
        field6733 = null;
        if (arg0 != -31840) {
            method2814(84, (byte) -84, -50, 14, 125);
        }
        field6735 = null;
        field6728 = null;
        field6734 = null;
    }
}
