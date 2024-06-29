import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class26 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field390 = 0;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "J")
    public static long field393 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method240(int arg0, int arg1, int arg2) {
        if (arg0 != 10420) {
            return true;
        }
        field392++;
        if (class745.method4155(arg1, arg2, 0)) {
            return (arg2 & 0x9000) != 0 | class133.method982((byte) 123, arg2, arg1) | class316.method2025(256, arg1, arg2) ? true : (class462.method2768((byte) -107, arg1, arg2) | (arg2 & 0x2000) != 0 | class705.method3989(arg2, arg1, -29120)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)Lfj;", line = 37)
    public static final class682 method241(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        return var3 == null ? null : var3.field592;
    }
}
