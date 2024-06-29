import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class61 extends class273 {

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field921 = 0;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "Lwm;")
    public static class152 field919 = class157.method1048("blinken1:", 99);

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "Lwm;")
    private static class152 field923 = class157.method1048("glow1:", 92);

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Lwm;")
    private static class152 field928 = class157.method1048("wishes to trade with you)3", 127);

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Lwm;")
    public static class152 field915 = field928;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "Lwm;")
    public static class152 field926 = class157.method1048("settings=", 119);

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Lwm;")
    public static class152 field917 = field923;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Lwm;")
    public static class152 field920 = field923;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "J")
    public long field916;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "Lah;")
    public static class205 field922;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "Lqk;")
    public class61 field927;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "Lqk;")
    public class61 field930;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "[[B")
    public static byte[][] field924;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 10)
    public static void method400(int arg0) {
        field917 = null;
        field926 = null;
        field915 = null;
        if (arg0 != 0) {
            return;
        }
        field919 = null;
        field922 = null;
        field923 = null;
        field924 = (byte[][]) null;
        field928 = null;
        field920 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZILah;)Leg;", line = 54)
    public static final class300 method401(int arg0, boolean arg1, int arg2, class205 arg3) {
        field918++;
        if (arg1) {
            return (class300) null;
        } else if (class86.method566(arg0, arg3, arg2, 1)) {
            return class244.method1684(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 89)
    public final void method402(int arg0) {
        field925++;
        if (this.field930 != null && arg0 == 0) {
            this.field930.field927 = this.field927;
            this.field927.field930 = this.field930;
            this.field930 = null;
            this.field927 = null;
        }
    }
}
