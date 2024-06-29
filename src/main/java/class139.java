import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class139 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "[J")
    public static long[] field2445 = new long[1000];

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lke;")
    public static class256 field2447 = class316.method2202("::wm1", 27626);

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lke;")
    public static class256 field2449 = class316.method2202(" steht bereits auf Ihrer Freunde)2Liste(Q", 27626);

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Lke;")
    public static class256 field2454 = class316.method2202("Verbindung abgebrochen)3", 27626);

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lke;")
    private static class256 field2458 = class316.method2202("Loaded fonts", 27626);

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lke;")
    public static class256 field2452 = field2458;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "J")
    public long field2457;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lmc;")
    public class51 field2451;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Lmc;")
    public class51 field2455;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lmc;")
    public class51 field2459;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 16)
    public static final void method1027(int arg0, int arg1) {
        field2446++;
        class169.method1227(class169.field2997, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class169.method1230(-50.0F, -60.0F, -50.0F);
        class169.method1233(class169.field2996, 0);
        int var2 = 22 % ((arg1 - 30) / 61);
        class169.method1232();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 37)
    public static void method1028(int arg0) {
        field2445 = null;
        field2447 = null;
        field2452 = null;
        field2454 = null;
        field2458 = null;
        if (arg0 == 1000) {
            field2449 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Z", line = 80)
    public static final boolean method1029(int arg0, int arg1) {
        field2450++;
        if (arg0 >= 0 && arg0 < class196.field3592.length) {
            if (arg1 >= -80) {
                method1029(56, 22);
            }
            return class196.field3592[arg0];
        } else {
            return false;
        }
    }
}
