import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class118 extends class104 {

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Lpd;")
    public class3 field1666;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field1665 = -1;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[I")
    public static int[] field1663 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lqb;")
    public static class109 field1664;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[[B")
    public static byte[][] field1667;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 8)
    public static void method800(byte arg0) {
        field1667 = (byte[][]) null;
        field1663 = null;
        int var1 = 65 % ((arg0 + 57) / 32);
        field1664 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I", line = 19)
    public static final int method801(int arg0, int arg1) {
        field1670++;
        if (arg0 != -1892) {
            field1663 = (int[]) null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V", line = 32)
    public static final void method802(int arg0, int arg1, int arg2, int arg3) {
        class225 var4 = class158.field2184[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class54 var5 = var4.field3213;
        if (var5 != null) {
            var5.field659 = var5.field659 * arg3 / 16;
            var5.field657 = var5.field657 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lpd;)V", line = 45)
    public class118(class3 arg0) {
        this.field1666 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IB)Lrb;", line = 64)
    public static final class235 method803(int arg0, byte arg1) {
        field1669++;
        class235 var2 = (class235) class292.field4579.method1239((byte) -94, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class116.field1645.method1199(28815, arg0, 33);
        if (arg1 >= -77) {
            method801(-79, -119);
        }
        class235 var4 = new class235();
        if (var3 != null) {
            var4.method1664(arg0, (byte) 107, new class107(var3));
        }
        class292.field4579.method1243(var4, (long) arg0, -29282);
        return var4;
    }
}
