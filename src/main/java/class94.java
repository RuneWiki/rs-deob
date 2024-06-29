import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class94 {

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "J")
    public long field1767 = 0L;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lvd;")
    public static class222 field1757 = class212.method1357("Konfig geladen)3", 10731);

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1759 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lvd;")
    public static class222 field1770 = class212.method1357(")1 ", 10731);

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field1772 = -1;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "[I")
    public static int[] field1768 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Lvd;")
    public static class222 field1775 = class212.method1357("Spieler", 10731);

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "Lvd;")
    public static class222 field1776 = class212.method1357("blinken1:", 10731);

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Lvd;")
    private static class222 field1774 = class212.method1357("Connection lost)3", 10731);

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lvd;")
    public static class222 field1766 = field1774;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Le;")
    public class44 field1764;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Le;")
    public class44 field1771;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lba;B)Lba;")
    public static final class13 method602(class13 arg0, byte arg1) {
        field1765++;
        int var2 = class181.method1138(class221.method1405(arg0, (byte) -114), 11033);
        if (var2 == 0) {
            return null;
        }
        int var3 = 0;
        if (arg1 != -28) {
            field1768 = null;
        }
        while (var3 < var2) {
            arg0 = class10.method92(923, arg0.field238);
            if (arg0 == null) {
                return null;
            }
            var3++;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)J")
    public static final long method603(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        return var3 == null || var3.field2300 == null ? 0L : var3.field2300.field84;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method604(byte arg0) {
        if (arg0 != 19) {
            field1768 = null;
        }
        field1775 = null;
        field1757 = null;
        field1759 = null;
        field1774 = null;
        field1768 = null;
        field1766 = null;
        field1770 = null;
        field1776 = null;
    }
}
