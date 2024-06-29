import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class71 {

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Lvc;")
    private static class137 field1507 = class45.method325("Click to continue", -46);

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lvc;")
    public static class137 field1504 = field1507;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lqa;")
    public static class105 field1493 = new class105(64);

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lvc;")
    private static class137 field1508 = class45.method325("Loaded sprites", -46);

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lvc;")
    public static class137 field1509 = field1508;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Lvc;")
    private static class137 field1513 = class45.method325("Loaded update list", -46);

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lvc;")
    public static class137 field1515 = class45.method325(" x ", -46);

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lvc;")
    public static class137 field1511 = field1513;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Lvc;")
    private static class137 field1514 = class45.method325("Message", -46);

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lvc;")
    public static class137 field1512 = field1514;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lpe;")
    public class103 field1505;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lfc;")
    public static class39 field1494;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Lvc;")
    public static final class137 method495(int arg0, byte arg1) {
        if (arg1 != -16) {
            field1510 = -114;
        }
        field1506++;
        if (arg0 < 100000) {
            return class61.method435(arg0, 71);
        } else if (arg0 < 10000000) {
            return class88.method666(arg1 ^ 0xFFFFFF85, new class137[] { class61.method435(arg0 / 1000, arg1 ^ 0xFFFFFF9E), class110.field2618 });
        } else {
            return class88.method666(124, new class137[] { class61.method435(arg0 / 1000000, 114), class67.field1380 });
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method496(int arg0) {
        field1504 = null;
        field1507 = null;
        field1514 = null;
        field1515 = null;
        field1512 = null;
        if (arg0 > -97) {
            return;
        }
        field1513 = null;
        field1511 = null;
        field1509 = null;
        field1493 = null;
        field1494 = null;
        field1508 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Z")
    public static final boolean method497(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field1498++;
            return (arg0 >> 20 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILvc;IIIILvc;)V")
    public static final void method498(int arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, class137 arg6) {
        if (arg4 != 2916) {
            method495(-63, (byte) 7);
        }
        field1499++;
        if (class59.field1270 >= 500) {
            return;
        }
        if (arg1.method997(123) <= 0) {
            class29.field646[class59.field1270] = arg6;
        } else {
            class29.field646[class59.field1270] = class88.method666(-125, new class137[] { arg6, class108.field2504, arg1 });
        }
        class78.field1721[class59.field1270] = arg0;
        class139.field3240[class59.field1270] = arg2;
        class56.field1198[class59.field1270] = arg3;
        class59.field1282[class59.field1270] = arg5;
        class59.field1270++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public static final void method499(int arg0, int arg1) {
        if (arg1 != -29440) {
            return;
        }
        for (class120 var2 = (class120) class61.field1315.method871(-16); var2 != null; var2 = (class120) class61.field1315.method874(false)) {
            if ((long) arg0 == (var2.field2490 >> 48 & 0xFFFFL)) {
                var2.method776(0);
            }
        }
        field1500++;
    }
}
