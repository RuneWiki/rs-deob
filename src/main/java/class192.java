import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class192 {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lr;")
    public static class66 field3322 = class93.method641(43, "name_icons");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lr;")
    private static class66 field3324 = class93.method641(43, "Players");

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lr;")
    private static class66 field3319 = class93.method641(43, "Loaded update list");

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field3321 = 500;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field3320 = 0;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lr;")
    public static class66 field3328 = class93.method641(43, "<col=ffff00>");

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lr;")
    public static class66 field3331 = field3324;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[I")
    public static int[] field3335 = new int[2048];

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Lr;")
    public static class66 field3336 = field3319;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lik;")
    public static class117 field3325;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[[[B")
    public static byte[][][] field3326;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method1258(int arg0) {
        field3328 = null;
        field3331 = null;
        field3322 = null;
        field3336 = null;
        field3325 = null;
        field3319 = null;
        field3335 = null;
        field3326 = null;
        if (arg0 != 0) {
            field3325 = null;
        }
        field3324 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[Lni;Lcj;[Ldh;[Ldh;[Ldh;[Ldh;)V")
    public static final void method1259(int arg0, class168[] arg1, class28 arg2, class265[] arg3, class265[] arg4, class265[] arg5, class265[] arg6) {
        class211.field3629 = arg2;
        class56.field956 = arg4;
        class107.field2074 = arg6;
        class12.field144 = arg1;
        if (arg0 != -10675) {
            field3320 = -51;
        }
        field3332++;
        class180.field3156 = arg3;
        class205.field3515 = arg5;
        class241.field4183.method864(105);
        int var7 = class211.field3629.method132(class224.field3828, (byte) -126);
        int[] var8 = class211.field3629.method142(false, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class241.field4183.method866(class36.method199(new class249(class211.field3629.method135(var8[var9], 0, var7)), arg0 + 10676), true);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BZ)Laf;")
    public static final class39 method1260(byte[] arg0, boolean arg1) {
        field3333++;
        if (arg0 == null) {
            return null;
        }
        if (arg1) {
            method1260((byte[]) null, false);
        }
        class236 var2 = new class236(arg0, class36.field541, class231.field4029, class2.field25, class199.field3443, class44.field777);
        class211.method1365((byte) -93);
        return var2;
    }
}
