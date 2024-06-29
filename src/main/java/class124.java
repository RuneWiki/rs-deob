import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class124 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lcd;")
    public static class23 field2538 = class54.method414("und loggen sich dann erneut ein)3", -1);

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2544 = Calendar.getInstance();

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field2547 = 0;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lcd;")
    public static class23 field2546 = class54.method414("::noclip", -1);

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lcd;")
    public static class23 field2549 = class54.method414("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", -1);

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Lcd;")
    public static class23 field2550 = null;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[I")
    public static int[] field2551 = new int[32];

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field2552 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public int field2536;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public int field2542;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lkh;")
    public static class97 field2540;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lkh;")
    public static class97 field2548;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "[I")
    public static int[] field2545;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIBLkh;)Z")
    public static final boolean method765(int arg0, int arg1, byte arg2, class97 arg3) {
        byte[] var4 = arg3.method651(4, arg1, arg0);
        field2537++;
        if (var4 == null) {
            return false;
        } else {
            class175.method1100(-27, var4);
            return arg2 <= 47 ? true : true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method766(byte arg0) {
        if (arg0 <= 126) {
            return;
        }
        field2544 = null;
        field2551 = null;
        field2538 = null;
        field2546 = null;
        field2540 = null;
        field2550 = null;
        field2545 = null;
        field2549 = null;
        field2548 = null;
    }
}
