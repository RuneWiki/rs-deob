import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class242 extends class36 {

    @OriginalMember(owner = "client!w", name = "z", descriptor = "B")
    public byte field3586 = 5;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "S")
    public static short field3588 = 1;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Ljn;")
    public static class409 field3591 = new class409("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public static int field3595 = 0;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Z")
    public static boolean field3594 = false;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Lbn;")
    public static class160 field3596 = new class160(36, 4);

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Lgq;")
    public static class431 field3590;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public static void method1624(boolean arg0) {
        field3590 = null;
        if (!arg0) {
            field3596 = null;
            field3591 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V")
    public static final void method1625(byte arg0) {
        if (arg0 != -13) {
            field3588 = 121;
        }
        class363 var1 = class47.field615;
        synchronized (class47.field615) {
            class47.field615.method2313(97);
        }
        field3589++;
    }
}
