import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class221 extends class294 {

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "Lwm;")
    public static class298 field2967;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZZII)Lam;")
    public static final class286 method1195(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field2964++;
        if (arg0 != -4097) {
            field2966 = 62;
        }
        class334 var5 = null;
        if (class301.field4107 != null) {
            var5 = new class334(arg4, class301.field4107, class368.field5147[arg4], 1000000);
        }
        class382.field5435[arg4] = class347.field4846.method388(var5, class337.field4498, arg4, -78);
        if (arg1) {
            class382.field5435[arg4].method174((byte) -118);
        }
        return new class286(class382.field5435[arg4], arg2, arg3);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lii;I)V")
    public static final void method1196(class405 arg0, int arg1) {
        field2965++;
        int var2 = 73 / ((70 - arg1) / 39);
        if (!class452.field6586) {
            arg0.method1967(-1);
            class244.field3323--;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public static void method1197(boolean arg0) {
        field2967 = null;
        if (arg0) {
            field2967 = null;
        }
    }
}
