import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "J")
    public long field560 = 0L;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lc;")
    public static class105 field571 = new class105(64);

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lqk;")
    public static class207 field573 = class24.method212(255, "0");

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lqk;")
    public static class207 field574 = class24.method212(255, ")4p=");

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lqk;")
    public static class207 field572 = class24.method212(255, "K");

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Ldc;")
    public class235 field564;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Ldc;")
    public class235 field577;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    public static final void method220(int arg0, int arg1) {
        if (arg0 != 64) {
            field574 = null;
        }
        field569++;
        class141.field2445.method1383(-8052, arg1);
        class249.field4511.method1383(-8052, arg1);
        class22.field352.method1383(arg0 - 8116, arg1);
        class282.field4956.method1383(-8052, arg1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lfk;IIB)V")
    public static final void method221(class14 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 81) {
            return;
        }
        field565++;
        if (arg0.field5052 == arg2 && arg2 != -1) {
            class65 var4 = class16.method101((byte) -119, arg2);
            int var5 = var4.field1171;
            if (var5 == 1) {
                arg0.field5047 = 0;
                arg0.field5048 = 0;
                arg0.field5069 = 0;
                arg0.field5103 = arg1;
                arg0.field5081 = 1;
                class69.method497(arg0.field5104, class202.field3565 == arg0, arg0.field5069, -121, arg0.field5072, var4);
            }
            if (var5 == 2) {
                arg0.field5048 = 0;
                return;
            }
        } else if (arg2 == -1 || arg0.field5052 == -1 || class16.method101((byte) 94, arg2).field1169 >= class16.method101((byte) -102, arg0.field5052).field1169) {
            arg0.field5011 = arg0.field5061;
            arg0.field5052 = arg2;
            arg0.field5103 = arg1;
            arg0.field5048 = 0;
            arg0.field5081 = 1;
            arg0.field5069 = 0;
            arg0.field5047 = 0;
            if (arg0.field5052 != -1) {
                class69.method497(arg0.field5104, class202.field3565 == arg0, arg0.field5069, -86, arg0.field5072, class16.method101((byte) -89, arg0.field5052));
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static final void method222(boolean arg0) {
        class185.field3275.method1390((byte) 109);
        field576++;
        if (arg0) {
            field572 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method223(byte arg0) {
        field573 = null;
        field572 = null;
        field571 = null;
        field574 = null;
        if (arg0 <= 55) {
            method222(false);
        }
    }
}
