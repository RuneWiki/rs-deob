import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class648 extends class509 {

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "Z")
    private boolean field9395 = false;

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "Lpn;")
    public static class68 field9396 = new class68();

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "Lcc;")
    public static class427 field9399;

    @OriginalMember(owner = "client!jba", name = "A", descriptor = "Lkn;")
    public static class455 field9400;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "[I")
    public static int[] field9391;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)V", line = 3)
    public static void method3736(int arg0) {
        field9396 = null;
        field9400 = null;
        if (arg0 == -27352) {
            field9391 = null;
            field9399 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZB)V", line = 19)
    public final void method35(boolean arg0, byte arg1) {
        ++field9394;
        class547 var3 = super.field7558.method1173(31903);
        if (var3 != null && arg0) {
            super.field7558.method1159(1, false);
            super.field7558.method1152(var3, true);
            super.field7558.method277(class161.field2156, 110);
            super.field7558.method1159(1, false);
            super.field7558.method1102(class106.field1327, class43.field527, 127);
            super.field7558.method319(class352.field5118, 0, false, 2, true);
            super.field7558.method1097(-14186, class524.field7760, 0);
            class124 var4 = super.field7558.method1122((byte) 65);
            var4.method757(super.field7558.method1175(81), 0);
            super.field7558.method1100(class213.field3130, -1);
            super.field7558.method1159(0, false);
            this.field9395 = true;
        } else {
            super.field7558.method1097(-14186, class524.field7760, 0);
        }
        int var5 = -41 / ((40 - arg1) / 36);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBI)V", line = 50)
    public final void method43(int arg0, byte arg1, int arg2) {
        ++field9392;
        if (arg1 != -60) {
            this.method38((byte) -15);
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)Z", line = 60)
    public final boolean method40(int arg0) {
        if (arg0 < 44) {
            return false;
        } else {
            ++field9393;
            return true;
        }
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lkw;)V", line = 98)
    public class648(class174 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZ)V", line = 77)
    public final void method39(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field9399 = null;
        }
        ++field9390;
        super.field7558.method1102(class609.field8962, class43.field527, -76);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZILmn;)V", line = 88)
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        super.field7558.method1152(arg2, arg0);
        ++field9397;
        super.field7558.method1142(192, arg1);
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V", line = 106)
    public final void method38(byte arg0) {
        if (arg0 != 59) {
            this.method40(-96);
        }
        ++field9398;
        if (!this.field9395) {
            super.field7558.method1097(-14186, class248.field3625, 0);
        } else {
            super.field7558.method1159(1, false);
            super.field7558.method277(class22.field195, arg0 ^ 70);
            super.field7558.method1102(class609.field8962, class609.field8962, 127);
            super.field7558.method1160(2, (byte) -113, class455.field6635);
            super.field7558.method1097(-14186, class248.field3625, 0);
            super.field7558.method1109(5);
            super.field7558.method1152((class60) null, true);
            super.field7558.method1159(0, false);
            this.field9395 = false;
        }
        super.field7558.method1102(class609.field8962, class609.field8962, 127);
    }
}
