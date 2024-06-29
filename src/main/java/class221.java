import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class221 {

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
    public static int[] field3884 = new int[25];

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Lmh;")
    public static class128 field3886 = class22.method156(126, "<col=ffff00>");

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lmh;")
    public static class128 field3890 = null;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[[[Lvf;")
    public static class296[][][] field3888 = new class296[4][104][104];

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3885 = 0;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Lmh;")
    public static class128 field3892 = class22.method156(127, "name_icons");

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Lfb;")
    public static class55 field3887;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1526(int arg0) {
        class123.field2095 = new class296();
        field3883++;
        if (arg0 != 4) {
            method1526(-42);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Lom;", line = 15)
    public static final class65 method1527(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class65 var4 = var3.field2571;
            var3.field2571 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 31)
    public static void method1528(int arg0) {
        field3888 = (class296[][][]) null;
        field3890 = null;
        field3892 = null;
        int var1 = -121 % ((-arg0 - 57) / 46);
        field3886 = null;
        field3887 = null;
        field3884 = null;
    }
}
