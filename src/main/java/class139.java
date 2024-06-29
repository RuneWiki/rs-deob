import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class139 {

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "J")
    public long field2425 = 0L;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field2411 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lij;")
    private static class50 field2412 = class78.method578(123, "Attack");

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field2416 = 99;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Lij;")
    public static class50 field2428 = class78.method578(126, "<col=ffffff>");

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lij;")
    public static class50 field2430 = field2412;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field2432 = 5063219;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Laa;")
    public class16 field2415;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Laa;")
    public class16 field2424;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "[[I")
    public static int[][] field2422;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method968(byte arg0) {
        field2412 = null;
        if (arg0 <= 46) {
            field2422 = null;
        }
        field2428 = null;
        field2422 = null;
        field2430 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
    public static final void method969(byte arg0) {
        field2413++;
        class74.field1387.method763(arg0 - 60);
        class78.field1444.method763(0);
        class187.field3100.method763(0);
        if (arg0 != 60) {
            field2428 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
    public static final void method970(int arg0, byte arg1) {
        if (arg0 == -1 && !class91.field1718) {
            class187.method1266(arg1 - 8);
        } else if (arg0 != -1 && (class250.field4347 != arg0 || !class193.method1308(false)) && class66.field1260 != 0 && !class91.field1718) {
            class187.method1262(class66.field1260, 2, 0, -12557, class56.field1014, false, arg0);
        }
        field2418++;
        if (arg1 != 40) {
            method968((byte) -28);
        }
        class250.field4347 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V")
    public static final void method971(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2414++;
        if (class100.field1855 <= arg2 && class97.field1816 >= arg2) {
            int var5 = class2.method10(class177.field2953, (byte) 97, arg1, class224.field3773);
            int var6 = class2.method10(class177.field2953, (byte) 97, arg0, class224.field3773);
            class231.method1573(var5, arg2, var6, -105, arg4);
        }
        if (arg3 != 451) {
            method970(20, (byte) 69);
        }
    }
}
