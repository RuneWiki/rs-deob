import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class338 extends class186 {

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public static int field4907 = -1;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "[I")
    public static int[] field4908 = new int[14];

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "Z")
    public static boolean field4905 = true;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "I")
    public static int field4915 = 0;

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "Lvg;")
    public static class622 field4913 = new class622(17, -1);

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "Lmh;")
    public static class139 field4916 = new class139(2, 2);

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "J")
    public static long field4910;

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "[Z")
    public static boolean[] field4914;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)I", line = 7)
    public static final int method2090(byte arg0, int arg1) {
        field4904++;
        if (arg0 >= -51) {
            field4909 = -40;
        }
        return arg1 == 16711935 ? -1 : class693.method3908(arg1, true);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V", line = 22)
    public static void method2091(byte arg0) {
        if (arg0 != 35) {
            method2093(120, null);
        }
        field4916 = null;
        field4908 = null;
        field4914 = null;
        field4913 = null;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)Z", line = 40)
    public static final boolean method2092(int arg0, int arg1, int arg2) {
        int var3 = 39 / ((47 - arg0) / 48);
        field4912++;
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILjava/lang/String;)I", line = 50)
    public static final int method2093(int arg0, String arg1) {
        field4906++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 < 106) {
            field4909 = -107;
        }
        for (int var2 = 0; var2 < class356.field5266; var2++) {
            if (arg1.equalsIgnoreCase(class205.field2796[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(II)Leo;", line = 77)
    public static final class642 method2094(int arg0, int arg1) {
        field4911++;
        if (arg1 == 0) {
            return new class360();
        } else if (arg1 == 1) {
            return new class233();
        } else if (arg1 == 2) {
            return new class17();
        } else if (arg1 == 3) {
            return new class613();
        } else if (arg1 == 4) {
            return new class255();
        } else if (arg1 == 5) {
            return new class297();
        } else if (arg1 == 6) {
            return new class41();
        } else if (arg1 == 7) {
            return new class111();
        } else if (arg1 == 8) {
            return new class309();
        } else if (arg1 == 9) {
            return new class405();
        } else if (arg1 == 10) {
            return new class21();
        } else if (arg1 == 11) {
            return new class407();
        } else if (arg1 == 12) {
            return new class401();
        } else if (arg1 == 13) {
            return new class122();
        } else if (arg1 == 14) {
            return new class428();
        } else if (arg1 == 15) {
            return new class492();
        } else if (arg1 == 16) {
            return new class504();
        } else if (arg1 == 17) {
            return new class643();
        } else if (arg1 == 18) {
            return new class634();
        } else if (arg1 == 19) {
            return new class587();
        } else if (arg1 == 20) {
            return new class496();
        } else if (arg1 == 21) {
            return new class115();
        } else if (arg1 == 22) {
            return new class460();
        } else if (arg1 == 23) {
            return new class183();
        } else if (arg1 == 24) {
            return new class635();
        } else if (arg1 == 25) {
            return new class380();
        } else if (arg1 == 26) {
            return new class394();
        } else if (arg1 == 27) {
            return new class125();
        } else if (arg1 == 28) {
            return new class239();
        } else if (arg1 == 29) {
            return new class645();
        } else if (arg1 == 30) {
            return new class66();
        } else if (arg1 == 31) {
            return new class584();
        } else if (arg1 == 32) {
            return new class625();
        } else if (arg1 == 33) {
            return new class630();
        } else if (arg1 == 34) {
            return new class68();
        } else if (arg1 == 35) {
            return new class189();
        } else if (arg1 == 36) {
            return new class90();
        } else if (arg1 == 37) {
            return new class555();
        } else if (arg1 == 38) {
            return new class1();
        } else if (arg1 == 39) {
            return new class190();
        } else {
            if (arg0 != 36) {
                field4913 = null;
            }
            return null;
        }
    }
}
