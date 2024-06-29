import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class404 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[Ltn;")
    public static class81[] field5219 = new class81[14];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Llh;")
    public static class492 field5217 = new class492("WTI", 5);

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Ldr;")
    public static class675 field5220 = new class675(89, -1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBZ)I")
    public static final int method2272(int arg0, int arg1, byte arg2, boolean arg3) {
        field5216++;
        class36 var4 = class354.method2029(arg0, Integer.MIN_VALUE, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && var4.field536.length > arg1) {
            return arg2 == 86 ? var4.field536[arg1] : 8;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method2273(int arg0) {
        field5219 = null;
        field5217 = null;
        field5220 = null;
        if (arg0 != 31050) {
            field5219 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method2274(int arg0, int arg1) {
        field5218++;
        class243 var2 = class546.method2926(arg0, 6, true);
        if (arg1 > 1) {
            var2.method1455(true);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2275(int arg0, int arg1, int arg2, int arg3) {
        if (class294.method1773(arg0, arg1, arg2)) {
            int var4 = arg1 << class480.field5972;
            int var5 = arg2 << class480.field5972;
            return class224.method1354(var4 + 1, class299.field3801[arg0].method201(arg1, arg2) + arg3, var5 + 1) && class224.method1354(class97.field1256 + var4 - 1, class299.field3801[arg0].method201(arg1 + 1, arg2) + arg3, var5 + 1) && class224.method1354(class97.field1256 + var4 - 1, class299.field3801[arg0].method201(arg1 + 1, arg2 + 1) + arg3, class97.field1256 + var5 - 1) && class224.method1354(var4 + 1, class299.field3801[arg0].method201(arg1, arg2 + 1) + arg3, class97.field1256 + var5 - 1);
        } else {
            return false;
        }
    }
}
