import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class95 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Z")
    public static boolean field1735 = true;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Ljd;")
    public static class85 field1739 = class221.method1499("mem=", (byte) 127);

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[S")
    public static short[] field1737 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Ljd;")
    public static class85 field1736 = class221.method1499("Verbindung mit Update)2Server)3)3)3", (byte) -76);

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Ljd;")
    private static class85 field1746 = class221.method1499("flash1:", (byte) 98);

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Z")
    public static boolean field1743 = true;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Ljd;")
    public static class85 field1740 = field1746;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1747 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Ljd;")
    public static class85 field1733 = field1746;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lge;I)V")
    public static final void method677(class68 arg0, int arg1) {
        if (arg1 <= 119) {
            field1739 = null;
        }
        field1745++;
        class262.field4644 = arg0;
        class73.field1368 = class262.field4644.method456(4, -104);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZJ[I)Ljd;")
    public static final class85 method678(int arg0, boolean arg1, long arg2, int[] arg3) {
        field1738++;
        if (arg1) {
            method679(-18, 116, 68);
        }
        if (class65.field1193 != null) {
            class85 var5 = class65.field1193.method1084(arg2, arg0, (byte) 94, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return arg0 == 5 ? class116.method814(arg2, 119).method587((byte) -52) : class235.method1571(false, arg2);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)J")
    public static final long method679(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        return var3 == null || var3.field3653 == null ? 0L : var3.field3653.field1708;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method680(int arg0) {
        field1733 = null;
        field1737 = null;
        field1739 = null;
        field1746 = null;
        int var1 = -29 / ((arg0 - 59) / 50);
        field1736 = null;
        field1740 = null;
    }
}
