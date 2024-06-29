import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class107 extends class262 {

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    private int field1727 = 2048;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
    private int field1741 = 1024;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    private int field1737 = 3072;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "Lok;")
    private static class146 field1729 = class235.method1724(-12908, "scroll:");

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "Lok;")
    public static class146 field1730 = class235.method1724(-12908, "::wm3");

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "Lok;")
    public static class146 field1723 = class235.method1724(-12908, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field1732 = 0;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "Lok;")
    private static class146 field1739 = class235.method1724(-12908, "Created gameworld");

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "Lok;")
    public static class146 field1738 = field1729;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lok;")
    public static class146 field1740 = class235.method1724(-12908, "unzap");

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lok;")
    public static class146 field1735 = field1729;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lok;")
    public static class146 field1725 = class235.method1724(-12908, "null");

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lok;")
    public static class146 field1726 = field1739;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V", line = 4)
    public static void method719(byte arg0) {
        field1738 = null;
        field1735 = null;
        field1729 = null;
        if (arg0 != 61) {
            field1726 = (class146) null;
        }
        field1723 = null;
        field1740 = null;
        field1726 = null;
        field1725 = null;
        field1730 = null;
        field1739 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[I", line = 45)
    public final int[] method38(int arg0, byte arg1) {
        field1731++;
        if (arg1 >= -85) {
            this.method40((class47) null, -37, 18);
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 93);
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 0, arg0);
            for (int var5 = 0; var5 < class98.field1598; var5++) {
                var3[var5] = (var4[var5] * this.field1727 >> 12) + this.field1741;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[[I", line = 84)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != 7) {
            this.method38(-30, (byte) 62);
        }
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (this.field4347.field1202) {
            int[][] var4 = this.method1893(0, arg1, -58);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class98.field1598; var11++) {
                var8[var11] = (var6[var11] * this.field1727 >> 12) + this.field1741;
                var10[var11] = this.field1741 + (var5[var11] * this.field1727 >> 12);
                var9[var11] = (var7[var11] * this.field1727 >> 12) + this.field1741;
            }
        }
        field1728++;
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V", line = 133)
    public final void method43(int arg0) {
        if (arg0 != -2) {
            this.field1727 = -43;
        }
        this.field1727 = this.field1737 - this.field1741;
        field1724++;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 232)
    public class107() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)I", line = 159)
    public static final int method720(int arg0, int arg1) {
        field1733++;
        int var2 = -47 % ((arg1 + 42) / 58);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwe;II)V", line = 169)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            return;
        }
        field1734++;
        if (arg2 == 0) {
            this.field1741 = arg0.method379(-2);
        } else if (arg2 == 1) {
            this.field1737 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field4365 = arg0.method368(83) == 1;
        }
    }
}
