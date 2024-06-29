import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class602 implements class121 {

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public int field8539;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "Lmfa;")
    public static class562 field8537 = new class562();

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "Z")
    public static boolean field8543 = false;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILe;Ljo;)V")
    public static final void method3365(int arg0, class486 arg1, class303 arg2) {
        class630.field8950 = arg2;
        class525.field7510 = arg1;
        if (arg0 <= 30) {
            method3367((byte) 65);
        }
        field8540++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
    public static final void method3366(int arg0, int arg1) {
        field8538++;
        class530 var2 = class242.method1402(-31, 6, arg0);
        if (arg1 < -122) {
            var2.method3027((byte) -69);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Lqv;")
    public final class406 method484(int arg0) {
        if (arg0 == 16236) {
            field8541++;
            return class383.field5128;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static void method3367(byte arg0) {
        field8537 = null;
        if (arg0 <= 60) {
            field8537 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I)V")
    public class602(int arg0) {
        this.field8539 = arg0;
    }
}
