import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class95 {

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Z")
    public static boolean field1560 = false;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "[I")
    public static int[] field1562 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1563 = "slide:";

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lhk;")
    public static class125 field1561 = new class125();

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[I")
    public static int[] field1564 = new int[256];

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lqh;")
    public static class201 field1556;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Lqh;")
    public static class201 field1565;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[[[I")
    public static int[][][] field1559;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lph;BLph;IZ)I")
    public static final int method707(class78 arg0, byte arg1, class78 arg2, int arg3, boolean arg4) {
        field1558++;
        if (arg1 <= 52) {
            method708((byte) 8);
        }
        if (arg3 == 1) {
            int var5 = arg2.field1500;
            int var6 = arg0.field1500;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class55.method411(arg2.method545(-2648).field478, arg0.method545(-2648).field478, class135.field2192, (byte) -108);
        } else if (arg3 == 3) {
            if (arg2.field1250.equals("-")) {
                if (arg0.field1250.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field1250.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class55.method411(arg2.field1250, arg0.field1250, class135.field2192, (byte) -114);
            }
        } else if (arg3 == 4) {
            if (arg2.method681(-60)) {
                return arg0.method681(-42) ? 0 : 1;
            } else if (arg0.method681(-73)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg2.method680(true)) {
                return arg0.method680(true) ? 0 : 1;
            } else if (arg0.method680(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg2.method688(0)) {
                return arg0.method688(0) ? 0 : 1;
            } else if (arg0.method688(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 7) {
            return arg2.field1249 - arg0.field1249;
        } else if (arg2.method686(-15708)) {
            return arg0.method686(-15708) ? 0 : 1;
        } else if (arg0.method686(-15708)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static void method708(byte arg0) {
        field1561 = null;
        field1559 = null;
        field1564 = null;
        field1562 = null;
        field1556 = null;
        if (arg0 != 107) {
            method709(true);
        }
        field1565 = null;
        field1563 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
    public static final void method709(boolean arg0) {
        field1557++;
        class72.field1185.method472((byte) -63);
        if (arg0) {
            field1562 = null;
        }
    }
}
