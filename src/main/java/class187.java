import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class187 extends class41 {

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field2383 = 1;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "Lpe;")
    public static class615 field2382;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)Lfl;", line = 3)
    public final class103 method318(int arg0) {
        field2380++;
        if (arg0 != -26207) {
            this.method318(31);
        }
        return class501.field6615;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lffa;Loca;IIIIIIIII)V", line = 14)
    public class187(class562 arg0, class573 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2384 = arg9;
        this.field2381 = arg10;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)Z", line = 25)
    public static final boolean method1240(int arg0, int arg1, int arg2) {
        field2385++;
        if (arg2 != -24641) {
            method1240(81, 41, 0);
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V", line = 36)
    public static void method1241(int arg0) {
        if (arg0 == 0) {
            field2382 = null;
        }
    }
}
