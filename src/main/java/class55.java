import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field1420 = 0;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field1417 = 0;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Loc;")
    public static class99 field1418 = class48.method402((byte) -104, "Mem:");

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1414 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1407 = 0;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Loc;")
    public static class99 field1421 = class48.method402((byte) -104, "titlebutton");

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field1419 = -1;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lr;")
    public static class118 field1425 = new class118(64);

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field1426 = -1;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Loc;")
    public static class99 field1429 = class48.method402((byte) -104, "sideicons");

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Z")
    public static boolean field1432 = false;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field1431 = 0;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Loc;")
    private static class99 field1433 = class48.method402((byte) -104, "Login limit exceeded)3");

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Loc;")
    public static class99 field1428 = field1433;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lpc;")
    public static class105 field1410;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lme;")
    public class88 field1408;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lme;")
    public class88 field1422;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lpc;IB)Z")
    public static final boolean method458(class105 arg0, int arg1, byte arg2) {
        field1424++;
        byte[] var3 = arg0.method897(arg1, 0);
        if (var3 == null) {
            return false;
        } else {
            class111.method948(var3, (byte) -98);
            return arg2 <= 106 ? true : true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lpc;Lpc;I)I")
    public static final int method459(class105 arg0, class105 arg1, int arg2) {
        int var3 = 19 / ((-arg2 - 36) / 42);
        field1430++;
        int var4 = 0;
        if (arg1.method906(class104.field2519, (byte) -120, class109.field2703)) {
            var4++;
        }
        if (arg0.method906(class83.field2051, (byte) -109, class109.field2703)) {
            var4++;
        }
        if (arg0.method906(class21.field504, (byte) -16, class109.field2703)) {
            var4++;
        }
        if (arg0.method906(field1421, (byte) -42, class109.field2703)) {
            var4++;
        }
        if (arg0.method906(class1.field24, (byte) -52, class109.field2703)) {
            var4++;
        }
        if (arg0.method906(class119.field2926, (byte) -14, class109.field2703)) {
            var4++;
        }
        arg0.method906(class52.field1234, (byte) -102, class109.field2703);
        arg0.method906(class84.field2079, (byte) -106, class109.field2703);
        arg0.method906(class54.field1316, (byte) -46, class109.field2703);
        arg0.method906(class80.field1976, (byte) -123, class109.field2703);
        arg0.method906(class25.field585, (byte) -70, class109.field2703);
        return var4;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)V")
    public static final void method460(byte arg0, int arg1) {
        if (arg0 >= -80) {
            return;
        }
        if (arg1 == -1 && !class72.field1837) {
            class49.method410(11244);
        } else if (arg1 != -1 && class61.field1628 != arg1 && class60.field1603 != 0 && !class72.field1837) {
            class135.method1110(arg1, class99.field2372, class60.field1603, 0, 0, 2, false);
        }
        field1412++;
        class61.field1628 = arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I")
    public static final int method461(int arg0) {
        if (arg0 != 0) {
            method460((byte) 44, 62);
        }
        field1416++;
        return 6;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static void method462(int arg0) {
        field1418 = null;
        field1425 = null;
        if (arg0 > -7) {
            return;
        }
        field1410 = null;
        field1429 = null;
        field1433 = null;
        field1428 = null;
        field1421 = null;
    }
}
