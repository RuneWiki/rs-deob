import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class261 {

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[Lti;")
    public static class178[] field4035 = new class178[50];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "J")
    public static volatile long field4032 = 0L;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4036 = "glow3:";

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "[I")
    public static int[] field4034;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[Llf;")
    public static class94[] field4038;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static void method1788(boolean arg0) {
        field4034 = null;
        if (arg0) {
            field4036 = null;
            field4038 = null;
            field4035 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILhc;I)Lpm;")
    public static final class242 method1789(int arg0, class53 arg1, int arg2) {
        field4031++;
        if (arg0 != -32251) {
            method1791(-91, -107, (class248) null);
        }
        class242 var3 = new class242(arg2, arg1.method326(arg0 + 32377), arg1.method326(35), arg1.method340(-92), arg1.method340(-122), arg1.method366(-16505) == 1, arg1.method366(-16505));
        int var4 = arg1.method366(-16505);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field3555.method13(32, new class82(arg1.method366(arg0 + 15746), arg1.method366(-16505), arg1.method331(-120), arg1.method331(arg0 + 32187), arg1.method331(-110), arg1.method331(-104), arg1.method331(arg0 ^ 0x7DAA), arg1.method331(-8), arg1.method331(-94), arg1.method331(arg0 ^ 0x7DF8)));
        }
        var3.method1653(true);
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Llc;I)V")
    public static final void method1790(class270 arg0, int arg1) {
        class249.field3764 = class193.method1372(arg0, 0, -1, class214.field3148);
        field4039++;
        class303.field4904 = class193.method1372(arg0, 0, -1, class272.field4404);
        class263.field4161 = class193.method1372(arg0, 0, -1, class282.field4543);
        class8.field81 = class193.method1372(arg0, 0, -1, class86.field1370);
        class174.field2654 = class193.method1372(arg0, 0, -1, class289.field4621);
        class282.field4552 = class193.method1372(arg0, 0, -1, class238.field3479);
        if (arg1 <= 81) {
            field4034 = null;
        }
        class133.field2180 = class39.method243(0, class29.field307, arg0, 13759);
        field4038 = class39.method243(0, class1.field2, arg0, 13759);
        class292.field4648 = class39.method243(0, class108.field1830, arg0, 13759);
        class190.field2812 = class186.method1330(arg0, 0, -81, class212.field3128);
        class265.field4250 = class186.method1330(arg0, 0, -123, class57.field836);
        class84.field1336.method76(class265.field4250, (int[]) null);
        class124.field2073.method76(class265.field4250, (int[]) null);
        class208.field3084.method76(class265.field4250, (int[]) null);
        class148 var2 = class309.method2093(arg0, 0, 23048, class126.field2125);
        var2.method1095();
        class5.field44 = var2;
        class148[] var3 = class190.method1352(class163.field2528, arg0, 0, 4);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1095();
        }
        class135.field2202 = var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILke;)V")
    public static final void method1791(int arg0, int arg1, class248 arg2) {
        field4037++;
        if (arg2.field3682 > class199.field2930) {
            class51.method310(arg0 - 129, arg2);
        } else if (class199.field2930 > arg2.field3658) {
            class8.method45(arg2, (byte) -63);
        } else {
            class156.method1140(arg2, true);
        }
        if (arg0 != 128) {
            return;
        }
        if (arg2.field3660 < 128 || arg2.field3753 < 128 || arg2.field3660 >= 13184 || arg2.field3753 >= 13184) {
            arg2.field3658 = 0;
            arg2.field3682 = 0;
            arg2.field3741 = -1;
            arg2.field3718 = -1;
            arg2.field3660 = arg2.field3761[0] * 128 + (arg2.method1467(arg0 ^ 0x80) * 64);
            arg2.field3753 = arg2.field3686[0] * 128 + (arg2.method1467(0) * 64);
            arg2.method1713((byte) -109);
        }
        if (class213.field3139 == arg2 && (arg2.field3660 < 1536 || arg2.field3753 < 1536 || arg2.field3660 >= 11776 || arg2.field3753 >= 11776)) {
            arg2.field3718 = -1;
            arg2.field3658 = 0;
            arg2.field3741 = -1;
            arg2.field3682 = 0;
            arg2.field3660 = arg2.field3761[0] * 128 + (arg2.method1467(0) * 64);
            arg2.field3753 = arg2.field3686[0] * 128 + (arg2.method1467(0) * 64);
            arg2.method1713((byte) 24);
        }
        class294.method1998(0, arg2);
        class268.method1846(3, arg2);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1792(String arg0, int arg1) {
        field4033++;
        if (arg1 >= -123) {
            method1789(60, (class53) null, -81);
        }
        return arg0.length() + 1;
    }
}
