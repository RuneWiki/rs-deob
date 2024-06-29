import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class class37 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[J")
    public static long[] field522 = new long[32];

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Lvq;")
    public static class24 field521 = new class24(52, 8);

    @OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
    public static boolean field526 = true;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Lil;")
    public static class274 field527 = new class274(1, 15);

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Ljn;")
    public static class409 field528 = new class409("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field530 = 500;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Z")
    public static boolean field529 = false;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Lqm;")
    public static class297 field520;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I", line = 7)
    public static final int method335(int arg0, int arg1) {
        if (arg1 != 1805455176) {
            field526 = false;
        }
        field523++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)I", line = 31)
    public static final int method336(int arg0, int arg1, int arg2) {
        field519++;
        return arg1 == arg2 || arg1 == 5 ? class212.field2977[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 49)
    public static void method337(int arg0) {
        field520 = null;
        field521 = null;
        field528 = null;
        field527 = null;
        field522 = null;
        if (arg0 != 52) {
            method337(44);
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 64)
    public static final void method338(int arg0) {
        field524++;
        if (arg0 != 1) {
            field528 = null;
        }
        if (class163.method1082((byte) 95) || class423.field6117 == class276.field4085) {
            class104.method721(class74.field942, 10785);
            if (class56.field682 != class423.field6117) {
                class51.method395((byte) 19);
            }
        } else {
            class364.method2318(false, arg0 + 9, false, class92.field1147, class135.field1854);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
    public abstract boolean method256(int arg0, int arg1);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Lsc;")
    public abstract class408 method253(int arg0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
    public abstract void method260(boolean arg0);

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
    public abstract void method262(int arg0);
}
