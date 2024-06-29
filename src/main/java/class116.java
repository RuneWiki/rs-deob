import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class116 {

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lre;")
    public static class262 field1957 = new class262();

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Lbe;")
    public static class283 field1968 = class153.method941(125, "floorshadows");

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "J")
    public static long field1974 = 0L;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field1969 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public int field1953;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public int field1955;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public int field1956;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lgf;III)V", line = 10)
    public static final void method747(class7 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class246.field4176) {
            class160 var4 = class86.field1459[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2617 != null && var4.field2617.field1855.method48()) {
                arg0.method43(var4.field2617.field1855, 128, 0, 0, true);
            }
        }
        if (arg3 < class246.field4176) {
            class160 var5 = class86.field1459[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2617 != null && var5.field2617.field1855.method48()) {
                arg0.method43(var5.field2617.field1855, 0, 0, 128, true);
            }
        }
        if (arg2 < class246.field4176 && arg3 < class76.field1325) {
            class160 var6 = class86.field1459[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2617 != null && var6.field2617.field1855.method48()) {
                arg0.method43(var6.field2617.field1855, 128, 0, 128, true);
            }
        }
        if (arg2 < class246.field4176 && arg3 > 0) {
            class160 var7 = class86.field1459[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2617 != null && var7.field2617.field1855.method48()) {
                arg0.method43(var7.field2617.field1855, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 59)
    public static void method748(int arg0) {
        field1968 = null;
        field1957 = null;
        if (arg0 != 0) {
            field1974 = -119L;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)I", line = 91)
    public static final int method749(int arg0, byte arg1) {
        field1950++;
        if (class30.field468 == 1) {
            return 7;
        } else if (class30.field468 == 2) {
            return 20;
        } else {
            if (arg1 < 42) {
                method749(-64, (byte) 77);
            }
            if (arg0 == 15) {
                return 13;
            } else if (arg0 == 16) {
                return 3;
            } else if (arg0 == 22) {
                return 8;
            } else if (arg0 == 31) {
                return 14;
            } else if (arg0 == 38) {
                return 2;
            } else if (arg0 == 43) {
                return 15;
            } else if (arg0 == 48) {
                return 17;
            } else if (arg0 == 58) {
                return 11;
            } else if (arg0 == 69) {
                return 6;
            } else if (arg0 == 74) {
                return 20;
            } else if (arg0 == 77) {
                return 1;
            } else if (arg0 == 101) {
                return 12;
            } else if (arg0 == 103) {
                return 19;
            } else if (arg0 == 152) {
                return 16;
            } else if (arg0 == 161) {
                return 4;
            } else if (arg0 == 162) {
                return 9;
            } else if (arg0 == 166) {
                return 10;
            } else if (arg0 == 179) {
                return 18;
            } else if (arg0 == 191) {
                return 5;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 265)
    public static final void method750(byte arg0) {
        if (arg0 != -93) {
            field1969 = 41;
        }
        class91 var1 = (class91) class153.field2518.method1812((byte) -118);
        field1962++;
        while (var1 != null) {
            if (var1.field1534 == -1) {
                var1.field1537 = 0;
                class241.method1622(var1, (byte) -123);
            } else {
                var1.method557((byte) -89);
            }
            var1 = (class91) class153.field2518.method1813((byte) 124);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()V", line = 304)
    public static final void method751() {
        for (int var0 = 0; var0 < class221.field3716; var0++) {
            for (int var1 = 0; var1 < class246.field4176; var1++) {
                for (int var2 = 0; var2 < class76.field1325; var2++) {
                    class86.field1459[var0][var1][var2] = null;
                }
            }
        }
        for (int var3 = 0; var3 < class46.field637; var3++) {
            class12.field120[var3] = null;
        }
        class46.field637 = 0;
        for (int var4 = 0; var4 < field1969; var4++) {
            class257.field4338[var4] = null;
        }
        field1969 = 0;
        for (int var5 = 0; var5 < class202.field3459.length; var5++) {
            class202.field3459[var5] = null;
        }
    }
}
