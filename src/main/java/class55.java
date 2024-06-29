import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class55 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field981 = 1;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lhj;")
    private static class69 field990 = class181.method1318("shake:", (byte) -106);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lhj;")
    public static class69 field980 = field990;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field994 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field992 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lhj;")
    public static class69 field988 = field990;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lnc;")
    public static class83 field989;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static final void method324(int arg0) {
        if (arg0 >= -31) {
            method325(false);
        }
        for (class272 var1 = (class272) class38.field528.method1724(255); var1 != null; var1 = (class272) class38.field528.method1726(101)) {
            if (var1.field4823 == -1) {
                var1.field4812 = 0;
                class246.method1739(-26673, var1);
            } else {
                var1.method632(-8296);
            }
        }
        field985++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static final void method325(boolean arg0) {
        class118.field2226.method1713(117);
        field995++;
        if (!arg0) {
            field981 = 31;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static final void method326(int arg0) {
        class5.field42.method1709((byte) -47);
        field991++;
        if (arg0 != 1) {
            field990 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public static final void method327(int arg0, int arg1) {
        if (arg1 == -1) {
            field984++;
            class49.field718.method1708(arg1 - 1009973720, arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lnc;B)V")
    public static final void method328(class83 arg0, byte arg1) {
        class24.field358 = arg0;
        field987++;
        if (arg1 < 95) {
            method328((class83) null, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method329(byte arg0) {
        field988 = null;
        field990 = null;
        if (arg0 < 30) {
            field981 = -79;
        }
        field980 = null;
        field989 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Loh;")
    public static final class259 method330(int arg0, int arg1, int arg2, int arg3) {
        field982++;
        if (arg3 >= 0) {
            return null;
        }
        class259 var4 = new class259();
        var4.field4639 = arg0;
        var4.field4640 = arg2;
        class156.field2910.method761((long) arg1, 0, var4);
        class254.method1766((byte) -116, arg2);
        class50 var5 = client.method1144((byte) -9, arg1);
        if (var5 != null) {
            class204.method1478(var5, false);
        }
        if (class193.field3516 != null) {
            class204.method1478(class193.field3516, false);
            class193.field3516 = null;
        }
        int var6 = class177.field3218;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class170.method1242(class208.field3782[var7], 82)) {
                class221.method1570(var7, (byte) -68);
            }
        }
        if (class177.field3218 == 1) {
            class103.field1936 = false;
            class224.method1588(class134.field2493, (byte) 59, class46.field662, class200.field3613, class65.field1262);
        } else {
            class224.method1588(class134.field2493, (byte) 59, class46.field662, class200.field3613, class65.field1262);
            int var8 = class26.field378.method1606(class229.field4201);
            for (int var9 = 0; var9 < class177.field3218; var9++) {
                int var10 = class26.field378.method1606(class224.method1589(false, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class65.field1262 = var8 + 8;
            class134.field2493 = class177.field3218 * 15 + 22;
        }
        if (var5 != null) {
            class247.method1745(false, var5, 116);
        }
        class45.method257((byte) 114, arg2);
        if (class35.field483 != -1) {
            class215.method1548(1, class35.field483, 104);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static final void method331(int arg0) {
        field983++;
        if (!class224.field4081) {
            return;
        }
        class247.field4521 = null;
        class224.field4081 = false;
        if (arg0 != -16) {
            field988 = null;
        }
        class75.field1472 = null;
    }
}
