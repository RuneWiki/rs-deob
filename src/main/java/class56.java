import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class56 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lmk;")
    public static class56 field569 = new class56();

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Lmk;")
    public static class56 field570 = new class56();

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lmk;")
    public static class56 field571 = new class56();

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lmk;")
    public static class56 field572 = new class56();

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field575 = 0;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Lkba;")
    public static class108 field574 = new class108();

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 8)
    public static void method318(int arg0) {
        field571 = null;
        field569 = null;
        field574 = null;
        field572 = null;
        field570 = null;
        if (arg0 < 42) {
            method320(77, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!mk", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field568++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 38)
    public static final void method319(byte arg0) {
        field566++;
        if (arg0 > -118) {
            field575 = -121;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class309.field4193[var1] = null;
        }
        class494.field6729 = 0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)Z", line = 56)
    public static final boolean method320(int arg0, byte arg1) {
        if (arg1 >= -5) {
            return true;
        } else {
            field567++;
            return arg0 == 3 || arg0 == 5 || arg0 == 6;
        }
    }
}
