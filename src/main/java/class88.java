import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class88 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lhh;")
    public static class163 field1632 = class137.method1065("Fps:", 17);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Z")
    public static boolean field1633 = true;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Z")
    public static boolean field1635;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method687(byte arg0) {
        field1632 = null;
        if (arg0 != -33) {
            field1632 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIILqh;II)V")
    public static final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, class69 arg5, int arg6, int arg7) {
        if (class187.field3421) {
            class113.field2128 = 32;
        } else {
            class113.field2128 = 0;
        }
        field1634++;
        class187.field3421 = false;
        if (arg7 >= -16) {
            field1635 = true;
        }
        if (class219.field3981 != 0) {
            if (arg3 <= arg6 && arg3 + 16 > arg6 && arg0 >= arg2 && arg0 < (arg2 + 16)) {
                arg5.field1196 -= 4;
                class213.method1517((byte) 11, arg5);
            } else if (arg3 <= arg6 && (arg3 + 16) > arg6 && (arg2 + arg4 - 16) <= arg0 && arg0 < arg2 + arg4) {
                arg5.field1196 += 4;
                class213.method1517((byte) 11, arg5);
            } else if (arg6 >= arg3 - class113.field2128 && arg6 < class113.field2128 + arg3 + 16 && arg0 >= arg2 + 16 && arg2 + arg4 - 16 > arg0) {
                int var8 = (arg4 - 32) * arg4 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - arg2 - var8 / 2 - 16;
                int var10 = arg4 - var8 - 32;
                arg5.field1196 = (arg1 - arg4) * var9 / var10;
                class213.method1517((byte) 11, arg5);
                class187.field3421 = true;
            }
        }
        if (class264.field4591 == 0) {
            return;
        }
        int var11 = arg5.field1183;
        if (arg6 >= arg3 - var11 && arg0 >= arg2 && arg6 < (arg3 + 16) && arg0 <= arg2 + arg4) {
            arg5.field1196 += class264.field4591 * 45;
            class213.method1517((byte) 11, arg5);
            return;
        }
    }
}
