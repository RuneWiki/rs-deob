import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class347 extends class135 {

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Z")
    private boolean field4905 = false;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "Lvh;")
    public static class125 field4907 = new class125(20, -1);

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public static int field4912 = 0;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "Lpfa;")
    public static class222 field4911;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "Lqp;")
    public static class441 field4908;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IILph;II)V", line = 6)
    public static final void method2114(int arg0, int arg1, class699 arg2, int arg3, int arg4) {
        arg2.field9908.method2733(false, arg4);
        ++field4903;
        arg2.field9908.method2700(arg3, arg1 ^ arg1);
        arg2.field9908.method2745(arg0, arg1 ^ 1670638067);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V", line = 16)
    public final void method375(int arg0, boolean arg1) {
        super.field2179.method2959(class55.field715, class345.field4866, (byte) -126);
        ++field4902;
        if (arg0 < 14) {
            this.method376(false, -87);
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V", line = 29)
    public static void method2115(byte arg0) {
        field4907 = null;
        if (arg0 != 78) {
            method2114(120, -80, (class699) null, 64, 102);
        }
        field4908 = null;
        field4911 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)V", line = 41)
    public final void method376(boolean arg0, int arg1) {
        if (arg1 != -25475) {
            this.method384((class402) null, -46, 12);
        }
        ++field4909;
        class639 var3 = super.field2179.method2923(arg1 + 25365);
        if (var3 != null && arg0) {
            super.field2179.method2953(1, 113);
            super.field2179.method2924(arg1 + 39003, var3);
            super.field2179.method125(class66.field955, arg1 ^ 25567);
            super.field2179.method2953(1, arg1 ^ -25587);
            super.field2179.method2959(class166.field2734, class345.field4866, (byte) -119);
            super.field2179.method143(true, class51.field669, 44, false, 2);
            super.field2179.method2937(8, class521.field7683, 0);
            class14 var4 = super.field2179.method2946((byte) -124);
            var4.method159(super.field2179.method2943((byte) -50), true);
            super.field2179.method2949(class316.field4373, (byte) -100);
            super.field2179.method2953(0, 126);
            this.field4905 = true;
        } else {
            super.field2179.method2937(8, class521.field7683, 0);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V", line = 73)
    public final void method377(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field4904;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 84)
    public final void method385(int arg0) {
        ++field4913;
        if (this.field4905) {
            super.field2179.method2953(1, 108);
            super.field2179.method125(class485.field6913, -118);
            super.field2179.method2959(class55.field715, class55.field715, (byte) 96);
            super.field2179.method2914(92, 2, class450.field6484);
            super.field2179.method2937(8, class171.field2763, 0);
            super.field2179.method2954((byte) 117);
            super.field2179.method2924(13528, (class402) null);
            super.field2179.method2953(0, 112);
            this.field4905 = false;
        } else {
            super.field2179.method2937(8, class171.field2763, 0);
        }
        int var2 = -29 / ((arg0 - -29) / 45);
        super.field2179.method2959(class55.field715, class55.field715, (byte) 126);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Laj;II)V", line = 109)
    public final void method384(class402 arg0, int arg1, int arg2) {
        ++field4906;
        super.field2179.method2924(13528, arg0);
        if (arg1 != 0) {
            this.method384((class402) null, 12, 99);
        }
        super.field2179.method2956((byte) 47, arg2);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lnh;)V", line = 130)
    public class347(class495 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "(I)Z", line = 144)
    public final boolean method379(int arg0) {
        if (arg0 != -4931) {
            this.method384((class402) null, -41, 75);
        }
        ++field4910;
        return true;
    }
}
