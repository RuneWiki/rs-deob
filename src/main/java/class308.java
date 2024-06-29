import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class308 {

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Ltl;")
    public static class222 field4813 = new class222(50);

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "[S")
    public static short[] field4820 = new short[256];

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
    public static int[] field4819 = new int[2];

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "Lkb;")
    public static class39 field4821;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[[[I")
    public static int[][][] field4814;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 13)
    public static void method2158(int arg0) {
        field4820 = null;
        field4814 = (int[][][]) null;
        field4819 = null;
        if (arg0 != 256) {
            field4819 = (int[]) null;
        }
        field4821 = null;
        field4813 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILkb;)Lug;", line = 31)
    public static final class321 method2159(int arg0, int arg1, int arg2, class39 arg3) {
        if (arg1 != 256) {
            field4820 = (short[]) null;
        }
        field4816++;
        return class288.method2026(arg0, arg2, arg3, -44) ? class312.method2171(5701) : null;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 46)
    public static final void method2160(int arg0) {
        field4818++;
        if (arg0 == 256) {
            class185.field2976.method1623(arg0 - 255);
            class95.field1454.method1623(1);
        }
    }
}
