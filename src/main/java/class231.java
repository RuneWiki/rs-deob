import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class231 extends class332 {

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "J")
    public long field3372;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "Ldh;")
    public static class179 field3368 = new class179(100);

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "F")
    public static float field3371;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "Llc;")
    public static class175 field3374;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1627(boolean arg0) {
        field3368 = null;
        if (arg0) {
            field3370 = 76;
        }
        field3374 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lp;I)Lrk;", line = 40)
    public static final class186 method1628(class107 arg0, int arg1) {
        int var2 = 26 / ((-arg1 - 82) / 43);
        field3366++;
        return new class186(arg0.method656(123), arg0.method656(107), arg0.method656(-126), arg0.method656(-63), arg0.method622((byte) -119), arg0.method661(-1));
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 55)
    public class231() {
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(J)V", line = 57)
    public class231(long arg0) {
        this.field3372 = arg0;
    }
}
