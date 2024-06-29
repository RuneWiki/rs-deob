import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class230 extends class244 {

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lsm;")
    public static class249 field3244 = new class249();

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILfc;)I")
    public static final int method1446(int arg0, class343 arg1) {
        field3245++;
        int var2 = arg0;
        if (arg1.method2034(class446.field6167, -28758)) {
            var2 = arg0 + 1;
        }
        if (arg1.method2034(class239.field3369, -28758)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lkm;I)V")
    public static final void method1447(class487 arg0, int arg1) {
        if (class490.field6921) {
            class345.method2063(arg0, 119);
        } else {
            class382.method2290(22754, arg0);
        }
        field3246++;
        if (arg1 != 0) {
            method1447((class487) null, -76);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method1448(int arg0) {
        field3244 = null;
        int var1 = -110 / ((arg0 - 13) / 47);
    }
}
