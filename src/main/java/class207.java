import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class207 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[Lmh;")
    public static class128[] field3630 = new class128[1000];

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3632 = 2;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[I")
    public static int[] field3631 = new int[25];

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lmh;")
    public static class128 field3635 = class22.method156(125, " ");

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "[I")
    public static int[] field3637 = new int[1000];

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILbg;)Lji;", line = 19)
    public static final class99 method1421(int arg0, class194 arg1) {
        if (arg0 != -10580) {
            method1421(36, (class194) null);
        }
        field3633++;
        return new class99(arg1.method1354(arg0 ^ 0xFFFFD6AE), arg1.method1354(2), arg1.method1354(2), arg1.method1354(arg0 ^ 0xFFFFD6AE), arg1.method1349((byte) 91), arg1.method1349((byte) 91), arg1.method1325(7627));
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lnf;", line = 33)
    public static final class62 method1422(int arg0, int arg1) {
        field3634++;
        class62 var2 = (class62) class39.field837.method1443((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class268.field4657.method2155(arg1, arg0, (byte) 70);
        class62 var4 = new class62();
        if (var3 != null) {
            var4.method412(new class194(var3), -1);
        }
        class39.field837.method1442(-1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 54)
    public static void method1423(int arg0) {
        field3635 = null;
        if (arg0 < -19) {
            field3631 = null;
            field3630 = null;
            field3637 = null;
        }
    }
}
