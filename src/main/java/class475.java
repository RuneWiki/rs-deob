import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class475 {

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Lfc;")
    public static class235 field6638 = new class235(61, 6);

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Lfc;")
    public static class235 field6640 = new class235(0, 8);

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field6642 = 0;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "[B")
    public static byte[] field6643 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Lst;")
    public static class397 field6637;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)I", line = 5)
    public static final int method2701(int arg0, int arg1, byte arg2) {
        field6639++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg2 <= 38) {
                method2702((byte) 67, null, -63);
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;I)I", line = 42)
    public static final int method2702(byte arg0, String arg1, int arg2) {
        if (arg0 != 1) {
            field6638 = null;
        }
        field6641++;
        return class403.method2308(true, arg1, arg2, true);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 60)
    public static final void method2703(byte arg0) {
        field6636++;
        class531.field7246.method669((byte) -31);
        class46.field686.method73((byte) -25);
        class258.field3685.method3503((byte) -128);
        class105.field1413.setBackground(Color.black);
        class179.field2657 = -1;
        class531.field7246 = class693.method3808(class105.field1413, 0);
        class46.field686 = class455.method2623(true, (byte) -113, class105.field1413);
        if (arg0 < 77) {
            method2701(-107, 31, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 77)
    public static void method2704(int arg0) {
        field6637 = null;
        field6638 = null;
        if (arg0 != 126) {
            method2702((byte) 61, null, -65);
        }
        field6643 = null;
        field6640 = null;
    }
}
