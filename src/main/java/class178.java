import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class178 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Leg;")
    public static class37 field2966 = class174.method1167("Annuler", -20);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field2968 = 0;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field2972 = 0;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2970 = -1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Leg;")
    public static class37 field2964 = class174.method1167("Jeter", 60);

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Leg;")
    public static class37 field2971 = class174.method1167("Mem:", 93);

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "[[B")
    public static byte[][] field2969 = new byte[250][];

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field2979 = 0;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Loi;")
    public class30 field2967;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[I")
    public int[] field2977;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[Lja;")
    public static class105[] field2965;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method1183(byte arg0) {
        field2969 = null;
        field2966 = null;
        field2971 = null;
        field2964 = null;
        if (arg0 > 32) {
            field2965 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([II)[I")
    public static final int[] method1184(int[] arg0, int arg1) {
        field2975++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        if (arg1 == -14221) {
            class54.method352(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V")
    public static final void method1185(int arg0, byte arg1) {
        field2973++;
        class238.field4233.method1402((byte) -31, arg0);
        int var2 = -128 % ((-arg1 - 16) / 60);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Ltc;")
    public static final class133 method1186(int arg0, int arg1) {
        field2974++;
        class133 var2 = (class133) class53.field824.method1411(-21, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class197.field3357.method666(class59.method421(arg0, false), class145.method1012(false, arg0), (byte) -51);
        class133 var4 = new class133();
        var4.field2304 = arg0;
        if (var3 != null) {
            var4.method957(-22684, new class187(var3));
        }
        var4.method954(4);
        if (arg1 != 0) {
            method1184((int[]) null, 73);
        }
        if (var4.field2295) {
            var4.field2254 = 0;
            var4.field2279 = false;
        }
        if (!class49.field770 && var4.field2248) {
            var4.field2310 = null;
        }
        class53.field824.method1404((long) arg0, false, var4);
        return var4;
    }
}
