import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[C")
    public static char[] field373 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
    public static int[] field376 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Z")
    public static boolean field378 = false;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    public static int[] field380 = new int[1000];

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Ljm;")
    public static class485 field381 = new class485(38, 8);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
    public static int[] field377;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field375++;
        if ((arg0 - arg4) >= class382.field5379 && class175.field2497 >= arg0 + arg4 && class343.field4727 <= arg3 - arg4 && class54.field753 >= (arg3 + arg4)) {
            class499.method2945(arg3, arg4, arg6, (byte) -103, arg0, arg2, arg1);
        } else {
            class310.method1756(arg2, 0, arg1, arg0, arg3, arg4, arg6);
        }
        int var7 = 123 % ((15 - arg5) / 61);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method175(int arg0) {
        field373 = null;
        field377 = null;
        field376 = null;
        if (arg0 != 93) {
            field373 = null;
        }
        field381 = null;
        field380 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public static final void method176(int arg0, int arg1, int arg2) {
        field374++;
        class163 var3 = class271.method1546(arg1, arg2, true);
        var3.method1017(arg2 - 12);
        var3.field2328 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method177(boolean arg0) {
        field382++;
        class266.method1532(-98);
        class253.field3525 = null;
        class329.field4490 = null;
        if (arg0) {
            method177(false);
        }
        class84.field1168 = null;
        class95.field1309 = null;
        class88.field1209 = null;
    }
}
