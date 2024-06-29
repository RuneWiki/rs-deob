import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class162 extends class207 {

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public int field3044 = 0;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public int field3036 = -1;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Ljd;")
    private static class86 field3031 = class122.method868("red:", true);

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Z")
    public static volatile boolean field3042 = true;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "Ljd;")
    public static class86 field3039 = field3031;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Lwj;")
    public static class6 field3045 = null;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Ljd;")
    public static class86 field3040 = field3031;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "Ljd;")
    public static class86 field3048 = class122.method868("welle:", true);

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Ljd;")
    public static class86 field3038 = class122.method868(" steht bereits auf Ihrer Freunde)2Liste(Q", true);

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field3032;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public int field3049;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "Lbj;")
    public static class151 field3054;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lre;")
    public static class212 field3035;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "[Ldf;")
    public static class54[] field3053;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field3031 = null;
        field3048 = null;
        field3045 = null;
        field3035 = null;
        if (arg0 != -1) {
            method1178((class170) null, (byte) 56);
        }
        field3038 = null;
        field3040 = null;
        field3054 = null;
        field3039 = null;
        field3053 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lbc;B)I")
    public static final int method1178(class170 arg0, byte arg1) {
        if (arg1 != 55) {
            method1177(-12);
        }
        class11 var2 = arg0.field3130;
        field3037++;
        if (var2.field348 != null) {
            var2 = var2.method87(true);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field365;
        if (arg0.field739 == arg0.field701) {
            var3 = var2.field327;
        } else if (arg0.field736 == arg0.field701) {
            var3 = var2.field332;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIILbl;)V")
    public static final void method1179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class33 arg6) {
        field3047++;
        class4.method20(arg0, -1, arg3, arg4, arg6.field676, arg6.field685, arg1, arg2);
        if (arg5 != 27838) {
            method1178((class170) null, (byte) 41);
        }
    }
}
