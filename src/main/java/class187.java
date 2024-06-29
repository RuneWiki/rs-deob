import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class187 extends class105 {

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3375 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "Lvf;")
    public static class265 field3378 = class87.method582(-46, "Veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Loa;")
    public static class245 field3379 = class204.method1399(false);

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "Lve;")
    public static class226 field3374;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
    public static final void method1279(int arg0, int arg1, int arg2, int arg3) {
        field3377++;
        class6 var4 = class12.method98(arg3, arg1, (byte) -124);
        if (var4 != null && var4.field104 != null) {
            class277 var5 = new class277();
            var5.field4883 = var4.field104;
            var5.field4901 = var4;
            class192.method1318(var5, 200000);
        }
        if (arg2 != 24463) {
            field3375 = -100;
        }
        class25.field695 = true;
        class26.field703 = arg1;
        class192.field3457 = arg3;
        class38.field874 = arg0;
        class176.method1145((byte) 83, var4);
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
    public static void method1280(int arg0) {
        if (arg0 == 16) {
            field3379 = null;
            field3378 = null;
            field3374 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class187() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        field3376++;
        if (arg0 != 8055) {
            field3375 = -113;
        }
        return class277.field4894;
    }
}
