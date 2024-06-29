import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class83 extends class272 {

    @OriginalMember(owner = "client!wl", name = "db", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!wl", name = "bb", descriptor = "[Lal;")
    public static class311[] field1436 = new class311[4];

    @OriginalMember(owner = "client!wl", name = "ib", descriptor = "I")
    public static int field1443 = 2;

    @OriginalMember(owner = "client!wl", name = "jb", descriptor = "Lqd;")
    public static class40 field1444 = class147.method1106(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) -72);

    @OriginalMember(owner = "client!wl", name = "hb", descriptor = "[I")
    public static int[] field1442 = new int[5];

    @OriginalMember(owner = "client!wl", name = "nb", descriptor = "Lqd;")
    public static class40 field1448 = class147.method1106("hint_mapedge", (byte) -67);

    @OriginalMember(owner = "client!wl", name = "cb", descriptor = "Lpl;")
    public static class186 field1437 = new class186(50);

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!wl", name = "eb", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!wl", name = "fb", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!wl", name = "kb", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!wl", name = "lb", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!wl", name = "ob", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!wl", name = "pb", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!wl", name = "gb", descriptor = "Lfk;")
    public class41 field1441;

    @OriginalMember(owner = "client!wl", name = "mb", descriptor = "[B")
    public byte[] field1447;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B)Lw;", line = 22)
    public static final class262 method634(int arg0, byte[] arg1) {
        field1449++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -91) {
            method634(-40, (byte[]) null);
        }
        class262 var2 = new class262(arg1, class12.field208, class256.field4265, class102.field1802, class210.field3356, class22.field387);
        class181.method1324(-67);
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V", line = 53)
    public static void method635(int arg0) {
        field1442 = null;
        field1437 = null;
        field1444 = null;
        field1436 = null;
        field1448 = null;
        if (arg0 != 0) {
            field1443 = -94;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)I", line = 67)
    public static final int method636(int arg0, int arg1) {
        field1439++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg1 == 17576) {
            return arg0 == 140 ? 156 : arg0;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)[B", line = 107)
    public final byte[] method289(byte arg0) {
        field1435++;
        if (arg0 != -56) {
            field1448 = (class40) null;
        }
        if (this.field4515) {
            throw new RuntimeException();
        }
        return this.field1447;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)I", line = 134)
    public final int method290(byte arg0) {
        if (arg0 >= -126) {
            return -77;
        } else {
            field1450++;
            return this.field4515 ? 0 : 100;
        }
    }
}
