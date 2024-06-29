import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class515 extends class321 {

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field7508 = -1;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "Lig;")
    public static class206 field7511 = new class206(6, 5);

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "Lkea;")
    public static class203 field7512;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(FI)V", line = 4)
    public final void method1756(float arg0, int arg1) {
        ++field7509;
        if (arg1 == 99999) {
            super.field4643 = arg0;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lkea;B)V", line = 16)
    public static final void method3057(class203 arg0, byte arg1) {
        ++field7507;
        class197.field2669 = arg0.method1283((byte) -39, "titlebg");
        class331.field4767 = arg0.method1283((byte) -72, "logo");
        if (arg1 != 16) {
            field7511 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILjava/lang/String;IIIII)V", line = 28)
    public static final void method3058(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7506;
        class592 var8 = new class592();
        if (arg7 == 6) {
            var8.field8499 = arg3;
            var8.field8503 = arg2;
            var8.field8495 = arg5;
            var8.field8493 = class287.field3982 + arg0;
            var8.field8501 = arg6;
            var8.field8492 = arg1;
            var8.field8498 = arg4;
            class101.field1200.method3293(var8, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "(I)V", line = 48)
    public static void method3059(int arg0) {
        field7511 = null;
        field7512 = null;
        if (arg0 != 5) {
            method3059(77);
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIF)V", line = 64)
    public class515(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIII)V", line = 73)
    public final void method1755(boolean arg0, int arg1, int arg2, int arg3) {
        super.field4646 = arg3;
        ++field7510;
        if (!arg0) {
            method3058(-94, -43, (String) null, 20, -41, 18, -23, 81);
        }
        super.field4640 = arg1;
        super.field4638 = arg2;
    }
}
