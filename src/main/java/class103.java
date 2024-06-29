import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class103 {

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lqj;")
    private static class196 field1486 = class80.method502("Started 3d library", -48);

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Lqj;")
    public static class196 field1494 = field1486;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1492 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lqj;")
    public static class196 field1484 = null;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1483 = 0;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
    public static int[] field1498 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Lqj;")
    private static class196 field1497 = class80.method502("Continue", -48);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lqj;")
    public static class196 field1482 = field1497;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lfb;")
    public static class79 field1490;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Z")
    public static boolean field1495;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "[Lub;")
    public static class43[] field1487;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[[[Lid;")
    public static class61[][][] field1489;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([[II)V")
    public static final void method631(int[][] arg0, int arg1) {
        field1491++;
        if (arg1 != -1) {
            field1494 = null;
        }
        class95.field1380 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Z")
    public static final boolean method632(int arg0, int arg1) {
        field1488++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class142.field2169[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1001) {
            return true;
        } else {
            if (arg1 > -83) {
                field1489 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Z")
    public static final boolean method633(byte arg0, int arg1) {
        field1493++;
        if (arg0 <= 4) {
            return false;
        } else {
            return (arg1 >> 21 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method634(int arg0) {
        field1482 = null;
        field1487 = null;
        field1490 = null;
        field1484 = null;
        if (arg0 > -77) {
            field1489 = null;
        }
        field1494 = null;
        field1497 = null;
        field1498 = null;
        field1489 = null;
        field1486 = null;
    }
}
