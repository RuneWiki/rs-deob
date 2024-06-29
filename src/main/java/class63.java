import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class63 extends class29 {

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "Z")
    public static boolean field1601 = false;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "Lwb;")
    public static class130 field1604 = class26.method212("l", -32376);

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "Lwb;")
    private static class130 field1599 = class26.method212("Welcome to RuneScape", -32376);

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lwb;")
    public static class130 field1600 = field1599;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
    public static int field1605 = 0;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "Lwb;")
    public static class130 field1606 = class26.method212("Keine Antwort vom Anmelde)2Server)3", -32376);

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1603 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "Lwb;")
    private static class130 field1609 = class26.method212("No response from server)3", -32376);

    @OriginalMember(owner = "client!kc", name = "pb", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "Lwb;")
    public static class130 field1610 = field1609;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLab;)Z", line = 3)
    public static final boolean method522(byte arg0, class3 arg1) {
        int var2 = arg1.field111;
        field1594++;
        int var3 = -116 / ((arg0 + 11) / 41);
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class89.field2156++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class20.field592++;
            class53.method450(0, 0, class43.field1200, class15.method114(new class130[] { class81.field1943, class79.field1915[var2] }, -20349), 27, 0, -123);
            class53.method450(0, 0, class31.field875, class15.method114(new class130[] { class81.field1943, class79.field1915[var2] }, -20349), 34, 0, -111);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class53.method450(0, 0, class43.field1200, class15.method114(new class130[] { class81.field1943, arg1.field147 }, -20349), 24, 0, -108);
            class7.field237++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILfe;)V", line = 45)
    public final void method523(int arg0, class36 arg1) {
        if (arg0 <= 109) {
            field1603 = null;
        }
        while (true) {
            int var3 = arg1.method365((byte) -125);
            if (var3 == 0) {
                field1607++;
                return;
            }
            this.method524(108, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILfe;)V", line = 88)
    private final void method524(int arg0, int arg1, class36 arg2) {
        int var4 = -32 / ((arg0 + 32) / 42);
        if (arg1 == 1) {
            this.field1596 = arg2.method351((byte) -125);
            this.field1602 = arg2.method365((byte) -127);
            this.field1608 = arg2.method365((byte) -125);
        }
        field1597++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lpd;", line = 107)
    public static final class94 method525(int arg0, int arg1) {
        class94 var2 = (class94) class54.field1401.method402((long) arg1, -125);
        field1595++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field2733.method508(arg1, 0, 1);
        class94 var4 = new class94();
        if (arg0 != -201) {
            field1600 = null;
        }
        if (var3 != null) {
            var4.method702(new class36(var3), (byte) 119, arg1);
        }
        var4.method700(true);
        class54.field1401.method403((long) arg1, var4, (byte) -101);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V", line = 139)
    public static void method526(boolean arg0) {
        field1606 = null;
        field1609 = null;
        field1599 = null;
        field1603 = null;
        field1600 = null;
        if (!arg0) {
            field1603 = null;
        }
        field1610 = null;
        field1604 = null;
    }
}
