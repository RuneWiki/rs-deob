import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lrd;")
    public static class117 field338 = class95.method812("l", (byte) 8);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lrd;")
    public static class117 field346 = class95.method812("@yel@", (byte) 8);

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lrd;")
    public static class117 field349 = class95.method812("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", (byte) 8);

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
    public static boolean field339 = false;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
    public static int[] field352 = new int[200];

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lrd;")
    private static class117 field348 = class95.method812("RuneScape has been updated(Q", (byte) 8);

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lrd;")
    public static class117 field353 = field348;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Z")
    public static boolean field354 = false;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lrd;")
    public static class117 field351 = class95.method812("Begeben Sie sich in ein freies Gebiet)1 um", (byte) 8);

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lmb;")
    public static class85 field350 = new class85(50);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lrd;")
    private static class117 field358 = class95.method812("This world is full)3", (byte) 8);

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Lrd;")
    public static class117 field357 = field358;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Lrd;")
    private static class117 field360 = class95.method812("Invalid loginserver requested)3", (byte) 8);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field355 = 0;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Lrd;")
    public static class117 field359 = field360;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Lrd;")
    private static class117 field356 = class95.method812("You are standing in a members)2only area)3", (byte) 8);

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Lrd;")
    public static class117 field361 = field356;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lwa;")
    public static final class144 method172(int arg0, int arg1) {
        field341++;
        if (arg1 != -13778) {
            return null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class77.field2090[var2] == null || class77.field2090[var2][var3] == null) {
            boolean var4 = class40.method463(-120, var2);
            if (!var4) {
                return null;
            }
        }
        return class77.field2090[var2][var3];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lrd;II)V")
    public static final void method173(class117 arg0, int arg1, int arg2) {
        field345++;
        class25.field754.method739(false, arg2);
        class25.field754.method166(arg2 - 1640531539, arg0.method966(arg2 ^ 0x65));
        class132.field3158++;
        class25.field754.method123(arg1, true);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method174(boolean arg0) {
        if (arg0) {
            field357 = null;
        }
        field338 = null;
        field351 = null;
        field350 = null;
        field352 = null;
        field346 = null;
        field353 = null;
        field359 = null;
        field361 = null;
        field356 = null;
        field357 = null;
        field360 = null;
        field358 = null;
        field348 = null;
        field349 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
    public static final boolean method175(int arg0, int arg1, int arg2) {
        if (arg2 == -3630) {
            field347++;
            return (arg0 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
