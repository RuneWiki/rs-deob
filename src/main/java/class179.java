import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class179 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public int field2732 = 128;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public int field2735 = 128;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBI)I", line = 4)
    public static final int method1318(int arg0, byte arg1, int arg2) {
        if (arg1 != -15) {
            method1318(80, (byte) 123, -88);
        }
        field2736++;
        int var3 = arg2 - 1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Lei;", line = 19)
    public final class179 method1319(boolean arg0) {
        field2739++;
        if (!arg0) {
            this.method1319(false);
        }
        return new class179(this.field2734, this.field2735, this.field2732, this.field2737, this.field2738, this.field2729);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lei;Z)V", line = 34)
    public final void method1320(class179 arg0, boolean arg1) {
        this.field2729 = arg0.field2729;
        this.field2735 = arg0.field2735;
        if (!arg1) {
            return;
        }
        this.field2737 = arg0.field2737;
        this.field2738 = arg0.field2738;
        field2742++;
        this.field2734 = arg0.field2734;
        this.field2732 = arg0.field2732;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V", line = 65)
    public class179(int arg0) {
        this.field2734 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIII)V", line = 72)
    private class179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2738 = arg4;
        this.field2734 = arg0;
        this.field2737 = arg3;
        this.field2732 = arg2;
        this.field2729 = arg5;
        this.field2735 = arg1;
    }
}
