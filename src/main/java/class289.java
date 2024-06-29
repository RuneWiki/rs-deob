import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class289 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Ltm;")
    public static class412 field4242 = new class412();

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1834(int arg0) {
        field4242 = null;
        if (arg0 != 43) {
            field4242 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
    public static final void method1835(int arg0, byte arg1) {
        if (arg1 == -117) {
            field4241++;
            class617.field8329.method1546(arg0, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZIII)V")
    public static final void method1836(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            method1837(-93, -43, 127, null);
        }
        field4243++;
        if (arg0 < arg4) {
            for (int var5 = arg0; var5 < arg4; var5++) {
                class785.field10808[var5][arg3] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg0; var6++) {
                class785.field10808[var6][arg3] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILor;)V")
    public static final void method1837(int arg0, int arg1, int arg2, class668 arg3) {
        field4240++;
        class717.field10009 = arg0;
        class781.field10726 = arg3;
        class733.field10173 = arg1;
        if (arg2 != 55) {
            field4242 = null;
        }
    }
}
