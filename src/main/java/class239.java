import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class239 {

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Luc;")
    public static class51 field3357 = new class51(64);

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field3358 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = -70 % ((-arg6 - 57) / 56);
        field3348++;
        if (class240.field3368 <= arg1 && class136.field1769 >= arg4 && class157.field1981 <= arg2 && arg5 <= class312.field4602) {
            class357.method2346(arg7, 79, arg4, arg3, arg5, arg2, arg0, arg1);
        } else {
            class450.method2779(arg5, arg7, arg2, 127, arg3, arg1, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method1551(byte arg0) {
        if (arg0 < 48) {
            method1552(24);
        }
        field3357 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method1552(int arg0) {
        field3356++;
        int var1 = 0;
        for (int var2 = 0; var2 < class351.field5217; var2++) {
            for (int var3 = 0; var3 < class143.field1815; var3++) {
                if (class440.method2755(-30875, true, var3, var1, var2, class106.field1405)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 512) {
            method1550(92, 57, -88, -118, -100, 108, (byte) -69, -19);
        }
    }
}
