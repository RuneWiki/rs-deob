import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lob;")
    private static class141 field465 = class175.method1195(40, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lob;")
    public static class141 field467 = field465;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[Lob;")
    public static class141[] field478 = new class141[200];

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lob;")
    public static class141 field477 = class175.method1195(40, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lob;")
    public class141 field476;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
    public boolean field468;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lbd;")
    public static final class15 method174(int arg0, int arg1) {
        field466++;
        if (arg0 != -16884) {
            field477 = null;
        }
        class15 var2 = (class15) class7.field108.method1383((long) arg1, (byte) -96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class100.field1956.method1065((byte) 48, arg1, 1);
        class15 var4 = new class15();
        if (var3 != null) {
            var4.method93((byte) -14, new class146(var3), arg1);
        }
        class7.field108.method1378(var4, (byte) -61, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method175(byte arg0) {
        int var1 = 6 % ((arg0 - 1) / 42);
        field467 = null;
        field465 = null;
        field477 = null;
        field478 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIII)I")
    public static final int method176(byte[] arg0, int arg1, int arg2, int arg3) {
        field474++;
        int var4 = -1;
        if (arg2 != -17062) {
            field477 = null;
        }
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class166.field3214[(arg0[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Z")
    public static final boolean method177(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            field478 = null;
        }
        field470++;
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILog;)Ldf;")
    public static final class37 method178(int arg0, class146 arg1) {
        field471++;
        return arg0 < 70 ? null : new class37(arg1.method992((byte) -67), arg1.method992((byte) -67), arg1.method992((byte) -67), arg1.method992((byte) -67), arg1.method1012(57), arg1.method991(255));
    }
}
