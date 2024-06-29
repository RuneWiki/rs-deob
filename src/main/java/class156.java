import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class156 extends class46 {

    @OriginalMember(owner = "client!wc", name = "rb", descriptor = "I")
    public int field3593 = 1000;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Lsc;")
    private static class128 field3572 = class129.method1017(false, "Walk here");

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "Lsc;")
    public static class128 field3575 = field3572;

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "Lsc;")
    private static class128 field3584 = class129.method1017(false, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public static int field3577 = -1;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "Lsc;")
    public static class128 field3580 = class129.method1017(false, "Neuer Benutzer");

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "[I")
    public static int[] field3579 = new int[32];

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "Lsc;")
    public static class128 field3576 = field3584;

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
    public static int field3587 = 0;

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "Lsc;")
    public static class128 field3592 = class129.method1017(false, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "Lfa;")
    public static class37 field3578;

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "Lae;")
    public static class6 field3583;

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lb;")
    public static class8 field3581;

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "[[[B")
    public static byte[][][] field3585;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIII)V")
    public void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3586++;
        class78 var10 = this.method1(-20521144);
        if (var10 != null) {
            this.field3593 = var10.field3593;
            var10.method589(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field3579 = null;
        field3580 = null;
        field3575 = null;
        if (arg0 != -19445) {
            return;
        }
        field3578 = null;
        field3583 = null;
        field3585 = null;
        field3572 = null;
        field3581 = null;
        field3576 = null;
        field3592 = null;
        field3584 = null;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Llb;")
    public class78 method1(int arg0) {
        field3590++;
        if (arg0 != -20521144) {
            this.field3593 = -50;
        }
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public static final void method1225(int arg0) {
        if (arg0 != 0) {
            field3572 = null;
        }
        class71.field1591.method919((byte) -104);
        field3582++;
    }
}
