import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class727 {

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public static int field10175;

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "I")
    public static int field10176;

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "Ldga;")
    public static class204 field10177;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "Lfp;")
    public static class323 field10173;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method4086(int arg0, int arg1) {
        field10175++;
        if (~arg1 == arg0 || arg1 == 17 || arg1 == 47 || arg1 == 10 || arg1 == 57) {
            return true;
        } else {
            return arg1 == 9 || arg1 == 1006;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)V", line = 24)
    public static void method4087(boolean arg0) {
        field10173 = null;
        field10177 = null;
        if (arg0) {
            field10176 = 1;
        }
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(II)Z", line = 35)
    public static final boolean method4088(int arg0, int arg1) {
        field10174++;
        if (arg0 != -1003) {
            field10177 = null;
        }
        return arg1 == 25 || arg1 == 30 || arg1 == 1002 || arg1 == 15 || arg1 == 12;
    }
}
