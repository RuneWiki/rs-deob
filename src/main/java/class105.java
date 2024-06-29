import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class105 extends class46 {

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "Lij;")
    public class97 field1967;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "[[B")
    public static byte[][] field1958 = new byte[250][];

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "Lmb;")
    public static class132 field1963 = class166.method1092("Lade)3)3)3", 122);

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "Lmb;")
    public static class132 field1962 = class166.method1092("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 112);

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "Lmb;")
    private static class132 field1965 = class166.method1092("shake:", 119);

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "Lmb;")
    public static class132 field1964 = field1965;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "Lmb;")
    private static class132 field1969 = class166.method1092("Connection lost)3", 111);

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "J")
    public static long field1968 = 0L;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "Lmb;")
    public static class132 field1966 = field1969;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "Lmb;")
    public static class132 field1971 = field1965;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "Ln;")
    public static class141 field1970;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Loc;")
    public static class155 field1959;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lii;I)Z")
    public static final boolean method645(class96 arg0, int arg1) {
        int var2 = 15 / ((arg1 + 29) / 61);
        field1961++;
        if (arg0.field1837 == null) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field1837.length; var3++) {
            int var4 = class4.method21(-1, var3, arg0);
            int var5 = arg0.field1689[var3];
            if (arg0.field1837[var3] == 2) {
                if (var4 >= var5) {
                    return false;
                }
            } else if (arg0.field1837[var3] == 3) {
                if (var4 <= var5) {
                    return false;
                }
            } else if (arg0.field1837[var3] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V")
    public static void method646(byte arg0) {
        field1971 = null;
        if (arg0 >= -42) {
            method647(null, -9, -91, 54, -93, (byte) 118, 20);
        }
        field1965 = null;
        field1966 = null;
        field1959 = null;
        field1969 = null;
        field1962 = null;
        field1970 = null;
        field1963 = null;
        field1964 = null;
        field1958 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lug;IIIIBI)Lug;")
    public static final class221 method647(class221 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        long var7 = (long) arg1;
        field1972++;
        class221 var9 = (class221) class86.field1496.method1138(var7, (byte) 127);
        if (var9 == null) {
            class76 var10 = class76.method466(class139.field2616, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method471(64, 768, -50, -10, -50);
            class86.field1496.method1135(var7, var9, true);
        }
        int var11 = arg0.method1374();
        int var12 = arg0.method1377();
        if (arg5 != 12) {
            return null;
        }
        int var13 = arg0.method1384();
        int var14 = arg0.method1379();
        class221 var15 = var9.method1386(true);
        if (arg6 != 0) {
            var15.method1373(arg6);
        }
        class242 var16 = (class242) var15;
        if (arg2 != class195.method1239(arg4 + var13, class139.field2615, false, arg3 + var11) || arg2 != class195.method1239(arg4 + var14, class139.field2615, false, arg3 + var12)) {
            for (int var17 = 0; var17 < var16.field4350; var17++) {
                var16.field4337[var17] += class195.method1239(var16.field4372[var17] + arg4, class139.field2615, false, var16.field4349[var17] + arg3) - arg2;
            }
            var16.field4334 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lij;)V")
    public class105(class97 arg0) {
        this.field1967 = arg0;
    }
}
