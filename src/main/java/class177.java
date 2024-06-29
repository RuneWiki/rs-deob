import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class177 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lhb;")
    private class28 field3150 = new class28();

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lvf;")
    private static class265 field3151 = class87.method582(-46, "Loaded input handler");

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lvf;")
    public static class265 field3149 = class87.method582(-46, "<col=40ff00>");

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Lvf;")
    public static class265 field3158 = field3151;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Lhb;")
    private class28 field3163;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
    public static int[] field3160;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "[[[I")
    public static int[][][] field3162;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Lhb;")
    public final class28 method1147(boolean arg0) {
        if (arg0) {
            this.method1155((byte) 28);
        }
        field3154++;
        class28 var2 = this.field3150.field733;
        if (this.field3150 == var2) {
            return null;
        } else {
            var2.method238((byte) 24);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Lhb;")
    public final class28 method1148(int arg0) {
        int var2 = -79 / ((-arg0 - 69) / 51);
        field3159++;
        class28 var3 = this.field3150.field733;
        if (this.field3150 == var3) {
            this.field3163 = null;
            return null;
        } else {
            this.field3163 = var3.field733;
            return var3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
    public static final void method1149(boolean arg0) {
        if (!arg0) {
            field3156++;
            class213.field3820.method1893(-113);
            class70.field1357.method1893(-29);
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)V")
    public static void method1150(boolean arg0) {
        field3158 = null;
        field3149 = null;
        if (arg0) {
            field3160 = null;
        }
        field3162 = null;
        field3160 = null;
        field3151 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)I")
    public final int method1151(int arg0) {
        field3165++;
        int var2 = arg0;
        for (class28 var3 = this.field3150.field733; var3 != this.field3150; var3 = var3.field733) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIIII)V")
    public static final void method1152(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class141.field2615 == 1) {
            class179.field3182[class277.field4905 / 100].method585(class162.field2944 - 8, class95.field1681 + -8);
        }
        int var5 = -122 / ((40 - arg0) / 50);
        if (class141.field2615 == 2) {
            class179.field3182[(class277.field4905 / 100) + 4].method585(class162.field2944 - 8, class95.field1681 - 8);
        }
        field3153++;
        class104.method695(18058);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Lhb;")
    public final class28 method1153(int arg0) {
        field3164++;
        if (arg0 != 100) {
            return null;
        }
        class28 var2 = this.field3163;
        if (this.field3150 == var2) {
            this.field3163 = null;
            return null;
        } else {
            this.field3163 = var2.field733;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lhb;I)V")
    public final void method1154(class28 arg0, int arg1) {
        field3157++;
        if (arg0.field729 != null) {
            arg0.method238((byte) 74);
        }
        if (arg1 == -31849) {
            arg0.field733 = this.field3150;
            arg0.field729 = this.field3150.field729;
            arg0.field729.field733 = arg0;
            arg0.field733.field729 = arg0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class177() {
        this.field3150.field729 = this.field3150;
        this.field3150.field733 = this.field3150;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final void method1155(byte arg0) {
        while (true) {
            class28 var2 = this.field3150.field733;
            if (this.field3150 == var2) {
                field3161++;
                if (arg0 >= -10) {
                    return;
                }
                this.field3163 = null;
                return;
            }
            var2.method238((byte) 40);
        }
    }
}
