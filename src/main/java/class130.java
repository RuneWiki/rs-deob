import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class130 extends class3 {

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public int field1950 = 0;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1947 = 0;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "Lok;")
    public static class41 field1955 = class137.method956("(U0a )2 non)2existant gosub script)2num: ", 45);

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "Lok;")
    private static class41 field1956 = class137.method956("Loaded update list", 45);

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "Lok;")
    public static class41 field1949 = field1956;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V", line = 8)
    public static void method914(byte arg0) {
        field1955 = null;
        if (arg0 != 59) {
            method919((Object[]) null, 33, (long[]) null);
        }
        field1956 = null;
        field1949 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLlb;I)V", line = 25)
    private final void method915(byte arg0, class112 arg1, int arg2) {
        if (arg2 == 2) {
            this.field1950 = arg1.method759((byte) -59);
        }
        field1951++;
        if (arg0 >= -7) {
            field1956 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLlb;)V", line = 45)
    public final void method916(byte arg0, class112 arg1) {
        while (true) {
            int var3 = arg1.method792(arg0 - 125);
            if (var3 == 0) {
                if (arg0 != 127) {
                    this.field1950 = 122;
                }
                field1954++;
                return;
            }
            this.method915((byte) -47, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBI)I", line = 66)
    public static final int method917(int arg0, byte arg1, int arg2) {
        class306 var3 = (class306) class186.field3031.method617((long) arg0, false);
        field1945++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field5130.length; var5++) {
                if (var3.field5125[var5] == arg2) {
                    var4 += var3.field5130[var5];
                }
            }
            int var6 = -30 / ((arg1 - 68) / 32);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lnb;", line = 98)
    public static final class138 method918(int arg0, int arg1) {
        field1952++;
        class138 var2 = (class138) class35.field527.method136((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field60.method454(class45.method329(arg0, true), 0, class226.method1625(arg0, (byte) -17));
        class138 var4 = new class138();
        var4.field2092 = arg0;
        if (arg1 >= -27) {
            return (class138) null;
        }
        if (var3 != null) {
            var4.method958(new class112(var3), -1);
        }
        var4.method962(-5);
        if (var4.field2078 != -1) {
            var4.method973(true, method918(var4.field2110, -53), method918(var4.field2078, -60));
        }
        if (var4.field2097 != -1) {
            var4.method959(method918(var4.field2058, -44), 9982, method918(var4.field2097, -81));
        }
        if (!class317.field5364 && var4.field2072) {
            var4.field2113 = 0;
            var4.field2120 = class212.field3416;
            var4.field2130 = null;
            var4.field2091 = false;
            var4.field2094 = null;
        }
        class35.field527.method132((long) arg0, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([Ljava/lang/Object;I[J)V", line = 150)
    public static final void method919(Object[] arg0, int arg1, long[] arg2) {
        field1953++;
        class295.method2038(0, arg2.length - arg1, arg2, arg0, (byte) -75);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V", line = 174)
    public static final void method920(int arg0, int arg1) {
        field1957++;
        class63.field927.method138(arg1, arg0 ^ arg0);
    }
}
