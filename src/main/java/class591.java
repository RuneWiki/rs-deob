import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class591 {

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Llga;")
    public static class712 field8247 = new class712(15, 8);

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Z")
    public static boolean field8250 = false;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "F")
    public static float field8249;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Lni;")
    public static class522 field8248;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "Lni;")
    public static class522 field8251;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public static void method3284(byte arg0) {
        int var1 = 60 % ((25 - arg0) / 58);
        field8251 = null;
        field8248 = null;
        field8247 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I")
    public static final int method3285(int arg0, int arg1) {
        field8246++;
        return arg1 > -101 ? -25 : arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3286(int arg0, byte arg1, int arg2) {
        if (arg1 != 46) {
            method3285(36, 120);
        }
        field8245++;
        return (arg2 & 0xC580) != 0;
    }
}
