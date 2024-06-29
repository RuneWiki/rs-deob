import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class48 extends class670 {

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field503 = -1;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Lcq;")
    public static class110 field502 = new class110(52, 2);

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method256(int arg0, int arg1, int arg2) {
        if (arg0 != 2048) {
            field503 = 38;
        }
        ++field501;
        return (arg2 & 2048) != 0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIB)V", line = 14)
    public final void method257(int arg0, int arg1, int arg2, byte arg3) {
        super.field9336 = arg2;
        super.field9327 = arg1;
        int var5 = -43 / ((arg3 - -11) / 61);
        ++field500;
        super.field9338 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(FI)V", line = 27)
    public final void method258(float arg0, int arg1) {
        ++field498;
        if (arg1 != -3989) {
            field497 = 61;
        }
        super.field9332 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 38)
    public static final void method259(int arg0) {
        ++field499;
        for (class323 var1 = (class323) class412.field5527.method3434((byte) 2); var1 != null; var1 = (class323) class412.field5527.method3430(true)) {
            if (~var1.field3967 != 0) {
                var1.method1922(124);
            } else {
                var1.field3972 = 0;
                if (var1.field3971 >= 0 && ~var1.field3968 <= -1 && var1.field3971 < class142.field1574 && class140.field1550 > var1.field3968) {
                    class694.method3819(var1, (byte) 6);
                }
            }
        }
        if (arg0 >= -39) {
            method256(-123, 114, 51);
        }
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V", line = 71)
    public static void method260(int arg0) {
        field502 = null;
        if (arg0 != 2) {
            field503 = -73;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIF)V", line = 94)
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
