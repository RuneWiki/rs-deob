import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public abstract class class542 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "[I")
    public static int[] field8026;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Z")
    public static final boolean method3184(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field8028 = 100;
        }
        field8027++;
        return class505.method2876(arg0, arg1 + 5, arg2) | (arg0 & 0x60000) != 0 || class673.method3781(-2231, arg0, arg2);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLnv;)Lnv;")
    public abstract class652 method2902(boolean arg0, class652 arg1);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
    public static void method3185(byte arg0) {
        int var1 = 40 / ((arg0 + 12) / 49);
        field8026 = null;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V")
    public static final void method3186(int arg0, int arg1, int arg2) {
        field8030++;
        class489 var3 = class704.method3942(0, 15, arg1 ^ arg1);
        var3.method2797(-1);
        var3.field6942 = arg2;
        var3.field6952 = arg0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static final void method3187(int arg0) {
        field8029++;
        class373.field5520 = 0;
        class152.field2150.method1905(0);
        class152.field2150.method1909(class342.field5059, (byte) -81);
        class373.field5520++;
        if (arg0 >= -17) {
            method3186(7, 73, 103);
        }
    }
}
