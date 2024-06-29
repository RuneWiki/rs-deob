import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class508 {

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public int field7387 = 0;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "Z")
    private boolean field7391 = false;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public int field7389 = 0;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Z")
    public static boolean field7383 = false;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Ljp;")
    public static class55 field7388 = new class55(75, 5);

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "Z")
    public static boolean field7402 = false;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "Lpu;")
    public static class179 field7401 = new class179("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "Lpu;")
    public static class179 field7403 = new class179("K", "T", "K", "K");

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "I")
    public static int field7404 = 0;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "Lpu;")
    public static class179 field7405 = new class179(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public int field7381;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public int field7384;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    private int field7385;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public int field7386;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public int field7393;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    public int field7395;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
    public int field7399;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "J")
    public long field7398;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public static final void method3022(int arg0) {
        class456.field6778 = null;
        field7397++;
        if (arg0 < 72) {
            field7388 = null;
        }
        class275.method1878(0, class360.field5313, class134.field2010, 0, class169.field2570, 0, (byte) -68, 0, -1);
        if (class456.field6778 != null) {
            class128.method941(0, class488.field7134, class169.field2570, 0, class206.field3162, class530.field7741.field620, 1, -1412584499, class360.field5313, class456.field6778);
            class456.field6778 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public final void method3023(int arg0) {
        this.field7390 = class58.field889[this.field7385 << 3];
        if (arg0 != 17955) {
            this.field7385 = 63;
        }
        field7380++;
        this.field7381 = (int) Math.sqrt((double) (this.field7386 * this.field7386 + this.field7400 * this.field7400 + this.field7384 * this.field7384));
        if (this.field7393 == 0) {
            this.field7393 = 1;
        }
        if (this.field7396 == 0) {
            this.field7398 = 2147483647L;
        } else if (this.field7396 == 1) {
            this.field7398 = (this.field7381 * 8 / this.field7393);
            this.field7398 *= this.field7398;
        } else if (this.field7396 == 2) {
            this.field7398 = (this.field7381 * 8 / this.field7393);
        }
        if (this.field7391) {
            this.field7381 *= -1;
        }
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
    public static void method3024(int arg0) {
        if (arg0 >= 1) {
            field7388 = null;
            field7405 = null;
            field7401 = null;
            field7403 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lfh;II)V")
    private final void method3025(class194 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field7385 = arg0.method1396(-90);
        } else if (arg2 == 2) {
            arg0.method1337((byte) -124);
        } else if (arg2 == 3) {
            this.field7386 = arg0.method1401(-46);
            this.field7400 = arg0.method1401(-123);
            this.field7384 = arg0.method1401(126);
        } else if (arg2 == 4) {
            this.field7396 = arg0.method1337((byte) -122);
            this.field7393 = arg0.method1401(127);
        } else if (arg2 == 6) {
            this.field7395 = arg0.method1337((byte) 109);
        } else if (arg2 == 8) {
            this.field7389 = 1;
        } else if (arg2 == 9) {
            this.field7387 = 1;
        } else if (arg2 == 10) {
            this.field7391 = true;
        }
        field7392++;
        int var4 = 32 / ((-arg1 - 36) / 36);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)I")
    public static final int method3026(int arg0, int arg1) {
        if (arg1 != 127) {
            method3022(125);
        }
        field7394++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lfh;B)V")
    public final void method3027(class194 arg0, byte arg1) {
        if (arg1 >= -5) {
            this.method3025(null, -35, 24);
        }
        while (true) {
            int var3 = arg0.method1337((byte) -121);
            if (var3 == 0) {
                field7382++;
                return;
            }
            this.method3025(arg0, 76, var3);
        }
    }
}
