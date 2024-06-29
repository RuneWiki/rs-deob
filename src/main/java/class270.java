import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class270 {

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
    public static boolean field4159 = false;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILmd;Lum;IILjj;II)V", line = 17)
    public static final void method1785(int arg0, class17 arg1, class82 arg2, int arg3, int arg4, class80 arg5, int arg6, int arg7) {
        field4157++;
        class229 var8 = new class229();
        var8.field3675 = arg0 * 128;
        var8.field3672 = arg3 * 128;
        var8.field3671 = arg4;
        int var9 = 112 / ((17 - arg7) / 50);
        if (arg1 != null) {
            var8.field3681 = arg1.field191;
            var8.field3686 = arg1.field208;
            var8.field3680 = arg1.field183 * 128;
            var8.field3679 = arg1.field236;
            var8.field3683 = arg1.field241;
            var8.field3677 = arg1.field239;
            var8.field3687 = arg1;
            int var11 = arg1.field187;
            int var12 = arg1.field212;
            if (arg6 == 1 || arg6 == 3) {
                var12 = arg1.field187;
                var11 = arg1.field212;
            }
            var8.field3685 = (arg0 + var12) * 128;
            var8.field3693 = (arg3 + var11) * 128;
            if (arg1.field195 != null) {
                var8.field3676 = true;
                var8.method1574(false);
            }
            if (var8.field3686 != null) {
                var8.field3697 = var8.field3677 + (int) (Math.random() * (double) (var8.field3683 - var8.field3677));
            }
            class240.field3812.method7((byte) -51, var8);
        } else if (arg5 != null) {
            var8.field3674 = arg5;
            class298 var10 = arg5.field1178;
            if (var10.field4588 != null) {
                var8.field3676 = true;
                var10 = var10.method1956(112);
            }
            if (var10 != null) {
                var8.field3693 = (var10.field4609 + arg3) * 128;
                var8.field3685 = (var10.field4609 + arg0) * 128;
                var8.field3681 = class61.method409(0, arg5);
                var8.field3680 = var10.field4560 * 128;
                var8.field3679 = var10.field4613;
            }
            class203.field3066.method7((byte) -51, var8);
        } else if (arg2 != null) {
            var8.field3698 = arg2;
            var8.field3685 = (arg0 + arg2.method271((byte) 45)) * 128;
            var8.field3693 = (arg2.method271((byte) 87) + arg3) * 128;
            var8.field3681 = class247.method1667(arg2, false);
            var8.field3679 = arg2.field1220;
            var8.field3680 = arg2.field1248 * 128;
            class175.field2681.method1550(var8, class108.method723(arg2.field1218, -108), (byte) 112);
        }
    }
}
