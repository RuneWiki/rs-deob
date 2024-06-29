import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class259 extends class261 {

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "Z")
    public static boolean field3963 = true;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "Ls;")
    public static class186 field3959 = new class186(17, 8);

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static final void method1665(int arg0) {
        field3962++;
        int var1 = 0;
        if (arg0 > -78) {
            return;
        }
        for (int var2 = 0; var2 < class339.field5099; var2++) {
            for (int var3 = 0; var3 < class484.field7129; var3++) {
                if (class324.method2066(var3, class518.field7511, true, var1, true, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)Z")
    public static final boolean method1666(int arg0) {
        if (arg0 > -71) {
            field3963 = false;
        }
        field3961++;
        return class191.field3073;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
    public static void method1667(byte arg0) {
        if (arg0 <= 11) {
            method1667((byte) -78);
        }
        field3959 = null;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(II)V")
    public class259(int arg0, int arg1) {
        this.field3964 = arg1;
        this.field3960 = arg0;
    }
}
