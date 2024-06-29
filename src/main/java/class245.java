import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class245 {

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public int field4107 = -1;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field4108 = -1;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[I")
    public static int[] field4114 = new int[14];

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lpf;")
    public static class17 field4104 = new class17(2);

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Z")
    public static boolean field4117 = true;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4116 = "Use";

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lab;")
    public static class249 field4120 = new class249(new byte[5000]);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Laj;")
    public static class151 field4118;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[[[I")
    public static int[][][] field4123;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class23.field423 <= arg4 - arg3 && class272.field4552 >= arg3 + arg4 && class55.field972 <= arg2 - arg3 && (arg2 + arg3) <= class240.field4053) {
            class244.method1747(arg2, arg4, arg0, arg5, -123, arg3, arg1);
        } else {
            class89.method618(arg3, arg2, arg4, arg5, arg1, arg0, 61);
        }
        field4122++;
        if (arg6 < 62) {
            field4108 = -8;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1752(byte arg0) {
        int var1 = -92 / ((-arg0 - 6) / 57);
        field4118 = null;
        field4123 = null;
        field4116 = null;
        field4120 = null;
        field4114 = null;
        field4104 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method1753(int arg0) {
        field4112++;
        if (arg0 != 12627) {
            method1751(70, 117, -2, 14, -69, -119, -17);
        }
        if (class122.field2044 < 0) {
            class306.field4951 = -1;
            class122.field2044 = 0;
            class253.field4282 = -1;
        }
        if (class148.field2436 < class122.field2044) {
            class253.field4282 = -1;
            class122.field2044 = class148.field2436;
            class306.field4951 = -1;
        }
        if (class219.field3701 < 0) {
            class253.field4282 = -1;
            class219.field3701 = 0;
            class306.field4951 = -1;
        }
        if (class219.field3701 > class148.field2434) {
            class253.field4282 = -1;
            class306.field4951 = -1;
            class219.field3701 = class148.field2434;
        }
    }
}
