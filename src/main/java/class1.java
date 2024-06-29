import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class1 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static volatile int field3 = -1;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "[I")
    public static int[] field4 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZIZI)V")
    public static final void method1(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (class128.field2035 == 0) {
            class375.method2396(9712, false);
        } else {
            class12.field178 = class128.field2035;
            class221.method1586(-1009, 0);
        }
        field1++;
        class270.field4340 = arg3;
        class72.field886 = arg4;
        if (arg1) {
            class415.field6144 = arg2;
            class400.method2504(arg0);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static final void method2(int arg0) {
        field5++;
        int var1 = 0;
        for (int var2 = 0; var2 < class80.field1003; var2++) {
            for (int var3 = 0; var3 < class380.field5751; var3++) {
                if (class198.method1385(false, true, class423.field6252, var2, var3, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 2) {
            method2(45);
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public static void method3(int arg0) {
        field4 = null;
        if (arg0 != 25458) {
            method5(45, 60);
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
    public static final void method4(int arg0) {
        class224.field3736.method336(119);
        field2++;
        int var1 = 81 / ((-arg0 - 70) / 56);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
    public static final void method5(int arg0, int arg1) {
        field6++;
        class211 var2 = class281.method1921(arg0, arg1, (byte) -96);
        var2.method1489((byte) -100);
    }
}
