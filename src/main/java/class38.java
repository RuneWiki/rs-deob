import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class38 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field569 = 50;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field568 = 0;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
    public static final void method251(byte arg0, int arg1) {
        field572++;
        if (!class52.method328(19031, arg1)) {
            return;
        }
        class211[] var2 = class158.field2208[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class211 var4 = var2[var3];
            if (var4 != null) {
                var4.field3051 = 0;
                var4.field3074 = 0;
                var4.field3021 = 1;
            }
        }
        if (arg0 < 45) {
            method252(58, false, 105, -102, 89, -122, 127, 8);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method252(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field571++;
        if (arg0 >= class93.field1294 && arg6 <= class296.field4668 && arg4 >= class273.field4228 && class127.field1782 >= arg7) {
            class12.method74(arg2, arg3, arg4, arg5, arg6, arg7, false, arg0);
        } else {
            class156.method1035(arg7, arg4, arg5, -82, arg6, arg0, arg2, arg3);
        }
        if (!arg1) {
            field569 = -33;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public static final int method253(int arg0, int arg1) {
        if (class290.field4567 != null) {
            class290.field4567.method1958(arg1 ^ 0x1388);
            class290.field4567 = null;
        }
        field570++;
        class224.field3407++;
        if (class224.field3407 > 4) {
            class224.field3407 = 0;
            class251.field3844 = 0;
            return arg0;
        }
        if (class251.field3835 == class140.field1951) {
            class251.field3835 = class43.field646;
        } else {
            class251.field3835 = class140.field1951;
        }
        class251.field3844 = arg1;
        return -1;
    }
}
