import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class121 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIII)V")
    public static final void method841(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1974++;
        class314 var5 = class483.method2819(10, arg4, arg2 ^ 0x515);
        var5.method1959(19793);
        var5.field4230 = arg1;
        var5.field4227 = arg0;
        var5.field4223 = arg3;
        if (arg2 == 22050) {
            ;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIII)V")
    public static final void method842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1973++;
        class391.field5532 = arg4;
        class309.field4171 = arg1;
        if (arg3 == 9) {
            class580.field7973 = arg6;
            class532.field7451 = arg5;
            class615.field8840 = arg2;
            class309.field4176 = arg0;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V")
    public static final void method843(boolean arg0) {
        field1972++;
        class431.method2564(class491.field6875.field3364, 22050, -1, 2);
        class297.field4070 = new class592();
        class297.field4070.method3502(128, 9, arg0);
        class209.field2952 = class57.method516(class500.field6968, 0, 22050, (byte) 108, class166.field2390);
        class209.field2952.method2242((byte) -117, class297.field4070);
        class306.method1935(643379271, class549.field7603, class572.field7893, class297.field4070, class603.field8707);
        class170.field2459 = class57.method516(class500.field6968, 1, 2048, (byte) 99, class166.field2390);
        class204.field2869 = new class468();
        class170.field2459.method2242((byte) -123, class204.field2869);
        class217.field3080 = new class474(22050, class223.field3180);
        class626.field9120 = class236.field3305.method252((byte) 53, "scape main");
    }
}
