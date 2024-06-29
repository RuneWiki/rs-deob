import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 {

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field544 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public int field532 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "La;")
    public static class1 field534 = class113.method934(-11538, "backhmid1");

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "La;")
    private static class1 field542 = class113.method934(-11538, "The server is being updated)3");

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "La;")
    public static class1 field540 = field542;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "La;")
    public static class1 field548 = class113.method934(-11538, "Neuer Benutzer");

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "[I")
    public static int[] field547 = new int[4000];

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "La;")
    public static class1 field539 = class113.method934(-11538, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
    public static int[] field550 = new int[25];

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lqd;")
    public static class100 field549 = null;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field552 = 0;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "[[[Lpb;")
    public static class92[][][] field553 = new class92[4][104][104];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lvb;")
    public class128 field536;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lvb;")
    public class128 field537;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 3)
    public static void method275(int arg0) {
        field548 = null;
        field540 = null;
        field534 = null;
        field550 = null;
        field553 = null;
        field539 = null;
        field542 = null;
        field547 = null;
        field549 = null;
        if (arg0 <= 54) {
            method275(102);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 79)
    public static final void method276(int arg0) {
        field531++;
        if (class5.field217 == 0) {
            return;
        }
        class10 var1 = class106.field2687;
        int var2 = 0;
        if (class114.field2816 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class80.field2037[var3] != null) {
                class1 var4 = class128.field3133[var3];
                byte var5 = 0;
                int var6 = class132.field3239[var3];
                if (var4 != null && var4.method26((byte) 116, class103.field2615)) {
                    var4 = var4.method1((byte) 95, 5);
                    var5 = 1;
                }
                if (var4 != null && var4.method26((byte) 116, class100.field2538)) {
                    var4 = var4.method1((byte) 95, 5);
                    var5 = 2;
                }
                if ((var6 == 3 || var6 == 7) && (var6 == 7 || class6.field237 == 0 || class6.field237 == 1 && class12.method243(var4, -32624))) {
                    int var7 = 329 - var2 * 13;
                    byte var8 = 4;
                    var2++;
                    var1.method214(class46.field1217, var8, var7, 0);
                    var1.method214(class46.field1217, var8, var7 - 1, 65535);
                    int var9 = var8 + var1.method209(class46.field1217);
                    int var10 = var9 + var1.method213(32);
                    if (var5 == 1) {
                        class104.field2617[0].method330(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var5 == 2) {
                        class104.field2617[1].method330(var10, var7 - 12);
                        var10 += 14;
                    }
                    var1.method214(class116.method959(-44, new class1[] { var4, class39.field1066, class80.field2037[var3] }), var10, var7, 0);
                    var1.method214(class116.method959(56, new class1[] { var4, class39.field1066, class80.field2037[var3] }), var10, var7 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var6 == 5 && class6.field237 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method214(class80.field2037[var3], 4, var11, 0);
                    var1.method214(class80.field2037[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var6 == 6 && class6.field237 < 2) {
                    int var12 = 329 - var2 * 13;
                    var2++;
                    var1.method214(class116.method959(-58, new class1[] { class16.field522, class98.field2409, var4, class39.field1066, class80.field2037[var3] }), 4, var12, 0);
                    var1.method214(class116.method959(-81, new class1[] { class16.field522, class98.field2409, var4, class39.field1066, class80.field2037[var3] }), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0 != 4) {
            method276(-13);
        }
    }
}
