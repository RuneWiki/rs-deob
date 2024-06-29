import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class255 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field4524 = 0;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Leg;")
    public static class37 field4529 = class174.method1167("(U4", 109);

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[Z")
    public static boolean[] field4528 = new boolean[100];

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[I")
    public static int[] field4525;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method1739(int arg0) {
        field4528 = null;
        field4529 = null;
        field4525 = null;
        if (arg0 != 1) {
            method1742((byte) -62);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILeg;)Leg;")
    public static final class37 method1740(int arg0, class37 arg1) {
        field4527++;
        int var2 = class107.method719(4, arg1);
        return ~var2 == arg0 ? class214.field3705 : class146.field2477.field67[var2].method214((byte) 68, class56.field853, class241.field4337);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Lva;")
    public static final class187 method1741(boolean arg0) {
        field4526++;
        class187 var1 = new class187(31);
        var1.method1292(8, (byte) -64);
        var1.method1292(class68.field1088, (byte) -64);
        var1.method1292(class154.field2600 ? 1 : 0, (byte) -64);
        var1.method1292(class198.field3366 ? 1 : 0, (byte) -64);
        var1.method1292(class271.field4754 ? 1 : 0, (byte) -64);
        var1.method1292(class31.field461 ? 1 : 0, (byte) -64);
        var1.method1292(client.field1895 ? 1 : 0, (byte) -64);
        if (!arg0) {
            return null;
        }
        var1.method1292(class124.field2083 ? 1 : 0, (byte) -64);
        var1.method1292(class40.field646 ? 1 : 0, (byte) -64);
        var1.method1292(class232.field4013 ? 1 : 0, (byte) -64);
        var1.method1292(class23.field300, (byte) -64);
        var1.method1292(class120.field2034 ? 1 : 0, (byte) -64);
        var1.method1292(class36.field517 ? 1 : 0, (byte) -64);
        var1.method1292(class78.field1217 ? 1 : 0, (byte) -64);
        var1.method1292(class24.field315, (byte) -64);
        var1.method1292(class144.field2467 ? 1 : 0, (byte) -64);
        var1.method1292(class156.field2602, (byte) -64);
        var1.method1292(class252.field4507, (byte) -64);
        var1.method1292(class151.field2544, (byte) -64);
        var1.method1294(class35.field492, -26655);
        var1.method1294(class116.field1983, -26655);
        var1.method1292(class193.method1339(), (byte) -64);
        var1.method1272(27862, class240.field4265);
        var1.method1292(class121.field2037, (byte) -64);
        var1.method1292(class285.field5024 ? 1 : 0, (byte) -64);
        var1.method1292(class202.field3458 ? 1 : 0, (byte) -64);
        return var1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method1742(byte arg0) {
        field4522++;
        class73.field1158.method755(false);
        if (arg0 != 62) {
            method1739(-54);
        }
        class269.field4697 = null;
        class120.field2029 = 1;
    }
}
