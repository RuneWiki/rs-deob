import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class286 {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lwo;")
    public static class690 field3873 = new class690(45, 0);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "F")
    public static float field3870;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3869++;
        class233 var5 = class7.method44(arg3, arg2, -1);
        var5.method1422(0);
        var5.field3116 = arg0;
        var5.field3118 = arg4;
        var5.field3114 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILr;)V", line = 17)
    public static final void method1707(int arg0, class165 arg1) {
        if (class361.field4805) {
            class611.method3501(0, arg1);
        } else {
            class331.method1918(arg1, (byte) 10);
        }
        int var2 = -87 / ((2 - arg0) / 60);
        field3871++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 34)
    public static void method1708(int arg0) {
        field3873 = null;
        if (arg0 != 2) {
            method1709(-125, 93, -6);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I", line = 49)
    public static final int method1709(int arg0, int arg1, int arg2) {
        field3872++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 > var3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
