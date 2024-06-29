import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class90 extends class242 {

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field1487 = 0;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "[[[Lvh;")
    public static class252[][][] field1493 = new class252[4][104][104];

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Laf;")
    public static class64 field1489 = new class64(5000);

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Ldf;")
    private static class51 field1495 = class46.method233("Dec", 100);

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "Ldf;")
    private static class51 field1503 = class46.method233("Aug", 100);

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "Ldf;")
    private static class51 field1502 = class46.method233("Jun", 100);

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "Ldf;")
    private static class51 field1499 = class46.method233("Mar", 100);

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "Z")
    public static boolean field1498 = false;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "Ldf;")
    private static class51 field1505 = class46.method233("Oct", 100);

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "Ldf;")
    private static class51 field1507 = class46.method233("Jul", 100);

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "Ldf;")
    private static class51 field1501 = class46.method233("Jan", 100);

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Ldf;")
    private static class51 field1508 = class46.method233("Sep", 100);

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "Ldf;")
    private static class51 field1506 = class46.method233("Feb", 100);

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "Ldf;")
    private static class51 field1509 = class46.method233("Apr", 100);

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Ldf;")
    private static class51 field1510 = class46.method233("Nov", 100);

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "Ldf;")
    private static class51 field1496 = class46.method233("May", 100);

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "[Ldf;")
    public static class51[] field1497 = new class51[] { field1501, field1506, field1499, field1509, field1496, field1502, field1507, field1503, field1508, field1505, field1510, field1495 };

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "Lu;")
    public static class111 field1500;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLu;)V")
    public static final void method677(boolean arg0, class111 arg1) {
        class109.field1859 = arg1;
        if (arg0) {
            method679(-37);
        }
        field1492++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLdf;)I")
    public static final int method678(byte arg0, class51 arg1) {
        field1488++;
        if (arg1.method293(false) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class259.field4530.field2337; var2++) {
            if (class259.field4530.field2342[var2].method306(class85.field1423, class125.field2118, 0).method275((byte) 108, arg1)) {
                return var2;
            }
        }
        return arg0 == -73 ? -1 : 20;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public static void method679(int arg0) {
        int var1 = 33 / ((arg0 + 54) / 50);
        field1503 = null;
        field1489 = null;
        field1506 = null;
        field1507 = null;
        field1509 = null;
        field1493 = null;
        field1495 = null;
        field1497 = null;
        field1502 = null;
        field1505 = null;
        field1499 = null;
        field1496 = null;
        field1501 = null;
        field1508 = null;
        field1500 = null;
        field1510 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZI)V")
    public static final void method680(int arg0, boolean arg1, int arg2) {
        field1486++;
        class167 var3 = class208.method1430(arg0, 1, (byte) -117);
        var3.method1162(arg1);
        var3.field2724 = arg2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILjava/awt/Component;B)Lec;")
    public static final class23 method681(int arg0, int arg1, Component arg2, byte arg3) {
        field1490++;
        if (arg3 >= -96) {
            return null;
        }
        try {
            Class var4 = Class.forName("fc");
            class23 var5 = (class23) var4.getDeclaredConstructor().newInstance();
            var5.method127(arg0, -22254, arg1, arg2);
            return var5;
        } catch (Throwable var7) {
            class192 var6 = new class192();
            var6.method127(arg0, -22254, arg1, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
    public static final void method682(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        field1485++;
        if (class52.field876 == 0) {
            class162.field2656.method596((byte) 118, arg1);
        } else {
            class144.field2402 = arg1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
    public static final int method683(int arg0, int arg1) {
        if (arg0 != -123) {
            field1489 = null;
        }
        field1491++;
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }
}
