import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class160 {

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lvf;")
    public static class265 field2930 = class87.method582(-46, "floorshadows");

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lvf;")
    public static class265 field2932 = class87.method582(-46, "hitbar_default");

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Ldg;")
    public static class276 field2927 = new class276(50);

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "S")
    public static short field2933 = 256;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Loe;")
    public static class108 field2934;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public abstract void method271(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lfl;Lfl;I)V")
    public static final void method1066(class192 arg0, class192 arg1, int arg2) {
        field2922++;
        if (arg2 >= -38) {
            field2932 = null;
        }
        class221.field3963 = arg0;
        class56.field1138 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)Ldd;")
    public static final class212 method1067(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class212 var4 = var3.field2511;
            var3.field2511 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        int var1 = 77 / ((arg0 + 20) / 60);
        field2934 = null;
        field2930 = null;
        field2932 = null;
        field2927 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
    public abstract void method277(int arg0, int arg1);
}
