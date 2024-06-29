import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class151 {

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "Z")
    public static boolean field116 = false;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Lmb;")
    private static class132 field111 = class166.method1092("level)2", 118);

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "Lmb;")
    public static class132 field120 = field111;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "Lj;")
    public static class98 field117;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "[I")
    public int[] field104;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "[I")
    public int[] field105;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[I")
    public int[] field108;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "[Lla;")
    public class120[] field114;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "[Lla;")
    public class120[] field115;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "[[B")
    public static byte[][] field109;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "[[[B")
    public byte[][][] field112;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
    public static void method48(byte arg0) {
        field111 = null;
        field120 = null;
        field117 = null;
        int var1 = 52 / ((-arg0 - 36) / 52);
        field109 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public static final int method49(int arg0, int arg1) {
        if (arg0 != 1807626503) {
            method49(3, 96);
        }
        field107++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
    public static final void method50(byte arg0) {
        if (arg0 != -24) {
            method48((byte) 9);
        }
        field106++;
        if (class194.field3609 != null) {
            class194.field3609.method951(29943);
        }
        if (class105.field1970 != null) {
            class105.field1970.method951(29943);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILpb;B)Lvi;")
    public static final class233 method51(int arg0, int arg1, class165 arg2, byte arg3) {
        if (arg3 != -114) {
            method51(-82, 22, null, (byte) -81);
        }
        field119++;
        return class172.method1122(arg1, arg2, arg0, true) ? class91.method567(0) : null;
    }
}
