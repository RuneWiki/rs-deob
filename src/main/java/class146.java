import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class146 extends class86 {

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2259 = 0;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "[I")
    public static int[] field2261 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "Luf;")
    public static class176 field2273;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public static void method1000(int arg0) {
        if (arg0 != 0) {
            method1000(-92);
        }
        field2273 = null;
        field2261 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Luf;B)V")
    public static final void method1001(class176 arg0, byte arg1) {
        class65.field1038 = arg0;
        field2272++;
        if (arg1 != 38) {
            field2273 = null;
        }
    }
}
