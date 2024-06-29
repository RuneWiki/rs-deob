import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 {

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public int field3072 = -1;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lje;")
    public static class67 field3047 = class85.method592(255, "sl_arrows");

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lje;")
    public static class67 field3051 = class85.method592(255, "<col=ff9040>");

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static volatile int field3048 = -1;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3061 = 0;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lje;")
    private static class67 field3058 = class85.method592(255, "Members object");

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lje;")
    public static class67 field3055 = class85.method592(255, "scrollen:");

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lje;")
    private static class67 field3056 = class85.method592(255, "Please enter your username)3");

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Lje;")
    private static class67 field3073 = class85.method592(255, "yellow:");

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field3065 = 0;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lje;")
    public static class67 field3066 = field3073;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "[I")
    public static int[] field3068 = new int[25];

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Lje;")
    public static class67 field3075 = field3073;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "Lje;")
    public static class67 field3071 = field3058;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lje;")
    public static class67 field3064 = field3056;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lje;")
    public static class67 field3057 = class85.method592(255, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field3070 = 0;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Lje;")
    private static class67 field3074 = class85.method592(255, "This computers address has been blocked");

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Lje;")
    public static class67 field3069 = field3074;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lod;")
    public class101 field3067;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lpc;")
    public static class107 field3059;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lfd;")
    public static class40 field3063;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[I")
    public int[] field3062;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[Lje;")
    public class67[] field3054;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static final void method1023(byte arg0) {
        field3050++;
        if (arg0 != 50) {
            method1023((byte) -82);
        }
        class104.field2369 = null;
        class75.field1617 = null;
        class45.field840 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1024(int arg0, byte arg1) {
        field3052++;
        if (class99.field2211[arg0]) {
            return true;
        } else if (class75.field1627.method249(arg0, 0)) {
            int var2 = class75.field1627.method263(arg0, (byte) 110);
            if (var2 == 0) {
                class99.field2211[arg0] = true;
                return true;
            }
            if (arg1 != -15) {
                method1024(-20, (byte) -124);
            }
            if (class55.field1062[arg0] == null) {
                class55.field1062[arg0] = new class72[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class55.field1062[arg0][var3] == null) {
                    byte[] var4 = class75.field1627.method267((byte) -124, var3, arg0);
                    if (var4 != null) {
                        class55.field1062[arg0][var3] = new class72();
                        class55.field1062[arg0][var3].field1508 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class55.field1062[arg0][var3].method523((byte) 87, new class91(var4));
                        } else {
                            class55.field1062[arg0][var3].method518(new class91(var4), 8467);
                        }
                    }
                }
            }
            class99.field2211[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1025(int arg0) {
        field3064 = null;
        field3066 = null;
        field3047 = null;
        field3063 = null;
        field3055 = null;
        field3069 = null;
        field3071 = null;
        field3051 = null;
        field3059 = null;
        field3056 = null;
        field3058 = null;
        field3068 = null;
        field3075 = null;
        field3057 = null;
        if (arg0 >= 123) {
            field3074 = null;
            field3073 = null;
        }
    }
}
