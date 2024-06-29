import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class205 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "[I")
    public static int[] field2809 = new int[1000];

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Lvf;")
    public static class166 field2808 = new class166();

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1120(int arg0) {
        field2811++;
        if (arg0 >= -110) {
            field2809 = null;
        }
        class282.field4114.method1165((byte) 118);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "()V", line = 17)
    public static final void method1121() {
        for (int var0 = 0; var0 < class63.field782; var0++) {
            class83 var1 = class413.field5880[var0];
            class483.method2855(var1);
            class413.field5880[var0] = null;
        }
        class63.field782 = 0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)V", line = 32)
    public static final void method1122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class240.field3303[var5][arg2] = arg4;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class240.field3303[var6][arg2] = arg4;
            }
        }
        field2810++;
        if (arg0 != 27412) {
            field2809 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 80)
    public static void method1123(int arg0) {
        field2808 = null;
        field2809 = null;
        int var1 = -104 / ((arg0 - 25) / 52);
    }
}
