import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class37 extends class34 {

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    private final int field735;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    private final int field733;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    private final int field738;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    private final int field731;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lvc;")
    public static class212 field736 = new class212(64);

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[I")
    public static int[] field739 = new int[100];

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[[I")
    public static int[][] field743 = new int[104][104];

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Lob;")
    public static class141 field744 = class175.method1195(40, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Lob;")
    public static class141 field740 = class175.method1195(40, "::fpson");

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lvc;")
    public static class212 field737 = new class212(50);

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lgg;")
    public static class67 field745;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)V")
    public final void method27(byte arg0, int arg1, int arg2) {
        ++field732;
        if (arg0 != 94) {
            this.method27((byte) 68, 2, -7);
        }
        int var4 = this.field731 * arg2 >> 12;
        int var5 = this.field738 * arg2 >> 12;
        int var6 = this.field735 * arg1 >> 12;
        int var7 = this.field733 * arg1 >> 12;
        class210.method1372(super.field689, var6, var7, (byte) 112, var5, var4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZ)V")
    public final void method22(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field741;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
    public final void method24(int arg0, byte arg1, int arg2) {
        if (arg1 != 114) {
            field736 = null;
        }
        ++field734;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public static void method250(byte arg0) {
        if (arg0 != -51) {
            method250((byte) 116);
        }
        field745 = null;
        field740 = null;
        field736 = null;
        field739 = null;
        field743 = null;
        field744 = null;
        field737 = null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIII)V")
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field735 = arg1;
        this.field733 = arg3;
        this.field738 = arg2;
        this.field731 = arg0;
    }
}
