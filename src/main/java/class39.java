import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class39 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lgb;")
    public static class212 field585 = new class212(260);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Ltl;")
    private static class59 field589 = class85.method639("Prepared sound engine", 9588);

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Ltl;")
    public static class59 field590 = class85.method639("W-=hlen Sie eine Option", 9588);

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field588 = -1;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Z")
    public static boolean field592 = false;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Ltl;")
    public static class59 field593 = field589;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Ltl;")
    private static class59 field597 = class85.method639("flash1:", 9588);

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Ltl;")
    public static class59 field596 = field597;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Ltl;")
    public static class59 field591 = field597;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 10)
    public static void method256(int arg0) {
        field596 = null;
        field591 = null;
        field593 = null;
        field590 = null;
        field597 = null;
        field585 = null;
        field589 = null;
        if (arg0 < 41) {
            method257(-61, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V", line = 32)
    public static final void method257(int arg0, byte arg1) {
        field587++;
        class100.field1623 = 1000 / arg0;
        int var2 = 20 % ((-arg1 - 32) / 54);
    }
}
