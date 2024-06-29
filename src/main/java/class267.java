import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class267 implements class447 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lqt;")
    public static class634 field3864 = new class634();

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 3)
    public static void method1789(int arg0) {
        field3864 = null;
        if (arg0 >= -21) {
            field3864 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Ljw;", line = 15)
    public final class551 method930(int arg0) {
        if (arg0 != 17503) {
            method1789(-98);
        }
        field3866++;
        return class630.field9039;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(I)V", line = 31)
    public class267(int arg0) {
        this.field3865 = arg0;
    }
}
