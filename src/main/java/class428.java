import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class428 extends class507 {

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Lmo;")
    public class530 field6220;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field6219 = 0;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "Lao;")
    public static class191 field6222 = new class191(100, 2);

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "Lao;")
    public static class191 field6225 = new class191(61, 7);

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field6226 = new String[100];

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field6223;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method2632(byte arg0) {
        field6222 = null;
        field6223 = null;
        field6226 = null;
        field6225 = null;
        int var1 = -60 / ((23 - arg0) / 55);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIBII)V")
    public static final void method2633(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class169.field2184 <= arg3 && class386.field5620 >= arg3) {
            int var5 = class406.method2491(class307.field4111, false, class91.field1086, arg4);
            int var6 = class406.method2491(class307.field4111, false, class91.field1086, arg1);
            class40.method228(var6, var5, -97, arg0, arg3);
        }
        if (arg2 != -3) {
            field6219 = 125;
        }
        field6224++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I")
    public static final int method2634(int arg0, int arg1, int arg2) {
        field6221++;
        if (arg2 > -57) {
            method2632((byte) -51);
        }
        int var3 = class286.method1716(arg0 + 45365, arg1 + 91923, true, 4) + (class286.method1716(arg0 + 10294, arg1 + 37821, true, 2) - 128 >> 1) + (class286.method1716(arg0, arg1, true, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lmo;)V")
    public class428(class530 arg0) {
        this.field6220 = arg0;
    }
}
