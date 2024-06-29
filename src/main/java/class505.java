import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class505 extends class276 {

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lbl;")
    public class265 field7355;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field7356 = 0;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lvv;")
    public static class313 field7353 = new class313(106, 6);

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lvv;")
    public static class313 field7358 = new class313(14, 12);

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lnk;")
    public static class326 field7359 = new class326(73, -1);

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Z")
    public static boolean field7361 = false;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lqs;")
    public static class496 field7357;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "[I")
    public static int[] field7360;

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lbl;)V")
    public class505(class265 arg0) {
        this.field7355 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public static void method2975(boolean arg0) {
        field7358 = null;
        if (arg0) {
            method2975(false);
        }
        field7359 = null;
        field7360 = null;
        field7357 = null;
        field7353 = null;
    }
}
