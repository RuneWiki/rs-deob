import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class207 {

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public int field3343 = 16777215;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public int field3352 = 8;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field3338 = -1;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "[I")
    public static int[] field3340 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3332 = 0;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "[I")
    public static int[] field3350 = new int[4];

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Leg;")
    public static class272 field3335 = new class272(64);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "B")
    public static byte field3347;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Z")
    public boolean field3341;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "[I")
    public static int[] field3348;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1396(byte arg0, int arg1) {
        if (arg0 <= 23) {
            method1397(10);
        }
        field3339++;
        return class162.field2633[arg1].length() <= 0 ? class152.field2464[arg1] : class152.field2464[arg1] + class62.field849 + class162.field2633[arg1];
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field3335 = null;
        if (arg0 != 2) {
            field3338 = 112;
        }
        field3348 = null;
        field3340 = null;
        field3350 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLhi;II)V")
    private final void method1398(boolean arg0, class264 arg1, int arg2, int arg3) {
        field3336++;
        if (arg3 == 1) {
            this.field3352 = arg1.method1777(-98);
        } else if (arg3 == 2) {
            this.field3341 = true;
        } else if (arg3 == 3) {
            this.field3333 = arg1.method1756(-126);
            this.field3344 = arg1.method1756(-93);
            this.field3345 = arg1.method1756(-108);
        } else if (arg3 == 4) {
            this.field3346 = arg1.method1779(-86);
        } else if (arg3 == 5) {
            this.field3349 = arg1.method1777(-39);
        } else if (arg3 == 6) {
            this.field3343 = arg1.method1732(-58);
        }
        if (arg0) {
            this.method1398(false, (class264) null, -9, 83);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lhi;II)V")
    public final void method1399(class264 arg0, int arg1, int arg2) {
        if (arg1 != -7434) {
            this.field3344 = -61;
        }
        while (true) {
            int var4 = arg0.method1779(-92);
            if (var4 == 0) {
                field3351++;
                return;
            }
            this.method1398(false, arg0, arg2, var4);
        }
    }
}
