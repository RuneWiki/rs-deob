import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class103 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Loe;")
    public static class102 field2490 = new class102(32);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Le;")
    public static class29 field2493 = new class29(64);

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lu;")
    private static class135 field2495 = class87.method676((byte) -83, "Create a free account");

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Z")
    public static boolean field2498 = false;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lu;")
    public static class135 field2497 = class87.method676((byte) -119, "Handel)4Duell");

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lu;")
    public static class135 field2500 = class87.method676((byte) -101, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lu;")
    public static class135 field2499 = class87.method676((byte) -127, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lu;")
    public static class135 field2496 = field2495;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)I")
    public abstract int method52(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public abstract void method57(int arg0);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method843(int arg0) {
        field2499 = null;
        field2495 = null;
        field2497 = null;
        field2496 = null;
        field2490 = null;
        if (arg0 < 43) {
            method846(null, null);
        }
        field2493 = null;
        field2500 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public abstract void method54(byte arg0);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public static final void method844(int arg0) {
        if (arg0 != -12) {
            field2495 = null;
        }
        field2487++;
        class17.field380.method1147((byte) 86);
        class76.field1804 = null;
        class12.field290 = 1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static final void method845(boolean arg0) {
        if (!arg0) {
            field2490 = null;
        }
        field2490 = new class102(32);
        field2492++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lta;")
    public static final class130 method846(Throwable arg0, String arg1) {
        class130 var2;
        if (arg0 instanceof class130) {
            var2 = (class130) arg0;
            var2.field3128 = var2.field3128 + ' ' + arg1;
        } else {
            var2 = new class130(arg0, arg1);
        }
        field2489++;
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)Z")
    public static final boolean method847(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return false;
        }
        class119 var3 = class2.method9(false, arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        field2491++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method941((byte) -103, arg2);
    }
}
