import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Z")
    public boolean field3527 = true;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field3530 = new Object();

    @OriginalMember(owner = "client!v", name = "x", descriptor = "[I")
    public int[] field3549 = new int[500];

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field3551 = 0;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "[I")
    public int[] field3547 = new int[500];

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Ljb;")
    public static class64 field3529 = new class64(64);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lkd;")
    private static class73 field3537 = class126.method1070((byte) -66, "red:");

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3532 = 0;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Lkd;")
    public static class73 field3546 = field3537;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lkd;")
    private static class73 field3541 = class126.method1070((byte) -66, " has logged in)3");

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lkd;")
    public static class73 field3539 = field3541;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lkd;")
    private static class73 field3534 = class126.method1070((byte) -66, "Existing User");

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Lkd;")
    public static class73 field3552 = field3534;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field3544 = 0;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Lkd;")
    public static class73 field3543 = class126.method1070((byte) -66, "::");

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lkd;")
    public static class73 field3538 = field3537;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "[J")
    public static long[] field3550 = new long[32];

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Lkd;")
    private static class73 field3545 = class126.method1070((byte) -66, "Cancel");

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Lkd;")
    public static class73 field3553 = field3545;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lq;")
    public static class111 field3540;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lbc;")
    public static class11 field3542;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lde;")
    public static class27 field3536;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "[I")
    public static int[] field3531;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1154(int arg0) {
        field3531 = null;
        field3542 = null;
        int var1 = -85 / ((-arg0 - 24) / 43);
        field3539 = null;
        field3553 = null;
        field3545 = null;
        field3529 = null;
        field3552 = null;
        field3536 = null;
        field3534 = null;
        field3543 = null;
        field3538 = null;
        field3546 = null;
        field3540 = null;
        field3537 = null;
        field3541 = null;
        field3550 = null;
    }

    @OriginalMember(owner = "client!v", name = "run", descriptor = "()V")
    public final void run() {
        field3528++;
        while (this.field3527) {
            Object var1 = this.field3530;
            synchronized (this.field3530) {
                if (this.field3551 < 500) {
                    this.field3547[this.field3551] = class31.field869;
                    this.field3549[this.field3551] = class3.field161;
                    this.field3551++;
                }
            }
            class112.method913(1, 50L);
        }
    }
}
