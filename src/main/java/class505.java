import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class505 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lla;")
    public class421 field7166 = null;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Ldaa;")
    public class11 field7170 = null;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method2999(int arg0) {
        field7169++;
        if (class147.field2546) {
            return;
        }
        class147.field2546 = true;
        class292.field4392 = true;
        if (class527.field7429.field2675) {
            class591.field8509 = ((int) class591.field8509 + 191 & 0xFFFFFF80);
        } else {
            class565.field8253 += (24.0F - class565.field8253) / 2.0F;
        }
        if (arg0 <= 9) {
            method2999(-127);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILqh;)Lhba;")
    public static final class10 method3000(int arg0, class61 arg1) {
        field7165++;
        return arg0 == 191 ? new class10(arg1.method721(-461515024), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method740((byte) 102), arg1.method732(-559537960)) : null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLom;I)Lf;")
    public static final class702 method3001(byte arg0, class344 arg1, int arg2) {
        field7168++;
        class702 var3 = (class702) class508.field7190.method1900((long) arg2, -119);
        if (arg0 != 71) {
            return null;
        }
        if (var3 == null) {
            if (class379.field5611) {
                var3 = class623.field9017.method170(class279.method1848(arg1, arg2), true);
            } else {
                var3 = class199.method1425(arg1.method2242(0, arg2), -9285);
            }
            class508.field7190.method1904(var3, (long) arg2, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Z")
    public static final boolean method3002(int arg0, int arg1) {
        if (arg0 == -10) {
            field7167++;
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lla;)V")
    public class505(class421 arg0) {
        this.field7166 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lla;Ldaa;)V")
    public class505(class421 arg0, class11 arg1) {
        this.field7170 = arg1;
        this.field7166 = arg0;
    }
}
