import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class117 extends class130 {

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Lgg;")
    public static class63 field2607 = class116.method911(43, "Abbrechen");

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lch;")
    public static class29 field2609 = new class29(64);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "Lch;")
    public static class29 field2620 = new class29(200);

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "Lgg;")
    public static class63 field2627 = class116.method911(43, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "[Lnd;")
    public static class121[] field2626 = new class121[500];

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "Lgg;")
    public static class63 field2628 = class116.method911(43, "blaugr-Un:");

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "Lff;")
    public static class54 field2623;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Lgg;")
    public class63 field2608;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "Lid;")
    public static class78 field2625;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "Z")
    public static boolean field2622;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "[I")
    public int[] field2611;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "[I")
    public int[] field2619;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "[Lgg;")
    public class63[] field2613;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public static void method915(byte arg0) {
        field2625 = null;
        field2609 = null;
        field2620 = null;
        field2623 = null;
        field2628 = null;
        if (arg0 == -93) {
            field2626 = null;
            field2607 = null;
            field2627 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lgg;")
    public static final class63 method916(byte arg0, int arg1) {
        field2612++;
        if (arg1 < 999999999) {
            return class175.method1162((byte) -126, arg1);
        } else {
            int var2 = -14 / ((arg0 + 2) / 48);
            return class127.field2811;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljc;III)Z")
    public static final boolean method917(class85 arg0, int arg1, int arg2, int arg3) {
        field2615++;
        byte[] var4 = arg0.method745(arg1, arg2, 0);
        if (arg3 != -20878) {
            return false;
        } else if (var4 == null) {
            return false;
        } else {
            class45.method455(-97, var4);
            return true;
        }
    }
}
