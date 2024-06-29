import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class318 extends class418 {

    @OriginalMember(owner = "client!en", name = "m", descriptor = "Lqfa;")
    public static class98 field4411 = new class98(0, 3);

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "Lfp;")
    public static class323 field4413;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)Lku;")
    public abstract class375 method2063(byte arg0);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
    public static final void method2064(byte arg0) {
        field4410++;
        int var1 = 0;
        if (arg0 != -94) {
            return;
        }
        for (int var2 = 0; var2 < class336.field4683; var2++) {
            for (int var3 = 0; var3 < class700.field9768; var3++) {
                if (class350.method2260(class553.field7776, var3, var2, true, var1, arg0 + 6815)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public static void method2065(int arg0) {
        field4413 = null;
        if (arg0 != 0) {
            method2064((byte) 106);
        }
        field4411 = null;
    }
}
