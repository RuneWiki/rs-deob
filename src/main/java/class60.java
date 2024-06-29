import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Loe;")
    private class102 field1511 = new class102(256);

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lg;")
    private class43 field1516;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lg;")
    private class43 field1512;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1509 = 0;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lu;")
    private static class135 field1515 = class87.method676((byte) -102, "Welcome to RuneScape");

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1520 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lu;")
    public static class135 field1510 = field1515;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[B")
    public static byte[] field1527 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Ljava/lang/Object;")
    public static Object field1528 = new Object();

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field1531 = -1;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field1533 = 0;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lu;")
    public static class135 field1532 = class87.method676((byte) -71, "leuchten3:");

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lu;")
    public static class135 field1535 = class87.method676((byte) -128, "Benutzername: ");

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lg;")
    public static class43 field1518;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lhc;")
    public static class52 field1523;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Lae;")
    public static class6 field1534;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "[I")
    public static int[] field1529;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([IBI)Lke;")
    public final class74 method499(int[] arg0, byte arg1, int arg2) {
        if (arg1 != -120) {
            field1530 = -16;
        }
        field1514++;
        if (this.field1512.method333(arg1 ^ 0x2A) == 1) {
            return this.method506(arg0, arg2, (byte) 57, 0);
        } else if (this.field1512.method335(arg2, (byte) -38) == 1) {
            return this.method506(arg0, 0, (byte) -87, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[IB)Lke;")
    public final class74 method500(int arg0, int[] arg1, byte arg2) {
        field1519++;
        if (this.field1516.method333(-51) == 1) {
            return this.method503(0, arg1, (byte) 125, arg0);
        } else if (this.field1516.method335(arg0, (byte) -38) == 1) {
            return this.method503(arg0, arg1, (byte) 54, 0);
        } else {
            if (arg2 >= -24) {
                field1518 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLg;Lg;)V")
    public static final void method501(boolean arg0, class43 arg1, class43 arg2) {
        class98.field2377 = arg1;
        field1522++;
        if (arg0) {
            method504((byte) -14);
        }
        class119.field2839 = arg2;
        class63.field1589 = class98.field2377.method335(3, (byte) -38);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLu;Lu;Lu;)V")
    public static final void method502(byte arg0, class135 arg1, class135 arg2, class135 arg3) {
        if (arg0 != 116) {
            field1510 = null;
        }
        class57.field1399 = arg2;
        class57.field1394 = arg1;
        field1513++;
        class57.field1397 = arg3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[IBI)Lke;")
    private final class74 method503(int arg0, int[] arg1, byte arg2, int arg3) {
        if (arg2 <= 43) {
            method502((byte) -103, null, null, null);
        }
        field1517++;
        int var5 = arg3 ^ ((arg0 & 0xF0000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class74 var9 = (class74) this.field1511.method842(var7, 123);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class137 var10 = class137.method1107(this.field1516, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class74 var11 = var10.method1111();
            this.field1511.method836(var7, (byte) 115, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field1745.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method504(byte arg0) {
        if (arg0 != 122) {
            return;
        }
        field1515 = null;
        field1510 = null;
        field1518 = null;
        field1523 = null;
        field1535 = null;
        field1532 = null;
        field1527 = null;
        field1528 = null;
        field1529 = null;
        field1534 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lg;Lg;)V")
    public class60(class43 arg0, class43 arg1) {
        this.field1516 = arg1;
        this.field1512 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method505(int arg0) {
        field1525++;
        int var1 = class80.field1908;
        int var2 = class14.field331;
        int var3 = class28.field676;
        int var4 = class12.field289;
        int var5 = 6116423;
        class70.method564(var1, var2, var4, var3, var5);
        class70.method564(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class70.method574(var1 + 1, var2 - -18, var4 - 2, var3 + -19, arg0);
        class63.field1579.method121(class90.field2111, var1 + 3, var2 + 14, var5);
        int var6 = class76.field1798;
        int var7 = class53.field1278;
        if (class94.field2237 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class94.field2237 == 1) {
            var6 -= 205;
            var7 -= 553;
        }
        if (class94.field2237 == 2) {
            var6 -= 357;
            var7 -= 17;
        }
        for (int var8 = 0; var8 < class131.field3135; var8++) {
            int var9 = (class131.field3135 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < var1 + var4 && var9 - 13 < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class63.field1579.method137(class108.field2599[var8], var1 + 3, var9, var10, true);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([IIBI)Lke;")
    private final class74 method506(int[] arg0, int arg1, byte arg2, int arg3) {
        field1524++;
        int var5 = 102 / ((-arg2 - 29) / 52);
        int var6 = arg1 ^ ((arg3 & 0xF0000FFF) << 4 | arg3 >>> 12);
        int var7 = var6 | arg3 << 16;
        long var8 = (long) var7;
        class74 var10 = (class74) this.field1511.method842(var8, 123);
        if (var10 != null) {
            return var10;
        } else if (arg0 == null || arg0[0] > 0) {
            class61 var11 = class61.method508(this.field1512, arg3, arg1);
            if (var11 == null) {
                return null;
            }
            class74 var12 = var11.method510();
            this.field1511.method836(var8, (byte) 101, var12);
            if (arg0 != null) {
                arg0[0] -= var12.field1745.length;
            }
            return var12;
        } else {
            return null;
        }
    }
}
