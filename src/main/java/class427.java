import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class427 {

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "Lkca;")
    public static class73 field6349 = new class73(1, 3);

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "[I")
    public static int[] field6351;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILkea;Loa;)V")
    public static final void method2669(int arg0, class203 arg1, class605 arg2) {
        field6350++;
        if (class87.field989) {
            return;
        }
        if (arg0 != -23264) {
            field6349 = null;
        }
        arg2.method344(0);
        class367.field5549 = arg2.method388(class372.method2405(arg1, class197.field2669), true);
        class367.field5549.method2706((class581.field8366 - class367.field5549.method1577()) / 2, (class298.field4407 - class367.field5549.method1568()) / 2);
        class176.field2149 = arg2.method388(class372.method2405(arg1, class331.field4767), true);
        class176.field2149.method2706((class581.field8366 - class176.field2149.method1577()) / 2, 18);
        class87.field989 = true;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public static void method2670(int arg0) {
        int var1 = 118 % ((arg0 + 62) / 50);
        field6351 = null;
        field6349 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
    public static final void method2671(int arg0) {
        class600.field8764 = false;
        field6348++;
        class465.method2848(class291.field4026, class614.field8924, class508.field7392, (byte) -101, class421.field6308);
        if (arg0 != 18) {
            field6349 = null;
        }
    }

    static {
        new class474(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field6351 = new int[1];
        new class474(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
