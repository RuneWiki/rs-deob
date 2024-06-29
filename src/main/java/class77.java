import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class77 extends class137 {

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "[B")
    public byte[] field1451;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field1453 = 255;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "Lhh;")
    private static class163 field1456 = class137.method1065("Connecting to update server", 17);

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Lhh;")
    public static class163 field1457 = class137.method1065("Angreifen", 17);

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Lhh;")
    public static class163 field1454 = field1456;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "[I")
    public static int[] field1452 = new int[32];

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lob;")
    public static class46 field1446;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lwi;")
    public static final class239 method563(int arg0, int arg1) {
        class239 var2 = (class239) class109.field2056.method326((long) arg0, (byte) -88);
        field1450++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class133.field2574.method973(0, true, arg0);
        } else {
            var3 = class123.field2336.method973(0, true, arg0 & 0x7FFF);
        }
        class239 var4 = new class239();
        if (var3 != null) {
            var4.method1651((byte) -98, new class81(var3));
        }
        if (arg1 > -42) {
            return null;
        }
        if (arg0 >= 32768) {
            var4.method1657(121);
        }
        class109.field2056.method328(8690, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLpg;)Lo;")
    public static final class186 method564(boolean arg0, class81 arg1) {
        field1448++;
        if (arg0) {
            method564(true, (class81) null);
        }
        class186 var2 = new class186();
        var2.field3415 = arg1.method658(78);
        var2.field3413 = class71.method517(0, var2.field3415);
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
    public class77(byte[] arg0) {
        this.field1451 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static void method565(int arg0) {
        field1454 = null;
        field1452 = null;
        field1457 = null;
        if (arg0 != 32767) {
            method564(true, (class81) null);
        }
        field1446 = null;
        field1456 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
    public static final void method566(int arg0, int arg1) {
        field1449++;
        class197 var2 = (class197) class76.field1427.method1743((long) arg0, false);
        if (arg1 > 11 && var2 != null) {
            for (int var3 = 0; var3 < var2.field3557.length; var3++) {
                var2.field3557[var3] = -1;
                var2.field3549[var3] = 0;
            }
        }
    }
}
