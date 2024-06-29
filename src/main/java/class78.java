import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class78 extends class213 {

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "[I")
    public static int[] field1501 = new int[100];

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Lwd;")
    public static class232 field1505 = new class232(32);

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "[I")
    public static int[] field1506 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "Lvd;")
    public static class222 field1514 = class212.method1357("::fpson", 10731);

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "Lvd;")
    public static class222 field1516 = class212.method1357("::rect_debug", 10731);

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Lvd;")
    public static class222 field1507 = class212.method1357("rot:", 10731);

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lvd;")
    private static class222 field1513 = class212.method1357("Cancel", 10731);

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "Lvd;")
    public static class222 field1512 = field1513;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "Lve;")
    public static class223 field1508;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Lab;")
    public static class3 field1496;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "Lab;")
    public static class3 field1511;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1506 = null;
        if (arg0 != 39) {
            field1510 = -41;
        }
        field1501 = null;
        field1505 = null;
        field1496 = null;
        field1511 = null;
        field1507 = null;
        field1516 = null;
        field1514 = null;
        field1508 = null;
        field1512 = null;
        field1513 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lba;I)V")
    public static final void method516(class13 arg0, int arg1) {
        int var2 = arg0.field254 == 0 ? arg0.field341 : arg0.field254;
        int var3 = arg0.field354 == 0 ? arg0.field245 : arg0.field354;
        class38.method308(var2, var3, arg0.field269, 1, class220.field4066[arg0.field269 >> 16]);
        field1498++;
        if (arg0.field307 != null) {
            class38.method308(var2, var3, arg0.field269, 1, arg0.field307);
        }
        class21 var4 = (class21) class208.field3863.method1520((long) arg0.field269, arg1 - 196);
        if (var4 != null) {
            class35.method293(var4.field493, var2, var3, true);
        }
        if (arg1 != 229) {
            field1516 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)Lhb;")
    public static final class78 method517(int arg0, boolean arg1) {
        field1504++;
        if (!arg1) {
            field1505 = null;
        }
        class78 var2 = (class78) class79.field1517.method601((long) arg0, 77);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class102.field1898.method33(-29616, class50.method365(arg0, 124), class140.method880((byte) -118, arg0));
        class78 var4 = new class78();
        if (var3 != null) {
            var4.method518(new class109(var3), -16600);
        }
        class79.field1517.method593((long) arg0, var4, (byte) -12);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lka;I)V")
    private final void method518(class109 arg0, int arg1) {
        if (arg1 != -16600) {
            return;
        }
        while (true) {
            int var3 = arg0.method662((byte) -112);
            if (var3 == 0) {
                field1500++;
                return;
            }
            this.method519(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lka;ZI)V")
    private final void method519(class109 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field1503 = arg0.method675(2);
            this.field1497 = arg0.method662((byte) -121);
            this.field1502 = arg0.method662((byte) -98);
        }
        field1515++;
        if (!arg1) {
            method515(47);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
    public static final void method520(boolean arg0) {
        field1509++;
        if (!class38.field834) {
            class172.field3227 = 1;
            class131.field2535[0] = 1004;
            class179.field3323[0] = field1512;
            class72.field1434[0] = class29.field646;
        }
        if (class25.field580 != -1) {
            class66.method455(0, class25.field580);
        }
        for (int var1 = 0; var1 < class98.field1834; var1++) {
            if (class93.field1746[var1]) {
                class157.field3021[var1] = true;
            }
            class111.field2098[var1] = class93.field1746[var1];
            class93.field1746[var1] = false;
        }
        class34.field739 = class175.field3280;
        class230.field4329 = -1;
        class114.field2178 = null;
        class73.field1454 = -1;
        if (class25.field580 != -1) {
            class98.field1834 = 0;
            class112.method725(class122.field2321, -1, 0, 0, -1810599263, class70.field1315, 0, class25.field580, 0);
        }
        class53.method395();
        if (arg0) {
            field1516 = null;
        }
        class84.method550(122);
        if (class38.field834) {
            class221.method1403(1);
        } else if (class73.field1454 != -1) {
            class228.method1508(class73.field1454, class230.field4329, -1);
        }
        if (class197.field3600 == 3) {
            for (int var2 = 0; var2 < class98.field1834; var2++) {
                if (class111.field2098[var2]) {
                    class53.method389(class122.field2340[var2], class56.field1062[var2], class214.field3982[var2], class121.field2285[var2], 16711935, 128);
                } else if (class157.field3021[var2]) {
                    class53.method389(class122.field2340[var2], class56.field1062[var2], class214.field3982[var2], class121.field2285[var2], 16711680, 128);
                }
            }
        }
        class52.method374((byte) -95, class217.field4036, class121.field2305, class17.field432.field1353, class17.field432.field1360);
        class121.field2305 = 0;
    }
}
