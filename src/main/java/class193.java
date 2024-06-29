import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class193 extends class592 {

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "Lkr;")
    public static class329 field2508;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIF)V")
    public class193(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BF)V")
    public final void method557(byte arg0, float arg1) {
        ++field2507;
        super.field8559 = arg1;
        if (arg0 != 106) {
            field2508 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
    public static void method1238(byte arg0) {
        field2508 = null;
        int var1 = -37 % ((arg0 - 57) / 40);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILvh;)V")
    public static final void method1239(int arg0, int arg1, int arg2, class249 arg3) {
        class563 var4 = class423.method2492(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7891 = arg3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBI)V")
    public final void method551(int arg0, int arg1, byte arg2, int arg3) {
        super.field8556 = arg1;
        super.field8558 = arg3;
        ++field2506;
        if (arg2 != -10) {
            field2508 = null;
        }
        super.field8550 = arg0;
    }
}
