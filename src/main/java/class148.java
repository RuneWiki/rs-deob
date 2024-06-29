import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class148 extends class166 {

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field3041 = 50;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "[I")
    public static int[] field3043 = new int[field3041];

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "[Lrf;")
    public static class163[] field3048 = new class163[field3041];

    @OriginalMember(owner = "client!q", name = "W", descriptor = "[I")
    public static int[] field3042 = new int[field3041];

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "Lrf;")
    public static class163 field3051 = class53.method392(-43, "sl_stars");

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "Lrf;")
    private static class163 field3047 = class53.method392(72, "Take");

    @OriginalMember(owner = "client!q", name = "db", descriptor = "Lrf;")
    public static class163 field3049 = class53.method392(43, "Art");

    @OriginalMember(owner = "client!q", name = "U", descriptor = "[I")
    public static int[] field3040 = new int[field3041];

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "[I")
    public static int[] field3055 = new int[field3041];

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "[I")
    public static int[] field3052 = new int[field3041];

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "Lrf;")
    public static class163 field3045 = field3047;

    @OriginalMember(owner = "client!q", name = "mb", descriptor = "[I")
    public static int[] field3058 = new int[field3041];

    @OriginalMember(owner = "client!q", name = "nb", descriptor = "[I")
    public static int[] field3059 = new int[field3041];

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "Lrf;")
    private static class163 field3053 = class53.method392(-88, "Loaded input handler");

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "Lrf;")
    public static class163 field3044 = field3053;

    @OriginalMember(owner = "client!q", name = "ob", descriptor = "Lrf;")
    public static class163 field3060 = class53.method392(-105, "<col=00ffff>");

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "J")
    public static long field3050;

    @OriginalMember(owner = "client!q", name = "kb", descriptor = "[I")
    public static int[] field3056;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILu;ILu;)Lne;")
    public static final class126 method965(int arg0, int arg1, class184 arg2, int arg3, class184 arg4) {
        if (arg3 != 50) {
            field3048 = null;
        }
        field3046++;
        return class102.method700(arg1, arg4, (byte) -18, arg0) ? class96.method665(arg2.method1235(arg0, (byte) -64, arg1), 1) : null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)Lje;")
    public final class91 method406(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field3039++;
            return class97.method669(-107, this.field3057).method34(null, this.field3054, 0, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
    public static void method966(int arg0) {
        field3056 = null;
        field3042 = null;
        field3048 = null;
        field3052 = null;
        field3049 = null;
        field3053 = null;
        field3058 = null;
        field3044 = null;
        field3043 = null;
        field3060 = null;
        field3051 = null;
        field3055 = null;
        if (arg0 != 50) {
            field3044 = null;
        }
        field3047 = null;
        field3040 = null;
        field3045 = null;
        field3059 = null;
    }
}
