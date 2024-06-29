import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class71 {

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1067 = 0;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[C")
    public static char[] field1068 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lua;")
    public static class323 field1063;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZ)V", line = 16)
    public static final void method676(byte arg0, boolean arg1) {
        for (class160 var2 = (class160) class188.field2954.method2244((byte) -126); var2 != null; var2 = (class160) class188.field2954.method2241(-1)) {
            if (var2.field2563 != null) {
                class19.field316.method109(var2.field2563);
                var2.field2563 = null;
            }
            if (var2.field2546 != null) {
                class19.field316.method109(var2.field2546);
                var2.field2546 = null;
            }
            var2.method1357(947647010);
        }
        int var3 = 68 % ((-arg0 - 75) / 42);
        if (arg1) {
            for (class160 var4 = (class160) class210.field3232.method2244((byte) -126); var4 != null; var4 = (class160) class210.field3232.method2241(-1)) {
                if (var4.field2563 != null) {
                    class19.field316.method109(var4.field2563);
                    var4.field2563 = null;
                }
                var4.method1357(947647010);
            }
            for (class160 var5 = (class160) class328.field5044.method371(-19139); var5 != null; var5 = (class160) class328.field5044.method378((byte) -54)) {
                if (var5.field2563 != null) {
                    class19.field316.method109(var5.field2563);
                    var5.field2563 = null;
                }
                var5.method1357(947647010);
            }
        }
        field1065++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 84)
    public static void method677(int arg0) {
        if (arg0 != -20144) {
            field1067 = -42;
        }
        field1068 = null;
        field1063 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V", line = 119)
    public static final void method678(byte arg0, int arg1) {
        field1062++;
        class231.field3610.method649((byte) 75, arg1);
        class191.field3002.method649((byte) 75, arg1);
        int var2 = 9 % ((arg0 + 16) / 62);
        class346.field5504.method649((byte) 75, arg1);
        class223.field3465.method649((byte) 75, arg1);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 148)
    public static final void method679(byte arg0) {
        field1066++;
        if (class335.field5120 < 0) {
            class36.field544 = -1;
            class335.field5120 = 0;
            class191.field3006 = -1;
        }
        if (class351.field5596 < class335.field5120) {
            class191.field3006 = -1;
            class335.field5120 = class351.field5596;
            class36.field544 = -1;
        }
        if (class348.field5530 < 0) {
            class348.field5530 = 0;
            class191.field3006 = -1;
            class36.field544 = -1;
        }
        if (arg0 != -34) {
            method679((byte) 5);
        }
        if (class351.field5593 < class348.field5530) {
            class348.field5530 = class351.field5593;
            class36.field544 = -1;
            class191.field3006 = -1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 205)
    public static final void method680(byte arg0) {
        class153.field2486++;
        class99.field1491.method1628((byte) -110, 61);
        field1064++;
        class99.field1491.method304(false, class296.field4597);
        if (arg0 != -66) {
            method676((byte) -114, true);
        }
    }
}
