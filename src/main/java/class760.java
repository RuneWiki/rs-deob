import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class760 implements class81 {

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "Lle;")
    public class311 field10571;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public int field10567;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
    public int field10575;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "Lqj;")
    public class512 field10566;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
    public int field10569;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field10564;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field10568;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
    public static int field10572;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "I")
    public static int field10574;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)Lmha;")
    public class419 method112(byte arg0) {
        field10573++;
        if (arg0 != 62) {
            method4231(113, -127, -128);
        }
        return class654.field8672;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)[Lel;")
    public static final class548[] method4229(byte arg0) {
        if (arg0 != 114) {
            field10565 = 30;
        }
        field10568++;
        return new class548[] { class418.field5768, class606.field7951, class563.field7375 };
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(ILle;Lqj;II)V")
    public class760(int arg0, class311 arg1, class512 arg2, int arg3, int arg4) {
        this.field10571 = arg1;
        this.field10567 = arg3;
        this.field10575 = arg0;
        this.field10566 = arg2;
        this.field10569 = arg4;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)V")
    public static final void method4230(int arg0, int arg1) {
        field10570++;
        if (arg1 == -32204) {
            class127 var2 = method4231(arg0, -874792672, 9);
            var2.method1002(-60);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)Lju;")
    public static final class127 method4231(int arg0, int arg1, int arg2) {
        field10572++;
        if (arg1 != -874792672) {
            field10565 = 45;
        }
        class127 var3 = (class127) class416.field5750.method2135((long) arg0 | (long) arg2 << 32, (byte) 31);
        if (var3 == null) {
            var3 = new class127(arg2, arg0);
            class416.field5750.method2143(-1, var3, var3.field8680);
        }
        return var3;
    }
}
