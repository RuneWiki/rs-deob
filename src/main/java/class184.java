import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class184 {

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "Z")
    private boolean field2766 = false;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public int field2764 = 0;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public int field2780 = 0;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field2768 = 0;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "Z")
    public static boolean field2782;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "Ljava/util/Random;")
    public static Random field2781;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "[Z")
    public static boolean[] field2783;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    private int field2765;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "J")
    public long field2767;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lkk;II)V")
    private final void method1309(class161 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2765 = arg0.method1134(-16848);
        } else if (arg2 == 2) {
            arg0.method1172((byte) -118);
        } else if (arg2 == 3) {
            this.field2779 = arg0.method1168(255);
            this.field2772 = arg0.method1168(255);
            this.field2762 = arg0.method1168(255);
        } else if (arg2 == 4) {
            this.field2769 = arg0.method1172((byte) 119);
            this.field2778 = arg0.method1168(255);
        } else if (arg2 == 6) {
            this.field2771 = arg0.method1172((byte) -117);
        } else if (arg2 == 8) {
            this.field2780 = 1;
        } else if (arg2 == 9) {
            this.field2764 = 1;
        } else if (arg2 == 10) {
            this.field2766 = true;
        }
        field2761++;
        int var4 = -65 % ((-arg1 - 3) / 53);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public final void method1310(int arg0) {
        field2770++;
        this.field2763 = class319.field4504[this.field2765 << 3];
        if (arg0 < 119) {
            this.method1313((class161) null, 20);
        }
        this.field2775 = (int) Math.sqrt((double) (this.field2779 * this.field2779 + this.field2762 * this.field2762 + (this.field2772 * this.field2772)));
        if (this.field2778 == 0) {
            this.field2778 = 1;
        }
        if (this.field2769 == 0) {
            this.field2767 = 2147483647L;
        } else if (this.field2769 == 1) {
            this.field2767 = (long) (this.field2775 * 8 / this.field2778);
            this.field2767 *= this.field2767;
        } else if (this.field2769 == 2) {
            this.field2767 = (long) (this.field2775 * 8 / this.field2778);
        }
        if (this.field2766) {
            this.field2775 *= -1;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public static final void method1311(byte arg0) {
        class307.field4348 = -1;
        class369.field5087 = null;
        field2776++;
        if (arg0 >= -22) {
            method1312(-102);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public static void method1312(int arg0) {
        if (arg0 <= 55) {
            method1314((class172) null, 74);
        }
        field2783 = null;
        field2781 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lkk;I)V")
    public final void method1313(class161 arg0, int arg1) {
        field2777++;
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1172((byte) 119);
            if (var3 == 0) {
                return;
            }
            this.method1309(arg0, -113, var3);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lae;I)V")
    public static final void method1314(class172 arg0, int arg1) {
        field2774++;
        if (arg1 <= 56) {
            method1314((class172) null, -58);
        }
        if (class165.field2403 == arg0.field2591) {
            class424.field5879[arg0.field2535] = true;
        }
    }

    static {
        new class151("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field2782 = false;
        field2781 = new Random();
        field2783 = new boolean[100];
    }
}
