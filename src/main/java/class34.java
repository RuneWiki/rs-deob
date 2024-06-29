import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class34 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Loe;")
    public static class183 field679 = new class183();

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[Lhf;")
    public static class363[] field680 = new class363[5];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field682;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBI)V")
    public static final void method411(int arg0, int arg1, byte arg2, int arg3) {
        field674++;
        if (arg2 != -62) {
            field679 = null;
        }
        int var4 = class221.field2851.field4158 * arg1 >> 8;
        if (var4 == 0 || arg3 == -1) {
            return;
        }
        if (!class621.field8895 && class584.field8487 != -1 && class501.method2913(59)) {
            class548.field7961 = class590.method3426((byte) -118);
            class364 var5 = class553.method3243(class548.field7961, (byte) 6);
            class346.method1980((byte) -125, true, var5);
        }
        class521.method3088(var4, arg2 + 3, false, class78.field1145, arg3, 0);
        class498.method2899(-1, 255, -99);
        class621.field8895 = true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static void method412(boolean arg0) {
        field679 = null;
        field682 = null;
        field680 = null;
        if (!arg0) {
            field682 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < field680.length; var0++) {
            field680[var0] = new class363();
        }
    }
}
