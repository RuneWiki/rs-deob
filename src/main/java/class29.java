import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class29 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field414 = 0;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field415 = -1;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lfd;")
    public class213 field413;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
    public int[] field416;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lve;BLve;)I")
    public static final int method213(class233 arg0, byte arg1, class233 arg2) {
        field411++;
        int var3 = 0;
        if (arg0.method1509(false, class213.field3050)) {
            var3++;
        }
        if (arg0.method1509(false, class48.field702)) {
            var3++;
        }
        if (arg0.method1509(false, class276.field4422)) {
            var3++;
        }
        if (arg2.method1509(false, class213.field3050)) {
            var3++;
        }
        int var4 = 12 % ((13 - arg1) / 45);
        if (arg2.method1509(false, class48.field702)) {
            var3++;
        }
        if (arg2.method1509(false, class276.field4422)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method214(byte arg0) {
        if (arg0 != 66) {
            field414 = 60;
        }
        field412++;
    }
}
