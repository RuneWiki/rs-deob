import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class788 {

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lfj;")
    public static class684 field10862 = new class684(1, 2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field10859;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field10860;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field10861;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field10863;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
    public static final int[] method4356(int arg0, int arg1) {
        field10860++;
        int[] var2 = new int[3];
        class200.method1297(arg1 ^ 0xFFFF8930, class753.method4207(arg0, arg1 + 9142));
        var2[0] = class532.field7493.get(5);
        var2[1] = class532.field7493.get(arg1);
        var2[2] = class532.field7493.get(1);
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method4357(int arg0) {
        int var1 = -1 % ((59 - arg0) / 42);
        field10862 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z")
    public static final boolean method4358(int arg0, int arg1, int arg2) {
        field10861++;
        int var3 = 59 / ((71 - arg1) / 51);
        return class61.method527(arg0, arg2, 0) | (arg2 & 0x70000) != 0 || class551.method3229(arg2, 45, arg0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)I")
    public static final int method4359(int arg0, byte arg1, int arg2) {
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        field10859++;
        int var4 = -124 / ((arg1 + 62) / 57);
        while (arg0 != 0) {
            int var5 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var5;
        }
        return arg2;
    }
}
