import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class220 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lwf;")
    public static class16 field3871 = new class16(4);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lha;")
    public static class46 field3875 = class271.method1828("<col=ffff00>", -46);

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
    public static volatile boolean field3874 = true;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
    public static int[] field3879 = new int[5];

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field3877 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lpi;ZLgi;Lpi;Z)V")
    public static final void method1525(class181 arg0, boolean arg1, class256 arg2, class181 arg3, boolean arg4) {
        class170.field3038 = arg4;
        class225.field3936 = arg3;
        class151.field2688 = arg0;
        int var5 = class151.field2688.method1301(arg1) - 1;
        class99.field1836 = var5 * 256 + class151.field2688.method1327(!arg1, var5);
        field3873++;
        class161.field2840 = arg2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLqd;)Lqd;")
    public abstract class151 method1027(byte arg0, class151 arg1);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3878++;
        if (arg1 > -2) {
            method1526(-46, -79, 42, -117, -90, 114);
        }
        for (int var6 = arg0; var6 <= arg5; var6++) {
            class24.method170((byte) 33, arg3, class6.field100[var6], arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method1527(int arg0) {
        field3879 = null;
        field3871 = null;
        if (arg0 != -6470) {
            method1528(false, (class141) null);
        }
        field3875 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLvd;)V")
    public static final void method1528(boolean arg0, class141 arg1) {
        field3869++;
        int var2 = arg1.field2576 - class157.field2803;
        int var3 = arg1.field2534 * 128 + (arg1.method642(87) * 64);
        int var4 = arg1.field2527 * 128 + (arg1.method642(124) * 64);
        arg1.field2546 += (var4 - arg1.field2546) / var2;
        arg1.field2552 = 0;
        if (arg1.field2514 == 0) {
            arg1.field2526 = 1024;
        }
        arg1.field2585 += (var3 - arg1.field2585) / var2;
        if (arg0) {
            method1526(-40, 14, -63, 42, 17, -48);
        }
        if (arg1.field2514 == 1) {
            arg1.field2526 = 1536;
        }
        if (arg1.field2514 == 2) {
            arg1.field2526 = 0;
        }
        if (arg1.field2514 == 3) {
            arg1.field2526 = 512;
        }
    }
}
