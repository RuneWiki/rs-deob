import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class73 extends class207 {

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1471 = 0;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Ljd;")
    private static class86 field1473 = class122.method868("Loading sprites )2 ", true);

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Ljd;")
    public static class86 field1472 = field1473;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "S")
    public static short field1477 = 320;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1481 = 0;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Luk;")
    public static class96 field1475 = new class96(50);

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Ljd;")
    public static class86 field1483 = class122.method868("blinken1:", true);

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I")
    public static final int method536(int arg0, int arg1, int arg2) {
        int var3 = class136.method973(arg0 + 91923, arg2 + 45365, 4, 6059) - (-(class136.method973(arg0 - -37821, arg2 + 10294, 2, 6059) + -128 >> 1) + -(class136.method973(arg0, arg2, 1, 6059) + -128 >> 2)) - 128;
        if (arg1 <= 49) {
            field1472 = null;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field1474++;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method537(byte arg0) {
        if (arg0 >= -41) {
            method538(116L, -113);
        }
        field1483 = null;
        field1472 = null;
        field1475 = null;
        field1473 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)V")
    public static final void method538(long arg0, int arg1) {
        try {
            if (arg1 <= 22) {
                field1481 = -116;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field1480++;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II)V")
    public class73(int arg0, int arg1) {
        this.field1476 = arg0;
        this.field1482 = arg1;
    }
}
