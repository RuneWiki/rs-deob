import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class629 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Lkca;")
    public static class73 field9075 = new class73(26, -1);

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Z")
    public static boolean field9078 = false;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field9079 = 503;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field9081 = 1;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3604(int arg0) {
        field9077++;
        class108.field1302.method315(((float) class595.field8694.field6551 * 0.1F + 0.7F) * 1.1523438F);
        class108.field1302.method310(class404.field6105, 0.69921875F, 1.2F, (float) arg0, -240.0F, -200.0F);
        class108.field1302.method352(class102.field1226, -1, 0);
        class108.field1302.method392(class266.field3755);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 26)
    public static void method3605(int arg0) {
        int var1 = 66 / ((25 - arg0) / 40);
        field9075 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBIIIII)I", line = 37)
    public static final int method3606(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg3;
            arg3 = var8;
        }
        field9080++;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg4;
        } else {
            if (arg1 > -110) {
                method3606(-21, (byte) -47, 99, -128, -56, -127, 74);
            }
            return var7 == 2 ? 1 + 7 - arg6 - arg0 : 7 - arg4 - (arg3 - 1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "toString", descriptor = "()Ljava/lang/String;", line = 68)
    public final String toString() {
        field9076++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V", line = 89)
    public class629(int arg0, int arg1) {
    }
}
