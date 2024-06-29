import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class174 {

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Lkg;")
    private class115 field3254;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lmb;")
    private static class132 field3244 = class166.method1092("wave2:", 112);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lmb;")
    public static class132 field3241 = class166.method1092("", 117);

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lmb;")
    public static class132 field3246 = field3244;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lmb;")
    public static class132 field3252 = class166.method1092("; version=1; path=)4; domain=", 122);

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lmb;")
    public static class132 field3250 = class166.method1092("rect_debug=", 126);

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lmb;")
    public static class132 field3251 = field3244;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "J")
    public static long field3245;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lpb;")
    public static class165 field3249;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lhh;")
    public static class85 field3253;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public static int[] field3239;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZJ)V")
    public final void method1134(boolean arg0, long arg1) {
        field3255++;
        this.field3254.method775((byte) 80, arg1);
        if (arg0) {
            method1140((byte) -34);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JLmf;Z)V")
    public final void method1135(long arg0, class136 arg1, boolean arg2) {
        field3240++;
        this.field3254.method774(arg0, new class118(arg1), 0);
        if (!arg2) {
            field3246 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)I")
    public static final int method1136(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field3243++;
        if (var4 == 0) {
            return arg2;
        } else if (arg0 == var4) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public final void method1137(int arg0) {
        field3242++;
        if (arg0 == 6902) {
            this.field3254.method778((byte) 95);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JB)Lmf;")
    public final class136 method1138(long arg0, byte arg1) {
        field3248++;
        class118 var4 = (class118) this.field3254.method777(-1, arg0);
        if (var4 == null) {
            if (arg1 < 97) {
                this.method1137(-106);
            }
            return null;
        } else {
            return var4.field2243;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lpb;ILpb;)V")
    public static final void method1139(class165 arg0, int arg1, class165 arg2) {
        if (arg1 != 2) {
            field3245 = -25L;
        }
        field3247++;
        field3249 = arg2;
        class82.field1385 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method1140(byte arg0) {
        field3251 = null;
        if (arg0 != -109) {
            field3245 = 77L;
        }
        field3244 = null;
        field3239 = null;
        field3246 = null;
        field3253 = null;
        field3252 = null;
        field3249 = null;
        field3241 = null;
        field3250 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
    public class174(int arg0) {
        this.field3254 = new class115(arg0);
    }
}
