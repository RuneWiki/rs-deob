import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class196 extends class236 {

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "Lsg;")
    public class30 field3549;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "Lsg;")
    public static class30 field3545 = class167.method1221((byte) 33, "T");

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field3548 = -1;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field3551 = 0;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lsg;")
    public static class30 field3544 = class167.method1221((byte) 33, "weiss:");

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "Lhh;")
    public static class173 field3553 = new class173(5000);

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Lsg;")
    public static class30 field3556 = class167.method1221((byte) 33, "gr-Un:");

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "[I")
    public static int[] field3557 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Lcg;")
    public static class34 field3555;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIIZZ)Lmc;")
    public static final class151 method1418(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg1 != -2713) {
            method1420(38, (byte) -40);
        }
        class110 var5 = null;
        if (class226.field4045 != null) {
            var5 = new class110(arg2, class226.field4045, class132.field2598[arg2], 1000000);
        }
        class119.field2334[arg2] = class78.field1696.method1810(8, arg2, var5, class185.field3399);
        field3552++;
        if (arg4) {
            class119.field2334[arg2].method1787((byte) -119);
        }
        return new class151(class119.field2334[arg2], arg0, arg3);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method1419(byte arg0) {
        if (arg0 > -21) {
            method1420(-34, (byte) 19);
        }
        field3553 = null;
        field3545 = null;
        field3557 = null;
        field3556 = null;
        field3544 = null;
        field3555 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class196() {
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lsg;)V")
    public class196(class30 arg0) {
        this.field3549 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)I")
    public static final int method1420(int arg0, byte arg1) {
        int var2 = 19 / ((-arg1 - 8) / 43);
        field3546++;
        return arg0 & 0xFF;
    }
}
