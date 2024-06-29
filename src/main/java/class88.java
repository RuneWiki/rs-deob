import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class88 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    public static int[] field1417 = new int[256];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1419 = 0;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field1421 = 1;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lwj;")
    public static class270 field1420;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)V", line = 9)
    public static final void method640(int arg0, byte arg1) {
        field1416++;
        if (class131.field2052 == arg0) {
            return;
        }
        if (class131.field2052 == 0) {
            class278.method1908(arg1 ^ 0x2);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 40) {
            class37.method310(1);
        }
        if (arg1 != 49) {
            return;
        }
        if (arg0 != 40 && client.field725 != null) {
            client.field725.method365(1);
            client.field725 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class241.field3852 = 0;
            field1421 = 1;
            class202.field3034 = 0;
            class7.field95 = 0;
            class178.field2691 = 1;
            class257.method1766(-46, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class240.method1668((byte) 126);
        }
        if (arg0 == 5) {
            class288.method1980((byte) 80, class186.field2788);
        } else {
            class62.method481(70);
        }
        boolean var3 = class131.field2052 == 5 || class131.field2052 == 10 || class131.field2052 == 28;
        if (var3 != var2) {
            if (var2) {
                class43.field694 = class165.field2476;
                if (class289.field4502 == 0) {
                    class218.method1535(2, (byte) 126);
                } else {
                    class112.method836(class165.field2476, 255, (byte) 105, false, 2, class192.field2872, 0);
                }
                class339.field5299.method34(-117, false);
            } else {
                class218.method1535(2, (byte) 126);
                class339.field5299.method34(70, true);
            }
        }
        if (class94.field1516 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class94.method704();
        }
        class131.field2052 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 89)
    public static void method641(int arg0) {
        field1417 = null;
        field1420 = null;
        if (arg0 != 40) {
            method641(-95);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)J")
    public abstract long method639(int arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public abstract void method642(boolean arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZ)I")
    public abstract int method643(int arg0, int arg1, boolean arg2);
}
