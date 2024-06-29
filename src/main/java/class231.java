import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class231 {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field3666 = 0;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field3672 = 0;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[I")
    public static int[] field3673 = new int[2048];

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field3671 = -2;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Leh;")
    public static class169 field3664;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I", line = 8)
    public static final int method1668(int arg0, int arg1, int arg2) {
        field3667++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (arg1 <= 81) {
                field3664 = (class169) null;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V", line = 52)
    public static final void method1669(int arg0, int arg1) {
        class97.method707(class97.field1616, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        field3669++;
        class97.method709(-50.0F, -60.0F, -50.0F);
        class97.method701(class97.field1609, 0);
        class97.method708();
        if (arg1 <= 115) {
            method1672(-58);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 72)
    public static final void method1670(String arg0, int arg1) {
        field3668++;
        if (class245.field3789 == null) {
            return;
        }
        if (arg1 != -18641) {
            field3672 = -41;
        }
        int var2 = 0;
        long var3 = class36.method281(93, arg0);
        if (var3 == 0L) {
            return;
        }
        while (class245.field3789.length > var2 && class245.field3789[var2].field3734 != var3) {
            var2++;
        }
        if (class245.field3789.length > var2 && class245.field3789[var2] != null) {
            class85.field1269++;
            class269.field4191.method246(false, 35);
            class269.field4191.method760(class245.field3789[var2].field3734, true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 113)
    public static final String method1671(String arg0, byte arg1) {
        field3665++;
        int var2 = class226.method1633(-125, arg0);
        if (var2 == -1) {
            return "";
        } else {
            int var3 = 49 / ((arg1 - 43) / 50);
            return class229.method1659(" ", class43.field763.field3131[var2], "<br>", -20263);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 128)
    public static void method1672(int arg0) {
        int var1 = -102 / ((-arg0) / 34);
        field3664 = null;
        field3673 = null;
    }
}
