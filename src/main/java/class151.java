import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class151 implements Runnable {

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Z")
    public boolean field3529 = true;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Ljava/lang/Object;")
    public Object field3542 = new Object();

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "[I")
    public int[] field3549 = new int[500];

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "[I")
    public int[] field3551 = new int[500];

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public int field3550 = 0;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Laf;")
    public static class7 field3528 = class48.method406(40, " loggt sich aus)3");

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Laf;")
    public static class7 field3530 = class48.method406(40, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Laf;")
    private static class7 field3544 = class48.method406(40, "glow1:");

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "[Laf;")
    public static class7[] field3546 = new class7[1000];

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Z")
    public static boolean field3545 = false;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Laf;")
    private static class7 field3531 = class48.method406(40, "World");

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Laf;")
    public static class7 field3524 = field3544;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Ld;")
    public static class22 field3539 = null;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Laf;")
    public static class7 field3525 = field3531;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Laf;")
    public static class7 field3547 = class48.method406(40, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Laf;")
    public static class7 field3535 = field3531;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Laf;")
    public static class7 field3541 = field3544;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lnd;")
    public static class94 field3538 = new class94();

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "[Lof;")
    public static class103[] field3537;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "[Lfd;")
    public static class40[] field3536;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BIIZLkb;II)V")
    public static final void method1197(byte arg0, int arg1, int arg2, boolean arg3, class71 arg4, int arg5, int arg6) {
        class20.field517 = arg6;
        class79.field1831 = arg5;
        if (arg0 != -9) {
            field3531 = null;
        }
        class108.field2647 = arg3;
        class26.field689 = arg2;
        field3543++;
        class148.field3479 = 1;
        class3.field39 = arg1;
        class82.field1932 = arg4;
    }

    @OriginalMember(owner = "client!wa", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3529) {
            Object var1 = this.field3542;
            synchronized (this.field3542) {
                if (this.field3550 < 500) {
                    this.field3551[this.field3550] = class113.field2709;
                    this.field3549[this.field3550] = class111.field2681;
                    this.field3550++;
                }
            }
            class79.method673(2, 50L);
        }
        field3532++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I")
    public static final int method1198(int arg0) {
        field3526++;
        return arg0 == 0 ? class92.field2141++ : 40;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method1199(int arg0) {
        field3538 = null;
        field3535 = null;
        field3528 = null;
        if (arg0 != 0) {
            field3528 = null;
        }
        field3531 = null;
        field3544 = null;
        field3541 = null;
        field3530 = null;
        field3525 = null;
        field3546 = null;
        field3537 = null;
        field3524 = null;
        field3547 = null;
        field3536 = null;
    }
}
