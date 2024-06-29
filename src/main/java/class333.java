import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public abstract class class333 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field4696 = 0;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Lri;")
    public static class73 field4694 = new class73(95, 6);

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "Lng;")
    public static class226 field4698 = new class226(4);

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "[Lgr;")
    public static class297[] field4700 = new class297[50];

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "[[Z")
    public static boolean[][] field4699 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "Lac;")
    public static class376 field4695;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(FFFII)F", line = 10)
    public static final float method2027(float arg0, float arg1, float arg2, int arg3, int arg4) {
        field4693++;
        if (arg4 != 2) {
            field4696 = -97;
        }
        float[] var5 = class371.field5666[arg3];
        return var5[2] * arg0 + var5[1] * arg1 + var5[0] * arg2;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V", line = 25)
    public static void method2028(byte arg0) {
        field4694 = null;
        field4698 = null;
        field4699 = null;
        field4695 = null;
        field4700 = null;
        if (arg0 >= -86) {
            method2029(true);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V", line = 50)
    public static final void method2029(boolean arg0) {
        field4697++;
        if (!arg0) {
            method2029(false);
        }
        class420.field6325.method1540(0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lfj;I)Lfj;")
    public abstract class465 method1526(class465 arg0, int arg1);
}
