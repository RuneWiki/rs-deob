import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class45 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lrc;")
    public static class105 field1011 = class43.method374("Cabbage", 0);

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1018 = 0;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lrc;")
    public static class105[] field1013 = new class105[100];

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lrc;")
    private static class105 field1021 = class43.method374("Please reload this page)3", 0);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lrc;")
    private static class105 field1024 = class43.method374("skill)2", 0);

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
    public static int[] field1025 = new int[2000];

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lrc;")
    public static class105 field1012 = field1024;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lrc;")
    public static class105 field1015 = field1021;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lvc;")
    public static class129 field1010;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lfc;")
    public static class34 field1014;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
    public static int[] field1016;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[I")
    public static int[] field1017;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 20)
    public static void method379(int arg0) {
        field1010 = null;
        field1013 = null;
        field1011 = null;
        field1016 = null;
        field1014 = null;
        field1015 = null;
        field1024 = null;
        int var1 = -117 % ((arg0 - 55) / 54);
        field1017 = null;
        field1021 = null;
        field1012 = null;
        field1025 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 56)
    public static final void method380(int arg0) {
        if (class74.field1630 != null) {
            class74.field1630.method1037(0);
        }
        field1028++;
        if (arg0 != 0) {
            field1019 = -56;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 90)
    public static final void method381(byte arg0) {
        field1020++;
        if (arg0 != 24) {
            method379(-69);
        }
        while (true) {
            class3 var1 = class109.field2507;
            class64 var2;
            synchronized (class109.field2507) {
                var2 = (class64) class112.field2626.method34((byte) 55);
            }
            if (var2 == null) {
                return;
            }
            var2.field1436.method650(arg0 + 19524, var2.field1426, false, (int) var2.field1448, var2.field1427);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V", line = 114)
    public static final void method382(int arg0, int arg1) {
        if (arg1 != 0) {
            field1015 = null;
        }
        field1023++;
        class18.method200(arg0, false, 0, null, arg1 - 1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLb;)Lrc;", line = 154)
    public static final class105 method383(byte arg0, class7 arg1) {
        field1027++;
        if (arg0 > -121) {
            method381((byte) 107);
        }
        return class111.method911((byte) 18, 32767, arg1);
    }
}
