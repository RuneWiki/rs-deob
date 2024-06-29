import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class256 extends class293 {

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    private int field4110 = -32768;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lck;")
    public static class119 field4107 = class298.method1987((byte) 7, "::cardmem");

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field4108 = 0;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lck;")
    public static class119 field4112 = class298.method1987((byte) 103, "Lade)3)3)3");

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Lck;")
    public static class119 field4115 = class298.method1987((byte) 119, "g");

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "[[I")
    public static int[][] field4113;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(IIIII)V", line = 13)
    public static final void method1641(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class162.field2561 = class258.field4137 * arg0 / arg1;
        class11.field195 = -1;
        class19.field242 = -1;
        class257.field4133 = class126.field1938 * arg4 / arg3;
        field4118++;
        class212.method1337((byte) 113);
        if (arg2 >= -50) {
            method1642(91);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIJ)V", line = 33)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class28 var11 = class205.method1296((byte) -110, this.field4117).method1695(0, (byte) -35, this.field4111, (class56) null);
        field4114++;
        if (var11 != null) {
            var11.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4110 = var11.method214();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()I", line = 62)
    public final int method214() {
        field4116++;
        return this.field4110;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 70)
    public static void method1642(int arg0) {
        field4107 = null;
        field4115 = null;
        field4113 = (int[][]) null;
        if (arg0 == -1) {
            field4112 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I", line = 96)
    public static final int method1643(int arg0, int arg1) {
        field4109++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg0 * arg1 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
