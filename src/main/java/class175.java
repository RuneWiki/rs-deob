import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class175 extends class67 {

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Led;")
    private static class43 field3484 = class191.method1219("Login", false);

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "[I")
    public static int[] field3483 = new int[32];

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Led;")
    private static class43 field3486 = class191.method1219("Loading wordpack )2 ", false);

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Led;")
    public static class43 field3476 = field3486;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Led;")
    public static class43 field3481 = class191.method1219("Mitglieder)2Welt", false);

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "J")
    public static long field3478 = 0L;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "Led;")
    private static class43 field3488 = class191.method1219("This world is running a closed Beta)3", false);

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Led;")
    public static class43 field3489 = field3484;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Led;")
    public static class43 field3475 = field3488;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "Led;")
    public class43 field3480;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "[I")
    public static int[] field3477;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "[I")
    public static int[] field3485;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method1099(byte arg0) {
        field3481 = null;
        if (arg0 > -90) {
            method1101(-103, true);
        }
        field3477 = null;
        field3475 = null;
        field3485 = null;
        field3488 = null;
        field3476 = null;
        field3489 = null;
        field3486 = null;
        field3484 = null;
        field3483 = null;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public static final void method1100(int arg0) {
        for (int var1 = 0; var1 < class95.field1864; var1++) {
            int var2 = class158.field3202[var1];
            class77 var3 = class172.field3433[var2];
            if (var3 != null) {
                class170.method1083(101, var3.field1539.field1219, var3);
            }
        }
        field3479++;
        if (arg0 != 32286) {
            field3486 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Lwf;")
    public static final class205 method1101(int arg0, boolean arg1) {
        field3487++;
        class205 var2 = (class205) class64.field1308.method1106(100, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            method1100(-39);
        }
        byte[] var3 = class74.field1465.method367(12, arg0, (byte) -34);
        class205 var4 = new class205();
        if (var3 != null) {
            var4.method1330(-1, new class89(var3));
        }
        var4.method1324(-15232);
        class64.field1308.method1107((long) arg0, var4, -105);
        return var4;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3483[var1] = var0 - 1;
            var0 += var0;
        }
        field3490 = 0;
    }
}
