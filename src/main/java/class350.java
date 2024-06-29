import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class350 {

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field4467 = 0;

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "[I")
    public static int[] field4470 = new int[3];

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "Lju;")
    public static class227 field4469 = new class227(14, 1);

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "Lju;")
    public static class227 field4471 = new class227(15, 4);

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "Lju;")
    public static class227 field4472 = new class227(16, -2);

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "Lju;")
    public static class227 field4473 = new class227(17, 0);

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "Lju;")
    public static class227 field4474 = new class227(18, -2);

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "Lju;")
    public static class227 field4475 = new class227(19, -2);

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "Lju;")
    public static class227 field4476 = new class227(20, 6);

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "Lju;")
    public static class227 field4477 = new class227(21, 9);

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "Lju;")
    public static class227 field4478 = new class227(22, -2);

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "Lju;")
    public static class227 field4479 = new class227(23, 4);

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "Lju;")
    public static class227 field4480 = new class227(24, -1);

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "Lju;")
    public static class227 field4481 = new class227(25, -2);

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "Lju;")
    public static class227 field4482 = new class227(26, 0);

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "Lju;")
    public static class227 field4483 = new class227(27, 0);

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "[Lju;")
    private static class227[] field4484 = new class227[32];

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
    public static void method1930(int arg0) {
        field4478 = null;
        field4481 = null;
        field4476 = null;
        field4472 = null;
        if (arg0 != 1) {
            return;
        }
        field4469 = null;
        field4470 = null;
        field4479 = null;
        field4477 = null;
        field4474 = null;
        field4483 = null;
        field4480 = null;
        field4473 = null;
        field4484 = null;
        field4475 = null;
        field4471 = null;
        field4482 = null;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)Liw;")
    public static final class532 method1931(int arg0) {
        if (arg0 == 6684) {
            class523.field7118 = 0;
            field4465++;
            return class280.method1587(arg0 - 6800);
        } else {
            return null;
        }
    }

    static {
        class227[] var0 = class57.method356((byte) 88);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field4484[var0[var1].field2831] = var0[var1];
        }
    }
}
