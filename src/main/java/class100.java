import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class100 extends class147 {

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Lqj;")
    private static class196 field1431 = class80.method502("You can(Wt add yourself to your own friend list)3", -48);

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "S")
    public static short field1441 = 256;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "[[I")
    public static int[][] field1436 = new int[5][5000];

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "Lqj;")
    public static class196 field1443 = field1431;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "Lqj;")
    public class196 field1442;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "[I")
    public int[] field1430;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "[I")
    public int[] field1432;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "[Lqj;")
    public class196[] field1429;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "[Ldf;")
    public class231[] field1437;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public static final void method606(byte arg0) {
        class52.field652 = null;
        class43.field501 = null;
        class77.field1109 = null;
        if (arg0 != -124) {
            field1436 = null;
        }
        class70.field997 = null;
        field1434++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIBI)I")
    public static final int method607(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field1439++;
        if (var4 == 0) {
            return arg3;
        }
        if (arg2 > -59) {
            field1431 = null;
        }
        if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
    public static void method608(byte arg0) {
        int var1 = 98 % ((-arg0 - 48) / 60);
        field1443 = null;
        field1436 = null;
        field1431 = null;
    }
}
