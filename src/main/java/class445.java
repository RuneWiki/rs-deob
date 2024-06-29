import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class445 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6585 = 0;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[[I")
    public static int[][] field6584 = new int[128][128];

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lsl;")
    public static class318 field6582 = new class318(74, 0);

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field6587 = 0;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "S")
    public static short field6588 = 256;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method2709(int arg0) {
        if (arg0 != 128) {
            field6584 = null;
        }
        field6581++;
        return class291.field4175 > 0;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 20)
    public static void method2710(int arg0) {
        field6582 = null;
        field6584 = null;
        if (arg0 != 0) {
            method2709(49);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)V", line = 41)
    public static final void method2711(int arg0, int arg1, byte arg2) {
        field6583++;
        if (arg2 >= -29) {
            method2710(74);
        }
        class215 var3 = class171.method1208(arg0, (byte) 123, 6);
        var3.method1465(-25852);
        var3.field3082 = arg1;
    }
}
