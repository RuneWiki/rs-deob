import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class444 extends class338 {

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field6490 = 0;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6484 = "cyan:";

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6499 = new Rectangle[100];

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field6496 = 0;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public int field6497;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public int field6498;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lam;")
    public static class286 field6481;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Lam;")
    public static class286 field6491;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "[I")
    public int[] field6483;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "[I")
    public int[] field6487;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "[I")
    public int[] field6493;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "[Lfd;")
    public static class194[] field6495;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "[Ldj;")
    public class304[] field6485;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "[Ldj;")
    public class304[] field6492;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "[[[B")
    public byte[][][] field6488;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lgl;ILgl;)V", line = 3)
    public static final void method2754(class338 arg0, int arg1, class338 arg2) {
        field6482++;
        if (arg2.field4506 != null) {
            arg2.method1967(-1);
        }
        arg2.field4506 = arg0.field4506;
        arg2.field4505 = arg0;
        arg2.field4506.field4505 = arg2;
        if (arg1 != -24521) {
            field6481 = null;
        }
        arg2.field4505.field4506 = arg2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLvm;Lam;)V", line = 35)
    public static final void method2755(byte arg0, class322 arg1, class286 arg2) {
        field6489++;
        if (arg0 != -66 || class27.field264) {
            return;
        }
        arg1.method1578(0);
        class289.field3932 = arg1.method1633(class241.method1283(arg2, class199.field2658), true);
        class289.field3932.method93((class333.field4423 - class289.field3932.method101()) / 2, (class337.field4496 - class289.field3932.method109()) / 2);
        class307.field4156 = arg1.method1633(class241.method1283(arg2, class316.field4221), true);
        class307.field4156.method93((class333.field4423 - class307.field4156.method101()) / 2, 18);
        class27.field264 = true;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V", line = 58)
    public static void method2756(int arg0) {
        if (arg0 != 14012) {
            method2755((byte) -84, (class322) null, (class286) null);
        }
        field6491 = null;
        field6495 = null;
        field6484 = null;
        field6499 = null;
        field6481 = null;
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)I", line = 82)
    public static final int method2757(int arg0) {
        field6486++;
        if (arg0 != -32724) {
            method2754((class338) null, 9, (class338) null);
        }
        return class235.field3247;
    }
}
