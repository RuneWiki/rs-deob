import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class434 extends class6 {

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Llg;")
    public class285 field6360;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lar;")
    public static class479 field6361 = new class479();

    @OriginalMember(owner = "client!te", name = "B", descriptor = "[I")
    public static int[] field6364 = new int[2048];

    @OriginalMember(owner = "client!te", name = "D", descriptor = "[I")
    public static int[] field6365 = new int[200];

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Lwj;")
    public static class270 field6362 = new class270(14, 4);

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Lqp;")
    public static class466 field6367 = new class466("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Llt;B)V")
    public static final void method2561(class475 arg0, byte arg1) {
        if (arg1 < -73) {
            field6359++;
            class53.field647 = arg0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method2562(byte arg0) {
        field6367 = null;
        if (arg0 > 63) {
            field6362 = null;
            field6361 = null;
            field6364 = null;
            field6365 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Llg;)V")
    public class434(class285 arg0) {
        this.field6360 = arg0;
    }
}
