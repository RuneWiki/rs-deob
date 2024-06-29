import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class382 {

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lob;")
    public static class521 field5750 = new class521(54, 7);

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Z")
    public static boolean field5751 = false;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field5752 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field5746;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field5749;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method2390(int arg0) {
        field5748++;
        if (arg0 == 11) {
            class508.field7441.method93((byte) 83);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lah;B)I")
    public static final int method2391(class263 arg0, byte arg1) {
        field5747++;
        int var2 = 23 / ((arg1 - 64) / 35);
        int var3 = arg0.method1760(2, true);
        int var4;
        if (var3 == 0) {
            var4 = 0;
        } else if (var3 == 1) {
            var4 = arg0.method1760(5, true);
        } else if (var3 == 2) {
            var4 = arg0.method1760(8, true);
        } else {
            var4 = arg0.method1760(11, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method2392(byte arg0) {
        field5750 = null;
        int var1 = -68 % ((arg0 + 61) / 41);
    }
}
