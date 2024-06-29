import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class135 extends class89 {

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
    public static int[] field2490 = new int[99];

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lqe;")
    private static class179 field2494;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[Ldg;")
    public static class40[] field2492;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Lqe;")
    private static class179 field2497;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lqe;")
    private static class179 field2495;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lqe;")
    public static class179 field2496;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lqe;")
    public static class179 field2499;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Lqe;")
    public static class179 field2501;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Lqe;")
    public static class179 field2504;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Lqe;")
    private static class179 field2502;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lqe;")
    public static class179 field2498;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "Lqe;")
    private static class179 field2506;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Lqe;")
    public static class179 field2505;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
    public static void method865(byte arg0) {
        field2495 = null;
        field2499 = null;
        field2498 = null;
        field2501 = null;
        field2506 = null;
        field2497 = null;
        field2492 = null;
        field2490 = null;
        if (arg0 != -26) {
            field2505 = null;
        }
        field2494 = null;
        field2505 = null;
        field2496 = null;
        field2504 = null;
        field2502 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V")
    public class135(int arg0, int arg1) {
        this.field2491 = arg1;
        this.field2500 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2490[var1] = var0 / 4;
        }
        field2493 = 0;
        field2494 = class206.method1380("button near the top of that page)3", (byte) -126);
        field2492 = new class40[4];
        field2497 = class206.method1380("and choose the (Wcreate account(W", (byte) 95);
        field2495 = class206.method1380("Select", (byte) -41);
        field2496 = field2495;
        field2499 = field2494;
        field2501 = class206.method1380("Versteckt", (byte) -127);
        field2503 = 0;
        field2504 = field2497;
        field2502 = class206.method1380("Your profile will be transferred in:", (byte) 0);
        field2498 = field2502;
        field2506 = class206.method1380("This world is full)3", (byte) 59);
        field2505 = field2506;
    }
}
