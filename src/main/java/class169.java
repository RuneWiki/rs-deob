import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class169 {

    @OriginalMember(owner = "client!l", name = "f", descriptor = "J")
    public long field2635 = 0L;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2630 = 0;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[Z")
    public static boolean[] field2640 = new boolean[100];

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Ljk;")
    public class276 field2634;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Ljk;")
    public class276 field2639;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1115(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class90.method584(721512226, false);
        class270.field4430 = arg4;
        class141.field2177 = arg1;
        class151.field2349 = arg3;
        field2636++;
        class13.method79(arg2);
        class145.field2289 = new class130(arg0);
        class75.field1183 = new class130(8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1116(byte arg0) {
        if (arg0 <= -12) {
            field2640 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfa;ILll;Lfa;Z)V")
    public static final void method1117(class273 arg0, int arg1, class222 arg2, class273 arg3, boolean arg4) {
        class252.field3989 = arg0;
        class247.field3939 = arg3;
        field2646++;
        class103.field1552 = arg4;
        int var5 = arg1 + class252.field3989.method1892((byte) -100);
        class120.field1845 = var5 * 256 + class252.field3989.method1890(true, var5);
        class74.field1142 = arg2;
        class147.field2311 = new String[] { null, null, class288.field4791, null, null };
        class105.field1577 = new String[] { null, null, null, null, class128.field1973 };
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method1118(int arg0) {
        field2638++;
        if (arg0 != 0) {
            method1118(13);
        }
        class16.field227.method145(-75);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IC)C")
    public static final char method1119(int arg0, char arg1) {
        if (arg0 < 74) {
            return 't';
        }
        field2643++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }
}
