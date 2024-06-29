import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class33 {

    @OriginalMember(owner = "client!va", name = "d", descriptor = "J")
    public long field477 = 0L;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[S")
    public static short[] field485 = new short[] { 13, 2, 21, 3, 47, 23, 41, 43 };

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Ldf;")
    public static class51 field481 = class46.method233("null", 100);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Ldf;")
    public static class51 field486 = class46.method233("", 100);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lbg;")
    public static class217 field489 = new class217(64);

    @OriginalMember(owner = "client!va", name = "q", descriptor = "Ldf;")
    public static class51 field490 = class46.method233("<br>", 100);

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field494 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lia;")
    public static class208 field476;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lkb;")
    public class49 field488;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Lja;")
    public static class55 field496;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method165(int arg0) {
        field496 = null;
        field490 = null;
        field481 = null;
        field476 = null;
        field485 = null;
        field489 = null;
        if (arg0 == 2) {
            field486 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z")
    public static final boolean method166(int arg0, byte arg1) {
        if (arg1 <= 117) {
            method165(-111);
        }
        field487++;
        return (arg0 >> 21 & 0x1) != 0;
    }
}
