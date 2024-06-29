import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class255 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3779 = 0;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method1703(int arg0, int arg1, int arg2, int arg3) {
        field3780++;
        int var4 = arg2 * class688.field9602.field8505.method1981((byte) -98) >> 8;
        if (arg0 == -1 && !class15.field90) {
            class480.method2854(arg1 + 3887);
        } else if (arg0 != -1 && (class4.field22 != arg0 || !class637.method3659(1)) && var4 != 0 && !class15.field90) {
            class94.method679(class456.field6372, arg3, var4, arg0, 0, false, (byte) 124);
            class644.method3690(124);
        }
        if (class4.field22 != arg0) {
            class278.field3998 = null;
        }
        class4.field22 = arg0;
        if (arg1 != -3798) {
            field3779 = -35;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method1704(int arg0, int arg1, int arg2) {
        int var3 = -120 % ((arg0 - 62) / 54);
        field3778++;
        return (class53.method454(arg1, arg2, 33) | class402.method2468(-19439, arg2, arg1) | class390.method2415(arg2, -1, arg1)) & class577.method3383(true, arg1, arg2);
    }
}
