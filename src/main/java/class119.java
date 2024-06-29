import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class119 extends class46 {

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field1815 = 0;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1821 = "Created gameworld";

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1824 = "glow2:";

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "[Lqf;")
    public static class341[] field1825 = new class341[0];

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "[[[I")
    public static int[][][] field1816;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILtb;)Ltb;", line = 20)
    public static final class220 method876(int arg0, class220 arg1) {
        field1822++;
        if (arg0 != 2) {
            method877(2, 101);
        }
        class220 var2 = client.method388(arg1);
        if (var2 == null) {
            var2 = arg1.field3359;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V", line = 41)
    public static final void method877(int arg0, int arg1) {
        field1823++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class89.method645((byte) 116);
        } else if (arg1 == 2) {
            class31.method261(false);
        } else if (arg1 == 3) {
            class118.method875((byte) 74);
        } else {
            throw new RuntimeException();
        }
        if (arg0 != 1) {
            field1817 = 77;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 72)
    public static void method878(byte arg0) {
        if (arg0 == 25) {
            field1821 = null;
            field1824 = null;
            field1816 = (int[][][]) null;
            field1825 = null;
        }
    }
}
