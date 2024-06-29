import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class343 {

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Lea;")
    private class571 field4783 = new class571();

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "Z")
    public static boolean field4779 = false;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "[[Z")
    public static boolean[][] field4786 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Lbu;")
    public static class21 field4777 = new class21(46, 28);

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public static int field4789 = 0;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public static int field4790 = -1;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "F")
    public static float field4780;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "Lea;")
    private class571 field4787;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "[I")
    public static int[] field4788;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Z")
    public final boolean method2168(byte arg0) {
        int var2 = 82 % ((21 - arg0) / 45);
        field4774++;
        return this.field4783.field8064 == this.field4783;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public final void method2169(int arg0) {
        while (true) {
            class571 var2 = this.field4783.field8064;
            if (this.field4783 == var2) {
                if (arg0 != 0) {
                    return;
                }
                field4775++;
                this.field4787 = null;
                return;
            }
            var2.method3358(arg0 ^ 0x6F);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)Lea;")
    public final class571 method2170(boolean arg0) {
        if (arg0) {
            return null;
        }
        field4776++;
        class571 var2 = this.field4783.field8064;
        if (this.field4783 == var2) {
            this.field4787 = null;
            return null;
        } else {
            this.field4787 = var2.field8064;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
    public static void method2171(int arg0) {
        field4786 = null;
        field4788 = null;
        if (arg0 == 28) {
            field4777 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)Lea;")
    public final class571 method2172(int arg0) {
        field4782++;
        int var2 = -69 / ((-arg0 - 52) / 44);
        class571 var3 = this.field4783.field8064;
        if (this.field4783 == var3) {
            return null;
        } else {
            var3.method3358(98);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILea;)V")
    public final void method2173(int arg0, class571 arg1) {
        if (arg1.field8061 != null) {
            arg1.method3358(84);
        }
        field4781++;
        arg1.field8064 = this.field4783;
        arg1.field8061 = this.field4783.field8061;
        arg1.field8061.field8064 = arg1;
        int var3 = -62 / ((11 - arg0) / 33);
        arg1.field8064.field8061 = arg1;
    }

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "(I)I")
    public final int method2174(int arg0) {
        field4784++;
        int var2 = 0;
        if (arg0 != -11265) {
            field4780 = -0.2002122F;
        }
        class571 var3 = this.field4783.field8064;
        while (this.field4783 != var3) {
            var3 = var3.field8064;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
    public class343() {
        this.field4783.field8064 = this.field4783;
        this.field4783.field8061 = this.field4783;
    }

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)Lea;")
    public final class571 method2175(int arg0) {
        field4785++;
        class571 var2 = this.field4783.field8061;
        if (arg0 != 0) {
            field4790 = -40;
        }
        if (this.field4783 == var2) {
            this.field4787 = null;
            return null;
        } else {
            this.field4787 = var2.field8061;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)Lea;")
    public final class571 method2176(int arg0) {
        if (arg0 != -17754) {
            field4779 = true;
        }
        field4778++;
        class571 var2 = this.field4787;
        if (this.field4783 == var2) {
            this.field4787 = null;
            return null;
        } else {
            this.field4787 = var2.field8064;
            return var2;
        }
    }
}
