import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class180 extends class411 {

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "Lfha;")
    public static class382 field2212 = new class382(1, 7);

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "Lufa;")
    private class680 field2213;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "[[[J")
    public static long[][][] field2218;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method1026(int arg0, byte arg1, String arg2) {
        ++class211.field2538;
        ++field2214;
        class103 var3 = class752.method4186(260, class244.field3167, class449.field6285);
        var3.field1379.method3393(1 + class601.method3326(arg2, (byte) 97), -38);
        if (arg1 < 65) {
            field2218 = null;
        }
        var3.field1379.method3387(arg2, (byte) 113);
        var3.field1379.method3430(arg0, (byte) -108);
        class27.method104(false, var3);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIBZ)V")
    public final void method907(int arg0, int arg1, byte arg2, boolean arg3) {
        class21.field142.method391(arg1 + -2, arg0, super.field5796.field2415 + 4, super.field5796.field2402 - -2, ((class352) super.field5796).field4709, 0);
        if (arg2 == -36) {
            ++field2215;
            class21.field142.method391(arg1 + -1, arg0 - -1, super.field5796.field2415 + 2, super.field5796.field2402, 0, 0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
    public final boolean method183(int arg0) {
        ++field2216;
        return !super.method183(arg0) ? false : super.field5787.method2882(-87, ((class352) super.field5796).field4704);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public static final void method1027(boolean arg0) {
        if (!arg0) {
            field2212 = null;
        }
        class104.method712(false, -125);
        ++field2209;
        if (~class579.field8127 <= -1 && ~class579.field8127 != -1) {
            class479.method2689(class579.field8127, false, -117);
            class579.field8127 = -1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lni;Lni;Ltu;)V")
    public class180(class522 arg0, class522 arg1, class352 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method184(byte arg0) {
        super.method184(arg0);
        ++field2210;
        this.field2213 = class79.method594(((class352) super.field5796).field4704, super.field5787, (byte) -89);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIZ)V")
    public final void method910(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2217;
        int var5 = this.method2366(arg0 + 98) * super.field5796.field2415 / 10000;
        int[] var6 = new int[4];
        class21.field142.method398(var6);
        class21.field142.method426(arg2, arg0 + arg1, arg2 + var5, arg1 - -super.field5796.field2402);
        this.field2213.method3860(arg2, arg1 + 2, super.field5796.field2415, super.field5796.field2402);
        class21.field142.method426(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1028(int arg0, int arg1, byte arg2) {
        ++field2211;
        if (arg2 <= 53) {
            field2218 = null;
        }
        return ~(544 & arg1) == -545 | ~(24 & arg1) != -1;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
    public static void method1029(boolean arg0) {
        if (arg0) {
            field2218 = null;
        }
        field2218 = null;
        field2212 = null;
    }
}
