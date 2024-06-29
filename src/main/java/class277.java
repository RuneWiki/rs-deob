import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class277 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILaka;IIII)V", line = 3)
    public static final void method1802(int arg0, class413 arg1, int arg2, int arg3, int arg4, int arg5) {
        field3990++;
        if (arg2 >= 1 && arg3 >= 1 && arg2 <= class741.field10208 - 2 && arg3 <= class525.field7224 - 2) {
            if (class59.field688 == null) {
                return;
            }
            class466 var6 = class617.field8656.method1637(arg4, (byte) 102, arg3, arg2, arg5);
            if (var6 != null) {
                if (var6 instanceof class681) {
                    ((class681) var6).method3869(arg1, 0);
                } else if ((var6 instanceof class236)) {
                    ((class236) var6).method1610(84, arg1);
                } else if ((var6 instanceof class107)) {
                    ((class107) var6).method759(arg1, 1);
                } else if (var6 instanceof class521) {
                    ((class521) var6).method3108(262144, arg1);
                }
            }
        }
        if (arg0 > -112) {
            field3992 = 107;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)J")
    public abstract long method1803(byte arg0);
}
