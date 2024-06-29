import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class103 extends class68 {

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public int field2425 = -1;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public int field2447 = 0;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Lae;")
    private static class6 field2421 = class64.method474(110, "Please remove ");

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Lae;")
    private static class6 field2419 = class64.method474(112, " million");

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Lae;")
    public static class6 field2424 = class64.method474(109, "invback");

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "Lae;")
    private static class6 field2422 = class64.method474(120, "Loaded config");

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "Lae;")
    public static class6 field2436 = field2421;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "Lae;")
    public static class6 field2423 = field2421;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "[Lae;")
    public static class6[] field2431 = new class6[100];

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "Lae;")
    public static class6 field2432 = class64.method474(119, "Welt");

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "Lae;")
    public static class6 field2437 = field2419;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field2430 = 0;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lae;")
    public static class6 field2445 = field2422;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Lae;")
    private static class6 field2448 = class64.method474(124, "World");

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "Lae;")
    public static class6 field2434 = field2448;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "Lae;")
    public static class6 field2451 = class64.method474(111, "headicons_pk");

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lae;")
    public static class6 field2450 = class64.method474(116, "hitmarks");

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field2449 = -1;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "Lae;")
    public static class6 field2452 = class64.method474(115, "logo");

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public int field2418;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public int field2428;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "Ljava/awt/Image;")
    public static Image field2433;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "[I")
    public static int[] field2429;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 5)
    public static void method876(int arg0) {
        field2436 = null;
        field2431 = null;
        field2423 = null;
        field2437 = null;
        field2424 = null;
        field2445 = null;
        field2421 = null;
        field2451 = null;
        field2429 = null;
        if (arg0 != 28549) {
            field2439 = 74;
        }
        field2433 = null;
        field2419 = null;
        field2450 = null;
        field2432 = null;
        field2434 = null;
        field2422 = null;
        field2452 = null;
        field2448 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I", line = 42)
    public static final int method877(int arg0, int arg1, int arg2) {
        field2443++;
        class136 var3 = (class136) class20.field389.method276((byte) -19, (long) arg2);
        if (var3 == null) {
            return -1;
        } else {
            if (arg0 <= 5) {
                field2429 = null;
            }
            return arg1 >= 0 && var3.field3312.length > arg1 ? var3.field3312[arg1] : -1;
        }
    }
}
