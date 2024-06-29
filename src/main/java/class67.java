import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class67 extends class97 {

    @OriginalMember(owner = "client!la", name = "ob", descriptor = "[Lpb;")
    public static class92[] field1678 = new class92[4];

    @OriginalMember(owner = "client!la", name = "qb", descriptor = "[I")
    public static int[] field1680 = new int[50];

    @OriginalMember(owner = "client!la", name = "tb", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!la", name = "xb", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!la", name = "Cb", descriptor = "Lhb;")
    public static class44 field1692 = class102.method810("Sprites geladen)3", -28606);

    @OriginalMember(owner = "client!la", name = "Eb", descriptor = "Lhb;")
    public static class44 field1694 = class102.method810("sch-Utteln:", -28606);

    @OriginalMember(owner = "client!la", name = "wb", descriptor = "Lwd;")
    public static class131 field1686 = new class131(8);

    @OriginalMember(owner = "client!la", name = "pb", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!la", name = "sb", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!la", name = "ub", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!la", name = "vb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!la", name = "yb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!la", name = "zb", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!la", name = "Ab", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!la", name = "Bb", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!la", name = "Db", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!la", name = "rb", descriptor = "[[[B")
    public static byte[][][] field1681;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILtd;B)[Lhc;", line = 12)
    public static final class45[] method587(int arg0, int arg1, class116 arg2, byte arg3) {
        int var4 = 124 % ((arg3 - 24) / 40);
        field1685++;
        return class74.method629(-12890, arg1, arg2, arg0) ? class21.method159(25033) : null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIBI)I", line = 43)
    public static final int method588(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1679++;
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 1 + 7 - arg1 - arg2;
        } else if (arg5 == -59) {
            return var8 == 2 ? 7 + 1 - arg4 - arg6 : arg2;
        } else {
            return 102;
        }
    }

    @OriginalMember(owner = "client!la", name = "j", descriptor = "(I)V", line = 90)
    public static void method589(int arg0) {
        field1686 = null;
        field1692 = null;
        field1681 = null;
        if (arg0 < -35) {
            field1694 = null;
            field1680 = null;
            field1678 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)Lde;", line = 105)
    public final class24 method209(byte arg0) {
        field1690++;
        int var2 = -103 % ((arg0 - 35) / 59);
        return class42.method358(0, this.field1682).method660(true, this.field1693, -94);
    }

    @OriginalMember(owner = "client!la", name = "k", descriptor = "(I)V", line = 115)
    public static final void method590(int arg0) {
        if (arg0 != 0) {
            method587(-49, 50, null, (byte) 9);
        }
        field1688++;
        class111.method849((byte) 107, false, 0, null);
    }
}
