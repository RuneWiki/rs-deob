import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class93 {

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "B")
    public byte field1425;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "Ljt;")
    public class93 field1412;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "J")
    public static long field1417 = 0L;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "Lnj;")
    public static class227 field1426;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "Z")
    public static boolean field1411;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V", line = 7)
    public static final void method730(byte arg0) {
        field1429++;
        if (arg0 != 3) {
            return;
        }
        for (int var1 = 0; var1 < class273.field3798; var1++) {
            class70 var2 = class653.field8828[var1];
            if (var2.field1054 == 3) {
                if (var2.field1052 == null) {
                    var2.field1055 = Integer.MIN_VALUE;
                } else {
                    class639.field8604.method164(var2.field1052);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)I", line = 41)
    public static final int method731(int arg0, int arg1, int arg2) {
        field1420++;
        int var3 = 127 / ((arg2 + 76) / 48);
        int var4 = arg1 >>> 31;
        return (arg1 + var4) / arg0 - var4;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILqi;)Z", line = 64)
    public static final boolean method732(int arg0, class532 arg1) {
        field1424++;
        class58 var2 = class470.field6288.method1258(arg1.method146(false), (byte) -84);
        if (var2.field809 == -1) {
            return true;
        }
        if (arg0 < 103) {
            field1411 = true;
        }
        class413 var3 = class457.field6215.method1600(var2.field809, (byte) 73);
        return var3.field5659 == -1 ? true : var3.method2371(0);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)Lih;", line = 86)
    public final class656 method733(byte arg0) {
        field1427++;
        if (arg0 != -19) {
            this.method734(-3, 86, false, 11);
        }
        return class253.method1537(-31164, this.field1416);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZI)Ljt;", line = 100)
    public final class93 method734(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field1422++;
            return new class93(this.field1416, arg0, arg3, arg1, this.field1425);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)V", line = 113)
    public static final void method735(byte arg0, int arg1) {
        class345.field4753 = -1;
        field1430++;
        class412.field5653 = 100;
        if (arg0 < 76) {
            method731(61, 65, -72);
        }
        class665.field9428 = 3;
        class96.field1461 = arg1;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(III)Ldk;", line = 129)
    public static final class477 method736(int arg0, int arg1, int arg2) {
        class24 var3 = class703.field9899[arg0][arg1][arg2];
        return var3 == null ? null : var3.field406;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V", line = 139)
    public static void method737(int arg0) {
        field1426 = null;
        if (arg0 > -3) {
            method737(-12);
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIB)V", line = 148)
    public class93(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1409 = arg3;
        this.field1425 = arg4;
        this.field1431 = arg1;
        this.field1416 = arg0;
        this.field1413 = arg2;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Ljt;I)V", line = 159)
    public class93(class93 arg0, int arg1) {
        this.field1412 = arg0;
        this.field1431 = this.field1412.field1431 + arg1;
        this.field1416 = this.field1412.field1416;
        this.field1413 = this.field1412.field1413 + arg1;
        this.field1409 = this.field1412.field1409 + arg1;
        this.field1425 = this.field1412.field1425;
    }
}
