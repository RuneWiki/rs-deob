import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field1651 = 0;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "[I")
    public static int[] field1653 = new int[500];

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lid;")
    public static class60 field1654 = class11.method72(" <col=ffffff>", (byte) 93);

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
    public static int[] field1652 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lcb;")
    public static class17 field1646 = new class17();

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lvf;")
    public static class152 field1660;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lh;")
    public static class49 field1656;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lie;")
    public static class61 field1648;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lie;")
    public static class61 field1650;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static final void method516(boolean arg0) {
        field1658++;
        if (arg0) {
            field1652 = null;
        }
        class116.field2733.method920((byte) 14);
        class87.field2175.method920((byte) 14);
        class87.field2172.method920((byte) 14);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
    public static final int method517(int arg0, int arg1, int arg2) {
        int var3 = -37 / ((-arg0 - 35) / 60);
        field1647++;
        int var4 = class24.method185(arg1 + 91923, -1, arg2 + 45365, 4) + (class24.method185(arg1 + 37821, -1, arg2 + 10294, 2) - 128 >> 1) + (class24.method185(arg1, -1, arg2, 1) - 128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method518(byte arg0) {
        field1654 = null;
        field1652 = null;
        int var1 = -115 / ((arg0 - 75) / 47);
        field1648 = null;
        field1656 = null;
        field1646 = null;
        field1653 = null;
        field1660 = null;
        field1650 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I[B)Lh;")
    public static final class49 method519(int arg0, byte[] arg1) {
        field1655++;
        if (arg1 == null) {
            return null;
        }
        class49 var2 = new class49(arg1, class90.field2236, class100.field2442, class104.field2551, class136.field3098, class35.field879, class89.field2205);
        class7.method47(arg0 ^ 0x31AD);
        if (arg0 != 10) {
            field1653 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method520(byte[] arg0, boolean arg1) {
        field1645++;
        class103 var2 = new class103(arg0);
        if (!arg1) {
            field1654 = null;
        }
        int var3 = var2.method829((byte) -103);
        int var4 = var2.method803(false);
        if (var4 < 0 || class93.field2302 != 0 && class93.field2302 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method825(var4, var7, 0, 271632);
            return var7;
        } else {
            int var5 = var2.method803(!arg1);
            if (var5 < 0 || class93.field2302 != 0 && class93.field2302 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class150.method1145(var6, var5, arg0, var4, 9);
            } else {
                class82.field2061.method1093((byte) -117, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method521(int arg0) {
        if (arg0 != -1) {
            method520(null, false);
        }
        field1657++;
        for (class100 var1 = (class100) class109.field2647.method496(10153); var1 != null; var1 = (class100) class109.field2647.method500(-1)) {
            if (class46.field1222 != var1.field2420 || var1.field2428) {
                var1.method1009((byte) 75);
            } else if (class82.field2065 >= var1.field2446) {
                var1.method788(class75.field1802, (byte) 92);
                if (var1.field2428) {
                    var1.method1009((byte) 81);
                } else {
                    class43.field1151.method589(var1.field2420, var1.field2438, var1.field2430, var1.field2431, 60, var1, 0, -1, false);
                }
            }
        }
    }
}
