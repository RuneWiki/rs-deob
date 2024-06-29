import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class283 implements class385 {

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Lwca;")
    private class43 field4158;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "[I")
    public static int[] field4152 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lno;")
    public static class384 field4157;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IBI)V", line = 3)
    public static final void method1801(int arg0, byte arg1, int arg2) {
        field4154++;
        class371 var3 = class490.method2867((byte) -80, 18, (long) arg2 << 32 | (long) arg0);
        int var4 = 21 % ((arg1 - 39) / 57);
        var3.method2215(4);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V", line = 19)
    public final void method19(boolean arg0, int arg1) {
        field4160++;
        if (arg1 <= 44) {
            method1802(true);
        }
        if (arg0) {
            class686.field9702.method436(0, 0, class709.field9923, class448.field6174, this.field4158.field577, 0);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Z", line = 32)
    public final boolean method17(int arg0) {
        if (arg0 >= -93) {
            field4157 = null;
        }
        field4153++;
        return true;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V", line = 52)
    public static void method1802(boolean arg0) {
        if (arg0) {
            field4157 = null;
        }
        field4157 = null;
        field4152 = null;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V", line = 64)
    public final void method20(int arg0) {
        if (arg0 <= -50) {
            field4155++;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZI)Z", line = 74)
    public static final boolean method1803(int arg0, boolean arg1, int arg2) {
        field4159++;
        if (arg1) {
            return true;
        } else {
            return (arg0 & 0x70000) != 0 | class732.method4057(false, arg0, arg2) || class518.method3030(arg0, arg2, -86);
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lwca;)V", line = 84)
    public class283(class43 arg0) {
        this.field4158 = arg0;
    }
}
