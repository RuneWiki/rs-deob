import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class320 implements class707 {

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "Lwia;")
    private class791 field4531;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)I")
    public static final int method2064(int arg0) {
        if (arg0 == -16623) {
            field4535++;
            return class55.field709;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)I")
    public final int method2065(int arg0) {
        field4536++;
        if (arg0 != -6765) {
            method2064(32);
        }
        return this.field4531.method4350(74) ? 100 : this.field4531.method4347(-54);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 >= -12) {
            return;
        }
        class620.field8725 = arg4;
        class142.field2102 = arg0;
        field4532++;
        class787.field10808 = arg2;
        class445.field6057 = arg3;
        class88.field991 = arg6;
        class459.field6418 = arg1;
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lwia;)V")
    public class320(class791 arg0) {
        this.field4531 = arg0;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)Llj;")
    public final class633 method2067(int arg0) {
        if (arg0 != -5905) {
            method2064(16);
        }
        field4534++;
        return class633.field8885;
    }
}
