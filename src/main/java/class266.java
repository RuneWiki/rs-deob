import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class266 extends class241 {

    @OriginalMember(owner = "client!g", name = "s", descriptor = "[[I")
    public static int[][] field4644 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Loh;")
    public static class263 field4646 = class253.method1681(-126, "leuchten3:");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
    public static final void method1797(byte arg0, int arg1) {
        field4643++;
        class101.field1922.method829(arg1, (byte) 116);
        if (arg0 <= 20) {
            method1799(110);
        }
        class212.field3795.method829(arg1, (byte) -94);
        class47.field1010.method829(arg1, (byte) -75);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZLue;Lue;)V")
    public static final void method1798(int arg0, boolean arg1, class86 arg2, class86 arg3) {
        class158.field2858 = arg1;
        field4639++;
        class156.field2807 = arg2;
        if (arg0 != 19037) {
            method1799(70);
        }
        class117.field2187 = arg3;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method1799(int arg0) {
        if (arg0 == 8) {
            field4646 = null;
            field4644 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Loh;B)V")
    public static final void method1800(class263 arg0, byte arg1) {
        field4647++;
        if (class225.field3970 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1755(arg1 - 48);
        if (var3 == 0L) {
            return;
        }
        while (class225.field3970.length > var2 && class225.field3970[var2].field4226 != var3) {
            var2++;
        }
        if (arg1 != 49) {
            method1800((class263) null, (byte) 6);
        }
        if (var2 < class225.field3970.length && class225.field3970[var2] != null) {
            class91.field1807++;
            class154.field2792.method1516(arg1 ^ 0xFFFFFF86, 192);
            class154.field2792.method1272((byte) 84, class225.field3970[var2].field4226);
        }
    }
}
