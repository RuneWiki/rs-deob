import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class226 extends class384 {

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "[I")
    public static int[] field2582 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "Z")
    public static boolean field2583 = false;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "(B)V", line = 3)
    public static void method1307(byte arg0) {
        field2582 = null;
        if (arg0 != 66) {
            method1307((byte) 60);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZB)V", line = 18)
    public final void method30(boolean arg0, byte arg1) {
        if (arg1 <= 78) {
            this.method30(false, (byte) 64);
        }
        ++field2585;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V", line = 28)
    public final void method31(byte arg0) {
        ++field2581;
        if (arg0 > -18) {
            field2583 = true;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZI)V", line = 44)
    public final void method24(boolean arg0, int arg1) {
        if (arg1 != -1) {
            field2583 = true;
        }
        ++field2584;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZ)V", line = 58)
    public final void method32(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field2583 = true;
        }
        ++field2587;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IB)V", line = 68)
    public static final void method1308(int arg0, byte arg1) {
        ++field2580;
        int var2 = 109 / ((arg1 - 61) / 56);
        class351.field4524 = arg0;
        class620 var3 = class326.field4231;
        synchronized (class326.field4231) {
            class326.field4231.method3549(0);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lke;BI)V", line = 81)
    public final void method27(class596 arg0, byte arg1, int arg2) {
        super.field5349.method2207((byte) -61, arg0);
        if (arg1 != 123) {
            field2582 = null;
        }
        ++field2586;
        super.field5349.method2255(arg2, 15818);
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lln;)V", line = 93)
    public class226(class377 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)Z", line = 97)
    public final boolean method26(int arg0) {
        ++field2588;
        return arg0 != 13326;
    }
}
