import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class234 {

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "[I")
    public static int[] field3436 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public static int field3439 = 0;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "Luaa;")
    public static class395 field3444;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "Liu;")
    public static class517 field3445;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "Lgp;")
    public static class561 field3442;

    static {
        new class567("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field3444 = new class395(8);
        field3445 = new class517(47, 2);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLoh;)V", line = 11)
    public static final void method1523(byte arg0, class549 arg1) {
        if (arg1.field7749 == 5 && arg1.field7703 != -1) {
            class372.method2256((byte) 56, arg1, class159.field2378);
        }
        field3437++;
        if (arg0 != -122) {
            field3436 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V", line = 37)
    public static void method1524(byte arg0) {
        field3444 = null;
        if (arg0 == 122) {
            field3436 = null;
            field3445 = null;
            field3442 = null;
        }
    }
}
